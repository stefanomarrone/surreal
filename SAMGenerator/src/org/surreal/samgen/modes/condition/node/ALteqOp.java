/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.node;

import org.surreal.samgen.modes.condition.analysis.*;

@SuppressWarnings("nls")
public final class ALteqOp extends POp
{
    private TLteq _lteq_;

    public ALteqOp()
    {
        // Constructor
    }

    public ALteqOp(
        @SuppressWarnings("hiding") TLteq _lteq_)
    {
        // Constructor
        setLteq(_lteq_);

    }

    @Override
    public Object clone()
    {
        return new ALteqOp(
            cloneNode(this._lteq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALteqOp(this);
    }

    public TLteq getLteq()
    {
        return this._lteq_;
    }

    public void setLteq(TLteq node)
    {
        if(this._lteq_ != null)
        {
            this._lteq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lteq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lteq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lteq_ == child)
        {
            this._lteq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lteq_ == oldChild)
        {
            setLteq((TLteq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
