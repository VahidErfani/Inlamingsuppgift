package PersonAge;

public class PersonAge {

    private int age;

    public PersonAge(int newAge) {
        setAge(newAge);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Fel");
        }
        else if (newAge < 150) {
            this.age = newAge;
            System.out.println("Ålder: " + newAge);

    }
}
}
