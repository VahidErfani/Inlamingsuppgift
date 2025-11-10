package Frukt;
public class FruktSallad {

    static void main(String[] args) {

        Frukt apple = new Frukt ("Röd");

        Frukt banan = new Frukt ("Gul");

        Frukt apelsin = new Frukt("Orange");

        System.out.println("Här kommer färgerna");

        apple.skrivUtFarg();
        banan.skrivUtFarg();
        apelsin.skrivUtFarg();



    }
}