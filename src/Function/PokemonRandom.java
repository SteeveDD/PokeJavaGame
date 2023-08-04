package Function;

import Pokemon.Bulbizare;
import Pokemon.Pikachu;
import Pokemon.Pokemon;
import Pokemon.Salameche;
import Pokemon.Carapuce;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokemonRandom {
    private Random random;

    public PokemonRandom() {
        random = new Random();
    }

    public Pokemon randomPokemon() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pikachu());
        pokemons.add(new Salameche());
        pokemons.add(new Bulbizare());
        pokemons.add(new Carapuce());

        int randIndex = random.nextInt(pokemons.size());
        return pokemons.get(randIndex);
    }
}
