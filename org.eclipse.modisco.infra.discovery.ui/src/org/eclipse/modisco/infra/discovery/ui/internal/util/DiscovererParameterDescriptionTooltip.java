/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.util;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

public abstract class DiscovererParameterDescriptionTooltip extends ToolTip {

	private final Table table;

	public DiscovererParameterDescriptionTooltip(final Table table) {
		super(table, ToolTip.RECREATE, false);
		this.table = table;
	}

	@Override
	protected boolean shouldCreateToolTip(final Event event) {
		DiscovererParameter parameter = getDiscovererParameterAt(event);
		if (parameter == null || parameter.getDescription() == null) {
			return false;
		}
		if (event.x > this.table.getColumns()[0].getWidth()) {
			return false;
		}
		return true;
	}

	@Override
	protected Composite createToolTipContentArea(final Event event, final Composite parent) {
		DiscovererParameter parameter = getDiscovererParameterAt(event);
		if (parameter == null) {
			return new Composite(parent, SWT.NONE);
		}

		Composite result = new Composite(parent, SWT.NONE);
		result.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		result.setLayout(new GridLayout());
		Text text = new Text(result, SWT.WRAP);
		text.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		text.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		String txt = parameter.getDescription();
		text.setText(txt);
		Dialog.applyDialogFont(text);
		GC gc = new GC(text);
		Point textExtent = gc.textExtent(txt);
		final int maxTooltipWidth = 400;
		if (textExtent.x > maxTooltipWidth) {
			GridData gridData = new GridData(GridData.FILL, GridData.FILL, true, true);
			gridData.widthHint = maxTooltipWidth;
			text.setLayoutData(gridData);
		}
		final int yOffset = 20;
		setShift(new Point(0, yOffset));
		return result;
	}

	protected abstract DiscovererParameter getDiscovererParameterAt(final Event event);
}
