package engine.solver;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;

import engine.query.QueryInstantiation;
import engine.results.Result;

public interface Solver {
	
	public Result solve(QueryInstantiation qi, StateMachine sam, Model mucd);
}
