public class PokeApiController {

    public static String getPokemonData(String pokemonName) throws Exception {
        return PokeApiClient.getPokemonData(pokemonName);
    }
}