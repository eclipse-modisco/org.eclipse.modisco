/**
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discoverer Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationBundle <em>Implementation Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererDescription()
 * @model
 * @generated
 */
public interface DiscovererDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDiscoverer <em>Discoverer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Definitions</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererDescription_ParameterDefinitions()
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDiscoverer
	 * @model opposite="discoverer" containment="true"
	 * @generated
	 */
	EList<DiscovererParameter> getParameterDefinitions();

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
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererDescription_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see #setSourceType(Class)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererDescription_SourceType()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Class<?> getSourceType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' attribute.
	 * @see #setImplementationType(Class)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererDescription_ImplementationType()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Class<?> getImplementationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationType <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' attribute.
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Implementation Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Bundle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Bundle</em>' attribute.
	 * @see #setImplementationBundle(Bundle)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererDescription_ImplementationBundle()
	 * @model dataType="org.eclipse.modisco.infra.discovery.catalog.Bundle" required="true" transient="true"
	 * @generated
	 */
	Bundle getImplementationBundle();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationBundle <em>Implementation Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Bundle</em>' attribute.
	 * @see #getImplementationBundle()
	 * @generated
	 */
	void setImplementationBundle(Bundle value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterNameRequired="true"
	 * @generated
	 */
	DiscovererParameter getParameterDefinition(String parameterName);

} // DiscovererDescription
