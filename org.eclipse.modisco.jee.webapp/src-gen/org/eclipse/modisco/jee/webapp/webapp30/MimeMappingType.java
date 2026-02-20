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
 * A representation of the model object '<em><b>Mime Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The mime-mappingType defines a mapping between an extension
 *         and a mime type.
 *         
 *         Used in: web-app
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMimeMappingType()
 * @model extendedMetaData="name='mime-mappingType' kind='elementOnly'"
 * @generated
 */
public interface MimeMappingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMimeMappingType_Extension()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' containment reference.
	 * @see #setMimeType(MimeTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMimeMappingType_MimeType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mime-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MimeTypeType getMimeType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getMimeType <em>Mime Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' containment reference.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(MimeTypeType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMimeMappingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MimeMappingType
