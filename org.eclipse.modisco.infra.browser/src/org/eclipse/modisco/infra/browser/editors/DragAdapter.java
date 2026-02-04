/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.Transfer;

/**
 * Adds support for dragging model elements from the browser. The data in the
 * D&D operation is set to the unwrapped elements (i.e., the Ecore elements, and
 * not the tree items).
 */
public final class DragAdapter implements DragSourceListener {

	private ISelection selection;
	private final StructuredViewer viewer;

	/** Create support for dragging EObjects from the given tree viewer */
	@SuppressWarnings("unused")
	public static void create(final StructuredViewer viewer) {
		new DragAdapter(viewer);
	}

	private DragAdapter(final StructuredViewer viewer) {
		this.viewer = viewer;
		int dndOperations = DND.DROP_LINK | DND.DROP_COPY | DND.DROP_MOVE;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, this);
	}

	public void dragStart(final DragSourceEvent event) {
		this.selection = this.viewer.getSelection();
	}

	public void dragSetData(final DragSourceEvent event) {
		if (LocalTransfer.getInstance().isSupportedType(event.dataType)) {
			if (this.selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) this.selection;
				event.data = BrowserUtils.unwrapSelection(structuredSelection);
			} else {
				event.doit = false;
			}
		}
	}

	public void dragFinished(final DragSourceEvent event) {
		this.selection = null;
	}
}
