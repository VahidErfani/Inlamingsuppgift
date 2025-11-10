package Inlamning.Prog;

import java.util.Scanner;

public class Del2 {

    //Skriv ett program som läser in text ifrån
    // kommandoraden rad för rad tills användaren skriver ordet stop.
    //När användaren är klar skriver programmet ut antal tecken och
    // hur många rader som användaren har skrivit, exklusive raden med ordet stop

    static void main(String[] args) {

        long tecken = 0;
        int rader = 0;

        Scanner scanner = new Scanner(System.in);

        String inmatning;

        System.out.println("Hej, skriv in din text! Avsluta med ordet 'stop'. ");

        do {
            inmatning = scanner.nextLine();

            if (inmatning.trim().equals("stop")) {
                break;
            }

            rader++;
            tecken += inmatning.length();

        } while (true);

        scanner.close();

        System.out.println("Antal rader: " + rader);
        System.out.println("Antal tecken: " + tecken);



        }

}