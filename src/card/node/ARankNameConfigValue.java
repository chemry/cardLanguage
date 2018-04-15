/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ARankNameConfigValue extends PConfigValue
{
    private PRankName _rankName_;

    public ARankNameConfigValue()
    {
        // Constructor
    }

    public ARankNameConfigValue(
        @SuppressWarnings("hiding") PRankName _rankName_)
    {
        // Constructor
        setRankName(_rankName_);

    }

    @Override
    public Object clone()
    {
        return new ARankNameConfigValue(
            cloneNode(this._rankName_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARankNameConfigValue(this);
    }

    public PRankName getRankName()
    {
        return this._rankName_;
    }

    public void setRankName(PRankName node)
    {
        if(this._rankName_ != null)
        {
            this._rankName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rankName_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._rankName_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rankName_ == child)
        {
            this._rankName_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._rankName_ == oldChild)
        {
            setRankName((PRankName) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}