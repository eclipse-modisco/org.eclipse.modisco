/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp22.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.jee.webapp.webapp22.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Webapp22FactoryImpl extends EFactoryImpl implements Webapp22Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Webapp22Factory init() {
		try {
			Webapp22Factory theWebapp22Factory = (Webapp22Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Javaee/web-app_2_2.dtd"); //$NON-NLS-1$ 
			if (theWebapp22Factory != null) {
				return theWebapp22Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Webapp22FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp22FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Webapp22Package.AUTH_CONSTRAINT_TYPE: return createAuthConstraintType();
			case Webapp22Package.AUTH_METHOD_TYPE: return createAuthMethodType();
			case Webapp22Package.CONTEXT_PARAM_TYPE: return createContextParamType();
			case Webapp22Package.DESCRIPTION_TYPE: return createDescriptionType();
			case Webapp22Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case Webapp22Package.DISTRIBUTABLE_TYPE: return createDistributableType();
			case Webapp22Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Webapp22Package.EJB_LINK_TYPE: return createEjbLinkType();
			case Webapp22Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case Webapp22Package.EJB_REF_TYPE: return createEjbRefType();
			case Webapp22Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case Webapp22Package.ENV_ENTRY_NAME_TYPE: return createEnvEntryNameType();
			case Webapp22Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case Webapp22Package.ENV_ENTRY_TYPE_TYPE: return createEnvEntryTypeType();
			case Webapp22Package.ENV_ENTRY_VALUE_TYPE: return createEnvEntryValueType();
			case Webapp22Package.ERROR_CODE_TYPE: return createErrorCodeType();
			case Webapp22Package.ERROR_PAGE_TYPE: return createErrorPageType();
			case Webapp22Package.EXCEPTION_TYPE_TYPE: return createExceptionTypeType();
			case Webapp22Package.EXTENSION_TYPE: return createExtensionType();
			case Webapp22Package.FORM_ERROR_PAGE_TYPE: return createFormErrorPageType();
			case Webapp22Package.FORM_LOGIN_CONFIG_TYPE: return createFormLoginConfigType();
			case Webapp22Package.FORM_LOGIN_PAGE_TYPE: return createFormLoginPageType();
			case Webapp22Package.HOME_TYPE: return createHomeType();
			case Webapp22Package.HTTP_METHOD_TYPE: return createHttpMethodType();
			case Webapp22Package.ICON_TYPE: return createIconType();
			case Webapp22Package.INIT_PARAM_TYPE: return createInitParamType();
			case Webapp22Package.JSP_FILE_TYPE: return createJspFileType();
			case Webapp22Package.LARGE_ICON_TYPE: return createLargeIconType();
			case Webapp22Package.LOAD_ON_STARTUP_TYPE: return createLoadOnStartupType();
			case Webapp22Package.LOCATION_TYPE: return createLocationType();
			case Webapp22Package.LOGIN_CONFIG_TYPE: return createLoginConfigType();
			case Webapp22Package.MIME_MAPPING_TYPE: return createMimeMappingType();
			case Webapp22Package.MIME_TYPE_TYPE: return createMimeTypeType();
			case Webapp22Package.PARAM_NAME_TYPE: return createParamNameType();
			case Webapp22Package.PARAM_VALUE_TYPE: return createParamValueType();
			case Webapp22Package.REALM_NAME_TYPE: return createRealmNameType();
			case Webapp22Package.REMOTE_TYPE: return createRemoteType();
			case Webapp22Package.RES_AUTH_TYPE: return createResAuthType();
			case Webapp22Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case Webapp22Package.RES_REF_NAME_TYPE: return createResRefNameType();
			case Webapp22Package.RES_TYPE_TYPE: return createResTypeType();
			case Webapp22Package.ROLE_LINK_TYPE: return createRoleLinkType();
			case Webapp22Package.ROLE_NAME_TYPE: return createRoleNameType();
			case Webapp22Package.SECURITY_CONSTRAINT_TYPE: return createSecurityConstraintType();
			case Webapp22Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case Webapp22Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case Webapp22Package.SERVLET_CLASS_TYPE: return createServletClassType();
			case Webapp22Package.SERVLET_MAPPING_TYPE: return createServletMappingType();
			case Webapp22Package.SERVLET_NAME_TYPE: return createServletNameType();
			case Webapp22Package.SERVLET_TYPE: return createServletType();
			case Webapp22Package.SESSION_CONFIG_TYPE: return createSessionConfigType();
			case Webapp22Package.SESSION_TIMEOUT_TYPE: return createSessionTimeoutType();
			case Webapp22Package.SMALL_ICON_TYPE: return createSmallIconType();
			case Webapp22Package.TAGLIB_LOCATION_TYPE: return createTaglibLocationType();
			case Webapp22Package.TAGLIB_TYPE: return createTaglibType();
			case Webapp22Package.TAGLIB_URI_TYPE: return createTaglibUriType();
			case Webapp22Package.TRANSPORT_GUARANTEE_TYPE: return createTransportGuaranteeType();
			case Webapp22Package.URL_PATTERN_TYPE: return createUrlPatternType();
			case Webapp22Package.USER_DATA_CONSTRAINT_TYPE: return createUserDataConstraintType();
			case Webapp22Package.WEB_APP_TYPE: return createWebAppType();
			case Webapp22Package.WEB_RESOURCE_COLLECTION_TYPE: return createWebResourceCollectionType();
			case Webapp22Package.WEB_RESOURCE_NAME_TYPE: return createWebResourceNameType();
			case Webapp22Package.WELCOME_FILE_LIST_TYPE: return createWelcomeFileListType();
			case Webapp22Package.WELCOME_FILE_TYPE: return createWelcomeFileType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthConstraintType createAuthConstraintType() {
		AuthConstraintTypeImpl authConstraintType = new AuthConstraintTypeImpl();
		return authConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthMethodType createAuthMethodType() {
		AuthMethodTypeImpl authMethodType = new AuthMethodTypeImpl();
		return authMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextParamType createContextParamType() {
		ContextParamTypeImpl contextParamType = new ContextParamTypeImpl();
		return contextParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameType createDisplayNameType() {
		DisplayNameTypeImpl displayNameType = new DisplayNameTypeImpl();
		return displayNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributableType createDistributableType() {
		DistributableTypeImpl distributableType = new DistributableTypeImpl();
		return distributableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLinkType createEjbLinkType() {
		EjbLinkTypeImpl ejbLinkType = new EjbLinkTypeImpl();
		return ejbLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefNameType createEjbRefNameType() {
		EjbRefNameTypeImpl ejbRefNameType = new EjbRefNameTypeImpl();
		return ejbRefNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefType createEjbRefType() {
		EjbRefTypeImpl ejbRefType = new EjbRefTypeImpl();
		return ejbRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeType createEjbRefTypeType() {
		EjbRefTypeTypeImpl ejbRefTypeType = new EjbRefTypeTypeImpl();
		return ejbRefTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryNameType createEnvEntryNameType() {
		EnvEntryNameTypeImpl envEntryNameType = new EnvEntryNameTypeImpl();
		return envEntryNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryType createEnvEntryType() {
		EnvEntryTypeImpl envEntryType = new EnvEntryTypeImpl();
		return envEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeType createEnvEntryTypeType() {
		EnvEntryTypeTypeImpl envEntryTypeType = new EnvEntryTypeTypeImpl();
		return envEntryTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryValueType createEnvEntryValueType() {
		EnvEntryValueTypeImpl envEntryValueType = new EnvEntryValueTypeImpl();
		return envEntryValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeType createErrorCodeType() {
		ErrorCodeTypeImpl errorCodeType = new ErrorCodeTypeImpl();
		return errorCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPageType createErrorPageType() {
		ErrorPageTypeImpl errorPageType = new ErrorPageTypeImpl();
		return errorPageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionTypeType createExceptionTypeType() {
		ExceptionTypeTypeImpl exceptionTypeType = new ExceptionTypeTypeImpl();
		return exceptionTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionType createExtensionType() {
		ExtensionTypeImpl extensionType = new ExtensionTypeImpl();
		return extensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormErrorPageType createFormErrorPageType() {
		FormErrorPageTypeImpl formErrorPageType = new FormErrorPageTypeImpl();
		return formErrorPageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLoginConfigType createFormLoginConfigType() {
		FormLoginConfigTypeImpl formLoginConfigType = new FormLoginConfigTypeImpl();
		return formLoginConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLoginPageType createFormLoginPageType() {
		FormLoginPageTypeImpl formLoginPageType = new FormLoginPageTypeImpl();
		return formLoginPageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType createHomeType() {
		HomeTypeImpl homeType = new HomeTypeImpl();
		return homeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethodType createHttpMethodType() {
		HttpMethodTypeImpl httpMethodType = new HttpMethodTypeImpl();
		return httpMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconType createIconType() {
		IconTypeImpl iconType = new IconTypeImpl();
		return iconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitParamType createInitParamType() {
		InitParamTypeImpl initParamType = new InitParamTypeImpl();
		return initParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspFileType createJspFileType() {
		JspFileTypeImpl jspFileType = new JspFileTypeImpl();
		return jspFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeIconType createLargeIconType() {
		LargeIconTypeImpl largeIconType = new LargeIconTypeImpl();
		return largeIconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadOnStartupType createLoadOnStartupType() {
		LoadOnStartupTypeImpl loadOnStartupType = new LoadOnStartupTypeImpl();
		return loadOnStartupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginConfigType createLoginConfigType() {
		LoginConfigTypeImpl loginConfigType = new LoginConfigTypeImpl();
		return loginConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeMappingType createMimeMappingType() {
		MimeMappingTypeImpl mimeMappingType = new MimeMappingTypeImpl();
		return mimeMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeType createMimeTypeType() {
		MimeTypeTypeImpl mimeTypeType = new MimeTypeTypeImpl();
		return mimeTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamNameType createParamNameType() {
		ParamNameTypeImpl paramNameType = new ParamNameTypeImpl();
		return paramNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValueType createParamValueType() {
		ParamValueTypeImpl paramValueType = new ParamValueTypeImpl();
		return paramValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealmNameType createRealmNameType() {
		RealmNameTypeImpl realmNameType = new RealmNameTypeImpl();
		return realmNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType createRemoteType() {
		RemoteTypeImpl remoteType = new RemoteTypeImpl();
		return remoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType createResAuthType() {
		ResAuthTypeImpl resAuthType = new ResAuthTypeImpl();
		return resAuthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRefType createResourceRefType() {
		ResourceRefTypeImpl resourceRefType = new ResourceRefTypeImpl();
		return resourceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResRefNameType createResRefNameType() {
		ResRefNameTypeImpl resRefNameType = new ResRefNameTypeImpl();
		return resRefNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResTypeType createResTypeType() {
		ResTypeTypeImpl resTypeType = new ResTypeTypeImpl();
		return resTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleLinkType createRoleLinkType() {
		RoleLinkTypeImpl roleLinkType = new RoleLinkTypeImpl();
		return roleLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameType createRoleNameType() {
		RoleNameTypeImpl roleNameType = new RoleNameTypeImpl();
		return roleNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraintType createSecurityConstraintType() {
		SecurityConstraintTypeImpl securityConstraintType = new SecurityConstraintTypeImpl();
		return securityConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleRefType createSecurityRoleRefType() {
		SecurityRoleRefTypeImpl securityRoleRefType = new SecurityRoleRefTypeImpl();
		return securityRoleRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleType createSecurityRoleType() {
		SecurityRoleTypeImpl securityRoleType = new SecurityRoleTypeImpl();
		return securityRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletClassType createServletClassType() {
		ServletClassTypeImpl servletClassType = new ServletClassTypeImpl();
		return servletClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletMappingType createServletMappingType() {
		ServletMappingTypeImpl servletMappingType = new ServletMappingTypeImpl();
		return servletMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletNameType createServletNameType() {
		ServletNameTypeImpl servletNameType = new ServletNameTypeImpl();
		return servletNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletType createServletType() {
		ServletTypeImpl servletType = new ServletTypeImpl();
		return servletType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionConfigType createSessionConfigType() {
		SessionConfigTypeImpl sessionConfigType = new SessionConfigTypeImpl();
		return sessionConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTimeoutType createSessionTimeoutType() {
		SessionTimeoutTypeImpl sessionTimeoutType = new SessionTimeoutTypeImpl();
		return sessionTimeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallIconType createSmallIconType() {
		SmallIconTypeImpl smallIconType = new SmallIconTypeImpl();
		return smallIconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaglibLocationType createTaglibLocationType() {
		TaglibLocationTypeImpl taglibLocationType = new TaglibLocationTypeImpl();
		return taglibLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaglibType createTaglibType() {
		TaglibTypeImpl taglibType = new TaglibTypeImpl();
		return taglibType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaglibUriType createTaglibUriType() {
		TaglibUriTypeImpl taglibUriType = new TaglibUriTypeImpl();
		return taglibUriType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportGuaranteeType createTransportGuaranteeType() {
		TransportGuaranteeTypeImpl transportGuaranteeType = new TransportGuaranteeTypeImpl();
		return transportGuaranteeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlPatternType createUrlPatternType() {
		UrlPatternTypeImpl urlPatternType = new UrlPatternTypeImpl();
		return urlPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDataConstraintType createUserDataConstraintType() {
		UserDataConstraintTypeImpl userDataConstraintType = new UserDataConstraintTypeImpl();
		return userDataConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppType createWebAppType() {
		WebAppTypeImpl webAppType = new WebAppTypeImpl();
		return webAppType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebResourceCollectionType createWebResourceCollectionType() {
		WebResourceCollectionTypeImpl webResourceCollectionType = new WebResourceCollectionTypeImpl();
		return webResourceCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebResourceNameType createWebResourceNameType() {
		WebResourceNameTypeImpl webResourceNameType = new WebResourceNameTypeImpl();
		return webResourceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFileListType createWelcomeFileListType() {
		WelcomeFileListTypeImpl welcomeFileListType = new WelcomeFileListTypeImpl();
		return welcomeFileListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFileType createWelcomeFileType() {
		WelcomeFileTypeImpl welcomeFileType = new WelcomeFileTypeImpl();
		return welcomeFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp22Package getWebapp22Package() {
		return (Webapp22Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Webapp22Package getPackage() {
		return Webapp22Package.eINSTANCE;
	}

} //Webapp22FactoryImpl
