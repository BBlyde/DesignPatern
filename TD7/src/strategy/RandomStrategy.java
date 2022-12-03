package strategy;

import java.util.Random;

import shifumi.Attack;

public class RandomStrategy implements Strategy {

	@Override
	public Attack getAttack() {
		return Attack.values()[new Random().nextInt(3)];
	}

}
