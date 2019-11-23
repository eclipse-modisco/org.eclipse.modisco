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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement1To <em>Base Measurement1 To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement2To <em>Base Measurement2 To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasurement()
 * @model
 * @generated
 */
public interface BinaryMeasurement extends DimensionalMeasurement {
	/**
	 * Returns the value of the '<em><b>Base Measurement1 To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement1 To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement1 To</em>' containment reference.
	 * @see #setBaseMeasurement1To(Base1MeasurementRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasurement_BaseMeasurement1To()
	 * @see org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getFrom
	 * @model opposite="from" containment="true"
	 * @generated
	 */
	Base1MeasurementRelationship getBaseMeasurement1To();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement1To <em>Base Measurement1 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measurement1 To</em>' containment reference.
	 * @see #getBaseMeasurement1To()
	 * @generated
	 */
	void setBaseMeasurement1To(Base1MeasurementRelationship value);

	/**
	 * Returns the value of the '<em><b>Base Measurement2 To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement2 To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement2 To</em>' containment reference.
	 * @see #setBaseMeasurement2To(Base2MeasurementRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasurement_BaseMeasurement2To()
	 * @see org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getFrom
	 * @model opposite="from" containment="true"
	 * @generated
	 */
	Base2MeasurementRelationship getBaseMeasurement2To();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement2To <em>Base Measurement2 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measurement2 To</em>' containment reference.
	 * @see #getBaseMeasurement2To()
	 * @generated
	 */
	void setBaseMeasurement2To(Base2MeasurementRelationship value);

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
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBinaryMeasurement_IsBaseSupplied()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBaseSupplied();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #isIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(boolean value);

} // BinaryMeasurement
