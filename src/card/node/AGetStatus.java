/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AGetStatus extends PGetStatus
{
    private TKeywordGetstatus _keywordGetstatus_;
    private TOpLeftSm _opLeftSm_;
    private TOpRightSm _opRightSm_;
    private TOpLeftLg _opLeftLg_;
    private TOpRightLg _opRightLg_;

    public AGetStatus()
    {
        // Constructor
    }

    public AGetStatus(
        @SuppressWarnings("hiding") TKeywordGetstatus _keywordGetstatus_,
        @SuppressWarnings("hiding") TOpLeftSm _opLeftSm_,
        @SuppressWarnings("hiding") TOpRightSm _opRightSm_,
        @SuppressWarnings("hiding") TOpLeftLg _opLeftLg_,
        @SuppressWarnings("hiding") TOpRightLg _opRightLg_)
    {
        // Constructor
        setKeywordGetstatus(_keywordGetstatus_);

        setOpLeftSm(_opLeftSm_);

        setOpRightSm(_opRightSm_);

        setOpLeftLg(_opLeftLg_);

        setOpRightLg(_opRightLg_);

    }

    @Override
    public Object clone()
    {
        return new AGetStatus(
            cloneNode(this._keywordGetstatus_),
            cloneNode(this._opLeftSm_),
            cloneNode(this._opRightSm_),
            cloneNode(this._opLeftLg_),
            cloneNode(this._opRightLg_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGetStatus(this);
    }

    public TKeywordGetstatus getKeywordGetstatus()
    {
        return this._keywordGetstatus_;
    }

    public void setKeywordGetstatus(TKeywordGetstatus node)
    {
        if(this._keywordGetstatus_ != null)
        {
            this._keywordGetstatus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordGetstatus_ = node;
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
            + toString(this._keywordGetstatus_)
            + toString(this._opLeftSm_)
            + toString(this._opRightSm_)
            + toString(this._opLeftLg_)
            + toString(this._opRightLg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordGetstatus_ == child)
        {
            this._keywordGetstatus_ = null;
            return;
        }

        if(this._opLeftSm_ == child)
        {
            this._opLeftSm_ = null;
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
        if(this._keywordGetstatus_ == oldChild)
        {
            setKeywordGetstatus((TKeywordGetstatus) newChild);
            return;
        }

        if(this._opLeftSm_ == oldChild)
        {
            setOpLeftSm((TOpLeftSm) newChild);
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
