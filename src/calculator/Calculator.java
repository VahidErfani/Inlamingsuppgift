package calculator;

public class Calculator {


//6.	Skapa en class Calculator som läser in två tal i 	konstruktorn och sparar dem som attribut
//
//7.	Skapa en metod som skriver ut addition för 	dessa två tal.
// Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en main-metodPr
//
//8.	Uppdatera din main-metod så att den läser in 	de två talen med Scanner
//
//9.	Uppdatera Calculator så att den har liknande 	metoder för minus/delat med/gånger

    private double tal1;
    private double tal2;

    public Calculator(double inmatatTal1, double inmatatTal2) {
        this.tal1 = inmatatTal1;
        this.tal2 = inmatatTal2;
    }

 public void adderaOchSkrivUt() {
        double summa = this.tal1 + this.tal2;
        System.out.println("Addition: " + summa);
 }


}