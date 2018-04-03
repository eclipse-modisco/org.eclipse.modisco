/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Web Resource Collection Type</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The web-resource-collectionType is used to identify the
 *         resources and HTTP methods on those resources to which a
 *         security constraint applies. If no HTTP methods are specified,
 *         then the security constraint applies to all HTTP methods.
 *         If HTTP methods are specified by http-method-omission
 *         elements, the security constraint applies to all methods
 *         except those identified in the collection.
 *         http-method-omission and http-method elements are never
 *         mixed in the same collection. 
 *         
 *         Used in: security-constraint
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getWebResourceName <em>Web Resource Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getHttpMethodOmission <em>Http Method Omission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getWebResourceCollectionType()
 * @model extendedMetaData="name='web-resource-collectionType' kind='elementOnly'"
 * @generated
 */
public interface WebResourceCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Web Resource Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc -->
	 * 
	 * 
	 * The web-resource-name contains the name of this web resource collection.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Web Resource Name</em>' containment
	 *         reference.
	 * @see #setWebResourceName(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getWebResourceCollectionType_WebResourceName()
	 * @model containment="true" required="true" extendedMetaData=
	 *        "kind='element' name='web-resource-name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getWebResourceName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getWebResourceName <em>Web Resource Name</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Resource Name</em>' containment reference.
	 * @see #getWebResourceName()
	 * @generated
	 */
	void setWebResourceName(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.DescriptionType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' containment reference
	 *         list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getWebResourceCollectionType_Description()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Url Pattern</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Pattern</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Url Pattern</em>' containment reference
	 *         list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getWebResourceCollectionType_UrlPattern()
	 * @model containment="true" required="true" extendedMetaData=
	 *        "kind='element' name='url-pattern' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UrlPatternType> getUrlPattern();

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * 
	 * Each http-method names an HTTP method to which the constraint applies.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Http Method</em>' attribute list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getWebResourceCollectionType_HttpMethod()
	 * @model unique="false"
	 *        dataType="org.eclipse.modisco.jee.webapp.webapp30.HttpMethodType"
	 *        extendedMetaData=
	 *        "kind='element' name='http-method' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getHttpMethod();

	/**
	 * Returns the value of the '<em><b>Http Method Omission</b></em>' attribute
	 * list. The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * 
	 * Each http-method-omission names an HTTP method to which the constraint
	 * does not apply.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Http Method Omission</em>' attribute list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getWebResourceCollectionType_HttpMethodOmission()
	 * @model unique="false"
	 *        dataType="org.eclipse.modisco.jee.webapp.webapp30.HttpMethodType"
	 *        extendedMetaData=
	 *        "kind='element' name='http-method-omission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getHttpMethodOmission();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getWebResourceCollectionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // WebResourceCollectionType
