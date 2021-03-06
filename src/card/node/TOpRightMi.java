/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TOpRightMi extends Token
{
    public TOpRightMi()
    {
        super.setText("]");
    }

    public TOpRightMi(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOpRightMi(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOpRightMi(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOpRightMi text.");
    }
}
