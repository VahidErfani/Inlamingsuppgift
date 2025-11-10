package Frukt;

public class Frukt {

    //Skapa en class Fruit som beskriver olika frukter
    //
    //Attributet som definieras i konstruktorn heter color och är fruktens färg
    //
    //Skapa tre olika Fruit ifrån main-metod i en annan klass FruitSalad
    //
    //Utöka Fruit så att det kan skriva ut färgen på frukten
    //
    //Anropa denna metod för de tre frukterna i FruitSalad

    private String farg;

    public Frukt (String fargSomKommerIn) {
        this.farg = fargSomKommerIn;

    }

    public void skrivUtFarg() {

        System.out.println("Fruktens färg är: " + this.farg);


    }
}

