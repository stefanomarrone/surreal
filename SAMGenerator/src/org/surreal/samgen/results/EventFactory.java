package org.surreal.samgen.results;

import java.util.Vector;

import org.surreal.samgen.modes.ProtectionEvent;

public class EventFactory {
	
	private Vector<String> modes;
	
	private String[] protectionLabels = {"OK", "KO", "ENABLED"};

	public EventFactory(Vector<String> m) {
		this.modes = m;
	}
	
	public Event genEvent(String lval, String rval) {
		Event retval = null;
		if (this.isState(lval)) {
			retval = new ModeEvent(lval,rval);
		} else if (this.isDefense(rval)) {
			retval = new ProtectionEvent(lval,rval);
		} else {
			retval = new AttackEvent(lval,rval);
		}
		return retval;
	}
	
	private boolean isDefense(String s) {
		int i = 0;
		boolean found = false;
		while ((found == false) && (i<this.protectionLabels.length)) {
			found = (s.equals(protectionLabels[i]));
			i++;
		}
		return found;
	}

	private boolean isState(String s) {
		return this.modes.contains(s);
	}	
}