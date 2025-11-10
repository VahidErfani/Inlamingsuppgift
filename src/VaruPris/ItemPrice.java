package VaruPris;

public class ItemPrice {

    //Klassdesign: Skapa en klass kallad ItemPrice.
    //
    //Privat Fält: Klassen måste innehålla ett privat
    // fält (private double price;) för att inkapsla datat.
    //Konstruktor: Skapa en konstruktor som tar
    // ett initialt pris. Konstruktorn ska använda Settern för att
    // sätta detta initiala pris,
    // vilket garanterar att även startvärdet valideras.
    //
    //Getter (getPrice): Implementera en publik metod
    // (public double getPrice()) som låter externa klasser
    // läsa det privata priset. Metoden ska använda
    // nyckelordet return.
    //
    //Setter (setPrice): Implementera en publik
    // metod (public void setPrice(double newPrice)) som låter
    // externa klasser ändra det privata priset.
    // Settern måste inkludera följande valideringsregel:
    //
    //Priset får aldrig sättas till ett negativt värde.
    // Om ett negativt pris skickas in, ska priset
    // behålla sitt nuvarande värde, och ett felmeddelande ska skrivas ut.

    private double price;


    public ItemPrice(double forvantatPrice) {
        setPrice(forvantatPrice);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice >= 0) {

            this.price = newPrice;
            System.out.println("priset uppdateras till " + newPrice + " kr ");

        } else {
            System.out.println("Fel, priset kan inte va negativt." + newPrice);
        }



            }

        }
