package org.surreal.engine.solver;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;
import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.results.Result;

public interface Solver {
	
	public Result solve(QueryInstantiation qi, StateMachine sam, Model mucd);
}
