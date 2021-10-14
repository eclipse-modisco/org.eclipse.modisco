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
package org.eclipse.modisco.infra.browser.uicore.examples.cnf;

import java.net.URISyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.IResourceEditorInput;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.ResourceEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.navigator.ILinkHelper;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class LinkHelper implements ILinkHelper {

	public IStructuredSelection findSelection(final IEditorInput anInput) {
		if (anInput instanceof IResourceEditorInput) {
			IResourceEditorInput resourceEditorInput = (IResourceEditorInput) anInput;
			URI uri = resourceEditorInput.getResource().getURI();
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			try {
				IFile[] files = root.findFilesForLocationURI(new java.net.URI(uri.toString()));
				if (files.length > 0) {
					return new StructuredSelection(files[0]);
				}
			} catch (URISyntaxException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}

			if (uri.isPlatformResource()) {
				String location = uri.toPlatformString(true);
				IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(location);
				if (resource != null) {
					return new StructuredSelection(resource);
				}
			}

		}
		return null;
	}

	public void activateEditor(final IWorkbenchPage aPage, final IStructuredSelection aSelection) {
		Object firstElement = aSelection.getFirstElement();
		EObject eObject = (EObject) Platform.getAdapterManager().getAdapter(firstElement,
				EObject.class);

		if (eObject != null) {
			ResourceEditorInput resourceEditorInput = new ResourceEditorInput(eObject.eResource());
			IEditorPart editorPart = aPage.findEditor(resourceEditorInput);
			// link only with existing editor (don't open new editor here)
			if (editorPart instanceof EcoreBrowser) {
				EcoreBrowser browser = (EcoreBrowser) editorPart;
				String uriFragment = eObject.eResource().getURIFragment(eObject);
				browser.browseToByURI(uriFragment);

			}
		}
	}

}
