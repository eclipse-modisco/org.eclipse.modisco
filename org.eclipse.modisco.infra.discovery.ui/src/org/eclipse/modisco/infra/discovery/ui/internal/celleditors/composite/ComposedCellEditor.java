/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *    Gregoire Dupe (Mia-Software) - Bug 453476 - Stop using EMF Facet's deprecated APIs
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.facet.widgets.celleditors.IListener;
import org.eclipse.modisco.facet.widgets.celleditors.IWidget2;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class ComposedCellEditor extends CellEditor {
	private final ICompositeEditorFactory<Object> cellCompositeFactory;

	@SuppressWarnings("unchecked")
	public ComposedCellEditor(final Composite parent,
			final ICompositeEditorFactory<?> cellCompositeFactory) {
		this.cellCompositeFactory = (ICompositeEditorFactory<Object>) cellCompositeFactory;
		setStyle(SWT.NONE);
		create(parent);
	}

	@Override
	protected void doSetValue(final Object value) {
		((IWidget2<Object>) getControl()).setValue(value);
	}

	@Override
	protected void doSetFocus() {
		getControl().setFocus();
	}

	@Override
	protected Object doGetValue() {
		return ((IWidget2<Object>) getControl()).getValue();
	}

	@Override
	protected Control createControl(final Composite parent) {
		AbstractCellEditorComposite<Object> compositeEditor = this.cellCompositeFactory
				.createCompositeEditor(parent, SWT.NONE);
		compositeEditor.addCommitListener(new IListener() {
			public void handleEvent() {
				fireApplyEditorValue();
				deactivate();
			}
		});
		return compositeEditor;
	}

	private final List<IComposedCellEditorListener> listeners = new ArrayList<IComposedCellEditorListener>();

	public void addListener(final IComposedCellEditorListener listener) {
		if (!this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}
	}

	public void removeListener(final IComposedCellEditorListener listener) {
		this.listeners.remove(listener);
	}

	protected void fireCellEditorDeactivated() {
		for (IComposedCellEditorListener listener : new ArrayList<IComposedCellEditorListener>(
				this.listeners)) {
			listener.deactivated();
		}
	}

	@Override
	public void deactivate() {
		if (isActivated()) {
			fireCellEditorDeactivated();
		}
		super.deactivate();
	}

	@Override
	public LayoutData getLayoutData() {
		// overridden to not set minimum width to preferred width
		// (to avoid cell editors sticking out of their containing cell)
		return new LayoutData();
	}

}