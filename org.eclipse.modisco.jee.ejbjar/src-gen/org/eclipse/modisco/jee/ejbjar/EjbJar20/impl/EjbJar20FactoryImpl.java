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
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbJar20FactoryImpl extends EFactoryImpl implements EjbJar20Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EjbJar20Factory init() {
		try {
			EjbJar20Factory theEjbJar20Factory = (EjbJar20Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Javaee/ejb-jar_2_0.dtd"); //$NON-NLS-1$ 
			if (theEjbJar20Factory != null) {
				return theEjbJar20Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjbJar20FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar20FactoryImpl() {
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
			case EjbJar20Package.ABSTRACT_SCHEMA_NAME_TYPE: return createAbstractSchemaNameType();
			case EjbJar20Package.ACKNOWLEDGE_MODE_TYPE: return createAcknowledgeModeType();
			case EjbJar20Package.ASSEMBLY_DESCRIPTOR_TYPE: return createAssemblyDescriptorType();
			case EjbJar20Package.CASCADE_DELETE_TYPE: return createCascadeDeleteType();
			case EjbJar20Package.CMP_FIELD_TYPE: return createCmpFieldType();
			case EjbJar20Package.CMP_VERSION_TYPE: return createCmpVersionType();
			case EjbJar20Package.CMR_FIELD_NAME_TYPE: return createCmrFieldNameType();
			case EjbJar20Package.CMR_FIELD_TYPE: return createCmrFieldType();
			case EjbJar20Package.CMR_FIELD_TYPE_TYPE: return createCmrFieldTypeType();
			case EjbJar20Package.CONTAINER_TRANSACTION_TYPE: return createContainerTransactionType();
			case EjbJar20Package.DESCRIPTION_TYPE: return createDescriptionType();
			case EjbJar20Package.DESTINATION_TYPE_TYPE: return createDestinationTypeType();
			case EjbJar20Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case EjbJar20Package.DOCUMENT_ROOT: return createDocumentRoot();
			case EjbJar20Package.EJB_CLASS_TYPE: return createEjbClassType();
			case EjbJar20Package.EJB_CLIENT_JAR_TYPE: return createEjbClientJarType();
			case EjbJar20Package.EJB_JAR_TYPE: return createEjbJarType();
			case EjbJar20Package.EJB_LINK_TYPE: return createEjbLinkType();
			case EjbJar20Package.EJB_LOCAL_REF_TYPE: return createEjbLocalRefType();
			case EjbJar20Package.EJB_NAME_TYPE: return createEjbNameType();
			case EjbJar20Package.EJB_QL_TYPE: return createEjbQlType();
			case EjbJar20Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case EjbJar20Package.EJB_REF_TYPE: return createEjbRefType();
			case EjbJar20Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case EjbJar20Package.EJB_RELATION_NAME_TYPE: return createEjbRelationNameType();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_NAME_TYPE: return createEjbRelationshipRoleNameType();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE: return createEjbRelationshipRoleType();
			case EjbJar20Package.EJB_RELATION_TYPE: return createEjbRelationType();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE: return createEnterpriseBeansType();
			case EjbJar20Package.ENTITY_TYPE: return createEntityType();
			case EjbJar20Package.ENV_ENTRY_NAME_TYPE: return createEnvEntryNameType();
			case EjbJar20Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case EjbJar20Package.ENV_ENTRY_TYPE_TYPE: return createEnvEntryTypeType();
			case EjbJar20Package.ENV_ENTRY_VALUE_TYPE: return createEnvEntryValueType();
			case EjbJar20Package.EXCLUDE_LIST_TYPE: return createExcludeListType();
			case EjbJar20Package.FIELD_NAME_TYPE: return createFieldNameType();
			case EjbJar20Package.HOME_TYPE: return createHomeType();
			case EjbJar20Package.LARGE_ICON_TYPE: return createLargeIconType();
			case EjbJar20Package.LOCAL_HOME_TYPE: return createLocalHomeType();
			case EjbJar20Package.LOCAL_TYPE: return createLocalType();
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE: return createMessageDrivenDestinationType();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE: return createMessageDrivenType();
			case EjbJar20Package.MESSAGE_SELECTOR_TYPE: return createMessageSelectorType();
			case EjbJar20Package.METHOD_INTF_TYPE: return createMethodIntfType();
			case EjbJar20Package.METHOD_NAME_TYPE: return createMethodNameType();
			case EjbJar20Package.METHOD_PARAMS_TYPE: return createMethodParamsType();
			case EjbJar20Package.METHOD_PARAM_TYPE: return createMethodParamType();
			case EjbJar20Package.METHOD_PERMISSION_TYPE: return createMethodPermissionType();
			case EjbJar20Package.METHOD_TYPE: return createMethodType();
			case EjbJar20Package.MULTIPLICITY_TYPE: return createMultiplicityType();
			case EjbJar20Package.PERSISTENCE_TYPE_TYPE: return createPersistenceTypeType();
			case EjbJar20Package.PRIM_KEY_CLASS_TYPE: return createPrimKeyClassType();
			case EjbJar20Package.PRIMKEY_FIELD_TYPE: return createPrimkeyFieldType();
			case EjbJar20Package.QUERY_METHOD_TYPE: return createQueryMethodType();
			case EjbJar20Package.QUERY_TYPE: return createQueryType();
			case EjbJar20Package.REENTRANT_TYPE: return createReentrantType();
			case EjbJar20Package.RELATIONSHIP_ROLE_SOURCE_TYPE: return createRelationshipRoleSourceType();
			case EjbJar20Package.RELATIONSHIPS_TYPE: return createRelationshipsType();
			case EjbJar20Package.REMOTE_TYPE: return createRemoteType();
			case EjbJar20Package.RES_AUTH_TYPE: return createResAuthType();
			case EjbJar20Package.RESOURCE_ENV_REF_NAME_TYPE: return createResourceEnvRefNameType();
			case EjbJar20Package.RESOURCE_ENV_REF_TYPE: return createResourceEnvRefType();
			case EjbJar20Package.RESOURCE_ENV_REF_TYPE_TYPE: return createResourceEnvRefTypeType();
			case EjbJar20Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case EjbJar20Package.RES_REF_NAME_TYPE: return createResRefNameType();
			case EjbJar20Package.RES_SHARING_SCOPE_TYPE: return createResSharingScopeType();
			case EjbJar20Package.RES_TYPE_TYPE: return createResTypeType();
			case EjbJar20Package.RESULT_TYPE_MAPPING_TYPE: return createResultTypeMappingType();
			case EjbJar20Package.ROLE_LINK_TYPE: return createRoleLinkType();
			case EjbJar20Package.ROLE_NAME_TYPE: return createRoleNameType();
			case EjbJar20Package.RUN_AS_TYPE: return createRunAsType();
			case EjbJar20Package.SECURITY_IDENTITY_TYPE: return createSecurityIdentityType();
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case EjbJar20Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case EjbJar20Package.SESSION_TYPE: return createSessionType();
			case EjbJar20Package.SESSION_TYPE_TYPE: return createSessionTypeType();
			case EjbJar20Package.SMALL_ICON_TYPE: return createSmallIconType();
			case EjbJar20Package.SUBSCRIPTION_DURABILITY_TYPE: return createSubscriptionDurabilityType();
			case EjbJar20Package.TRANSACTION_TYPE_TYPE: return createTransactionTypeType();
			case EjbJar20Package.TRANS_ATTRIBUTE_TYPE: return createTransAttributeType();
			case EjbJar20Package.UNCHECKED_TYPE: return createUncheckedType();
			case EjbJar20Package.USE_CALLER_IDENTITY_TYPE: return createUseCallerIdentityType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSchemaNameType createAbstractSchemaNameType() {
		AbstractSchemaNameTypeImpl abstractSchemaNameType = new AbstractSchemaNameTypeImpl();
		return abstractSchemaNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcknowledgeModeType createAcknowledgeModeType() {
		AcknowledgeModeTypeImpl acknowledgeModeType = new AcknowledgeModeTypeImpl();
		return acknowledgeModeType;
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
	public CascadeDeleteType createCascadeDeleteType() {
		CascadeDeleteTypeImpl cascadeDeleteType = new CascadeDeleteTypeImpl();
		return cascadeDeleteType;
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
	public CmrFieldNameType createCmrFieldNameType() {
		CmrFieldNameTypeImpl cmrFieldNameType = new CmrFieldNameTypeImpl();
		return cmrFieldNameType;
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
	public ContainerTransactionType createContainerTransactionType() {
		ContainerTransactionTypeImpl containerTransactionType = new ContainerTransactionTypeImpl();
		return containerTransactionType;
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
	public DestinationTypeType createDestinationTypeType() {
		DestinationTypeTypeImpl destinationTypeType = new DestinationTypeTypeImpl();
		return destinationTypeType;
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
	public EjbClientJarType createEjbClientJarType() {
		EjbClientJarTypeImpl ejbClientJarType = new EjbClientJarTypeImpl();
		return ejbClientJarType;
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
	public EjbQlType createEjbQlType() {
		EjbQlTypeImpl ejbQlType = new EjbQlTypeImpl();
		return ejbQlType;
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
	public EjbRelationNameType createEjbRelationNameType() {
		EjbRelationNameTypeImpl ejbRelationNameType = new EjbRelationNameTypeImpl();
		return ejbRelationNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationshipRoleNameType createEjbRelationshipRoleNameType() {
		EjbRelationshipRoleNameTypeImpl ejbRelationshipRoleNameType = new EjbRelationshipRoleNameTypeImpl();
		return ejbRelationshipRoleNameType;
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
	public EnterpriseBeansType createEnterpriseBeansType() {
		EnterpriseBeansTypeImpl enterpriseBeansType = new EnterpriseBeansTypeImpl();
		return enterpriseBeansType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryNameType createEnvEntryNameType() {
		EnvEntryNameTypeImpl envEntryNameType = new EnvEntryNameTypeImpl();
		return envEntryNameType;
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
	public EnvEntryTypeType createEnvEntryTypeType() {
		EnvEntryTypeTypeImpl envEntryTypeType = new EnvEntryTypeTypeImpl();
		return envEntryTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryValueType createEnvEntryValueType() {
		EnvEntryValueTypeImpl envEntryValueType = new EnvEntryValueTypeImpl();
		return envEntryValueType;
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
	public FieldNameType createFieldNameType() {
		FieldNameTypeImpl fieldNameType = new FieldNameTypeImpl();
		return fieldNameType;
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
	public LargeIconType createLargeIconType() {
		LargeIconTypeImpl largeIconType = new LargeIconTypeImpl();
		return largeIconType;
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
	public MessageDrivenDestinationType createMessageDrivenDestinationType() {
		MessageDrivenDestinationTypeImpl messageDrivenDestinationType = new MessageDrivenDestinationTypeImpl();
		return messageDrivenDestinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDrivenType createMessageDrivenType() {
		MessageDrivenTypeImpl messageDrivenType = new MessageDrivenTypeImpl();
		return messageDrivenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSelectorType createMessageSelectorType() {
		MessageSelectorTypeImpl messageSelectorType = new MessageSelectorTypeImpl();
		return messageSelectorType;
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
	public MethodParamType createMethodParamType() {
		MethodParamTypeImpl methodParamType = new MethodParamTypeImpl();
		return methodParamType;
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
	public PersistenceTypeType createPersistenceTypeType() {
		PersistenceTypeTypeImpl persistenceTypeType = new PersistenceTypeTypeImpl();
		return persistenceTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimKeyClassType createPrimKeyClassType() {
		PrimKeyClassTypeImpl primKeyClassType = new PrimKeyClassTypeImpl();
		return primKeyClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimkeyFieldType createPrimkeyFieldType() {
		PrimkeyFieldTypeImpl primkeyFieldType = new PrimkeyFieldTypeImpl();
		return primkeyFieldType;
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
	public ReentrantType createReentrantType() {
		ReentrantTypeImpl reentrantType = new ReentrantTypeImpl();
		return reentrantType;
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
	public ResAuthType createResAuthType() {
		ResAuthTypeImpl resAuthType = new ResAuthTypeImpl();
		return resAuthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefNameType createResourceEnvRefNameType() {
		ResourceEnvRefNameTypeImpl resourceEnvRefNameType = new ResourceEnvRefNameTypeImpl();
		return resourceEnvRefNameType;
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
	public ResourceEnvRefTypeType createResourceEnvRefTypeType() {
		ResourceEnvRefTypeTypeImpl resourceEnvRefTypeType = new ResourceEnvRefTypeTypeImpl();
		return resourceEnvRefTypeType;
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
	public ResRefNameType createResRefNameType() {
		ResRefNameTypeImpl resRefNameType = new ResRefNameTypeImpl();
		return resRefNameType;
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
	public ResTypeType createResTypeType() {
		ResTypeTypeImpl resTypeType = new ResTypeTypeImpl();
		return resTypeType;
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
	public RoleLinkType createRoleLinkType() {
		RoleLinkTypeImpl roleLinkType = new RoleLinkTypeImpl();
		return roleLinkType;
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
	public SessionType createSessionType() {
		SessionTypeImpl sessionType = new SessionTypeImpl();
		return sessionType;
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
	public SmallIconType createSmallIconType() {
		SmallIconTypeImpl smallIconType = new SmallIconTypeImpl();
		return smallIconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionDurabilityType createSubscriptionDurabilityType() {
		SubscriptionDurabilityTypeImpl subscriptionDurabilityType = new SubscriptionDurabilityTypeImpl();
		return subscriptionDurabilityType;
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
	public UncheckedType createUncheckedType() {
		UncheckedTypeImpl uncheckedType = new UncheckedTypeImpl();
		return uncheckedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCallerIdentityType createUseCallerIdentityType() {
		UseCallerIdentityTypeImpl useCallerIdentityType = new UseCallerIdentityTypeImpl();
		return useCallerIdentityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar20Package getEjbJar20Package() {
		return (EjbJar20Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjbJar20Package getPackage() {
		return EjbJar20Package.eINSTANCE;
	}

} //EjbJar20FactoryImpl
