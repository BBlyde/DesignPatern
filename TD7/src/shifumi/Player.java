package shifumi;

import strategy.InteractiveStrategy;
import strategy.RandomStrategy;
import strategy.Strategy;

public class Player {

	private String name;

	private int score;

	private Strategy strategy;

	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
		this.score = 0;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	public void addPoints(int points) {
		this.score += points;
	}

	public Attack play() {
		return this.strategy.getAttack();
	}

	public String toString() {
		return this.getName() + " : " + this.getScore() + " point"
				+ (this.getScore() > 1 ? "s" : "");
	}

	private static void fight(Player p1, Player p2, int nbTurns) {
		for (int i = 0; i < nbTurns; i++) {
			Attack a1 = p1.play();
			System.out.println(p1.getName() + " fait " + a1);
			Attack a2 = p2.play();
			System.out.println(p2.getName() + " fait " + a2);
			if (a1.compare(a2) > 0) {
				p1.addPoints(1);
				// System.out.println(p1);
			} else if (a1.compareTo(a2) < 0) {
				p2.addPoints(1);
				// System.out.println(p2);
			}
		}
		System.out.println(">>> SCORES <<<");
		System.out.println(p1);
		System.out.println(p2);
	}

	public static void main(String[] args) {
		fight(new Player("Joueur 1", new InteractiveStrategy()), new Player(
				"Joueur 2", new RandomStrategy()), 10);
	}

}
