package org.surreal.samgen.modes;

import java.util.Vector;

import org.surreal.samgen.bmc.BmcRequest;
import org.surreal.samgen.bmc.BmcRequestM;

public class ServiceModes {

	//OPEN move from Vector to an hashtable	
	private Vector<Mode> modes;

	public ServiceModes() {
		this.modes = new Vector<Mode>(); 
	}

	public void addGM(Mode gm) {
		this.modes.add(gm);
	}
	
	private int getHighestPriority() {
		int retval = Integer.MAX_VALUE;
		for (Mode gm: this.modes) {
			if (gm.getPriority() < retval) {
				retval = gm.getPriority(); 
			}
		}
		return retval;
	}

	private int getLowestPriority() {
		int retval = 0;
		for (Mode gm: this.modes) {
			if (gm.getPriority() > retval) {
				retval = gm.getPriority(); 
			}
		}
		return retval;
	}
	
	private Vector<Mode> getModeByPriority(int p) {
		Vector<Mode> retval = new Vector<Mode>();
		for (Mode gm: this.modes) {
			if (gm.getPriority() == p) {
				retval.add(gm);
			}
		}
		return retval;
	}

	public String toNuSMV() {
		String retval = "DEFINE\n";
		Vector<Mode> old = new Vector<Mode>(); 
		int startPriority = this.getHighestPriority();
		int endPriority = this.getLowestPriority();
		for (int counter = startPriority; counter <= endPriority; counter++) {
			Vector<Mode> current = this.getModeByPriority(counter);
			for (Mode cgm: current) {
				retval += "\t" + cgm.toNuSMV(old) + '\n';
			}
			old.addAll(current);
		}
		return retval;
	}
	
	public String genCTL() {
		String retval = "";
		int num = this.modes.size();
		for (int i = 0; i < num; i++) {
			String source = this.modes.elementAt(i).getName();
			for (int j = 0; j < num; j++) {
				if (i != j) {
					String target = this.modes.elementAt(j).getName();
					retval += "CTLSPEC AG (" + source + " -> AX(!" + target + "))\n";
				}
			}
		}
		return retval;
	}

	public Vector<BmcRequest> genFullBMC() {
		Vector<BmcRequest> retval = this.genFullBMC(100); 
		return retval;
	}
	
	public Vector<BmcRequest> genFullBMC(int maxlen) {
		Vector<BmcRequest> retval = new Vector<BmcRequest>();
		int num = this.modes.size();
		for (int i = 0; i < num; i++) {
			Mode source = this.modes.elementAt(i);
			for (int j = 0; j < num; j++) {
				if (i != j) {
					Mode target = this.modes.elementAt(j);
					BmcRequest temp = new BmcRequestM(source,target,maxlen);
					retval.add(temp);
				}
			}
		}

		
		return retval;
	}

	public String genLTL(Vector<BmcRequest> todeepen) {
		String retval = "";
		int num = todeepen.size();
		for (int i = 0; i < num; i++) {
			String source = todeepen.get(i).getSource();
			String target = todeepen.get(i).getTarget();
			retval += "LTLSPEC G (" + source + " -> X(!" + target + "))\n";
		}
		return retval;
	}

	public Vector<String> getNames() {
		Vector<String> retval = new Vector<String>();
		for (Mode m: this.modes) {
			retval.add(m.getName());
		}
		return retval;
	}	
}