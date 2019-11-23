/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors.table;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Table;

/**
 * Allows sorting a table viewer's columns. Clicking on a column header cycles
 * between ascending, descending and no sorting.
 */
public abstract class TableSorter extends ViewerComparator {
	public static final int ASCENDING = -1;
	public static final int NONE = 0;
	public static final int DESCENDING = 1;

	/** Current sorting direction */
	private int fSortingDirection = 0;

	/** The column that is managed by this {@link TableSorter} */
	private final TableViewerColumn column;

	/** The table viewer containing the column to be sorted */
	private final TableViewer fTableViewer;

	/**
	 * @param viewer
	 *            the table viewer
	 * @param column
	 *            the column to provide sorting for
	 */
	public TableSorter(final TableViewer viewer, final TableViewerColumn column) {
		this.fSortingDirection = TableSorter.NONE;
		this.column = column;
		this.fTableViewer = viewer;

		column.getColumn().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				columnClicked();
			}
		});
	}

	private void columnClicked() {
		// user changed sorting column : always start with descending sorting
		if (this.fTableViewer.getComparator() == null || this.fTableViewer.getComparator() != this) {
			setSorting(TableSorter.DESCENDING);
			return;
		}

		switch (this.fSortingDirection) {
		case TableSorter.DESCENDING:
			setSorting(TableSorter.ASCENDING);
			break;
		case TableSorter.ASCENDING:
			setSorting(TableSorter.NONE);
			break;
		case TableSorter.NONE:
			setSorting(TableSorter.DESCENDING);
			break;
		default:
			throw new IllegalStateException("Unhandled sorting direction"); //$NON-NLS-1$
		}
	}

	public void setSorting(final int direction) {
		this.fSortingDirection = direction;
		final Table table = this.fTableViewer.getTable();
		switch (direction) {
		case TableSorter.DESCENDING:
			table.setSortColumn(this.column.getColumn());
			table.setSortDirection(SWT.UP);
			this.fTableViewer.setComparator(this);
			// viewer.refresh();
			break;
		case TableSorter.ASCENDING:
			table.setSortColumn(this.column.getColumn());
			table.setSortDirection(SWT.DOWN);
			this.fTableViewer.setComparator(this);
			this.fTableViewer.refresh();
			break;
		case TableSorter.NONE:
			table.setSortColumn(null);
			table.setSortDirection(SWT.NONE);
			this.fTableViewer.setComparator(null);
			// viewer.refresh();
			break;
		default:
			throw new IllegalStateException("Unhandled sorting direction"); //$NON-NLS-1$
		}
	}

	@Override
	public int compare(final Viewer viewer, final Object e1, final Object e2) {
		return this.fSortingDirection * doCompare(viewer, e1, e2);
	}

	/** Must be defined by subclasses to compare two objects */
	protected abstract int doCompare(Viewer viewer, Object e1, Object e2);

}
