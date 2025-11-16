package Inlamning.Prog;

import java.util.ArrayList;
import java.util.List;

public class TextCounter {

    //Programmet skall bestå av två klasser:
    //En klass som läser in text och skriver ut resultatet till användaren


    //En annan klass som räknar raderna och har koll på antalet tecken
    //Kontrollen för att ha koll på om användaren har skrivit ordet stop
    // eller inte får utföras i vilken av klasserna man vil

    private long tecken = 0;
    private int rader = 0;
    private long ord = 0;
    private final List<String> langstaOrdLista = new ArrayList<>();


    public boolean analyzeLine(String inmatning) {

        if (inmatning.trim().equals("stop")) {
            return true; // skickar tillbaka true ifall stop skrivs
        }

        String[] ordLista = inmatning.split("\\s+"); // tar bort space & \

        if(ordLista.length > 0 && !ordLista[0].isEmpty()) { // ser till att inmatning > 0
            ord += ordLista.length; // förhindrar krasch

            int nuvarandeMaxLangd;

            if (langstaOrdLista.isEmpty()) {
                nuvarandeMaxLangd = 0;

            } else {

                nuvarandeMaxLangd = langstaOrdLista.get(0).length();
            }

            for (String ordet : ordLista) {

                if (ordet.length() > nuvarandeMaxLangd) {
                    langstaOrdLista.clear();
                    langstaOrdLista.add(ordet);
                    nuvarandeMaxLangd = ordet.length();

                } else if (ordet.length() == nuvarandeMaxLangd && !langstaOrdLista.contains(ordet)) {

                    langstaOrdLista.add(ordet);
                }
            }
        }

        rader++; // Om texten inte innehåller stop skickas den hit
        tecken += inmatning.length();
        //tecken += inmatning.replaceAll("\\s+", "").length(); //utan whitespace

        return false; // säger till Main, fortsätt med varvet.

    }

    public int getAntalRader() {
        return rader;
    }

    public long getAntalTecken() {
        return tecken;
    }

    public long getOrd() {
        return ord;
    }

    public String getLangstaOrdet() {
        if (langstaOrdLista.isEmpty()) {
            return "Inget ord hittades";
        }
        return String.join(", ", langstaOrdLista);
    }
}


