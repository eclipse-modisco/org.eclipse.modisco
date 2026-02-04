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
 * A representation of the model object '<em><b>Binary Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure1To <em>Base Measure1 To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure2To <em>Base Measure2 To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasure()
 * @model
 * @generated
 */
public interface BinaryMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functor</em>' attribute.
	 * @see #setFunctor(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasure_Functor()
	 * @model required="true"
	 * @generated
	 */
	String getFunctor();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getFunctor <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functor</em>' attribute.
	 * @see #getFunctor()
	 * @generated
	 */
	void setFunctor(String value);

	/**
	 * Returns the value of the '<em><b>Base Measure1 To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure1 To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure1 To</em>' reference.
	 * @see #setBaseMeasure1To(Base1MeasureRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasure_BaseMeasure1To()
	 * @see org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	Base1MeasureRelationship getBaseMeasure1To();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure1To <em>Base Measure1 To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure1 To</em>' reference.
	 * @see #getBaseMeasure1To()
	 * @generated
	 */
	void setBaseMeasure1To(Base1MeasureRelationship value);

	/**
	 * Returns the value of the '<em><b>Base Measure2 To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure2 To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure2 To</em>' reference.
	 * @see #setBaseMeasure2To(Base2MeasureRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasure_BaseMeasure2To()
	 * @see org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	Base2MeasureRelationship getBaseMeasure2To();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure2To <em>Base Measure2 To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure2 To</em>' reference.
	 * @see #getBaseMeasure2To()
	 * @generated
	 */
	void setBaseMeasure2To(Base2MeasureRelationship value);

} // BinaryMeasure
