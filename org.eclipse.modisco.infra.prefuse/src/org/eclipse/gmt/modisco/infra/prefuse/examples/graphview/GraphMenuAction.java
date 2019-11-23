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

package org.eclipse.gmt.modisco.infra.prefuse.examples.graphview;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

import prefuse.data.Graph;

/**
 * @author Gabriel Barbier
 *
 */
/**
 * Swing menu action that loads a graph into the graph viewer.
 */
@SuppressWarnings("serial")
public abstract class GraphMenuAction extends AbstractAction {
    private GraphView m_view;
    public GraphMenuAction(String name, String accel, GraphView view) {
        this.m_view = view;
        this.putValue(Action.NAME, name);
        this.putValue(Action.ACCELERATOR_KEY,
                      KeyStroke.getKeyStroke(accel));
    }
    public void actionPerformed(ActionEvent e) {
        this.m_view.setGraph(getGraph(), "label"); //$NON-NLS-1$
    }
    protected abstract Graph getGraph();
}
