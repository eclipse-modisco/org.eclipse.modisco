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
package org.eclipse.modisco.jee.ejbjar.EjbJar20.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package
 * @generated
 */
public class EjbJar20AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EjbJar20Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar20AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EjbJar20Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EjbJar20Switch<Adapter> modelSwitch =
		new EjbJar20Switch<Adapter>() {
			@Override
			public Adapter caseAbstractSchemaNameType(AbstractSchemaNameType object) {
				return createAbstractSchemaNameTypeAdapter();
			}
			@Override
			public Adapter caseAcknowledgeModeType(AcknowledgeModeType object) {
				return createAcknowledgeModeTypeAdapter();
			}
			@Override
			public Adapter caseAssemblyDescriptorType(AssemblyDescriptorType object) {
				return createAssemblyDescriptorTypeAdapter();
			}
			@Override
			public Adapter caseCascadeDeleteType(CascadeDeleteType object) {
				return createCascadeDeleteTypeAdapter();
			}
			@Override
			public Adapter caseCmpFieldType(CmpFieldType object) {
				return createCmpFieldTypeAdapter();
			}
			@Override
			public Adapter caseCmpVersionType(CmpVersionType object) {
				return createCmpVersionTypeAdapter();
			}
			@Override
			public Adapter caseCmrFieldNameType(CmrFieldNameType object) {
				return createCmrFieldNameTypeAdapter();
			}
			@Override
			public Adapter caseCmrFieldType(CmrFieldType object) {
				return createCmrFieldTypeAdapter();
			}
			@Override
			public Adapter caseCmrFieldTypeType(CmrFieldTypeType object) {
				return createCmrFieldTypeTypeAdapter();
			}
			@Override
			public Adapter caseContainerTransactionType(ContainerTransactionType object) {
				return createContainerTransactionTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDestinationTypeType(DestinationTypeType object) {
				return createDestinationTypeTypeAdapter();
			}
			@Override
			public Adapter caseDisplayNameType(DisplayNameType object) {
				return createDisplayNameTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEjbClassType(EjbClassType object) {
				return createEjbClassTypeAdapter();
			}
			@Override
			public Adapter caseEjbClientJarType(EjbClientJarType object) {
				return createEjbClientJarTypeAdapter();
			}
			@Override
			public Adapter caseEjbJarType(EjbJarType object) {
				return createEjbJarTypeAdapter();
			}
			@Override
			public Adapter caseEjbLinkType(EjbLinkType object) {
				return createEjbLinkTypeAdapter();
			}
			@Override
			public Adapter caseEjbLocalRefType(EjbLocalRefType object) {
				return createEjbLocalRefTypeAdapter();
			}
			@Override
			public Adapter caseEjbNameType(EjbNameType object) {
				return createEjbNameTypeAdapter();
			}
			@Override
			public Adapter caseEjbQlType(EjbQlType object) {
				return createEjbQlTypeAdapter();
			}
			@Override
			public Adapter caseEjbRefNameType(EjbRefNameType object) {
				return createEjbRefNameTypeAdapter();
			}
			@Override
			public Adapter caseEjbRefType(EjbRefType object) {
				return createEjbRefTypeAdapter();
			}
			@Override
			public Adapter caseEjbRefTypeType(EjbRefTypeType object) {
				return createEjbRefTypeTypeAdapter();
			}
			@Override
			public Adapter caseEjbRelationNameType(EjbRelationNameType object) {
				return createEjbRelationNameTypeAdapter();
			}
			@Override
			public Adapter caseEjbRelationshipRoleNameType(EjbRelationshipRoleNameType object) {
				return createEjbRelationshipRoleNameTypeAdapter();
			}
			@Override
			public Adapter caseEjbRelationshipRoleType(EjbRelationshipRoleType object) {
				return createEjbRelationshipRoleTypeAdapter();
			}
			@Override
			public Adapter caseEjbRelationType(EjbRelationType object) {
				return createEjbRelationTypeAdapter();
			}
			@Override
			public Adapter caseEnterpriseBeansType(EnterpriseBeansType object) {
				return createEnterpriseBeansTypeAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryNameType(EnvEntryNameType object) {
				return createEnvEntryNameTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryType(EnvEntryType object) {
				return createEnvEntryTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryTypeType(EnvEntryTypeType object) {
				return createEnvEntryTypeTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryValueType(EnvEntryValueType object) {
				return createEnvEntryValueTypeAdapter();
			}
			@Override
			public Adapter caseExcludeListType(ExcludeListType object) {
				return createExcludeListTypeAdapter();
			}
			@Override
			public Adapter caseFieldNameType(FieldNameType object) {
				return createFieldNameTypeAdapter();
			}
			@Override
			public Adapter caseHomeType(HomeType object) {
				return createHomeTypeAdapter();
			}
			@Override
			public Adapter caseLargeIconType(LargeIconType object) {
				return createLargeIconTypeAdapter();
			}
			@Override
			public Adapter caseLocalHomeType(LocalHomeType object) {
				return createLocalHomeTypeAdapter();
			}
			@Override
			public Adapter caseLocalType(LocalType object) {
				return createLocalTypeAdapter();
			}
			@Override
			public Adapter caseMessageDrivenDestinationType(MessageDrivenDestinationType object) {
				return createMessageDrivenDestinationTypeAdapter();
			}
			@Override
			public Adapter caseMessageDrivenType(MessageDrivenType object) {
				return createMessageDrivenTypeAdapter();
			}
			@Override
			public Adapter caseMessageSelectorType(MessageSelectorType object) {
				return createMessageSelectorTypeAdapter();
			}
			@Override
			public Adapter caseMethodIntfType(MethodIntfType object) {
				return createMethodIntfTypeAdapter();
			}
			@Override
			public Adapter caseMethodNameType(MethodNameType object) {
				return createMethodNameTypeAdapter();
			}
			@Override
			public Adapter caseMethodParamsType(MethodParamsType object) {
				return createMethodParamsTypeAdapter();
			}
			@Override
			public Adapter caseMethodParamType(MethodParamType object) {
				return createMethodParamTypeAdapter();
			}
			@Override
			public Adapter caseMethodPermissionType(MethodPermissionType object) {
				return createMethodPermissionTypeAdapter();
			}
			@Override
			public Adapter caseMethodType(MethodType object) {
				return createMethodTypeAdapter();
			}
			@Override
			public Adapter caseMultiplicityType(MultiplicityType object) {
				return createMultiplicityTypeAdapter();
			}
			@Override
			public Adapter casePersistenceTypeType(PersistenceTypeType object) {
				return createPersistenceTypeTypeAdapter();
			}
			@Override
			public Adapter casePrimKeyClassType(PrimKeyClassType object) {
				return createPrimKeyClassTypeAdapter();
			}
			@Override
			public Adapter casePrimkeyFieldType(PrimkeyFieldType object) {
				return createPrimkeyFieldTypeAdapter();
			}
			@Override
			public Adapter caseQueryMethodType(QueryMethodType object) {
				return createQueryMethodTypeAdapter();
			}
			@Override
			public Adapter caseQueryType(QueryType object) {
				return createQueryTypeAdapter();
			}
			@Override
			public Adapter caseReentrantType(ReentrantType object) {
				return createReentrantTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipRoleSourceType(RelationshipRoleSourceType object) {
				return createRelationshipRoleSourceTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipsType(RelationshipsType object) {
				return createRelationshipsTypeAdapter();
			}
			@Override
			public Adapter caseRemoteType(RemoteType object) {
				return createRemoteTypeAdapter();
			}
			@Override
			public Adapter caseResAuthType(ResAuthType object) {
				return createResAuthTypeAdapter();
			}
			@Override
			public Adapter caseResourceEnvRefNameType(ResourceEnvRefNameType object) {
				return createResourceEnvRefNameTypeAdapter();
			}
			@Override
			public Adapter caseResourceEnvRefType(ResourceEnvRefType object) {
				return createResourceEnvRefTypeAdapter();
			}
			@Override
			public Adapter caseResourceEnvRefTypeType(ResourceEnvRefTypeType object) {
				return createResourceEnvRefTypeTypeAdapter();
			}
			@Override
			public Adapter caseResourceRefType(ResourceRefType object) {
				return createResourceRefTypeAdapter();
			}
			@Override
			public Adapter caseResRefNameType(ResRefNameType object) {
				return createResRefNameTypeAdapter();
			}
			@Override
			public Adapter caseResSharingScopeType(ResSharingScopeType object) {
				return createResSharingScopeTypeAdapter();
			}
			@Override
			public Adapter caseResTypeType(ResTypeType object) {
				return createResTypeTypeAdapter();
			}
			@Override
			public Adapter caseResultTypeMappingType(ResultTypeMappingType object) {
				return createResultTypeMappingTypeAdapter();
			}
			@Override
			public Adapter caseRoleLinkType(RoleLinkType object) {
				return createRoleLinkTypeAdapter();
			}
			@Override
			public Adapter caseRoleNameType(RoleNameType object) {
				return createRoleNameTypeAdapter();
			}
			@Override
			public Adapter caseRunAsType(RunAsType object) {
				return createRunAsTypeAdapter();
			}
			@Override
			public Adapter caseSecurityIdentityType(SecurityIdentityType object) {
				return createSecurityIdentityTypeAdapter();
			}
			@Override
			public Adapter caseSecurityRoleRefType(SecurityRoleRefType object) {
				return createSecurityRoleRefTypeAdapter();
			}
			@Override
			public Adapter caseSecurityRoleType(SecurityRoleType object) {
				return createSecurityRoleTypeAdapter();
			}
			@Override
			public Adapter caseSessionType(SessionType object) {
				return createSessionTypeAdapter();
			}
			@Override
			public Adapter caseSessionTypeType(SessionTypeType object) {
				return createSessionTypeTypeAdapter();
			}
			@Override
			public Adapter caseSmallIconType(SmallIconType object) {
				return createSmallIconTypeAdapter();
			}
			@Override
			public Adapter caseSubscriptionDurabilityType(SubscriptionDurabilityType object) {
				return createSubscriptionDurabilityTypeAdapter();
			}
			@Override
			public Adapter caseTransactionTypeType(TransactionTypeType object) {
				return createTransactionTypeTypeAdapter();
			}
			@Override
			public Adapter caseTransAttributeType(TransAttributeType object) {
				return createTransAttributeTypeAdapter();
			}
			@Override
			public Adapter caseUncheckedType(UncheckedType object) {
				return createUncheckedTypeAdapter();
			}
			@Override
			public Adapter caseUseCallerIdentityType(UseCallerIdentityType object) {
				return createUseCallerIdentityTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType <em>Abstract Schema Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType
	 * @generated
	 */
	public Adapter createAbstractSchemaNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType <em>Acknowledge Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType
	 * @generated
	 */
	public Adapter createAcknowledgeModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType <em>Assembly Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType
	 * @generated
	 */
	public Adapter createAssemblyDescriptorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType <em>Cascade Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType
	 * @generated
	 */
	public Adapter createCascadeDeleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType <em>Cmp Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType
	 * @generated
	 */
	public Adapter createCmpFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType <em>Cmp Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType
	 * @generated
	 */
	public Adapter createCmpVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType <em>Cmr Field Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType
	 * @generated
	 */
	public Adapter createCmrFieldNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType
	 * @generated
	 */
	public Adapter createCmrFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType <em>Cmr Field Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType
	 * @generated
	 */
	public Adapter createCmrFieldTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType <em>Container Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType
	 * @generated
	 */
	public Adapter createContainerTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType <em>Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType
	 * @generated
	 */
	public Adapter createDestinationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType
	 * @generated
	 */
	public Adapter createDisplayNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType <em>Ejb Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType
	 * @generated
	 */
	public Adapter createEjbClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType <em>Ejb Client Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType
	 * @generated
	 */
	public Adapter createEjbClientJarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType <em>Ejb Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType
	 * @generated
	 */
	public Adapter createEjbJarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType
	 * @generated
	 */
	public Adapter createEjbLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType
	 * @generated
	 */
	public Adapter createEjbLocalRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType <em>Ejb Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType
	 * @generated
	 */
	public Adapter createEjbNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType <em>Ejb Ql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType
	 * @generated
	 */
	public Adapter createEjbQlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType
	 * @generated
	 */
	public Adapter createEjbRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType
	 * @generated
	 */
	public Adapter createEjbRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType
	 * @generated
	 */
	public Adapter createEjbRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType <em>Ejb Relation Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType
	 * @generated
	 */
	public Adapter createEjbRelationNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType <em>Ejb Relationship Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType
	 * @generated
	 */
	public Adapter createEjbRelationshipRoleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType <em>Ejb Relationship Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType
	 * @generated
	 */
	public Adapter createEjbRelationshipRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType <em>Ejb Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType
	 * @generated
	 */
	public Adapter createEjbRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType <em>Enterprise Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType
	 * @generated
	 */
	public Adapter createEnterpriseBeansTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType <em>Env Entry Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType
	 * @generated
	 */
	public Adapter createEnvEntryNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType
	 * @generated
	 */
	public Adapter createEnvEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType <em>Env Entry Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType
	 * @generated
	 */
	public Adapter createEnvEntryTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType <em>Env Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType
	 * @generated
	 */
	public Adapter createEnvEntryValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType <em>Exclude List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType
	 * @generated
	 */
	public Adapter createExcludeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType <em>Field Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType
	 * @generated
	 */
	public Adapter createFieldNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType
	 * @generated
	 */
	public Adapter createHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType <em>Large Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType
	 * @generated
	 */
	public Adapter createLargeIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType
	 * @generated
	 */
	public Adapter createLocalHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType
	 * @generated
	 */
	public Adapter createLocalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType <em>Message Driven Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType
	 * @generated
	 */
	public Adapter createMessageDrivenDestinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType <em>Message Driven Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType
	 * @generated
	 */
	public Adapter createMessageDrivenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType <em>Message Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType
	 * @generated
	 */
	public Adapter createMessageSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType <em>Method Intf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType
	 * @generated
	 */
	public Adapter createMethodIntfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType <em>Method Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType
	 * @generated
	 */
	public Adapter createMethodNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType <em>Method Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType
	 * @generated
	 */
	public Adapter createMethodParamsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType <em>Method Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType
	 * @generated
	 */
	public Adapter createMethodParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType <em>Method Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType
	 * @generated
	 */
	public Adapter createMethodPermissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType
	 * @generated
	 */
	public Adapter createMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType
	 * @generated
	 */
	public Adapter createMultiplicityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType <em>Persistence Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType
	 * @generated
	 */
	public Adapter createPersistenceTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType <em>Prim Key Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType
	 * @generated
	 */
	public Adapter createPrimKeyClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType <em>Primkey Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType
	 * @generated
	 */
	public Adapter createPrimkeyFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType <em>Query Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType
	 * @generated
	 */
	public Adapter createQueryMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType
	 * @generated
	 */
	public Adapter createQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType <em>Reentrant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType
	 * @generated
	 */
	public Adapter createReentrantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType <em>Relationship Role Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType
	 * @generated
	 */
	public Adapter createRelationshipRoleSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType <em>Relationships Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType
	 * @generated
	 */
	public Adapter createRelationshipsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType
	 * @generated
	 */
	public Adapter createRemoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType
	 * @generated
	 */
	public Adapter createResAuthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType <em>Resource Env Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType
	 * @generated
	 */
	public Adapter createResourceEnvRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType <em>Resource Env Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType
	 * @generated
	 */
	public Adapter createResourceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType <em>Res Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType
	 * @generated
	 */
	public Adapter createResRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType
	 * @generated
	 */
	public Adapter createResSharingScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType <em>Res Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType
	 * @generated
	 */
	public Adapter createResTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType <em>Result Type Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType
	 * @generated
	 */
	public Adapter createResultTypeMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType <em>Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType
	 * @generated
	 */
	public Adapter createRoleLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType
	 * @generated
	 */
	public Adapter createRoleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType
	 * @generated
	 */
	public Adapter createRunAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType <em>Security Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType
	 * @generated
	 */
	public Adapter createSecurityIdentityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType
	 * @generated
	 */
	public Adapter createSecurityRoleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType
	 * @generated
	 */
	public Adapter createSecurityRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType
	 * @generated
	 */
	public Adapter createSessionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType <em>Session Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType
	 * @generated
	 */
	public Adapter createSessionTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType <em>Small Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType
	 * @generated
	 */
	public Adapter createSmallIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType <em>Subscription Durability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType
	 * @generated
	 */
	public Adapter createSubscriptionDurabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType
	 * @generated
	 */
	public Adapter createTransactionTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType <em>Trans Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType
	 * @generated
	 */
	public Adapter createTransAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.UncheckedType <em>Unchecked Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.UncheckedType
	 * @generated
	 */
	public Adapter createUncheckedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.UseCallerIdentityType <em>Use Caller Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.UseCallerIdentityType
	 * @generated
	 */
	public Adapter createUseCallerIdentityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EjbJar20AdapterFactory
