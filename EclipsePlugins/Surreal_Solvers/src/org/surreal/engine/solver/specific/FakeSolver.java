package org.surreal.engine.solver.specific;

import org.surreal.engine.solver.Solver;
import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.engine.query.QueryBinding;
import org.surreal.engine.results.BooleanResult;
import org.surreal.engine.results.Result;

public class FakeSolver implements Solver {

	@Override
	public Result solve(QueryBinding qi, SAMHandler h) {		
		BooleanResult retval = new BooleanResult(qi);
		retval.setValue(true);
		return retval;
	}
}
