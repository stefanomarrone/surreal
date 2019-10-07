package org.surreal.engine.results;

import org.surreal.engine.query.QueryInstantiation;
import org.surreal.samgen.modes.Transition;

public class ScenarioResult extends Result {
	
	protected Transition value;
	
	public ScenarioResult(QueryInstantiation qb) {
		super(qb);
		this.value = new Transition();
	}
	
	public void load(Transition t) {
		this.value = t;
	}

	public String innerReport() {
		return this.value.cleanString();		
	}
}
