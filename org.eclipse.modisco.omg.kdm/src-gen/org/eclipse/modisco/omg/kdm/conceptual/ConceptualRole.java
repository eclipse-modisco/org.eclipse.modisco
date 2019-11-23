/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage#getConceptualRole()
 * @model
 * @generated
 */
public interface ConceptualRole extends AbstractConceptualElement {
	/**
	 * Returns the value of the '<em><b>Conceptual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Element</em>' reference.
	 * @see #setConceptualElement(AbstractConceptualElement)
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage#getConceptualRole_ConceptualElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractConceptualElement getConceptualElement();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole#getConceptualElement <em>Conceptual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conceptual Element</em>' reference.
	 * @see #getConceptualElement()
	 * @generated
	 */
	void setConceptualElement(AbstractConceptualElement value);

} // ConceptualRole
