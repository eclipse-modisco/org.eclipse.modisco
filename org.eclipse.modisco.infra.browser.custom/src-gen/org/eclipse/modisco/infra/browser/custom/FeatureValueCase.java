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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getFeatureValueCase()
 * @model
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface FeatureValueCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(ModelQuery)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getFeatureValueCase_Condition()
	 * @model required="true"
	 * @generated
	 */
	ModelQuery getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ModelQuery value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.FeatureValue#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(FeatureValue)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getFeatureValueCase_Value()
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValue#getCase
	 * @model opposite="case" containment="true" required="true"
	 * @generated
	 */
	FeatureValue getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(FeatureValue value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getValueCases <em>Value Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' container reference.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getFeatureValueCase_Feature()
	 * @see org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getValueCases
	 * @model opposite="valueCases" required="true" transient="false" changeable="false"
	 * @generated
	 */
	CustomViewFeature getFeature();

} // FeatureValueCase
