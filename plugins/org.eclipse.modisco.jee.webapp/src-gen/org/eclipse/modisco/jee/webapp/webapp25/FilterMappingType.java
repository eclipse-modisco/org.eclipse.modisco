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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	Declaration of the filter mappings in this web
 * 	application is done by using filter-mappingType.
 * 	The container uses the filter-mapping
 * 	declarations to decide which filters to apply to a request,
 * 	and in what order. The container matches the request URI to
 * 	a Servlet in the normal way. To determine which filters to
 * 	apply it matches filter-mapping declarations either on
 * 	servlet-name, or on url-pattern for each filter-mapping
 * 	element, depending on which style is used. The order in
 * 	which filters are invoked is the order in which
 * 	filter-mapping declarations that match a request URI for a
 * 	servlet appear in the list of filter-mapping elements.The
 * 	filter-name value must be the value of the filter-name
 * 	sub-elements of one of the filter declarations in the
 * 	deployment descriptor.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getDispatcher <em>Dispatcher</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFilterMappingType()
 * @model extendedMetaData="name='filter-mappingType' kind='elementOnly'"
 * @generated
 */
public interface FilterMappingType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFilterMappingType_FilterName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filter-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FilterNameType getFilterName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getFilterName <em>Filter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' containment reference.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(FilterNameType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFilterMappingType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFilterMappingType_UrlPattern()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='url-pattern' namespace='http://java.sun.com/xml/ns/javaee' group='#group:1'"
	 * @generated
	 */
	EList<UrlPatternType> getUrlPattern();

	/**
	 * Returns the value of the '<em><b>Servlet Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.ServletNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFilterMappingType_ServletName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='servlet-name' namespace='http://java.sun.com/xml/ns/javaee' group='#group:1'"
	 * @generated
	 */
	EList<ServletNameType> getServletName();

	/**
	 * Returns the value of the '<em><b>Dispatcher</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.DispatcherType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatcher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatcher</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFilterMappingType_Dispatcher()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='dispatcher' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DispatcherType> getDispatcher();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getFilterMappingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FilterMappingType
