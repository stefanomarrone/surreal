/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.node;

import org.surreal.samgen.modes.condition.analysis.Analysis;

@SuppressWarnings("nls")
public final class AGteqOp extends POp
{
    private TGteq _gteq_;

    public AGteqOp()
    {
        // Constructor
    }

    public AGteqOp(
        @SuppressWarnings("hiding") TGteq _gteq_)
    {
        // Constructor
        setGteq(_gteq_);

    }

    @Override
    public Object clone()
    {
        return new AGteqOp(
            cloneNode(this._gteq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGteqOp(this);
    }

    public TGteq getGteq()
    {
        return this._gteq_;
    }

    public void setGteq(TGteq node)
    {
        if(this._gteq_ != null)
        {
            this._gteq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._gteq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._gteq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._gteq_ == child)
        {
            this._gteq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._gteq_ == oldChild)
        {
            setGteq((TGteq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
