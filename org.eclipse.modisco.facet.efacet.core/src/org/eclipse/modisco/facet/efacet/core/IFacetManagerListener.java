/*******************************************************************************
 * Copyright (c) 2013, 2019 Mia-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Thomas Cicognani (Soft-Maint) - Bug 420193 - Listener on FacetManager
 *     Thomas Cicognani (Soft-Maint) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.core;

/**
 * This interface allows clients to manage listeners added on the
 * {@link IFacetManager}
 * 
 * @since 0.4
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IFacetManagerListener {

	/**
	 * Notifies that the {@link IFacetManager} has changed.
	 */
	void facetManagerChanged();

}
