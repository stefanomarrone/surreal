/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.Analysis;

@SuppressWarnings("nls")
public final class TTokStateRight extends Token
{
    public TTokStateRight()
    {
        super.setText(" <-");
    }

    public TTokStateRight(int line, int pos)
    {
        super.setText(" <-");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokStateRight(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokStateRight(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokStateRight text.");
    }
}
