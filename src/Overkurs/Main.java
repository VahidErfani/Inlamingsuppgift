package Overkurs;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {


        //Skapa ett rättstavningsprogram där man tävlar i att skriva ut rätt ord. Användaren får ett ord skrivet på skärmen
        // och skall sedan repetera detta ordet på kommandoraden. Skriver användaren rätt får den 1 poäng annars inget poäng.
        // Repetera detta för några ord (3 ord räcker som exempel) och skriv sen ut totalt antal poäng. När du skapar ditt
        // program försök att lägga logiken samt sparande av data i en class och låt classen med mainmetoden enbart läsa in
        // text och skriva ut resultatet.

        Scanner scanner = new Scanner(System.in);
        SpellCheck spellCheck = new SpellCheck();

        String word1 = "Mercedes";
        System.out.println("Stava rätt på detta ord " + word1);
        String userInput1 = scanner.nextLine();
        spellCheck.compareWords(word1, userInput1);

        String word2 = "Toyota";
        System.out.println("Stava rätt på detta ord " + word2);
        String userInput2 = scanner.nextLine();
        spellCheck.compareWords(word2, userInput2);

        String word3 = "Nissan";
        System.out.println("Stava rätt på detta ord " + word3);
        String userInput3 = scanner.nextLine();
        spellCheck.compareWords(word3, userInput3);

        System.out.println("Den totala poängen är " + spellCheck.getScore());



    }
}
