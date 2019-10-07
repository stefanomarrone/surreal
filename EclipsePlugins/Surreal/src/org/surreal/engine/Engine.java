package org.surreal.engine;

import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.query.QueryInstantiationDocument;
import org.surreal.engine.results.Result;
import org.surreal.engine.results.ResultSet;
import org.surreal.engine.solver.Solver;

/**
 * This class is core of the package getting the proper solver for the specified query and invoking the method to solve the query on the actual parameters contained in the Query Instantiation elements
 * @author Stefano Marrone
 *
 */
public class Engine {
	
	/**
	 * Reference to the Repository 
	 */
	protected Repository rep;
	
	/**
	 * Reference to the MUCD model 
	 */
	protected SAMHandler handler;
	
	public Engine() {
		this.rep = null;
		this.handler = null;
	}
	
	/**
	 * It solves the entire Query Instantiation Set (QIset)
	 * @param qiset: set of the queries instantiations to solve
	 * @return set of the results
	 */
	public ResultSet solve(QueryInstantiationDocument qiset) {
		ResultSet retval = new ResultSet();
		for (int i = 0; i < qiset.size(); i++) {
			QueryInstantiation qi = qiset.get(i);
			String qid = qi.getQueryId();			
			Solver s = this.rep.getSolver(qid);
			Result res = s.solve(qi,this.handler);
			res.setQI(qi);
			retval.add(res);
		}
		return retval;
	}

	public Repository getRepository() {
		return rep;
	}

	public void setRepository(Repository rep) {
		this.rep = rep;
	}

	public SAMHandler getHandler() {
		return handler;
	}

	public void setHandler(SAMHandler handler) {
		this.handler = handler;
	}


}