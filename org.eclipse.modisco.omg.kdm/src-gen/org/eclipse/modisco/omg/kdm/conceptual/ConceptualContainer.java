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
package org.eclipse.modisco.omg.kdm.conceptual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualContainer#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage#getConceptualContainer()
 * @model
 * @generated
 */
public interface ConceptualContainer extends AbstractConceptualElement {
	/**
	 * Returns the value of the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage#getConceptualContainer_ConceptualElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractConceptualElement> getConceptualElement();

} // ConceptualContainer
