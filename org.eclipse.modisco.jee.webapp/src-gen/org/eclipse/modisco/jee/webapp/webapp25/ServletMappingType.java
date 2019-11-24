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
package org.eclipse.modisco.jee.webapp.webapp25;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servlet Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The servlet-mappingType defines a mapping between a
 * 	servlet and a url pattern.
 * 
 * 	Used in: web-app
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getServletMappingType()
 * @model extendedMetaData="name='servlet-mappingType' kind='elementOnly'"
 * @generated
 */
public interface ServletMappingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Name</em>' containment reference.
	 * @see #setServletName(ServletNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getServletMappingType_ServletName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='servlet-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ServletNameType getServletName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType#getServletName <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Name</em>' containment reference.
	 * @see #getServletName()
	 * @generated
	 */
	void setServletName(ServletNameType value);

	/**
	 * Returns the value of the '<em><b>Url Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Pattern</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getServletMappingType_UrlPattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url-pattern' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<UrlPatternType> getUrlPattern();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getServletMappingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ServletMappingType
