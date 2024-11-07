import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class PokeApiController {

    /**
     * Obtiene la información de un pokemon en formato JSON
     * @param pokemonName
     * @return
     * @throws Exception
     */
    public static JsonObject getPokemonData(String pokemonName) throws Exception {
        String jsonResponse = PokeApiClient.getPokemonData(pokemonName);
        return JsonParser.parseString(jsonResponse).getAsJsonObject();
    }

    /**
     * Obtiene las versiones del juego en formato JSON
     * @return
     * @throws Exception
     */
    public static String[] getGameVersions() throws Exception {
        return PokeApiClient.getGameVersions();
    }
}