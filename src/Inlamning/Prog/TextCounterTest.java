package Inlamning.Prog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCounterTest {

    @Test
    void testStandardCounting() {


        TextCounter tc = new TextCounter();

        tc.analyzeLine("Kort text");
        tc.analyzeLine("En längre mening");
        tc.analyzeLine("sista");

        assertEquals(3, tc.getAntalRader(), "Ska räkna totalt 3 rader.");

        assertEquals(30, tc.getAntalTecken(), "Ska räkna totalt 30 tecken.");

    }

    @Test
    void testStopWordAndNoCount() {

        TextCounter tc = new TextCounter();
]
        String rad1 = "Första raden";
        String stoppord = " stop ";

        tc.analyzeLine(rad1);

        boolean stoppsignal = tc.analyzeLine(stoppord);

        assertTrue(stoppsignal, "analyzeLine måste returnera TRUE när 'stop' hittas");

        assertEquals(1, tc.getAntalRader(), "Endast 1 rad ska räknas (ej raden med stop)");

        assertEquals(12, tc.getAntalTecken(), "Endast 12 tecken ska räknas");

    }

    @Test
    void testEmptyAndWhitespaceLines() {

        TextCounter tc = new TextCounter();

        tc.analyzeLine("");

        tc.analyzeLine(" ");

        tc.analyzeLine("  ");

        tc.analyzeLine("slut");

        assertEquals(4, tc.getAntalRader(), "Ska räkna 4 rader, oavsett om de är tomma.");

        assertEquals(7, tc.getAntalTecken(), "Ska räkna totalt 7 tecken.");


    }

}