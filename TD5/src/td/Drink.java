package td;
public class Drink extends Product{

    public static final Drink Expresso = new Drink("Expresso", 2.75);
    public static final Drink Chocolat = new Drink("Chocolat", 3.55);
    public static final Drink Café = new Drink("Café", 1.75);
    public static final Drink Décaféiné = new Drink("Décaféiné", 2.5);
    public static final Drink Thé = new Drink("Thé", 3.15);

    public Drink(String name, double price){
        super(name, price);
    }

    @Override
    public double getPrice() {
        return(price);
    }
}
