package Inlamning.Prog;

import java.util.Scanner;

public class TextCFortsattningMainDel2 {

    //Del 2 – fortsättning 1
    //Programmet skall bestå av två klasser:
    //En klass som läser in text och skriver ut resultatet till användaren
    //En annan klass som räknar raderna och har koll på antalet tecken
    //Kontrollen för att ha koll på om användaren har skrivit ordet stop
    //eller inte får utföras i vilken av klasserna man vill


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextCDel2Fortsattning textCounterDel2Fortsattning = new TextCDel2Fortsattning();

        System.out.println("Hej, skriv in din text! Avsluta med ordet 'stop'. ");
        String inmatning; // Skapat en lagringsplats

        do {
            inmatning = scanner.nextLine(); // Spara användarens inmatning

            if (!inmatning.equals("stop")) {
                textCounterDel2Fortsattning.teckenRaknare(inmatning);//Om inmatning inte är stop, räkna
            }// Anropar teckenRaknare och ber den göra sin beräkning

        } while (!inmatning.equals("stop")); // Om inte stop, fortsätt loop

        scanner.close();

        System.out.println("Antal tecken: " + textCounterDel2Fortsattning.getTecken());
        System.out.println("Antal rader: " + textCounterDel2Fortsattning.getRader());
        // Här hämtar vi beräkningen som våran logikklass gjort


    }

}