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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.facet.util.ui.internal.exported.handler.HandlerUtils;
import org.eclipse.modisco.infra.browser.editor.ui.ITreeEditor;
import org.eclipse.modisco.infra.browser.editor.ui.ITreeEditorOpener;
import org.eclipse.modisco.infra.browser.editor.ui.exceptions.TreeEditorOpenerException;
import org.eclipse.modisco.infra.browser.editor.ui.internal.opener.ResourceEditorInput;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

public class TreeEditorOpener implements ITreeEditorOpener {

	private static TreeEditor openEditor(final Resource resource)
			throws TreeEditorOpenerException {
		final TreeEditor[] editor = new TreeEditor[1];
		final PartInitException[] exception = new PartInitException[1];

		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				final IWorkbenchPage activePage = HandlerUtils.getActivePage();
				if (activePage != null) {
					final ResourceEditorInput editorInput = new ResourceEditorInput(
							resource);
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
		return openEditor(resource);
	}

	public ITreeEditor openWithResource(final Resource resource)
			throws TreeEditorOpenerException {
		return openEditor(resource);
	}

	public ITreeEditor openWithResourceSet(final ResourceSet resourceSet)
			throws TreeEditorOpenerException {
		final ResourceImpl newResource = new ResourceImpl();
		for (Resource resource : resourceSet.getResources()) {
			final EList<EObject> contents = resource.getContents();
			newResource.getContents().addAll(contents);
		}
		return openEditor(newResource);
	}

}
