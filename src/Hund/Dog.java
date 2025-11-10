package Hund;

public class Dog { //Ritning/Objekt, verkliga saker

    private String name; //Lagringsplats
    private String breed;

    public Dog(String name, String breed){ //Konstruktor
        this.name = name;     //Tar in info från "new" och
        this.breed = breed;   //skickar till attribut där det lagras


    }

    public void bark() {   //Metod "bark"=vårat namn på metod som säger
                       //Rambo + säger Voff! - anropas med New, Dog.bark
                      //som skriver ut metoden
        System.out.println(name + " säger Voff!");

    }

    public void breed() {
        System.out.println(breed + " är min rastyp!");

    }

}
