package td.strategie;

import java.util.Scanner;

public class StrategyTwo implements Strategy{
    private final Scanner sc = new Scanner(System.in);
    
    @Override
    public Attack getMove() {
		Attack a = null;
		System.out.println("What's your choice?");
		while (a == null) {
			try {
				a = Attack.valueOf(sc.next().toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("What's your choice?");
			}
		}
		return a;
	}
    
}
