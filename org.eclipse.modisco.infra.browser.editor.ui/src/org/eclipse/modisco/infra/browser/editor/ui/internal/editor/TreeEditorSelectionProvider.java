/** 
 * Copyright (c) 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 507310 - [New Browser] The selection should contains unwrapped EObjects
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.facet.custom.ui.CustomizedContentProviderUtils;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;

public class TreeEditorSelectionProvider implements ISelectionProvider {

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
		return CustomizedContentProviderUtils.resolveSelection(wrappedSel);
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.listeners.remove(listener);
	}

	public void setSelection(final ISelection selection) {
		// TODO
	}

	protected void onSelectionChanged() {
		for (ISelectionChangedListener listener : this.listeners) {
			SelectionChangedEvent event = new SelectionChangedEvent(this,
					this.getSelection());
			listener.selectionChanged(event);
		}
	}

}
