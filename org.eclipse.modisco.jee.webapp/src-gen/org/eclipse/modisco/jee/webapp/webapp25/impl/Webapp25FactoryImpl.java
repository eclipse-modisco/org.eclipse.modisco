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
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.modisco.jee.webapp.webapp25.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp25.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp25.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp25.DispatcherTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp25.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp25.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefTypeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryTypeValuesTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp25.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterType;
import org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp25.GenericBooleanType;
import org.eclipse.modisco.jee.webapp.webapp25.GenericBooleanTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.HomeType;
import org.eclipse.modisco.jee.webapp.webapp25.IconType;
import org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp25.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp25.JavaTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp25.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp25.LifecycleCallbackType;
import org.eclipse.modisco.jee.webapp.webapp25.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp25.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp25.LocalType;
import org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationLinkType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationUsageType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationUsageTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.NonEmptyStringType;
import org.eclipse.modisco.jee.webapp.webapp25.NullCharType;
import org.eclipse.modisco.jee.webapp.webapp25.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp25.PathType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceUnitRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PropertyType;
import org.eclipse.modisco.jee.webapp.webapp25.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp25.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp25.ResAuthTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp25.ResSharingScopeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp25.RoleNameType;
import org.eclipse.modisco.jee.webapp.webapp25.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp25.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainsType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletType;
import org.eclipse.modisco.jee.webapp.webapp25.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp25.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp25.TransportGuaranteeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp25.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp25.WebAppVersionType;
import org.eclipse.modisco.jee.webapp.webapp25.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Factory;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;
import org.eclipse.modisco.jee.webapp.webapp25.WelcomeFileListType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdAnyURIType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdBooleanType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdIntegerType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdNMTOKENType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdQNameType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Webapp25FactoryImpl extends EFactoryImpl implements Webapp25Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Webapp25Factory init() {
		try {
			Webapp25Factory theWebapp25Factory = (Webapp25Factory)EPackage.Registry.INSTANCE.getEFactory(Webapp25Package.eNS_URI);
			if (theWebapp25Factory != null) {
				return theWebapp25Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Webapp25FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp25FactoryImpl() {
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
			case Webapp25Package.AUTH_CONSTRAINT_TYPE: return createAuthConstraintType();
			case Webapp25Package.AUTH_METHOD_TYPE: return createAuthMethodType();
			case Webapp25Package.DESCRIPTION_TYPE: return createDescriptionType();
			case Webapp25Package.DISPATCHER_TYPE: return createDispatcherType();
			case Webapp25Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case Webapp25Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Webapp25Package.EJB_LINK_TYPE: return createEjbLinkType();
			case Webapp25Package.EJB_LOCAL_REF_TYPE: return createEjbLocalRefType();
			case Webapp25Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case Webapp25Package.EJB_REF_TYPE: return createEjbRefType();
			case Webapp25Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case Webapp25Package.EMPTY_TYPE: return createEmptyType();
			case Webapp25Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE: return createEnvEntryTypeValuesType();
			case Webapp25Package.ERROR_CODE_TYPE: return createErrorCodeType();
			case Webapp25Package.ERROR_PAGE_TYPE: return createErrorPageType();
			case Webapp25Package.FILTER_MAPPING_TYPE: return createFilterMappingType();
			case Webapp25Package.FILTER_NAME_TYPE: return createFilterNameType();
			case Webapp25Package.FILTER_TYPE: return createFilterType();
			case Webapp25Package.FORM_LOGIN_CONFIG_TYPE: return createFormLoginConfigType();
			case Webapp25Package.FULLY_QUALIFIED_CLASS_TYPE: return createFullyQualifiedClassType();
			case Webapp25Package.GENERIC_BOOLEAN_TYPE: return createGenericBooleanType();
			case Webapp25Package.HOME_TYPE: return createHomeType();
			case Webapp25Package.ICON_TYPE: return createIconType();
			case Webapp25Package.INJECTION_TARGET_TYPE: return createInjectionTargetType();
			case Webapp25Package.JAVA_IDENTIFIER_TYPE: return createJavaIdentifierType();
			case Webapp25Package.JAVA_TYPE_TYPE: return createJavaTypeType();
			case Webapp25Package.JNDI_NAME_TYPE: return createJndiNameType();
			case Webapp25Package.JSP_CONFIG_TYPE: return createJspConfigType();
			case Webapp25Package.JSP_FILE_TYPE: return createJspFileType();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE: return createJspPropertyGroupType();
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE: return createLifecycleCallbackType();
			case Webapp25Package.LISTENER_TYPE: return createListenerType();
			case Webapp25Package.LOCALE_ENCODING_MAPPING_LIST_TYPE: return createLocaleEncodingMappingListType();
			case Webapp25Package.LOCALE_ENCODING_MAPPING_TYPE: return createLocaleEncodingMappingType();
			case Webapp25Package.LOCAL_HOME_TYPE: return createLocalHomeType();
			case Webapp25Package.LOCAL_TYPE: return createLocalType();
			case Webapp25Package.LOGIN_CONFIG_TYPE: return createLoginConfigType();
			case Webapp25Package.MESSAGE_DESTINATION_LINK_TYPE: return createMessageDestinationLinkType();
			case Webapp25Package.MESSAGE_DESTINATION_REF_TYPE: return createMessageDestinationRefType();
			case Webapp25Package.MESSAGE_DESTINATION_TYPE: return createMessageDestinationType();
			case Webapp25Package.MESSAGE_DESTINATION_TYPE_TYPE: return createMessageDestinationTypeType();
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE: return createMessageDestinationUsageType();
			case Webapp25Package.MIME_MAPPING_TYPE: return createMimeMappingType();
			case Webapp25Package.MIME_TYPE_TYPE: return createMimeTypeType();
			case Webapp25Package.NON_EMPTY_STRING_TYPE: return createNonEmptyStringType();
			case Webapp25Package.PARAM_VALUE_TYPE: return createParamValueType();
			case Webapp25Package.PATH_TYPE: return createPathType();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE: return createPersistenceContextRefType();
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE: return createPersistenceContextTypeType();
			case Webapp25Package.PERSISTENCE_UNIT_REF_TYPE: return createPersistenceUnitRefType();
			case Webapp25Package.PORT_COMPONENT_REF_TYPE: return createPortComponentRefType();
			case Webapp25Package.PROPERTY_TYPE: return createPropertyType();
			case Webapp25Package.REMOTE_TYPE: return createRemoteType();
			case Webapp25Package.RES_AUTH_TYPE: return createResAuthType();
			case Webapp25Package.RESOURCE_ENV_REF_TYPE: return createResourceEnvRefType();
			case Webapp25Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case Webapp25Package.RES_SHARING_SCOPE_TYPE: return createResSharingScopeType();
			case Webapp25Package.ROLE_NAME_TYPE: return createRoleNameType();
			case Webapp25Package.RUN_AS_TYPE: return createRunAsType();
			case Webapp25Package.SECURITY_CONSTRAINT_TYPE: return createSecurityConstraintType();
			case Webapp25Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case Webapp25Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case Webapp25Package.SERVICE_REF_HANDLER_CHAINS_TYPE: return createServiceRefHandlerChainsType();
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE: return createServiceRefHandlerChainType();
			case Webapp25Package.SERVICE_REF_HANDLER_TYPE: return createServiceRefHandlerType();
			case Webapp25Package.SERVICE_REF_TYPE: return createServiceRefType();
			case Webapp25Package.SERVLET_MAPPING_TYPE: return createServletMappingType();
			case Webapp25Package.SERVLET_NAME_TYPE: return createServletNameType();
			case Webapp25Package.SERVLET_TYPE: return createServletType();
			case Webapp25Package.SESSION_CONFIG_TYPE: return createSessionConfigType();
			case Webapp25Package.STRING: return createString();
			case Webapp25Package.TAGLIB_TYPE: return createTaglibType();
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE: return createTransportGuaranteeType();
			case Webapp25Package.TRUE_FALSE_TYPE: return createTrueFalseType();
			case Webapp25Package.URL_PATTERN_TYPE: return createUrlPatternType();
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE: return createUserDataConstraintType();
			case Webapp25Package.WAR_PATH_TYPE: return createWarPathType();
			case Webapp25Package.WEB_APP_TYPE: return createWebAppType();
			case Webapp25Package.WEB_RESOURCE_COLLECTION_TYPE: return createWebResourceCollectionType();
			case Webapp25Package.WELCOME_FILE_LIST_TYPE: return createWelcomeFileListType();
			case Webapp25Package.XSD_ANY_URI_TYPE: return createXsdAnyURIType();
			case Webapp25Package.XSD_BOOLEAN_TYPE: return createXsdBooleanType();
			case Webapp25Package.XSD_INTEGER_TYPE: return createXsdIntegerType();
			case Webapp25Package.XSD_NMTOKEN_TYPE: return createXsdNMTOKENType();
			case Webapp25Package.XSD_NON_NEGATIVE_INTEGER_TYPE: return createXsdNonNegativeIntegerType();
			case Webapp25Package.XSD_POSITIVE_INTEGER_TYPE: return createXsdPositiveIntegerType();
			case Webapp25Package.XSD_QNAME_TYPE: return createXsdQNameType();
			case Webapp25Package.XSD_STRING_TYPE: return createXsdStringType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Webapp25Package.DISPATCHER_TYPE_BASE:
				return createDispatcherTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.EJB_REF_TYPE_TYPE_BASE:
				return createEjbRefTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return createEnvEntryTypeValuesTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.GENERIC_BOOLEAN_TYPE_BASE:
				return createGenericBooleanTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return createMessageDestinationUsageTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.NULL_CHAR_TYPE:
				return createNullCharTypeFromString(eDataType, initialValue);
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return createPersistenceContextTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.RES_AUTH_TYPE_BASE:
				return createResAuthTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.RES_SHARING_SCOPE_TYPE_BASE:
				return createResSharingScopeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE_BASE:
				return createTransportGuaranteeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.WEB_APP_VERSION_TYPE:
				return createWebAppVersionTypeFromString(eDataType, initialValue);
			case Webapp25Package.AUTH_METHOD_TYPE_BASE:
				return createAuthMethodTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.DEWEY_VERSION_TYPE:
				return createDeweyVersionTypeFromString(eDataType, initialValue);
			case Webapp25Package.DISPATCHER_TYPE_BASE_OBJECT:
				return createDispatcherTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.EJB_LINK_TYPE_BASE:
				return createEjbLinkTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.EJB_REF_NAME_TYPE_BASE:
				return createEjbRefNameTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return createEjbRefTypeTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.ENCODING_TYPE:
				return createEncodingTypeFromString(eDataType, initialValue);
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return createEnvEntryTypeValuesTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.ERROR_CODE_TYPE_BASE:
				return createErrorCodeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return createFullyQualifiedClassTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return createGenericBooleanTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.HOME_TYPE_BASE:
				return createHomeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.HTTP_METHOD_TYPE:
				return createHttpMethodTypeFromString(eDataType, initialValue);
			case Webapp25Package.JAVA_IDENTIFIER_TYPE_BASE:
				return createJavaIdentifierTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.JAVA_TYPE_TYPE_BASE:
				return createJavaTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.JNDI_NAME_TYPE_BASE:
				return createJndiNameTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.JSP_FILE_TYPE_BASE:
				return createJspFileTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.LOAD_ON_STARTUP_TYPE:
				return createLoadOnStartupTypeFromString(eDataType, initialValue);
			case Webapp25Package.LOCALE_TYPE:
				return createLocaleTypeFromString(eDataType, initialValue);
			case Webapp25Package.LOCAL_HOME_TYPE_BASE:
				return createLocalHomeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.LOCAL_TYPE_BASE:
				return createLocalTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return createMessageDestinationLinkTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return createMessageDestinationTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return createMessageDestinationUsageTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.MIME_TYPE_TYPE_BASE:
				return createMimeTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.NON_EMPTY_STRING_TYPE_BASE:
				return createNonEmptyStringTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.NULL_CHAR_TYPE_OBJECT:
				return createNullCharTypeObjectFromString(eDataType, initialValue);
			case Webapp25Package.PATH_TYPE_BASE:
				return createPathTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return createPersistenceContextTypeTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.REMOTE_TYPE_BASE:
				return createRemoteTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.RES_AUTH_TYPE_BASE_OBJECT:
				return createResAuthTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return createResSharingScopeTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.ROLE_NAME_TYPE_BASE:
				return createRoleNameTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return createServiceRefProtocolBindingListTypeFromString(eDataType, initialValue);
			case Webapp25Package.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return createServiceRefProtocolBindingTypeFromString(eDataType, initialValue);
			case Webapp25Package.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return createServiceRefProtocolURIAliasTypeFromString(eDataType, initialValue);
			case Webapp25Package.SERVICE_REF_QNAME_PATTERN:
				return createServiceRefQnamePatternFromString(eDataType, initialValue);
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT:
				return createTransportGuaranteeTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.TRUE_FALSE_TYPE_BASE:
				return createTrueFalseTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return createTrueFalseTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp25Package.WAR_PATH_TYPE_BASE:
				return createWarPathTypeBaseFromString(eDataType, initialValue);
			case Webapp25Package.WEB_APP_VERSION_TYPE_OBJECT:
				return createWebAppVersionTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Webapp25Package.DISPATCHER_TYPE_BASE:
				return convertDispatcherTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.EJB_REF_TYPE_TYPE_BASE:
				return convertEjbRefTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return convertEnvEntryTypeValuesTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.GENERIC_BOOLEAN_TYPE_BASE:
				return convertGenericBooleanTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return convertMessageDestinationUsageTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.NULL_CHAR_TYPE:
				return convertNullCharTypeToString(eDataType, instanceValue);
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return convertPersistenceContextTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.RES_AUTH_TYPE_BASE:
				return convertResAuthTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.RES_SHARING_SCOPE_TYPE_BASE:
				return convertResSharingScopeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE_BASE:
				return convertTransportGuaranteeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.WEB_APP_VERSION_TYPE:
				return convertWebAppVersionTypeToString(eDataType, instanceValue);
			case Webapp25Package.AUTH_METHOD_TYPE_BASE:
				return convertAuthMethodTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.DEWEY_VERSION_TYPE:
				return convertDeweyVersionTypeToString(eDataType, instanceValue);
			case Webapp25Package.DISPATCHER_TYPE_BASE_OBJECT:
				return convertDispatcherTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.EJB_LINK_TYPE_BASE:
				return convertEjbLinkTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.EJB_REF_NAME_TYPE_BASE:
				return convertEjbRefNameTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return convertEjbRefTypeTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.ENCODING_TYPE:
				return convertEncodingTypeToString(eDataType, instanceValue);
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return convertEnvEntryTypeValuesTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.ERROR_CODE_TYPE_BASE:
				return convertErrorCodeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return convertFullyQualifiedClassTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return convertGenericBooleanTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.HOME_TYPE_BASE:
				return convertHomeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.HTTP_METHOD_TYPE:
				return convertHttpMethodTypeToString(eDataType, instanceValue);
			case Webapp25Package.JAVA_IDENTIFIER_TYPE_BASE:
				return convertJavaIdentifierTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.JAVA_TYPE_TYPE_BASE:
				return convertJavaTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.JNDI_NAME_TYPE_BASE:
				return convertJndiNameTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.JSP_FILE_TYPE_BASE:
				return convertJspFileTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.LOAD_ON_STARTUP_TYPE:
				return convertLoadOnStartupTypeToString(eDataType, instanceValue);
			case Webapp25Package.LOCALE_TYPE:
				return convertLocaleTypeToString(eDataType, instanceValue);
			case Webapp25Package.LOCAL_HOME_TYPE_BASE:
				return convertLocalHomeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.LOCAL_TYPE_BASE:
				return convertLocalTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return convertMessageDestinationLinkTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return convertMessageDestinationTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return convertMessageDestinationUsageTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.MIME_TYPE_TYPE_BASE:
				return convertMimeTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.NON_EMPTY_STRING_TYPE_BASE:
				return convertNonEmptyStringTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.NULL_CHAR_TYPE_OBJECT:
				return convertNullCharTypeObjectToString(eDataType, instanceValue);
			case Webapp25Package.PATH_TYPE_BASE:
				return convertPathTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return convertPersistenceContextTypeTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.REMOTE_TYPE_BASE:
				return convertRemoteTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.RES_AUTH_TYPE_BASE_OBJECT:
				return convertResAuthTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return convertResSharingScopeTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.ROLE_NAME_TYPE_BASE:
				return convertRoleNameTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return convertServiceRefProtocolBindingListTypeToString(eDataType, instanceValue);
			case Webapp25Package.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return convertServiceRefProtocolBindingTypeToString(eDataType, instanceValue);
			case Webapp25Package.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return convertServiceRefProtocolURIAliasTypeToString(eDataType, instanceValue);
			case Webapp25Package.SERVICE_REF_QNAME_PATTERN:
				return convertServiceRefQnamePatternToString(eDataType, instanceValue);
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT:
				return convertTransportGuaranteeTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.TRUE_FALSE_TYPE_BASE:
				return convertTrueFalseTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return convertTrueFalseTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp25Package.WAR_PATH_TYPE_BASE:
				return convertWarPathTypeBaseToString(eDataType, instanceValue);
			case Webapp25Package.WEB_APP_VERSION_TYPE_OBJECT:
				return convertWebAppVersionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatcherType createDispatcherType() {
		DispatcherTypeImpl dispatcherType = new DispatcherTypeImpl();
		return dispatcherType;
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
	public EjbLocalRefType createEjbLocalRefType() {
		EjbLocalRefTypeImpl ejbLocalRefType = new EjbLocalRefTypeImpl();
		return ejbLocalRefType;
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
	public EmptyType createEmptyType() {
		EmptyTypeImpl emptyType = new EmptyTypeImpl();
		return emptyType;
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
	public EnvEntryTypeValuesType createEnvEntryTypeValuesType() {
		EnvEntryTypeValuesTypeImpl envEntryTypeValuesType = new EnvEntryTypeValuesTypeImpl();
		return envEntryTypeValuesType;
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
	public FilterMappingType createFilterMappingType() {
		FilterMappingTypeImpl filterMappingType = new FilterMappingTypeImpl();
		return filterMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterNameType createFilterNameType() {
		FilterNameTypeImpl filterNameType = new FilterNameTypeImpl();
		return filterNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
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
	public FullyQualifiedClassType createFullyQualifiedClassType() {
		FullyQualifiedClassTypeImpl fullyQualifiedClassType = new FullyQualifiedClassTypeImpl();
		return fullyQualifiedClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericBooleanType createGenericBooleanType() {
		GenericBooleanTypeImpl genericBooleanType = new GenericBooleanTypeImpl();
		return genericBooleanType;
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
	public IconType createIconType() {
		IconTypeImpl iconType = new IconTypeImpl();
		return iconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjectionTargetType createInjectionTargetType() {
		InjectionTargetTypeImpl injectionTargetType = new InjectionTargetTypeImpl();
		return injectionTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaIdentifierType createJavaIdentifierType() {
		JavaIdentifierTypeImpl javaIdentifierType = new JavaIdentifierTypeImpl();
		return javaIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaTypeType createJavaTypeType() {
		JavaTypeTypeImpl javaTypeType = new JavaTypeTypeImpl();
		return javaTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType createJndiNameType() {
		JndiNameTypeImpl jndiNameType = new JndiNameTypeImpl();
		return jndiNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspConfigType createJspConfigType() {
		JspConfigTypeImpl jspConfigType = new JspConfigTypeImpl();
		return jspConfigType;
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
	public JspPropertyGroupType createJspPropertyGroupType() {
		JspPropertyGroupTypeImpl jspPropertyGroupType = new JspPropertyGroupTypeImpl();
		return jspPropertyGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleCallbackType createLifecycleCallbackType() {
		LifecycleCallbackTypeImpl lifecycleCallbackType = new LifecycleCallbackTypeImpl();
		return lifecycleCallbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenerType createListenerType() {
		ListenerTypeImpl listenerType = new ListenerTypeImpl();
		return listenerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocaleEncodingMappingListType createLocaleEncodingMappingListType() {
		LocaleEncodingMappingListTypeImpl localeEncodingMappingListType = new LocaleEncodingMappingListTypeImpl();
		return localeEncodingMappingListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocaleEncodingMappingType createLocaleEncodingMappingType() {
		LocaleEncodingMappingTypeImpl localeEncodingMappingType = new LocaleEncodingMappingTypeImpl();
		return localeEncodingMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHomeType createLocalHomeType() {
		LocalHomeTypeImpl localHomeType = new LocalHomeTypeImpl();
		return localHomeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType createLocalType() {
		LocalTypeImpl localType = new LocalTypeImpl();
		return localType;
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
	public MessageDestinationLinkType createMessageDestinationLinkType() {
		MessageDestinationLinkTypeImpl messageDestinationLinkType = new MessageDestinationLinkTypeImpl();
		return messageDestinationLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationRefType createMessageDestinationRefType() {
		MessageDestinationRefTypeImpl messageDestinationRefType = new MessageDestinationRefTypeImpl();
		return messageDestinationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationType createMessageDestinationType() {
		MessageDestinationTypeImpl messageDestinationType = new MessageDestinationTypeImpl();
		return messageDestinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationTypeType createMessageDestinationTypeType() {
		MessageDestinationTypeTypeImpl messageDestinationTypeType = new MessageDestinationTypeTypeImpl();
		return messageDestinationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageType createMessageDestinationUsageType() {
		MessageDestinationUsageTypeImpl messageDestinationUsageType = new MessageDestinationUsageTypeImpl();
		return messageDestinationUsageType;
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
	public NonEmptyStringType createNonEmptyStringType() {
		NonEmptyStringTypeImpl nonEmptyStringType = new NonEmptyStringTypeImpl();
		return nonEmptyStringType;
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
	public PathType createPathType() {
		PathTypeImpl pathType = new PathTypeImpl();
		return pathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextRefType createPersistenceContextRefType() {
		PersistenceContextRefTypeImpl persistenceContextRefType = new PersistenceContextRefTypeImpl();
		return persistenceContextRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextTypeType createPersistenceContextTypeType() {
		PersistenceContextTypeTypeImpl persistenceContextTypeType = new PersistenceContextTypeTypeImpl();
		return persistenceContextTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitRefType createPersistenceUnitRefType() {
		PersistenceUnitRefTypeImpl persistenceUnitRefType = new PersistenceUnitRefTypeImpl();
		return persistenceUnitRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComponentRefType createPortComponentRefType() {
		PortComponentRefTypeImpl portComponentRefType = new PortComponentRefTypeImpl();
		return portComponentRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
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
	public ResourceEnvRefType createResourceEnvRefType() {
		ResourceEnvRefTypeImpl resourceEnvRefType = new ResourceEnvRefTypeImpl();
		return resourceEnvRefType;
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
	public ResSharingScopeType createResSharingScopeType() {
		ResSharingScopeTypeImpl resSharingScopeType = new ResSharingScopeTypeImpl();
		return resSharingScopeType;
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
	public RunAsType createRunAsType() {
		RunAsTypeImpl runAsType = new RunAsTypeImpl();
		return runAsType;
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
	public ServiceRefHandlerChainsType createServiceRefHandlerChainsType() {
		ServiceRefHandlerChainsTypeImpl serviceRefHandlerChainsType = new ServiceRefHandlerChainsTypeImpl();
		return serviceRefHandlerChainsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandlerChainType createServiceRefHandlerChainType() {
		ServiceRefHandlerChainTypeImpl serviceRefHandlerChainType = new ServiceRefHandlerChainTypeImpl();
		return serviceRefHandlerChainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandlerType createServiceRefHandlerType() {
		ServiceRefHandlerTypeImpl serviceRefHandlerType = new ServiceRefHandlerTypeImpl();
		return serviceRefHandlerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefType createServiceRefType() {
		ServiceRefTypeImpl serviceRefType = new ServiceRefTypeImpl();
		return serviceRefType;
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
	public org.eclipse.modisco.jee.webapp.webapp25.String createString() {
		StringImpl string = new StringImpl();
		return string;
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
	public TransportGuaranteeType createTransportGuaranteeType() {
		TransportGuaranteeTypeImpl transportGuaranteeType = new TransportGuaranteeTypeImpl();
		return transportGuaranteeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType createTrueFalseType() {
		TrueFalseTypeImpl trueFalseType = new TrueFalseTypeImpl();
		return trueFalseType;
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
	public WarPathType createWarPathType() {
		WarPathTypeImpl warPathType = new WarPathTypeImpl();
		return warPathType;
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
	public WelcomeFileListType createWelcomeFileListType() {
		WelcomeFileListTypeImpl welcomeFileListType = new WelcomeFileListTypeImpl();
		return welcomeFileListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdAnyURIType createXsdAnyURIType() {
		XsdAnyURITypeImpl xsdAnyURIType = new XsdAnyURITypeImpl();
		return xsdAnyURIType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdBooleanType createXsdBooleanType() {
		XsdBooleanTypeImpl xsdBooleanType = new XsdBooleanTypeImpl();
		return xsdBooleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType createXsdIntegerType() {
		XsdIntegerTypeImpl xsdIntegerType = new XsdIntegerTypeImpl();
		return xsdIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdNMTOKENType createXsdNMTOKENType() {
		XsdNMTOKENTypeImpl xsdNMTOKENType = new XsdNMTOKENTypeImpl();
		return xsdNMTOKENType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdNonNegativeIntegerType createXsdNonNegativeIntegerType() {
		XsdNonNegativeIntegerTypeImpl xsdNonNegativeIntegerType = new XsdNonNegativeIntegerTypeImpl();
		return xsdNonNegativeIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdPositiveIntegerType createXsdPositiveIntegerType() {
		XsdPositiveIntegerTypeImpl xsdPositiveIntegerType = new XsdPositiveIntegerTypeImpl();
		return xsdPositiveIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdQNameType createXsdQNameType() {
		XsdQNameTypeImpl xsdQNameType = new XsdQNameTypeImpl();
		return xsdQNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType createXsdStringType() {
		XsdStringTypeImpl xsdStringType = new XsdStringTypeImpl();
		return xsdStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatcherTypeBase createDispatcherTypeBaseFromString(EDataType eDataType, String initialValue) {
		DispatcherTypeBase result = DispatcherTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispatcherTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeTypeBase createEjbRefTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		EjbRefTypeTypeBase result = EjbRefTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeValuesTypeBase createEnvEntryTypeValuesTypeBaseFromString(EDataType eDataType, String initialValue) {
		EnvEntryTypeValuesTypeBase result = EnvEntryTypeValuesTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeValuesTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericBooleanTypeBase createGenericBooleanTypeBaseFromString(EDataType eDataType, String initialValue) {
		GenericBooleanTypeBase result = GenericBooleanTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericBooleanTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageTypeBase createMessageDestinationUsageTypeBaseFromString(EDataType eDataType, String initialValue) {
		MessageDestinationUsageTypeBase result = MessageDestinationUsageTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullCharType createNullCharTypeFromString(EDataType eDataType, String initialValue) {
		NullCharType result = NullCharType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullCharTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextTypeTypeBase createPersistenceContextTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		PersistenceContextTypeTypeBase result = PersistenceContextTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceContextTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthTypeBase createResAuthTypeBaseFromString(EDataType eDataType, String initialValue) {
		ResAuthTypeBase result = ResAuthTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeTypeBase createResSharingScopeTypeBaseFromString(EDataType eDataType, String initialValue) {
		ResSharingScopeTypeBase result = ResSharingScopeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportGuaranteeTypeBase createTransportGuaranteeTypeBaseFromString(EDataType eDataType, String initialValue) {
		TransportGuaranteeTypeBase result = TransportGuaranteeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportGuaranteeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppVersionType createWebAppVersionTypeFromString(EDataType eDataType, String initialValue) {
		WebAppVersionType result = WebAppVersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWebAppVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAuthMethodTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthMethodTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDeweyVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeweyVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatcherTypeBase createDispatcherTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createDispatcherTypeBaseFromString(Webapp25Package.Literals.DISPATCHER_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispatcherTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDispatcherTypeBaseToString(Webapp25Package.Literals.DISPATCHER_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEjbLinkTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbLinkTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEjbRefNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeTypeBase createEjbRefTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createEjbRefTypeTypeBaseFromString(Webapp25Package.Literals.EJB_REF_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEjbRefTypeTypeBaseToString(Webapp25Package.Literals.EJB_REF_TYPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEncodingTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeValuesTypeBase createEnvEntryTypeValuesTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createEnvEntryTypeValuesTypeBaseFromString(Webapp25Package.Literals.ENV_ENTRY_TYPE_VALUES_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeValuesTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnvEntryTypeValuesTypeBaseToString(Webapp25Package.Literals.ENV_ENTRY_TYPE_VALUES_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createErrorCodeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorCodeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFullyQualifiedClassTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFullyQualifiedClassTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericBooleanTypeBase createGenericBooleanTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createGenericBooleanTypeBaseFromString(Webapp25Package.Literals.GENERIC_BOOLEAN_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericBooleanTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGenericBooleanTypeBaseToString(Webapp25Package.Literals.GENERIC_BOOLEAN_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHomeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHomeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHttpMethodTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaIdentifierTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIdentifierTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJndiNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJndiNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJspFileTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJspFileTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLoadOnStartupTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullCharTypeFromString(Webapp25Package.Literals.NULL_CHAR_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadOnStartupTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Webapp25Package.Literals.NULL_CHAR_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertNullCharTypeToString(Webapp25Package.Literals.NULL_CHAR_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocaleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocaleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalHomeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalHomeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMessageDestinationLinkTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationLinkTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMessageDestinationTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageTypeBase createMessageDestinationUsageTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageDestinationUsageTypeBaseFromString(Webapp25Package.Literals.MESSAGE_DESTINATION_USAGE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageDestinationUsageTypeBaseToString(Webapp25Package.Literals.MESSAGE_DESTINATION_USAGE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMimeTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyStringTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullCharType createNullCharTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNullCharTypeFromString(Webapp25Package.Literals.NULL_CHAR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullCharTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNullCharTypeToString(Webapp25Package.Literals.NULL_CHAR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextTypeTypeBase createPersistenceContextTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createPersistenceContextTypeTypeBaseFromString(Webapp25Package.Literals.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceContextTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceContextTypeTypeBaseToString(Webapp25Package.Literals.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRemoteTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthTypeBase createResAuthTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createResAuthTypeBaseFromString(Webapp25Package.Literals.RES_AUTH_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResAuthTypeBaseToString(Webapp25Package.Literals.RES_AUTH_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeTypeBase createResSharingScopeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createResSharingScopeTypeBaseFromString(Webapp25Package.Literals.RES_SHARING_SCOPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResSharingScopeTypeBaseToString(Webapp25Package.Literals.RES_SHARING_SCOPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoleNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createServiceRefProtocolBindingListTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createServiceRefProtocolBindingTypeFromString(Webapp25Package.Literals.SERVICE_REF_PROTOCOL_BINDING_TYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolBindingListTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertServiceRefProtocolBindingTypeToString(Webapp25Package.Literals.SERVICE_REF_PROTOCOL_BINDING_TYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefProtocolBindingTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createServiceRefProtocolURIAliasTypeFromString(Webapp25Package.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolBindingTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Webapp25Package.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertServiceRefProtocolURIAliasTypeToString(Webapp25Package.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefProtocolURIAliasTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolURIAliasTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefQnamePatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefQnamePatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportGuaranteeTypeBase createTransportGuaranteeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createTransportGuaranteeTypeBaseFromString(Webapp25Package.Literals.TRANSPORT_GUARANTEE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportGuaranteeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransportGuaranteeTypeBaseToString(Webapp25Package.Literals.TRANSPORT_GUARANTEE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTrueFalseTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTrueFalseTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createTrueFalseTypeBaseFromString(Webapp25Package.Literals.TRUE_FALSE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrueFalseTypeBaseToString(Webapp25Package.Literals.TRUE_FALSE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWarPathTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWarPathTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppVersionType createWebAppVersionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWebAppVersionTypeFromString(Webapp25Package.Literals.WEB_APP_VERSION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWebAppVersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWebAppVersionTypeToString(Webapp25Package.Literals.WEB_APP_VERSION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp25Package getWebapp25Package() {
		return (Webapp25Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Webapp25Package getPackage() {
		return Webapp25Package.eINSTANCE;
	}

} //Webapp25FactoryImpl
