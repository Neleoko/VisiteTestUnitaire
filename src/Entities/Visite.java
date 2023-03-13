package Entities;

import java.util.ArrayList;

public class Visite {
    private Adherent leAdherent;
    private ArrayList<PrestationVisite> lesPrestationsVisite;
    private String heure;

    public Visite(Adherent leAdherent, ArrayList<PrestationVisite> lesPrestationsVisite, String heure) {
        this.leAdherent = leAdherent;
        this.lesPrestationsVisite = lesPrestationsVisite;
        this.heure = heure;
    }

    public Adherent getLeAdherent() {
        return leAdherent;
    }

    public ArrayList<PrestationVisite> getLesPrestationsVisite() {
        return lesPrestationsVisite;
    }

    public String getHeure() {
        return heure;
    }

    public float montantAFacture(){
        float total = 0;
        for (PrestationVisite pre : lesPrestationsVisite){
            total = pre.getNombreActes() * pre.getLeTypePresation().getPrixForfaitaire();
        }
        return total;
    }

    public void ajouterPrestationVisite(TypePrestation typePrestation, int nombreActes){
        
    }
}
