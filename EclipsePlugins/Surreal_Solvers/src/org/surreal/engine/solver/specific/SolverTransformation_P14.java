package org.surreal.engine.solver.specific;

import java.util.Vector;

import org.surreal.common.modeloracle.MUCDHandler;
import org.surreal.samgen.Transformation;
import org.surreal.samgen.bmc.BmcRequest;
import org.surreal.samgen.bmc.BmcRequestM;
import org.surreal.samgen.kripkemodel.SystemModelFactory;
import org.surreal.samgen.modes.Mode;
import org.surreal.samgen.modes.SystemModesFactory;

public class SolverTransformation_P14 extends Transformation {
	
	protected String fromModeName;
	
	protected String toModeName;
	
	public SolverTransformation_P14(MUCDHandler handy, String from, String to) {
		this.handler = handy;
		this.system = SystemModelFactory.generate(this.handler);
		Vector<String> tempModes = this.handler.getModesDefinitions();
		this.modes = SystemModesFactory.generate(tempModes);
		this.fromModeName = from;
		this.toModeName = to; 
	}

	public String report_BMC() {
		Vector<BmcRequest> requests = new Vector<BmcRequest>();
		Mode source = this.modes.getModeFromName(this.fromModeName).get(0);
		Mode target = this.modes.getModeFromName(this.toModeName).get(0);
		BmcRequest temp = new BmcRequestM(source,target,100);
		requests.add(temp);
		return this.innerReportBmc(requests,40);
	}

	
	
}