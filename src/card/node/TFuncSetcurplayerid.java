/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TFuncSetcurplayerid extends Token
{
    public TFuncSetcurplayerid()
    {
        super.setText("setCurPlayerID");
    }

    public TFuncSetcurplayerid(int line, int pos)
    {
        super.setText("setCurPlayerID");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFuncSetcurplayerid(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFuncSetcurplayerid(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFuncSetcurplayerid text.");
    }
}
