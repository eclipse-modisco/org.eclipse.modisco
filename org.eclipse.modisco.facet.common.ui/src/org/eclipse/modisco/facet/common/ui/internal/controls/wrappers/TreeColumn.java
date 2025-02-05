/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 334116 - common tree view with columns
 *******************************************************************************/
package org.eclipse.modisco.facet.common.ui.internal.controls.wrappers;

import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionListener;

/** Implements {@link Column}'s unified API for the SWT {@link org.eclipse.swt.widgets.TreeColumn} */
public class TreeColumn implements Column {
	private final org.eclipse.swt.widgets.TreeColumn column;

	public TreeColumn(final org.eclipse.swt.widgets.TreeColumn column) {
		this.column = column;
	}

	public void setText(final String columnText) {
		this.column.setText(columnText);
	}

	public void setWidth(final int width) {
		this.column.setWidth(width);

	}

	public void addControlListener(final ControlListener controlListener) {
		this.column.addControlListener(controlListener);
	}

	public void addSelectionListener(final SelectionListener selectionListener) {
		this.column.addSelectionListener(selectionListener);
	}

	public int getWidth() {
		return this.column.getWidth();
	}

	public org.eclipse.swt.widgets.TreeColumn getColumn() {
		return this.column;
	}
}