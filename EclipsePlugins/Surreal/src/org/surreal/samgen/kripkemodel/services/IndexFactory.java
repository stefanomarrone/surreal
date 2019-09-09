package org.surreal.samgen.kripkemodel.services;

import org.surreal.SurvivabilityProfile.SurvTypes.index;
import org.surreal.SurvivabilityProfile.SurvTypes.indexKind;
import org.surreal.common.utils.Dictionary;

public class IndexFactory {

	public static Index generate(index i) {
		Index retval = null;
		String name = i.getName();
		String val = i.getValues();
		String initial = i.getInitial();
		indexKind kind = i.getKind();
		if (kind.getLiteral().equals(Dictionary.indexIntegerLiteral)) {
			retval = new ContinousIndex(name,val,initial);
		} else {
			retval = new DiscreteIndex(name,val,initial);
		}
		return retval;
	}
}
