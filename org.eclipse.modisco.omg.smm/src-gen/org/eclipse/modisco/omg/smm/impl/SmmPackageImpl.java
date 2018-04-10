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
package org.eclipse.modisco.omg.smm.impl;

import java.sql.Timestamp;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.modisco.omg.smm.AbstractMeasureElement;
import org.eclipse.modisco.omg.smm.Accumulator;
import org.eclipse.modisco.omg.smm.AggregatedMeasurement;
import org.eclipse.modisco.omg.smm.Annotation;
import org.eclipse.modisco.omg.smm.Argument;
import org.eclipse.modisco.omg.smm.Attribute;
import org.eclipse.modisco.omg.smm.Base1MeasureRelationship;
import org.eclipse.modisco.omg.smm.Base1MeasurementRelationship;
import org.eclipse.modisco.omg.smm.Base2MeasureRelationship;
import org.eclipse.modisco.omg.smm.Base2MeasurementRelationship;
import org.eclipse.modisco.omg.smm.BaseMeasureRelationship;
import org.eclipse.modisco.omg.smm.BaseMeasurementRelationship;
import org.eclipse.modisco.omg.smm.BinaryMeasure;
import org.eclipse.modisco.omg.smm.BinaryMeasurement;
import org.eclipse.modisco.omg.smm.CategoryRelationship;
import org.eclipse.modisco.omg.smm.Characteristic;
import org.eclipse.modisco.omg.smm.CollectiveMeasure;
import org.eclipse.modisco.omg.smm.CollectiveMeasurement;
import org.eclipse.modisco.omg.smm.Count;
import org.eclipse.modisco.omg.smm.Counting;
import org.eclipse.modisco.omg.smm.DimensionalMeasure;
import org.eclipse.modisco.omg.smm.DimensionalMeasurement;
import org.eclipse.modisco.omg.smm.DirectMeasure;
import org.eclipse.modisco.omg.smm.DirectMeasurement;
import org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship;
import org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship;
import org.eclipse.modisco.omg.smm.Grade;
import org.eclipse.modisco.omg.smm.Measure;
import org.eclipse.modisco.omg.smm.MeasureCategory;
import org.eclipse.modisco.omg.smm.MeasureLibrary;
import org.eclipse.modisco.omg.smm.MeasureRelationship;
import org.eclipse.modisco.omg.smm.Measurement;
import org.eclipse.modisco.omg.smm.MeasurementRelationship;
import org.eclipse.modisco.omg.smm.NamedMeasure;
import org.eclipse.modisco.omg.smm.NamedMeasurement;
import org.eclipse.modisco.omg.smm.OCLOperation;
import org.eclipse.modisco.omg.smm.Observation;
import org.eclipse.modisco.omg.smm.ObservationScope;
import org.eclipse.modisco.omg.smm.ObservedMeasure;
import org.eclipse.modisco.omg.smm.Operation;
import org.eclipse.modisco.omg.smm.Ranking;
import org.eclipse.modisco.omg.smm.RankingInterval;
import org.eclipse.modisco.omg.smm.RankingMeasureRelationship;
import org.eclipse.modisco.omg.smm.RankingMeasurementRelationship;
import org.eclipse.modisco.omg.smm.RatioMeasure;
import org.eclipse.modisco.omg.smm.RatioMeasurement;
import org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship;
import org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship;
import org.eclipse.modisco.omg.smm.RefinementMeasureRelationship;
import org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship;
import org.eclipse.modisco.omg.smm.RescaleMeasureRelationship;
import org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship;
import org.eclipse.modisco.omg.smm.RescaledMeasure;
import org.eclipse.modisco.omg.smm.RescaledMeasurement;
import org.eclipse.modisco.omg.smm.Scope;
import org.eclipse.modisco.omg.smm.SmmElement;
import org.eclipse.modisco.omg.smm.SmmFactory;
import org.eclipse.modisco.omg.smm.SmmModel;
import org.eclipse.modisco.omg.smm.SmmPackage;
import org.eclipse.modisco.omg.smm.SmmRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmPackageImpl extends EPackageImpl implements SmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMeasureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base1MeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base1MeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base2MeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base2MeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectiveMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectiveMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observedMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursiveMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursiveMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaledMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaleMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaledMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaleMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smmModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smmRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accumulatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmmPackageImpl() {
		super(eNS_URI, SmmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmmPackage init() {
		if (isInited) return (SmmPackage)EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI);

		// Obtain or create and register package
		SmmPackageImpl theSmmPackage = (SmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSmmPackage.createPackageContents();

		// Initialize created meta-data
		theSmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmmPackage.eNS_URI, theSmmPackage);
		return theSmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMeasureElement() {
		return abstractMeasureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMeasureElement_InCategory() {
		return (EReference)abstractMeasureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Text() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Type() {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Value() {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Tag() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedMeasurement() {
		return aggregatedMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedMeasurement_IsBaseSuppled() {
		return (EAttribute)aggregatedMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedMeasurement_BaseMeasurement() {
		return (EReference)aggregatedMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase1MeasurementRelationship() {
		return base1MeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasurementRelationship_From() {
		return (EReference)base1MeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasurementRelationship_To() {
		return (EReference)base1MeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase1MeasureRelationship() {
		return base1MeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasureRelationship_From() {
		return (EReference)base1MeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasureRelationship_To() {
		return (EReference)base1MeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase2MeasurementRelationship() {
		return base2MeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasurementRelationship_From() {
		return (EReference)base2MeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasurementRelationship_To() {
		return (EReference)base2MeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase2MeasureRelationship() {
		return base2MeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasureRelationship_From() {
		return (EReference)base2MeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasureRelationship_To() {
		return (EReference)base2MeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseMeasurementRelationship() {
		return baseMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasurementRelationship_From() {
		return (EReference)baseMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasurementRelationship_To() {
		return (EReference)baseMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseMeasureRelationship() {
		return baseMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasureRelationship_From() {
		return (EReference)baseMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasureRelationship_To() {
		return (EReference)baseMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryMeasure() {
		return binaryMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryMeasure_Functor() {
		return (EAttribute)binaryMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasure_BaseMeasure1To() {
		return (EReference)binaryMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasure_BaseMeasure2To() {
		return (EReference)binaryMeasureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryMeasurement() {
		return binaryMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasurement_BaseMeasurement1To() {
		return (EReference)binaryMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasurement_BaseMeasurement2To() {
		return (EReference)binaryMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryMeasurement_IsBaseSupplied() {
		return (EAttribute)binaryMeasurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryRelationship() {
		return categoryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryRelationship_From() {
		return (EReference)categoryRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryRelationship_To() {
		return (EReference)categoryRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristic() {
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristic_Parent() {
		return (EReference)characteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectiveMeasure() {
		return collectiveMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectiveMeasure_Accumulator() {
		return (EAttribute)collectiveMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectiveMeasure_BaseMeasureTo() {
		return (EReference)collectiveMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectiveMeasurement() {
		return collectiveMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectiveMeasurement_Accumulator() {
		return (EAttribute)collectiveMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectiveMeasurement_IsBaseSupplied() {
		return (EAttribute)collectiveMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectiveMeasurement_BaseMeasurementTo() {
		return (EReference)collectiveMeasurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounting() {
		return countingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionalMeasure() {
		return dimensionalMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionalMeasure_Unit() {
		return (EAttribute)dimensionalMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_BaseMeasureFrom() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_BaseMeasure1From() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_BaseMeasure2From() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_RescaleTo() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_RankingFrom() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionalMeasurement() {
		return dimensionalMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionalMeasurement_Value() {
		return (EAttribute)dimensionalMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_BaseMeasurementFrom() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_BaseMeasurement1From() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_BaseMeasurement2From() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_RescaleTo() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_RankingFrom() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectMeasure() {
		return directMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectMeasure_Operation() {
		return (EReference)directMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectMeasurement() {
		return directMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentMeasureRelationship() {
		return equivalentMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasureRelationship_Mapping() {
		return (EReference)equivalentMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasureRelationship_From() {
		return (EReference)equivalentMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasureRelationship_To() {
		return (EReference)equivalentMeasureRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentMeasurementRelationship() {
		return equivalentMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasurementRelationship_From() {
		return (EReference)equivalentMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasurementRelationship_To() {
		return (EReference)equivalentMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrade() {
		return gradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrade_BaseMeasurement() {
		return (EReference)gradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrade_IsBaseSupplied() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrade_Value() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrade_RankingTo() {
		return (EReference)gradeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Category() {
		return (EReference)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Trait() {
		return (EReference)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Scope() {
		return (EReference)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_MeasureLabelFormat() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RefinementTo() {
		return (EReference)measureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RefinementFrom() {
		return (EReference)measureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_EquivalentTo() {
		return (EReference)measureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_EquivalentFrom() {
		return (EReference)measureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RecursiveTo() {
		return (EReference)measureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RecursiveFrom() {
		return (EReference)measureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_MeasurementLabelFormat() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Visible() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_MeasureRelationships() {
		return (EReference)measureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_DefaultQuery() {
		return (EReference)measureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureCategory() {
		return measureCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCategory_Category() {
		return (EReference)measureCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCategory_CategoryElement() {
		return (EReference)measureCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCategory_CategoryMeasure() {
		return (EReference)measureCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureLibrary() {
		return measureLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureLibrary_MeasureElements() {
		return (EReference)measureLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureLibrary_CategoryRelationships() {
		return (EReference)measureLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureRelationship() {
		return measureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureRelationship_MeasurandQuery() {
		return (EReference)measureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurement_Error() {
		return (EAttribute)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Measurand() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurement_BreakValue() {
		return (EAttribute)measurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RefinementTo() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RefinementFrom() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_EquivalentTo() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_EquivalentFrom() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RecursiveTo() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RecursiveFrom() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_MeasurementRelationships() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementRelationship() {
		return measurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedMeasure() {
		return namedMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedMeasurement() {
		return namedMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_Observer() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_Tool() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_WhenObserved() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Scopes() {
		return (EReference)observationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ObservedMeasures() {
		return (EReference)observationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_RequestedMeasures() {
		return (EReference)observationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_MeasurementRelations() {
		return (EReference)observationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Arguments() {
		return (EReference)observationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationScope() {
		return observationScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservationScope_ScopeUri() {
		return (EAttribute)observationScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservedMeasure() {
		return observedMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservedMeasure_Measure() {
		return (EReference)observedMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservedMeasure_Measurements() {
		return (EReference)observedMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLOperation() {
		return oclOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLOperation_Context() {
		return (EAttribute)oclOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLOperation_Body() {
		return (EAttribute)oclOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Language() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Body() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRanking() {
		return rankingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRanking_Interval() {
		return (EReference)rankingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRanking_RankingTo() {
		return (EReference)rankingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRankingInterval() {
		return rankingIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingInterval_Rank() {
		return (EReference)rankingIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRankingInterval_MaximumEndpoint() {
		return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRankingInterval_MaximumOpen() {
		return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRankingInterval_MinimumEndpoint() {
		return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRankingInterval_MinimumOpen() {
		return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRankingInterval_Symbol() {
		return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRankingMeasureRelationship() {
		return rankingMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasureRelationship_From() {
		return (EReference)rankingMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasureRelationship_To() {
		return (EReference)rankingMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRankingMeasurementRelationship() {
		return rankingMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasurementRelationship_From() {
		return (EReference)rankingMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasurementRelationship_To() {
		return (EReference)rankingMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatioMeasure() {
		return ratioMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatioMeasurement() {
		return ratioMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecursiveMeasureRelationship() {
		return recursiveMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasureRelationship_From() {
		return (EReference)recursiveMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasureRelationship_To() {
		return (EReference)recursiveMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecursiveMeasurementRelationship() {
		return recursiveMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasurementRelationship_From() {
		return (EReference)recursiveMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasurementRelationship_To() {
		return (EReference)recursiveMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinementMeasureRelationship() {
		return refinementMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasureRelationship_From() {
		return (EReference)refinementMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasureRelationship_To() {
		return (EReference)refinementMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinementMeasurementRelationship() {
		return refinementMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasurementRelationship_From() {
		return (EReference)refinementMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasurementRelationship_To() {
		return (EReference)refinementMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaledMeasure() {
		return rescaledMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescaledMeasure_Formula() {
		return (EAttribute)rescaledMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaledMeasure_RescaleFrom() {
		return (EReference)rescaledMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaleMeasureRelationship() {
		return rescaleMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasureRelationship_To() {
		return (EReference)rescaleMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasureRelationship_From() {
		return (EReference)rescaleMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaledMeasurement() {
		return rescaledMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescaledMeasurement_IsBaseSupplied() {
		return (EAttribute)rescaledMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaledMeasurement_RescaleFrom() {
		return (EReference)rescaledMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaleMeasurementRelationship() {
		return rescaleMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasurementRelationship_To() {
		return (EReference)rescaleMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasurementRelationship_From() {
		return (EReference)rescaleMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScope_Class() {
		return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_Elements() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_RecognizerQuery() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_BreakCondition() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmmElement() {
		return smmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmElement_Attribute() {
		return (EReference)smmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmElement_Annotation() {
		return (EReference)smmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmmElement_Name() {
		return (EAttribute)smmElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmmElement_ShortDescription() {
		return (EAttribute)smmElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmmElement_Description() {
		return (EAttribute)smmElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmElement_RequestedObservations() {
		return (EReference)smmElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmmModel() {
		return smmModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmModel_Observations() {
		return (EReference)smmModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmModel_Librairies() {
		return (EReference)smmModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmmRelationship() {
		return smmRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccumulator() {
		return accumulatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimestamp() {
		return timestampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmFactory getSmmFactory() {
		return (SmmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractMeasureElementEClass = createEClass(ABSTRACT_MEASURE_ELEMENT);
		createEReference(abstractMeasureElementEClass, ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__TYPE);
		createEAttribute(argumentEClass, ARGUMENT__VALUE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TAG);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		aggregatedMeasurementEClass = createEClass(AGGREGATED_MEASUREMENT);
		createEAttribute(aggregatedMeasurementEClass, AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED);
		createEReference(aggregatedMeasurementEClass, AGGREGATED_MEASUREMENT__BASE_MEASUREMENT);

		base1MeasurementRelationshipEClass = createEClass(BASE1_MEASUREMENT_RELATIONSHIP);
		createEReference(base1MeasurementRelationshipEClass, BASE1_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(base1MeasurementRelationshipEClass, BASE1_MEASUREMENT_RELATIONSHIP__TO);

		base1MeasureRelationshipEClass = createEClass(BASE1_MEASURE_RELATIONSHIP);
		createEReference(base1MeasureRelationshipEClass, BASE1_MEASURE_RELATIONSHIP__FROM);
		createEReference(base1MeasureRelationshipEClass, BASE1_MEASURE_RELATIONSHIP__TO);

		base2MeasurementRelationshipEClass = createEClass(BASE2_MEASUREMENT_RELATIONSHIP);
		createEReference(base2MeasurementRelationshipEClass, BASE2_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(base2MeasurementRelationshipEClass, BASE2_MEASUREMENT_RELATIONSHIP__TO);

		base2MeasureRelationshipEClass = createEClass(BASE2_MEASURE_RELATIONSHIP);
		createEReference(base2MeasureRelationshipEClass, BASE2_MEASURE_RELATIONSHIP__FROM);
		createEReference(base2MeasureRelationshipEClass, BASE2_MEASURE_RELATIONSHIP__TO);

		baseMeasurementRelationshipEClass = createEClass(BASE_MEASUREMENT_RELATIONSHIP);
		createEReference(baseMeasurementRelationshipEClass, BASE_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(baseMeasurementRelationshipEClass, BASE_MEASUREMENT_RELATIONSHIP__TO);

		baseMeasureRelationshipEClass = createEClass(BASE_MEASURE_RELATIONSHIP);
		createEReference(baseMeasureRelationshipEClass, BASE_MEASURE_RELATIONSHIP__FROM);
		createEReference(baseMeasureRelationshipEClass, BASE_MEASURE_RELATIONSHIP__TO);

		binaryMeasureEClass = createEClass(BINARY_MEASURE);
		createEAttribute(binaryMeasureEClass, BINARY_MEASURE__FUNCTOR);
		createEReference(binaryMeasureEClass, BINARY_MEASURE__BASE_MEASURE1_TO);
		createEReference(binaryMeasureEClass, BINARY_MEASURE__BASE_MEASURE2_TO);

		binaryMeasurementEClass = createEClass(BINARY_MEASUREMENT);
		createEReference(binaryMeasurementEClass, BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO);
		createEReference(binaryMeasurementEClass, BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO);
		createEAttribute(binaryMeasurementEClass, BINARY_MEASUREMENT__IS_BASE_SUPPLIED);

		categoryRelationshipEClass = createEClass(CATEGORY_RELATIONSHIP);
		createEReference(categoryRelationshipEClass, CATEGORY_RELATIONSHIP__FROM);
		createEReference(categoryRelationshipEClass, CATEGORY_RELATIONSHIP__TO);

		characteristicEClass = createEClass(CHARACTERISTIC);
		createEReference(characteristicEClass, CHARACTERISTIC__PARENT);

		collectiveMeasureEClass = createEClass(COLLECTIVE_MEASURE);
		createEAttribute(collectiveMeasureEClass, COLLECTIVE_MEASURE__ACCUMULATOR);
		createEReference(collectiveMeasureEClass, COLLECTIVE_MEASURE__BASE_MEASURE_TO);

		collectiveMeasurementEClass = createEClass(COLLECTIVE_MEASUREMENT);
		createEAttribute(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__ACCUMULATOR);
		createEAttribute(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED);
		createEReference(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO);

		countEClass = createEClass(COUNT);

		countingEClass = createEClass(COUNTING);

		dimensionalMeasureEClass = createEClass(DIMENSIONAL_MEASURE);
		createEAttribute(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__UNIT);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__BASE_MEASURE_FROM);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__RESCALE_TO);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__RANKING_FROM);

		dimensionalMeasurementEClass = createEClass(DIMENSIONAL_MEASUREMENT);
		createEAttribute(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__VALUE);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__RESCALE_TO);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__RANKING_FROM);

		directMeasureEClass = createEClass(DIRECT_MEASURE);
		createEReference(directMeasureEClass, DIRECT_MEASURE__OPERATION);

		directMeasurementEClass = createEClass(DIRECT_MEASUREMENT);

		equivalentMeasureRelationshipEClass = createEClass(EQUIVALENT_MEASURE_RELATIONSHIP);
		createEReference(equivalentMeasureRelationshipEClass, EQUIVALENT_MEASURE_RELATIONSHIP__MAPPING);
		createEReference(equivalentMeasureRelationshipEClass, EQUIVALENT_MEASURE_RELATIONSHIP__FROM);
		createEReference(equivalentMeasureRelationshipEClass, EQUIVALENT_MEASURE_RELATIONSHIP__TO);

		equivalentMeasurementRelationshipEClass = createEClass(EQUIVALENT_MEASUREMENT_RELATIONSHIP);
		createEReference(equivalentMeasurementRelationshipEClass, EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(equivalentMeasurementRelationshipEClass, EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO);

		gradeEClass = createEClass(GRADE);
		createEReference(gradeEClass, GRADE__BASE_MEASUREMENT);
		createEAttribute(gradeEClass, GRADE__IS_BASE_SUPPLIED);
		createEAttribute(gradeEClass, GRADE__VALUE);
		createEReference(gradeEClass, GRADE__RANKING_TO);

		measureEClass = createEClass(MEASURE);
		createEReference(measureEClass, MEASURE__CATEGORY);
		createEReference(measureEClass, MEASURE__TRAIT);
		createEReference(measureEClass, MEASURE__SCOPE);
		createEAttribute(measureEClass, MEASURE__MEASURE_LABEL_FORMAT);
		createEReference(measureEClass, MEASURE__REFINEMENT_TO);
		createEReference(measureEClass, MEASURE__REFINEMENT_FROM);
		createEReference(measureEClass, MEASURE__EQUIVALENT_TO);
		createEReference(measureEClass, MEASURE__EQUIVALENT_FROM);
		createEReference(measureEClass, MEASURE__RECURSIVE_TO);
		createEReference(measureEClass, MEASURE__RECURSIVE_FROM);
		createEAttribute(measureEClass, MEASURE__MEASUREMENT_LABEL_FORMAT);
		createEAttribute(measureEClass, MEASURE__VISIBLE);
		createEReference(measureEClass, MEASURE__MEASURE_RELATIONSHIPS);
		createEReference(measureEClass, MEASURE__DEFAULT_QUERY);

		measureCategoryEClass = createEClass(MEASURE_CATEGORY);
		createEReference(measureCategoryEClass, MEASURE_CATEGORY__CATEGORY);
		createEReference(measureCategoryEClass, MEASURE_CATEGORY__CATEGORY_ELEMENT);
		createEReference(measureCategoryEClass, MEASURE_CATEGORY__CATEGORY_MEASURE);

		measureLibraryEClass = createEClass(MEASURE_LIBRARY);
		createEReference(measureLibraryEClass, MEASURE_LIBRARY__MEASURE_ELEMENTS);
		createEReference(measureLibraryEClass, MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS);

		measureRelationshipEClass = createEClass(MEASURE_RELATIONSHIP);
		createEReference(measureRelationshipEClass, MEASURE_RELATIONSHIP__MEASURAND_QUERY);

		measurementEClass = createEClass(MEASUREMENT);
		createEAttribute(measurementEClass, MEASUREMENT__ERROR);
		createEReference(measurementEClass, MEASUREMENT__MEASURAND);
		createEAttribute(measurementEClass, MEASUREMENT__BREAK_VALUE);
		createEReference(measurementEClass, MEASUREMENT__REFINEMENT_TO);
		createEReference(measurementEClass, MEASUREMENT__REFINEMENT_FROM);
		createEReference(measurementEClass, MEASUREMENT__EQUIVALENT_TO);
		createEReference(measurementEClass, MEASUREMENT__EQUIVALENT_FROM);
		createEReference(measurementEClass, MEASUREMENT__RECURSIVE_TO);
		createEReference(measurementEClass, MEASUREMENT__RECURSIVE_FROM);
		createEReference(measurementEClass, MEASUREMENT__MEASUREMENT_RELATIONSHIPS);

		measurementRelationshipEClass = createEClass(MEASUREMENT_RELATIONSHIP);

		namedMeasureEClass = createEClass(NAMED_MEASURE);

		namedMeasurementEClass = createEClass(NAMED_MEASUREMENT);

		observationEClass = createEClass(OBSERVATION);
		createEAttribute(observationEClass, OBSERVATION__OBSERVER);
		createEAttribute(observationEClass, OBSERVATION__TOOL);
		createEAttribute(observationEClass, OBSERVATION__WHEN_OBSERVED);
		createEReference(observationEClass, OBSERVATION__SCOPES);
		createEReference(observationEClass, OBSERVATION__OBSERVED_MEASURES);
		createEReference(observationEClass, OBSERVATION__REQUESTED_MEASURES);
		createEReference(observationEClass, OBSERVATION__MEASUREMENT_RELATIONS);
		createEReference(observationEClass, OBSERVATION__ARGUMENTS);

		observationScopeEClass = createEClass(OBSERVATION_SCOPE);
		createEAttribute(observationScopeEClass, OBSERVATION_SCOPE__SCOPE_URI);

		observedMeasureEClass = createEClass(OBSERVED_MEASURE);
		createEReference(observedMeasureEClass, OBSERVED_MEASURE__MEASURE);
		createEReference(observedMeasureEClass, OBSERVED_MEASURE__MEASUREMENTS);

		oclOperationEClass = createEClass(OCL_OPERATION);
		createEAttribute(oclOperationEClass, OCL_OPERATION__CONTEXT);
		createEAttribute(oclOperationEClass, OCL_OPERATION__BODY);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__LANGUAGE);
		createEAttribute(operationEClass, OPERATION__BODY);

		rankingEClass = createEClass(RANKING);
		createEReference(rankingEClass, RANKING__INTERVAL);
		createEReference(rankingEClass, RANKING__RANKING_TO);

		rankingIntervalEClass = createEClass(RANKING_INTERVAL);
		createEReference(rankingIntervalEClass, RANKING_INTERVAL__RANK);
		createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MAXIMUM_ENDPOINT);
		createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MAXIMUM_OPEN);
		createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MINIMUM_ENDPOINT);
		createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MINIMUM_OPEN);
		createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__SYMBOL);

		rankingMeasureRelationshipEClass = createEClass(RANKING_MEASURE_RELATIONSHIP);
		createEReference(rankingMeasureRelationshipEClass, RANKING_MEASURE_RELATIONSHIP__FROM);
		createEReference(rankingMeasureRelationshipEClass, RANKING_MEASURE_RELATIONSHIP__TO);

		rankingMeasurementRelationshipEClass = createEClass(RANKING_MEASUREMENT_RELATIONSHIP);
		createEReference(rankingMeasurementRelationshipEClass, RANKING_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(rankingMeasurementRelationshipEClass, RANKING_MEASUREMENT_RELATIONSHIP__TO);

		ratioMeasureEClass = createEClass(RATIO_MEASURE);

		ratioMeasurementEClass = createEClass(RATIO_MEASUREMENT);

		recursiveMeasureRelationshipEClass = createEClass(RECURSIVE_MEASURE_RELATIONSHIP);
		createEReference(recursiveMeasureRelationshipEClass, RECURSIVE_MEASURE_RELATIONSHIP__FROM);
		createEReference(recursiveMeasureRelationshipEClass, RECURSIVE_MEASURE_RELATIONSHIP__TO);

		recursiveMeasurementRelationshipEClass = createEClass(RECURSIVE_MEASUREMENT_RELATIONSHIP);
		createEReference(recursiveMeasurementRelationshipEClass, RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(recursiveMeasurementRelationshipEClass, RECURSIVE_MEASUREMENT_RELATIONSHIP__TO);

		refinementMeasureRelationshipEClass = createEClass(REFINEMENT_MEASURE_RELATIONSHIP);
		createEReference(refinementMeasureRelationshipEClass, REFINEMENT_MEASURE_RELATIONSHIP__FROM);
		createEReference(refinementMeasureRelationshipEClass, REFINEMENT_MEASURE_RELATIONSHIP__TO);

		refinementMeasurementRelationshipEClass = createEClass(REFINEMENT_MEASUREMENT_RELATIONSHIP);
		createEReference(refinementMeasurementRelationshipEClass, REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(refinementMeasurementRelationshipEClass, REFINEMENT_MEASUREMENT_RELATIONSHIP__TO);

		rescaledMeasureEClass = createEClass(RESCALED_MEASURE);
		createEAttribute(rescaledMeasureEClass, RESCALED_MEASURE__FORMULA);
		createEReference(rescaledMeasureEClass, RESCALED_MEASURE__RESCALE_FROM);

		rescaleMeasureRelationshipEClass = createEClass(RESCALE_MEASURE_RELATIONSHIP);
		createEReference(rescaleMeasureRelationshipEClass, RESCALE_MEASURE_RELATIONSHIP__TO);
		createEReference(rescaleMeasureRelationshipEClass, RESCALE_MEASURE_RELATIONSHIP__FROM);

		rescaledMeasurementEClass = createEClass(RESCALED_MEASUREMENT);
		createEAttribute(rescaledMeasurementEClass, RESCALED_MEASUREMENT__IS_BASE_SUPPLIED);
		createEReference(rescaledMeasurementEClass, RESCALED_MEASUREMENT__RESCALE_FROM);

		rescaleMeasurementRelationshipEClass = createEClass(RESCALE_MEASUREMENT_RELATIONSHIP);
		createEReference(rescaleMeasurementRelationshipEClass, RESCALE_MEASUREMENT_RELATIONSHIP__TO);
		createEReference(rescaleMeasurementRelationshipEClass, RESCALE_MEASUREMENT_RELATIONSHIP__FROM);

		scopeEClass = createEClass(SCOPE);
		createEAttribute(scopeEClass, SCOPE__CLASS);
		createEReference(scopeEClass, SCOPE__ELEMENTS);
		createEReference(scopeEClass, SCOPE__RECOGNIZER_QUERY);
		createEReference(scopeEClass, SCOPE__BREAK_CONDITION);

		smmElementEClass = createEClass(SMM_ELEMENT);
		createEReference(smmElementEClass, SMM_ELEMENT__ATTRIBUTE);
		createEReference(smmElementEClass, SMM_ELEMENT__ANNOTATION);
		createEAttribute(smmElementEClass, SMM_ELEMENT__NAME);
		createEAttribute(smmElementEClass, SMM_ELEMENT__SHORT_DESCRIPTION);
		createEAttribute(smmElementEClass, SMM_ELEMENT__DESCRIPTION);
		createEReference(smmElementEClass, SMM_ELEMENT__REQUESTED_OBSERVATIONS);

		smmModelEClass = createEClass(SMM_MODEL);
		createEReference(smmModelEClass, SMM_MODEL__OBSERVATIONS);
		createEReference(smmModelEClass, SMM_MODEL__LIBRAIRIES);

		smmRelationshipEClass = createEClass(SMM_RELATIONSHIP);

		// Create enums
		accumulatorEEnum = createEEnum(ACCUMULATOR);

		// Create data types
		dateEDataType = createEDataType(DATE);
		timestampEDataType = createEDataType(TIMESTAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractMeasureElementEClass.getESuperTypes().add(this.getSmmElement());
		annotationEClass.getESuperTypes().add(this.getSmmElement());
		argumentEClass.getESuperTypes().add(this.getSmmElement());
		attributeEClass.getESuperTypes().add(this.getSmmElement());
		aggregatedMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		base1MeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		base1MeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		base2MeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		base2MeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		baseMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		baseMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		binaryMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		binaryMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		categoryRelationshipEClass.getESuperTypes().add(this.getSmmRelationship());
		characteristicEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		collectiveMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		collectiveMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		countEClass.getESuperTypes().add(this.getDirectMeasurement());
		countingEClass.getESuperTypes().add(this.getDirectMeasure());
		dimensionalMeasureEClass.getESuperTypes().add(this.getMeasure());
		dimensionalMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		directMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		directMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		equivalentMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		equivalentMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		gradeEClass.getESuperTypes().add(this.getMeasurement());
		measureEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		measureCategoryEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		measureLibraryEClass.getESuperTypes().add(this.getSmmElement());
		measureRelationshipEClass.getESuperTypes().add(this.getSmmRelationship());
		measurementEClass.getESuperTypes().add(this.getSmmElement());
		measurementRelationshipEClass.getESuperTypes().add(this.getSmmRelationship());
		namedMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		namedMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		observationEClass.getESuperTypes().add(this.getSmmElement());
		observationScopeEClass.getESuperTypes().add(this.getSmmElement());
		observedMeasureEClass.getESuperTypes().add(this.getSmmRelationship());
		oclOperationEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		operationEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		rankingEClass.getESuperTypes().add(this.getMeasure());
		rankingIntervalEClass.getESuperTypes().add(this.getSmmElement());
		rankingMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		rankingMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		ratioMeasureEClass.getESuperTypes().add(this.getBinaryMeasure());
		ratioMeasurementEClass.getESuperTypes().add(this.getBinaryMeasurement());
		recursiveMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		recursiveMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		refinementMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		refinementMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		rescaledMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		rescaleMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		rescaledMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		rescaleMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		scopeEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		smmModelEClass.getESuperTypes().add(this.getSmmElement());
		smmRelationshipEClass.getESuperTypes().add(this.getSmmElement());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractMeasureElementEClass, AbstractMeasureElement.class, "AbstractMeasureElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMeasureElement_InCategory(), this.getCategoryRelationship(), null, "inCategory", null, 0, -1, AbstractMeasureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgument_Type(), ecorePackage.getEString(), "type", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Value(), ecorePackage.getEString(), "value", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedMeasurementEClass, AggregatedMeasurement.class, "AggregatedMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregatedMeasurement_IsBaseSuppled(), ecorePackage.getEBoolean(), "isBaseSuppled", null, 1, 1, AggregatedMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregatedMeasurement_BaseMeasurement(), this.getDimensionalMeasurement(), null, "baseMeasurement", null, 0, -1, AggregatedMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base1MeasurementRelationshipEClass, Base1MeasurementRelationship.class, "Base1MeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase1MeasurementRelationship_From(), this.getBinaryMeasurement(), this.getBinaryMeasurement_BaseMeasurement1To(), "from", null, 1, 1, Base1MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase1MeasurementRelationship_To(), this.getDimensionalMeasurement(), this.getDimensionalMeasurement_BaseMeasurement1From(), "to", null, 1, 1, Base1MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base1MeasureRelationshipEClass, Base1MeasureRelationship.class, "Base1MeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase1MeasureRelationship_From(), this.getBinaryMeasure(), this.getBinaryMeasure_BaseMeasure1To(), "from", null, 1, 1, Base1MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase1MeasureRelationship_To(), this.getDimensionalMeasure(), this.getDimensionalMeasure_BaseMeasure1From(), "to", null, 1, 1, Base1MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base2MeasurementRelationshipEClass, Base2MeasurementRelationship.class, "Base2MeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase2MeasurementRelationship_From(), this.getBinaryMeasurement(), this.getBinaryMeasurement_BaseMeasurement2To(), "from", null, 1, 1, Base2MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase2MeasurementRelationship_To(), this.getDimensionalMeasurement(), this.getDimensionalMeasurement_BaseMeasurement2From(), "to", null, 1, 1, Base2MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base2MeasureRelationshipEClass, Base2MeasureRelationship.class, "Base2MeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase2MeasureRelationship_From(), this.getBinaryMeasure(), this.getBinaryMeasure_BaseMeasure2To(), "from", null, 1, 1, Base2MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase2MeasureRelationship_To(), this.getDimensionalMeasure(), this.getDimensionalMeasure_BaseMeasure2From(), "to", null, 1, 1, Base2MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseMeasurementRelationshipEClass, BaseMeasurementRelationship.class, "BaseMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseMeasurementRelationship_From(), this.getCollectiveMeasurement(), this.getCollectiveMeasurement_BaseMeasurementTo(), "from", null, 1, 1, BaseMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseMeasurementRelationship_To(), this.getDimensionalMeasurement(), this.getDimensionalMeasurement_BaseMeasurementFrom(), "to", null, 1, 1, BaseMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseMeasureRelationshipEClass, BaseMeasureRelationship.class, "BaseMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseMeasureRelationship_From(), this.getCollectiveMeasure(), this.getCollectiveMeasure_BaseMeasureTo(), "from", null, 1, 1, BaseMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseMeasureRelationship_To(), this.getDimensionalMeasure(), this.getDimensionalMeasure_BaseMeasureFrom(), "to", null, 1, 1, BaseMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryMeasureEClass, BinaryMeasure.class, "BinaryMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryMeasure_Functor(), ecorePackage.getEString(), "functor", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryMeasure_BaseMeasure1To(), this.getBase1MeasureRelationship(), this.getBase1MeasureRelationship_From(), "baseMeasure1To", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryMeasure_BaseMeasure2To(), this.getBase2MeasureRelationship(), this.getBase2MeasureRelationship_From(), "baseMeasure2To", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryMeasurementEClass, BinaryMeasurement.class, "BinaryMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryMeasurement_BaseMeasurement1To(), this.getBase1MeasurementRelationship(), this.getBase1MeasurementRelationship_From(), "baseMeasurement1To", null, 0, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryMeasurement_BaseMeasurement2To(), this.getBase2MeasurementRelationship(), this.getBase2MeasurementRelationship_From(), "baseMeasurement2To", null, 0, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryMeasurement_IsBaseSupplied(), ecorePackage.getEBoolean(), "isBaseSupplied", null, 1, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryRelationshipEClass, CategoryRelationship.class, "CategoryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryRelationship_From(), this.getMeasureCategory(), null, "from", null, 1, 1, CategoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategoryRelationship_To(), this.getAbstractMeasureElement(), null, "to", null, 1, 1, CategoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristic_Parent(), this.getCharacteristic(), null, "parent", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectiveMeasureEClass, CollectiveMeasure.class, "CollectiveMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectiveMeasure_Accumulator(), this.getAccumulator(), "accumulator", null, 1, 1, CollectiveMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectiveMeasure_BaseMeasureTo(), this.getBaseMeasureRelationship(), this.getBaseMeasureRelationship_From(), "baseMeasureTo", null, 1, -1, CollectiveMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectiveMeasurementEClass, CollectiveMeasurement.class, "CollectiveMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectiveMeasurement_Accumulator(), this.getAccumulator(), "accumulator", null, 1, 1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectiveMeasurement_IsBaseSupplied(), ecorePackage.getEBoolean(), "isBaseSupplied", null, 1, 1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectiveMeasurement_BaseMeasurementTo(), this.getBaseMeasurementRelationship(), this.getBaseMeasurementRelationship_From(), "baseMeasurementTo", null, 0, -1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(countingEClass, Counting.class, "Counting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimensionalMeasureEClass, DimensionalMeasure.class, "DimensionalMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionalMeasure_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_BaseMeasureFrom(), this.getBaseMeasureRelationship(), this.getBaseMeasureRelationship_To(), "baseMeasureFrom", null, 0, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_BaseMeasure1From(), this.getBase1MeasureRelationship(), this.getBase1MeasureRelationship_To(), "baseMeasure1From", null, 0, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_BaseMeasure2From(), this.getBase2MeasureRelationship(), this.getBase2MeasureRelationship_To(), "baseMeasure2From", null, 0, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_RescaleTo(), this.getRescaleMeasureRelationship(), this.getRescaleMeasureRelationship_From(), "rescaleTo", null, 0, 1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_RankingFrom(), this.getRankingMeasureRelationship(), this.getRankingMeasureRelationship_To(), "rankingFrom", null, 0, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionalMeasurementEClass, DimensionalMeasurement.class, "DimensionalMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionalMeasurement_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_BaseMeasurementFrom(), this.getBaseMeasurementRelationship(), this.getBaseMeasurementRelationship_To(), "baseMeasurementFrom", null, 0, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_BaseMeasurement1From(), this.getBase1MeasurementRelationship(), this.getBase1MeasurementRelationship_To(), "baseMeasurement1From", null, 0, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_BaseMeasurement2From(), this.getBase2MeasurementRelationship(), this.getBase2MeasurementRelationship_To(), "baseMeasurement2From", null, 0, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_RescaleTo(), this.getRescaleMeasurementRelationship(), this.getRescaleMeasurementRelationship_From(), "rescaleTo", null, 0, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_RankingFrom(), this.getRankingMeasurementRelationship(), this.getRankingMeasurementRelationship_To(), "rankingFrom", null, 0, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directMeasureEClass, DirectMeasure.class, "DirectMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectMeasure_Operation(), this.getOperation(), null, "operation", null, 0, 1, DirectMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directMeasurementEClass, DirectMeasurement.class, "DirectMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equivalentMeasureRelationshipEClass, EquivalentMeasureRelationship.class, "EquivalentMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentMeasureRelationship_Mapping(), this.getOperation(), null, "mapping", null, 0, 1, EquivalentMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentMeasureRelationship_From(), this.getMeasure(), this.getMeasure_EquivalentTo(), "from", null, 1, 1, EquivalentMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentMeasureRelationship_To(), this.getMeasure(), this.getMeasure_EquivalentFrom(), "to", null, 1, 1, EquivalentMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentMeasurementRelationshipEClass, EquivalentMeasurementRelationship.class, "EquivalentMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentMeasurementRelationship_From(), this.getMeasurement(), this.getMeasurement_EquivalentTo(), "from", null, 1, 1, EquivalentMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentMeasurementRelationship_To(), this.getMeasurement(), this.getMeasurement_EquivalentFrom(), "to", null, 1, 1, EquivalentMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradeEClass, Grade.class, "Grade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrade_BaseMeasurement(), this.getDimensionalMeasurement(), null, "baseMeasurement", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrade_IsBaseSupplied(), ecorePackage.getEBoolean(), "isBaseSupplied", null, 1, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrade_Value(), ecorePackage.getEString(), "value", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrade_RankingTo(), this.getRankingMeasurementRelationship(), this.getRankingMeasurementRelationship_From(), "rankingTo", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasure_Category(), this.getMeasureCategory(), this.getMeasureCategory_CategoryMeasure(), "category", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Trait(), this.getCharacteristic(), null, "trait", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Scope(), this.getScope(), null, "scope", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_MeasureLabelFormat(), ecorePackage.getEString(), "measureLabelFormat", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RefinementTo(), this.getRefinementMeasureRelationship(), this.getRefinementMeasureRelationship_From(), "refinementTo", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RefinementFrom(), this.getRefinementMeasureRelationship(), this.getRefinementMeasureRelationship_To(), "refinementFrom", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_EquivalentTo(), this.getEquivalentMeasureRelationship(), this.getEquivalentMeasureRelationship_From(), "equivalentTo", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_EquivalentFrom(), this.getEquivalentMeasureRelationship(), this.getEquivalentMeasureRelationship_To(), "equivalentFrom", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RecursiveTo(), this.getRecursiveMeasureRelationship(), this.getRecursiveMeasureRelationship_From(), "recursiveTo", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RecursiveFrom(), this.getRecursiveMeasureRelationship(), this.getRecursiveMeasureRelationship_To(), "recursiveFrom", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_MeasurementLabelFormat(), ecorePackage.getEString(), "measurementLabelFormat", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_MeasureRelationships(), this.getMeasureRelationship(), null, "measureRelationships", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_DefaultQuery(), this.getOperation(), null, "defaultQuery", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(measureEClass, this.getArgument(), "getArguments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(measureEClass, this.getArgument(), "getAllArguments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureCategoryEClass, MeasureCategory.class, "MeasureCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureCategory_Category(), this.getMeasureCategory(), this.getMeasureCategory_CategoryElement(), "category", null, 0, -1, MeasureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureCategory_CategoryElement(), this.getMeasureCategory(), this.getMeasureCategory_Category(), "categoryElement", null, 0, -1, MeasureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureCategory_CategoryMeasure(), this.getMeasure(), this.getMeasure_Category(), "categoryMeasure", null, 0, -1, MeasureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureLibraryEClass, MeasureLibrary.class, "MeasureLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureLibrary_MeasureElements(), this.getAbstractMeasureElement(), null, "measureElements", null, 0, -1, MeasureLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureLibrary_CategoryRelationships(), this.getCategoryRelationship(), null, "categoryRelationships", null, 0, -1, MeasureLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(measureLibraryEClass, this.getAbstractMeasureElement(), "getOperations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(measureLibraryEClass, this.getAbstractMeasureElement(), "getOclOperations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureRelationshipEClass, MeasureRelationship.class, "MeasureRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureRelationship_MeasurandQuery(), this.getOperation(), null, "measurandQuery", null, 0, 1, MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(measureRelationshipEClass, this.getMeasure(), "getTo", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(measureRelationshipEClass, this.getMeasure(), "getFrom", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurement_Error(), ecorePackage.getEString(), "error", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Measurand(), ecorePackage.getEObject(), null, "measurand", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurement_BreakValue(), ecorePackage.getEString(), "breakValue", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RefinementTo(), this.getRefinementMeasurementRelationship(), this.getRefinementMeasurementRelationship_From(), "refinementTo", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RefinementFrom(), this.getRefinementMeasurementRelationship(), this.getRefinementMeasurementRelationship_To(), "refinementFrom", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_EquivalentTo(), this.getEquivalentMeasurementRelationship(), this.getEquivalentMeasurementRelationship_From(), "equivalentTo", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_EquivalentFrom(), this.getEquivalentMeasurementRelationship(), this.getEquivalentMeasurementRelationship_To(), "equivalentFrom", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RecursiveTo(), this.getRecursiveMeasurementRelationship(), this.getRecursiveMeasurementRelationship_From(), "recursiveTo", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RecursiveFrom(), this.getRecursiveMeasurementRelationship(), this.getRecursiveMeasurementRelationship_To(), "recursiveFrom", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_MeasurementRelationships(), this.getMeasurementRelationship(), null, "measurementRelationships", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(measurementEClass, ecorePackage.getEString(), "getMeasureLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(measurementEClass, ecorePackage.getEString(), "getMeasurementLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measurementRelationshipEClass, MeasurementRelationship.class, "MeasurementRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(measurementRelationshipEClass, this.getMeasurement(), "getTo", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(measurementRelationshipEClass, this.getMeasurement(), "getFrom", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedMeasureEClass, NamedMeasure.class, "NamedMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedMeasurementEClass, NamedMeasurement.class, "NamedMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObservation_Observer(), ecorePackage.getEString(), "observer", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservation_Tool(), ecorePackage.getEString(), "tool", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservation_WhenObserved(), this.getDate(), "whenObserved", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_Scopes(), this.getObservationScope(), null, "scopes", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_ObservedMeasures(), this.getObservedMeasure(), null, "observedMeasures", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_RequestedMeasures(), this.getSmmElement(), this.getSmmElement_RequestedObservations(), "requestedMeasures", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_MeasurementRelations(), this.getSmmRelationship(), null, "measurementRelations", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationScopeEClass, ObservationScope.class, "ObservationScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObservationScope_ScopeUri(), ecorePackage.getEString(), "scopeUri", null, 1, 1, ObservationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observedMeasureEClass, ObservedMeasure.class, "ObservedMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservedMeasure_Measure(), this.getMeasure(), null, "measure", null, 1, 1, ObservedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservedMeasure_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, ObservedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(observedMeasureEClass, ecorePackage.getEObject(), "getMeasureRefimentsObservedMeasures", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(oclOperationEClass, OCLOperation.class, "OCLOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLOperation_Context(), ecorePackage.getEString(), "context", null, 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOCLOperation_Body(), ecorePackage.getEString(), "body", null, 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Language(), ecorePackage.getEString(), "language", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Body(), ecorePackage.getEString(), "body", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(operationEClass, ecorePackage.getEString(), "getParamStrings", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(rankingEClass, Ranking.class, "Ranking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRanking_Interval(), this.getRankingInterval(), this.getRankingInterval_Rank(), "interval", null, 1, -1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRanking_RankingTo(), this.getRankingMeasureRelationship(), this.getRankingMeasureRelationship_From(), "rankingTo", null, 0, 1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingIntervalEClass, RankingInterval.class, "RankingInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRankingInterval_Rank(), this.getRanking(), this.getRanking_Interval(), "rank", null, 0, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRankingInterval_MaximumEndpoint(), ecorePackage.getEDouble(), "maximumEndpoint", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRankingInterval_MaximumOpen(), ecorePackage.getEBoolean(), "maximumOpen", null, 0, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRankingInterval_MinimumEndpoint(), ecorePackage.getEDouble(), "minimumEndpoint", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRankingInterval_MinimumOpen(), ecorePackage.getEBoolean(), "minimumOpen", null, 0, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRankingInterval_Symbol(), ecorePackage.getEString(), "symbol", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingMeasureRelationshipEClass, RankingMeasureRelationship.class, "RankingMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRankingMeasureRelationship_From(), this.getRanking(), this.getRanking_RankingTo(), "from", null, 1, 1, RankingMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRankingMeasureRelationship_To(), this.getDimensionalMeasure(), this.getDimensionalMeasure_RankingFrom(), "to", null, 1, 1, RankingMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingMeasurementRelationshipEClass, RankingMeasurementRelationship.class, "RankingMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRankingMeasurementRelationship_From(), this.getGrade(), this.getGrade_RankingTo(), "from", null, 1, 1, RankingMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRankingMeasurementRelationship_To(), this.getDimensionalMeasurement(), this.getDimensionalMeasurement_RankingFrom(), "to", null, 1, 1, RankingMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratioMeasureEClass, RatioMeasure.class, "RatioMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ratioMeasurementEClass, RatioMeasurement.class, "RatioMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recursiveMeasureRelationshipEClass, RecursiveMeasureRelationship.class, "RecursiveMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecursiveMeasureRelationship_From(), this.getMeasure(), this.getMeasure_RecursiveTo(), "from", null, 1, 1, RecursiveMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecursiveMeasureRelationship_To(), this.getMeasure(), this.getMeasure_RecursiveFrom(), "to", null, 1, 1, RecursiveMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recursiveMeasurementRelationshipEClass, RecursiveMeasurementRelationship.class, "RecursiveMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecursiveMeasurementRelationship_From(), this.getMeasurement(), this.getMeasurement_RecursiveTo(), "from", null, 1, 1, RecursiveMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecursiveMeasurementRelationship_To(), this.getMeasurement(), this.getMeasurement_RecursiveFrom(), "to", null, 1, 1, RecursiveMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinementMeasureRelationshipEClass, RefinementMeasureRelationship.class, "RefinementMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinementMeasureRelationship_From(), this.getMeasure(), this.getMeasure_RefinementTo(), "from", null, 1, 1, RefinementMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementMeasureRelationship_To(), this.getMeasure(), this.getMeasure_RefinementFrom(), "to", null, 1, 1, RefinementMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinementMeasurementRelationshipEClass, RefinementMeasurementRelationship.class, "RefinementMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinementMeasurementRelationship_From(), this.getMeasurement(), this.getMeasurement_RefinementTo(), "from", null, 1, 1, RefinementMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementMeasurementRelationship_To(), this.getMeasurement(), this.getMeasurement_RefinementFrom(), "to", null, 1, 1, RefinementMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaledMeasureEClass, RescaledMeasure.class, "RescaledMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRescaledMeasure_Formula(), ecorePackage.getEString(), "formula", null, 1, 1, RescaledMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaledMeasure_RescaleFrom(), this.getRescaleMeasureRelationship(), this.getRescaleMeasureRelationship_To(), "rescaleFrom", null, 0, -1, RescaledMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaleMeasureRelationshipEClass, RescaleMeasureRelationship.class, "RescaleMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRescaleMeasureRelationship_To(), this.getRescaledMeasure(), this.getRescaledMeasure_RescaleFrom(), "to", null, 1, 1, RescaleMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaleMeasureRelationship_From(), this.getDimensionalMeasure(), this.getDimensionalMeasure_RescaleTo(), "from", null, 1, 1, RescaleMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaledMeasurementEClass, RescaledMeasurement.class, "RescaledMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRescaledMeasurement_IsBaseSupplied(), ecorePackage.getEBoolean(), "isBaseSupplied", null, 1, 1, RescaledMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaledMeasurement_RescaleFrom(), this.getRescaleMeasurementRelationship(), this.getRescaleMeasurementRelationship_To(), "rescaleFrom", null, 0, -1, RescaledMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaleMeasurementRelationshipEClass, RescaleMeasurementRelationship.class, "RescaleMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRescaleMeasurementRelationship_To(), this.getRescaledMeasurement(), this.getRescaledMeasurement_RescaleFrom(), "to", null, 1, 1, RescaleMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaleMeasurementRelationship_From(), this.getDimensionalMeasurement(), this.getDimensionalMeasurement_RescaleTo(), "from", null, 1, 1, RescaleMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScope_Class(), ecorePackage.getEString(), "class", null, 1, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_RecognizerQuery(), this.getOperation(), null, "recognizerQuery", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_BreakCondition(), this.getOperation(), null, "breakCondition", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smmElementEClass, SmmElement.class, "SmmElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmmElement_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmmElement_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmmElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmmElement_ShortDescription(), ecorePackage.getEString(), "shortDescription", null, 0, 1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmmElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmmElement_RequestedObservations(), this.getObservation(), this.getObservation_RequestedMeasures(), "requestedObservations", null, 0, -1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(smmElementEClass, this.getSmmRelationship(), "getInbound", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(smmElementEClass, this.getSmmRelationship(), "getOutbound", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(smmModelEClass, SmmModel.class, "SmmModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmmModel_Observations(), this.getObservation(), null, "observations", null, 0, -1, SmmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmmModel_Librairies(), this.getMeasureLibrary(), null, "librairies", null, 0, -1, SmmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smmRelationshipEClass, SmmRelationship.class, "SmmRelationship", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(smmRelationshipEClass, this.getSmmElement(), "getTo", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(smmRelationshipEClass, this.getSmmElement(), "getFrom", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accumulatorEEnum, Accumulator.class, "Accumulator");
		addEEnumLiteral(accumulatorEEnum, Accumulator.SUM);
		addEEnumLiteral(accumulatorEEnum, Accumulator.MAXIMUM);
		addEEnumLiteral(accumulatorEEnum, Accumulator.MINIMUM);
		addEEnumLiteral(accumulatorEEnum, Accumulator.AVERAGE);
		addEEnumLiteral(accumulatorEEnum, Accumulator.STANDARD_DEVIATION);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timestampEDataType, Timestamp.class, "Timestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SmmPackageImpl
