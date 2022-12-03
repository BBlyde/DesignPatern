package state;

public class State2 extends State {

	public State handle(char k) {
		if (k == 'c') {
			System.out.println("Porte ouverte !");
			return new State3();
		} else {
			return super.handle(k);
		}
	}

}
