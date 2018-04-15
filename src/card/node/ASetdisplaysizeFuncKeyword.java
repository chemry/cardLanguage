/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ASetdisplaysizeFuncKeyword extends PFuncKeyword
{
    private TFuncSetdisplaysize _funcSetdisplaysize_;

    public ASetdisplaysizeFuncKeyword()
    {
        // Constructor
    }

    public ASetdisplaysizeFuncKeyword(
        @SuppressWarnings("hiding") TFuncSetdisplaysize _funcSetdisplaysize_)
    {
        // Constructor
        setFuncSetdisplaysize(_funcSetdisplaysize_);

    }

    @Override
    public Object clone()
    {
        return new ASetdisplaysizeFuncKeyword(
            cloneNode(this._funcSetdisplaysize_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASetdisplaysizeFuncKeyword(this);
    }

    public TFuncSetdisplaysize getFuncSetdisplaysize()
    {
        return this._funcSetdisplaysize_;
    }

    public void setFuncSetdisplaysize(TFuncSetdisplaysize node)
    {
        if(this._funcSetdisplaysize_ != null)
        {
            this._funcSetdisplaysize_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcSetdisplaysize_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._funcSetdisplaysize_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcSetdisplaysize_ == child)
        {
            this._funcSetdisplaysize_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._funcSetdisplaysize_ == oldChild)
        {
            setFuncSetdisplaysize((TFuncSetdisplaysize) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}