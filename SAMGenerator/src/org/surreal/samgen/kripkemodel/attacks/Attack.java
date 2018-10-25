package org.surreal.samgen.kripkemodel.attacks;

import java.util.Vector;

import org.surreal.samgen.kripkemodel.ModelItem;
import org.surreal.samgen.kripkemodel.protections.Recovery;
import org.surreal.samgen.kripkemodel.services.Index;
import org.surreal.samgen.kripkemodel.services.Service;

public class Attack extends ModelItem {

	protected Vector<Recovery> recoveries;
	
	protected Vector<Service> services;

	protected Vector<Affect> affections;
	
	public Attack(String n) {
		super(n);
		this.services = new Vector<Service>();
		this.recoveries = new Vector<Recovery>();
		this.affections = new Vector<Affect>();
	}

	public void addAffect(Affect a) {
		this.affections.add(a);
	}
	
	public Vector<Affect> getAffectList() {
		return this.affections;
	}

	public void addRecovery(Recovery r) {
		this.recoveries.add(r);
	}

	public Vector<Recovery> getRecoveryList() {
		return this.recoveries;
	}

	public void addService(Service s) {
		this.services.add(s);
	}

	public Vector<Service> getServiceList() {
		return this.services;
	}
	
	public boolean affecting(Index i) {
		boolean found = false;
		int counter = 0;
		while ((counter < this.affections.size()) && (!found)) {
			Affect x = this.affections.get(counter);
			found = x.indexName.equals(i.getName());
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
}
