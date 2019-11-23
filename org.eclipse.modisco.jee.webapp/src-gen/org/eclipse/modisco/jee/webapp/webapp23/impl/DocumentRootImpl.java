/**
 *   Copyright (c) 2010, 2019 Mia-Software.
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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp23.ContextParamType;
import org.eclipse.modisco.jee.webapp.webapp23.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp23.DistributableType;
import org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp23.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType;
import org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.ExtensionType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterClassType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterType;
import org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType;
import org.eclipse.modisco.jee.webapp.webapp23.HomeType;
import org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType;
import org.eclipse.modisco.jee.webapp.webapp23.IconType;
import org.eclipse.modisco.jee.webapp.webapp23.InitParamType;
import org.eclipse.modisco.jee.webapp.webapp23.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp23.LargeIconType;
import org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType;
import org.eclipse.modisco.jee.webapp.webapp23.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType;
import org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp23.LocalType;
import org.eclipse.modisco.jee.webapp.webapp23.LocationType;
import org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.ParamNameType;
import org.eclipse.modisco.jee.webapp.webapp23.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp23.RealmNameType;
import org.eclipse.modisco.jee.webapp.webapp23.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp23.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType;
import org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp23.ResTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType;
import org.eclipse.modisco.jee.webapp.webapp23.RoleNameType;
import org.eclipse.modisco.jee.webapp.webapp23.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletClassType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletType;
import org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType;
import org.eclipse.modisco.jee.webapp.webapp23.SmallIconType;
import org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType;
import org.eclipse.modisco.jee.webapp.webapp23.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType;
import org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp23.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;
import org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType;
import org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getAuthConstraint <em>Auth Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getContextParam <em>Context Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getDistributable <em>Distributable</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getFilterClass <em>Filter Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getFilterMapping <em>Filter Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getFormErrorPage <em>Form Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getFormLoginConfig <em>Form Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getFormLoginPage <em>Form Login Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getJspFile <em>Jsp File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getListenerClass <em>Listener Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getLoginConfig <em>Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getMimeMapping <em>Mime Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getParamValue <em>Param Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getRealmName <em>Realm Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getRoleLink <em>Role Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getSecurityConstraint <em>Security Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getServlet <em>Servlet</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getServletClass <em>Servlet Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getSessionConfig <em>Session Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getTaglib <em>Taglib</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getTaglibLocation <em>Taglib Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getTaglibUri <em>Taglib Uri</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getTransportGuarantee <em>Transport Guarantee</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getUserDataConstraint <em>User Data Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getWebApp <em>Web App</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getWebResourceCollection <em>Web Resource Collection</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getWebResourceName <em>Web Resource Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getWelcomeFile <em>Welcome File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl#getWelcomeFileList <em>Welcome File List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Webapp23Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Webapp23Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Webapp23Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthConstraintType getAuthConstraint() {
		return (AuthConstraintType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__AUTH_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthConstraint(AuthConstraintType newAuthConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__AUTH_CONSTRAINT, newAuthConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthConstraint(AuthConstraintType newAuthConstraint) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__AUTH_CONSTRAINT, newAuthConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthMethodType getAuthMethod() {
		return (AuthMethodType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__AUTH_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthMethod(AuthMethodType newAuthMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__AUTH_METHOD, newAuthMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthMethod(AuthMethodType newAuthMethod) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__AUTH_METHOD, newAuthMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextParamType getContextParam() {
		return (ContextParamType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__CONTEXT_PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextParam(ContextParamType newContextParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__CONTEXT_PARAM, newContextParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextParam(ContextParamType newContextParam) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__CONTEXT_PARAM, newContextParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameType getDisplayName() {
		return (DisplayNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(DisplayNameType newDisplayName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, newDisplayName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(DisplayNameType newDisplayName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, newDisplayName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributableType getDistributable() {
		return (DistributableType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__DISTRIBUTABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributable(DistributableType newDistributable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__DISTRIBUTABLE, newDistributable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributable(DistributableType newDistributable) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__DISTRIBUTABLE, newDistributable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLinkType getEjbLink() {
		return (EjbLinkType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbLink(EjbLinkType newEjbLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_LINK, newEjbLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbLink(EjbLinkType newEjbLink) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_LINK, newEjbLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLocalRefType getEjbLocalRef() {
		return (EjbLocalRefType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_LOCAL_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbLocalRef(EjbLocalRefType newEjbLocalRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_LOCAL_REF, newEjbLocalRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbLocalRef(EjbLocalRefType newEjbLocalRef) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_LOCAL_REF, newEjbLocalRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefType getEjbRef() {
		return (EjbRefType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRef(EjbRefType newEjbRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF, newEjbRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRef(EjbRefType newEjbRef) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF, newEjbRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefNameType getEjbRefName() {
		return (EjbRefNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefName(EjbRefNameType newEjbRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, newEjbRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefName(EjbRefNameType newEjbRefName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, newEjbRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeType getEjbRefType() {
		return (EjbRefTypeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefType(EjbRefTypeType newEjbRefType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, newEjbRefType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefType(EjbRefTypeType newEjbRefType) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, newEjbRefType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryType getEnvEntry() {
		return (EnvEntryType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntry(EnvEntryType newEnvEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, newEnvEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntry(EnvEntryType newEnvEntry) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, newEnvEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryNameType getEnvEntryName() {
		return (EnvEntryNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryName(EnvEntryNameType newEnvEntryName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, newEnvEntryName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryName(EnvEntryNameType newEnvEntryName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, newEnvEntryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeType getEnvEntryType() {
		return (EnvEntryTypeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryType(EnvEntryTypeType newEnvEntryType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, newEnvEntryType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryType(EnvEntryTypeType newEnvEntryType) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, newEnvEntryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryValueType getEnvEntryValue() {
		return (EnvEntryValueType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryValue(EnvEntryValueType newEnvEntryValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, newEnvEntryValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryValue(EnvEntryValueType newEnvEntryValue) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, newEnvEntryValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeType getErrorCode() {
		return (ErrorCodeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ERROR_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorCode(ErrorCodeType newErrorCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ERROR_CODE, newErrorCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(ErrorCodeType newErrorCode) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ERROR_CODE, newErrorCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPageType getErrorPage() {
		return (ErrorPageType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ERROR_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorPage(ErrorPageType newErrorPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ERROR_PAGE, newErrorPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorPage(ErrorPageType newErrorPage) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ERROR_PAGE, newErrorPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionTypeType getExceptionType() {
		return (ExceptionTypeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__EXCEPTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionType(ExceptionTypeType newExceptionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__EXCEPTION_TYPE, newExceptionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType(ExceptionTypeType newExceptionType) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__EXCEPTION_TYPE, newExceptionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionType getExtension() {
		return (ExtensionType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(ExtensionType newExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__EXTENSION, newExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(ExtensionType newExtension) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__EXTENSION, newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilter() {
		return (FilterType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER, newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterType newFilter) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER, newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterClassType getFilterClass() {
		return (FilterClassType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterClass(FilterClassType newFilterClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_CLASS, newFilterClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterClass(FilterClassType newFilterClass) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_CLASS, newFilterClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterMappingType getFilterMapping() {
		return (FilterMappingType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterMapping(FilterMappingType newFilterMapping, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_MAPPING, newFilterMapping, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterMapping(FilterMappingType newFilterMapping) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_MAPPING, newFilterMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterNameType getFilterName() {
		return (FilterNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterName(FilterNameType newFilterName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_NAME, newFilterName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(FilterNameType newFilterName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__FILTER_NAME, newFilterName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormErrorPageType getFormErrorPage() {
		return (FormErrorPageType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_ERROR_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormErrorPage(FormErrorPageType newFormErrorPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_ERROR_PAGE, newFormErrorPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormErrorPage(FormErrorPageType newFormErrorPage) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_ERROR_PAGE, newFormErrorPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLoginConfigType getFormLoginConfig() {
		return (FormLoginConfigType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_LOGIN_CONFIG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormLoginConfig(FormLoginConfigType newFormLoginConfig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_LOGIN_CONFIG, newFormLoginConfig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormLoginConfig(FormLoginConfigType newFormLoginConfig) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_LOGIN_CONFIG, newFormLoginConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLoginPageType getFormLoginPage() {
		return (FormLoginPageType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_LOGIN_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormLoginPage(FormLoginPageType newFormLoginPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_LOGIN_PAGE, newFormLoginPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormLoginPage(FormLoginPageType newFormLoginPage) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__FORM_LOGIN_PAGE, newFormLoginPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType getHome() {
		return (HomeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__HOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHome(HomeType newHome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__HOME, newHome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(HomeType newHome) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__HOME, newHome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethodType getHttpMethod() {
		return (HttpMethodType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__HTTP_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpMethod(HttpMethodType newHttpMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__HTTP_METHOD, newHttpMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpMethod(HttpMethodType newHttpMethod) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__HTTP_METHOD, newHttpMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconType getIcon() {
		return (IconType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(IconType newIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ICON, newIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(IconType newIcon) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitParamType getInitParam() {
		return (InitParamType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__INIT_PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitParam(InitParamType newInitParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__INIT_PARAM, newInitParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitParam(InitParamType newInitParam) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__INIT_PARAM, newInitParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspFileType getJspFile() {
		return (JspFileType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__JSP_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJspFile(JspFileType newJspFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__JSP_FILE, newJspFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJspFile(JspFileType newJspFile) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__JSP_FILE, newJspFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeIconType getLargeIcon() {
		return (LargeIconType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LARGE_ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeIcon(LargeIconType newLargeIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LARGE_ICON, newLargeIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeIcon(LargeIconType newLargeIcon) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LARGE_ICON, newLargeIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenerType getListener() {
		return (ListenerType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LISTENER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListener(ListenerType newListener, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LISTENER, newListener, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListener(ListenerType newListener) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LISTENER, newListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenerClassType getListenerClass() {
		return (ListenerClassType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LISTENER_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListenerClass(ListenerClassType newListenerClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LISTENER_CLASS, newListenerClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListenerClass(ListenerClassType newListenerClass) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LISTENER_CLASS, newListenerClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadOnStartupType getLoadOnStartup() {
		return (LoadOnStartupType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LOAD_ON_STARTUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadOnStartup(LoadOnStartupType newLoadOnStartup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LOAD_ON_STARTUP, newLoadOnStartup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadOnStartup(LoadOnStartupType newLoadOnStartup) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LOAD_ON_STARTUP, newLoadOnStartup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType getLocal() {
		return (LocalType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal(LocalType newLocal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LOCAL, newLocal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(LocalType newLocal) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LOCAL, newLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHomeType getLocalHome() {
		return (LocalHomeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LOCAL_HOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalHome(LocalHomeType newLocalHome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LOCAL_HOME, newLocalHome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalHome(LocalHomeType newLocalHome) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LOCAL_HOME, newLocalHome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getLocation() {
		return (LocationType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LOCATION, newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationType newLocation) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginConfigType getLoginConfig() {
		return (LoginConfigType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__LOGIN_CONFIG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoginConfig(LoginConfigType newLoginConfig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__LOGIN_CONFIG, newLoginConfig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginConfig(LoginConfigType newLoginConfig) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__LOGIN_CONFIG, newLoginConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeMappingType getMimeMapping() {
		return (MimeMappingType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__MIME_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMimeMapping(MimeMappingType newMimeMapping, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__MIME_MAPPING, newMimeMapping, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeMapping(MimeMappingType newMimeMapping) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__MIME_MAPPING, newMimeMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeType getMimeType() {
		return (MimeTypeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__MIME_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMimeType(MimeTypeType newMimeType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__MIME_TYPE, newMimeType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(MimeTypeType newMimeType) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__MIME_TYPE, newMimeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamNameType getParamName() {
		return (ParamNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__PARAM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamName(ParamNameType newParamName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__PARAM_NAME, newParamName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamName(ParamNameType newParamName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__PARAM_NAME, newParamName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValueType getParamValue() {
		return (ParamValueType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__PARAM_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamValue(ParamValueType newParamValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__PARAM_VALUE, newParamValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamValue(ParamValueType newParamValue) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__PARAM_VALUE, newParamValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealmNameType getRealmName() {
		return (RealmNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__REALM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealmName(RealmNameType newRealmName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__REALM_NAME, newRealmName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealmName(RealmNameType newRealmName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__REALM_NAME, newRealmName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType getRemote() {
		return (RemoteType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__REMOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemote(RemoteType newRemote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__REMOTE, newRemote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(RemoteType newRemote) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__REMOTE, newRemote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType getResAuth() {
		return (ResAuthType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RES_AUTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResAuth(ResAuthType newResAuth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RES_AUTH, newResAuth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResAuth(ResAuthType newResAuth) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RES_AUTH, newResAuth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefType getResourceEnvRef() {
		return (ResourceEnvRefType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRef(ResourceEnvRefType newResourceEnvRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF, newResourceEnvRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRef(ResourceEnvRefType newResourceEnvRef) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF, newResourceEnvRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefNameType getResourceEnvRefName() {
		return (ResourceEnvRefNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefName(ResourceEnvRefNameType newResourceEnvRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME, newResourceEnvRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefName(ResourceEnvRefNameType newResourceEnvRefName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME, newResourceEnvRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefTypeType getResourceEnvRefType() {
		return (ResourceEnvRefTypeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefType(ResourceEnvRefTypeType newResourceEnvRefType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE, newResourceEnvRefType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefType(ResourceEnvRefTypeType newResourceEnvRefType) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE, newResourceEnvRefType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRefType getResourceRef() {
		return (ResourceRefType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceRef(ResourceRefType newResourceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, newResourceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(ResourceRefType newResourceRef) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, newResourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResRefNameType getResRefName() {
		return (ResRefNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResRefName(ResRefNameType newResRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, newResRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResRefName(ResRefNameType newResRefName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, newResRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeType getResSharingScope() {
		return (ResSharingScopeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RES_SHARING_SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResSharingScope(ResSharingScopeType newResSharingScope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RES_SHARING_SCOPE, newResSharingScope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResSharingScope(ResSharingScopeType newResSharingScope) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RES_SHARING_SCOPE, newResSharingScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResTypeType getResType() {
		return (ResTypeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RES_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResType(ResTypeType newResType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RES_TYPE, newResType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResType(ResTypeType newResType) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RES_TYPE, newResType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleLinkType getRoleLink() {
		return (RoleLinkType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ROLE_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleLink(RoleLinkType newRoleLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ROLE_LINK, newRoleLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleLink(RoleLinkType newRoleLink) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ROLE_LINK, newRoleLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameType getRoleName() {
		return (RoleNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__ROLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleName(RoleNameType newRoleName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__ROLE_NAME, newRoleName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(RoleNameType newRoleName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__ROLE_NAME, newRoleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunAsType getRunAs() {
		return (RunAsType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__RUN_AS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunAs(RunAsType newRunAs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__RUN_AS, newRunAs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAs(RunAsType newRunAs) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__RUN_AS, newRunAs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraintType getSecurityConstraint() {
		return (SecurityConstraintType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityConstraint(SecurityConstraintType newSecurityConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_CONSTRAINT, newSecurityConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityConstraint(SecurityConstraintType newSecurityConstraint) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_CONSTRAINT, newSecurityConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleType getSecurityRole() {
		return (SecurityRoleType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityRole(SecurityRoleType newSecurityRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, newSecurityRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRole(SecurityRoleType newSecurityRole) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, newSecurityRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleRefType getSecurityRoleRef() {
		return (SecurityRoleRefType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityRoleRef(SecurityRoleRefType newSecurityRoleRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, newSecurityRoleRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRoleRef(SecurityRoleRefType newSecurityRoleRef) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, newSecurityRoleRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletType getServlet() {
		return (ServletType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServlet(ServletType newServlet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET, newServlet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServlet(ServletType newServlet) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET, newServlet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletClassType getServletClass() {
		return (ServletClassType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletClass(ServletClassType newServletClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_CLASS, newServletClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletClass(ServletClassType newServletClass) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_CLASS, newServletClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletMappingType getServletMapping() {
		return (ServletMappingType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletMapping(ServletMappingType newServletMapping, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_MAPPING, newServletMapping, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletMapping(ServletMappingType newServletMapping) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_MAPPING, newServletMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletNameType getServletName() {
		return (ServletNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletName(ServletNameType newServletName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_NAME, newServletName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletName(ServletNameType newServletName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SERVLET_NAME, newServletName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionConfigType getSessionConfig() {
		return (SessionConfigType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SESSION_CONFIG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionConfig(SessionConfigType newSessionConfig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SESSION_CONFIG, newSessionConfig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionConfig(SessionConfigType newSessionConfig) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SESSION_CONFIG, newSessionConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTimeoutType getSessionTimeout() {
		return (SessionTimeoutType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SESSION_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionTimeout(SessionTimeoutType newSessionTimeout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SESSION_TIMEOUT, newSessionTimeout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionTimeout(SessionTimeoutType newSessionTimeout) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SESSION_TIMEOUT, newSessionTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallIconType getSmallIcon() {
		return (SmallIconType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__SMALL_ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmallIcon(SmallIconType newSmallIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__SMALL_ICON, newSmallIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallIcon(SmallIconType newSmallIcon) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__SMALL_ICON, newSmallIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaglibType getTaglib() {
		return (TaglibType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaglib(TaglibType newTaglib, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB, newTaglib, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaglib(TaglibType newTaglib) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB, newTaglib);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaglibLocationType getTaglibLocation() {
		return (TaglibLocationType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaglibLocation(TaglibLocationType newTaglibLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB_LOCATION, newTaglibLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaglibLocation(TaglibLocationType newTaglibLocation) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB_LOCATION, newTaglibLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaglibUriType getTaglibUri() {
		return (TaglibUriType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaglibUri(TaglibUriType newTaglibUri, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB_URI, newTaglibUri, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaglibUri(TaglibUriType newTaglibUri) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__TAGLIB_URI, newTaglibUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportGuaranteeType getTransportGuarantee() {
		return (TransportGuaranteeType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__TRANSPORT_GUARANTEE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportGuarantee(TransportGuaranteeType newTransportGuarantee, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__TRANSPORT_GUARANTEE, newTransportGuarantee, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportGuarantee(TransportGuaranteeType newTransportGuarantee) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__TRANSPORT_GUARANTEE, newTransportGuarantee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlPatternType getUrlPattern() {
		return (UrlPatternType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__URL_PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrlPattern(UrlPatternType newUrlPattern, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__URL_PATTERN, newUrlPattern, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlPattern(UrlPatternType newUrlPattern) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__URL_PATTERN, newUrlPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDataConstraintType getUserDataConstraint() {
		return (UserDataConstraintType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__USER_DATA_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDataConstraint(UserDataConstraintType newUserDataConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__USER_DATA_CONSTRAINT, newUserDataConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDataConstraint(UserDataConstraintType newUserDataConstraint) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__USER_DATA_CONSTRAINT, newUserDataConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppType getWebApp() {
		return (WebAppType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_APP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebApp(WebAppType newWebApp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_APP, newWebApp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebApp(WebAppType newWebApp) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_APP, newWebApp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebResourceCollectionType getWebResourceCollection() {
		return (WebResourceCollectionType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebResourceCollection(WebResourceCollectionType newWebResourceCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION, newWebResourceCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebResourceCollection(WebResourceCollectionType newWebResourceCollection) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION, newWebResourceCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebResourceNameType getWebResourceName() {
		return (WebResourceNameType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_RESOURCE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebResourceName(WebResourceNameType newWebResourceName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_RESOURCE_NAME, newWebResourceName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebResourceName(WebResourceNameType newWebResourceName) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__WEB_RESOURCE_NAME, newWebResourceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFileType getWelcomeFile() {
		return (WelcomeFileType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__WELCOME_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWelcomeFile(WelcomeFileType newWelcomeFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__WELCOME_FILE, newWelcomeFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeFile(WelcomeFileType newWelcomeFile) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__WELCOME_FILE, newWelcomeFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFileListType getWelcomeFileList() {
		return (WelcomeFileListType)getMixed().get(Webapp23Package.Literals.DOCUMENT_ROOT__WELCOME_FILE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWelcomeFileList(WelcomeFileListType newWelcomeFileList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Webapp23Package.Literals.DOCUMENT_ROOT__WELCOME_FILE_LIST, newWelcomeFileList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeFileList(WelcomeFileListType newWelcomeFileList) {
		((FeatureMap.Internal)getMixed()).set(Webapp23Package.Literals.DOCUMENT_ROOT__WELCOME_FILE_LIST, newWelcomeFileList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Webapp23Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Webapp23Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Webapp23Package.DOCUMENT_ROOT__AUTH_CONSTRAINT:
				return basicSetAuthConstraint(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__AUTH_METHOD:
				return basicSetAuthMethod(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__CONTEXT_PARAM:
				return basicSetContextParam(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__DISTRIBUTABLE:
				return basicSetDistributable(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__EJB_LINK:
				return basicSetEjbLink(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				return basicSetEjbLocalRef(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF:
				return basicSetEjbRef(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return basicSetEjbRefName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return basicSetEjbRefType(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY:
				return basicSetEnvEntry(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return basicSetEnvEntryName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return basicSetEnvEntryType(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return basicSetEnvEntryValue(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ERROR_CODE:
				return basicSetErrorCode(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ERROR_PAGE:
				return basicSetErrorPage(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__EXCEPTION_TYPE:
				return basicSetExceptionType(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__EXTENSION:
				return basicSetExtension(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__FILTER_CLASS:
				return basicSetFilterClass(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__FILTER_MAPPING:
				return basicSetFilterMapping(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__FILTER_NAME:
				return basicSetFilterName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__FORM_ERROR_PAGE:
				return basicSetFormErrorPage(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_CONFIG:
				return basicSetFormLoginConfig(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_PAGE:
				return basicSetFormLoginPage(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__HOME:
				return basicSetHome(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__HTTP_METHOD:
				return basicSetHttpMethod(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ICON:
				return basicSetIcon(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__INIT_PARAM:
				return basicSetInitParam(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__JSP_FILE:
				return basicSetJspFile(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LARGE_ICON:
				return basicSetLargeIcon(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LISTENER:
				return basicSetListener(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LISTENER_CLASS:
				return basicSetListenerClass(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LOAD_ON_STARTUP:
				return basicSetLoadOnStartup(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LOCAL:
				return basicSetLocal(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LOCAL_HOME:
				return basicSetLocalHome(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__LOGIN_CONFIG:
				return basicSetLoginConfig(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__MIME_MAPPING:
				return basicSetMimeMapping(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__MIME_TYPE:
				return basicSetMimeType(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__PARAM_NAME:
				return basicSetParamName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__PARAM_VALUE:
				return basicSetParamValue(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__REALM_NAME:
				return basicSetRealmName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__REMOTE:
				return basicSetRemote(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RES_AUTH:
				return basicSetResAuth(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				return basicSetResourceEnvRef(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				return basicSetResourceEnvRefName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				return basicSetResourceEnvRefType(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_REF:
				return basicSetResourceRef(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RES_REF_NAME:
				return basicSetResRefName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				return basicSetResSharingScope(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RES_TYPE:
				return basicSetResType(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ROLE_LINK:
				return basicSetRoleLink(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__ROLE_NAME:
				return basicSetRoleName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__RUN_AS:
				return basicSetRunAs(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_CONSTRAINT:
				return basicSetSecurityConstraint(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return basicSetSecurityRole(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return basicSetSecurityRoleRef(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SERVLET:
				return basicSetServlet(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_CLASS:
				return basicSetServletClass(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_MAPPING:
				return basicSetServletMapping(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_NAME:
				return basicSetServletName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SESSION_CONFIG:
				return basicSetSessionConfig(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SESSION_TIMEOUT:
				return basicSetSessionTimeout(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__SMALL_ICON:
				return basicSetSmallIcon(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB:
				return basicSetTaglib(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_LOCATION:
				return basicSetTaglibLocation(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_URI:
				return basicSetTaglibUri(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__TRANSPORT_GUARANTEE:
				return basicSetTransportGuarantee(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__URL_PATTERN:
				return basicSetUrlPattern(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__USER_DATA_CONSTRAINT:
				return basicSetUserDataConstraint(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__WEB_APP:
				return basicSetWebApp(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION:
				return basicSetWebResourceCollection(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_NAME:
				return basicSetWebResourceName(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE:
				return basicSetWelcomeFile(null, msgs);
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE_LIST:
				return basicSetWelcomeFileList(null, msgs);
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
			case Webapp23Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Webapp23Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Webapp23Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Webapp23Package.DOCUMENT_ROOT__AUTH_CONSTRAINT:
				return getAuthConstraint();
			case Webapp23Package.DOCUMENT_ROOT__AUTH_METHOD:
				return getAuthMethod();
			case Webapp23Package.DOCUMENT_ROOT__CONTEXT_PARAM:
				return getContextParam();
			case Webapp23Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case Webapp23Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName();
			case Webapp23Package.DOCUMENT_ROOT__DISTRIBUTABLE:
				return getDistributable();
			case Webapp23Package.DOCUMENT_ROOT__EJB_LINK:
				return getEjbLink();
			case Webapp23Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF:
				return getEjbRef();
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return getEjbRefName();
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return getEjbRefType();
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY:
				return getEnvEntry();
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return getEnvEntryName();
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return getEnvEntryType();
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return getEnvEntryValue();
			case Webapp23Package.DOCUMENT_ROOT__ERROR_CODE:
				return getErrorCode();
			case Webapp23Package.DOCUMENT_ROOT__ERROR_PAGE:
				return getErrorPage();
			case Webapp23Package.DOCUMENT_ROOT__EXCEPTION_TYPE:
				return getExceptionType();
			case Webapp23Package.DOCUMENT_ROOT__EXTENSION:
				return getExtension();
			case Webapp23Package.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case Webapp23Package.DOCUMENT_ROOT__FILTER_CLASS:
				return getFilterClass();
			case Webapp23Package.DOCUMENT_ROOT__FILTER_MAPPING:
				return getFilterMapping();
			case Webapp23Package.DOCUMENT_ROOT__FILTER_NAME:
				return getFilterName();
			case Webapp23Package.DOCUMENT_ROOT__FORM_ERROR_PAGE:
				return getFormErrorPage();
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_CONFIG:
				return getFormLoginConfig();
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_PAGE:
				return getFormLoginPage();
			case Webapp23Package.DOCUMENT_ROOT__HOME:
				return getHome();
			case Webapp23Package.DOCUMENT_ROOT__HTTP_METHOD:
				return getHttpMethod();
			case Webapp23Package.DOCUMENT_ROOT__ICON:
				return getIcon();
			case Webapp23Package.DOCUMENT_ROOT__INIT_PARAM:
				return getInitParam();
			case Webapp23Package.DOCUMENT_ROOT__JSP_FILE:
				return getJspFile();
			case Webapp23Package.DOCUMENT_ROOT__LARGE_ICON:
				return getLargeIcon();
			case Webapp23Package.DOCUMENT_ROOT__LISTENER:
				return getListener();
			case Webapp23Package.DOCUMENT_ROOT__LISTENER_CLASS:
				return getListenerClass();
			case Webapp23Package.DOCUMENT_ROOT__LOAD_ON_STARTUP:
				return getLoadOnStartup();
			case Webapp23Package.DOCUMENT_ROOT__LOCAL:
				return getLocal();
			case Webapp23Package.DOCUMENT_ROOT__LOCAL_HOME:
				return getLocalHome();
			case Webapp23Package.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case Webapp23Package.DOCUMENT_ROOT__LOGIN_CONFIG:
				return getLoginConfig();
			case Webapp23Package.DOCUMENT_ROOT__MIME_MAPPING:
				return getMimeMapping();
			case Webapp23Package.DOCUMENT_ROOT__MIME_TYPE:
				return getMimeType();
			case Webapp23Package.DOCUMENT_ROOT__PARAM_NAME:
				return getParamName();
			case Webapp23Package.DOCUMENT_ROOT__PARAM_VALUE:
				return getParamValue();
			case Webapp23Package.DOCUMENT_ROOT__REALM_NAME:
				return getRealmName();
			case Webapp23Package.DOCUMENT_ROOT__REMOTE:
				return getRemote();
			case Webapp23Package.DOCUMENT_ROOT__RES_AUTH:
				return getResAuth();
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				return getResourceEnvRefName();
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				return getResourceEnvRefType();
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_REF:
				return getResourceRef();
			case Webapp23Package.DOCUMENT_ROOT__RES_REF_NAME:
				return getResRefName();
			case Webapp23Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				return getResSharingScope();
			case Webapp23Package.DOCUMENT_ROOT__RES_TYPE:
				return getResType();
			case Webapp23Package.DOCUMENT_ROOT__ROLE_LINK:
				return getRoleLink();
			case Webapp23Package.DOCUMENT_ROOT__ROLE_NAME:
				return getRoleName();
			case Webapp23Package.DOCUMENT_ROOT__RUN_AS:
				return getRunAs();
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_CONSTRAINT:
				return getSecurityConstraint();
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return getSecurityRole();
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case Webapp23Package.DOCUMENT_ROOT__SERVLET:
				return getServlet();
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_CLASS:
				return getServletClass();
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_MAPPING:
				return getServletMapping();
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_NAME:
				return getServletName();
			case Webapp23Package.DOCUMENT_ROOT__SESSION_CONFIG:
				return getSessionConfig();
			case Webapp23Package.DOCUMENT_ROOT__SESSION_TIMEOUT:
				return getSessionTimeout();
			case Webapp23Package.DOCUMENT_ROOT__SMALL_ICON:
				return getSmallIcon();
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB:
				return getTaglib();
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_LOCATION:
				return getTaglibLocation();
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_URI:
				return getTaglibUri();
			case Webapp23Package.DOCUMENT_ROOT__TRANSPORT_GUARANTEE:
				return getTransportGuarantee();
			case Webapp23Package.DOCUMENT_ROOT__URL_PATTERN:
				return getUrlPattern();
			case Webapp23Package.DOCUMENT_ROOT__USER_DATA_CONSTRAINT:
				return getUserDataConstraint();
			case Webapp23Package.DOCUMENT_ROOT__WEB_APP:
				return getWebApp();
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION:
				return getWebResourceCollection();
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_NAME:
				return getWebResourceName();
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE:
				return getWelcomeFile();
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE_LIST:
				return getWelcomeFileList();
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
			case Webapp23Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__AUTH_CONSTRAINT:
				setAuthConstraint((AuthConstraintType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__AUTH_METHOD:
				setAuthMethod((AuthMethodType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__CONTEXT_PARAM:
				setContextParam((ContextParamType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__DISTRIBUTABLE:
				setDistributable((DistributableType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_LINK:
				setEjbLink((EjbLinkType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				setEjbLocalRef((EjbLocalRefType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF:
				setEjbRef((EjbRefType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY:
				setEnvEntry((EnvEntryType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ERROR_CODE:
				setErrorCode((ErrorCodeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ERROR_PAGE:
				setErrorPage((ErrorPageType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EXCEPTION_TYPE:
				setExceptionType((ExceptionTypeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EXTENSION:
				setExtension((ExtensionType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_CLASS:
				setFilterClass((FilterClassType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_MAPPING:
				setFilterMapping((FilterMappingType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName((FilterNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FORM_ERROR_PAGE:
				setFormErrorPage((FormErrorPageType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_CONFIG:
				setFormLoginConfig((FormLoginConfigType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_PAGE:
				setFormLoginPage((FormLoginPageType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__HOME:
				setHome((HomeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__HTTP_METHOD:
				setHttpMethod((HttpMethodType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ICON:
				setIcon((IconType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__INIT_PARAM:
				setInitParam((InitParamType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__JSP_FILE:
				setJspFile((JspFileType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LARGE_ICON:
				setLargeIcon((LargeIconType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LISTENER:
				setListener((ListenerType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LISTENER_CLASS:
				setListenerClass((ListenerClassType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOAD_ON_STARTUP:
				setLoadOnStartup((LoadOnStartupType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOCAL:
				setLocal((LocalType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOCAL_HOME:
				setLocalHome((LocalHomeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOGIN_CONFIG:
				setLoginConfig((LoginConfigType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__MIME_MAPPING:
				setMimeMapping((MimeMappingType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__MIME_TYPE:
				setMimeType((MimeTypeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__PARAM_NAME:
				setParamName((ParamNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__PARAM_VALUE:
				setParamValue((ParamValueType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__REALM_NAME:
				setRealmName((RealmNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_AUTH:
				setResAuth((ResAuthType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				setResourceEnvRef((ResourceEnvRefType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((ResourceEnvRefNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((ResourceEnvRefTypeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_REF:
				setResourceRef((ResourceRefType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_REF_NAME:
				setResRefName((ResRefNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_TYPE:
				setResType((ResTypeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ROLE_LINK:
				setRoleLink((RoleLinkType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ROLE_NAME:
				setRoleName((RoleNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RUN_AS:
				setRunAs((RunAsType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_CONSTRAINT:
				setSecurityConstraint((SecurityConstraintType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE:
				setSecurityRole((SecurityRoleType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				setSecurityRoleRef((SecurityRoleRefType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET:
				setServlet((ServletType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_CLASS:
				setServletClass((ServletClassType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_MAPPING:
				setServletMapping((ServletMappingType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_NAME:
				setServletName((ServletNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SESSION_CONFIG:
				setSessionConfig((SessionConfigType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SESSION_TIMEOUT:
				setSessionTimeout((SessionTimeoutType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SMALL_ICON:
				setSmallIcon((SmallIconType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB:
				setTaglib((TaglibType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_LOCATION:
				setTaglibLocation((TaglibLocationType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_URI:
				setTaglibUri((TaglibUriType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TRANSPORT_GUARANTEE:
				setTransportGuarantee((TransportGuaranteeType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__URL_PATTERN:
				setUrlPattern((UrlPatternType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__USER_DATA_CONSTRAINT:
				setUserDataConstraint((UserDataConstraintType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WEB_APP:
				setWebApp((WebAppType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION:
				setWebResourceCollection((WebResourceCollectionType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_NAME:
				setWebResourceName((WebResourceNameType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE:
				setWelcomeFile((WelcomeFileType)newValue);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE_LIST:
				setWelcomeFileList((WelcomeFileListType)newValue);
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
			case Webapp23Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Webapp23Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Webapp23Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Webapp23Package.DOCUMENT_ROOT__AUTH_CONSTRAINT:
				setAuthConstraint((AuthConstraintType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__AUTH_METHOD:
				setAuthMethod((AuthMethodType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__CONTEXT_PARAM:
				setContextParam((ContextParamType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__DISTRIBUTABLE:
				setDistributable((DistributableType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_LINK:
				setEjbLink((EjbLinkType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				setEjbLocalRef((EjbLocalRefType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF:
				setEjbRef((EjbRefType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY:
				setEnvEntry((EnvEntryType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ERROR_CODE:
				setErrorCode((ErrorCodeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ERROR_PAGE:
				setErrorPage((ErrorPageType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EXCEPTION_TYPE:
				setExceptionType((ExceptionTypeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__EXTENSION:
				setExtension((ExtensionType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_CLASS:
				setFilterClass((FilterClassType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_MAPPING:
				setFilterMapping((FilterMappingType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName((FilterNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FORM_ERROR_PAGE:
				setFormErrorPage((FormErrorPageType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_CONFIG:
				setFormLoginConfig((FormLoginConfigType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_PAGE:
				setFormLoginPage((FormLoginPageType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__HOME:
				setHome((HomeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__HTTP_METHOD:
				setHttpMethod((HttpMethodType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ICON:
				setIcon((IconType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__INIT_PARAM:
				setInitParam((InitParamType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__JSP_FILE:
				setJspFile((JspFileType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LARGE_ICON:
				setLargeIcon((LargeIconType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LISTENER:
				setListener((ListenerType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LISTENER_CLASS:
				setListenerClass((ListenerClassType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOAD_ON_STARTUP:
				setLoadOnStartup((LoadOnStartupType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOCAL:
				setLocal((LocalType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOCAL_HOME:
				setLocalHome((LocalHomeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__LOGIN_CONFIG:
				setLoginConfig((LoginConfigType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__MIME_MAPPING:
				setMimeMapping((MimeMappingType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__MIME_TYPE:
				setMimeType((MimeTypeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__PARAM_NAME:
				setParamName((ParamNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__PARAM_VALUE:
				setParamValue((ParamValueType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__REALM_NAME:
				setRealmName((RealmNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__REMOTE:
				setRemote((RemoteType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_AUTH:
				setResAuth((ResAuthType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				setResourceEnvRef((ResourceEnvRefType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((ResourceEnvRefNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((ResourceEnvRefTypeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_REF:
				setResourceRef((ResourceRefType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_REF_NAME:
				setResRefName((ResRefNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RES_TYPE:
				setResType((ResTypeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ROLE_LINK:
				setRoleLink((RoleLinkType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__ROLE_NAME:
				setRoleName((RoleNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__RUN_AS:
				setRunAs((RunAsType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_CONSTRAINT:
				setSecurityConstraint((SecurityConstraintType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE:
				setSecurityRole((SecurityRoleType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				setSecurityRoleRef((SecurityRoleRefType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET:
				setServlet((ServletType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_CLASS:
				setServletClass((ServletClassType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_MAPPING:
				setServletMapping((ServletMappingType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_NAME:
				setServletName((ServletNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SESSION_CONFIG:
				setSessionConfig((SessionConfigType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SESSION_TIMEOUT:
				setSessionTimeout((SessionTimeoutType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__SMALL_ICON:
				setSmallIcon((SmallIconType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB:
				setTaglib((TaglibType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_LOCATION:
				setTaglibLocation((TaglibLocationType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_URI:
				setTaglibUri((TaglibUriType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__TRANSPORT_GUARANTEE:
				setTransportGuarantee((TransportGuaranteeType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__URL_PATTERN:
				setUrlPattern((UrlPatternType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__USER_DATA_CONSTRAINT:
				setUserDataConstraint((UserDataConstraintType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WEB_APP:
				setWebApp((WebAppType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION:
				setWebResourceCollection((WebResourceCollectionType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_NAME:
				setWebResourceName((WebResourceNameType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE:
				setWelcomeFile((WelcomeFileType)null);
				return;
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE_LIST:
				setWelcomeFileList((WelcomeFileListType)null);
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
			case Webapp23Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Webapp23Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Webapp23Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Webapp23Package.DOCUMENT_ROOT__AUTH_CONSTRAINT:
				return getAuthConstraint() != null;
			case Webapp23Package.DOCUMENT_ROOT__AUTH_METHOD:
				return getAuthMethod() != null;
			case Webapp23Package.DOCUMENT_ROOT__CONTEXT_PARAM:
				return getContextParam() != null;
			case Webapp23Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case Webapp23Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName() != null;
			case Webapp23Package.DOCUMENT_ROOT__DISTRIBUTABLE:
				return getDistributable() != null;
			case Webapp23Package.DOCUMENT_ROOT__EJB_LINK:
				return getEjbLink() != null;
			case Webapp23Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				return getEjbLocalRef() != null;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF:
				return getEjbRef() != null;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return getEjbRefName() != null;
			case Webapp23Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return getEjbRefType() != null;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY:
				return getEnvEntry() != null;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return getEnvEntryName() != null;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return getEnvEntryType() != null;
			case Webapp23Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return getEnvEntryValue() != null;
			case Webapp23Package.DOCUMENT_ROOT__ERROR_CODE:
				return getErrorCode() != null;
			case Webapp23Package.DOCUMENT_ROOT__ERROR_PAGE:
				return getErrorPage() != null;
			case Webapp23Package.DOCUMENT_ROOT__EXCEPTION_TYPE:
				return getExceptionType() != null;
			case Webapp23Package.DOCUMENT_ROOT__EXTENSION:
				return getExtension() != null;
			case Webapp23Package.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_CLASS:
				return getFilterClass() != null;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_MAPPING:
				return getFilterMapping() != null;
			case Webapp23Package.DOCUMENT_ROOT__FILTER_NAME:
				return getFilterName() != null;
			case Webapp23Package.DOCUMENT_ROOT__FORM_ERROR_PAGE:
				return getFormErrorPage() != null;
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_CONFIG:
				return getFormLoginConfig() != null;
			case Webapp23Package.DOCUMENT_ROOT__FORM_LOGIN_PAGE:
				return getFormLoginPage() != null;
			case Webapp23Package.DOCUMENT_ROOT__HOME:
				return getHome() != null;
			case Webapp23Package.DOCUMENT_ROOT__HTTP_METHOD:
				return getHttpMethod() != null;
			case Webapp23Package.DOCUMENT_ROOT__ICON:
				return getIcon() != null;
			case Webapp23Package.DOCUMENT_ROOT__INIT_PARAM:
				return getInitParam() != null;
			case Webapp23Package.DOCUMENT_ROOT__JSP_FILE:
				return getJspFile() != null;
			case Webapp23Package.DOCUMENT_ROOT__LARGE_ICON:
				return getLargeIcon() != null;
			case Webapp23Package.DOCUMENT_ROOT__LISTENER:
				return getListener() != null;
			case Webapp23Package.DOCUMENT_ROOT__LISTENER_CLASS:
				return getListenerClass() != null;
			case Webapp23Package.DOCUMENT_ROOT__LOAD_ON_STARTUP:
				return getLoadOnStartup() != null;
			case Webapp23Package.DOCUMENT_ROOT__LOCAL:
				return getLocal() != null;
			case Webapp23Package.DOCUMENT_ROOT__LOCAL_HOME:
				return getLocalHome() != null;
			case Webapp23Package.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case Webapp23Package.DOCUMENT_ROOT__LOGIN_CONFIG:
				return getLoginConfig() != null;
			case Webapp23Package.DOCUMENT_ROOT__MIME_MAPPING:
				return getMimeMapping() != null;
			case Webapp23Package.DOCUMENT_ROOT__MIME_TYPE:
				return getMimeType() != null;
			case Webapp23Package.DOCUMENT_ROOT__PARAM_NAME:
				return getParamName() != null;
			case Webapp23Package.DOCUMENT_ROOT__PARAM_VALUE:
				return getParamValue() != null;
			case Webapp23Package.DOCUMENT_ROOT__REALM_NAME:
				return getRealmName() != null;
			case Webapp23Package.DOCUMENT_ROOT__REMOTE:
				return getRemote() != null;
			case Webapp23Package.DOCUMENT_ROOT__RES_AUTH:
				return getResAuth() != null;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				return getResourceEnvRef() != null;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				return getResourceEnvRefName() != null;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				return getResourceEnvRefType() != null;
			case Webapp23Package.DOCUMENT_ROOT__RESOURCE_REF:
				return getResourceRef() != null;
			case Webapp23Package.DOCUMENT_ROOT__RES_REF_NAME:
				return getResRefName() != null;
			case Webapp23Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				return getResSharingScope() != null;
			case Webapp23Package.DOCUMENT_ROOT__RES_TYPE:
				return getResType() != null;
			case Webapp23Package.DOCUMENT_ROOT__ROLE_LINK:
				return getRoleLink() != null;
			case Webapp23Package.DOCUMENT_ROOT__ROLE_NAME:
				return getRoleName() != null;
			case Webapp23Package.DOCUMENT_ROOT__RUN_AS:
				return getRunAs() != null;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_CONSTRAINT:
				return getSecurityConstraint() != null;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return getSecurityRole() != null;
			case Webapp23Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return getSecurityRoleRef() != null;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET:
				return getServlet() != null;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_CLASS:
				return getServletClass() != null;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_MAPPING:
				return getServletMapping() != null;
			case Webapp23Package.DOCUMENT_ROOT__SERVLET_NAME:
				return getServletName() != null;
			case Webapp23Package.DOCUMENT_ROOT__SESSION_CONFIG:
				return getSessionConfig() != null;
			case Webapp23Package.DOCUMENT_ROOT__SESSION_TIMEOUT:
				return getSessionTimeout() != null;
			case Webapp23Package.DOCUMENT_ROOT__SMALL_ICON:
				return getSmallIcon() != null;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB:
				return getTaglib() != null;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_LOCATION:
				return getTaglibLocation() != null;
			case Webapp23Package.DOCUMENT_ROOT__TAGLIB_URI:
				return getTaglibUri() != null;
			case Webapp23Package.DOCUMENT_ROOT__TRANSPORT_GUARANTEE:
				return getTransportGuarantee() != null;
			case Webapp23Package.DOCUMENT_ROOT__URL_PATTERN:
				return getUrlPattern() != null;
			case Webapp23Package.DOCUMENT_ROOT__USER_DATA_CONSTRAINT:
				return getUserDataConstraint() != null;
			case Webapp23Package.DOCUMENT_ROOT__WEB_APP:
				return getWebApp() != null;
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION:
				return getWebResourceCollection() != null;
			case Webapp23Package.DOCUMENT_ROOT__WEB_RESOURCE_NAME:
				return getWebResourceName() != null;
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE:
				return getWelcomeFile() != null;
			case Webapp23Package.DOCUMENT_ROOT__WELCOME_FILE_LIST:
				return getWelcomeFileList() != null;
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
		result.append(" (mixed: "); //$NON-NLS-1$
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
