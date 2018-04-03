/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getTotalLines <em>Total Lines</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getAverageFileSizeInBytes <em>Average File Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getAverageLinesPerFile <em>Average Lines Per File</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getTotalSizeInBytes <em>Total Size In Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Lines</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getProject_TotalLines()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getTotalLines();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getProject_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Average File Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average File Size In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average File Size In Bytes</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getProject_AverageFileSizeInBytes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getAverageFileSizeInBytes();

	/**
	 * Returns the value of the '<em><b>Average Lines Per File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Lines Per File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Lines Per File</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getProject_AverageLinesPerFile()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getAverageLinesPerFile();

	/**
	 * Returns the value of the '<em><b>Total Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Size In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Size In Bytes</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getProject_TotalSizeInBytes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getTotalSizeInBytes();

} // Project
