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
package org.eclipse.modisco.jee.webapp.webapp30.impl;

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

import org.eclipse.modisco.jee.webapp.webapp30.DataSourceType;
import org.eclipse.modisco.jee.webapp.webapp30.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp30.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterType;
import org.eclipse.modisco.jee.webapp.webapp30.IconType;
import org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp30.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType;
import org.eclipse.modisco.jee.webapp.webapp30.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.OrderingType;
import org.eclipse.modisco.jee.webapp.webapp30.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType;
import org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletType;
import org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType;
import org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Fragment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getDistributable <em>Distributable</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getContextParam <em>Context Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getFilterMapping <em>Filter Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getServlet <em>Servlet</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getSessionConfig <em>Session Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getMimeMapping <em>Mime Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getWelcomeFileList <em>Welcome File List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getJspConfig <em>Jsp Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getSecurityConstraint <em>Security Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getLoginConfig <em>Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getPersistenceContextRef <em>Persistence Context Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getPersistenceUnitRef <em>Persistence Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getMessageDestination <em>Message Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getLocaleEncodingMappingList <em>Locale Encoding Mapping List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebFragmentTypeImpl extends EObjectImpl implements WebFragmentType {
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
	protected static final WebAppVersionType VERSION_EDEFAULT = WebAppVersionType._30;

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
	protected WebFragmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getWebFragmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Webapp30Package.WEB_FRAGMENT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaIdentifierType> getName() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_DisplayName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IconType> getIcon() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Icon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmptyType> getDistributable() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Distributable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamValueType> getContextParam() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_ContextParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterType> getFilter() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterMappingType> getFilterMapping() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_FilterMapping());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListenerType> getListener() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Listener());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServletType> getServlet() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Servlet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServletMappingType> getServletMapping() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_ServletMapping());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SessionConfigType> getSessionConfig() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_SessionConfig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MimeMappingType> getMimeMapping() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_MimeMapping());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WelcomeFileListType> getWelcomeFileList() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_WelcomeFileList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorPageType> getErrorPage() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_ErrorPage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JspConfigType> getJspConfig() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_JspConfig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityConstraintType> getSecurityConstraint() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_SecurityConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoginConfigType> getLoginConfig() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_LoginConfig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleType> getSecurityRole() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_SecurityRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_EnvEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbRefType> getEjbRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_EjbRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbLocalRefType> getEjbLocalRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_EjbLocalRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRefType> getServiceRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_ServiceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_ResourceRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceEnvRefType> getResourceEnvRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_ResourceEnvRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestinationRefType> getMessageDestinationRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_MessageDestinationRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistenceContextRefType> getPersistenceContextRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_PersistenceContextRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistenceUnitRefType> getPersistenceUnitRef() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_PersistenceUnitRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPostConstruct() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_PostConstruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPreDestroy() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_PreDestroy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceType> getDataSource() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_DataSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestinationType> getMessageDestination() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_MessageDestination());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocaleEncodingMappingListType> getLocaleEncodingMappingList() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_LocaleEncodingMappingList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderingType> getOrdering() {
		return getGroup().list(Webapp30Package.eINSTANCE.getWebFragmentType_Ordering());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.WEB_FRAGMENT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.WEB_FRAGMENT_TYPE__METADATA_COMPLETE, oldMetadataComplete, metadataComplete, !oldMetadataCompleteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Webapp30Package.WEB_FRAGMENT_TYPE__METADATA_COMPLETE, oldMetadataComplete, METADATA_COMPLETE_EDEFAULT, oldMetadataCompleteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.WEB_FRAGMENT_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Webapp30Package.WEB_FRAGMENT_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case Webapp30Package.WEB_FRAGMENT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISTRIBUTABLE:
				return ((InternalEList<?>)getDistributable()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__CONTEXT_PARAM:
				return ((InternalEList<?>)getContextParam()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER_MAPPING:
				return ((InternalEList<?>)getFilterMapping()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__LISTENER:
				return ((InternalEList<?>)getListener()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET:
				return ((InternalEList<?>)getServlet()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET_MAPPING:
				return ((InternalEList<?>)getServletMapping()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__SESSION_CONFIG:
				return ((InternalEList<?>)getSessionConfig()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__MIME_MAPPING:
				return ((InternalEList<?>)getMimeMapping()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__WELCOME_FILE_LIST:
				return ((InternalEList<?>)getWelcomeFileList()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__ERROR_PAGE:
				return ((InternalEList<?>)getErrorPage()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__JSP_CONFIG:
				return ((InternalEList<?>)getJspConfig()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_CONSTRAINT:
				return ((InternalEList<?>)getSecurityConstraint()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOGIN_CONFIG:
				return ((InternalEList<?>)getLoginConfig()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_ROLE:
				return ((InternalEList<?>)getSecurityRole()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVICE_REF:
				return ((InternalEList<?>)getServiceRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION_REF:
				return ((InternalEList<?>)getMessageDestinationRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_CONTEXT_REF:
				return ((InternalEList<?>)getPersistenceContextRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_UNIT_REF:
				return ((InternalEList<?>)getPersistenceUnitRef()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__POST_CONSTRUCT:
				return ((InternalEList<?>)getPostConstruct()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__PRE_DESTROY:
				return ((InternalEList<?>)getPreDestroy()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__DATA_SOURCE:
				return ((InternalEList<?>)getDataSource()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION:
				return ((InternalEList<?>)getMessageDestination()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				return ((InternalEList<?>)getLocaleEncodingMappingList()).basicRemove(otherEnd, msgs);
			case Webapp30Package.WEB_FRAGMENT_TYPE__ORDERING:
				return ((InternalEList<?>)getOrdering()).basicRemove(otherEnd, msgs);
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
			case Webapp30Package.WEB_FRAGMENT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Webapp30Package.WEB_FRAGMENT_TYPE__NAME:
				return getName();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ICON:
				return getIcon();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISTRIBUTABLE:
				return getDistributable();
			case Webapp30Package.WEB_FRAGMENT_TYPE__CONTEXT_PARAM:
				return getContextParam();
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER:
				return getFilter();
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER_MAPPING:
				return getFilterMapping();
			case Webapp30Package.WEB_FRAGMENT_TYPE__LISTENER:
				return getListener();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET:
				return getServlet();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET_MAPPING:
				return getServletMapping();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SESSION_CONFIG:
				return getSessionConfig();
			case Webapp30Package.WEB_FRAGMENT_TYPE__MIME_MAPPING:
				return getMimeMapping();
			case Webapp30Package.WEB_FRAGMENT_TYPE__WELCOME_FILE_LIST:
				return getWelcomeFileList();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ERROR_PAGE:
				return getErrorPage();
			case Webapp30Package.WEB_FRAGMENT_TYPE__JSP_CONFIG:
				return getJspConfig();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_CONSTRAINT:
				return getSecurityConstraint();
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOGIN_CONFIG:
				return getLoginConfig();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_ROLE:
				return getSecurityRole();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_REF:
				return getEjbRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVICE_REF:
				return getServiceRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_REF:
				return getResourceRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION_REF:
				return getMessageDestinationRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_CONTEXT_REF:
				return getPersistenceContextRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_UNIT_REF:
				return getPersistenceUnitRef();
			case Webapp30Package.WEB_FRAGMENT_TYPE__POST_CONSTRUCT:
				return getPostConstruct();
			case Webapp30Package.WEB_FRAGMENT_TYPE__PRE_DESTROY:
				return getPreDestroy();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DATA_SOURCE:
				return getDataSource();
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION:
				return getMessageDestination();
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				return getLocaleEncodingMappingList();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ORDERING:
				return getOrdering();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ID:
				return getId();
			case Webapp30Package.WEB_FRAGMENT_TYPE__METADATA_COMPLETE:
				return isMetadataComplete();
			case Webapp30Package.WEB_FRAGMENT_TYPE__VERSION:
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
			case Webapp30Package.WEB_FRAGMENT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends JavaIdentifierType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISTRIBUTABLE:
				getDistributable().clear();
				getDistributable().addAll((Collection<? extends EmptyType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__CONTEXT_PARAM:
				getContextParam().clear();
				getContextParam().addAll((Collection<? extends ParamValueType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER_MAPPING:
				getFilterMapping().clear();
				getFilterMapping().addAll((Collection<? extends FilterMappingType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__LISTENER:
				getListener().clear();
				getListener().addAll((Collection<? extends ListenerType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET:
				getServlet().clear();
				getServlet().addAll((Collection<? extends ServletType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET_MAPPING:
				getServletMapping().clear();
				getServletMapping().addAll((Collection<? extends ServletMappingType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SESSION_CONFIG:
				getSessionConfig().clear();
				getSessionConfig().addAll((Collection<? extends SessionConfigType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__MIME_MAPPING:
				getMimeMapping().clear();
				getMimeMapping().addAll((Collection<? extends MimeMappingType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__WELCOME_FILE_LIST:
				getWelcomeFileList().clear();
				getWelcomeFileList().addAll((Collection<? extends WelcomeFileListType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ERROR_PAGE:
				getErrorPage().clear();
				getErrorPage().addAll((Collection<? extends ErrorPageType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__JSP_CONFIG:
				getJspConfig().clear();
				getJspConfig().addAll((Collection<? extends JspConfigType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_CONSTRAINT:
				getSecurityConstraint().clear();
				getSecurityConstraint().addAll((Collection<? extends SecurityConstraintType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOGIN_CONFIG:
				getLoginConfig().clear();
				getLoginConfig().addAll((Collection<? extends LoginConfigType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				getSecurityRole().addAll((Collection<? extends SecurityRoleType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVICE_REF:
				getServiceRef().clear();
				getServiceRef().addAll((Collection<? extends ServiceRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				getMessageDestinationRef().addAll((Collection<? extends MessageDestinationRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				getPersistenceContextRef().addAll((Collection<? extends PersistenceContextRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				getPersistenceUnitRef().addAll((Collection<? extends PersistenceUnitRefType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				getPostConstruct().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				getPreDestroy().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends DataSourceType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION:
				getMessageDestination().clear();
				getMessageDestination().addAll((Collection<? extends MessageDestinationType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				getLocaleEncodingMappingList().clear();
				getLocaleEncodingMappingList().addAll((Collection<? extends LocaleEncodingMappingListType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ORDERING:
				getOrdering().clear();
				getOrdering().addAll((Collection<? extends OrderingType>)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ID:
				setId((String)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__METADATA_COMPLETE:
				setMetadataComplete((Boolean)newValue);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__VERSION:
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
			case Webapp30Package.WEB_FRAGMENT_TYPE__GROUP:
				getGroup().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__NAME:
				getName().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ICON:
				getIcon().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISTRIBUTABLE:
				getDistributable().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__CONTEXT_PARAM:
				getContextParam().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER:
				getFilter().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER_MAPPING:
				getFilterMapping().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__LISTENER:
				getListener().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET:
				getServlet().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET_MAPPING:
				getServletMapping().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SESSION_CONFIG:
				getSessionConfig().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__MIME_MAPPING:
				getMimeMapping().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__WELCOME_FILE_LIST:
				getWelcomeFileList().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ERROR_PAGE:
				getErrorPage().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__JSP_CONFIG:
				getJspConfig().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_CONSTRAINT:
				getSecurityConstraint().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOGIN_CONFIG:
				getLoginConfig().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVICE_REF:
				getServiceRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__DATA_SOURCE:
				getDataSource().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION:
				getMessageDestination().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				getLocaleEncodingMappingList().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ORDERING:
				getOrdering().clear();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__METADATA_COMPLETE:
				unsetMetadataComplete();
				return;
			case Webapp30Package.WEB_FRAGMENT_TYPE__VERSION:
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
			case Webapp30Package.WEB_FRAGMENT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__NAME:
				return !getName().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISPLAY_NAME:
				return !getDisplayName().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ICON:
				return !getIcon().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DISTRIBUTABLE:
				return !getDistributable().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__CONTEXT_PARAM:
				return !getContextParam().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER:
				return !getFilter().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__FILTER_MAPPING:
				return !getFilterMapping().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__LISTENER:
				return !getListener().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET:
				return !getServlet().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVLET_MAPPING:
				return !getServletMapping().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SESSION_CONFIG:
				return !getSessionConfig().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__MIME_MAPPING:
				return !getMimeMapping().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__WELCOME_FILE_LIST:
				return !getWelcomeFileList().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ERROR_PAGE:
				return !getErrorPage().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__JSP_CONFIG:
				return !getJspConfig().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_CONSTRAINT:
				return !getSecurityConstraint().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOGIN_CONFIG:
				return !getLoginConfig().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SECURITY_ROLE:
				return !getSecurityRole().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ENV_ENTRY:
				return !getEnvEntry().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_REF:
				return !getEjbRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__EJB_LOCAL_REF:
				return !getEjbLocalRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__SERVICE_REF:
				return !getServiceRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_REF:
				return !getResourceRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__RESOURCE_ENV_REF:
				return !getResourceEnvRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION_REF:
				return !getMessageDestinationRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_CONTEXT_REF:
				return !getPersistenceContextRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__PERSISTENCE_UNIT_REF:
				return !getPersistenceUnitRef().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__POST_CONSTRUCT:
				return !getPostConstruct().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__PRE_DESTROY:
				return !getPreDestroy().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__DATA_SOURCE:
				return !getDataSource().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION:
				return !getMessageDestination().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__LOCALE_ENCODING_MAPPING_LIST:
				return !getLocaleEncodingMappingList().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ORDERING:
				return !getOrdering().isEmpty();
			case Webapp30Package.WEB_FRAGMENT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Webapp30Package.WEB_FRAGMENT_TYPE__METADATA_COMPLETE:
				return isSetMetadataComplete();
			case Webapp30Package.WEB_FRAGMENT_TYPE__VERSION:
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
		result.append(", metadataComplete: "); //$NON-NLS-1$
		if (metadataCompleteESet) result.append(metadataComplete); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", version: "); //$NON-NLS-1$
		if (versionESet) result.append(version); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //WebFragmentTypeImpl
