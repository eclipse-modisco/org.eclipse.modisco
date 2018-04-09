/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejb Jar Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getAssemblyDescriptor <em>Assembly Descriptor</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getEjbClientJar <em>Ejb Client Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EjbJarTypeImpl extends EObjectImpl implements EjbJarType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected DisplayNameType displayName;

	/**
	 * The cached value of the '{@link #getSmallIcon() <em>Small Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallIcon()
	 * @generated
	 * @ordered
	 */
	protected SmallIconType smallIcon;

	/**
	 * The cached value of the '{@link #getLargeIcon() <em>Large Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeIcon()
	 * @generated
	 * @ordered
	 */
	protected LargeIconType largeIcon;

	/**
	 * The cached value of the '{@link #getEnterpriseBeans() <em>Enterprise Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseBeans()
	 * @generated
	 * @ordered
	 */
	protected EnterpriseBeansType enterpriseBeans;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected RelationshipsType relationships;

	/**
	 * The cached value of the '{@link #getAssemblyDescriptor() <em>Assembly Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyDescriptor()
	 * @generated
	 * @ordered
	 */
	protected AssemblyDescriptorType assemblyDescriptor;

	/**
	 * The cached value of the '{@link #getEjbClientJar() <em>Ejb Client Jar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClientJar()
	 * @generated
	 * @ordered
	 */
	protected EjbClientJarType ejbClientJar;

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
	protected EjbJarTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.EJB_JAR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameType getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(DisplayNameType newDisplayName, NotificationChain msgs) {
		DisplayNameType oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME, oldDisplayName, newDisplayName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(DisplayNameType newDisplayName) {
		if (newDisplayName != displayName) {
			NotificationChain msgs = null;
			if (displayName != null)
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME, newDisplayName, newDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallIconType getSmallIcon() {
		return smallIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmallIcon(SmallIconType newSmallIcon, NotificationChain msgs) {
		SmallIconType oldSmallIcon = smallIcon;
		smallIcon = newSmallIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON, oldSmallIcon, newSmallIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallIcon(SmallIconType newSmallIcon) {
		if (newSmallIcon != smallIcon) {
			NotificationChain msgs = null;
			if (smallIcon != null)
				msgs = ((InternalEObject)smallIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON, null, msgs);
			if (newSmallIcon != null)
				msgs = ((InternalEObject)newSmallIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON, null, msgs);
			msgs = basicSetSmallIcon(newSmallIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON, newSmallIcon, newSmallIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeIconType getLargeIcon() {
		return largeIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeIcon(LargeIconType newLargeIcon, NotificationChain msgs) {
		LargeIconType oldLargeIcon = largeIcon;
		largeIcon = newLargeIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON, oldLargeIcon, newLargeIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeIcon(LargeIconType newLargeIcon) {
		if (newLargeIcon != largeIcon) {
			NotificationChain msgs = null;
			if (largeIcon != null)
				msgs = ((InternalEObject)largeIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON, null, msgs);
			if (newLargeIcon != null)
				msgs = ((InternalEObject)newLargeIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON, null, msgs);
			msgs = basicSetLargeIcon(newLargeIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON, newLargeIcon, newLargeIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseBeansType getEnterpriseBeans() {
		return enterpriseBeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterpriseBeans(EnterpriseBeansType newEnterpriseBeans, NotificationChain msgs) {
		EnterpriseBeansType oldEnterpriseBeans = enterpriseBeans;
		enterpriseBeans = newEnterpriseBeans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, oldEnterpriseBeans, newEnterpriseBeans);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseBeans(EnterpriseBeansType newEnterpriseBeans) {
		if (newEnterpriseBeans != enterpriseBeans) {
			NotificationChain msgs = null;
			if (enterpriseBeans != null)
				msgs = ((InternalEObject)enterpriseBeans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, null, msgs);
			if (newEnterpriseBeans != null)
				msgs = ((InternalEObject)newEnterpriseBeans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, null, msgs);
			msgs = basicSetEnterpriseBeans(newEnterpriseBeans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, newEnterpriseBeans, newEnterpriseBeans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsType getRelationships() {
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationships(RelationshipsType newRelationships, NotificationChain msgs) {
		RelationshipsType oldRelationships = relationships;
		relationships = newRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS, oldRelationships, newRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationships(RelationshipsType newRelationships) {
		if (newRelationships != relationships) {
			NotificationChain msgs = null;
			if (relationships != null)
				msgs = ((InternalEObject)relationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS, null, msgs);
			if (newRelationships != null)
				msgs = ((InternalEObject)newRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS, null, msgs);
			msgs = basicSetRelationships(newRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS, newRelationships, newRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyDescriptorType getAssemblyDescriptor() {
		return assemblyDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyDescriptor(AssemblyDescriptorType newAssemblyDescriptor, NotificationChain msgs) {
		AssemblyDescriptorType oldAssemblyDescriptor = assemblyDescriptor;
		assemblyDescriptor = newAssemblyDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, oldAssemblyDescriptor, newAssemblyDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyDescriptor(AssemblyDescriptorType newAssemblyDescriptor) {
		if (newAssemblyDescriptor != assemblyDescriptor) {
			NotificationChain msgs = null;
			if (assemblyDescriptor != null)
				msgs = ((InternalEObject)assemblyDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, null, msgs);
			if (newAssemblyDescriptor != null)
				msgs = ((InternalEObject)newAssemblyDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, null, msgs);
			msgs = basicSetAssemblyDescriptor(newAssemblyDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, newAssemblyDescriptor, newAssemblyDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClientJarType getEjbClientJar() {
		return ejbClientJar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClientJar(EjbClientJarType newEjbClientJar, NotificationChain msgs) {
		EjbClientJarType oldEjbClientJar = ejbClientJar;
		ejbClientJar = newEjbClientJar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, oldEjbClientJar, newEjbClientJar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClientJar(EjbClientJarType newEjbClientJar) {
		if (newEjbClientJar != ejbClientJar) {
			NotificationChain msgs = null;
			if (ejbClientJar != null)
				msgs = ((InternalEObject)ejbClientJar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, null, msgs);
			if (newEjbClientJar != null)
				msgs = ((InternalEObject)newEjbClientJar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, null, msgs);
			msgs = basicSetEjbClientJar(newEjbClientJar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, newEjbClientJar, newEjbClientJar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_JAR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON:
				return basicSetSmallIcon(null, msgs);
			case EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON:
				return basicSetLargeIcon(null, msgs);
			case EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				return basicSetEnterpriseBeans(null, msgs);
			case EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS:
				return basicSetRelationships(null, msgs);
			case EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				return basicSetAssemblyDescriptor(null, msgs);
			case EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				return basicSetEjbClientJar(null, msgs);
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
			case EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON:
				return getSmallIcon();
			case EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON:
				return getLargeIcon();
			case EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				return getEnterpriseBeans();
			case EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS:
				return getRelationships();
			case EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				return getAssemblyDescriptor();
			case EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				return getEjbClientJar();
			case EjbJar20Package.EJB_JAR_TYPE__ID:
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
			case EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS:
				setRelationships((RelationshipsType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				setEjbClientJar((EjbClientJarType)newValue);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__ID:
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
			case EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS:
				setRelationships((RelationshipsType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				setEjbClientJar((EjbClientJarType)null);
				return;
			case EjbJar20Package.EJB_JAR_TYPE__ID:
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
			case EjbJar20Package.EJB_JAR_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar20Package.EJB_JAR_TYPE__DISPLAY_NAME:
				return displayName != null;
			case EjbJar20Package.EJB_JAR_TYPE__SMALL_ICON:
				return smallIcon != null;
			case EjbJar20Package.EJB_JAR_TYPE__LARGE_ICON:
				return largeIcon != null;
			case EjbJar20Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				return enterpriseBeans != null;
			case EjbJar20Package.EJB_JAR_TYPE__RELATIONSHIPS:
				return relationships != null;
			case EjbJar20Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				return assemblyDescriptor != null;
			case EjbJar20Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				return ejbClientJar != null;
			case EjbJar20Package.EJB_JAR_TYPE__ID:
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

} //EjbJarTypeImpl
