/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;

import java.lang.Boolean;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SwitchCase#getIsEvaluateAllCases <em>Is Evaluate All Cases</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SwitchCase#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSwitchCase()
 * @model
 * @generated
 */
public interface SwitchCase extends MinorSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Is Evaluate All Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Evaluate All Cases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Evaluate All Cases</em>' attribute.
	 * @see #setIsEvaluateAllCases(Boolean)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSwitchCase_IsEvaluateAllCases()
	 * @model
	 * @generated
	 */
	Boolean getIsEvaluateAllCases();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SwitchCase#getIsEvaluateAllCases <em>Is Evaluate All Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Evaluate All Cases</em>' attribute.
	 * @see #getIsEvaluateAllCases()
	 * @generated
	 */
	void setIsEvaluateAllCases(Boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSwitchCase_Body()
	 * @model required="true"
	 * @generated
	 */
	EList<Statement> getBody();

} // SwitchCase
