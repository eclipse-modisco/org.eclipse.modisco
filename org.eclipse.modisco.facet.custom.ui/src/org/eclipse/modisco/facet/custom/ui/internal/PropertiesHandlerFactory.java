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
 *      Nicolas Bros (Mia-Software) - Bug 377866 - selection customization
 */
package org.eclipse.modisco.facet.custom.ui.internal;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.ui.IContentPropertiesHandler;
import org.eclipse.modisco.facet.custom.ui.IContentPropertiesHandlerFactory;
import org.eclipse.modisco.facet.custom.ui.ISelectionPropertiesHandler;
import org.eclipse.modisco.facet.custom.ui.ISelectionPropertiesHandlerFactory;
import org.eclipse.modisco.facet.custom.ui.internal.exported.ILabelPropertiesHandler;
import org.eclipse.modisco.facet.custom.ui.internal.exported.ILabelPropertiesHandlerFactory;

public class PropertiesHandlerFactory implements
		IContentPropertiesHandlerFactory, ILabelPropertiesHandlerFactory, ISelectionPropertiesHandlerFactory {

	/**
	 * @deprecated must be replaced by
	 *             org.eclipse.modisco.facet.custom.ui.internal.PropertiesHandlerFactory
	 *             .createIContentPropertiesHandler(ICustomizationManager)
	 */
	@Deprecated
	public IContentPropertiesHandler createIContentPropertiesHandler(
			final ResourceSet resourceSet) {
		return new PropertiesHandler(resourceSet);
	}

	public IContentPropertiesHandler createIContentPropertiesHandler(
			final ICustomizationManager customizationMgr) {
		return new PropertiesHandler(customizationMgr);
	}

	public ILabelPropertiesHandler createLabelPropertiesHandler(
			final ICustomizationManager customizationMgr) {
		return new PropertiesHandler(customizationMgr);
	}

	public ISelectionPropertiesHandler createSelectionPropertiesHandler(final ICustomizationManager customManager) {
		return new PropertiesHandler(customManager);
	}

}
