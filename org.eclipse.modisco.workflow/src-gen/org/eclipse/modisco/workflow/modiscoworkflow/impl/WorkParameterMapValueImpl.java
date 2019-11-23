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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterMapValue;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Work Parameter Map Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterMapValueImpl#getEntryList
 * <em>Entry List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkParameterMapValueImpl extends EObjectImpl implements WorkParameterMapValue {
	/**
	 * The cached value of the '{@link #getEntryList() <em>Entry List</em>}'
	 * map. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEntryList()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, WorkParameterValue> entryList;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkParameterMapValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoworkflowPackage.Literals.WORK_PARAMETER_MAP_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, WorkParameterValue> getEntryList() {
		if (this.entryList == null) {
			this.entryList = new EcoreEMap<String, WorkParameterValue>(
					ModiscoworkflowPackage.Literals.WORK_PARAMETER_ENTRY_VALUE,
					WorkParameterEntryValueImpl.class, this,
					ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE__ENTRY_LIST);
		}
		return this.entryList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE__ENTRY_LIST:
			return ((InternalEList<?>) getEntryList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE__ENTRY_LIST:
			if (coreType) {
				return getEntryList();
			} else {
				return getEntryList().map();
			}
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
		case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE__ENTRY_LIST:
			((EStructuralFeature.Setting) getEntryList()).set(newValue);
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
		case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE__ENTRY_LIST:
			getEntryList().clear();
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
		case ModiscoworkflowPackage.WORK_PARAMETER_MAP_VALUE__ENTRY_LIST:
			return this.entryList != null && !this.entryList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // WorkParameterMapValueImpl
