package org.surreal.samgen.modes;

import java.util.Vector;

import org.surreal.samgen.modes.condition.ConditionTranslator;

public class Mode {

	private String name;
	
	private String condition;
	
	private int priority; // lower the priority, more important the state mode
	
	public Mode(String nn, String cc, int p) {
		this.name = nn;
		this.condition = cc;
		this.priority = p;
	}
	
	public String getName() {
		return this.name;
	}

	public String getCondition() {
		return this.condition;
	}
	
	public String translateCondition() {
		String retval = this.condition;  
		if (this.condition.equals("") == false) {
			retval = ConditionTranslator.translate(retval);	
		}
		return retval;
	}

	private String getGuard(Vector<Mode> oldgms) {
		String retval = "";
		int size = oldgms.size();
		if (size > 0) {
			retval = "!(";
			for (int i=0; i<size; i++) {
				retval += oldgms.get(i).getName();
				if (i != (size-1)) {
					retval += " | ";
				}
			}
			retval += ")";
		}
		return retval;
	}
	
	public int getPriority() {
		return this.priority;
	}

	public String toNuSMV(Vector<Mode> old) {
		String retval = this.getName();
		retval += " := ";
		// Disabling the guards
		String guard = this.getGuard(old);
		String condition = this.translateCondition();
		boolean fullcondition = (!guard.equals("")) && (!condition.equals("")); 
		String connector = (fullcondition) ? " & " : "";
		retval += guard + connector + condition + ";";
		return retval;
	}
}
