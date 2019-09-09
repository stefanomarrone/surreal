package org.surreal.engine.solver.specific;

import java.util.Vector;

import org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl;
import org.surreal.SurvivabilityProfile.SAMExtensions.impl.scenarioImpl;
import org.surreal.common.modeloracle.SAMHandler;

public class StateMachineQuery {
	
	private SAMHandler sm;
	
	public StateMachineQuery(SAMHandler sm) {
		this.sm = sm;
	}

	public modeImpl getMode(String name) {
		Vector<modeImpl> list = this.sm.getModes();		
		modeImpl retval = null;
		int counter = 0;
		while ((retval == null) && (counter < list.size())) {
			modeImpl temp = list.get(counter);			
			if (temp.getBase_State().getName().equals(name)) {
				retval = temp;
			}
			counter++;
		}
		return retval;
	}

	public Vector<modeImpl> getHigherPriorityModes(int priority) {
		Vector<modeImpl> retval = new Vector<modeImpl>();
		for (modeImpl m: this.sm.getModes()) {
			if (m.getSeverity() < priority) {
				retval.add(m);
			}			
		}
		return retval; 
	}

	public Vector<modeImpl> getHigherPriorityOrderedModes(int priority) {
		Vector<modeImpl> retval = this.getHigherPriorityModes(priority);
		boolean swapped = true;
		int end = retval.size() - 1;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < end; i++) {
				modeImpl tempL = retval.elementAt(i);
				modeImpl tempR = retval.elementAt(i+1);
				if (tempL.getSeverity() > tempR.getSeverity()) {
					swapped = true;
					retval.set(i,tempR);
					retval.set(i+1,tempL);
				}
			}
		}
		return retval; 
	}

	public Vector<modeImpl> getLowerPriorityModes(int priority) {
		Vector<modeImpl> retval = new Vector<modeImpl>();
		Vector<modeImpl> list = this.sm.getModes();
		for (modeImpl m: list) {
			if (m.getSeverity() > priority) {
				retval.add(m);
			}			
		}
		return retval; 
	}

	public boolean existingTransition(modeImpl from, modeImpl to) {
		boolean retval = false;
		int counter = 0;
		String fromName = from.getBase_State().getName();
		String toName = to.getBase_State().getName();
		Vector<scenarioImpl> transitions = this.sm.getScenarios();
		while ((retval == false) && (counter < transitions.size())) {
			scenarioImpl temp = transitions.get(counter);
			String tempFromName = temp.getBase_Transition().getSource().getName();
			String tempToName = temp.getBase_Transition().getTarget().getName();
			retval = tempFromName.equals(fromName) && tempToName.equals(toName);				
			counter++;
		}
		return retval;
	}
	
	public boolean existingPath(modeImpl from, modeImpl to) {
		boolean retval = this.innerExistingPath(from,to,false);
		return retval;
	}

	public boolean existingPathWithTabu(modeImpl from, modeImpl to) {
		boolean retval = this.innerExistingPath(from,to,true);
		return retval;
	}

	private boolean innerExistingPath(modeImpl from, modeImpl to, boolean tabuFlag) {
		boolean retval = false;

		Vector<String> all = new Vector<String>();
		for (modeImpl m: this.sm.getModes()) {
			boolean priorityFlag = m.getSeverity() < from.getSeverity();
			boolean toAdd = (!tabuFlag) || priorityFlag;
			if (toAdd == true) {
				all.add(m.getBase_State().getName());
			}
		}

		boolean plateau = false;
		Vector<String> reachable = new Vector<String>();
		reachable.add(from.getBase_State().getName());

		while (!(plateau || retval)) {
			Vector<String> frontier = new Vector<String>();
			for (String rName: reachable) {
				for (String aName: all) {
					if (!reachable.contains(aName)) {
						modeImpl r = this.getMode(rName);
						modeImpl a = this.getMode(aName);
						if (this.existingTransition(r,a)) {
							frontier.add(aName);
						}
					}
				}
			}

			reachable.addAll(frontier);
			plateau = (frontier.size() == 0);			
//			int counter = 0;
//			while ((plateau == true) && (counter < frontier.size())) {
//				String fname = frontier.elementAt(counter);
//				plateau = reachable.contains(fname);
//				counter++;
//			}
			retval = reachable.contains(to.getBase_State().getName());
		}
		return retval;
	}

	public modeImpl getBestServiceMode() {
		modeImpl best = this.sm.getModes().get(0);
		for (modeImpl temp: this.sm.getModes()) {
			if (temp.getSeverity() < best.getSeverity()) {
				best = temp;
			}
		}		
		return best;
	}

	public Vector<modeImpl> getModesExcept(modeImpl inMode) {
		String inName = inMode.getBase_State().getName();
		Vector<modeImpl> retval = new Vector<modeImpl>();
		for (modeImpl temp: this.sm.getModes()) {
			if (!temp.getBase_State().getName().equals(inName)) {
				retval.add(temp);
			}
		}		
		return retval;
	}

}
