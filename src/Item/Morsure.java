package Item;

import Function.Attaque;
import Function.TypeAttaque;

public class Morsure extends Attaque {
    public Morsure(String nom, TypeAttaque type, int degats) {
        super(nom, type, degats);
    }

    @Override
    public String attaqueLogo() {
        return"""
                                                                                 \s
                                     &@@@@ @@@@,,@@@@@@ @@@@@@ @@@@@ @@@@*       \s
                                      @@@@@@@@@@%@@@@@@(@@@@@@ @@@@@@@@@@        \s
                                      @@@@@(@@@@ @@@@@@ @@@@@@(@@@@ @@@@%        \s
                                       @@@@                         @@@@         \s
                                        @@@                         @@@          \s
                                         %@                         @.           \s
                                           @                       @             \s
                                                                                 \s
                                                                                 \s
                                           @                      @              \s
                                          @@  @@@ ,@@@ (@@@. @@@ #@@             \s
                                         @@@.@@@@ @@@@@@@@@@ @@@@@@@@            \s
                                        @@@@ @@@# @@@@#@@@@@ @@@@#@@@(           \s
                                                                                 \s
                                        \s""";
    }
}
