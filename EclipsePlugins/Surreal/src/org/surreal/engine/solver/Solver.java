package org.surreal.engine.solver;

import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.results.Result;

public interface Solver {
	
	public Result solve(QueryInstantiation qi, SAMHandler hs);
}
