package Pokemon;

import Function.TypeAttaque;
import Item.Flameche;
import Item.Morsure;

public class Salameche extends Pokemon {
    public Salameche() {
        super("SALAMÈCHE", TypePokemon.FEU, 200, TypeAttaque.FEU, TypePokemon.EAU, TypePokemon.PLANTE);

        ajouterAttaque(new Flameche("FLAMÈCHE", TypeAttaque.FEU, 50));
         ajouterAttaque(new Morsure("MORSURE", TypeAttaque.NORMAL, 40));
    }

    @Override
    public void getImage() {
        System.out.println("""
                                  .:-=++***++=-:                                                                 \s
                              .:=+++++++++++++++*+-                                                              \s
                             -==+++++++++++++++++++*=.                                                           \s
                           :=-=+++++++++++++++++++++++:                                                          \s
                          :==++++++++++++++++++++++++++-                                                         \s
                         :+++++++++++++++**+=@@%*+++++++-                                                        \s
                         #+++++++++++++++*+  #@@@#++++++*.                                               -       \s
                         +:*++++++++++++++* :@@@@@%+++++++                                            :.*#*      \s
                         *:%++++++++++++++%@@@@@#%@*++++++:       .                                  .#%%%%:.-.  \s
                         #@@*+++++++++++++*@%%%#*#*++++++++    .-++:                                 +%%%%%%%%*. \s
                         -%%*++++++++++++++#%****+++++++++*. :=++++*+*:                             .%%%%%%%%%%#:\s
                         .**+++++++++++++++++++++++++++++++*==+++++++*=-.                           *%%#%%%#%%%%%.
                        :*++++++++++++++++++++++++++++++++++*++++++++*=:                           :**%+-=-:=%%%%+
                        *+++++++++++++++++++++++*++++++++++++**++++++.                            .:::--:::::*%%%#
                        *++++++++++++++++++++++#++++++++++++++**+++*.                            .:::::::::::*%%%%
                        .++++++++++++++++++++*##*+++++++++++++++*+*:                             :::::::::::-#%%%#
                          -++**++**+++++++**##*#*++++++++++++++++*=                               ::::::::::+%%%%=
                            :=++++++****#####*#*+++++++++++++++++++=                               .::::::=*%%%%*\s
                               .=*#######**++++++++++++++++++++++++++.                                .:::#%%%%+ \s
                               .:=##***++++++++++++++++++++++++++++++*-                                .--#*+=.  \s
                           .-=+***++++++++++++++++++++++++++++++++++++++                                *+*      \s
                          -++++++++++++++++++++++++++++++++++++++++++++++.                             =++*      \s
                          .+**+++++++++++++++++++++++++++++++++++++++++++*:                           :*++#      \s
                          .:-++++++++++++*******+++++++++++++++++++++++++++:                         .*++**      \s
                             :::::::::--*++====*+++++++++++++++++++++++++++*.                       .++++*-      \s
                                        =.....:*+++++++++++++++++++++++++++++                      .++++*+       \s
                                        =.....:*+++++++++++++++++++++++++++++:                    -*+++++-       \s
                                        -:....:*+++++++++++++++++++++++++++++=                  .=+++++*=        \s
                                         -....-*+++++++++++++++++++++++++++++=                .=+++++++-.        \s
                                         :-...=+++++++++++++++++++++++++****++:           .:-+++++++*=-.         \s
                                          --=+*+++++++++++++++++++++++++++++**#=:...:::--===++++++**:-.          \s
                                        .-=-++++++++++++++++++++++++++++++++++++++=====+++++++++**=:-.           \s
                                       -=--=+++++++++++++++++++++++++++++++++++++++++++++++++***=:-:             \s
                                      =---++++++++++++++++++++++++++++++++++++++++++++++++**#+-:-:               \s
                                     =--=++++++++++++**#####****+++++++++++++++++++++***#*+-::::                 \s
                                    .*+++++++++++++**##############***************##*+=-::-::                    \s
                                    .*+++++++++++**######*=++*#####**#########*++=-:.:-::.                       \s
                                     =+++++++++**######*-:::::------------:::::-::::..                           \s
                                      :**++++**#######*          .+###****#####.                                 \s
                                     -+**##############=          #############=                                 \s
                                  .:*++++*##############-           ...........                                \s""");
    }
}
