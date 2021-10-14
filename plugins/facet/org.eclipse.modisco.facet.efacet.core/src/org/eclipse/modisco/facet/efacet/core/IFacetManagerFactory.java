/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * 	   Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 *     Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 *     Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *     Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *     Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *     Thomas Cicognani (Soft-Maint) - Bug 463658 - Impossibility to just create a FacetManager
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.core;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.efacet.core.internal.FacetManagerFactory;

/**
 * Factory for {@link IFacetManager}.
 *
 * @since 0.2
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IFacetManagerFactory {

	/**
	 * The singleton instance of the factory.
	 */
	IFacetManagerFactory DEFAULT = new FacetManagerFactory();

	/**
	 * Create an {@link IFacetManager}.
	 *
	 * @param resource
	 *            the {@link Resource} in which virtual {@link EStructuralFeature}s are serialized.
	 *            Can be null if no EStructuralFeature provided a Facet are used.
	 * @deprecated Use {@link #getOrCreateDefaultFacetManagerWithSerializationResource(Resource)} instead. The new method name is more understandable
	 */
	@Deprecated
	IFacetManager getOrCreateFacetManager(Resource resource);
	
	/**
	 * Get an existing {@link IFacetManager} or create a new one.
	 * 
	 * @param resource
	 *            the {@link Resource} in which virtual
	 *            {@link EStructuralFeature}s are serialized. Can be
	 *            <code>null</code> if no EStructuralFeature provided a Facet
	 *            are used.
	 * @return The default IFacetManager associated to the Resource
	 * @since 1.0
	 */
	IFacetManager getOrCreateDefaultFacetManagerWithSerializationResource(
			Resource resource);


	/**
	 * Create an {@link IFacetManager}.
	 * 
	 * @param resourceSet
	 *            the resourceSet which will be used to manage the facet models.
	 * @deprecated Use {@link #getOrCreateDefaultFacetManager(ResourceSet)} instead. The new method name is more understandable
	 * 
	 */
	@Deprecated
	IFacetManager getOrCreateFacetManager(ResourceSet resourceSet);
	
	/**
	 * Get an existing {@link IFacetManager} or create a new one.
	 * 
	 * @param resourceSet
	 *            the resourceSet which will be used to manage the facet models.
	 * @return The default IFacetManager associated to the ResourceSet
	 * @since 1.0
	 */
	IFacetManager getOrCreateDefaultFacetManager(ResourceSet resourceSet);

	/**
	 * Create a new {@link IFacetManager}.
	 * 
	 * @param resource
	 *            the {@link Resource} in which virtual
	 *            {@link EStructuralFeature}s are serialized. Can be
	 *            <code>null</code> if no EStructuralFeature provided a Facet
	 *            are used.
	 * @since 1.0
	 */
	IFacetManager createFacetManagerWithSerializationResource(Resource resource);

	/**
	 * Create a new {@link IFacetManager}.
	 * 
	 * @param resourceSet
	 *            the resourceSet which will be used to manage the facet models.
	 * @since 1.0
	 */
	IFacetManager createFacetManager(ResourceSet resourceSet);

}
