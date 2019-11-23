/*******************************************************************************
 * Copyright (c) 2014 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 441051 - Reusable customization and facet loading dialogs
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.core;

/**
 * @since 0.5
 */
public interface IFacetManagerProvider {

	IFacetManager getFacetManager();

}
