package Item;

import Function.Attaque;
import Function.TypeAttaque;

public class Charge extends Attaque {

    public Charge(String nom, TypeAttaque type, int degats) {
        super(nom, type, degats);
    }

    @Override
    public String attaqueLogo() {
        return"""
                \s .                     .          \s
                \s .^~                    .!:.      \s
                \s.^.^                     ^ ~      \s
                \s^. ::.   ...........   .^. ^.     \s
                \s.^  ..::.............::.  .^      \s
                \s .^::.                 .:::       \s
                \s.^:::. .             . .:::^      \s
                \s ::..::~            .~:...::      \s
                \s       :^           ^.            \s
                \s        ::         ^.             \s
                \s         ~        .^              \s
                \s         ^:       ::              \s
                \s          .:::::::.               \s
                \s                                  \s
                \s                                  \s
                \s                           \s""";
    }
}
