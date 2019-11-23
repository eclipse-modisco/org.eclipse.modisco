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
package org.eclipse.modisco.omg.kdm.kdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.kdm.Segment#getSegment <em>Segment</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.kdm.Segment#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends KDMFramework {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.kdm.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getSegment_Segment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Segment> getSegment();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.kdm.KDMModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getSegment_Model()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<KDMModel> getModel();

} // Segment
