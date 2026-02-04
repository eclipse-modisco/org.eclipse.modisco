/**
 * Copyright (c) 2016, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 506318 - [New Browser] Drag and drop support
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.Transfer;

public final class TreeEditorDragAndDropUtils {

	private TreeEditorDragAndDropUtils() {
		// Must not be used
	}

	public static void addDragAndDropSupport(final TreeViewer tree,
			final EditingDomain editingDomain) {
		final int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		final Transfer[] transfers = new Transfer[] {
				LocalTransfer.getInstance() };
		final TreeEditorDragListener dragListener = new TreeEditorDragListener(
				tree);
		tree.addDragSupport(dndOperations, transfers, dragListener);
		final DropTargetListener droplistener = new TreeEditorDropListener(
				editingDomain);
		tree.addDropSupport(dndOperations, transfers, droplistener);
	}
}
