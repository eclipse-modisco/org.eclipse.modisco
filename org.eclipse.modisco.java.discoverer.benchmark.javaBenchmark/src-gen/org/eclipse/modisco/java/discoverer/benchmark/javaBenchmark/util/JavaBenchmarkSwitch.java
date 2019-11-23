/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - Bug 341752 - Extract report metamodel from the benchmark plug-in to avoid Acceleo troubles.
 *     Nicolas Bros (Mia-Software) - extracted Java benchmark
 */
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.Project;
import org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery;

import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.*;

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
 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage
 * @generated
 */
public class JavaBenchmarkSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaBenchmarkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBenchmarkSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaBenchmarkPackage.eINSTANCE;
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
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY: {
				AbstractCDODiscovery abstractCDODiscovery = (AbstractCDODiscovery)theEObject;
				T result = caseAbstractCDODiscovery(abstractCDODiscovery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBenchmarkPackage.ABSTRACT_JAVA_PROJECT: {
				AbstractJavaProject abstractJavaProject = (AbstractJavaProject)theEObject;
				T result = caseAbstractJavaProject(abstractJavaProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBenchmarkPackage.JAVA_PROJECT: {
				JavaProject javaProject = (JavaProject)theEObject;
				T result = caseJavaProject(javaProject);
				if (result == null) result = caseAbstractJavaProject(javaProject);
				if (result == null) result = caseProject(javaProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBenchmarkPackage.JAVA_DISCOVERED_PROJECT: {
				JavaDiscoveredProject javaDiscoveredProject = (JavaDiscoveredProject)theEObject;
				T result = caseJavaDiscoveredProject(javaDiscoveredProject);
				if (result == null) result = caseAbstractJavaProject(javaDiscoveredProject);
				if (result == null) result = caseDiscoveredProject(javaDiscoveredProject);
				if (result == null) result = caseProject(javaDiscoveredProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBenchmarkPackage.CDO_DISCOVERY: {
				CDODiscovery cdoDiscovery = (CDODiscovery)theEObject;
				T result = caseCDODiscovery(cdoDiscovery);
				if (result == null) result = caseAbstractCDODiscovery(cdoDiscovery);
				if (result == null) result = caseDiscovery(cdoDiscovery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBenchmarkPackage.CDO_PROJECT_DISCOVERY: {
				CDOProjectDiscovery cdoProjectDiscovery = (CDOProjectDiscovery)theEObject;
				T result = caseCDOProjectDiscovery(cdoProjectDiscovery);
				if (result == null) result = caseAbstractCDODiscovery(cdoProjectDiscovery);
				if (result == null) result = caseProjectDiscovery(cdoProjectDiscovery);
				if (result == null) result = caseDiscovery(cdoProjectDiscovery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract CDO Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract CDO Discovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCDODiscovery(AbstractCDODiscovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Java Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Java Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractJavaProject(AbstractJavaProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaProject(JavaProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Discovered Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Discovered Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaDiscoveredProject(JavaDiscoveredProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDO Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDO Discovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDODiscovery(CDODiscovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDO Project Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDO Project Discovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDOProjectDiscovery(CDOProjectDiscovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discovered Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discovered Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscoveredProject(DiscoveredProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscovery(Discovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Discovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectDiscovery(ProjectDiscovery object) {
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

} //JavaBenchmarkSwitch
