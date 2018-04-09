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
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getTrait <em>Trait</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getMeasureLabelFormat <em>Measure Label Format</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getRefinementTo <em>Refinement To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getRefinementFrom <em>Refinement From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getRecursiveTo <em>Recursive To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getRecursiveFrom <em>Recursive From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getMeasurementLabelFormat <em>Measurement Label Format</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getMeasureRelationships <em>Measure Relationships</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measure#getDefaultQuery <em>Default Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure()
 * @model abstract="true"
 * @generated
 */
public interface Measure extends AbstractMeasureElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.MeasureCategory}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.MeasureCategory#getCategoryMeasure <em>Category Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_Category()
	 * @see org.eclipse.modisco.omg.smm.MeasureCategory#getCategoryMeasure
	 * @model opposite="categoryMeasure"
	 * @generated
	 */
	EList<MeasureCategory> getCategory();

	/**
	 * Returns the value of the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trait</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait</em>' reference.
	 * @see #setTrait(Characteristic)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_Trait()
	 * @model required="true"
	 * @generated
	 */
	Characteristic getTrait();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#getTrait <em>Trait</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait</em>' reference.
	 * @see #getTrait()
	 * @generated
	 */
	void setTrait(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(Scope)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_Scope()
	 * @model required="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Label Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Label Format</em>' attribute.
	 * @see #setMeasureLabelFormat(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_MeasureLabelFormat()
	 * @model
	 * @generated
	 */
	String getMeasureLabelFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#getMeasureLabelFormat <em>Measure Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Label Format</em>' attribute.
	 * @see #getMeasureLabelFormat()
	 * @generated
	 */
	void setMeasureLabelFormat(String value);

	/**
	 * Returns the value of the '<em><b>Refinement To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RefinementMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement To</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_RefinementTo()
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<RefinementMeasureRelationship> getRefinementTo();

	/**
	 * Returns the value of the '<em><b>Refinement From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RefinementMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_RefinementFrom()
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<RefinementMeasureRelationship> getRefinementFrom();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_EquivalentTo()
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<EquivalentMeasureRelationship> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Equivalent From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_EquivalentFrom()
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<EquivalentMeasureRelationship> getEquivalentFrom();

	/**
	 * Returns the value of the '<em><b>Recursive To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive To</em>' reference.
	 * @see #setRecursiveTo(RecursiveMeasureRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_RecursiveTo()
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	RecursiveMeasureRelationship getRecursiveTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#getRecursiveTo <em>Recursive To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive To</em>' reference.
	 * @see #getRecursiveTo()
	 * @generated
	 */
	void setRecursiveTo(RecursiveMeasureRelationship value);

	/**
	 * Returns the value of the '<em><b>Recursive From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive From</em>' reference.
	 * @see #setRecursiveFrom(RecursiveMeasureRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_RecursiveFrom()
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	RecursiveMeasureRelationship getRecursiveFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#getRecursiveFrom <em>Recursive From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive From</em>' reference.
	 * @see #getRecursiveFrom()
	 * @generated
	 */
	void setRecursiveFrom(RecursiveMeasureRelationship value);

	/**
	 * Returns the value of the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Label Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Label Format</em>' attribute.
	 * @see #setMeasurementLabelFormat(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_MeasurementLabelFormat()
	 * @model
	 * @generated
	 */
	String getMeasurementLabelFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#getMeasurementLabelFormat <em>Measurement Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Label Format</em>' attribute.
	 * @see #getMeasurementLabelFormat()
	 * @generated
	 */
	void setMeasurementLabelFormat(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.MeasureRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Relationships</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_MeasureRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureRelationship> getMeasureRelationships();

	/**
	 * Returns the value of the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Query</em>' reference.
	 * @see #setDefaultQuery(Operation)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasure_DefaultQuery()
	 * @model
	 * @generated
	 */
	Operation getDefaultQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measure#getDefaultQuery <em>Default Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Query</em>' reference.
	 * @see #getDefaultQuery()
	 * @generated
	 */
	void setDefaultQuery(Operation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Argument> getAllArguments();

} // Measure
