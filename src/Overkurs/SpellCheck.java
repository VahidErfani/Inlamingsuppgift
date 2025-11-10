package Overkurs;

public class SpellCheck {

    //Skapa ett rättstavningsprogram där man tävlar i att skriva ut rätt ord. Användaren får ett ord skrivet på skärmen
    // och skall sedan repetera detta ordet på kommandoraden. Skriver användaren rätt får den 1 poäng annars inget poäng.
    // Repetera detta för några ord (3 ord räcker som exempel) och skriv sen ut totalt antal poäng. När du skapar ditt
    // program försök att lägga logiken samt sparande av data i en class och låt classen med mainmetoden enbart läsa in
    // text och skriva ut resultatet.

    int score;

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void compareWords(String word1, String word2) {
        if(word1.equals(word2)){
            this.score++;
        }
    }


}
