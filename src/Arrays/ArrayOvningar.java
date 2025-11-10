package Arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayOvningar {
    static void main(String[] args) {

/*
        int[] talArray = new int[50];

        Random slumpgenerator = new Random();

        for (int i = 0; i < talArray.length; i++) {

            talArray[i] = slumpgenerator.nextInt(100) + 1;

            if (i < 5) {
                System.out.println("Plats " + i + "innehåller: " + talArray[i]);

            }
        }
        for (int i = 0; i < talArray.length; i++) {

            talArray[i] = talArray[i] * 2;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Plats (Index) " + i + " är nu: " + talArray[i]);}

    }

} */


       /* Scanner scanner = new Scanner(System.in);

        String [] names = new String [5];

        for(int i=0; i< names.length;i++) {
            names[i] = scanner.nextLine();
        }
            System.out.println(names[0]);
            System.out.println(names[4]);

        }


    }

        */

//4
        /*int[] talArray = new int[50];

        Random slumpgenerator = new Random();

        for (int i = 0; i < talArray.length; i++) {
            talArray[i] = slumpgenerator.nextInt(100) + 1;

        }

    for (int i = 0; i < talArray.length; i += 2) {
        talArray[i] = talArray [i] + 2;

        System.out.println("Index " + i + " är nu: " + talArray[i]);}


    }
}   */


        //5
/*
        int[] minaTal = new int[50];
        Random slumpGenerator = new Random();

        for (int i = 0; i < minaTal.length; i++) {
            minaTal[i] = slumpGenerator.nextInt(100) + 1;
        }
        int antalPositiva = 0;

        for (int i = 0; i < minaTal.length; i++) {

            int talet = minaTal[i];

            if (talet > 0) {

                antalPositiva++;
            }


        }

        System.out.println("Totala antalet tal " + minaTal.length);
        System.out.println("Antal positiva tal " + antalPositiva);

    }
}*/


        //12.

       /* int antalTal = 10;
        int[] minaTal = new int[antalTal];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < minaTal.length; i++) {
            System.out.println("Ange tal nr: " + (i + 1) + ": ");

            minaTal[i] = scanner.nextInt();

            System.out.println("Skriv in 10st heltal!");
        }

        for (int i = minaTal.length - 1; i >= 0; i--) {

            System.out.println("Tal på plats " + i + ": " + minaTal[i]);
        }



        */






    }
}





