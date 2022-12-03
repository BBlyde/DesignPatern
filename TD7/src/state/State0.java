package state;

public class State0 extends State {
	
	public State handle(char k) {
		if (k == 'a') {
			return new State1();
		} else {
			return super.handle(k);
		}
	}
	
}
