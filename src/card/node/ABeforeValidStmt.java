/* This file was generated by SableCC (http://www.sablecc.org/). */

package card.node;

import card.analysis.*;

@SuppressWarnings("nls")
public final class ABeforeValidStmt extends PValidStmt
{
    private PBeforStmt _beforStmt_;

    public ABeforeValidStmt()
    {
        // Constructor
    }

    public ABeforeValidStmt(
        @SuppressWarnings("hiding") PBeforStmt _beforStmt_)
    {
        // Constructor
        setBeforStmt(_beforStmt_);

    }

    @Override
    public Object clone()
    {
        return new ABeforeValidStmt(
            cloneNode(this._beforStmt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABeforeValidStmt(this);
    }

    public PBeforStmt getBeforStmt()
    {
        return this._beforStmt_;
    }

    public void setBeforStmt(PBeforStmt node)
    {
        if(this._beforStmt_ != null)
        {
            this._beforStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._beforStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._beforStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._beforStmt_ == child)
        {
            this._beforStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._beforStmt_ == oldChild)
        {
            setBeforStmt((PBeforStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
