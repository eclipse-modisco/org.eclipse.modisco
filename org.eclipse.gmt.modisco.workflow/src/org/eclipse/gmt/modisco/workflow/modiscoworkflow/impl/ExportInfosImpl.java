/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Export Infos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl#getPackageBase
 * <em>Package Base</em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.ExportInfosImpl#getSymbolicName
 * <em>Symbolic Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public class ExportInfosImpl extends EObjectImpl implements ExportInfos {
	/**
	 * The default value of the '{@link #getPackageBase() <em>Package Base</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPackageBase()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected static final String PACKAGE_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageBase() <em>Package Base</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPackageBase()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected String packageBase = ExportInfosImpl.PACKAGE_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSymbolicName()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected static final String SYMBOLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSymbolicName()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected String symbolicName = ExportInfosImpl.SYMBOLIC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	protected ExportInfosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	protected EClass eStaticClass() {
		return ModiscoworkflowPackage.Literals.EXPORT_INFOS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public String getPackageBase() {
		return this.packageBase;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
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
	 * @deprecated
	 */
	@Deprecated
	public String getSymbolicName() {
		return this.symbolicName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
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
	 * @deprecated
	 */
	@Deprecated
	public EList<Element> getAllUnitsOfWork() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
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
	 * @deprecated
	 */
	@Deprecated
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
	 * @deprecated
	 */
	@Deprecated
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
	 * @deprecated
	 */
	@Deprecated
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
	 * @deprecated
	 */
	@Deprecated
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
