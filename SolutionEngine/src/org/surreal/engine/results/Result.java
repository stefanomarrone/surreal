package org.surreal.engine.results;

import org.surreal.engine.query.QueryInstantiation;

public abstract class Result {
	
	protected QueryInstantiation qi;
	
	public void setQI(QueryInstantiation qqi) {
		this.qi = qqi;
	}
	
	public QueryInstantiation getQI() {
		return this.qi;
	}
	
	protected abstract String innerReport();

	public String report() {
		String retval = this.qi.report() + "\n";
		retval += "Result: " + this.innerReport();
		return retval;
	}
}
