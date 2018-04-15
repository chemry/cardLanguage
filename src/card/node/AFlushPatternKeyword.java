/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AFlushPatternKeyword extends PPatternKeyword
{
    private TKeywordFlush _keywordFlush_;

    public AFlushPatternKeyword()
    {
        // Constructor
    }

    public AFlushPatternKeyword(
        @SuppressWarnings("hiding") TKeywordFlush _keywordFlush_)
    {
        // Constructor
        setKeywordFlush(_keywordFlush_);

    }

    @Override
    public Object clone()
    {
        return new AFlushPatternKeyword(
            cloneNode(this._keywordFlush_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFlushPatternKeyword(this);
    }

    public TKeywordFlush getKeywordFlush()
    {
        return this._keywordFlush_;
    }

    public void setKeywordFlush(TKeywordFlush node)
    {
        if(this._keywordFlush_ != null)
        {
            this._keywordFlush_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordFlush_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordFlush_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordFlush_ == child)
        {
            this._keywordFlush_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordFlush_ == oldChild)
        {
            setKeywordFlush((TKeywordFlush) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
