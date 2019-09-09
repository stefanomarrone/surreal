package org.surreal.samgen.results;

public abstract class Event {
	
	protected String attribute;
	
	protected String value;
	
	public Event(String a, String v) {
		this.attribute = a;
		this.value = v;
	}
	
	protected String inner(String tag) {
		return tag + attribute + "->" + this.value;
	}

	public abstract String toString();
	
	public abstract boolean isProtectionActivation();
}