package org.surreal.common.modeloracle;

import java.util.Vector;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl;
import org.surreal.SurvivabilityProfile.SAMExtensions.impl.scenarioImpl;

public class SAMHandler extends MUCDHandler {
	
	protected EList<modeImpl> modes;

	protected EList<scenarioImpl> scenarios;
	
	public SAMHandler() {
		super();
		this.modes = new BasicEList<modeImpl>();
		this.scenarios = new BasicEList<scenarioImpl>();
	}
	
	public void addMode(modeImpl m) {
		this.modes.add(m);
	}
	
	public void addScenario(scenarioImpl s) {
		this.scenarios.add(s);
	}

	public Vector<modeImpl> getModes() {
		return new Vector<modeImpl>(this.modes);
	}

	public Vector<scenarioImpl> getScenarios() {
		return new Vector<scenarioImpl>(this.scenarios);
	}
}
