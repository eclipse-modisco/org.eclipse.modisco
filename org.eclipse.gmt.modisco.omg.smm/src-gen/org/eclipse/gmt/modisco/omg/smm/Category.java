/**
 * *******************************************************************************
 * Copyright (c) 2008 Castor Technologies Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alain Picard (Castor Technologies Inc) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Category#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Category#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Category#getCategoryElement <em>Category Element</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Category#getOutCategory <em>Out Category</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Category#getInCategory <em>In Category</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Category#getCategoryMeasure <em>Category Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends SmmElement {
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
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Category}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Category#getCategoryElement <em>Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategory_Category()
	 * @see org.eclipse.gmt.modisco.omg.smm.Category#getCategoryElement
	 * @model opposite="categoryElement"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Category Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Category}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Category#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Element</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategory_CategoryElement()
	 * @see org.eclipse.gmt.modisco.omg.smm.Category#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<Category> getCategoryElement();

	/**
	 * Returns the value of the '<em><b>Out Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Category</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategory_OutCategory()
	 * @see org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<CategoryRelationship> getOutCategory();

	/**
	 * Returns the value of the '<em><b>In Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Category</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategory_InCategory()
	 * @see org.eclipse.gmt.modisco.omg.smm.CategoryRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<CategoryRelationship> getInCategory();

	/**
	 * Returns the value of the '<em><b>Category Measure</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Measure</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCategory_CategoryMeasure()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measure#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<Measure> getCategoryMeasure();

} // Category
