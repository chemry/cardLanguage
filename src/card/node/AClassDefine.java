/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AClassDefine extends PClassDefine
{
    private TKeywordClass _keywordClass_;
    private TOpColon _opColon_;
    private PClassName _className_;
    private TOpSemi _opSemi_;

    public AClassDefine()
    {
        // Constructor
    }

    public AClassDefine(
        @SuppressWarnings("hiding") TKeywordClass _keywordClass_,
        @SuppressWarnings("hiding") TOpColon _opColon_,
        @SuppressWarnings("hiding") PClassName _className_,
        @SuppressWarnings("hiding") TOpSemi _opSemi_)
    {
        // Constructor
        setKeywordClass(_keywordClass_);

        setOpColon(_opColon_);

        setClassName(_className_);

        setOpSemi(_opSemi_);

    }

    @Override
    public Object clone()
    {
        return new AClassDefine(
            cloneNode(this._keywordClass_),
            cloneNode(this._opColon_),
            cloneNode(this._className_),
            cloneNode(this._opSemi_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassDefine(this);
    }

    public TKeywordClass getKeywordClass()
    {
        return this._keywordClass_;
    }

    public void setKeywordClass(TKeywordClass node)
    {
        if(this._keywordClass_ != null)
        {
            this._keywordClass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordClass_ = node;
    }

    public TOpColon getOpColon()
    {
        return this._opColon_;
    }

    public void setOpColon(TOpColon node)
    {
        if(this._opColon_ != null)
        {
            this._opColon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opColon_ = node;
    }

    public PClassName getClassName()
    {
        return this._className_;
    }

    public void setClassName(PClassName node)
    {
        if(this._className_ != null)
        {
            this._className_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._className_ = node;
    }

    public TOpSemi getOpSemi()
    {
        return this._opSemi_;
    }

    public void setOpSemi(TOpSemi node)
    {
        if(this._opSemi_ != null)
        {
            this._opSemi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opSemi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordClass_)
            + toString(this._opColon_)
            + toString(this._className_)
            + toString(this._opSemi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordClass_ == child)
        {
            this._keywordClass_ = null;
            return;
        }

        if(this._opColon_ == child)
        {
            this._opColon_ = null;
            return;
        }

        if(this._className_ == child)
        {
            this._className_ = null;
            return;
        }

        if(this._opSemi_ == child)
        {
            this._opSemi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordClass_ == oldChild)
        {
            setKeywordClass((TKeywordClass) newChild);
            return;
        }

        if(this._opColon_ == oldChild)
        {
            setOpColon((TOpColon) newChild);
            return;
        }

        if(this._className_ == oldChild)
        {
            setClassName((PClassName) newChild);
            return;
        }

        if(this._opSemi_ == oldChild)
        {
            setOpSemi((TOpSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
