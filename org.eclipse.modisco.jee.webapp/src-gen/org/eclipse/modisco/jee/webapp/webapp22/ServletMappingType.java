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
package org.eclipse.modisco.jee.webapp.webapp22;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servlet Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getServletMappingType()
 * @model extendedMetaData="name='servlet-mapping_._type' kind='elementOnly'"
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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getServletMappingType_ServletName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='servlet-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ServletNameType getServletName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getServletName <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Name</em>' containment reference.
	 * @see #getServletName()
	 * @generated
	 */
	void setServletName(ServletNameType value);

	/**
	 * Returns the value of the '<em><b>Url Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Pattern</em>' containment reference.
	 * @see #setUrlPattern(UrlPatternType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getServletMappingType_UrlPattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url-pattern' namespace='##targetNamespace'"
	 * @generated
	 */
	UrlPatternType getUrlPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getUrlPattern <em>Url Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Pattern</em>' containment reference.
	 * @see #getUrlPattern()
	 * @generated
	 */
	void setUrlPattern(UrlPatternType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getServletMappingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ServletMappingType
