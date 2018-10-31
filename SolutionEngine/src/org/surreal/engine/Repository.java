package org.surreal.engine;

import org.surreal.engine.query.Query;
import org.surreal.engine.solver.Solver;

/**
 * A Repository should behave according to this interface
 * @author Stefano Marrone
 *
 */
public interface Repository {
	
	/**
	 * It retrives the query from its identifier
	 * @param qid identifier of the query
	 * @return the Query object
	 */
	public Query getQuery(int qid);
	
	/**
	 * It retrives the Solver for the Query kind
	 * @param qid identifier of the query
	 * @return the Solver object
	 */
	public Solver getSolver(int qid);
}