package org.surreal.samgen.modes;

public class BMCProcessor extends Postprocessor {

	public BMCProcessor(ServiceModes sms) {
		super.reset(sms);
		this.gotcha = "-- specification  G (";
		this.ignorable.addElement("-- no counterexample found with bound ");
		this.ignorable.addElement("-- Loop ");
	}
}
