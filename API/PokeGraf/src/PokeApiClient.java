import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import com.google.gson.JsonArray;

public class PokeApiClient {

    private static final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    public static String getPokemonData(String pokemonName) throws Exception {
        URI uri = new URI(API_URL + pokemonName);
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            connection.disconnect();
            return content.toString();
        } else {
            throw new RuntimeException("Error en la solicitud HTTP: " + responseCode);
        }
    }

    public static String getLevelUpMoves(JsonArray movesArray) {
        StringBuilder moves = new StringBuilder();
        moves.append(String.format("%-20s %-10s\n", "Movimiento", "Nivel"));
        moves.append("-------------------- ----------------\n");
        for (int i = 0; i < movesArray.size(); i++) {
            JsonObject move = movesArray.get(i).getAsJsonObject();
            JsonArray versionGroupDetails = move.getAsJsonArray("version_group_details");
            for (int j = 0; j < versionGroupDetails.size(); j++) {
                JsonObject versionDetail = versionGroupDetails.get(j).getAsJsonObject();
                if (versionDetail.getAsJsonObject("move_learn_method").get("name").getAsString().equals("level-up")) {
                    String moveName = move.getAsJsonObject("move").get("name").getAsString();
                    int levelLearnedAt = versionDetail.get("level_learned_at").getAsInt();
                    moves.append(String.format("%-20s %-10d\n", moveName, levelLearnedAt));
                    break; // Salir del bucle interno si se encuentra "level-up"
                }
            }
        }
        return moves.toString();
    }
}