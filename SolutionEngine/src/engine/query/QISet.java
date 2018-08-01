package engine.query;

import java.util.Vector;

public class QISet {

	protected Vector<QueryInstantiation> set;
	
	public QISet() {
		this.set = new Vector<QueryInstantiation>();
	}
	
	public int size() {
		return this.set.size();
	}
	
	public void add(QueryInstantiation qi) {
		this.set.add(qi);
	}
	
	public QueryInstantiation get(int i) {
		return this.set.elementAt(i);
	}	
}