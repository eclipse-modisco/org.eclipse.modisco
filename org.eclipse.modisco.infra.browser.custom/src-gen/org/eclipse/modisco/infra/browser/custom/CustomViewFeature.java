/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom View Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getCustomizedFeature <em>Customized Feature</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getValueCases <em>Value Cases</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getCustomView <em>Custom View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getCustomViewFeature()
 * @model
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface CustomViewFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Customized Feature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.infra.browser.custom.CustomizableFeatures}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customized Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customized Feature</em>' attribute.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomizableFeatures
	 * @see #setCustomizedFeature(CustomizableFeatures)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getCustomViewFeature_CustomizedFeature()
	 * @model
	 * @generated
	 */
	CustomizableFeatures getCustomizedFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getCustomizedFeature <em>Customized Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customized Feature</em>' attribute.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomizableFeatures
	 * @see #getCustomizedFeature()
	 * @generated
	 */
	void setCustomizedFeature(CustomizableFeatures value);

	/**
	 * Returns the value of the '<em><b>Value Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Cases</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getCustomViewFeature_ValueCases()
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	EList<FeatureValueCase> getValueCases();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.FeatureValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(FeatureValue)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getCustomViewFeature_DefaultValue()
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValue#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	FeatureValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(FeatureValue value);

	/**
	 * Returns the value of the '<em><b>Custom View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.CustomView#getCustomizedFeatures <em>Customized Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom View</em>' container reference.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getCustomViewFeature_CustomView()
	 * @see org.eclipse.modisco.infra.browser.custom.CustomView#getCustomizedFeatures
	 * @model opposite="customizedFeatures" required="true" transient="false" changeable="false"
	 * @generated
	 */
	CustomView getCustomView();

} // CustomViewFeature
