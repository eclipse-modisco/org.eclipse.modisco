/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Work Parameter Entry Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterEntryValueImpl#getTypedKey
 * <em>Key</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterEntryValueImpl#getTypedValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkParameterEntryValueImpl extends EObjectImpl implements
		BasicEMap.Entry<String, WorkParameterValue> {
	/**
	 * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected String key = WorkParameterEntryValueImpl.KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected WorkParameterValue value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkParameterEntryValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoworkflowPackage.Literals.WORK_PARAMETER_ENTRY_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTypedKey() {
		return this.key;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypedKey(final String newKey) {
		String oldKey = this.key;
		this.key = newKey;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__KEY, oldKey, this.key));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkParameterValue getTypedValue() {
		return this.value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTypedValue(final WorkParameterValue newValue,
			NotificationChain msgs) {
		WorkParameterValue oldValue = this.value;
		this.value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE, oldValue, newValue);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypedValue(final WorkParameterValue newValue) {
		if (newValue != this.value) {
			NotificationChain msgs = null;
			if (this.value != null) {
				msgs = ((InternalEObject) this.value).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE, null,
						msgs);
			}
			if (newValue != null) {
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE, null,
						msgs);
			}
			msgs = basicSetTypedValue(newValue, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE, newValue, newValue));
		}
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
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE:
			return basicSetTypedValue(null, msgs);
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
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__KEY:
			return getTypedKey();
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE:
			return getTypedValue();
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
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__KEY:
			setTypedKey((String) newValue);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE:
			setTypedValue((WorkParameterValue) newValue);
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
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__KEY:
			setTypedKey(WorkParameterEntryValueImpl.KEY_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE:
			setTypedValue((WorkParameterValue) null);
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
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__KEY:
			return WorkParameterEntryValueImpl.KEY_EDEFAULT == null ? this.key != null
					: !WorkParameterEntryValueImpl.KEY_EDEFAULT.equals(this.key);
		case ModiscoworkflowPackage.WORK_PARAMETER_ENTRY_VALUE__VALUE:
			return this.value != null;
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
		result.append(" (key: "); //$NON-NLS-1$
		result.append(this.key);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getHash() {
		if (this.hash == -1) {
			Object theKey = getKey();
			this.hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return this.hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHash(final int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKey(final String key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkParameterValue getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkParameterValue setValue(final WorkParameterValue value) {
		WorkParameterValue oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, WorkParameterValue> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<String, WorkParameterValue>) container
				.eGet(eContainmentFeature());
	}

} // WorkParameterEntryValueImpl
