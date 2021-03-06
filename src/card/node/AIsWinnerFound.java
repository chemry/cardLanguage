/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AIsWinnerFound extends PIsWinnerFound
{
    private TKeywordIswinnerfound _keywordIswinnerfound_;
    private TOpLeftSm _opLeftSm_;
    private PValidStmt _validStmt_;
    private TOpRightSm _opRightSm_;
    private TOpLeftLg _opLeftLg_;
    private TOpRightLg _opRightLg_;

    public AIsWinnerFound()
    {
        // Constructor
    }

    public AIsWinnerFound(
        @SuppressWarnings("hiding") TKeywordIswinnerfound _keywordIswinnerfound_,
        @SuppressWarnings("hiding") TOpLeftSm _opLeftSm_,
        @SuppressWarnings("hiding") PValidStmt _validStmt_,
        @SuppressWarnings("hiding") TOpRightSm _opRightSm_,
        @SuppressWarnings("hiding") TOpLeftLg _opLeftLg_,
        @SuppressWarnings("hiding") TOpRightLg _opRightLg_)
    {
        // Constructor
        setKeywordIswinnerfound(_keywordIswinnerfound_);

        setOpLeftSm(_opLeftSm_);

        setValidStmt(_validStmt_);

        setOpRightSm(_opRightSm_);

        setOpLeftLg(_opLeftLg_);

        setOpRightLg(_opRightLg_);

    }

    @Override
    public Object clone()
    {
        return new AIsWinnerFound(
            cloneNode(this._keywordIswinnerfound_),
            cloneNode(this._opLeftSm_),
            cloneNode(this._validStmt_),
            cloneNode(this._opRightSm_),
            cloneNode(this._opLeftLg_),
            cloneNode(this._opRightLg_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIsWinnerFound(this);
    }

    public TKeywordIswinnerfound getKeywordIswinnerfound()
    {
        return this._keywordIswinnerfound_;
    }

    public void setKeywordIswinnerfound(TKeywordIswinnerfound node)
    {
        if(this._keywordIswinnerfound_ != null)
        {
            this._keywordIswinnerfound_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordIswinnerfound_ = node;
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

    public PValidStmt getValidStmt()
    {
        return this._validStmt_;
    }

    public void setValidStmt(PValidStmt node)
    {
        if(this._validStmt_ != null)
        {
            this._validStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._validStmt_ = node;
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

    public TOpLeftLg getOpLeftLg()
    {
        return this._opLeftLg_;
    }

    public void setOpLeftLg(TOpLeftLg node)
    {
        if(this._opLeftLg_ != null)
        {
            this._opLeftLg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opLeftLg_ = node;
    }

    public TOpRightLg getOpRightLg()
    {
        return this._opRightLg_;
    }

    public void setOpRightLg(TOpRightLg node)
    {
        if(this._opRightLg_ != null)
        {
            this._opRightLg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opRightLg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordIswinnerfound_)
            + toString(this._opLeftSm_)
            + toString(this._validStmt_)
            + toString(this._opRightSm_)
            + toString(this._opLeftLg_)
            + toString(this._opRightLg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordIswinnerfound_ == child)
        {
            this._keywordIswinnerfound_ = null;
            return;
        }

        if(this._opLeftSm_ == child)
        {
            this._opLeftSm_ = null;
            return;
        }

        if(this._validStmt_ == child)
        {
            this._validStmt_ = null;
            return;
        }

        if(this._opRightSm_ == child)
        {
            this._opRightSm_ = null;
            return;
        }

        if(this._opLeftLg_ == child)
        {
            this._opLeftLg_ = null;
            return;
        }

        if(this._opRightLg_ == child)
        {
            this._opRightLg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordIswinnerfound_ == oldChild)
        {
            setKeywordIswinnerfound((TKeywordIswinnerfound) newChild);
            return;
        }

        if(this._opLeftSm_ == oldChild)
        {
            setOpLeftSm((TOpLeftSm) newChild);
            return;
        }

        if(this._validStmt_ == oldChild)
        {
            setValidStmt((PValidStmt) newChild);
            return;
        }

        if(this._opRightSm_ == oldChild)
        {
            setOpRightSm((TOpRightSm) newChild);
            return;
        }

        if(this._opLeftLg_ == oldChild)
        {
            setOpLeftLg((TOpLeftLg) newChild);
            return;
        }

        if(this._opRightLg_ == oldChild)
        {
            setOpRightLg((TOpRightLg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
