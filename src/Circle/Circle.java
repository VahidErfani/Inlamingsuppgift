package Circle;

public class Circle {

    private double radie;

    public Circle(double radie) {

        this.radie = radie;
    }

    public double calculateArea() {
        return Math.PI * radie * radie;

    }
    public double calculateCircumference() {
        return 2 * Math.PI * radie;

    }

    public double getRadie() {
        return this.radie;

    }

    public boolean isBiggerThan(Circle otherCircle) {
        return this.calculateArea() > otherCircle.calculateArea();




    }
}
