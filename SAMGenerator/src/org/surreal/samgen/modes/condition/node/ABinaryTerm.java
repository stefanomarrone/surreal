/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.node;

import org.surreal.samgen.modes.condition.analysis.*;

@SuppressWarnings("nls")
public final class ABinaryTerm extends PTerm
{
    private TLPar _lPar_;
    private PFirst _first_;
    private PBinop _binop_;
    private PSecond _second_;
    private TRPar _rPar_;

    public ABinaryTerm()
    {
        // Constructor
    }

    public ABinaryTerm(
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PFirst _first_,
        @SuppressWarnings("hiding") PBinop _binop_,
        @SuppressWarnings("hiding") PSecond _second_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setLPar(_lPar_);

        setFirst(_first_);

        setBinop(_binop_);

        setSecond(_second_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new ABinaryTerm(
            cloneNode(this._lPar_),
            cloneNode(this._first_),
            cloneNode(this._binop_),
            cloneNode(this._second_),
            cloneNode(this._rPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABinaryTerm(this);
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PFirst getFirst()
    {
        return this._first_;
    }

    public void setFirst(PFirst node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public PBinop getBinop()
    {
        return this._binop_;
    }

    public void setBinop(PBinop node)
    {
        if(this._binop_ != null)
        {
            this._binop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._binop_ = node;
    }

    public PSecond getSecond()
    {
        return this._second_;
    }

    public void setSecond(PSecond node)
    {
        if(this._second_ != null)
        {
            this._second_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._second_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lPar_)
            + toString(this._first_)
            + toString(this._binop_)
            + toString(this._second_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._binop_ == child)
        {
            this._binop_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._first_ == oldChild)
        {
            setFirst((PFirst) newChild);
            return;
        }

        if(this._binop_ == oldChild)
        {
            setBinop((PBinop) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((PSecond) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
