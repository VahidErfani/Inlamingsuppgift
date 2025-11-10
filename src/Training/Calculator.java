package Training;

public class Calculator {

    //6.	Skapa en class Calculator som läser in två tal i 	konstruktorn och sparar dem som attribut
    //
    //7.	Skapa en metod som skriver ut addition för 	dessa två tal. Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en 	main-metodPr
    //
    //8.	Uppdatera din main-metod så att den läser in 	de två talen med Scanner
    //
    //9.	Uppdatera Calculator så att den har liknande 	metoder för minus/delat med/gånger

    int tal1;
    int tal2;

    public Calculator(int tal1, int tal2){
        this.tal1=tal1;
        this.tal2=tal2;
    }

    public void addition(int tal1, int tal2){
        int summa = tal1 + tal2;
        System.out.println("summa addition: " + summa);
    }

    public void subtraktion(int tal1, int tal2){
        int summa = tal1 - tal2;
        System.out.println("summa subtraktion: " + summa);
    }

}

