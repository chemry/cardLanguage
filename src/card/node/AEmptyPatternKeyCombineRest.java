/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyPatternKeyCombineRest extends PPatternKeyCombineRest
{

    public AEmptyPatternKeyCombineRest()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEmptyPatternKeyCombineRest();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyPatternKeyCombineRest(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
