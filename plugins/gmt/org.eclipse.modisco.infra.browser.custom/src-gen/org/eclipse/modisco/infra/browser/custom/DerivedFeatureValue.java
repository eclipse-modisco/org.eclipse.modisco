/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
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

import org.eclipse.modisco.infra.query.ModelQuery;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue#getValueCalculator <em>Value Calculator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getDerivedFeatureValue()
 * @model
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface DerivedFeatureValue extends FeatureValue {
	/**
	 * Returns the value of the '<em><b>Value Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Calculator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Calculator</em>' reference.
	 * @see #setValueCalculator(ModelQuery)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getDerivedFeatureValue_ValueCalculator()
	 * @model required="true"
	 * @generated
	 */
	ModelQuery getValueCalculator();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue#getValueCalculator <em>Value Calculator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Calculator</em>' reference.
	 * @see #getValueCalculator()
	 * @generated
	 */
	void setValueCalculator(ModelQuery value);

} // DerivedFeatureValue
