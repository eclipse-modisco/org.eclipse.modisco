/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *     Gr�goire Dup� (Mia-Software) - Bug 480183 - The manifest.mf discoverer should manage 'Export-Package' 
 */
package org.eclipse.modisco.manifest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.manifest.Version#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Version#isMinimumIsInclusive <em>Minimum Is Inclusive</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Version#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Version#isMaximumIsInclusive <em>Maximum Is Inclusive</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.manifest.ManifestPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(String)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getVersion_Minimum()
	 * @model
	 * @generated
	 */
	String getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Version#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Is Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Is Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Is Inclusive</em>' attribute.
	 * @see #setMinimumIsInclusive(boolean)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getVersion_MinimumIsInclusive()
	 * @model
	 * @generated
	 */
	boolean isMinimumIsInclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Version#isMinimumIsInclusive <em>Minimum Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Is Inclusive</em>' attribute.
	 * @see #isMinimumIsInclusive()
	 * @generated
	 */
	void setMinimumIsInclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(String)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getVersion_Maximum()
	 * @model
	 * @generated
	 */
	String getMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Version#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Is Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Is Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Is Inclusive</em>' attribute.
	 * @see #setMaximumIsInclusive(boolean)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getVersion_MaximumIsInclusive()
	 * @model
	 * @generated
	 */
	boolean isMaximumIsInclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Version#isMaximumIsInclusive <em>Maximum Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Is Inclusive</em>' attribute.
	 * @see #isMaximumIsInclusive()
	 * @generated
	 */
	void setMaximumIsInclusive(boolean value);

} // Version
