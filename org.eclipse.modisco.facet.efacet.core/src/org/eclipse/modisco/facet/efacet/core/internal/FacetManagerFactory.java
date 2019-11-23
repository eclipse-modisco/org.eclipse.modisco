/**
 * Copyright (c) 2011, 2019 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * 	Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 *  Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 *  Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *  Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *  Thomas Cicognani (Soft-Maint) - Bug 416223 - IFacetManagerFactory.getOrCreateFacetManager should not create an instance per call
 *  Thomas Cicognani (Soft-Maint) - Bug 463658 - Impossibility to just create a FacetManager
 */
package org.eclipse.modisco.facet.efacet.core.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerFactory;

public class FacetManagerFactory implements IFacetManagerFactory {

	/**
	 * @deprecated Use
	 *             {@link #getOrCreateDefaultFacetManagerWithSerializationResource(Resource)}
	 *             instead. The new method name is more understandable
	 */
	@Deprecated
	public IFacetManager getOrCreateFacetManager(final Resource resource) {
		return getOrCreateDefaultFacetManagerWithSerializationResource(resource);
	}

	/**
	 * @deprecated Use {@link #getOrCreateDefaultFacetManager(ResourceSet)}
	 *             instead. The new method name is more understandable
	 */
	@Deprecated
	public IFacetManager getOrCreateFacetManager(final ResourceSet resourceSet) {
		return getOrCreateDefaultFacetManager(resourceSet);
	}

	public IFacetManager getOrCreateDefaultFacetManagerWithSerializationResource(
			final Resource resource) {
		FacetManager result = null;
		for (Adapter adapter : resource.eAdapters()) {
			if (adapter instanceof FacetManager) {
				result = (FacetManager) adapter;
			}
		}
		if (result == null) {
			result = new FacetManager(resource);
			resource.eAdapters().add(result);
		}
		return result;
	}

	public IFacetManager getOrCreateDefaultFacetManager(
			final ResourceSet resourceSet) {
		FacetManager result = null;
		for (Adapter adapter : resourceSet.eAdapters()) {
			if (adapter instanceof FacetManager) {
				result = (FacetManager) adapter;
			}
		}
		if (result == null) {
			result = new FacetManager(resourceSet);
			resourceSet.eAdapters().add(result);
		}
		return result;
	}

	public IFacetManager createFacetManagerWithSerializationResource(
			final Resource resource) {
		return new FacetManager(resource);
	}

	public IFacetManager createFacetManager(final ResourceSet resourceSet) {
		return new FacetManager(resourceSet);
	}

}
