package VaruPris;

public class Main {

    static void main(String[] args) {

        ItemPrice penna = new ItemPrice(19.90);

        double currentPrice = penna.getPrice();
        System.out.println("startpris " + currentPrice + "kr");

        penna.setPrice(25.50);

        penna.setPrice(-5.00);

        System.out.println("slutgiltiga priset " + penna.getPrice() + " kr ");

    }
}
