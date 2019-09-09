package org.surreal.engine.solver.specific;

import org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl;
import org.surreal.common.modeloracle.MUCDHandler;
import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.engine.query.QueryBinding;
import org.surreal.engine.results.Result;
import org.surreal.engine.results.ScenarioResult;
import org.surreal.engine.solver.Solver;
import org.surreal.samgen.modes.Behaviour;
import org.surreal.samgen.modes.Postprocessor;
import org.surreal.samgen.modes.ServiceModes;
import org.surreal.samgen.modes.SystemModesFactory;
import org.surreal.samgen.modes.Transition;

public class BestStrategySolver implements Solver {

	@Override
	public Result solve(QueryBinding qi, SAMHandler h) {
		ScenarioResult retval = new ScenarioResult(qi);
		StateMachineQuery smq = new StateMachineQuery(h);
		
		String degradedModeName = qi.getBindingEntry("S");
		modeImpl degradedMode = smq.getMode(degradedModeName);
		modeImpl bestMode = smq.getBestServiceMode();
		String bestModeName = bestMode.getBase_State().getName();
		boolean reachable = smq.existingPathWithTabu(degradedMode,bestMode);

		if (reachable) {
			MUCDHandler littleHandler = (MUCDHandler) h;
			SolverTransformation_P14 t = new SolverTransformation_P14(littleHandler,degradedModeName,bestModeName);
			String report = t.report_BMC();
			String[] modes = {bestModeName,degradedModeName};
			ServiceModes actual = SystemModesFactory.generate(t.getServiceModes(),modes);
			Postprocessor pp = new P14Processor(actual);
			pp.buildEvolution(report);
			Behaviour sme = pp.getEvolution();
			Transition extended = sme.getTransition(degradedModeName,bestModeName);
			Transition result = extended.getProtectionTransition();
			retval.load(result);
		}
		return retval;
	}
}
