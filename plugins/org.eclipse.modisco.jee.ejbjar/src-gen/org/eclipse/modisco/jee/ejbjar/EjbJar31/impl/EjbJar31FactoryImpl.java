/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

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
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Factory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbJar31FactoryImpl extends EFactoryImpl implements EjbJar31Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EjbJar31Factory init() {
		try {
			EjbJar31Factory theEjbJar31Factory = (EjbJar31Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Javaee/ejb-jar_3_1.xsd"); //$NON-NLS-1$ 
			if (theEjbJar31Factory != null) {
				return theEjbJar31Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjbJar31FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar31FactoryImpl() {
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
			case EjbJar31Package.ACCESS_TIMEOUT_TYPE: return createAccessTimeoutType();
			case EjbJar31Package.ACTIVATION_CONFIG_PROPERTY_TYPE: return createActivationConfigPropertyType();
			case EjbJar31Package.ACTIVATION_CONFIG_TYPE: return createActivationConfigType();
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE: return createAddressingResponsesType();
			case EjbJar31Package.ADDRESSING_TYPE: return createAddressingType();
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE: return createApplicationExceptionType();
			case EjbJar31Package.AROUND_INVOKE_TYPE: return createAroundInvokeType();
			case EjbJar31Package.AROUND_TIMEOUT_TYPE: return createAroundTimeoutType();
			case EjbJar31Package.ASSEMBLY_DESCRIPTOR_TYPE: return createAssemblyDescriptorType();
			case EjbJar31Package.ASYNC_METHOD_TYPE: return createAsyncMethodType();
			case EjbJar31Package.CMP_FIELD_TYPE: return createCmpFieldType();
			case EjbJar31Package.CMP_VERSION_TYPE: return createCmpVersionType();
			case EjbJar31Package.CMR_FIELD_TYPE: return createCmrFieldType();
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE: return createCmrFieldTypeType();
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE: return createConcurrencyManagementTypeType();
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE: return createConcurrentLockTypeType();
			case EjbJar31Package.CONCURRENT_METHOD_TYPE: return createConcurrentMethodType();
			case EjbJar31Package.CONTAINER_TRANSACTION_TYPE: return createContainerTransactionType();
			case EjbJar31Package.DATA_SOURCE_TYPE: return createDataSourceType();
			case EjbJar31Package.DEPENDS_ON_TYPE: return createDependsOnType();
			case EjbJar31Package.DESCRIPTION_TYPE: return createDescriptionType();
			case EjbJar31Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case EjbJar31Package.DOCUMENT_ROOT: return createDocumentRoot();
			case EjbJar31Package.EJB_CLASS_TYPE: return createEjbClassType();
			case EjbJar31Package.EJB_JAR_TYPE: return createEjbJarType();
			case EjbJar31Package.EJB_LINK_TYPE: return createEjbLinkType();
			case EjbJar31Package.EJB_LOCAL_REF_TYPE: return createEjbLocalRefType();
			case EjbJar31Package.EJB_NAME_TYPE: return createEjbNameType();
			case EjbJar31Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case EjbJar31Package.EJB_REF_TYPE: return createEjbRefType();
			case EjbJar31Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case EjbJar31Package.EJB_RELATIONSHIP_ROLE_TYPE: return createEjbRelationshipRoleType();
			case EjbJar31Package.EJB_RELATION_TYPE: return createEjbRelationType();
			case EjbJar31Package.EMPTY_TYPE: return createEmptyType();
			case EjbJar31Package.ENTERPRISE_BEANS_TYPE: return createEnterpriseBeansType();
			case EjbJar31Package.ENTITY_BEAN_TYPE: return createEntityBeanType();
			case EjbJar31Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case EjbJar31Package.ENV_ENTRY_TYPE_VALUES_TYPE: return createEnvEntryTypeValuesType();
			case EjbJar31Package.EXCLUDE_LIST_TYPE: return createExcludeListType();
			case EjbJar31Package.FULLY_QUALIFIED_CLASS_TYPE: return createFullyQualifiedClassType();
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE: return createGenericBooleanType();
			case EjbJar31Package.HANDLER_CHAINS_TYPE: return createHandlerChainsType();
			case EjbJar31Package.HANDLER_CHAIN_TYPE: return createHandlerChainType();
			case EjbJar31Package.HANDLER_TYPE: return createHandlerType();
			case EjbJar31Package.HOME_TYPE: return createHomeType();
			case EjbJar31Package.ICON_TYPE: return createIconType();
			case EjbJar31Package.INIT_METHOD_TYPE: return createInitMethodType();
			case EjbJar31Package.INJECTION_TARGET_TYPE: return createInjectionTargetType();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE: return createInterceptorBindingType();
			case EjbJar31Package.INTERCEPTOR_ORDER_TYPE: return createInterceptorOrderType();
			case EjbJar31Package.INTERCEPTORS_TYPE: return createInterceptorsType();
			case EjbJar31Package.INTERCEPTOR_TYPE: return createInterceptorType();
			case EjbJar31Package.JAVA_IDENTIFIER_TYPE: return createJavaIdentifierType();
			case EjbJar31Package.JAVA_TYPE_TYPE: return createJavaTypeType();
			case EjbJar31Package.JDBC_URL_TYPE: return createJdbcUrlType();
			case EjbJar31Package.JNDI_NAME_TYPE: return createJndiNameType();
			case EjbJar31Package.LIFECYCLE_CALLBACK_TYPE: return createLifecycleCallbackType();
			case EjbJar31Package.LISTENER_TYPE: return createListenerType();
			case EjbJar31Package.LOCAL_HOME_TYPE: return createLocalHomeType();
			case EjbJar31Package.LOCAL_TYPE: return createLocalType();
			case EjbJar31Package.MESSAGE_DESTINATION_LINK_TYPE: return createMessageDestinationLinkType();
			case EjbJar31Package.MESSAGE_DESTINATION_REF_TYPE: return createMessageDestinationRefType();
			case EjbJar31Package.MESSAGE_DESTINATION_TYPE: return createMessageDestinationType();
			case EjbJar31Package.MESSAGE_DESTINATION_TYPE_TYPE: return createMessageDestinationTypeType();
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE: return createMessageDestinationUsageType();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE: return createMessageDrivenBeanType();
			case EjbJar31Package.METHOD_INTF_TYPE: return createMethodIntfType();
			case EjbJar31Package.METHOD_NAME_TYPE: return createMethodNameType();
			case EjbJar31Package.METHOD_PARAMS_TYPE: return createMethodParamsType();
			case EjbJar31Package.METHOD_PERMISSION_TYPE: return createMethodPermissionType();
			case EjbJar31Package.METHOD_TYPE: return createMethodType();
			case EjbJar31Package.MULTIPLICITY_TYPE: return createMultiplicityType();
			case EjbJar31Package.NAMED_METHOD_TYPE: return createNamedMethodType();
			case EjbJar31Package.PARAM_VALUE_TYPE: return createParamValueType();
			case EjbJar31Package.PATH_TYPE: return createPathType();
			case EjbJar31Package.PERSISTENCE_CONTEXT_REF_TYPE: return createPersistenceContextRefType();
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE: return createPersistenceContextTypeType();
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE: return createPersistenceTypeType();
			case EjbJar31Package.PERSISTENCE_UNIT_REF_TYPE: return createPersistenceUnitRefType();
			case EjbJar31Package.PORT_COMPONENT_REF_TYPE: return createPortComponentRefType();
			case EjbJar31Package.PROPERTY_TYPE: return createPropertyType();
			case EjbJar31Package.QUERY_METHOD_TYPE: return createQueryMethodType();
			case EjbJar31Package.QUERY_TYPE: return createQueryType();
			case EjbJar31Package.RELATIONSHIP_ROLE_SOURCE_TYPE: return createRelationshipRoleSourceType();
			case EjbJar31Package.RELATIONSHIPS_TYPE: return createRelationshipsType();
			case EjbJar31Package.REMOTE_TYPE: return createRemoteType();
			case EjbJar31Package.REMOVE_METHOD_TYPE: return createRemoveMethodType();
			case EjbJar31Package.RES_AUTH_TYPE: return createResAuthType();
			case EjbJar31Package.RESOURCE_ENV_REF_TYPE: return createResourceEnvRefType();
			case EjbJar31Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case EjbJar31Package.RESPECT_BINDING_TYPE: return createRespectBindingType();
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE: return createResSharingScopeType();
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE: return createResultTypeMappingType();
			case EjbJar31Package.ROLE_NAME_TYPE: return createRoleNameType();
			case EjbJar31Package.RUN_AS_TYPE: return createRunAsType();
			case EjbJar31Package.SECURITY_IDENTITY_TYPE: return createSecurityIdentityType();
			case EjbJar31Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case EjbJar31Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case EjbJar31Package.SERVICE_REF_TYPE: return createServiceRefType();
			case EjbJar31Package.SESSION_BEAN_TYPE: return createSessionBeanType();
			case EjbJar31Package.SESSION_TYPE_TYPE: return createSessionTypeType();
			case EjbJar31Package.STATEFUL_TIMEOUT_TYPE: return createStatefulTimeoutType();
			case EjbJar31Package.STRING: return createString();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE: return createTimerScheduleType();
			case EjbJar31Package.TIMER_TYPE: return createTimerType();
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE: return createTimeUnitTypeType();
			case EjbJar31Package.TRANSACTION_TYPE_TYPE: return createTransactionTypeType();
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE: return createTransAttributeType();
			case EjbJar31Package.TRUE_FALSE_TYPE: return createTrueFalseType();
			case EjbJar31Package.URL_PATTERN_TYPE: return createUrlPatternType();
			case EjbJar31Package.XSD_ANY_URI_TYPE: return createXsdAnyURIType();
			case EjbJar31Package.XSD_BOOLEAN_TYPE: return createXsdBooleanType();
			case EjbJar31Package.XSD_INTEGER_TYPE: return createXsdIntegerType();
			case EjbJar31Package.XSD_NMTOKEN_TYPE: return createXsdNMTOKENType();
			case EjbJar31Package.XSD_NON_NEGATIVE_INTEGER_TYPE: return createXsdNonNegativeIntegerType();
			case EjbJar31Package.XSD_POSITIVE_INTEGER_TYPE: return createXsdPositiveIntegerType();
			case EjbJar31Package.XSD_QNAME_TYPE: return createXsdQNameType();
			case EjbJar31Package.XSD_STRING_TYPE: return createXsdStringType();
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
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE_BASE:
				return createAddressingResponsesTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.CMP_VERSION_TYPE_BASE:
				return createCmpVersionTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE_BASE:
				return createCmrFieldTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE_BASE:
				return createConcurrencyManagementTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE_BASE:
				return createConcurrentLockTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.EJB_REF_TYPE_TYPE_BASE:
				return createEjbRefTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE_BASE:
				return createGenericBooleanTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.ISOLATION_LEVEL_TYPE:
				return createIsolationLevelTypeFromString(eDataType, initialValue);
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return createMessageDestinationUsageTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.METHOD_INTF_TYPE_BASE:
				return createMethodIntfTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.MULTIPLICITY_TYPE_BASE:
				return createMultiplicityTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return createPersistenceContextTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE_BASE:
				return createPersistenceTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.RES_AUTH_TYPE_BASE:
				return createResAuthTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE_BASE:
				return createResSharingScopeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return createResultTypeMappingTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.SESSION_TYPE_TYPE_BASE:
				return createSessionTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE_BASE:
				return createTimeUnitTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.TRANSACTION_TYPE_TYPE_BASE:
				return createTransactionTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return createTransAttributeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE_BASE_OBJECT:
				return createAddressingResponsesTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return createCmpVersionTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return createCmrFieldTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE_BASE_OBJECT:
				return createConcurrencyManagementTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE_BASE_OBJECT:
				return createConcurrentLockTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.DEWEY_VERSION_TYPE:
				return createDeweyVersionTypeFromString(eDataType, initialValue);
			case EjbJar31Package.EJB_CLASS_TYPE_BASE:
				return createEjbClassTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.EJB_LINK_TYPE_BASE:
				return createEjbLinkTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.EJB_NAME_TYPE_BASE:
				return createEjbNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.EJB_REF_NAME_TYPE_BASE:
				return createEjbRefNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return createEjbRefTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return createEnvEntryTypeValuesTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return createFullyQualifiedClassTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return createGenericBooleanTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.HOME_TYPE_BASE:
				return createHomeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.ISOLATION_LEVEL_TYPE_OBJECT:
				return createIsolationLevelTypeObjectFromString(eDataType, initialValue);
			case EjbJar31Package.JAVA_IDENTIFIER_TYPE_BASE:
				return createJavaIdentifierTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.JAVA_TYPE_TYPE_BASE:
				return createJavaTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.JDBC_URL_TYPE_BASE:
				return createJdbcUrlTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.JNDI_NAME_TYPE_BASE:
				return createJndiNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.LOCAL_HOME_TYPE_BASE:
				return createLocalHomeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.LOCAL_TYPE_BASE:
				return createLocalTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return createMessageDestinationLinkTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return createMessageDestinationTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return createMessageDestinationUsageTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return createMethodIntfTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.METHOD_NAME_TYPE_BASE:
				return createMethodNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return createMultiplicityTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.PATH_TYPE_BASE:
				return createPathTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return createPersistenceContextTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return createPersistenceTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.PROTOCOL_BINDING_LIST_TYPE:
				return createProtocolBindingListTypeFromString(eDataType, initialValue);
			case EjbJar31Package.PROTOCOL_BINDING_TYPE:
				return createProtocolBindingTypeFromString(eDataType, initialValue);
			case EjbJar31Package.PROTOCOL_URI_ALIAS_TYPE:
				return createProtocolURIAliasTypeFromString(eDataType, initialValue);
			case EjbJar31Package.QNAME_PATTERN:
				return createQnamePatternFromString(eDataType, initialValue);
			case EjbJar31Package.REMOTE_TYPE_BASE:
				return createRemoteTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.RES_AUTH_TYPE_BASE_OBJECT:
				return createResAuthTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return createResSharingScopeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return createResultTypeMappingTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.ROLE_NAME_TYPE_BASE:
				return createRoleNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return createSessionTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE_BASE_OBJECT:
				return createTimeUnitTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return createTransactionTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return createTransAttributeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar31Package.TRUE_FALSE_TYPE_BASE:
				return createTrueFalseTypeBaseFromString(eDataType, initialValue);
			case EjbJar31Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return createTrueFalseTypeBaseObjectFromString(eDataType, initialValue);
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
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE_BASE:
				return convertAddressingResponsesTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.CMP_VERSION_TYPE_BASE:
				return convertCmpVersionTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE_BASE:
				return convertCmrFieldTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE_BASE:
				return convertConcurrencyManagementTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE_BASE:
				return convertConcurrentLockTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.EJB_REF_TYPE_TYPE_BASE:
				return convertEjbRefTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE_BASE:
				return convertGenericBooleanTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.ISOLATION_LEVEL_TYPE:
				return convertIsolationLevelTypeToString(eDataType, instanceValue);
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return convertMessageDestinationUsageTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.METHOD_INTF_TYPE_BASE:
				return convertMethodIntfTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.MULTIPLICITY_TYPE_BASE:
				return convertMultiplicityTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return convertPersistenceContextTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE_BASE:
				return convertPersistenceTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.RES_AUTH_TYPE_BASE:
				return convertResAuthTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE_BASE:
				return convertResSharingScopeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return convertResultTypeMappingTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.SESSION_TYPE_TYPE_BASE:
				return convertSessionTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE_BASE:
				return convertTimeUnitTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.TRANSACTION_TYPE_TYPE_BASE:
				return convertTransactionTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return convertTransAttributeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.ADDRESSING_RESPONSES_TYPE_BASE_OBJECT:
				return convertAddressingResponsesTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return convertCmpVersionTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return convertCmrFieldTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.CONCURRENCY_MANAGEMENT_TYPE_TYPE_BASE_OBJECT:
				return convertConcurrencyManagementTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.CONCURRENT_LOCK_TYPE_TYPE_BASE_OBJECT:
				return convertConcurrentLockTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.DEWEY_VERSION_TYPE:
				return convertDeweyVersionTypeToString(eDataType, instanceValue);
			case EjbJar31Package.EJB_CLASS_TYPE_BASE:
				return convertEjbClassTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.EJB_LINK_TYPE_BASE:
				return convertEjbLinkTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.EJB_NAME_TYPE_BASE:
				return convertEjbNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.EJB_REF_NAME_TYPE_BASE:
				return convertEjbRefNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return convertEjbRefTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return convertEnvEntryTypeValuesTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return convertFullyQualifiedClassTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return convertGenericBooleanTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.HOME_TYPE_BASE:
				return convertHomeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.ISOLATION_LEVEL_TYPE_OBJECT:
				return convertIsolationLevelTypeObjectToString(eDataType, instanceValue);
			case EjbJar31Package.JAVA_IDENTIFIER_TYPE_BASE:
				return convertJavaIdentifierTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.JAVA_TYPE_TYPE_BASE:
				return convertJavaTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.JDBC_URL_TYPE_BASE:
				return convertJdbcUrlTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.JNDI_NAME_TYPE_BASE:
				return convertJndiNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.LOCAL_HOME_TYPE_BASE:
				return convertLocalHomeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.LOCAL_TYPE_BASE:
				return convertLocalTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return convertMessageDestinationLinkTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return convertMessageDestinationTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return convertMessageDestinationUsageTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return convertMethodIntfTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.METHOD_NAME_TYPE_BASE:
				return convertMethodNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return convertMultiplicityTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.PATH_TYPE_BASE:
				return convertPathTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return convertPersistenceContextTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return convertPersistenceTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.PROTOCOL_BINDING_LIST_TYPE:
				return convertProtocolBindingListTypeToString(eDataType, instanceValue);
			case EjbJar31Package.PROTOCOL_BINDING_TYPE:
				return convertProtocolBindingTypeToString(eDataType, instanceValue);
			case EjbJar31Package.PROTOCOL_URI_ALIAS_TYPE:
				return convertProtocolURIAliasTypeToString(eDataType, instanceValue);
			case EjbJar31Package.QNAME_PATTERN:
				return convertQnamePatternToString(eDataType, instanceValue);
			case EjbJar31Package.REMOTE_TYPE_BASE:
				return convertRemoteTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.RES_AUTH_TYPE_BASE_OBJECT:
				return convertResAuthTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return convertResSharingScopeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return convertResultTypeMappingTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.ROLE_NAME_TYPE_BASE:
				return convertRoleNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return convertSessionTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.TIME_UNIT_TYPE_TYPE_BASE_OBJECT:
				return convertTimeUnitTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return convertTransactionTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return convertTransAttributeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar31Package.TRUE_FALSE_TYPE_BASE:
				return convertTrueFalseTypeBaseToString(eDataType, instanceValue);
			case EjbJar31Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return convertTrueFalseTypeBaseObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTimeoutType createAccessTimeoutType() {
		AccessTimeoutTypeImpl accessTimeoutType = new AccessTimeoutTypeImpl();
		return accessTimeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationConfigPropertyType createActivationConfigPropertyType() {
		ActivationConfigPropertyTypeImpl activationConfigPropertyType = new ActivationConfigPropertyTypeImpl();
		return activationConfigPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationConfigType createActivationConfigType() {
		ActivationConfigTypeImpl activationConfigType = new ActivationConfigTypeImpl();
		return activationConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingResponsesType createAddressingResponsesType() {
		AddressingResponsesTypeImpl addressingResponsesType = new AddressingResponsesTypeImpl();
		return addressingResponsesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingType createAddressingType() {
		AddressingTypeImpl addressingType = new AddressingTypeImpl();
		return addressingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationExceptionType createApplicationExceptionType() {
		ApplicationExceptionTypeImpl applicationExceptionType = new ApplicationExceptionTypeImpl();
		return applicationExceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AroundInvokeType createAroundInvokeType() {
		AroundInvokeTypeImpl aroundInvokeType = new AroundInvokeTypeImpl();
		return aroundInvokeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AroundTimeoutType createAroundTimeoutType() {
		AroundTimeoutTypeImpl aroundTimeoutType = new AroundTimeoutTypeImpl();
		return aroundTimeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyDescriptorType createAssemblyDescriptorType() {
		AssemblyDescriptorTypeImpl assemblyDescriptorType = new AssemblyDescriptorTypeImpl();
		return assemblyDescriptorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncMethodType createAsyncMethodType() {
		AsyncMethodTypeImpl asyncMethodType = new AsyncMethodTypeImpl();
		return asyncMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpFieldType createCmpFieldType() {
		CmpFieldTypeImpl cmpFieldType = new CmpFieldTypeImpl();
		return cmpFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionType createCmpVersionType() {
		CmpVersionTypeImpl cmpVersionType = new CmpVersionTypeImpl();
		return cmpVersionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldType createCmrFieldType() {
		CmrFieldTypeImpl cmrFieldType = new CmrFieldTypeImpl();
		return cmrFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeType createCmrFieldTypeType() {
		CmrFieldTypeTypeImpl cmrFieldTypeType = new CmrFieldTypeTypeImpl();
		return cmrFieldTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyManagementTypeType createConcurrencyManagementTypeType() {
		ConcurrencyManagementTypeTypeImpl concurrencyManagementTypeType = new ConcurrencyManagementTypeTypeImpl();
		return concurrencyManagementTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentLockTypeType createConcurrentLockTypeType() {
		ConcurrentLockTypeTypeImpl concurrentLockTypeType = new ConcurrentLockTypeTypeImpl();
		return concurrentLockTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentMethodType createConcurrentMethodType() {
		ConcurrentMethodTypeImpl concurrentMethodType = new ConcurrentMethodTypeImpl();
		return concurrentMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTransactionType createContainerTransactionType() {
		ContainerTransactionTypeImpl containerTransactionType = new ContainerTransactionTypeImpl();
		return containerTransactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceType createDataSourceType() {
		DataSourceTypeImpl dataSourceType = new DataSourceTypeImpl();
		return dataSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependsOnType createDependsOnType() {
		DependsOnTypeImpl dependsOnType = new DependsOnTypeImpl();
		return dependsOnType;
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
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClassType createEjbClassType() {
		EjbClassTypeImpl ejbClassType = new EjbClassTypeImpl();
		return ejbClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJarType createEjbJarType() {
		EjbJarTypeImpl ejbJarType = new EjbJarTypeImpl();
		return ejbJarType;
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
	public EjbNameType createEjbNameType() {
		EjbNameTypeImpl ejbNameType = new EjbNameTypeImpl();
		return ejbNameType;
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
	public EjbRelationshipRoleType createEjbRelationshipRoleType() {
		EjbRelationshipRoleTypeImpl ejbRelationshipRoleType = new EjbRelationshipRoleTypeImpl();
		return ejbRelationshipRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationType createEjbRelationType() {
		EjbRelationTypeImpl ejbRelationType = new EjbRelationTypeImpl();
		return ejbRelationType;
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
	public EnterpriseBeansType createEnterpriseBeansType() {
		EnterpriseBeansTypeImpl enterpriseBeansType = new EnterpriseBeansTypeImpl();
		return enterpriseBeansType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityBeanType createEntityBeanType() {
		EntityBeanTypeImpl entityBeanType = new EntityBeanTypeImpl();
		return entityBeanType;
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
	public ExcludeListType createExcludeListType() {
		ExcludeListTypeImpl excludeListType = new ExcludeListTypeImpl();
		return excludeListType;
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
	public HandlerChainsType createHandlerChainsType() {
		HandlerChainsTypeImpl handlerChainsType = new HandlerChainsTypeImpl();
		return handlerChainsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerChainType createHandlerChainType() {
		HandlerChainTypeImpl handlerChainType = new HandlerChainTypeImpl();
		return handlerChainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerType createHandlerType() {
		HandlerTypeImpl handlerType = new HandlerTypeImpl();
		return handlerType;
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
	public InitMethodType createInitMethodType() {
		InitMethodTypeImpl initMethodType = new InitMethodTypeImpl();
		return initMethodType;
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
	public InterceptorBindingType createInterceptorBindingType() {
		InterceptorBindingTypeImpl interceptorBindingType = new InterceptorBindingTypeImpl();
		return interceptorBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorOrderType createInterceptorOrderType() {
		InterceptorOrderTypeImpl interceptorOrderType = new InterceptorOrderTypeImpl();
		return interceptorOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorsType createInterceptorsType() {
		InterceptorsTypeImpl interceptorsType = new InterceptorsTypeImpl();
		return interceptorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorType createInterceptorType() {
		InterceptorTypeImpl interceptorType = new InterceptorTypeImpl();
		return interceptorType;
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
	public JdbcUrlType createJdbcUrlType() {
		JdbcUrlTypeImpl jdbcUrlType = new JdbcUrlTypeImpl();
		return jdbcUrlType;
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
	public MessageDrivenBeanType createMessageDrivenBeanType() {
		MessageDrivenBeanTypeImpl messageDrivenBeanType = new MessageDrivenBeanTypeImpl();
		return messageDrivenBeanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfType createMethodIntfType() {
		MethodIntfTypeImpl methodIntfType = new MethodIntfTypeImpl();
		return methodIntfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNameType createMethodNameType() {
		MethodNameTypeImpl methodNameType = new MethodNameTypeImpl();
		return methodNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParamsType createMethodParamsType() {
		MethodParamsTypeImpl methodParamsType = new MethodParamsTypeImpl();
		return methodParamsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPermissionType createMethodPermissionType() {
		MethodPermissionTypeImpl methodPermissionType = new MethodPermissionTypeImpl();
		return methodPermissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType createMethodType() {
		MethodTypeImpl methodType = new MethodTypeImpl();
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityType createMultiplicityType() {
		MultiplicityTypeImpl multiplicityType = new MultiplicityTypeImpl();
		return multiplicityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType createNamedMethodType() {
		NamedMethodTypeImpl namedMethodType = new NamedMethodTypeImpl();
		return namedMethodType;
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
	public PersistenceTypeType createPersistenceTypeType() {
		PersistenceTypeTypeImpl persistenceTypeType = new PersistenceTypeTypeImpl();
		return persistenceTypeType;
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
	public QueryMethodType createQueryMethodType() {
		QueryMethodTypeImpl queryMethodType = new QueryMethodTypeImpl();
		return queryMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType createQueryType() {
		QueryTypeImpl queryType = new QueryTypeImpl();
		return queryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipRoleSourceType createRelationshipRoleSourceType() {
		RelationshipRoleSourceTypeImpl relationshipRoleSourceType = new RelationshipRoleSourceTypeImpl();
		return relationshipRoleSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsType createRelationshipsType() {
		RelationshipsTypeImpl relationshipsType = new RelationshipsTypeImpl();
		return relationshipsType;
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
	public RemoveMethodType createRemoveMethodType() {
		RemoveMethodTypeImpl removeMethodType = new RemoveMethodTypeImpl();
		return removeMethodType;
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
	public RespectBindingType createRespectBindingType() {
		RespectBindingTypeImpl respectBindingType = new RespectBindingTypeImpl();
		return respectBindingType;
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
	public ResultTypeMappingType createResultTypeMappingType() {
		ResultTypeMappingTypeImpl resultTypeMappingType = new ResultTypeMappingTypeImpl();
		return resultTypeMappingType;
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
	public SecurityIdentityType createSecurityIdentityType() {
		SecurityIdentityTypeImpl securityIdentityType = new SecurityIdentityTypeImpl();
		return securityIdentityType;
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
	public ServiceRefType createServiceRefType() {
		ServiceRefTypeImpl serviceRefType = new ServiceRefTypeImpl();
		return serviceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionBeanType createSessionBeanType() {
		SessionBeanTypeImpl sessionBeanType = new SessionBeanTypeImpl();
		return sessionBeanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeType createSessionTypeType() {
		SessionTypeTypeImpl sessionTypeType = new SessionTypeTypeImpl();
		return sessionTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatefulTimeoutType createStatefulTimeoutType() {
		StatefulTimeoutTypeImpl statefulTimeoutType = new StatefulTimeoutTypeImpl();
		return statefulTimeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerScheduleType createTimerScheduleType() {
		TimerScheduleTypeImpl timerScheduleType = new TimerScheduleTypeImpl();
		return timerScheduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerType createTimerType() {
		TimerTypeImpl timerType = new TimerTypeImpl();
		return timerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitTypeType createTimeUnitTypeType() {
		TimeUnitTypeTypeImpl timeUnitTypeType = new TimeUnitTypeTypeImpl();
		return timeUnitTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType createTransactionTypeType() {
		TransactionTypeTypeImpl transactionTypeType = new TransactionTypeTypeImpl();
		return transactionTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeType createTransAttributeType() {
		TransAttributeTypeImpl transAttributeType = new TransAttributeTypeImpl();
		return transAttributeType;
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
	public AddressingResponsesTypeBase createAddressingResponsesTypeBaseFromString(EDataType eDataType, String initialValue) {
		AddressingResponsesTypeBase result = AddressingResponsesTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressingResponsesTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionTypeBase createCmpVersionTypeBaseFromString(EDataType eDataType, String initialValue) {
		CmpVersionTypeBase result = CmpVersionTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmpVersionTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeTypeBase createCmrFieldTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		CmrFieldTypeTypeBase result = CmrFieldTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmrFieldTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyManagementTypeTypeBase createConcurrencyManagementTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		ConcurrencyManagementTypeTypeBase result = ConcurrencyManagementTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcurrencyManagementTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentLockTypeTypeBase createConcurrentLockTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		ConcurrentLockTypeTypeBase result = ConcurrentLockTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcurrentLockTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
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
	public IsolationLevelType createIsolationLevelTypeFromString(EDataType eDataType, String initialValue) {
		IsolationLevelType result = IsolationLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsolationLevelTypeToString(EDataType eDataType, Object instanceValue) {
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
	public MethodIntfTypeBase createMethodIntfTypeBaseFromString(EDataType eDataType, String initialValue) {
		MethodIntfTypeBase result = MethodIntfTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodIntfTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityTypeBase createMultiplicityTypeBaseFromString(EDataType eDataType, String initialValue) {
		MultiplicityTypeBase result = MultiplicityTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityTypeBaseToString(EDataType eDataType, Object instanceValue) {
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
	public PersistenceTypeTypeBase createPersistenceTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		PersistenceTypeTypeBase result = PersistenceTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
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
	public ResultTypeMappingTypeBase createResultTypeMappingTypeBaseFromString(EDataType eDataType, String initialValue) {
		ResultTypeMappingTypeBase result = ResultTypeMappingTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeMappingTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeTypeBase createSessionTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		SessionTypeTypeBase result = SessionTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSessionTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitTypeTypeBase createTimeUnitTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		TimeUnitTypeTypeBase result = TimeUnitTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeTypeBase createTransactionTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		TransactionTypeTypeBase result = TransactionTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeTypeBase createTransAttributeTypeBaseFromString(EDataType eDataType, String initialValue) {
		TransAttributeTypeBase result = TransAttributeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransAttributeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingResponsesTypeBase createAddressingResponsesTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressingResponsesTypeBaseFromString(EjbJar31Package.eINSTANCE.getAddressingResponsesTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressingResponsesTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressingResponsesTypeBaseToString(EjbJar31Package.eINSTANCE.getAddressingResponsesTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionTypeBase createCmpVersionTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createCmpVersionTypeBaseFromString(EjbJar31Package.eINSTANCE.getCmpVersionTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmpVersionTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCmpVersionTypeBaseToString(EjbJar31Package.eINSTANCE.getCmpVersionTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeTypeBase createCmrFieldTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createCmrFieldTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getCmrFieldTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmrFieldTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCmrFieldTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getCmrFieldTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyManagementTypeTypeBase createConcurrencyManagementTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createConcurrencyManagementTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getConcurrencyManagementTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcurrencyManagementTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConcurrencyManagementTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getConcurrencyManagementTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentLockTypeTypeBase createConcurrentLockTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createConcurrentLockTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getConcurrentLockTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcurrentLockTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConcurrentLockTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getConcurrentLockTypeTypeBase(), instanceValue);
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
	public String createEjbClassTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbClassTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
	public String createEjbNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
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
		return createEjbRefTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getEjbRefTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEjbRefTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getEjbRefTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnvEntryTypeValuesTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeValuesTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
		return createGenericBooleanTypeBaseFromString(EjbJar31Package.eINSTANCE.getGenericBooleanTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericBooleanTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGenericBooleanTypeBaseToString(EjbJar31Package.eINSTANCE.getGenericBooleanTypeBase(), instanceValue);
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
	public IsolationLevelType createIsolationLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIsolationLevelTypeFromString(EjbJar31Package.eINSTANCE.getIsolationLevelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsolationLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIsolationLevelTypeToString(EjbJar31Package.eINSTANCE.getIsolationLevelType(), instanceValue);
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
	public String createJdbcUrlTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJdbcUrlTypeBaseToString(EDataType eDataType, Object instanceValue) {
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
		return createMessageDestinationUsageTypeBaseFromString(EjbJar31Package.eINSTANCE.getMessageDestinationUsageTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageDestinationUsageTypeBaseToString(EjbJar31Package.eINSTANCE.getMessageDestinationUsageTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfTypeBase createMethodIntfTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createMethodIntfTypeBaseFromString(EjbJar31Package.eINSTANCE.getMethodIntfTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodIntfTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMethodIntfTypeBaseToString(EjbJar31Package.eINSTANCE.getMethodIntfTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMethodNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityTypeBase createMultiplicityTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createMultiplicityTypeBaseFromString(EjbJar31Package.eINSTANCE.getMultiplicityTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultiplicityTypeBaseToString(EjbJar31Package.eINSTANCE.getMultiplicityTypeBase(), instanceValue);
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
		return createPersistenceContextTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getPersistenceContextTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceContextTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceContextTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getPersistenceContextTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeTypeBase createPersistenceTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createPersistenceTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getPersistenceTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getPersistenceTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createProtocolBindingListTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createProtocolBindingTypeFromString(EjbJar31Package.eINSTANCE.getProtocolBindingType(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolBindingListTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertProtocolBindingTypeToString(EjbJar31Package.eINSTANCE.getProtocolBindingType(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createProtocolBindingTypeFromString(EDataType eDataType, String initialValue) {
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
			result = createProtocolURIAliasTypeFromString(EjbJar31Package.eINSTANCE.getProtocolURIAliasType(), initialValue);
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
	public String convertProtocolBindingTypeToString(EDataType eDataType, Object instanceValue) {
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
		if (EjbJar31Package.eINSTANCE.getProtocolURIAliasType().isInstance(instanceValue)) {
			try {
				String value = convertProtocolURIAliasTypeToString(EjbJar31Package.eINSTANCE.getProtocolURIAliasType(), instanceValue);
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
	public String createProtocolURIAliasTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolURIAliasTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createQnamePatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQnamePatternToString(EDataType eDataType, Object instanceValue) {
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
		return createResAuthTypeBaseFromString(EjbJar31Package.eINSTANCE.getResAuthTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResAuthTypeBaseToString(EjbJar31Package.eINSTANCE.getResAuthTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeTypeBase createResSharingScopeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createResSharingScopeTypeBaseFromString(EjbJar31Package.eINSTANCE.getResSharingScopeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResSharingScopeTypeBaseToString(EjbJar31Package.eINSTANCE.getResSharingScopeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeMappingTypeBase createResultTypeMappingTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createResultTypeMappingTypeBaseFromString(EjbJar31Package.eINSTANCE.getResultTypeMappingTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeMappingTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResultTypeMappingTypeBaseToString(EjbJar31Package.eINSTANCE.getResultTypeMappingTypeBase(), instanceValue);
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
	public SessionTypeTypeBase createSessionTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createSessionTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getSessionTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSessionTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSessionTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getSessionTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitTypeTypeBase createTimeUnitTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeUnitTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getTimeUnitTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeUnitTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getTimeUnitTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeTypeBase createTransactionTypeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createTransactionTypeTypeBaseFromString(EjbJar31Package.eINSTANCE.getTransactionTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransactionTypeTypeBaseToString(EjbJar31Package.eINSTANCE.getTransactionTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeTypeBase createTransAttributeTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createTransAttributeTypeBaseFromString(EjbJar31Package.eINSTANCE.getTransAttributeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransAttributeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransAttributeTypeBaseToString(EjbJar31Package.eINSTANCE.getTransAttributeTypeBase(), instanceValue);
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
		return createTrueFalseTypeBaseFromString(EjbJar31Package.eINSTANCE.getTrueFalseTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrueFalseTypeBaseToString(EjbJar31Package.eINSTANCE.getTrueFalseTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar31Package getEjbJar31Package() {
		return (EjbJar31Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjbJar31Package getPackage() {
		return EjbJar31Package.eINSTANCE;
	}

} //EjbJar31FactoryImpl
