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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringListValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Work Parameter String List Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterStringListValueImpl#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkParameterStringListValueImpl extends EObjectImpl implements
		WorkParameterStringListValue {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkParameterStringListValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoworkflowPackage.Literals.WORK_PARAMETER_STRING_LIST_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getValue() {
		if (this.value == null) {
			this.value = new EDataTypeEList<String>(String.class, this,
					ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE__VALUE);
		}
		return this.value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE__VALUE:
			return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE__VALUE:
			getValue().clear();
			getValue().addAll((Collection<? extends String>) newValue);
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
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE__VALUE:
			getValue().clear();
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
		case ModiscoworkflowPackage.WORK_PARAMETER_STRING_LIST_VALUE__VALUE:
			return this.value != null && !this.value.isEmpty();
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
		result.append(" (value: "); //$NON-NLS-1$
		result.append(this.value);
		result.append(')');
		return result.toString();
	}

} // WorkParameterStringListValueImpl
