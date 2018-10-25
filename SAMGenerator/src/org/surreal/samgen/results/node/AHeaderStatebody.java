/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.*;

@SuppressWarnings("nls")
public final class AHeaderStatebody extends PStatebody
{
    private PStateheader _stateheader_;
    private PSteps _steps_;

    public AHeaderStatebody()
    {
        // Constructor
    }

    public AHeaderStatebody(
        @SuppressWarnings("hiding") PStateheader _stateheader_,
        @SuppressWarnings("hiding") PSteps _steps_)
    {
        // Constructor
        setStateheader(_stateheader_);

        setSteps(_steps_);

    }

    @Override
    public Object clone()
    {
        return new AHeaderStatebody(
            cloneNode(this._stateheader_),
            cloneNode(this._steps_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHeaderStatebody(this);
    }

    public PStateheader getStateheader()
    {
        return this._stateheader_;
    }

    public void setStateheader(PStateheader node)
    {
        if(this._stateheader_ != null)
        {
            this._stateheader_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stateheader_ = node;
    }

    public PSteps getSteps()
    {
        return this._steps_;
    }

    public void setSteps(PSteps node)
    {
        if(this._steps_ != null)
        {
            this._steps_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._steps_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stateheader_)
            + toString(this._steps_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stateheader_ == child)
        {
            this._stateheader_ = null;
            return;
        }

        if(this._steps_ == child)
        {
            this._steps_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stateheader_ == oldChild)
        {
            setStateheader((PStateheader) newChild);
            return;
        }

        if(this._steps_ == oldChild)
        {
            setSteps((PSteps) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
