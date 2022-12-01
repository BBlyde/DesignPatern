package td;
public abstract class Product {

    protected double price;
    private String name;

    protected Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract double getPrice();

    @Override
    public String toString(){
        return(name + " " + price);
    };
}
