package Entities;

import java.util.ArrayList;

public class Visite {
    private Adherent leAdherent;
    private ArrayList<PrestationVisite> lesPrestationsVisite;
    private String heure;

    public Visite(Adherent leAdherent, String heure) {
        this.leAdherent = leAdherent;
        this.heure = heure;
        this.lesPrestationsVisite = new ArrayList<>();
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
            total += pre.getNombreActes() * pre.getLeTypePrestation().getPrixForfaitaire();
        }
        return total;
    }

    public void ajouterPrestationVisite(TypePrestation typePrestation, int nombreActes){
        lesPrestationsVisite.add(new PrestationVisite(typePrestation, nombreActes));
    }
}
