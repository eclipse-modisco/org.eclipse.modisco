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
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.EnumConstantDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.EnumDeclaration#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getEnumDeclaration()
 * @model
 * @generated
 */
public interface EnumDeclaration extends AbstractTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Enum Constants</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.EnumConstantDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Constants</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getEnumDeclaration_EnumConstants()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumConstantDeclaration> getEnumConstants();

} // EnumDeclaration
