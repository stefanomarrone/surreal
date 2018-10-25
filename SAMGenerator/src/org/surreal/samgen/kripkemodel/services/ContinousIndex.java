package org.surreal.samgen.kripkemodel.services;

import java.util.StringTokenizer;

public class ContinousIndex extends Index {
	
	protected int min;
	
	protected int max;

	protected int initial;

	public ContinousIndex(String n) {
		super(n);
	}
	
	public ContinousIndex(String n, String range, String i) {
		super(n);
		StringTokenizer st = new StringTokenizer(range,"..");
		this.min = new Integer(st.nextToken());
		this.max = new Integer(st.nextToken());
		this.initial = new Integer(i);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	@Override
	public String getInitValue() {
		Integer temp = new Integer(this.initial);
		return temp.toString();
	}
	
	@Override
	protected String valuesToKripke() {
		String retval = this.min + ".." + this.max;
		return retval;
	}
}