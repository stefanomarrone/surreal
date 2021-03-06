/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.Analysis;

@SuppressWarnings("nls")
public final class AConcatSteps extends PSteps
{
    private PStep _step_;
    private PSteps _steps_;

    public AConcatSteps()
    {
        // Constructor
    }

    public AConcatSteps(
        @SuppressWarnings("hiding") PStep _step_,
        @SuppressWarnings("hiding") PSteps _steps_)
    {
        // Constructor
        setStep(_step_);

        setSteps(_steps_);

    }

    @Override
    public Object clone()
    {
        return new AConcatSteps(
            cloneNode(this._step_),
            cloneNode(this._steps_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConcatSteps(this);
    }

    public PStep getStep()
    {
        return this._step_;
    }

    public void setStep(PStep node)
    {
        if(this._step_ != null)
        {
            this._step_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._step_ = node;
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
            + toString(this._step_)
            + toString(this._steps_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._step_ == child)
        {
            this._step_ = null;
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
        if(this._step_ == oldChild)
        {
            setStep((PStep) newChild);
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
