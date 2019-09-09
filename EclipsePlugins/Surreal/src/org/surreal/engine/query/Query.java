package org.surreal.engine.query;


import java.util.ArrayList;
import java.util.List;

public class Query {

	protected String id;
	
	protected String kind;
	
	protected String name;

	protected String description;
	
	// the hashtable contains the list of the formal parameters: name and stereotype
	protected List<QueryFormalBinding> paramlist;
	
	// Type of the result
	protected String result;
	
	protected String solver;
	
	public Query() {
		this.paramlist = new ArrayList<QueryFormalBinding>();
	}

	public Query(String iid, String nname, String kkind, String ddescription, List<QueryFormalBinding> pparamlist, String rresult) {
		this.id = iid;
		this.name = nname;
		this.kind = kkind;
		this.description = ddescription;
		this.paramlist = pparamlist;
		this.result = rresult;
	}

	public Query(String iid, String nname, String kkind, String ddescription, String rresult) {
		this.id = iid;
		this.name = nname;
		this.kind = kkind;
		this.description = ddescription;
		this.paramlist = new ArrayList<QueryFormalBinding>();
		this.result = rresult;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public List<QueryFormalBinding> getParamlist() {
		return paramlist;
	}

	public String getParamType(String paramName) {
		String retval = null;
		int counter = 0;
		while ((retval == null) && (counter < this.paramlist.size())) {
			QueryFormalBinding qfb = this.paramlist.get(counter);
			if (qfb.getName().equals(paramName) == true) {
				retval = qfb.getStereotype();
			}
			counter++;
		}
		return retval;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSolver() {
		return solver;
	}

	public void setSolver(String solver) {
		this.solver = solver;
	}

	public void setParamlist(List<QueryFormalBinding> paramlist) {
		this.paramlist = paramlist;
	}

	public void addParam(String name, String type) {
		QueryFormalBinding temp = new QueryFormalBinding(name,type);
		this.paramlist.add(temp);
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
