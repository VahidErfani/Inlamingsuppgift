package Repetition;

public class RectangleMain2 {
    static void main(String[] args) {

        Rectangle2 minRektangel = new Rectangle2(5.0, 7.0);

        double area = minRektangel.calculateArea();
        double omkrets = minRektangel.calculatePerimeter();

        System.out.println("Bredd = " + minRektangel.getBredd());
        System.out.println("Höjd = " + minRektangel.getHojd());
        System.out.println("Area = " + minRektangel.calculateArea());
        System.out.println("Omkrets = " + minRektangel.calculatePerimeter());
        System.out.println("Kvadrat eller ej? " + minRektangel.isSquare());





    }
}


