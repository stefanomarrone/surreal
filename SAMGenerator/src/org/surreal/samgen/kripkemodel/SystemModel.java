package org.surreal.samgen.kripkemodel;

import java.util.Vector;

import org.surreal.samgen.kripkemodel.attacks.Attack;
import org.surreal.samgen.kripkemodel.protections.Recovery;
import org.surreal.samgen.kripkemodel.services.Service;
import org.surreal.samgen.utils.Utils;

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
		String retval = "";
		for (Service ss: this.essentials) {
			retval += ss.toKripke();
		}
		retval += this.mainModule();
		return retval;
	}

	private String mainModule() {
		String retval = "";
		retval += this.mainHeader() + "\n";
		retval += this.mainVar();
		retval += this.mainAssign() + "\n";
		return retval;
	}

	private String mainAssign() {
		String retval = "ASSIGN\n";
		// init clause
		for (Attack a: this.threats) {
			retval += "\tinit(" + a.getName() + ") := FALSE;\n";
		}
		for (Recovery r: this.protections) {
			retval += "\tinit(" + r.getName() + ") := KO;\n";
		}
		// next clause
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
