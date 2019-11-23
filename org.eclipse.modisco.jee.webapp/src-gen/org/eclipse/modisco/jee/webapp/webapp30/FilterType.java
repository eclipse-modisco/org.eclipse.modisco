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
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The filterType is used to declare a filter in the web
 *         application. The filter is mapped to either a servlet or a
 *         URL pattern in the filter-mapping element, using the
 *         filter-name value to reference. Filters can access the
 *         initialization parameters declared in the deployment
 *         descriptor at runtime via the FilterConfig interface.
 *         
 *         Used in: web-app
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterClass <em>Filter Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getAsyncSupported <em>Async Supported</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType()
 * @model extendedMetaData="name='filterType' kind='elementOnly'"
 * @generated
 */
public interface FilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Name</em>' containment reference.
	 * @see #setFilterName(FilterNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_FilterName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filter-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FilterNameType getFilterName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterName <em>Filter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' containment reference.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(FilterNameType value);

	/**
	 * Returns the value of the '<em><b>Filter Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The fully qualified classname of the filter.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Class</em>' containment reference.
	 * @see #setFilterClass(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_FilterClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getFilterClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterClass <em>Filter Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Class</em>' containment reference.
	 * @see #getFilterClass()
	 * @generated
	 */
	void setFilterClass(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Async Supported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Supported</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Supported</em>' containment reference.
	 * @see #setAsyncSupported(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_AsyncSupported()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='async-supported' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getAsyncSupported();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getAsyncSupported <em>Async Supported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async Supported</em>' containment reference.
	 * @see #getAsyncSupported()
	 * @generated
	 */
	void setAsyncSupported(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Init Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The init-param element contains a name/value pair as
	 *             an initialization param of a servlet filter
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Param</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_InitParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init-param' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ParamValueType> getInitParam();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getFilterType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FilterType
