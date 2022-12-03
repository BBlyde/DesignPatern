package td.strategie;

public class Game {
    public static void game(Player p1, Player p2, int turns){
        System.out.println("--- GAME START ---");
        for (int i = 1; i < turns; i++) {
            System.out.println("--- Turn n°" + i + "---");
            switch (p1.play().compare(p2.play())) {
                case 1:
                    System.out.println(p1.getName() + "wins the round");
                    p1.addPoint();
                    break;
                case -1:
                    System.out.println(p2.getName() + "wins the round");
                    p2.addPoint();
                    break;
                default:
                    System.out.println("Draw");
                    break;
            }
            System.out.println("Score : " +p1.getName() + " " + p1.getScore() + " - " + p2.getScore() + " " + p2.getName());
        }
        if (p1.getScore() == p2.getScore())
			System.out.println("The game ended in a draw!");
		else
			System.out.println((p1.getScore() > p2.getScore() ? p1 : p2).getName() + " wins the game!");
		System.out.println("--- GAME END ---");
    }

    public static void main (String args[]){
        Player p1 = new Player("Blyde", new StrategyTwo());
        Player p2 = new Player("Bot", new StrategyOne());
        Player p3 = new Player("Bot2", new StrategyThree(Attack.ROCK));
        //game(p1, p2, 5);
        game(p1,p3,3);
    }
}
