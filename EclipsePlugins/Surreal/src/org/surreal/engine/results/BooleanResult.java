package org.surreal.engine.results;

import org.surreal.engine.query.QueryBinding;

public class BooleanResult extends Result {
	
	protected boolean value;
	
	public BooleanResult(QueryBinding qb) {
		super(qb);
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public String innerReport() {
		return (value) ? "true" : "false";		
	}
}
