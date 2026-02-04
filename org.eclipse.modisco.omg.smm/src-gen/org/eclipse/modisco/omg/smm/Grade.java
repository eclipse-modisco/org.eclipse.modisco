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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.Grade#getBaseMeasurement <em>Base Measurement</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Grade#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Grade#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Grade#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getGrade()
 * @model
 * @generated
 */
public interface Grade extends Measurement {
	/**
	 * Returns the value of the '<em><b>Base Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement</em>' reference.
	 * @see #setBaseMeasurement(DimensionalMeasurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getGrade_BaseMeasurement()
	 * @model
	 * @generated
	 */
	DimensionalMeasurement getBaseMeasurement();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Grade#getBaseMeasurement <em>Base Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measurement</em>' reference.
	 * @see #getBaseMeasurement()
	 * @generated
	 */
	void setBaseMeasurement(DimensionalMeasurement value);

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
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getGrade_IsBaseSupplied()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBaseSupplied();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Grade#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #isIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getGrade_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Grade#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ranking To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking To</em>' reference.
	 * @see #setRankingTo(RankingMeasurementRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getGrade_RankingTo()
	 * @see org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	RankingMeasurementRelationship getRankingTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Grade#getRankingTo <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking To</em>' reference.
	 * @see #getRankingTo()
	 * @generated
	 */
	void setRankingTo(RankingMeasurementRelationship value);

} // Grade
