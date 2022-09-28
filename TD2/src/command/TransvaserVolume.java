package command;

public class TransvaserVolume implements Commande{
    private Can can1;
    private Can can2;
    private int ancienVolume1;
    private int ancienVolume2;

    public TransvaserVolume(Can can1, Can can2){
        this.can1 = can1;
        this.can2 = can2;
        ancienVolume1 = -1;
        ancienVolume2 = -1;
    }

    public void executer(){
        ancienVolume1 = can1.getVolume();
        ancienVolume2 = can2.getVolume();
        can1.decant(can2);
    }

    public void annuler(){
        can1.setVolume(ancienVolume1);
        can2.setVolume(ancienVolume2);
    }
}
