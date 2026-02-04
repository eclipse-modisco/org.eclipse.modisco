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
package org.eclipse.modisco.jee.webapp.webapp23;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterClass <em>Filter Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType()
 * @model extendedMetaData="name='filter_._type' kind='elementOnly'"
 * @generated
 */
public interface FilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(IconType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='##targetNamespace'"
	 * @generated
	 */
	IconType getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(IconType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType_FilterName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filter-name' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterNameType getFilterName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterName <em>Filter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' containment reference.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(FilterNameType value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(DisplayNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(DisplayNameType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Filter Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Class</em>' containment reference.
	 * @see #setFilterClass(FilterClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType_FilterClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filter-class' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterClassType getFilterClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterClass <em>Filter Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Class</em>' containment reference.
	 * @see #getFilterClass()
	 * @generated
	 */
	void setFilterClass(FilterClassType value);

	/**
	 * Returns the value of the '<em><b>Init Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Param</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType_InitParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init-param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InitParamType> getInitParam();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getFilterType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FilterType
