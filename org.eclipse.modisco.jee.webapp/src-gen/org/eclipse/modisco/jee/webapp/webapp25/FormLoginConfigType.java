/**
 *   Copyright (c) 2010, 2019 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Login Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The form-login-configType specifies the login and error
 * 	pages that should be used in form based login. If form based
 * 	authentication is not used, these elements are ignored.
 * 
 * 	Used in: login-config
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFormLoginConfigType()
 * @model extendedMetaData="name='form-login-configType' kind='elementOnly'"
 * @generated
 */
public interface FormLoginConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Form Login Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The form-login-page element defines the location in the web
	 * 	    app where the page that can be used for login can be
	 * 	    found.  The path begins with a leading / and is interpreted
	 * 	    relative to the root of the WAR.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Login Page</em>' containment reference.
	 * @see #setFormLoginPage(WarPathType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFormLoginConfigType_FormLoginPage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='form-login-page' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	WarPathType getFormLoginPage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Login Page</em>' containment reference.
	 * @see #getFormLoginPage()
	 * @generated
	 */
	void setFormLoginPage(WarPathType value);

	/**
	 * Returns the value of the '<em><b>Form Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The form-error-page element defines the location in
	 * 	    the web app where the error page that is displayed
	 * 	    when login is not successful can be found.
	 * 	    The path begins with a leading / and is interpreted
	 * 	    relative to the root of the WAR.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Error Page</em>' containment reference.
	 * @see #setFormErrorPage(WarPathType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFormLoginConfigType_FormErrorPage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='form-error-page' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	WarPathType getFormErrorPage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Error Page</em>' containment reference.
	 * @see #getFormErrorPage()
	 * @generated
	 */
	void setFormErrorPage(WarPathType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFormLoginConfigType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FormLoginConfigType
