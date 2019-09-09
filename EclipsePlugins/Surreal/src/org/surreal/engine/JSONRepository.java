package org.surreal.engine;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.surreal.engine.query.Query;
import org.surreal.engine.solver.Solver;
import org.surreal.engine.solver.SolverFactory;

public class JSONRepository implements Repository {
	
	public JSONRepository() {
		this.queries = new ArrayList<Query>();
	}
	
	private List<Query> queries;

	public List<Query> getQueries() {
		return queries;
	}

	public void addQuery(Query q) {
		this.queries.add(q);
	}

	public void setQueries(List<Query> queries) {
		this.queries = queries;
	}
	
	@Override
	public Query getQuery(String qid) {
		Query retval = null;
		int counter = 0;		
		while ((retval == null) && (counter < this.queries.size())) {
			if (this.queries.get(counter).getId().equals(qid)) {
				retval = this.queries.get(counter);
			}
			counter++;
		}
		return retval;
	}

	@Override
	public Solver getSolver(String qid) {
		Query temp = this.getQuery(qid);
		String uri = temp.getSolver();
		Solver retval = null;
		try {
			SolverFactory factory = new SolverFactory();
			URL url = new URL(uri);
			retval = factory.generate(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}		
		return retval;
	}
}
	
