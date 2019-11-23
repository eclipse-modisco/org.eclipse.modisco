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

package org.eclipse.gmt.modisco.infra.prefuse.examples.radialgraphview;

import java.util.Iterator;

import prefuse.Visualization;
import prefuse.action.GroupAction;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.data.tuple.TupleSet;


/**
 * Switch the root of the tree by requesting a new spanning tree
 * at the desired root
 */
public class TreeRootAction extends GroupAction {
    public TreeRootAction(String graphGroup) {
        super(graphGroup);
    }
    public void run(double frac) {
        TupleSet focus = this.m_vis.getGroup(Visualization.FOCUS_ITEMS);
        if ( focus==null || focus.getTupleCount() == 0 ) return;

        Graph g = (Graph)this.m_vis.getGroup(this.m_group);
        Node f = null;
        Iterator<?> tuples = focus.tuples();
        while (tuples.hasNext() && !g.containsTuple(f=(Node)tuples.next()))
        {
            f = null;
        }
        if ( f == null ) return;
        g.getSpanningTree(f);
    }
}
