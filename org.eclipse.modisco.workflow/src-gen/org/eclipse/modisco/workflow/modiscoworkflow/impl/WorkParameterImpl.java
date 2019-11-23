/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.workflow.modiscoworkflow.Direction;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter;
import org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Work Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl#getDirection
 * <em>Direction</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl#isRequired
 * <em>Required</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkParameterImpl#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkParameterImpl extends EObjectImpl implements WorkParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = WorkParameterImpl.NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = WorkParameterImpl.DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = WorkParameterImpl.TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = WorkParameterImpl.REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = WorkParameterImpl.DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected WorkParameterValue value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoworkflowPackage.Literals.WORK_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(final String newName) {
		String oldName = this.name;
		this.name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER__NAME, oldName, this.name));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Direction getDirection() {
		return this.direction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDirection(final Direction newDirection) {
		Direction oldDirection = this.direction;
		this.direction = newDirection == null ? WorkParameterImpl.DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER__DIRECTION, oldDirection, this.direction));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(final String newType) {
		String oldType = this.type;
		this.type = newType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER__TYPE, oldType, this.type));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isRequired() {
		return this.required;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequired(final boolean newRequired) {
		boolean oldRequired = this.required;
		this.required = newRequired;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER__REQUIRED, oldRequired, this.required));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(final String newDescription) {
		String oldDescription = this.description;
		this.description = newDescription;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER__DESCRIPTION, oldDescription,
					this.description));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WorkParameterValue getValue() {
		return this.value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValue(final WorkParameterValue newValue, NotificationChain msgs) {
		WorkParameterValue oldValue = this.value;
		this.value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER__VALUE, oldValue, newValue);
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
	public void setValue(final WorkParameterValue newValue) {
		if (newValue != this.value) {
			NotificationChain msgs = null;
			if (this.value != null) {
				msgs = ((InternalEObject) this.value).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModiscoworkflowPackage.WORK_PARAMETER__VALUE, null, msgs);
			}
			if (newValue != null) {
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModiscoworkflowPackage.WORK_PARAMETER__VALUE, null, msgs);
			}
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.WORK_PARAMETER__VALUE, newValue, newValue));
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
		case ModiscoworkflowPackage.WORK_PARAMETER__VALUE:
			return basicSetValue(null, msgs);
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
		case ModiscoworkflowPackage.WORK_PARAMETER__NAME:
			return getName();
		case ModiscoworkflowPackage.WORK_PARAMETER__DIRECTION:
			return getDirection();
		case ModiscoworkflowPackage.WORK_PARAMETER__TYPE:
			return getType();
		case ModiscoworkflowPackage.WORK_PARAMETER__REQUIRED:
			return isRequired();
		case ModiscoworkflowPackage.WORK_PARAMETER__DESCRIPTION:
			return getDescription();
		case ModiscoworkflowPackage.WORK_PARAMETER__VALUE:
			return getValue();
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
		case ModiscoworkflowPackage.WORK_PARAMETER__NAME:
			setName((String) newValue);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__DIRECTION:
			setDirection((Direction) newValue);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__TYPE:
			setType((String) newValue);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__REQUIRED:
			setRequired((Boolean) newValue);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__VALUE:
			setValue((WorkParameterValue) newValue);
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
		case ModiscoworkflowPackage.WORK_PARAMETER__NAME:
			setName(WorkParameterImpl.NAME_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__DIRECTION:
			setDirection(WorkParameterImpl.DIRECTION_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__TYPE:
			setType(WorkParameterImpl.TYPE_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__REQUIRED:
			setRequired(WorkParameterImpl.REQUIRED_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__DESCRIPTION:
			setDescription(WorkParameterImpl.DESCRIPTION_EDEFAULT);
			return;
		case ModiscoworkflowPackage.WORK_PARAMETER__VALUE:
			setValue((WorkParameterValue) null);
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
		case ModiscoworkflowPackage.WORK_PARAMETER__NAME:
			return WorkParameterImpl.NAME_EDEFAULT == null ? this.name != null
					: !WorkParameterImpl.NAME_EDEFAULT.equals(this.name);
		case ModiscoworkflowPackage.WORK_PARAMETER__DIRECTION:
			return this.direction != WorkParameterImpl.DIRECTION_EDEFAULT;
		case ModiscoworkflowPackage.WORK_PARAMETER__TYPE:
			return WorkParameterImpl.TYPE_EDEFAULT == null ? this.type != null
					: !WorkParameterImpl.TYPE_EDEFAULT.equals(this.type);
		case ModiscoworkflowPackage.WORK_PARAMETER__REQUIRED:
			return this.required != WorkParameterImpl.REQUIRED_EDEFAULT;
		case ModiscoworkflowPackage.WORK_PARAMETER__DESCRIPTION:
			return WorkParameterImpl.DESCRIPTION_EDEFAULT == null ? this.description != null
					: !WorkParameterImpl.DESCRIPTION_EDEFAULT.equals(this.description);
		case ModiscoworkflowPackage.WORK_PARAMETER__VALUE:
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(this.name);
		result.append(", direction: "); //$NON-NLS-1$
		result.append(this.direction);
		result.append(", type: "); //$NON-NLS-1$
		result.append(this.type);
		result.append(", required: "); //$NON-NLS-1$
		result.append(this.required);
		result.append(", description: "); //$NON-NLS-1$
		result.append(this.description);
		result.append(')');
		return result.toString();
	}

} // WorkParameterImpl
