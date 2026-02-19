/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Grégoire Dupé (Mia-Software) - Bug 472203 - NullPointerException in ResourceEditorInput.getName (41)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.examples.cnf.actions;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.uicore.examples.cnf.Activator;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.ResourceEditorInput;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class OpenAction extends Action {

	private final IWorkbenchPage page;
	private final ISelectionProvider provider;
	private EObject target;

	/**
	 * Construct the OpenAction with the given page.
	 *
	 * @param page
	 *            the page to use as context to open the editor.
	 * @param selectionProvider
	 *            the selection provider
	 */
	public OpenAction(final IWorkbenchPage page, final ISelectionProvider selectionProvider) {
		setText("Open"); //$NON-NLS-1$
		this.page = page;
		this.provider = selectionProvider;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.action.Action#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		ISelection selection = this.provider.getSelection();
		if (!selection.isEmpty()) {
			IStructuredSelection sSelection = (IStructuredSelection) selection;
			if (sSelection.size() == 1) {
				Object firstElement = sSelection.getFirstElement();
				EObject eObject = (EObject) Platform.getAdapterManager().getAdapter(firstElement,
						EObject.class);
				if (eObject != null && eObject.eResource() != null) {
					this.target = eObject;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void run() {
		if (isEnabled()) {
			ResourceEditorInput resourceEditorInput = new ResourceEditorInput(
					this.target.eResource());
			try {
				IEditorPart editorPart = this.page.findEditor(resourceEditorInput);
				if (editorPart == null) {
					editorPart = IDE.openEditor(this.page, resourceEditorInput,
							EcoreBrowser.EDITOR_ID, true);
				}
				if (editorPart instanceof EcoreBrowser) {
					final EcoreBrowser browser = (EcoreBrowser) editorPart;
					final String uriFragment = this.target.eResource().getURIFragment(this.target);
					browser.doWhenLoaded(new Runnable() {
						public void run() {
							browser.browseToByURI(uriFragment);
						}
					});
				}

			} catch (PartInitException e) {
				Logger.logError(e, Activator.getDefault());
				MessageDialog.openError(Display.getDefault().getActiveShell(), "Error Opening", //$NON-NLS-1$
						"Could not open element (see log)"); //$NON-NLS-1$
			}
		}
	}
}
