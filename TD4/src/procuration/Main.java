package procuration;

public class Main {
    public static void main (String[] args){
        Service s1 = new Service();
        ProxyService ps1 = new ProxyService(10, s1);
        ps1.service1();
        ps1.service2();
        System.out.println("Total price is " +  ps1.getTotalPrice() + "$");
    }
}
