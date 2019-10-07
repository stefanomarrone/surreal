package org.surreal.engine.solver;

import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.results.Result;

public class DelegatingSolver implements Solver {

	private Solver delegated;
	
	public DelegatingSolver(Class<?> d) {
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
	public Result solve(QueryInstantiation qi, SAMHandler h) {
		Result retval = null;
		if (this.delegated != null) {
			retval = this.delegated.solve(qi,h);
		}
		return retval;
	}
}