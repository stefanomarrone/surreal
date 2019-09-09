/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.Analysis;

@SuppressWarnings("nls")
public final class TTkNoBound extends Token
{
    public TTkNoBound()
    {
        super.setText("-- no counterexample found with bound");
    }

    public TTkNoBound(int line, int pos)
    {
        super.setText("-- no counterexample found with bound");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTkNoBound(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTkNoBound(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTkNoBound text.");
    }
}