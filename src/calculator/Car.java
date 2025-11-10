package calculator;

public class Car {
    String fuel;
    String color;
    int hp;
    double price;

    public Car() {}

    public Car(String fuel, int hp, String color, double price) {
        this.fuel = fuel;
        this.hp = hp;
        this.color = color;
        this.price = price;
    }

    public String getFuel() {
        return this.fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTopSpeed() {
        return this.hp * 2;
    }


}
