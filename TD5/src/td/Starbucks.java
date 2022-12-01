package td;
public class Starbucks {
    public static void main (String[] args){
        Commande c = new Commande();

        c.addProduct(Drink.Expresso);
        c.addProduct(Food.Donut);
        
        Menu m = new Menu(Drink.Expresso, Food.Donut);
        c.addProduct(m);
        
        System.out.println(c);

    }
}
