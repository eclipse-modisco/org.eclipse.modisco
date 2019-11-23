/**
 *  Copyright (c) 2012 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 */
package org.eclipse.modisco.facet.custom.ui.internal.exported;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.EClassCustomization;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.FacetCustomization;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.eclipse.modisco.facet.util.emf.core.command.ICommandFactoryResult;

public interface ICustomizationCommandFactory {

	ICommandFactoryResult<Customization> createCustomization(
			String name);
	
	ICommandFactoryResult<EClassCustomization> createEClassCustomization(
			Customization customization, EClass customedEClass, Query conformanceQuery);

	ICommandFactoryResult<FacetCustomization> createFacetCustomization(
			Customization customization, Facet customizedFacet);

	ICommandFactoryResult<Facet> setPropertyConfig(Facet typeCustomization,
			ETypedElement customizedTElt, // customized typed element
			FacetOperation customProperty,
			Query query);
}
