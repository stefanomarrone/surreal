package org.surreal.engine.query;

import java.util.Vector;

public class QueryInstantiation {

	protected Vector<QueryBinding> set;
	
	public QueryInstantiation() {
		this.set = new Vector<QueryBinding>();
	}
	
	public int size() {
		return this.set.size();
	}
	
	public void add(QueryBinding qi) {
		this.set.add(qi);
	}
	
	public QueryBinding get(int i) {
		return this.set.elementAt(i);
	}
	
	public String report() {
		String retval = "";
		for (QueryBinding qb: this.set) {
			retval += qb.report();
		}
		return retval;
	}

	public boolean isEmpty() {
		return this.set.size() == 0;
	}
}