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
package org.eclipse.modisco.jee.ejbjar.EjbJar30.impl;

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
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Factory;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class EjbJar30FactoryImpl extends EFactoryImpl implements EjbJar30Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static EjbJar30Factory init() {
		try {
			EjbJar30Factory theEjbJar30Factory = (EjbJar30Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Javaee/ejb-jar_3_0.xsd"); //$NON-NLS-1$ 
			if (theEjbJar30Factory != null) {
				return theEjbJar30Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjbJar30FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public EjbJar30FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EjbJar30Package.ACTIVATION_CONFIG_PROPERTY_TYPE: return createActivationConfigPropertyType();
			case EjbJar30Package.ACTIVATION_CONFIG_TYPE: return createActivationConfigType();
			case EjbJar30Package.APPLICATION_EXCEPTION_TYPE: return createApplicationExceptionType();
			case EjbJar30Package.AROUND_INVOKE_TYPE: return createAroundInvokeType();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE: return createAssemblyDescriptorType();
			case EjbJar30Package.CMP_FIELD_TYPE: return createCmpFieldType();
			case EjbJar30Package.CMP_VERSION_TYPE: return createCmpVersionType();
			case EjbJar30Package.CMR_FIELD_TYPE: return createCmrFieldType();
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE: return createCmrFieldTypeType();
			case EjbJar30Package.CONTAINER_TRANSACTION_TYPE: return createContainerTransactionType();
			case EjbJar30Package.DESCRIPTION_TYPE: return createDescriptionType();
			case EjbJar30Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case EjbJar30Package.DOCUMENT_ROOT: return createDocumentRoot();
			case EjbJar30Package.EJB_CLASS_TYPE: return createEjbClassType();
			case EjbJar30Package.EJB_JAR_TYPE: return createEjbJarType();
			case EjbJar30Package.EJB_LINK_TYPE: return createEjbLinkType();
			case EjbJar30Package.EJB_LOCAL_REF_TYPE: return createEjbLocalRefType();
			case EjbJar30Package.EJB_NAME_TYPE: return createEjbNameType();
			case EjbJar30Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case EjbJar30Package.EJB_REF_TYPE: return createEjbRefType();
			case EjbJar30Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case EjbJar30Package.EJB_RELATIONSHIP_ROLE_TYPE: return createEjbRelationshipRoleType();
			case EjbJar30Package.EJB_RELATION_TYPE: return createEjbRelationType();
			case EjbJar30Package.EMPTY_TYPE: return createEmptyType();
			case EjbJar30Package.ENTERPRISE_BEANS_TYPE: return createEnterpriseBeansType();
			case EjbJar30Package.ENTITY_BEAN_TYPE: return createEntityBeanType();
			case EjbJar30Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE: return createEnvEntryTypeValuesType();
			case EjbJar30Package.EXCLUDE_LIST_TYPE: return createExcludeListType();
			case EjbJar30Package.FULLY_QUALIFIED_CLASS_TYPE: return createFullyQualifiedClassType();
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE: return createGenericBooleanType();
			case EjbJar30Package.HOME_TYPE: return createHomeType();
			case EjbJar30Package.ICON_TYPE: return createIconType();
			case EjbJar30Package.INIT_METHOD_TYPE: return createInitMethodType();
			case EjbJar30Package.INJECTION_TARGET_TYPE: return createInjectionTargetType();
			case EjbJar30Package.INTERCEPTOR_BINDING_TYPE: return createInterceptorBindingType();
			case EjbJar30Package.INTERCEPTOR_ORDER_TYPE: return createInterceptorOrderType();
			case EjbJar30Package.INTERCEPTORS_TYPE: return createInterceptorsType();
			case EjbJar30Package.INTERCEPTOR_TYPE: return createInterceptorType();
			case EjbJar30Package.JAVA_IDENTIFIER_TYPE: return createJavaIdentifierType();
			case EjbJar30Package.JAVA_TYPE_TYPE: return createJavaTypeType();
			case EjbJar30Package.JNDI_NAME_TYPE: return createJndiNameType();
			case EjbJar30Package.LIFECYCLE_CALLBACK_TYPE: return createLifecycleCallbackType();
			case EjbJar30Package.LISTENER_TYPE: return createListenerType();
			case EjbJar30Package.LOCAL_HOME_TYPE: return createLocalHomeType();
			case EjbJar30Package.LOCAL_TYPE: return createLocalType();
			case EjbJar30Package.MESSAGE_DESTINATION_LINK_TYPE: return createMessageDestinationLinkType();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE: return createMessageDestinationRefType();
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE: return createMessageDestinationType();
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE_TYPE: return createMessageDestinationTypeType();
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE: return createMessageDestinationUsageType();
			case EjbJar30Package.MESSAGE_DRIVEN_BEAN_TYPE: return createMessageDrivenBeanType();
			case EjbJar30Package.METHOD_INTF_TYPE: return createMethodIntfType();
			case EjbJar30Package.METHOD_NAME_TYPE: return createMethodNameType();
			case EjbJar30Package.METHOD_PARAMS_TYPE: return createMethodParamsType();
			case EjbJar30Package.METHOD_PERMISSION_TYPE: return createMethodPermissionType();
			case EjbJar30Package.METHOD_TYPE: return createMethodType();
			case EjbJar30Package.MULTIPLICITY_TYPE: return createMultiplicityType();
			case EjbJar30Package.NAMED_METHOD_TYPE: return createNamedMethodType();
			case EjbJar30Package.PARAM_VALUE_TYPE: return createParamValueType();
			case EjbJar30Package.PATH_TYPE: return createPathType();
			case EjbJar30Package.PERSISTENCE_CONTEXT_REF_TYPE: return createPersistenceContextRefType();
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE: return createPersistenceContextTypeType();
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE: return createPersistenceTypeType();
			case EjbJar30Package.PERSISTENCE_UNIT_REF_TYPE: return createPersistenceUnitRefType();
			case EjbJar30Package.PORT_COMPONENT_REF_TYPE: return createPortComponentRefType();
			case EjbJar30Package.PROPERTY_TYPE: return createPropertyType();
			case EjbJar30Package.QUERY_METHOD_TYPE: return createQueryMethodType();
			case EjbJar30Package.QUERY_TYPE: return createQueryType();
			case EjbJar30Package.RELATIONSHIP_ROLE_SOURCE_TYPE: return createRelationshipRoleSourceType();
			case EjbJar30Package.RELATIONSHIPS_TYPE: return createRelationshipsType();
			case EjbJar30Package.REMOTE_TYPE: return createRemoteType();
			case EjbJar30Package.REMOVE_METHOD_TYPE: return createRemoveMethodType();
			case EjbJar30Package.RES_AUTH_TYPE: return createResAuthType();
			case EjbJar30Package.RESOURCE_ENV_REF_TYPE: return createResourceEnvRefType();
			case EjbJar30Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE: return createResSharingScopeType();
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE: return createResultTypeMappingType();
			case EjbJar30Package.ROLE_NAME_TYPE: return createRoleNameType();
			case EjbJar30Package.RUN_AS_TYPE: return createRunAsType();
			case EjbJar30Package.SECURITY_IDENTITY_TYPE: return createSecurityIdentityType();
			case EjbJar30Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case EjbJar30Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case EjbJar30Package.SERVICE_REF_HANDLER_CHAINS_TYPE: return createServiceRefHandlerChainsType();
			case EjbJar30Package.SERVICE_REF_HANDLER_CHAIN_TYPE: return createServiceRefHandlerChainType();
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE: return createServiceRefHandlerType();
			case EjbJar30Package.SERVICE_REF_TYPE: return createServiceRefType();
			case EjbJar30Package.SESSION_BEAN_TYPE: return createSessionBeanType();
			case EjbJar30Package.SESSION_TYPE_TYPE: return createSessionTypeType();
			case EjbJar30Package.STRING: return createString();
			case EjbJar30Package.TRANSACTION_TYPE_TYPE: return createTransactionTypeType();
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE: return createTransAttributeType();
			case EjbJar30Package.TRUE_FALSE_TYPE: return createTrueFalseType();
			case EjbJar30Package.URL_PATTERN_TYPE: return createUrlPatternType();
			case EjbJar30Package.XSD_ANY_URI_TYPE: return createXsdAnyURIType();
			case EjbJar30Package.XSD_BOOLEAN_TYPE: return createXsdBooleanType();
			case EjbJar30Package.XSD_INTEGER_TYPE: return createXsdIntegerType();
			case EjbJar30Package.XSD_NMTOKEN_TYPE: return createXsdNMTOKENType();
			case EjbJar30Package.XSD_NON_NEGATIVE_INTEGER_TYPE: return createXsdNonNegativeIntegerType();
			case EjbJar30Package.XSD_POSITIVE_INTEGER_TYPE: return createXsdPositiveIntegerType();
			case EjbJar30Package.XSD_QNAME_TYPE: return createXsdQNameType();
			case EjbJar30Package.XSD_STRING_TYPE: return createXsdStringType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EjbJar30Package.CMP_VERSION_TYPE_BASE:
				return createCmpVersionTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE_BASE:
				return createCmrFieldTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.EJB_REF_TYPE_TYPE_BASE:
				return createEjbRefTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return createEnvEntryTypeValuesTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE_BASE:
				return createGenericBooleanTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return createMessageDestinationUsageTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.METHOD_INTF_TYPE_BASE:
				return createMethodIntfTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.MULTIPLICITY_TYPE_BASE:
				return createMultiplicityTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return createPersistenceContextTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE_BASE:
				return createPersistenceTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.RES_AUTH_TYPE_BASE:
				return createResAuthTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE_BASE:
				return createResSharingScopeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return createResultTypeMappingTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.SESSION_TYPE_TYPE_BASE:
				return createSessionTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.TRANSACTION_TYPE_TYPE_BASE:
				return createTransactionTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return createTransAttributeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return createCmpVersionTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return createCmrFieldTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.DEWEY_VERSION_TYPE:
				return createDeweyVersionTypeFromString(eDataType, initialValue);
			case EjbJar30Package.EJB_CLASS_TYPE_BASE:
				return createEjbClassTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.EJB_LINK_TYPE_BASE:
				return createEjbLinkTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.EJB_NAME_TYPE_BASE:
				return createEjbNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.EJB_REF_NAME_TYPE_BASE:
				return createEjbRefNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return createEjbRefTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return createEnvEntryTypeValuesTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return createFullyQualifiedClassTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return createGenericBooleanTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.HOME_TYPE_BASE:
				return createHomeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.JAVA_IDENTIFIER_TYPE_BASE:
				return createJavaIdentifierTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.JAVA_TYPE_TYPE_BASE:
				return createJavaTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.JNDI_NAME_TYPE_BASE:
				return createJndiNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.LOCAL_HOME_TYPE_BASE:
				return createLocalHomeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.LOCAL_TYPE_BASE:
				return createLocalTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return createMessageDestinationLinkTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return createMessageDestinationTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return createMessageDestinationUsageTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return createMethodIntfTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.METHOD_NAME_TYPE_BASE:
				return createMethodNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return createMultiplicityTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.PATH_TYPE_BASE:
				return createPathTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return createPersistenceContextTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return createPersistenceTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.REMOTE_TYPE_BASE:
				return createRemoteTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.RES_AUTH_TYPE_BASE_OBJECT:
				return createResAuthTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return createResSharingScopeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return createResultTypeMappingTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.ROLE_NAME_TYPE_BASE:
				return createRoleNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return createServiceRefProtocolBindingListTypeFromString(eDataType, initialValue);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return createServiceRefProtocolBindingTypeFromString(eDataType, initialValue);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return createServiceRefProtocolURIAliasTypeFromString(eDataType, initialValue);
			case EjbJar30Package.SERVICE_REF_QNAME_PATTERN:
				return createServiceRefQnamePatternFromString(eDataType, initialValue);
			case EjbJar30Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return createSessionTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return createTransactionTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return createTransAttributeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar30Package.TRUE_FALSE_TYPE_BASE:
				return createTrueFalseTypeBaseFromString(eDataType, initialValue);
			case EjbJar30Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return createTrueFalseTypeBaseObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EjbJar30Package.CMP_VERSION_TYPE_BASE:
				return convertCmpVersionTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE_BASE:
				return convertCmrFieldTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.EJB_REF_TYPE_TYPE_BASE:
				return convertEjbRefTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return convertEnvEntryTypeValuesTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE_BASE:
				return convertGenericBooleanTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return convertMessageDestinationUsageTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.METHOD_INTF_TYPE_BASE:
				return convertMethodIntfTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.MULTIPLICITY_TYPE_BASE:
				return convertMultiplicityTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE:
				return convertPersistenceContextTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE_BASE:
				return convertPersistenceTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.RES_AUTH_TYPE_BASE:
				return convertResAuthTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE_BASE:
				return convertResSharingScopeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return convertResultTypeMappingTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.SESSION_TYPE_TYPE_BASE:
				return convertSessionTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.TRANSACTION_TYPE_TYPE_BASE:
				return convertTransactionTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return convertTransAttributeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return convertCmpVersionTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return convertCmrFieldTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.DEWEY_VERSION_TYPE:
				return convertDeweyVersionTypeToString(eDataType, instanceValue);
			case EjbJar30Package.EJB_CLASS_TYPE_BASE:
				return convertEjbClassTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.EJB_LINK_TYPE_BASE:
				return convertEjbLinkTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.EJB_NAME_TYPE_BASE:
				return convertEjbNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.EJB_REF_NAME_TYPE_BASE:
				return convertEjbRefNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return convertEjbRefTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return convertEnvEntryTypeValuesTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return convertFullyQualifiedClassTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return convertGenericBooleanTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.HOME_TYPE_BASE:
				return convertHomeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.JAVA_IDENTIFIER_TYPE_BASE:
				return convertJavaIdentifierTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.JAVA_TYPE_TYPE_BASE:
				return convertJavaTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.JNDI_NAME_TYPE_BASE:
				return convertJndiNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.LOCAL_HOME_TYPE_BASE:
				return convertLocalHomeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.LOCAL_TYPE_BASE:
				return convertLocalTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return convertMessageDestinationLinkTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return convertMessageDestinationTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return convertMessageDestinationUsageTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return convertMethodIntfTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.METHOD_NAME_TYPE_BASE:
				return convertMethodNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return convertMultiplicityTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.PATH_TYPE_BASE:
				return convertPathTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT:
				return convertPersistenceContextTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return convertPersistenceTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.REMOTE_TYPE_BASE:
				return convertRemoteTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.RES_AUTH_TYPE_BASE_OBJECT:
				return convertResAuthTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return convertResSharingScopeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return convertResultTypeMappingTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.ROLE_NAME_TYPE_BASE:
				return convertRoleNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return convertServiceRefProtocolBindingListTypeToString(eDataType, instanceValue);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return convertServiceRefProtocolBindingTypeToString(eDataType, instanceValue);
			case EjbJar30Package.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return convertServiceRefProtocolURIAliasTypeToString(eDataType, instanceValue);
			case EjbJar30Package.SERVICE_REF_QNAME_PATTERN:
				return convertServiceRefQnamePatternToString(eDataType, instanceValue);
			case EjbJar30Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return convertSessionTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return convertTransactionTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return convertTransAttributeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar30Package.TRUE_FALSE_TYPE_BASE:
				return convertTrueFalseTypeBaseToString(eDataType, instanceValue);
			case EjbJar30Package.TRUE_FALSE_TYPE_BASE_OBJECT:
				return convertTrueFalseTypeBaseObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationConfigPropertyType createActivationConfigPropertyType() {
		ActivationConfigPropertyTypeImpl activationConfigPropertyType = new ActivationConfigPropertyTypeImpl();
		return activationConfigPropertyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationConfigType createActivationConfigType() {
		ActivationConfigTypeImpl activationConfigType = new ActivationConfigTypeImpl();
		return activationConfigType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationExceptionType createApplicationExceptionType() {
		ApplicationExceptionTypeImpl applicationExceptionType = new ApplicationExceptionTypeImpl();
		return applicationExceptionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AroundInvokeType createAroundInvokeType() {
		AroundInvokeTypeImpl aroundInvokeType = new AroundInvokeTypeImpl();
		return aroundInvokeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyDescriptorType createAssemblyDescriptorType() {
		AssemblyDescriptorTypeImpl assemblyDescriptorType = new AssemblyDescriptorTypeImpl();
		return assemblyDescriptorType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmpFieldType createCmpFieldType() {
		CmpFieldTypeImpl cmpFieldType = new CmpFieldTypeImpl();
		return cmpFieldType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionType createCmpVersionType() {
		CmpVersionTypeImpl cmpVersionType = new CmpVersionTypeImpl();
		return cmpVersionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldType createCmrFieldType() {
		CmrFieldTypeImpl cmrFieldType = new CmrFieldTypeImpl();
		return cmrFieldType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeType createCmrFieldTypeType() {
		CmrFieldTypeTypeImpl cmrFieldTypeType = new CmrFieldTypeTypeImpl();
		return cmrFieldTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTransactionType createContainerTransactionType() {
		ContainerTransactionTypeImpl containerTransactionType = new ContainerTransactionTypeImpl();
		return containerTransactionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameType createDisplayNameType() {
		DisplayNameTypeImpl displayNameType = new DisplayNameTypeImpl();
		return displayNameType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClassType createEjbClassType() {
		EjbClassTypeImpl ejbClassType = new EjbClassTypeImpl();
		return ejbClassType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJarType createEjbJarType() {
		EjbJarTypeImpl ejbJarType = new EjbJarTypeImpl();
		return ejbJarType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLinkType createEjbLinkType() {
		EjbLinkTypeImpl ejbLinkType = new EjbLinkTypeImpl();
		return ejbLinkType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLocalRefType createEjbLocalRefType() {
		EjbLocalRefTypeImpl ejbLocalRefType = new EjbLocalRefTypeImpl();
		return ejbLocalRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbNameType createEjbNameType() {
		EjbNameTypeImpl ejbNameType = new EjbNameTypeImpl();
		return ejbNameType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefNameType createEjbRefNameType() {
		EjbRefNameTypeImpl ejbRefNameType = new EjbRefNameTypeImpl();
		return ejbRefNameType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefType createEjbRefType() {
		EjbRefTypeImpl ejbRefType = new EjbRefTypeImpl();
		return ejbRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeType createEjbRefTypeType() {
		EjbRefTypeTypeImpl ejbRefTypeType = new EjbRefTypeTypeImpl();
		return ejbRefTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationshipRoleType createEjbRelationshipRoleType() {
		EjbRelationshipRoleTypeImpl ejbRelationshipRoleType = new EjbRelationshipRoleTypeImpl();
		return ejbRelationshipRoleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationType createEjbRelationType() {
		EjbRelationTypeImpl ejbRelationType = new EjbRelationTypeImpl();
		return ejbRelationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyType createEmptyType() {
		EmptyTypeImpl emptyType = new EmptyTypeImpl();
		return emptyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseBeansType createEnterpriseBeansType() {
		EnterpriseBeansTypeImpl enterpriseBeansType = new EnterpriseBeansTypeImpl();
		return enterpriseBeansType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EntityBeanType createEntityBeanType() {
		EntityBeanTypeImpl entityBeanType = new EntityBeanTypeImpl();
		return entityBeanType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryType createEnvEntryType() {
		EnvEntryTypeImpl envEntryType = new EnvEntryTypeImpl();
		return envEntryType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeValuesType createEnvEntryTypeValuesType() {
		EnvEntryTypeValuesTypeImpl envEntryTypeValuesType = new EnvEntryTypeValuesTypeImpl();
		return envEntryTypeValuesType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeListType createExcludeListType() {
		ExcludeListTypeImpl excludeListType = new ExcludeListTypeImpl();
		return excludeListType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType createFullyQualifiedClassType() {
		FullyQualifiedClassTypeImpl fullyQualifiedClassType = new FullyQualifiedClassTypeImpl();
		return fullyQualifiedClassType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenericBooleanType createGenericBooleanType() {
		GenericBooleanTypeImpl genericBooleanType = new GenericBooleanTypeImpl();
		return genericBooleanType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType createHomeType() {
		HomeTypeImpl homeType = new HomeTypeImpl();
		return homeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IconType createIconType() {
		IconTypeImpl iconType = new IconTypeImpl();
		return iconType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InitMethodType createInitMethodType() {
		InitMethodTypeImpl initMethodType = new InitMethodTypeImpl();
		return initMethodType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InjectionTargetType createInjectionTargetType() {
		InjectionTargetTypeImpl injectionTargetType = new InjectionTargetTypeImpl();
		return injectionTargetType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorBindingType createInterceptorBindingType() {
		InterceptorBindingTypeImpl interceptorBindingType = new InterceptorBindingTypeImpl();
		return interceptorBindingType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorOrderType createInterceptorOrderType() {
		InterceptorOrderTypeImpl interceptorOrderType = new InterceptorOrderTypeImpl();
		return interceptorOrderType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorsType createInterceptorsType() {
		InterceptorsTypeImpl interceptorsType = new InterceptorsTypeImpl();
		return interceptorsType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorType createInterceptorType() {
		InterceptorTypeImpl interceptorType = new InterceptorTypeImpl();
		return interceptorType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JavaIdentifierType createJavaIdentifierType() {
		JavaIdentifierTypeImpl javaIdentifierType = new JavaIdentifierTypeImpl();
		return javaIdentifierType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JavaTypeType createJavaTypeType() {
		JavaTypeTypeImpl javaTypeType = new JavaTypeTypeImpl();
		return javaTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType createJndiNameType() {
		JndiNameTypeImpl jndiNameType = new JndiNameTypeImpl();
		return jndiNameType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleCallbackType createLifecycleCallbackType() {
		LifecycleCallbackTypeImpl lifecycleCallbackType = new LifecycleCallbackTypeImpl();
		return lifecycleCallbackType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ListenerType createListenerType() {
		ListenerTypeImpl listenerType = new ListenerTypeImpl();
		return listenerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHomeType createLocalHomeType() {
		LocalHomeTypeImpl localHomeType = new LocalHomeTypeImpl();
		return localHomeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType createLocalType() {
		LocalTypeImpl localType = new LocalTypeImpl();
		return localType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationLinkType createMessageDestinationLinkType() {
		MessageDestinationLinkTypeImpl messageDestinationLinkType = new MessageDestinationLinkTypeImpl();
		return messageDestinationLinkType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationRefType createMessageDestinationRefType() {
		MessageDestinationRefTypeImpl messageDestinationRefType = new MessageDestinationRefTypeImpl();
		return messageDestinationRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationType createMessageDestinationType() {
		MessageDestinationTypeImpl messageDestinationType = new MessageDestinationTypeImpl();
		return messageDestinationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationTypeType createMessageDestinationTypeType() {
		MessageDestinationTypeTypeImpl messageDestinationTypeType = new MessageDestinationTypeTypeImpl();
		return messageDestinationTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageType createMessageDestinationUsageType() {
		MessageDestinationUsageTypeImpl messageDestinationUsageType = new MessageDestinationUsageTypeImpl();
		return messageDestinationUsageType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDrivenBeanType createMessageDrivenBeanType() {
		MessageDrivenBeanTypeImpl messageDrivenBeanType = new MessageDrivenBeanTypeImpl();
		return messageDrivenBeanType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfType createMethodIntfType() {
		MethodIntfTypeImpl methodIntfType = new MethodIntfTypeImpl();
		return methodIntfType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNameType createMethodNameType() {
		MethodNameTypeImpl methodNameType = new MethodNameTypeImpl();
		return methodNameType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParamsType createMethodParamsType() {
		MethodParamsTypeImpl methodParamsType = new MethodParamsTypeImpl();
		return methodParamsType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPermissionType createMethodPermissionType() {
		MethodPermissionTypeImpl methodPermissionType = new MethodPermissionTypeImpl();
		return methodPermissionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType createMethodType() {
		MethodTypeImpl methodType = new MethodTypeImpl();
		return methodType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityType createMultiplicityType() {
		MultiplicityTypeImpl multiplicityType = new MultiplicityTypeImpl();
		return multiplicityType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType createNamedMethodType() {
		NamedMethodTypeImpl namedMethodType = new NamedMethodTypeImpl();
		return namedMethodType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValueType createParamValueType() {
		ParamValueTypeImpl paramValueType = new ParamValueTypeImpl();
		return paramValueType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PathType createPathType() {
		PathTypeImpl pathType = new PathTypeImpl();
		return pathType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextRefType createPersistenceContextRefType() {
		PersistenceContextRefTypeImpl persistenceContextRefType = new PersistenceContextRefTypeImpl();
		return persistenceContextRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextTypeType createPersistenceContextTypeType() {
		PersistenceContextTypeTypeImpl persistenceContextTypeType = new PersistenceContextTypeTypeImpl();
		return persistenceContextTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType createPersistenceTypeType() {
		PersistenceTypeTypeImpl persistenceTypeType = new PersistenceTypeTypeImpl();
		return persistenceTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitRefType createPersistenceUnitRefType() {
		PersistenceUnitRefTypeImpl persistenceUnitRefType = new PersistenceUnitRefTypeImpl();
		return persistenceUnitRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PortComponentRefType createPortComponentRefType() {
		PortComponentRefTypeImpl portComponentRefType = new PortComponentRefTypeImpl();
		return portComponentRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QueryMethodType createQueryMethodType() {
		QueryMethodTypeImpl queryMethodType = new QueryMethodTypeImpl();
		return queryMethodType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType createQueryType() {
		QueryTypeImpl queryType = new QueryTypeImpl();
		return queryType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipRoleSourceType createRelationshipRoleSourceType() {
		RelationshipRoleSourceTypeImpl relationshipRoleSourceType = new RelationshipRoleSourceTypeImpl();
		return relationshipRoleSourceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsType createRelationshipsType() {
		RelationshipsTypeImpl relationshipsType = new RelationshipsTypeImpl();
		return relationshipsType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType createRemoteType() {
		RemoteTypeImpl remoteType = new RemoteTypeImpl();
		return remoteType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveMethodType createRemoveMethodType() {
		RemoveMethodTypeImpl removeMethodType = new RemoveMethodTypeImpl();
		return removeMethodType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType createResAuthType() {
		ResAuthTypeImpl resAuthType = new ResAuthTypeImpl();
		return resAuthType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefType createResourceEnvRefType() {
		ResourceEnvRefTypeImpl resourceEnvRefType = new ResourceEnvRefTypeImpl();
		return resourceEnvRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRefType createResourceRefType() {
		ResourceRefTypeImpl resourceRefType = new ResourceRefTypeImpl();
		return resourceRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeType createResSharingScopeType() {
		ResSharingScopeTypeImpl resSharingScopeType = new ResSharingScopeTypeImpl();
		return resSharingScopeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeMappingType createResultTypeMappingType() {
		ResultTypeMappingTypeImpl resultTypeMappingType = new ResultTypeMappingTypeImpl();
		return resultTypeMappingType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameType createRoleNameType() {
		RoleNameTypeImpl roleNameType = new RoleNameTypeImpl();
		return roleNameType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RunAsType createRunAsType() {
		RunAsTypeImpl runAsType = new RunAsTypeImpl();
		return runAsType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityIdentityType createSecurityIdentityType() {
		SecurityIdentityTypeImpl securityIdentityType = new SecurityIdentityTypeImpl();
		return securityIdentityType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleRefType createSecurityRoleRefType() {
		SecurityRoleRefTypeImpl securityRoleRefType = new SecurityRoleRefTypeImpl();
		return securityRoleRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleType createSecurityRoleType() {
		SecurityRoleTypeImpl securityRoleType = new SecurityRoleTypeImpl();
		return securityRoleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandlerChainsType createServiceRefHandlerChainsType() {
		ServiceRefHandlerChainsTypeImpl serviceRefHandlerChainsType = new ServiceRefHandlerChainsTypeImpl();
		return serviceRefHandlerChainsType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandlerChainType createServiceRefHandlerChainType() {
		ServiceRefHandlerChainTypeImpl serviceRefHandlerChainType = new ServiceRefHandlerChainTypeImpl();
		return serviceRefHandlerChainType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandlerType createServiceRefHandlerType() {
		ServiceRefHandlerTypeImpl serviceRefHandlerType = new ServiceRefHandlerTypeImpl();
		return serviceRefHandlerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefType createServiceRefType() {
		ServiceRefTypeImpl serviceRefType = new ServiceRefTypeImpl();
		return serviceRefType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SessionBeanType createSessionBeanType() {
		SessionBeanTypeImpl sessionBeanType = new SessionBeanTypeImpl();
		return sessionBeanType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeType createSessionTypeType() {
		SessionTypeTypeImpl sessionTypeType = new SessionTypeTypeImpl();
		return sessionTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar30.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType createTransactionTypeType() {
		TransactionTypeTypeImpl transactionTypeType = new TransactionTypeTypeImpl();
		return transactionTypeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeType createTransAttributeType() {
		TransAttributeTypeImpl transAttributeType = new TransAttributeTypeImpl();
		return transAttributeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType createTrueFalseType() {
		TrueFalseTypeImpl trueFalseType = new TrueFalseTypeImpl();
		return trueFalseType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UrlPatternType createUrlPatternType() {
		UrlPatternTypeImpl urlPatternType = new UrlPatternTypeImpl();
		return urlPatternType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdAnyURIType createXsdAnyURIType() {
		XsdAnyURITypeImpl xsdAnyURIType = new XsdAnyURITypeImpl();
		return xsdAnyURIType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdBooleanType createXsdBooleanType() {
		XsdBooleanTypeImpl xsdBooleanType = new XsdBooleanTypeImpl();
		return xsdBooleanType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType createXsdIntegerType() {
		XsdIntegerTypeImpl xsdIntegerType = new XsdIntegerTypeImpl();
		return xsdIntegerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdNMTOKENType createXsdNMTOKENType() {
		XsdNMTOKENTypeImpl xsdNMTOKENType = new XsdNMTOKENTypeImpl();
		return xsdNMTOKENType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdNonNegativeIntegerType createXsdNonNegativeIntegerType() {
		XsdNonNegativeIntegerTypeImpl xsdNonNegativeIntegerType = new XsdNonNegativeIntegerTypeImpl();
		return xsdNonNegativeIntegerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdPositiveIntegerType createXsdPositiveIntegerType() {
		XsdPositiveIntegerTypeImpl xsdPositiveIntegerType = new XsdPositiveIntegerTypeImpl();
		return xsdPositiveIntegerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdQNameType createXsdQNameType() {
		XsdQNameTypeImpl xsdQNameType = new XsdQNameTypeImpl();
		return xsdQNameType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType createXsdStringType() {
		XsdStringTypeImpl xsdStringType = new XsdStringTypeImpl();
		return xsdStringType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionTypeBase createCmpVersionTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		CmpVersionTypeBase result = CmpVersionTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmpVersionTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeTypeBase createCmrFieldTypeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		CmrFieldTypeTypeBase result = CmrFieldTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmrFieldTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeTypeBase createEjbRefTypeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		EjbRefTypeTypeBase result = EjbRefTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeValuesTypeBase createEnvEntryTypeValuesTypeBaseFromString(
			EDataType eDataType, String initialValue) {
		EnvEntryTypeValuesTypeBase result = EnvEntryTypeValuesTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeValuesTypeBaseToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenericBooleanTypeBase createGenericBooleanTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		GenericBooleanTypeBase result = GenericBooleanTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericBooleanTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageTypeBase createMessageDestinationUsageTypeBaseFromString(
			EDataType eDataType, String initialValue) {
		MessageDestinationUsageTypeBase result = MessageDestinationUsageTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeBaseToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfTypeBase createMethodIntfTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		MethodIntfTypeBase result = MethodIntfTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodIntfTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityTypeBase createMultiplicityTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		MultiplicityTypeBase result = MultiplicityTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextTypeTypeBase createPersistenceContextTypeTypeBaseFromString(
			EDataType eDataType, String initialValue) {
		PersistenceContextTypeTypeBase result = PersistenceContextTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceContextTypeTypeBaseToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeTypeBase createPersistenceTypeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		PersistenceTypeTypeBase result = PersistenceTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthTypeBase createResAuthTypeBaseFromString(EDataType eDataType, String initialValue) {
		ResAuthTypeBase result = ResAuthTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeTypeBase createResSharingScopeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		ResSharingScopeTypeBase result = ResSharingScopeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeMappingTypeBase createResultTypeMappingTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		ResultTypeMappingTypeBase result = ResultTypeMappingTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeMappingTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeTypeBase createSessionTypeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		SessionTypeTypeBase result = SessionTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSessionTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeTypeBase createTransactionTypeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		TransactionTypeTypeBase result = TransactionTypeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeTypeBase createTransAttributeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		TransAttributeTypeBase result = TransAttributeTypeBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransAttributeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionTypeBase createCmpVersionTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createCmpVersionTypeBaseFromString(EjbJar30Package.eINSTANCE.getCmpVersionTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmpVersionTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCmpVersionTypeBaseToString(EjbJar30Package.eINSTANCE.getCmpVersionTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeTypeBase createCmrFieldTypeTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createCmrFieldTypeTypeBaseFromString(EjbJar30Package.eINSTANCE.getCmrFieldTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmrFieldTypeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertCmrFieldTypeTypeBaseToString(EjbJar30Package.eINSTANCE.getCmrFieldTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createDeweyVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeweyVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createEjbClassTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbClassTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createEjbLinkTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbLinkTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createEjbNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createEjbRefNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeTypeBase createEjbRefTypeTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createEjbRefTypeTypeBaseFromString(EjbJar30Package.eINSTANCE.getEjbRefTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEjbRefTypeTypeBaseToString(EjbJar30Package.eINSTANCE.getEjbRefTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeValuesTypeBase createEnvEntryTypeValuesTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createEnvEntryTypeValuesTypeBaseFromString(EjbJar30Package.eINSTANCE.getEnvEntryTypeValuesTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeValuesTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertEnvEntryTypeValuesTypeBaseToString(EjbJar30Package.eINSTANCE.getEnvEntryTypeValuesTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createFullyQualifiedClassTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFullyQualifiedClassTypeBaseToString(EDataType eDataType,
			Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenericBooleanTypeBase createGenericBooleanTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createGenericBooleanTypeBaseFromString(EjbJar30Package.eINSTANCE.getGenericBooleanTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericBooleanTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertGenericBooleanTypeBaseToString(EjbJar30Package.eINSTANCE.getGenericBooleanTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createHomeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHomeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaIdentifierTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIdentifierTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaTypeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaTypeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createJndiNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJndiNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalHomeTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalHomeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createMessageDestinationLinkTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationLinkTypeBaseToString(EDataType eDataType,
			Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createMessageDestinationTypeTypeBaseFromString(EDataType eDataType,
			String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationTypeTypeBaseToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageTypeBase createMessageDestinationUsageTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createMessageDestinationUsageTypeBaseFromString(EjbJar30Package.eINSTANCE.getMessageDestinationUsageTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertMessageDestinationUsageTypeBaseToString(EjbJar30Package.eINSTANCE.getMessageDestinationUsageTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfTypeBase createMethodIntfTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createMethodIntfTypeBaseFromString(EjbJar30Package.eINSTANCE.getMethodIntfTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodIntfTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMethodIntfTypeBaseToString(EjbJar30Package.eINSTANCE.getMethodIntfTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createMethodNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityTypeBase createMultiplicityTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createMultiplicityTypeBaseFromString(EjbJar30Package.eINSTANCE.getMultiplicityTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertMultiplicityTypeBaseToString(EjbJar30Package.eINSTANCE.getMultiplicityTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextTypeTypeBase createPersistenceContextTypeTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createPersistenceContextTypeTypeBaseFromString(EjbJar30Package.eINSTANCE.getPersistenceContextTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceContextTypeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertPersistenceContextTypeTypeBaseToString(EjbJar30Package.eINSTANCE.getPersistenceContextTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeTypeBase createPersistenceTypeTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createPersistenceTypeTypeBaseFromString(EjbJar30Package.eINSTANCE.getPersistenceTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertPersistenceTypeTypeBaseToString(EjbJar30Package.eINSTANCE.getPersistenceTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createRemoteTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthTypeBase createResAuthTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createResAuthTypeBaseFromString(EjbJar30Package.eINSTANCE.getResAuthTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResAuthTypeBaseToString(EjbJar30Package.eINSTANCE.getResAuthTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeTypeBase createResSharingScopeTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createResSharingScopeTypeBaseFromString(EjbJar30Package.eINSTANCE.getResSharingScopeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertResSharingScopeTypeBaseToString(EjbJar30Package.eINSTANCE.getResSharingScopeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeMappingTypeBase createResultTypeMappingTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createResultTypeMappingTypeBaseFromString(EjbJar30Package.eINSTANCE.getResultTypeMappingTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeMappingTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertResultTypeMappingTypeBaseToString(EjbJar30Package.eINSTANCE.getResultTypeMappingTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoleNameTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleNameTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createServiceRefProtocolBindingListTypeFromString(EDataType eDataType,
			String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createServiceRefProtocolBindingTypeFromString(EjbJar30Package.eINSTANCE.getServiceRefProtocolBindingType(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolBindingListTypeToString(EDataType eDataType,
			Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertServiceRefProtocolBindingTypeToString(EjbJar30Package.eINSTANCE.getServiceRefProtocolBindingType(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefProtocolBindingTypeFromString(EDataType eDataType,
			String initialValue) {
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
			result = createServiceRefProtocolURIAliasTypeFromString(EjbJar30Package.eINSTANCE.getServiceRefProtocolURIAliasType(), initialValue);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolBindingTypeToString(EDataType eDataType,
			Object instanceValue) {
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
		if (EjbJar30Package.eINSTANCE.getServiceRefProtocolURIAliasType().isInstance(instanceValue)) {
			try {
				String value = convertServiceRefProtocolURIAliasTypeToString(EjbJar30Package.eINSTANCE.getServiceRefProtocolURIAliasType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefProtocolURIAliasTypeFromString(EDataType eDataType,
			String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolURIAliasTypeToString(EDataType eDataType,
			Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefQnamePatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefQnamePatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeTypeBase createSessionTypeTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createSessionTypeTypeBaseFromString(EjbJar30Package.eINSTANCE.getSessionTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSessionTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSessionTypeTypeBaseToString(EjbJar30Package.eINSTANCE.getSessionTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeTypeBase createTransactionTypeTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createTransactionTypeTypeBaseFromString(EjbJar30Package.eINSTANCE.getTransactionTypeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertTransactionTypeTypeBaseToString(EjbJar30Package.eINSTANCE.getTransactionTypeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeTypeBase createTransAttributeTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createTransAttributeTypeBaseFromString(EjbJar30Package.eINSTANCE.getTransAttributeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransAttributeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertTransAttributeTypeBaseToString(EjbJar30Package.eINSTANCE.getTransAttributeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTrueFalseTypeBaseFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeBaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTrueFalseTypeBaseObjectFromString(EDataType eDataType, String initialValue) {
		return createTrueFalseTypeBaseFromString(EjbJar30Package.eINSTANCE.getTrueFalseTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrueFalseTypeBaseToString(EjbJar30Package.eINSTANCE.getTrueFalseTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar30Package getEjbJar30Package() {
		return (EjbJar30Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjbJar30Package getPackage() {
		return EjbJar30Package.eINSTANCE;
	}

} // EjbJar30FactoryImpl
