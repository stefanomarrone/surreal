package org.surreal.engine.query;

import java.util.Vector;

public class QueryInstantiationDocument {

	protected Vector<QueryInstantiation> set;
	
	public QueryInstantiationDocument() {
		this.set = new Vector<QueryInstantiation>();
	}
	
	public int size() {
		return this.set.size();
	}
	
	public void add(QueryInstantiation qi) {
		this.set.add(qi);
	}
	
	public QueryInstantiation get(int i) {
		return this.set.elementAt(i);
	}
	
	public String report() {
		String retval = "";
		for (QueryInstantiation qb: this.set) {
			retval += qb.report();
		}
		return retval;
	}

	public boolean isEmpty() {
		return this.set.size() == 0;
	}
}