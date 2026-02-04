/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.AggregatedMeasurement#isIsBaseSuppled <em>Is Base Suppled</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.AggregatedMeasurement#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getAggregatedMeasurement()
 * @model
 * @generated
 */
public interface AggregatedMeasurement extends DimensionalMeasurement {
	/**
	 * Returns the value of the '<em><b>Is Base Suppled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Suppled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Suppled</em>' attribute.
	 * @see #setIsBaseSuppled(boolean)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getAggregatedMeasurement_IsBaseSuppled()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBaseSuppled();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.AggregatedMeasurement#isIsBaseSuppled <em>Is Base Suppled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Suppled</em>' attribute.
	 * @see #isIsBaseSuppled()
	 * @generated
	 */
	void setIsBaseSuppled(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Measurement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.DimensionalMeasurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getAggregatedMeasurement_BaseMeasurement()
	 * @model
	 * @generated
	 */
	EList<DimensionalMeasurement> getBaseMeasurement();

} // AggregatedMeasurement
