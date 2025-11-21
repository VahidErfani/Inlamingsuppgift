package Inlamning.Prog;

import java.util.Scanner;

public class Del2ForstaUppgift {

    //Skriv ett program som läser in text ifrån
    //kommandoraden rad för rad tills användaren skriver ordet stop.
    //När användaren är klar skriver programmet ut antal tecken och
    //hur många rader som användaren har skrivit, exklusive raden med ordet stop

    static void main(String[] args) {

        long tecken = 0; // Våra variabler
        int rader = 0;

        Scanner scanner = new Scanner(System.in); // Objekt av klassen scanner

        System.out.println("Hej, skriv in din text! Avsluta med ordet 'stop'");
        String inmatning; // Skapar en plats för att spara användarens text

        do {
            inmatning = scanner.nextLine(); // Inmatning från användaren sparas i inmatning

            if (!inmatning.equals("stop")) { // Om inmatning ej innehåller stop
                rader++; // öka rader med 1
                tecken += inmatning.length(); // öka tecken med inmatningens längd
            }

        } while (!inmatning.equals("stop")); // Kör loopen så länge inte stop matas in

        scanner.close();

        System.out.println("Antal rader: " + rader);
        System.out.println("Antal tecken: " + tecken);

    }

}