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
package org.eclipse.modisco.jee.webapp.webapp30.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType;
import org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesType;
import org.eclipse.modisco.jee.webapp.webapp30.AddressingType;
import org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp30.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieCommentType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieDomainType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieNameType;
import org.eclipse.modisco.jee.webapp.webapp30.CookiePathType;
import org.eclipse.modisco.jee.webapp.webapp30.DataSourceType;
import org.eclipse.modisco.jee.webapp.webapp30.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp30.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp30.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp30.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp30.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterType;
import org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanType;
import org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType;
import org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType;
import org.eclipse.modisco.jee.webapp.webapp30.HandlerType;
import org.eclipse.modisco.jee.webapp.webapp30.HomeType;
import org.eclipse.modisco.jee.webapp.webapp30.IconType;
import org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp30.JavaTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.JdbcUrlType;
import org.eclipse.modisco.jee.webapp.webapp30.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp30.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType;
import org.eclipse.modisco.jee.webapp.webapp30.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp30.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp30.LocalType;
import org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationLinkType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageType;
import org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.NonEmptyStringType;
import org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType;
import org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType;
import org.eclipse.modisco.jee.webapp.webapp30.OrderingType;
import org.eclipse.modisco.jee.webapp.webapp30.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp30.PathType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType;
import org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp30.PropertyType;
import org.eclipse.modisco.jee.webapp.webapp30.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp30.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType;
import org.eclipse.modisco.jee.webapp.webapp30.RoleNameType;
import org.eclipse.modisco.jee.webapp.webapp30.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletType;
import org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType;
import org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp30.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp30.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp30.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType;
import org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdStringType;
import org.eclipse.modisco.jee.webapp.webapp30.*;

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
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package
 * @generated
 */
