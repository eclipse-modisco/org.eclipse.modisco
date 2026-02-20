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
package org.eclipse.modisco.jee.webapp.webapp23.impl;

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

import org.eclipse.modisco.jee.webapp.webapp23.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp23.IconType;
import org.eclipse.modisco.jee.webapp.webapp23.InitParamType;
import org.eclipse.modisco.jee.webapp.webapp23.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType;
import org.eclipse.modisco.jee.webapp.webapp23.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletClassType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servlet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getServletClass <em>Servlet Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getJspFile <em>Jsp File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServletTypeImpl extends EObjectImpl implements ServletType {
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected IconType icon;

	/**
	 * The cached value of the '{@link #getServletName() <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletName()
	 * @generated
	 * @ordered
	 */
	protected ServletNameType servletName;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getServletClass() <em>Servlet Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletClass()
	 * @generated
	 * @ordered
	 */
	protected ServletClassType servletClass;

	/**
	 * The cached value of the '{@link #getJspFile() <em>Jsp File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJspFile()
	 * @generated
	 * @ordered
	 */
	protected JspFileType jspFile;

	/**
	 * The cached value of the '{@link #getInitParam() <em>Init Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitParam()
	 * @generated
	 * @ordered
	 */
	protected EList<InitParamType> initParam;

	/**
	 * The cached value of the '{@link #getLoadOnStartup() <em>Load On Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadOnStartup()
	 * @generated
	 * @ordered
	 */
	protected LoadOnStartupType loadOnStartup;

	/**
	 * The cached value of the '{@link #getRunAs() <em>Run As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAs()
	 * @generated
	 * @ordered
	 */
	protected RunAsType runAs;

	/**
	 * The cached value of the '{@link #getSecurityRoleRef() <em>Security Role Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRoleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleRefType> securityRoleRef;

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
	protected ServletTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.SERVLET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(IconType newIcon, NotificationChain msgs) {
		IconType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(IconType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletNameType getServletName() {
		return servletName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletName(ServletNameType newServletName, NotificationChain msgs) {
		ServletNameType oldServletName = servletName;
		servletName = newServletName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__SERVLET_NAME, oldServletName, newServletName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletName(ServletNameType newServletName) {
		if (newServletName != servletName) {
			NotificationChain msgs = null;
			if (servletName != null)
				msgs = ((InternalEObject)servletName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__SERVLET_NAME, null, msgs);
			if (newServletName != null)
				msgs = ((InternalEObject)newServletName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__SERVLET_NAME, null, msgs);
			msgs = basicSetServletName(newServletName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__SERVLET_NAME, newServletName, newServletName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__DISPLAY_NAME, oldDisplayName, newDisplayName);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__DISPLAY_NAME, newDisplayName, newDisplayName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletClassType getServletClass() {
		return servletClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletClass(ServletClassType newServletClass, NotificationChain msgs) {
		ServletClassType oldServletClass = servletClass;
		servletClass = newServletClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__SERVLET_CLASS, oldServletClass, newServletClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletClass(ServletClassType newServletClass) {
		if (newServletClass != servletClass) {
			NotificationChain msgs = null;
			if (servletClass != null)
				msgs = ((InternalEObject)servletClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__SERVLET_CLASS, null, msgs);
			if (newServletClass != null)
				msgs = ((InternalEObject)newServletClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__SERVLET_CLASS, null, msgs);
			msgs = basicSetServletClass(newServletClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__SERVLET_CLASS, newServletClass, newServletClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspFileType getJspFile() {
		return jspFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJspFile(JspFileType newJspFile, NotificationChain msgs) {
		JspFileType oldJspFile = jspFile;
		jspFile = newJspFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__JSP_FILE, oldJspFile, newJspFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJspFile(JspFileType newJspFile) {
		if (newJspFile != jspFile) {
			NotificationChain msgs = null;
			if (jspFile != null)
				msgs = ((InternalEObject)jspFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__JSP_FILE, null, msgs);
			if (newJspFile != null)
				msgs = ((InternalEObject)newJspFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__JSP_FILE, null, msgs);
			msgs = basicSetJspFile(newJspFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__JSP_FILE, newJspFile, newJspFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitParamType> getInitParam() {
		if (initParam == null) {
			initParam = new EObjectContainmentEList<InitParamType>(InitParamType.class, this, Webapp23Package.SERVLET_TYPE__INIT_PARAM);
		}
		return initParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadOnStartupType getLoadOnStartup() {
		return loadOnStartup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadOnStartup(LoadOnStartupType newLoadOnStartup, NotificationChain msgs) {
		LoadOnStartupType oldLoadOnStartup = loadOnStartup;
		loadOnStartup = newLoadOnStartup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP, oldLoadOnStartup, newLoadOnStartup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadOnStartup(LoadOnStartupType newLoadOnStartup) {
		if (newLoadOnStartup != loadOnStartup) {
			NotificationChain msgs = null;
			if (loadOnStartup != null)
				msgs = ((InternalEObject)loadOnStartup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP, null, msgs);
			if (newLoadOnStartup != null)
				msgs = ((InternalEObject)newLoadOnStartup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP, null, msgs);
			msgs = basicSetLoadOnStartup(newLoadOnStartup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP, newLoadOnStartup, newLoadOnStartup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunAsType getRunAs() {
		return runAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunAs(RunAsType newRunAs, NotificationChain msgs) {
		RunAsType oldRunAs = runAs;
		runAs = newRunAs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__RUN_AS, oldRunAs, newRunAs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAs(RunAsType newRunAs) {
		if (newRunAs != runAs) {
			NotificationChain msgs = null;
			if (runAs != null)
				msgs = ((InternalEObject)runAs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__RUN_AS, null, msgs);
			if (newRunAs != null)
				msgs = ((InternalEObject)newRunAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.SERVLET_TYPE__RUN_AS, null, msgs);
			msgs = basicSetRunAs(newRunAs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__RUN_AS, newRunAs, newRunAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleRefType> getSecurityRoleRef() {
		if (securityRoleRef == null) {
			securityRoleRef = new EObjectContainmentEList<SecurityRoleRefType>(SecurityRoleRefType.class, this, Webapp23Package.SERVLET_TYPE__SECURITY_ROLE_REF);
		}
		return securityRoleRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.SERVLET_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.SERVLET_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case Webapp23Package.SERVLET_TYPE__SERVLET_NAME:
				return basicSetServletName(null, msgs);
			case Webapp23Package.SERVLET_TYPE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case Webapp23Package.SERVLET_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp23Package.SERVLET_TYPE__SERVLET_CLASS:
				return basicSetServletClass(null, msgs);
			case Webapp23Package.SERVLET_TYPE__JSP_FILE:
				return basicSetJspFile(null, msgs);
			case Webapp23Package.SERVLET_TYPE__INIT_PARAM:
				return ((InternalEList<?>)getInitParam()).basicRemove(otherEnd, msgs);
			case Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				return basicSetLoadOnStartup(null, msgs);
			case Webapp23Package.SERVLET_TYPE__RUN_AS:
				return basicSetRunAs(null, msgs);
			case Webapp23Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				return ((InternalEList<?>)getSecurityRoleRef()).basicRemove(otherEnd, msgs);
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
			case Webapp23Package.SERVLET_TYPE__ICON:
				return getIcon();
			case Webapp23Package.SERVLET_TYPE__SERVLET_NAME:
				return getServletName();
			case Webapp23Package.SERVLET_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp23Package.SERVLET_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp23Package.SERVLET_TYPE__SERVLET_CLASS:
				return getServletClass();
			case Webapp23Package.SERVLET_TYPE__JSP_FILE:
				return getJspFile();
			case Webapp23Package.SERVLET_TYPE__INIT_PARAM:
				return getInitParam();
			case Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				return getLoadOnStartup();
			case Webapp23Package.SERVLET_TYPE__RUN_AS:
				return getRunAs();
			case Webapp23Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case Webapp23Package.SERVLET_TYPE__ID:
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
			case Webapp23Package.SERVLET_TYPE__ICON:
				setIcon((IconType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__SERVLET_NAME:
				setServletName((ServletNameType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__SERVLET_CLASS:
				setServletClass((ServletClassType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__JSP_FILE:
				setJspFile((JspFileType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__INIT_PARAM:
				getInitParam().clear();
				getInitParam().addAll((Collection<? extends InitParamType>)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				setLoadOnStartup((LoadOnStartupType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__RUN_AS:
				setRunAs((RunAsType)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				getSecurityRoleRef().addAll((Collection<? extends SecurityRoleRefType>)newValue);
				return;
			case Webapp23Package.SERVLET_TYPE__ID:
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
			case Webapp23Package.SERVLET_TYPE__ICON:
				setIcon((IconType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__SERVLET_NAME:
				setServletName((ServletNameType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__SERVLET_CLASS:
				setServletClass((ServletClassType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__JSP_FILE:
				setJspFile((JspFileType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__INIT_PARAM:
				getInitParam().clear();
				return;
			case Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				setLoadOnStartup((LoadOnStartupType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__RUN_AS:
				setRunAs((RunAsType)null);
				return;
			case Webapp23Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				return;
			case Webapp23Package.SERVLET_TYPE__ID:
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
			case Webapp23Package.SERVLET_TYPE__ICON:
				return icon != null;
			case Webapp23Package.SERVLET_TYPE__SERVLET_NAME:
				return servletName != null;
			case Webapp23Package.SERVLET_TYPE__DISPLAY_NAME:
				return displayName != null;
			case Webapp23Package.SERVLET_TYPE__DESCRIPTION:
				return description != null;
			case Webapp23Package.SERVLET_TYPE__SERVLET_CLASS:
				return servletClass != null;
			case Webapp23Package.SERVLET_TYPE__JSP_FILE:
				return jspFile != null;
			case Webapp23Package.SERVLET_TYPE__INIT_PARAM:
				return initParam != null && !initParam.isEmpty();
			case Webapp23Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				return loadOnStartup != null;
			case Webapp23Package.SERVLET_TYPE__RUN_AS:
				return runAs != null;
			case Webapp23Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				return securityRoleRef != null && !securityRoleRef.isEmpty();
			case Webapp23Package.SERVLET_TYPE__ID:
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

} //ServletTypeImpl
