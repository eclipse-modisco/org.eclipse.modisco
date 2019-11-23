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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCollectiveMeasure()
 * @model
 * @generated
 */
public interface CollectiveMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure</em>' reference.
	 * @see #setBaseMeasure(DimensionalMeasure)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCollectiveMeasure_BaseMeasure()
	 * @model required="true"
	 * @generated
	 */
	DimensionalMeasure getBaseMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure</em>' reference.
	 * @see #getBaseMeasure()
	 * @generated
	 */
	void setBaseMeasure(DimensionalMeasure value);

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
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCollectiveMeasure_Accumulator()
	 * @model required="true"
	 * @generated
	 */
	Accumulator getAccumulator();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' attribute.
	 * @see org.eclipse.gmt.modisco.omg.smm.Accumulator
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Accumulator value);

} // CollectiveMeasure
