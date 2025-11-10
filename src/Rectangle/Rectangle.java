package Rectangle;

public class Rectangle {

    //Skapa en klass Rectangle. Konstruktorn ska ta in bredd och höjd som attribut.
    //Skapa en metod calculateArea som returnerar rektangelns area.
    //Skapa en metod calculatePerimeter som returnerar rektangelns omkrets.
    //Skapa ett objekt i din main-metod och skriv ut arean och omkretsen.


    int bredd; //Detta är Attribut t.ex längd, bredd, höjd, vikt
    int hojd;

    public Rectangle(int bredd, int hojd) { //Detta är Konstruktorn som anropas med New i Main.
        this.bredd = bredd;                 //Den ser till att objektets attribut får sina värden.
        this.hojd = hojd;                   //THIS är alltså detta objektets attribut. Vi tar inkommande
    }                                       //värde och lagrar här.

    public int calculateArea() {
        return this.hojd * this.bredd;

        // 1. Koden använder DE SPECIFIKA värdena för 'hojd' och 'bredd'
        //som tillhör just det 'rectangle'-objektet (i ditt fall 10 och 5).
        //2. 'this.hojd' är 10.
        //3. 'this.bredd' är 5.
        //4. Beräkningen blir 10 * 5 = 50.
        //return skickar sedan tillbaka resultatet (50) till Main-metoden
        // där den skrivs ut.

    }

    public int calculatePerimeter() {
        return 2 * (this.hojd + this.bredd);

    }





}
