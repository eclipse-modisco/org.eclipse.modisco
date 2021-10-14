/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java;

import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wild Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.WildCardType#isUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.WildCardType#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getWildCardType()
 * @model
 * @generated
 */
public interface WildCardType extends Type {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(boolean)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getWildCardType_UpperBound()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.WildCardType#isUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #isUpperBound()
	 * @generated
	 */
	void setUpperBound(boolean value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(TypeAccess)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getWildCardType_Bound()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TypeAccess getBound();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.WildCardType#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(TypeAccess value);

} // WildCardType
