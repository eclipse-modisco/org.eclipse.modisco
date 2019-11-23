/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.AddressingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RespectBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdNonNegativeIntegerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Component Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.PortComponentRefTypeImpl#getServiceEndpointInterface <em>Service Endpoint Interface</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.PortComponentRefTypeImpl#getEnableMtom <em>Enable Mtom</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.PortComponentRefTypeImpl#getMtomThreshold <em>Mtom Threshold</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.PortComponentRefTypeImpl#getAddressing <em>Addressing</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.PortComponentRefTypeImpl#getRespectBinding <em>Respect Binding</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.PortComponentRefTypeImpl#getPortComponentLink <em>Port Component Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.PortComponentRefTypeImpl#getId <em>Id</em>}</li>
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
	 * The cached value of the '{@link #getEnableMtom() <em>Enable Mtom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableMtom()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType enableMtom;

	/**
	 * The cached value of the '{@link #getMtomThreshold() <em>Mtom Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtomThreshold()
	 * @generated
	 * @ordered
	 */
	protected XsdNonNegativeIntegerType mtomThreshold;

	/**
	 * The cached value of the '{@link #getAddressing() <em>Addressing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressing()
	 * @generated
	 * @ordered
	 */
	protected AddressingType addressing;

	/**
	 * The cached value of the '{@link #getRespectBinding() <em>Respect Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespectBinding()
	 * @generated
	 * @ordered
	 */
	protected RespectBindingType respectBinding;

	/**
	 * The cached value of the '{@link #getPortComponentLink() <em>Port Component Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortComponentLink()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String portComponentLink;

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
		return EjbJar31Package.eINSTANCE.getPortComponentRefType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, oldServiceEndpointInterface, newServiceEndpointInterface);
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
				msgs = ((InternalEObject)serviceEndpointInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, null, msgs);
			if (newServiceEndpointInterface != null)
				msgs = ((InternalEObject)newServiceEndpointInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, null, msgs);
			msgs = basicSetServiceEndpointInterface(newServiceEndpointInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE, newServiceEndpointInterface, newServiceEndpointInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getEnableMtom() {
		return enableMtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableMtom(TrueFalseType newEnableMtom, NotificationChain msgs) {
		TrueFalseType oldEnableMtom = enableMtom;
		enableMtom = newEnableMtom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM, oldEnableMtom, newEnableMtom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableMtom(TrueFalseType newEnableMtom) {
		if (newEnableMtom != enableMtom) {
			NotificationChain msgs = null;
			if (enableMtom != null)
				msgs = ((InternalEObject)enableMtom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM, null, msgs);
			if (newEnableMtom != null)
				msgs = ((InternalEObject)newEnableMtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM, null, msgs);
			msgs = basicSetEnableMtom(newEnableMtom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM, newEnableMtom, newEnableMtom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdNonNegativeIntegerType getMtomThreshold() {
		return mtomThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMtomThreshold(XsdNonNegativeIntegerType newMtomThreshold, NotificationChain msgs) {
		XsdNonNegativeIntegerType oldMtomThreshold = mtomThreshold;
		mtomThreshold = newMtomThreshold;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD, oldMtomThreshold, newMtomThreshold);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtomThreshold(XsdNonNegativeIntegerType newMtomThreshold) {
		if (newMtomThreshold != mtomThreshold) {
			NotificationChain msgs = null;
			if (mtomThreshold != null)
				msgs = ((InternalEObject)mtomThreshold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD, null, msgs);
			if (newMtomThreshold != null)
				msgs = ((InternalEObject)newMtomThreshold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD, null, msgs);
			msgs = basicSetMtomThreshold(newMtomThreshold, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD, newMtomThreshold, newMtomThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingType getAddressing() {
		return addressing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressing(AddressingType newAddressing, NotificationChain msgs) {
		AddressingType oldAddressing = addressing;
		addressing = newAddressing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING, oldAddressing, newAddressing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressing(AddressingType newAddressing) {
		if (newAddressing != addressing) {
			NotificationChain msgs = null;
			if (addressing != null)
				msgs = ((InternalEObject)addressing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING, null, msgs);
			if (newAddressing != null)
				msgs = ((InternalEObject)newAddressing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING, null, msgs);
			msgs = basicSetAddressing(newAddressing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING, newAddressing, newAddressing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespectBindingType getRespectBinding() {
		return respectBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespectBinding(RespectBindingType newRespectBinding, NotificationChain msgs) {
		RespectBindingType oldRespectBinding = respectBinding;
		respectBinding = newRespectBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING, oldRespectBinding, newRespectBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespectBinding(RespectBindingType newRespectBinding) {
		if (newRespectBinding != respectBinding) {
			NotificationChain msgs = null;
			if (respectBinding != null)
				msgs = ((InternalEObject)respectBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING, null, msgs);
			if (newRespectBinding != null)
				msgs = ((InternalEObject)newRespectBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING, null, msgs);
			msgs = basicSetRespectBinding(newRespectBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING, newRespectBinding, newRespectBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getPortComponentLink() {
		return portComponentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortComponentLink(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newPortComponentLink, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldPortComponentLink = portComponentLink;
		portComponentLink = newPortComponentLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, oldPortComponentLink, newPortComponentLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortComponentLink(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newPortComponentLink) {
		if (newPortComponentLink != portComponentLink) {
			NotificationChain msgs = null;
			if (portComponentLink != null)
				msgs = ((InternalEObject)portComponentLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, null, msgs);
			if (newPortComponentLink != null)
				msgs = ((InternalEObject)newPortComponentLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, null, msgs);
			msgs = basicSetPortComponentLink(newPortComponentLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK, newPortComponentLink, newPortComponentLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.PORT_COMPONENT_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				return basicSetServiceEndpointInterface(null, msgs);
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM:
				return basicSetEnableMtom(null, msgs);
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD:
				return basicSetMtomThreshold(null, msgs);
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING:
				return basicSetAddressing(null, msgs);
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING:
				return basicSetRespectBinding(null, msgs);
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
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
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				return getServiceEndpointInterface();
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM:
				return getEnableMtom();
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD:
				return getMtomThreshold();
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING:
				return getAddressing();
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING:
				return getRespectBinding();
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				return getPortComponentLink();
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ID:
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
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				setServiceEndpointInterface((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM:
				setEnableMtom((TrueFalseType)newValue);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD:
				setMtomThreshold((XsdNonNegativeIntegerType)newValue);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING:
				setAddressing((AddressingType)newValue);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING:
				setRespectBinding((RespectBindingType)newValue);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				setPortComponentLink((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ID:
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
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				setServiceEndpointInterface((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM:
				setEnableMtom((TrueFalseType)null);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD:
				setMtomThreshold((XsdNonNegativeIntegerType)null);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING:
				setAddressing((AddressingType)null);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING:
				setRespectBinding((RespectBindingType)null);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				setPortComponentLink((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ID:
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
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE:
				return serviceEndpointInterface != null;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ENABLE_MTOM:
				return enableMtom != null;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD:
				return mtomThreshold != null;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ADDRESSING:
				return addressing != null;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__RESPECT_BINDING:
				return respectBinding != null;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK:
				return portComponentLink != null;
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE__ID:
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
