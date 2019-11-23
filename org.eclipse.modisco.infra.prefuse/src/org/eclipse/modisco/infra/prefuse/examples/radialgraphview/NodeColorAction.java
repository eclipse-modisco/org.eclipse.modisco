/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.infra.prefuse.examples.radialgraphview;

import prefuse.action.assignment.ColorAction;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

/**
 * Set node fill colors
 */
public class NodeColorAction extends ColorAction {
    public NodeColorAction(String group) {
        super(group, VisualItem.FILLCOLOR, ColorLib.rgba(255,255,255,0));
        add("_hover", ColorLib.gray(220,230)); //$NON-NLS-1$
        add("ingroup('_search_')", ColorLib.rgb(255,190,190)); //$NON-NLS-1$
        add("ingroup('_focus_')", ColorLib.rgb(198,229,229)); //$NON-NLS-1$
    }

}