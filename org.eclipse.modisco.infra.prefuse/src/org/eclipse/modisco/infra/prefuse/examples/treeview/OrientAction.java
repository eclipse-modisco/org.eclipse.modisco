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

package org.eclipse.modisco.infra.prefuse.examples.treeview;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

@SuppressWarnings("serial")
public class OrientAction extends AbstractAction {
    private int orientation;

    private final TreeView treeView;
    public OrientAction(int orientation, TreeView treeViewParameter) {
        this.orientation = orientation;
        this.treeView = treeViewParameter;
    }
    public void actionPerformed(ActionEvent evt) {
        this.treeView.setOrientation(this.orientation);
        this.treeView.getVisualization().cancel("orient"); //$NON-NLS-1$
        this.treeView.getVisualization().run("treeLayout"); //$NON-NLS-1$
        this.treeView.getVisualization().run("orient"); //$NON-NLS-1$
    }
}