/**
 * Copyright (c) 2014, 2015 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 358914 - [Move to EMF Facet][Browser] Switch to EMF Facet
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.opener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.emf.core.IEObjectBrowserOpener;
import org.eclipse.modisco.facet.util.emf.core.IEPackageBrowserOpener;
import org.eclipse.modisco.facet.util.emf.core.IResourceBrowserOpener;
import org.eclipse.modisco.infra.browser.editor.ui.ITreeEditorOpener;
import org.eclipse.modisco.infra.browser.editor.ui.exceptions.TreeEditorOpenerException;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Activator;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Messages;

public class ResourceBrowserOpener implements IResourceBrowserOpener, IEObjectBrowserOpener, IEPackageBrowserOpener {

	public void openResource(final Resource resource) {
		try {
			ITreeEditorOpener.DEFAULT.openWithResource(resource);
		} catch (TreeEditorOpenerException e) {
			Logger.logError(e, Activator.getDefault());
		}
	}

	public String getBrowserName() {
		return Messages.ResourceBrowserOpener_MoDiscoDefaultTreeBrowser;
	}

	public void openEObject(final EObject eObject) {
		try {
			ITreeEditorOpener.DEFAULT.openWithEObject(eObject);
		} catch (TreeEditorOpenerException e) {
			Logger.logError(e, Activator.getDefault());
		}
	}

	public void openEPackage(final EPackage ePackage) {
		openEObject(ePackage);
	}

}
