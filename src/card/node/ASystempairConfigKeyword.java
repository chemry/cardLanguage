/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ASystempairConfigKeyword extends PConfigKeyword
{
    private TKeywordSystem _keywordSystem_;

    public ASystempairConfigKeyword()
    {
        // Constructor
    }

    public ASystempairConfigKeyword(
        @SuppressWarnings("hiding") TKeywordSystem _keywordSystem_)
    {
        // Constructor
        setKeywordSystem(_keywordSystem_);

    }

    @Override
    public Object clone()
    {
        return new ASystempairConfigKeyword(
            cloneNode(this._keywordSystem_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASystempairConfigKeyword(this);
    }

    public TKeywordSystem getKeywordSystem()
    {
        return this._keywordSystem_;
    }

    public void setKeywordSystem(TKeywordSystem node)
    {
        if(this._keywordSystem_ != null)
        {
            this._keywordSystem_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordSystem_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordSystem_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordSystem_ == child)
        {
            this._keywordSystem_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordSystem_ == oldChild)
        {
            setKeywordSystem((TKeywordSystem) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}