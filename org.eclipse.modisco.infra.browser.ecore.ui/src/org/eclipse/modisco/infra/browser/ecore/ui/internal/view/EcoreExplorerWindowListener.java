/**
 * Copyright (c) 2015, 2019 Mia-Software, and Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 471020 - Ecore Explorer View
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.view;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.EditorPart;

public class EcoreExplorerWindowListener implements IPageListener,
		IPartListener2 {

	private final EcoreExplorerView view;

	public EcoreExplorerWindowListener(final EcoreExplorerView view) {
		this.view = view;
	}

	public void pageActivated(final IWorkbenchPage page) {
		changeInput(page);
	}

	public void pageClosed(final IWorkbenchPage page) {
		changeInput(page);
	}

	public void pageOpened(final IWorkbenchPage page) {
		changeInput(page);
		page.addPartListener(this);
	}

	public void partActivated(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partBroughtToTop(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partClosed(final IWorkbenchPartReference partRef) {
		final IWorkbenchPage page = partRef.getPage();
		final IEditorPart activeEditor = page.getActiveEditor();
		if (activeEditor == null) {
			this.view.changeInput(new StructuredSelection());
		} else {
			changeInput(activeEditor);
		}
	}

	public void partDeactivated(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partOpened(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partHidden(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partVisible(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partInputChanged(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	private void changeInput(final IWorkbenchPage page) {
		final IWorkbenchPart part = page.getActivePart();
		if (part != null) {
			changeInput(part);
		}
	}

	private void changeInput(final IWorkbenchPart part) {
		if (part instanceof EditorPart) {
			final EditorPart editorPart = (EditorPart) part;
			final IEditorSite editorSite = editorPart.getEditorSite();
			final ISelectionProvider selectionProvider = editorSite.getSelectionProvider();
			final ISelection selection = selectionProvider.getSelection();
			if (!this.view.changeInput(selection)) {
				final IEditingDomainProvider edProvider = (IEditingDomainProvider) part
					.getAdapter(IEditingDomainProvider.class);
				final EditingDomain editingDomain = edProvider
						.getEditingDomain();
				final ResourceSet resourceSet = editingDomain.getResourceSet();
				final Set<EObject> eObjects = new HashSet<EObject>();
				for (Resource resource : resourceSet.getResources()) {
					eObjects.addAll(resource.getContents());
				}
				this.view.changeInput(eObjects);
			}
		}
	}
}
