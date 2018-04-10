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
package org.eclipse.modisco.omg.smm.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.modisco.omg.smm.Measurement;
import org.eclipse.modisco.omg.smm.MeasurementRelationship;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementRelationshipImpl extends SmmElementImpl implements MeasurementRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASUREMENT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getTo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getFrom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //MeasurementRelationshipImpl
