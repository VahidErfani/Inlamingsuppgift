package Inlamning.Prog;

public class TextCounter {

    //Programmet skall bestå av två klasser:
    //En klass som läser in text och skriver ut resultatet till användaren


    //En annan klass som räknar raderna och har koll på antalet tecken
    //Kontrollen för att ha koll på om användaren har skrivit ordet stop
    // eller inte får utföras i vilken av klasserna man vil

    private long tecken = 0;
    private int rader = 0;

    public boolean analyzeLine(String inmatning) {

        if (inmatning.trim().equals("stop")) {
            return true; // skickar tillbaka true ifall stop skrivs
        }

        rader++; // Om texten inte innehåller stop skickas den hit
        tecken += inmatning.length();

        return false; // säger till Main, fortsätt med varvet.

    }

    public int getAntalRader() {
        return rader;
    }

    public long getAntalTecken() {
        return tecken;
    }

}


