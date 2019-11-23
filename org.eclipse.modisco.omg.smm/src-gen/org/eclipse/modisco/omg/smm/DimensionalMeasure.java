/**
 * Copyright (c) 2010 Mia-Software.
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
 * A representation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasureFrom <em>Base Measure From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasure1From <em>Base Measure1 From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasure2From <em>Base Measure2 From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getRescaleTo <em>Rescale To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getRankingFrom <em>Ranking From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasure()
 * @model
 * @generated
 */
public interface DimensionalMeasure extends Measure {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasure_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Base Measure From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.BaseMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.BaseMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasure_BaseMeasureFrom()
	 * @see org.eclipse.modisco.omg.smm.BaseMeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<BaseMeasureRelationship> getBaseMeasureFrom();

	/**
	 * Returns the value of the '<em><b>Base Measure1 From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.Base1MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure1 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure1 From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasure_BaseMeasure1From()
	 * @see org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Base1MeasureRelationship> getBaseMeasure1From();

	/**
	 * Returns the value of the '<em><b>Base Measure2 From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.Base2MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure2 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure2 From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasure_BaseMeasure2From()
	 * @see org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Base2MeasureRelationship> getBaseMeasure2From();

	/**
	 * Returns the value of the '<em><b>Rescale To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale To</em>' reference.
	 * @see #setRescaleTo(RescaleMeasureRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasure_RescaleTo()
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	RescaleMeasureRelationship getRescaleTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getRescaleTo <em>Rescale To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rescale To</em>' reference.
	 * @see #getRescaleTo()
	 * @generated
	 */
	void setRescaleTo(RescaleMeasureRelationship value);

	/**
	 * Returns the value of the '<em><b>Ranking From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RankingMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getDimensionalMeasure_RankingFrom()
	 * @see org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<RankingMeasureRelationship> getRankingFrom();

} // DimensionalMeasure
