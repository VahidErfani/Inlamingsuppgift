package Dogg;

public class main2 {

    static void main(String[] args) {

        Dog1 minHund = new Dog1("Rambo", "Husky");

        System.out.println(minHund.getName());
        System.out.println(minHund.getBreed());


        minHund.setBreed("tax");
        System.out.println(minHund.getBreed());

        minHund.setName("olle");
        System.out.println(minHund.getName());

    }

}

