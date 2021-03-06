/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TKeywordInitcard extends Token
{
    public TKeywordInitcard()
    {
        super.setText("initCard");
    }

    public TKeywordInitcard(int line, int pos)
    {
        super.setText("initCard");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKeywordInitcard(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKeywordInitcard(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKeywordInitcard text.");
    }
}
