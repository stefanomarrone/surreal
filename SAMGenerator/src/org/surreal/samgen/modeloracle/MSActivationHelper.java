package org.surreal.samgen.modeloracle;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS;
import org.surreal.SurvivabilityProfile.SAMExtensions.impl.MSactivationImpl;

public class MSActivationHelper extends MSactivationImpl {

	public MSActivationHelper(serviceMS sms, String val, int stp) {
		this.service = sms;
		this.step = stp;
		this.value = val;
	}
}
