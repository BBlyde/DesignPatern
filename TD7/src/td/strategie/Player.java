package td.strategie;

public class Player {
    private String name;
    private int score;
    private Strategy strategy;

    public Player(String n, Strategy s){
        this.name = n;
        this.score = 0;
        strategy = s;
    }

    public void addPoint(){
        score++;
    }

    public Attack play(){
        return strategy.getMove();
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}
