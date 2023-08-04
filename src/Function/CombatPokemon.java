package Function;

import Pokemon.Pokemon;

import java.util.Random;
import java.util.Scanner;

public class CombatPokemon {
    private Pokemon joueur;
    private Pokemon adversaire;
    private Random random;
    private Scanner scanner;


    public CombatPokemon() {
        scanner = new Scanner(System.in);
        random = new Random();
    }


    private Attaque attaqueChoisie;
    private Attaque attaqueAdversaire;
    int degatsAdversaire;

    int degats;



    public void commencerCombat() {
        choisirPokemonJoueur();
        choisirPokemonAdversaire();
        //random = new Random();


        System.out.println("\nLe combat commence !");
        //System.out.println("Vous utilisez " + joueur.getNom() + " contre " + adversaire.getNom());
        System.out.println("""
                \n""");


        while (joueur.getVie() > 0 && adversaire.getVie() > 0) {
            // Tour du joueur
            System.out.println("Choisissez une attaque pour " + joueur.getNom() + " :");
            joueur.afficherAttaques();

            int choixAttaque = scanner.nextInt();

            attaqueChoisie = joueur.getAttaque(choixAttaque - 1);
            degats = attaqueChoisie.getDegats();
            String typeDegatsJoueur = attaqueChoisie.getType().toString();
            String typeImmuniteAdversaire = adversaire.getImmunite().toString();
            String fragiliteAdversaire = adversaire.getFragilite().toString();
            String bonusDefAdversaire = adversaire.getBonusDef().toString();


            if (typeDegatsJoueur .equals(fragiliteAdversaire)){
                degats *= 1.5;
            } else if (typeImmuniteAdversaire.equals(typeDegatsJoueur)) {
                degats = 0;
            } else if (bonusDefAdversaire.equals(typeDegatsJoueur)) {
                degats /= 2;
            }

            adversaire.recevoirDegats(degats);

            if (adversaire.getVie() <= 0) {
                attaqueChoisie.attaqueLogo();
                recapJoueur();
                break;
            }


            int choixAttaqueAdversaire = random.nextInt(adversaire.getNbAttaques());
            attaqueAdversaire = adversaire.getAttaque(choixAttaqueAdversaire);
            degatsAdversaire = attaqueAdversaire.getDegats();
            String typeDegatAdversaire = attaqueAdversaire.getType().toString();
            String typeImmuniteJoueur = joueur.getImmunite().toString();
            String fragiliteJoueur = joueur.getFragilite().toString();
            String bonusDefJoueur = joueur.getBonusDef().toString();
            if (typeDegatAdversaire .equals(fragiliteJoueur)) {
                degatsAdversaire *= 1.5;
            } else if (typeImmuniteJoueur.equals(typeDegatAdversaire)) {
                degatsAdversaire = 0;
            } else if (bonusDefJoueur.equals(typeDegatAdversaire)) {
                degatsAdversaire /=2;
            }


            String attaqueJoueurLogo = attaqueChoisie.attaqueLogo();
            String attaqueAdversaireLogo = attaqueAdversaire.attaqueLogo();

// Divisez les logos en lignes
            String[] joueurLines = attaqueJoueurLogo.split("\n");
            String[] adversaireLines = attaqueAdversaireLogo.split("\n");

// Calculez la hauteur maximale des logos
            int maxHeight = Math.max(joueurLines.length, adversaireLines.length);

// Ajoutez des lignes vides pour égaliser la hauteur des logos
            StringBuilder logosCoteACote = new StringBuilder();
            for (int i = 0; i < maxHeight; i++) {
                String joueurLine = (i < joueurLines.length) ? joueurLines[i] : "";
                String adversaireLine = (i < adversaireLines.length) ? adversaireLines[i] : "";

                // Calculer le nombre d'espaces pour aligner les logos
                int spaces = 40 - joueurLine.length();

                // Afficher les logos côte à côte avec l'alignement approprié
                System.out.format("%s%" + spaces + "s%n", joueurLine, adversaireLine);
            }







            if (joueur.getVie() <= 0) {
                attaqueAdversaire.attaqueLogo();
                recapAdversaire();
                break;
            }

            recapJoueur();
            recapAdversaire();

            System.out.println("""
                   
                  \n _____               ___      _              _  \s
                    |_   _|__ _  _ _ _  / __|_  _(_)_ ____ _ _ _| |_\s
                      | |/ _ \\ || | '_| \\__ \\ || | \\ V / _` | ' \\  _|
                      |_|\\___/\\_,_|_|   |___/\\_,_|_|\\_/\\__,_|_||_\\__|\n""");

            // Affichez les points de vie restants pour les deux Pokémon.
            System.out.println("Votre " + joueur.getNom() + " a " + joueur.getVie() + " points de vie restants.");
            System.out.println("""
                    \n""");
            System.out.println(adversaire.getNom() + " Adverse a " + adversaire.getVie() + " points de vie restants.\n");

        }

        // Affichez le gagnant du combat.
        if (joueur.getVie() <= 0) {
            System.out.println("""
                    __     __           _                   \s
                    \\ \\   / /          | |                  \s
                     \\ \\_/ /__  _   _  | |     ___  ___  ___\s
                      \\   / _ \\| | | | | |    / _ \\/ __|/ _ \\
                       | | (_) | |_| | | |___| (_) \\__ \\  __/
                       |_|\\___/ \\__,_| |______\\___/|___/\\___|
                                                            \s""");
            System.out.println("Votre " + joueur.getNom() + """
                    a été vaincu. Vous avez perdu le combat.\s""");
        } else {
            System.out.println("""
                    __     __          __          ___         _\s
                    \\ \\   / /          \\ \\        / (_)       | |
                     \\ \\_/ /__  _   _   \\ \\  /\\  / / _ _ __   | |
                      \\   / _ \\| | | |   \\ \\/  \\/ / | | '_ \\  | |
                       | | (_) | |_| |    \\  /\\  /  | | | | | |_|
                       |_|\\___/ \\__,_|     \\/  \\/   |_|_| |_| (_)
                                                                \s""");
            System.out.println("Félicitations ! Vous avez vaincu " + adversaire.getNom() + ". Vous avez gagné le combat !");
        }

    }
    private void choisirPokemonJoueur() {
        PokemonChooser pokemonChooser = new PokemonChooser();
        joueur = pokemonChooser.choosePokemon();
        System.out.println("""
                Le Pokemon choisi est :\s""" + joueur.getNom() +"""
                \n\s""");
    }

    private void choisirPokemonAdversaire() {
        PokemonRandom pokemonRandom = new PokemonRandom();
        adversaire = pokemonRandom.randomPokemon();
        adversaire.getImage();
        System.out.println("""
                Vous affrontez : \s""" + adversaire.getNom());

    }


    private void recapJoueur(){
        System.out.println("Votre " + joueur.getNom() + " attaque avec " + attaqueChoisie.getNom() + " et inflige " + degats + " dégâts à " + adversaire.getNom());
        System.out.println(adversaire.getNom() + " Adverse a " + adversaire.getVie() + " points de vie restants.");
        System.out.println("""
                    \n""");
    }


    private void recapAdversaire() {
        joueur.recevoirDegats(degatsAdversaire);
        System.out.println(adversaire.getNom() + " Adverse attaque avec " + attaqueAdversaire.getNom() + " et inflige " + degatsAdversaire + " dégâts à votre" + joueur.getNom());
        System.out.println("Votre " + joueur.getNom() + " a " + joueur.getVie() + " points de vie restants.\n");
    }
}



