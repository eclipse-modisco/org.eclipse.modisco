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
package org.eclipse.modisco.jee.webapp.webapp30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The session-configType defines the session parameters
 *         for this web application.
 *         
 *         Used in: web-app
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getCookieConfig <em>Cookie Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getTrackingMode <em>Tracking Mode</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getSessionConfigType()
 * @model extendedMetaData="name='session-configType' kind='elementOnly'"
 * @generated
 */
public interface SessionConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The session-timeout element defines the default
	 *             session timeout interval for all sessions created
	 *             in this web application. The specified timeout
	 *             must be expressed in a whole number of minutes.
	 *             If the timeout is 0 or less, the container ensures
	 *             the default behaviour of sessions is never to time
	 *             out. If this element is not specified, the container
	 *             must set its default timeout period.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Timeout</em>' containment reference.
	 * @see #setSessionTimeout(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getSessionConfigType_SessionTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='session-timeout' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getSessionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getSessionTimeout <em>Session Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' containment reference.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Cookie Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The cookie-config element defines the configuration of the
	 *             session tracking cookies created by this web application.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cookie Config</em>' containment reference.
	 * @see #setCookieConfig(CookieConfigType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getSessionConfigType_CookieConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cookie-config' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	CookieConfigType getCookieConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getCookieConfig <em>Cookie Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie Config</em>' containment reference.
	 * @see #getCookieConfig()
	 * @generated
	 */
	void setCookieConfig(CookieConfigType value);

	/**
	 * Returns the value of the '<em><b>Tracking Mode</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The tracking-mode element defines the tracking modes
	 *             for sessions created by this web application
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tracking Mode</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getSessionConfigType_TrackingMode()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='tracking-mode' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<TrackingModeType> getTrackingMode();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getSessionConfigType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SessionConfigType
