package Training;
import java.util.Random;
import java.util.Scanner;
public class Random1 {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Ange ett positivt heltal (N) för taket: ");

        if (scanner.hasNextInt()) {
            int maxTal = scanner.nextInt();

            if (maxTal >= 0) {
                int slumptal = random.nextInt(maxTal + 1);

                System.out.println("Slumptal mellan 0 och " + maxTal + " är " + slumptal);

            } else {
                System.out.println("Vänligen ange positivt tal eller 0, tack!");

            }
        } else {
            System.out.println("Ogiltig inmatning, ange heltal endast");
        }

    }



}
