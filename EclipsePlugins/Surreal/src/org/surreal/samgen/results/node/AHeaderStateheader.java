/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.Analysis;

@SuppressWarnings("nls")
public final class AHeaderStateheader extends PStateheader
{
    private TTokStateLeft _tokStateLeft_;
    private PFid _fid_;
    private TDot _dot_;
    private PSid _sid_;
    private TTokStateRight _tokStateRight_;

    public AHeaderStateheader()
    {
        // Constructor
    }

    public AHeaderStateheader(
        @SuppressWarnings("hiding") TTokStateLeft _tokStateLeft_,
        @SuppressWarnings("hiding") PFid _fid_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") PSid _sid_,
        @SuppressWarnings("hiding") TTokStateRight _tokStateRight_)
    {
        // Constructor
        setTokStateLeft(_tokStateLeft_);

        setFid(_fid_);

        setDot(_dot_);

        setSid(_sid_);

        setTokStateRight(_tokStateRight_);

    }

    @Override
    public Object clone()
    {
        return new AHeaderStateheader(
            cloneNode(this._tokStateLeft_),
            cloneNode(this._fid_),
            cloneNode(this._dot_),
            cloneNode(this._sid_),
            cloneNode(this._tokStateRight_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHeaderStateheader(this);
    }

    public TTokStateLeft getTokStateLeft()
    {
        return this._tokStateLeft_;
    }

    public void setTokStateLeft(TTokStateLeft node)
    {
        if(this._tokStateLeft_ != null)
        {
            this._tokStateLeft_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tokStateLeft_ = node;
    }

    public PFid getFid()
    {
        return this._fid_;
    }

    public void setFid(PFid node)
    {
        if(this._fid_ != null)
        {
            this._fid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fid_ = node;
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

    public PSid getSid()
    {
        return this._sid_;
    }

    public void setSid(PSid node)
    {
        if(this._sid_ != null)
        {
            this._sid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sid_ = node;
    }

    public TTokStateRight getTokStateRight()
    {
        return this._tokStateRight_;
    }

    public void setTokStateRight(TTokStateRight node)
    {
        if(this._tokStateRight_ != null)
        {
            this._tokStateRight_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tokStateRight_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tokStateLeft_)
            + toString(this._fid_)
            + toString(this._dot_)
            + toString(this._sid_)
            + toString(this._tokStateRight_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tokStateLeft_ == child)
        {
            this._tokStateLeft_ = null;
            return;
        }

        if(this._fid_ == child)
        {
            this._fid_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._sid_ == child)
        {
            this._sid_ = null;
            return;
        }

        if(this._tokStateRight_ == child)
        {
            this._tokStateRight_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tokStateLeft_ == oldChild)
        {
            setTokStateLeft((TTokStateLeft) newChild);
            return;
        }

        if(this._fid_ == oldChild)
        {
            setFid((PFid) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._sid_ == oldChild)
        {
            setSid((PSid) newChild);
            return;
        }

        if(this._tokStateRight_ == oldChild)
        {
            setTokStateRight((TTokStateRight) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
