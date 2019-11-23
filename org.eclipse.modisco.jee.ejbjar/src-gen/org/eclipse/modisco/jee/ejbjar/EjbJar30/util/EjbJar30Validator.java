/**
 * Copyright (c) 2010, 2019 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.util;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaIdentifierType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package
 * @generated
 */
public class EjbJar30Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EjbJar30Validator INSTANCE = new EjbJar30Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.modisco.jee.ejbjar.EjbJar30"; //$NON-NLS-1$

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar30Validator() {
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
	  return EjbJar30Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EjbJar30Package.ACTIVATION_CONFIG_PROPERTY_TYPE:
				return validateActivationConfigPropertyType((ActivationConfigPropertyType)value, diagnostics, context);
			case EjbJar30Package.ACTIVATION_CONFIG_TYPE:
				return validateActivationConfigType((ActivationConfigType)value, diagnostics, context);
			case EjbJar30Package.APPLICATION_EXCEPTION_TYPE:
				return validateApplicationExceptionType((ApplicationExceptionType)value, diagnostics, context);
			case EjbJar30Package.AROUND_INVOKE_TYPE:
				return validateAroundInvokeType((AroundInvokeType)value, diagnostics, context);
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE:
				return validateAssemblyDescriptorType((AssemblyDescriptorType)value, diagnostics, context);
			case EjbJar30Package.CMP_FIELD_TYPE:
				return validateCmpFieldType((CmpFieldType)value, diagnostics, context);
			case EjbJar30Package.CMP_VERSION_TYPE:
				return validateCmpVersionType((CmpVersionType)value, diagnostics, context);
			case EjbJar30Package.CMR_FIELD_TYPE:
				return validateCmrFieldType((CmrFieldType)value, diagnostics, context);
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE:
				return validateCmrFieldTypeType((CmrFieldTypeType)value, diagnostics, context);
			case EjbJar30Package.CONTAINER_TRANSACTION_TYPE:
				return validateContainerTransactionType((ContainerTransactionType)value, diagnostics, context);
			case EjbJar30Package.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case EjbJar30Package.DISPLAY_NAME_TYPE:
				return validateDisplayNameType((DisplayNameType)value, diagnostics, context);
			case EjbJar30Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case EjbJar30Package.EJB_CLASS_TYPE:
				return validateEjbClassType((EjbClassType)value, diagnostics, context);
			case EjbJar30Package.EJB_JAR_TYPE:
				return validateEjbJarType((EjbJarType)value, diagnostics, context);
			case EjbJar30Package.EJB_LINK_TYPE:
				return validateEjbLinkType((EjbLinkType)value, diagnostics, context);
			case EjbJar30Package.EJB_LOCAL_REF_TYPE:
				return validateEjbLocalRefType((EjbLocalRefType)value, diagnostics, context);
			case EjbJar30Package.EJB_NAME_TYPE:
				return validateEjbNameType((EjbNameType)value, diagnostics, context);
			case EjbJar30Package.EJB_REF_NAME_TYPE:
				return validateEjbRefNameType((EjbRefNameType)value, diagnostics, context);
			case EjbJar30Package.EJB_REF_TYPE:
				return validateEjbRefType((EjbRefType)value, diagnostics, context);
			case EjbJar30Package.EJB_REF_TYPE_TYPE:
				return validateEjbRefTypeType((EjbRefTypeType)value, diagnostics, context);
			case EjbJar30Package.EJB_RELATIONSHIP_ROLE_TYPE:
				return validateEjbRelationshipRoleType((EjbRelationshipRoleType)value, diagnostics, context);
			case EjbJar30Package.EJB_RELATION_TYPE:
				return validateEjbRelationType((EjbRelationType)value, diagnostics, context);
			case EjbJar30Package.EMPTY_TYPE:
				return validateEmptyType((EmptyType)value, diagnostics, context);
			case EjbJar30Package.ENTERPRISE_BEANS_TYPE:
				return validateEnterpriseBeansType((EnterpriseBeansType)value, diagnostics, context);
			case EjbJar30Package.ENTITY_BEAN_TYPE:
				return validateEntityBeanType((EntityBeanType)value, diagnostics, context);
			case EjbJar30Package.ENV_ENTRY_TYPE:
				return validateEnvEntryType((EnvEntryType)value, diagnostics, context);
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE:
				return validateEnvEntryTypeValuesType((EnvEntryTypeValuesType)value, diagnostics, context);
			case EjbJar30Package.EXCLUDE_LIST_TYPE:
				return validateExcludeListType((ExcludeListType)value, diagnostics, context);
			case EjbJar30Package.FULLY_QUALIFIED_CLASS_TYPE:
				return validateFullyQualifiedClassType((FullyQualifiedClassType)value, diagnostics, context);
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE:
				return validateGenericBooleanType((GenericBooleanType)value, diagnostics, context);
			case EjbJar30Package.HOME_TYPE:
				return validateHomeType((HomeType)value, diagnostics, context);
			case EjbJar30Package.ICON_TYPE:
				return validateIconType((IconType)value, diagnostics, context);
			case EjbJar30Package.INIT_METHOD_TYPE:
				return validateInitMethodType((InitMethodType)value, diagnostics, context);
			case EjbJar30Package.INJECTION_TARGET_TYPE:
				return validateInjectionTargetType((InjectionTargetType)value, diagnostics, context);
			case EjbJar30Package.INTERCEPTOR_BINDING_TYPE:
				return validateInterceptorBindingType((InterceptorBindingType)value, diagnostics, context);
			case EjbJar30Package.INTERCEPTOR_ORDER_TYPE:
				return validateInterceptorOrderType((InterceptorOrderType)value, diagnostics, context);
			case EjbJar30Package.INTERCEPTORS_TYPE:
				return validateInterceptorsType((InterceptorsType)value, diagnostics, context);
			case EjbJar30Package.INTERCEPTOR_TYPE:
				return validateInterceptorType((InterceptorType)value, diagnostics, context);
			case EjbJar30Package.JAVA_IDENTIFIER_TYPE:
				return validateJavaIdentifierType((JavaIdentifierType)value, diagnostics, context);
			case EjbJar30Package.JAVA_TYPE_TYPE:
				return validateJavaTypeType((JavaTypeType)value, diagnostics, context);
			case EjbJar30Package.JNDI_NAME_TYPE:
				return validateJndiNameType((JndiNameType)value, diagnostics, context);
			case EjbJar30Package.LIFECYCLE_CALLBACK_TYPE:
				return validateLifecycleCallbackType((LifecycleCallbackType)value, diagnostics, context);
			case EjbJar30Package.LISTENER_TYPE:
				return validateListenerType((ListenerType)value, diagnostics, context);
			case EjbJar30Package.LOCAL_HOME_TYPE:
				return validateLocalHomeType((LocalHomeType)value, diagnostics, context);
			case EjbJar30Package.LOCAL_TYPE:
				return validateLocalType((LocalType)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_LINK_TYPE:
				return validateMessageDestinationLinkType((MessageDestinationLinkType)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE:
				return validateMessageDestinationRefType((MessageDestinationRefType)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE:
				return validateMessageDestinationType((MessageDestinationType)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE_TYPE:
				return validateMessageDestinationTypeType((MessageDestinationTypeType)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE:
				return validateMessageDestinationUsageType((MessageDestinationUsageType)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DRIVEN_BEAN_TYPE:
				return validateMessageDrivenBeanType((MessageDrivenBeanType)value, diagnostics, context);
			case EjbJar30Package.METHOD_INTF_TYPE:
				return validateMethodIntfType((MethodIntfType)value, diagnostics, context);
			case EjbJar30Package.METHOD_NAME_TYPE:
				return validateMethodNameType((MethodNameType)value, diagnostics, context);
			case EjbJar30Package.METHOD_PARAMS_TYPE:
				return validateMethodParamsType((MethodParamsType)value, diagnostics, context);
			case EjbJar30Package.METHOD_PERMISSION_TYPE:
				return validateMethodPermissionType((MethodPermissionType)value, diagnostics, context);
			case EjbJar30Package.METHOD_TYPE:
				return validateMethodType((MethodType)value, diagnostics, context);
			case EjbJar30Package.MULTIPLICITY_TYPE:
				return validateMultiplicityType((MultiplicityType)value, diagnostics, context);
			case EjbJar30Package.NAMED_METHOD_TYPE:
				return validateNamedMethodType((NamedMethodType)value, diagnostics, context);
			case EjbJar30Package.PARAM_VALUE_TYPE:
				return validateParamValueType((ParamValueType)value, diagnostics, context);
			case EjbJar30Package.PATH_TYPE:
				return validatePathType((PathType)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_CONTEXT_REF_TYPE:
				return validatePersistenceContextRefType((PersistenceContextRefType)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE:
				return validatePersistenceContextTypeType((PersistenceContextTypeType)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE:
				return validatePersistenceTypeType((PersistenceTypeType)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_UNIT_REF_TYPE:
				return validatePersistenceUnitRefType((PersistenceUnitRefType)value, diagnostics, context);
			case EjbJar30Package.PORT_COMPONENT_REF_TYPE:
				return validatePortComponentRefType((PortComponentRefType)value, diagnostics, context);
			case EjbJar30Package.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case EjbJar30Package.QUERY_METHOD_TYPE:
				return validateQueryMethodType((QueryMethodType)value, diagnostics, context);
			case EjbJar30Package.QUERY_TYPE:
				return validateQueryType((QueryType)value, diagnostics, context);
			case EjbJar30Package.RELATIONSHIP_ROLE_SOURCE_TYPE:
				return validateRelationshipRoleSourceType((RelationshipRoleSourceType)value, diagnostics, context);
			case EjbJar30Package.RELATIONSHIPS_TYPE:
				return validateRelationshipsType((RelationshipsType)value, diagnostics, context);
			case EjbJar30Package.REMOTE_TYPE:
				return validateRemoteType((RemoteType)value, diagnostics, context);
			case EjbJar30Package.REMOVE_METHOD_TYPE:
				return validateRemoveMethodType((RemoveMethodType)value, diagnostics, context);
			case EjbJar30Package.RES_AUTH_TYPE:
				return validateResAuthType((ResAuthType)value, diagnostics, context);
			case EjbJar30Package.RESOURCE_ENV_REF_TYPE:
				return validateResourceEnvRefType((ResourceEnvRefType)value, diagnostics, context);
			case EjbJar30Package.RESOURCE_REF_TYPE:
				return validateResourceRefType((ResourceRefType)value, diagnostics, context);
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE:
				return validateResSharingScopeType((ResSharingScopeType)value, diagnostics, context);
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE:
				return validateResultTypeMappingType((ResultTypeMappingType)value, diagnostics, context);
			case EjbJar30Package.ROLE_NAME_TYPE:
				return validateRoleNameType((RoleNameType)value, diagnostics, context);
			case EjbJar30Package.RUN_AS_TYPE:
				return validateRunAsType((RunAsType)value, diagnostics, context);
			case EjbJar30Package.SECURITY_IDENTITY_TYPE:
				return validateSecurityIdentityType((SecurityIdentityType)value, diagnostics, context);
			case EjbJar30Package.SECURITY_ROLE_REF_TYPE:
				return validateSecurityRoleRefType((SecurityRoleRefType)value, diagnostics, context);
			case EjbJar30Package.SECURITY_ROLE_TYPE:
				return validateSecurityRoleType((SecurityRoleType)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_HANDLER_CHAINS_TYPE:
				return validateServiceRefHandlerChainsType((ServiceRefHandlerChainsType)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_HANDLER_CHAIN_TYPE:
				return validateServiceRefHandlerChainType((ServiceRefHandlerChainType)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE:
				return validateServiceRefHandlerType((ServiceRefHandlerType)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_TYPE:
				return validateServiceRefType((ServiceRefType)value, diagnostics, context);
			case EjbJar30Package.SESSION_BEAN_TYPE:
				return validateSessionBeanType((SessionBeanType)value, diagnostics, context);
			case EjbJar30Package.SESSION_TYPE_TYPE:
				return validateSessionTypeType((SessionTypeType)value, diagnostics, context);
			case EjbJar30Package.STRING:
				return validateString((org.eclipse.modisco.jee.ejbjar.EjbJar30.String)value, diagnostics, context);
			case EjbJar30Package.TRANSACTION_TYPE_TYPE:
				return validateTransactionTypeType((TransactionTypeType)value, diagnostics, context);
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE:
				return validateTransAttributeType((TransAttributeType)value, diagnostics, context);
			case EjbJar30Package.TRUE_FALSE_TYPE:
				return validateTrueFalseType((TrueFalseType)value, diagnostics, context);
			case EjbJar30Package.URL_PATTERN_TYPE:
				return validateUrlPatternType((UrlPatternType)value, diagnostics, context);
			case EjbJar30Package.XSD_ANY_URI_TYPE:
				return validateXsdAnyURIType((XsdAnyURIType)value, diagnostics, context);
			case EjbJar30Package.XSD_BOOLEAN_TYPE:
				return validateXsdBooleanType((XsdBooleanType)value, diagnostics, context);
			case EjbJar30Package.XSD_INTEGER_TYPE:
				return validateXsdIntegerType((XsdIntegerType)value, diagnostics, context);
			case EjbJar30Package.XSD_NMTOKEN_TYPE:
				return validateXsdNMTOKENType((XsdNMTOKENType)value, diagnostics, context);
			case EjbJar30Package.XSD_NON_NEGATIVE_INTEGER_TYPE:
				return validateXsdNonNegativeIntegerType((XsdNonNegativeIntegerType)value, diagnostics, context);
			case EjbJar30Package.XSD_POSITIVE_INTEGER_TYPE:
				return validateXsdPositiveIntegerType((XsdPositiveIntegerType)value, diagnostics, context);
			case EjbJar30Package.XSD_QNAME_TYPE:
				return validateXsdQNameType((XsdQNameType)value, diagnostics, context);
			case EjbJar30Package.XSD_STRING_TYPE:
				return validateXsdStringType((XsdStringType)value, diagnostics, context);
			case EjbJar30Package.CMP_VERSION_TYPE_BASE:
				return validateCmpVersionTypeBase((CmpVersionTypeBase)value, diagnostics, context);
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE_BASE:
				return validateCmrFieldTypeTypeBase((CmrFieldTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.EJB_REF_TYPE_TYPE_BASE:
				return validateEjbRefTypeTypeBase((EjbRefTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return validateEnvEntryTypeValuesTypeBase((EnvEntryTypeValuesTypeBase)value, diagnostics, context);
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE_BASE:
				return validateGenericBooleanTypeBase((GenericBooleanTypeBase)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return validateMessageDestinationUsageTypeBase((MessageDestinationUsageTypeBase)value, diagnostics, context);
			case EjbJar30Package.METHOD_INTF_TYPE_BASE:
				return validateMethodIntfTypeBase((MethodIntfTypeBase)value, diagnostics, context);
			case EjbJar30Package.MULTIPLICITY_TYPE_BASE:
				return validateMultiplicityTypeBase((MultiplicityTypeBase)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return validatePersistenceContextTypeTypeBase((PersistenceContextTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE_BASE:
				return validatePersistenceTypeTypeBase((PersistenceTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.RES_AUTH_TYPE_BASE:
				return validateResAuthTypeBase((ResAuthTypeBase)value, diagnostics, context);
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE_BASE:
				return validateResSharingScopeTypeBase((ResSharingScopeTypeBase)value, diagnostics, context);
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return validateResultTypeMappingTypeBase((ResultTypeMappingTypeBase)value, diagnostics, context);
			case EjbJar30Package.SESSION_TYPE_TYPE_BASE:
				return validateSessionTypeTypeBase((SessionTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.TRANSACTION_TYPE_TYPE_BASE:
				return validateTransactionTypeTypeBase((TransactionTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return validateTransAttributeTypeBase((TransAttributeTypeBase)value, diagnostics, context);
			case EjbJar30Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return validateCmpVersionTypeBaseObject((CmpVersionTypeBase)value, diagnostics, context);
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return validateCmrFieldTypeTypeBaseObject((CmrFieldTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.DEWEY_VERSION_TYPE:
				return validateDeweyVersionType((String)value, diagnostics, context);
			case EjbJar30Package.EJB_CLASS_TYPE_BASE:
				return validateEjbClassTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.EJB_LINK_TYPE_BASE:
				return validateEjbLinkTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.EJB_NAME_TYPE_BASE:
				return validateEjbNameTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.EJB_REF_NAME_TYPE_BASE:
				return validateEjbRefNameTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return validateEjbRefTypeTypeBaseObject((EjbRefTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return validateEnvEntryTypeValuesTypeBaseObject((EnvEntryTypeValuesTypeBase)value, diagnostics, context);
			case EjbJar30Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return validateFullyQualifiedClassTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return validateGenericBooleanTypeBaseObject((GenericBooleanTypeBase)value, diagnostics, context);
			case EjbJar30Package.HOME_TYPE_BASE:
				return validateHomeTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.JAVA_IDENTIFIER_TYPE_BASE:
				return validateJavaIdentifierTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.JAVA_TYPE_TYPE_BASE:
				return validateJavaTypeTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.JNDI_NAME_TYPE_BASE:
				return validateJndiNameTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.LOCAL_HOME_TYPE_BASE:
				return validateLocalHomeTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.LOCAL_TYPE_BASE:
				return validateLocalTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return validateMessageDestinationLinkTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return validateMessageDestinationTypeTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return validateMessageDestinationUsageTypeBaseObject((MessageDestinationUsageTypeBase)value, diagnostics, context);
			case EjbJar30Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return validateMethodIntfTypeBaseObject((MethodIntfTypeBase)value, diagnostics, context);
			case EjbJar30Package.METHOD_NAME_TYPE_BASE:
				return validateMethodNameTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return validateMultiplicityTypeBaseObject((MultiplicityTypeBase)value, diagnostics, context);
			case EjbJar30Package.PATH_TYPE_BASE:
				return validatePathTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return validatePersistenceContextTypeTypeBaseObject((PersistenceContextTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return validatePersistenceTypeTypeBaseObject((PersistenceTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.REMOTE_TYPE_BASE:
				return validateRemoteTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.RES_AUTH_TYPE_BASE_OBJECT:
				return validateResAuthTypeBaseObject((ResAuthTypeBase)value, diagnostics, context);
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return validateResSharingScopeTypeBaseObject((ResSharingScopeTypeBase)value, diagnostics, context);
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return validateResultTypeMappingTypeBaseObject((ResultTypeMappingTypeBase)value, diagnostics, context);
			case EjbJar30Package.ROLE_NAME_TYPE_BASE:
				return validateRoleNameTypeBase((String)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return validateServiceRefProtocolBindingListType((List<?>)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return validateServiceRefProtocolBindingType((String)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return validateServiceRefProtocolURIAliasType((String)value, diagnostics, context);
			case EjbJar30Package.SERVICE_REF_QNAME_PATTERN:
				return validateServiceRefQnamePattern((String)value, diagnostics, context);
			case EjbJar30Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return validateSessionTypeTypeBaseObject((SessionTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return validateTransactionTypeTypeBaseObject((TransactionTypeTypeBase)value, diagnostics, context);
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return validateTransAttributeTypeBaseObject((TransAttributeTypeBase)value, diagnostics, context);
			case EjbJar30Package.TRUE_FALSE_TYPE_BASE:
				return validateTrueFalseTypeBase((Boolean)value, diagnostics, context);
			case EjbJar30Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return validateTrueFalseTypeBaseObject((Boolean)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationConfigPropertyType(ActivationConfigPropertyType activationConfigPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activationConfigPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationConfigType(ActivationConfigType activationConfigType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activationConfigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationExceptionType(ApplicationExceptionType applicationExceptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationExceptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAroundInvokeType(AroundInvokeType aroundInvokeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aroundInvokeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyDescriptorType(AssemblyDescriptorType assemblyDescriptorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyDescriptorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmpFieldType(CmpFieldType cmpFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cmpFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmpVersionType(CmpVersionType cmpVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cmpVersionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmrFieldType(CmrFieldType cmrFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cmrFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmrFieldTypeType(CmrFieldTypeType cmrFieldTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cmrFieldTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerTransactionType(ContainerTransactionType containerTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerTransactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayNameType(DisplayNameType displayNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(displayNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbClassType(EjbClassType ejbClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbJarType(EjbJarType ejbJarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbJarType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbLinkType(EjbLinkType ejbLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbLocalRefType(EjbLocalRefType ejbLocalRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbLocalRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbNameType(EjbNameType ejbNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefNameType(EjbRefNameType ejbRefNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRefNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefType(EjbRefType ejbRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefTypeType(EjbRefTypeType ejbRefTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRefTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRelationshipRoleType(EjbRelationshipRoleType ejbRelationshipRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRelationshipRoleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRelationType(EjbRelationType ejbRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbRelationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmptyType(EmptyType emptyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emptyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnterpriseBeansType(EnterpriseBeansType enterpriseBeansType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enterpriseBeansType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityBeanType(EntityBeanType entityBeanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityBeanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryType(EnvEntryType envEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryTypeValuesType(EnvEntryTypeValuesType envEntryTypeValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envEntryTypeValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExcludeListType(ExcludeListType excludeListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(excludeListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullyQualifiedClassType(FullyQualifiedClassType fullyQualifiedClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fullyQualifiedClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericBooleanType(GenericBooleanType genericBooleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericBooleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHomeType(HomeType homeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(homeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconType(IconType iconType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitMethodType(InitMethodType initMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initMethodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjectionTargetType(InjectionTargetType injectionTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(injectionTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterceptorBindingType(InterceptorBindingType interceptorBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interceptorBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterceptorOrderType(InterceptorOrderType interceptorOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interceptorOrderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterceptorsType(InterceptorsType interceptorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interceptorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterceptorType(InterceptorType interceptorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interceptorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaIdentifierType(JavaIdentifierType javaIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTypeType(JavaTypeType javaTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJndiNameType(JndiNameType jndiNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jndiNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifecycleCallbackType(LifecycleCallbackType lifecycleCallbackType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lifecycleCallbackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListenerType(ListenerType listenerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listenerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalHomeType(LocalHomeType localHomeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localHomeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalType(LocalType localType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationLinkType(MessageDestinationLinkType messageDestinationLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationRefType(MessageDestinationRefType messageDestinationRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationType(MessageDestinationType messageDestinationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationTypeType(MessageDestinationTypeType messageDestinationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationUsageType(MessageDestinationUsageType messageDestinationUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDestinationUsageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDrivenBeanType(MessageDrivenBeanType messageDrivenBeanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDrivenBeanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodIntfType(MethodIntfType methodIntfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodIntfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodNameType(MethodNameType methodNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodParamsType(MethodParamsType methodParamsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodParamsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodPermissionType(MethodPermissionType methodPermissionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodPermissionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType(MethodType methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityType(MultiplicityType multiplicityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedMethodType(NamedMethodType namedMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedMethodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamValueType(ParamValueType paramValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathType(PathType pathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextRefType(PersistenceContextRefType persistenceContextRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistenceContextRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextTypeType(PersistenceContextTypeType persistenceContextTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistenceContextTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceTypeType(PersistenceTypeType persistenceTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistenceTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceUnitRefType(PersistenceUnitRefType persistenceUnitRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(persistenceUnitRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortComponentRefType(PortComponentRefType portComponentRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portComponentRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryMethodType(QueryMethodType queryMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryMethodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryType(QueryType queryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipRoleSourceType(RelationshipRoleSourceType relationshipRoleSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipRoleSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipsType(RelationshipsType relationshipsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteType(RemoteType remoteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveMethodType(RemoveMethodType removeMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeMethodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuthType(ResAuthType resAuthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resAuthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceEnvRefType(ResourceEnvRefType resourceEnvRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceEnvRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRefType(ResourceRefType resourceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResSharingScopeType(ResSharingScopeType resSharingScopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resSharingScopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultTypeMappingType(ResultTypeMappingType resultTypeMappingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultTypeMappingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleNameType(RoleNameType roleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunAsType(RunAsType runAsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runAsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityIdentityType(SecurityIdentityType securityIdentityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityIdentityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRoleRefType(SecurityRoleRefType securityRoleRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityRoleRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRoleType(SecurityRoleType securityRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityRoleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefHandlerChainsType(ServiceRefHandlerChainsType serviceRefHandlerChainsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefHandlerChainsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefHandlerChainType(ServiceRefHandlerChainType serviceRefHandlerChainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefHandlerChainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefHandlerType(ServiceRefHandlerType serviceRefHandlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefHandlerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefType(ServiceRefType serviceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionBeanType(SessionBeanType sessionBeanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sessionBeanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionTypeType(SessionTypeType sessionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sessionTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.eclipse.modisco.jee.ejbjar.EjbJar30.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionTypeType(TransactionTypeType transactionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransAttributeType(TransAttributeType transAttributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transAttributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseType(TrueFalseType trueFalseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trueFalseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPatternType(UrlPatternType urlPatternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(urlPatternType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdAnyURIType(XsdAnyURIType xsdAnyURIType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdAnyURIType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdBooleanType(XsdBooleanType xsdBooleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdBooleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdIntegerType(XsdIntegerType xsdIntegerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdNMTOKENType(XsdNMTOKENType xsdNMTOKENType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdNMTOKENType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdNonNegativeIntegerType(XsdNonNegativeIntegerType xsdNonNegativeIntegerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdNonNegativeIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdPositiveIntegerType(XsdPositiveIntegerType xsdPositiveIntegerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdPositiveIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdQNameType(XsdQNameType xsdQNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdQNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsdStringType(XsdStringType xsdStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsdStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmpVersionTypeBase(CmpVersionTypeBase cmpVersionTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmrFieldTypeTypeBase(CmrFieldTypeTypeBase cmrFieldTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefTypeTypeBase(EjbRefTypeTypeBase ejbRefTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryTypeValuesTypeBase(EnvEntryTypeValuesTypeBase envEntryTypeValuesTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericBooleanTypeBase(GenericBooleanTypeBase genericBooleanTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationUsageTypeBase(MessageDestinationUsageTypeBase messageDestinationUsageTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodIntfTypeBase(MethodIntfTypeBase methodIntfTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityTypeBase(MultiplicityTypeBase multiplicityTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextTypeTypeBase(PersistenceContextTypeTypeBase persistenceContextTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceTypeTypeBase(PersistenceTypeTypeBase persistenceTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuthTypeBase(ResAuthTypeBase resAuthTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResSharingScopeTypeBase(ResSharingScopeTypeBase resSharingScopeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultTypeMappingTypeBase(ResultTypeMappingTypeBase resultTypeMappingTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionTypeTypeBase(SessionTypeTypeBase sessionTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionTypeTypeBase(TransactionTypeTypeBase transactionTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransAttributeTypeBase(TransAttributeTypeBase transAttributeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmpVersionTypeBaseObject(CmpVersionTypeBase cmpVersionTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCmrFieldTypeTypeBaseObject(CmrFieldTypeTypeBase cmrFieldTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeweyVersionType(String deweyVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDeweyVersionType_Pattern(deweyVersionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDeweyVersionType_Pattern
	 */
	public static final  PatternMatcher [][] DEWEY_VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\.?[0-9]+(\\.[0-9]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dewey Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeweyVersionType_Pattern(String deweyVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar30Package.eINSTANCE.getDeweyVersionType(), deweyVersionType, DEWEY_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbClassTypeBase(String ejbClassTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbLinkTypeBase(String ejbLinkTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbNameTypeBase(String ejbNameTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKEN_Pattern(ejbNameTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefNameTypeBase(String ejbRefNameTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjbRefTypeTypeBaseObject(EjbRefTypeTypeBase ejbRefTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvEntryTypeValuesTypeBaseObject(EnvEntryTypeValuesTypeBase envEntryTypeValuesTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullyQualifiedClassTypeBase(String fullyQualifiedClassTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericBooleanTypeBaseObject(GenericBooleanTypeBase genericBooleanTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHomeTypeBase(String homeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaIdentifierTypeBase(String javaIdentifierTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateJavaIdentifierTypeBase_Pattern(javaIdentifierTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateJavaIdentifierTypeBase_Pattern
	 */
	public static final  PatternMatcher [][] JAVA_IDENTIFIER_TYPE_BASE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Java Identifier Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaIdentifierTypeBase_Pattern(String javaIdentifierTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar30Package.eINSTANCE.getJavaIdentifierTypeBase(), javaIdentifierTypeBase, JAVA_IDENTIFIER_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTypeTypeBase(String javaTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateJavaTypeTypeBase_Pattern(javaTypeTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateJavaTypeTypeBase_Pattern
	 */
	public static final  PatternMatcher [][] JAVA_TYPE_TYPE_BASE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\p{Z}]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Java Type Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaTypeTypeBase_Pattern(String javaTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar30Package.eINSTANCE.getJavaTypeTypeBase(), javaTypeTypeBase, JAVA_TYPE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJndiNameTypeBase(String jndiNameTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalHomeTypeBase(String localHomeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalTypeBase(String localTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationLinkTypeBase(String messageDestinationLinkTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationTypeTypeBase(String messageDestinationTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDestinationUsageTypeBaseObject(MessageDestinationUsageTypeBase messageDestinationUsageTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodIntfTypeBaseObject(MethodIntfTypeBase methodIntfTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodNameTypeBase(String methodNameTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityTypeBaseObject(MultiplicityTypeBase multiplicityTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathTypeBase(String pathTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceContextTypeTypeBaseObject(PersistenceContextTypeTypeBase persistenceContextTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceTypeTypeBaseObject(PersistenceTypeTypeBase persistenceTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteTypeBase(String remoteTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuthTypeBaseObject(ResAuthTypeBase resAuthTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResSharingScopeTypeBaseObject(ResSharingScopeTypeBase resSharingScopeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultTypeMappingTypeBaseObject(ResultTypeMappingTypeBase resultTypeMappingTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleNameTypeBase(String roleNameTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingListType(List<?> serviceRefProtocolBindingListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateServiceRefProtocolBindingListType_ItemType(serviceRefProtocolBindingListType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Service Ref Protocol Binding List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingListType_ItemType(List<?> serviceRefProtocolBindingListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = serviceRefProtocolBindingListType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (EjbJar30Package.eINSTANCE.getServiceRefProtocolBindingType().isInstance(item)) {
				result &= validateServiceRefProtocolBindingType((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(EjbJar30Package.eINSTANCE.getServiceRefProtocolBindingType(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingType(String serviceRefProtocolBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateServiceRefProtocolBindingType_MemberTypes(serviceRefProtocolBindingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Service Ref Protocol Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolBindingType_MemberTypes(String serviceRefProtocolBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(serviceRefProtocolBindingType)) {
				if (xmlTypeValidator.validateAnyURI(serviceRefProtocolBindingType, tempDiagnostics, context)) return true;
			}
			if (EjbJar30Package.eINSTANCE.getServiceRefProtocolURIAliasType().isInstance(serviceRefProtocolBindingType)) {
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
			if (EjbJar30Package.eINSTANCE.getServiceRefProtocolURIAliasType().isInstance(serviceRefProtocolBindingType)) {
				if (validateServiceRefProtocolURIAliasType(serviceRefProtocolBindingType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefProtocolURIAliasType(String serviceRefProtocolURIAliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateServiceRefProtocolURIAliasType_Pattern(serviceRefProtocolURIAliasType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateServiceRefProtocolURIAliasType_Pattern
	 */
	public static final  PatternMatcher [][] SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
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
	public boolean validateServiceRefProtocolURIAliasType_Pattern(String serviceRefProtocolURIAliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar30Package.eINSTANCE.getServiceRefProtocolURIAliasType(), serviceRefProtocolURIAliasType, SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefQnamePattern(String serviceRefQnamePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateServiceRefQnamePattern_Pattern(serviceRefQnamePattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateServiceRefQnamePattern_Pattern
	 */
	public static final  PatternMatcher [][] SERVICE_REF_QNAME_PATTERN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\*|([\\i-[:]][\\c-[:]]*:)?[\\i-[:]][\\c-[:]]*\\*?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Service Ref Qname Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefQnamePattern_Pattern(String serviceRefQnamePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar30Package.eINSTANCE.getServiceRefQnamePattern(), serviceRefQnamePattern, SERVICE_REF_QNAME_PATTERN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionTypeTypeBaseObject(SessionTypeTypeBase sessionTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionTypeTypeBaseObject(TransactionTypeTypeBase transactionTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransAttributeTypeBaseObject(TransAttributeTypeBase transAttributeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseTypeBase(boolean trueFalseTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTrueFalseTypeBase_Pattern(trueFalseTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTrueFalseTypeBase_Pattern
	 */
	public static final  PatternMatcher [][] TRUE_FALSE_TYPE_BASE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(true|false)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>True False Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseTypeBase_Pattern(boolean trueFalseTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar30Package.eINSTANCE.getTrueFalseTypeBase(), trueFalseTypeBase, TRUE_FALSE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseTypeBaseObject(Boolean trueFalseTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTrueFalseTypeBase_Pattern(trueFalseTypeBaseObject, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EjbJar30Validator
