package Inlamning.Prog;

import java.util.Scanner;

public class MainProgram {

    //Programmet skall bestå av två klasser:
    //En klass som läser in text och skriver ut resultatet till användaren
    //En annan klass som räknar raderna och har koll på antalet tecken
    //Kontrollen för att ha koll på om användaren har skrivit ordet stop
    // eller inte får utföras i vilken av klasserna man vil

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TextCounter textcounter = new TextCounter();

        String inmatning;

        System.out.println("Hej, skriv din text, och avsluta programmet med ordet 'stop'. ");

        do { //Programmet måste fråga minst en gång
            inmatning = scanner.nextLine();

            if (textcounter.analyzeLine(inmatning)) {
                break;
            }

        } while(true);

        scanner.close();

        System.out.println("Antal rader: " + textcounter.getAntalRader());
        System.out.println("Antal tecken: " + textcounter.getAntalTecken());



    }

}

