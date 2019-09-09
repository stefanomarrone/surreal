package org.surreal.engine.solver.specific;

import java.util.Vector;

import org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl;
import org.surreal.engine.query.QueryBinding;
import org.surreal.engine.results.BooleanResult;
import org.surreal.engine.results.Result;
import org.surreal.engine.solver.Solver;
import org.surreal.common.modeloracle.SAMHandler;

public class ReversibilitySolver implements Solver {

	@Override
	public Result solve(QueryBinding qi, SAMHandler h) {
		BooleanResult retval = new BooleanResult(qi);
		StateMachineQuery smq = new StateMachineQuery(h);
			
		String name = qi.getBindingEntry("SM");
		modeImpl to = smq.getMode(name);
		int priority = to.getSeverity();
		Vector<modeImpl> modes = smq.getLowerPriorityModes(priority);

		boolean control = true;
		int counter = 0;
		int maxSize = modes.size();
		while ((control == true) && (counter < maxSize)) {
			modeImpl from = modes.elementAt(counter);
			control = smq.existingTransition(from,to);
			counter++;
		}
		retval.setValue(control);
		return retval;
	}
}
