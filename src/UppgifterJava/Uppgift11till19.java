package UppgifterJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uppgift11till19 {

    //11.Skapa ett program där två tal sparas i variabler och det första talet skrivs ut om det är
    //störst.

    static void main(String[] args) {

      /*  int tal1=20;
        int tal2=10;

        if(tal1>tal2) {
            System.out.println(tal1 + " är större");
        }

    }
}

       */

        /*int tal1=2;
        int tal2=20;

        if(tal1>tal2*2)
        {
            System.out.println("Talet är för stort"); }

        else {
            System.out.println("20");

        }

        }

    }

         */

//13.Skapa ett program som sparar ett tal i en variabel och skriver ut om det är jämnt.
//(Använd modulooperatorn)


/*int tal1=15;

if(tal1 % 2==0) {
    System.out.println("Jämt tal");
}
else {
    System.out.println("udda");
}


    }
}
 */

//15.Skapa ett program som sparar två tal i variabler och avgör och skriver ut om det första
//talet är jämnt delbart med det andra talet.

     /*   int tal1=11;
        int tal2=5;

        if(tal1 % tal2==0) {
            System.out.println("jämt delbart");
        } else System.out.println("Inte jämt delbart");
 }
}

      */
//16.En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle
//handlar för minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett
//visst slag. Skapa ett program som beräknar vad en kund ska betala. Indata till algoritmen
//ska vara antalet köpta enheter och priset per enhet

        /*int antalE = 10;
        double prisPE = 150.0;

        final double rabattGrans = 1000.0;
        final double rabattP = 0.10;

        double totalKost = antalE * prisPE;
        double totalRabatt = totalKost * rabattP;
        double totalBelopp = totalKost - totalRabatt;

        if(totalKost >= rabattGrans) {
            double rabattBelopp = totalKost * rabattP;
            System.out.println("Du får 10% rabatt, totalbelopp: " + totalBelopp);
        } else {
            System.out.println("Ingen rabatt, du betalar ordinariepris" + totalKost);

        }


    }
}

         *///17.Skapa ett program som sparar två tal och dividerar det första talet med det andra
//talet. Om det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten
//skrivas ut.


//18.Skapa ett program där värden på variablerna X och Y sparas. Skapa en variabel A och
//tilldela variabel A värdet 2 om X är större än 5 + Y, annars tilldela A värdet 5. Skriv ut
//variabeln A.


    /*    int x = 12;
        int y = 8;
        int A;
        int Jamfor = 5 + y;

        if (x > 5 + y) {
        A = 2;
        System.out.println("Talet är inte störe");
    } else {
    A = 5;
            System.out.println("Talet är större");


        }


    }
}


*/
        //19.En anställd som har timlön får, när arbetstiden överstiger 40 tim en vecka,
        //övertidsbetalning för tiden utöver 40 tim med 1½ tim. Skapa ett program som har sparat
        //en anställds timlön och en veckas arbetstid. Den totala veckolönen ska beräknas och
        //skrivas ut.


               /* double timLön = 150.0;     // Timlön i kr/timme
                double arbetadeTimmar = 45.5; // Antal arbetade timmar under veckan

                // Konstanta värden för beräkning
                final int STANDARD_TID = 40;
                final double ÖVERTIDS_FAKTOR = 1.5;

                double totalLön;

                // Skriv ut startinformation
                System.out.println("--- Löneberäkning ---");
                System.out.println("Timlön: " + timLön + " kr");
                System.out.println("Arbetade timmar: " + arbetadeTimmar + " timmar");
                System.out.println("Standardtid: " + STANDARD_TID + " timmar");
                System.out.println("Övertidsfaktor: x" + ÖVERTIDS_FAKTOR);
                System.out.println("---------------------");


                // 2. Beräkna lönen baserat på övertid (if-else-struktur)
                if (arbetadeTimmar > STANDARD_TID) {
                    // SCENARIO 1: Övertid har arbetats

                    // a) Beräkna lön för standardtid (de första 40 timmarna)
                    double standardLön = STANDARD_TID * timLön;

                    // b) Beräkna övertidstimmar och övertidsersättning
                    double övertidsTimmar = arbetadeTimmar - STANDARD_TID;

                    // Övertidslön = Övertidstimmar * (Timlön * Faktor 1.5)
                    double övertidsLön = övertidsTimmar * timLön * ÖVERTIDS_FAKTOR;

                    // c) Total lön
                    totalLön = standardLön + övertidsLön;

                    System.out.println("Det finns övertid (" + övertidsTimmar + " timmar).");
                    System.out.println("Lön standardtid: " + standardLön + " kr");
                    System.out.println("Övertidsersättning: " + övertidsLön + " kr");

                } else {
                    // SCENARIO 2: Ingen övertid (40 timmar eller mindre)

                    // Lön = Arbetade timmar * Timlön
                    totalLön = arbetadeTimmar * timLön;

                    System.out.println("Ingen övertid (timmar <= " + STANDARD_TID + ").");
                }


                // 3. Skriv ut den totala veckolönen
                System.out.println("----------------------------------------");
                System.out.printf("Total veckolön: %.2f kr%n", totalLön);
                // %.2f formaterar utskriften till två decimaler (kronor och ören)
            }
        }




                */

        //20.Skapa ett program som har sparat ett tal. Om talet är mellan 0 och 9 ska kvadraten på
        //talet skrivas ut. Annars ska lämpligt felmeddelande ges.
/*
int tal = 7;

if( tal >= 0 && tal <=9) {
    int kvadrat = tal * tal;

    System.out.println("Kvadraten blir " + kvadrat);
} else {
    System.out.println("Fel meddelande ");
}


    }
}

 */

//21.Skapa ett program som testar om ett tal är mindre än -10 eller större än +10. I så fall
//ska ett lämpligt meddelande ges.

      /* int tal = -9;

       if (tal < -10 || tal > 10) {
           System.out.println("Ligger utanför gränsen " + tal);
      } else {
           System.out.println("Talet " + tal + " ligger rätt");



       }
    }
}

       */

//22.Skapa ett program som testar om ett sparat tal är 0-9 men inte 5. Skriv ut lämplig text.

     /*   int tal = 5;

    if(tal >= 0 && tal <=9 && tal != 5) {
        System.out.println("Talet " + tal + " är mellan 0 och 9, men inte 5");
    }  else {
        System.out.println("Talet " + tal + " uppfyller inte alla villkor");

   }

 }

      */

       /* //24.Skapa ett program som sparar kroppstemperaturen och skriver ut ett lämpligt
        //meddelande om temperaturen är mindre än 35 grader eller större än 42 grader.

        double kroppstemp = 34;

        if(kroppstemp <=35 || kroppstemp >=42) {
        System.out.println("Varning kroppstemp fel"); }
        else {
            System.out.println("normal"); }


    }
}

        */

        //25.Skapa ett program där ett tal sparas och det skrivs ut om talet är positivt eller
        //negativt.

       /* int tal = 5;

            if(tal <0) {
                System.out.println("Ditt tal " + tal + " är negatiivt");}
        else {
                System.out.println("Ditt tal " + tal + " är positivt");
            }


    }
}

        */

        //26.Skapa ett program som sparar två tal och skriver ut det största talet följt av orden “är
        //störst “. Om talen är lika ska “Talen är lika“ skrivas ut
/*
        int tal1 = 15;
        int tal2 = 10;

        if (tal1 > 10)
            System.out.println(tal1 + " är större än " + tal2);
        else {
            System.out.println(tal2 + " är större än " + tal1);}
        }
    }

 */


//27.Skapa ett program som sparar tre tal och avgör vilket tal som är minst. Resultatet ska
//skrivas ut.

     /*   int tal1 = 20;
        int tal2 = 50;
        int tal3 = 30;

        if (tal1 <= tal2 && tal1 <= tal3) {
            System.out.println(tal1 + " Är mindre än " + tal2 + " och " + tal3);
        } else if (tal2 <= tal1 && tal2 <= tal3) {
            System.out.println(tal2 + " Är mindre än " + tal1 + " och " + tal3);
        } else {
            System.out.println(+ tal3 + " är minst");

        }

        /*int num1 = 20;
        int num4 = 17;
        int num2 = 15;
        int num5 = 22;
        int num3 = 19;

        List<Integer> numList = new ArrayList();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        numList.add(num4);
        numList.add(num5);

        int minst = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            if (numList.get(i) < minst) {
                minst = numList.get(i);
            }
        }

        System.out.println("minsta talet är: " + minst);

*/
        /*  //28.Skapa ett program som sparar en temperatur. Om temperaturen är mellan 18 och 25
        //grader ska meddelandet “Lagom temp“ skrivas ut. Om det är varmare än 25 grader ska
        //“För varmt“ skrivas ut och om det är kallare än 18grader ska “För kallt“ skrivas ut.

        int celcius1 = 17;


        if(celcius1 <=25 && celcius1 >= 18) {
            System.out.println("Lagom temp");
        } else if(celcius1 > 25) {
            System.out.println("För varmt");
        } else {
            System.out.println("För kallt");

        }


    }
}
         */
//30. Spara ett tal. Skriv ut om talet är mindre än 10, mindre än 100 eller större än 100.

     /*   int tal1 = 11;

        if (tal1 > 100) {
            System.out.println(tal1 + " Är större än 100");

        } else if(tal1 < 10) {
            System.out.println(tal1 + " Är mindre än 10");

        } else {
            System.out.println("talet är mindre än eller lika med 100, men 10 eller större");
        }

    }
}

      */
//31. Skapa ett program där talen 1 till 10 skrivs ut.
/*
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }


    }
}

 */

     /*  // 32.Skapa ett program där talen 2, 4, 6, …, 100 skrivs ut.

        for(int i = 2; i <= 100; i += 2)
        System.out.println(i);


    }
}

      */
//33.Skriv ut talen 100 till 0, dvs 100, 99, 98, …, 0

    /*    for(int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

    }
}

     */
// 34.Skapa ett program som skriver ut ett tal i taget med start ifrån 0. När summan av alla
//tidigare tal är mer än 50 ska programmet avsluta.

     /*   int summa = 0;

        int nuvarandeTal = 0;

        while (summa <= 50) {

            summa = summa + nuvarandeTal;

            nuvarandeTal++;

            System.out.println("Slutsumma: " + summa);

        }


    }
}

      */

       /* //35.Skapa ett program som beräknar och skriver ut kvadraterna för talen 1 till 9. Dvs 1
        //multiplicerat med 1, 2 multiplicerat med 2 osv.

        for (int i = 1; i <= 9; i++) {

            int kvadrat = i * 1;

            System.out.println(i + "*" + i + " = " + kvadrat);


        }




    }

}    */

        //36.Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av
        //de följande 10 åren om man sätter in 1000 kr. Räntan ska sparas och är densamma för
        //alla åren.

      /*  double saldo = 1000.0;
        double ranta = 0.025;
        int antalAr = 10;

        for(int ar = 1; ar <= antalAr; ar++) {

            double rantaForAret = saldo * ranta;

            saldo = saldo + rantaForAret;

            System.out.println("År " + ar + ": " + saldo + " kr");

        }


    }
}
       */
        //37.Skapa ett program som skriver ut talen 1, 2, 3 osv. ett i taget. Varje gång ett tal skrivs
        //ut skall programmet kontrollera om alla tidigare tal multiplicerat med varandra överstiger
        //10 000. I så fall skall programet avslutas.

       /* long produkt = 1;
        int nuvarandeTal = 1;

        final long grans = 10000;

        while (produkt <= grans) {

            produkt = produkt * nuvarandeTal;

            nuvarandeTal++;
            System.out.println("  Aktuell produkt: " + produkt + "\n");

        }
        /*System.out.println("----------------------------------------");
        System.out.println("PROGRAMMET AVSLUTAS.");
        System.out.println("Den slutliga produkten är: " + produkt + ", vilket överstiger " + grans + ".");
        System.out.println("Det sista talet som multiplicerades var: " + (nuvarandeTal - 1));
    }


}
         */

//40.Beräkna och skriv ut summan av de jämna heltalen från 2 till 30.

     /*   int summa = 0;

        for(int i = 2; i <= 30; i += 2) {

            summa += i;

            System.out.println("Den totala summan av de jämna talen är: " + summa);
        }




    }
}      */

        //41.Skapa ett program där det undersöks hur många termer som behövs för att summan
        //ska bli större än 100 000. Termen ska läsas in.
        //Ex: Om indata är 7 ska beräkningen vara 7 + 7 + 7 + …7 = 100 000.
        //Utdata = 14286

/*Scanner scan = new Scanner (System.in);

        System.out.println("Ange ett tal ");

        int term = scan.nextInt();

        scan.close();

        long summa = 0;
        int antalTermer = 0;

        while (summa <= 100000) {
            summa += term;

            antalTermer++;
        }
        System.out.println("Beräkning med termen: " + term);
        System.out.println("Antal termer som behövdes för att summan skulle ");
        System.out.println("bli större än 100 000: " + antalTermer);
        System.out.println("Den slutliga summan blev: " + summa);

    }
}

 */
        //43.Beräkna och skriv ut produkten av de ojämna heltalen från 1 till 15. (D v s
        //1*3*5*…*15)

      /*  long produkt = 1;

        for(int i = 1; i <= 15; i += 2) {

            produkt = produkt * i;
            System.out.println("Produkten av de udda heltalen från 1 till 15 (1*3*5*...*15) är:");
            System.out.println(produkt);
        }



    }
} */

//46.Skapa ett program som läser in och adderar tjugo heltal. Summan ska skrivas ut


        // 3. STARTA LOOP
        // Loopen körs exakt 20 gånger (för varje heltal)
       /* for (int i = 1; i <= ANTAL_TAL; i++) {

            // SKICKAR FRÅGAN: Använder print för att markören ska stanna på samma rad
            System.out.print("Ange heltal " + i + ": ");

            // LÄSER IN TALET: Programmet pausas här tills du skriver ett tal och trycker Enter.
            int inmatatTal = scanner.nextInt();

            // ACKUMULERA: Lägg till det inlästa talet till den totala summan
            totalSumma += inmatatTal;
        }

        // 4. AVSLUTA OCH SKRIV UT RESULTAT

        // Stänger Scanner-objektet (god programmeringssed)
        scanner.close();

        // Skriv ut den slutgiltiga summan efter att alla 20 tal har matats in
        System.out.println("\n-------------------------------------");
        System.out.println("Klar! Den totala summan av de " + ANTAL_TAL + " heltalen är: " + totalSumma);
        System.out.println("-------------------------------------");
    }
}
        */

//47.Skapa ett program som låter användaren bestämma hur många tal han vill summera.
//Läs in detta antal tal och summera dem Skriv ut summan.

       /* Scanner scanner = new Scanner(System.in);

        int totalSumma = 0;

        System.out.println("Hur många tal vill du summera? ");

        int antalTal = scanner.nextInt();

        for(int i = 1; 1 <= antalTal; i++) {

            System.out.println("Ange heltal " + i);

            int inmatatTal = scanner.nextInt();

            totalSumma += inmatatTal;

            System.out.println("totalt " + antalTal + "talen är: " + totalSumma);
        }
    }
}

        */
        //48.Skapa ett program som läser in 20 tal och räknar och skriver ut hur många gånger
        //talet 7 har lästs in.

        /*Scanner scanner = new Scanner(System.in);
        int antalSjuor = 0;

        int antalInlasningar = 5;

        int talAttRakna = 7;

        for (int i = 1; i <= antalInlasningar; i++) {

            System.out.println("Ange helta l# " + i);
            int inmatatTal = scanner.nextInt();

            if (inmatatTal == talAttRakna) {
                antalSjuor++;

            }



        }

        System.out.println("Antal 7or lästes in: " + antalSjuor + "gånger! " );
    }

}
         */



    }

}