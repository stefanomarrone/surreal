package org.surreal.samgen.kripkemodel;

public abstract class ModelItem {
	
	protected String name;
	
	public ModelItem(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
}