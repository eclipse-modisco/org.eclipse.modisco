/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31.util;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar31.AccessTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ActivationConfigPropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ActivationConfigType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AddressingResponsesType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AddressingResponsesTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AddressingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ApplicationExceptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AsyncMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmpVersionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmpVersionTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmrFieldTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmrFieldTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrencyManagementTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrencyManagementTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentLockTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentLockTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DataSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DependsOnType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRelationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRelationshipRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EmptyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ExcludeListType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.GenericBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.GenericBooleanTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.HandlerChainType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.HandlerChainsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.HandlerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InjectionTargetType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InterceptorBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InterceptorOrderType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InterceptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InterceptorsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.IsolationLevelType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.JavaIdentifierType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.JavaTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.JdbcUrlType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.JndiNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ListenerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationUsageType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationUsageTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDrivenBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MethodIntfTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MultiplicityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MultiplicityTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ParamValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PathType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.QueryMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RelationshipRoleSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RelationshipsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RemoveMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResAuthTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResSharingScopeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResSharingScopeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RespectBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResultTypeMappingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResultTypeMappingTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RunAsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.StatefulTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TimeUnitTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TimeUnitTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TransAttributeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TransAttributeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TransactionTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.UrlPatternType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdAnyURIType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdNMTOKENType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdQNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package
 * @generated
 */
