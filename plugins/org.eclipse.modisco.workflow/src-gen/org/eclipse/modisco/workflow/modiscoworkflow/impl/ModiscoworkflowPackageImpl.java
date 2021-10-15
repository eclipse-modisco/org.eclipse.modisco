/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.modiscoworkflow.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.workflow.modiscoworkflow.Direction;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.modisco.workflow.modiscoworkflow.Work;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterMapValue;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringListValue;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringValue;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue;
import org.eclipse.modisco.workflow.modiscoworkflow.Workflow;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ModiscoworkflowPackageImpl extends EPackageImpl implements ModiscoworkflowPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterStringValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterStringListValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterMapValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workParameterEntryValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass exportInfosEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModiscoworkflowPackageImpl() {
		super(ModiscoworkflowPackage.eNS_URI, ModiscoworkflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize
	 * {@link ModiscoworkflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access
	 * that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModiscoworkflowPackage init() {
		if (ModiscoworkflowPackageImpl.isInited) {
			return (ModiscoworkflowPackage) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoworkflowPackage.eNS_URI);
		}

		// Obtain or create and register package
		ModiscoworkflowPackageImpl theModiscoworkflowPackage = (ModiscoworkflowPackageImpl) (EPackage.Registry.INSTANCE
				.get(ModiscoworkflowPackage.eNS_URI) instanceof ModiscoworkflowPackageImpl ? EPackage.Registry.INSTANCE
				.get(ModiscoworkflowPackage.eNS_URI) : new ModiscoworkflowPackageImpl());

		ModiscoworkflowPackageImpl.isInited = true;

		// Create package meta-data objects
		theModiscoworkflowPackage.createPackageContents();

		// Initialize created meta-data
		theModiscoworkflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModiscoworkflowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModiscoworkflowPackage.eNS_URI, theModiscoworkflowPackage);
		return theModiscoworkflowPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getElement() {
		return this.elementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute) this.elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElement_Type() {
		return (EAttribute) this.elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElement_Index() {
		return (EAttribute) this.elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkflow() {
		return this.workflowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getWorkflow_Elements() {
		return (EReference) this.workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWork() {
		return this.workEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getWork_Parameters() {
		return (EReference) this.workEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameter() {
		return this.workParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameter_Name() {
		return (EAttribute) this.workParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameter_Direction() {
		return (EAttribute) this.workParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameter_Type() {
		return (EAttribute) this.workParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameter_Required() {
		return (EAttribute) this.workParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameter_Description() {
		return (EAttribute) this.workParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getWorkParameter_Value() {
		return (EReference) this.workParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameterValue() {
		return this.workParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameterStringValue() {
		return this.workParameterStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameterStringValue_Value() {
		return (EAttribute) this.workParameterStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameterStringListValue() {
		return this.workParameterStringListValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameterStringListValue_Value() {
		return (EAttribute) this.workParameterStringListValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameterBooleanValue() {
		return this.workParameterBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameterBooleanValue_Value() {
		return (EAttribute) this.workParameterBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameterIntegerValue() {
		return this.workParameterIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameterIntegerValue_Value() {
		return (EAttribute) this.workParameterIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameterMapValue() {
		return this.workParameterMapValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getWorkParameterMapValue_EntryList() {
		return (EReference) this.workParameterMapValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getWorkParameterEntryValue() {
		return this.workParameterEntryValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getWorkParameterEntryValue_Key() {
		return (EAttribute) this.workParameterEntryValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getWorkParameterEntryValue_Value() {
		return (EReference) this.workParameterEntryValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExportInfos() {
		return this.exportInfosEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getExportInfos_PackageBase() {
		return (EAttribute) this.exportInfosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getExportInfos_SymbolicName() {
		return (EAttribute) this.exportInfosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getDirection() {
		return this.directionEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModiscoworkflowFactory getModiscoworkflowFactory() {
		return (ModiscoworkflowFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (this.isCreated) {
			return;
		}
		this.isCreated = true;

		// Create classes and their features
		this.elementEClass = createEClass(ModiscoworkflowPackage.ELEMENT);
		createEAttribute(this.elementEClass, ModiscoworkflowPackage.ELEMENT__NAME);
		createEAttribute(this.elementEClass, ModiscoworkflowPackage.ELEMENT__TYPE);
		createEAttribute(this.elementEClass, ModiscoworkflowPackage.ELEMENT__INDEX);

		this.workflowEClass = createEClass(ModiscoworkflowPackage.WORKFLOW);
		createEReference(this.workflowEClass, ModiscoworkflowPackage.WORKFLOW__ELEMENTS);

		this.workEClass = createEClass(ModiscoworkflowPackage.WORK);
		createEReference(this.workEClass, ModiscoworkflowPackage.WORK__PARAMETERS);

		this.workParameterEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER);
		createEAttribute(this.workParameterEClass, ModiscoworkflowPackage.WORK_PARAMETER__NAME);
		createEAttribute(this.workParameterEClass, ModiscoworkflowPackage.WORK_PARAMETER__DIRECTION);
		createEAttribute(this.workParameterEClass, ModiscoworkflowPackage.WORK_PARAMETER__TYPE);
		createEAttribute(this.workParameterEClass, ModiscoworkflowPackage.WORK_PARAMETER__REQUIRED);
		createEAttribute(this.workParameterEClass,
				ModiscoworkflowPackage.WORK_PARAMETER__DESCRIPTION);
		createEReference(this.workParameterEClass, ModiscoworkflowPackage.WORK_PARAMETER__VALUE);

		this.workParameterValueEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER_VALUE);

		this.workParameterStringValueEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER_STRING_VALUE);
		createEAttribute(this.workParameterStringValueEClass,
				ModiscoworkflowPackage.WORK_PARAMETER_STRING_VALUE__VALUE);

		this.workParameterStringListValueEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE);
		createEAttribute(this.workParameterStringListValueEClass,
				ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE__VALUE);

		this.workParameterBooleanValueEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER_BOOLEAN_VALUE);
		createEAttribute(this.workParameterBooleanValueEClass,
				ModiscoworkflowPackage.WORK_PARAMETER_BOOLEAN_VALUE__VALUE);

		this.workParameterIntegerValueEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER_INTEGER_VALUE);
		createEAttribute(this.workParameterIntegerValueEClass,
				ModiscoworkflowPackage.WORK_PARAMETER_INTEGER_VALUE__VALUE);

		this.workParameterMapValueEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE);
		createEReference(this.workParameterMapValueEClass,
				ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE__ENTRY_LIST);

		this.workParameterEntryValueEClass = createEClass(ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE);
		createEAttribute(this.workParameterEntryValueEClass,
				ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__KEY);
		createEReference(this.workParameterEntryValueEClass,
				ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE);

		this.exportInfosEClass = createEClass(ModiscoworkflowPackage.EXPORT_INFOS);
		createEAttribute(this.exportInfosEClass, ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE);
		createEAttribute(this.exportInfosEClass, ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME);

		// Create enums
		this.directionEEnum = createEEnum(ModiscoworkflowPackage.DIRECTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (this.isInitialized) {
			return;
		}
		this.isInitialized = true;

		// Initialize package
		setName(ModiscoworkflowPackage.eNAME);
		setNsPrefix(ModiscoworkflowPackage.eNS_PREFIX);
		setNsURI(ModiscoworkflowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.workflowEClass.getESuperTypes().add(getElement());
		this.workflowEClass.getESuperTypes().add(getExportInfos());
		this.workEClass.getESuperTypes().add(getElement());
		this.workParameterStringValueEClass.getESuperTypes().add(getWorkParameterValue());
		this.workParameterStringListValueEClass.getESuperTypes().add(getWorkParameterValue());
		this.workParameterBooleanValueEClass.getESuperTypes().add(getWorkParameterValue());
		this.workParameterIntegerValueEClass.getESuperTypes().add(getWorkParameterValue());
		this.workParameterMapValueEClass.getESuperTypes().add(getWorkParameterValue());

		// Initialize classes and features; add operations and parameters
		initEClass(
				this.elementEClass,
				Element.class,
				"Element", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getElement_Name(),
				this.ecorePackage.getEString(),
				"name", null, 0, 1, Element.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getElement_Type(),
				this.ecorePackage.getEString(),
				"type", null, 0, 1, Element.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getElement_Index(),
				this.ecorePackage.getEInt(),
				"index", null, 0, 1, Element.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workflowEClass,
				Workflow.class,
				"Workflow", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getWorkflow_Elements(),
				getElement(),
				null,
				"elements", null, 0, -1, Workflow.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workEClass,
				Work.class,
				"Work", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getWork_Parameters(),
				getWorkParameter(),
				null,
				"parameters", null, 0, -1, Work.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workParameterEClass,
				WorkParameter.class,
				"WorkParameter", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getWorkParameter_Name(),
				this.ecorePackage.getEString(),
				"name", null, 0, 1, WorkParameter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getWorkParameter_Direction(),
				getDirection(),
				"direction", "", 0, 1, WorkParameter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(
				getWorkParameter_Type(),
				this.ecorePackage.getEString(),
				"type", null, 0, 1, WorkParameter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getWorkParameter_Required(),
				this.ecorePackage.getEBoolean(),
				"required", null, 0, 1, WorkParameter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getWorkParameter_Description(),
				this.ecorePackage.getEString(),
				"description", null, 0, 1, WorkParameter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getWorkParameter_Value(),
				getWorkParameterValue(),
				null,
				"value", null, 0, 1, WorkParameter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workParameterValueEClass,
				WorkParameterValue.class,
				"WorkParameterValue", EPackageImpl.IS_ABSTRACT, EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				this.workParameterStringValueEClass,
				WorkParameterStringValue.class,
				"WorkParameterStringValue", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getWorkParameterStringValue_Value(),
				this.ecorePackage.getEString(),
				"value", null, 0, 1, WorkParameterStringValue.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workParameterStringListValueEClass,
				WorkParameterStringListValue.class,
				"WorkParameterStringListValue", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getWorkParameterStringListValue_Value(),
				this.ecorePackage.getEString(),
				"value", null, 0, -1, WorkParameterStringListValue.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, !EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workParameterBooleanValueEClass,
				WorkParameterBooleanValue.class,
				"WorkParameterBooleanValue", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getWorkParameterBooleanValue_Value(),
				this.ecorePackage.getEBoolean(),
				"value", null, 0, 1, WorkParameterBooleanValue.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workParameterIntegerValueEClass,
				WorkParameterIntegerValue.class,
				"WorkParameterIntegerValue", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getWorkParameterIntegerValue_Value(),
				this.ecorePackage.getEInt(),
				"value", null, 0, 1, WorkParameterIntegerValue.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workParameterMapValueEClass,
				WorkParameterMapValue.class,
				"WorkParameterMapValue", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getWorkParameterMapValue_EntryList(),
				getWorkParameterEntryValue(),
				null,
				"entryList", null, 0, -1, WorkParameterMapValue.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.workParameterEntryValueEClass,
				Map.Entry.class,
				"WorkParameterEntryValue", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, !EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getWorkParameterEntryValue_Key(),
				this.ecorePackage.getEString(),
				"key", null, 0, 1, Map.Entry.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getWorkParameterEntryValue_Value(),
				getWorkParameterValue(),
				null,
				"value", null, 0, 1, Map.Entry.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				this.exportInfosEClass,
				ExportInfos.class,
				"ExportInfos", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getExportInfos_PackageBase(),
				this.ecorePackage.getEString(),
				"packageBase", null, 0, 1, ExportInfos.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getExportInfos_SymbolicName(),
				this.ecorePackage.getEString(),
				"symbolicName", null, 0, 1, ExportInfos.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		addEOperation(this.exportInfosEClass, getElement(),
				"getAllUnitsOfWork", 0, -1, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(this.directionEEnum, Direction.class, "Direction"); //$NON-NLS-1$
		addEEnumLiteral(this.directionEEnum, Direction.IN);
		addEEnumLiteral(this.directionEEnum, Direction.OUT);
		addEEnumLiteral(this.directionEEnum, Direction.INOUT);

		// Create resource
		createResource(ModiscoworkflowPackage.eNS_URI);
	}

} // ModiscoworkflowPackageImpl
