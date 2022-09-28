package Command;

public class ViderCommande implements Commande{
    private Can can;
    private int ancienVolume;

    public ViderCommande(Can can, int ancienVolume){
        this.can = can;
        ancienVolume = -1;
    }

    @Override
    public void executer(){
        ancienVolume = can.getVolume();
        can.empty();
    }

    @Override
    public void annuler(){
        can.setVolume(ancienVolume);
    }
}
