/**
 *  Copyright (c) 2012, 2015 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Gregoire Dupe (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model 
 */
package org.eclipse.modisco.facet.custom.core.internal;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.custom.core.ICustomizationCatalogManager;

public class CustomizationCatalogManagerFactory implements
		org.eclipse.modisco.facet.custom.core.ICustomizationCatalogManagerFactory {

	public ICustomizationCatalogManager getOrCreateCustomizationCatalogManager(
			final ResourceSet resourceSet) {
		return new CustomizationCatalogManager(resourceSet);
	}

}
