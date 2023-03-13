package Tests;

import Entities.Consommateur;

import static org.junit.jupiter.api.Assertions.*;

class ConsommateurTest {

    private Consommateur monConso;
    private Consommateur monConso1;
    private Consommateur monConso2;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        monConso = new Consommateur("Azerty", 0);
        monConso1 = new Consommateur("Qwerty", 0);
        monConso2 = new Consommateur("blabla", 0);
    }

    @org.junit.jupiter.api.Test
    void calculerPointsFidelite() {
        // Programme 1 : achat de 54 euros
        monConso.CalculerPointsFidelite(1,54);
        assertEquals(1,monConso.getPointsFidelite());
        // Programme 1 : achat de 100 euros
        monConso.CalculerPointsFidelite(1, 100);
        assertEquals(2, monConso.getPointsFidelite());

        // Programme 2 : achat de 54 euros
        monConso1.CalculerPointsFidelite(2,54);
        assertEquals(54, monConso1.getPointsFidelite());
        // Programme 2 : achat de 100 euros
        monConso1.CalculerPointsFidelite(2, 100);
        assertEquals(154, monConso1.getPointsFidelite());


        // Programme 3 : achat de 50 euros
        monConso2.CalculerPointsFidelite(3,50);
        assertEquals(0, monConso2.getPointsFidelite());
        // Programme 3 : achat de 100 euros
        monConso2.CalculerPointsFidelite(3,150);
        assertEquals(10, monConso2.getPointsFidelite());
        // Programme 3 : achat de 250 euros
        monConso2.CalculerPointsFidelite(3,250);
        assertEquals(30, monConso2.getPointsFidelite());
        // Programme 3 : achat de 550 euros
        monConso2.CalculerPointsFidelite(3,550);
        assertEquals(80, monConso2.getPointsFidelite());
    }
}