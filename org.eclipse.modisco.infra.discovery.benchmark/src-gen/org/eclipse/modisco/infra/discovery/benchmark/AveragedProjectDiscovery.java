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
 *     Nicolas Bros (Mia-Software)
 * 
 */
package org.eclipse.modisco.infra.discovery.benchmark;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Averaged Project Discovery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getAverageExecutionTimeInSeconds <em>Average Execution Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getAverageSaveTimeInSeconds <em>Average Save Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getExecutionTimeStandardDeviation <em>Execution Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getSaveTimeStandardDeviation <em>Save Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedProjectDiscovery()
 * @model
 * @generated
 */
public interface AveragedProjectDiscovery extends EObject {
	/**
	 * Returns the value of the '<em><b>Average Execution Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Execution Time In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Execution Time In Seconds</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedProjectDiscovery_AverageExecutionTimeInSeconds()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getAverageExecutionTimeInSeconds();

	/**
	 * Returns the value of the '<em><b>Average Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Save Time In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Save Time In Seconds</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedProjectDiscovery_AverageSaveTimeInSeconds()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getAverageSaveTimeInSeconds();

	/**
	 * Returns the value of the '<em><b>Execution Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time Standard Deviation</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedProjectDiscovery_ExecutionTimeStandardDeviation()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getExecutionTimeStandardDeviation();

	/**
	 * Returns the value of the '<em><b>Save Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Time Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Time Standard Deviation</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedProjectDiscovery_SaveTimeStandardDeviation()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getSaveTimeStandardDeviation();

	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedProjectDiscovery_Occurrences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectDiscovery> getOccurrences();

} // AveragedProjectDiscovery
