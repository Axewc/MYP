import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import com.google.gson.JsonArray;

/**
 * Clase que se encarga de realizar peticiones a la API de Pokemon
 */
public class PokeApiClient {

    // URL base de la API de Pokemon
    private static final String API_URL = "https://pokeapi.co/api/v2/";


    /**
     * Método que realiza una petición HTTP GET a la API de Pokemon para obtener los
     * datos de un Pokemon
     * 
     * @param pokemonNamela cadena con el nombre del Pokemon
     * @return una cadena con los datos del Pokemon en formato JSON
     * @throws Exception si ocurre un error en la solicitud HTTP
     */
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

    /**
     * Método que obtiene el nombre, el peso y la altura de un Pokemon a partir de los datos en formato JSON
     * @param movesArray Arreglo de movimientos del Pokemon
     * @param version Versión del juego
     * @return una cadena con los movimientos del Pokemon en la versión especificada
     */
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
    
    /**
     * Método que realiza una petición HTTP GET a la API de Pokemon para obtener las versiones del juego
     * @return un arreglo de cadenas con las versiones del juego
     * @throws Exception si ocurre un error en la solicitud HTTP
     */
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