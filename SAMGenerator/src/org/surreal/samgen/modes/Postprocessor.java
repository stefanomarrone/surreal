package org.surreal.samgen.modes;

import java.util.Vector;

public abstract class Postprocessor {

	private Behaviour evolution;
	
	protected String gotcha;
	
	protected Vector<String> ignorable;

	protected void reset(ServiceModes sms) {
		Vector<String> smNames = sms.getNames();
		this.ignorable = new Vector<String>();
		this.evolution = new Behaviour(smNames);
	}

	public void buildEvolution(String results) {
		Vector<String> payloads = this.split(results);
		for (String str: payloads) {
			this.evolution.fill(str);
		}
	}

	public Behaviour getEvolution() {
		return this.evolution;
	}
	
	protected Vector<String> split(String results) {
		Vector<String> retval = new Vector<String>();
		String[] lines = results.split(System.getProperty("line.separator"));
		boolean first = true;
		String temp = "";
		for (int i=0; i<lines.length; i++) {
			String line = lines[i];
			if (line.startsWith(this.gotcha)) {
				if (first == true) {
					first = false;
				} else {
					retval.add(temp);
				}
				temp = line + "\n";
			} else if (first == false) {
				if (!this.isIgnorable(line)) {
					temp += line + "\n";				
				}
			}
		}
		return retval;
	}
	
	private boolean isIgnorable(String arg) {
		String trimmed = arg.trim();
		boolean retval = false;
		int i = 0;
		while ((retval == false) && (i<this.ignorable.size())) {
			retval = trimmed.startsWith(this.ignorable.elementAt(i));
			i++;
		}
		return retval;
	}
}