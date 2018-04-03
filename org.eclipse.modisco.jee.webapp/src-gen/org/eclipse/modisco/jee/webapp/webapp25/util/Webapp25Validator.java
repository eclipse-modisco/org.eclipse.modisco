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
package org.eclipse.modisco.jee.webapp.webapp25.util;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

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
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package
 * @generated
 */
public class Webapp25Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final Webapp25Validator INSTANCE = new Webapp25Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.modisco.jee.webapp.webapp25"; //$NON-NLS-1$

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public Webapp25Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Webapp25Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
			case Webapp25Package.AUTH_CONSTRAINT_TYPE:
				return validateAuthConstraintType((AuthConstraintType)value, diagnostics, context);
			case Webapp25Package.AUTH_METHOD_TYPE:
				return validateAuthMethodType((AuthMethodType)value, diagnostics, context);
			case Webapp25Package.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case Webapp25Package.DISPATCHER_TYPE:
				return validateDispatcherType((DispatcherType)value, diagnostics, context);
			case Webapp25Package.DISPLAY_NAME_TYPE:
				return validateDisplayNameType((DisplayNameType)value, diagnostics, context);
			case Webapp25Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Webapp25Package.EJB_LINK_TYPE:
				return validateEjbLinkType((EjbLinkType)value, diagnostics, context);
			case Webapp25Package.EJB_LOCAL_REF_TYPE:
				return validateEjbLocalRefType((EjbLocalRefType)value, diagnostics, context);
			case Webapp25Package.EJB_REF_NAME_TYPE:
				return validateEjbRefNameType((EjbRefNameType)value, diagnostics, context);
			case Webapp25Package.EJB_REF_TYPE:
				return validateEjbRefType((EjbRefType)value, diagnostics, context);
			case Webapp25Package.EJB_REF_TYPE_TYPE:
				return validateEjbRefTypeType((EjbRefTypeType)value, diagnostics, context);
			case Webapp25Package.EMPTY_TYPE:
				return validateEmptyType((EmptyType)value, diagnostics, context);
			case Webapp25Package.ENV_ENTRY_TYPE:
				return validateEnvEntryType((EnvEntryType)value, diagnostics, context);
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE:
				return validateEnvEntryTypeValuesType((EnvEntryTypeValuesType)value, diagnostics, context);
			case Webapp25Package.ERROR_CODE_TYPE:
				return validateErrorCodeType((ErrorCodeType)value, diagnostics, context);
			case Webapp25Package.ERROR_PAGE_TYPE:
				return validateErrorPageType((ErrorPageType)value, diagnostics, context);
			case Webapp25Package.FILTER_MAPPING_TYPE:
				return validateFilterMappingType((FilterMappingType)value, diagnostics, context);
			case Webapp25Package.FILTER_NAME_TYPE:
				return validateFilterNameType((FilterNameType)value, diagnostics, context);
			case Webapp25Package.FILTER_TYPE:
				return validateFilterType((FilterType)value, diagnostics, context);
			case Webapp25Package.FORM_LOGIN_CONFIG_TYPE:
				return validateFormLoginConfigType((FormLoginConfigType)value, diagnostics, context);
			case Webapp25Package.FULLY_QUALIFIED_CLASS_TYPE:
				return validateFullyQualifiedClassType((FullyQualifiedClassType)value, diagnostics, context);
			case Webapp25Package.GENERIC_BOOLEAN_TYPE:
				return validateGenericBooleanType((GenericBooleanType)value, diagnostics, context);
			case Webapp25Package.HOME_TYPE:
				return validateHomeType((HomeType)value, diagnostics, context);
			case Webapp25Package.ICON_TYPE:
				return validateIconType((IconType)value, diagnostics, context);
			case Webapp25Package.INJECTION_TARGET_TYPE:
				return validateInjectionTargetType((InjectionTargetType)value, diagnostics, context);
			case Webapp25Package.JAVA_IDENTIFIER_TYPE:
				return validateJavaIdentifierType((JavaIdentifierType)value, diagnostics, context);
			case Webapp25Package.JAVA_TYPE_TYPE:
				return validateJavaTypeType((JavaTypeType)value, diagnostics, context);
			case Webapp25Package.JNDI_NAME_TYPE:
				return validateJndiNameType((JndiNameType)value, diagnostics, context);
			case Webapp25Package.JSP_CONFIG_TYPE:
				return validateJspConfigType((JspConfigType)value, diagnostics, context);
			case Webapp25Package.JSP_FILE_TYPE:
				return validateJspFileType((JspFileType)value, diagnostics, context);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE:
				return validateJspPropertyGroupType((JspPropertyGroupType)value, diagnostics, context);
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE:
				return validateLifecycleCallbackType((LifecycleCallbackType)value, diagnostics, context);
			case Webapp25Package.LISTENER_TYPE:
				return validateListenerType((ListenerType)value, diagnostics, context);
			case Webapp25Package.LOCALE_ENCODING_MAPPING_LIST_TYPE:
				return validateLocaleEncodingMappingListType((LocaleEncodingMappingListType)value, diagnostics, context);
			case Webapp25Package.LOCALE_ENCODING_MAPPING_TYPE:
				return validateLocaleEncodingMappingType((LocaleEncodingMappingType)value, diagnostics, context);
			case Webapp25Package.LOCAL_HOME_TYPE:
				return validateLocalHomeType((LocalHomeType)value, diagnostics, context);
			case Webapp25Package.LOCAL_TYPE:
				return validateLocalType((LocalType)value, diagnostics, context);
			case Webapp25Package.LOGIN_CONFIG_TYPE:
				return validateLoginConfigType((LoginConfigType)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_LINK_TYPE:
				return validateMessageDestinationLinkType((MessageDestinationLinkType)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_REF_TYPE:
				return validateMessageDestinationRefType((MessageDestinationRefType)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_TYPE:
				return validateMessageDestinationType((MessageDestinationType)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_TYPE_TYPE:
				return validateMessageDestinationTypeType((MessageDestinationTypeType)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE:
				return validateMessageDestinationUsageType((MessageDestinationUsageType)value, diagnostics, context);
			case Webapp25Package.MIME_MAPPING_TYPE:
				return validateMimeMappingType((MimeMappingType)value, diagnostics, context);
			case Webapp25Package.MIME_TYPE_TYPE:
				return validateMimeTypeType((MimeTypeType)value, diagnostics, context);
			case Webapp25Package.NON_EMPTY_STRING_TYPE:
				return validateNonEmptyStringType((NonEmptyStringType)value, diagnostics, context);
			case Webapp25Package.PARAM_VALUE_TYPE:
				return validateParamValueType((ParamValueType)value, diagnostics, context);
			case Webapp25Package.PATH_TYPE:
				return validatePathType((PathType)value, diagnostics, context);
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE:
				return validatePersistenceContextRefType((PersistenceContextRefType)value, diagnostics, context);
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE:
				return validatePersistenceContextTypeType((PersistenceContextTypeType)value, diagnostics, context);
			case Webapp25Package.PERSISTENCE_UNIT_REF_TYPE:
				return validatePersistenceUnitRefType((PersistenceUnitRefType)value, diagnostics, context);
			case Webapp25Package.PORT_COMPONENT_REF_TYPE:
				return validatePortComponentRefType((PortComponentRefType)value, diagnostics, context);
			case Webapp25Package.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case Webapp25Package.REMOTE_TYPE:
				return validateRemoteType((RemoteType)value, diagnostics, context);
			case Webapp25Package.RES_AUTH_TYPE:
				return validateResAuthType((ResAuthType)value, diagnostics, context);
			case Webapp25Package.RESOURCE_ENV_REF_TYPE:
				return validateResourceEnvRefType((ResourceEnvRefType)value, diagnostics, context);
			case Webapp25Package.RESOURCE_REF_TYPE:
				return validateResourceRefType((ResourceRefType)value, diagnostics, context);
			case Webapp25Package.RES_SHARING_SCOPE_TYPE:
				return validateResSharingScopeType((ResSharingScopeType)value, diagnostics, context);
			case Webapp25Package.ROLE_NAME_TYPE:
				return validateRoleNameType((RoleNameType)value, diagnostics, context);
			case Webapp25Package.RUN_AS_TYPE:
				return validateRunAsType((RunAsType)value, diagnostics, context);
			case Webapp25Package.SECURITY_CONSTRAINT_TYPE:
				return validateSecurityConstraintType((SecurityConstraintType)value, diagnostics, context);
			case Webapp25Package.SECURITY_ROLE_REF_TYPE:
				return validateSecurityRoleRefType((SecurityRoleRefType)value, diagnostics, context);
			case Webapp25Package.SECURITY_ROLE_TYPE:
				return validateSecurityRoleType((SecurityRoleType)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_HANDLER_CHAINS_TYPE:
				return validateServiceRefHandlerChainsType((ServiceRefHandlerChainsType)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE:
				return validateServiceRefHandlerChainType((ServiceRefHandlerChainType)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_HANDLER_TYPE:
				return validateServiceRefHandlerType((ServiceRefHandlerType)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_TYPE:
				return validateServiceRefType((ServiceRefType)value, diagnostics, context);
			case Webapp25Package.SERVLET_MAPPING_TYPE:
				return validateServletMappingType((ServletMappingType)value, diagnostics, context);
			case Webapp25Package.SERVLET_NAME_TYPE:
				return validateServletNameType((ServletNameType)value, diagnostics, context);
			case Webapp25Package.SERVLET_TYPE:
				return validateServletType((ServletType)value, diagnostics, context);
			case Webapp25Package.SESSION_CONFIG_TYPE:
				return validateSessionConfigType((SessionConfigType)value, diagnostics, context);
			case Webapp25Package.STRING:
				return validateString((org.eclipse.modisco.jee.webapp.webapp25.String)value, diagnostics, context);
			case Webapp25Package.TAGLIB_TYPE:
				return validateTaglibType((TaglibType)value, diagnostics, context);
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE:
				return validateTransportGuaranteeType((TransportGuaranteeType)value, diagnostics, context);
			case Webapp25Package.TRUE_FALSE_TYPE:
				return validateTrueFalseType((TrueFalseType)value, diagnostics, context);
			case Webapp25Package.URL_PATTERN_TYPE:
				return validateUrlPatternType((UrlPatternType)value, diagnostics, context);
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE:
				return validateUserDataConstraintType((UserDataConstraintType)value, diagnostics, context);
			case Webapp25Package.WAR_PATH_TYPE:
				return validateWarPathType((WarPathType)value, diagnostics, context);
			case Webapp25Package.WEB_APP_TYPE:
				return validateWebAppType((WebAppType)value, diagnostics, context);
			case Webapp25Package.WEB_RESOURCE_COLLECTION_TYPE:
				return validateWebResourceCollectionType((WebResourceCollectionType)value, diagnostics, context);
			case Webapp25Package.WELCOME_FILE_LIST_TYPE:
				return validateWelcomeFileListType((WelcomeFileListType)value, diagnostics, context);
			case Webapp25Package.XSD_ANY_URI_TYPE:
				return validateXsdAnyURIType((XsdAnyURIType)value, diagnostics, context);
			case Webapp25Package.XSD_BOOLEAN_TYPE:
				return validateXsdBooleanType((XsdBooleanType)value, diagnostics, context);
			case Webapp25Package.XSD_INTEGER_TYPE:
				return validateXsdIntegerType((XsdIntegerType)value, diagnostics, context);
			case Webapp25Package.XSD_NMTOKEN_TYPE:
				return validateXsdNMTOKENType((XsdNMTOKENType)value, diagnostics, context);
			case Webapp25Package.XSD_NON_NEGATIVE_INTEGER_TYPE:
				return validateXsdNonNegativeIntegerType((XsdNonNegativeIntegerType)value, diagnostics, context);
			case Webapp25Package.XSD_POSITIVE_INTEGER_TYPE:
				return validateXsdPositiveIntegerType((XsdPositiveIntegerType)value, diagnostics, context);
			case Webapp25Package.XSD_QNAME_TYPE:
				return validateXsdQNameType((XsdQNameType)value, diagnostics, context);
			case Webapp25Package.XSD_STRING_TYPE:
				return validateXsdStringType((XsdStringType)value, diagnostics, context);
			case Webapp25Package.DISPATCHER_TYPE_BASE:
				return validateDispatcherTypeBase((DispatcherTypeBase)value, diagnostics, context);
			case Webapp25Package.EJB_REF_TYPE_TYPE_BASE:
				return validateEjbRefTypeTypeBase((EjbRefTypeTypeBase)value, diagnostics, context);
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return validateEnvEntryTypeValuesTypeBase((EnvEntryTypeValuesTypeBase)value, diagnostics, context);
			case Webapp25Package.GENERIC_BOOLEAN_TYPE_BASE:
				return validateGenericBooleanTypeBase((GenericBooleanTypeBase)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return validateMessageDestinationUsageTypeBase((MessageDestinationUsageTypeBase)value, diagnostics, context);
			case Webapp25Package.NULL_CHAR_TYPE:
				return validateNullCharType((NullCharType)value, diagnostics, context);
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return validatePersistenceContextTypeTypeBase((PersistenceContextTypeTypeBase)value, diagnostics, context);
			case Webapp25Package.RES_AUTH_TYPE_BASE:
				return validateResAuthTypeBase((ResAuthTypeBase)value, diagnostics, context);
			case Webapp25Package.RES_SHARING_SCOPE_TYPE_BASE:
				return validateResSharingScopeTypeBase((ResSharingScopeTypeBase)value, diagnostics, context);
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE_BASE:
				return validateTransportGuaranteeTypeBase((TransportGuaranteeTypeBase)value, diagnostics, context);
			case Webapp25Package.WEB_APP_VERSION_TYPE:
				return validateWebAppVersionType((WebAppVersionType)value, diagnostics, context);
			case Webapp25Package.AUTH_METHOD_TYPE_BASE:
				return validateAuthMethodTypeBase((String)value, diagnostics, context);
			case Webapp25Package.DEWEY_VERSION_TYPE:
				return validateDeweyVersionType((String)value, diagnostics, context);
			case Webapp25Package.DISPATCHER_TYPE_BASE_OBJECT:
				return validateDispatcherTypeBaseObject((DispatcherTypeBase)value, diagnostics, context);
			case Webapp25Package.EJB_LINK_TYPE_BASE:
				return validateEjbLinkTypeBase((String)value, diagnostics, context);
			case Webapp25Package.EJB_REF_NAME_TYPE_BASE:
				return validateEjbRefNameTypeBase((String)value, diagnostics, context);
			case Webapp25Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return validateEjbRefTypeTypeBaseObject((EjbRefTypeTypeBase)value, diagnostics, context);
			case Webapp25Package.ENCODING_TYPE:
				return validateEncodingType((String)value, diagnostics, context);
			case Webapp25Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return validateEnvEntryTypeValuesTypeBaseObject((EnvEntryTypeValuesTypeBase)value, diagnostics, context);
			case Webapp25Package.ERROR_CODE_TYPE_BASE:
				return validateErrorCodeTypeBase((BigInteger)value, diagnostics, context);
			case Webapp25Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return validateFullyQualifiedClassTypeBase((String)value, diagnostics, context);
			case Webapp25Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return validateGenericBooleanTypeBaseObject((GenericBooleanTypeBase)value, diagnostics, context);
			case Webapp25Package.HOME_TYPE_BASE:
				return validateHomeTypeBase((String)value, diagnostics, context);
			case Webapp25Package.HTTP_METHOD_TYPE:
				return validateHttpMethodType((String)value, diagnostics, context);
			case Webapp25Package.JAVA_IDENTIFIER_TYPE_BASE:
				return validateJavaIdentifierTypeBase((String)value, diagnostics, context);
			case Webapp25Package.JAVA_TYPE_TYPE_BASE:
				return validateJavaTypeTypeBase((String)value, diagnostics, context);
			case Webapp25Package.JNDI_NAME_TYPE_BASE:
				return validateJndiNameTypeBase((String)value, diagnostics, context);
			case Webapp25Package.JSP_FILE_TYPE_BASE:
				return validateJspFileTypeBase((String)value, diagnostics, context);
			case Webapp25Package.LOAD_ON_STARTUP_TYPE:
				return validateLoadOnStartupType(value, diagnostics, context);
			case Webapp25Package.LOCALE_TYPE:
				return validateLocaleType((String)value, diagnostics, context);
			case Webapp25Package.LOCAL_HOME_TYPE_BASE:
				return validateLocalHomeTypeBase((String)value, diagnostics, context);
			case Webapp25Package.LOCAL_TYPE_BASE:
				return validateLocalTypeBase((String)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return validateMessageDestinationLinkTypeBase((String)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return validateMessageDestinationTypeTypeBase((String)value, diagnostics, context);
			case Webapp25Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return validateMessageDestinationUsageTypeBaseObject((MessageDestinationUsageTypeBase)value, diagnostics, context);
			case Webapp25Package.MIME_TYPE_TYPE_BASE:
				return validateMimeTypeTypeBase((String)value, diagnostics, context);
			case Webapp25Package.NON_EMPTY_STRING_TYPE_BASE:
				return validateNonEmptyStringTypeBase((String)value, diagnostics, context);
			case Webapp25Package.NULL_CHAR_TYPE_OBJECT:
				return validateNullCharTypeObject((NullCharType)value, diagnostics, context);
			case Webapp25Package.PATH_TYPE_BASE:
				return validatePathTypeBase((String)value, diagnostics, context);
			case Webapp25Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return validatePersistenceContextTypeTypeBaseObject((PersistenceContextTypeTypeBase)value, diagnostics, context);
			case Webapp25Package.REMOTE_TYPE_BASE:
				return validateRemoteTypeBase((String)value, diagnostics, context);
			case Webapp25Package.RES_AUTH_TYPE_BASE_OBJECT:
				return validateResAuthTypeBaseObject((ResAuthTypeBase)value, diagnostics, context);
			case Webapp25Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return validateResSharingScopeTypeBaseObject((ResSharingScopeTypeBase)value, diagnostics, context);
			case Webapp25Package.ROLE_NAME_TYPE_BASE:
				return validateRoleNameTypeBase((String)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return validateServiceRefProtocolBindingListType((List<?>)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return validateServiceRefProtocolBindingType((String)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return validateServiceRefProtocolURIAliasType((String)value, diagnostics, context);
			case Webapp25Package.SERVICE_REF_QNAME_PATTERN:
				return validateServiceRefQnamePattern((String)value, diagnostics, context);
			case Webapp25Package.TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT:
				return validateTransportGuaranteeTypeBaseObject((TransportGuaranteeTypeBase)value, diagnostics, context);
			case Webapp25Package.TRUE_FALSE_TYPE_BASE:
				return validateTrueFalseTypeBase((Boolean)value, diagnostics, context);
			case Webapp25Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return validateTrueFalseTypeBaseObject((Boolean)value, diagnostics, context);
			case Webapp25Package.WAR_PATH_TYPE_BASE:
				return validateWarPathTypeBase((String)value, diagnostics, context);
			case Webapp25Package.WEB_APP_VERSION_TYPE_OBJECT:
				return validateWebAppVersionTypeObject((WebAppVersionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthConstraintType(AuthConstraintType authConstraintType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthMethodType(AuthMethodType authMethodType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authMethodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatcherType(DispatcherType dispatcherType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dispatcherType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayNameType(DisplayNameType displayNameType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(displayNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbLinkType(EjbLinkType ejbLinkType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbLocalRefType(EjbLocalRefType ejbLocalRefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbLocalRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefNameType(EjbRefNameType ejbRefNameType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRefNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefType(EjbRefType ejbRefType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefTypeType(EjbRefTypeType ejbRefTypeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRefTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmptyType(EmptyType emptyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emptyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryType(EnvEntryType envEntryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryTypeValuesType(EnvEntryTypeValuesType envEntryTypeValuesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envEntryTypeValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorCodeType(ErrorCodeType errorCodeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorPageType(ErrorPageType errorPageType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorPageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterMappingType(FilterMappingType filterMappingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterMappingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterNameType(FilterNameType filterNameType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterType(FilterType filterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLoginConfigType(FormLoginConfigType formLoginConfigType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formLoginConfigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullyQualifiedClassType(FullyQualifiedClassType fullyQualifiedClassType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fullyQualifiedClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericBooleanType(GenericBooleanType genericBooleanType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericBooleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHomeType(HomeType homeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(homeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconType(IconType iconType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjectionTargetType(InjectionTargetType injectionTargetType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(injectionTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaIdentifierType(JavaIdentifierType javaIdentifierType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTypeType(JavaTypeType javaTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJndiNameType(JndiNameType jndiNameType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jndiNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJspConfigType(JspConfigType jspConfigType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jspConfigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJspFileType(JspFileType jspFileType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jspFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJspPropertyGroupType(JspPropertyGroupType jspPropertyGroupType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jspPropertyGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifecycleCallbackType(LifecycleCallbackType lifecycleCallbackType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lifecycleCallbackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListenerType(ListenerType listenerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listenerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleEncodingMappingListType(
			LocaleEncodingMappingListType localeEncodingMappingListType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localeEncodingMappingListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleEncodingMappingType(
			LocaleEncodingMappingType localeEncodingMappingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localeEncodingMappingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalHomeType(LocalHomeType localHomeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localHomeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalType(LocalType localType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoginConfigType(LoginConfigType loginConfigType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loginConfigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationLinkType(
			MessageDestinationLinkType messageDestinationLinkType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationRefType(
			MessageDestinationRefType messageDestinationRefType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationType(MessageDestinationType messageDestinationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationTypeType(
			MessageDestinationTypeType messageDestinationTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationUsageType(
			MessageDestinationUsageType messageDestinationUsageType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationUsageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeMappingType(MimeMappingType mimeMappingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mimeMappingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeTypeType(MimeTypeType mimeTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mimeTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyStringType(NonEmptyStringType nonEmptyStringType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonEmptyStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamValueType(ParamValueType paramValueType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathType(PathType pathType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextRefType(
			PersistenceContextRefType persistenceContextRefType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistenceContextRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextTypeType(
			PersistenceContextTypeType persistenceContextTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistenceContextTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceUnitRefType(PersistenceUnitRefType persistenceUnitRefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistenceUnitRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortComponentRefType(PortComponentRefType portComponentRefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portComponentRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteType(RemoteType remoteType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuthType(ResAuthType resAuthType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resAuthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceEnvRefType(ResourceEnvRefType resourceEnvRefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceEnvRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRefType(ResourceRefType resourceRefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResSharingScopeType(ResSharingScopeType resSharingScopeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resSharingScopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleNameType(RoleNameType roleNameType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunAsType(RunAsType runAsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runAsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityConstraintType(SecurityConstraintType securityConstraintType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRoleRefType(SecurityRoleRefType securityRoleRefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityRoleRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRoleType(SecurityRoleType securityRoleType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityRoleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefHandlerChainsType(
			ServiceRefHandlerChainsType serviceRefHandlerChainsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefHandlerChainsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefHandlerChainType(
			ServiceRefHandlerChainType serviceRefHandlerChainType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefHandlerChainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefHandlerType(ServiceRefHandlerType serviceRefHandlerType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefHandlerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefType(ServiceRefType serviceRefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServletMappingType(ServletMappingType servletMappingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servletMappingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServletNameType(ServletNameType servletNameType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servletNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServletType(ServletType servletType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servletType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionConfigType(SessionConfigType sessionConfigType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sessionConfigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.eclipse.modisco.jee.webapp.webapp25.String string,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaglibType(TaglibType taglibType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taglibType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportGuaranteeType(TransportGuaranteeType transportGuaranteeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportGuaranteeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseType(TrueFalseType trueFalseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trueFalseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPatternType(UrlPatternType urlPatternType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(urlPatternType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDataConstraintType(UserDataConstraintType userDataConstraintType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userDataConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWarPathType(WarPathType warPathType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(warPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebAppType(WebAppType webAppType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webAppType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebResourceCollectionType(
			WebResourceCollectionType webResourceCollectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webResourceCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWelcomeFileListType(WelcomeFileListType welcomeFileListType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(welcomeFileListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdAnyURIType(XsdAnyURIType xsdAnyURIType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdAnyURIType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdBooleanType(XsdBooleanType xsdBooleanType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdBooleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdIntegerType(XsdIntegerType xsdIntegerType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdNMTOKENType(XsdNMTOKENType xsdNMTOKENType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdNMTOKENType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdNonNegativeIntegerType(
			XsdNonNegativeIntegerType xsdNonNegativeIntegerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdNonNegativeIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdPositiveIntegerType(XsdPositiveIntegerType xsdPositiveIntegerType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdPositiveIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdQNameType(XsdQNameType xsdQNameType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdQNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdStringType(XsdStringType xsdStringType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatcherTypeBase(DispatcherTypeBase dispatcherTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefTypeTypeBase(EjbRefTypeTypeBase ejbRefTypeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryTypeValuesTypeBase(
			EnvEntryTypeValuesTypeBase envEntryTypeValuesTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericBooleanTypeBase(GenericBooleanTypeBase genericBooleanTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationUsageTypeBase(
			MessageDestinationUsageTypeBase messageDestinationUsageTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullCharType(NullCharType nullCharType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextTypeTypeBase(
			PersistenceContextTypeTypeBase persistenceContextTypeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuthTypeBase(ResAuthTypeBase resAuthTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResSharingScopeTypeBase(ResSharingScopeTypeBase resSharingScopeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportGuaranteeTypeBase(
			TransportGuaranteeTypeBase transportGuaranteeTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebAppVersionType(WebAppVersionType webAppVersionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthMethodTypeBase(String authMethodTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeweyVersionType(String deweyVersionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateDeweyVersionType_Pattern(deweyVersionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateDeweyVersionType_Pattern
	 */
	public static final PatternMatcher [][] DEWEY_VERSION_TYPE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\.?[0-9]+(\\.[0-9]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dewey Version Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDeweyVersionType_Pattern(String deweyVersionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.DEWEY_VERSION_TYPE, deweyVersionType, DEWEY_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatcherTypeBaseObject(DispatcherTypeBase dispatcherTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbLinkTypeBase(String ejbLinkTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefNameTypeBase(String ejbRefNameTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefTypeTypeBaseObject(EjbRefTypeTypeBase ejbRefTypeTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingType(String encodingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateEncodingType_Pattern(encodingType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateEncodingType_Pattern
	 */
	public static final PatternMatcher [][] ENCODING_TYPE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Encoding Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEncodingType_Pattern(String encodingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.ENCODING_TYPE, encodingType, ENCODING_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryTypeValuesTypeBaseObject(
			EnvEntryTypeValuesTypeBase envEntryTypeValuesTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorCodeTypeBase(BigInteger errorCodeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(errorCodeTypeBase, diagnostics, context);
		if (result || diagnostics != null) result &= validateErrorCodeTypeBase_Pattern(errorCodeTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateErrorCodeTypeBase_Pattern
	 */
	public static final PatternMatcher [][] ERROR_CODE_TYPE_BASE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d{3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Error Code Type Base</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateErrorCodeTypeBase_Pattern(BigInteger errorCodeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.ERROR_CODE_TYPE_BASE, errorCodeTypeBase, ERROR_CODE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullyQualifiedClassTypeBase(String fullyQualifiedClassTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericBooleanTypeBaseObject(
			GenericBooleanTypeBase genericBooleanTypeBaseObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHomeTypeBase(String homeTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpMethodType(String httpMethodType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateHttpMethodType_Pattern(httpMethodType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateHttpMethodType_Pattern
	 */
	public static final PatternMatcher [][] HTTP_METHOD_TYPE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[!-~-[\\(\\)<>@,;:\"/\\[\\]?=\\{\\}\\\\\\p{Z}]]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Http Method Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHttpMethodType_Pattern(String httpMethodType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.HTTP_METHOD_TYPE, httpMethodType, HTTP_METHOD_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaIdentifierTypeBase(String javaIdentifierTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateJavaIdentifierTypeBase_Pattern(javaIdentifierTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateJavaIdentifierTypeBase_Pattern
	 */
	public static final PatternMatcher [][] JAVA_IDENTIFIER_TYPE_BASE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Java Identifier Type Base</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaIdentifierTypeBase_Pattern(String javaIdentifierTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.JAVA_IDENTIFIER_TYPE_BASE, javaIdentifierTypeBase, JAVA_IDENTIFIER_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTypeTypeBase(String javaTypeTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateJavaTypeTypeBase_Pattern(javaTypeTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateJavaTypeTypeBase_Pattern
	 */
	public static final PatternMatcher [][] JAVA_TYPE_TYPE_BASE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\p{Z}]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Java Type Type Base</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateJavaTypeTypeBase_Pattern(String javaTypeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.JAVA_TYPE_TYPE_BASE, javaTypeTypeBase, JAVA_TYPE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJndiNameTypeBase(String jndiNameTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJspFileTypeBase(String jspFileTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadOnStartupType(Object loadOnStartupType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLoadOnStartupType_MemberTypes(loadOnStartupType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Load On Startup Type</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadOnStartupType_MemberTypes(Object loadOnStartupType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Webapp25Package.Literals.NULL_CHAR_TYPE.isInstance(loadOnStartupType)) {
				if (validateNullCharType((NullCharType)loadOnStartupType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(loadOnStartupType)) {
				if (xmlTypeValidator.validateInteger((BigInteger)loadOnStartupType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Webapp25Package.Literals.NULL_CHAR_TYPE.isInstance(loadOnStartupType)) {
				if (validateNullCharType((NullCharType)loadOnStartupType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(loadOnStartupType)) {
				if (xmlTypeValidator.validateInteger((BigInteger)loadOnStartupType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleType(String localeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLocaleType_Pattern(localeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateLocaleType_Pattern
	 */
	public static final PatternMatcher [][] LOCALE_TYPE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z]{2}(_|-)?([\\p{L}\\-\\p{Nd}]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Locale Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLocaleType_Pattern(String localeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.LOCALE_TYPE, localeType, LOCALE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalHomeTypeBase(String localHomeTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalTypeBase(String localTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationLinkTypeBase(String messageDestinationLinkTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationTypeTypeBase(String messageDestinationTypeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationUsageTypeBaseObject(
			MessageDestinationUsageTypeBase messageDestinationUsageTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeTypeTypeBase(String mimeTypeTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateMimeTypeTypeBase_Pattern(mimeTypeTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateMimeTypeTypeBase_Pattern
	 */
	public static final PatternMatcher [][] MIME_TYPE_TYPE_BASE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\p{Cc}^\\s]+/[^\\p{Cc}^\\s]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Mime Type Type Base</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMimeTypeTypeBase_Pattern(String mimeTypeTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.MIME_TYPE_TYPE_BASE, mimeTypeTypeBase, MIME_TYPE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyStringTypeBase(String nonEmptyStringTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyStringTypeBase_MinLength(nonEmptyStringTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Empty String Type Base</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyStringTypeBase_MinLength(String nonEmptyStringTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonEmptyStringTypeBase.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Webapp25Package.Literals.NON_EMPTY_STRING_TYPE_BASE, nonEmptyStringTypeBase, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullCharTypeObject(NullCharType nullCharTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathTypeBase(String pathTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextTypeTypeBaseObject(
			PersistenceContextTypeTypeBase persistenceContextTypeTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteTypeBase(String remoteTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuthTypeBaseObject(ResAuthTypeBase resAuthTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResSharingScopeTypeBaseObject(
			ResSharingScopeTypeBase resSharingScopeTypeBaseObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleNameTypeBase(String roleNameTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingListType(
			List<?> serviceRefProtocolBindingListType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateServiceRefProtocolBindingListType_ItemType(serviceRefProtocolBindingListType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Service Ref Protocol Binding List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingListType_ItemType(
			List<?> serviceRefProtocolBindingListType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = serviceRefProtocolBindingListType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (Webapp25Package.Literals.SERVICE_REF_PROTOCOL_BINDING_TYPE.isInstance(item)) {
				result &= validateServiceRefProtocolBindingType((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(Webapp25Package.Literals.SERVICE_REF_PROTOCOL_BINDING_TYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingType(String serviceRefProtocolBindingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateServiceRefProtocolBindingType_MemberTypes(serviceRefProtocolBindingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Service Ref Protocol Binding Type</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingType_MemberTypes(
			String serviceRefProtocolBindingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(serviceRefProtocolBindingType)) {
				if (xmlTypeValidator.validateAnyURI(serviceRefProtocolBindingType, tempDiagnostics, context)) return true;
			}
			if (Webapp25Package.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE.isInstance(serviceRefProtocolBindingType)) {
				if (validateServiceRefProtocolURIAliasType(serviceRefProtocolBindingType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(serviceRefProtocolBindingType)) {
				if (xmlTypeValidator.validateAnyURI(serviceRefProtocolBindingType, null, context)) return true;
			}
			if (Webapp25Package.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE.isInstance(serviceRefProtocolBindingType)) {
				if (validateServiceRefProtocolURIAliasType(serviceRefProtocolBindingType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolURIAliasType(String serviceRefProtocolURIAliasType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateServiceRefProtocolURIAliasType_Pattern(serviceRefProtocolURIAliasType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateServiceRefProtocolURIAliasType_Pattern
	 */
	public static final PatternMatcher [][] SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("##.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Service Ref Protocol URI Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolURIAliasType_Pattern(
			String serviceRefProtocolURIAliasType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE, serviceRefProtocolURIAliasType, SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefQnamePattern(String serviceRefQnamePattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateServiceRefQnamePattern_Pattern(serviceRefQnamePattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateServiceRefQnamePattern_Pattern
	 */
	public static final PatternMatcher [][] SERVICE_REF_QNAME_PATTERN__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\*|([\\i-[:]][\\c-[:]]*:)?[\\i-[:]][\\c-[:]]*\\*?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Service Ref Qname Pattern</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefQnamePattern_Pattern(String serviceRefQnamePattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.SERVICE_REF_QNAME_PATTERN, serviceRefQnamePattern, SERVICE_REF_QNAME_PATTERN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportGuaranteeTypeBaseObject(
			TransportGuaranteeTypeBase transportGuaranteeTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseTypeBase(boolean trueFalseTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTrueFalseTypeBase_Pattern(trueFalseTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateTrueFalseTypeBase_Pattern
	 */
	public static final PatternMatcher [][] TRUE_FALSE_TYPE_BASE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(true|false)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>True False Type Base</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTrueFalseTypeBase_Pattern(boolean trueFalseTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.TRUE_FALSE_TYPE_BASE, trueFalseTypeBase, TRUE_FALSE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseTypeBaseObject(Boolean trueFalseTypeBaseObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTrueFalseTypeBase_Pattern(trueFalseTypeBaseObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWarPathTypeBase(String warPathTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateWarPathTypeBase_Pattern(warPathTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @see #validateWarPathTypeBase_Pattern
	 */
	public static final PatternMatcher [][] WAR_PATH_TYPE_BASE__PATTERN__VALUES = new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("/.*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>War Path Type Base</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateWarPathTypeBase_Pattern(String warPathTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Webapp25Package.Literals.WAR_PATH_TYPE_BASE, warPathTypeBase, WAR_PATH_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebAppVersionTypeObject(WebAppVersionType webAppVersionTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // Webapp25Validator
