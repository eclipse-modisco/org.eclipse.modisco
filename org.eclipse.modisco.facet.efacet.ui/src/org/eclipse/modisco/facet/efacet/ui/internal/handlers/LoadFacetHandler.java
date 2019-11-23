/*******************************************************************************
 * Copyright (c) 2014, 2015 Mia-Software, and Soft-Maint.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Gregoire Dupe (Mia-Software) - Bug 441051 - Reusable customization and facet loading dialogs
 *   Thomas Cicognani (Soft-Maint) - Bug 471681 - Error when accepting FacetSet selection dialog
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerProvider;
import org.eclipse.modisco.facet.efacet.core.IFacetSetCatalogManager;
import org.eclipse.modisco.facet.efacet.core.IFacetSetCatalogManagerFactory;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.dialog.IFacetSetSelectionDialog;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.dialog.IFacetSetSelectionDialogFactory;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallbackWithPreCommit;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IQuestionDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class LoadFacetHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			final IFacetManagerProvider facetMgrProvider = (IFacetManagerProvider) activePart
					.getAdapter(IFacetManagerProvider.class);
			final IFacetManager facetManager = facetMgrProvider.getFacetManager();
			if (facetManager != null) {
				final ResourceSet resourceSet = facetManager.getResourceSet();
				final IFacetSetCatalogManager catalog = IFacetSetCatalogManagerFactory.DEFAULT
						.getOrCreateFacetSetCatalogManager(resourceSet);
				final HashSet<FacetSet> availableFS = new HashSet<FacetSet>();
				availableFS.addAll(catalog.getRegisteredFacetSets());
				final IDialogCallbackWithPreCommit<List<FacetSet>, Boolean, IQuestionDialog> callback = new IDialogCallbackWithPreCommit<List<FacetSet>, Boolean, IQuestionDialog>() {

					public void committed(final List<FacetSet> result,
							final Boolean precommitResult) {
						final List<FacetSet> toBeRemoved = new ArrayList<FacetSet>();
						toBeRemoved.addAll(facetManager.getManagedFacetSets());
						toBeRemoved.removeAll(result);
						facetManager.getManagedFacetSets().removeAll(toBeRemoved);
						facetManager.getManagedFacetSets().addAll(result);
					}

					public IQuestionDialog openPrecommitDialog(
							final List<FacetSet> result,
							final IDialogCallback<Boolean> precommitCallback) {
						return null;
					}
				};
				
				final Shell shell = activePart.getSite().getShell();
				final IFacetSetSelectionDialog<IQuestionDialog> dialog = IFacetSetSelectionDialogFactory.DEFAULT
						.openFacetSetSelectionDialog(availableFS,
								Integer.MAX_VALUE, true, callback, shell);
				dialog.setSelectedFacetSets(facetManager.getManagedFacetSets());
			}
		}
		return null;
	}
}
