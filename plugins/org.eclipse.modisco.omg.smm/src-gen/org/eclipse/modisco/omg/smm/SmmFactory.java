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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.omg.smm.SmmPackage
 * @generated
 */
public interface SmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmmFactory eINSTANCE = org.eclipse.modisco.omg.smm.impl.SmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Aggregated Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Measurement</em>'.
	 * @generated
	 */
	AggregatedMeasurement createAggregatedMeasurement();

	/**
	 * Returns a new object of class '<em>Base1 Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base1 Measurement Relationship</em>'.
	 * @generated
	 */
	Base1MeasurementRelationship createBase1MeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Base1 Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base1 Measure Relationship</em>'.
	 * @generated
	 */
	Base1MeasureRelationship createBase1MeasureRelationship();

	/**
	 * Returns a new object of class '<em>Base2 Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base2 Measurement Relationship</em>'.
	 * @generated
	 */
	Base2MeasurementRelationship createBase2MeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Base2 Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base2 Measure Relationship</em>'.
	 * @generated
	 */
	Base2MeasureRelationship createBase2MeasureRelationship();

	/**
	 * Returns a new object of class '<em>Base Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Measurement Relationship</em>'.
	 * @generated
	 */
	BaseMeasurementRelationship createBaseMeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Base Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Measure Relationship</em>'.
	 * @generated
	 */
	BaseMeasureRelationship createBaseMeasureRelationship();

	/**
	 * Returns a new object of class '<em>Binary Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Measure</em>'.
	 * @generated
	 */
	BinaryMeasure createBinaryMeasure();

	/**
	 * Returns a new object of class '<em>Binary Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Measurement</em>'.
	 * @generated
	 */
	BinaryMeasurement createBinaryMeasurement();

	/**
	 * Returns a new object of class '<em>Category Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Relationship</em>'.
	 * @generated
	 */
	CategoryRelationship createCategoryRelationship();

	/**
	 * Returns a new object of class '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic</em>'.
	 * @generated
	 */
	Characteristic createCharacteristic();

	/**
	 * Returns a new object of class '<em>Collective Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collective Measure</em>'.
	 * @generated
	 */
	CollectiveMeasure createCollectiveMeasure();

	/**
	 * Returns a new object of class '<em>Collective Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collective Measurement</em>'.
	 * @generated
	 */
	CollectiveMeasurement createCollectiveMeasurement();

	/**
	 * Returns a new object of class '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count</em>'.
	 * @generated
	 */
	Count createCount();

	/**
	 * Returns a new object of class '<em>Counting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counting</em>'.
	 * @generated
	 */
	Counting createCounting();

	/**
	 * Returns a new object of class '<em>Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimensional Measure</em>'.
	 * @generated
	 */
	DimensionalMeasure createDimensionalMeasure();

	/**
	 * Returns a new object of class '<em>Direct Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Measure</em>'.
	 * @generated
	 */
	DirectMeasure createDirectMeasure();

	/**
	 * Returns a new object of class '<em>Direct Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Measurement</em>'.
	 * @generated
	 */
	DirectMeasurement createDirectMeasurement();

	/**
	 * Returns a new object of class '<em>Equivalent Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Measure Relationship</em>'.
	 * @generated
	 */
	EquivalentMeasureRelationship createEquivalentMeasureRelationship();

	/**
	 * Returns a new object of class '<em>Equivalent Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Measurement Relationship</em>'.
	 * @generated
	 */
	EquivalentMeasurementRelationship createEquivalentMeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grade</em>'.
	 * @generated
	 */
	Grade createGrade();

	/**
	 * Returns a new object of class '<em>Measure Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Category</em>'.
	 * @generated
	 */
	MeasureCategory createMeasureCategory();

	/**
	 * Returns a new object of class '<em>Measure Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Library</em>'.
	 * @generated
	 */
	MeasureLibrary createMeasureLibrary();

	/**
	 * Returns a new object of class '<em>Named Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Measure</em>'.
	 * @generated
	 */
	NamedMeasure createNamedMeasure();

	/**
	 * Returns a new object of class '<em>Named Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Measurement</em>'.
	 * @generated
	 */
	NamedMeasurement createNamedMeasurement();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Observation Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Scope</em>'.
	 * @generated
	 */
	ObservationScope createObservationScope();

	/**
	 * Returns a new object of class '<em>Observed Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observed Measure</em>'.
	 * @generated
	 */
	ObservedMeasure createObservedMeasure();

	/**
	 * Returns a new object of class '<em>OCL Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Operation</em>'.
	 * @generated
	 */
	OCLOperation createOCLOperation();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranking</em>'.
	 * @generated
	 */
	Ranking createRanking();

	/**
	 * Returns a new object of class '<em>Ranking Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranking Interval</em>'.
	 * @generated
	 */
	RankingInterval createRankingInterval();

	/**
	 * Returns a new object of class '<em>Ranking Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranking Measure Relationship</em>'.
	 * @generated
	 */
	RankingMeasureRelationship createRankingMeasureRelationship();

	/**
	 * Returns a new object of class '<em>Ranking Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranking Measurement Relationship</em>'.
	 * @generated
	 */
	RankingMeasurementRelationship createRankingMeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio Measure</em>'.
	 * @generated
	 */
	RatioMeasure createRatioMeasure();

	/**
	 * Returns a new object of class '<em>Ratio Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio Measurement</em>'.
	 * @generated
	 */
	RatioMeasurement createRatioMeasurement();

	/**
	 * Returns a new object of class '<em>Recursive Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recursive Measure Relationship</em>'.
	 * @generated
	 */
	RecursiveMeasureRelationship createRecursiveMeasureRelationship();

	/**
	 * Returns a new object of class '<em>Recursive Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recursive Measurement Relationship</em>'.
	 * @generated
	 */
	RecursiveMeasurementRelationship createRecursiveMeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Refinement Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refinement Measure Relationship</em>'.
	 * @generated
	 */
	RefinementMeasureRelationship createRefinementMeasureRelationship();

	/**
	 * Returns a new object of class '<em>Refinement Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refinement Measurement Relationship</em>'.
	 * @generated
	 */
	RefinementMeasurementRelationship createRefinementMeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Rescaled Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rescaled Measure</em>'.
	 * @generated
	 */
	RescaledMeasure createRescaledMeasure();

	/**
	 * Returns a new object of class '<em>Rescale Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rescale Measure Relationship</em>'.
	 * @generated
	 */
	RescaleMeasureRelationship createRescaleMeasureRelationship();

	/**
	 * Returns a new object of class '<em>Rescaled Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rescaled Measurement</em>'.
	 * @generated
	 */
	RescaledMeasurement createRescaledMeasurement();

	/**
	 * Returns a new object of class '<em>Rescale Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rescale Measurement Relationship</em>'.
	 * @generated
	 */
	RescaleMeasurementRelationship createRescaleMeasurementRelationship();

	/**
	 * Returns a new object of class '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope</em>'.
	 * @generated
	 */
	Scope createScope();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SmmModel createSmmModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SmmPackage getSmmPackage();

} //SmmFactory
