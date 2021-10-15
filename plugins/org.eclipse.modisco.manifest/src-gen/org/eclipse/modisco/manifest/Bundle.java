/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *     Grégoire Dupé (Mia-Software) - Bug 480183 - The manifest.mf discoverer should manage 'Export-Package' 
 */
package org.eclipse.modisco.manifest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getActivator <em>Activator</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getActivationPolicy <em>Activation Policy</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.Bundle#getExportPackages <em>Export Packages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends EObject {
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
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #setSingleton(boolean)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_Singleton()
	 * @model
	 * @generated
	 */
	boolean isSingleton();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#isSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton</em>' attribute.
	 * @see #isSingleton()
	 * @generated
	 */
	void setSingleton(boolean value);

	/**
	 * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Name</em>' attribute.
	 * @see #setSymbolicName(String)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_SymbolicName()
	 * @model
	 * @generated
	 */
	String getSymbolicName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#getSymbolicName <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolic Name</em>' attribute.
	 * @see #getSymbolicName()
	 * @generated
	 */
	void setSymbolicName(String value);

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
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Activator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activator</em>' attribute.
	 * @see #setActivator(String)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_Activator()
	 * @model
	 * @generated
	 */
	String getActivator();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#getActivator <em>Activator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activator</em>' attribute.
	 * @see #getActivator()
	 * @generated
	 */
	void setActivator(String value);

	/**
	 * Returns the value of the '<em><b>Activation Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Policy</em>' attribute.
	 * @see #setActivationPolicy(String)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_ActivationPolicy()
	 * @model
	 * @generated
	 */
	String getActivationPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#getActivationPolicy <em>Activation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Policy</em>' attribute.
	 * @see #getActivationPolicy()
	 * @generated
	 */
	void setActivationPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Required Execution Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Execution Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Execution Environment</em>' attribute.
	 * @see #setRequiredExecutionEnvironment(String)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_RequiredExecutionEnvironment()
	 * @model
	 * @generated
	 */
	String getRequiredExecutionEnvironment();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Execution Environment</em>' attribute.
	 * @see #getRequiredExecutionEnvironment()
	 * @generated
	 */
	void setRequiredExecutionEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.Bundle#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Required Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.manifest.RequiredBundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Bundles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Bundles</em>' containment reference list.
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_RequiredBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredBundle> getRequiredBundles();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.manifest.ImportedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' containment reference list.
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_ImportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedPackage> getImportedPackages();

	/**
	 * Returns the value of the '<em><b>Export Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.manifest.ExportedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Packages</em>' reference list.
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getBundle_ExportPackages()
	 * @model
	 * @generated
	 */
	EList<ExportedPackage> getExportPackages();

} // Bundle
