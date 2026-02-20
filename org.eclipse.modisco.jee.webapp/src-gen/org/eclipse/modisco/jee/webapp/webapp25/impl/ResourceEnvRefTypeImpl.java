/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp25.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp25.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp25.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;
import org.eclipse.modisco.jee.webapp.webapp25.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Env Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ResourceEnvRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ResourceEnvRefTypeImpl#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ResourceEnvRefTypeImpl#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ResourceEnvRefTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ResourceEnvRefTypeImpl#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ResourceEnvRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceEnvRefTypeImpl extends EObjectImpl implements ResourceEnvRefType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getResourceEnvRefName() <em>Resource Env Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRefName()
	 * @generated
	 * @ordered
	 */
	protected JndiNameType resourceEnvRefName;

	/**
	 * The cached value of the '{@link #getResourceEnvRefType() <em>Resource Env Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRefType()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType resourceEnvRefType;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType mappedName;

	/**
	 * The cached value of the '{@link #getInjectionTarget() <em>Injection Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<InjectionTargetType> injectionTarget;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEnvRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.RESOURCE_ENV_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp25Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType getResourceEnvRefName() {
		return resourceEnvRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefName(JndiNameType newResourceEnvRefName, NotificationChain msgs) {
		JndiNameType oldResourceEnvRefName = resourceEnvRefName;
		resourceEnvRefName = newResourceEnvRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, oldResourceEnvRefName, newResourceEnvRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefName(JndiNameType newResourceEnvRefName) {
		if (newResourceEnvRefName != resourceEnvRefName) {
			NotificationChain msgs = null;
			if (resourceEnvRefName != null)
				msgs = ((InternalEObject)resourceEnvRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, null, msgs);
			if (newResourceEnvRefName != null)
				msgs = ((InternalEObject)newResourceEnvRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, null, msgs);
			msgs = basicSetResourceEnvRefName(newResourceEnvRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, newResourceEnvRefName, newResourceEnvRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getResourceEnvRefType() {
		return resourceEnvRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefType(FullyQualifiedClassType newResourceEnvRefType, NotificationChain msgs) {
		FullyQualifiedClassType oldResourceEnvRefType = resourceEnvRefType;
		resourceEnvRefType = newResourceEnvRefType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, oldResourceEnvRefType, newResourceEnvRefType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefType(FullyQualifiedClassType newResourceEnvRefType) {
		if (newResourceEnvRefType != resourceEnvRefType) {
			NotificationChain msgs = null;
			if (resourceEnvRefType != null)
				msgs = ((InternalEObject)resourceEnvRefType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, null, msgs);
			if (newResourceEnvRefType != null)
				msgs = ((InternalEObject)newResourceEnvRefType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, null, msgs);
			msgs = basicSetResourceEnvRefType(newResourceEnvRefType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, newResourceEnvRefType, newResourceEnvRefType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedName(XsdStringType newMappedName, NotificationChain msgs) {
		XsdStringType oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(XsdStringType newMappedName) {
		if (newMappedName != mappedName) {
			NotificationChain msgs = null;
			if (mappedName != null)
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjectionTargetType> getInjectionTarget() {
		if (injectionTarget == null) {
			injectionTarget = new EObjectContainmentEList<InjectionTargetType>(InjectionTargetType.class, this, Webapp25Package.RESOURCE_ENV_REF_TYPE__INJECTION_TARGET);
		}
		return injectionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.RESOURCE_ENV_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				return basicSetResourceEnvRefName(null, msgs);
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				return basicSetResourceEnvRefType(null, msgs);
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__INJECTION_TARGET:
				return ((InternalEList<?>)getInjectionTarget()).basicRemove(otherEnd, msgs);
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
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				return getResourceEnvRefName();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				return getResourceEnvRefType();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME:
				return getMappedName();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__INJECTION_TARGET:
				return getInjectionTarget();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__ID:
				return getId();
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
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((JndiNameType)newValue);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((FullyQualifiedClassType)newValue);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				getInjectionTarget().addAll((Collection<? extends InjectionTargetType>)newValue);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__ID:
				setId((String)newValue);
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
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((JndiNameType)null);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((FullyQualifiedClassType)null);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				return;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				return resourceEnvRefName != null;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				return resourceEnvRefType != null;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__MAPPED_NAME:
				return mappedName != null;
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__INJECTION_TARGET:
				return injectionTarget != null && !injectionTarget.isEmpty();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ResourceEnvRefTypeImpl
