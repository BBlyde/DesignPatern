import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Commande extends Product{

    private List<Product> productList;

    public Commande(){
        super("Commande", 0);
        productList = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void addProduct(Product p){
        productList.add(p);
        this.price = this.price + p.getPrice();
    }

    public void removeProduct(Product p){
        if (productList.contains(p)) {
            productList.remove(p);
            this.price = this.price - p.getPrice();
        }
    }

    @Override
    public String toString(){
        return "Total price : " + this.price;
    }
    
}
