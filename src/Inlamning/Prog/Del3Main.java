package Inlamning.Prog;

import java.util.Scanner;

public class Del3Main {

  //Programmet skall fortfarande bestå av två klasser:
    //En klass som läser in text och skriver ut resultatet till användaren

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextCounterDel3 textCountDel3 = new TextCounterDel3();

        System.out.println("Hej, skriv in din text! Avsluta med ordet 'stop'. ");
        String inmatning; //Lagringsplats

        boolean shouldContinue = true;
        while (shouldContinue) {
            inmatning = scanner.nextLine();//Användarens svar sparas här
            shouldContinue = textCountDel3.tC(inmatning); // Vid stopp ändras shouldContinue till false

        }

        scanner.close();

        System.out.println("Antal tecken: " + textCountDel3.getTecken());
        System.out.println("Antal rader: " + textCountDel3.getRader());
        System.out.println("Antal ord: " + textCountDel3.getAntalOrd());
        System.out.println("Längsta ord: " + textCountDel3.getLangstaOrd());

    }

}


