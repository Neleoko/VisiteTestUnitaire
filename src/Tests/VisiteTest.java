package Tests;

import Entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VisiteTest {

    private Visite visite;
    private Personne personne;
    private Adherent adherent;
    private TypePrestation tp1, tp2;


    @BeforeEach
    void setUp() {


        personne = new Personne("Azerty", "Qwerty","0604");
        adherent = new Adherent(personne.getNom(),personne.getPrenom(),personne.getTelPortable(),"60","145");
        visite = new Visite(adherent,"14:00");

        tp1 = new TypePrestation("EchoGraphie", 50);
        tp2 = new TypePrestation( "Insémination", 100);

    }

    @org.junit.jupiter.api.Test
    void montantAFacture() {
        visite.ajouterPrestationVisite(tp1,2);
        assertEquals(100,visite.montantAFacture());
        visite.ajouterPrestationVisite(tp2,1);
        assertEquals(200,visite.montantAFacture());
    }

}