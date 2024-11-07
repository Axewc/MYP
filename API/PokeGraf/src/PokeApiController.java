import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class PokeApiController {

    public static JsonObject getPokemonData(String pokemonName) throws Exception {
        String jsonResponse = PokeApiClient.getPokemonData(pokemonName);
        return JsonParser.parseString(jsonResponse).getAsJsonObject();
    }

    public static String[] getGameVersions() throws Exception {
        return PokeApiClient.getGameVersions();
    }
}