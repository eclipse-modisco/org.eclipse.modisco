/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Guyomar (Mia-Software) - Bug 339571 - Compilation errors due to EMF Facet API cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 453476 - Stop using EMF Facet's deprecated APIs
 */

package org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.facet.widgets.celleditors.core.composite.registry.ICompositeEditorFactoriesRegistry;
import org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite.ComposedCellEditor;
import org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite.IComposedCellEditorListener;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.data.DiscovererParameterDisplay;

public class ParametersTableEditingSupport extends EditingSupport {

	private final List<IEditingSupportListener> listeners = new ArrayList<IEditingSupportListener>();

	public ParametersTableEditingSupport(final TableViewer viewer) {
		super(viewer);
	}

	public void addListener(final IEditingSupportListener listener) {
		if (!this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}
	}

	public void removeListener(final IEditingSupportListener listener) {
		this.listeners.remove(listener);
	}

	public void fireCellEditorOpened() {
		for (IEditingSupportListener listener : new ArrayList<IEditingSupportListener>(
				this.listeners)) {
			listener.cellEditorOpened();
		}
	}

	public void fireCellEditorClosed() {
		for (IEditingSupportListener listener : new ArrayList<IEditingSupportListener>(
				this.listeners)) {
			listener.cellEditorClosed();
		}
	}

	@Override
	protected boolean canEdit(final Object element) {
		Class<?> type = ((DiscovererParameterDisplay) element).getParameterDescription().getType();
		return ICompositeEditorFactoriesRegistry.INSTANCE.hasCompositeEditorFactory(type);
	}

	@Override
	protected CellEditor getCellEditor(final Object element) {
		ComposedCellEditor cellEditor = null;
		Class<?> type = ((DiscovererParameterDisplay) element).getParameterDescription().getType();

		if (ICompositeEditorFactoriesRegistry.INSTANCE.hasCompositeEditorFactory(type)) {
			ICompositeEditorFactory<?> factory = ICompositeEditorFactoriesRegistry.INSTANCE
					.getCompositeEditorFactory(type);
			cellEditor = new ComposedCellEditor(((TableViewer) getViewer()).getTable(), factory);
		}

		if (cellEditor == null) {
			return null;
		}
		fireCellEditorOpened();

		cellEditor.addListener(new IComposedCellEditorListener() {
			public void deactivated() {
				fireCellEditorClosed();
			}
		});

		return cellEditor;
	}

	@Override
	protected Object getValue(final Object element) {
		return ((DiscovererParameterDisplay) element).getValue();
	}

	@Override
	protected void setValue(final Object element, final Object value) {
		((DiscovererParameterDisplay) element).setValue(value);
		getViewer().update(element, null);
	}

}
