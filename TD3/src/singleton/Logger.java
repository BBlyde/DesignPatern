package singleton;

public class Logger {
    //Question 1

    /*private int nbLoggedMessages;
    private static Logger uniqueInstance = null;

    public static Logger instance(){
        if(uniqueInstance == null){
            uniqueInstance = new Logger();
        }
        return uniqueInstance;
    }

    private Logger(){
        this.nbLoggedMessages = 0;
    }

    public void log(String msg){
        this.nbLoggedMessages++;
        System.out.println("Log" + this.nbLoggedMessages + ": " + msg);
    }*/

    //Question 2
    /*private int nbLoggedMessages;
    private static Logger uniqueInstance = new Logger();

    public static Logger instance(){
        return uniqueInstance;
    }

    private Logger(){
        this.nbLoggedMessages = 0;
    }

    public void log(String msg){
        this.nbLoggedMessages++;
        System.out.println("Log" + this.nbLoggedMessages + ": " + msg);
    }*/

    //Question 3 : transformer logger en tableau/map/liste..
    private int nbLoggedMessages;
    private static Logger uniqueInstance = new Logger();

    public static Logger instance(){
        return uniqueInstance;
    }

    private Logger(){
        this.nbLoggedMessages = 0;
    }

    public void log(String msg){
        this.nbLoggedMessages++;
        System.out.println("Log" + this.nbLoggedMessages + ": " + msg);
    }
}