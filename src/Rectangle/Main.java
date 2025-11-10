package Rectangle;

public class Main {

    //Skapa en klass Rectangle. Konstruktorn ska ta in bredd och höjd som attribut.
    //    //Skapa en metod calculateArea som returnerar rektangelns area.
    //    //Skapa en metod calculatePerimeter som returnerar rektangelns omkrets.
    //    //Skapa ett objekt i din main-metod och skriv ut arean och omkretsen.

    static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,5); //Rectangle anropar Konstruktorn och skickar med
                                                              //bredd och höjd
                                                              // Anropar konstruktorn och skickar IN 5 och 10.
                                // Dessa värden lämnas över till objektet och glöms sedan bort i main-metoden.
                                // Värdena 5 och 10 finns nu INKAPSLADE i 'rectangle'-objektet.

                                //Metodanropet kräver inga nya värden i parenteserna ().
                                //Vi ber helt enkelt 'rectangle'-objektet att "räkna ut din area".
                                //Koden hoppar till metoden i Rectangle och den hämtar 5 och 10 från sin interna lagring.
                                //Metoden returnerar 50.

        System.out.println("Area = " + rectangle.calculateArea());

        System.out.println("Omkrets = " + rectangle.calculatePerimeter());



    }
}
