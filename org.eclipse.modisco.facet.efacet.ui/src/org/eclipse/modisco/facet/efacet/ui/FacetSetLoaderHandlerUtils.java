/** 
 * Copyright (c) 2015 Soft-Maint, and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets
 *    Grégoire Dupé (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets
 */
package org.eclipse.modisco.facet.efacet.ui;

import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.core.ICustomizationManagerProvider;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.IFacetSetCatalogManager;
import org.eclipse.modisco.facet.efacet.core.IFacetSetCatalogManagerFactory;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Utilitarian to manage Handlers which will (un)load FacetSets: allow users to
 * (des)activate facet sets (customizations are facet sets). If you want to
 * create a menu shortcut, your Handler must extends this class
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @since 1.1
 */
public final class FacetSetLoaderHandlerUtils {

	private FacetSetLoaderHandlerUtils() {
		// Must not be used.
	}

	/**
	 * Execute the Handler
	 * 
	 * @param event
	 *            The execution event that contains the application context
	 * @param facetSetID
	 *            ID of the facet set linked to this Handler
	 * @return the result of the execution. Reserved for future use, can be
	 *         <code>null</code>.
	 * @throws ExecutionException
	 */
	public static Object execute(final ExecutionEvent event,
			final String facetSetID) throws ExecutionException {
		final boolean toggle = HandlerUtil.toggleCommandState(event
				.getCommand());
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			final ICustomizationManagerProvider customMgrProvider = (ICustomizationManagerProvider) activePart
					.getAdapter(ICustomizationManagerProvider.class);
			if (customMgrProvider != null) {
				execute(facetSetID, toggle, customMgrProvider);
			}
		}
		return null;
	}

	private static void execute(final String facetSetID, final boolean toggle,
			final ICustomizationManagerProvider customMgrProvider) {
		final ICustomizationManager manager = customMgrProvider
				.getCustomizationManager();

		final IFacetSetCatalogManager catalog = IFacetSetCatalogManagerFactory.DEFAULT
				.getOrCreateFacetSetCatalogManager(manager.getResourceSet());

		FacetSet facetSetToActive = null;
		for (FacetSet facetSet : catalog.getRegisteredFacetSets()) {
			if (facetSetID.equals(facetSet.getName())) {
				facetSetToActive = facetSet;
				break;
			}
		}
		if (facetSetToActive != null) {
			final IFacetManager facetManager = manager.getFacetManager();
			final List<FacetSet> managedFacetSets = facetManager
					.getManagedFacetSets();
			if (toggle) {
				managedFacetSets.remove(facetSetToActive);
			} else {
				if (!managedFacetSets.contains(facetSetToActive)) {
					managedFacetSets.add(0, facetSetToActive);
				}
			}
		}
	}
}
