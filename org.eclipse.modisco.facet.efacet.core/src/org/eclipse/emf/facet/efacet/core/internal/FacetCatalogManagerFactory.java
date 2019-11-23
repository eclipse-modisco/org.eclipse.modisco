/**
 *  Copyright (c) 2012, 2015 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Grégoire Dupé (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet
 *      Grégoire Dupé (Mia-Software) - Bug 373078 - API Cleaning
 *      Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model 
 */
package org.eclipse.emf.facet.efacet.core.internal;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.efacet.core.IFacetSetCatalogManager;
import org.eclipse.emf.facet.efacet.core.IFacetSetCatalogManagerFactory;
import org.eclipse.emf.facet.efacet.core.internal.catalog.EFacetCatalogManager2;

public class FacetCatalogManagerFactory implements IFacetSetCatalogManagerFactory {

	public IFacetSetCatalogManager getOrCreateFacetSetCatalogManager(
			final ResourceSet resourceSet) {
		return new EFacetCatalogManager2(resourceSet);
	}

}
