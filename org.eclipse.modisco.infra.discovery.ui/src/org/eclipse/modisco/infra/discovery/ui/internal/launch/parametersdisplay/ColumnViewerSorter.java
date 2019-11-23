/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.data.DiscovererParameterDisplay;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

class ColumnViewerSorter extends ViewerComparator {
	public static final int ASC = 1;

	public static final int NONE = 0;

	public static final int DESC = -1;

	private int direction = ColumnViewerSorter.NONE;

	int getDirection() {
		return this.direction;
	}

	private final TableViewerColumn column;

	private final ColumnViewer viewer;

	ColumnViewer getViewer() {
		return this.viewer;
	}

	public ColumnViewerSorter(final ColumnViewer viewer, final TableViewerColumn column) {
		this.column = column;
		this.viewer = viewer;
		this.column.getColumn().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (ColumnViewerSorter.this.getViewer().getComparator() != null) {
					if (ColumnViewerSorter.this.getViewer().getComparator() == ColumnViewerSorter.this) {
						int tdirection = ColumnViewerSorter.this.getDirection();

						if (tdirection == ColumnViewerSorter.ASC) {
							setSorter(ColumnViewerSorter.this, ColumnViewerSorter.DESC);
						} else if (tdirection == ColumnViewerSorter.DESC) {
							setSorter(ColumnViewerSorter.this, ColumnViewerSorter.NONE);
						}
					} else {
						setSorter(ColumnViewerSorter.this, ColumnViewerSorter.ASC);
					}
				} else {
					setSorter(ColumnViewerSorter.this, ColumnViewerSorter.ASC);
				}
			}
		});
	}

	public void setSorter(final ColumnViewerSorter sorter, final int directionParameter) {
		if (directionParameter == ColumnViewerSorter.NONE) {
			this.column.getColumn().getParent().setSortColumn(null);
			this.column.getColumn().getParent().setSortDirection(SWT.NONE);
			getViewer().setComparator(null);
		} else {
			this.column.getColumn().getParent().setSortColumn(this.column.getColumn());
			sorter.direction = directionParameter;

			if (directionParameter == ColumnViewerSorter.ASC) {
				this.column.getColumn().getParent().setSortDirection(SWT.DOWN);
			} else {
				this.column.getColumn().getParent().setSortDirection(SWT.UP);
			}

			if (getViewer().getComparator() == sorter) {
				getViewer().refresh();
			} else {
				getViewer().setComparator(sorter);
			}

		}
	}

	@Override
	public int compare(final Viewer viewerParam, final Object e1, final Object e2) {
		int result = 0;
		DiscovererParameterDisplay display1 = (DiscovererParameterDisplay) e1;
		DiscovererParameterDisplay display2 = (DiscovererParameterDisplay) e2;
		result = display1.getParameterDescription().getId()
				.compareToIgnoreCase(display2.getParameterDescription().getId());
		return this.direction * result;
	}

}