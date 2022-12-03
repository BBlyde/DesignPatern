package state;

public abstract class State {
	
	public State handle(char k) {
		return new StateNotOK();
	}
	
}
