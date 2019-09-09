package org.surreal.samgen.kripkemodel.attacks;

public abstract class Affect {

	protected String indexName;
	
	protected Object refvalue;
	
	public Affect(String i, Object o) {
		this.indexName = i;
		this.refvalue = o;
	}
	
	public String getIndexName() {
		return this.indexName;
	}
	
	public Object getReferenceValue() {
		return this.refvalue;
	}
}