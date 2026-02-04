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
package org.eclipse.modisco.jee.webapp.webapp30;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Page Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The error-pageType contains a mapping between an error code
 *         or exception type to the path of a resource in the web
 *         application.
 *         
 *         Error-page declarations using the exception-type element in
 *         the deployment descriptor must be unique up to the class name of
 *         the exception-type. Similarly, error-page declarations using the
 *         status-code element must be unique in the deployment descriptor
 *         up to the status code.
 *         
 *         Used in: web-app
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getErrorPageType()
 * @model extendedMetaData="name='error-pageType' kind='elementOnly'"
 * @generated
 */
public interface ErrorPageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' containment reference.
	 * @see #setErrorCode(ErrorCodeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getErrorPageType_ErrorCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error-code' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ErrorCodeType getErrorCode();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getErrorCode <em>Error Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' containment reference.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(ErrorCodeType value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *               The exception-type contains a fully qualified class
	 *               name of a Java exception type.
	 *               
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' containment reference.
	 * @see #setExceptionType(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getErrorPageType_ExceptionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exception-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getExceptionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getExceptionType <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' containment reference.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The location element contains the location of the
	 *             resource in the web application relative to the root of
	 *             the web application. The value of the location must have
	 *             a leading `/'.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(WarPathType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getErrorPageType_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	WarPathType getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(WarPathType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getErrorPageType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ErrorPageType
