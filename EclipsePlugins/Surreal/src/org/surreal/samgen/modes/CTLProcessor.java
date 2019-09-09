package org.surreal.samgen.modes;

public class CTLProcessor extends Postprocessor {

	public CTLProcessor(ServiceModes sms) {
		super.reset(sms);
		this.gotcha = "-- specification AG (";
		this.ignorable.addElement("-- Loop ");
	}
}