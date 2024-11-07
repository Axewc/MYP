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

    public static void main(String[] args) {
        try {
            String pokemonName = "sprigatito"; // Cambia esto por el nombre del Pokémon que desees
            String jsonResponse = getPokemonData(pokemonName);

            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
            System.out.println("Nombre: " + jsonObject.get("name").getAsString());
            System.out.println("Altura: " + jsonObject.get("height").getAsInt());
            System.out.println("Peso: " + jsonObject.get("weight").getAsInt());
            System.out.println("Tipo: " + jsonObject.getAsJsonArray("types").get(0).getAsJsonObject().getAsJsonObject("type").get("name").getAsString());
            System.out.println("Habilidad: " + jsonObject.getAsJsonArray("abilities").get(0).getAsJsonObject().getAsJsonObject("ability").get("name").getAsString());
            // Movimientos del Pokémon 
            // System.out.println("Movimientos:" + jsonObject.getAsJsonArray("moves").get(1).toString());
            // Filtrar e imprimir solo movimientos aprendidos con "level-up"
            System.out.println("Movimientos aprendidos subiendo de nivel:");
            for (int i = 0; i < jsonObject.getAsJsonArray("moves").size(); i++) {
                JsonObject move = jsonObject.getAsJsonArray("moves").get(i).getAsJsonObject();
                JsonArray versionGroupDetails = move.getAsJsonArray("version_group_details");
                for (int j = 0; j < versionGroupDetails.size(); j++) {
                    JsonObject versionDetail = versionGroupDetails.get(j).getAsJsonObject();
                    if (versionDetail.getAsJsonObject("move_learn_method").get("name").getAsString().equals("level-up")) {
                        System.out.println(move.getAsJsonObject("move").get("name").getAsString());
                        break; // Salir del bucle interno si se encuentra "level-up"
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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


}
