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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.manifest.ManifestFactory
 * @model kind="package"
 * @generated
 */
public interface ManifestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "manifest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/manifest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "manifest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManifestPackage eINSTANCE = org.eclipse.modisco.manifest.impl.ManifestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.manifest.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.manifest.impl.BundleImpl
	 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__SINGLETON = 1;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__SYMBOLIC_NAME = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Activator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ACTIVATOR = 4;

	/**
	 * The feature id for the '<em><b>Activation Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ACTIVATION_POLICY = 5;

	/**
	 * The feature id for the '<em><b>Required Execution Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__REQUIRED_EXECUTION_ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VENDOR = 7;

	/**
	 * The feature id for the '<em><b>Required Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__REQUIRED_BUNDLES = 8;

	/**
	 * The feature id for the '<em><b>Imported Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__IMPORTED_PACKAGES = 9;

	/**
	 * The feature id for the '<em><b>Export Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__EXPORT_PACKAGES = 10;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.manifest.impl.RequiredBundleImpl <em>Required Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.manifest.impl.RequiredBundleImpl
	 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getRequiredBundle()
	 * @generated
	 */
	int REQUIRED_BUNDLE = 1;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE__SYMBOLIC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Required Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.manifest.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.manifest.impl.ImportedPackageImpl
	 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getImportedPackage()
	 * @generated
	 */
	int IMPORTED_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Imported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.manifest.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.manifest.impl.VersionImpl
	 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 3;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MINIMUM = 0;

	/**
	 * The feature id for the '<em><b>Minimum Is Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MINIMUM_IS_INCLUSIVE = 1;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MAXIMUM = 2;

	/**
	 * The feature id for the '<em><b>Maximum Is Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MAXIMUM_IS_INCLUSIVE = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.manifest.impl.ExportedPackageImpl <em>Exported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.manifest.impl.ExportedPackageImpl
	 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getExportedPackage()
	 * @generated
	 */
	int EXPORTED_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>XFriends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE__XFRIENDS = 1;

	/**
	 * The feature id for the '<em><b>XInternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE__XINTERNAL = 2;

	/**
	 * The number of structural features of the '<em>Exported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.manifest.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getName()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#isSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#isSingleton()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Singleton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#getSymbolicName <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getSymbolicName()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_SymbolicName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getVersion()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#getActivator <em>Activator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activator</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getActivator()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Activator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#getActivationPolicy <em>Activation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Policy</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getActivationPolicy()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_ActivationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Execution Environment</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getRequiredExecutionEnvironment()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_RequiredExecutionEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Bundle#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getVendor()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Vendor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.manifest.Bundle#getRequiredBundles <em>Required Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Bundles</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getRequiredBundles()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_RequiredBundles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.manifest.Bundle#getImportedPackages <em>Imported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Packages</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getImportedPackages()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ImportedPackages();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.manifest.Bundle#getExportPackages <em>Export Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Export Packages</em>'.
	 * @see org.eclipse.modisco.manifest.Bundle#getExportPackages()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ExportPackages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.manifest.RequiredBundle <em>Required Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Bundle</em>'.
	 * @see org.eclipse.modisco.manifest.RequiredBundle
	 * @generated
	 */
	EClass getRequiredBundle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.RequiredBundle#getSymbolicName <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see org.eclipse.modisco.manifest.RequiredBundle#getSymbolicName()
	 * @see #getRequiredBundle()
	 * @generated
	 */
	EAttribute getRequiredBundle_SymbolicName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.manifest.RequiredBundle#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.eclipse.modisco.manifest.RequiredBundle#getVersion()
	 * @see #getRequiredBundle()
	 * @generated
	 */
	EReference getRequiredBundle_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.manifest.ImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Package</em>'.
	 * @see org.eclipse.modisco.manifest.ImportedPackage
	 * @generated
	 */
	EClass getImportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.ImportedPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.manifest.ImportedPackage#getName()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.manifest.ImportedPackage#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.eclipse.modisco.manifest.ImportedPackage#getVersion()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EReference getImportedPackage_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.manifest.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.eclipse.modisco.manifest.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Version#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.eclipse.modisco.manifest.Version#getMinimum()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Version#isMinimumIsInclusive <em>Minimum Is Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Is Inclusive</em>'.
	 * @see org.eclipse.modisco.manifest.Version#isMinimumIsInclusive()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_MinimumIsInclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Version#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.eclipse.modisco.manifest.Version#getMaximum()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.Version#isMaximumIsInclusive <em>Maximum Is Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Is Inclusive</em>'.
	 * @see org.eclipse.modisco.manifest.Version#isMaximumIsInclusive()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_MaximumIsInclusive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.manifest.ExportedPackage <em>Exported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exported Package</em>'.
	 * @see org.eclipse.modisco.manifest.ExportedPackage
	 * @generated
	 */
	EClass getExportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.ExportedPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.manifest.ExportedPackage#getName()
	 * @see #getExportedPackage()
	 * @generated
	 */
	EAttribute getExportedPackage_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.manifest.ExportedPackage#getXFriends <em>XFriends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>XFriends</em>'.
	 * @see org.eclipse.modisco.manifest.ExportedPackage#getXFriends()
	 * @see #getExportedPackage()
	 * @generated
	 */
	EReference getExportedPackage_XFriends();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.manifest.ExportedPackage#isXInternal <em>XInternal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XInternal</em>'.
	 * @see org.eclipse.modisco.manifest.ExportedPackage#isXInternal()
	 * @see #getExportedPackage()
	 * @generated
	 */
	EAttribute getExportedPackage_XInternal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManifestFactory getManifestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.manifest.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.manifest.impl.BundleImpl
		 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__NAME = eINSTANCE.getBundle_Name();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__SINGLETON = eINSTANCE.getBundle_Singleton();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__SYMBOLIC_NAME = eINSTANCE.getBundle_SymbolicName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__VERSION = eINSTANCE.getBundle_Version();

		/**
		 * The meta object literal for the '<em><b>Activator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__ACTIVATOR = eINSTANCE.getBundle_Activator();

		/**
		 * The meta object literal for the '<em><b>Activation Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__ACTIVATION_POLICY = eINSTANCE.getBundle_ActivationPolicy();

		/**
		 * The meta object literal for the '<em><b>Required Execution Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__REQUIRED_EXECUTION_ENVIRONMENT = eINSTANCE.getBundle_RequiredExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__VENDOR = eINSTANCE.getBundle_Vendor();

		/**
		 * The meta object literal for the '<em><b>Required Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__REQUIRED_BUNDLES = eINSTANCE.getBundle_RequiredBundles();

		/**
		 * The meta object literal for the '<em><b>Imported Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__IMPORTED_PACKAGES = eINSTANCE.getBundle_ImportedPackages();

		/**
		 * The meta object literal for the '<em><b>Export Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__EXPORT_PACKAGES = eINSTANCE.getBundle_ExportPackages();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.manifest.impl.RequiredBundleImpl <em>Required Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.manifest.impl.RequiredBundleImpl
		 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getRequiredBundle()
		 * @generated
		 */
		EClass REQUIRED_BUNDLE = eINSTANCE.getRequiredBundle();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BUNDLE__SYMBOLIC_NAME = eINSTANCE.getRequiredBundle_SymbolicName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_BUNDLE__VERSION = eINSTANCE.getRequiredBundle_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.manifest.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.manifest.impl.ImportedPackageImpl
		 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getImportedPackage()
		 * @generated
		 */
		EClass IMPORTED_PACKAGE = eINSTANCE.getImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__NAME = eINSTANCE.getImportedPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_PACKAGE__VERSION = eINSTANCE.getImportedPackage_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.manifest.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.manifest.impl.VersionImpl
		 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MINIMUM = eINSTANCE.getVersion_Minimum();

		/**
		 * The meta object literal for the '<em><b>Minimum Is Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MINIMUM_IS_INCLUSIVE = eINSTANCE.getVersion_MinimumIsInclusive();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MAXIMUM = eINSTANCE.getVersion_Maximum();

		/**
		 * The meta object literal for the '<em><b>Maximum Is Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MAXIMUM_IS_INCLUSIVE = eINSTANCE.getVersion_MaximumIsInclusive();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.manifest.impl.ExportedPackageImpl <em>Exported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.manifest.impl.ExportedPackageImpl
		 * @see org.eclipse.modisco.manifest.impl.ManifestPackageImpl#getExportedPackage()
		 * @generated
		 */
		EClass EXPORTED_PACKAGE = eINSTANCE.getExportedPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTED_PACKAGE__NAME = eINSTANCE.getExportedPackage_Name();

		/**
		 * The meta object literal for the '<em><b>XFriends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORTED_PACKAGE__XFRIENDS = eINSTANCE.getExportedPackage_XFriends();

		/**
		 * The meta object literal for the '<em><b>XInternal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTED_PACKAGE__XINTERNAL = eINSTANCE.getExportedPackage_XInternal();

	}

} //ManifestPackage
