/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Nicolas Payneau (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.workflow.mwe.workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.gmt.modisco.workflow.mwe.workflow"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ENGINES = 1;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowComponent()
	 * @generated
	 */
	int WORKFLOW_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowCompositeComponent()
	 * @generated
	 */
	int WORKFLOW_COMPOSITE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__NAME = WORKFLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__TYPE = WORKFLOW_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__DESCRIPTION = WORKFLOW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS = WORKFLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS = WORKFLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Resolution Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY = WORKFLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS = WORKFLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_COMPONENT_FEATURE_COUNT = WORKFLOW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowUnitOfWorkImpl <em>Unit Of Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowUnitOfWorkImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowUnitOfWork()
	 * @generated
	 */
	int WORKFLOW_UNIT_OF_WORK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UNIT_OF_WORK__NAME = WORKFLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UNIT_OF_WORK__TYPE = WORKFLOW_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UNIT_OF_WORK__DESCRIPTION = WORKFLOW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UNIT_OF_WORK__COMPONENT_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UNIT_OF_WORK__PARAMETERS = WORKFLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Of Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT = WORKFLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameter()
	 * @generated
	 */
	int WORKFLOW_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER__CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Value Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER__VALUE_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER__DIRECTION = 6;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterValueStrategyImpl <em>Parameter Value Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterValueStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameterValueStrategy()
	 * @generated
	 */
	int WORKFLOW_PARAMETER_VALUE_STRATEGY = 5;

	/**
	 * The number of structural features of the '<em>Parameter Value Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_VALUE_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterConnectionImpl <em>Parameter Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterConnectionImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameterConnection()
	 * @generated
	 */
	int WORKFLOW_PARAMETER_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_CONNECTION__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_CONNECTION__INPUTS = 1;

	/**
	 * The number of structural features of the '<em>Parameter Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterSimpleValueStrategyImpl <em>Parameter Simple Value Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterSimpleValueStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameterSimpleValueStrategy()
	 * @generated
	 */
	int WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY = 7;

	/**
	 * The number of structural features of the '<em>Parameter Simple Value Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY_FEATURE_COUNT = WORKFLOW_PARAMETER_VALUE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor <em>IWorkflow Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getIWorkflowVisitor()
	 * @generated
	 */
	int IWORKFLOW_VISITOR = 8;

	/**
	 * The number of structural features of the '<em>IWorkflow Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKFLOW_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentProxyImpl <em>Component Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentProxyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowComponentProxy()
	 * @generated
	 */
	int WORKFLOW_COMPONENT_PROXY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_PROXY__NAME = WORKFLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_PROXY__TYPE = WORKFLOW_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_PROXY__DESCRIPTION = WORKFLOW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_PROXY__COMPONENT_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT = WORKFLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_PROXY_FEATURE_COUNT = WORKFLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentMinimalistImpl <em>Component Minimalist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentMinimalistImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowComponentMinimalist()
	 * @generated
	 */
	int WORKFLOW_COMPONENT_MINIMALIST = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_MINIMALIST__NAME = WORKFLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_MINIMALIST__TYPE = WORKFLOW_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_MINIMALIST__DESCRIPTION = WORKFLOW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_MINIMALIST__COMPONENT_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The number of structural features of the '<em>Component Minimalist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_MINIMALIST_FEATURE_COUNT = WORKFLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow#getComponents()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engines</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow#getEngines()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Engines();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent
	 * @generated
	 */
	EClass getWorkflowComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getName()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	EAttribute getWorkflowComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getType()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	EAttribute getWorkflowComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getDescription()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	EAttribute getWorkflowComponent_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getComponentOrchestrationStrategy <em>Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Orchestration Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent#getComponentOrchestrationStrategy()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	EReference getWorkflowComponent_ComponentOrchestrationStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent
	 * @generated
	 */
	EClass getWorkflowCompositeComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getComponents()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	EReference getWorkflowCompositeComponent_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy <em>Composite Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Orchestration Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	EReference getWorkflowCompositeComponent_CompositeOrchestrationStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getConnections()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	EReference getWorkflowCompositeComponent_Connections();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getStateResolutionStrategy <em>State Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Resolution Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getStateResolutionStrategy()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	EReference getWorkflowCompositeComponent_StateResolutionStrategy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getParameters()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	EReference getWorkflowCompositeComponent_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork <em>Unit Of Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Of Work</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork
	 * @generated
	 */
	EClass getWorkflowUnitOfWork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork#getParameters()
	 * @see #getWorkflowUnitOfWork()
	 * @generated
	 */
	EReference getWorkflowUnitOfWork_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter
	 * @generated
	 */
	EClass getWorkflowParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getName()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	EAttribute getWorkflowParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDescription()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	EAttribute getWorkflowParameter_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getConnection()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	EReference getWorkflowParameter_Connection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#isRequired()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	EAttribute getWorkflowParameter_Required();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getValueStrategy <em>Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getValueStrategy()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	EReference getWorkflowParameter_ValueStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getType()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	EAttribute getWorkflowParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDirection()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	EAttribute getWorkflowParameter_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterValueStrategy <em>Parameter Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterValueStrategy
	 * @generated
	 */
	EClass getWorkflowParameterValueStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Connection</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection
	 * @generated
	 */
	EClass getWorkflowParameterConnection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getOutput()
	 * @see #getWorkflowParameterConnection()
	 * @generated
	 */
	EReference getWorkflowParameterConnection_Output();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getInputs()
	 * @see #getWorkflowParameterConnection()
	 * @generated
	 */
	EReference getWorkflowParameterConnection_Inputs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterSimpleValueStrategy <em>Parameter Simple Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Simple Value Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterSimpleValueStrategy
	 * @generated
	 */
	EClass getWorkflowParameterSimpleValueStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor <em>IWorkflow Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWorkflow Visitor</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor
	 * @generated
	 */
	EClass getIWorkflowVisitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy <em>Component Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Proxy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy
	 * @generated
	 */
	EClass getWorkflowComponentProxy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy#getTargetComponent <em>Target Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Component</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy#getTargetComponent()
	 * @see #getWorkflowComponentProxy()
	 * @generated
	 */
	EReference getWorkflowComponentProxy_TargetComponent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentMinimalist <em>Component Minimalist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Minimalist</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentMinimalist
	 * @generated
	 */
	EClass getWorkflowComponentMinimalist();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

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
	 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
	 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
	 */
	@Deprecated
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__COMPONENTS = eINSTANCE.getWorkflow_Components();

		/**
		 * The meta object literal for the '<em><b>Engines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ENGINES = eINSTANCE.getWorkflow_Engines();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowComponent()
		 * @generated
		 */
		EClass WORKFLOW_COMPONENT = eINSTANCE.getWorkflowComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_COMPONENT__NAME = eINSTANCE.getWorkflowComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_COMPONENT__TYPE = eINSTANCE.getWorkflowComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_COMPONENT__DESCRIPTION = eINSTANCE.getWorkflowComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Component Orchestration Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowComponent_ComponentOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowCompositeComponent()
		 * @generated
		 */
		EClass WORKFLOW_COMPOSITE_COMPONENT = eINSTANCE.getWorkflowCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS = eINSTANCE.getWorkflowCompositeComponent_Components();

		/**
		 * The meta object literal for the '<em><b>Composite Orchestration Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowCompositeComponent_CompositeOrchestrationStrategy();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS = eINSTANCE.getWorkflowCompositeComponent_Connections();

		/**
		 * The meta object literal for the '<em><b>State Resolution Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY = eINSTANCE.getWorkflowCompositeComponent_StateResolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS = eINSTANCE.getWorkflowCompositeComponent_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowUnitOfWorkImpl <em>Unit Of Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowUnitOfWorkImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowUnitOfWork()
		 * @generated
		 */
		EClass WORKFLOW_UNIT_OF_WORK = eINSTANCE.getWorkflowUnitOfWork();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_UNIT_OF_WORK__PARAMETERS = eINSTANCE.getWorkflowUnitOfWork_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameter()
		 * @generated
		 */
		EClass WORKFLOW_PARAMETER = eINSTANCE.getWorkflowParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_PARAMETER__NAME = eINSTANCE.getWorkflowParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_PARAMETER__DESCRIPTION = eINSTANCE.getWorkflowParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PARAMETER__CONNECTION = eINSTANCE.getWorkflowParameter_Connection();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_PARAMETER__REQUIRED = eINSTANCE.getWorkflowParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Value Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PARAMETER__VALUE_STRATEGY = eINSTANCE.getWorkflowParameter_ValueStrategy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_PARAMETER__TYPE = eINSTANCE.getWorkflowParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_PARAMETER__DIRECTION = eINSTANCE.getWorkflowParameter_Direction();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterValueStrategyImpl <em>Parameter Value Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterValueStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameterValueStrategy()
		 * @generated
		 */
		EClass WORKFLOW_PARAMETER_VALUE_STRATEGY = eINSTANCE.getWorkflowParameterValueStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterConnectionImpl <em>Parameter Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterConnectionImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameterConnection()
		 * @generated
		 */
		EClass WORKFLOW_PARAMETER_CONNECTION = eINSTANCE.getWorkflowParameterConnection();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PARAMETER_CONNECTION__OUTPUT = eINSTANCE.getWorkflowParameterConnection_Output();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PARAMETER_CONNECTION__INPUTS = eINSTANCE.getWorkflowParameterConnection_Inputs();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterSimpleValueStrategyImpl <em>Parameter Simple Value Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterSimpleValueStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowParameterSimpleValueStrategy()
		 * @generated
		 */
		EClass WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY = eINSTANCE.getWorkflowParameterSimpleValueStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor <em>IWorkflow Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getIWorkflowVisitor()
		 * @generated
		 */
		EClass IWORKFLOW_VISITOR = eINSTANCE.getIWorkflowVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentProxyImpl <em>Component Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentProxyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowComponentProxy()
		 * @generated
		 */
		EClass WORKFLOW_COMPONENT_PROXY = eINSTANCE.getWorkflowComponentProxy();

		/**
		 * The meta object literal for the '<em><b>Target Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT = eINSTANCE.getWorkflowComponentProxy_TargetComponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentMinimalistImpl <em>Component Minimalist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentMinimalistImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getWorkflowComponentMinimalist()
		 * @generated
		 */
		EClass WORKFLOW_COMPONENT_MINIMALIST = eINSTANCE.getWorkflowComponentMinimalist();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //WorkflowPackage
