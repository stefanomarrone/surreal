/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.node;

import org.surreal.samgen.modes.condition.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASimpleLval extends PLval
{
    private PProcess _process_;
    private TDot _dot_;
    private PIndex _index_;

    public ASimpleLval()
    {
        // Constructor
    }

    public ASimpleLval(
        @SuppressWarnings("hiding") PProcess _process_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") PIndex _index_)
    {
        // Constructor
        setProcess(_process_);

        setDot(_dot_);

        setIndex(_index_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleLval(
            cloneNode(this._process_),
            cloneNode(this._dot_),
            cloneNode(this._index_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleLval(this);
    }

    public PProcess getProcess()
    {
        return this._process_;
    }

    public void setProcess(PProcess node)
    {
        if(this._process_ != null)
        {
            this._process_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._process_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public PIndex getIndex()
    {
        return this._index_;
    }

    public void setIndex(PIndex node)
    {
        if(this._index_ != null)
        {
            this._index_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._index_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._process_)
            + toString(this._dot_)
            + toString(this._index_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._process_ == child)
        {
            this._process_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._index_ == child)
        {
            this._index_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._process_ == oldChild)
        {
            setProcess((PProcess) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._index_ == oldChild)
        {
            setIndex((PIndex) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
