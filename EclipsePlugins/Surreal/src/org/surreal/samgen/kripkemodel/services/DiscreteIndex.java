package org.surreal.samgen.kripkemodel.services;

import java.util.StringTokenizer;
import java.util.Vector;

public class DiscreteIndex extends Index {
	
	protected Vector<String> values;
	
	protected String initial;

	public DiscreteIndex(String n) {
		super(n);
	}
	
	public DiscreteIndex(String n, String vs, String i) {
		super(n);
		String temp = vs.substring(1,vs.length()-1);
		StringTokenizer st = new StringTokenizer(temp,",");
		this.values = new Vector<String>();
		while (st.hasMoreTokens()) {
			this.values.add(st.nextToken());
		}
		this.initial = i;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}
	
	public int valuesSize() {
		return this.values.size();
	}
	
	public String getValues(int i) {
		return this.values.elementAt(i);
	}
	
	public void addValue(String v) {
		this.values.add(v);
	}

	@Override
	public String getInitValue() {
		return this.initial;
	}	

	@Override
	protected String valuesToKripke() {
		String retval = "{";
		for (int i=0; i<this.values.size(); i++) {
			retval += this.values.elementAt(i) + ",";
		}
		retval = retval.substring(0, retval.length()-2);
		retval += "}";
		return retval;
	}
}