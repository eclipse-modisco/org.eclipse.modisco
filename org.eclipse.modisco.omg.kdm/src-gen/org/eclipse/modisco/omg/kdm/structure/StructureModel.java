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
package org.eclipse.modisco.omg.kdm.structure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.StructureModel#getStructureElement <em>Structure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.structure.StructurePackage#getStructureModel()
 * @model
 * @generated
 */
public interface StructureModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Structure Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.structure.AbstractStructureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.structure.StructurePackage#getStructureModel_StructureElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractStructureElement> getStructureElement();

} // StructureModel
