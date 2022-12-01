package td.procuration;

public class ProxyService implements Provider{
    private int price;
    private int numberOfService;
    private Service realService;

    public ProxyService(int prix, Service rs){
        price = prix;
        numberOfService = 0;
        realService = rs;        
    }

    @Override
    public void service1(){
        realService.service1();
        numberOfService++;
    }

    @Override
    public void service2(){
        realService.service2();
        numberOfService++;
    }

    @Override
    public void service3(){
        realService.service3();
        numberOfService++;
    }

    @Override
    public void service4(){
        realService.service4();
        numberOfService++;
    }

    public int getTotalPrice(){
        return numberOfService * price;
    }
}
