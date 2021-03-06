/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ABeforeBeforStmt extends PBeforStmt
{
    private TKeywordBefore _keywordBefore_;
    private TOpLeftLg _opLeftLg_;
    private TJavaLiteral _javaLiteral_;
    private TOpRightLg _opRightLg_;

    public ABeforeBeforStmt()
    {
        // Constructor
    }

    public ABeforeBeforStmt(
        @SuppressWarnings("hiding") TKeywordBefore _keywordBefore_,
        @SuppressWarnings("hiding") TOpLeftLg _opLeftLg_,
        @SuppressWarnings("hiding") TJavaLiteral _javaLiteral_,
        @SuppressWarnings("hiding") TOpRightLg _opRightLg_)
    {
        // Constructor
        setKeywordBefore(_keywordBefore_);

        setOpLeftLg(_opLeftLg_);

        setJavaLiteral(_javaLiteral_);

        setOpRightLg(_opRightLg_);

    }

    @Override
    public Object clone()
    {
        return new ABeforeBeforStmt(
            cloneNode(this._keywordBefore_),
            cloneNode(this._opLeftLg_),
            cloneNode(this._javaLiteral_),
            cloneNode(this._opRightLg_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABeforeBeforStmt(this);
    }

    public TKeywordBefore getKeywordBefore()
    {
        return this._keywordBefore_;
    }

    public void setKeywordBefore(TKeywordBefore node)
    {
        if(this._keywordBefore_ != null)
        {
            this._keywordBefore_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordBefore_ = node;
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

    public TJavaLiteral getJavaLiteral()
    {
        return this._javaLiteral_;
    }

    public void setJavaLiteral(TJavaLiteral node)
    {
        if(this._javaLiteral_ != null)
        {
            this._javaLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._javaLiteral_ = node;
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
            + toString(this._keywordBefore_)
            + toString(this._opLeftLg_)
            + toString(this._javaLiteral_)
            + toString(this._opRightLg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordBefore_ == child)
        {
            this._keywordBefore_ = null;
            return;
        }

        if(this._opLeftLg_ == child)
        {
            this._opLeftLg_ = null;
            return;
        }

        if(this._javaLiteral_ == child)
        {
            this._javaLiteral_ = null;
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
        if(this._keywordBefore_ == oldChild)
        {
            setKeywordBefore((TKeywordBefore) newChild);
            return;
        }

        if(this._opLeftLg_ == oldChild)
        {
            setOpLeftLg((TOpLeftLg) newChild);
            return;
        }

        if(this._javaLiteral_ == oldChild)
        {
            setJavaLiteral((TJavaLiteral) newChild);
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
