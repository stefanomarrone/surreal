package engine.results;

import java.util.Vector;

public class ResultSet {
	
	protected Vector<Result> set;
	
	public ResultSet() {
		this.set = new Vector<Result>();
	}
	
	public int size() {
		return this.set.size();
	}
	
	public void add(Result res) {
		this.set.add(res);
	}
	
	public Result get(int i) {
		return this.set.elementAt(i);
	}
	
	public String report() {
		String retval = "";
		for (int i=0; i<this.size(); i++) {
			retval += this.get(i).report() + "\n";
		}
		return retval;
	}

}
