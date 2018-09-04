package states;

import java.awt.Graphics;

public abstract class State {
	
	
	private static State curentState = null;
	
	public static void setState(State state) {
		curentState = state;
	}
	
	public static State getState() {
		return curentState;
	}
	
	//class
	public abstract void update();
	public abstract void render(Graphics g);
	
}
