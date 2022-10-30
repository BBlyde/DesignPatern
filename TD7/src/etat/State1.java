package etat;

public class State1 implements DigicodeState {
    @Override
    public void appuyer(Digicode d, String key){
        if (key.equals("b")) {
            d.setState(new State2());
        } else {
            d.setState(new StateShit());
        }
    }
}
