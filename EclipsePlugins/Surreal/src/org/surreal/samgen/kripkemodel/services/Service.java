package org.surreal.samgen.kripkemodel.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.surreal.common.utils.Utils;
import org.surreal.samgen.kripkemodel.AttackEvolution;
import org.surreal.samgen.kripkemodel.ModelItem;
import org.surreal.samgen.kripkemodel.attacks.Attack;
import org.surreal.samgen.kripkemodel.protections.Recovery;

public class Service extends ModelItem {

	protected Vector<Index> indices;
	
	protected Vector<Attack> attacks;
	
	public Service(String n) {
		super(n);
		this.indices = new Vector<Index>();
		this.attacks = new Vector<Attack>();
	}

	public void addIndex(Index i) {
		this.indices.add(i);
	}

	public Vector<Attack> getAttackList() {
		return this.attacks;
	}

	public void addAttack(Attack a) {
		this.attacks.add(a);
	}

	public Index getIndexByName(String i) {
		Index retval = null;
		int counter = 0;
		while ((counter < this.indices.size()) && (retval == null)) {
			if (this.indices.elementAt(counter).getName().equals(i)) {
				retval = this.indices.elementAt(counter);
			}
			counter++;
		}
		return retval;
	}
	
	private String kripkeHeader() {
		String retval = "MODULE " + this.name;
		retval += this.prototypeParam(); 
		retval += "\n"; 
		return retval;
	}
	
	private String prototypeParam() {
		return this.prototype(true);
	}

	public String prototypeUnParam() {
		return this.prototype(false);
	}

	private String prototype(boolean paramFlag) {
		String retval = "(";
		String temp = null;
		List<String> recoveries = new ArrayList<String>();
		for (Attack a: this.attacks) {
			temp = (paramFlag) ? Utils.parametrize(a.getName()) : a.getName();
			retval += temp + ",";
			for (Recovery r: a.getRecoveryList()) {
				temp = (paramFlag) ? Utils.parametrize(r.getName()) : r.getName();
				if (!recoveries.contains(temp)) {
					recoveries.add(temp);
					retval += temp + ",";
				}
			}
		}
		retval = retval.substring(0,retval.length()-1);
		retval += ")"; 
		return retval;
	}

	private String kripkeAssign() {
		String retval = "ASSIGN\n";
		// Init clause
		for (Index i: this.indices) {
			retval += "\tinit(" + i.getName() + ") := " + i.getInitValue() + ";\n";
		}
		// Next clause
		for (Index i: this.indices) {
			retval += "\tnext(" + i.getName() + ") := case\n";
			String casebody = this.getEvolution(i);
			retval += Utils.indent(casebody,2);
			retval += "\tesac;\n";
		}		
		return retval;
	}

	private String getEvolution(Index i) {
		String retval = "";
		Vector<AttackEvolution> aes = this.getAttackEvolution(i);
		for (AttackEvolution ae: aes) {
			retval += ae.toKripke();
		}
		retval += "TRUE: " + i.getName() + ";\n";  
		return retval;
	}

	private Vector<AttackEvolution> getAttackEvolution(Index i) {
		Vector<AttackEvolution> retval = new Vector<AttackEvolution>();
		for (Attack a: this.attacks) {
			if (a.affecting(i)) {
				retval.add(new AttackEvolution(a,i));
			} 
		}
		return retval;
	}

	private String kripkeVar() {
		String retval = "VAR\n";
		for (Index i: this.indices) {
			retval += "\t" + i.toKripke() + ";\n";
		}
		return retval;
	}

	public String toKripke() {
		String retval = this.kripkeHeader();
		retval += this.kripkeVar();
		retval += this.kripkeAssign();
		return retval + "\n";
	}
}