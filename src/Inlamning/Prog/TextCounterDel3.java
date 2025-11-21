package Inlamning.Prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//En annan klass som:
//Räknar raderna, antal tecken och antal ord
//Har koll på det längsta ordet
//Har koll på om användaren har skrivit ordet stop eller inte

public class TextCounterDel3 {

    private long tecken;
    private int rader;
    private int antalOrd;
    private String langstOrd = "";
    private List<String> allaOrd = new ArrayList<>();


    public boolean tC(String inmatning) {
        if (inmatning.equals("stop")) { //Om stop, return false
            return false; //Ej stop hoppar över
        }
        this.tecken += inmatning.length();
        this.rader++;
        //Tilldelas värde


        String[] ordLista = inmatning.split(" "); //Delar strängen vid mellanslag, sparas i Array
        this.antalOrd += ordLista.length; //Tilldela antalOrd genom att kolla hur många ord som finns i ordLista
        this.allaOrd.addAll(Arrays.asList(ordLista)); //Tillfällig lagring som sparas i allaOrd


        //Hitta längsta siffran som sen representerar en string
        int maxLength = 0;
        for (String s : this.allaOrd) { // Kollar antalOrd och loopar efter antalet
            if (s.length() > maxLength) { // Letar efter längsta tecknet
                maxLength = s.length(); // Sätter längsta tecknet
            }
        }


        // Samlar längsta orden
        boolean firstWord = true; // Första ordet kommer in = true, varv 2 false då langstOrd redan har ett ord
        for (String s : this.allaOrd) {
            if (s.length() == maxLength && maxLength > 0) {
                if (firstWord) { //Lägger till första ordet
                    langstOrd = s; // Första ordet sparas här
                    firstWord = false; //Blir false om langOrd blir 1 ord, och kör else blocket
                } else {
                    langstOrd += ", " + s; // Tilldela ',' och space vid flera ord
                }
            }
        }
        return true;
    }

    public long getTecken() {
        return this.tecken;
    }

    public int getRader() {
        return this.rader;
    }

    public int getAntalOrd() {
        return this.antalOrd;
    }

    public String getLangstaOrd() {
        return this.langstOrd;
    }
}