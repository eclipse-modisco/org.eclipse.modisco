/**
 * *******************************************************************************
 * Copyright (c) 2008 Castor Technologies Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alain Picard (Castor Technologies Inc) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategoryRelationship()
 * @model
 * @generated
 */
public interface CategoryRelationship extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategoryRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Category#getOutCategory <em>Out Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Category)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategoryRelationship_From()
	 * @see org.eclipse.gmt.modisco.omg.smm.Category#getOutCategory
	 * @model opposite="outCategory" required="true"
	 * @generated
	 */
	Category getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Category value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Category#getInCategory <em>In Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Category)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategoryRelationship_To()
	 * @see org.eclipse.gmt.modisco.omg.smm.Category#getInCategory
	 * @model opposite="inCategory" required="true"
	 * @generated
	 */
	Category getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Category value);

} // CategoryRelationship
