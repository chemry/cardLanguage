/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TKeywordDefaultstatus extends Token
{
    public TKeywordDefaultstatus()
    {
        super.setText("defaultStatus");
    }

    public TKeywordDefaultstatus(int line, int pos)
    {
        super.setText("defaultStatus");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKeywordDefaultstatus(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKeywordDefaultstatus(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKeywordDefaultstatus text.");
    }
}