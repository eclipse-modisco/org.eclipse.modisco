/**
 * Copyright (c) 2012, 2015 INRIA and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *      Guillaume Doux (INRIA) - Initial API and implementation
 *      Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 *      Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 */
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;

import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererId <em>Discoverer Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererClassName <em>Discoverer Class Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscoveryTimeAverageInSeconds <em>Discovery Time Average In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeAverageInSeconds <em>Save Time Average In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getExecutionTimeStandardDeviation <em>Execution Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeStandardDeviation <em>Save Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getNumberOfModelElements <em>Number Of Model Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getProject <em>Project</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getIterations <em>Iterations</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererLaunchConfiguration <em>Discoverer Launch Configuration</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getCopyOfDiscovererDescription <em>Copy Of Discoverer Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery()
 * @model
 * @generated
 */
public interface Discovery extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v2.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v20.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Discoverer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoverer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoverer Id</em>' attribute.
	 * @see #setDiscovererId(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_DiscovererId()
	 * @model
	 * @generated
	 */
	String getDiscovererId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererId <em>Discoverer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discoverer Id</em>' attribute.
	 * @see #getDiscovererId()
	 * @generated
	 */
	void setDiscovererId(String value);

	/**
	 * Returns the value of the '<em><b>Discoverer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoverer Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoverer Class Name</em>' attribute.
	 * @see #setDiscovererClassName(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_DiscovererClassName()
	 * @model
	 * @generated
	 */
	String getDiscovererClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererClassName <em>Discoverer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discoverer Class Name</em>' attribute.
	 * @see #getDiscovererClassName()
	 * @generated
	 */
	void setDiscovererClassName(String value);

	/**
	 * Returns the value of the '<em><b>Discovery Time Average In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Time Average In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Time Average In Seconds</em>' attribute.
	 * @see #setDiscoveryTimeAverageInSeconds(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_DiscoveryTimeAverageInSeconds()
	 * @model
	 * @generated
	 */
	double getDiscoveryTimeAverageInSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscoveryTimeAverageInSeconds <em>Discovery Time Average In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Time Average In Seconds</em>' attribute.
	 * @see #getDiscoveryTimeAverageInSeconds()
	 * @generated
	 */
	void setDiscoveryTimeAverageInSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Save Time Average In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Time Average In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Time Average In Seconds</em>' attribute.
	 * @see #setSaveTimeAverageInSeconds(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_SaveTimeAverageInSeconds()
	 * @model
	 * @generated
	 */
	double getSaveTimeAverageInSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeAverageInSeconds <em>Save Time Average In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Time Average In Seconds</em>' attribute.
	 * @see #getSaveTimeAverageInSeconds()
	 * @generated
	 */
	void setSaveTimeAverageInSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Execution Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time Standard Deviation</em>' attribute.
	 * @see #setExecutionTimeStandardDeviation(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_ExecutionTimeStandardDeviation()
	 * @model
	 * @generated
	 */
	double getExecutionTimeStandardDeviation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getExecutionTimeStandardDeviation <em>Execution Time Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time Standard Deviation</em>' attribute.
	 * @see #getExecutionTimeStandardDeviation()
	 * @generated
	 */
	void setExecutionTimeStandardDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Save Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Time Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Time Standard Deviation</em>' attribute.
	 * @see #setSaveTimeStandardDeviation(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_SaveTimeStandardDeviation()
	 * @model
	 * @generated
	 */
	double getSaveTimeStandardDeviation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeStandardDeviation <em>Save Time Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Time Standard Deviation</em>' attribute.
	 * @see #getSaveTimeStandardDeviation()
	 * @generated
	 */
	void setSaveTimeStandardDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Model Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Model Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Model Elements</em>' attribute.
	 * @see #setNumberOfModelElements(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_NumberOfModelElements()
	 * @model
	 * @generated
	 */
	long getNumberOfModelElements();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getNumberOfModelElements <em>Number Of Model Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Model Elements</em>' attribute.
	 * @see #getNumberOfModelElements()
	 * @generated
	 */
	void setNumberOfModelElements(long value);

	/**
	 * Returns the value of the '<em><b>Xmi Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmi Size In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmi Size In Bytes</em>' attribute.
	 * @see #setXmiSizeInBytes(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_XmiSizeInBytes()
	 * @model
	 * @generated
	 */
	long getXmiSizeInBytes();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmi Size In Bytes</em>' attribute.
	 * @see #getXmiSizeInBytes()
	 * @generated
	 */
	void setXmiSizeInBytes(long value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Resource)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_Project()
	 * @model required="true"
	 * @generated
	 */
	Resource getProject();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Resource value);

	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_Iterations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiscoveryIteration> getIterations();

	/**
	 * Returns the value of the '<em><b>Discoverer Launch Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoverer Launch Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoverer Launch Configuration</em>' containment reference.
	 * @see #setDiscovererLaunchConfiguration(LaunchConfiguration)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_DiscovererLaunchConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	LaunchConfiguration getDiscovererLaunchConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererLaunchConfiguration <em>Discoverer Launch Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discoverer Launch Configuration</em>' containment reference.
	 * @see #getDiscovererLaunchConfiguration()
	 * @generated
	 */
	void setDiscovererLaunchConfiguration(LaunchConfiguration value);

	/**
	 * Returns the value of the '<em><b>Copy Of Discoverer Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Of Discoverer Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Of Discoverer Description</em>' containment reference.
	 * @see #setCopyOfDiscovererDescription(DiscovererDescription)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscovery_CopyOfDiscovererDescription()
	 * @model containment="true"
	 * @generated
	 */
	DiscovererDescription getCopyOfDiscovererDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getCopyOfDiscovererDescription <em>Copy Of Discoverer Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Of Discoverer Description</em>' containment reference.
	 * @see #getCopyOfDiscovererDescription()
	 * @generated
	 */
	void setCopyOfDiscovererDescription(DiscovererDescription value);

} // Discovery
