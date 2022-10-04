public class Drink extends Product{

    private DrinkType name;
    private double price;

    public enum DrinkType{
        Expresso, Chocolat, Café, Décaféiné, Thé
    }

    @Override
    public double getPrice() {
    
    }
    
}
