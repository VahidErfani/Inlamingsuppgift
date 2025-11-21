package Inlamning.Prog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCounterTestDel3 {

    @Test
    void testAvFleraLangstaOrd() {


        TextCounterDel3 textraknare = new TextCounterDel3();

        textraknare.tC("Volvo");
        textraknare.tC("Ferrari");
        textraknare.tC("Porsche");

        textraknare.tC("stop");

        assertEquals("Ferrari, Porsche", textraknare.getLangstaOrd(),
                "Ska skriva ut Ferrari, Porsche separerade med kommatecken.");


    }

    @Test
    void testUppdateraNyttLangstaOrd() {

        TextCounterDel3 textraknare = new TextCounterDel3();

        textraknare.tC("Bugatti");
        textraknare.tC("BMW");
        textraknare.tC("Lamborghini");

        assertEquals("Lamborghini", textraknare.getLangstaOrd(),
                "Lamborghini ska ersätta Bugatti som var det längsta ordet.");

    }

    @Test
    void testAvAntalTecken() {

        TextCounterDel3 textraknare = new TextCounterDel3();

        textraknare.tC("Test1");
        textraknare.tC("Test2");
        textraknare.tC("  ");
        textraknare.tC("          ");


        assertEquals(22, textraknare.getTecken(),
                "Ska räkna alla tecken ink. space.");


    }
}
