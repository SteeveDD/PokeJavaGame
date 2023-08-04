package Item;

import Function.Attaque;
import Function.TypeAttaque;

public class Baffe extends Attaque {
    public Baffe(String nom, TypeAttaque type, int degats) {
        super(nom, type, degats);
    }

    @Override
    public String attaqueLogo() {
        return """
                     *,         &                                 \s
                           @       ,     @                        \s
                    *.       /.     /                            \s
                                 ..,..        ,  ..              \s
                .%@.       . ..,.......,..    ,...,              \s
                           .......,,........,, ....,             \s
                           . ..,.......,.............            \s
                           ........,..................           \s
                ,@@,        . .,......,...............,          \s
                            .......,...................,         \s
                        /      ..........................&@@     \s
                      %             .................,.,@@&      \s
                                        ..............&@@        \s
                                             .......,@@%         \s
                                                   .@@           \s
                                                                 \s
                                                   \s""";
    }
}
