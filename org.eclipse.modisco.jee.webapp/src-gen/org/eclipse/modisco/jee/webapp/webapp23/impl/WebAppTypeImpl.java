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

import org.eclipse.modisco.jee.webapp.webapp23.ContextParamType;
import org.eclipse.modisco.jee.webapp.webapp23.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp23.DistributableType;
import org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp23.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterType;
import org.eclipse.modisco.jee.webapp.webapp23.IconType;
import org.eclipse.modisco.jee.webapp.webapp23.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletType;
import org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp23.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp23.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;
import org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web App Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getDistributable <em>Distributable</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getContextParam <em>Context Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getFilterMapping <em>Filter Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getServlet <em>Servlet</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getSessionConfig <em>Session Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getMimeMapping <em>Mime Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getWelcomeFileList <em>Welcome File List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getTaglib <em>Taglib</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getSecurityConstraint <em>Security Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getLoginConfig <em>Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebAppTypeImpl extends EObjectImpl implements WebAppType {
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
	 * The cached value of the '{@link #getDistributable() <em>Distributable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributable()
	 * @generated
	 * @ordered
	 */
	protected DistributableType distributable;

	/**
	 * The cached value of the '{@link #getContextParam() <em>Context Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextParamType> contextParam;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterType> filter;

	/**
	 * The cached value of the '{@link #getFilterMapping() <em>Filter Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterMappingType> filterMapping;

	/**
	 * The cached value of the '{@link #getListener() <em>Listener</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListener()
	 * @generated
	 * @ordered
	 */
	protected EList<ListenerType> listener;

	/**
	 * The cached value of the '{@link #getServlet() <em>Servlet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServlet()
	 * @generated
	 * @ordered
	 */
	protected EList<ServletType> servlet;

	/**
	 * The cached value of the '{@link #getServletMapping() <em>Servlet Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<ServletMappingType> servletMapping;

	/**
	 * The cached value of the '{@link #getSessionConfig() <em>Session Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionConfig()
	 * @generated
	 * @ordered
	 */
	protected SessionConfigType sessionConfig;

	/**
	 * The cached value of the '{@link #getMimeMapping() <em>Mime Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<MimeMappingType> mimeMapping;

	/**
	 * The cached value of the '{@link #getWelcomeFileList() <em>Welcome File List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeFileList()
	 * @generated
	 * @ordered
	 */
	protected WelcomeFileListType welcomeFileList;

	/**
	 * The cached value of the '{@link #getErrorPage() <em>Error Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPage()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorPageType> errorPage;

	/**
	 * The cached value of the '{@link #getTaglib() <em>Taglib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaglib()
	 * @generated
	 * @ordered
	 */
	protected EList<TaglibType> taglib;

	/**
	 * The cached value of the '{@link #getResourceEnvRef() <em>Resource Env Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceEnvRefType> resourceEnvRef;

	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRefType> resourceRef;

	/**
	 * The cached value of the '{@link #getSecurityConstraint() <em>Security Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityConstraintType> securityConstraint;

	/**
	 * The cached value of the '{@link #getLoginConfig() <em>Login Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginConfig()
	 * @generated
	 * @ordered
	 */
	protected LoginConfigType loginConfig;

	/**
	 * The cached value of the '{@link #getSecurityRole() <em>Security Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRole()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleType> securityRole;

	/**
	 * The cached value of the '{@link #getEnvEntry() <em>Env Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvEntryType> envEntry;

	/**
	 * The cached value of the '{@link #getEjbRef() <em>Ejb Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbRefType> ejbRef;

	/**
	 * The cached value of the '{@link #getEjbLocalRef() <em>Ejb Local Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbLocalRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbLocalRefType> ejbLocalRef;

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
	protected WebAppTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.WEB_APP_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__ICON, oldIcon, newIcon);
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
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__ICON, newIcon, newIcon));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME, oldDisplayName, newDisplayName);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME, newDisplayName, newDisplayName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributableType getDistributable() {
		return distributable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributable(DistributableType newDistributable, NotificationChain msgs) {
		DistributableType oldDistributable = distributable;
		distributable = newDistributable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE, oldDistributable, newDistributable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributable(DistributableType newDistributable) {
		if (newDistributable != distributable) {
			NotificationChain msgs = null;
			if (distributable != null)
				msgs = ((InternalEObject)distributable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE, null, msgs);
			if (newDistributable != null)
				msgs = ((InternalEObject)newDistributable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE, null, msgs);
			msgs = basicSetDistributable(newDistributable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE, newDistributable, newDistributable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextParamType> getContextParam() {
		if (contextParam == null) {
			contextParam = new EObjectContainmentEList<ContextParamType>(ContextParamType.class, this, Webapp23Package.WEB_APP_TYPE__CONTEXT_PARAM);
		}
		return contextParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterType> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<FilterType>(FilterType.class, this, Webapp23Package.WEB_APP_TYPE__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterMappingType> getFilterMapping() {
		if (filterMapping == null) {
			filterMapping = new EObjectContainmentEList<FilterMappingType>(FilterMappingType.class, this, Webapp23Package.WEB_APP_TYPE__FILTER_MAPPING);
		}
		return filterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListenerType> getListener() {
		if (listener == null) {
			listener = new EObjectContainmentEList<ListenerType>(ListenerType.class, this, Webapp23Package.WEB_APP_TYPE__LISTENER);
		}
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServletType> getServlet() {
		if (servlet == null) {
			servlet = new EObjectContainmentEList<ServletType>(ServletType.class, this, Webapp23Package.WEB_APP_TYPE__SERVLET);
		}
		return servlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServletMappingType> getServletMapping() {
		if (servletMapping == null) {
			servletMapping = new EObjectContainmentEList<ServletMappingType>(ServletMappingType.class, this, Webapp23Package.WEB_APP_TYPE__SERVLET_MAPPING);
		}
		return servletMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionConfigType getSessionConfig() {
		return sessionConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionConfig(SessionConfigType newSessionConfig, NotificationChain msgs) {
		SessionConfigType oldSessionConfig = sessionConfig;
		sessionConfig = newSessionConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG, oldSessionConfig, newSessionConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionConfig(SessionConfigType newSessionConfig) {
		if (newSessionConfig != sessionConfig) {
			NotificationChain msgs = null;
			if (sessionConfig != null)
				msgs = ((InternalEObject)sessionConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG, null, msgs);
			if (newSessionConfig != null)
				msgs = ((InternalEObject)newSessionConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG, null, msgs);
			msgs = basicSetSessionConfig(newSessionConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG, newSessionConfig, newSessionConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MimeMappingType> getMimeMapping() {
		if (mimeMapping == null) {
			mimeMapping = new EObjectContainmentEList<MimeMappingType>(MimeMappingType.class, this, Webapp23Package.WEB_APP_TYPE__MIME_MAPPING);
		}
		return mimeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFileListType getWelcomeFileList() {
		return welcomeFileList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWelcomeFileList(WelcomeFileListType newWelcomeFileList, NotificationChain msgs) {
		WelcomeFileListType oldWelcomeFileList = welcomeFileList;
		welcomeFileList = newWelcomeFileList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST, oldWelcomeFileList, newWelcomeFileList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeFileList(WelcomeFileListType newWelcomeFileList) {
		if (newWelcomeFileList != welcomeFileList) {
			NotificationChain msgs = null;
			if (welcomeFileList != null)
				msgs = ((InternalEObject)welcomeFileList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST, null, msgs);
			if (newWelcomeFileList != null)
				msgs = ((InternalEObject)newWelcomeFileList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST, null, msgs);
			msgs = basicSetWelcomeFileList(newWelcomeFileList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST, newWelcomeFileList, newWelcomeFileList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorPageType> getErrorPage() {
		if (errorPage == null) {
			errorPage = new EObjectContainmentEList<ErrorPageType>(ErrorPageType.class, this, Webapp23Package.WEB_APP_TYPE__ERROR_PAGE);
		}
		return errorPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaglibType> getTaglib() {
		if (taglib == null) {
			taglib = new EObjectContainmentEList<TaglibType>(TaglibType.class, this, Webapp23Package.WEB_APP_TYPE__TAGLIB);
		}
		return taglib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceEnvRefType> getResourceEnvRef() {
		if (resourceEnvRef == null) {
			resourceEnvRef = new EObjectContainmentEList<ResourceEnvRefType>(ResourceEnvRefType.class, this, Webapp23Package.WEB_APP_TYPE__RESOURCE_ENV_REF);
		}
		return resourceEnvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		if (resourceRef == null) {
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, Webapp23Package.WEB_APP_TYPE__RESOURCE_REF);
		}
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityConstraintType> getSecurityConstraint() {
		if (securityConstraint == null) {
			securityConstraint = new EObjectContainmentEList<SecurityConstraintType>(SecurityConstraintType.class, this, Webapp23Package.WEB_APP_TYPE__SECURITY_CONSTRAINT);
		}
		return securityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginConfigType getLoginConfig() {
		return loginConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoginConfig(LoginConfigType newLoginConfig, NotificationChain msgs) {
		LoginConfigType oldLoginConfig = loginConfig;
		loginConfig = newLoginConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG, oldLoginConfig, newLoginConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginConfig(LoginConfigType newLoginConfig) {
		if (newLoginConfig != loginConfig) {
			NotificationChain msgs = null;
			if (loginConfig != null)
				msgs = ((InternalEObject)loginConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG, null, msgs);
			if (newLoginConfig != null)
				msgs = ((InternalEObject)newLoginConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG, null, msgs);
			msgs = basicSetLoginConfig(newLoginConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG, newLoginConfig, newLoginConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleType> getSecurityRole() {
		if (securityRole == null) {
			securityRole = new EObjectContainmentEList<SecurityRoleType>(SecurityRoleType.class, this, Webapp23Package.WEB_APP_TYPE__SECURITY_ROLE);
		}
		return securityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		if (envEntry == null) {
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, Webapp23Package.WEB_APP_TYPE__ENV_ENTRY);
		}
		return envEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbRefType> getEjbRef() {
		if (ejbRef == null) {
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, Webapp23Package.WEB_APP_TYPE__EJB_REF);
		}
		return ejbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbLocalRefType> getEjbLocalRef() {
		if (ejbLocalRef == null) {
			ejbLocalRef = new EObjectContainmentEList<EjbLocalRefType>(EjbLocalRefType.class, this, Webapp23Package.WEB_APP_TYPE__EJB_LOCAL_REF);
		}
		return ejbLocalRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.WEB_APP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.WEB_APP_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case Webapp23Package.WEB_APP_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE:
				return basicSetDistributable(null, msgs);
			case Webapp23Package.WEB_APP_TYPE__CONTEXT_PARAM:
				return ((InternalEList<?>)getContextParam()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__FILTER_MAPPING:
				return ((InternalEList<?>)getFilterMapping()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__LISTENER:
				return ((InternalEList<?>)getListener()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__SERVLET:
				return ((InternalEList<?>)getServlet()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__SERVLET_MAPPING:
				return ((InternalEList<?>)getServletMapping()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG:
				return basicSetSessionConfig(null, msgs);
			case Webapp23Package.WEB_APP_TYPE__MIME_MAPPING:
				return ((InternalEList<?>)getMimeMapping()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				return basicSetWelcomeFileList(null, msgs);
			case Webapp23Package.WEB_APP_TYPE__ERROR_PAGE:
				return ((InternalEList<?>)getErrorPage()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__TAGLIB:
				return ((InternalEList<?>)getTaglib()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				return ((InternalEList<?>)getSecurityConstraint()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG:
				return basicSetLoginConfig(null, msgs);
			case Webapp23Package.WEB_APP_TYPE__SECURITY_ROLE:
				return ((InternalEList<?>)getSecurityRole()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case Webapp23Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
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
			case Webapp23Package.WEB_APP_TYPE__ICON:
				return getIcon();
			case Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp23Package.WEB_APP_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE:
				return getDistributable();
			case Webapp23Package.WEB_APP_TYPE__CONTEXT_PARAM:
				return getContextParam();
			case Webapp23Package.WEB_APP_TYPE__FILTER:
				return getFilter();
			case Webapp23Package.WEB_APP_TYPE__FILTER_MAPPING:
				return getFilterMapping();
			case Webapp23Package.WEB_APP_TYPE__LISTENER:
				return getListener();
			case Webapp23Package.WEB_APP_TYPE__SERVLET:
				return getServlet();
			case Webapp23Package.WEB_APP_TYPE__SERVLET_MAPPING:
				return getServletMapping();
			case Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG:
				return getSessionConfig();
			case Webapp23Package.WEB_APP_TYPE__MIME_MAPPING:
				return getMimeMapping();
			case Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				return getWelcomeFileList();
			case Webapp23Package.WEB_APP_TYPE__ERROR_PAGE:
				return getErrorPage();
			case Webapp23Package.WEB_APP_TYPE__TAGLIB:
				return getTaglib();
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_REF:
				return getResourceRef();
			case Webapp23Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				return getSecurityConstraint();
			case Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG:
				return getLoginConfig();
			case Webapp23Package.WEB_APP_TYPE__SECURITY_ROLE:
				return getSecurityRole();
			case Webapp23Package.WEB_APP_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case Webapp23Package.WEB_APP_TYPE__EJB_REF:
				return getEjbRef();
			case Webapp23Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case Webapp23Package.WEB_APP_TYPE__ID:
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
			case Webapp23Package.WEB_APP_TYPE__ICON:
				setIcon((IconType)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE:
				setDistributable((DistributableType)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__CONTEXT_PARAM:
				getContextParam().clear();
				getContextParam().addAll((Collection<? extends ContextParamType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__FILTER_MAPPING:
				getFilterMapping().clear();
				getFilterMapping().addAll((Collection<? extends FilterMappingType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__LISTENER:
				getListener().clear();
				getListener().addAll((Collection<? extends ListenerType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__SERVLET:
				getServlet().clear();
				getServlet().addAll((Collection<? extends ServletType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__SERVLET_MAPPING:
				getServletMapping().clear();
				getServletMapping().addAll((Collection<? extends ServletMappingType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG:
				setSessionConfig((SessionConfigType)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__MIME_MAPPING:
				getMimeMapping().clear();
				getMimeMapping().addAll((Collection<? extends MimeMappingType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				setWelcomeFileList((WelcomeFileListType)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__ERROR_PAGE:
				getErrorPage().clear();
				getErrorPage().addAll((Collection<? extends ErrorPageType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__TAGLIB:
				getTaglib().clear();
				getTaglib().addAll((Collection<? extends TaglibType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				getSecurityConstraint().clear();
				getSecurityConstraint().addAll((Collection<? extends SecurityConstraintType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG:
				setLoginConfig((LoginConfigType)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				getSecurityRole().addAll((Collection<? extends SecurityRoleType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case Webapp23Package.WEB_APP_TYPE__ID:
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
			case Webapp23Package.WEB_APP_TYPE__ICON:
				setIcon((IconType)null);
				return;
			case Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case Webapp23Package.WEB_APP_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE:
				setDistributable((DistributableType)null);
				return;
			case Webapp23Package.WEB_APP_TYPE__CONTEXT_PARAM:
				getContextParam().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__FILTER:
				getFilter().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__FILTER_MAPPING:
				getFilterMapping().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__LISTENER:
				getListener().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__SERVLET:
				getServlet().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__SERVLET_MAPPING:
				getServletMapping().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG:
				setSessionConfig((SessionConfigType)null);
				return;
			case Webapp23Package.WEB_APP_TYPE__MIME_MAPPING:
				getMimeMapping().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				setWelcomeFileList((WelcomeFileListType)null);
				return;
			case Webapp23Package.WEB_APP_TYPE__ERROR_PAGE:
				getErrorPage().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__TAGLIB:
				getTaglib().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				getSecurityConstraint().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG:
				setLoginConfig((LoginConfigType)null);
				return;
			case Webapp23Package.WEB_APP_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case Webapp23Package.WEB_APP_TYPE__ID:
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
			case Webapp23Package.WEB_APP_TYPE__ICON:
				return icon != null;
			case Webapp23Package.WEB_APP_TYPE__DISPLAY_NAME:
				return displayName != null;
			case Webapp23Package.WEB_APP_TYPE__DESCRIPTION:
				return description != null;
			case Webapp23Package.WEB_APP_TYPE__DISTRIBUTABLE:
				return distributable != null;
			case Webapp23Package.WEB_APP_TYPE__CONTEXT_PARAM:
				return contextParam != null && !contextParam.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__FILTER:
				return filter != null && !filter.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__FILTER_MAPPING:
				return filterMapping != null && !filterMapping.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__LISTENER:
				return listener != null && !listener.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__SERVLET:
				return servlet != null && !servlet.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__SERVLET_MAPPING:
				return servletMapping != null && !servletMapping.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__SESSION_CONFIG:
				return sessionConfig != null;
			case Webapp23Package.WEB_APP_TYPE__MIME_MAPPING:
				return mimeMapping != null && !mimeMapping.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				return welcomeFileList != null;
			case Webapp23Package.WEB_APP_TYPE__ERROR_PAGE:
				return errorPage != null && !errorPage.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__TAGLIB:
				return taglib != null && !taglib.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				return resourceEnvRef != null && !resourceEnvRef.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				return securityConstraint != null && !securityConstraint.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__LOGIN_CONFIG:
				return loginConfig != null;
			case Webapp23Package.WEB_APP_TYPE__SECURITY_ROLE:
				return securityRole != null && !securityRole.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				return ejbLocalRef != null && !ejbLocalRef.isEmpty();
			case Webapp23Package.WEB_APP_TYPE__ID:
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

} //WebAppTypeImpl
