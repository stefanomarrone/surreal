package engine.solver;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;

import engine.query.QueryInstantiation;
import engine.results.Result;

public class DelegateSolver implements Solver {

	private Solver delegated;
	
	public DelegateSolver(Class<?> d) {
		this.delegated = null;
		try {
			this.delegated = (Solver) d.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Result solve(QueryInstantiation qi, StateMachine sam, Model mucd) {
		Result retval = null;
		if (this.delegated != null) {
			retval = this.delegated.solve(qi,sam,mucd);
		}
		return retval;
	}
}