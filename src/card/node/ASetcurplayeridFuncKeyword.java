/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ASetcurplayeridFuncKeyword extends PFuncKeyword
{
    private TFuncSetcurplayerid _funcSetcurplayerid_;

    public ASetcurplayeridFuncKeyword()
    {
        // Constructor
    }

    public ASetcurplayeridFuncKeyword(
        @SuppressWarnings("hiding") TFuncSetcurplayerid _funcSetcurplayerid_)
    {
        // Constructor
        setFuncSetcurplayerid(_funcSetcurplayerid_);

    }

    @Override
    public Object clone()
    {
        return new ASetcurplayeridFuncKeyword(
            cloneNode(this._funcSetcurplayerid_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASetcurplayeridFuncKeyword(this);
    }

    public TFuncSetcurplayerid getFuncSetcurplayerid()
    {
        return this._funcSetcurplayerid_;
    }

    public void setFuncSetcurplayerid(TFuncSetcurplayerid node)
    {
        if(this._funcSetcurplayerid_ != null)
        {
            this._funcSetcurplayerid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcSetcurplayerid_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._funcSetcurplayerid_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcSetcurplayerid_ == child)
        {
            this._funcSetcurplayerid_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._funcSetcurplayerid_ == oldChild)
        {
            setFuncSetcurplayerid((TFuncSetcurplayerid) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
