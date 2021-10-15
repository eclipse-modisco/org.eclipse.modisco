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
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract CDO Discovery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getRevisedLruCapacity <em>Revised Lru Capacity</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getServerDescription <em>Server Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCurrentLruCapacity <em>Current Lru Capacity</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getInitTimeInSeconds <em>Init Time In Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractCDODiscovery()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCDODiscovery extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractCDODiscovery_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Revised Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revised Lru Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Lru Capacity</em>' attribute.
	 * @see #setRevisedLruCapacity(int)
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractCDODiscovery_RevisedLruCapacity()
	 * @model
	 * @generated
	 */
	int getRevisedLruCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getRevisedLruCapacity <em>Revised Lru Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Lru Capacity</em>' attribute.
	 * @see #getRevisedLruCapacity()
	 * @generated
	 */
	void setRevisedLruCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see #setCacheType(String)
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractCDODiscovery_CacheType()
	 * @model
	 * @generated
	 */
	String getCacheType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(String value);

	/**
	 * Returns the value of the '<em><b>Server Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Description</em>' attribute.
	 * @see #setServerDescription(String)
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractCDODiscovery_ServerDescription()
	 * @model
	 * @generated
	 */
	String getServerDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getServerDescription <em>Server Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Description</em>' attribute.
	 * @see #getServerDescription()
	 * @generated
	 */
	void setServerDescription(String value);

	/**
	 * Returns the value of the '<em><b>Current Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Lru Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Lru Capacity</em>' attribute.
	 * @see #setCurrentLruCapacity(int)
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractCDODiscovery_CurrentLruCapacity()
	 * @model
	 * @generated
	 */
	int getCurrentLruCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCurrentLruCapacity <em>Current Lru Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Lru Capacity</em>' attribute.
	 * @see #getCurrentLruCapacity()
	 * @generated
	 */
	void setCurrentLruCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Init Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Time In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Time In Seconds</em>' attribute.
	 * @see #setInitTimeInSeconds(double)
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractCDODiscovery_InitTimeInSeconds()
	 * @model
	 * @generated
	 */
	double getInitTimeInSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getInitTimeInSeconds <em>Init Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Time In Seconds</em>' attribute.
	 * @see #getInitTimeInSeconds()
	 * @generated
	 */
	void setInitTimeInSeconds(double value);

} // AbstractCDODiscovery
