package org.surreal.samgen.modes;

import java.util.Vector;

import org.surreal.samgen.results.Step;

public class Transition {
	
	protected Vector<Step> steps;
	
	public Transition() {
		this.steps = new Vector<Step>();
	}
	
	public Transition(int len) {
		this.steps = new Vector<Step>();
	}

	public Transition(Vector<Step> v) {
		this.steps = v;
	}

	public Transition(Vector<Step> v, int len) {
		this.steps = v;
	}

	public void addStep(Step s) {
		this.steps.addElement(s);
	}
	
	public boolean isEmpty() {
		return this.steps.size() == 0;
	}
	
	public String toString() {
		String retval = null;
		try {
			retval = this.innerToString(";");
		} catch (ZeroLengthTransition e) {
		}
		return retval;
	}

	public Vector<Step> getSteps() {
		return this.steps;
	}
	
	public int getLen() {
		return this.steps.size(); 
	}
	
	public Vector<String> getStepList() {
		Vector<String> retval = new Vector<String>();
		for (int i=0; i<this.steps.size(); i++) {
			retval.addAll(this.steps.get(i).toTag(i));
		}
		return retval;
	}
	
	public Transition getProtectionTransition() {
		Transition retval = new Transition();
		for (int i = 0; i < this.steps.size(); i++) {
			Step s = this.steps.get(i);
			Step protection = s.intoProtection();
			if (protection != null) {
				retval.addStep(protection);
			}
		}
		return retval;
	}

	public String cleanString() {
		String retval = "";
		try {
			retval = this.innerToString("\n");
		} catch (ZeroLengthTransition e) {
			retval = "Void path\n";
		}
		return retval;
	}

	private String innerToString(String delim) throws ZeroLengthTransition {
		String retval = "";
		if (this.steps.size() > 0) {
			for (int counter=0; counter<this.steps.size(); counter++) {
				Step step = this.steps.get(counter);
				retval += "@" + counter + ":" + step.toString() + delim;
			}
			retval = retval.substring(0,retval.length()-1);
		} else {
			throw new ZeroLengthTransition();
		}
		return retval;
	}
}
