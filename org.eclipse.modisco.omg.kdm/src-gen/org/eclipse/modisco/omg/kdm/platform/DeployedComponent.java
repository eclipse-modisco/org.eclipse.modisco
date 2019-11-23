/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.platform;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.code.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.DeployedComponent#getGroupedCode <em>Grouped Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.platform.PlatformPackage#getDeployedComponent()
 * @model
 * @generated
 */
public interface DeployedComponent extends AbstractPlatformElement {
	/**
	 * Returns the value of the '<em><b>Grouped Code</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.code.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Code</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Code</em>' reference list.
	 * @see org.eclipse.modisco.omg.kdm.platform.PlatformPackage#getDeployedComponent_GroupedCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Module> getGroupedCode();

} // DeployedComponent
