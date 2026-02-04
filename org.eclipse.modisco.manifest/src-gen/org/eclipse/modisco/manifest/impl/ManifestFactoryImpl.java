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
package org.eclipse.modisco.manifest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.manifest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManifestFactoryImpl extends EFactoryImpl implements ManifestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManifestFactory init() {
		try {
			ManifestFactory theManifestFactory = (ManifestFactory)EPackage.Registry.INSTANCE.getEFactory(ManifestPackage.eNS_URI);
			if (theManifestFactory != null) {
				return theManifestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ManifestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ManifestPackage.BUNDLE: return createBundle();
			case ManifestPackage.REQUIRED_BUNDLE: return createRequiredBundle();
			case ManifestPackage.IMPORTED_PACKAGE: return createImportedPackage();
			case ManifestPackage.VERSION: return createVersion();
			case ManifestPackage.EXPORTED_PACKAGE: return createExportedPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBundle createRequiredBundle() {
		RequiredBundleImpl requiredBundle = new RequiredBundleImpl();
		return requiredBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedPackage createImportedPackage() {
		ImportedPackageImpl importedPackage = new ImportedPackageImpl();
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportedPackage createExportedPackage() {
		ExportedPackageImpl exportedPackage = new ExportedPackageImpl();
		return exportedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestPackage getManifestPackage() {
		return (ManifestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ManifestPackage getPackage() {
		return ManifestPackage.eINSTANCE;
	}

} //ManifestFactoryImpl
