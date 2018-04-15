/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AMultiRange extends PRange
{
    private TNumber _number_;
    private PRangeRest _rangeRest_;

    public AMultiRange()
    {
        // Constructor
    }

    public AMultiRange(
        @SuppressWarnings("hiding") TNumber _number_,
        @SuppressWarnings("hiding") PRangeRest _rangeRest_)
    {
        // Constructor
        setNumber(_number_);

        setRangeRest(_rangeRest_);

    }

    @Override
    public Object clone()
    {
        return new AMultiRange(
            cloneNode(this._number_),
            cloneNode(this._rangeRest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiRange(this);
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    public PRangeRest getRangeRest()
    {
        return this._rangeRest_;
    }

    public void setRangeRest(PRangeRest node)
    {
        if(this._rangeRest_ != null)
        {
            this._rangeRest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rangeRest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._number_)
            + toString(this._rangeRest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        if(this._rangeRest_ == child)
        {
            this._rangeRest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        if(this._rangeRest_ == oldChild)
        {
            setRangeRest((PRangeRest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}