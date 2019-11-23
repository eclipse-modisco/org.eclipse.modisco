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
package org.eclipse.modisco.jee.webapp.webapp23;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taglib Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibUri <em>Taglib Uri</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibLocation <em>Taglib Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getTaglibType()
 * @model extendedMetaData="name='taglib_._type' kind='elementOnly'"
 * @generated
 */
public interface TaglibType extends EObject {
	/**
	 * Returns the value of the '<em><b>Taglib Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taglib Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taglib Uri</em>' containment reference.
	 * @see #setTaglibUri(TaglibUriType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getTaglibType_TaglibUri()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='taglib-uri' namespace='##targetNamespace'"
	 * @generated
	 */
	TaglibUriType getTaglibUri();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibUri <em>Taglib Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taglib Uri</em>' containment reference.
	 * @see #getTaglibUri()
	 * @generated
	 */
	void setTaglibUri(TaglibUriType value);

	/**
	 * Returns the value of the '<em><b>Taglib Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taglib Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taglib Location</em>' containment reference.
	 * @see #setTaglibLocation(TaglibLocationType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getTaglibType_TaglibLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='taglib-location' namespace='##targetNamespace'"
	 * @generated
	 */
	TaglibLocationType getTaglibLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibLocation <em>Taglib Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taglib Location</em>' containment reference.
	 * @see #getTaglibLocation()
	 * @generated
	 */
	void setTaglibLocation(TaglibLocationType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getTaglibType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TaglibType
