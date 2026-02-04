/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * 	 Grégoire Dupé (Mia-Software) - Bug 334000 Simple catalog manager
 *   Nicolas Guyomar (Mia-Software) - Bug 334000 Simple catalog manager
 *   Nicolas Guyomar (Mia-Software) - Bug 334529 ICatalogManager should be exposed in org.eclipse.modisco.facet.common.core
 *   Nicolas Guyomar (Mia-Software) - Bug 338811 - A model registration method in the interface ICatalogSetManager
 *   Grégoire Dupé (Mia-Software) - Bug 362084 - Get the instance of a catalog manager
 */
package org.eclipse.modisco.facet.util.emf.core;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.facet.util.emf.catalog.Catalog;
import org.eclipse.modisco.facet.util.emf.catalog.CatalogSet;
import org.eclipse.modisco.facet.util.emf.core.exception.InvalidFacetSetException;
import org.osgi.framework.Bundle;

/**
 * @since 0.2
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Deprecated
public interface ICatalogSetManager2 {

	/**
	 * This method returns the {@link CatalogSet} object which contains all the registered catalogs.
	 *
	 * @return the set of registered {@link Catalog}s
	 */
	CatalogSet getCatalogSet();

	/**
	 * Return the bundle containing the file from which we have created the given resource.
	 *
	 * @param eResource
	 *            the EMF Resource
	 * @return the {@link Bundle} matching the given resource, or <code>null</code> if the resource
	 *         is not defined in a Bundle.
	 * @throws IllegalArgumentException
	 *             if the resource is <code>null</code>
	 *
	 * @author Nicolas Guyomar
	 */
	Bundle getBundleByResource(Resource eResource);

	/**
	 * This method takes a file to register it as a "modelDeclaration" extension in its containing
	 * plug-in.
	 *
	 * @param file
	 *            the file to be registered as a "modelDeclaration"
	 * @throws InvalidFacetSetException
	 */
	void registerModelDeclaration(IFile file) throws InvalidFacetSetException;

	/**
	 * Return the registered catalogs conforming to the parameter class.
	 *
	 * @return a list of {@link ICatalogManager}
	 */
	<T> List<T> getCatalogManagerByType(Class<? extends T> catalogManagerClass);

}
