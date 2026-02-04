/**
 * *******************************************************************************
 *  * Copyright (c) 2012, 2019 INRIA. All rights reserved. This program and the
 *  * accompanying materials are made available under the terms of the Eclipse
 *  * Public License v1.0 which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v20.html
 *  * 
 *  * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *  * 
 *  ******************************************************************************
 * 
 */
package org.eclipse.modisco.utils.chart.metamodel.internal.chart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getAxe <em>Axe</em>}</li>
 *   <li>{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartPackage#getCoordinate()
 * @model
 * @generated
 */
public interface Coordinate extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v20.html\r\n * \r\n * Contributors: Guillaume Doux - INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * Returns the value of the '<em><b>Axe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axe</em>' reference.
	 * @see #setAxe(Axe)
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartPackage#getCoordinate_Axe()
	 * @model
	 * @generated
	 */
	Axe getAxe();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getAxe <em>Axe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axe</em>' reference.
	 * @see #getAxe()
	 * @generated
	 */
	void setAxe(Axe value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartPackage#getCoordinate_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Coordinate
