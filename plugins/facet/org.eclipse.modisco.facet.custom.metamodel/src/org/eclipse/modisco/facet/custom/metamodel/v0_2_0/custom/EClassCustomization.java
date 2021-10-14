/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *       Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *       Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning 
 */
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.Facet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EClassCustomization contains the customization for an EClass. There must not exist two EClassCustomizations customizing the same EClass in the same customization.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.CustomPackage#getEClassCustomization()
 * @model
 * @generated
 */
public interface EClassCustomization extends Facet {
} // EClassCustomization
