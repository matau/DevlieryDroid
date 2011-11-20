package com.packtpub.deliverydroid;

public class PizzaTopping {
	static final int STATE_OFF = 0;
	static final int STATE_ON = 1;
	static final int STATE_EXTRA = 2;
	
	final String name;
	int state = STATE_OFF;
	
	public PizzaTopping(final String name) {
		this.name = name;
	}
	
	void nextState() {
		state++;
		if (state > STATE_EXTRA) {
			state = STATE_OFF;
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}