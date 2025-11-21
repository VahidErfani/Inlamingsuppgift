package Repetition;

//Skapa en klass Rectangle. Konstruktorn ska ta in bredd och höjd som attribut.
//Skapa en metod calculateArea som returnerar rektangelns area.
//Skapa en metod calculatePerimeter som returnerar rektangelns omkrets.
//Skapa ett objekt i din main-metod och skriv ut arean och omkretsen.

public class Rectangle2 {

    private final double bredd;
    private final double hojd;



    public Rectangle2(double bredd, double hojd) {
        this.bredd = bredd;
        this.hojd = hojd;
    }

public double getBredd() {
    return bredd;
}

public double getHojd() {
    return hojd;

    }

    public double calculateArea() {
        return bredd * hojd;
    }

    public double calculatePerimeter() {
        return bredd * 2 + hojd * 2;
    }

    public boolean isSquare() {
        return bredd == hojd;
    }
}

