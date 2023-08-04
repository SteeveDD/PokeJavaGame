package Pokemon;

import Function.Attaque;
import Function.TypeAttaque;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private String nom;
    private final TypePokemon type;
    private int vie;
    private final TypeAttaque immunite;

    private final TypePokemon fragilite;
    private final TypePokemon bonusDef;
    private List<Attaque> attaques;

    public Pokemon(String nom, TypePokemon type, int vie, TypeAttaque immunite, TypePokemon fragilite, TypePokemon bonusDef) {
        this.nom = nom;
        this.type = type;
        this.vie = vie;
        this.immunite = immunite;
        this.fragilite = fragilite;
        this.bonusDef = bonusDef;
        attaques = new ArrayList<>();
    }


    public String getNom() {
        return nom;
    }

    public TypePokemon getType() {
        return type;
    }

    public int getVie() {
        return vie;
    }

    public TypeAttaque getImmunite() {
        return immunite;
    }

    public TypePokemon getFragilite() {
        return fragilite;
    }

    public TypePokemon getBonusDef() {
        return bonusDef;
    }

    public List<Attaque> getAttaques() {

        return attaques;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVie(int vie) {

        this.vie = vie;
    }

    public void setAttaques(List<Attaque> attaques) {

        this.attaques = attaques;
    }


    public Attaque getAttaque(int index) {

        return attaques.get(index);
    }

    public int getNbAttaques() {

        return attaques.size();
    }

    public void ajouterAttaque(Attaque attaque) {

        attaques.add(attaque);
    }

    public void afficherAttaques() {
        System.out.println("Attaques disponibles pour " + getNom() + ":");
        for (int i = 0; i < attaques.size(); i++) {
            System.out.println((i + 1) + ". " + attaques.get(i).getNom());
        }
    }

    public abstract void getImage();

    public void evoluer() {
        setNom(nom);
        setVie(vie);

    }

    public void recevoirDegats(int degats) {

        vie -= degats;
        if (vie < 0) {
            vie = 0;
        }
    }


}




