/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.source;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The InventoryModel is a specific KDM model which corresponds to the physical (engineering) view of the existing
 * software system. InventoryModel is a container for the instances of InventoryItems. InventoryModel corresponds to the
 * inventory of the physical artifacts of the existing software system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel#getInventoryElement <em>Inventory Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.source.SourcePackage#getInventoryModel()
 * @model
 * @generated
 */
public interface InventoryModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Inventory Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of inventory elements owned by the inventory model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory Element</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.SourcePackage#getInventoryModel_InventoryElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractInventoryElement> getInventoryElement();

} // InventoryModel
