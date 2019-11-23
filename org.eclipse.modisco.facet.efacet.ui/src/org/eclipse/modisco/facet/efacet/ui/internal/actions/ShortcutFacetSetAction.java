/*******************************************************************************
 * Copyright (c) 2015, 2019 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Thomas Cicognani (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets 
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.actions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.IFacetSetCatalogManager;
import org.eclipse.modisco.facet.efacet.core.IFacetSetCatalogManagerFactory;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.efacet.ui.FacetSetShortcutActionUtils;

public class ShortcutFacetSetAction extends Action {

	private final String actionId;
	private final IFacetManager facetManager;

	public ShortcutFacetSetAction(final String actionId, final String label,
			final ImageDescriptor imageDescriptor,
			final IFacetManager facetManager) {
		super(label, AS_CHECK_BOX);
		this.actionId = actionId;
		this.facetManager = facetManager;
		FacetSetShortcutActionUtils.setImageDescriptor(this, imageDescriptor);
	}

	@Override
	public void run() {
		FacetSetShortcutActionUtils.runAction(this, this.actionId,
				getAvailableFacetSets(), getAppliedFacetSets());
	}

	private Set<FacetSet> getAvailableFacetSets() {
		final ResourceSet resourceSet = this.facetManager.getResourceSet();
		final IFacetSetCatalogManager catalog = IFacetSetCatalogManagerFactory.DEFAULT
				.getOrCreateFacetSetCatalogManager(resourceSet);
		final HashSet<FacetSet> availableFS = new HashSet<FacetSet>();
		availableFS.addAll(catalog.getRegisteredFacetSets());
		return availableFS;
	}

	private List<FacetSet> getAppliedFacetSets() {
		return this.facetManager.getManagedFacetSets();
	}

}
