/**
 * Copyright (c) 2014, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442718 - Implement copy action in the new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.browser.editor.ui.internal.editor.TreeEditor;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class CopyHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		final IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		if (selection instanceof IStructuredSelection
				&& activeEditor instanceof TreeEditor) {
			final List<String> names = new ArrayList<String>();

			final TreeEditor editor = (TreeEditor) activeEditor;
			final ILabelProvider labelProvider = editor
					.getViewerLabelProvider();

			final IStructuredSelection structSelection = (IStructuredSelection) selection;
			final Iterator<?> selIterator = structSelection.iterator();
			while (selIterator.hasNext()) {
				final Object item = selIterator.next();
				final String name = labelProvider.getText(item);
				names.add(name);
			}
			if (!names.isEmpty()) {
				final StringBuilder buffer = new StringBuilder();
				for (String name : names) {
					buffer.append(name);
					buffer.append('\n');
				}
				final Shell shell = HandlerUtil.getActiveShell(event);
				final Clipboard clipboard = new Clipboard(shell.getDisplay());
				final TextTransfer textTransfer = TextTransfer.getInstance();
				/*
				 * Remove the last \n with the regular expression
				 */
				clipboard.setContents(new Object[] { buffer.toString()
						.replaceAll("\n$", "") }, //$NON-NLS-1$ //$NON-NLS-2$
						new Transfer[] { textTransfer });
			}
		}
		return null;
	}

}
