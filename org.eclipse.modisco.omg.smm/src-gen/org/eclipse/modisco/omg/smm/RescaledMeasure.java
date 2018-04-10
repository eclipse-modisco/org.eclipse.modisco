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
 * A representation of the model object '<em><b>Rescaled Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.RescaledMeasure#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.RescaledMeasure#getRescaleFrom <em>Rescale From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRescaledMeasure()
 * @model
 * @generated
 */
public interface RescaledMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRescaledMeasure_Formula()
	 * @model required="true"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.RescaledMeasure#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Rescale From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RescaleMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRescaledMeasure_RescaleFrom()
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<RescaleMeasureRelationship> getRescaleFrom();

} // RescaledMeasure
