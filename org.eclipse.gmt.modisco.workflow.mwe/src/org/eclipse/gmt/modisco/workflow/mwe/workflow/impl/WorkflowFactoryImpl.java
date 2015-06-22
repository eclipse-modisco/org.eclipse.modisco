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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init() {
		try {
			WorkflowFactory theWorkflowFactory = (WorkflowFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow");  //$NON-NLS-1$
			if (theWorkflowFactory != null) {
				return theWorkflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkflowPackage.WORKFLOW: return createWorkflow();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT: return createWorkflowCompositeComponent();
			case WorkflowPackage.WORKFLOW_UNIT_OF_WORK: return createWorkflowUnitOfWork();
			case WorkflowPackage.WORKFLOW_PARAMETER: return createWorkflowParameter();
			case WorkflowPackage.WORKFLOW_PARAMETER_VALUE_STRATEGY: return createWorkflowParameterValueStrategy();
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION: return createWorkflowParameterConnection();
			case WorkflowPackage.WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY: return createWorkflowParameterSimpleValueStrategy();
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY: return createWorkflowComponentProxy();
			case WorkflowPackage.WORKFLOW_COMPONENT_MINIMALIST: return createWorkflowComponentMinimalist();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WorkflowPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WorkflowPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowCompositeComponent createWorkflowCompositeComponent() {
		WorkflowCompositeComponentImpl workflowCompositeComponent = new WorkflowCompositeComponentImpl();
		return workflowCompositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowUnitOfWork createWorkflowUnitOfWork() {
		WorkflowUnitOfWorkImpl workflowUnitOfWork = new WorkflowUnitOfWorkImpl();
		return workflowUnitOfWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter createWorkflowParameter() {
		WorkflowParameterImpl workflowParameter = new WorkflowParameterImpl();
		return workflowParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterValueStrategy createWorkflowParameterValueStrategy() {
		WorkflowParameterValueStrategyImpl workflowParameterValueStrategy = new WorkflowParameterValueStrategyImpl();
		return workflowParameterValueStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterConnection createWorkflowParameterConnection() {
		WorkflowParameterConnectionImpl workflowParameterConnection = new WorkflowParameterConnectionImpl();
		return workflowParameterConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterSimpleValueStrategy createWorkflowParameterSimpleValueStrategy() {
		WorkflowParameterSimpleValueStrategyImpl workflowParameterSimpleValueStrategy = new WorkflowParameterSimpleValueStrategyImpl();
		return workflowParameterSimpleValueStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponentProxy createWorkflowComponentProxy() {
		WorkflowComponentProxyImpl workflowComponentProxy = new WorkflowComponentProxyImpl();
		return workflowComponentProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponentMinimalist createWorkflowComponentMinimalist() {
		WorkflowComponentMinimalistImpl workflowComponentMinimalist = new WorkflowComponentMinimalistImpl();
		return workflowComponentMinimalist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPackage getWorkflowPackage() {
		return (WorkflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage() {
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactoryImpl
