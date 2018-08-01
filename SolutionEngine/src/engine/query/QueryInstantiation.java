package engine.query;

import java.util.Hashtable;

public class QueryInstantiation {

	protected int id;
	
	protected int qid;
	
	protected Hashtable<String,String> binding;
	
	public QueryInstantiation(int iid) {
		this.id = iid;
		this.qid = -1;
		this.binding = new Hashtable<String,String>();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQueryId() {
		return this.qid;
	}

	public void setQueryId(int id) {
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
		String retval = "Query Instantiation:\n\t id query = " + this.qid + "\n";
		for (String f: this.binding.keySet()) {
			String a = this.binding.get(f);
			retval += "\t " + f + " -> " + a + "\n";
		}
		return retval.substring(0,retval.length()-1);
	}	
}