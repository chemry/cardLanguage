/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ANoEmptyFuncPara extends PFuncPara
{
    private PPara _para_;
    private PFuncParaRest _funcParaRest_;

    public ANoEmptyFuncPara()
    {
        // Constructor
    }

    public ANoEmptyFuncPara(
        @SuppressWarnings("hiding") PPara _para_,
        @SuppressWarnings("hiding") PFuncParaRest _funcParaRest_)
    {
        // Constructor
        setPara(_para_);

        setFuncParaRest(_funcParaRest_);

    }

    @Override
    public Object clone()
    {
        return new ANoEmptyFuncPara(
            cloneNode(this._para_),
            cloneNode(this._funcParaRest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANoEmptyFuncPara(this);
    }

    public PPara getPara()
    {
        return this._para_;
    }

    public void setPara(PPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
    }

    public PFuncParaRest getFuncParaRest()
    {
        return this._funcParaRest_;
    }

    public void setFuncParaRest(PFuncParaRest node)
    {
        if(this._funcParaRest_ != null)
        {
            this._funcParaRest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcParaRest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._para_)
            + toString(this._funcParaRest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._funcParaRest_ == child)
        {
            this._funcParaRest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._para_ == oldChild)
        {
            setPara((PPara) newChild);
            return;
        }

        if(this._funcParaRest_ == oldChild)
        {
            setFuncParaRest((PFuncParaRest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}