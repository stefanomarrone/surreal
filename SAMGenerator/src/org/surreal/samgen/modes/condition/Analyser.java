package org.surreal.samgen.modes.condition;

import java.util.Stack;

import org.surreal.samgen.modes.condition.analysis.DepthFirstAdapter;
import org.surreal.samgen.modes.condition.node.AAndopBinop;
import org.surreal.samgen.modes.condition.node.ABinaryTerm;
import org.surreal.samgen.modes.condition.node.AComposedCondition;
import org.surreal.samgen.modes.condition.node.AEqOp;
import org.surreal.samgen.modes.condition.node.AGtOp;
import org.surreal.samgen.modes.condition.node.AGteqOp;
import org.surreal.samgen.modes.condition.node.AIdCrval;
import org.surreal.samgen.modes.condition.node.AIdIndex;
import org.surreal.samgen.modes.condition.node.AIdModename;
import org.surreal.samgen.modes.condition.node.AIdProcess;
import org.surreal.samgen.modes.condition.node.ALtOp;
import org.surreal.samgen.modes.condition.node.ALteqOp;
import org.surreal.samgen.modes.condition.node.ANeqOp;
import org.surreal.samgen.modes.condition.node.ANestedTerm;
import org.surreal.samgen.modes.condition.node.ANumNrval;
import org.surreal.samgen.modes.condition.node.AOpAtomic;
import org.surreal.samgen.modes.condition.node.AOropBinop;
import org.surreal.samgen.modes.condition.node.ASimpleLval;
import org.surreal.samgen.modes.condition.node.AUnaryTerm;
import org.surreal.samgen.modes.condition.node.Start;
import org.surreal.samgen.modes.condition.node.TIdentifier;
import org.surreal.samgen.utils.Utils;

public class Analyser extends DepthFirstAdapter {
	
	private Stack<String> stack = new Stack<String>();
	
	public Analyser() {
		this.stack = new Stack<String>();
	}
	
    public String getTranslated() {
    	return this.stack.peek();
    }

    public void inAIdProcess(AIdProcess node) {
    	TIdentifier id = node.getIdentifier();
        String initial = id.getText();
        String processed = Utils.processorize(initial);
        this.stack.push(processed);
    }
    
    public void inAIdIndex(AIdIndex node) {
        this.stack.push(node.getIdentifier().getText());
    }

    public void inANumNrval(ANumNrval node) {
        this.stack.push(node.getNumber().getText());
    }

    public void inAIdCrval(AIdCrval node) {
        this.stack.push(node.getIdentifier().getText());
    }

    public void inStart(Start node) {
        this.stack.clear();
    }
    
    public void inAEqOp(AEqOp node) {
        this.stack.push(" == ");
    }

    public void inANeqOp(ANeqOp node) {
        this.stack.push(" != ");
    }

    public void inALteqOp(ALteqOp node) {
        this.stack.push(" =< ");
    }

    public void inALtOp(ALtOp node) {
        this.stack.push(" < ");
    }

    public void inAGteqOp(AGteqOp node) {
        this.stack.push(" >= ");
    }

    public void inAGtOp(AGtOp node) {
        this.stack.push(" > ");
    }

    public void inAOropBinop(AOropBinop node) {
        this.stack.push(" | ");
    }

    public void inAAndopBinop(AAndopBinop node) {
        this.stack.push(" & ");
    }

    public void inAIdModename(AIdModename node) {
        this.stack.push(node.getIdentifier().getText());
    }
    
    public void outASimpleLval(ASimpleLval node) {
        String i = this.stack.pop();
        String p = this.stack.pop();
        this.stack.push(p + "." + i);
    }

    public void outAOpAtomic(AOpAtomic node) {
        String r = this.stack.pop();
        String op = this.stack.pop();
        String l = this.stack.pop();
        this.stack.push(l + op + r);
    }

    public void outANestedTerm(ANestedTerm node) {
        String t = this.stack.pop();
        this.stack.push("(" + t + ")");
    }

    public void outAUnaryTerm(AUnaryTerm node) {
        String t = this.stack.pop();
        this.stack.push("(!(" + t + "))");
    }

    public void outABinaryTerm(ABinaryTerm node) {
        String r = this.stack.pop();
        String op = this.stack.pop();
        String l = this.stack.pop();
        this.stack.push("(" + l + op + r + ")");
    }
    
    public void outAComposedCondition(AComposedCondition node) {
        String r = this.stack.pop();
        String op = this.stack.pop();
        String l = this.stack.pop();
        this.stack.push(l + op + r);
    }
}
