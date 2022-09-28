package Command;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		Can three = new Can(3);
		Can five = new Can(5);
		Invoker invoker = new Invoker();
		while (input != "q") {
			
				switch (input) {
					case "1":
						invoker.add(new RemplirCommande(three));
						break;
					case "2":
						invoker.add(new ViderCommande(three));
						break;
					case "3":
						invoker.add(new RemplirCommande(five));
						break;
					case "4":
						invoker.add(new ViderCommande(five));
						break;
					case "5":
						invoker.add(new TransvaserVolume(three, five));
						break;
					case "6":
						invoker.add(new TransvaserVolume(five, three));
						break;
					case "u":
						invoker.cancel();
					default:
						break;
				}
			
			System.out.println("1 - Fill 3L can");
			System.out.println("2 - Empty 3L can");
			System.out.println("3 - Fill 5L can");
			System.out.println("4 - Empty 5L can");
			System.out.println("5 - Decant 3L can into 5L can");
			System.out.println("6 - Decant 5L can into 3L can");
			System.out.println("u - Undo");
			System.out.println("q - Quit");
			System.out.println("------------------");
			System.out.println("3L can: " + three);
			System.out.println("5L can: " + five);
			input = sc.nextLine();
		}
	}
}
