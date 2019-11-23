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

package org.eclipse.modisco.infra.prefuse.examples.radialgraphview;

import prefuse.action.assignment.ColorAction;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

/**
 * Set node text colors
 */
public class TextColorAction extends ColorAction {
    public TextColorAction(String group) {
        super(group, VisualItem.TEXTCOLOR, ColorLib.gray(0));
        add("_hover", ColorLib.rgb(255,0,0)); //$NON-NLS-1$
    }
}