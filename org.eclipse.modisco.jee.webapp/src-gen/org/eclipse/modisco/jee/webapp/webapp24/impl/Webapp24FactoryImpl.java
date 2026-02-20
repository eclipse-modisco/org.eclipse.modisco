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
package org.eclipse.modisco.jee.webapp.webapp24.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp24.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp24.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp24.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterType;
import org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanType;
import org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.HomeType;
import org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType;
import org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.IconType;
import org.eclipse.modisco.jee.webapp.webapp24.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp24.JavaTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp24.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp24.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp24.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp24.LocalType;
import org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationLinkType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.NonEmptyStringType;
import org.eclipse.modisco.jee.webapp.webapp24.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp24.PathType;
import org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp24.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp24.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.RoleNameType;
import org.eclipse.modisco.jee.webapp.webapp24.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType;
import org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletType;
import org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp24.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp24.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType;
import org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Factory;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;
import org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Webapp24FactoryImpl extends EFactoryImpl implements Webapp24Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Webapp24Factory init() {
		try {
			Webapp24Factory theWebapp24Factory = (Webapp24Factory)EPackage.Registry.INSTANCE.getEFactory(Webapp24Package.eNS_URI);
			if (theWebapp24Factory != null) {
				return theWebapp24Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Webapp24FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp24FactoryImpl() {
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
			case Webapp24Package.AUTH_CONSTRAINT_TYPE: return createAuthConstraintType();
			case Webapp24Package.AUTH_METHOD_TYPE: return createAuthMethodType();
			case Webapp24Package.DESCRIPTION_TYPE: return createDescriptionType();
			case Webapp24Package.DISPATCHER_TYPE: return createDispatcherType();
			case Webapp24Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case Webapp24Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Webapp24Package.EJB_LINK_TYPE: return createEjbLinkType();
			case Webapp24Package.EJB_LOCAL_REF_TYPE: return createEjbLocalRefType();
			case Webapp24Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case Webapp24Package.EJB_REF_TYPE: return createEjbRefType();
			case Webapp24Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case Webapp24Package.EMPTY_TYPE: return createEmptyType();
			case Webapp24Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case Webapp24Package.ENV_ENTRY_TYPE_VALUES_TYPE: return createEnvEntryTypeValuesType();
			case Webapp24Package.ERROR_CODE_TYPE: return createErrorCodeType();
			case Webapp24Package.ERROR_PAGE_TYPE: return createErrorPageType();
			case Webapp24Package.FILTER_MAPPING_TYPE: return createFilterMappingType();
			case Webapp24Package.FILTER_NAME_TYPE: return createFilterNameType();
			case Webapp24Package.FILTER_TYPE: return createFilterType();
			case Webapp24Package.FORM_LOGIN_CONFIG_TYPE: return createFormLoginConfigType();
			case Webapp24Package.FULLY_QUALIFIED_CLASS_TYPE: return createFullyQualifiedClassType();
			case Webapp24Package.GENERIC_BOOLEAN_TYPE: return createGenericBooleanType();
			case Webapp24Package.HOME_TYPE: return createHomeType();
			case Webapp24Package.HTTP_METHOD_TYPE: return createHttpMethodType();
			case Webapp24Package.ICON_TYPE: return createIconType();
			case Webapp24Package.JAVA_IDENTIFIER_TYPE: return createJavaIdentifierType();
			case Webapp24Package.JAVA_TYPE_TYPE: return createJavaTypeType();
			case Webapp24Package.JNDI_NAME_TYPE: return createJndiNameType();
			case Webapp24Package.JSP_CONFIG_TYPE: return createJspConfigType();
			case Webapp24Package.JSP_FILE_TYPE: return createJspFileType();
			case Webapp24Package.JSP_PROPERTY_GROUP_TYPE: return createJspPropertyGroupType();
			case Webapp24Package.LISTENER_TYPE: return createListenerType();
			case Webapp24Package.LOCALE_ENCODING_MAPPING_LIST_TYPE: return createLocaleEncodingMappingListType();
			case Webapp24Package.LOCALE_ENCODING_MAPPING_TYPE: return createLocaleEncodingMappingType();
			case Webapp24Package.LOCAL_HOME_TYPE: return createLocalHomeType();
			case Webapp24Package.LOCAL_TYPE: return createLocalType();
			case Webapp24Package.LOGIN_CONFIG_TYPE: return createLoginConfigType();
			case Webapp24Package.MESSAGE_DESTINATION_LINK_TYPE: return createMessageDestinationLinkType();
			case Webapp24Package.MESSAGE_DESTINATION_REF_TYPE: return createMessageDestinationRefType();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE: return createMessageDestinationType();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE_TYPE: return createMessageDestinationTypeType();
			case Webapp24Package.MESSAGE_DESTINATION_USAGE_TYPE: return createMessageDestinationUsageType();
			case Webapp24Package.MIME_MAPPING_TYPE: return createMimeMappingType();
			case Webapp24Package.MIME_TYPE_TYPE: return createMimeTypeType();
			case Webapp24Package.NON_EMPTY_STRING_TYPE: return createNonEmptyStringType();
			case Webapp24Package.PARAM_VALUE_TYPE: return createParamValueType();
			case Webapp24Package.PATH_TYPE: return createPathType();
			case Webapp24Package.PORT_COMPONENT_REF_TYPE: return createPortComponentRefType();
			case Webapp24Package.REMOTE_TYPE: return createRemoteType();
			case Webapp24Package.RES_AUTH_TYPE: return createResAuthType();
			case Webapp24Package.RESOURCE_ENV_REF_TYPE: return createResourceEnvRefType();
			case Webapp24Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case Webapp24Package.RES_SHARING_SCOPE_TYPE: return createResSharingScopeType();
			case Webapp24Package.ROLE_NAME_TYPE: return createRoleNameType();
			case Webapp24Package.RUN_AS_TYPE: return createRunAsType();
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE: return createSecurityConstraintType();
			case Webapp24Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case Webapp24Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case Webapp24Package.SERVICE_REF_HANDLER_TYPE: return createServiceRefHandlerType();
			case Webapp24Package.SERVICE_REF_TYPE: return createServiceRefType();
			case Webapp24Package.SERVLET_MAPPING_TYPE: return createServletMappingType();
			case Webapp24Package.SERVLET_NAME_TYPE: return createServletNameType();
			case Webapp24Package.SERVLET_TYPE: return createServletType();
			case Webapp24Package.SESSION_CONFIG_TYPE: return createSessionConfigType();
			case Webapp24Package.STRING: return createString();
			case Webapp24Package.TAGLIB_TYPE: return createTaglibType();
			case Webapp24Package.TRANSPORT_GUARANTEE_TYPE: return createTransportGuaranteeType();
			case Webapp24Package.TRUE_FALSE_TYPE: return createTrueFalseType();
			case Webapp24Package.URL_PATTERN_TYPE: return createUrlPatternType();
			case Webapp24Package.USER_DATA_CONSTRAINT_TYPE: return createUserDataConstraintType();
			case Webapp24Package.WAR_PATH_TYPE: return createWarPathType();
			case Webapp24Package.WEB_APP_TYPE: return createWebAppType();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE: return createWebResourceCollectionType();
			case Webapp24Package.WELCOME_FILE_LIST_TYPE: return createWelcomeFileListType();
			case Webapp24Package.XSD_ANY_URI_TYPE: return createXsdAnyURIType();
			case Webapp24Package.XSD_BOOLEAN_TYPE: return createXsdBooleanType();
			case Webapp24Package.XSD_INTEGER_TYPE: return createXsdIntegerType();
			case Webapp24Package.XSD_NMTOKEN_TYPE: return createXsdNMTOKENType();
			case Webapp24Package.XSD_NON_NEGATIVE_INTEGER_TYPE: return createXsdNonNegativeIntegerType();
			case Webapp24Package.XSD_POSITIVE_INTEGER_TYPE: return createXsdPositiveIntegerType();
			case Webapp24Package.XSD_QNAME_TYPE: return createXsdQNameType();
			case Webapp24Package.XSD_STRING_TYPE: return createXsdStringType();
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
			case Webapp24Package.DISPATCHER_TYPE_BASE:
				return createDispatcherTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.EJB_REF_TYPE_TYPE_BASE:
				return createEjbRefTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return createEnvEntryTypeValuesTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.GENERIC_BOOLEAN_TYPE_BASE:
				return createGenericBooleanTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.HTTP_METHOD_TYPE_BASE:
				return createHttpMethodTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return createMessageDestinationUsageTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.RES_AUTH_TYPE_BASE:
				return createResAuthTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.RES_SHARING_SCOPE_TYPE_BASE:
				return createResSharingScopeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.TRANSPORT_GUARANTEE_TYPE_BASE:
				return createTransportGuaranteeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.WEB_APP_VERSION_TYPE:
				return createWebAppVersionTypeFromString(eDataType, initialValue);
			case Webapp24Package.AUTH_METHOD_TYPE_BASE:
				return createAuthMethodTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.DEWEY_VERSION_TYPE:
				return createDeweyVersionTypeFromString(eDataType, initialValue);
			case Webapp24Package.DISPATCHER_TYPE_BASE_OBJECT:
				return createDispatcherTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.EJB_LINK_TYPE_BASE:
				return createEjbLinkTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.EJB_REF_NAME_TYPE_BASE:
				return createEjbRefNameTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return createEjbRefTypeTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.ENCODING_TYPE:
				return createEncodingTypeFromString(eDataType, initialValue);
			case Webapp24Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return createEnvEntryTypeValuesTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.ERROR_CODE_TYPE_BASE:
				return createErrorCodeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return createFullyQualifiedClassTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return createGenericBooleanTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.HOME_TYPE_BASE:
				return createHomeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.HTTP_METHOD_TYPE_BASE_OBJECT:
				return createHttpMethodTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.JAVA_IDENTIFIER_TYPE_BASE:
				return createJavaIdentifierTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.JAVA_TYPE_TYPE_BASE:
				return createJavaTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.JNDI_NAME_TYPE_BASE:
				return createJndiNameTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.JSP_FILE_TYPE_BASE:
				return createJspFileTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.LOCALE_TYPE:
				return createLocaleTypeFromString(eDataType, initialValue);
			case Webapp24Package.LOCAL_HOME_TYPE_BASE:
				return createLocalHomeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.LOCAL_TYPE_BASE:
				return createLocalTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return createMessageDestinationLinkTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return createMessageDestinationTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return createMessageDestinationUsageTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.MIME_TYPE_TYPE_BASE:
				return createMimeTypeTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.NON_EMPTY_STRING_TYPE_BASE:
				return createNonEmptyStringTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.PATH_TYPE_BASE:
				return createPathTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.REMOTE_TYPE_BASE:
				return createRemoteTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.RES_AUTH_TYPE_BASE_OBJECT:
				return createResAuthTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return createResSharingScopeTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.ROLE_NAME_TYPE_BASE:
				return createRoleNameTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT:
				return createTransportGuaranteeTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.TRUE_FALSE_TYPE_BASE:
				return createTrueFalseTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return createTrueFalseTypeBaseObjectFromString(eDataType, initialValue);
			case Webapp24Package.WAR_PATH_TYPE_BASE:
				return createWarPathTypeBaseFromString(eDataType, initialValue);
			case Webapp24Package.WEB_APP_VERSION_TYPE_OBJECT:
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
			case Webapp24Package.DISPATCHER_TYPE_BASE:
				return convertDispatcherTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.EJB_REF_TYPE_TYPE_BASE:
				return convertEjbRefTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return convertEnvEntryTypeValuesTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.GENERIC_BOOLEAN_TYPE_BASE:
				return convertGenericBooleanTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.HTTP_METHOD_TYPE_BASE:
				return convertHttpMethodTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return convertMessageDestinationUsageTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.RES_AUTH_TYPE_BASE:
				return convertResAuthTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.RES_SHARING_SCOPE_TYPE_BASE:
				return convertResSharingScopeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.TRANSPORT_GUARANTEE_TYPE_BASE:
				return convertTransportGuaranteeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.WEB_APP_VERSION_TYPE:
				return convertWebAppVersionTypeToString(eDataType, instanceValue);
			case Webapp24Package.AUTH_METHOD_TYPE_BASE:
				return convertAuthMethodTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.DEWEY_VERSION_TYPE:
				return convertDeweyVersionTypeToString(eDataType, instanceValue);
			case Webapp24Package.DISPATCHER_TYPE_BASE_OBJECT:
				return convertDispatcherTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.EJB_LINK_TYPE_BASE:
				return convertEjbLinkTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.EJB_REF_NAME_TYPE_BASE:
				return convertEjbRefNameTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return convertEjbRefTypeTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.ENCODING_TYPE:
				return convertEncodingTypeToString(eDataType, instanceValue);
			case Webapp24Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return convertEnvEntryTypeValuesTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.ERROR_CODE_TYPE_BASE:
				return convertErrorCodeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return convertFullyQualifiedClassTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return convertGenericBooleanTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.HOME_TYPE_BASE:
				return convertHomeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.HTTP_METHOD_TYPE_BASE_OBJECT:
				return convertHttpMethodTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.JAVA_IDENTIFIER_TYPE_BASE:
				return convertJavaIdentifierTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.JAVA_TYPE_TYPE_BASE:
				return convertJavaTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.JNDI_NAME_TYPE_BASE:
				return convertJndiNameTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.JSP_FILE_TYPE_BASE:
				return convertJspFileTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.LOCALE_TYPE:
				return convertLocaleTypeToString(eDataType, instanceValue);
			case Webapp24Package.LOCAL_HOME_TYPE_BASE:
				return convertLocalHomeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.LOCAL_TYPE_BASE:
				return convertLocalTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return convertMessageDestinationLinkTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return convertMessageDestinationTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return convertMessageDestinationUsageTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.MIME_TYPE_TYPE_BASE:
				return convertMimeTypeTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.NON_EMPTY_STRING_TYPE_BASE:
				return convertNonEmptyStringTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.PATH_TYPE_BASE:
				return convertPathTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.REMOTE_TYPE_BASE:
				return convertRemoteTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.RES_AUTH_TYPE_BASE_OBJECT:
				return convertResAuthTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return convertResSharingScopeTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.ROLE_NAME_TYPE_BASE:
				return convertRoleNameTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT:
				return convertTransportGuaranteeTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.TRUE_FALSE_TYPE_BASE:
				return convertTrueFalseTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return convertTrueFalseTypeBaseObjectToString(eDataType, instanceValue);
			case Webapp24Package.WAR_PATH_TYPE_BASE:
				return convertWarPathTypeBaseToString(eDataType, instanceValue);
			case Webapp24Package.WEB_APP_VERSION_TYPE_OBJECT:
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
	public PortComponentRefType createPortComponentRefType() {
		PortComponentRefTypeImpl portComponentRefType = new PortComponentRefTypeImpl();
		return portComponentRefType;
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
	public org.eclipse.modisco.jee.webapp.webapp24.String createString() {
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
	public HttpMethodTypeBase createHttpMethodTypeBaseFromString(EDataType eDataType, String initialValue) {
		HttpMethodTypeBase result = HttpMethodTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodTypeBaseToString(EDataType eDataType, Object instanceValue) {
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
	public BigDecimal createDeweyVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeweyVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatcherTypeBase createDispatcherTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createDispatcherTypeBaseFromString(Webapp24Package.Literals.DISPATCHER_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispatcherTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDispatcherTypeBaseToString(Webapp24Package.Literals.DISPATCHER_TYPE_BASE, instanceValue);
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
		return createEjbRefTypeTypeBaseFromString(Webapp24Package.Literals.EJB_REF_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEjbRefTypeTypeBaseToString(Webapp24Package.Literals.EJB_REF_TYPE_TYPE_BASE, instanceValue);
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
		return createEnvEntryTypeValuesTypeBaseFromString(Webapp24Package.Literals.ENV_ENTRY_TYPE_VALUES_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeValuesTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnvEntryTypeValuesTypeBaseToString(Webapp24Package.Literals.ENV_ENTRY_TYPE_VALUES_TYPE_BASE, instanceValue);
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
		return createGenericBooleanTypeBaseFromString(Webapp24Package.Literals.GENERIC_BOOLEAN_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericBooleanTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGenericBooleanTypeBaseToString(Webapp24Package.Literals.GENERIC_BOOLEAN_TYPE_BASE, instanceValue);
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
	public HttpMethodTypeBase createHttpMethodTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createHttpMethodTypeBaseFromString(Webapp24Package.Literals.HTTP_METHOD_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHttpMethodTypeBaseToString(Webapp24Package.Literals.HTTP_METHOD_TYPE_BASE, instanceValue);
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
		return createMessageDestinationUsageTypeBaseFromString(Webapp24Package.Literals.MESSAGE_DESTINATION_USAGE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageDestinationUsageTypeBaseToString(Webapp24Package.Literals.MESSAGE_DESTINATION_USAGE_TYPE_BASE, instanceValue);
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
		return createResAuthTypeBaseFromString(Webapp24Package.Literals.RES_AUTH_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResAuthTypeBaseToString(Webapp24Package.Literals.RES_AUTH_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeTypeBase createResSharingScopeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createResSharingScopeTypeBaseFromString(Webapp24Package.Literals.RES_SHARING_SCOPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResSharingScopeTypeBaseToString(Webapp24Package.Literals.RES_SHARING_SCOPE_TYPE_BASE, instanceValue);
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
	public TransportGuaranteeTypeBase createTransportGuaranteeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createTransportGuaranteeTypeBaseFromString(Webapp24Package.Literals.TRANSPORT_GUARANTEE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportGuaranteeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransportGuaranteeTypeBaseToString(Webapp24Package.Literals.TRANSPORT_GUARANTEE_TYPE_BASE, instanceValue);
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
		return createTrueFalseTypeBaseFromString(Webapp24Package.Literals.TRUE_FALSE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrueFalseTypeBaseToString(Webapp24Package.Literals.TRUE_FALSE_TYPE_BASE, instanceValue);
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
		return createWebAppVersionTypeFromString(Webapp24Package.Literals.WEB_APP_VERSION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWebAppVersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWebAppVersionTypeToString(Webapp24Package.Literals.WEB_APP_VERSION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp24Package getWebapp24Package() {
		return (Webapp24Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Webapp24Package getPackage() {
		return Webapp24Package.eINSTANCE;
	}

} //Webapp24FactoryImpl
