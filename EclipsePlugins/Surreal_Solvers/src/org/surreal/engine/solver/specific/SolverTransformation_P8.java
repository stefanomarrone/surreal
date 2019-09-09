package org.surreal.engine.solver.specific;

import java.util.Vector;

import org.surreal.common.modeloracle.MUCDHandler;
import org.surreal.samgen.Transformation;
import org.surreal.samgen.kripkemodel.SystemModelFactory;
import org.surreal.samgen.modes.Mode;
import org.surreal.samgen.modes.SystemModesFactory;

public class SolverTransformation_P8 extends Transformation {
	
	protected Vector<Mode> bestMode;
	
	protected Vector<Mode> otherModes;
	
	protected String misuse;

	public SolverTransformation_P8(MUCDHandler handy, String best, Vector<String> others, String misuseName) {
		this.handler = handy;
		this.system = SystemModelFactory.generate(this.handler);
		Vector<String> tempModes = this.handler.getModesDefinitions();
		this.modes = SystemModesFactory.generate(tempModes);
		this.bestMode = this.modes.getModeFromName(best);
		this.otherModes = this.modes.getModeFromName(others);
		this.misuse = misuseName;
	}
	
	public String generateNuSMV_model() {
		Vector<String> exceptions = new Vector<String>();
		exceptions.add(this.misuse);
		String retval = this.system.toKripke(exceptions);
		return retval;
	}

	public String generateNuSMV_properties() {
		String retval = this.modes.genCTL(this.bestMode,this.otherModes); 
		return retval;
	}
}