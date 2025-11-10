package Dogg;

public class Dog1 {

    private String name;
    private String breed;

    public Dog1(String name, String breed) {

        this.name = name;
        this.breed = breed;

    }

//Skriver över Rambo till Olle i private name
   public void setName(String name)  {
        this.name = name;



   }
//Läser det nya värdet Olle och skickar till main
    public String getName() {
        return name;

    }


    public void setBreed(String breed) {
        this.breed = breed;

    }

    public String getBreed() {
        return breed;

    }




}

