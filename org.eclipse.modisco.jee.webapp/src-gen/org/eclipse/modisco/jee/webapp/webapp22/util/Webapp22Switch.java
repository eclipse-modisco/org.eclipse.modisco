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
package org.eclipse.modisco.jee.webapp.webapp22.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.modisco.jee.webapp.webapp22.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package
 * @generated
 */
public class Webapp22Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Webapp22Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp22Switch() {
		if (modelPackage == null) {
			modelPackage = Webapp22Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Webapp22Package.AUTH_CONSTRAINT_TYPE: {
				AuthConstraintType authConstraintType = (AuthConstraintType)theEObject;
				T result = caseAuthConstraintType(authConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.AUTH_METHOD_TYPE: {
				AuthMethodType authMethodType = (AuthMethodType)theEObject;
				T result = caseAuthMethodType(authMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.CONTEXT_PARAM_TYPE: {
				ContextParamType contextParamType = (ContextParamType)theEObject;
				T result = caseContextParamType(contextParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.DISPLAY_NAME_TYPE: {
				DisplayNameType displayNameType = (DisplayNameType)theEObject;
				T result = caseDisplayNameType(displayNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.DISTRIBUTABLE_TYPE: {
				DistributableType distributableType = (DistributableType)theEObject;
				T result = caseDistributableType(distributableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.EJB_LINK_TYPE: {
				EjbLinkType ejbLinkType = (EjbLinkType)theEObject;
				T result = caseEjbLinkType(ejbLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.EJB_REF_NAME_TYPE: {
				EjbRefNameType ejbRefNameType = (EjbRefNameType)theEObject;
				T result = caseEjbRefNameType(ejbRefNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.EJB_REF_TYPE: {
				EjbRefType ejbRefType = (EjbRefType)theEObject;
				T result = caseEjbRefType(ejbRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.EJB_REF_TYPE_TYPE: {
				EjbRefTypeType ejbRefTypeType = (EjbRefTypeType)theEObject;
				T result = caseEjbRefTypeType(ejbRefTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ENV_ENTRY_NAME_TYPE: {
				EnvEntryNameType envEntryNameType = (EnvEntryNameType)theEObject;
				T result = caseEnvEntryNameType(envEntryNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ENV_ENTRY_TYPE: {
				EnvEntryType envEntryType = (EnvEntryType)theEObject;
				T result = caseEnvEntryType(envEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ENV_ENTRY_TYPE_TYPE: {
				EnvEntryTypeType envEntryTypeType = (EnvEntryTypeType)theEObject;
				T result = caseEnvEntryTypeType(envEntryTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ENV_ENTRY_VALUE_TYPE: {
				EnvEntryValueType envEntryValueType = (EnvEntryValueType)theEObject;
				T result = caseEnvEntryValueType(envEntryValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ERROR_CODE_TYPE: {
				ErrorCodeType errorCodeType = (ErrorCodeType)theEObject;
				T result = caseErrorCodeType(errorCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ERROR_PAGE_TYPE: {
				ErrorPageType errorPageType = (ErrorPageType)theEObject;
				T result = caseErrorPageType(errorPageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.EXCEPTION_TYPE_TYPE: {
				ExceptionTypeType exceptionTypeType = (ExceptionTypeType)theEObject;
				T result = caseExceptionTypeType(exceptionTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.EXTENSION_TYPE: {
				ExtensionType extensionType = (ExtensionType)theEObject;
				T result = caseExtensionType(extensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.FORM_ERROR_PAGE_TYPE: {
				FormErrorPageType formErrorPageType = (FormErrorPageType)theEObject;
				T result = caseFormErrorPageType(formErrorPageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.FORM_LOGIN_CONFIG_TYPE: {
				FormLoginConfigType formLoginConfigType = (FormLoginConfigType)theEObject;
				T result = caseFormLoginConfigType(formLoginConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.FORM_LOGIN_PAGE_TYPE: {
				FormLoginPageType formLoginPageType = (FormLoginPageType)theEObject;
				T result = caseFormLoginPageType(formLoginPageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.HOME_TYPE: {
				HomeType homeType = (HomeType)theEObject;
				T result = caseHomeType(homeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.HTTP_METHOD_TYPE: {
				HttpMethodType httpMethodType = (HttpMethodType)theEObject;
				T result = caseHttpMethodType(httpMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ICON_TYPE: {
				IconType iconType = (IconType)theEObject;
				T result = caseIconType(iconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.INIT_PARAM_TYPE: {
				InitParamType initParamType = (InitParamType)theEObject;
				T result = caseInitParamType(initParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.JSP_FILE_TYPE: {
				JspFileType jspFileType = (JspFileType)theEObject;
				T result = caseJspFileType(jspFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.LARGE_ICON_TYPE: {
				LargeIconType largeIconType = (LargeIconType)theEObject;
				T result = caseLargeIconType(largeIconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.LOAD_ON_STARTUP_TYPE: {
				LoadOnStartupType loadOnStartupType = (LoadOnStartupType)theEObject;
				T result = caseLoadOnStartupType(loadOnStartupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.LOCATION_TYPE: {
				LocationType locationType = (LocationType)theEObject;
				T result = caseLocationType(locationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.LOGIN_CONFIG_TYPE: {
				LoginConfigType loginConfigType = (LoginConfigType)theEObject;
				T result = caseLoginConfigType(loginConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.MIME_MAPPING_TYPE: {
				MimeMappingType mimeMappingType = (MimeMappingType)theEObject;
				T result = caseMimeMappingType(mimeMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.MIME_TYPE_TYPE: {
				MimeTypeType mimeTypeType = (MimeTypeType)theEObject;
				T result = caseMimeTypeType(mimeTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.PARAM_NAME_TYPE: {
				ParamNameType paramNameType = (ParamNameType)theEObject;
				T result = caseParamNameType(paramNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.PARAM_VALUE_TYPE: {
				ParamValueType paramValueType = (ParamValueType)theEObject;
				T result = caseParamValueType(paramValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.REALM_NAME_TYPE: {
				RealmNameType realmNameType = (RealmNameType)theEObject;
				T result = caseRealmNameType(realmNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.REMOTE_TYPE: {
				RemoteType remoteType = (RemoteType)theEObject;
				T result = caseRemoteType(remoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.RES_AUTH_TYPE: {
				ResAuthType resAuthType = (ResAuthType)theEObject;
				T result = caseResAuthType(resAuthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.RESOURCE_REF_TYPE: {
				ResourceRefType resourceRefType = (ResourceRefType)theEObject;
				T result = caseResourceRefType(resourceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.RES_REF_NAME_TYPE: {
				ResRefNameType resRefNameType = (ResRefNameType)theEObject;
				T result = caseResRefNameType(resRefNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.RES_TYPE_TYPE: {
				ResTypeType resTypeType = (ResTypeType)theEObject;
				T result = caseResTypeType(resTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ROLE_LINK_TYPE: {
				RoleLinkType roleLinkType = (RoleLinkType)theEObject;
				T result = caseRoleLinkType(roleLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.ROLE_NAME_TYPE: {
				RoleNameType roleNameType = (RoleNameType)theEObject;
				T result = caseRoleNameType(roleNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SECURITY_CONSTRAINT_TYPE: {
				SecurityConstraintType securityConstraintType = (SecurityConstraintType)theEObject;
				T result = caseSecurityConstraintType(securityConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SECURITY_ROLE_REF_TYPE: {
				SecurityRoleRefType securityRoleRefType = (SecurityRoleRefType)theEObject;
				T result = caseSecurityRoleRefType(securityRoleRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SECURITY_ROLE_TYPE: {
				SecurityRoleType securityRoleType = (SecurityRoleType)theEObject;
				T result = caseSecurityRoleType(securityRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SERVLET_CLASS_TYPE: {
				ServletClassType servletClassType = (ServletClassType)theEObject;
				T result = caseServletClassType(servletClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SERVLET_MAPPING_TYPE: {
				ServletMappingType servletMappingType = (ServletMappingType)theEObject;
				T result = caseServletMappingType(servletMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SERVLET_NAME_TYPE: {
				ServletNameType servletNameType = (ServletNameType)theEObject;
				T result = caseServletNameType(servletNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SERVLET_TYPE: {
				ServletType servletType = (ServletType)theEObject;
				T result = caseServletType(servletType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SESSION_CONFIG_TYPE: {
				SessionConfigType sessionConfigType = (SessionConfigType)theEObject;
				T result = caseSessionConfigType(sessionConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SESSION_TIMEOUT_TYPE: {
				SessionTimeoutType sessionTimeoutType = (SessionTimeoutType)theEObject;
				T result = caseSessionTimeoutType(sessionTimeoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.SMALL_ICON_TYPE: {
				SmallIconType smallIconType = (SmallIconType)theEObject;
				T result = caseSmallIconType(smallIconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.TAGLIB_LOCATION_TYPE: {
				TaglibLocationType taglibLocationType = (TaglibLocationType)theEObject;
				T result = caseTaglibLocationType(taglibLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.TAGLIB_TYPE: {
				TaglibType taglibType = (TaglibType)theEObject;
				T result = caseTaglibType(taglibType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.TAGLIB_URI_TYPE: {
				TaglibUriType taglibUriType = (TaglibUriType)theEObject;
				T result = caseTaglibUriType(taglibUriType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.TRANSPORT_GUARANTEE_TYPE: {
				TransportGuaranteeType transportGuaranteeType = (TransportGuaranteeType)theEObject;
				T result = caseTransportGuaranteeType(transportGuaranteeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.URL_PATTERN_TYPE: {
				UrlPatternType urlPatternType = (UrlPatternType)theEObject;
				T result = caseUrlPatternType(urlPatternType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.USER_DATA_CONSTRAINT_TYPE: {
				UserDataConstraintType userDataConstraintType = (UserDataConstraintType)theEObject;
				T result = caseUserDataConstraintType(userDataConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.WEB_APP_TYPE: {
				WebAppType webAppType = (WebAppType)theEObject;
				T result = caseWebAppType(webAppType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.WEB_RESOURCE_COLLECTION_TYPE: {
				WebResourceCollectionType webResourceCollectionType = (WebResourceCollectionType)theEObject;
				T result = caseWebResourceCollectionType(webResourceCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.WEB_RESOURCE_NAME_TYPE: {
				WebResourceNameType webResourceNameType = (WebResourceNameType)theEObject;
				T result = caseWebResourceNameType(webResourceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.WELCOME_FILE_LIST_TYPE: {
				WelcomeFileListType welcomeFileListType = (WelcomeFileListType)theEObject;
				T result = caseWelcomeFileListType(welcomeFileListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp22Package.WELCOME_FILE_TYPE: {
				WelcomeFileType welcomeFileType = (WelcomeFileType)theEObject;
				T result = caseWelcomeFileType(welcomeFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auth Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auth Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthConstraintType(AuthConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auth Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auth Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthMethodType(AuthMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextParamType(ContextParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayNameType(DisplayNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distributable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distributable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributableType(DistributableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbLinkType(EjbLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Ref Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Ref Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRefNameType(EjbRefNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRefType(EjbRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Ref Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Ref Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRefTypeType(EjbRefTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntryNameType(EnvEntryNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntryType(EnvEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntryTypeType(EnvEntryTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntryValueType(EnvEntryValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorCodeType(ErrorCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Page Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorPageType(ErrorPageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionTypeType(ExceptionTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionType(ExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Error Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Error Page Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormErrorPageType(FormErrorPageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Login Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Login Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormLoginConfigType(FormLoginConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Login Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Login Page Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormLoginPageType(FormLoginPageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Home Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Home Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHomeType(HomeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpMethodType(HttpMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconType(IconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitParamType(InitParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsp File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsp File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJspFileType(JspFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeIconType(LargeIconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load On Startup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load On Startup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadOnStartupType(LoadOnStartupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationType(LocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginConfigType(LoginConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMimeMappingType(MimeMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMimeTypeType(MimeTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamNameType(ParamNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamValueType(ParamValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realm Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realm Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealmNameType(RealmNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteType(RemoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Res Auth Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Res Auth Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResAuthType(ResAuthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRefType(ResourceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Res Ref Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Res Ref Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResRefNameType(ResRefNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Res Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Res Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResTypeType(ResTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleLinkType(RoleLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleNameType(RoleNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConstraintType(SecurityConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Role Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Role Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRoleRefType(SecurityRoleRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRoleType(SecurityRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servlet Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servlet Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServletClassType(ServletClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servlet Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servlet Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServletMappingType(ServletMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servlet Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servlet Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServletNameType(ServletNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servlet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servlet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServletType(ServletType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionConfigType(SessionConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Timeout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionTimeoutType(SessionTimeoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallIconType(SmallIconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taglib Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taglib Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaglibLocationType(TaglibLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taglib Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taglib Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaglibType(TaglibType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taglib Uri Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taglib Uri Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaglibUriType(TaglibUriType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Guarantee Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Guarantee Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportGuaranteeType(TransportGuaranteeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Pattern Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Pattern Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlPatternType(UrlPatternType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Data Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Data Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDataConstraintType(UserDataConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web App Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web App Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAppType(WebAppType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Resource Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Resource Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebResourceCollectionType(WebResourceCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Resource Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Resource Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebResourceNameType(WebResourceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Welcome File List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Welcome File List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWelcomeFileListType(WelcomeFileListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Welcome File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Welcome File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWelcomeFileType(WelcomeFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Webapp22Switch
