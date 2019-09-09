package org.surreal.samgen.results;

import java.util.Vector;

public class Step {
	
	private Vector<Event> events;
	
	public Step() {
		this.events = new Vector<Event>();
	}
	
	public void addEvent(Event e) {
		this.events.add(e);
	}
	
	public Event getEvent(int i) {
		return this.events.get(i);
	}

	public void deleteEvent(Event e) {
		String digestE = e.toString();
		int counter = 0;
		boolean found = false;
		while ((found == false) && (counter < this.events.size())) {
			if (this.events.elementAt(counter).toString().equals(digestE)) {
				found = true;
				this.events.remove(counter);
			}
			counter++;
		}
	}
	
	public void cleanState() {
		int max = this.events.size();
		for (int i=0; i<max; i++) {
			Event e = this.events.get(i);
			if (e instanceof ModeEvent) {
				this.events.remove(e);
				i--;
				max = this.events.size();
			}
		}
	}
	
	public boolean activateMode(String mode) {
		return this.containsModeValue(mode,"TRUE");
	}
	
	public boolean deactivateMode(String mode) {
		return this.containsModeValue(mode,"FALSE");
	}

	public boolean containsModeValue(String mode, String value) {
		boolean retval = false;
		int counter = 0;
		while ((counter<this.events.size()) && (retval == false)) {
			Event temp = this.events.elementAt(counter);
			retval = temp.attribute.equals(mode) && temp.value.equals(value); 
			counter++;
		}
		return retval;
	}

	public boolean containsMode(String mode) {
		boolean retval = false;
		int counter = 0;
		while ((counter<this.events.size()) && (retval == false)) {
			Event temp = this.events.elementAt(counter);
			retval = temp.attribute.equals(mode); 
			counter++;
		}
		return retval;
	}

	public String toString() {
		return this.convert(",");
	}

	public String debug() {
		return this.convert("\n");
	}

	public String convert(String delim) {
		String retval = "";
		int counter = 0;
		int max = this.events.size();
		for (counter = 0; counter < max; counter++) {
			retval += this.events.elementAt(counter).toString() + delim;
		}		
		return retval.substring(0,retval.length()-1);
	}

	public Vector<String> toTag(int i) {
		Vector<String> retval = new Vector<String>();
		for (Event e: this.events) {
			retval.add("@" + i + ":" + e.toString());
		}
		return retval;
	}

	public Step intoProtection() {
		Step retval = new Step();
		for (int i = 0; i < this.events.size(); i++) {
			Event e = this.events.get(i);
			if (e.isProtectionActivation()) {
				retval.addEvent(e);
			}
		}
		return (retval.getEventNumbers() == 0) ? null : retval;
	}

	private int getEventNumbers() {
		return this.events.size();
	}

}
