/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp23;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Login Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFormLoginConfigType()
 * @model extendedMetaData="name='form-login-config_._type' kind='elementOnly'"
 * @generated
 */
public interface FormLoginConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Form Login Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Login Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Login Page</em>' containment reference.
	 * @see #setFormLoginPage(FormLoginPageType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFormLoginConfigType_FormLoginPage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='form-login-page' namespace='##targetNamespace'"
	 * @generated
	 */
	FormLoginPageType getFormLoginPage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Login Page</em>' containment reference.
	 * @see #getFormLoginPage()
	 * @generated
	 */
	void setFormLoginPage(FormLoginPageType value);

	/**
	 * Returns the value of the '<em><b>Form Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Error Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Error Page</em>' containment reference.
	 * @see #setFormErrorPage(FormErrorPageType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFormLoginConfigType_FormErrorPage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='form-error-page' namespace='##targetNamespace'"
	 * @generated
	 */
	FormErrorPageType getFormErrorPage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Error Page</em>' containment reference.
	 * @see #getFormErrorPage()
	 * @generated
	 */
	void setFormErrorPage(FormErrorPageType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFormLoginConfigType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FormLoginConfigType
