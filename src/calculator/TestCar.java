package calculator;

public class TestCar {

    static void main(String[] args) {
        Car car1 = new Car(); // objekt = instans av klassen Car. Car = klass car1 = objekt
        Car car2 = new Car("gasoline", 600, "red", 7000000.00);

        double car1TopSpeed = car1.getTopSpeed();
        double car2TopSpeed = car2.getTopSpeed();

        System.out.println(car1TopSpeed);
        System.out.println(car2TopSpeed);

        car1.setHp(300);
        System.out.println(car1.getTopSpeed());

        car2.setHp(700);
        System.out.println(car2.getTopSpeed());
    }
}