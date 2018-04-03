/**
 * *******************************************************************************
 *  * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 *  * accompanying materials are made available under the terms of the Eclipse
 *  * Public License v1.0 which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  * 
 *  * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *  * 
 *  ******************************************************************************
 * 
 */
package org.eclipse.modisco.utils.chart.metamodel.internal.chart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartFactory
 * @model kind="package"
 * @generated
 */
public interface ChartPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v10.html\r\n * \r\n * Contributors: Guillaume Doux - INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/modisco/utils/chart/0.11.incubation/internal/chart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartPackage eINSTANCE = org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartImpl
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 0;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__AXES = 0;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SERIES = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.AxeImpl <em>Axe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.AxeImpl
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getAxe()
	 * @generated
	 */
	int AXE = 1;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXE__LEGEND = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Axe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.SerieImpl <em>Serie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.SerieImpl
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getSerie()
	 * @generated
	 */
	int SERIE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE__POINTS = 1;

	/**
	 * The number of structural features of the '<em>Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.PointImpl
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 3;

	/**
	 * The feature id for the '<em><b>Serie</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__SERIE = 0;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__COORDINATES = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.CoordinateImpl
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 4;

	/**
	 * The feature id for the '<em><b>Axe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__AXE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axes</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart#getAxes()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Axes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart#getSeries()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Series();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart#getTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe <em>Axe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axe</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe
	 * @generated
	 */
	EClass getAxe();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe#getLegend()
	 * @see #getAxe()
	 * @generated
	 */
	EAttribute getAxe_Legend();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe#getUnit()
	 * @see #getAxe()
	 * @generated
	 */
	EAttribute getAxe_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serie</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie
	 * @generated
	 */
	EClass getSerie();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie#getName()
	 * @see #getSerie()
	 * @generated
	 */
	EAttribute getSerie_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie#getPoints()
	 * @see #getSerie()
	 * @generated
	 */
	EReference getSerie_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point#getSerie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Serie</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point#getSerie()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Serie();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point#getCoordinates()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Coordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getAxe <em>Axe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Axe</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getAxe()
	 * @see #getCoordinate()
	 * @generated
	 */
	EReference getCoordinate_Axe();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate#getValue()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChartFactory getChartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartImpl
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Axes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__AXES = eINSTANCE.getChart_Axes();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__SERIES = eINSTANCE.getChart_Series();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__TITLE = eINSTANCE.getChart_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.AxeImpl <em>Axe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.AxeImpl
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getAxe()
		 * @generated
		 */
		EClass AXE = eINSTANCE.getAxe();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXE__LEGEND = eINSTANCE.getAxe_Legend();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXE__UNIT = eINSTANCE.getAxe_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.SerieImpl <em>Serie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.SerieImpl
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getSerie()
		 * @generated
		 */
		EClass SERIE = eINSTANCE.getSerie();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE__NAME = eINSTANCE.getSerie_Name();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIE__POINTS = eINSTANCE.getSerie_Points();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.PointImpl
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Serie</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__SERIE = eINSTANCE.getPoint_Serie();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__COORDINATES = eINSTANCE.getPoint_Coordinates();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.CoordinateImpl
		 * @see org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.ChartPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>Axe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE__AXE = eINSTANCE.getCoordinate_Axe();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__VALUE = eINSTANCE.getCoordinate_Value();

	}

} //ChartPackage
