/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ANextConfigKeyword extends PConfigKeyword
{
    private TKeywordNext _keywordNext_;

    public ANextConfigKeyword()
    {
        // Constructor
    }

    public ANextConfigKeyword(
        @SuppressWarnings("hiding") TKeywordNext _keywordNext_)
    {
        // Constructor
        setKeywordNext(_keywordNext_);

    }

    @Override
    public Object clone()
    {
        return new ANextConfigKeyword(
            cloneNode(this._keywordNext_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANextConfigKeyword(this);
    }

    public TKeywordNext getKeywordNext()
    {
        return this._keywordNext_;
    }

    public void setKeywordNext(TKeywordNext node)
    {
        if(this._keywordNext_ != null)
        {
            this._keywordNext_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordNext_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordNext_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordNext_ == child)
        {
            this._keywordNext_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordNext_ == oldChild)
        {
            setKeywordNext((TKeywordNext) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
