package org.surreal.samgen.modes;

import java.util.Vector;

import org.surreal.samgen.Transformation;
import org.surreal.samgen.results.ResultTranslator;
import org.surreal.samgen.results.Step;

public class Behaviour {
	
	protected Vector<String> modes;
	
	protected Transition[][] sm;
	
	public Behaviour(Vector<String> blueprint) {
		this.modes = blueprint;
		int len = blueprint.size();
		sm = new Transition[len][len];
 	}
	
	protected int getIndex(String mode) {
		int len = this.modes.size();
		int retval = -1;
		int i = 0;
		while ((i < len) && (retval == -1)) {
			if (mode.equals(this.modes.elementAt(i))) {
				retval = i;
			}
			i++;
		}		
		return retval;
	}
	
	public Transition getTransition(String src, String trg) {
		int isrc = this.getIndex(src);
		int itrg = this.getIndex(trg);
		return this.sm[isrc][itrg];
	}
	
	public void setTransition(String src, String trg, Transition t) {
		int isrc = this.getIndex(src);
		int itrg = this.getIndex(trg);
		this.sm[isrc][itrg] = t;
	}
	
	public void setTransition(String src, String trg, Vector<Step> v) {
		int isrc = this.getIndex(src);
		int itrg = this.getIndex(trg);
		this.sm[isrc][itrg] = new Transition(v);
	}

	public void setTransition(String src, String trg, Vector<Step> v, int i) {
		int isrc = this.getIndex(src);
		int itrg = this.getIndex(trg);
		this.sm[isrc][itrg] = new Transition(v,i);
	}

	public void addToSequence(String src, String trg, Step step) {
		int isrc = this.getIndex(src);
		int itrg = this.getIndex(trg);
		this.sm[isrc][itrg].addStep(step);
	}
	
	public String toString() {
		String retval = "";
		for (String src: this.modes) {
			for (String trg: this.modes) {
				retval += src + "->" + trg + ": ";
				retval +=  this.getTransition(src, trg).toString() + '\n';
			}
		}
		return retval;
	}
	
	public Vector<String> getNames() {
		return this.modes;
	}

	public void fill(String str) {
		if (!str.equals("")) {
			ResultTranslator rt = new ResultTranslator(this.getNames());
			rt.translate_ltl(str);
			String srcMode = rt.getStartingMode();
			String trgMode = rt.getTargetMode();
			int len = rt.getSpaceSize();
			Vector<Step> sequence = rt.getSequence();
			sequence = this.filter(sequence,srcMode,trgMode);
			this.setTransition(srcMode,trgMode,sequence,len);
		}
	}

	private Vector<Step> filter(Vector<Step> preliminary, String src, String trg) {
		int start = this.getFallingEdge(preliminary,src);
		int end = this.getRaisingEdge(preliminary,trg);
		if ((start != -1) && (end != -1)) {
			preliminary = this.cut(preliminary,start,end);
			preliminary = this.removeStates(preliminary);		
		}
		return preliminary;
	}

	private Vector<Step> removeStates(Vector<Step> preliminary) {
		for (Step s: preliminary) {
			s.cleanState();
		}
		return preliminary;
	}
	
	private int getRaisingEdge(Vector<Step> steps, String mode) {
		return this.getEdge(steps,mode,"FALSE","TRUE",false);
	}

	private int getFallingEdge(Vector<Step> steps, String mode) {
		return this.getEdge(steps,mode,"TRUE","FALSE",true);
	}

	private int getEdge(Vector<Step> steps, String mode, String oldlabel, String newlabel, boolean first_notlast) {
		int retval = -1;
		int size = steps.size();
		int firstIndex = -1;
		int lastIndex = -1;
		Step current = null;
		if (size > 1) {
			int i = 0;
			boolean firstFlag = false;
			while ((firstFlag == false) && (i < size)) {
				current = steps.elementAt(i);
				firstFlag = current.containsModeValue(mode,oldlabel);
				firstIndex = (firstFlag) ? i : -1;
				i++;
			}
			boolean secondFlag = false;
			while ((secondFlag == false) && (i < size)) {
				current = steps.elementAt(i);
				secondFlag = current.containsModeValue(mode,newlabel);
				lastIndex = (secondFlag) ? i : -1;
				i++;
			}
			if (secondFlag) {
				retval = (first_notlast) ? firstIndex: lastIndex;
			}
		}
		return retval;
	}

	private Vector<Step> cut(Vector<Step> steps, int start, int end) {
		Vector<Step> retval = new Vector<Step>();
		for (int counter = start; counter <= end; counter++) {
			retval.add(steps.elementAt(counter));
		}
		return retval;
	}

	public void bmc_shrink(Transformation trans) {
		ServiceModes smds = trans.getServiceModes();
		for (String s: this.modes) {
			for (String t: this.modes) {
				Transition tt = this.getTransition(s,t);
				if (tt != null) {
					int ttlen = tt.getLen();
					String report = trans.report_BMC(s,t,ttlen);
					Postprocessor pp = new BMCProcessor(smds);
					pp.buildEvolution(report);
					Behaviour sme = pp.getEvolution();
					Transition newtt = sme.getTransition(s,t);
					if (newtt != null) {
						if (newtt.getLen() < ttlen) {
							this.setTransition(s,t,newtt);
						}
					}
				}
			}
		}
	}
}