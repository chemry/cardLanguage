/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class AInitCardStmt extends PInitCardStmt
{
    private PInitStmt _initStmt_;
    private PInitStmtRest _initStmtRest_;

    public AInitCardStmt()
    {
        // Constructor
    }

    public AInitCardStmt(
        @SuppressWarnings("hiding") PInitStmt _initStmt_,
        @SuppressWarnings("hiding") PInitStmtRest _initStmtRest_)
    {
        // Constructor
        setInitStmt(_initStmt_);

        setInitStmtRest(_initStmtRest_);

    }

    @Override
    public Object clone()
    {
        return new AInitCardStmt(
            cloneNode(this._initStmt_),
            cloneNode(this._initStmtRest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInitCardStmt(this);
    }

    public PInitStmt getInitStmt()
    {
        return this._initStmt_;
    }

    public void setInitStmt(PInitStmt node)
    {
        if(this._initStmt_ != null)
        {
            this._initStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._initStmt_ = node;
    }

    public PInitStmtRest getInitStmtRest()
    {
        return this._initStmtRest_;
    }

    public void setInitStmtRest(PInitStmtRest node)
    {
        if(this._initStmtRest_ != null)
        {
            this._initStmtRest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._initStmtRest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._initStmt_)
            + toString(this._initStmtRest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._initStmt_ == child)
        {
            this._initStmt_ = null;
            return;
        }

        if(this._initStmtRest_ == child)
        {
            this._initStmtRest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._initStmt_ == oldChild)
        {
            setInitStmt((PInitStmt) newChild);
            return;
        }

        if(this._initStmtRest_ == oldChild)
        {
            setInitStmtRest((PInitStmtRest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}