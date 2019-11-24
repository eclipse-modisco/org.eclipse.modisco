/**
 *  Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning 
 *      Gregoire Dupe (Mia-Software) - Bug 441570 - Children custom property
 */
package org.eclipse.modisco.facet.custom.ui;

import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;

/**
 * 
 * @since 0.2
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IContentPropertiesHandler {
	FacetOperation getIsVisible();
	/**
	 * @since 1.0
	 */
	FacetOperation getChildren();
}
