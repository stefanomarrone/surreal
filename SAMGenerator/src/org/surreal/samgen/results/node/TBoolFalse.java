/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.*;

@SuppressWarnings("nls")
public final class TBoolFalse extends Token
{
    public TBoolFalse()
    {
        super.setText("is false");
    }

    public TBoolFalse(int line, int pos)
    {
        super.setText("is false");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBoolFalse(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBoolFalse(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBoolFalse text.");
    }
}
