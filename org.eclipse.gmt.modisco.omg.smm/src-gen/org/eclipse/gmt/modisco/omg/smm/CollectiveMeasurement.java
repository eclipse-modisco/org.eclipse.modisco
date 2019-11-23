/**
 * *******************************************************************************
 * Copyright (c) 2008 Castor Technologies Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alain Picard (Castor Technologies Inc) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasurement#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCollectiveMeasurement()
 * @model
 * @generated
 */
public interface CollectiveMeasurement extends DimensionalMeasurement {
	/**
	 * Returns the value of the '<em><b>Accumulator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.modisco.omg.smm.Accumulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulator</em>' attribute.
	 * @see org.eclipse.gmt.modisco.omg.smm.Accumulator
	 * @see #setAccumulator(Accumulator)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCollectiveMeasurement_Accumulator()
	 * @model required="true"
	 * @generated
	 */
	Accumulator getAccumulator();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' attribute.
	 * @see org.eclipse.gmt.modisco.omg.smm.Accumulator
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Accumulator value);

	/**
	 * Returns the value of the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Supplied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #setIsBaseSupplied(boolean)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCollectiveMeasurement_IsBaseSupplied()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBaseSupplied();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #isIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Measurement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.DimensionalMeasurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCollectiveMeasurement_BaseMeasurement()
	 * @model
	 * @generated
	 */
	EList<DimensionalMeasurement> getBaseMeasurement();

} // CollectiveMeasurement
