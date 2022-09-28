package command;

public class RemplirCommande implements Commande{
    private Can can;
    private int ancienVolume;

    public RemplirCommande(Can can){
        this.can = can;
        ancienVolume = -1;
    }

    @Override
    public void executer(){
        ancienVolume = can.getVolume();
        can.fill();
    }

    @Override
    public void annuler(){
        can.setVolume(ancienVolume);
    }
}
