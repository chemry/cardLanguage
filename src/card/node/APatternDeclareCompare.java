/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class APatternDeclareCompare extends PPatternDeclareCompare
{
    private TOpLeftSm _opLeftSm_;
    private PPatternCompare _patternCompare_;
    private TOpRightSm _opRightSm_;
    private TOpComma _opComma_;

    public APatternDeclareCompare()
    {
        // Constructor
    }

    public APatternDeclareCompare(
        @SuppressWarnings("hiding") TOpLeftSm _opLeftSm_,
        @SuppressWarnings("hiding") PPatternCompare _patternCompare_,
        @SuppressWarnings("hiding") TOpRightSm _opRightSm_,
        @SuppressWarnings("hiding") TOpComma _opComma_)
    {
        // Constructor
        setOpLeftSm(_opLeftSm_);

        setPatternCompare(_patternCompare_);

        setOpRightSm(_opRightSm_);

        setOpComma(_opComma_);

    }

    @Override
    public Object clone()
    {
        return new APatternDeclareCompare(
            cloneNode(this._opLeftSm_),
            cloneNode(this._patternCompare_),
            cloneNode(this._opRightSm_),
            cloneNode(this._opComma_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPatternDeclareCompare(this);
    }

    public TOpLeftSm getOpLeftSm()
    {
        return this._opLeftSm_;
    }

    public void setOpLeftSm(TOpLeftSm node)
    {
        if(this._opLeftSm_ != null)
        {
            this._opLeftSm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opLeftSm_ = node;
    }

    public PPatternCompare getPatternCompare()
    {
        return this._patternCompare_;
    }

    public void setPatternCompare(PPatternCompare node)
    {
        if(this._patternCompare_ != null)
        {
            this._patternCompare_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._patternCompare_ = node;
    }

    public TOpRightSm getOpRightSm()
    {
        return this._opRightSm_;
    }

    public void setOpRightSm(TOpRightSm node)
    {
        if(this._opRightSm_ != null)
        {
            this._opRightSm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opRightSm_ = node;
    }

    public TOpComma getOpComma()
    {
        return this._opComma_;
    }

    public void setOpComma(TOpComma node)
    {
        if(this._opComma_ != null)
        {
            this._opComma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opComma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._opLeftSm_)
            + toString(this._patternCompare_)
            + toString(this._opRightSm_)
            + toString(this._opComma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._opLeftSm_ == child)
        {
            this._opLeftSm_ = null;
            return;
        }

        if(this._patternCompare_ == child)
        {
            this._patternCompare_ = null;
            return;
        }

        if(this._opRightSm_ == child)
        {
            this._opRightSm_ = null;
            return;
        }

        if(this._opComma_ == child)
        {
            this._opComma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._opLeftSm_ == oldChild)
        {
            setOpLeftSm((TOpLeftSm) newChild);
            return;
        }

        if(this._patternCompare_ == oldChild)
        {
            setPatternCompare((PPatternCompare) newChild);
            return;
        }

        if(this._opRightSm_ == oldChild)
        {
            setOpRightSm((TOpRightSm) newChild);
            return;
        }

        if(this._opComma_ == oldChild)
        {
            setOpComma((TOpComma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
