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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Locale Encoding Mapping Type</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The locale-encoding-mapping contains locale name and
 * 	encoding name. The locale name must be either "Language-code",
 * 	such as "ja", defined by ISO-639 or "Language-code_Country-code",
 * 	such as "ja_JP".  "Country code" is defined by ISO-3166.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getLocaleEncodingMappingType()
 * @model extendedMetaData="name='locale-encoding-mappingType' kind='elementOnly'"
 * @generated
 */
public interface LocaleEncodingMappingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getLocaleEncodingMappingType_Locale()
	 * @model dataType="org.eclipse.modisco.jee.webapp.webapp25.LocaleType"
	 *        required="true" extendedMetaData=
	 *        "kind='element' name='locale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType#getLocale
	 * <em>Locale</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getLocaleEncodingMappingType_Encoding()
	 * @model dataType="org.eclipse.modisco.jee.webapp.webapp25.EncodingType"
	 *        required="true" extendedMetaData=
	 *        "kind='element' name='encoding' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType#getEncoding
	 * <em>Encoding</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getLocaleEncodingMappingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LocaleEncodingMappingType
