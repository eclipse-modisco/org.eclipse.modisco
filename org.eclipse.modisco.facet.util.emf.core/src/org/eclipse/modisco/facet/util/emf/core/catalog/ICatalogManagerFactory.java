/*******************************************************************************
 * Copyright (c) 2015, 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *    Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.catalog;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.util.emf.core.internal.catalog.v2.CatalogManagerFactory;

/**
 * @since 1.1
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ICatalogManagerFactory {

	ICatalogManagerFactory DEFAULT = new CatalogManagerFactory();

	/**
	 * The returned catalog will be serialized on file system. The serialization
	 * file will be named using the id parameter value.
	 */
	ICatalogManager getOrCreateCatalogManager(
			ICatalogManagerConfiguration catalogMgrconfig,
			ResourceSet resourceSet, String catalogId);

	/**
	 * The returned catalog will not be serialized on file system. The eObject
	 * will be stored in resource having a URI starting with <code>tmp://</code>
	 */
	ICatalogManager createCatalogManager(
			ICatalogManagerConfiguration catalogMgrconfig,
			ResourceSet resourceSet);
}
