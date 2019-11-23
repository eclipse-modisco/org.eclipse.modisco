/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.opener;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.facet.util.emf.core.IEObjectBrowserOpener;
import org.eclipse.modisco.facet.util.emf.core.IEPackageBrowserOpener;
import org.eclipse.modisco.facet.util.emf.core.IResourceBrowserOpener;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.editors.BrowserUtils;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.ResourceEditorInput;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class BrowserOpener implements IResourceBrowserOpener, IEPackageBrowserOpener,
		IEObjectBrowserOpener {

	public BrowserOpener() {
		//
	}

	public void openResource(final Resource resource) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchPage activePage = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					IDE.openEditor(activePage, new ResourceEditorInput(resource),
							EcoreBrowser.EDITOR_ID, true);
				} catch (Exception e) {
					MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
				}
			}
		});
	}

	public void openEObject(final EObject eObject) {
		BrowserUtils.openEObjectInBrowser(eObject, true);
	}

	public void openEPackage(final EPackage ePackage) {
		try {
			final IEditorInput input = new URIEditorInput(URI.createURI(ePackage.getNsURI()));
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
					input, EcoreBrowser.EDITOR_ID, true);
		} catch (final Exception e) {
			MoDiscoBrowserPlugin.logException(e);
		}
	}

	public String getBrowserName() {
		return EcoreBrowser.HUMAN_READABLE_NAME;
	}
}
