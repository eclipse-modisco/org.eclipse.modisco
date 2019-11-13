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
package org.eclipse.emf.facet.util.emf.core.catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * Manager for catalogs containing registered elements defined in models.
 *
 * @since 1.1
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ICatalogManagerConfiguration {

	/**
	 * Return <code>true</code> if the eObject can be managed as a catalog
	 * entry.
	 *
	 * @param root
	 *            the root element of a catalog
	 * @return true if the parameter 'root' is of the right type to be a catalog
	 *         root
	 */
	boolean canBeManaged(EObject root);

	/**
	 * Return <code>true</code> if the eObject is valid.
	 *
	 * @param root
	 *            the root element of a catalog
	 * @return true if the parameter 'root' is is valid
	 */
	boolean isValid(EObject root);

}
