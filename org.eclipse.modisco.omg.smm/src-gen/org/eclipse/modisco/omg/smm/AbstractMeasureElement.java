/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Measure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.AbstractMeasureElement#getInCategory <em>In Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getAbstractMeasureElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMeasureElement extends SmmElement {
	/**
	 * Returns the value of the '<em><b>In Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.CategoryRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Category</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getAbstractMeasureElement_InCategory()
	 * @model
	 * @generated
	 */
	EList<CategoryRelationship> getInCategory();

} // AbstractMeasureElement
