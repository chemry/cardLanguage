/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ARankConfigKeyword extends PConfigKeyword
{
    private TKeywordRank _keywordRank_;

    public ARankConfigKeyword()
    {
        // Constructor
    }

    public ARankConfigKeyword(
        @SuppressWarnings("hiding") TKeywordRank _keywordRank_)
    {
        // Constructor
        setKeywordRank(_keywordRank_);

    }

    @Override
    public Object clone()
    {
        return new ARankConfigKeyword(
            cloneNode(this._keywordRank_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARankConfigKeyword(this);
    }

    public TKeywordRank getKeywordRank()
    {
        return this._keywordRank_;
    }

    public void setKeywordRank(TKeywordRank node)
    {
        if(this._keywordRank_ != null)
        {
            this._keywordRank_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordRank_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordRank_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordRank_ == child)
        {
            this._keywordRank_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordRank_ == oldChild)
        {
            setKeywordRank((TKeywordRank) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
