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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Catch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.TypesCatchBlock#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getTypesCatchBlock()
 * @model
 * @generated
 */
public interface TypesCatchBlock extends CatchBlock {
	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getTypesCatchBlock_Exceptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Type> getExceptions();

} // TypesCatchBlock
