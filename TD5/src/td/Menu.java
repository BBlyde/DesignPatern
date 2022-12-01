package td;
public class Menu extends Product{

    public Menu(Drink d, Food f){
        super("Maxi Best Of" + f + d, (f.getPrice() + d.getPrice()) * 0.9);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
