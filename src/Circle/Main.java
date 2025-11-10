package Circle;

public class Main {

    static void main(String[] args) {


        Circle minCirkel = new Circle(5.5);

        Circle minCirkel2 = new Circle(10.0);


        double area = minCirkel.calculateArea();
        double omkrets = minCirkel.calculateCircumference();

        System.out.println("area är: " + area);
        System.out.println("omkrets är " + omkrets);


        boolean resultat = minCirkel2.isBiggerThan(minCirkel);

        System.out.println(resultat);


    }
}