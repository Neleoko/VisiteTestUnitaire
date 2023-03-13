package Entities;

import java.util.ArrayList;
import java.util.Date;

public class Tournee {
    private Date date;
    private ArrayList<Visite> lesVisites;
    private int kmRealises;
    private Inseminateur leInseminateur;

    public Tournee(Date date, int kmRealises, Inseminateur leInseminateur) {
        this.date = date;
        this.kmRealises = kmRealises;
        this.leInseminateur = leInseminateur;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Visite> getLesVisites() {
        return lesVisites;
    }

    public int getKmRealises() {
        return kmRealises;
    }

    public Inseminateur getLeInseminateur() {
        return leInseminateur;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setKmRealises(int kmRealises) {
        this.kmRealises = kmRealises;
    }

    public void ajouterVisite(Visite visite){

    }
}
