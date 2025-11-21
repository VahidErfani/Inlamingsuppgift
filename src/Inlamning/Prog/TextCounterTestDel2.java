package Inlamning.Prog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCounterTestDel2 {

    @Test
    void testAntalTecken() {

        TextCDel2Fortsattning tC = new TextCDel2Fortsattning();

        tC.teckenRaknare("MercedesE63AMG");
        tC.teckenRaknare("Ferrari812");
        tC.teckenRaknare("AudiRS4B7");

        assertEquals(33, tC.getTecken(), "Ska räkna 33 tecken");

    }

    @Test
    void testRaknaSpace() {

        TextCDel2Fortsattning tC = new TextCDel2Fortsattning();

        tC.teckenRaknare(" ");
        tC.teckenRaknare("  ");
        tC.teckenRaknare("     ");

        assertEquals(8, tC.getTecken(), "Ska räkna 8 tecken");

    }

    @Test
    void testAvStop() {

        TextCDel2Fortsattning tC = new TextCDel2Fortsattning();

        String radSomSkaRaknas = "Rad nummer 1";
        String stopSignal = "stop";

        tC.teckenRaknare(radSomSkaRaknas);

        if (!stopSignal.equals("stop")) {
            tC.teckenRaknare(stopSignal);

        }

        assertEquals(1, tC.getRader(), "Endast första raden ska räknas, stop ska ignoreras");

        assertEquals(12, tC.getTecken(), "Endast tecknen från första raden ska räknas");



    }


}








