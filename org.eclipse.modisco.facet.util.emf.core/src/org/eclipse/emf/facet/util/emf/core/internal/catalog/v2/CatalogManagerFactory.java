/*******************************************************************************
 * Copyright (c) 2015, 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *    Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 *******************************************************************************/
package org.eclipse.emf.facet.util.emf.core.internal.catalog.v2;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.util.emf.core.catalog.ICatalogManager;
import org.eclipse.emf.facet.util.emf.core.catalog.ICatalogManagerConfiguration;
import org.eclipse.emf.facet.util.emf.core.catalog.ICatalogManagerFactory;

public class CatalogManagerFactory implements ICatalogManagerFactory {

	public ICatalogManager getOrCreateCatalogManager(
			final ICatalogManagerConfiguration catalogMgrconfig,
			final ResourceSet resourceSet, final String catalogId) {
		CatalogManager result = searchExistingMgr(resourceSet, catalogId);
		if (result == null) {
			result = new CatalogManager(catalogMgrconfig, resourceSet, catalogId);
			resourceSet.eAdapters().add(result);
		}
		return result;
	}

	public ICatalogManager createCatalogManager(
			final ICatalogManagerConfiguration catalogMgrconfig,
			final ResourceSet resourceSet) {
		final CatalogManager result = new CatalogManager(
				catalogMgrconfig, resourceSet, null);
		resourceSet.eAdapters().add(result);
		return result;
	}

	private static CatalogManager searchExistingMgr(
			final ResourceSet resourceSet, final String catalogId) {
		CatalogManager result = null;
		for (Adapter adapter : resourceSet.eAdapters()) {
			if (adapter instanceof CatalogManager) {
				final CatalogManager candidate = (CatalogManager) adapter;
				if (candidate.getCatalogId().equals(catalogId)) {
					result = (CatalogManager) adapter;
				}
			}
		}
		return result;
	}
}
