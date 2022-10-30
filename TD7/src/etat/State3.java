package etat;

public class State3 implements DigicodeState{
    @Override
    public void appuyer(Digicode d, String key){
        if (key.equals("d")) {
            d.setState(new State4());
        } else {
            d.setState(new StateShit());
        }
    }
}
