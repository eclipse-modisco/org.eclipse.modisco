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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Work;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Workflow</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.WorkflowImpl#getPackageBase <em>
 * Package Base</em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.WorkflowImpl#getSymbolicName
 * <em>Symbolic Name</em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.WorkflowImpl#getElements <em>
 * Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public class WorkflowImpl extends ElementImpl implements Workflow {
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
	protected String packageBase = WorkflowImpl.PACKAGE_BASE_EDEFAULT;

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
	protected String symbolicName = WorkflowImpl.SYMBOLIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElements()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected EList<Element> elements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	protected WorkflowImpl() {
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
		return ModiscoworkflowPackage.Literals.WORKFLOW;
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
					ModiscoworkflowPackage.WORKFLOW__PACKAGE_BASE, oldPackageBase, this.packageBase));
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
					ModiscoworkflowPackage.WORKFLOW__SYMBOLIC_NAME, oldSymbolicName,
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
	public EList<Element> getElements() {
		if (this.elements == null) {
			this.elements = new EObjectContainmentEList<Element>(Element.class, this,
					ModiscoworkflowPackage.WORKFLOW__ELEMENTS);
		}
		return this.elements;
	}

	/**
	 * <!-- begin-user-doc --> Allows to retrieve all unit of work without double <!-- end-user-doc
	 * -->
	 * 
	 */
	public EList<Element> getAllUnitsOfWork() {
		EList<Element> listWork = new BasicEList<Element>();
		getAllUnitsOfWork(this, listWork);
		return listWork;
	}

	private void getAllUnitsOfWork(final Workflow workflow, final EList<Element> list) {
		for (Element elmt : workflow.getElements()) {
			if (elmt instanceof Work) {
				if (findElement(list, elmt) == false) {
					list.add(elmt);
				}
			} else {
				getAllUnitsOfWork((Workflow) elmt, list);
			}
		}
	}

	private boolean findElement(final EList<Element> list, final Element elmt) {
		boolean result = false;
		for (Element element : list) {
			if (element.getName().equals(elmt.getName())) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case ModiscoworkflowPackage.WORKFLOW__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case ModiscoworkflowPackage.WORKFLOW__PACKAGE_BASE:
			return getPackageBase();
		case ModiscoworkflowPackage.WORKFLOW__SYMBOLIC_NAME:
			return getSymbolicName();
		case ModiscoworkflowPackage.WORKFLOW__ELEMENTS:
			return getElements();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ModiscoworkflowPackage.WORKFLOW__PACKAGE_BASE:
			setPackageBase((String) newValue);
			return;
		case ModiscoworkflowPackage.WORKFLOW__SYMBOLIC_NAME:
			setSymbolicName((String) newValue);
			return;
		case ModiscoworkflowPackage.WORKFLOW__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Element>) newValue);
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
		case ModiscoworkflowPackage.WORKFLOW__PACKAGE_BASE:
			setPackageBase(WorkflowImpl.PACKAGE_BASE_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORKFLOW__SYMBOLIC_NAME:
			setSymbolicName(WorkflowImpl.SYMBOLIC_NAME_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORKFLOW__ELEMENTS:
			getElements().clear();
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
		case ModiscoworkflowPackage.WORKFLOW__PACKAGE_BASE:
			return WorkflowImpl.PACKAGE_BASE_EDEFAULT == null ? this.packageBase != null
					: !WorkflowImpl.PACKAGE_BASE_EDEFAULT.equals(this.packageBase);
		case ModiscoworkflowPackage.WORKFLOW__SYMBOLIC_NAME:
			return WorkflowImpl.SYMBOLIC_NAME_EDEFAULT == null ? this.symbolicName != null
					: !WorkflowImpl.SYMBOLIC_NAME_EDEFAULT.equals(this.symbolicName);
		case ModiscoworkflowPackage.WORKFLOW__ELEMENTS:
			return this.elements != null && !this.elements.isEmpty();
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
	public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
		if (baseClass == ExportInfos.class) {
			switch (derivedFeatureID) {
			case ModiscoworkflowPackage.WORKFLOW__PACKAGE_BASE:
				return ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE;
			case ModiscoworkflowPackage.WORKFLOW__SYMBOLIC_NAME:
				return ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
		if (baseClass == ExportInfos.class) {
			switch (baseFeatureID) {
			case ModiscoworkflowPackage.EXPORT_INFOS__PACKAGE_BASE:
				return ModiscoworkflowPackage.WORKFLOW__PACKAGE_BASE;
			case ModiscoworkflowPackage.EXPORT_INFOS__SYMBOLIC_NAME:
				return ModiscoworkflowPackage.WORKFLOW__SYMBOLIC_NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} // WorkflowImpl
