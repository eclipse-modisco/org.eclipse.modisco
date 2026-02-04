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
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Scope#getDefinitionObject <em>Definition Object</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Scope#getChildScope <em>Child Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends GASTMSemanticObject {
	/**
	 * Returns the value of the '<em><b>Definition Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Object</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getScope_DefinitionObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionObject> getDefinitionObject();

	/**
	 * Returns the value of the '<em><b>Child Scope</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Scope</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Scope</em>' reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getScope_ChildScope()
	 * @model
	 * @generated
	 */
	EList<Scope> getChildScope();

} // Scope
