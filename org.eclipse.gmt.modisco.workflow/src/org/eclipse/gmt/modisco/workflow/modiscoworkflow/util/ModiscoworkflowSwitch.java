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
package org.eclipse.gmt.modisco.workflow.modiscoworkflow.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@SuppressWarnings("all")
public class ModiscoworkflowSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	protected static ModiscoworkflowPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	public ModiscoworkflowSwitch() {
		if (ModiscoworkflowSwitch.modelPackage == null) {
			ModiscoworkflowSwitch.modelPackage = ModiscoworkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
	 * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 * @deprecated
	 */
	public T doSwitch(final EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
	 * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 * @deprecated
	 */
	protected T doSwitch(final EClass theEClass, final EObject theEObject) {
		if (theEClass.eContainer() == ModiscoworkflowSwitch.modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0),
					theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
	 * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 * @deprecated
	 */
	protected T doSwitch(final int classifierID, final EObject theEObject) {
		switch (classifierID) {
		case ModiscoworkflowPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORKFLOW: {
			Workflow workflow = (Workflow) theEObject;
			T result = caseWorkflow(workflow);
			if (result == null) {
				result = caseElement(workflow);
			}
			if (result == null) {
				result = caseExportInfos(workflow);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK: {
			Work work = (Work) theEObject;
			T result = caseWork(work);
			if (result == null) {
				result = caseElement(work);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER: {
			WorkParameter workParameter = (WorkParameter) theEObject;
			T result = caseWorkParameter(workParameter);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER_VALUE: {
			WorkParameterValue workParameterValue = (WorkParameterValue) theEObject;
			T result = caseWorkParameterValue(workParameterValue);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_VALUE: {
			WorkParameterStringValue workParameterStringValue = (WorkParameterStringValue) theEObject;
			T result = caseWorkParameterStringValue(workParameterStringValue);
			if (result == null) {
				result = caseWorkParameterValue(workParameterStringValue);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE: {
			WorkParameterStringListValue workParameterStringListValue = (WorkParameterStringListValue) theEObject;
			T result = caseWorkParameterStringListValue(workParameterStringListValue);
			if (result == null) {
				result = caseWorkParameterValue(workParameterStringListValue);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER_BOOLEAN_VALUE: {
			WorkParameterBooleanValue workParameterBooleanValue = (WorkParameterBooleanValue) theEObject;
			T result = caseWorkParameterBooleanValue(workParameterBooleanValue);
			if (result == null) {
				result = caseWorkParameterValue(workParameterBooleanValue);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER_INTEGER_VALUE: {
			WorkParameterIntegerValue workParameterIntegerValue = (WorkParameterIntegerValue) theEObject;
			T result = caseWorkParameterIntegerValue(workParameterIntegerValue);
			if (result == null) {
				result = caseWorkParameterValue(workParameterIntegerValue);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE: {
			WorkParameterMapValue workParameterMapValue = (WorkParameterMapValue) theEObject;
			T result = caseWorkParameterMapValue(workParameterMapValue);
			if (result == null) {
				result = caseWorkParameterValue(workParameterMapValue);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, WorkParameterValue> workParameterEntryValue = (Map.Entry<String, WorkParameterValue>) theEObject;
			T result = caseWorkParameterEntryValue(workParameterEntryValue);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case ModiscoworkflowPackage.EXPORT_INFOS: {
			ExportInfos exportInfos = (ExportInfos) theEObject;
			T result = caseExportInfos(exportInfos);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseElement(final Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkflow(final Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWork(final Work object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Parameter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameter(final WorkParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Work Parameter Value</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Work Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameterValue(final WorkParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Work Parameter String Value</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Work Parameter String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameterStringValue(final WorkParameterStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Work Parameter String List Value</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Work Parameter String List Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameterStringListValue(final WorkParameterStringListValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Work Parameter Boolean Value</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Work Parameter Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameterBooleanValue(final WorkParameterBooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Work Parameter Integer Value</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Work Parameter Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameterIntegerValue(final WorkParameterIntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Work Parameter Map Value</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Work Parameter Map Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameterMapValue(final WorkParameterMapValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Work Parameter Entry Value</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Work Parameter Entry Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseWorkParameterEntryValue(final Map.Entry<String, WorkParameterValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Infos</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Infos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 * @deprecated
	 */
	public T caseExportInfos(final ExportInfos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 * @deprecated
	 */
	public T defaultCase(final EObject object) {
		return null;
	}

} // ModiscoworkflowSwitch
