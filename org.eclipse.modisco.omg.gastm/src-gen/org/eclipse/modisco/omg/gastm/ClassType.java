/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ClassType#getDerivesFrom <em>Derives From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getClassType()
 * @model
 * @generated
 */
public interface ClassType extends AggregateType {
	/**
	 * Returns the value of the '<em><b>Derives From</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.DerivesFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derives From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derives From</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getClassType_DerivesFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<DerivesFrom> getDerivesFrom();

} // ClassType
