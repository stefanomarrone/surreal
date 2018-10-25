/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.*;

@SuppressWarnings("nls")
public final class AStrValue extends PValue
{
    private PCrval _crval_;

    public AStrValue()
    {
        // Constructor
    }

    public AStrValue(
        @SuppressWarnings("hiding") PCrval _crval_)
    {
        // Constructor
        setCrval(_crval_);

    }

    @Override
    public Object clone()
    {
        return new AStrValue(
            cloneNode(this._crval_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStrValue(this);
    }

    public PCrval getCrval()
    {
        return this._crval_;
    }

    public void setCrval(PCrval node)
    {
        if(this._crval_ != null)
        {
            this._crval_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._crval_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._crval_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._crval_ == child)
        {
            this._crval_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._crval_ == oldChild)
        {
            setCrval((PCrval) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
