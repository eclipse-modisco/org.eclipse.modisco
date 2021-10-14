/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.AttributeView#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.AttributeView#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getAttributeView()
 * @model
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface AttributeView extends CustomView {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getAttributeView_AttributeName()
	 * @model
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.AttributeView#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.TypeView#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getAttributeView_Type()
	 * @see org.eclipse.modisco.infra.browser.custom.TypeView#getAttributes
	 * @model opposite="attributes" required="true" transient="false" changeable="false"
	 * @generated
	 */
	TypeView getType();

} // AttributeView
