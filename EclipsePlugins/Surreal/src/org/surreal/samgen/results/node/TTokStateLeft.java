/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.node;

import org.surreal.samgen.results.analysis.Analysis;

@SuppressWarnings("nls")
public final class TTokStateLeft extends Token
{
    public TTokStateLeft()
    {
        super.setText("-> State: ");
    }

    public TTokStateLeft(int line, int pos)
    {
        super.setText("-> State: ");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokStateLeft(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokStateLeft(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokStateLeft text.");
    }
}
