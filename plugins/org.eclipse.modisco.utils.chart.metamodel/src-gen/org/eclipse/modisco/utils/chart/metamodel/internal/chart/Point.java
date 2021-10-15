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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point#getSerie <em>Serie</em>}</li>
 *   <li>{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v20.html\r\n * \r\n * Contributors: Guillaume Doux - INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * Returns the value of the '<em><b>Serie</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serie</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serie</em>' container reference.
	 * @see #setSerie(Serie)
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartPackage#getPoint_Serie()
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie#getPoints
	 * @model opposite="points" required="true" transient="false"
	 * @generated
	 */
	Serie getSerie();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point#getSerie <em>Serie</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serie</em>' container reference.
	 * @see #getSerie()
	 * @generated
	 */
	void setSerie(Serie value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference list.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartPackage#getPoint_Coordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coordinate> getCoordinates();

} // Point
