/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.Analysis;

@SuppressWarnings("nls")
public final class TOpaqueexpr extends Token
{
    public TOpaqueexpr(String text)
    {
        setText(text);
    }

    public TOpaqueexpr(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOpaqueexpr(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOpaqueexpr(this);
    }
}
