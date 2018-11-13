package org.surreal.engine.solver.specific;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;

import org.surreal.engine.solver.Solver;
import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.results.BooleanResult;
import org.surreal.engine.results.Result;

public class FalseFakeSolver implements Solver {

	@Override
	public Result solve(QueryInstantiation qi, StateMachine sam, Model mucd) {
		BooleanResult retval = new BooleanResult();
		retval.setQI(qi);
		retval.setValue(false);
		return retval;
	}
}
