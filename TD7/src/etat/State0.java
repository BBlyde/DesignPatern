package etat;

public class State0 implements DigicodeState {
    @Override
    public void appuyer(Digicode d, String key){
        if (key.equals("a")) {
            d.setState(new State1());
        } else {
            d.setState(new StateShit());
        }
    }
}
