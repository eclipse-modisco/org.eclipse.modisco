/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.actions;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.ResourceEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/** Opens the selected {@link Resource} in the {@link EcoreBrowser} */
public class OpenResourceInMoDiscoBrowserAction implements IObjectActionDelegate {

	private ISelection fCurrentSelection;
	private IWorkbenchPart fTargetPart;

	public OpenResourceInMoDiscoBrowserAction() {
		// nothing
	}

	public void run(final IAction action) {
		if (this.fCurrentSelection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) this.fCurrentSelection;
			Object selectedElement = structuredSelection.getFirstElement();
			if (selectedElement instanceof Resource) {
				Resource resource = (Resource) selectedElement;
				IWorkbenchPage page = this.fTargetPart.getSite().getPage();
				try {
					IDE.openEditor(page, new ResourceEditorInput(resource), EcoreBrowser.EDITOR_ID,
							true);
				} catch (PartInitException e) {
					MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
				}
			}
		}
	}

	public void selectionChanged(final IAction action, final ISelection selection) {
		this.fCurrentSelection = selection;
	}

	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
		this.fTargetPart = targetPart;
	}

}
