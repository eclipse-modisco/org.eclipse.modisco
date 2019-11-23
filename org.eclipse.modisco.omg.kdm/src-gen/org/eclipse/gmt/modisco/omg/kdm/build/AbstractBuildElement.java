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
package org.eclipse.gmt.modisco.omg.kdm.build;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Build Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.build.AbstractBuildElement#getBuildRelation <em>Build Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.build.BuildPackage#getAbstractBuildElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractBuildElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Build Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.build.AbstractBuildRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Relation</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.build.BuildPackage#getAbstractBuildElement_BuildRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractBuildRelationship> getBuildRelation();

} // AbstractBuildElement
