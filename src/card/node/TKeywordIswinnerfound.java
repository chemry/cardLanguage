/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TKeywordIswinnerfound extends Token
{
    public TKeywordIswinnerfound()
    {
        super.setText("isWinnerFound");
    }

    public TKeywordIswinnerfound(int line, int pos)
    {
        super.setText("isWinnerFound");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKeywordIswinnerfound(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKeywordIswinnerfound(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKeywordIswinnerfound text.");
    }
}