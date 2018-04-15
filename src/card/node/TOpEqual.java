/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TOpEqual extends Token
{
    public TOpEqual()
    {
        super.setText("=");
    }

    public TOpEqual(int line, int pos)
    {
        super.setText("=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOpEqual(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOpEqual(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOpEqual text.");
    }
}
