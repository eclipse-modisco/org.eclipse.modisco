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
package org.eclipse.modisco.jee.webapp.webapp24;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Resource Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The web-resource-collectionType is used to identify a subset
 * 	of the resources and HTTP methods on those resources within
 * 	a web application to which a security constraint applies. If
 * 	no HTTP methods are specified, then the security constraint
 * 	applies to all HTTP methods.
 * 
 * 	Used in: security-constraint
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getWebResourceName <em>Web Resource Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebResourceCollectionType()
 * @model extendedMetaData="name='web-resource-collectionType' kind='elementOnly'"
 * @generated
 */
public interface WebResourceCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Web Resource Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The web-resource-name contains the name of this web
	 * 	    resource collection.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Web Resource Name</em>' containment reference.
	 * @see #setWebResourceName(org.eclipse.modisco.jee.webapp.webapp24.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebResourceCollectionType_WebResourceName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='web-resource-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp24.String getWebResourceName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getWebResourceName <em>Web Resource Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Resource Name</em>' containment reference.
	 * @see #getWebResourceName()
	 * @generated
	 */
	void setWebResourceName(org.eclipse.modisco.jee.webapp.webapp24.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebResourceCollectionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Url Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Pattern</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebResourceCollectionType_UrlPattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url-pattern' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<UrlPatternType> getUrlPattern();

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebResourceCollectionType_HttpMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='http-method' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<HttpMethodType> getHttpMethod();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebResourceCollectionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // WebResourceCollectionType
