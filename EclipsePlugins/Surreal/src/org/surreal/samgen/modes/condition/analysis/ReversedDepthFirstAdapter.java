/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.analysis;

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
import org.surreal.samgen.modes.condition.node.ALeftFirst;
import org.surreal.samgen.modes.condition.node.ALtOp;
import org.surreal.samgen.modes.condition.node.ALteqOp;
import org.surreal.samgen.modes.condition.node.AMetaFirst;
import org.surreal.samgen.modes.condition.node.AMetaSecond;
import org.surreal.samgen.modes.condition.node.ANeqOp;
import org.surreal.samgen.modes.condition.node.ANestedTerm;
import org.surreal.samgen.modes.condition.node.ANumNrval;
import org.surreal.samgen.modes.condition.node.ANumRval;
import org.surreal.samgen.modes.condition.node.AOpAtomic;
import org.surreal.samgen.modes.condition.node.AOropBinop;
import org.surreal.samgen.modes.condition.node.ARightSecond;
import org.surreal.samgen.modes.condition.node.ASimpleCondition;
import org.surreal.samgen.modes.condition.node.ASimpleLval;
import org.surreal.samgen.modes.condition.node.ASimpleTerm;
import org.surreal.samgen.modes.condition.node.ASingletonAtomic;
import org.surreal.samgen.modes.condition.node.AStrRval;
import org.surreal.samgen.modes.condition.node.AUnaryTerm;
import org.surreal.samgen.modes.condition.node.Node;
import org.surreal.samgen.modes.condition.node.Start;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPCondition().apply(this);
        outStart(node);
    }

    public void inAComposedCondition(AComposedCondition node)
    {
        defaultIn(node);
    }

    public void outAComposedCondition(AComposedCondition node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComposedCondition(AComposedCondition node)
    {
        inAComposedCondition(node);
        if(node.getCondition() != null)
        {
            node.getCondition().apply(this);
        }
        if(node.getBinop() != null)
        {
            node.getBinop().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAComposedCondition(node);
    }

    public void inASimpleCondition(ASimpleCondition node)
    {
        defaultIn(node);
    }

    public void outASimpleCondition(ASimpleCondition node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleCondition(ASimpleCondition node)
    {
        inASimpleCondition(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outASimpleCondition(node);
    }

    public void inANestedTerm(ANestedTerm node)
    {
        defaultIn(node);
    }

    public void outANestedTerm(ANestedTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANestedTerm(ANestedTerm node)
    {
        inANestedTerm(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outANestedTerm(node);
    }

    public void inAUnaryTerm(AUnaryTerm node)
    {
        defaultIn(node);
    }

    public void outAUnaryTerm(AUnaryTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnaryTerm(AUnaryTerm node)
    {
        inAUnaryTerm(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        outAUnaryTerm(node);
    }

    public void inASimpleTerm(ASimpleTerm node)
    {
        defaultIn(node);
    }

    public void outASimpleTerm(ASimpleTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleTerm(ASimpleTerm node)
    {
        inASimpleTerm(node);
        if(node.getAtomic() != null)
        {
            node.getAtomic().apply(this);
        }
        outASimpleTerm(node);
    }

    public void inABinaryTerm(ABinaryTerm node)
    {
        defaultIn(node);
    }

    public void outABinaryTerm(ABinaryTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABinaryTerm(ABinaryTerm node)
    {
        inABinaryTerm(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getBinop() != null)
        {
            node.getBinop().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outABinaryTerm(node);
    }

    public void inAAndopBinop(AAndopBinop node)
    {
        defaultIn(node);
    }

    public void outAAndopBinop(AAndopBinop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndopBinop(AAndopBinop node)
    {
        inAAndopBinop(node);
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        outAAndopBinop(node);
    }

    public void inAOropBinop(AOropBinop node)
    {
        defaultIn(node);
    }

    public void outAOropBinop(AOropBinop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOropBinop(AOropBinop node)
    {
        inAOropBinop(node);
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        outAOropBinop(node);
    }

    public void inALeftFirst(ALeftFirst node)
    {
        defaultIn(node);
    }

    public void outALeftFirst(ALeftFirst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeftFirst(ALeftFirst node)
    {
        inALeftFirst(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outALeftFirst(node);
    }

    public void inAMetaFirst(AMetaFirst node)
    {
        defaultIn(node);
    }

    public void outAMetaFirst(AMetaFirst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMetaFirst(AMetaFirst node)
    {
        inAMetaFirst(node);
        if(node.getOpaqueexpr() != null)
        {
            node.getOpaqueexpr().apply(this);
        }
        outAMetaFirst(node);
    }

    public void inARightSecond(ARightSecond node)
    {
        defaultIn(node);
    }

    public void outARightSecond(ARightSecond node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARightSecond(ARightSecond node)
    {
        inARightSecond(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outARightSecond(node);
    }

    public void inAMetaSecond(AMetaSecond node)
    {
        defaultIn(node);
    }

    public void outAMetaSecond(AMetaSecond node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMetaSecond(AMetaSecond node)
    {
        inAMetaSecond(node);
        if(node.getOpaqueexpr() != null)
        {
            node.getOpaqueexpr().apply(this);
        }
        outAMetaSecond(node);
    }

    public void inAOpAtomic(AOpAtomic node)
    {
        defaultIn(node);
    }

    public void outAOpAtomic(AOpAtomic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpAtomic(AOpAtomic node)
    {
        inAOpAtomic(node);
        if(node.getRval() != null)
        {
            node.getRval().apply(this);
        }
        if(node.getOp() != null)
        {
            node.getOp().apply(this);
        }
        if(node.getLval() != null)
        {
            node.getLval().apply(this);
        }
        outAOpAtomic(node);
    }

    public void inASingletonAtomic(ASingletonAtomic node)
    {
        defaultIn(node);
    }

    public void outASingletonAtomic(ASingletonAtomic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingletonAtomic(ASingletonAtomic node)
    {
        inASingletonAtomic(node);
        if(node.getModename() != null)
        {
            node.getModename().apply(this);
        }
        outASingletonAtomic(node);
    }

    public void inANeqOp(ANeqOp node)
    {
        defaultIn(node);
    }

    public void outANeqOp(ANeqOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeqOp(ANeqOp node)
    {
        inANeqOp(node);
        if(node.getNeq() != null)
        {
            node.getNeq().apply(this);
        }
        outANeqOp(node);
    }

    public void inAEqOp(AEqOp node)
    {
        defaultIn(node);
    }

    public void outAEqOp(AEqOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqOp(AEqOp node)
    {
        inAEqOp(node);
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        outAEqOp(node);
    }

    public void inALteqOp(ALteqOp node)
    {
        defaultIn(node);
    }

    public void outALteqOp(ALteqOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALteqOp(ALteqOp node)
    {
        inALteqOp(node);
        if(node.getLteq() != null)
        {
            node.getLteq().apply(this);
        }
        outALteqOp(node);
    }

    public void inALtOp(ALtOp node)
    {
        defaultIn(node);
    }

    public void outALtOp(ALtOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtOp(ALtOp node)
    {
        inALtOp(node);
        if(node.getLt() != null)
        {
            node.getLt().apply(this);
        }
        outALtOp(node);
    }

    public void inAGteqOp(AGteqOp node)
    {
        defaultIn(node);
    }

    public void outAGteqOp(AGteqOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGteqOp(AGteqOp node)
    {
        inAGteqOp(node);
        if(node.getGteq() != null)
        {
            node.getGteq().apply(this);
        }
        outAGteqOp(node);
    }

    public void inAGtOp(AGtOp node)
    {
        defaultIn(node);
    }

    public void outAGtOp(AGtOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtOp(AGtOp node)
    {
        inAGtOp(node);
        if(node.getGt() != null)
        {
            node.getGt().apply(this);
        }
        outAGtOp(node);
    }

    public void inASimpleLval(ASimpleLval node)
    {
        defaultIn(node);
    }

    public void outASimpleLval(ASimpleLval node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleLval(ASimpleLval node)
    {
        inASimpleLval(node);
        if(node.getIndex() != null)
        {
            node.getIndex().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getProcess() != null)
        {
            node.getProcess().apply(this);
        }
        outASimpleLval(node);
    }

    public void inANumRval(ANumRval node)
    {
        defaultIn(node);
    }

    public void outANumRval(ANumRval node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumRval(ANumRval node)
    {
        inANumRval(node);
        if(node.getNrval() != null)
        {
            node.getNrval().apply(this);
        }
        outANumRval(node);
    }

    public void inAStrRval(AStrRval node)
    {
        defaultIn(node);
    }

    public void outAStrRval(AStrRval node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStrRval(AStrRval node)
    {
        inAStrRval(node);
        if(node.getCrval() != null)
        {
            node.getCrval().apply(this);
        }
        outAStrRval(node);
    }

    public void inAIdModename(AIdModename node)
    {
        defaultIn(node);
    }

    public void outAIdModename(AIdModename node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdModename(AIdModename node)
    {
        inAIdModename(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdModename(node);
    }

    public void inAIdProcess(AIdProcess node)
    {
        defaultIn(node);
    }

    public void outAIdProcess(AIdProcess node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdProcess(AIdProcess node)
    {
        inAIdProcess(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdProcess(node);
    }

    public void inAIdIndex(AIdIndex node)
    {
        defaultIn(node);
    }

    public void outAIdIndex(AIdIndex node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdIndex(AIdIndex node)
    {
        inAIdIndex(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdIndex(node);
    }

    public void inANumNrval(ANumNrval node)
    {
        defaultIn(node);
    }

    public void outANumNrval(ANumNrval node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumNrval(ANumNrval node)
    {
        inANumNrval(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumNrval(node);
    }

    public void inAIdCrval(AIdCrval node)
    {
        defaultIn(node);
    }

    public void outAIdCrval(AIdCrval node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdCrval(AIdCrval node)
    {
        inAIdCrval(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdCrval(node);
    }
}
