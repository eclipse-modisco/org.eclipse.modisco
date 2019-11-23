/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 339571 - Compilation errors due to EMF Facet API cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 453476 - Stop using EMF Facet's deprecated APIs
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.dialogs;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.facet.widgets.celleditors.core.composite.registry.ICompositeEditorFactoriesRegistry;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite.ComposedCellEditor;
import org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite.IComposedCellEditorListener;
import org.eclipse.swt.widgets.Table;

public class ParameterValueEditingSupport extends EditingSupport {

	private final GenericParametersDialog genericParametersDialog;

	public ParameterValueEditingSupport(final ColumnViewer viewer,
			final GenericParametersDialog genericParametersDialog) {
		super(viewer);
		this.genericParametersDialog = genericParametersDialog;
	}

	@Override
	protected boolean canEdit(final Object element) {
		DiscovererParameter parameter = (DiscovererParameter) element;
		return ICompositeEditorFactoriesRegistry.INSTANCE.hasCompositeEditorFactory(
				parameter.getType());
	}

	@Override
	protected CellEditor getCellEditor(final Object element) {

		DiscovererParameter parameter = (DiscovererParameter) element;
		ICompositeEditorFactory<?> compositeEditorFactory = ICompositeEditorFactoriesRegistry
				.INSTANCE.getCompositeEditorFactory(parameter.getType());
		Table table = ((TableViewer) getViewer()).getTable();
		ComposedCellEditor composedCellEditor = new ComposedCellEditor(table,
				compositeEditorFactory);

		cellEditorOpened();

		composedCellEditor.addListener(new IComposedCellEditorListener() {
			public void deactivated() {
				cellEditorClosed();
			}
		});

		return composedCellEditor;
	}

	private void cellEditorOpened() {
		if (!this.genericParametersDialog.isCellEditorOpened()) {
			this.genericParametersDialog.setCellEditorOpened(true);
			// to disable OK button
			this.genericParametersDialog.validate(true);
		}
	}

	protected void cellEditorClosed() {
		if (this.genericParametersDialog.isCellEditorOpened()) {
			this.genericParametersDialog.setCellEditorOpened(false);
			// to re-enable OK button
			this.genericParametersDialog.validate(true);
		}
	}

	@Override
	protected Object getValue(final Object element) {
		return this.genericParametersDialog.getParameterValue((DiscovererParameter) element);
	}

	@Override
	protected void setValue(final Object element, final Object value) {
		this.genericParametersDialog.setParameterValue((DiscovererParameter) element, value);
		getViewer().update(element, null);
		this.genericParametersDialog.validate(true);
	}

}