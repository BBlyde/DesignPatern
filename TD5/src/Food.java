public class Food extends Product{
    
    public static final Food Patisserie = new Food("Patisserie", 2.25);
    public static final Food Vienoiserie = new Food("Vienoiserie", 1.50);
    public static final Food Muffin = new Food("Muffin", 2.25);
    public static final Food Cookie = new Food("Cookie", 1.95);
    public static final Food Donut = new Food("Donut", 2.00);
    public static final Food Sandwich = new Food("Sandwich", 5.45);
    
    public Food(String name, double price){
        super(name, price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
