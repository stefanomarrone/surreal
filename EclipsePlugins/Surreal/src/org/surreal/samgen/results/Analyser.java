package org.surreal.samgen.results;

import java.util.Stack;
import java.util.Vector;

import org.surreal.samgen.results.analysis.DepthFirstAdapter;
import org.surreal.samgen.results.node.AEventStep;
import org.surreal.samgen.results.node.AIdGlobalname;
import org.surreal.samgen.results.node.AIdLabel;
import org.surreal.samgen.results.node.AIdSrcmode;
import org.surreal.samgen.results.node.AIdTrgmode;
import org.surreal.samgen.results.node.ANumSid;
import org.surreal.samgen.results.node.Start;

public abstract class Analyser extends DepthFirstAdapter {
	
	protected String src;
	
	protected String trg;
	
	protected Vector<Step> seq;
	
	protected int stepCounter;
	
	protected Stack<String> minibucket;
	
	protected EventFactory ef;
	
    public Analyser() {
		this.ef = null;
	}

    public Analyser(Vector<String> ms) {
		this.ef = new EventFactory(ms);
	}

	public void inStart(Start node) {
        this.reset();
    }

    private void reset() {
    	this.stepCounter = -1;
    	this.src = null;
    	this.trg = null;
    	this.seq = new Vector<Step>();
    	this.minibucket = new Stack<String>();
    }
    
    public void inAIdSrcmode(AIdSrcmode node) {
        this.src = node.getIdentifier().getText();
    }

    public void inAIdTrgmode(AIdTrgmode node) {
        this.trg = node.getIdentifier().getText();
    }

    public String getSourceMode() {
		return this.src;
	}
    
    public int getCounterXLenght() {
    	return this.stepCounter + 1;
    }

	public String getTargetMode() {
		return this.trg;
	}

	public Vector<Step> getSequence() {
		return this.seq;
	}
	
    public void inANumSid(ANumSid node) {
        String nextStr = node.getNumber().toString().trim();
        int next = (new Integer(nextStr)).intValue();
        boolean cont = (this.stepCounter == next - 1);
        this.stepCounter = next - 1;
        if (cont == false) {
        	this.seq.add(stepCounter, new Step());
        }
    }
    
    public void inAIdGlobalname(AIdGlobalname node) {
    	this.minibucket.push(node.getIdentifier().getText().trim());
    }

    public void inAIdLabel(AIdLabel node) {
    	this.minibucket.push(node.getIdentifier().getText().trim());
    }

    public void outAEventStep(AEventStep node) {
    	String value = this.minibucket.pop();
    	String name = this.minibucket.pop();
    	Event e = this.ef.genEvent(name,value);
    	this.seq.elementAt(this.stepCounter).addEvent(e);
    }
    
    public boolean isPropertyChecked() {
    	return this.stepCounter == 0;
    }
}