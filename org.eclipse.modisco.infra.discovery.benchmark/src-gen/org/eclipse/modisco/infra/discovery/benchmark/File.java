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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.File#getSizeInBytes <em>Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.File#getLines <em>Lines</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.File#getFilepath <em>Filepath</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject {
	/**
	 * Returns the value of the '<em><b>Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bytes</em>' attribute.
	 * @see #setSizeInBytes(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getFile_SizeInBytes()
	 * @model
	 * @generated
	 */
	long getSizeInBytes();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.File#getSizeInBytes <em>Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bytes</em>' attribute.
	 * @see #getSizeInBytes()
	 * @generated
	 */
	void setSizeInBytes(long value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute.
	 * @see #setLines(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getFile_Lines()
	 * @model
	 * @generated
	 */
	long getLines();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.File#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines</em>' attribute.
	 * @see #getLines()
	 * @generated
	 */
	void setLines(long value);

	/**
	 * Returns the value of the '<em><b>Filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filepath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filepath</em>' attribute.
	 * @see #setFilepath(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getFile_Filepath()
	 * @model
	 * @generated
	 */
	String getFilepath();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.File#getFilepath <em>Filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filepath</em>' attribute.
	 * @see #getFilepath()
	 * @generated
	 */
	void setFilepath(String value);

} // File
