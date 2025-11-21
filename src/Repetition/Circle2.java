package Repetition;

public class Circle2 {

    private double radie;

    public Circle2(double radie) {
        this.radie = radie;

    }

    public double calculateArea() {
        double radieKvadrat = this.radie * this.radie;

        double area = Math.PI * radieKvadrat;

        return area;

    }

}
