package org.surreal.samgen.kripkemodel;

import java.util.Vector;

import org.surreal.common.utils.Utils;
import org.surreal.samgen.kripkemodel.attacks.Affect;
import org.surreal.samgen.kripkemodel.attacks.Attack;
import org.surreal.samgen.kripkemodel.attacks.DecrAffect;
import org.surreal.samgen.kripkemodel.attacks.SetAffect;
import org.surreal.samgen.kripkemodel.protections.IncrAffect;
import org.surreal.samgen.kripkemodel.protections.Recovery;
import org.surreal.samgen.kripkemodel.services.ContinousIndex;
import org.surreal.samgen.kripkemodel.services.DiscreteIndex;
import org.surreal.samgen.kripkemodel.services.Index;

public class AttackEvolution {
	
	private Attack a;
	
	private Vector<Recovery> recs;
	
	private Index subject; 
	
	public AttackEvolution(Attack att, Index i) {
		this.a = att;
		this.subject = i; 
		this.recs = new Vector<Recovery>();
		for (Recovery r: this.a.getRecoveryList()) {
			if (r.affecting(i)) {
				this.recs.add(r);
			}
		}
	}
	
	public String toKripke() {
		String retval = "";
		String p_attack = Utils.parametrize(this.a.getName());
		for (Recovery r: this.recs) {
			String p_recovery = Utils.parametrize(r.getName());
			// First row
			String slice = "(" + p_attack + " = TRUE)";
			slice += " & ";
			slice += "(" + p_recovery + " = KO)";
			slice += " & ";
			slice += this.attackTriggerEffect();
			slice += ";\n";
			// Second row
			slice += "(" + p_recovery + " = OK)";
			slice += " & ";
			slice += this.recovTriggerEffect(r);
			slice += ";\n";
			retval += slice;
		}
		return retval;
	}
	
	private String recovTriggerEffect(Recovery rr) {
		String retval = null;
		Affect aff = rr.getAffect(this.subject); 
		String target = aff.getReferenceValue().toString();
		if (this.subject instanceof ContinousIndex) {
			if (aff instanceof SetAffect) {
				retval = "(" + this.subject.getName() + " < " + target + "): " + target;
			} else if (aff instanceof IncrAffect) {
				int max = ((ContinousIndex) this.subject).getMax();
				retval = "(" + this.subject.getName() + " <= (" + max + " - " + target + ")): " + this.subject.getName() + " + " + target;
			}
		} else if (this.subject instanceof DiscreteIndex) {
			//NEXT: scrivere codice per DiscreteIndex
		}
		return retval;
	}

	private String attackTriggerEffect() {
		String retval = null;
		Affect aff = this.a.getAffect(this.subject); 
		String target = aff.getReferenceValue().toString();
		if (this.subject instanceof ContinousIndex) {
			if (aff instanceof SetAffect) {
				retval = "(" + this.subject.getName() + " > " + target + "): " + target;
			} else if (aff instanceof DecrAffect) {
				int min = ((ContinousIndex) this.subject).getMin();
				retval = "(" + this.subject.getName() + " >= (" + target + " + " + min + ")): " + this.subject.getName() + " - " + target;
			}
		} else if (this.subject instanceof DiscreteIndex) {
			//NEXT: scrivere codice per DiscreteIndex
		}
		return retval;
	}
}