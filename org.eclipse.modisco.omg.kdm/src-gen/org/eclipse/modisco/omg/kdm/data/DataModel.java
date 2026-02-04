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
package org.eclipse.modisco.omg.kdm.data;

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
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.DataModel#getDataElement <em>Data Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.data.DataPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Data Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.data.AbstractDataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.data.DataPackage#getDataModel_DataElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractDataElement> getDataElement();

} // DataModel
