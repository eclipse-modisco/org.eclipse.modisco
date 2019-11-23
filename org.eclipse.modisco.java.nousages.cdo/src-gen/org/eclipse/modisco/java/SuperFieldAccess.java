/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.modisco.java.AbstractTypeQualifiedExpression;
import org.eclipse.modisco.java.SingleVariableAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.SuperFieldAccess#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getSuperFieldAccess()
 * @model
 * @generated
 */
public interface SuperFieldAccess extends AbstractTypeQualifiedExpression {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(SingleVariableAccess)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getSuperFieldAccess_Field()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SingleVariableAccess getField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.SuperFieldAccess#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(SingleVariableAccess value);

} // SuperFieldAccess
