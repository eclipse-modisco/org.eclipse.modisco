/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * 	  Grégoire Dupé (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 */
package org.eclipse.modisco.facet.util.emf.core;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.util.emf.core.internal.catalog.CatalogSetManagerFactory;

/**
 * @since 0.2
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Deprecated
public interface ICatalogSetManagerFactory {
	ICatalogSetManagerFactory DEFAULT = new CatalogSetManagerFactory();

	ICatalogSetManager2 createICatalogSetManager(ResourceSet resourceSet);
}
