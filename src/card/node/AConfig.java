/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import java.util.*;
import card.analysis.*;

@SuppressWarnings("nls")
public final class AConfig extends PConfig
{
    private TKeywordConfig _keywordConfig_;
    private TOpLeftLg _opLeftLg_;
    private final LinkedList<PConfigStmt> _configStmt_ = new LinkedList<PConfigStmt>();
    private TOpRightLg _opRightLg_;

    public AConfig()
    {
        // Constructor
    }

    public AConfig(
        @SuppressWarnings("hiding") TKeywordConfig _keywordConfig_,
        @SuppressWarnings("hiding") TOpLeftLg _opLeftLg_,
        @SuppressWarnings("hiding") List<PConfigStmt> _configStmt_,
        @SuppressWarnings("hiding") TOpRightLg _opRightLg_)
    {
        // Constructor
        setKeywordConfig(_keywordConfig_);

        setOpLeftLg(_opLeftLg_);

        setConfigStmt(_configStmt_);

        setOpRightLg(_opRightLg_);

    }

    @Override
    public Object clone()
    {
        return new AConfig(
            cloneNode(this._keywordConfig_),
            cloneNode(this._opLeftLg_),
            cloneList(this._configStmt_),
            cloneNode(this._opRightLg_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConfig(this);
    }

    public TKeywordConfig getKeywordConfig()
    {
        return this._keywordConfig_;
    }

    public void setKeywordConfig(TKeywordConfig node)
    {
        if(this._keywordConfig_ != null)
        {
            this._keywordConfig_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordConfig_ = node;
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

    public LinkedList<PConfigStmt> getConfigStmt()
    {
        return this._configStmt_;
    }

    public void setConfigStmt(List<PConfigStmt> list)
    {
        this._configStmt_.clear();
        this._configStmt_.addAll(list);
        for(PConfigStmt e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
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
            + toString(this._keywordConfig_)
            + toString(this._opLeftLg_)
            + toString(this._configStmt_)
            + toString(this._opRightLg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordConfig_ == child)
        {
            this._keywordConfig_ = null;
            return;
        }

        if(this._opLeftLg_ == child)
        {
            this._opLeftLg_ = null;
            return;
        }

        if(this._configStmt_.remove(child))
        {
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
        if(this._keywordConfig_ == oldChild)
        {
            setKeywordConfig((TKeywordConfig) newChild);
            return;
        }

        if(this._opLeftLg_ == oldChild)
        {
            setOpLeftLg((TOpLeftLg) newChild);
            return;
        }

        for(ListIterator<PConfigStmt> i = this._configStmt_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PConfigStmt) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._opRightLg_ == oldChild)
        {
            setOpRightLg((TOpRightLg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}