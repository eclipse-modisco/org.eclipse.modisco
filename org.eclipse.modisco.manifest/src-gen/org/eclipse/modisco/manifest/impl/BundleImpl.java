/**
 * Copyright (c) 2010, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *     Grégoire Dupé (Mia-Software) - Bug 480183 - The manifest.mf discoverer should manage 'Export-Package' 
 */
package org.eclipse.modisco.manifest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.manifest.ExportedPackage;
import org.eclipse.modisco.manifest.ImportedPackage;
import org.eclipse.modisco.manifest.ManifestPackage;
import org.eclipse.modisco.manifest.RequiredBundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getActivator <em>Activator</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getActivationPolicy <em>Activation Policy</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.BundleImpl#getExportPackages <em>Export Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleImpl extends EObjectImpl implements Bundle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean singleton = SINGLETON_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected String symbolicName = SYMBOLIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivator() <em>Activator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivator()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivator() <em>Activator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivator()
	 * @generated
	 * @ordered
	 */
	protected String activator = ACTIVATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationPolicy() <em>Activation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationPolicy() <em>Activation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationPolicy()
	 * @generated
	 * @ordered
	 */
	protected String activationPolicy = ACTIVATION_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredExecutionEnvironment() <em>Required Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredExecutionEnvironment() <em>Required Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String requiredExecutionEnvironment = REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredBundles() <em>Required Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredBundle> requiredBundles;

	/**
	 * The cached value of the '{@link #getImportedPackages() <em>Imported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedPackage> importedPackages;

	/**
	 * The cached value of the '{@link #getExportPackages() <em>Export Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportedPackage> exportPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleton() {
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleton(boolean newSingleton) {
		boolean oldSingleton = singleton;
		singleton = newSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__SINGLETON, oldSingleton, singleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolicName() {
		return symbolicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicName(String newSymbolicName) {
		String oldSymbolicName = symbolicName;
		symbolicName = newSymbolicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__SYMBOLIC_NAME, oldSymbolicName, symbolicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivator() {
		return activator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivator(String newActivator) {
		String oldActivator = activator;
		activator = newActivator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__ACTIVATOR, oldActivator, activator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivationPolicy() {
		return activationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationPolicy(String newActivationPolicy) {
		String oldActivationPolicy = activationPolicy;
		activationPolicy = newActivationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__ACTIVATION_POLICY, oldActivationPolicy, activationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredExecutionEnvironment() {
		return requiredExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredExecutionEnvironment(String newRequiredExecutionEnvironment) {
		String oldRequiredExecutionEnvironment = requiredExecutionEnvironment;
		requiredExecutionEnvironment = newRequiredExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__REQUIRED_EXECUTION_ENVIRONMENT, oldRequiredExecutionEnvironment, requiredExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredBundle> getRequiredBundles() {
		if (requiredBundles == null) {
			requiredBundles = new EObjectContainmentEList<RequiredBundle>(RequiredBundle.class, this, ManifestPackage.BUNDLE__REQUIRED_BUNDLES);
		}
		return requiredBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedPackage> getImportedPackages() {
		if (importedPackages == null) {
			importedPackages = new EObjectContainmentEList<ImportedPackage>(ImportedPackage.class, this, ManifestPackage.BUNDLE__IMPORTED_PACKAGES);
		}
		return importedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExportedPackage> getExportPackages() {
		if (exportPackages == null) {
			exportPackages = new EObjectResolvingEList<ExportedPackage>(ExportedPackage.class, this, ManifestPackage.BUNDLE__EXPORT_PACKAGES);
		}
		return exportPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.BUNDLE__REQUIRED_BUNDLES:
				return ((InternalEList<?>)getRequiredBundles()).basicRemove(otherEnd, msgs);
			case ManifestPackage.BUNDLE__IMPORTED_PACKAGES:
				return ((InternalEList<?>)getImportedPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.BUNDLE__NAME:
				return getName();
			case ManifestPackage.BUNDLE__SINGLETON:
				return isSingleton();
			case ManifestPackage.BUNDLE__SYMBOLIC_NAME:
				return getSymbolicName();
			case ManifestPackage.BUNDLE__VERSION:
				return getVersion();
			case ManifestPackage.BUNDLE__ACTIVATOR:
				return getActivator();
			case ManifestPackage.BUNDLE__ACTIVATION_POLICY:
				return getActivationPolicy();
			case ManifestPackage.BUNDLE__REQUIRED_EXECUTION_ENVIRONMENT:
				return getRequiredExecutionEnvironment();
			case ManifestPackage.BUNDLE__VENDOR:
				return getVendor();
			case ManifestPackage.BUNDLE__REQUIRED_BUNDLES:
				return getRequiredBundles();
			case ManifestPackage.BUNDLE__IMPORTED_PACKAGES:
				return getImportedPackages();
			case ManifestPackage.BUNDLE__EXPORT_PACKAGES:
				return getExportPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManifestPackage.BUNDLE__NAME:
				setName((String)newValue);
				return;
			case ManifestPackage.BUNDLE__SINGLETON:
				setSingleton((Boolean)newValue);
				return;
			case ManifestPackage.BUNDLE__SYMBOLIC_NAME:
				setSymbolicName((String)newValue);
				return;
			case ManifestPackage.BUNDLE__VERSION:
				setVersion((String)newValue);
				return;
			case ManifestPackage.BUNDLE__ACTIVATOR:
				setActivator((String)newValue);
				return;
			case ManifestPackage.BUNDLE__ACTIVATION_POLICY:
				setActivationPolicy((String)newValue);
				return;
			case ManifestPackage.BUNDLE__REQUIRED_EXECUTION_ENVIRONMENT:
				setRequiredExecutionEnvironment((String)newValue);
				return;
			case ManifestPackage.BUNDLE__VENDOR:
				setVendor((String)newValue);
				return;
			case ManifestPackage.BUNDLE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				getRequiredBundles().addAll((Collection<? extends RequiredBundle>)newValue);
				return;
			case ManifestPackage.BUNDLE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				getImportedPackages().addAll((Collection<? extends ImportedPackage>)newValue);
				return;
			case ManifestPackage.BUNDLE__EXPORT_PACKAGES:
				getExportPackages().clear();
				getExportPackages().addAll((Collection<? extends ExportedPackage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManifestPackage.BUNDLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__SYMBOLIC_NAME:
				setSymbolicName(SYMBOLIC_NAME_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__ACTIVATOR:
				setActivator(ACTIVATOR_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__ACTIVATION_POLICY:
				setActivationPolicy(ACTIVATION_POLICY_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__REQUIRED_EXECUTION_ENVIRONMENT:
				setRequiredExecutionEnvironment(REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				return;
			case ManifestPackage.BUNDLE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				return;
			case ManifestPackage.BUNDLE__EXPORT_PACKAGES:
				getExportPackages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManifestPackage.BUNDLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManifestPackage.BUNDLE__SINGLETON:
				return singleton != SINGLETON_EDEFAULT;
			case ManifestPackage.BUNDLE__SYMBOLIC_NAME:
				return SYMBOLIC_NAME_EDEFAULT == null ? symbolicName != null : !SYMBOLIC_NAME_EDEFAULT.equals(symbolicName);
			case ManifestPackage.BUNDLE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ManifestPackage.BUNDLE__ACTIVATOR:
				return ACTIVATOR_EDEFAULT == null ? activator != null : !ACTIVATOR_EDEFAULT.equals(activator);
			case ManifestPackage.BUNDLE__ACTIVATION_POLICY:
				return ACTIVATION_POLICY_EDEFAULT == null ? activationPolicy != null : !ACTIVATION_POLICY_EDEFAULT.equals(activationPolicy);
			case ManifestPackage.BUNDLE__REQUIRED_EXECUTION_ENVIRONMENT:
				return REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT == null ? requiredExecutionEnvironment != null : !REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT.equals(requiredExecutionEnvironment);
			case ManifestPackage.BUNDLE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case ManifestPackage.BUNDLE__REQUIRED_BUNDLES:
				return requiredBundles != null && !requiredBundles.isEmpty();
			case ManifestPackage.BUNDLE__IMPORTED_PACKAGES:
				return importedPackages != null && !importedPackages.isEmpty();
			case ManifestPackage.BUNDLE__EXPORT_PACKAGES:
				return exportPackages != null && !exportPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", singleton: ");
		result.append(singleton);
		result.append(", symbolicName: ");
		result.append(symbolicName);
		result.append(", version: ");
		result.append(version);
		result.append(", activator: ");
		result.append(activator);
		result.append(", activationPolicy: ");
		result.append(activationPolicy);
		result.append(", requiredExecutionEnvironment: ");
		result.append(requiredExecutionEnvironment);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(')');
		return result.toString();
	}

} //BundleImpl
