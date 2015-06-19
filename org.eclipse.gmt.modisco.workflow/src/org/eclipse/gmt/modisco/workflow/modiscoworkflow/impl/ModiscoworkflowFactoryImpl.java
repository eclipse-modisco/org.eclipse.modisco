/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Direction;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Work;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameter;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterMapValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringListValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public class ModiscoworkflowFactoryImpl extends EFactoryImpl implements ModiscoworkflowFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public static ModiscoworkflowFactory init() {
		try {
			ModiscoworkflowFactory theModiscoworkflowFactory = (ModiscoworkflowFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/gmt/modisco/workflow"); //$NON-NLS-1$
			if (theModiscoworkflowFactory != null) {
				return theModiscoworkflowFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModiscoworkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public ModiscoworkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	public EObject create(final EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModiscoworkflowPackage.WORKFLOW:
			return createWorkflow();
		case ModiscoworkflowPackage.WORK:
			return createWork();
		case ModiscoworkflowPackage.WORK_PARAMETER:
			return createWorkParameter();
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_VALUE:
			return createWorkParameterStringValue();
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE:
			return createWorkParameterStringListValue();
		case ModiscoworkflowPackage.WORK_PARAMETER_BOOLEAN_VALUE:
			return createWorkParameterBooleanValue();
		case ModiscoworkflowPackage.WORK_PARAMETER_INTEGER_VALUE:
			return createWorkParameterIntegerValue();
		case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE:
			return createWorkParameterMapValue();
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE:
			return (EObject) createWorkParameterEntryValue();
		case ModiscoworkflowPackage.EXPORT_INFOS:
			return createExportInfos();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	public Object createFromString(final EDataType eDataType, final String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ModiscoworkflowPackage.DIRECTION:
			return createDirectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	public String convertToString(final EDataType eDataType, final Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ModiscoworkflowPackage.DIRECTION:
			return convertDirectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Work createWork() {
		WorkImpl work = new WorkImpl();
		return work;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public WorkParameter createWorkParameter() {
		WorkParameterImpl workParameter = new WorkParameterImpl();
		return workParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public WorkParameterStringValue createWorkParameterStringValue() {
		WorkParameterStringValueImpl workParameterStringValue = new WorkParameterStringValueImpl();
		return workParameterStringValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public WorkParameterStringListValue createWorkParameterStringListValue() {
		WorkParameterStringListValueImpl workParameterStringListValue = new WorkParameterStringListValueImpl();
		return workParameterStringListValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public WorkParameterBooleanValue createWorkParameterBooleanValue() {
		WorkParameterBooleanValueImpl workParameterBooleanValue = new WorkParameterBooleanValueImpl();
		return workParameterBooleanValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public WorkParameterIntegerValue createWorkParameterIntegerValue() {
		WorkParameterIntegerValueImpl workParameterIntegerValue = new WorkParameterIntegerValueImpl();
		return workParameterIntegerValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public WorkParameterMapValue createWorkParameterMapValue() {
		WorkParameterMapValueImpl workParameterMapValue = new WorkParameterMapValueImpl();
		return workParameterMapValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Map.Entry<String, WorkParameterValue> createWorkParameterEntryValue() {
		WorkParameterEntryValueImpl workParameterEntryValue = new WorkParameterEntryValueImpl();
		return workParameterEntryValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public ExportInfos createExportInfos() {
		ExportInfosImpl exportInfos = new ExportInfosImpl();
		return exportInfos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Direction createDirectionFromString(final EDataType eDataType, final String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public String convertDirectionToString(final EDataType eDataType, final Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public ModiscoworkflowPackage getModiscoworkflowPackage() {
		return (ModiscoworkflowPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public static ModiscoworkflowPackage getPackage() {
		return ModiscoworkflowPackage.eINSTANCE;
	}

} // ModiscoworkflowFactoryImpl
