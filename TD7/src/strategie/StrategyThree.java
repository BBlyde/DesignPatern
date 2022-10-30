package strategie;

public class StrategyThree implements Strategy{
    private Attack spam;

    public StrategyThree(Attack a){
        spam = a;
    }

    @Override
    public Attack getMove() {
        return spam;
    }
    
}
