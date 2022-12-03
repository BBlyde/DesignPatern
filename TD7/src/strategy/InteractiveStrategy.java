package strategy;

import java.util.Scanner;

import shifumi.Attack;

public class InteractiveStrategy implements Strategy {

	private static Scanner sc = new Scanner(System.in);

	@Override
	public Attack getAttack() {
		int choice;
		do {
			System.out.println("Que voulez-vous faire ?");
			for (int i = 0; i < Attack.values().length; i++)
				System.out.println((i+1) + ". " + Attack.values()[i]);
			choice = sc.nextInt();
		} while (choice < 1 || choice > Attack.values().length);
		return Attack.values()[choice - 1];
	}

}
