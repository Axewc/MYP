import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import com.google.gson.JsonArray;

public class PokeApiClient {

    private static final String API_URL = "https://pokeapi.co/api/v2/";

    public static String getPokemonData(String pokemonName) throws Exception {
        URI uri = new URI(API_URL + "pokemon/" + pokemonName);
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

    public static String getLevelUpMoves(JsonArray movesArray, String version) {
        StringBuilder moves = new StringBuilder();
        moves.append(String.format("%-20s %-10s\n", "Movimiento", "Nivel"));
        moves.append("-------------------- ----------\n");
        for (int i = 0; i < movesArray.size(); i++) {
            JsonObject move = movesArray.get(i).getAsJsonObject();
            JsonArray versionGroupDetails = move.getAsJsonArray("version_group_details");
            for (int j = 0; j < versionGroupDetails.size(); j++) {
                JsonObject versionDetail = versionGroupDetails.get(j).getAsJsonObject();
                if (versionDetail.getAsJsonObject("move_learn_method").get("name").getAsString().equals("level-up") &&
                    versionDetail.getAsJsonObject("version_group").get("name").getAsString().equals(version)) {
                    String moveName = move.getAsJsonObject("move").get("name").getAsString();
                    int levelLearnedAt = versionDetail.get("level_learned_at").getAsInt();
                    moves.append(String.format("%-20s %-10d\n", moveName, levelLearnedAt));
                    break; // Salir del bucle interno si se encuentra "level-up" en la versión especificada
                }
            }
        }
        return moves.toString();
    }
    
    public static String[] getGameVersions() throws Exception {
        URI uri = new URI(API_URL + "version-group/");
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

            JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
            JsonArray versionsArray = jsonObject.getAsJsonArray("results");
            String[] versions = new String[versionsArray.size()];
            for (int i = 0; i < versionsArray.size(); i++) {
                versions[i] = versionsArray.get(i).getAsJsonObject().get("name").getAsString();
            }
            return versions;
        } else {
            throw new RuntimeException("Error en la solicitud HTTP: " + responseCode);
        }
    }
}