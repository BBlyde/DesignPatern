package state;

public class State1 extends State {

	public State handle(char k) {
		if (k == 'b') {
			return new State2();
		} else {
			return super.handle(k);
		}
	}

}
