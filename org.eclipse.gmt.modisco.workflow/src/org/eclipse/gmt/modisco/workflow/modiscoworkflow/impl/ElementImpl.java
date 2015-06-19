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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Element</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.ElementImpl#getName <em>Name
 * </em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.ElementImpl#getType <em>Type
 * </em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.ElementImpl#getIndex <em>Index
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public abstract class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected String name = ElementImpl.NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected String type = ElementImpl.TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getIndex()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getIndex()
	 * @generated
	 * @deprecated
	 * @ordered
	 */
	@Deprecated
	protected int index = ElementImpl.INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	protected ElementImpl() {
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
		return ModiscoworkflowPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public void setName(final String newName) {
		String oldName = this.name;
		this.name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.ELEMENT__NAME, oldName, this.name));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public String getType() {
		return this.type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public void setType(final String newType) {
		String oldType = this.type;
		this.type = newType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.ELEMENT__TYPE, oldType, this.type));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public int getIndex() {
		return this.index;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public void setIndex(final int newIndex) {
		int oldIndex = this.index;
		this.index = newIndex;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoworkflowPackage.ELEMENT__INDEX, oldIndex, this.index));
		}
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
		case ModiscoworkflowPackage.ELEMENT__NAME:
			return getName();
		case ModiscoworkflowPackage.ELEMENT__TYPE:
			return getType();
		case ModiscoworkflowPackage.ELEMENT__INDEX:
			return getIndex();
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
		case ModiscoworkflowPackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case ModiscoworkflowPackage.ELEMENT__TYPE:
			setType((String) newValue);
			return;
		case ModiscoworkflowPackage.ELEMENT__INDEX:
			setIndex((Integer) newValue);
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
		case ModiscoworkflowPackage.ELEMENT__NAME:
			setName(ElementImpl.NAME_EDEFAULT);
			return;
		case ModiscoworkflowPackage.ELEMENT__TYPE:
			setType(ElementImpl.TYPE_EDEFAULT);
			return;
		case ModiscoworkflowPackage.ELEMENT__INDEX:
			setIndex(ElementImpl.INDEX_EDEFAULT);
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
		case ModiscoworkflowPackage.ELEMENT__NAME:
			return ElementImpl.NAME_EDEFAULT == null ? this.name != null
					: !ElementImpl.NAME_EDEFAULT.equals(this.name);
		case ModiscoworkflowPackage.ELEMENT__TYPE:
			return ElementImpl.TYPE_EDEFAULT == null ? this.type != null
					: !ElementImpl.TYPE_EDEFAULT.equals(this.type);
		case ModiscoworkflowPackage.ELEMENT__INDEX:
			return this.index != ElementImpl.INDEX_EDEFAULT;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(this.name);
		result.append(", type: "); //$NON-NLS-1$
		result.append(this.type);
		result.append(", index: "); //$NON-NLS-1$
		result.append(this.index);
		result.append(')');
		return result.toString();
	}

} // ElementImpl
