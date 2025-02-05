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
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.CustomPackage;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.EClassCustomization;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EClassCustomizationImpl extends FacetImpl implements EClassCustomization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassCustomizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomPackage.Literals.ECLASS_CUSTOMIZATION;
	}

} //EClassCustomizationImpl
