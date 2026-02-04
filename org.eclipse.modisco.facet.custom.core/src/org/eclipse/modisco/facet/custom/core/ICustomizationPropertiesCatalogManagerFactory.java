/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.custom.core;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.custom.core.internal.CustomizationPropertiesCatalogManagerFactory;

/**
 * This interface provides the customization catalog manager.
 * 
 * @since 0.3
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ICustomizationPropertiesCatalogManagerFactory {

	ICustomizationPropertiesCatalogManagerFactory INSTANCE = new CustomizationPropertiesCatalogManagerFactory();

	ICustomizationPropertiesCatalogManager getOrCreateCustomizationPropertiesCatalogManager(
			final ResourceSet resourceSet);

}