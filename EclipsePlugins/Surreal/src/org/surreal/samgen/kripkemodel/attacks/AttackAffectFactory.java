package org.surreal.samgen.kripkemodel.attacks;

import org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence;

public class AttackAffectFactory {

	public static Affect generate(affectConsequence ac) {
		Affect retval = null;
		String name = ac.getIndex();
		String sval = ac.getSet();
		String dval = ac.getDec();
		if ((sval != null) && (!sval.equals(""))) {
			retval = new SetAffect(name, sval);
		} else {
			retval = new DecrAffect(name, dval);
		}
		return retval;
	}
}
