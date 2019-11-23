/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.modiscoworkflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory
 * @model kind="package"
 * @generated
 */
public interface ModiscoworkflowPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "modiscoworkflow"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/infra/workflow/0.9.incubation"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.modisco.workflow"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ModiscoworkflowPackage eINSTANCE = org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.ElementImpl
	 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ElementImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__INDEX = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkflowImpl
	 * <em>Workflow</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkflowImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = ModiscoworkflowPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TYPE = ModiscoworkflowPackage.ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__INDEX = ModiscoworkflowPackage.ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Package Base</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PACKAGE_BASE = ModiscoworkflowPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SYMBOLIC_NAME = ModiscoworkflowPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ELEMENTS = ModiscoworkflowPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = ModiscoworkflowPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkImpl
	 * <em>Work</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWork()
	 * @generated
	 */
	int WORK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK__NAME = ModiscoworkflowPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK__TYPE = ModiscoworkflowPackage.ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK__INDEX = ModiscoworkflowPackage.ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK__PARAMETERS = ModiscoworkflowPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_FEATURE_COUNT = ModiscoworkflowPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl
	 * <em>Work Parameter</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameter()
	 * @generated
	 */
	int WORK_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Work Parameter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue
	 * <em>Work Parameter Value</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterValue()
	 * @generated
	 */
	int WORK_PARAMETER_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Work Parameter Value</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringValueImpl
	 * <em>Work Parameter String Value</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringValueImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterStringValue()
	 * @generated
	 */
	int WORK_PARAMETER_STRING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_STRING_VALUE__VALUE = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Work Parameter String Value</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_STRING_VALUE_FEATURE_COUNT = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringListValueImpl
	 * <em>Work Parameter String List Value</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringListValueImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterStringListValue()
	 * @generated
	 */
	int WORK_PARAMETER_STRING_LIST_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_STRING_LIST_VALUE__VALUE = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Work Parameter String List Value</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_STRING_LIST_VALUE_FEATURE_COUNT = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterBooleanValueImpl
	 * <em>Work Parameter Boolean Value</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterBooleanValueImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterBooleanValue()
	 * @generated
	 */
	int WORK_PARAMETER_BOOLEAN_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_BOOLEAN_VALUE__VALUE = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Work Parameter Boolean Value</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_BOOLEAN_VALUE_FEATURE_COUNT = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterIntegerValueImpl
	 * <em>Work Parameter Integer Value</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterIntegerValueImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterIntegerValue()
	 * @generated
	 */
	int WORK_PARAMETER_INTEGER_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_INTEGER_VALUE__VALUE = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Work Parameter Integer Value</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_INTEGER_VALUE_FEATURE_COUNT = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterMapValueImpl
	 * <em>Work Parameter Map Value</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterMapValueImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterMapValue()
	 * @generated
	 */
	int WORK_PARAMETER_MAP_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Entry List</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_MAP_VALUE__ENTRY_LIST = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Work Parameter Map Value</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_MAP_VALUE_FEATURE_COUNT = ModiscoworkflowPackage.WORK_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterEntryValueImpl
	 * <em>Work Parameter Entry Value</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterEntryValueImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterEntryValue()
	 * @generated
	 */
	int WORK_PARAMETER_ENTRY_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_ENTRY_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_ENTRY_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '
	 * <em>Work Parameter Entry Value</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WORK_PARAMETER_ENTRY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl
	 * <em>Export Infos</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getExportInfos()
	 * @generated
	 */
	int EXPORT_INFOS = 11;

	/**
	 * The feature id for the '<em><b>Package Base</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_INFOS__PACKAGE_BASE = 0;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_INFOS__SYMBOLIC_NAME = 1;

	/**
	 * The number of structural features of the '<em>Export Infos</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_INFOS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Direction
	 * <em>Direction</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Direction
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 12;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Element
	 * <em>Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Element#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Element#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Element#getIndex
	 * <em>Index</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Element#getIndex()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Index();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Workflow
	 * <em>Workflow</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Workflow#getElements
	 * <em>Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Elements</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Workflow#getElements()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Elements();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Work <em>Work</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Work
	 * @generated
	 */
	EClass getWork();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Work#getParameters
	 * <em>Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Parameters</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Work#getParameters()
	 * @see #getWork()
	 * @generated
	 */
	EReference getWork_Parameters();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter
	 * <em>Work Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Parameter</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter
	 * @generated
	 */
	EClass getWorkParameter();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getName()
	 * @see #getWorkParameter()
	 * @generated
	 */
	EAttribute getWorkParameter_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDirection
	 * <em>Direction</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDirection()
	 * @see #getWorkParameter()
	 * @generated
	 */
	EAttribute getWorkParameter_Direction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getType()
	 * @see #getWorkParameter()
	 * @generated
	 */
	EAttribute getWorkParameter_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#isRequired
	 * <em>Required</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#isRequired()
	 * @see #getWorkParameter()
	 * @generated
	 */
	EAttribute getWorkParameter_Required();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDescription
	 * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDescription()
	 * @see #getWorkParameter()
	 * @generated
	 */
	EAttribute getWorkParameter_Description();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getValue()
	 * @see #getWorkParameter()
	 * @generated
	 */
	EReference getWorkParameter_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue
	 * <em>Work Parameter Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Parameter Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue
	 * @generated
	 */
	EClass getWorkParameterValue();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringValue
	 * <em>Work Parameter String Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Parameter String Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringValue
	 * @generated
	 */
	EClass getWorkParameterStringValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringValue#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringValue#getValue()
	 * @see #getWorkParameterStringValue()
	 * @generated
	 */
	EAttribute getWorkParameterStringValue_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringListValue
	 * <em>Work Parameter String List Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Work Parameter String List Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringListValue
	 * @generated
	 */
	EClass getWorkParameterStringListValue();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringListValue#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringListValue#getValue()
	 * @see #getWorkParameterStringListValue()
	 * @generated
	 */
	EAttribute getWorkParameterStringListValue_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue
	 * <em>Work Parameter Boolean Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Parameter Boolean Value</em>
	 *         '.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue
	 * @generated
	 */
	EClass getWorkParameterBooleanValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue#isValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue#isValue()
	 * @see #getWorkParameterBooleanValue()
	 * @generated
	 */
	EAttribute getWorkParameterBooleanValue_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue
	 * <em>Work Parameter Integer Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Parameter Integer Value</em>
	 *         '.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue
	 * @generated
	 */
	EClass getWorkParameterIntegerValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue#getValue()
	 * @see #getWorkParameterIntegerValue()
	 * @generated
	 */
	EAttribute getWorkParameterIntegerValue_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterMapValue
	 * <em>Work Parameter Map Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Parameter Map Value</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterMapValue
	 * @generated
	 */
	EClass getWorkParameterMapValue();

	/**
	 * Returns the meta object for the map '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterMapValue#getEntryList
	 * <em>Entry List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>Entry List</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterMapValue#getEntryList()
	 * @see #getWorkParameterMapValue()
	 * @generated
	 */
	EReference getWorkParameterMapValue_EntryList();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry
	 * <em>Work Parameter Entry Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Work Parameter Entry Value</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" valueType=
	 *        "org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue"
	 *        valueContainment="true"
	 * @generated
	 */
	EClass getWorkParameterEntryValue();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry
	 * <em>Key</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkParameterEntryValue()
	 * @generated
	 */
	EAttribute getWorkParameterEntryValue_Key();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link java.util.Map.Entry <em>Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkParameterEntryValue()
	 * @generated
	 */
	EReference getWorkParameterEntryValue_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos
	 * <em>Export Infos</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Export Infos</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos
	 * @generated
	 */
	EClass getExportInfos();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos#getPackageBase
	 * <em>Package Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Package Base</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos#getPackageBase()
	 * @see #getExportInfos()
	 * @generated
	 */
	EAttribute getExportInfos_PackageBase();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos#getSymbolicName
	 * <em>Symbolic Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos#getSymbolicName()
	 * @see #getExportInfos()
	 * @generated
	 */
	EAttribute getExportInfos_SymbolicName();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Direction
	 * <em>Direction</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModiscoworkflowFactory getModiscoworkflowFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.ElementImpl
		 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ElementImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = ModiscoworkflowPackage.eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT__NAME = ModiscoworkflowPackage.eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = ModiscoworkflowPackage.eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT__INDEX = ModiscoworkflowPackage.eINSTANCE.getElement_Index();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkflowImpl
		 * <em>Workflow</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkflowImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = ModiscoworkflowPackage.eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORKFLOW__ELEMENTS = ModiscoworkflowPackage.eINSTANCE.getWorkflow_Elements();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkImpl
		 * <em>Work</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWork()
		 * @generated
		 */
		EClass WORK = ModiscoworkflowPackage.eINSTANCE.getWork();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK__PARAMETERS = ModiscoworkflowPackage.eINSTANCE.getWork_Parameters();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl
		 * <em>Work Parameter</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameter()
		 * @generated
		 */
		EClass WORK_PARAMETER = ModiscoworkflowPackage.eINSTANCE.getWorkParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER__NAME = ModiscoworkflowPackage.eINSTANCE.getWorkParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER__DIRECTION = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER__TYPE = ModiscoworkflowPackage.eINSTANCE.getWorkParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER__REQUIRED = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER__DESCRIPTION = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_PARAMETER__VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameter_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue
		 * <em>Work Parameter Value</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterValue()
		 * @generated
		 */
		EClass WORK_PARAMETER_VALUE = ModiscoworkflowPackage.eINSTANCE.getWorkParameterValue();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringValueImpl
		 * <em>Work Parameter String Value</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringValueImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterStringValue()
		 * @generated
		 */
		EClass WORK_PARAMETER_STRING_VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER_STRING_VALUE__VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterStringValue_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringListValueImpl
		 * <em>Work Parameter String List Value</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringListValueImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterStringListValue()
		 * @generated
		 */
		EClass WORK_PARAMETER_STRING_LIST_VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterStringListValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER_STRING_LIST_VALUE__VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterStringListValue_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterBooleanValueImpl
		 * <em>Work Parameter Boolean Value</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterBooleanValueImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterBooleanValue()
		 * @generated
		 */
		EClass WORK_PARAMETER_BOOLEAN_VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER_BOOLEAN_VALUE__VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterBooleanValue_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterIntegerValueImpl
		 * <em>Work Parameter Integer Value</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterIntegerValueImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterIntegerValue()
		 * @generated
		 */
		EClass WORK_PARAMETER_INTEGER_VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER_INTEGER_VALUE__VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterIntegerValue_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterMapValueImpl
		 * <em>Work Parameter Map Value</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterMapValueImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterMapValue()
		 * @generated
		 */
		EClass WORK_PARAMETER_MAP_VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterMapValue();

		/**
		 * The meta object literal for the '<em><b>Entry List</b></em>' map
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_PARAMETER_MAP_VALUE__ENTRY_LIST = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterMapValue_EntryList();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterEntryValueImpl
		 * <em>Work Parameter Entry Value</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterEntryValueImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getWorkParameterEntryValue()
		 * @generated
		 */
		EClass WORK_PARAMETER_ENTRY_VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterEntryValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WORK_PARAMETER_ENTRY_VALUE__KEY = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterEntryValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WORK_PARAMETER_ENTRY_VALUE__VALUE = ModiscoworkflowPackage.eINSTANCE
				.getWorkParameterEntryValue_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl
		 * <em>Export Infos</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getExportInfos()
		 * @generated
		 */
		EClass EXPORT_INFOS = ModiscoworkflowPackage.eINSTANCE.getExportInfos();

		/**
		 * The meta object literal for the '<em><b>Package Base</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXPORT_INFOS__PACKAGE_BASE = ModiscoworkflowPackage.eINSTANCE
				.getExportInfos_PackageBase();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXPORT_INFOS__SYMBOLIC_NAME = ModiscoworkflowPackage.eINSTANCE
				.getExportInfos_SymbolicName();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Direction
		 * <em>Direction</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.Direction
		 * @see org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = ModiscoworkflowPackage.eINSTANCE.getDirection();

	}

} // ModiscoworkflowPackage
