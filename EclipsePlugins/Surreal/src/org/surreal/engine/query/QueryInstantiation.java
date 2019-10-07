package org.surreal.engine.query;

import java.util.Hashtable;

public class QueryInstantiation {

	protected int id;
	
	protected String qid;
	
	protected Hashtable<String,String> binding;
	
	public QueryInstantiation(int iid, String quid) {
		this.id = iid;
		this.qid = quid;
		this.binding = new Hashtable<String,String>();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQueryId() {
		return this.qid;
	}

	public void setQueryId(String id) {
		this.qid = id;
	}

	public Hashtable<String, String> getBinding() {
		return this.binding;
	}

	public String getBindingEntry(String formal) {
		String retval = null;
		if (this.binding.containsKey(formal)) {
			retval = this.binding.get(formal);
		}
		return retval;
	}

	public void addBindingEntry(String formal, String actual) {
		this.binding.put(formal,actual);
	}

	public String report() {
		String retval = this.qid + "(";
		for (String f: this.binding.keySet()) {
			String a = this.binding.get(f);
			retval += f + " = " + a + ",";
		}
		return retval.substring(0,retval.length()-1) + ")";
	}	
}