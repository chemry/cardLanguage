/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class TKeywordIsvalidcombination extends Token
{
    public TKeywordIsvalidcombination()
    {
        super.setText("isValidCombination");
    }

    public TKeywordIsvalidcombination(int line, int pos)
    {
        super.setText("isValidCombination");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKeywordIsvalidcombination(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKeywordIsvalidcombination(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKeywordIsvalidcombination text.");
    }
}
