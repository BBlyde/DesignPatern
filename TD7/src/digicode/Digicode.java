package digicode;

import java.util.Scanner;

import state.State;
import state.State0;

public class Digicode {

	private State currentState;

	private static Scanner sc;

	public Digicode() {
		currentState = new State0();
	}
	
	public void push(char entry) {
		currentState = currentState.handle(entry);
	}

	public static void main(String[] args) {
		Digicode d = new Digicode();
		sc = new Scanner(System.in);
		while (true) {
			String s = sc.next();
			if (s.length() == 1
					&& (s.charAt(0) == 'a' || s.charAt(0) == 'b'
							|| s.charAt(0) == 'c' || s.charAt(0) == 'd'))
				d.push(s.charAt(0));
			else
				break;
		}
	}
}
