package org.surreal.samgen.modes;

import java.util.ArrayList;
import java.util.List;
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
		String retval = this.genCTL(this.modes,this.modes);
		return retval;
	}

	public String genCTL(Vector<Mode> sources, Vector<Mode> targets) {
		String retval = "";
		int snum = sources.size();
		int tnum = targets.size();
		for (int i = 0; i < snum; i++) {
			String source = sources.elementAt(i).getName();
			for (int j = 0; j < tnum; j++) {
				String target = targets.elementAt(j).getName();
				if (!target.equals(source)) {
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

	public String genLTL_existence(Vector<BmcRequest> todeepen) {
		String retval = "";
		int num = todeepen.size();
		for (int i = 0; i < num; i++) {
			String source = todeepen.get(i).getSource();
			String target = todeepen.get(i).getTarget();
			retval += "LTLSPEC G (" + source + " -> X(!" + target + "))\n";
		}
		return retval;
	}

	public String genLTL_path(Vector<BmcRequest> todeepen) {
		String retval = "";
		int num = todeepen.size();
		for (int i = 0; i < num; i++) {
			String source = todeepen.get(i).getSource();
			String target = todeepen.get(i).getTarget();
			List<String> intermediates = this.getLessImportantThan(todeepen.get(i).getSource());
			String intermediate = "";
			for (String inter: intermediates) {
				intermediate += " & G(!" + inter + ")";
			}
			String premise = "((" + source + " " + intermediate + ")";
			String consequence = "G(!" + target + "))"; 
			retval += "LTLSPEC G (" + premise + " -> " + consequence + " )\n";
		}
		return retval;
	}

	private List<String> getLessImportantThan(String modeName) {
		List<String> retval = new ArrayList<String>();
		int priority = this.getSingleModeFromName(modeName).getPriority();
		for (Mode m: this.modes) {
			if (m.getPriority() < priority) {
				retval.add(m.getName());
			}
		}
		return null;
	}

	public Vector<String> getNames() {
		Vector<String> retval = new Vector<String>();
		for (Mode m: this.modes) {
			retval.add(m.getName());
		}
		return retval;
	}
	
	public int getPriorityByName(String name) {
		int retval = -1;
		boolean found = false;
		int counter = 0;
		int len = this.modes.size();
		while ((found == false) && (counter < len)) {
			Mode temp = this.modes.elementAt(counter);
			found = temp.getName().equals(name);
			if (found == true) {
				retval = temp.getPriority();
			}
			counter++;
		}
		return retval;
	}

	public Vector<Mode> getModeFromName(String name) {
		Vector<Mode> retval = new Vector<Mode>();
		boolean found = false;
		int counter = 0;
		while ((found == false) && (counter < this.modes.size())) {
			Mode temp = this.modes.elementAt(counter);
			if (temp.getName().equals(name)) {
				found = true;
				retval.add(temp);
			}
			counter++;
		}		
		return retval;
	}

	public Mode getSingleModeFromName(String name) {
		Mode retval = null;
		int counter = 0;
		while ((retval == null) && (counter < this.modes.size())) {
			Mode temp = this.modes.elementAt(counter);
			if (temp.getName().equals(name)) {
				retval = temp;
			}
			counter++;
		}		
		return retval;
	}

	public Vector<Mode> getModeFromName(Vector<String> names) {
		Vector<Mode> retval = new Vector<Mode>();
		for (String name : names) {
			retval.addAll(this.getModeFromName(name));
		}
		return retval;
	}
}