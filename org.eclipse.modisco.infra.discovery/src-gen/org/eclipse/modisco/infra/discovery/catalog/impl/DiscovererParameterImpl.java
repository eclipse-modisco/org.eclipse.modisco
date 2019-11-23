/**
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.catalog.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.modisco.infra.discovery.catalog.CatalogPackage;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discoverer Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getDiscoverer <em>Discoverer</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#isRequiredInput <em>Required Input</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscovererParameterImpl extends EObjectImpl implements DiscovererParameter {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind DIRECTION_EDEFAULT = DirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiredInput() <em>Required Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiredInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiredInput() <em>Required Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiredInput()
	 * @generated
	 * @ordered
	 */
	protected boolean requiredInput = REQUIRED_INPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> type;

	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final Field FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected Field field = FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected static final Method GETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected Method getter = GETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected static final Method SETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected Method setter = SETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitializer() <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final Method INITIALIZER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Method initializer = INITIALIZER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscovererParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.DISCOVERER_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscovererDescription getDiscoverer() {
		if (eContainerFeatureID() != CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER) return null;
		return (DiscovererDescription)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoverer(DiscovererDescription newDiscoverer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiscoverer, CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverer(DiscovererDescription newDiscoverer) {
		if (newDiscoverer != eInternalContainer() || (eContainerFeatureID() != CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER && newDiscoverer != null)) {
			if (EcoreUtil.isAncestor(this, newDiscoverer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiscoverer != null)
				msgs = ((InternalEObject)newDiscoverer).eInverseAdd(this, CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS, DiscovererDescription.class, msgs);
			msgs = basicSetDiscoverer(newDiscoverer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER, newDiscoverer, newDiscoverer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionKind newDirection) {
		DirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiredInput() {
		return requiredInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredInput(boolean newRequiredInput) {
		boolean oldRequiredInput = requiredInput;
		requiredInput = newRequiredInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__REQUIRED_INPUT, oldRequiredInput, requiredInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class<?> newType) {
		Class<?> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(Field newField) {
		Field oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getGetter() {
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetter(Method newGetter) {
		Method oldGetter = getter;
		getter = newGetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__GETTER, oldGetter, getter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getSetter() {
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetter(Method newSetter) {
		Method oldSetter = setter;
		setter = newSetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__SETTER, oldSetter, setter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Method newInitializer) {
		Method oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_PARAMETER__INITIALIZER, oldInitializer, initializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiscoverer((DiscovererDescription)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER:
				return basicSetDiscoverer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER:
				return eInternalContainer().eInverseRemove(this, CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS, DiscovererDescription.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER:
				return getDiscoverer();
			case CatalogPackage.DISCOVERER_PARAMETER__ID:
				return getId();
			case CatalogPackage.DISCOVERER_PARAMETER__DIRECTION:
				return getDirection();
			case CatalogPackage.DISCOVERER_PARAMETER__DESCRIPTION:
				return getDescription();
			case CatalogPackage.DISCOVERER_PARAMETER__REQUIRED_INPUT:
				return isRequiredInput();
			case CatalogPackage.DISCOVERER_PARAMETER__TYPE:
				return getType();
			case CatalogPackage.DISCOVERER_PARAMETER__FIELD:
				return getField();
			case CatalogPackage.DISCOVERER_PARAMETER__GETTER:
				return getGetter();
			case CatalogPackage.DISCOVERER_PARAMETER__SETTER:
				return getSetter();
			case CatalogPackage.DISCOVERER_PARAMETER__INITIALIZER:
				return getInitializer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER:
				setDiscoverer((DiscovererDescription)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__ID:
				setId((String)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__DIRECTION:
				setDirection((DirectionKind)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__REQUIRED_INPUT:
				setRequiredInput((Boolean)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__TYPE:
				setType((Class<?>)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__FIELD:
				setField((Field)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__GETTER:
				setGetter((Method)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__SETTER:
				setSetter((Method)newValue);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__INITIALIZER:
				setInitializer((Method)newValue);
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
			case CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER:
				setDiscoverer((DiscovererDescription)null);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__ID:
				setId(ID_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__REQUIRED_INPUT:
				setRequiredInput(REQUIRED_INPUT_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__TYPE:
				setType((Class<?>)null);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__FIELD:
				setField(FIELD_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__GETTER:
				setGetter(GETTER_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__SETTER:
				setSetter(SETTER_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_PARAMETER__INITIALIZER:
				setInitializer(INITIALIZER_EDEFAULT);
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
			case CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER:
				return getDiscoverer() != null;
			case CatalogPackage.DISCOVERER_PARAMETER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CatalogPackage.DISCOVERER_PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case CatalogPackage.DISCOVERER_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CatalogPackage.DISCOVERER_PARAMETER__REQUIRED_INPUT:
				return requiredInput != REQUIRED_INPUT_EDEFAULT;
			case CatalogPackage.DISCOVERER_PARAMETER__TYPE:
				return type != null;
			case CatalogPackage.DISCOVERER_PARAMETER__FIELD:
				return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
			case CatalogPackage.DISCOVERER_PARAMETER__GETTER:
				return GETTER_EDEFAULT == null ? getter != null : !GETTER_EDEFAULT.equals(getter);
			case CatalogPackage.DISCOVERER_PARAMETER__SETTER:
				return SETTER_EDEFAULT == null ? setter != null : !SETTER_EDEFAULT.equals(setter);
			case CatalogPackage.DISCOVERER_PARAMETER__INITIALIZER:
				return INITIALIZER_EDEFAULT == null ? initializer != null : !INITIALIZER_EDEFAULT.equals(initializer);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", direction: ");
		result.append(direction);
		result.append(", description: ");
		result.append(description);
		result.append(", requiredInput: ");
		result.append(requiredInput);
		result.append(", type: ");
		result.append(type);
		result.append(", field: ");
		result.append(field);
		result.append(", getter: ");
		result.append(getter);
		result.append(", setter: ");
		result.append(setter);
		result.append(", initializer: ");
		result.append(initializer);
		result.append(')');
		return result.toString();
	}

} //DiscovererParameterImpl
