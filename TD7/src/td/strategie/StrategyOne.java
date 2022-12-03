package td.strategie;

public class StrategyOne implements Strategy {

    @Override
    public Attack getMove() {
        return Attack.values()[(int)(Math.random()*3)];
    }
    
}
