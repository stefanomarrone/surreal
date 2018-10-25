/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.*;

@SuppressWarnings("nls")
public final class ANumValue extends PValue
{
    private PNrval _nrval_;

    public ANumValue()
    {
        // Constructor
    }

    public ANumValue(
        @SuppressWarnings("hiding") PNrval _nrval_)
    {
        // Constructor
        setNrval(_nrval_);

    }

    @Override
    public Object clone()
    {
        return new ANumValue(
            cloneNode(this._nrval_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumValue(this);
    }

    public PNrval getNrval()
    {
        return this._nrval_;
    }

    public void setNrval(PNrval node)
    {
        if(this._nrval_ != null)
        {
            this._nrval_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nrval_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nrval_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nrval_ == child)
        {
            this._nrval_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nrval_ == oldChild)
        {
            setNrval((PNrval) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
