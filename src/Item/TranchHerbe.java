package Item;

import Function.Attaque;
import Function.TypeAttaque;

public class TranchHerbe extends Attaque {
    public TranchHerbe(String nom, TypeAttaque type, int degats) {
        super(nom, type, degats);
    }

    @Override
    public String attaqueLogo() {
        return """
                                             \s
                              ( ((((((##     \s
                        (((((((((#/(((#      \s
                    ( ((((((((#/(((((##      \s
                   (((((((((/((((/(((#(      \s
                 ((((((/((/(((((((((##       \s
                 (((((((/(((*((((((###       \s
                 (((((##((((((//(((##        \s
                 ((##/(//((((((#(##          \s
                 ((/#(((((/#(####            \s
                  /#((((###                  \s
                //                           \s
                                             \s
                \s """;
    }
}
