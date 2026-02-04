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
 * A representation of the model object '<em><b>Aggregate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.AggregateType#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.AggregateType#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAggregateType()
 * @model abstract="true"
 * @generated
 */
public interface AggregateType extends DataType {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.MemberObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAggregateType_Members()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MemberObject> getMembers();

	/**
	 * Returns the value of the '<em><b>Opens Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opens Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens Scope</em>' reference.
	 * @see #setOpensScope(AggregateScope)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAggregateType_OpensScope()
	 * @model required="true"
	 * @generated
	 */
	AggregateScope getOpensScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.AggregateType#getOpensScope <em>Opens Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens Scope</em>' reference.
	 * @see #getOpensScope()
	 * @generated
	 */
	void setOpensScope(AggregateScope value);

} // AggregateType
