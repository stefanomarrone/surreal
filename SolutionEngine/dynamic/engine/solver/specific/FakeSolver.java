package engine.solver.specific;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;

import engine.solver.Solver;
import engine.query.QueryInstantiation;
import engine.results.BooleanResult;
import engine.results.Result;

public class FakeSolver implements Solver {

	@Override
	public Result solve(QueryInstantiation qi, StateMachine sam, Model mucd) {
		BooleanResult retval = new BooleanResult();
		retval.setQI(qi);
		retval.setValue(true);
		return retval;
	}
}
