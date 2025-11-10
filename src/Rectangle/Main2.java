package Rectangle;

public class Main2 {

    static void main(String[] args) {

        Rectangle2 minRektangel = new Rectangle2(1,2);


        int area = minRektangel.calculateArea();

        int omkrets = minRektangel.calculatePerimeter();

        boolean isSquare = minRektangel.isSquare();

        System.out.println("area: " + area);
        System.out.println("omkrets: " + omkrets);
        System.out.println();


    }
}
