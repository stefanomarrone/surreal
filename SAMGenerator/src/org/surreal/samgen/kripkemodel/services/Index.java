package org.surreal.samgen.kripkemodel.services;

public abstract class Index {

	protected String name;
	
	public Index(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected abstract String valuesToKripke();
	
	protected abstract String getInitValue();
	
	public String toKripke() {
		String retval = this.getName();
		retval += ": " + this.valuesToKripke();
		return retval;
	}
}