/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.MeasureLibrary#getMeasureElements <em>Measure Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.MeasureLibrary#getCategoryRelationships <em>Category Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasureLibrary()
 * @model
 * @generated
 */
public interface MeasureLibrary extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Measure Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.AbstractMeasureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Elements</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasureLibrary_MeasureElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMeasureElement> getMeasureElements();

	/**
	 * Returns the value of the '<em><b>Category Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.CategoryRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Relationships</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasureLibrary_CategoryRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRelationship> getCategoryRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractMeasureElement> getOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractMeasureElement> getOclOperations();

} // MeasureLibrary
