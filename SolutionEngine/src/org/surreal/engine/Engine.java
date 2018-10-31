package org.surreal.engine;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;
import org.surreal.engine.query.QISet;
import org.surreal.engine.query.QueryInstantiation;
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
	protected Model mucd;
	
	/**
	 * Reference to the SAM model 
	 */
	protected StateMachine sam;
	
	public Engine() {
		this.rep = null;
		this.mucd = null;
		this.sam = null;
	}
	
	/**
	 * It solves the entire Query Instantiation Set (QIset)
	 * @param qiset: set of the queries instantiations to solve
	 * @return set of the results
	 */
	public ResultSet solve(QISet qiset) {
		ResultSet retval = new ResultSet();
		for (int i = 0; i < qiset.size(); i++) {
			QueryInstantiation qi = qiset.get(i);
			int qid = qi.getQueryId();			
			Solver s = this.rep.getSolver(qid);
			Result res = s.solve(qi,this.sam,this.mucd);
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

	public Model getMucd() {
		return mucd;
	}

	public void setMucd(Model mucd) {
		this.mucd = mucd;
	}

	public StateMachine getSam() {
		return sam;
	}

	public void setSam(StateMachine sam) {
		this.sam = sam;
	}
}