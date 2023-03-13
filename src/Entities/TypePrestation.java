package Entities;

public class TypePrestation {
    private float prixForfaitaire;
    private String libelle;

    public TypePrestation(String libelle, float prixForfaitaire) {
        this.prixForfaitaire = prixForfaitaire;
        this.libelle = libelle;
    }

    public float getPrixForfaitaire() {
        return prixForfaitaire;
    }

    public String getLibelle() {
        return libelle;
    }
}
