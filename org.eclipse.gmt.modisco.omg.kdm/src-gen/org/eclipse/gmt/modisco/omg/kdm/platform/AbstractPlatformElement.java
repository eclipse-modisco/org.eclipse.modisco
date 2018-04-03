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
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Platform Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformElement#getPlatformRelation <em>Platform Relation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformElement#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformElement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getAbstractPlatformElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPlatformElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.source.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getAbstractPlatformElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Platform Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Relation</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getAbstractPlatformElement_PlatformRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractPlatformRelationship> getPlatformRelation();

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.action.ActionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getAbstractPlatformElement_Abstraction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionElement> getAbstraction();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.platform.PlatformPackage#getAbstractPlatformElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractCodeElement> getImplementation();

} // AbstractPlatformElement
