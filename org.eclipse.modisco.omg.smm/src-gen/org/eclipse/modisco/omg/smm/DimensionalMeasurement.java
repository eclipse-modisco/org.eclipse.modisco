/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurementFrom <em>Base Measurement From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement1From <em>Base Measurement1 From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement2From <em>Base Measurement2 From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRescaleTo <em>Rescale To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRankingFrom <em>Ranking From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface DimensionalMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasurement_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Base Measurement From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.BaseMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.BaseMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasurement_BaseMeasurementFrom()
	 * @see org.eclipse.modisco.omg.smm.BaseMeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<BaseMeasurementRelationship> getBaseMeasurementFrom();

	/**
	 * Returns the value of the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.Base1MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement1 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement1 From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasurement_BaseMeasurement1From()
	 * @see org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Base1MeasurementRelationship> getBaseMeasurement1From();

	/**
	 * Returns the value of the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement2 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement2 From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasurement_BaseMeasurement2From()
	 * @see org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Base2MeasurementRelationship> getBaseMeasurement2From();

	/**
	 * Returns the value of the '<em><b>Rescale To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale To</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasurement_RescaleTo()
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<RescaleMeasurementRelationship> getRescaleTo();

	/**
	 * Returns the value of the '<em><b>Ranking From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasurement_RankingFrom()
	 * @see org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<RankingMeasurementRelationship> getRankingFrom();

} // DimensionalMeasurement
