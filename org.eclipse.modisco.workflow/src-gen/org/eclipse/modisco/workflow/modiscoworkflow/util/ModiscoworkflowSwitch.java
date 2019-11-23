/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.modiscoworkflow.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.workflow.modiscoworkflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage
 * @generated
 */
public class ModiscoworkflowSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoworkflowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoworkflowSwitch() {
		if (modelPackage == null) {
			modelPackage = ModiscoworkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModiscoworkflowPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = caseElement(workflow);
				if (result == null) result = caseExportInfos(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK: {
				Work work = (Work)theEObject;
				T result = caseWork(work);
				if (result == null) result = caseElement(work);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER: {
				WorkParameter workParameter = (WorkParameter)theEObject;
				T result = caseWorkParameter(workParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER_VALUE: {
				WorkParameterValue workParameterValue = (WorkParameterValue)theEObject;
				T result = caseWorkParameterValue(workParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER_STRING_VALUE: {
				WorkParameterStringValue workParameterStringValue = (WorkParameterStringValue)theEObject;
				T result = caseWorkParameterStringValue(workParameterStringValue);
				if (result == null) result = caseWorkParameterValue(workParameterStringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE: {
				WorkParameterStringListValue workParameterStringListValue = (WorkParameterStringListValue)theEObject;
				T result = caseWorkParameterStringListValue(workParameterStringListValue);
				if (result == null) result = caseWorkParameterValue(workParameterStringListValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER_BOOLEAN_VALUE: {
				WorkParameterBooleanValue workParameterBooleanValue = (WorkParameterBooleanValue)theEObject;
				T result = caseWorkParameterBooleanValue(workParameterBooleanValue);
				if (result == null) result = caseWorkParameterValue(workParameterBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER_INTEGER_VALUE: {
				WorkParameterIntegerValue workParameterIntegerValue = (WorkParameterIntegerValue)theEObject;
				T result = caseWorkParameterIntegerValue(workParameterIntegerValue);
				if (result == null) result = caseWorkParameterValue(workParameterIntegerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE: {
				WorkParameterMapValue workParameterMapValue = (WorkParameterMapValue)theEObject;
				T result = caseWorkParameterMapValue(workParameterMapValue);
				if (result == null) result = caseWorkParameterValue(workParameterMapValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE: {
				@SuppressWarnings("unchecked") Map.Entry<String, WorkParameterValue> workParameterEntryValue = (Map.Entry<String, WorkParameterValue>)theEObject;
				T result = caseWorkParameterEntryValue(workParameterEntryValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoworkflowPackage.EXPORT_INFOS: {
				ExportInfos exportInfos = (ExportInfos)theEObject;
				T result = caseExportInfos(exportInfos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWork(Work object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameter(WorkParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameterValue(WorkParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameterStringValue(WorkParameterStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter String List Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter String List Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameterStringListValue(WorkParameterStringListValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameterBooleanValue(WorkParameterBooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameterIntegerValue(WorkParameterIntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter Map Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter Map Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameterMapValue(WorkParameterMapValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter Entry Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter Entry Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkParameterEntryValue(Map.Entry<String, WorkParameterValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Infos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Infos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportInfos(ExportInfos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ModiscoworkflowSwitch
