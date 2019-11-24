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

import org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejb Jar Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getInterceptors <em>Interceptors</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getAssemblyDescriptor <em>Assembly Descriptor</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getEjbClientJar <em>Ejb Client Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EjbJarTypeImpl extends EObjectImpl implements EjbJarType {
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
	 * The cached value of the '{@link #getEnterpriseBeans() <em>Enterprise Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseBeans()
	 * @generated
	 * @ordered
	 */
	protected EnterpriseBeansType enterpriseBeans;

	/**
	 * The cached value of the '{@link #getInterceptors() <em>Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptors()
	 * @generated
	 * @ordered
	 */
	protected InterceptorsType interceptors;

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
	protected PathType ejbClientJar;

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
	 * The default value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean METADATA_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean metadataComplete = METADATA_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Metadata Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean metadataCompleteESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "3.0"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

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
		return EjbJar30Package.eINSTANCE.getEjbJarType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar30Package.EJB_JAR_TYPE__DESCRIPTION);
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
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, EjbJar30Package.EJB_JAR_TYPE__DISPLAY_NAME);
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
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, EjbJar30Package.EJB_JAR_TYPE__ICON);
		}
		return icon;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, oldEnterpriseBeans, newEnterpriseBeans);
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
				msgs = ((InternalEObject)enterpriseBeans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, null, msgs);
			if (newEnterpriseBeans != null)
				msgs = ((InternalEObject)newEnterpriseBeans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, null, msgs);
			msgs = basicSetEnterpriseBeans(newEnterpriseBeans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS, newEnterpriseBeans, newEnterpriseBeans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorsType getInterceptors() {
		return interceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptors(InterceptorsType newInterceptors, NotificationChain msgs) {
		InterceptorsType oldInterceptors = interceptors;
		interceptors = newInterceptors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS, oldInterceptors, newInterceptors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterceptors(InterceptorsType newInterceptors) {
		if (newInterceptors != interceptors) {
			NotificationChain msgs = null;
			if (interceptors != null)
				msgs = ((InternalEObject)interceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS, null, msgs);
			if (newInterceptors != null)
				msgs = ((InternalEObject)newInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS, null, msgs);
			msgs = basicSetInterceptors(newInterceptors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS, newInterceptors, newInterceptors));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS, oldRelationships, newRelationships);
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
				msgs = ((InternalEObject)relationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS, null, msgs);
			if (newRelationships != null)
				msgs = ((InternalEObject)newRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS, null, msgs);
			msgs = basicSetRelationships(newRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS, newRelationships, newRelationships));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, oldAssemblyDescriptor, newAssemblyDescriptor);
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
				msgs = ((InternalEObject)assemblyDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, null, msgs);
			if (newAssemblyDescriptor != null)
				msgs = ((InternalEObject)newAssemblyDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, null, msgs);
			msgs = basicSetAssemblyDescriptor(newAssemblyDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR, newAssemblyDescriptor, newAssemblyDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType getEjbClientJar() {
		return ejbClientJar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClientJar(PathType newEjbClientJar, NotificationChain msgs) {
		PathType oldEjbClientJar = ejbClientJar;
		ejbClientJar = newEjbClientJar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, oldEjbClientJar, newEjbClientJar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClientJar(PathType newEjbClientJar) {
		if (newEjbClientJar != ejbClientJar) {
			NotificationChain msgs = null;
			if (ejbClientJar != null)
				msgs = ((InternalEObject)ejbClientJar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, null, msgs);
			if (newEjbClientJar != null)
				msgs = ((InternalEObject)newEjbClientJar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, null, msgs);
			msgs = basicSetEjbClientJar(newEjbClientJar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR, newEjbClientJar, newEjbClientJar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetadataComplete() {
		return metadataComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataComplete(boolean newMetadataComplete) {
		boolean oldMetadataComplete = metadataComplete;
		metadataComplete = newMetadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__METADATA_COMPLETE, oldMetadataComplete, metadataComplete, !oldMetadataCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMetadataComplete() {
		boolean oldMetadataComplete = metadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataComplete = METADATA_COMPLETE_EDEFAULT;
		metadataCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EjbJar30Package.EJB_JAR_TYPE__METADATA_COMPLETE, oldMetadataComplete, METADATA_COMPLETE_EDEFAULT, oldMetadataCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataComplete() {
		return metadataCompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_JAR_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EjbJar30Package.EJB_JAR_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.EJB_JAR_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.EJB_JAR_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.EJB_JAR_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				return basicSetEnterpriseBeans(null, msgs);
			case EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS:
				return basicSetInterceptors(null, msgs);
			case EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS:
				return basicSetRelationships(null, msgs);
			case EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				return basicSetAssemblyDescriptor(null, msgs);
			case EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
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
			case EjbJar30Package.EJB_JAR_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar30Package.EJB_JAR_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar30Package.EJB_JAR_TYPE__ICON:
				return getIcon();
			case EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				return getEnterpriseBeans();
			case EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS:
				return getInterceptors();
			case EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS:
				return getRelationships();
			case EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				return getAssemblyDescriptor();
			case EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				return getEjbClientJar();
			case EjbJar30Package.EJB_JAR_TYPE__ID:
				return getId();
			case EjbJar30Package.EJB_JAR_TYPE__METADATA_COMPLETE:
				return isMetadataComplete();
			case EjbJar30Package.EJB_JAR_TYPE__VERSION:
				return getVersion();
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
			case EjbJar30Package.EJB_JAR_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS:
				setInterceptors((InterceptorsType)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS:
				setRelationships((RelationshipsType)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				setEjbClientJar((PathType)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ID:
				setId((String)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__METADATA_COMPLETE:
				setMetadataComplete((Boolean)newValue);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__VERSION:
				setVersion((String)newValue);
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
			case EjbJar30Package.EJB_JAR_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar30Package.EJB_JAR_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ICON:
				getIcon().clear();
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)null);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS:
				setInterceptors((InterceptorsType)null);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS:
				setRelationships((RelationshipsType)null);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)null);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				setEjbClientJar((PathType)null);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case EjbJar30Package.EJB_JAR_TYPE__METADATA_COMPLETE:
				unsetMetadataComplete();
				return;
			case EjbJar30Package.EJB_JAR_TYPE__VERSION:
				unsetVersion();
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
			case EjbJar30Package.EJB_JAR_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar30Package.EJB_JAR_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case EjbJar30Package.EJB_JAR_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case EjbJar30Package.EJB_JAR_TYPE__ENTERPRISE_BEANS:
				return enterpriseBeans != null;
			case EjbJar30Package.EJB_JAR_TYPE__INTERCEPTORS:
				return interceptors != null;
			case EjbJar30Package.EJB_JAR_TYPE__RELATIONSHIPS:
				return relationships != null;
			case EjbJar30Package.EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR:
				return assemblyDescriptor != null;
			case EjbJar30Package.EJB_JAR_TYPE__EJB_CLIENT_JAR:
				return ejbClientJar != null;
			case EjbJar30Package.EJB_JAR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EjbJar30Package.EJB_JAR_TYPE__METADATA_COMPLETE:
				return isSetMetadataComplete();
			case EjbJar30Package.EJB_JAR_TYPE__VERSION:
				return isSetVersion();
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
		result.append(", metadataComplete: "); //$NON-NLS-1$
		if (metadataCompleteESet) result.append(metadataComplete); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", version: "); //$NON-NLS-1$
		if (versionESet) result.append(version); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //EjbJarTypeImpl
