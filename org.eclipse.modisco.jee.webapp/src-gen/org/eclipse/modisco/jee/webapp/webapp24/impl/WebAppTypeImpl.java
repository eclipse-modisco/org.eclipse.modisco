/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp24.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp24.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterType;
import org.eclipse.modisco.jee.webapp.webapp24.IconType;
import org.eclipse.modisco.jee.webapp.webapp24.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletType;
import org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;
import org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web App Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getDistributable <em>Distributable</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getContextParam <em>Context Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getFilterMapping <em>Filter Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getServlet <em>Servlet</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getSessionConfig <em>Session Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getMimeMapping <em>Mime Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getWelcomeFileList <em>Welcome File List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getJspConfig <em>Jsp Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getSecurityConstraint <em>Security Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getLoginConfig <em>Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getMessageDestination <em>Message Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getLocaleEncodingMappingList <em>Locale Encoding Mapping List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebAppTypeImpl extends EObjectImpl implements WebAppType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final WebAppVersionType VERSION_EDEFAULT = WebAppVersionType._24;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected WebAppVersionType version = VERSION_EDEFAULT;

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
		return Webapp24Package.Literals.WEB_APP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Webapp24Package.WEB_APP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__DISPLAY_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IconType> getIcon() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__ICON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmptyType> getDistributable() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__DISTRIBUTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamValueType> getContextParam() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__CONTEXT_PARAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterType> getFilter() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__FILTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterMappingType> getFilterMapping() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__FILTER_MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListenerType> getListener() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__LISTENER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServletType> getServlet() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__SERVLET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServletMappingType> getServletMapping() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__SERVLET_MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SessionConfigType> getSessionConfig() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__SESSION_CONFIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MimeMappingType> getMimeMapping() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__MIME_MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WelcomeFileListType> getWelcomeFileList() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__WELCOME_FILE_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorPageType> getErrorPage() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__ERROR_PAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JspConfigType> getJspConfig() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__JSP_CONFIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityConstraintType> getSecurityConstraint() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__SECURITY_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoginConfigType> getLoginConfig() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__LOGIN_CONFIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleType> getSecurityRole() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__SECURITY_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__ENV_ENTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbRefType> getEjbRef() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__EJB_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbLocalRefType> getEjbLocalRef() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__EJB_LOCAL_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRefType> getServiceRef() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__SERVICE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__RESOURCE_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceEnvRefType> getResourceEnvRef() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__RESOURCE_ENV_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestinationRefType> getMessageDestinationRef() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__MESSAGE_DESTINATION_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestinationType> getMessageDestination() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__MESSAGE_DESTINATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocaleEncodingMappingListType> getLocaleEncodingMappingList() {
		return getGroup().list(Webapp24Package.Literals.WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.WEB_APP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppVersionType getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(WebAppVersionType newVersion) {
		WebAppVersionType oldVersion = version;
		version = newVersion == null ? VERSION_EDEFAULT : newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.WEB_APP_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		WebAppVersionType oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Webapp24Package.WEB_APP_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case Webapp24Package.WEB_APP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__DISTRIBUTABLE:
				return ((InternalEList<?>)getDistributable()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__CONTEXT_PARAM:
				return ((InternalEList<?>)getContextParam()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__FILTER_MAPPING:
				return ((InternalEList<?>)getFilterMapping()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__LISTENER:
				return ((InternalEList<?>)getListener()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__SERVLET:
				return ((InternalEList<?>)getServlet()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__SERVLET_MAPPING:
				return ((InternalEList<?>)getServletMapping()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__SESSION_CONFIG:
				return ((InternalEList<?>)getSessionConfig()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__MIME_MAPPING:
				return ((InternalEList<?>)getMimeMapping()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				return ((InternalEList<?>)getWelcomeFileList()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__ERROR_PAGE:
				return ((InternalEList<?>)getErrorPage()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__JSP_CONFIG:
				return ((InternalEList<?>)getJspConfig()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				return ((InternalEList<?>)getSecurityConstraint()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__LOGIN_CONFIG:
				return ((InternalEList<?>)getLoginConfig()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__SECURITY_ROLE:
				return ((InternalEList<?>)getSecurityRole()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__SERVICE_REF:
				return ((InternalEList<?>)getServiceRef()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION_REF:
				return ((InternalEList<?>)getMessageDestinationRef()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION:
				return ((InternalEList<?>)getMessageDestination()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				return ((InternalEList<?>)getLocaleEncodingMappingList()).basicRemove(otherEnd, msgs);
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
			case Webapp24Package.WEB_APP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Webapp24Package.WEB_APP_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp24Package.WEB_APP_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp24Package.WEB_APP_TYPE__ICON:
				return getIcon();
			case Webapp24Package.WEB_APP_TYPE__DISTRIBUTABLE:
				return getDistributable();
			case Webapp24Package.WEB_APP_TYPE__CONTEXT_PARAM:
				return getContextParam();
			case Webapp24Package.WEB_APP_TYPE__FILTER:
				return getFilter();
			case Webapp24Package.WEB_APP_TYPE__FILTER_MAPPING:
				return getFilterMapping();
			case Webapp24Package.WEB_APP_TYPE__LISTENER:
				return getListener();
			case Webapp24Package.WEB_APP_TYPE__SERVLET:
				return getServlet();
			case Webapp24Package.WEB_APP_TYPE__SERVLET_MAPPING:
				return getServletMapping();
			case Webapp24Package.WEB_APP_TYPE__SESSION_CONFIG:
				return getSessionConfig();
			case Webapp24Package.WEB_APP_TYPE__MIME_MAPPING:
				return getMimeMapping();
			case Webapp24Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				return getWelcomeFileList();
			case Webapp24Package.WEB_APP_TYPE__ERROR_PAGE:
				return getErrorPage();
			case Webapp24Package.WEB_APP_TYPE__JSP_CONFIG:
				return getJspConfig();
			case Webapp24Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				return getSecurityConstraint();
			case Webapp24Package.WEB_APP_TYPE__LOGIN_CONFIG:
				return getLoginConfig();
			case Webapp24Package.WEB_APP_TYPE__SECURITY_ROLE:
				return getSecurityRole();
			case Webapp24Package.WEB_APP_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case Webapp24Package.WEB_APP_TYPE__EJB_REF:
				return getEjbRef();
			case Webapp24Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case Webapp24Package.WEB_APP_TYPE__SERVICE_REF:
				return getServiceRef();
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_REF:
				return getResourceRef();
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION_REF:
				return getMessageDestinationRef();
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION:
				return getMessageDestination();
			case Webapp24Package.WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				return getLocaleEncodingMappingList();
			case Webapp24Package.WEB_APP_TYPE__ID:
				return getId();
			case Webapp24Package.WEB_APP_TYPE__VERSION:
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
			case Webapp24Package.WEB_APP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__DISTRIBUTABLE:
				getDistributable().clear();
				getDistributable().addAll((Collection<? extends EmptyType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__CONTEXT_PARAM:
				getContextParam().clear();
				getContextParam().addAll((Collection<? extends ParamValueType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__FILTER_MAPPING:
				getFilterMapping().clear();
				getFilterMapping().addAll((Collection<? extends FilterMappingType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__LISTENER:
				getListener().clear();
				getListener().addAll((Collection<? extends ListenerType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__SERVLET:
				getServlet().clear();
				getServlet().addAll((Collection<? extends ServletType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__SERVLET_MAPPING:
				getServletMapping().clear();
				getServletMapping().addAll((Collection<? extends ServletMappingType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__SESSION_CONFIG:
				getSessionConfig().clear();
				getSessionConfig().addAll((Collection<? extends SessionConfigType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__MIME_MAPPING:
				getMimeMapping().clear();
				getMimeMapping().addAll((Collection<? extends MimeMappingType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				getWelcomeFileList().clear();
				getWelcomeFileList().addAll((Collection<? extends WelcomeFileListType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__ERROR_PAGE:
				getErrorPage().clear();
				getErrorPage().addAll((Collection<? extends ErrorPageType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__JSP_CONFIG:
				getJspConfig().clear();
				getJspConfig().addAll((Collection<? extends JspConfigType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				getSecurityConstraint().clear();
				getSecurityConstraint().addAll((Collection<? extends SecurityConstraintType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__LOGIN_CONFIG:
				getLoginConfig().clear();
				getLoginConfig().addAll((Collection<? extends LoginConfigType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				getSecurityRole().addAll((Collection<? extends SecurityRoleType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__SERVICE_REF:
				getServiceRef().clear();
				getServiceRef().addAll((Collection<? extends ServiceRefType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				getMessageDestinationRef().addAll((Collection<? extends MessageDestinationRefType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION:
				getMessageDestination().clear();
				getMessageDestination().addAll((Collection<? extends MessageDestinationType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				getLocaleEncodingMappingList().clear();
				getLocaleEncodingMappingList().addAll((Collection<? extends LocaleEncodingMappingListType>)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__ID:
				setId((String)newValue);
				return;
			case Webapp24Package.WEB_APP_TYPE__VERSION:
				setVersion((WebAppVersionType)newValue);
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
			case Webapp24Package.WEB_APP_TYPE__GROUP:
				getGroup().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__ICON:
				getIcon().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__DISTRIBUTABLE:
				getDistributable().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__CONTEXT_PARAM:
				getContextParam().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__FILTER:
				getFilter().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__FILTER_MAPPING:
				getFilterMapping().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__LISTENER:
				getListener().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__SERVLET:
				getServlet().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__SERVLET_MAPPING:
				getServletMapping().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__SESSION_CONFIG:
				getSessionConfig().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__MIME_MAPPING:
				getMimeMapping().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				getWelcomeFileList().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__ERROR_PAGE:
				getErrorPage().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__JSP_CONFIG:
				getJspConfig().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				getSecurityConstraint().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__LOGIN_CONFIG:
				getLoginConfig().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__SERVICE_REF:
				getServiceRef().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION:
				getMessageDestination().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				getLocaleEncodingMappingList().clear();
				return;
			case Webapp24Package.WEB_APP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Webapp24Package.WEB_APP_TYPE__VERSION:
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
			case Webapp24Package.WEB_APP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Webapp24Package.WEB_APP_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__DISPLAY_NAME:
				return !getDisplayName().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__ICON:
				return !getIcon().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__DISTRIBUTABLE:
				return !getDistributable().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__CONTEXT_PARAM:
				return !getContextParam().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__FILTER:
				return !getFilter().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__FILTER_MAPPING:
				return !getFilterMapping().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__LISTENER:
				return !getListener().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__SERVLET:
				return !getServlet().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__SERVLET_MAPPING:
				return !getServletMapping().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__SESSION_CONFIG:
				return !getSessionConfig().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__MIME_MAPPING:
				return !getMimeMapping().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__WELCOME_FILE_LIST:
				return !getWelcomeFileList().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__ERROR_PAGE:
				return !getErrorPage().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__JSP_CONFIG:
				return !getJspConfig().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__SECURITY_CONSTRAINT:
				return !getSecurityConstraint().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__LOGIN_CONFIG:
				return !getLoginConfig().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__SECURITY_ROLE:
				return !getSecurityRole().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__ENV_ENTRY:
				return !getEnvEntry().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__EJB_REF:
				return !getEjbRef().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__EJB_LOCAL_REF:
				return !getEjbLocalRef().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__SERVICE_REF:
				return !getServiceRef().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_REF:
				return !getResourceRef().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__RESOURCE_ENV_REF:
				return !getResourceEnvRef().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION_REF:
				return !getMessageDestinationRef().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__MESSAGE_DESTINATION:
				return !getMessageDestination().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				return !getLocaleEncodingMappingList().isEmpty();
			case Webapp24Package.WEB_APP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Webapp24Package.WEB_APP_TYPE__VERSION:
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", version: "); //$NON-NLS-1$
		if (versionESet) result.append(version); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //WebAppTypeImpl
