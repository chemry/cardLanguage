/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TKeywordGetstatus extends Token
{
    public TKeywordGetstatus()
    {
        super.setText("getStatus");
    }

    public TKeywordGetstatus(int line, int pos)
    {
        super.setText("getStatus");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKeywordGetstatus(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKeywordGetstatus(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKeywordGetstatus text.");
    }
}
