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
	
	public String toString() {
		String retval = "";
		for (int counter=0; counter<this.steps.size(); counter++) {
			Step step = this.steps.get(counter);
			retval += "@" + counter + ":" + step.toString() + ";";
		}
		retval = retval.substring(0,retval.length()-1);
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

}
