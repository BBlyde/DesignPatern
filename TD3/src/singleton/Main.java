package singleton;

public class Main {
    public static void main(String[] args){
        Logger l1 = Logger.instance();
        Logger l2 = Logger.instance();
        l1.log("test");
        l2.log("test");
    }
}
