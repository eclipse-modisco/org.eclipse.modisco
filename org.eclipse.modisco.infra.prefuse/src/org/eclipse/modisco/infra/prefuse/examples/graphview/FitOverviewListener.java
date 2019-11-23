/*
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.infra.prefuse.examples.graphview;

import java.awt.geom.Rectangle2D;

import prefuse.Display;
import prefuse.util.GraphicsLib;
import prefuse.util.display.DisplayLib;
import prefuse.util.display.ItemBoundsListener;

/**
 * @author Gabriel Barbier
 *
 */
public class FitOverviewListener implements ItemBoundsListener {
    private Rectangle2D m_bounds = new Rectangle2D.Double();
    private Rectangle2D m_temp = new Rectangle2D.Double();
    private double m_d = 15;
    public void itemBoundsChanged(Display d) {
        d.getItemBounds(this.m_temp);
        GraphicsLib.expand(this.m_temp, 25/d.getScale());

        double dd = this.m_d/d.getScale();
        double xd = Math.abs(this.m_temp.getMinX()-this.m_bounds.getMinX());
        double yd = Math.abs(this.m_temp.getMinY()-this.m_bounds.getMinY());
        double wd = Math.abs(this.m_temp.getWidth()-this.m_bounds.getWidth());
        double hd = Math.abs(this.m_temp.getHeight()-this.m_bounds.getHeight());
        if ( xd>dd || yd>dd || wd>dd || hd>dd ) {
            this.m_bounds.setFrame(this.m_temp);
            DisplayLib.fitViewToBounds(d, this.m_bounds, 0);
        }
    }
}
