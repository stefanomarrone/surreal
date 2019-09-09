package org.surreal.engine.solver;

import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.engine.query.QueryBinding;
import org.surreal.engine.results.Result;

public interface Solver {
	
	public Result solve(QueryBinding qi, SAMHandler hs);
}
