package Inlamning.Prog;

public class TextCDel2Fortsattning {

    //Del 2 – fortsättning 1
    //Programmet skall bestå av två klasser:
    //En klass som läser in text och skriver ut resultatet till användaren
    //En annan klass som räknar raderna och har koll på antalet tecken
    //Kontrollen för att ha koll på om användaren har skrivit ordet stop
    //eller inte får utföras i vilken av klasserna man vill

    private long tecken;
    private int rader;

    public void teckenRaknare(String inmatning) { // Ändrar på våra variabler till korrekta siffror från inmatning
        this.tecken += inmatning.length();
        this.rader++; // Anropas av Main och gör beräkningen
    }

    public long getTecken() { // Hämtar ny data från våra privata variabler
        return this.tecken; // som sedan kan anropas av våran main med getters
    }

    public int getRader() {
        return this.rader;
    }

}
