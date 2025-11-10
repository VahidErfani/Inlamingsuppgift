package UppgifterJava;

public class Uppgift1tillTio {

    static void main() {


        //1. Skapa ett program som skriver ut kvadraten på ett tal som är definierat i en variabel.
        //Kvadraten är talet multiplicerat med sig själv.

       /* int tal1 = 5;

        int tal2 = 7;

        System.out.print("Svaret blir " + tal1 * tal2);

    }

}

        */

        // 2. En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9%
        //av försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        //Försäljningssumman ska vara definierad i en variabel.
/*
        double grundlon = 8000.0;

        double provision = 500000.0;

        double procent = 0.09;

        double totallon = grundlon + provision * 0.09;

        System.out.println("Du tjänar totalt " + totallon);


*/

        //3. Skapa ett program där antal timmar är definierad i en variabel. Programmet beräknar
        //och skriver ut hur mycket det blir omvandlat till minuter resp. sekunder.

      /*  int antalTimmar = 3;
        int minuter = antalTimmar * 60;
        int sekunder = minuter * 60;

        System.out.println("Svaret blir " + antalTimmar + " timmar " + minuter + " minuter" + " och " + sekunder + " sekunder");


    }


}
*/

      /*  //4. Skapa ett program där tre tal är definierade i var sin variabel. Programmet beräknar
        //och skriver ut summan samt medelvärdet av de tre talen.

        int tal1 = 100;
        int tal2 = 200;
        int tal3 = 300;

        int antalTal = 3;

        int summa = tal1 + tal2 + tal3;

        System.out.println("Totalsumma = " + summa);

        System.out.println("Medelvärdet blir = " + summa / antalTal );

    }
}

*/

      /*  //5. Definiera ett heltal i en variabel som anger svenska kronor. Skriv ut motsvarande värde
        //i pund respektive dollar. Antag att kursen är: 1 dollar = 6 kr, 1 pund = 10 kr.

        double sek = 500;
        double dollar = 6;
        double pund = 10;

        System.out.println("sek till dollar = " + sek / 6);
        System.out.println("sek till pund = " + sek / 10);
    }
}
*/
/*
        //6. Skapa ett program som beräknar funktionen a*x*3 + 7 och skriver ut resultatet. A och x
        //ska vara definierade i var sin variabel.

        int a = 2;
        int x = 3;

        System.out.println("Svar: " + a*x*3+7);



    }
}


       */
/*
        //7. Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
        //liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala.
        //Indatan kan vara definierade i variabler

        double antalLiter = 50;
        double prisPerLiter = 17.7;
        double rabattProcent = 0.05;
        double bransleKost = antalLiter * prisPerLiter;
        double rabattUtrakning = bransleKost * rabattProcent;
        double totalPris = bransleKost - rabattUtrakning;

        System.out.println("Totalpris " + totalPris);




    }
}

*/
/*
        //8. Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        //Rektangelns sidor ska vara definierade i olika variabler.
        int tal1 = 2;
        int tal2 = 3;
        int langd1 = 3;
        int bredd = 4;
        int area = tal1 * tal2;
        int omkrets = 2 * (langd1 + bredd);

        System.out.println("Arean är " + area);
        System.out.println("Omkretsen är " + omkrets);



    }
}


 */
/*
        //9. Skapa ett program där en cirkels radie är definierad i en variabel. Cirkelns diameter,
        //omkrets och area skall beräknas och skrivas ut. (anta att pi = 3.14).

        double radie = 15;
        double diameter = 2 * radie;
        double omkrets = 2 * 3.14 * radie;
        double area = 3.14 * radie * radie;

        System.out.println("Diameter =  " + diameter + ", Omkrets = " + omkrets + ", Area = " + area);


    }
}
 */

        //10.Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9*C / 5 + 32.
        //Skapa ett program där en temperatur i Celsius och motsvarande temperatur i
        //Fahrenheit skrivs ut

        double celcius = 20;
        double fahrenheit = (celcius * 9) / 5 + 32;

        System.out.println("Fahrenheit= " + fahrenheit);
        System.out.println("Celcius= " + celcius);

    }
}