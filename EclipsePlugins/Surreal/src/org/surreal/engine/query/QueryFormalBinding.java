package org.surreal.engine.query;

public class QueryFormalBinding {
	private String name;
	
	private String stereotype;

	public QueryFormalBinding() {
	}

	public QueryFormalBinding(String name2, String type) {
		this.name = name2;
		this.stereotype = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStereotype() {
		return stereotype;
	}

	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}
}
