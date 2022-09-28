package Command;
import java.util.Stack;

public class Invoker {
    private Stack<Commande> pileCommande;

    public Invoker(){
        pileCommande = new Stack<Commande>(); 
    }

    public void add(Commande c){
        pileCommande.push(c);
        c.executer();
    }

    public void cancel(){
        pileCommande.peek().annuler();
        pileCommande.pop();
    }
}
