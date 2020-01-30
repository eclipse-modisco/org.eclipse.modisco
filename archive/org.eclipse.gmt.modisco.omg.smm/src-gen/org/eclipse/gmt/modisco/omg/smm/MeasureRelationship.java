/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Castor Technologies Inc and others.
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
 * A representation of the model object '<em><b>Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasureRelationship()
 * @model
 * @generated
 */
public interface MeasureRelationship extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getOutMeasure <em>Out Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Measure)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasureRelationship_From()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measure#getOutMeasure
	 * @model opposite="outMeasure" required="true"
	 * @generated
	 */
	Measure getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Measure value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getInMeasure <em>In Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Measure)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasureRelationship_To()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measure#getInMeasure
	 * @model opposite="inMeasure" required="true"
	 * @generated
	 */
	Measure getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Measure value);

} // MeasureRelationship
