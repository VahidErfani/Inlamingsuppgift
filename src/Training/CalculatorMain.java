package Training;

import java.util.Scanner;

public class CalculatorMain {

    static void main(String[] args) {


        //6.	Skapa en class Calculator som läser in två tal i 	konstruktorn och sparar dem som attribut
        //
        //7.	Skapa en metod som skriver ut addition för 	dessa två tal. Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en 	main-metodPr
        //
        //8.	Uppdatera din main-metod så att den läser in 	de två talen med Scanner
        //
        //9.	Uppdatera Calculator så att den har liknande 	metoder för minus/delat med/gånger

        Scanner sc = new Scanner(System.in);

        System.out.println("Mata in 2 heltal: ");
        int tal1 = sc.nextInt();
        int tal2 = sc.nextInt();

        Calculator kalkylator1 = new Calculator(tal1, tal2);
        kalkylator1.addition(kalkylator1.tal1, kalkylator1.tal2);

        kalkylator1.subtraktion(kalkylator1.tal1, kalkylator1.tal2);
    }



}
