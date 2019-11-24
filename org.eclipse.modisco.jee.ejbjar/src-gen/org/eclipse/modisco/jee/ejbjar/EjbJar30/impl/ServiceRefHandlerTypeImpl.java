/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Ref Handler Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getHandlerName <em>Handler Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getHandlerClass <em>Handler Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getSoapHeader <em>Soap Header</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getSoapRole <em>Soap Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceRefHandlerTypeImpl extends EObjectImpl implements ServiceRefHandlerType {
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
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayNameType> displayName;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<IconType> icon;

	/**
	 * The cached value of the '{@link #getHandlerName() <em>Handler Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar30.String handlerName;

	/**
	 * The cached value of the '{@link #getHandlerClass() <em>Handler Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerClass()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType handlerClass;

	/**
	 * The cached value of the '{@link #getInitParam() <em>Init Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamValueType> initParam;

	/**
	 * The cached value of the '{@link #getSoapHeader() <em>Soap Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<XsdQNameType> soapHeader;

	/**
	 * The cached value of the '{@link #getSoapRole() <em>Soap Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapRole()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.modisco.jee.ejbjar.EjbJar30.String> soapRole;

	/**
	 * The cached value of the '{@link #getPortName() <em>Port Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.modisco.jee.ejbjar.EjbJar30.String> portName;

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
	protected ServiceRefHandlerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar30Package.eINSTANCE.getServiceRefHandlerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IconType> getIcon() {
		if (icon == null) {
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar30.String getHandlerName() {
		return handlerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlerName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String newHandlerName, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar30.String oldHandlerName = handlerName;
		handlerName = newHandlerName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME, oldHandlerName, newHandlerName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String newHandlerName) {
		if (newHandlerName != handlerName) {
			NotificationChain msgs = null;
			if (handlerName != null)
				msgs = ((InternalEObject)handlerName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME, null, msgs);
			if (newHandlerName != null)
				msgs = ((InternalEObject)newHandlerName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME, null, msgs);
			msgs = basicSetHandlerName(newHandlerName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME, newHandlerName, newHandlerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getHandlerClass() {
		return handlerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlerClass(FullyQualifiedClassType newHandlerClass, NotificationChain msgs) {
		FullyQualifiedClassType oldHandlerClass = handlerClass;
		handlerClass = newHandlerClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS, oldHandlerClass, newHandlerClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerClass(FullyQualifiedClassType newHandlerClass) {
		if (newHandlerClass != handlerClass) {
			NotificationChain msgs = null;
			if (handlerClass != null)
				msgs = ((InternalEObject)handlerClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS, null, msgs);
			if (newHandlerClass != null)
				msgs = ((InternalEObject)newHandlerClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS, null, msgs);
			msgs = basicSetHandlerClass(newHandlerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS, newHandlerClass, newHandlerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamValueType> getInitParam() {
		if (initParam == null) {
			initParam = new EObjectContainmentEList<ParamValueType>(ParamValueType.class, this, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__INIT_PARAM);
		}
		return initParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsdQNameType> getSoapHeader() {
		if (soapHeader == null) {
			soapHeader = new EObjectContainmentEList<XsdQNameType>(XsdQNameType.class, this, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_HEADER);
		}
		return soapHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.modisco.jee.ejbjar.EjbJar30.String> getSoapRole() {
		if (soapRole == null) {
			soapRole = new EObjectContainmentEList<org.eclipse.modisco.jee.ejbjar.EjbJar30.String>(org.eclipse.modisco.jee.ejbjar.EjbJar30.String.class, this, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_ROLE);
		}
		return soapRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.modisco.jee.ejbjar.EjbJar30.String> getPortName() {
		if (portName == null) {
			portName = new EObjectContainmentEList<org.eclipse.modisco.jee.ejbjar.EjbJar30.String>(org.eclipse.modisco.jee.ejbjar.EjbJar30.String.class, this, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__PORT_NAME);
		}
		return portName;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME:
				return basicSetHandlerName(null, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS:
				return basicSetHandlerClass(null, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__INIT_PARAM:
				return ((InternalEList<?>)getInitParam()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_HEADER:
				return ((InternalEList<?>)getSoapHeader()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_ROLE:
				return ((InternalEList<?>)getSoapRole()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__PORT_NAME:
				return ((InternalEList<?>)getPortName()).basicRemove(otherEnd, msgs);
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
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ICON:
				return getIcon();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME:
				return getHandlerName();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS:
				return getHandlerClass();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__INIT_PARAM:
				return getInitParam();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_HEADER:
				return getSoapHeader();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_ROLE:
				return getSoapRole();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__PORT_NAME:
				return getPortName();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ID:
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
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME:
				setHandlerName((org.eclipse.modisco.jee.ejbjar.EjbJar30.String)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS:
				setHandlerClass((FullyQualifiedClassType)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__INIT_PARAM:
				getInitParam().clear();
				getInitParam().addAll((Collection<? extends ParamValueType>)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_HEADER:
				getSoapHeader().clear();
				getSoapHeader().addAll((Collection<? extends XsdQNameType>)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_ROLE:
				getSoapRole().clear();
				getSoapRole().addAll((Collection<? extends org.eclipse.modisco.jee.ejbjar.EjbJar30.String>)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__PORT_NAME:
				getPortName().clear();
				getPortName().addAll((Collection<? extends org.eclipse.modisco.jee.ejbjar.EjbJar30.String>)newValue);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ID:
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
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ICON:
				getIcon().clear();
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME:
				setHandlerName((org.eclipse.modisco.jee.ejbjar.EjbJar30.String)null);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS:
				setHandlerClass((FullyQualifiedClassType)null);
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__INIT_PARAM:
				getInitParam().clear();
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_HEADER:
				getSoapHeader().clear();
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_ROLE:
				getSoapRole().clear();
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__PORT_NAME:
				getPortName().clear();
				return;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ID:
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
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_NAME:
				return handlerName != null;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS:
				return handlerClass != null;
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__INIT_PARAM:
				return initParam != null && !initParam.isEmpty();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_HEADER:
				return soapHeader != null && !soapHeader.isEmpty();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__SOAP_ROLE:
				return soapRole != null && !soapRole.isEmpty();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__PORT_NAME:
				return portName != null && !portName.isEmpty();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE__ID:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ServiceRefHandlerTypeImpl
