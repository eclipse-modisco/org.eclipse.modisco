/*******************************************************************************
 * Copyright (c) 2011, 2016 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * 	   Grégoire Dupé (Mia-Software) - Bug 333553 - The user has not to deal with two files to create a facet
 * 	   Nicolas Guyomar (Mia-Software) - Bug 333553 - The user has not to deal with two files to create a facet
 * 	   Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 * 	   Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 * 	   Nicolas Bros (Mia-Software) - Bug 361817 - [Restructuring] Dynamic load to the facet catalog
 * 	   Nicolas Bros (Mia-Software) - Bug 370110 - Rename efacetcatalog2.ecore
 *     Grégoire Dupé (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *     Grégoire Dupé (Mia-Software) - Bug 373078 - API Cleaning
 *     Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *     Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.core.internal.catalog;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.efacet.core.IFacetSetCatalogManager;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManager;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManagerConfiguration;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManagerFactory;

public class EFacetCatalogManager2 implements IFacetSetCatalogManager {

	private final ICatalogManager catalogMgr;

	public EFacetCatalogManager2(final ResourceSet resourceSet) {
		final ICatalogManagerConfiguration catalogMgrConfig = 
				new CatalogManagerConfiguration();
		this.catalogMgr = ICatalogManagerFactory.DEFAULT.getOrCreateCatalogManager(
				catalogMgrConfig, resourceSet, this.getClass().getName());
	}

	public List<FacetSet> getRegisteredFacetSets() {
		final BasicEList<FacetSet> result = new BasicEList<FacetSet>();
		for (EObject eObject : this.catalogMgr.getEntries(EObject.class)) {
			if (eObject instanceof FacetSet) {
				final FacetSet facetSet = (FacetSet) eObject;
				result.add(facetSet);
			}
		}
		return Collections.unmodifiableList(result);
	}

	public void registerFacetSet(final FacetSet facetSet) {
		this.catalogMgr.addWsEntry(facetSet);
	}

	class CatalogManagerConfiguration implements ICatalogManagerConfiguration {

		public boolean canBeManaged(final EObject root) {
			return root instanceof FacetSet;
		}

		public boolean isValid(final EObject root) {
			return true;
		}

	}
}
