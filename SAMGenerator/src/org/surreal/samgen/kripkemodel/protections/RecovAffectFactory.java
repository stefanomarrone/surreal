package org.surreal.samgen.kripkemodel.protections;

import org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence;
import org.surreal.samgen.kripkemodel.attacks.Affect;
import org.surreal.samgen.kripkemodel.attacks.SetAffect;

public class RecovAffectFactory {

	public static Affect generate(affectConsequence ac) {
		Affect retval = null;
		String name = ac.getIndex();
		String sval = ac.getSet();
		String ival = ac.getInc();
		if ((sval != null) && (!sval.equals(""))) {
			retval = new SetAffect(name, sval);
		} else {
			retval = new IncrAffect(name, ival);
		}
		return retval;
	}
}
