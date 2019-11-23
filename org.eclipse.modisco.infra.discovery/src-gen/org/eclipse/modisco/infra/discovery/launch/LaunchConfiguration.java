/**
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.launch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration#getDiscoverer <em>Discoverer</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration#isOpenModelAfterDiscovery <em>Open Model After Discovery</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.launch.LaunchPackage#getLaunchConfiguration()
 * @model
 * @generated
 */
public interface LaunchConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(Object)
	 * @see org.eclipse.modisco.infra.discovery.launch.LaunchPackage#getLaunchConfiguration_Source()
	 * @model dataType="org.eclipse.modisco.facet.util.emf.core.serialization.model.serialization.ExtensibleSerializableJavaObject"
	 * @generated
	 */
	Object getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Object value);

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.launch.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.launch.LaunchPackage#getLaunchConfiguration_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameterValues();

	/**
	 * Returns the value of the '<em><b>Discoverer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoverer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoverer</em>' reference.
	 * @see #setDiscoverer(DiscovererDescription)
	 * @see org.eclipse.modisco.infra.discovery.launch.LaunchPackage#getLaunchConfiguration_Discoverer()
	 * @model required="true"
	 * @generated
	 */
	DiscovererDescription getDiscoverer();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration#getDiscoverer <em>Discoverer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discoverer</em>' reference.
	 * @see #getDiscoverer()
	 * @generated
	 */
	void setDiscoverer(DiscovererDescription value);

	/**
	 * Returns the value of the '<em><b>Open Model After Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Model After Discovery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Model After Discovery</em>' attribute.
	 * @see #setOpenModelAfterDiscovery(boolean)
	 * @see org.eclipse.modisco.infra.discovery.launch.LaunchPackage#getLaunchConfiguration_OpenModelAfterDiscovery()
	 * @model
	 * @generated
	 */
	boolean isOpenModelAfterDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration#isOpenModelAfterDiscovery <em>Open Model After Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Model After Discovery</em>' attribute.
	 * @see #isOpenModelAfterDiscovery()
	 * @generated
	 */
	void setOpenModelAfterDiscovery(boolean value);

} // LaunchConfiguration
