package org.surreal.engine.solver.specific;

import java.util.Vector;

import org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl;
import org.surreal.common.modeloracle.MUCDHandler;
import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.engine.query.QueryBinding;
import org.surreal.engine.results.Result;
import org.surreal.engine.results.SMListResult;
import org.surreal.engine.solver.Solver;
import org.surreal.samgen.modes.TrueFalseCTLProcessor;

public class MultipleThreatImpactSolver implements Solver {

	@Override
	public Result solve(QueryBinding qi, SAMHandler h) {
		SMListResult retval = new SMListResult(qi);
		StateMachineQuery smq = new StateMachineQuery(h);
		String misuseName = qi.getBindingEntry("M");

		modeImpl bestMode = smq.getBestServiceMode();
		String bestModeName = bestMode.getBase_State().getName();
		
		Vector<String> otherModeNames = new Vector<String>();
		Vector<modeImpl> otherModes = smq.getModesExcept(bestMode);		
		for (modeImpl m: otherModes) {
			String tempString = m.getBase_State().getName();
			otherModeNames.add(tempString);
		}
		MUCDHandler littleHandler = (MUCDHandler) h;
		SolverTransformation_P8 t = new SolverTransformation_P8(littleHandler,bestModeName,otherModeNames,misuseName);

		String report = t.report_CTL();
		TrueFalseCTLProcessor pp = new TrueFalseCTLProcessor(t.getServiceModes());
		Vector<String> results = pp.checkProperty(report,false);
		retval.addSM(results);
		return retval;
	}
}