public class Webapp30Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Webapp30Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp30Switch() {
		if (modelPackage == null) {
			modelPackage = Webapp30Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Webapp30Package.ABSOLUTE_ORDERING_TYPE: {
				AbsoluteOrderingType absoluteOrderingType = (AbsoluteOrderingType)theEObject;
				T result = caseAbsoluteOrderingType(absoluteOrderingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ADDRESSING_RESPONSES_TYPE: {
				AddressingResponsesType addressingResponsesType = (AddressingResponsesType)theEObject;
				T result = caseAddressingResponsesType(addressingResponsesType);
				if (result == null) result = caseString(addressingResponsesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ADDRESSING_TYPE: {
				AddressingType addressingType = (AddressingType)theEObject;
				T result = caseAddressingType(addressingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.AUTH_CONSTRAINT_TYPE: {
				AuthConstraintType authConstraintType = (AuthConstraintType)theEObject;
				T result = caseAuthConstraintType(authConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.AUTH_METHOD_TYPE: {
				AuthMethodType authMethodType = (AuthMethodType)theEObject;
				T result = caseAuthMethodType(authMethodType);
				if (result == null) result = caseString(authMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.COOKIE_COMMENT_TYPE: {
				CookieCommentType cookieCommentType = (CookieCommentType)theEObject;
				T result = caseCookieCommentType(cookieCommentType);
				if (result == null) result = caseNonEmptyStringType(cookieCommentType);
				if (result == null) result = caseString(cookieCommentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.COOKIE_CONFIG_TYPE: {
				CookieConfigType cookieConfigType = (CookieConfigType)theEObject;
				T result = caseCookieConfigType(cookieConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.COOKIE_DOMAIN_TYPE: {
				CookieDomainType cookieDomainType = (CookieDomainType)theEObject;
				T result = caseCookieDomainType(cookieDomainType);
				if (result == null) result = caseNonEmptyStringType(cookieDomainType);
				if (result == null) result = caseString(cookieDomainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.COOKIE_NAME_TYPE: {
				CookieNameType cookieNameType = (CookieNameType)theEObject;
				T result = caseCookieNameType(cookieNameType);
				if (result == null) result = caseNonEmptyStringType(cookieNameType);
				if (result == null) result = caseString(cookieNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.COOKIE_PATH_TYPE: {
				CookiePathType cookiePathType = (CookiePathType)theEObject;
				T result = caseCookiePathType(cookiePathType);
				if (result == null) result = caseNonEmptyStringType(cookiePathType);
				if (result == null) result = caseString(cookiePathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.DATA_SOURCE_TYPE: {
				DataSourceType dataSourceType = (DataSourceType)theEObject;
				T result = caseDataSourceType(dataSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = caseXsdStringType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.DISPATCHER_TYPE: {
				DispatcherType dispatcherType = (DispatcherType)theEObject;
				T result = caseDispatcherType(dispatcherType);
				if (result == null) result = caseString(dispatcherType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.DISPLAY_NAME_TYPE: {
				DisplayNameType displayNameType = (DisplayNameType)theEObject;
				T result = caseDisplayNameType(displayNameType);
				if (result == null) result = caseString(displayNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.EJB_LINK_TYPE: {
				EjbLinkType ejbLinkType = (EjbLinkType)theEObject;
				T result = caseEjbLinkType(ejbLinkType);
				if (result == null) result = caseString(ejbLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.EJB_LOCAL_REF_TYPE: {
				EjbLocalRefType ejbLocalRefType = (EjbLocalRefType)theEObject;
				T result = caseEjbLocalRefType(ejbLocalRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.EJB_REF_NAME_TYPE: {
				EjbRefNameType ejbRefNameType = (EjbRefNameType)theEObject;
				T result = caseEjbRefNameType(ejbRefNameType);
				if (result == null) result = caseJndiNameType(ejbRefNameType);
				if (result == null) result = caseString(ejbRefNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.EJB_REF_TYPE: {
				EjbRefType ejbRefType = (EjbRefType)theEObject;
				T result = caseEjbRefType(ejbRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.EJB_REF_TYPE_TYPE: {
				EjbRefTypeType ejbRefTypeType = (EjbRefTypeType)theEObject;
				T result = caseEjbRefTypeType(ejbRefTypeType);
				if (result == null) result = caseString(ejbRefTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.EMPTY_TYPE: {
				EmptyType emptyType = (EmptyType)theEObject;
				T result = caseEmptyType(emptyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ENV_ENTRY_TYPE: {
				EnvEntryType envEntryType = (EnvEntryType)theEObject;
				T result = caseEnvEntryType(envEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ENV_ENTRY_TYPE_VALUES_TYPE: {
				EnvEntryTypeValuesType envEntryTypeValuesType = (EnvEntryTypeValuesType)theEObject;
				T result = caseEnvEntryTypeValuesType(envEntryTypeValuesType);
				if (result == null) result = caseFullyQualifiedClassType(envEntryTypeValuesType);
				if (result == null) result = caseString(envEntryTypeValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ERROR_CODE_TYPE: {
				ErrorCodeType errorCodeType = (ErrorCodeType)theEObject;
				T result = caseErrorCodeType(errorCodeType);
				if (result == null) result = caseXsdPositiveIntegerType(errorCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ERROR_PAGE_TYPE: {
				ErrorPageType errorPageType = (ErrorPageType)theEObject;
				T result = caseErrorPageType(errorPageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.FILTER_MAPPING_TYPE: {
				FilterMappingType filterMappingType = (FilterMappingType)theEObject;
				T result = caseFilterMappingType(filterMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.FILTER_NAME_TYPE: {
				FilterNameType filterNameType = (FilterNameType)theEObject;
				T result = caseFilterNameType(filterNameType);
				if (result == null) result = caseNonEmptyStringType(filterNameType);
				if (result == null) result = caseString(filterNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE: {
				FormLoginConfigType formLoginConfigType = (FormLoginConfigType)theEObject;
				T result = caseFormLoginConfigType(formLoginConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.FULLY_QUALIFIED_CLASS_TYPE: {
				FullyQualifiedClassType fullyQualifiedClassType = (FullyQualifiedClassType)theEObject;
				T result = caseFullyQualifiedClassType(fullyQualifiedClassType);
				if (result == null) result = caseString(fullyQualifiedClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.GENERIC_BOOLEAN_TYPE: {
				GenericBooleanType genericBooleanType = (GenericBooleanType)theEObject;
				T result = caseGenericBooleanType(genericBooleanType);
				if (result == null) result = caseString(genericBooleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.HANDLER_CHAINS_TYPE: {
				HandlerChainsType handlerChainsType = (HandlerChainsType)theEObject;
				T result = caseHandlerChainsType(handlerChainsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.HANDLER_CHAIN_TYPE: {
				HandlerChainType handlerChainType = (HandlerChainType)theEObject;
				T result = caseHandlerChainType(handlerChainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.HANDLER_TYPE: {
				HandlerType handlerType = (HandlerType)theEObject;
				T result = caseHandlerType(handlerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.HOME_TYPE: {
				HomeType homeType = (HomeType)theEObject;
				T result = caseHomeType(homeType);
				if (result == null) result = caseFullyQualifiedClassType(homeType);
				if (result == null) result = caseString(homeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ICON_TYPE: {
				IconType iconType = (IconType)theEObject;
				T result = caseIconType(iconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.INJECTION_TARGET_TYPE: {
				InjectionTargetType injectionTargetType = (InjectionTargetType)theEObject;
				T result = caseInjectionTargetType(injectionTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.JAVA_IDENTIFIER_TYPE: {
				JavaIdentifierType javaIdentifierType = (JavaIdentifierType)theEObject;
				T result = caseJavaIdentifierType(javaIdentifierType);
				if (result == null) result = caseString(javaIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.JAVA_TYPE_TYPE: {
				JavaTypeType javaTypeType = (JavaTypeType)theEObject;
				T result = caseJavaTypeType(javaTypeType);
				if (result == null) result = caseString(javaTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.JDBC_URL_TYPE: {
				JdbcUrlType jdbcUrlType = (JdbcUrlType)theEObject;
				T result = caseJdbcUrlType(jdbcUrlType);
				if (result == null) result = caseString(jdbcUrlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.JNDI_NAME_TYPE: {
				JndiNameType jndiNameType = (JndiNameType)theEObject;
				T result = caseJndiNameType(jndiNameType);
				if (result == null) result = caseString(jndiNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.JSP_CONFIG_TYPE: {
				JspConfigType jspConfigType = (JspConfigType)theEObject;
				T result = caseJspConfigType(jspConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.JSP_FILE_TYPE: {
				JspFileType jspFileType = (JspFileType)theEObject;
				T result = caseJspFileType(jspFileType);
				if (result == null) result = casePathType(jspFileType);
				if (result == null) result = caseString(jspFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.JSP_PROPERTY_GROUP_TYPE: {
				JspPropertyGroupType jspPropertyGroupType = (JspPropertyGroupType)theEObject;
				T result = caseJspPropertyGroupType(jspPropertyGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.LIFECYCLE_CALLBACK_TYPE: {
				LifecycleCallbackType lifecycleCallbackType = (LifecycleCallbackType)theEObject;
				T result = caseLifecycleCallbackType(lifecycleCallbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.LISTENER_TYPE: {
				ListenerType listenerType = (ListenerType)theEObject;
				T result = caseListenerType(listenerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.LOCALE_ENCODING_MAPPING_LIST_TYPE: {
				LocaleEncodingMappingListType localeEncodingMappingListType = (LocaleEncodingMappingListType)theEObject;
				T result = caseLocaleEncodingMappingListType(localeEncodingMappingListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.LOCALE_ENCODING_MAPPING_TYPE: {
				LocaleEncodingMappingType localeEncodingMappingType = (LocaleEncodingMappingType)theEObject;
				T result = caseLocaleEncodingMappingType(localeEncodingMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.LOCAL_HOME_TYPE: {
				LocalHomeType localHomeType = (LocalHomeType)theEObject;
				T result = caseLocalHomeType(localHomeType);
				if (result == null) result = caseFullyQualifiedClassType(localHomeType);
				if (result == null) result = caseString(localHomeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.LOCAL_TYPE: {
				LocalType localType = (LocalType)theEObject;
				T result = caseLocalType(localType);
				if (result == null) result = caseFullyQualifiedClassType(localType);
				if (result == null) result = caseString(localType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.LOGIN_CONFIG_TYPE: {
				LoginConfigType loginConfigType = (LoginConfigType)theEObject;
				T result = caseLoginConfigType(loginConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MESSAGE_DESTINATION_LINK_TYPE: {
				MessageDestinationLinkType messageDestinationLinkType = (MessageDestinationLinkType)theEObject;
				T result = caseMessageDestinationLinkType(messageDestinationLinkType);
				if (result == null) result = caseString(messageDestinationLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MESSAGE_DESTINATION_REF_TYPE: {
				MessageDestinationRefType messageDestinationRefType = (MessageDestinationRefType)theEObject;
				T result = caseMessageDestinationRefType(messageDestinationRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MESSAGE_DESTINATION_TYPE: {
				MessageDestinationType messageDestinationType = (MessageDestinationType)theEObject;
				T result = caseMessageDestinationType(messageDestinationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MESSAGE_DESTINATION_TYPE_TYPE: {
				MessageDestinationTypeType messageDestinationTypeType = (MessageDestinationTypeType)theEObject;
				T result = caseMessageDestinationTypeType(messageDestinationTypeType);
				if (result == null) result = caseFullyQualifiedClassType(messageDestinationTypeType);
				if (result == null) result = caseString(messageDestinationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MESSAGE_DESTINATION_USAGE_TYPE: {
				MessageDestinationUsageType messageDestinationUsageType = (MessageDestinationUsageType)theEObject;
				T result = caseMessageDestinationUsageType(messageDestinationUsageType);
				if (result == null) result = caseString(messageDestinationUsageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MIME_MAPPING_TYPE: {
				MimeMappingType mimeMappingType = (MimeMappingType)theEObject;
				T result = caseMimeMappingType(mimeMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MIME_TYPE_TYPE: {
				MimeTypeType mimeTypeType = (MimeTypeType)theEObject;
				T result = caseMimeTypeType(mimeTypeType);
				if (result == null) result = caseString(mimeTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.MULTIPART_CONFIG_TYPE: {
				MultipartConfigType multipartConfigType = (MultipartConfigType)theEObject;
				T result = caseMultipartConfigType(multipartConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.NON_EMPTY_STRING_TYPE: {
				NonEmptyStringType nonEmptyStringType = (NonEmptyStringType)theEObject;
				T result = caseNonEmptyStringType(nonEmptyStringType);
				if (result == null) result = caseString(nonEmptyStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ORDERING_ORDERING_TYPE: {
				OrderingOrderingType orderingOrderingType = (OrderingOrderingType)theEObject;
				T result = caseOrderingOrderingType(orderingOrderingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ORDERING_OTHERS_TYPE: {
				OrderingOthersType orderingOthersType = (OrderingOthersType)theEObject;
				T result = caseOrderingOthersType(orderingOthersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ORDERING_TYPE: {
				OrderingType orderingType = (OrderingType)theEObject;
				T result = caseOrderingType(orderingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.PARAM_VALUE_TYPE: {
				ParamValueType paramValueType = (ParamValueType)theEObject;
				T result = caseParamValueType(paramValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.PATH_TYPE: {
				PathType pathType = (PathType)theEObject;
				T result = casePathType(pathType);
				if (result == null) result = caseString(pathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.PERSISTENCE_CONTEXT_REF_TYPE: {
				PersistenceContextRefType persistenceContextRefType = (PersistenceContextRefType)theEObject;
				T result = casePersistenceContextRefType(persistenceContextRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.PERSISTENCE_CONTEXT_TYPE_TYPE: {
				PersistenceContextTypeType persistenceContextTypeType = (PersistenceContextTypeType)theEObject;
				T result = casePersistenceContextTypeType(persistenceContextTypeType);
				if (result == null) result = caseString(persistenceContextTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.PERSISTENCE_UNIT_REF_TYPE: {
				PersistenceUnitRefType persistenceUnitRefType = (PersistenceUnitRefType)theEObject;
				T result = casePersistenceUnitRefType(persistenceUnitRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.PORT_COMPONENT_REF_TYPE: {
				PortComponentRefType portComponentRefType = (PortComponentRefType)theEObject;
				T result = casePortComponentRefType(portComponentRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.REMOTE_TYPE: {
				RemoteType remoteType = (RemoteType)theEObject;
				T result = caseRemoteType(remoteType);
				if (result == null) result = caseFullyQualifiedClassType(remoteType);
				if (result == null) result = caseString(remoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.RES_AUTH_TYPE: {
				ResAuthType resAuthType = (ResAuthType)theEObject;
				T result = caseResAuthType(resAuthType);
				if (result == null) result = caseString(resAuthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.RESOURCE_ENV_REF_TYPE: {
				ResourceEnvRefType resourceEnvRefType = (ResourceEnvRefType)theEObject;
				T result = caseResourceEnvRefType(resourceEnvRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.RESOURCE_REF_TYPE: {
				ResourceRefType resourceRefType = (ResourceRefType)theEObject;
				T result = caseResourceRefType(resourceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.RESPECT_BINDING_TYPE: {
				RespectBindingType respectBindingType = (RespectBindingType)theEObject;
				T result = caseRespectBindingType(respectBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.RES_SHARING_SCOPE_TYPE: {
				ResSharingScopeType resSharingScopeType = (ResSharingScopeType)theEObject;
				T result = caseResSharingScopeType(resSharingScopeType);
				if (result == null) result = caseString(resSharingScopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.ROLE_NAME_TYPE: {
				RoleNameType roleNameType = (RoleNameType)theEObject;
				T result = caseRoleNameType(roleNameType);
				if (result == null) result = caseString(roleNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.RUN_AS_TYPE: {
				RunAsType runAsType = (RunAsType)theEObject;
				T result = caseRunAsType(runAsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SECURITY_CONSTRAINT_TYPE: {
				SecurityConstraintType securityConstraintType = (SecurityConstraintType)theEObject;
				T result = caseSecurityConstraintType(securityConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SECURITY_ROLE_REF_TYPE: {
				SecurityRoleRefType securityRoleRefType = (SecurityRoleRefType)theEObject;
				T result = caseSecurityRoleRefType(securityRoleRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SECURITY_ROLE_TYPE: {
				SecurityRoleType securityRoleType = (SecurityRoleType)theEObject;
				T result = caseSecurityRoleType(securityRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SERVICE_REF_TYPE: {
				ServiceRefType serviceRefType = (ServiceRefType)theEObject;
				T result = caseServiceRefType(serviceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SERVLET_MAPPING_TYPE: {
				ServletMappingType servletMappingType = (ServletMappingType)theEObject;
				T result = caseServletMappingType(servletMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SERVLET_NAME_TYPE: {
				ServletNameType servletNameType = (ServletNameType)theEObject;
				T result = caseServletNameType(servletNameType);
				if (result == null) result = caseNonEmptyStringType(servletNameType);
				if (result == null) result = caseString(servletNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SERVLET_TYPE: {
				ServletType servletType = (ServletType)theEObject;
				T result = caseServletType(servletType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.SESSION_CONFIG_TYPE: {
				SessionConfigType sessionConfigType = (SessionConfigType)theEObject;
				T result = caseSessionConfigType(sessionConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.STRING: {
				org.eclipse.modisco.jee.webapp.webapp30.String string = (org.eclipse.modisco.jee.webapp.webapp30.String)theEObject;
				T result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.TAGLIB_TYPE: {
				TaglibType taglibType = (TaglibType)theEObject;
				T result = caseTaglibType(taglibType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.TRACKING_MODE_TYPE: {
				TrackingModeType trackingModeType = (TrackingModeType)theEObject;
				T result = caseTrackingModeType(trackingModeType);
				if (result == null) result = caseString(trackingModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.TRANSPORT_GUARANTEE_TYPE: {
				TransportGuaranteeType transportGuaranteeType = (TransportGuaranteeType)theEObject;
				T result = caseTransportGuaranteeType(transportGuaranteeType);
				if (result == null) result = caseString(transportGuaranteeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.TRUE_FALSE_TYPE: {
				TrueFalseType trueFalseType = (TrueFalseType)theEObject;
				T result = caseTrueFalseType(trueFalseType);
				if (result == null) result = caseXsdBooleanType(trueFalseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.URL_PATTERN_TYPE: {
				UrlPatternType urlPatternType = (UrlPatternType)theEObject;
				T result = caseUrlPatternType(urlPatternType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.USER_DATA_CONSTRAINT_TYPE: {
				UserDataConstraintType userDataConstraintType = (UserDataConstraintType)theEObject;
				T result = caseUserDataConstraintType(userDataConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.WAR_PATH_TYPE: {
				WarPathType warPathType = (WarPathType)theEObject;
				T result = caseWarPathType(warPathType);
				if (result == null) result = caseString(warPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.WEB_APP_TYPE: {
				WebAppType webAppType = (WebAppType)theEObject;
				T result = caseWebAppType(webAppType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.WEB_FRAGMENT_TYPE: {
				WebFragmentType webFragmentType = (WebFragmentType)theEObject;
				T result = caseWebFragmentType(webFragmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.WEB_RESOURCE_COLLECTION_TYPE: {
				WebResourceCollectionType webResourceCollectionType = (WebResourceCollectionType)theEObject;
				T result = caseWebResourceCollectionType(webResourceCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.WELCOME_FILE_LIST_TYPE: {
				WelcomeFileListType welcomeFileListType = (WelcomeFileListType)theEObject;
				T result = caseWelcomeFileListType(welcomeFileListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_ANY_URI_TYPE: {
				XsdAnyURIType xsdAnyURIType = (XsdAnyURIType)theEObject;
				T result = caseXsdAnyURIType(xsdAnyURIType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_BOOLEAN_TYPE: {
				XsdBooleanType xsdBooleanType = (XsdBooleanType)theEObject;
				T result = caseXsdBooleanType(xsdBooleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_INTEGER_TYPE: {
				XsdIntegerType xsdIntegerType = (XsdIntegerType)theEObject;
				T result = caseXsdIntegerType(xsdIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_NMTOKEN_TYPE: {
				XsdNMTOKENType xsdNMTOKENType = (XsdNMTOKENType)theEObject;
				T result = caseXsdNMTOKENType(xsdNMTOKENType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_NON_NEGATIVE_INTEGER_TYPE: {
				XsdNonNegativeIntegerType xsdNonNegativeIntegerType = (XsdNonNegativeIntegerType)theEObject;
				T result = caseXsdNonNegativeIntegerType(xsdNonNegativeIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_POSITIVE_INTEGER_TYPE: {
				XsdPositiveIntegerType xsdPositiveIntegerType = (XsdPositiveIntegerType)theEObject;
				T result = caseXsdPositiveIntegerType(xsdPositiveIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_QNAME_TYPE: {
				XsdQNameType xsdQNameType = (XsdQNameType)theEObject;
				T result = caseXsdQNameType(xsdQNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Webapp30Package.XSD_STRING_TYPE: {
				XsdStringType xsdStringType = (XsdStringType)theEObject;
				T result = caseXsdStringType(xsdStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Ordering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Ordering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteOrderingType(AbsoluteOrderingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressing Responses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressing Responses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressingResponsesType(AddressingResponsesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressingType(AddressingType object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Cookie Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookie Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCookieCommentType(CookieCommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cookie Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookie Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCookieConfigType(CookieConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cookie Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookie Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCookieDomainType(CookieDomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cookie Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookie Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCookieNameType(CookieNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cookie Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookie Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCookiePathType(CookiePathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceType(DataSourceType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dispatcher Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatcher Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatcherType(DispatcherType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Local Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Local Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbLocalRefType(EjbLocalRefType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Empty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyType(EmptyType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry Type Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry Type Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntryTypeValuesType(EnvEntryTypeValuesType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Filter Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterMappingType(FilterMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterNameType(FilterNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterType(FilterType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Fully Qualified Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fully Qualified Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullyQualifiedClassType(FullyQualifiedClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericBooleanType(GenericBooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handler Chains Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handler Chains Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandlerChainsType(HandlerChainsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handler Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handler Chain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandlerChainType(HandlerChainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handler Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handler Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandlerType(HandlerType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Injection Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injection Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjectionTargetType(InjectionTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaIdentifierType(JavaIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaTypeType(JavaTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jdbc Url Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jdbc Url Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJdbcUrlType(JdbcUrlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jndi Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jndi Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJndiNameType(JndiNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsp Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsp Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJspConfigType(JspConfigType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Jsp Property Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsp Property Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJspPropertyGroupType(JspPropertyGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle Callback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle Callback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycleCallbackType(LifecycleCallbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listener Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listener Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListenerType(ListenerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locale Encoding Mapping List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locale Encoding Mapping List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocaleEncodingMappingListType(LocaleEncodingMappingListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locale Encoding Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locale Encoding Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocaleEncodingMappingType(LocaleEncodingMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Home Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Home Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalHomeType(LocalHomeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalType(LocalType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationLinkType(MessageDestinationLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationRefType(MessageDestinationRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationType(MessageDestinationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationTypeType(MessageDestinationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Usage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Usage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationUsageType(MessageDestinationUsageType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Multipart Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multipart Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipartConfigType(MultipartConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Empty String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Empty String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonEmptyStringType(NonEmptyStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordering Ordering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordering Ordering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderingOrderingType(OrderingOrderingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordering Others Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordering Others Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderingOthersType(OrderingOthersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderingType(OrderingType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathType(PathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Context Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Context Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceContextRefType(PersistenceContextRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Context Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Context Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceContextTypeType(PersistenceContextTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Unit Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Unit Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceUnitRefType(PersistenceUnitRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Component Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Component Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortComponentRefType(PortComponentRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Env Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Env Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceEnvRefType(ResourceEnvRefType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Respect Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respect Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespectBindingType(RespectBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Res Sharing Scope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Res Sharing Scope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResSharingScopeType(ResSharingScopeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Run As Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run As Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunAsType(RunAsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRefType(ServiceRefType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.eclipse.modisco.jee.webapp.webapp30.String object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tracking Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracking Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackingModeType(TrackingModeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>True False Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True False Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueFalseType(TrueFalseType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>War Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>War Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarPathType(WarPathType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Web Fragment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Fragment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebFragmentType(WebFragmentType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Any URI Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Any URI Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdAnyURIType(XsdAnyURIType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdBooleanType(XsdBooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdIntegerType(XsdIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd NMTOKEN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd NMTOKEN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdNMTOKENType(XsdNMTOKENType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Non Negative Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Non Negative Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdNonNegativeIntegerType(XsdNonNegativeIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Positive Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Positive Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdPositiveIntegerType(XsdPositiveIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd QName Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd QName Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdQNameType(XsdQNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdStringType(XsdStringType object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //Webapp30Switch