public class EjbJar31Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EjbJar31Validator INSTANCE = new EjbJar31Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.modisco.jee.ejbjar.EjbJar31"; //$NON-NLS-1$

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
	public EjbJar31Validator() {
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
	  return EjbJar31Package.eINSTANCE;
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
			case EjbJar31Package.ACCESS_TIMEOUT_TYPE:
				return validateAccessTimeoutType((AccessTimeoutType)value, diagnostics, context);
			case EjbJar31Package.ACTIVATION_CONFIG_PROPERTY_TYPE:
				return validateActivationConfigPropertyType((ActivationConfigPropertyType)value, diagnostics, context);
			case EjbJar31Package.ACTIVATION_CONFIG_TYPE:
				return validateActivationConfigType((ActivationConfigType)value, diagnostics, context);
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE:
				return validateAddressingResponsesType((AddressingResponsesType)value, diagnostics, context);
			case EjbJar31Package.ADDRESSING_TYPE:
				return validateAddressingType((AddressingType)value, diagnostics, context);
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE:
				return validateApplicationExceptionType((ApplicationExceptionType)value, diagnostics, context);
			case EjbJar31Package.AROUND_INVOKE_TYPE:
				return validateAroundInvokeType((AroundInvokeType)value, diagnostics, context);
			case EjbJar31Package.AROUND_TIMEOUT_TYPE:
				return validateAroundTimeoutType((AroundTimeoutType)value, diagnostics, context);
			case EjbJar31Package.ASSEMBLY_DESCRIPTOR_TYPE:
				return validateAssemblyDescriptorType((AssemblyDescriptorType)value, diagnostics, context);
			case EjbJar31Package.ASYNC_METHOD_TYPE:
				return validateAsyncMethodType((AsyncMethodType)value, diagnostics, context);
			case EjbJar31Package.CMP_FIELD_TYPE:
				return validateCmpFieldType((CmpFieldType)value, diagnostics, context);
			case EjbJar31Package.CMP_VERSION_TYPE:
				return validateCmpVersionType((CmpVersionType)value, diagnostics, context);
			case EjbJar31Package.CMR_FIELD_TYPE:
				return validateCmrFieldType((CmrFieldType)value, diagnostics, context);
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE:
				return validateCmrFieldTypeType((CmrFieldTypeType)value, diagnostics, context);
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE:
				return validateConcurrencyManagementTypeType((ConcurrencyManagementTypeType)value, diagnostics, context);
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE:
				return validateConcurrentLockTypeType((ConcurrentLockTypeType)value, diagnostics, context);
			case EjbJar31Package.CONCURRENT_METHOD_TYPE:
				return validateConcurrentMethodType((ConcurrentMethodType)value, diagnostics, context);
			case EjbJar31Package.CONTAINER_TRANSACTION_TYPE:
				return validateContainerTransactionType((ContainerTransactionType)value, diagnostics, context);
			case EjbJar31Package.DATA_SOURCE_TYPE:
				return validateDataSourceType((DataSourceType)value, diagnostics, context);
			case EjbJar31Package.DEPENDS_ON_TYPE:
				return validateDependsOnType((DependsOnType)value, diagnostics, context);
			case EjbJar31Package.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case EjbJar31Package.DISPLAY_NAME_TYPE:
				return validateDisplayNameType((DisplayNameType)value, diagnostics, context);
			case EjbJar31Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case EjbJar31Package.EJB_CLASS_TYPE:
				return validateEjbClassType((EjbClassType)value, diagnostics, context);
			case EjbJar31Package.EJB_JAR_TYPE:
				return validateEjbJarType((EjbJarType)value, diagnostics, context);
			case EjbJar31Package.EJB_LINK_TYPE:
				return validateEjbLinkType((EjbLinkType)value, diagnostics, context);
			case EjbJar31Package.EJB_LOCAL_REF_TYPE:
				return validateEjbLocalRefType((EjbLocalRefType)value, diagnostics, context);
			case EjbJar31Package.EJB_NAME_TYPE:
				return validateEjbNameType((EjbNameType)value, diagnostics, context);
			case EjbJar31Package.EJB_REF_NAME_TYPE:
				return validateEjbRefNameType((EjbRefNameType)value, diagnostics, context);
			case EjbJar31Package.EJB_REF_TYPE:
				return validateEjbRefType((EjbRefType)value, diagnostics, context);
			case EjbJar31Package.EJB_REF_TYPE_TYPE:
				return validateEjbRefTypeType((EjbRefTypeType)value, diagnostics, context);
			case EjbJar31Package.EJB_RELATIONSHIP_ROLE_TYPE:
				return validateEjbRelationshipRoleType((EjbRelationshipRoleType)value, diagnostics, context);
			case EjbJar31Package.EJB_RELATION_TYPE:
				return validateEjbRelationType((EjbRelationType)value, diagnostics, context);
			case EjbJar31Package.EMPTY_TYPE:
				return validateEmptyType((EmptyType)value, diagnostics, context);
			case EjbJar31Package.ENTERPRISE_BEANS_TYPE:
				return validateEnterpriseBeansType((EnterpriseBeansType)value, diagnostics, context);
			case EjbJar31Package.ENTITY_BEAN_TYPE:
				return validateEntityBeanType((EntityBeanType)value, diagnostics, context);
			case EjbJar31Package.ENV_ENTRY_TYPE:
				return validateEnvEntryType((EnvEntryType)value, diagnostics, context);
			case EjbJar31Package.ENV_ENTRY_TYPE_VALUES_TYPE:
				return validateEnvEntryTypeValuesType((EnvEntryTypeValuesType)value, diagnostics, context);
			case EjbJar31Package.EXCLUDE_LIST_TYPE:
				return validateExcludeListType((ExcludeListType)value, diagnostics, context);
			case EjbJar31Package.FULLY_QUALIFIED_CLASS_TYPE:
				return validateFullyQualifiedClassType((FullyQualifiedClassType)value, diagnostics, context);
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE:
				return validateGenericBooleanType((GenericBooleanType)value, diagnostics, context);
			case EjbJar31Package.HANDLER_CHAINS_TYPE:
				return validateHandlerChainsType((HandlerChainsType)value, diagnostics, context);
			case EjbJar31Package.HANDLER_CHAIN_TYPE:
				return validateHandlerChainType((HandlerChainType)value, diagnostics, context);
			case EjbJar31Package.HANDLER_TYPE:
				return validateHandlerType((HandlerType)value, diagnostics, context);
			case EjbJar31Package.HOME_TYPE:
				return validateHomeType((HomeType)value, diagnostics, context);
			case EjbJar31Package.ICON_TYPE:
				return validateIconType((IconType)value, diagnostics, context);
			case EjbJar31Package.INIT_METHOD_TYPE:
				return validateInitMethodType((InitMethodType)value, diagnostics, context);
			case EjbJar31Package.INJECTION_TARGET_TYPE:
				return validateInjectionTargetType((InjectionTargetType)value, diagnostics, context);
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE:
				return validateInterceptorBindingType((InterceptorBindingType)value, diagnostics, context);
			case EjbJar31Package.INTERCEPTOR_ORDER_TYPE:
				return validateInterceptorOrderType((InterceptorOrderType)value, diagnostics, context);
			case EjbJar31Package.INTERCEPTORS_TYPE:
				return validateInterceptorsType((InterceptorsType)value, diagnostics, context);
			case EjbJar31Package.INTERCEPTOR_TYPE:
				return validateInterceptorType((InterceptorType)value, diagnostics, context);
			case EjbJar31Package.JAVA_IDENTIFIER_TYPE:
				return validateJavaIdentifierType((JavaIdentifierType)value, diagnostics, context);
			case EjbJar31Package.JAVA_TYPE_TYPE:
				return validateJavaTypeType((JavaTypeType)value, diagnostics, context);
			case EjbJar31Package.JDBC_URL_TYPE:
				return validateJdbcUrlType((JdbcUrlType)value, diagnostics, context);
			case EjbJar31Package.JNDI_NAME_TYPE:
				return validateJndiNameType((JndiNameType)value, diagnostics, context);
			case EjbJar31Package.LIFECYCLE_CALLBACK_TYPE:
				return validateLifecycleCallbackType((LifecycleCallbackType)value, diagnostics, context);
			case EjbJar31Package.LISTENER_TYPE:
				return validateListenerType((ListenerType)value, diagnostics, context);
			case EjbJar31Package.LOCAL_HOME_TYPE:
				return validateLocalHomeType((LocalHomeType)value, diagnostics, context);
			case EjbJar31Package.LOCAL_TYPE:
				return validateLocalType((LocalType)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_LINK_TYPE:
				return validateMessageDestinationLinkType((MessageDestinationLinkType)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_REF_TYPE:
				return validateMessageDestinationRefType((MessageDestinationRefType)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_TYPE:
				return validateMessageDestinationType((MessageDestinationType)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_TYPE_TYPE:
				return validateMessageDestinationTypeType((MessageDestinationTypeType)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE:
				return validateMessageDestinationUsageType((MessageDestinationUsageType)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE:
				return validateMessageDrivenBeanType((MessageDrivenBeanType)value, diagnostics, context);
			case EjbJar31Package.METHOD_INTF_TYPE:
				return validateMethodIntfType((MethodIntfType)value, diagnostics, context);
			case EjbJar31Package.METHOD_NAME_TYPE:
				return validateMethodNameType((MethodNameType)value, diagnostics, context);
			case EjbJar31Package.METHOD_PARAMS_TYPE:
				return validateMethodParamsType((MethodParamsType)value, diagnostics, context);
			case EjbJar31Package.METHOD_PERMISSION_TYPE:
				return validateMethodPermissionType((MethodPermissionType)value, diagnostics, context);
			case EjbJar31Package.METHOD_TYPE:
				return validateMethodType((MethodType)value, diagnostics, context);
			case EjbJar31Package.MULTIPLICITY_TYPE:
				return validateMultiplicityType((MultiplicityType)value, diagnostics, context);
			case EjbJar31Package.NAMED_METHOD_TYPE:
				return validateNamedMethodType((NamedMethodType)value, diagnostics, context);
			case EjbJar31Package.PARAM_VALUE_TYPE:
				return validateParamValueType((ParamValueType)value, diagnostics, context);
			case EjbJar31Package.PATH_TYPE:
				return validatePathType((PathType)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_CONTEXT_REF_TYPE:
				return validatePersistenceContextRefType((PersistenceContextRefType)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE:
				return validatePersistenceContextTypeType((PersistenceContextTypeType)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE:
				return validatePersistenceTypeType((PersistenceTypeType)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_UNIT_REF_TYPE:
				return validatePersistenceUnitRefType((PersistenceUnitRefType)value, diagnostics, context);
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE:
				return validatePortComponentRefType((PortComponentRefType)value, diagnostics, context);
			case EjbJar31Package.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case EjbJar31Package.QUERY_METHOD_TYPE:
				return validateQueryMethodType((QueryMethodType)value, diagnostics, context);
			case EjbJar31Package.QUERY_TYPE:
				return validateQueryType((QueryType)value, diagnostics, context);
			case EjbJar31Package.RELATIONSHIP_ROLE_SOURCE_TYPE:
				return validateRelationshipRoleSourceType((RelationshipRoleSourceType)value, diagnostics, context);
			case EjbJar31Package.RELATIONSHIPS_TYPE:
				return validateRelationshipsType((RelationshipsType)value, diagnostics, context);
			case EjbJar31Package.REMOTE_TYPE:
				return validateRemoteType((RemoteType)value, diagnostics, context);
			case EjbJar31Package.REMOVE_METHOD_TYPE:
				return validateRemoveMethodType((RemoveMethodType)value, diagnostics, context);
			case EjbJar31Package.RES_AUTH_TYPE:
				return validateResAuthType((ResAuthType)value, diagnostics, context);
			case EjbJar31Package.RESOURCE_ENV_REF_TYPE:
				return validateResourceEnvRefType((ResourceEnvRefType)value, diagnostics, context);
			case EjbJar31Package.RESOURCE_REF_TYPE:
				return validateResourceRefType((ResourceRefType)value, diagnostics, context);
			case EjbJar31Package.RESPECT_BINDING_TYPE:
				return validateRespectBindingType((RespectBindingType)value, diagnostics, context);
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE:
				return validateResSharingScopeType((ResSharingScopeType)value, diagnostics, context);
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE:
				return validateResultTypeMappingType((ResultTypeMappingType)value, diagnostics, context);
			case EjbJar31Package.ROLE_NAME_TYPE:
				return validateRoleNameType((RoleNameType)value, diagnostics, context);
			case EjbJar31Package.RUN_AS_TYPE:
				return validateRunAsType((RunAsType)value, diagnostics, context);
			case EjbJar31Package.SECURITY_IDENTITY_TYPE:
				return validateSecurityIdentityType((SecurityIdentityType)value, diagnostics, context);
			case EjbJar31Package.SECURITY_ROLE_REF_TYPE:
				return validateSecurityRoleRefType((SecurityRoleRefType)value, diagnostics, context);
			case EjbJar31Package.SECURITY_ROLE_TYPE:
				return validateSecurityRoleType((SecurityRoleType)value, diagnostics, context);
			case EjbJar31Package.SERVICE_REF_TYPE:
				return validateServiceRefType((ServiceRefType)value, diagnostics, context);
			case EjbJar31Package.SESSION_BEAN_TYPE:
				return validateSessionBeanType((SessionBeanType)value, diagnostics, context);
			case EjbJar31Package.SESSION_TYPE_TYPE:
				return validateSessionTypeType((SessionTypeType)value, diagnostics, context);
			case EjbJar31Package.STATEFUL_TIMEOUT_TYPE:
				return validateStatefulTimeoutType((StatefulTimeoutType)value, diagnostics, context);
			case EjbJar31Package.STRING:
				return validateString((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)value, diagnostics, context);
			case EjbJar31Package.TIMER_SCHEDULE_TYPE:
				return validateTimerScheduleType((TimerScheduleType)value, diagnostics, context);
			case EjbJar31Package.TIMER_TYPE:
				return validateTimerType((TimerType)value, diagnostics, context);
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE:
				return validateTimeUnitTypeType((TimeUnitTypeType)value, diagnostics, context);
			case EjbJar31Package.TRANSACTION_TYPE_TYPE:
				return validateTransactionTypeType((TransactionTypeType)value, diagnostics, context);
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE:
				return validateTransAttributeType((TransAttributeType)value, diagnostics, context);
			case EjbJar31Package.TRUE_FALSE_TYPE:
				return validateTrueFalseType((TrueFalseType)value, diagnostics, context);
			case EjbJar31Package.URL_PATTERN_TYPE:
				return validateUrlPatternType((UrlPatternType)value, diagnostics, context);
			case EjbJar31Package.XSD_ANY_URI_TYPE:
				return validateXsdAnyURIType((XsdAnyURIType)value, diagnostics, context);
			case EjbJar31Package.XSD_BOOLEAN_TYPE:
				return validateXsdBooleanType((XsdBooleanType)value, diagnostics, context);
			case EjbJar31Package.XSD_INTEGER_TYPE:
				return validateXsdIntegerType((XsdIntegerType)value, diagnostics, context);
			case EjbJar31Package.XSD_NMTOKEN_TYPE:
				return validateXsdNMTOKENType((XsdNMTOKENType)value, diagnostics, context);
			case EjbJar31Package.XSD_NON_NEGATIVE_INTEGER_TYPE:
				return validateXsdNonNegativeIntegerType((XsdNonNegativeIntegerType)value, diagnostics, context);
			case EjbJar31Package.XSD_POSITIVE_INTEGER_TYPE:
				return validateXsdPositiveIntegerType((XsdPositiveIntegerType)value, diagnostics, context);
			case EjbJar31Package.XSD_QNAME_TYPE:
				return validateXsdQNameType((XsdQNameType)value, diagnostics, context);
			case EjbJar31Package.XSD_STRING_TYPE:
				return validateXsdStringType((XsdStringType)value, diagnostics, context);
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE_BASE:
				return validateAddressingResponsesTypeBase((AddressingResponsesTypeBase)value, diagnostics, context);
			case EjbJar31Package.CMP_VERSION_TYPE_BASE:
				return validateCmpVersionTypeBase((CmpVersionTypeBase)value, diagnostics, context);
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE_BASE:
				return validateCmrFieldTypeTypeBase((CmrFieldTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE_BASE:
				return validateConcurrencyManagementTypeTypeBase((ConcurrencyManagementTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE_BASE:
				return validateConcurrentLockTypeTypeBase((ConcurrentLockTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.EJB_REF_TYPE_TYPE_BASE:
				return validateEjbRefTypeTypeBase((EjbRefTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE_BASE:
				return validateGenericBooleanTypeBase((GenericBooleanTypeBase)value, diagnostics, context);
			case EjbJar31Package.ISOLATION_LEVEL_TYPE:
				return validateIsolationLevelType((IsolationLevelType)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return validateMessageDestinationUsageTypeBase((MessageDestinationUsageTypeBase)value, diagnostics, context);
			case EjbJar31Package.METHOD_INTF_TYPE_BASE:
				return validateMethodIntfTypeBase((MethodIntfTypeBase)value, diagnostics, context);
			case EjbJar31Package.MULTIPLICITY_TYPE_BASE:
				return validateMultiplicityTypeBase((MultiplicityTypeBase)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return validatePersistenceContextTypeTypeBase((PersistenceContextTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE_BASE:
				return validatePersistenceTypeTypeBase((PersistenceTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.RES_AUTH_TYPE_BASE:
				return validateResAuthTypeBase((ResAuthTypeBase)value, diagnostics, context);
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE_BASE:
				return validateResSharingScopeTypeBase((ResSharingScopeTypeBase)value, diagnostics, context);
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return validateResultTypeMappingTypeBase((ResultTypeMappingTypeBase)value, diagnostics, context);
			case EjbJar31Package.SESSION_TYPE_TYPE_BASE:
				return validateSessionTypeTypeBase((SessionTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE_BASE:
				return validateTimeUnitTypeTypeBase((TimeUnitTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.TRANSACTION_TYPE_TYPE_BASE:
				return validateTransactionTypeTypeBase((TransactionTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return validateTransAttributeTypeBase((TransAttributeTypeBase)value, diagnostics, context);
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE_BASE_OBJECT:
				return validateAddressingResponsesTypeBaseObject((AddressingResponsesTypeBase)value, diagnostics, context);
			case EjbJar31Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return validateCmpVersionTypeBaseObject((CmpVersionTypeBase)value, diagnostics, context);
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return validateCmrFieldTypeTypeBaseObject((CmrFieldTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE_BASE_OBJECT:
				return validateConcurrencyManagementTypeTypeBaseObject((ConcurrencyManagementTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE_BASE_OBJECT:
				return validateConcurrentLockTypeTypeBaseObject((ConcurrentLockTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.DEWEY_VERSION_TYPE:
				return validateDeweyVersionType((String)value, diagnostics, context);
			case EjbJar31Package.EJB_CLASS_TYPE_BASE:
				return validateEjbClassTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.EJB_LINK_TYPE_BASE:
				return validateEjbLinkTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.EJB_NAME_TYPE_BASE:
				return validateEjbNameTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.EJB_REF_NAME_TYPE_BASE:
				return validateEjbRefNameTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return validateEjbRefTypeTypeBaseObject((EjbRefTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return validateEnvEntryTypeValuesTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return validateFullyQualifiedClassTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return validateGenericBooleanTypeBaseObject((GenericBooleanTypeBase)value, diagnostics, context);
			case EjbJar31Package.HOME_TYPE_BASE:
				return validateHomeTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.ISOLATION_LEVEL_TYPE_OBJECT:
				return validateIsolationLevelTypeObject((IsolationLevelType)value, diagnostics, context);
			case EjbJar31Package.JAVA_IDENTIFIER_TYPE_BASE:
				return validateJavaIdentifierTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.JAVA_TYPE_TYPE_BASE:
				return validateJavaTypeTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.JDBC_URL_TYPE_BASE:
				return validateJdbcUrlTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.JNDI_NAME_TYPE_BASE:
				return validateJndiNameTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.LOCAL_HOME_TYPE_BASE:
				return validateLocalHomeTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.LOCAL_TYPE_BASE:
				return validateLocalTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return validateMessageDestinationLinkTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return validateMessageDestinationTypeTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return validateMessageDestinationUsageTypeBaseObject((MessageDestinationUsageTypeBase)value, diagnostics, context);
			case EjbJar31Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return validateMethodIntfTypeBaseObject((MethodIntfTypeBase)value, diagnostics, context);
			case EjbJar31Package.METHOD_NAME_TYPE_BASE:
				return validateMethodNameTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return validateMultiplicityTypeBaseObject((MultiplicityTypeBase)value, diagnostics, context);
			case EjbJar31Package.PATH_TYPE_BASE:
				return validatePathTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return validatePersistenceContextTypeTypeBaseObject((PersistenceContextTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return validatePersistenceTypeTypeBaseObject((PersistenceTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.PROTOCOL_BINDING_LIST_TYPE:
				return validateProtocolBindingListType((List<?>)value, diagnostics, context);
			case EjbJar31Package.PROTOCOL_BINDING_TYPE:
				return validateProtocolBindingType((String)value, diagnostics, context);
			case EjbJar31Package.PROTOCOL_URI_ALIAS_TYPE:
				return validateProtocolURIAliasType((String)value, diagnostics, context);
			case EjbJar31Package.QNAME_PATTERN:
				return validateQnamePattern((String)value, diagnostics, context);
			case EjbJar31Package.REMOTE_TYPE_BASE:
				return validateRemoteTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.RES_AUTH_TYPE_BASE_OBJECT:
				return validateResAuthTypeBaseObject((ResAuthTypeBase)value, diagnostics, context);
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return validateResSharingScopeTypeBaseObject((ResSharingScopeTypeBase)value, diagnostics, context);
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return validateResultTypeMappingTypeBaseObject((ResultTypeMappingTypeBase)value, diagnostics, context);
			case EjbJar31Package.ROLE_NAME_TYPE_BASE:
				return validateRoleNameTypeBase((String)value, diagnostics, context);
			case EjbJar31Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return validateSessionTypeTypeBaseObject((SessionTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE_BASE_OBJECT:
				return validateTimeUnitTypeTypeBaseObject((TimeUnitTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return validateTransactionTypeTypeBaseObject((TransactionTypeTypeBase)value, diagnostics, context);
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return validateTransAttributeTypeBaseObject((TransAttributeTypeBase)value, diagnostics, context);
			case EjbJar31Package.TRUE_FALSE_TYPE_BASE:
				return validateTrueFalseTypeBase((Boolean)value, diagnostics, context);
			case EjbJar31Package.TRUE_FALSE_TYPE_BASE_OBJECT:
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
	public boolean validateAccessTimeoutType(AccessTimeoutType accessTimeoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessTimeoutType, diagnostics, context);
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
	public boolean validateAddressingResponsesType(AddressingResponsesType addressingResponsesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressingResponsesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressingType(AddressingType addressingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressingType, diagnostics, context);
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
	public boolean validateAroundTimeoutType(AroundTimeoutType aroundTimeoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aroundTimeoutType, diagnostics, context);
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
	public boolean validateAsyncMethodType(AsyncMethodType asyncMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asyncMethodType, diagnostics, context);
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
	public boolean validateConcurrencyManagementTypeType(ConcurrencyManagementTypeType concurrencyManagementTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concurrencyManagementTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcurrentLockTypeType(ConcurrentLockTypeType concurrentLockTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concurrentLockTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcurrentMethodType(ConcurrentMethodType concurrentMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concurrentMethodType, diagnostics, context);
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
	public boolean validateDataSourceType(DataSourceType dataSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependsOnType(DependsOnType dependsOnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependsOnType, diagnostics, context);
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
	public boolean validateHandlerChainsType(HandlerChainsType handlerChainsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(handlerChainsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandlerChainType(HandlerChainType handlerChainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(handlerChainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandlerType(HandlerType handlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(handlerType, diagnostics, context);
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
	public boolean validateJdbcUrlType(JdbcUrlType jdbcUrlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jdbcUrlType, diagnostics, context);
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
	public boolean validateRespectBindingType(RespectBindingType respectBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(respectBindingType, diagnostics, context);
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
	public boolean validateStatefulTimeoutType(StatefulTimeoutType statefulTimeoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statefulTimeoutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.eclipse.modisco.jee.ejbjar.EjbJar31.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerScheduleType(TimerScheduleType timerScheduleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerScheduleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerType(TimerType timerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitTypeType(TimeUnitTypeType timeUnitTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeUnitTypeType, diagnostics, context);
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
	public boolean validateAddressingResponsesTypeBase(AddressingResponsesTypeBase addressingResponsesTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateConcurrencyManagementTypeTypeBase(ConcurrencyManagementTypeTypeBase concurrencyManagementTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcurrentLockTypeTypeBase(ConcurrentLockTypeTypeBase concurrentLockTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateGenericBooleanTypeBase(GenericBooleanTypeBase genericBooleanTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsolationLevelType(IsolationLevelType isolationLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateTimeUnitTypeTypeBase(TimeUnitTypeTypeBase timeUnitTypeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateAddressingResponsesTypeBaseObject(AddressingResponsesTypeBase addressingResponsesTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateConcurrencyManagementTypeTypeBaseObject(ConcurrencyManagementTypeTypeBase concurrencyManagementTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcurrentLockTypeTypeBaseObject(ConcurrentLockTypeTypeBase concurrentLockTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return validatePattern(EjbJar31Package.eINSTANCE.getDeweyVersionType(), deweyVersionType, DEWEY_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
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
	public boolean validateEnvEntryTypeValuesTypeBase(String envEntryTypeValuesTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateIsolationLevelTypeObject(IsolationLevelType isolationLevelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return validatePattern(EjbJar31Package.eINSTANCE.getJavaIdentifierTypeBase(), javaIdentifierTypeBase, JAVA_IDENTIFIER_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
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
		return validatePattern(EjbJar31Package.eINSTANCE.getJavaTypeTypeBase(), javaTypeTypeBase, JAVA_TYPE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJdbcUrlTypeBase(String jdbcUrlTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateJdbcUrlTypeBase_Pattern(jdbcUrlTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateJdbcUrlTypeBase_Pattern
	 */
	public static final  PatternMatcher [][] JDBC_URL_TYPE_BASE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("jdbc:(.*):(.*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Jdbc Url Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJdbcUrlTypeBase_Pattern(String jdbcUrlTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar31Package.eINSTANCE.getJdbcUrlTypeBase(), jdbcUrlTypeBase, JDBC_URL_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
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
	public boolean validateProtocolBindingListType(List<?> protocolBindingListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProtocolBindingListType_ItemType(protocolBindingListType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Protocol Binding List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolBindingListType_ItemType(List<?> protocolBindingListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = protocolBindingListType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (EjbJar31Package.eINSTANCE.getProtocolBindingType().isInstance(item)) {
				result &= validateProtocolBindingType((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(EjbJar31Package.eINSTANCE.getProtocolBindingType(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolBindingType(String protocolBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProtocolBindingType_MemberTypes(protocolBindingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Protocol Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolBindingType_MemberTypes(String protocolBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(protocolBindingType)) {
				if (xmlTypeValidator.validateAnyURI(protocolBindingType, tempDiagnostics, context)) return true;
			}
			if (EjbJar31Package.eINSTANCE.getProtocolURIAliasType().isInstance(protocolBindingType)) {
				if (validateProtocolURIAliasType(protocolBindingType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(protocolBindingType)) {
				if (xmlTypeValidator.validateAnyURI(protocolBindingType, null, context)) return true;
			}
			if (EjbJar31Package.eINSTANCE.getProtocolURIAliasType().isInstance(protocolBindingType)) {
				if (validateProtocolURIAliasType(protocolBindingType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolURIAliasType(String protocolURIAliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProtocolURIAliasType_Pattern(protocolURIAliasType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateProtocolURIAliasType_Pattern
	 */
	public static final  PatternMatcher [][] PROTOCOL_URI_ALIAS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("##.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Protocol URI Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolURIAliasType_Pattern(String protocolURIAliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar31Package.eINSTANCE.getProtocolURIAliasType(), protocolURIAliasType, PROTOCOL_URI_ALIAS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQnamePattern(String qnamePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateQnamePattern_Pattern(qnamePattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateQnamePattern_Pattern
	 */
	public static final  PatternMatcher [][] QNAME_PATTERN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\*|([\\i-[:]][\\c-[:]]*:)?[\\i-[:]][\\c-[:]]*\\*?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Qname Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQnamePattern_Pattern(String qnamePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EjbJar31Package.eINSTANCE.getQnamePattern(), qnamePattern, QNAME_PATTERN__PATTERN__VALUES, diagnostics, context);
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
	public boolean validateSessionTypeTypeBaseObject(SessionTypeTypeBase sessionTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitTypeTypeBaseObject(TimeUnitTypeTypeBase timeUnitTypeTypeBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return validatePattern(EjbJar31Package.eINSTANCE.getTrueFalseTypeBase(), trueFalseTypeBase, TRUE_FALSE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
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

} //EjbJar31Validator
