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
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getOutMeasure <em>Out Measure</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getInMeasure <em>In Measure</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getTrait <em>Trait</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measure#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure()
 * @model abstract="true"
 * @generated
 */
public interface Measure extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Category}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Category#getCategoryMeasure <em>Category Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_Category()
	 * @see org.eclipse.gmt.modisco.omg.smm.Category#getCategoryMeasure
	 * @model opposite="categoryMeasure"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_Library()
	 * @model
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

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
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Equivalent From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent From</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_EquivalentFrom()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measure#getEquivalentTo
	 * @model opposite="equivalentTo"
	 * @generated
	 */
	EList<Measure> getEquivalentFrom();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_EquivalentTo()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measure#getEquivalentFrom
	 * @model opposite="equivalentFrom"
	 * @generated
	 */
	EList<Measure> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_Refinement()
	 * @model
	 * @generated
	 */
	EList<Measure> getRefinement();

	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Measurement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_Measurement()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measurement#getMeasure
	 * @model opposite="measure"
	 * @generated
	 */
	EList<Measurement> getMeasurement();

	/**
	 * Returns the value of the '<em><b>Out Measure</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Measure</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_OutMeasure()
	 * @see org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<MeasureRelationship> getOutMeasure();

	/**
	 * Returns the value of the '<em><b>In Measure</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Measure</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_InMeasure()
	 * @see org.eclipse.gmt.modisco.omg.smm.MeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<MeasureRelationship> getInMeasure();

	/**
	 * Returns the value of the '<em><b>Trait</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Characteristic#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trait</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait</em>' reference.
	 * @see #setTrait(Characteristic)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_Trait()
	 * @see org.eclipse.gmt.modisco.omg.smm.Characteristic#getCharacteristics
	 * @model opposite="characteristics" required="true"
	 * @generated
	 */
	Characteristic getTrait();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getTrait <em>Trait</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait</em>' reference.
	 * @see #getTrait()
	 * @generated
	 */
	void setTrait(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Scope#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(Scope)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasure_Scope()
	 * @see org.eclipse.gmt.modisco.omg.smm.Scope#getMeasures
	 * @model opposite="measures" required="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // Measure
