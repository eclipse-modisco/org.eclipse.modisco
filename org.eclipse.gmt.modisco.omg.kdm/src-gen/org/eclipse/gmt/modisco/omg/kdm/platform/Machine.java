/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.platform.Machine#getDeployedComponent <em>Deployed Component</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.platform.Machine#getDeployedResource <em>Deployed Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends AbstractPlatformElement {
	/**
	 * Returns the value of the '<em><b>Deployed Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.platform.DeployedComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Component</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getMachine_DeployedComponent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DeployedComponent> getDeployedComponent();

	/**
	 * Returns the value of the '<em><b>Deployed Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.platform.DeployedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Resource</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getMachine_DeployedResource()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DeployedResource> getDeployedResource();

} // Machine
