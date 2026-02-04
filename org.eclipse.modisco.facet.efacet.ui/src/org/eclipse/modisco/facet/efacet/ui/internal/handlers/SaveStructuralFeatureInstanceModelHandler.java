/*******************************************************************************
 * Copyright (c) 2015, 2019 Soft-Maint.
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
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.modisco.facet.efacet.ui.internal.Activator;
import org.eclipse.modisco.facet.efacet.ui.internal.Messages;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialogFactory;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.handlers.HandlerUtil;

public class SaveStructuralFeatureInstanceModelHandler extends AbstractHandler {

	@Override
	public boolean isEnabled() {
		final IFacetManager facetManager = Utils.getFacetManager();
		return (facetManager != null)
				&& (facetManager.getSerializationResource() != null);
	}

	@Override
	public boolean isHandled() {
		final IFacetManager facetManager = Utils.getFacetManager();
		return (facetManager != null)
				&& (facetManager.getSerializationResource() != null);
	}
	
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		Object result = null;
			final IFacetManager facetManager = Utils.getFacetManager(event);
			if (facetManager != null) {
				try {
					facetManager.saveStructuralFeatureInstanceModel();
				} catch (FacetManagerException e) {
					Logger.logError(
						e, 
						"Failed to save the \"structural feature instance model\".", //$NON-NLS-1$
						Activator.getDefault());
					final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
					final IWorkbenchPartSite site = activePart.getSite();
					final Shell shell = site.getShell();
					result = IOkDialogFactory.DEFAULT.openErrorDialog(
						shell,
						e,
						Messages.SaveStructuralFeatureInstanceModelHandler_FailedToSaveTheStructuralFeatureInstanceModel);
				}
			}
		return result;
	}
}

