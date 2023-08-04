package Function;

import Pokemon.Pikachu;
import Pokemon.Pokemon;
import Pokemon.Salameche;
import Pokemon.Bulbizare;
import Pokemon.Carapuce;

import java.util.Scanner;

public class PokemonChooser {
    private final Scanner scanner;
    Pikachu pikachu = new Pikachu();
    Salameche salameche = new Salameche();
    Carapuce carapuce = new Carapuce();
    Bulbizare bulbizare = new Bulbizare();

    public PokemonChooser() {
        scanner = new Scanner(System.in);
    }

    public Pokemon choosePokemon() {
        Pokemon selectedPokemon;
        do {
            System.out.println("""
                    Choisissez un pokemon :
                    1-Pikachu
                    2-Salamèche
                    3-Bulbizar
                    4-Carapuce""");

            String choixPoke = scanner.nextLine();

            switch (choixPoke) {
                case "1" -> selectedPokemon = new Pikachu();
                case "2" -> selectedPokemon = new Salameche();
                case "3" -> selectedPokemon = new Bulbizare();
                case "4" -> selectedPokemon = new Carapuce();
                default -> {
                    System.out.println("Choix invalide. Réessayez.");
                    continue;
                }
            }

            String pokeChoix = selectedPokemon.getNom();
            selectedPokemon.getImage();


            System.out.println("""
                    Vous avez choisi : \s"""+ pokeChoix  +"""
                    \nVoulez-vous continuer ?
                    1 - Oui
                    2 - Non""");

            String confirm;
            while (true) {
                confirm = scanner.nextLine();
                try {
                    switch (confirm) {
                        case "1" -> {
                            return selectedPokemon;
                        }
                        case "2" -> {
                            return choosePokemon();
                        }
                        default -> System.out.println("Veuillez entre 1 ou 2");
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        } while (true);
    }
}
