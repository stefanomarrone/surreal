/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.node;

import org.surreal.samgen.modes.condition.analysis.Analysis;

@SuppressWarnings("nls")
public final class TSpaces extends Token
{
    public TSpaces(String text)
    {
        setText(text);
    }

    public TSpaces(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSpaces(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSpaces(this);
    }
}
