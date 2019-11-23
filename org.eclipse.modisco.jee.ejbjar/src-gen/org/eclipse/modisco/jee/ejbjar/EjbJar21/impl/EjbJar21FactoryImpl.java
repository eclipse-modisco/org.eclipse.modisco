/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar21.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Factory;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EmptyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.JavaIdentifierType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.JavaTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.JndiNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.PathType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.UrlPatternType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdAnyURIType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNMTOKENType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdQNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class EjbJar21FactoryImpl extends EFactoryImpl implements EjbJar21Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static EjbJar21Factory init() {
		try {
			EjbJar21Factory theEjbJar21Factory = (EjbJar21Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Javaee/ejb-jar_2_1.xsd"); //$NON-NLS-1$ 
			if (theEjbJar21Factory != null) {
				return theEjbJar21Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjbJar21FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public EjbJar21FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE: return createActivationConfigPropertyType();
			case EjbJar21Package.ACTIVATION_CONFIG_TYPE: return createActivationConfigType();
			case EjbJar21Package.ASSEMBLY_DESCRIPTOR_TYPE: return createAssemblyDescriptorType();
			case EjbJar21Package.CMP_FIELD_TYPE: return createCmpFieldType();
			case EjbJar21Package.CMP_VERSION_TYPE: return createCmpVersionType();
			case EjbJar21Package.CMR_FIELD_TYPE: return createCmrFieldType();
			case EjbJar21Package.CMR_FIELD_TYPE_TYPE: return createCmrFieldTypeType();
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE: return createContainerTransactionType();
			case EjbJar21Package.DESCRIPTION_TYPE: return createDescriptionType();
			case EjbJar21Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case EjbJar21Package.DOCUMENT_ROOT: return createDocumentRoot();
			case EjbJar21Package.EJB_CLASS_TYPE: return createEjbClassType();
			case EjbJar21Package.EJB_JAR_TYPE: return createEjbJarType();
			case EjbJar21Package.EJB_LINK_TYPE: return createEjbLinkType();
			case EjbJar21Package.EJB_LOCAL_REF_TYPE: return createEjbLocalRefType();
			case EjbJar21Package.EJB_NAME_TYPE: return createEjbNameType();
			case EjbJar21Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case EjbJar21Package.EJB_REF_TYPE: return createEjbRefType();
			case EjbJar21Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case EjbJar21Package.EJB_RELATIONSHIP_ROLE_TYPE: return createEjbRelationshipRoleType();
			case EjbJar21Package.EJB_RELATION_TYPE: return createEjbRelationType();
			case EjbJar21Package.EMPTY_TYPE: return createEmptyType();
			case EjbJar21Package.ENTERPRISE_BEANS_TYPE: return createEnterpriseBeansType();
			case EjbJar21Package.ENTITY_BEAN_TYPE: return createEntityBeanType();
			case EjbJar21Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case EjbJar21Package.ENV_ENTRY_TYPE_VALUES_TYPE: return createEnvEntryTypeValuesType();
			case EjbJar21Package.EXCLUDE_LIST_TYPE: return createExcludeListType();
			case EjbJar21Package.FULLY_QUALIFIED_CLASS_TYPE: return createFullyQualifiedClassType();
			case EjbJar21Package.GENERIC_BOOLEAN_TYPE: return createGenericBooleanType();
			case EjbJar21Package.HOME_TYPE: return createHomeType();
			case EjbJar21Package.ICON_TYPE: return createIconType();
			case EjbJar21Package.JAVA_IDENTIFIER_TYPE: return createJavaIdentifierType();
			case EjbJar21Package.JAVA_TYPE_TYPE: return createJavaTypeType();
			case EjbJar21Package.JNDI_NAME_TYPE: return createJndiNameType();
			case EjbJar21Package.LISTENER_TYPE: return createListenerType();
			case EjbJar21Package.LOCAL_HOME_TYPE: return createLocalHomeType();
			case EjbJar21Package.LOCAL_TYPE: return createLocalType();
			case EjbJar21Package.MESSAGE_DESTINATION_LINK_TYPE: return createMessageDestinationLinkType();
			case EjbJar21Package.MESSAGE_DESTINATION_REF_TYPE: return createMessageDestinationRefType();
			case EjbJar21Package.MESSAGE_DESTINATION_TYPE: return createMessageDestinationType();
			case EjbJar21Package.MESSAGE_DESTINATION_TYPE_TYPE: return createMessageDestinationTypeType();
			case EjbJar21Package.MESSAGE_DESTINATION_USAGE_TYPE: return createMessageDestinationUsageType();
			case EjbJar21Package.MESSAGE_DRIVEN_BEAN_TYPE: return createMessageDrivenBeanType();
			case EjbJar21Package.METHOD_INTF_TYPE: return createMethodIntfType();
			case EjbJar21Package.METHOD_NAME_TYPE: return createMethodNameType();
			case EjbJar21Package.METHOD_PARAMS_TYPE: return createMethodParamsType();
			case EjbJar21Package.METHOD_PERMISSION_TYPE: return createMethodPermissionType();
			case EjbJar21Package.METHOD_TYPE: return createMethodType();
			case EjbJar21Package.MULTIPLICITY_TYPE: return createMultiplicityType();
			case EjbJar21Package.PARAM_VALUE_TYPE: return createParamValueType();
			case EjbJar21Package.PATH_TYPE: return createPathType();
			case EjbJar21Package.PERSISTENCE_TYPE_TYPE: return createPersistenceTypeType();
			case EjbJar21Package.PORT_COMPONENT_REF_TYPE: return createPortComponentRefType();
			case EjbJar21Package.QUERY_METHOD_TYPE: return createQueryMethodType();
			case EjbJar21Package.QUERY_TYPE: return createQueryType();
			case EjbJar21Package.RELATIONSHIP_ROLE_SOURCE_TYPE: return createRelationshipRoleSourceType();
			case EjbJar21Package.RELATIONSHIPS_TYPE: return createRelationshipsType();
			case EjbJar21Package.REMOTE_TYPE: return createRemoteType();
			case EjbJar21Package.RES_AUTH_TYPE: return createResAuthType();
			case EjbJar21Package.RESOURCE_ENV_REF_TYPE: return createResourceEnvRefType();
			case EjbJar21Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case EjbJar21Package.RES_SHARING_SCOPE_TYPE: return createResSharingScopeType();
			case EjbJar21Package.RESULT_TYPE_MAPPING_TYPE: return createResultTypeMappingType();
			case EjbJar21Package.ROLE_NAME_TYPE: return createRoleNameType();
			case EjbJar21Package.RUN_AS_TYPE: return createRunAsType();
			case EjbJar21Package.SECURITY_IDENTITY_TYPE: return createSecurityIdentityType();
			case EjbJar21Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case EjbJar21Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case EjbJar21Package.SERVICE_REF_HANDLER_TYPE: return createServiceRefHandlerType();
			case EjbJar21Package.SERVICE_REF_TYPE: return createServiceRefType();
			case EjbJar21Package.SESSION_BEAN_TYPE: return createSessionBeanType();
			case EjbJar21Package.SESSION_TYPE_TYPE: return createSessionTypeType();
			case EjbJar21Package.STRING: return createString();
			case EjbJar21Package.TRANSACTION_TYPE_TYPE: return createTransactionTypeType();
			case EjbJar21Package.TRANS_ATTRIBUTE_TYPE: return createTransAttributeType();
			case EjbJar21Package.TRUE_FALSE_TYPE: return createTrueFalseType();
			case EjbJar21Package.URL_PATTERN_TYPE: return createUrlPatternType();
			case EjbJar21Package.XSD_ANY_URI_TYPE: return createXsdAnyURIType();
			case EjbJar21Package.XSD_BOOLEAN_TYPE: return createXsdBooleanType();
			case EjbJar21Package.XSD_INTEGER_TYPE: return createXsdIntegerType();
			case EjbJar21Package.XSD_NMTOKEN_TYPE: return createXsdNMTOKENType();
			case EjbJar21Package.XSD_NON_NEGATIVE_INTEGER_TYPE: return createXsdNonNegativeIntegerType();
			case EjbJar21Package.XSD_POSITIVE_INTEGER_TYPE: return createXsdPositiveIntegerType();
			case EjbJar21Package.XSD_QNAME_TYPE: return createXsdQNameType();
			case EjbJar21Package.XSD_STRING_TYPE: return createXsdStringType();
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
			case EjbJar21Package.CMP_VERSION_TYPE_BASE:
				return createCmpVersionTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.CMR_FIELD_TYPE_TYPE_BASE:
				return createCmrFieldTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.EJB_REF_TYPE_TYPE_BASE:
				return createEjbRefTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return createEnvEntryTypeValuesTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.GENERIC_BOOLEAN_TYPE_BASE:
				return createGenericBooleanTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return createMessageDestinationUsageTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.METHOD_INTF_TYPE_BASE:
				return createMethodIntfTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.MULTIPLICITY_TYPE_BASE:
				return createMultiplicityTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.PERSISTENCE_TYPE_TYPE_BASE:
				return createPersistenceTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.RES_AUTH_TYPE_BASE:
				return createResAuthTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.RES_SHARING_SCOPE_TYPE_BASE:
				return createResSharingScopeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return createResultTypeMappingTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.SESSION_TYPE_TYPE_BASE:
				return createSessionTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.TRANSACTION_TYPE_TYPE_BASE:
				return createTransactionTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return createTransAttributeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return createCmpVersionTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return createCmrFieldTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.DEWEY_VERSION_TYPE:
				return createDeweyVersionTypeFromString(eDataType, initialValue);
			case EjbJar21Package.EJB_CLASS_TYPE_BASE:
				return createEjbClassTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.EJB_LINK_TYPE_BASE:
				return createEjbLinkTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.EJB_NAME_TYPE_BASE:
				return createEjbNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.EJB_REF_NAME_TYPE_BASE:
				return createEjbRefNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return createEjbRefTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return createEnvEntryTypeValuesTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return createFullyQualifiedClassTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return createGenericBooleanTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.HOME_TYPE_BASE:
				return createHomeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.JAVA_IDENTIFIER_TYPE_BASE:
				return createJavaIdentifierTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.JAVA_TYPE_TYPE_BASE:
				return createJavaTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.JNDI_NAME_TYPE_BASE:
				return createJndiNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.LOCAL_HOME_TYPE_BASE:
				return createLocalHomeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.LOCAL_TYPE_BASE:
				return createLocalTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return createMessageDestinationLinkTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return createMessageDestinationTypeTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return createMessageDestinationUsageTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return createMethodIntfTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.METHOD_NAME_TYPE_BASE:
				return createMethodNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return createMultiplicityTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.PATH_TYPE_BASE:
				return createPathTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return createPersistenceTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.REMOTE_TYPE_BASE:
				return createRemoteTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.RES_AUTH_TYPE_BASE_OBJECT:
				return createResAuthTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return createResSharingScopeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return createResultTypeMappingTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.ROLE_NAME_TYPE_BASE:
				return createRoleNameTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return createSessionTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return createTransactionTypeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return createTransAttributeTypeBaseObjectFromString(eDataType, initialValue);
			case EjbJar21Package.TRUE_FALSE_TYPE_BASE:
				return createTrueFalseTypeBaseFromString(eDataType, initialValue);
			case EjbJar21Package.TRUE_FALSE_TYPE_BASE_OBJECT:
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
			case EjbJar21Package.CMP_VERSION_TYPE_BASE:
				return convertCmpVersionTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.CMR_FIELD_TYPE_TYPE_BASE:
				return convertCmrFieldTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.EJB_REF_TYPE_TYPE_BASE:
				return convertEjbRefTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE:
				return convertEnvEntryTypeValuesTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.GENERIC_BOOLEAN_TYPE_BASE:
				return convertGenericBooleanTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE:
				return convertMessageDestinationUsageTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.METHOD_INTF_TYPE_BASE:
				return convertMethodIntfTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.MULTIPLICITY_TYPE_BASE:
				return convertMultiplicityTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.PERSISTENCE_TYPE_TYPE_BASE:
				return convertPersistenceTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.RES_AUTH_TYPE_BASE:
				return convertResAuthTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.RES_SHARING_SCOPE_TYPE_BASE:
				return convertResSharingScopeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.RESULT_TYPE_MAPPING_TYPE_BASE:
				return convertResultTypeMappingTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.SESSION_TYPE_TYPE_BASE:
				return convertSessionTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.TRANSACTION_TYPE_TYPE_BASE:
				return convertTransactionTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.TRANS_ATTRIBUTE_TYPE_BASE:
				return convertTransAttributeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.CMP_VERSION_TYPE_BASE_OBJECT:
				return convertCmpVersionTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.CMR_FIELD_TYPE_TYPE_BASE_OBJECT:
				return convertCmrFieldTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.DEWEY_VERSION_TYPE:
				return convertDeweyVersionTypeToString(eDataType, instanceValue);
			case EjbJar21Package.EJB_CLASS_TYPE_BASE:
				return convertEjbClassTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.EJB_LINK_TYPE_BASE:
				return convertEjbLinkTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.EJB_NAME_TYPE_BASE:
				return convertEjbNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.EJB_REF_NAME_TYPE_BASE:
				return convertEjbRefNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.EJB_REF_TYPE_TYPE_BASE_OBJECT:
				return convertEjbRefTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT:
				return convertEnvEntryTypeValuesTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.FULLY_QUALIFIED_CLASS_TYPE_BASE:
				return convertFullyQualifiedClassTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.GENERIC_BOOLEAN_TYPE_BASE_OBJECT:
				return convertGenericBooleanTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.HOME_TYPE_BASE:
				return convertHomeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.JAVA_IDENTIFIER_TYPE_BASE:
				return convertJavaIdentifierTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.JAVA_TYPE_TYPE_BASE:
				return convertJavaTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.JNDI_NAME_TYPE_BASE:
				return convertJndiNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.LOCAL_HOME_TYPE_BASE:
				return convertLocalHomeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.LOCAL_TYPE_BASE:
				return convertLocalTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.MESSAGE_DESTINATION_LINK_TYPE_BASE:
				return convertMessageDestinationLinkTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.MESSAGE_DESTINATION_TYPE_TYPE_BASE:
				return convertMessageDestinationTypeTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT:
				return convertMessageDestinationUsageTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.METHOD_INTF_TYPE_BASE_OBJECT:
				return convertMethodIntfTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.METHOD_NAME_TYPE_BASE:
				return convertMethodNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.MULTIPLICITY_TYPE_BASE_OBJECT:
				return convertMultiplicityTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.PATH_TYPE_BASE:
				return convertPathTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.PERSISTENCE_TYPE_TYPE_BASE_OBJECT:
				return convertPersistenceTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.REMOTE_TYPE_BASE:
				return convertRemoteTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.RES_AUTH_TYPE_BASE_OBJECT:
				return convertResAuthTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.RES_SHARING_SCOPE_TYPE_BASE_OBJECT:
				return convertResSharingScopeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT:
				return convertResultTypeMappingTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.ROLE_NAME_TYPE_BASE:
				return convertRoleNameTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.SESSION_TYPE_TYPE_BASE_OBJECT:
				return convertSessionTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.TRANSACTION_TYPE_TYPE_BASE_OBJECT:
				return convertTransactionTypeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.TRANS_ATTRIBUTE_TYPE_BASE_OBJECT:
				return convertTransAttributeTypeBaseObjectToString(eDataType, instanceValue);
			case EjbJar21Package.TRUE_FALSE_TYPE_BASE:
				return convertTrueFalseTypeBaseToString(eDataType, instanceValue);
			case EjbJar21Package.TRUE_FALSE_TYPE_BASE_OBJECT:
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
	public PersistenceTypeType createPersistenceTypeType() {
		PersistenceTypeTypeImpl persistenceTypeType = new PersistenceTypeTypeImpl();
		return persistenceTypeType;
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
	public org.eclipse.modisco.jee.ejbjar.EjbJar21.String createString() {
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
		return createCmpVersionTypeBaseFromString(EjbJar21Package.Literals.CMP_VERSION_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmpVersionTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCmpVersionTypeBaseToString(EjbJar21Package.Literals.CMP_VERSION_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeTypeBase createCmrFieldTypeTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createCmrFieldTypeTypeBaseFromString(EjbJar21Package.Literals.CMR_FIELD_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmrFieldTypeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertCmrFieldTypeTypeBaseToString(EjbJar21Package.Literals.CMR_FIELD_TYPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDeweyVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeweyVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
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
		return createEjbRefTypeTypeBaseFromString(EjbJar21Package.Literals.EJB_REF_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEjbRefTypeTypeBaseToString(EjbJar21Package.Literals.EJB_REF_TYPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeValuesTypeBase createEnvEntryTypeValuesTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createEnvEntryTypeValuesTypeBaseFromString(EjbJar21Package.Literals.ENV_ENTRY_TYPE_VALUES_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeValuesTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertEnvEntryTypeValuesTypeBaseToString(EjbJar21Package.Literals.ENV_ENTRY_TYPE_VALUES_TYPE_BASE, instanceValue);
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
		return createGenericBooleanTypeBaseFromString(EjbJar21Package.Literals.GENERIC_BOOLEAN_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericBooleanTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertGenericBooleanTypeBaseToString(EjbJar21Package.Literals.GENERIC_BOOLEAN_TYPE_BASE, instanceValue);
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
		return createMessageDestinationUsageTypeBaseFromString(EjbJar21Package.Literals.MESSAGE_DESTINATION_USAGE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertMessageDestinationUsageTypeBaseToString(EjbJar21Package.Literals.MESSAGE_DESTINATION_USAGE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfTypeBase createMethodIntfTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createMethodIntfTypeBaseFromString(EjbJar21Package.Literals.METHOD_INTF_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodIntfTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMethodIntfTypeBaseToString(EjbJar21Package.Literals.METHOD_INTF_TYPE_BASE, instanceValue);
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
		return createMultiplicityTypeBaseFromString(EjbJar21Package.Literals.MULTIPLICITY_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertMultiplicityTypeBaseToString(EjbJar21Package.Literals.MULTIPLICITY_TYPE_BASE, instanceValue);
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
	public PersistenceTypeTypeBase createPersistenceTypeTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createPersistenceTypeTypeBaseFromString(EjbJar21Package.Literals.PERSISTENCE_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertPersistenceTypeTypeBaseToString(EjbJar21Package.Literals.PERSISTENCE_TYPE_TYPE_BASE, instanceValue);
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
		return createResAuthTypeBaseFromString(EjbJar21Package.Literals.RES_AUTH_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResAuthTypeBaseToString(EjbJar21Package.Literals.RES_AUTH_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeTypeBase createResSharingScopeTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createResSharingScopeTypeBaseFromString(EjbJar21Package.Literals.RES_SHARING_SCOPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertResSharingScopeTypeBaseToString(EjbJar21Package.Literals.RES_SHARING_SCOPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeMappingTypeBase createResultTypeMappingTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createResultTypeMappingTypeBaseFromString(EjbJar21Package.Literals.RESULT_TYPE_MAPPING_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultTypeMappingTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertResultTypeMappingTypeBaseToString(EjbJar21Package.Literals.RESULT_TYPE_MAPPING_TYPE_BASE, instanceValue);
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
	public SessionTypeTypeBase createSessionTypeTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createSessionTypeTypeBaseFromString(EjbJar21Package.Literals.SESSION_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSessionTypeTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSessionTypeTypeBaseToString(EjbJar21Package.Literals.SESSION_TYPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeTypeBase createTransactionTypeTypeBaseObjectFromString(
			EDataType eDataType, String initialValue) {
		return createTransactionTypeTypeBaseFromString(EjbJar21Package.Literals.TRANSACTION_TYPE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertTransactionTypeTypeBaseToString(EjbJar21Package.Literals.TRANSACTION_TYPE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeTypeBase createTransAttributeTypeBaseObjectFromString(EDataType eDataType,
			String initialValue) {
		return createTransAttributeTypeBaseFromString(EjbJar21Package.Literals.TRANS_ATTRIBUTE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransAttributeTypeBaseObjectToString(EDataType eDataType,
			Object instanceValue) {
		return convertTransAttributeTypeBaseToString(EjbJar21Package.Literals.TRANS_ATTRIBUTE_TYPE_BASE, instanceValue);
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
		return createTrueFalseTypeBaseFromString(EjbJar21Package.Literals.TRUE_FALSE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeBaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrueFalseTypeBaseToString(EjbJar21Package.Literals.TRUE_FALSE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar21Package getEjbJar21Package() {
		return (EjbJar21Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjbJar21Package getPackage() {
		return EjbJar21Package.eINSTANCE;
	}

} // EjbJar21FactoryImpl
