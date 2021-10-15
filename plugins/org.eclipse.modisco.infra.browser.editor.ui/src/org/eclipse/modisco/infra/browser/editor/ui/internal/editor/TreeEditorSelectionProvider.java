/**
 * Copyright (c) 2016, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 507310 - [New Browser] The selection should contains unwrapped EObjects
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.modisco.facet.custom.ui.CustomizedContentProviderUtils;
import org.eclipse.modisco.facet.util.core.DebugUtils;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Activator;

public class TreeEditorSelectionProvider implements ISelectionProvider {

	private static final boolean DEBUG = DebugUtils
			.getDebugStatus(Activator.getDefault());
	private final ISelectionProvider wrappedSP;
	private final List<ISelectionChangedListener> listeners = new ArrayList<ISelectionChangedListener>();

	public TreeEditorSelectionProvider(final ISelectionProvider wrappedSP) {
		this.wrappedSP = wrappedSP;
		this.wrappedSP
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(
							final SelectionChangedEvent event) {
						onSelectionChanged();
					}
				});
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.listeners.add(listener);
	}

	public ISelection getSelection() {
		final ISelection wrappedSel = this.wrappedSP.getSelection();
		final ISelection result = CustomizedContentProviderUtils
				.resolveSelection(wrappedSel);
		if (DEBUG) {
			DebugUtils.debug(result.toString());
		}
		return result;
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.listeners.remove(listener);
	}

	public void setSelection(final ISelection selection) {
		// TODO
	}

	protected void onSelectionChanged() {
		final SelectionChangedEvent event = new SelectionChangedEvent(this,
				this.getSelection());
		for (final ISelectionChangedListener listener : this.listeners) {
			listener.selectionChanged(event);
		}
	}

}
