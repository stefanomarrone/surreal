package org.surreal.samgen.kripkemodel.protections;

import java.util.Vector;

import org.surreal.samgen.kripkemodel.ModelItem;
import org.surreal.samgen.kripkemodel.attacks.Affect;
import org.surreal.samgen.kripkemodel.attacks.Attack;
import org.surreal.samgen.kripkemodel.services.Index;

public class Recovery extends ModelItem {
	
	protected Vector<Attack> blocked;
	
	protected Vector<Affect> affections;
	
	public Recovery(String n) {
		super(n);
		blocked = new Vector<Attack>();
		affections = new Vector<Affect>();
	}

	public Vector<Attack> getAttackList() {
		return this.blocked;
	} 

	public void addAttack(Attack a) {
		this.blocked.add(a);
	}
	
	public void addAffect(Affect a) {
		this.affections.add(a);
	}
	
	public Vector<Affect> getAffectList() {
		return this.affections;
	}

	public boolean affecting(Index i) {
		boolean found = false;
		int counter = 0;
		while ((counter < this.affections.size()) && (!found)) {
			Affect x = this.affections.get(counter);
			found = x.getIndexName().equals(i.getName());
			counter++;
		}
		return found;
	}

	public Affect getAffect(Index subject) {
		Affect retval = null;
		int counter = 0;
		int max = this.getAffectList().size();
		while ((retval == null) && (counter < max)) {
			Affect temp = this.affections.elementAt(counter);
			if (temp.getIndexName().equals(subject.getName())) {
				retval = temp;
			}
			counter++;
		}
		return retval;
	}

	public String getEvolution() {
		String retval = "(" + this.name + " = KO) & ";
		retval += "(";
		for (int counter = 0; counter < this.blocked.size(); counter++) {
			retval += "(" + this.blocked.elementAt(counter).getName() + " = TRUE)";
			if (counter != this.blocked.size()-1) {
				retval += " | ";
			}
		}
		retval += "): ENABLED;\n";
		retval += "(" + this.name + " = ENABLED): {ENABLED, OK};\n";
		retval += "(" + this.name + " = OK): KO;\n";
		retval += "TRUE: " + this.name + ";\n";
		return retval;
	}
}
