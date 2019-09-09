package org.surreal.engine.results;

import java.util.ArrayList;
import java.util.Vector;

import org.surreal.engine.query.QueryBinding;

public class SMListResult extends Result {
	
	protected ArrayList<String> serviceModes;
	
	public SMListResult(QueryBinding qb) {
		super(qb);
		this.serviceModes = new ArrayList<String>();
	}
	
	public void addSM(String SMName) {
		this.serviceModes.add(SMName);
	}
	
	public String innerReport() {
		return this.serviceModes.toString();		
	}

	public void addSM(Vector<String> array) {
		for (String s: array) {
			this.addSM(s);
		}
	}
}