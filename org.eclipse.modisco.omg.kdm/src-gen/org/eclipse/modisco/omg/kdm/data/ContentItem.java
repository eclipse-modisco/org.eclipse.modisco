/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.ContentItem#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.ContentItem#getContentElement <em>Content Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.data.DataPackage#getContentItem()
 * @model
 * @generated
 */
public interface ContentItem extends AbstractContentElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComplexContentType)
	 * @see org.eclipse.modisco.omg.kdm.data.DataPackage#getContentItem_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ComplexContentType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.data.ContentItem#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComplexContentType value);

	/**
	 * Returns the value of the '<em><b>Content Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.data.AbstractContentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.data.DataPackage#getContentItem_ContentElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractContentElement> getContentElement();

} // ContentItem
