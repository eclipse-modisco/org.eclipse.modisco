/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDicoveryDate <em>Dicovery Date</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getAlgorithmVariant <em>Algorithm Variant</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererId <em>Discoverer Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererClassName <em>Discoverer Class Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getSaveTimeInSeconds <em>Save Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getTotalExecutionTimeInSeconds <em>Total Execution Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMetaModelVariant <em>Meta Model Variant</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getNumberOfModelElements <em>Number Of Model Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscoveryError <em>Discovery Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery()
 * @model
 * @generated
 */
public interface Discovery extends EObject {
	/**
	 * Returns the value of the '<em><b>Dicovery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dicovery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dicovery Date</em>' attribute.
	 * @see #setDicoveryDate(Date)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_DicoveryDate()
	 * @model
	 * @generated
	 */
	Date getDicoveryDate();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDicoveryDate <em>Dicovery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dicovery Date</em>' attribute.
	 * @see #getDicoveryDate()
	 * @generated
	 */
	void setDicoveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Algorithm Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Variant</em>' attribute.
	 * @see #setAlgorithmVariant(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_AlgorithmVariant()
	 * @model
	 * @generated
	 */
	String getAlgorithmVariant();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getAlgorithmVariant <em>Algorithm Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Variant</em>' attribute.
	 * @see #getAlgorithmVariant()
	 * @generated
	 */
	void setAlgorithmVariant(String value);

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
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_DiscovererId()
	 * @model
	 * @generated
	 */
	String getDiscovererId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererId <em>Discoverer Id</em>}' attribute.
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
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_DiscovererClassName()
	 * @model
	 * @generated
	 */
	String getDiscovererClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererClassName <em>Discoverer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discoverer Class Name</em>' attribute.
	 * @see #getDiscovererClassName()
	 * @generated
	 */
	void setDiscovererClassName(String value);

	/**
	 * Returns the value of the '<em><b>Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Time In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Time In Seconds</em>' attribute.
	 * @see #setSaveTimeInSeconds(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_SaveTimeInSeconds()
	 * @model
	 * @generated
	 */
	double getSaveTimeInSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getSaveTimeInSeconds <em>Save Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Time In Seconds</em>' attribute.
	 * @see #getSaveTimeInSeconds()
	 * @generated
	 */
	void setSaveTimeInSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Total Execution Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Execution Time In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Execution Time In Seconds</em>' attribute.
	 * @see #setTotalExecutionTimeInSeconds(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_TotalExecutionTimeInSeconds()
	 * @model
	 * @generated
	 */
	double getTotalExecutionTimeInSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getTotalExecutionTimeInSeconds <em>Total Execution Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Execution Time In Seconds</em>' attribute.
	 * @see #getTotalExecutionTimeInSeconds()
	 * @generated
	 */
	void setTotalExecutionTimeInSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Meta Model Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Variant</em>' attribute.
	 * @see #setMetaModelVariant(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_MetaModelVariant()
	 * @model
	 * @generated
	 */
	String getMetaModelVariant();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMetaModelVariant <em>Meta Model Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Variant</em>' attribute.
	 * @see #getMetaModelVariant()
	 * @generated
	 */
	void setMetaModelVariant(String value);

	/**
	 * Returns the value of the '<em><b>Max Used Memory In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Used Memory In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Used Memory In Bytes</em>' attribute.
	 * @see #setMaxUsedMemoryInBytes(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_MaxUsedMemoryInBytes()
	 * @model
	 * @generated
	 */
	long getMaxUsedMemoryInBytes();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Used Memory In Bytes</em>' attribute.
	 * @see #getMaxUsedMemoryInBytes()
	 * @generated
	 */
	void setMaxUsedMemoryInBytes(long value);

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
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_NumberOfModelElements()
	 * @model
	 * @generated
	 */
	long getNumberOfModelElements();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getNumberOfModelElements <em>Number Of Model Elements</em>}' attribute.
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
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_XmiSizeInBytes()
	 * @model
	 * @generated
	 */
	long getXmiSizeInBytes();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmi Size In Bytes</em>' attribute.
	 * @see #getXmiSizeInBytes()
	 * @generated
	 */
	void setXmiSizeInBytes(long value);

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
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Discovery Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Error</em>' attribute.
	 * @see #setDiscoveryError(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getDiscovery_DiscoveryError()
	 * @model
	 * @generated
	 */
	String getDiscoveryError();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscoveryError <em>Discovery Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Error</em>' attribute.
	 * @see #getDiscoveryError()
	 * @generated
	 */
	void setDiscoveryError(String value);

} // Discovery
