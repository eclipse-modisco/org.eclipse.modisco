/*******************************************************************************
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 463907 - Command for load and save Facet serialization
 *     Grégoire Dupé (Soft-Maint) - Bug 469959 - NullPointerException in SetStructuralFeatureInstanceResourceHandler.execute (42)
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.modisco.facet.efacet.ui.internal.Messages;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.dialog.IUriDialogFactory;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialogFactory;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.handlers.HandlerUtil;

public class SetStructuralFeatureInstanceResourceHandler extends
		AbstractHandler {

	@Override
	public boolean isEnabled() {
		return Utils.getFacetManager() != null;
	}

	@Override
	public boolean isHandled() {
		return Utils.getFacetManager() != null;
	}

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		Object result = null;
		final IFacetManager facetManager = Utils.getFacetManager(event);
		if (facetManager != null) {
			final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
			final IWorkbenchPartSite site = activePart.getSite();
			final Shell shell = site.getShell();
			final URI uri = getSResourceUri(facetManager);
			final IDialogCallback<URI> callback = new IDialogCallback<URI>() {
				public void committed(final URI resultUri) {
					changeSerializationMgrURI(facetManager, resultUri);
				}
			};
			result = IUriDialogFactory.DEFAULT.openUriDialog(uri,
					callback, shell, Display.getDefault());
		}
		return result;
	}

	private static URI getSResourceUri(final IFacetManager facetManager) {
		final Resource sResource = facetManager.getSerializationResource();
		URI uri = null;
		if (sResource != null) {
			uri = sResource.getURI();
		}
		return uri;
	}

	public static void changeSerializationMgrURI(final IFacetManager facetManager,
			final URI uri) {
		Resource sResource = null;
		final ResourceSet resourceSet = facetManager.getResourceSet();
		try {
			sResource = resourceSet.getResource(uri, true);
		} catch (Exception e) {
			sResource = resourceSet.createResource(uri);
		}
		try {
			facetManager.setSerializationResource(sResource);
		} catch (FacetManagerException e) {
			IOkDialogFactory.DEFAULT.openErrorDialog(
				new Shell(),
				e, 
				Messages.SetStructuralFeatureInstanceResourceHandler_SerializationUriSettigFailed);
		}
	}
}
