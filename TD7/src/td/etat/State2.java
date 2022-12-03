package td.etat;

public class State2 implements DigicodeState{
    @Override
    public void appuyer(Digicode d, String key){
        if (key.equals("c")) {
            d.setState(new State3());
        } else {
            d.setState(new StateShit());
        }
    }
}
