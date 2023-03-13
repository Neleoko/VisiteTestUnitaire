package Entities;

public class Consommateur {
    private String nom;
    private double pointsFidelite;

    public Consommateur(String nom, double pointsFidelite) {
        this.nom = nom;
        this.pointsFidelite = pointsFidelite;
    }

    public String getNom() {
        return nom;
    }

    public double getPointsFidelite() {
        return pointsFidelite;
    }

    public void CalculerPointsFidelite(int type, double montant){

        switch (type){
            case 1:
                pointsFidelite+=1;
                break;
            case 2:
                pointsFidelite+=montant;
                break;
            case 3:
                if(montant < 100){
                    pointsFidelite+= 0;
                }
                else if (montant > 100 && montant < 200){
                    pointsFidelite+=10;
                } else if (montant > 200 && montant <= 500){
                    pointsFidelite+=20;
                } else {
                    pointsFidelite+=50;
                }
                break;
        }
    }
}
