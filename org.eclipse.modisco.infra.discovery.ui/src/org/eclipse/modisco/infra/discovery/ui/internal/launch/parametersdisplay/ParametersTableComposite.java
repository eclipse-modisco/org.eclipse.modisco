/*
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software) - [Discovery] User feature : model opening from launch config
 */

package org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay;

import java.util.List;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.data.DiscovererParameterDisplay;
import org.eclipse.modisco.infra.discovery.ui.internal.util.DiscovererParameterDescriptionTooltip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class ParametersTableComposite extends Composite {

	private static final int VALUE_MINIMUM_WIDTH = 100;

	private static final int VALUE_WEIGHT = 35;

	private static final int REQUIRED_MINIMUM_WIDTH = 50;

	private static final int REQUIRED_WEIGHT = 10;

	private static final int TYPE_MINIMUM_WIDTH = 50;

	private static final int TYPE_WEIGHT = 30;

	private static final int NAME_MINIMUM_WIDTH = 100;

	private static final int NAME_WEIGHT = 25;

	protected static final int VALUE_COLUMN_INDEX = 1;

	private TableViewer tableViewer = null;

	// private ParametersTableLabelProvider labelProvider = null;
	private ParametersTableContentProvider contentProvider = null;
	private ParametersTableEditingSupport editingSupport = null;
	@SuppressWarnings("unused")
	private ColumnViewerSorter sorter = null;

	private final boolean editable;

	public ParametersTableComposite(final Composite parent, final int style,
			final List<DiscovererParameterDisplay> discoveryParameters, final boolean editable) {
		super(parent, style);
		this.editable = editable;
		initialize();
		initializeTableProviders();
		initializeTableContents(discoveryParameters);
	}

	/**
	 * @param discoveryParameters
	 */
	private final void initializeTableContents(
			final List<DiscovererParameterDisplay> discoveryParameters) {

		DiscovererParameterDisplay[] parameters = new DiscovererParameterDisplay[discoveryParameters
				.size()];
		discoveryParameters.toArray(parameters);
		this.tableViewer.setInput(parameters);
	}

	private final void initialize() {
		this.tableViewer = new TableViewer(this, SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.verticalAlignment = GridData.FILL;
		gridData1.grabExcessVerticalSpace = true;
		this.tableViewer.getTable().setLayoutData(gridData1);
		this.tableViewer.getTable().setHeaderVisible(true);
		this.tableViewer.getTable().setLinesVisible(true);

		TableColumnLayout columnLayout = new TableColumnLayout();
		setLayout(columnLayout);

		// NAME column
		TableViewerColumn columnName = new TableViewerColumn(this.tableViewer, SWT.NONE);
		columnName.getColumn().setText(Messages.ParametersTableComposite_name);
		columnName.getColumn().setMoveable(true);
		columnName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				return ((DiscovererParameterDisplay) element).getParameterDescription().getId();
			}
		});
		this.sorter = new ColumnViewerSorter(this.tableViewer, columnName);

		columnLayout.setColumnData(columnName.getColumn(), new ColumnWeightData(
				ParametersTableComposite.NAME_WEIGHT, ParametersTableComposite.NAME_MINIMUM_WIDTH));

		// VALUE column
		if (this.editable) {
			TableViewerColumn columnValue = new TableViewerColumn(this.tableViewer, SWT.NONE);
			// columnValue.getColumn().setWidth(500);
			columnValue.getColumn().setText(Messages.ParametersTableComposite_value);
			columnValue.getColumn().setMoveable(true);
			columnValue.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public String getText(final Object element) {
					String result = null;
					if (((DiscovererParameterDisplay) element).getValue() != null) {
						result = ((DiscovererParameterDisplay) element).getValue().toString();
					}
					return result;
				}
			});
			this.editingSupport = new ParametersTableEditingSupport(this.tableViewer);
			columnValue.setEditingSupport(this.editingSupport);
			columnLayout.setColumnData(columnValue.getColumn(), new ColumnWeightData(
					ParametersTableComposite.VALUE_WEIGHT,
					ParametersTableComposite.VALUE_MINIMUM_WIDTH));
		}

		// REQUIRED column
		if (this.editable) {
			TableViewerColumn columnRequired = new TableViewerColumn(this.tableViewer, SWT.NONE);
			// columnRequired.getColumn().setWidth(60);
			columnRequired.getColumn().setText(Messages.ParametersTableComposite_usage);
			columnRequired.getColumn().setMoveable(true);
			columnRequired.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public String getText(final Object element) {
					String result = null;
					if (((DiscovererParameterDisplay) element).getParameterDescription()
							.isRequiredInput()) {
						result = Messages.ParametersTableComposite_required;
					} else {
						result = Messages.ParametersTableComposite_optional;
					}
					return result;
				}
			});
			columnLayout.setColumnData(columnRequired.getColumn(), new ColumnWeightData(
					ParametersTableComposite.REQUIRED_WEIGHT,
					ParametersTableComposite.REQUIRED_MINIMUM_WIDTH));
		}

		// TYPE column
		TableViewerColumn columnType = new TableViewerColumn(this.tableViewer, SWT.NONE);
		columnType.getColumn().setText(Messages.ParametersTableComposite_type);
		columnType.getColumn().setMoveable(true);
		columnType.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				String result = null;
				if (((DiscovererParameterDisplay) element).getParameterDescription().getType() != null) {
					result = ((DiscovererParameterDisplay) element).getParameterDescription()
							.getType().getName();
				}
				return result;
			}
		});
		columnLayout.setColumnData(columnType.getColumn(), new ColumnWeightData(
				ParametersTableComposite.TYPE_WEIGHT, ParametersTableComposite.TYPE_MINIMUM_WIDTH));

		// setLayout(new GridLayout());
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		setLayoutData(gridData);

		this.tableViewer.getTable().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.F2) {
					IStructuredSelection selection = (IStructuredSelection) ParametersTableComposite.this.tableViewer
							.getSelection();
					Object firstElement = selection.getFirstElement();
					ParametersTableComposite.this.tableViewer.editElement(firstElement,
							ParametersTableComposite.VALUE_COLUMN_INDEX);
				}
			}
		});

		createDescriptionTooltip(this.tableViewer.getTable());
	}

	private static void createDescriptionTooltip(final Table table) {
		ToolTip tooltip = new DiscovererParameterDescriptionTooltip(table) {
			@Override
			protected DiscovererParameter getDiscovererParameterAt(final Event event) {
				TableItem item = table.getItem(new Point(event.x, event.y));
				if (item == null) {
					return null;
				}
				DiscovererParameterDisplay parameter = (DiscovererParameterDisplay) item.getData();
				if (parameter == null) {
					return null;
				}
				return parameter.getParameterDescription();
			}
		};
		tooltip.activate();
	}

	private final void initializeTableProviders() {
		// this.labelProvider = new ParametersTableLabelProvider();
		// this.tableViewer.setLabelProvider(this.labelProvider);

		this.contentProvider = new ParametersTableContentProvider();
		this.tableViewer.setContentProvider(this.contentProvider);
	}

	/**
	 * @param discoveryParameters
	 */
	public void updateDisplayParameters(final List<DiscovererParameterDisplay> discoveryParameters) {
		initializeTableContents(discoveryParameters);
		this.tableViewer.refresh();
		this.setSize(this.tableViewer.getTable().getSize());
		this.pack();
	}

	public TableViewer getTableViewer() {
		return this.tableViewer;
	}

	public ParametersTableEditingSupport getEditingSupport() {
		return this.editingSupport;
	}

} // @jve:decl-index=0:visual-constraint="10,10"
