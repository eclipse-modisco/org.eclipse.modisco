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
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ForStatement#getInitBody <em>Init Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ForStatement#getIterationBody <em>Iteration Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getForStatement()
 * @model abstract="true"
 * @generated
 */
public interface ForStatement extends LoopStatement {
	/**
	 * Returns the value of the '<em><b>Init Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Body</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getForStatement_InitBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getInitBody();

	/**
	 * Returns the value of the '<em><b>Iteration Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration Body</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getForStatement_IterationBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIterationBody();

} // ForStatement
