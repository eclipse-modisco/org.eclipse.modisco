/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.browser.custom.emf;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.gmt.modisco.infra.browser.custom.AttributeView;
import org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.gmt.modisco.infra.browser.custom.DerivedFeatureValue;
import org.eclipse.gmt.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView;
import org.eclipse.gmt.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.gmt.modisco.infra.browser.custom.TypeView;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface UicustomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UicustomFactory eINSTANCE = org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.UicustomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metamodel View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel View</em>'.
	 * @generated
	 */
	MetamodelView createMetamodelView();

	/**
	 * Returns a new object of class '<em>Type View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type View</em>'.
	 * @generated
	 */
	TypeView createTypeView();

	/**
	 * Returns a new object of class '<em>Attribute View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute View</em>'.
	 * @generated
	 */
	AttributeView createAttributeView();

	/**
	 * Returns a new object of class '<em>Reference View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference View</em>'.
	 * @generated
	 */
	ReferenceView createReferenceView();

	/**
	 * Returns a new object of class '<em>Custom View Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom View Feature</em>'.
	 * @generated
	 */
	CustomViewFeature createCustomViewFeature();

	/**
	 * Returns a new object of class '<em>Feature Value Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Value Case</em>'.
	 * @generated
	 */
	FeatureValueCase createFeatureValueCase();

	/**
	 * Returns a new object of class '<em>Static Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Feature Value</em>'.
	 * @generated
	 */
	StaticFeatureValue createStaticFeatureValue();

	/**
	 * Returns a new object of class '<em>Derived Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Feature Value</em>'.
	 * @generated
	 */
	DerivedFeatureValue createDerivedFeatureValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UicustomPackage getUicustomPackage();

} //UicustomFactory
