/**
 * Copyright (c) 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 506318 - [New Browser] Drag and drop support
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.modisco.facet.custom.ui.CustomizedContentProviderUtils;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;

public class TreeEditorDragListener implements DragSourceListener {

	private ISelection selection;
	private final TreeViewer tree;

	public TreeEditorDragListener(final TreeViewer tree) {
		this.tree = tree;
	}

	public void dragStart(final DragSourceEvent event) {
		final ISelection treeSelection = this.tree.getSelection();
		this.selection = CustomizedContentProviderUtils
				.resolveSelection(treeSelection);
	}

	public void dragSetData(final DragSourceEvent event) {
		if (LocalTransfer.getInstance().isSupportedType(event.dataType)) {
			event.data = this.selection;
		}
	}

	@SuppressWarnings("PMD.NullAssignment")
	/*
	 * @SuppressWarnings("PMD.NullAssignment"): gdupe> This is the way to
	 * implement a DragSourceListener, cf.
	 * org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter
	 */
	public void dragFinished(final DragSourceEvent event) {
		this.selection = null;
	}
}
