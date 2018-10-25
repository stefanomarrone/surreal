/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.node;

import org.surreal.samgen.modes.condition.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleTerm extends PTerm
{
    private PAtomic _atomic_;

    public ASimpleTerm()
    {
        // Constructor
    }

    public ASimpleTerm(
        @SuppressWarnings("hiding") PAtomic _atomic_)
    {
        // Constructor
        setAtomic(_atomic_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleTerm(
            cloneNode(this._atomic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleTerm(this);
    }

    public PAtomic getAtomic()
    {
        return this._atomic_;
    }

    public void setAtomic(PAtomic node)
    {
        if(this._atomic_ != null)
        {
            this._atomic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atomic_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atomic_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atomic_ == child)
        {
            this._atomic_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atomic_ == oldChild)
        {
            setAtomic((PAtomic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
