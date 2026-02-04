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
package org.eclipse.modisco.omg.kdm.build;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.build.BuildResource#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.build.BuildResource#getGroupedBuild <em>Grouped Build</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.build.BuildResource#getBuildElement <em>Build Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.build.BuildPackage#getBuildResource()
 * @model
 * @generated
 */
public interface BuildResource extends AbstractBuildElement {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.core.KDMEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see org.eclipse.modisco.omg.kdm.build.BuildPackage#getBuildResource_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMEntity> getImplementation();

	/**
	 * Returns the value of the '<em><b>Grouped Build</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.build.AbstractBuildElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Build</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Build</em>' reference list.
	 * @see org.eclipse.modisco.omg.kdm.build.BuildPackage#getBuildResource_GroupedBuild()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractBuildElement> getGroupedBuild();

	/**
	 * Returns the value of the '<em><b>Build Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.build.AbstractBuildElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.build.BuildPackage#getBuildResource_BuildElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractBuildElement> getBuildElement();

} // BuildResource
