/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp22;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getRealmName <em>Realm Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getFormLoginConfig <em>Form Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getLoginConfigType()
 * @model extendedMetaData="name='login-config_._type' kind='elementOnly'"
 * @generated
 */
public interface LoginConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Auth Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Method</em>' containment reference.
	 * @see #setAuthMethod(AuthMethodType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getLoginConfigType_AuthMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auth-method' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthMethodType getAuthMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getAuthMethod <em>Auth Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Method</em>' containment reference.
	 * @see #getAuthMethod()
	 * @generated
	 */
	void setAuthMethod(AuthMethodType value);

	/**
	 * Returns the value of the '<em><b>Realm Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Name</em>' containment reference.
	 * @see #setRealmName(RealmNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getLoginConfigType_RealmName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='realm-name' namespace='##targetNamespace'"
	 * @generated
	 */
	RealmNameType getRealmName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getRealmName <em>Realm Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realm Name</em>' containment reference.
	 * @see #getRealmName()
	 * @generated
	 */
	void setRealmName(RealmNameType value);

	/**
	 * Returns the value of the '<em><b>Form Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Login Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Login Config</em>' containment reference.
	 * @see #setFormLoginConfig(FormLoginConfigType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getLoginConfigType_FormLoginConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form-login-config' namespace='##targetNamespace'"
	 * @generated
	 */
	FormLoginConfigType getFormLoginConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getFormLoginConfig <em>Form Login Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Login Config</em>' containment reference.
	 * @see #getFormLoginConfig()
	 * @generated
	 */
	void setFormLoginConfig(FormLoginConfigType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getLoginConfigType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LoginConfigType
