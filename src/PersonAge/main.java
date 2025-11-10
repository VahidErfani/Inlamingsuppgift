package PersonAge;

public class main {

    static void main(String[] args) {

        PersonAge vahid = new PersonAge(31);
        vahid.setAge(-5);
        vahid.setAge(155);
        vahid.setAge(32);

        int finalAge = vahid.getAge();

        System.out.println(finalAge);





    }
}
