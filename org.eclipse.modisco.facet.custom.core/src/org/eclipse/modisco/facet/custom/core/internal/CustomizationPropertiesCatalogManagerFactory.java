/**
 * Copyright (c) 2012, 2019 Mia-Software.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *  	Gregoire Dupe (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.modisco.facet.custom.core.internal;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.custom.core.ICustomizationPropertiesCatalogManager;
import org.eclipse.modisco.facet.custom.core.ICustomizationPropertiesCatalogManagerFactory;

/**
 * Implementation of {@link ICustomizationPropertiesCatalogManagerFactory}.
 */
public class CustomizationPropertiesCatalogManagerFactory implements ICustomizationPropertiesCatalogManagerFactory {

	public ICustomizationPropertiesCatalogManager getOrCreateCustomizationPropertiesCatalogManager(
			final ResourceSet resourceSet) {
		return new CustomizationPropertiesCatalogManager(resourceSet);
	}

}
