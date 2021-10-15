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
 * A representation of the model object '<em><b>Cookie Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The cookie-configType defines the configuration for the
 *         session tracking cookies of this web application.
 *         
 *         Used in: session-config
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getHttpOnly <em>Http Only</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType()
 * @model extendedMetaData="name='cookie-configType' kind='elementOnly'"
 * @generated
 */
public interface CookieConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The name that will be assigned to any session tracking
	 *             cookies created by this web application.
	 *             The default is JSESSIONID
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CookieNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	CookieNameType getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CookieNameType value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The domain name that will be assigned to any session tracking
	 *             cookies created by this web application.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CookieDomainType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	CookieDomainType getDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CookieDomainType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The path that will be assigned to any session tracking
	 *             cookies created by this web application.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(CookiePathType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	CookiePathType getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(CookiePathType value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The comment that will be assigned to any session tracking
	 *             cookies created by this web application.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(CookieCommentType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	CookieCommentType getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(CookieCommentType value);

	/**
	 * Returns the value of the '<em><b>Http Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Specifies whether any session tracking cookies created 
	 *             by this web application will be marked as HttpOnly
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Only</em>' containment reference.
	 * @see #setHttpOnly(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_HttpOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='http-only' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getHttpOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getHttpOnly <em>Http Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Only</em>' containment reference.
	 * @see #getHttpOnly()
	 * @generated
	 */
	void setHttpOnly(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Secure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Specifies whether any session tracking cookies created 
	 *             by this web application will be marked as secure
	 *             even if the request that initiated the corresponding session
	 *             is using plain HTTP instead of HTTPS
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secure</em>' containment reference.
	 * @see #setSecure(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_Secure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secure' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getSecure();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getSecure <em>Secure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure</em>' containment reference.
	 * @see #getSecure()
	 * @generated
	 */
	void setSecure(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Max Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The lifetime (in seconds) that will be assigned to any
	 *             session tracking cookies created by this web application.
	 *             Default is -1
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Age</em>' containment reference.
	 * @see #setMaxAge(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_MaxAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max-age' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getMaxAge();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getMaxAge <em>Max Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Age</em>' containment reference.
	 * @see #getMaxAge()
	 * @generated
	 */
	void setMaxAge(XsdIntegerType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieConfigType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CookieConfigType
