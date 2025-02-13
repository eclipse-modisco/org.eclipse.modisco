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

import org.eclipse.modisco.jee.webapp.webapp24.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp24.IconType;
import org.eclipse.modisco.jee.webapp.webapp24.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp24.PathType;
import org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType;
import org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;
import org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getServiceRefName <em>Service Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getWsdlFile <em>Wsdl File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getServiceQname <em>Service Qname</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getPortComponentRef <em>Port Component Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceRefTypeImpl extends EObjectImpl implements ServiceRefType {
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
	 * The cached value of the '{@link #getServiceRefName() <em>Service Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRefName()
	 * @generated
	 * @ordered
	 */
	protected JndiNameType serviceRefName;

	/**
	 * The cached value of the '{@link #getServiceInterface() <em>Service Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType serviceInterface;

	/**
	 * The cached value of the '{@link #getWsdlFile() <em>Wsdl File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlFile()
	 * @generated
	 * @ordered
	 */
	protected XsdAnyURIType wsdlFile;

	/**
	 * The cached value of the '{@link #getJaxrpcMappingFile() <em>Jaxrpc Mapping File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJaxrpcMappingFile()
	 * @generated
	 * @ordered
	 */
	protected PathType jaxrpcMappingFile;

	/**
	 * The cached value of the '{@link #getServiceQname() <em>Service Qname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceQname()
	 * @generated
	 * @ordered
	 */
	protected XsdQNameType serviceQname;

	/**
	 * The cached value of the '{@link #getPortComponentRef() <em>Port Component Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortComponentRef()
	 * @generated
	 * @ordered
	 */
	protected EList<PortComponentRefType> portComponentRef;

	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRefHandlerType> handler;

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
	protected ServiceRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.SERVICE_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp24Package.SERVICE_REF_TYPE__DESCRIPTION);
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
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, Webapp24Package.SERVICE_REF_TYPE__DISPLAY_NAME);
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
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, Webapp24Package.SERVICE_REF_TYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType getServiceRefName() {
		return serviceRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceRefName(JndiNameType newServiceRefName, NotificationChain msgs) {
		JndiNameType oldServiceRefName = serviceRefName;
		serviceRefName = newServiceRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME, oldServiceRefName, newServiceRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRefName(JndiNameType newServiceRefName) {
		if (newServiceRefName != serviceRefName) {
			NotificationChain msgs = null;
			if (serviceRefName != null)
				msgs = ((InternalEObject)serviceRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME, null, msgs);
			if (newServiceRefName != null)
				msgs = ((InternalEObject)newServiceRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME, null, msgs);
			msgs = basicSetServiceRefName(newServiceRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME, newServiceRefName, newServiceRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getServiceInterface() {
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInterface(FullyQualifiedClassType newServiceInterface, NotificationChain msgs) {
		FullyQualifiedClassType oldServiceInterface = serviceInterface;
		serviceInterface = newServiceInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE, oldServiceInterface, newServiceInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInterface(FullyQualifiedClassType newServiceInterface) {
		if (newServiceInterface != serviceInterface) {
			NotificationChain msgs = null;
			if (serviceInterface != null)
				msgs = ((InternalEObject)serviceInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE, null, msgs);
			if (newServiceInterface != null)
				msgs = ((InternalEObject)newServiceInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE, null, msgs);
			msgs = basicSetServiceInterface(newServiceInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE, newServiceInterface, newServiceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdAnyURIType getWsdlFile() {
		return wsdlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlFile(XsdAnyURIType newWsdlFile, NotificationChain msgs) {
		XsdAnyURIType oldWsdlFile = wsdlFile;
		wsdlFile = newWsdlFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE, oldWsdlFile, newWsdlFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlFile(XsdAnyURIType newWsdlFile) {
		if (newWsdlFile != wsdlFile) {
			NotificationChain msgs = null;
			if (wsdlFile != null)
				msgs = ((InternalEObject)wsdlFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE, null, msgs);
			if (newWsdlFile != null)
				msgs = ((InternalEObject)newWsdlFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE, null, msgs);
			msgs = basicSetWsdlFile(newWsdlFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE, newWsdlFile, newWsdlFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType getJaxrpcMappingFile() {
		return jaxrpcMappingFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJaxrpcMappingFile(PathType newJaxrpcMappingFile, NotificationChain msgs) {
		PathType oldJaxrpcMappingFile = jaxrpcMappingFile;
		jaxrpcMappingFile = newJaxrpcMappingFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE, oldJaxrpcMappingFile, newJaxrpcMappingFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJaxrpcMappingFile(PathType newJaxrpcMappingFile) {
		if (newJaxrpcMappingFile != jaxrpcMappingFile) {
			NotificationChain msgs = null;
			if (jaxrpcMappingFile != null)
				msgs = ((InternalEObject)jaxrpcMappingFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE, null, msgs);
			if (newJaxrpcMappingFile != null)
				msgs = ((InternalEObject)newJaxrpcMappingFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE, null, msgs);
			msgs = basicSetJaxrpcMappingFile(newJaxrpcMappingFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE, newJaxrpcMappingFile, newJaxrpcMappingFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdQNameType getServiceQname() {
		return serviceQname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceQname(XsdQNameType newServiceQname, NotificationChain msgs) {
		XsdQNameType oldServiceQname = serviceQname;
		serviceQname = newServiceQname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME, oldServiceQname, newServiceQname);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceQname(XsdQNameType newServiceQname) {
		if (newServiceQname != serviceQname) {
			NotificationChain msgs = null;
			if (serviceQname != null)
				msgs = ((InternalEObject)serviceQname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME, null, msgs);
			if (newServiceQname != null)
				msgs = ((InternalEObject)newServiceQname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME, null, msgs);
			msgs = basicSetServiceQname(newServiceQname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME, newServiceQname, newServiceQname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortComponentRefType> getPortComponentRef() {
		if (portComponentRef == null) {
			portComponentRef = new EObjectContainmentEList<PortComponentRefType>(PortComponentRefType.class, this, Webapp24Package.SERVICE_REF_TYPE__PORT_COMPONENT_REF);
		}
		return portComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRefHandlerType> getHandler() {
		if (handler == null) {
			handler = new EObjectContainmentEList<ServiceRefHandlerType>(ServiceRefHandlerType.class, this, Webapp24Package.SERVICE_REF_TYPE__HANDLER);
		}
		return handler;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SERVICE_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.SERVICE_REF_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME:
				return basicSetServiceRefName(null, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE:
				return basicSetServiceInterface(null, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE:
				return basicSetWsdlFile(null, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE:
				return basicSetJaxrpcMappingFile(null, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME:
				return basicSetServiceQname(null, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__PORT_COMPONENT_REF:
				return ((InternalEList<?>)getPortComponentRef()).basicRemove(otherEnd, msgs);
			case Webapp24Package.SERVICE_REF_TYPE__HANDLER:
				return ((InternalEList<?>)getHandler()).basicRemove(otherEnd, msgs);
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
			case Webapp24Package.SERVICE_REF_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp24Package.SERVICE_REF_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp24Package.SERVICE_REF_TYPE__ICON:
				return getIcon();
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME:
				return getServiceRefName();
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE:
				return getServiceInterface();
			case Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE:
				return getWsdlFile();
			case Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE:
				return getJaxrpcMappingFile();
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME:
				return getServiceQname();
			case Webapp24Package.SERVICE_REF_TYPE__PORT_COMPONENT_REF:
				return getPortComponentRef();
			case Webapp24Package.SERVICE_REF_TYPE__HANDLER:
				return getHandler();
			case Webapp24Package.SERVICE_REF_TYPE__ID:
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
			case Webapp24Package.SERVICE_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME:
				setServiceRefName((JndiNameType)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE:
				setServiceInterface((FullyQualifiedClassType)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE:
				setWsdlFile((XsdAnyURIType)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE:
				setJaxrpcMappingFile((PathType)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME:
				setServiceQname((XsdQNameType)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__PORT_COMPONENT_REF:
				getPortComponentRef().clear();
				getPortComponentRef().addAll((Collection<? extends PortComponentRefType>)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends ServiceRefHandlerType>)newValue);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__ID:
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
			case Webapp24Package.SERVICE_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp24Package.SERVICE_REF_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case Webapp24Package.SERVICE_REF_TYPE__ICON:
				getIcon().clear();
				return;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME:
				setServiceRefName((JndiNameType)null);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE:
				setServiceInterface((FullyQualifiedClassType)null);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE:
				setWsdlFile((XsdAnyURIType)null);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE:
				setJaxrpcMappingFile((PathType)null);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME:
				setServiceQname((XsdQNameType)null);
				return;
			case Webapp24Package.SERVICE_REF_TYPE__PORT_COMPONENT_REF:
				getPortComponentRef().clear();
				return;
			case Webapp24Package.SERVICE_REF_TYPE__HANDLER:
				getHandler().clear();
				return;
			case Webapp24Package.SERVICE_REF_TYPE__ID:
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
			case Webapp24Package.SERVICE_REF_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp24Package.SERVICE_REF_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case Webapp24Package.SERVICE_REF_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_REF_NAME:
				return serviceRefName != null;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_INTERFACE:
				return serviceInterface != null;
			case Webapp24Package.SERVICE_REF_TYPE__WSDL_FILE:
				return wsdlFile != null;
			case Webapp24Package.SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE:
				return jaxrpcMappingFile != null;
			case Webapp24Package.SERVICE_REF_TYPE__SERVICE_QNAME:
				return serviceQname != null;
			case Webapp24Package.SERVICE_REF_TYPE__PORT_COMPONENT_REF:
				return portComponentRef != null && !portComponentRef.isEmpty();
			case Webapp24Package.SERVICE_REF_TYPE__HANDLER:
				return handler != null && !handler.isEmpty();
			case Webapp24Package.SERVICE_REF_TYPE__ID:
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

} //ServiceRefTypeImpl
