package procuration;

public class Service implements Provider{

    @Override
    public void service1(){
        System.out.println("Servicio numero uno utilisado");
    }

    @Override
    public void service2(){
        System.out.println("Servicio numero deuxio utilisado");
    }

    @Override
    public void service3(){
        System.out.println("Servicio numero tresio utilisado");
    }

    @Override
    public void service4(){
        System.out.println("Servicio numero quatro utilisado");
    }
}
