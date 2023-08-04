package Item;

import Function.Attaque;
import Function.TypeAttaque;

public class Flameche extends Attaque {
    public Flameche(String nom, TypeAttaque type, int degats) {
        super(nom, type, degats);
    }

    @Override
    public String attaqueLogo() {
        return"""
                        :~               \s
                         J7              \s
                         JP~             \s
                        ~555. .          \s
                       !555P! ^~         \s
                     :?P5555J  :         \s
                   .75P55YJ5Y.  ::       \s
                  ~YP5555??55.  !5!      \s
                 ?P55555Y77?5J!755P7     \s
                ?P55555PJ7777YPP5555     \s
                5555Y7Y5?77777?Y5555     \s
                Y555?77777777777Y5P!     \s
                ^5P5?7777~~77777Y5!      \s
                 :?55?77~^^!777??^       \s
                   :~??7~^^!7!~:         \s
                                         \s
                   \s""";
    }
}
