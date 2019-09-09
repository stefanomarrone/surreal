package org.surreal.engine.results;

import org.surreal.engine.query.QueryBinding;

public abstract class Result {
	
	protected QueryBinding qi;
	
	public Result(QueryBinding qb) {
		this.qi = qb;
	}
	
	public Result() {
	}

	public void setQI(QueryBinding qqi) {
		this.qi = qqi;
	}
	
	public QueryBinding getQI() {
		return this.qi;
	}
	
	protected abstract String innerReport();

	public String report() {
		String retval = this.qi.report() + ": ";
		retval += this.innerReport();
		return retval;
	}
}
