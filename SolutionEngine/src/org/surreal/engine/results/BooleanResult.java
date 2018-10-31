package org.surreal.engine.results;

public class BooleanResult extends Result {
	
	protected boolean value;
	
	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public String innerReport() {
		return (value) ? "true" : "false";		
	}
}
