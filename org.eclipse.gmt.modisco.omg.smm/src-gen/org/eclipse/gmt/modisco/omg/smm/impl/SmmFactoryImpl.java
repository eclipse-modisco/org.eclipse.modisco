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
package org.eclipse.gmt.modisco.omg.smm.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.modisco.omg.smm.Accumulator;
import org.eclipse.gmt.modisco.omg.smm.AggregatedMeasurement;
import org.eclipse.gmt.modisco.omg.smm.Annotation;
import org.eclipse.gmt.modisco.omg.smm.Attribute;
import org.eclipse.gmt.modisco.omg.smm.BinaryMeasure;
import org.eclipse.gmt.modisco.omg.smm.Category;
import org.eclipse.gmt.modisco.omg.smm.CategoryRelationship;
import org.eclipse.gmt.modisco.omg.smm.Characteristic;
import org.eclipse.gmt.modisco.omg.smm.CollectiveMeasure;
import org.eclipse.gmt.modisco.omg.smm.CollectiveMeasurement;
import org.eclipse.gmt.modisco.omg.smm.Count;
import org.eclipse.gmt.modisco.omg.smm.Counting;
import org.eclipse.gmt.modisco.omg.smm.DimensionalMeasure;
import org.eclipse.gmt.modisco.omg.smm.DirectMeasure;
import org.eclipse.gmt.modisco.omg.smm.DirectMeasurement;
import org.eclipse.gmt.modisco.omg.smm.Grade;
import org.eclipse.gmt.modisco.omg.smm.MeasureRelationship;
import org.eclipse.gmt.modisco.omg.smm.NamedMeasure;
import org.eclipse.gmt.modisco.omg.smm.NamedMeasurement;
import org.eclipse.gmt.modisco.omg.smm.Observation;
import org.eclipse.gmt.modisco.omg.smm.Ranking;
import org.eclipse.gmt.modisco.omg.smm.RankingInterval;
import org.eclipse.gmt.modisco.omg.smm.RatioMeasure;
import org.eclipse.gmt.modisco.omg.smm.ReScaledMeasurement;
import org.eclipse.gmt.modisco.omg.smm.RescaledMeasure;
import org.eclipse.gmt.modisco.omg.smm.Scope;
import org.eclipse.gmt.modisco.omg.smm.SmmFactory;
import org.eclipse.gmt.modisco.omg.smm.SmmModel;
import org.eclipse.gmt.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class SmmFactoryImpl extends EFactoryImpl implements SmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmmFactory init() {
		try {
			SmmFactory theSmmFactory = (SmmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/smm");  //$NON-NLS-1$
			if (theSmmFactory != null) {
				return theSmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(final EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmmPackage.SMM_MODEL: return createSmmModel();
			case SmmPackage.CATEGORY_RELATIONSHIP: return createCategoryRelationship();
			case SmmPackage.CATEGORY: return createCategory();
			case SmmPackage.OBSERVATION: return createObservation();
			case SmmPackage.MEASURE_RELATIONSHIP: return createMeasureRelationship();
			case SmmPackage.DIMENSIONAL_MEASURE: return createDimensionalMeasure();
			case SmmPackage.RANKING: return createRanking();
			case SmmPackage.RANKING_INTERVAL: return createRankingInterval();
			case SmmPackage.CHARACTERISTIC: return createCharacteristic();
			case SmmPackage.SCOPE: return createScope();
			case SmmPackage.BINARY_MEASURE: return createBinaryMeasure();
			case SmmPackage.DIRECT_MEASURE: return createDirectMeasure();
			case SmmPackage.COLLECTIVE_MEASURE: return createCollectiveMeasure();
			case SmmPackage.NAMED_MEASURE: return createNamedMeasure();
			case SmmPackage.RESCALED_MEASURE: return createRescaledMeasure();
			case SmmPackage.RATIO_MEASURE: return createRatioMeasure();
			case SmmPackage.COUNTING: return createCounting();
			case SmmPackage.GRADE: return createGrade();
			case SmmPackage.DIRECT_MEASUREMENT: return createDirectMeasurement();
			case SmmPackage.COUNT: return createCount();
			case SmmPackage.COLLECTIVE_MEASUREMENT: return createCollectiveMeasurement();
			case SmmPackage.AGGREGATED_MEASUREMENT: return createAggregatedMeasurement();
			case SmmPackage.NAMED_MEASUREMENT: return createNamedMeasurement();
			case SmmPackage.RE_SCALED_MEASUREMENT: return createReScaledMeasurement();
			case SmmPackage.ATTRIBUTE: return createAttribute();
			case SmmPackage.ANNOTATION: return createAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(final EDataType eDataType, final String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmmPackage.ACCUMULATOR:
				return createAccumulatorFromString(eDataType, initialValue);
			case SmmPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case SmmPackage.TIMESTAMP:
				return createTimestampFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(final EDataType eDataType, final Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmmPackage.ACCUMULATOR:
				return convertAccumulatorToString(eDataType, instanceValue);
			case SmmPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case SmmPackage.TIMESTAMP:
				return convertTimestampToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmModel createSmmModel() {
		SmmModelImpl smmModel = new SmmModelImpl();
		return smmModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryRelationship createCategoryRelationship() {
		CategoryRelationshipImpl categoryRelationship = new CategoryRelationshipImpl();
		return categoryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureRelationship createMeasureRelationship() {
		MeasureRelationshipImpl measureRelationship = new MeasureRelationshipImpl();
		return measureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure createDimensionalMeasure() {
		DimensionalMeasureImpl dimensionalMeasure = new DimensionalMeasureImpl();
		return dimensionalMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ranking createRanking() {
		RankingImpl ranking = new RankingImpl();
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingInterval createRankingInterval() {
		RankingIntervalImpl rankingInterval = new RankingIntervalImpl();
		return rankingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic createCharacteristic() {
		CharacteristicImpl characteristic = new CharacteristicImpl();
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryMeasure createBinaryMeasure() {
		BinaryMeasureImpl binaryMeasure = new BinaryMeasureImpl();
		return binaryMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectMeasure createDirectMeasure() {
		DirectMeasureImpl directMeasure = new DirectMeasureImpl();
		return directMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasure createCollectiveMeasure() {
		CollectiveMeasureImpl collectiveMeasure = new CollectiveMeasureImpl();
		return collectiveMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMeasure createNamedMeasure() {
		NamedMeasureImpl namedMeasure = new NamedMeasureImpl();
		return namedMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaledMeasure createRescaledMeasure() {
		RescaledMeasureImpl rescaledMeasure = new RescaledMeasureImpl();
		return rescaledMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioMeasure createRatioMeasure() {
		RatioMeasureImpl ratioMeasure = new RatioMeasureImpl();
		return ratioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counting createCounting() {
		CountingImpl counting = new CountingImpl();
		return counting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectMeasurement createDirectMeasurement() {
		DirectMeasurementImpl directMeasurement = new DirectMeasurementImpl();
		return directMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasurement createCollectiveMeasurement() {
		CollectiveMeasurementImpl collectiveMeasurement = new CollectiveMeasurementImpl();
		return collectiveMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedMeasurement createAggregatedMeasurement() {
		AggregatedMeasurementImpl aggregatedMeasurement = new AggregatedMeasurementImpl();
		return aggregatedMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMeasurement createNamedMeasurement() {
		NamedMeasurementImpl namedMeasurement = new NamedMeasurementImpl();
		return namedMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReScaledMeasurement createReScaledMeasurement() {
		ReScaledMeasurementImpl reScaledMeasurement = new ReScaledMeasurementImpl();
		return reScaledMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator createAccumulatorFromString(final EDataType eDataType, final String initialValue) {
		Accumulator result = Accumulator.get(initialValue);
		if (result == null)
		 {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccumulatorToString(final EDataType eDataType, final Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(final EDataType eDataType, final String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(final EDataType eDataType, final Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestampFromString(final EDataType eDataType, final String initialValue) {
		return (Timestamp)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampToString(final EDataType eDataType, final Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmPackage getSmmPackage() {
		return (SmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmmPackage getPackage() {
		return SmmPackage.eINSTANCE;
	}

} //SmmFactoryImpl
