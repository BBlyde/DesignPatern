package strategy;

import shifumi.Attack;

public class SameAttackStrategy implements Strategy {

	private Attack attack;

	public SameAttackStrategy(Attack attack) {
		this.attack = attack;
	}

	@Override
	public Attack getAttack() {
		return this.attack;
	}

}
