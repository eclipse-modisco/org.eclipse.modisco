/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.code;

import org.eclipse.modisco.omg.kdm.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.CommentUnit#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getCommentUnit()
 * @model
 * @generated
 */
public interface CommentUnit extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getCommentUnit_Text()
	 * @model dataType=org.eclipse.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.code.CommentUnit#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // CommentUnit
