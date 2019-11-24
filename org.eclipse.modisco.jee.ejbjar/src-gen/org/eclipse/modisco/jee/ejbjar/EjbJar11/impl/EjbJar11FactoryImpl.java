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
package org.eclipse.modisco.jee.ejbjar.EjbJar11.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.jee.ejbjar.EjbJar11.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbJar11FactoryImpl extends EFactoryImpl implements EjbJar11Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EjbJar11Factory init() {
		try {
			EjbJar11Factory theEjbJar11Factory = (EjbJar11Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Javaee/ejb-jar_1_1.dtd"); //$NON-NLS-1$ 
			if (theEjbJar11Factory != null) {
				return theEjbJar11Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjbJar11FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar11FactoryImpl() {
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
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE: return createAssemblyDescriptorType();
			case EjbJar11Package.CMP_FIELD_TYPE: return createCmpFieldType();
			case EjbJar11Package.CONTAINER_TRANSACTION_TYPE: return createContainerTransactionType();
			case EjbJar11Package.DESCRIPTION_TYPE: return createDescriptionType();
			case EjbJar11Package.DISPLAY_NAME_TYPE: return createDisplayNameType();
			case EjbJar11Package.DOCUMENT_ROOT: return createDocumentRoot();
			case EjbJar11Package.EJB_CLASS_TYPE: return createEjbClassType();
			case EjbJar11Package.EJB_CLIENT_JAR_TYPE: return createEjbClientJarType();
			case EjbJar11Package.EJB_JAR_TYPE: return createEjbJarType();
			case EjbJar11Package.EJB_LINK_TYPE: return createEjbLinkType();
			case EjbJar11Package.EJB_NAME_TYPE: return createEjbNameType();
			case EjbJar11Package.EJB_REF_NAME_TYPE: return createEjbRefNameType();
			case EjbJar11Package.EJB_REF_TYPE: return createEjbRefType();
			case EjbJar11Package.EJB_REF_TYPE_TYPE: return createEjbRefTypeType();
			case EjbJar11Package.ENTERPRISE_BEANS_TYPE: return createEnterpriseBeansType();
			case EjbJar11Package.ENTITY_TYPE: return createEntityType();
			case EjbJar11Package.ENV_ENTRY_NAME_TYPE: return createEnvEntryNameType();
			case EjbJar11Package.ENV_ENTRY_TYPE: return createEnvEntryType();
			case EjbJar11Package.ENV_ENTRY_TYPE_TYPE: return createEnvEntryTypeType();
			case EjbJar11Package.ENV_ENTRY_VALUE_TYPE: return createEnvEntryValueType();
			case EjbJar11Package.FIELD_NAME_TYPE: return createFieldNameType();
			case EjbJar11Package.HOME_TYPE: return createHomeType();
			case EjbJar11Package.LARGE_ICON_TYPE: return createLargeIconType();
			case EjbJar11Package.METHOD_INTF_TYPE: return createMethodIntfType();
			case EjbJar11Package.METHOD_NAME_TYPE: return createMethodNameType();
			case EjbJar11Package.METHOD_PARAMS_TYPE: return createMethodParamsType();
			case EjbJar11Package.METHOD_PARAM_TYPE: return createMethodParamType();
			case EjbJar11Package.METHOD_PERMISSION_TYPE: return createMethodPermissionType();
			case EjbJar11Package.METHOD_TYPE: return createMethodType();
			case EjbJar11Package.PERSISTENCE_TYPE_TYPE: return createPersistenceTypeType();
			case EjbJar11Package.PRIM_KEY_CLASS_TYPE: return createPrimKeyClassType();
			case EjbJar11Package.PRIMKEY_FIELD_TYPE: return createPrimkeyFieldType();
			case EjbJar11Package.REENTRANT_TYPE: return createReentrantType();
			case EjbJar11Package.REMOTE_TYPE: return createRemoteType();
			case EjbJar11Package.RES_AUTH_TYPE: return createResAuthType();
			case EjbJar11Package.RESOURCE_REF_TYPE: return createResourceRefType();
			case EjbJar11Package.RES_REF_NAME_TYPE: return createResRefNameType();
			case EjbJar11Package.RES_TYPE_TYPE: return createResTypeType();
			case EjbJar11Package.ROLE_LINK_TYPE: return createRoleLinkType();
			case EjbJar11Package.ROLE_NAME_TYPE: return createRoleNameType();
			case EjbJar11Package.SECURITY_ROLE_REF_TYPE: return createSecurityRoleRefType();
			case EjbJar11Package.SECURITY_ROLE_TYPE: return createSecurityRoleType();
			case EjbJar11Package.SESSION_TYPE: return createSessionType();
			case EjbJar11Package.SESSION_TYPE_TYPE: return createSessionTypeType();
			case EjbJar11Package.SMALL_ICON_TYPE: return createSmallIconType();
			case EjbJar11Package.TRANSACTION_TYPE_TYPE: return createTransactionTypeType();
			case EjbJar11Package.TRANS_ATTRIBUTE_TYPE: return createTransAttributeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
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
	public CmpFieldType createCmpFieldType() {
		CmpFieldTypeImpl cmpFieldType = new CmpFieldTypeImpl();
		return cmpFieldType;
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
	public ReentrantType createReentrantType() {
		ReentrantTypeImpl reentrantType = new ReentrantTypeImpl();
		return reentrantType;
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
	public ResTypeType createResTypeType() {
		ResTypeTypeImpl resTypeType = new ResTypeTypeImpl();
		return resTypeType;
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
	public EjbJar11Package getEjbJar11Package() {
		return (EjbJar11Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjbJar11Package getPackage() {
		return EjbJar11Package.eINSTANCE;
	}

} //EjbJar11FactoryImpl
