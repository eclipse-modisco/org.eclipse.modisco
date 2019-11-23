/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors.table;

import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class TableEditorToolBar {

	private static final int HEIGHT = 25;
	private final ITableEditor tableEditor;
	private final ToolBar toolBar;
	private final Label label;

	/** Sort columns by type */
	private ToolItem btnSortColumnsByType;
	/** Hide columns which don't contain any elements */
	private ToolItem btnHideEmptyColumns;
	/**
	 * Whether to show columns which are specific to a few elements, or only
	 * columns which are common to all the elements
	 */
	private ToolItem btnOnlyShowCommonColumns;

	public TableEditorToolBar(final Composite parent, final ITableEditor tableEditor) {
		this.tableEditor = tableEditor;

		addLinePainter(parent);

		final GridData treeToolBarGridData = new GridData();
		treeToolBarGridData.grabExcessHorizontalSpace = true;
		treeToolBarGridData.horizontalAlignment = SWT.FILL;
		// since the layout is done manually, set fixed parent size
		treeToolBarGridData.heightHint = TableEditorToolBar.HEIGHT;
		parent.setLayoutData(treeToolBarGridData);

		this.label = new Label(parent, SWT.NONE);
		this.toolBar = new ToolBar(parent, SWT.NONE);

		/*
		 * do a manual layout to avoid the tool bar being pushed out of the
		 * screen by the label
		 */
		parent.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(final ControlEvent e) {
				final Point toolbarSize = TableEditorToolBar.this.toolBar.computeSize(SWT.DEFAULT,
						SWT.DEFAULT);
				TableEditorToolBar.this.toolBar.setSize(toolbarSize);

				final int splitPoint = parent.getSize().x - toolbarSize.x;

				TableEditorToolBar.this.toolBar.setLocation(splitPoint, 0);

				final int labelPosX = 3, labelPosY = 5, labelHMargin = 6, labelVMargin = 7;
				TableEditorToolBar.this.label.setLocation(labelPosX, labelPosY);
				TableEditorToolBar.this.label.setSize(splitPoint - labelHMargin, parent.getSize().y
						- labelVMargin);
			}
		});

		createToolButtons();
		initialize();
	}

	/** Paints a line below the tool bar to delimit it neatly */
	private void addLinePainter(final Composite composite) {
		composite.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
				e.gc.drawLine(0, e.height - 1, e.width, e.height - 1);
			}
		});
	}

	private void createToolButtons() {
		this.btnSortColumnsByType = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnSortColumnsByType.setToolTipText(Messages.TableEditorToolBar_tooltip_sortColumnsByType);
		this.btnSortColumnsByType.setImage(ImageProvider.getInstance().getSortLinksByTypeIcon());
		this.btnSortColumnsByType.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				TableEditorToolBar.this.tableEditor
						.setSortColumnsByType(TableEditorToolBar.this.btnSortColumnsByType
								.getSelection());
			}
		});

		this.btnHideEmptyColumns = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnHideEmptyColumns
				.setToolTipText(Messages.TableEditorToolBar_tooltip_HideEmtpyColumns);
		this.btnHideEmptyColumns.setImage(ImageProvider.getInstance().getHideEmptyColumnsIcon());
		this.btnHideEmptyColumns.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				TableEditorToolBar.this.tableEditor
						.setHideEmptyColumns(TableEditorToolBar.this.btnHideEmptyColumns
								.getSelection());
			}
		});

		this.btnOnlyShowCommonColumns = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnOnlyShowCommonColumns
				.setToolTipText(Messages.TableEditorToolBar_tooltip_OnlyShowCommonColumns);
		this.btnOnlyShowCommonColumns.setImage(ImageProvider.getInstance().getCommonColumnsIcon());
		this.btnOnlyShowCommonColumns.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				TableEditorToolBar.this.tableEditor
						.setOnlyShowCommonColumns(TableEditorToolBar.this.btnOnlyShowCommonColumns
								.getSelection());
			}
		});
	}

	/** Initialize the tool bar buttons with their initial value */
	private void initialize() {
		this.btnHideEmptyColumns.setSelection(false);
		this.btnOnlyShowCommonColumns.setSelection(false);
	}

	public void setLabelText(final String text) {
		this.label.setText(text);
	}

}
