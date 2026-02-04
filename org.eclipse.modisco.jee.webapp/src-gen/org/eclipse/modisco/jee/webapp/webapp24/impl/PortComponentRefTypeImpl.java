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
package org.eclipse.modisco.jee.webapp.webapp24.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Component Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.PortComponentRefTypeImpl#getServiceEndpointInterface <em>Service Endpoint Interface</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.PortComponentRefTypeImpl#getPortComponentLink <em>Port Component Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.PortComponentRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortComponentRefTypeImpl extends EObjectImpl implements PortComponentRefType {
	/**
	 * The cached value of the '{@link #getServiceEndpointInterface() <em>Service Endpoint Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEndpointInterface()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType serviceEndpointInterface;

	/**
	 * The cached value of the '{@link #getPortComponentLink() <em>Port Component Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortComponentLink()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp24.String portComponentLink;

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
	protected PortComponentRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.PORT_COMPONENT_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getServiceEndpointInterface() {
		return serviceEndpointInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceEndpointInterface(FullyQualifiedClassType newServiceEndpointInterface, NotificationChain msgs) {
		FullyQualifiedClassType oldServiceEndpointInterface = serviceEndpointInterface;
		serviceEndpointInterface = newServiceEndpointInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, oldServiceEndpointInterface, newServiceEndpointInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceEndpointInterface(FullyQualifiedClassType newServiceEndpointInterface) {
		if (newServiceEndpointInterface != serviceEndpointInterface) {
			NotificationChain msgs = null;
			if (serviceEndpointInterface != null)
				msgs = ((InternalEObject)serviceEndpointInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, null, msgs);
			if (newServiceEndpointInterface != null)
				msgs = ((InternalEObject)newServiceEndpointInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, null, msgs);
			msgs = basicSetServiceEndpointInterface(newServiceEndpointInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, newServiceEndpointInterface, newServiceEndpointInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp24.String getPortComponentLink() {
		return portComponentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortComponentLink(org.eclipse.modisco.jee.webapp.webapp24.String newPortComponentLink, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp24.String oldPortComponentLink = portComponentLink;
		portComponentLink = newPortComponentLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, oldPortComponentLink, newPortComponentLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortComponentLink(org.eclipse.modisco.jee.webapp.webapp24.String newPortComponentLink) {
		if (newPortComponentLink != portComponentLink) {
			NotificationChain msgs = null;
			if (portComponentLink != null)
				msgs = ((InternalEObject)portComponentLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, null, msgs);
			if (newPortComponentLink != null)
				msgs = ((InternalEObject)newPortComponentLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, null, msgs);
			msgs = basicSetPortComponentLink(newPortComponentLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, newPortComponentLink, newPortComponentLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.PORT_COMPONENT_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				return basicSetServiceEndpointInterface(null, msgs);
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				return basicSetPortComponentLink(null, msgs);
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
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				return getServiceEndpointInterface();
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				return getPortComponentLink();
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__ID:
				return getId();
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
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				setServiceEndpointInterface((FullyQualifiedClassType)newValue);
				return;
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				setPortComponentLink((org.eclipse.modisco.jee.webapp.webapp24.String)newValue);
				return;
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__ID:
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
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				setServiceEndpointInterface((FullyQualifiedClassType)null);
				return;
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				setPortComponentLink((org.eclipse.modisco.jee.webapp.webapp24.String)null);
				return;
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__ID:
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
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				return serviceEndpointInterface != null;
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				return portComponentLink != null;
			case Webapp24Package.PORT_COMPONENT_REF_TYPE__ID:
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

} //PortComponentRefTypeImpl
