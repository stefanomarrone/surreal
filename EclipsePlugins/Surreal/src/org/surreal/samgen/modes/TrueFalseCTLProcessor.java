package org.surreal.samgen.modes;

import java.util.Vector;

import org.surreal.samgen.results.ResultExtractor;

public class TrueFalseCTLProcessor extends CTLProcessor {

	public TrueFalseCTLProcessor(ServiceModes sms) {
		super(sms);
	}

	public Vector<String> checkProperty(String report, boolean presence) {
		Vector<String> retval = new Vector<String>();
		for (String payload: this.split(report)) {
			if (!payload.equals("")) {
				ResultExtractor rt = new ResultExtractor();
				rt.translate_outcome(payload);
				String trgMode = rt.getTargetMode();
				if (presence == rt.getProperyValue()) {
					retval.add(trgMode);
				}
			}
		} 
		return retval;
	}
	
	
}