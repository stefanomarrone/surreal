package org.surreal.samgen.results;

import org.surreal.samgen.results.node.ABmcResult;
import org.surreal.samgen.results.node.ACtrResult;
import org.surreal.samgen.results.node.AEventStep;
import org.surreal.samgen.results.node.AIdGlobalname;
import org.surreal.samgen.results.node.AIdLabel;
import org.surreal.samgen.results.node.ANoctrResult;
import org.surreal.samgen.results.node.ANumSid;
import org.surreal.samgen.results.node.Start;

public class TrueFalseAnalyser extends Analyser {
		
	protected boolean outcome;
	
	@Override
	public boolean isPropertyChecked() {
		return this.outcome;
	}

	public void inANoctrResult(ANoctrResult node) {
        this.outcome = true;
    }

    public void inACtrResult(ACtrResult node) {
        this.outcome = false;
    }

    public void inABmcResult(ABmcResult node) {
        this.outcome = false;
    }
    
    // Old fashioned ....
	public void inStart(Start node) {
    }
    
    public void inANumSid(ANumSid node) {
    }
    
    public void inAIdGlobalname(AIdGlobalname node) {
    }

    public void inAIdLabel(AIdLabel node) {
    }

    public void outAEventStep(AEventStep node) {
    }
}