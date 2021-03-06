/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AStraightPatternKeyword extends PPatternKeyword
{
    private TKeywordStraight _keywordStraight_;

    public AStraightPatternKeyword()
    {
        // Constructor
    }

    public AStraightPatternKeyword(
        @SuppressWarnings("hiding") TKeywordStraight _keywordStraight_)
    {
        // Constructor
        setKeywordStraight(_keywordStraight_);

    }

    @Override
    public Object clone()
    {
        return new AStraightPatternKeyword(
            cloneNode(this._keywordStraight_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStraightPatternKeyword(this);
    }

    public TKeywordStraight getKeywordStraight()
    {
        return this._keywordStraight_;
    }

    public void setKeywordStraight(TKeywordStraight node)
    {
        if(this._keywordStraight_ != null)
        {
            this._keywordStraight_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordStraight_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordStraight_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordStraight_ == child)
        {
            this._keywordStraight_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordStraight_ == oldChild)
        {
            setKeywordStraight((TKeywordStraight) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
