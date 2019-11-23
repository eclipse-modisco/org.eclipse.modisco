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

import prefuse.Visualization;
import prefuse.action.assignment.ColorAction;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

public class NodeColorAction extends ColorAction {

	public NodeColorAction(String group) {
		super(group, VisualItem.FILLCOLOR);
	}

	public int getColor(VisualItem item) {
		if (this.m_vis.isInGroup(item, Visualization.SEARCH_ITEMS))
			return ColorLib.rgb(255, 190, 190);
		else if (this.m_vis.isInGroup(item, Visualization.FOCUS_ITEMS))
			return ColorLib.rgb(198, 229, 229);
		else if (item.getDOI() > -1)
			return ColorLib.rgb(164, 193, 193);
		else
			return ColorLib.rgba(255, 255, 255, 0);
	}

}
