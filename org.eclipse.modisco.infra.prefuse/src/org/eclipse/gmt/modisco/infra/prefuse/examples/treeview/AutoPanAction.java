/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.gmt.modisco.infra.prefuse.examples.treeview;

import java.awt.geom.Point2D;

import prefuse.Constants;
import prefuse.Visualization;
import prefuse.action.Action;
import prefuse.data.tuple.TupleSet;
import prefuse.visual.VisualItem;


public class AutoPanAction extends Action {
    private Point2D m_start = new Point2D.Double();
    private Point2D m_end   = new Point2D.Double();
    private Point2D m_cur   = new Point2D.Double();
    private int     m_bias  = 150;

    private final TreeView treeView;
    public AutoPanAction(TreeView treeViewParameter) {
    	this.treeView = treeViewParameter;
    }

    public void run(double frac) {
        TupleSet ts = this.m_vis.getFocusGroup(Visualization.FOCUS_ITEMS);
        if ( ts.getTupleCount() == 0 )
            return;

        if ( frac == 0.0 ) {
            int xbias=0, ybias=0;
            switch ( this.treeView.getOrientation() ) {
            case Constants.ORIENT_LEFT_RIGHT:
                xbias = this.m_bias;
                break;
            case Constants.ORIENT_RIGHT_LEFT:
                xbias = -this.m_bias;
                break;
            case Constants.ORIENT_TOP_BOTTOM:
                ybias = this.m_bias;
                break;
            case Constants.ORIENT_BOTTOM_TOP:
                ybias = -this.m_bias;
                break;
            }

            VisualItem vi = (VisualItem)ts.tuples().next();
            this.m_cur.setLocation(this.treeView.getWidth()/2, this.treeView.getHeight()/2);
            this.treeView.getAbsoluteCoordinate(this.m_cur, this.m_start);
            this.m_end.setLocation(vi.getX()+xbias, vi.getY()+ybias);
        } else {
            this.m_cur.setLocation(this.m_start.getX() + frac*(this.m_end.getX()-this.m_start.getX()),
                              this.m_start.getY() + frac*(this.m_end.getY()-this.m_start.getY()));
            this.treeView.panToAbs(this.m_cur);
        }
    }
}
