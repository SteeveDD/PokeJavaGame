package Function;

public abstract class Attaque {
    private String nom;
    private TypeAttaque type;
    private int degats;

    public Attaque(String nom, TypeAttaque type, int degats) {
        this.nom = nom;
        this.type = type;
        this.degats = degats;
    }

    public String getNom() {
        return nom;
    }

    public TypeAttaque getType() {
        return type;
    }

    public int getDegats() {
        return degats;
    }


public abstract String attaqueLogo();
}

