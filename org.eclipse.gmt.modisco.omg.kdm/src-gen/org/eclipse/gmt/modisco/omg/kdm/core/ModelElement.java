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
package org.eclipse.gmt.modisco.omg.kdm.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model element is an element that represents some aspect of the existing system.
 * In the meta-model, a ModelElement is the base for all meta-elements of KDM. All other meta-elements are either direct
 * or indirect subclasses of ModelElement. ModelElement is an abstract meta-model element.
 * A ModelElement can be extended through the lightweight extension mechanism.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.core.ModelElement#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.core.ModelElement#getTaggedValue <em>Tagged Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.core.CorePackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends Element {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of stereotype applied to current element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stereotype</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.CorePackage#getModelElement_Stereotype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Stereotype> getStereotype();

	/**
	 * Returns the value of the '<em><b>Tagged Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of tagged values determined by the stereotype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tagged Value</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.CorePackage#getModelElement_TaggedValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtendedValue> getTaggedValue();

} // ModelElement
