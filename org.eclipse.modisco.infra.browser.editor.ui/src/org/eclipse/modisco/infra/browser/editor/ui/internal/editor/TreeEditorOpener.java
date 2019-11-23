/**
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.util.ui.internal.exported.handler.HandlerUtils;
import org.eclipse.modisco.infra.browser.editor.ui.ITreeEditor;
import org.eclipse.modisco.infra.browser.editor.ui.ITreeEditorOpener;
import org.eclipse.modisco.infra.browser.editor.ui.exceptions.TreeEditorOpenerException;
import org.eclipse.modisco.infra.browser.editor.ui.internal.opener.ResourceEditorInput;
import org.eclipse.modisco.infra.browser.editor.ui.internal.opener.ResourceSetEditorInput;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

public class TreeEditorOpener implements ITreeEditorOpener {

	private static TreeEditor openEditor(final IEditorInput editorInput)
			throws TreeEditorOpenerException {
		final TreeEditor[] editor = new TreeEditor[1];
		final PartInitException[] exception = new PartInitException[1];

		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				final IWorkbenchPage activePage = HandlerUtils.getActivePage();
				if (activePage != null) {
					try {
						editor[0] = (TreeEditor) activePage.openEditor(
								editorInput, TreeEditor.getEditorId());
					} catch (PartInitException e) {
						exception[0] = e;
					}
				}
			}
		});

		if (exception[0] != null) {
			throw new TreeEditorOpenerException(exception[0]);
		}
		return editor[0];
	}

	public ITreeEditor openWithEObject(final EObject eObject)
			throws TreeEditorOpenerException {
		final Resource resource = eObject.eResource();
		return openWithResource(resource);
	}

	public ITreeEditor openWithResource(final Resource resource)
			throws TreeEditorOpenerException {
		final ResourceEditorInput editorInput = new ResourceEditorInput(
				resource);
		return openEditor(editorInput);
	}

	public ITreeEditor openWithResourceSet(final ResourceSet resourceSet)
			throws TreeEditorOpenerException {
		final ResourceSetEditorInput editorInput = new ResourceSetEditorInput(
				resourceSet);
		return openEditor(editorInput);
	}

}
