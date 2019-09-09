package org.surreal.samgen.kripkemodel;

import java.util.Vector;

import org.surreal.common.utils.Utils;
import org.surreal.samgen.kripkemodel.attacks.Attack;
import org.surreal.samgen.kripkemodel.protections.Recovery;
import org.surreal.samgen.kripkemodel.services.Service;

public class SystemModel {

	protected Vector<Service> essentials;
	
	protected Vector<Attack> threats;
	
	protected Vector<Recovery> protections;
	
	public SystemModel() {
		this.essentials = new Vector<Service>();
		this.threats = new Vector<Attack>();
		this.protections = new Vector<Recovery>();
	}

	public void addService(Service ss) {
		this.essentials.add(ss);
	}
	
	public int getServiceSize() {
		return this.essentials.size();
	}
	
	public Service getService(int i) {
		Service retval = null;
		if ((i>=0) && (i<this.essentials.size())) {
			retval = this.essentials.elementAt(i); 
		}
		return retval;
	}
	
	public Vector<Attack> getAttackList() {
		return this.threats;
	}

	public Vector<Service> getServiceList() {
		return this.essentials;
	}
	
	public Service getService(String name) {
		Service retval = null;
		int counter = 0;
		while ((counter < this.essentials.size()) && (retval == null)) {
			if (this.essentials.elementAt(counter).getName().equals(name)) {
				retval = this.essentials.elementAt(counter);
			}
			counter++;
		}
		return retval;		
	}

	public void addAttack(Attack aa) {
		this.threats.add(aa);
	}

	public int getAttackSize() {
		return this.threats.size();
	}
	
	public Attack getAttack(int i) {
		Attack retval = null;
		if ((i>=0) && (i<this.threats.size())) {
			retval = this.threats.elementAt(i); 
		}
		return retval;
	}
	
	public Attack getAttack(String name) {
		Attack retval = null;
		int counter = 0;
		while ((counter < this.threats.size()) && (retval == null)) {
			if (this.threats.elementAt(counter).getName().equals(name)) {
				retval = this.threats.elementAt(counter);
			}
			counter++;
		}
		return retval;		
	}

	public void addRecovery(Recovery rr) {
		this.protections.add(rr);
	}

	public int getRecoverySize() {
		return this.protections.size();
	}
	
	public Recovery getRecovery(int i) {
		Recovery retval = null;
		if ((i>=0) && (i<this.protections.size())) {
			retval = this.protections.elementAt(i); 
		}
		return retval;
	}
	
	public Recovery getRecovery(String name) {
		Recovery retval = null;
		int counter = 0;
		while ((counter < this.protections.size()) && (retval == null)) {
			if (this.protections.elementAt(counter).getName().equals(name)) {
				retval = this.protections.elementAt(counter);
			}
			counter++;
		}
		return retval;		
	}

	public String toKripke() {
		String retval = this.innerKripke();
		Vector<String> exceptions = new Vector<String>();
		retval += this.mainModule(exceptions);
		return retval;
	}

	public String toKripke(Vector<String> exceptions) {
		String retval = this.innerKripke();
		retval += this.mainModule(exceptions);
		return retval;
	}

	private String mainModule(Vector<String> exceptions) {
		String retval = "";
		retval += this.mainHeader() + "\n";
		retval += this.mainVar();
		retval += this.mainAssign() + "\n";
		retval += this.mainDefine(exceptions) + "\n";
		return retval;
	}
	
	private String innerKripke() {
		String retval = "";
		for (Service ss: this.essentials) {
			retval += ss.toKripke();
		}
		return retval;
	}

	private String mainDefine(Vector<String> exceptions) {
		String retval = "DEFINE\n";
		for (Attack a: this.threats) {
			String name = a.getName();
			String value = exceptions.contains(name) ? "TRUE" : "FALSE";
			retval += "\t" + name + "_inhibitor := " + value + ";\n";
		}
		return retval;
	}

	private String mainAssign() {
		String retval = "ASSIGN\n";
		// attack
		for (Attack a: this.threats) {
			String name = a.getName();
			retval += "\tinit(" + name + ") := FALSE;\n";
			retval += "\tnext(" + name + ") := case\n";
			String casebody = "(" + name + "_inhibitor = TRUE): FALSE;\n";
			casebody += "(" + name + "_inhibitor = FALSE): {TRUE, FALSE};\n";
			retval += Utils.indent(casebody,2);
			retval += "\tesac;\n";
		}
		// Recovery
		for (Recovery r: this.protections) {
			retval += "\tinit(" + r.getName() + ") := KO;\n";
		}
		for (Recovery r: this.protections) {
			retval += "\tnext(" + r.getName() + ") := case\n";
			String casebody = r.getEvolution();
			retval += Utils.indent(casebody,2);
			retval += "\tesac;\n";
		}
		return retval;
	}

	private String mainVar() {
		String retval = "VAR\n";
		// Attack section
		for (Attack a: this.threats) {
			retval += "\t" + a.getName() + ": boolean;\n";
		}
		// Protection section
		for (Recovery r: this.protections) {
			retval += "\t" + r.getName() + ": {ENABLED, OK, KO};\n";
		}
		// Service section
		for (Service s: this.essentials) {
			String temp = s.getName();
			retval += "\t" + Utils.processorize(temp) + ": " + temp + s.prototypeUnParam() + ";\n";
		}
		return retval;
	}
	
	private String mainHeader() {
		return "MODULE main";
	}
}