/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.modiscoworkflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.modisco.workflow.modiscoworkflow.ExportInfos;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Export Infos</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl#getPackageBase
 * <em>Package Base</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl#getSymbolicName
 * <em>Symbolic Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExportInfosImpl extends EObjectImpl implements ExportInfos {
	/**
	 * The default value of the '{@link #getPackageBase() <em>Package Base</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPackageBase()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageBase() <em>Package Base</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPackageBase()
	 * @generated
	 * @ordered
	 */
	protected String packageBase = ExportInfosImpl.PACKAGE_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolicName()
	 * <em>Symbolic Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicName()
	 * <em>Symbolic Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected String symbolicName = ExportInfosImpl.SYMBOLIC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExportInfosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoworkflowPackage.Literals.EXPORT_INFOS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPackageBase() {
		return this.packageBase;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPackageBase(final String newPackageBase) {
		String oldPackageBase = this.packageBase;
		this.packageBase = newPackageBase;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE, oldPackageBase,
					this.packageBase));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSymbolicName() {
		return this.symbolicName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSymbolicName(final String newSymbolicName) {
		String oldSymbolicName = this.symbolicName;
		this.symbolicName = newSymbolicName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME, oldSymbolicName,
					this.symbolicName));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Element> getAllUnitsOfWork() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE:
			return getPackageBase();
		case ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME:
			return getSymbolicName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE:
			setPackageBase((String) newValue);
			return;
		case ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME:
			setSymbolicName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE:
			setPackageBase(ExportInfosImpl.PACKAGE_BASE_EDEFAULT);
			return;
		case ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME:
			setSymbolicName(ExportInfosImpl.SYMBOLIC_NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE:
			return ExportInfosImpl.PACKAGE_BASE_EDEFAULT == null ? this.packageBase != null
					: !ExportInfosImpl.PACKAGE_BASE_EDEFAULT.equals(this.packageBase);
		case ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME:
			return ExportInfosImpl.SYMBOLIC_NAME_EDEFAULT == null ? this.symbolicName != null
					: !ExportInfosImpl.SYMBOLIC_NAME_EDEFAULT.equals(this.symbolicName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageBase: "); //$NON-NLS-1$
		result.append(this.packageBase);
		result.append(", symbolicName: "); //$NON-NLS-1$
		result.append(this.symbolicName);
		result.append(')');
		return result.toString();
	}

} // ExportInfosImpl
