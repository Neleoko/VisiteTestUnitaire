package Entities;

public class PrestationVisite {
    private TypePrestation leTypePresation;
    private int nombreActes;

    public PrestationVisite(TypePrestation leTypePresation, int nombreActes) {
        this.leTypePresation = leTypePresation;
        this.nombreActes = nombreActes;
    }

    public TypePrestation getLeTypePresation() {
        return leTypePresation;
    }

    public int getNombreActes() {
        return nombreActes;
    }
}
