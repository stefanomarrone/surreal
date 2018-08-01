package engine.query;

import java.util.Hashtable;

public class Query {

	protected int id;
	
	protected String name;
	
	protected String description;
	
	// the hashtable contains the list of the formal parameters: name and stereotype
	protected Hashtable<String,String> paramlist;
	
	// Type of the result
	protected String result;
	
	public Query(int iid, String nname, String ddescription, Hashtable<String,String> pparamlist, String rresult) {
		this.id = iid;
		this.name = nname;
		this.description = ddescription;
		this.paramlist = pparamlist;
		this.result = rresult;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Hashtable<String, String> getParamlist() {
		return paramlist;
	}

	public String getParamType(String paramName) {
		String retval = null;
		if (this.paramlist.containsKey(paramName)) {
			retval = this.paramlist.get(paramName);
		}
		return retval;
	}

	public void setParamlist(Hashtable<String, String> paramlist) {
		this.paramlist = paramlist;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
