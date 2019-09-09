package org.surreal.samgen.modes;

import java.util.Vector;

import org.surreal.samgen.results.Step;

public class BMCTransition extends Transition {
	
	protected int size; 
	
	public BMCTransition(int len) {
		this.steps = new Vector<Step>();
		this.size = len;
	}

	public BMCTransition(Vector<Step> v, int len) {
		this.steps = v;
		this.size = len;
	}
	
	public int getLen() {
		return this.size;
	}
}
