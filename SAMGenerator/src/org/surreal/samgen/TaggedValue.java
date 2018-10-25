package org.surreal.samgen;

import java.util.Hashtable;
import java.util.Vector;

public abstract class TaggedValue {
	
	protected Vector<String> labels;
	
	protected String getLabel(int position) {
		return this.labels.get(position);
	}
	
	public Hashtable<String,String> compute(Vector<Object> rawdata) {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		for (int i=0; i<rawdata.size(); i++) {
			String label = this.getLabel(i);
			if (label != null) {
				String temp = (rawdata.get(i) == null) ? "" : rawdata.get(i).toString();
				retval.put(label,temp);
			}
		}
		return retval;
	}

}
