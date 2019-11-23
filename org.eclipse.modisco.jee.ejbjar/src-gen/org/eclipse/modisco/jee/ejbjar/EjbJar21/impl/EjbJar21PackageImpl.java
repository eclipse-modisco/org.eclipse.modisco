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

import java.lang.String;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

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
import org.eclipse.modisco.jee.ejbjar.EjbJar21.*;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.util.EjbJar21Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbJar21PackageImpl extends EPackageImpl implements EjbJar21Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationConfigPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyDescriptorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmpFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmpVersionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmrFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmrFieldTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerTransactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbJarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbLocalRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRefNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRefTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRelationshipRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseBeansTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityBeanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEntryTypeValuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullyQualifiedClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericBooleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass homeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jndiNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listenerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localHomeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationUsageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDrivenBeanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodIntfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParamsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodPermissionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portComponentRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipRoleSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resAuthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEnvRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resSharingScopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runAsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityIdentityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRoleRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRefHandlerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionBeanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueFalseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlPatternTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdAnyURITypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdBooleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdNMTOKENTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdNonNegativeIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdPositiveIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdQNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmpVersionTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmrFieldTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ejbRefTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum envEntryTypeValuesTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genericBooleanTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageDestinationUsageTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodIntfTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resAuthTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resSharingScopeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resultTypeMappingTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sessionTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transAttributeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmpVersionTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmrFieldTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deweyVersionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbClassTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbLinkTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbRefNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbRefTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType envEntryTypeValuesTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fullyQualifiedClassTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType genericBooleanTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType homeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaIdentifierTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaTypeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jndiNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localHomeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageDestinationLinkTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageDestinationTypeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageDestinationUsageTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodIntfTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiplicityTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType persistenceTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType remoteTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resAuthTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resSharingScopeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resultTypeMappingTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roleNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sessionTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transactionTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transAttributeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trueFalseTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trueFalseTypeBaseObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EjbJar21PackageImpl() {
		super(eNS_URI, EjbJar21Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EjbJar21Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EjbJar21Package init() {
		if (isInited) return (EjbJar21Package)EPackage.Registry.INSTANCE.getEPackage(EjbJar21Package.eNS_URI);

		// Obtain or create and register package
		EjbJar21PackageImpl theEjbJar21Package = (EjbJar21PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EjbJar21PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EjbJar21PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEjbJar21Package.createPackageContents();

		// Initialize created meta-data
		theEjbJar21Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEjbJar21Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EjbJar21Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEjbJar21Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EjbJar21Package.eNS_URI, theEjbJar21Package);
		return theEjbJar21Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationConfigPropertyType() {
		return activationConfigPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigPropertyType_ActivationConfigPropertyName() {
		return (EReference)activationConfigPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigPropertyType_ActivationConfigPropertyValue() {
		return (EReference)activationConfigPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConfigPropertyType_Id() {
		return (EAttribute)activationConfigPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationConfigType() {
		return activationConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigType_Description() {
		return (EReference)activationConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigType_ActivationConfigProperty() {
		return (EReference)activationConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConfigType_Id() {
		return (EAttribute)activationConfigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyDescriptorType() {
		return assemblyDescriptorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_SecurityRole() {
		return (EReference)assemblyDescriptorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_MethodPermission() {
		return (EReference)assemblyDescriptorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_ContainerTransaction() {
		return (EReference)assemblyDescriptorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_MessageDestination() {
		return (EReference)assemblyDescriptorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_ExcludeList() {
		return (EReference)assemblyDescriptorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssemblyDescriptorType_Id() {
		return (EAttribute)assemblyDescriptorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmpFieldType() {
		return cmpFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpFieldType_Description() {
		return (EReference)cmpFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpFieldType_FieldName() {
		return (EReference)cmpFieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmpFieldType_Id() {
		return (EAttribute)cmpFieldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmpVersionType() {
		return cmpVersionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmrFieldType() {
		return cmrFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmrFieldType_Description() {
		return (EReference)cmrFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmrFieldType_CmrFieldName() {
		return (EReference)cmrFieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmrFieldType_CmrFieldType() {
		return (EReference)cmrFieldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmrFieldType_Id() {
		return (EAttribute)cmrFieldTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmrFieldTypeType() {
		return cmrFieldTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerTransactionType() {
		return containerTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerTransactionType_Description() {
		return (EReference)containerTransactionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerTransactionType_Method() {
		return (EReference)containerTransactionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerTransactionType_TransAttribute() {
		return (EReference)containerTransactionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerTransactionType_Id() {
		return (EAttribute)containerTransactionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Lang() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayNameType() {
		return displayNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayNameType_Lang() {
		return (EAttribute)displayNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EjbJar() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbClassType() {
		return ejbClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbJarType() {
		return ejbJarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_Description() {
		return (EReference)ejbJarTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_DisplayName() {
		return (EReference)ejbJarTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_Icon() {
		return (EReference)ejbJarTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_EnterpriseBeans() {
		return (EReference)ejbJarTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_Relationships() {
		return (EReference)ejbJarTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_AssemblyDescriptor() {
		return (EReference)ejbJarTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_EjbClientJar() {
		return (EReference)ejbJarTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbJarType_Id() {
		return (EAttribute)ejbJarTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbJarType_Version() {
		return (EAttribute)ejbJarTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbLinkType() {
		return ejbLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbLocalRefType() {
		return ejbLocalRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_Description() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbRefName() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbRefType() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_LocalHome() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_Local() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbLink() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbLocalRefType_Id() {
		return (EAttribute)ejbLocalRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbNameType() {
		return ejbNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefNameType() {
		return ejbRefNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefType() {
		return ejbRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Description() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbRefName() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbRefType() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Home() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Remote() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbLink() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRefType_Id() {
		return (EAttribute)ejbRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefTypeType() {
		return ejbRefTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRelationshipRoleType() {
		return ejbRelationshipRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_Description() {
		return (EReference)ejbRelationshipRoleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_EjbRelationshipRoleName() {
		return (EReference)ejbRelationshipRoleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_Multiplicity() {
		return (EReference)ejbRelationshipRoleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_CascadeDelete() {
		return (EReference)ejbRelationshipRoleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_RelationshipRoleSource() {
		return (EReference)ejbRelationshipRoleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_CmrField() {
		return (EReference)ejbRelationshipRoleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRelationshipRoleType_Id() {
		return (EAttribute)ejbRelationshipRoleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRelationType() {
		return ejbRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_Description() {
		return (EReference)ejbRelationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_EjbRelationName() {
		return (EReference)ejbRelationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_EjbRelationshipRole() {
		return (EReference)ejbRelationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_EjbRelationshipRole1() {
		return (EReference)ejbRelationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRelationType_Id() {
		return (EAttribute)ejbRelationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyType() {
		return emptyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmptyType_Id() {
		return (EAttribute)emptyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterpriseBeansType() {
		return enterpriseBeansTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterpriseBeansType_Group() {
		return (EAttribute)enterpriseBeansTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseBeansType_Session() {
		return (EReference)enterpriseBeansTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseBeansType_Entity() {
		return (EReference)enterpriseBeansTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseBeansType_MessageDriven() {
		return (EReference)enterpriseBeansTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterpriseBeansType_Id() {
		return (EAttribute)enterpriseBeansTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityBeanType() {
		return entityBeanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Description() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_DisplayName() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Icon() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbName() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Home() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Remote() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_LocalHome() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Local() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbClass() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PersistenceType() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PrimKeyClass() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Reentrant() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_CmpVersion() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_AbstractSchemaName() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_CmpField() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PrimkeyField() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EnvEntry() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbRef() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbLocalRef() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_ServiceRef() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_ResourceRef() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_ResourceEnvRef() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_MessageDestinationRef() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_SecurityRoleRef() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_SecurityIdentity() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Query() {
		return (EReference)entityBeanTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityBeanType_Id() {
		return (EAttribute)entityBeanTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvEntryType() {
		return envEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_Description() {
		return (EReference)envEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryName() {
		return (EReference)envEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryType() {
		return (EReference)envEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryValue() {
		return (EReference)envEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvEntryType_Id() {
		return (EAttribute)envEntryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvEntryTypeValuesType() {
		return envEntryTypeValuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeListType() {
		return excludeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeListType_Description() {
		return (EReference)excludeListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeListType_Method() {
		return (EReference)excludeListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcludeListType_Id() {
		return (EAttribute)excludeListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullyQualifiedClassType() {
		return fullyQualifiedClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericBooleanType() {
		return genericBooleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHomeType() {
		return homeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconType() {
		return iconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconType_SmallIcon() {
		return (EReference)iconTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconType_LargeIcon() {
		return (EReference)iconTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_Id() {
		return (EAttribute)iconTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_Lang() {
		return (EAttribute)iconTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaIdentifierType() {
		return javaIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaTypeType() {
		return javaTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJndiNameType() {
		return jndiNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListenerType() {
		return listenerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_Description() {
		return (EReference)listenerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_DisplayName() {
		return (EReference)listenerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_Icon() {
		return (EReference)listenerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_ListenerClass() {
		return (EReference)listenerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListenerType_Id() {
		return (EAttribute)listenerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalHomeType() {
		return localHomeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalType() {
		return localTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationLinkType() {
		return messageDestinationLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationRefType() {
		return messageDestinationRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_Description() {
		return (EReference)messageDestinationRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationRefName() {
		return (EReference)messageDestinationRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationType() {
		return (EReference)messageDestinationRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationUsage() {
		return (EReference)messageDestinationRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationLink() {
		return (EReference)messageDestinationRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationRefType_Id() {
		return (EAttribute)messageDestinationRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationType() {
		return messageDestinationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_Description() {
		return (EReference)messageDestinationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_DisplayName() {
		return (EReference)messageDestinationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_Icon() {
		return (EReference)messageDestinationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_MessageDestinationName() {
		return (EReference)messageDestinationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationType_Id() {
		return (EAttribute)messageDestinationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationTypeType() {
		return messageDestinationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationUsageType() {
		return messageDestinationUsageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDrivenBeanType() {
		return messageDrivenBeanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_Description() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_DisplayName() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_Icon() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbName() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbClass() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessagingType() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_TransactionType() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessageDestinationType() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessageDestinationLink() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ActivationConfig() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EnvEntry() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbRef() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbLocalRef() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ServiceRef() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ResourceRef() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ResourceEnvRef() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessageDestinationRef() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_SecurityIdentity() {
		return (EReference)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDrivenBeanType_Id() {
		return (EAttribute)messageDrivenBeanTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodIntfType() {
		return methodIntfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodNameType() {
		return methodNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParamsType() {
		return methodParamsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodParamsType_MethodParam() {
		return (EReference)methodParamsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParamsType_Id() {
		return (EAttribute)methodParamsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodPermissionType() {
		return methodPermissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_Description() {
		return (EReference)methodPermissionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_RoleName() {
		return (EReference)methodPermissionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_Unchecked() {
		return (EReference)methodPermissionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_Method() {
		return (EReference)methodPermissionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodPermissionType_Id() {
		return (EAttribute)methodPermissionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodType() {
		return methodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_Description() {
		return (EReference)methodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_EjbName() {
		return (EReference)methodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_MethodIntf() {
		return (EReference)methodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_MethodName() {
		return (EReference)methodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_MethodParams() {
		return (EReference)methodTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodType_Id() {
		return (EAttribute)methodTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityType() {
		return multiplicityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamValueType() {
		return paramValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_Description() {
		return (EReference)paramValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_ParamName() {
		return (EReference)paramValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_ParamValue() {
		return (EReference)paramValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamValueType_Id() {
		return (EAttribute)paramValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathType() {
		return pathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceTypeType() {
		return persistenceTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortComponentRefType() {
		return portComponentRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_ServiceEndpointInterface() {
		return (EReference)portComponentRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_PortComponentLink() {
		return (EReference)portComponentRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortComponentRefType_Id() {
		return (EAttribute)portComponentRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryMethodType() {
		return queryMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMethodType_MethodName() {
		return (EReference)queryMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMethodType_MethodParams() {
		return (EReference)queryMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryMethodType_Id() {
		return (EAttribute)queryMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryType() {
		return queryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_Description() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_QueryMethod() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_ResultTypeMapping() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_EjbQl() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_Id() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipRoleSourceType() {
		return relationshipRoleSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipRoleSourceType_Description() {
		return (EReference)relationshipRoleSourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipRoleSourceType_EjbName() {
		return (EReference)relationshipRoleSourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipRoleSourceType_Id() {
		return (EAttribute)relationshipRoleSourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipsType() {
		return relationshipsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipsType_Description() {
		return (EReference)relationshipsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipsType_EjbRelation() {
		return (EReference)relationshipsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipsType_Id() {
		return (EAttribute)relationshipsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteType() {
		return remoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResAuthType() {
		return resAuthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceEnvRefType() {
		return resourceEnvRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_Description() {
		return (EReference)resourceEnvRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_ResourceEnvRefName() {
		return (EReference)resourceEnvRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_ResourceEnvRefType() {
		return (EReference)resourceEnvRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceEnvRefType_Id() {
		return (EAttribute)resourceEnvRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRefType() {
		return resourceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_Description() {
		return (EReference)resourceRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResRefName() {
		return (EReference)resourceRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResType() {
		return (EReference)resourceRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResAuth() {
		return (EReference)resourceRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResSharingScope() {
		return (EReference)resourceRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRefType_Id() {
		return (EAttribute)resourceRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResSharingScopeType() {
		return resSharingScopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultTypeMappingType() {
		return resultTypeMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNameType() {
		return roleNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunAsType() {
		return runAsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunAsType_Description() {
		return (EReference)runAsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunAsType_RoleName() {
		return (EReference)runAsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunAsType_Id() {
		return (EAttribute)runAsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityIdentityType() {
		return securityIdentityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityIdentityType_Description() {
		return (EReference)securityIdentityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityIdentityType_UseCallerIdentity() {
		return (EReference)securityIdentityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityIdentityType_RunAs() {
		return (EReference)securityIdentityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityIdentityType_Id() {
		return (EAttribute)securityIdentityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRoleRefType() {
		return securityRoleRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_Description() {
		return (EReference)securityRoleRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_RoleName() {
		return (EReference)securityRoleRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_RoleLink() {
		return (EReference)securityRoleRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRoleRefType_Id() {
		return (EAttribute)securityRoleRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRoleType() {
		return securityRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleType_Description() {
		return (EReference)securityRoleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleType_RoleName() {
		return (EReference)securityRoleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRoleType_Id() {
		return (EAttribute)securityRoleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRefHandlerType() {
		return serviceRefHandlerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_Description() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_DisplayName() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_Icon() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_HandlerName() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_HandlerClass() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_InitParam() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_SoapHeader() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_SoapRole() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerType_PortName() {
		return (EReference)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefHandlerType_Id() {
		return (EAttribute)serviceRefHandlerTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRefType() {
		return serviceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Description() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_DisplayName() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Icon() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceRefName() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceInterface() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_WsdlFile() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_JaxrpcMappingFile() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceQname() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_PortComponentRef() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Handler() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefType_Id() {
		return (EAttribute)serviceRefTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionBeanType() {
		return sessionBeanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Description() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_DisplayName() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Icon() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbName() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Home() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Remote() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_LocalHome() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Local() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ServiceEndpoint() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbClass() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_SessionType() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_TransactionType() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EnvEntry() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbRef() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbLocalRef() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ServiceRef() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ResourceRef() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ResourceEnvRef() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_MessageDestinationRef() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_SecurityRoleRef() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_SecurityIdentity() {
		return (EReference)sessionBeanTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionBeanType_Id() {
		return (EAttribute)sessionBeanTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionTypeType() {
		return sessionTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Value() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Id() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionTypeType() {
		return transactionTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransAttributeType() {
		return transAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueFalseType() {
		return trueFalseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlPatternType() {
		return urlPatternTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlPatternType_Value() {
		return (EAttribute)urlPatternTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdAnyURIType() {
		return xsdAnyURITypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdAnyURIType_Value() {
		return (EAttribute)xsdAnyURITypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdAnyURIType_Id() {
		return (EAttribute)xsdAnyURITypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdBooleanType() {
		return xsdBooleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdBooleanType_Value() {
		return (EAttribute)xsdBooleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdBooleanType_Id() {
		return (EAttribute)xsdBooleanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdIntegerType() {
		return xsdIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdIntegerType_Value() {
		return (EAttribute)xsdIntegerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdIntegerType_Id() {
		return (EAttribute)xsdIntegerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdNMTOKENType() {
		return xsdNMTOKENTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNMTOKENType_Value() {
		return (EAttribute)xsdNMTOKENTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNMTOKENType_Id() {
		return (EAttribute)xsdNMTOKENTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdNonNegativeIntegerType() {
		return xsdNonNegativeIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNonNegativeIntegerType_Value() {
		return (EAttribute)xsdNonNegativeIntegerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNonNegativeIntegerType_Id() {
		return (EAttribute)xsdNonNegativeIntegerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdPositiveIntegerType() {
		return xsdPositiveIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdPositiveIntegerType_Value() {
		return (EAttribute)xsdPositiveIntegerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdPositiveIntegerType_Id() {
		return (EAttribute)xsdPositiveIntegerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdQNameType() {
		return xsdQNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdQNameType_Value() {
		return (EAttribute)xsdQNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdQNameType_Id() {
		return (EAttribute)xsdQNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdStringType() {
		return xsdStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdStringType_Value() {
		return (EAttribute)xsdStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdStringType_Id() {
		return (EAttribute)xsdStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCmpVersionTypeBase() {
		return cmpVersionTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCmrFieldTypeTypeBase() {
		return cmrFieldTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEjbRefTypeTypeBase() {
		return ejbRefTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnvEntryTypeValuesTypeBase() {
		return envEntryTypeValuesTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericBooleanTypeBase() {
		return genericBooleanTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageDestinationUsageTypeBase() {
		return messageDestinationUsageTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodIntfTypeBase() {
		return methodIntfTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicityTypeBase() {
		return multiplicityTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceTypeTypeBase() {
		return persistenceTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResAuthTypeBase() {
		return resAuthTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResSharingScopeTypeBase() {
		return resSharingScopeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResultTypeMappingTypeBase() {
		return resultTypeMappingTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSessionTypeTypeBase() {
		return sessionTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionTypeTypeBase() {
		return transactionTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransAttributeTypeBase() {
		return transAttributeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCmpVersionTypeBaseObject() {
		return cmpVersionTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCmrFieldTypeTypeBaseObject() {
		return cmrFieldTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeweyVersionType() {
		return deweyVersionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbClassTypeBase() {
		return ejbClassTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbLinkTypeBase() {
		return ejbLinkTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbNameTypeBase() {
		return ejbNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbRefNameTypeBase() {
		return ejbRefNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbRefTypeTypeBaseObject() {
		return ejbRefTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnvEntryTypeValuesTypeBaseObject() {
		return envEntryTypeValuesTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFullyQualifiedClassTypeBase() {
		return fullyQualifiedClassTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenericBooleanTypeBaseObject() {
		return genericBooleanTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHomeTypeBase() {
		return homeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaIdentifierTypeBase() {
		return javaIdentifierTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaTypeTypeBase() {
		return javaTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJndiNameTypeBase() {
		return jndiNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalHomeTypeBase() {
		return localHomeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalTypeBase() {
		return localTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationLinkTypeBase() {
		return messageDestinationLinkTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationTypeTypeBase() {
		return messageDestinationTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationUsageTypeBaseObject() {
		return messageDestinationUsageTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodIntfTypeBaseObject() {
		return methodIntfTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodNameTypeBase() {
		return methodNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultiplicityTypeBaseObject() {
		return multiplicityTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathTypeBase() {
		return pathTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersistenceTypeTypeBaseObject() {
		return persistenceTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRemoteTypeBase() {
		return remoteTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResAuthTypeBaseObject() {
		return resAuthTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResSharingScopeTypeBaseObject() {
		return resSharingScopeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResultTypeMappingTypeBaseObject() {
		return resultTypeMappingTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleNameTypeBase() {
		return roleNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSessionTypeTypeBaseObject() {
		return sessionTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransactionTypeTypeBaseObject() {
		return transactionTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransAttributeTypeBaseObject() {
		return transAttributeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrueFalseTypeBase() {
		return trueFalseTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrueFalseTypeBaseObject() {
		return trueFalseTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar21Factory getEjbJar21Factory() {
		return (EjbJar21Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activationConfigPropertyTypeEClass = createEClass(ACTIVATION_CONFIG_PROPERTY_TYPE);
		createEReference(activationConfigPropertyTypeEClass, ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME);
		createEReference(activationConfigPropertyTypeEClass, ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE);
		createEAttribute(activationConfigPropertyTypeEClass, ACTIVATION_CONFIG_PROPERTY_TYPE__ID);

		activationConfigTypeEClass = createEClass(ACTIVATION_CONFIG_TYPE);
		createEReference(activationConfigTypeEClass, ACTIVATION_CONFIG_TYPE__DESCRIPTION);
		createEReference(activationConfigTypeEClass, ACTIVATION_CONFIG_TYPE__ACTIVATION_CONFIG_PROPERTY);
		createEAttribute(activationConfigTypeEClass, ACTIVATION_CONFIG_TYPE__ID);

		assemblyDescriptorTypeEClass = createEClass(ASSEMBLY_DESCRIPTOR_TYPE);
		createEReference(assemblyDescriptorTypeEClass, ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE);
		createEReference(assemblyDescriptorTypeEClass, ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION);
		createEReference(assemblyDescriptorTypeEClass, ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION);
		createEReference(assemblyDescriptorTypeEClass, ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION);
		createEReference(assemblyDescriptorTypeEClass, ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST);
		createEAttribute(assemblyDescriptorTypeEClass, ASSEMBLY_DESCRIPTOR_TYPE__ID);

		cmpFieldTypeEClass = createEClass(CMP_FIELD_TYPE);
		createEReference(cmpFieldTypeEClass, CMP_FIELD_TYPE__DESCRIPTION);
		createEReference(cmpFieldTypeEClass, CMP_FIELD_TYPE__FIELD_NAME);
		createEAttribute(cmpFieldTypeEClass, CMP_FIELD_TYPE__ID);

		cmpVersionTypeEClass = createEClass(CMP_VERSION_TYPE);

		cmrFieldTypeEClass = createEClass(CMR_FIELD_TYPE);
		createEReference(cmrFieldTypeEClass, CMR_FIELD_TYPE__DESCRIPTION);
		createEReference(cmrFieldTypeEClass, CMR_FIELD_TYPE__CMR_FIELD_NAME);
		createEReference(cmrFieldTypeEClass, CMR_FIELD_TYPE__CMR_FIELD_TYPE);
		createEAttribute(cmrFieldTypeEClass, CMR_FIELD_TYPE__ID);

		cmrFieldTypeTypeEClass = createEClass(CMR_FIELD_TYPE_TYPE);

		containerTransactionTypeEClass = createEClass(CONTAINER_TRANSACTION_TYPE);
		createEReference(containerTransactionTypeEClass, CONTAINER_TRANSACTION_TYPE__DESCRIPTION);
		createEReference(containerTransactionTypeEClass, CONTAINER_TRANSACTION_TYPE__METHOD);
		createEReference(containerTransactionTypeEClass, CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE);
		createEAttribute(containerTransactionTypeEClass, CONTAINER_TRANSACTION_TYPE__ID);

		descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__LANG);

		displayNameTypeEClass = createEClass(DISPLAY_NAME_TYPE);
		createEAttribute(displayNameTypeEClass, DISPLAY_NAME_TYPE__LANG);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EJB_JAR);

		ejbClassTypeEClass = createEClass(EJB_CLASS_TYPE);

		ejbJarTypeEClass = createEClass(EJB_JAR_TYPE);
		createEReference(ejbJarTypeEClass, EJB_JAR_TYPE__DESCRIPTION);
		createEReference(ejbJarTypeEClass, EJB_JAR_TYPE__DISPLAY_NAME);
		createEReference(ejbJarTypeEClass, EJB_JAR_TYPE__ICON);
		createEReference(ejbJarTypeEClass, EJB_JAR_TYPE__ENTERPRISE_BEANS);
		createEReference(ejbJarTypeEClass, EJB_JAR_TYPE__RELATIONSHIPS);
		createEReference(ejbJarTypeEClass, EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR);
		createEReference(ejbJarTypeEClass, EJB_JAR_TYPE__EJB_CLIENT_JAR);
		createEAttribute(ejbJarTypeEClass, EJB_JAR_TYPE__ID);
		createEAttribute(ejbJarTypeEClass, EJB_JAR_TYPE__VERSION);

		ejbLinkTypeEClass = createEClass(EJB_LINK_TYPE);

		ejbLocalRefTypeEClass = createEClass(EJB_LOCAL_REF_TYPE);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__DESCRIPTION);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__EJB_REF_NAME);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__EJB_REF_TYPE);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__LOCAL_HOME);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__LOCAL);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__EJB_LINK);
		createEAttribute(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__ID);

		ejbNameTypeEClass = createEClass(EJB_NAME_TYPE);

		ejbRefNameTypeEClass = createEClass(EJB_REF_NAME_TYPE);

		ejbRefTypeEClass = createEClass(EJB_REF_TYPE);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__DESCRIPTION);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__EJB_REF_NAME);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__EJB_REF_TYPE);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__HOME);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__REMOTE);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__EJB_LINK);
		createEAttribute(ejbRefTypeEClass, EJB_REF_TYPE__ID);

		ejbRefTypeTypeEClass = createEClass(EJB_REF_TYPE_TYPE);

		ejbRelationshipRoleTypeEClass = createEClass(EJB_RELATIONSHIP_ROLE_TYPE);
		createEReference(ejbRelationshipRoleTypeEClass, EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION);
		createEReference(ejbRelationshipRoleTypeEClass, EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME);
		createEReference(ejbRelationshipRoleTypeEClass, EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY);
		createEReference(ejbRelationshipRoleTypeEClass, EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE);
		createEReference(ejbRelationshipRoleTypeEClass, EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE);
		createEReference(ejbRelationshipRoleTypeEClass, EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD);
		createEAttribute(ejbRelationshipRoleTypeEClass, EJB_RELATIONSHIP_ROLE_TYPE__ID);

		ejbRelationTypeEClass = createEClass(EJB_RELATION_TYPE);
		createEReference(ejbRelationTypeEClass, EJB_RELATION_TYPE__DESCRIPTION);
		createEReference(ejbRelationTypeEClass, EJB_RELATION_TYPE__EJB_RELATION_NAME);
		createEReference(ejbRelationTypeEClass, EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE);
		createEReference(ejbRelationTypeEClass, EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1);
		createEAttribute(ejbRelationTypeEClass, EJB_RELATION_TYPE__ID);

		emptyTypeEClass = createEClass(EMPTY_TYPE);
		createEAttribute(emptyTypeEClass, EMPTY_TYPE__ID);

		enterpriseBeansTypeEClass = createEClass(ENTERPRISE_BEANS_TYPE);
		createEAttribute(enterpriseBeansTypeEClass, ENTERPRISE_BEANS_TYPE__GROUP);
		createEReference(enterpriseBeansTypeEClass, ENTERPRISE_BEANS_TYPE__SESSION);
		createEReference(enterpriseBeansTypeEClass, ENTERPRISE_BEANS_TYPE__ENTITY);
		createEReference(enterpriseBeansTypeEClass, ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN);
		createEAttribute(enterpriseBeansTypeEClass, ENTERPRISE_BEANS_TYPE__ID);

		entityBeanTypeEClass = createEClass(ENTITY_BEAN_TYPE);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__DESCRIPTION);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__DISPLAY_NAME);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__ICON);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__EJB_NAME);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__HOME);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__REMOTE);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__LOCAL_HOME);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__LOCAL);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__EJB_CLASS);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__PERSISTENCE_TYPE);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__PRIM_KEY_CLASS);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__REENTRANT);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__CMP_VERSION);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__CMP_FIELD);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__PRIMKEY_FIELD);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__ENV_ENTRY);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__EJB_REF);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__EJB_LOCAL_REF);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__SERVICE_REF);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__RESOURCE_REF);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__RESOURCE_ENV_REF);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__SECURITY_ROLE_REF);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__SECURITY_IDENTITY);
		createEReference(entityBeanTypeEClass, ENTITY_BEAN_TYPE__QUERY);
		createEAttribute(entityBeanTypeEClass, ENTITY_BEAN_TYPE__ID);

		envEntryTypeEClass = createEClass(ENV_ENTRY_TYPE);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__DESCRIPTION);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__ENV_ENTRY_NAME);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__ENV_ENTRY_TYPE);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__ENV_ENTRY_VALUE);
		createEAttribute(envEntryTypeEClass, ENV_ENTRY_TYPE__ID);

		envEntryTypeValuesTypeEClass = createEClass(ENV_ENTRY_TYPE_VALUES_TYPE);

		excludeListTypeEClass = createEClass(EXCLUDE_LIST_TYPE);
		createEReference(excludeListTypeEClass, EXCLUDE_LIST_TYPE__DESCRIPTION);
		createEReference(excludeListTypeEClass, EXCLUDE_LIST_TYPE__METHOD);
		createEAttribute(excludeListTypeEClass, EXCLUDE_LIST_TYPE__ID);

		fullyQualifiedClassTypeEClass = createEClass(FULLY_QUALIFIED_CLASS_TYPE);

		genericBooleanTypeEClass = createEClass(GENERIC_BOOLEAN_TYPE);

		homeTypeEClass = createEClass(HOME_TYPE);

		iconTypeEClass = createEClass(ICON_TYPE);
		createEReference(iconTypeEClass, ICON_TYPE__SMALL_ICON);
		createEReference(iconTypeEClass, ICON_TYPE__LARGE_ICON);
		createEAttribute(iconTypeEClass, ICON_TYPE__ID);
		createEAttribute(iconTypeEClass, ICON_TYPE__LANG);

		javaIdentifierTypeEClass = createEClass(JAVA_IDENTIFIER_TYPE);

		javaTypeTypeEClass = createEClass(JAVA_TYPE_TYPE);

		jndiNameTypeEClass = createEClass(JNDI_NAME_TYPE);

		listenerTypeEClass = createEClass(LISTENER_TYPE);
		createEReference(listenerTypeEClass, LISTENER_TYPE__DESCRIPTION);
		createEReference(listenerTypeEClass, LISTENER_TYPE__DISPLAY_NAME);
		createEReference(listenerTypeEClass, LISTENER_TYPE__ICON);
		createEReference(listenerTypeEClass, LISTENER_TYPE__LISTENER_CLASS);
		createEAttribute(listenerTypeEClass, LISTENER_TYPE__ID);

		localHomeTypeEClass = createEClass(LOCAL_HOME_TYPE);

		localTypeEClass = createEClass(LOCAL_TYPE);

		messageDestinationLinkTypeEClass = createEClass(MESSAGE_DESTINATION_LINK_TYPE);

		messageDestinationRefTypeEClass = createEClass(MESSAGE_DESTINATION_REF_TYPE);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK);
		createEAttribute(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__ID);

		messageDestinationTypeEClass = createEClass(MESSAGE_DESTINATION_TYPE);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__DESCRIPTION);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__DISPLAY_NAME);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__ICON);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME);
		createEAttribute(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__ID);

		messageDestinationTypeTypeEClass = createEClass(MESSAGE_DESTINATION_TYPE_TYPE);

		messageDestinationUsageTypeEClass = createEClass(MESSAGE_DESTINATION_USAGE_TYPE);

		messageDrivenBeanTypeEClass = createEClass(MESSAGE_DRIVEN_BEAN_TYPE);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__ICON);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF);
		createEReference(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY);
		createEAttribute(messageDrivenBeanTypeEClass, MESSAGE_DRIVEN_BEAN_TYPE__ID);

		methodIntfTypeEClass = createEClass(METHOD_INTF_TYPE);

		methodNameTypeEClass = createEClass(METHOD_NAME_TYPE);

		methodParamsTypeEClass = createEClass(METHOD_PARAMS_TYPE);
		createEReference(methodParamsTypeEClass, METHOD_PARAMS_TYPE__METHOD_PARAM);
		createEAttribute(methodParamsTypeEClass, METHOD_PARAMS_TYPE__ID);

		methodPermissionTypeEClass = createEClass(METHOD_PERMISSION_TYPE);
		createEReference(methodPermissionTypeEClass, METHOD_PERMISSION_TYPE__DESCRIPTION);
		createEReference(methodPermissionTypeEClass, METHOD_PERMISSION_TYPE__ROLE_NAME);
		createEReference(methodPermissionTypeEClass, METHOD_PERMISSION_TYPE__UNCHECKED);
		createEReference(methodPermissionTypeEClass, METHOD_PERMISSION_TYPE__METHOD);
		createEAttribute(methodPermissionTypeEClass, METHOD_PERMISSION_TYPE__ID);

		methodTypeEClass = createEClass(METHOD_TYPE);
		createEReference(methodTypeEClass, METHOD_TYPE__DESCRIPTION);
		createEReference(methodTypeEClass, METHOD_TYPE__EJB_NAME);
		createEReference(methodTypeEClass, METHOD_TYPE__METHOD_INTF);
		createEReference(methodTypeEClass, METHOD_TYPE__METHOD_NAME);
		createEReference(methodTypeEClass, METHOD_TYPE__METHOD_PARAMS);
		createEAttribute(methodTypeEClass, METHOD_TYPE__ID);

		multiplicityTypeEClass = createEClass(MULTIPLICITY_TYPE);

		paramValueTypeEClass = createEClass(PARAM_VALUE_TYPE);
		createEReference(paramValueTypeEClass, PARAM_VALUE_TYPE__DESCRIPTION);
		createEReference(paramValueTypeEClass, PARAM_VALUE_TYPE__PARAM_NAME);
		createEReference(paramValueTypeEClass, PARAM_VALUE_TYPE__PARAM_VALUE);
		createEAttribute(paramValueTypeEClass, PARAM_VALUE_TYPE__ID);

		pathTypeEClass = createEClass(PATH_TYPE);

		persistenceTypeTypeEClass = createEClass(PERSISTENCE_TYPE_TYPE);

		portComponentRefTypeEClass = createEClass(PORT_COMPONENT_REF_TYPE);
		createEReference(portComponentRefTypeEClass, PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE);
		createEReference(portComponentRefTypeEClass, PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK);
		createEAttribute(portComponentRefTypeEClass, PORT_COMPONENT_REF_TYPE__ID);

		queryMethodTypeEClass = createEClass(QUERY_METHOD_TYPE);
		createEReference(queryMethodTypeEClass, QUERY_METHOD_TYPE__METHOD_NAME);
		createEReference(queryMethodTypeEClass, QUERY_METHOD_TYPE__METHOD_PARAMS);
		createEAttribute(queryMethodTypeEClass, QUERY_METHOD_TYPE__ID);

		queryTypeEClass = createEClass(QUERY_TYPE);
		createEReference(queryTypeEClass, QUERY_TYPE__DESCRIPTION);
		createEReference(queryTypeEClass, QUERY_TYPE__QUERY_METHOD);
		createEReference(queryTypeEClass, QUERY_TYPE__RESULT_TYPE_MAPPING);
		createEReference(queryTypeEClass, QUERY_TYPE__EJB_QL);
		createEAttribute(queryTypeEClass, QUERY_TYPE__ID);

		relationshipRoleSourceTypeEClass = createEClass(RELATIONSHIP_ROLE_SOURCE_TYPE);
		createEReference(relationshipRoleSourceTypeEClass, RELATIONSHIP_ROLE_SOURCE_TYPE__DESCRIPTION);
		createEReference(relationshipRoleSourceTypeEClass, RELATIONSHIP_ROLE_SOURCE_TYPE__EJB_NAME);
		createEAttribute(relationshipRoleSourceTypeEClass, RELATIONSHIP_ROLE_SOURCE_TYPE__ID);

		relationshipsTypeEClass = createEClass(RELATIONSHIPS_TYPE);
		createEReference(relationshipsTypeEClass, RELATIONSHIPS_TYPE__DESCRIPTION);
		createEReference(relationshipsTypeEClass, RELATIONSHIPS_TYPE__EJB_RELATION);
		createEAttribute(relationshipsTypeEClass, RELATIONSHIPS_TYPE__ID);

		remoteTypeEClass = createEClass(REMOTE_TYPE);

		resAuthTypeEClass = createEClass(RES_AUTH_TYPE);

		resourceEnvRefTypeEClass = createEClass(RESOURCE_ENV_REF_TYPE);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__DESCRIPTION);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE);
		createEAttribute(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__ID);

		resourceRefTypeEClass = createEClass(RESOURCE_REF_TYPE);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__DESCRIPTION);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_REF_NAME);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_TYPE);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_AUTH);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_SHARING_SCOPE);
		createEAttribute(resourceRefTypeEClass, RESOURCE_REF_TYPE__ID);

		resSharingScopeTypeEClass = createEClass(RES_SHARING_SCOPE_TYPE);

		resultTypeMappingTypeEClass = createEClass(RESULT_TYPE_MAPPING_TYPE);

		roleNameTypeEClass = createEClass(ROLE_NAME_TYPE);

		runAsTypeEClass = createEClass(RUN_AS_TYPE);
		createEReference(runAsTypeEClass, RUN_AS_TYPE__DESCRIPTION);
		createEReference(runAsTypeEClass, RUN_AS_TYPE__ROLE_NAME);
		createEAttribute(runAsTypeEClass, RUN_AS_TYPE__ID);

		securityIdentityTypeEClass = createEClass(SECURITY_IDENTITY_TYPE);
		createEReference(securityIdentityTypeEClass, SECURITY_IDENTITY_TYPE__DESCRIPTION);
		createEReference(securityIdentityTypeEClass, SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY);
		createEReference(securityIdentityTypeEClass, SECURITY_IDENTITY_TYPE__RUN_AS);
		createEAttribute(securityIdentityTypeEClass, SECURITY_IDENTITY_TYPE__ID);

		securityRoleRefTypeEClass = createEClass(SECURITY_ROLE_REF_TYPE);
		createEReference(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__DESCRIPTION);
		createEReference(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__ROLE_NAME);
		createEReference(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__ROLE_LINK);
		createEAttribute(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__ID);

		securityRoleTypeEClass = createEClass(SECURITY_ROLE_TYPE);
		createEReference(securityRoleTypeEClass, SECURITY_ROLE_TYPE__DESCRIPTION);
		createEReference(securityRoleTypeEClass, SECURITY_ROLE_TYPE__ROLE_NAME);
		createEAttribute(securityRoleTypeEClass, SECURITY_ROLE_TYPE__ID);

		serviceRefHandlerTypeEClass = createEClass(SERVICE_REF_HANDLER_TYPE);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__DESCRIPTION);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__ICON);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__HANDLER_NAME);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__INIT_PARAM);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__SOAP_HEADER);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__SOAP_ROLE);
		createEReference(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__PORT_NAME);
		createEAttribute(serviceRefHandlerTypeEClass, SERVICE_REF_HANDLER_TYPE__ID);

		serviceRefTypeEClass = createEClass(SERVICE_REF_TYPE);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__DESCRIPTION);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__DISPLAY_NAME);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__ICON);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__SERVICE_REF_NAME);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__SERVICE_INTERFACE);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__WSDL_FILE);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__SERVICE_QNAME);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__PORT_COMPONENT_REF);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__HANDLER);
		createEAttribute(serviceRefTypeEClass, SERVICE_REF_TYPE__ID);

		sessionBeanTypeEClass = createEClass(SESSION_BEAN_TYPE);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__DESCRIPTION);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__DISPLAY_NAME);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__ICON);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__EJB_NAME);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__HOME);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__REMOTE);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__LOCAL_HOME);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__LOCAL);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__SERVICE_ENDPOINT);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__EJB_CLASS);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__SESSION_TYPE);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__TRANSACTION_TYPE);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__ENV_ENTRY);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__EJB_REF);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__EJB_LOCAL_REF);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__SERVICE_REF);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__RESOURCE_REF);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__RESOURCE_ENV_REF);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__SECURITY_ROLE_REF);
		createEReference(sessionBeanTypeEClass, SESSION_BEAN_TYPE__SECURITY_IDENTITY);
		createEAttribute(sessionBeanTypeEClass, SESSION_BEAN_TYPE__ID);

		sessionTypeTypeEClass = createEClass(SESSION_TYPE_TYPE);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);
		createEAttribute(stringEClass, STRING__ID);

		transactionTypeTypeEClass = createEClass(TRANSACTION_TYPE_TYPE);

		transAttributeTypeEClass = createEClass(TRANS_ATTRIBUTE_TYPE);

		trueFalseTypeEClass = createEClass(TRUE_FALSE_TYPE);

		urlPatternTypeEClass = createEClass(URL_PATTERN_TYPE);
		createEAttribute(urlPatternTypeEClass, URL_PATTERN_TYPE__VALUE);

		xsdAnyURITypeEClass = createEClass(XSD_ANY_URI_TYPE);
		createEAttribute(xsdAnyURITypeEClass, XSD_ANY_URI_TYPE__VALUE);
		createEAttribute(xsdAnyURITypeEClass, XSD_ANY_URI_TYPE__ID);

		xsdBooleanTypeEClass = createEClass(XSD_BOOLEAN_TYPE);
		createEAttribute(xsdBooleanTypeEClass, XSD_BOOLEAN_TYPE__VALUE);
		createEAttribute(xsdBooleanTypeEClass, XSD_BOOLEAN_TYPE__ID);

		xsdIntegerTypeEClass = createEClass(XSD_INTEGER_TYPE);
		createEAttribute(xsdIntegerTypeEClass, XSD_INTEGER_TYPE__VALUE);
		createEAttribute(xsdIntegerTypeEClass, XSD_INTEGER_TYPE__ID);

		xsdNMTOKENTypeEClass = createEClass(XSD_NMTOKEN_TYPE);
		createEAttribute(xsdNMTOKENTypeEClass, XSD_NMTOKEN_TYPE__VALUE);
		createEAttribute(xsdNMTOKENTypeEClass, XSD_NMTOKEN_TYPE__ID);

		xsdNonNegativeIntegerTypeEClass = createEClass(XSD_NON_NEGATIVE_INTEGER_TYPE);
		createEAttribute(xsdNonNegativeIntegerTypeEClass, XSD_NON_NEGATIVE_INTEGER_TYPE__VALUE);
		createEAttribute(xsdNonNegativeIntegerTypeEClass, XSD_NON_NEGATIVE_INTEGER_TYPE__ID);

		xsdPositiveIntegerTypeEClass = createEClass(XSD_POSITIVE_INTEGER_TYPE);
		createEAttribute(xsdPositiveIntegerTypeEClass, XSD_POSITIVE_INTEGER_TYPE__VALUE);
		createEAttribute(xsdPositiveIntegerTypeEClass, XSD_POSITIVE_INTEGER_TYPE__ID);

		xsdQNameTypeEClass = createEClass(XSD_QNAME_TYPE);
		createEAttribute(xsdQNameTypeEClass, XSD_QNAME_TYPE__VALUE);
		createEAttribute(xsdQNameTypeEClass, XSD_QNAME_TYPE__ID);

		xsdStringTypeEClass = createEClass(XSD_STRING_TYPE);
		createEAttribute(xsdStringTypeEClass, XSD_STRING_TYPE__VALUE);
		createEAttribute(xsdStringTypeEClass, XSD_STRING_TYPE__ID);

		// Create enums
		cmpVersionTypeBaseEEnum = createEEnum(CMP_VERSION_TYPE_BASE);
		cmrFieldTypeTypeBaseEEnum = createEEnum(CMR_FIELD_TYPE_TYPE_BASE);
		ejbRefTypeTypeBaseEEnum = createEEnum(EJB_REF_TYPE_TYPE_BASE);
		envEntryTypeValuesTypeBaseEEnum = createEEnum(ENV_ENTRY_TYPE_VALUES_TYPE_BASE);
		genericBooleanTypeBaseEEnum = createEEnum(GENERIC_BOOLEAN_TYPE_BASE);
		messageDestinationUsageTypeBaseEEnum = createEEnum(MESSAGE_DESTINATION_USAGE_TYPE_BASE);
		methodIntfTypeBaseEEnum = createEEnum(METHOD_INTF_TYPE_BASE);
		multiplicityTypeBaseEEnum = createEEnum(MULTIPLICITY_TYPE_BASE);
		persistenceTypeTypeBaseEEnum = createEEnum(PERSISTENCE_TYPE_TYPE_BASE);
		resAuthTypeBaseEEnum = createEEnum(RES_AUTH_TYPE_BASE);
		resSharingScopeTypeBaseEEnum = createEEnum(RES_SHARING_SCOPE_TYPE_BASE);
		resultTypeMappingTypeBaseEEnum = createEEnum(RESULT_TYPE_MAPPING_TYPE_BASE);
		sessionTypeTypeBaseEEnum = createEEnum(SESSION_TYPE_TYPE_BASE);
		transactionTypeTypeBaseEEnum = createEEnum(TRANSACTION_TYPE_TYPE_BASE);
		transAttributeTypeBaseEEnum = createEEnum(TRANS_ATTRIBUTE_TYPE_BASE);

		// Create data types
		cmpVersionTypeBaseObjectEDataType = createEDataType(CMP_VERSION_TYPE_BASE_OBJECT);
		cmrFieldTypeTypeBaseObjectEDataType = createEDataType(CMR_FIELD_TYPE_TYPE_BASE_OBJECT);
		deweyVersionTypeEDataType = createEDataType(DEWEY_VERSION_TYPE);
		ejbClassTypeBaseEDataType = createEDataType(EJB_CLASS_TYPE_BASE);
		ejbLinkTypeBaseEDataType = createEDataType(EJB_LINK_TYPE_BASE);
		ejbNameTypeBaseEDataType = createEDataType(EJB_NAME_TYPE_BASE);
		ejbRefNameTypeBaseEDataType = createEDataType(EJB_REF_NAME_TYPE_BASE);
		ejbRefTypeTypeBaseObjectEDataType = createEDataType(EJB_REF_TYPE_TYPE_BASE_OBJECT);
		envEntryTypeValuesTypeBaseObjectEDataType = createEDataType(ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT);
		fullyQualifiedClassTypeBaseEDataType = createEDataType(FULLY_QUALIFIED_CLASS_TYPE_BASE);
		genericBooleanTypeBaseObjectEDataType = createEDataType(GENERIC_BOOLEAN_TYPE_BASE_OBJECT);
		homeTypeBaseEDataType = createEDataType(HOME_TYPE_BASE);
		javaIdentifierTypeBaseEDataType = createEDataType(JAVA_IDENTIFIER_TYPE_BASE);
		javaTypeTypeBaseEDataType = createEDataType(JAVA_TYPE_TYPE_BASE);
		jndiNameTypeBaseEDataType = createEDataType(JNDI_NAME_TYPE_BASE);
		localHomeTypeBaseEDataType = createEDataType(LOCAL_HOME_TYPE_BASE);
		localTypeBaseEDataType = createEDataType(LOCAL_TYPE_BASE);
		messageDestinationLinkTypeBaseEDataType = createEDataType(MESSAGE_DESTINATION_LINK_TYPE_BASE);
		messageDestinationTypeTypeBaseEDataType = createEDataType(MESSAGE_DESTINATION_TYPE_TYPE_BASE);
		messageDestinationUsageTypeBaseObjectEDataType = createEDataType(MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT);
		methodIntfTypeBaseObjectEDataType = createEDataType(METHOD_INTF_TYPE_BASE_OBJECT);
		methodNameTypeBaseEDataType = createEDataType(METHOD_NAME_TYPE_BASE);
		multiplicityTypeBaseObjectEDataType = createEDataType(MULTIPLICITY_TYPE_BASE_OBJECT);
		pathTypeBaseEDataType = createEDataType(PATH_TYPE_BASE);
		persistenceTypeTypeBaseObjectEDataType = createEDataType(PERSISTENCE_TYPE_TYPE_BASE_OBJECT);
		remoteTypeBaseEDataType = createEDataType(REMOTE_TYPE_BASE);
		resAuthTypeBaseObjectEDataType = createEDataType(RES_AUTH_TYPE_BASE_OBJECT);
		resSharingScopeTypeBaseObjectEDataType = createEDataType(RES_SHARING_SCOPE_TYPE_BASE_OBJECT);
		resultTypeMappingTypeBaseObjectEDataType = createEDataType(RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT);
		roleNameTypeBaseEDataType = createEDataType(ROLE_NAME_TYPE_BASE);
		sessionTypeTypeBaseObjectEDataType = createEDataType(SESSION_TYPE_TYPE_BASE_OBJECT);
		transactionTypeTypeBaseObjectEDataType = createEDataType(TRANSACTION_TYPE_TYPE_BASE_OBJECT);
		transAttributeTypeBaseObjectEDataType = createEDataType(TRANS_ATTRIBUTE_TYPE_BASE_OBJECT);
		trueFalseTypeBaseEDataType = createEDataType(TRUE_FALSE_TYPE_BASE);
		trueFalseTypeBaseObjectEDataType = createEDataType(TRUE_FALSE_TYPE_BASE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cmpVersionTypeEClass.getESuperTypes().add(this.getString());
		cmrFieldTypeTypeEClass.getESuperTypes().add(this.getString());
		descriptionTypeEClass.getESuperTypes().add(this.getXsdStringType());
		displayNameTypeEClass.getESuperTypes().add(this.getString());
		ejbClassTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		ejbLinkTypeEClass.getESuperTypes().add(this.getString());
		ejbNameTypeEClass.getESuperTypes().add(this.getXsdNMTOKENType());
		ejbRefNameTypeEClass.getESuperTypes().add(this.getJndiNameType());
		ejbRefTypeTypeEClass.getESuperTypes().add(this.getString());
		envEntryTypeValuesTypeEClass.getESuperTypes().add(this.getString());
		fullyQualifiedClassTypeEClass.getESuperTypes().add(this.getString());
		genericBooleanTypeEClass.getESuperTypes().add(this.getString());
		homeTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		javaIdentifierTypeEClass.getESuperTypes().add(this.getString());
		javaTypeTypeEClass.getESuperTypes().add(this.getString());
		jndiNameTypeEClass.getESuperTypes().add(this.getString());
		localHomeTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		localTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		messageDestinationLinkTypeEClass.getESuperTypes().add(this.getString());
		messageDestinationTypeTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		messageDestinationUsageTypeEClass.getESuperTypes().add(this.getString());
		methodIntfTypeEClass.getESuperTypes().add(this.getString());
		methodNameTypeEClass.getESuperTypes().add(this.getString());
		multiplicityTypeEClass.getESuperTypes().add(this.getString());
		pathTypeEClass.getESuperTypes().add(this.getString());
		persistenceTypeTypeEClass.getESuperTypes().add(this.getString());
		remoteTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		resAuthTypeEClass.getESuperTypes().add(this.getString());
		resSharingScopeTypeEClass.getESuperTypes().add(this.getString());
		resultTypeMappingTypeEClass.getESuperTypes().add(this.getString());
		roleNameTypeEClass.getESuperTypes().add(this.getString());
		sessionTypeTypeEClass.getESuperTypes().add(this.getString());
		transactionTypeTypeEClass.getESuperTypes().add(this.getString());
		transAttributeTypeEClass.getESuperTypes().add(this.getString());
		trueFalseTypeEClass.getESuperTypes().add(this.getXsdBooleanType());

		// Initialize classes and features; add operations and parameters
		initEClass(activationConfigPropertyTypeEClass, ActivationConfigPropertyType.class, "ActivationConfigPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getActivationConfigPropertyType_ActivationConfigPropertyName(), this.getXsdStringType(), null, "activationConfigPropertyName", null, 1, 1, ActivationConfigPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivationConfigPropertyType_ActivationConfigPropertyValue(), this.getXsdStringType(), null, "activationConfigPropertyValue", null, 1, 1, ActivationConfigPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getActivationConfigPropertyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ActivationConfigPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(activationConfigTypeEClass, ActivationConfigType.class, "ActivationConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getActivationConfigType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ActivationConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivationConfigType_ActivationConfigProperty(), this.getActivationConfigPropertyType(), null, "activationConfigProperty", null, 1, -1, ActivationConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getActivationConfigType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ActivationConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(assemblyDescriptorTypeEClass, AssemblyDescriptorType.class, "AssemblyDescriptorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAssemblyDescriptorType_SecurityRole(), this.getSecurityRoleType(), null, "securityRole", null, 0, -1, AssemblyDescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssemblyDescriptorType_MethodPermission(), this.getMethodPermissionType(), null, "methodPermission", null, 0, -1, AssemblyDescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssemblyDescriptorType_ContainerTransaction(), this.getContainerTransactionType(), null, "containerTransaction", null, 0, -1, AssemblyDescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssemblyDescriptorType_MessageDestination(), this.getMessageDestinationType(), null, "messageDestination", null, 0, -1, AssemblyDescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssemblyDescriptorType_ExcludeList(), this.getExcludeListType(), null, "excludeList", null, 0, 1, AssemblyDescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAssemblyDescriptorType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AssemblyDescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmpFieldTypeEClass, CmpFieldType.class, "CmpFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCmpFieldType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, CmpFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmpFieldType_FieldName(), this.getJavaIdentifierType(), null, "fieldName", null, 1, 1, CmpFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmpFieldType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CmpFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmpVersionTypeEClass, CmpVersionType.class, "CmpVersionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(cmrFieldTypeEClass, CmrFieldType.class, "CmrFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCmrFieldType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, CmrFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmrFieldType_CmrFieldName(), this.getString(), null, "cmrFieldName", null, 1, 1, CmrFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmrFieldType_CmrFieldType(), this.getCmrFieldTypeType(), null, "cmrFieldType", null, 0, 1, CmrFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmrFieldType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CmrFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmrFieldTypeTypeEClass, CmrFieldTypeType.class, "CmrFieldTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(containerTransactionTypeEClass, ContainerTransactionType.class, "ContainerTransactionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContainerTransactionType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ContainerTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getContainerTransactionType_Method(), this.getMethodType(), null, "method", null, 1, -1, ContainerTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getContainerTransactionType_TransAttribute(), this.getTransAttributeType(), null, "transAttribute", null, 1, 1, ContainerTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getContainerTransactionType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ContainerTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDescriptionType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(displayNameTypeEClass, DisplayNameType.class, "DisplayNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDisplayNameType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, DisplayNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_EjbJar(), this.getEjbJarType(), null, "ejbJar", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ejbClassTypeEClass, EjbClassType.class, "EjbClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ejbJarTypeEClass, EjbJarType.class, "EjbJarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEjbJarType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbJarType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbJarType_Icon(), this.getIconType(), null, "icon", null, 0, -1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbJarType_EnterpriseBeans(), this.getEnterpriseBeansType(), null, "enterpriseBeans", null, 1, 1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbJarType_Relationships(), this.getRelationshipsType(), null, "relationships", null, 0, 1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbJarType_AssemblyDescriptor(), this.getAssemblyDescriptorType(), null, "assemblyDescriptor", null, 0, 1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbJarType_EjbClientJar(), this.getPathType(), null, "ejbClientJar", null, 0, 1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbJarType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbJarType_Version(), this.getDeweyVersionType(), "version", "2.1", 1, 1, EjbJarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(ejbLinkTypeEClass, EjbLinkType.class, "EjbLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ejbLocalRefTypeEClass, EjbLocalRefType.class, "EjbLocalRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_EjbRefName(), this.getEjbRefNameType(), null, "ejbRefName", null, 1, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_EjbRefType(), this.getEjbRefTypeType(), null, "ejbRefType", null, 1, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_LocalHome(), this.getLocalHomeType(), null, "localHome", null, 1, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_Local(), this.getLocalType(), null, "local", null, 1, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_EjbLink(), this.getEjbLinkType(), null, "ejbLink", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbLocalRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ejbNameTypeEClass, EjbNameType.class, "EjbNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ejbRefNameTypeEClass, EjbRefNameType.class, "EjbRefNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ejbRefTypeEClass, EjbRefType.class, "EjbRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEjbRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_EjbRefName(), this.getEjbRefNameType(), null, "ejbRefName", null, 1, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_EjbRefType(), this.getEjbRefTypeType(), null, "ejbRefType", null, 1, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_Home(), this.getHomeType(), null, "home", null, 1, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_Remote(), this.getRemoteType(), null, "remote", null, 1, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_EjbLink(), this.getEjbLinkType(), null, "ejbLink", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ejbRefTypeTypeEClass, EjbRefTypeType.class, "EjbRefTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ejbRelationshipRoleTypeEClass, EjbRelationshipRoleType.class, "EjbRelationshipRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEjbRelationshipRoleType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EjbRelationshipRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationshipRoleType_EjbRelationshipRoleName(), this.getString(), null, "ejbRelationshipRoleName", null, 0, 1, EjbRelationshipRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationshipRoleType_Multiplicity(), this.getMultiplicityType(), null, "multiplicity", null, 1, 1, EjbRelationshipRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationshipRoleType_CascadeDelete(), this.getEmptyType(), null, "cascadeDelete", null, 0, 1, EjbRelationshipRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationshipRoleType_RelationshipRoleSource(), this.getRelationshipRoleSourceType(), null, "relationshipRoleSource", null, 1, 1, EjbRelationshipRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationshipRoleType_CmrField(), this.getCmrFieldType(), null, "cmrField", null, 0, 1, EjbRelationshipRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbRelationshipRoleType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EjbRelationshipRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ejbRelationTypeEClass, EjbRelationType.class, "EjbRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEjbRelationType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EjbRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationType_EjbRelationName(), this.getString(), null, "ejbRelationName", null, 0, 1, EjbRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationType_EjbRelationshipRole(), this.getEjbRelationshipRoleType(), null, "ejbRelationshipRole", null, 1, 1, EjbRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRelationType_EjbRelationshipRole1(), this.getEjbRelationshipRoleType(), null, "ejbRelationshipRole1", null, 1, 1, EjbRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbRelationType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EjbRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(emptyTypeEClass, EmptyType.class, "EmptyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEmptyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EmptyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(enterpriseBeansTypeEClass, EnterpriseBeansType.class, "EnterpriseBeansType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEnterpriseBeansType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EnterpriseBeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseBeansType_Session(), this.getSessionBeanType(), null, "session", null, 0, -1, EnterpriseBeansType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseBeansType_Entity(), this.getEntityBeanType(), null, "entity", null, 0, -1, EnterpriseBeansType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseBeansType_MessageDriven(), this.getMessageDrivenBeanType(), null, "messageDriven", null, 0, -1, EnterpriseBeansType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEnterpriseBeansType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EnterpriseBeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(entityBeanTypeEClass, EntityBeanType.class, "EntityBeanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEntityBeanType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_Icon(), this.getIconType(), null, "icon", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_EjbName(), this.getEjbNameType(), null, "ejbName", null, 1, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_Home(), this.getHomeType(), null, "home", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_Remote(), this.getRemoteType(), null, "remote", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_LocalHome(), this.getLocalHomeType(), null, "localHome", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_Local(), this.getLocalType(), null, "local", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_EjbClass(), this.getEjbClassType(), null, "ejbClass", null, 1, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_PersistenceType(), this.getPersistenceTypeType(), null, "persistenceType", null, 1, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_PrimKeyClass(), this.getFullyQualifiedClassType(), null, "primKeyClass", null, 1, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_Reentrant(), this.getTrueFalseType(), null, "reentrant", null, 1, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_CmpVersion(), this.getCmpVersionType(), null, "cmpVersion", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_AbstractSchemaName(), this.getJavaIdentifierType(), null, "abstractSchemaName", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_CmpField(), this.getCmpFieldType(), null, "cmpField", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_PrimkeyField(), this.getString(), null, "primkeyField", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_EnvEntry(), this.getEnvEntryType(), null, "envEntry", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_EjbRef(), this.getEjbRefType(), null, "ejbRef", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_EjbLocalRef(), this.getEjbLocalRefType(), null, "ejbLocalRef", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_ServiceRef(), this.getServiceRefType(), null, "serviceRef", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_ResourceRef(), this.getResourceRefType(), null, "resourceRef", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_ResourceEnvRef(), this.getResourceEnvRefType(), null, "resourceEnvRef", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_MessageDestinationRef(), this.getMessageDestinationRefType(), null, "messageDestinationRef", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_SecurityRoleRef(), this.getSecurityRoleRefType(), null, "securityRoleRef", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_SecurityIdentity(), this.getSecurityIdentityType(), null, "securityIdentity", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEntityBeanType_Query(), this.getQueryType(), null, "query", null, 0, -1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEntityBeanType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EntityBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(envEntryTypeEClass, EnvEntryType.class, "EnvEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEnvEntryType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_EnvEntryName(), this.getJndiNameType(), null, "envEntryName", null, 1, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_EnvEntryType(), this.getEnvEntryTypeValuesType(), null, "envEntryType", null, 1, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_EnvEntryValue(), this.getXsdStringType(), null, "envEntryValue", null, 0, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEnvEntryType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(envEntryTypeValuesTypeEClass, EnvEntryTypeValuesType.class, "EnvEntryTypeValuesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(excludeListTypeEClass, ExcludeListType.class, "ExcludeListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExcludeListType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ExcludeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExcludeListType_Method(), this.getMethodType(), null, "method", null, 1, -1, ExcludeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExcludeListType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ExcludeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(fullyQualifiedClassTypeEClass, FullyQualifiedClassType.class, "FullyQualifiedClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(genericBooleanTypeEClass, GenericBooleanType.class, "GenericBooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(homeTypeEClass, HomeType.class, "HomeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iconTypeEClass, IconType.class, "IconType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIconType_SmallIcon(), this.getPathType(), null, "smallIcon", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIconType_LargeIcon(), this.getPathType(), null, "largeIcon", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getIconType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getIconType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(javaIdentifierTypeEClass, JavaIdentifierType.class, "JavaIdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(javaTypeTypeEClass, JavaTypeType.class, "JavaTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(jndiNameTypeEClass, JndiNameType.class, "JndiNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(listenerTypeEClass, ListenerType.class, "ListenerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getListenerType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getListenerType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getListenerType_Icon(), this.getIconType(), null, "icon", null, 0, -1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getListenerType_ListenerClass(), this.getFullyQualifiedClassType(), null, "listenerClass", null, 1, 1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getListenerType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(localHomeTypeEClass, LocalHomeType.class, "LocalHomeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(localTypeEClass, LocalType.class, "LocalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(messageDestinationLinkTypeEClass, MessageDestinationLinkType.class, "MessageDestinationLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(messageDestinationRefTypeEClass, MessageDestinationRefType.class, "MessageDestinationRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationRefName(), this.getJndiNameType(), null, "messageDestinationRefName", null, 1, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationType(), this.getMessageDestinationTypeType(), null, "messageDestinationType", null, 1, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationUsage(), this.getMessageDestinationUsageType(), null, "messageDestinationUsage", null, 1, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationLink(), this.getMessageDestinationLinkType(), null, "messageDestinationLink", null, 0, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMessageDestinationRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageDestinationTypeEClass, MessageDestinationType.class, "MessageDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMessageDestinationType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationType_Icon(), this.getIconType(), null, "icon", null, 0, -1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationType_MessageDestinationName(), this.getString(), null, "messageDestinationName", null, 1, 1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMessageDestinationType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageDestinationTypeTypeEClass, MessageDestinationTypeType.class, "MessageDestinationTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(messageDestinationUsageTypeEClass, MessageDestinationUsageType.class, "MessageDestinationUsageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(messageDrivenBeanTypeEClass, MessageDrivenBeanType.class, "MessageDrivenBeanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_Icon(), this.getIconType(), null, "icon", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_EjbName(), this.getEjbNameType(), null, "ejbName", null, 1, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_EjbClass(), this.getEjbClassType(), null, "ejbClass", null, 1, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_MessagingType(), this.getFullyQualifiedClassType(), null, "messagingType", null, 0, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_TransactionType(), this.getTransactionTypeType(), null, "transactionType", null, 1, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_MessageDestinationType(), this.getMessageDestinationTypeType(), null, "messageDestinationType", null, 0, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_MessageDestinationLink(), this.getMessageDestinationLinkType(), null, "messageDestinationLink", null, 0, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_ActivationConfig(), this.getActivationConfigType(), null, "activationConfig", null, 0, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_EnvEntry(), this.getEnvEntryType(), null, "envEntry", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_EjbRef(), this.getEjbRefType(), null, "ejbRef", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_EjbLocalRef(), this.getEjbLocalRefType(), null, "ejbLocalRef", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_ServiceRef(), this.getServiceRefType(), null, "serviceRef", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_ResourceRef(), this.getResourceRefType(), null, "resourceRef", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_ResourceEnvRef(), this.getResourceEnvRefType(), null, "resourceEnvRef", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_MessageDestinationRef(), this.getMessageDestinationRefType(), null, "messageDestinationRef", null, 0, -1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDrivenBeanType_SecurityIdentity(), this.getSecurityIdentityType(), null, "securityIdentity", null, 0, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMessageDrivenBeanType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MessageDrivenBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(methodIntfTypeEClass, MethodIntfType.class, "MethodIntfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(methodNameTypeEClass, MethodNameType.class, "MethodNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(methodParamsTypeEClass, MethodParamsType.class, "MethodParamsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMethodParamsType_MethodParam(), this.getJavaTypeType(), null, "methodParam", null, 0, -1, MethodParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodParamsType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MethodParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(methodPermissionTypeEClass, MethodPermissionType.class, "MethodPermissionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMethodPermissionType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MethodPermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodPermissionType_RoleName(), this.getRoleNameType(), null, "roleName", null, 0, -1, MethodPermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodPermissionType_Unchecked(), this.getEmptyType(), null, "unchecked", null, 0, 1, MethodPermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodPermissionType_Method(), this.getMethodType(), null, "method", null, 1, -1, MethodPermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodPermissionType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MethodPermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(methodTypeEClass, MethodType.class, "MethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMethodType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodType_EjbName(), this.getEjbNameType(), null, "ejbName", null, 1, 1, MethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodType_MethodIntf(), this.getMethodIntfType(), null, "methodIntf", null, 0, 1, MethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodType_MethodName(), this.getMethodNameType(), null, "methodName", null, 1, 1, MethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodType_MethodParams(), this.getMethodParamsType(), null, "methodParams", null, 0, 1, MethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(multiplicityTypeEClass, MultiplicityType.class, "MultiplicityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(paramValueTypeEClass, ParamValueType.class, "ParamValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getParamValueType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParamValueType_ParamName(), this.getString(), null, "paramName", null, 1, 1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParamValueType_ParamValue(), this.getXsdStringType(), null, "paramValue", null, 1, 1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParamValueType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(pathTypeEClass, PathType.class, "PathType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(persistenceTypeTypeEClass, PersistenceTypeType.class, "PersistenceTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(portComponentRefTypeEClass, PortComponentRefType.class, "PortComponentRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPortComponentRefType_ServiceEndpointInterface(), this.getFullyQualifiedClassType(), null, "serviceEndpointInterface", null, 1, 1, PortComponentRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPortComponentRefType_PortComponentLink(), this.getString(), null, "portComponentLink", null, 0, 1, PortComponentRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPortComponentRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PortComponentRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(queryMethodTypeEClass, QueryMethodType.class, "QueryMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getQueryMethodType_MethodName(), this.getMethodNameType(), null, "methodName", null, 1, 1, QueryMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getQueryMethodType_MethodParams(), this.getMethodParamsType(), null, "methodParams", null, 1, 1, QueryMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getQueryMethodType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QueryMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(queryTypeEClass, QueryType.class, "QueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getQueryType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getQueryType_QueryMethod(), this.getQueryMethodType(), null, "queryMethod", null, 1, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getQueryType_ResultTypeMapping(), this.getResultTypeMappingType(), null, "resultTypeMapping", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getQueryType_EjbQl(), this.getXsdStringType(), null, "ejbQl", null, 1, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getQueryType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(relationshipRoleSourceTypeEClass, RelationshipRoleSourceType.class, "RelationshipRoleSourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRelationshipRoleSourceType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, RelationshipRoleSourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRelationshipRoleSourceType_EjbName(), this.getEjbNameType(), null, "ejbName", null, 1, 1, RelationshipRoleSourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRelationshipRoleSourceType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RelationshipRoleSourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(relationshipsTypeEClass, RelationshipsType.class, "RelationshipsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRelationshipsType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, RelationshipsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRelationshipsType_EjbRelation(), this.getEjbRelationType(), null, "ejbRelation", null, 1, -1, RelationshipsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRelationshipsType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RelationshipsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(remoteTypeEClass, RemoteType.class, "RemoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(resAuthTypeEClass, ResAuthType.class, "ResAuthType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(resourceEnvRefTypeEClass, ResourceEnvRefType.class, "ResourceEnvRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_ResourceEnvRefName(), this.getJndiNameType(), null, "resourceEnvRefName", null, 1, 1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_ResourceEnvRefType(), this.getFullyQualifiedClassType(), null, "resourceEnvRefType", null, 1, 1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getResourceEnvRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(resourceRefTypeEClass, ResourceRefType.class, "ResourceRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResourceRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResRefName(), this.getJndiNameType(), null, "resRefName", null, 1, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResType(), this.getFullyQualifiedClassType(), null, "resType", null, 1, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResAuth(), this.getResAuthType(), null, "resAuth", null, 1, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResSharingScope(), this.getResSharingScopeType(), null, "resSharingScope", null, 0, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getResourceRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(resSharingScopeTypeEClass, ResSharingScopeType.class, "ResSharingScopeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(resultTypeMappingTypeEClass, ResultTypeMappingType.class, "ResultTypeMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(roleNameTypeEClass, RoleNameType.class, "RoleNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(runAsTypeEClass, RunAsType.class, "RunAsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRunAsType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, RunAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRunAsType_RoleName(), this.getRoleNameType(), null, "roleName", null, 1, 1, RunAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRunAsType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RunAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(securityIdentityTypeEClass, SecurityIdentityType.class, "SecurityIdentityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSecurityIdentityType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, SecurityIdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityIdentityType_UseCallerIdentity(), this.getEmptyType(), null, "useCallerIdentity", null, 0, 1, SecurityIdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityIdentityType_RunAs(), this.getRunAsType(), null, "runAs", null, 0, 1, SecurityIdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSecurityIdentityType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityIdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(securityRoleRefTypeEClass, SecurityRoleRefType.class, "SecurityRoleRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSecurityRoleRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityRoleRefType_RoleName(), this.getRoleNameType(), null, "roleName", null, 1, 1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityRoleRefType_RoleLink(), this.getRoleNameType(), null, "roleLink", null, 0, 1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSecurityRoleRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(securityRoleTypeEClass, SecurityRoleType.class, "SecurityRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSecurityRoleType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, SecurityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityRoleType_RoleName(), this.getRoleNameType(), null, "roleName", null, 1, 1, SecurityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSecurityRoleType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(serviceRefHandlerTypeEClass, ServiceRefHandlerType.class, "ServiceRefHandlerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_Icon(), this.getIconType(), null, "icon", null, 0, -1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_HandlerName(), this.getString(), null, "handlerName", null, 1, 1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_HandlerClass(), this.getFullyQualifiedClassType(), null, "handlerClass", null, 1, 1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_InitParam(), this.getParamValueType(), null, "initParam", null, 0, -1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_SoapHeader(), this.getXsdQNameType(), null, "soapHeader", null, 0, -1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_SoapRole(), this.getString(), null, "soapRole", null, 0, -1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerType_PortName(), this.getString(), null, "portName", null, 0, -1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServiceRefHandlerType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ServiceRefHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(serviceRefTypeEClass, ServiceRefType.class, "ServiceRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getServiceRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_Icon(), this.getIconType(), null, "icon", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_ServiceRefName(), this.getJndiNameType(), null, "serviceRefName", null, 1, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_ServiceInterface(), this.getFullyQualifiedClassType(), null, "serviceInterface", null, 1, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_WsdlFile(), this.getXsdAnyURIType(), null, "wsdlFile", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_JaxrpcMappingFile(), this.getPathType(), null, "jaxrpcMappingFile", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_ServiceQname(), this.getXsdQNameType(), null, "serviceQname", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_PortComponentRef(), this.getPortComponentRefType(), null, "portComponentRef", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_Handler(), this.getServiceRefHandlerType(), null, "handler", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServiceRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sessionBeanTypeEClass, SessionBeanType.class, "SessionBeanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSessionBeanType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_Icon(), this.getIconType(), null, "icon", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_EjbName(), this.getEjbNameType(), null, "ejbName", null, 1, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_Home(), this.getHomeType(), null, "home", null, 0, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_Remote(), this.getRemoteType(), null, "remote", null, 0, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_LocalHome(), this.getLocalHomeType(), null, "localHome", null, 0, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_Local(), this.getLocalType(), null, "local", null, 0, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_ServiceEndpoint(), this.getFullyQualifiedClassType(), null, "serviceEndpoint", null, 0, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_EjbClass(), this.getEjbClassType(), null, "ejbClass", null, 1, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_SessionType(), this.getSessionTypeType(), null, "sessionType", null, 1, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_TransactionType(), this.getTransactionTypeType(), null, "transactionType", null, 1, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_EnvEntry(), this.getEnvEntryType(), null, "envEntry", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_EjbRef(), this.getEjbRefType(), null, "ejbRef", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_EjbLocalRef(), this.getEjbLocalRefType(), null, "ejbLocalRef", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_ServiceRef(), this.getServiceRefType(), null, "serviceRef", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_ResourceRef(), this.getResourceRefType(), null, "resourceRef", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_ResourceEnvRef(), this.getResourceEnvRefType(), null, "resourceEnvRef", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_MessageDestinationRef(), this.getMessageDestinationRefType(), null, "messageDestinationRef", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_SecurityRoleRef(), this.getSecurityRoleRefType(), null, "securityRoleRef", null, 0, -1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSessionBeanType_SecurityIdentity(), this.getSecurityIdentityType(), null, "securityIdentity", null, 0, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSessionBeanType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SessionBeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sessionTypeTypeEClass, SessionTypeType.class, "SessionTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stringEClass, org.eclipse.modisco.jee.ejbjar.EjbJar21.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getString_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, org.eclipse.modisco.jee.ejbjar.EjbJar21.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getString_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, org.eclipse.modisco.jee.ejbjar.EjbJar21.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transactionTypeTypeEClass, TransactionTypeType.class, "TransactionTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(transAttributeTypeEClass, TransAttributeType.class, "TransAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(trueFalseTypeEClass, TrueFalseType.class, "TrueFalseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(urlPatternTypeEClass, UrlPatternType.class, "UrlPatternType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getUrlPatternType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, UrlPatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdAnyURITypeEClass, XsdAnyURIType.class, "XsdAnyURIType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdAnyURIType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, XsdAnyURIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdAnyURIType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdAnyURIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdBooleanTypeEClass, XsdBooleanType.class, "XsdBooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdBooleanType_Value(), theXMLTypePackage.getBoolean(), "value", null, 0, 1, XsdBooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdBooleanType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdBooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdIntegerTypeEClass, XsdIntegerType.class, "XsdIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdIntegerType_Value(), theXMLTypePackage.getInteger(), "value", null, 0, 1, XsdIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdIntegerType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdNMTOKENTypeEClass, XsdNMTOKENType.class, "XsdNMTOKENType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdNMTOKENType_Value(), theXMLTypePackage.getNMTOKEN(), "value", null, 0, 1, XsdNMTOKENType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdNMTOKENType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdNMTOKENType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdNonNegativeIntegerTypeEClass, XsdNonNegativeIntegerType.class, "XsdNonNegativeIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdNonNegativeIntegerType_Value(), theXMLTypePackage.getNonNegativeInteger(), "value", null, 0, 1, XsdNonNegativeIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdNonNegativeIntegerType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdNonNegativeIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdPositiveIntegerTypeEClass, XsdPositiveIntegerType.class, "XsdPositiveIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdPositiveIntegerType_Value(), theXMLTypePackage.getPositiveInteger(), "value", null, 0, 1, XsdPositiveIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdPositiveIntegerType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdPositiveIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdQNameTypeEClass, XsdQNameType.class, "XsdQNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdQNameType_Value(), theXMLTypePackage.getQName(), "value", null, 0, 1, XsdQNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdQNameType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdQNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(xsdStringTypeEClass, XsdStringType.class, "XsdStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getXsdStringType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, XsdStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getXsdStringType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, XsdStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(cmpVersionTypeBaseEEnum, CmpVersionTypeBase.class, "CmpVersionTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(cmpVersionTypeBaseEEnum, CmpVersionTypeBase._1X);
		addEEnumLiteral(cmpVersionTypeBaseEEnum, CmpVersionTypeBase._2X);

		initEEnum(cmrFieldTypeTypeBaseEEnum, CmrFieldTypeTypeBase.class, "CmrFieldTypeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(cmrFieldTypeTypeBaseEEnum, CmrFieldTypeTypeBase.JAVA_UTIL_COLLECTION);
		addEEnumLiteral(cmrFieldTypeTypeBaseEEnum, CmrFieldTypeTypeBase.JAVA_UTIL_SET);

		initEEnum(ejbRefTypeTypeBaseEEnum, EjbRefTypeTypeBase.class, "EjbRefTypeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(ejbRefTypeTypeBaseEEnum, EjbRefTypeTypeBase.ENTITY);
		addEEnumLiteral(ejbRefTypeTypeBaseEEnum, EjbRefTypeTypeBase.SESSION);

		initEEnum(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.class, "EnvEntryTypeValuesTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_BOOLEAN);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_BYTE);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_CHARACTER);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_STRING);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_SHORT);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_INTEGER);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_LONG);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_FLOAT);
		addEEnumLiteral(envEntryTypeValuesTypeBaseEEnum, EnvEntryTypeValuesTypeBase.JAVA_LANG_DOUBLE);

		initEEnum(genericBooleanTypeBaseEEnum, GenericBooleanTypeBase.class, "GenericBooleanTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(genericBooleanTypeBaseEEnum, GenericBooleanTypeBase.TRUE);
		addEEnumLiteral(genericBooleanTypeBaseEEnum, GenericBooleanTypeBase.FALSE);
		addEEnumLiteral(genericBooleanTypeBaseEEnum, GenericBooleanTypeBase.YES);
		addEEnumLiteral(genericBooleanTypeBaseEEnum, GenericBooleanTypeBase.NO);

		initEEnum(messageDestinationUsageTypeBaseEEnum, MessageDestinationUsageTypeBase.class, "MessageDestinationUsageTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(messageDestinationUsageTypeBaseEEnum, MessageDestinationUsageTypeBase.CONSUMES);
		addEEnumLiteral(messageDestinationUsageTypeBaseEEnum, MessageDestinationUsageTypeBase.PRODUCES);
		addEEnumLiteral(messageDestinationUsageTypeBaseEEnum, MessageDestinationUsageTypeBase.CONSUMES_PRODUCES);

		initEEnum(methodIntfTypeBaseEEnum, MethodIntfTypeBase.class, "MethodIntfTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(methodIntfTypeBaseEEnum, MethodIntfTypeBase.HOME);
		addEEnumLiteral(methodIntfTypeBaseEEnum, MethodIntfTypeBase.REMOTE);
		addEEnumLiteral(methodIntfTypeBaseEEnum, MethodIntfTypeBase.LOCAL_HOME);
		addEEnumLiteral(methodIntfTypeBaseEEnum, MethodIntfTypeBase.LOCAL);
		addEEnumLiteral(methodIntfTypeBaseEEnum, MethodIntfTypeBase.SERVICE_ENDPOINT);

		initEEnum(multiplicityTypeBaseEEnum, MultiplicityTypeBase.class, "MultiplicityTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(multiplicityTypeBaseEEnum, MultiplicityTypeBase.ONE);
		addEEnumLiteral(multiplicityTypeBaseEEnum, MultiplicityTypeBase.MANY);

		initEEnum(persistenceTypeTypeBaseEEnum, PersistenceTypeTypeBase.class, "PersistenceTypeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(persistenceTypeTypeBaseEEnum, PersistenceTypeTypeBase.BEAN);
		addEEnumLiteral(persistenceTypeTypeBaseEEnum, PersistenceTypeTypeBase.CONTAINER);

		initEEnum(resAuthTypeBaseEEnum, ResAuthTypeBase.class, "ResAuthTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(resAuthTypeBaseEEnum, ResAuthTypeBase.APPLICATION);
		addEEnumLiteral(resAuthTypeBaseEEnum, ResAuthTypeBase.CONTAINER);

		initEEnum(resSharingScopeTypeBaseEEnum, ResSharingScopeTypeBase.class, "ResSharingScopeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(resSharingScopeTypeBaseEEnum, ResSharingScopeTypeBase.SHAREABLE);
		addEEnumLiteral(resSharingScopeTypeBaseEEnum, ResSharingScopeTypeBase.UNSHAREABLE);

		initEEnum(resultTypeMappingTypeBaseEEnum, ResultTypeMappingTypeBase.class, "ResultTypeMappingTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(resultTypeMappingTypeBaseEEnum, ResultTypeMappingTypeBase.LOCAL);
		addEEnumLiteral(resultTypeMappingTypeBaseEEnum, ResultTypeMappingTypeBase.REMOTE);

		initEEnum(sessionTypeTypeBaseEEnum, SessionTypeTypeBase.class, "SessionTypeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(sessionTypeTypeBaseEEnum, SessionTypeTypeBase.STATEFUL);
		addEEnumLiteral(sessionTypeTypeBaseEEnum, SessionTypeTypeBase.STATELESS);

		initEEnum(transactionTypeTypeBaseEEnum, TransactionTypeTypeBase.class, "TransactionTypeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(transactionTypeTypeBaseEEnum, TransactionTypeTypeBase.BEAN);
		addEEnumLiteral(transactionTypeTypeBaseEEnum, TransactionTypeTypeBase.CONTAINER);

		initEEnum(transAttributeTypeBaseEEnum, TransAttributeTypeBase.class, "TransAttributeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(transAttributeTypeBaseEEnum, TransAttributeTypeBase.NOT_SUPPORTED);
		addEEnumLiteral(transAttributeTypeBaseEEnum, TransAttributeTypeBase.SUPPORTS);
		addEEnumLiteral(transAttributeTypeBaseEEnum, TransAttributeTypeBase.REQUIRED);
		addEEnumLiteral(transAttributeTypeBaseEEnum, TransAttributeTypeBase.REQUIRES_NEW);
		addEEnumLiteral(transAttributeTypeBaseEEnum, TransAttributeTypeBase.MANDATORY);
		addEEnumLiteral(transAttributeTypeBaseEEnum, TransAttributeTypeBase.NEVER);

		// Initialize data types
		initEDataType(cmpVersionTypeBaseObjectEDataType, CmpVersionTypeBase.class, "CmpVersionTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(cmrFieldTypeTypeBaseObjectEDataType, CmrFieldTypeTypeBase.class, "CmrFieldTypeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(deweyVersionTypeEDataType, BigDecimal.class, "DeweyVersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbClassTypeBaseEDataType, String.class, "EjbClassTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbLinkTypeBaseEDataType, String.class, "EjbLinkTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbNameTypeBaseEDataType, String.class, "EjbNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbRefNameTypeBaseEDataType, String.class, "EjbRefNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbRefTypeTypeBaseObjectEDataType, EjbRefTypeTypeBase.class, "EjbRefTypeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(envEntryTypeValuesTypeBaseObjectEDataType, EnvEntryTypeValuesTypeBase.class, "EnvEntryTypeValuesTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fullyQualifiedClassTypeBaseEDataType, String.class, "FullyQualifiedClassTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(genericBooleanTypeBaseObjectEDataType, GenericBooleanTypeBase.class, "GenericBooleanTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(homeTypeBaseEDataType, String.class, "HomeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(javaIdentifierTypeBaseEDataType, String.class, "JavaIdentifierTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(javaTypeTypeBaseEDataType, String.class, "JavaTypeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(jndiNameTypeBaseEDataType, String.class, "JndiNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(localHomeTypeBaseEDataType, String.class, "LocalHomeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(localTypeBaseEDataType, String.class, "LocalTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(messageDestinationLinkTypeBaseEDataType, String.class, "MessageDestinationLinkTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(messageDestinationTypeTypeBaseEDataType, String.class, "MessageDestinationTypeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(messageDestinationUsageTypeBaseObjectEDataType, MessageDestinationUsageTypeBase.class, "MessageDestinationUsageTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(methodIntfTypeBaseObjectEDataType, MethodIntfTypeBase.class, "MethodIntfTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(methodNameTypeBaseEDataType, String.class, "MethodNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(multiplicityTypeBaseObjectEDataType, MultiplicityTypeBase.class, "MultiplicityTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(pathTypeBaseEDataType, String.class, "PathTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(persistenceTypeTypeBaseObjectEDataType, PersistenceTypeTypeBase.class, "PersistenceTypeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(remoteTypeBaseEDataType, String.class, "RemoteTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(resAuthTypeBaseObjectEDataType, ResAuthTypeBase.class, "ResAuthTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(resSharingScopeTypeBaseObjectEDataType, ResSharingScopeTypeBase.class, "ResSharingScopeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(resultTypeMappingTypeBaseObjectEDataType, ResultTypeMappingTypeBase.class, "ResultTypeMappingTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(roleNameTypeBaseEDataType, String.class, "RoleNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(sessionTypeTypeBaseObjectEDataType, SessionTypeTypeBase.class, "SessionTypeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(transactionTypeTypeBaseObjectEDataType, TransactionTypeTypeBase.class, "TransactionTypeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(transAttributeTypeBaseObjectEDataType, TransAttributeTypeBase.class, "TransAttributeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(trueFalseTypeBaseEDataType, boolean.class, "TrueFalseTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(trueFalseTypeBaseObjectEDataType, Boolean.class, "TrueFalseTypeBaseObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$			
		addAnnotation
		  (activationConfigPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "activation-config-propertyType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getActivationConfigPropertyType_ActivationConfigPropertyName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activation-config-property-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getActivationConfigPropertyType_ActivationConfigPropertyValue(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activation-config-property-value", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivationConfigPropertyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (activationConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "activation-configType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivationConfigType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivationConfigType_ActivationConfigProperty(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activation-config-property", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivationConfigType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (assemblyDescriptorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "assembly-descriptorType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssemblyDescriptorType_SecurityRole(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-role", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssemblyDescriptorType_MethodPermission(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method-permission", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssemblyDescriptorType_ContainerTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "container-transaction", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssemblyDescriptorType_MessageDestination(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssemblyDescriptorType_ExcludeList(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "exclude-list", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssemblyDescriptorType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (cmpFieldTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cmp-fieldType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCmpFieldType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCmpFieldType_FieldName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "field-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCmpFieldType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (cmpVersionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cmp-versionType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (cmpVersionTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "cmp-versionType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (cmpVersionTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "cmp-versionType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "cmp-versionType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (cmrFieldTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cmr-fieldType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCmrFieldType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCmrFieldType_CmrFieldName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "cmr-field-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCmrFieldType_CmrFieldType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "cmr-field-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCmrFieldType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (cmrFieldTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cmr-field-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (cmrFieldTypeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "cmr-field-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (cmrFieldTypeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "cmr-field-typeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "cmr-field-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (containerTransactionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "container-transactionType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getContainerTransactionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getContainerTransactionType_Method(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getContainerTransactionType_TransAttribute(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "trans-attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getContainerTransactionType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (descriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "descriptionType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getDescriptionType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "lang", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://www.w3.org/XML/1998/namespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (deweyVersionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "dewey-versionType", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal", //$NON-NLS-1$ //$NON-NLS-2$
			 "whiteSpace", "collapse" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (displayNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "display-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getDisplayNameType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "lang", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://www.w3.org/XML/1998/namespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "mixed" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", ":mixed" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "xmlns:prefix" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "xsi:schemaLocation" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getDocumentRoot_EjbJar(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-jar", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbClassTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-classType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (ejbClassTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "ejb-classType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbJarTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-jarType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbJarType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbJarType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbJarType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbJarType_EnterpriseBeans(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "enterprise-beans", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbJarType_Relationships(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "relationships", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbJarType_AssemblyDescriptor(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "assembly-descriptor", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbJarType_EjbClientJar(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-client-jar", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbJarType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbJarType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "version" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbLinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-linkType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (ejbLinkTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "ejb-linkType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbLocalRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-local-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_EjbRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_EjbRefType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_LocalHome(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local-home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_Local(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_EjbLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (ejbNameTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "ejb-nameType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKEN" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbRefNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-ref-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (ejbRefNameTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "ejb-ref-nameType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_EjbRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_EjbRefType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_Home(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_Remote(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "remote", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_EjbLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbRefTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-ref-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (ejbRefTypeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "ejb-ref-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (ejbRefTypeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ejb-ref-typeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "ejb-ref-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbRelationshipRoleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-relationship-roleType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationshipRoleType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbRelationshipRoleType_EjbRelationshipRoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-relationship-role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationshipRoleType_Multiplicity(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "multiplicity", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbRelationshipRoleType_CascadeDelete(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "cascade-delete", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationshipRoleType_RelationshipRoleSource(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "relationship-role-source", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationshipRoleType_CmrField(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "cmr-field", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationshipRoleType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (ejbRelationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ejb-relationType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbRelationType_EjbRelationName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-relation-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationType_EjbRelationshipRole(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-relationship-role", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationType_EjbRelationshipRole1(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-relationship-role", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRelationType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (emptyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "emptyType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEmptyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (enterpriseBeansTypeEClass, 
		   source, 
		   new String[] {
			 "name", "enterprise-beansType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnterpriseBeansType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnterpriseBeansType_Session(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "session", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnterpriseBeansType_Entity(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "entity", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnterpriseBeansType_MessageDriven(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-driven", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnterpriseBeansType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (entityBeanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "entity-beanType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_EjbName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_Home(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_Remote(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "remote", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_LocalHome(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local-home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_Local(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_EjbClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_PersistenceType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEntityBeanType_PrimKeyClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "prim-key-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEntityBeanType_Reentrant(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "reentrant", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_CmpVersion(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "cmp-version", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEntityBeanType_AbstractSchemaName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "abstract-schema-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_CmpField(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "cmp-field", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEntityBeanType_PrimkeyField(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "primkey-field", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_EnvEntry(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_EjbRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_EjbLocalRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-local-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_ServiceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_ResourceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_ResourceEnvRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_MessageDestinationRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_SecurityRoleRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-role-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_SecurityIdentity(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-identity", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_Query(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "query", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEntityBeanType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (envEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "env-entryType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnvEntryType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEnvEntryType_EnvEntryName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnvEntryType_EnvEntryType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEnvEntryType_EnvEntryValue(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry-value", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnvEntryType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (envEntryTypeValuesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "env-entry-type-valuesType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (envEntryTypeValuesTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "env-entry-type-valuesType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (envEntryTypeValuesTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "env-entry-type-valuesType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "env-entry-type-valuesType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (excludeListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "exclude-listType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExcludeListType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExcludeListType_Method(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExcludeListType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (fullyQualifiedClassTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fully-qualified-classType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (fullyQualifiedClassTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "fully-qualified-classType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (genericBooleanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "generic-booleanType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (genericBooleanTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "generic-booleanType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (genericBooleanTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "generic-booleanType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "generic-booleanType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (homeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "homeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (homeTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "homeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (iconTypeEClass, 
		   source, 
		   new String[] {
			 "name", "iconType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getIconType_SmallIcon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "small-icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getIconType_LargeIcon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "large-icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getIconType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getIconType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "lang", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://www.w3.org/XML/1998/namespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (javaIdentifierTypeEClass, 
		   source, 
		   new String[] {
			 "name", "java-identifierType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (javaIdentifierTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "java-identifierType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (javaTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "java-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (javaTypeTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "java-typeType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "[^\\p{Z}]*" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (jndiNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "jndi-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (jndiNameTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "jndi-nameType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (listenerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "listenerType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getListenerType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getListenerType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getListenerType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getListenerType_ListenerClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "listener-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getListenerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (localHomeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "local-homeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (localHomeTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "local-homeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (localTypeEClass, 
		   source, 
		   new String[] {
			 "name", "localType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (localTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "localType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (messageDestinationLinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "message-destination-linkType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (messageDestinationLinkTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "message-destination-linkType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (messageDestinationRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "message-destination-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationUsage(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-usage", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (messageDestinationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "message-destinationType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessageDestinationType_MessageDestinationName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (messageDestinationTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "message-destination-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (messageDestinationTypeTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "message-destination-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (messageDestinationUsageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "message-destination-usageType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (messageDestinationUsageTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "message-destination-usageType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (messageDestinationUsageTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "message-destination-usageType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "message-destination-usageType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (messageDrivenBeanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "message-driven-beanType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_EjbName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_EjbClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessageDrivenBeanType_MessagingType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "messaging-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_TransactionType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "transaction-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_MessageDestinationType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_MessageDestinationLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_ActivationConfig(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activation-config", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_EnvEntry(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_EjbRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_EjbLocalRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-local-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_ServiceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_ResourceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_ResourceEnvRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_MessageDestinationRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_SecurityIdentity(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-identity", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDrivenBeanType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (methodIntfTypeEClass, 
		   source, 
		   new String[] {
			 "name", "method-intfType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (methodIntfTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "method-intfType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (methodIntfTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "method-intfType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "method-intfType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (methodNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "method-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (methodNameTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "method-nameType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (methodParamsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "method-paramsType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMethodParamsType_MethodParam(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method-param", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodParamsType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (methodPermissionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "method-permissionType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodPermissionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodPermissionType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMethodPermissionType_Unchecked(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "unchecked", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodPermissionType_Method(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodPermissionType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (methodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "methodType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodType_EjbName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodType_MethodIntf(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method-intf", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodType_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodType_MethodParams(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method-params", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMethodType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (multiplicityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "multiplicityType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (multiplicityTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "multiplicityType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (multiplicityTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "multiplicityType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "multiplicityType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (paramValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "param-valueType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getParamValueType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getParamValueType_ParamName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "param-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getParamValueType_ParamValue(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "param-value", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getParamValueType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (pathTypeEClass, 
		   source, 
		   new String[] {
			 "name", "pathType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (pathTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "pathType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (persistenceTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (persistenceTypeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "persistence-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (persistenceTypeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "persistence-typeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "persistence-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (portComponentRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "port-component-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPortComponentRefType_ServiceEndpointInterface(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-endpoint-interface", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPortComponentRefType_PortComponentLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "port-component-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPortComponentRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (queryMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "query-methodType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryMethodType_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryMethodType_MethodParams(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "method-params", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryMethodType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (queryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "queryType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryType_QueryMethod(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "query-method", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryType_ResultTypeMapping(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "result-type-mapping", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryType_EjbQl(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ql", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQueryType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (relationshipRoleSourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relationship-role-sourceType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRelationshipRoleSourceType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRelationshipRoleSourceType_EjbName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRelationshipRoleSourceType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (relationshipsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relationshipsType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRelationshipsType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRelationshipsType_EjbRelation(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-relation", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRelationshipsType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (remoteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "remoteType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (remoteTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "remoteType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (resAuthTypeEClass, 
		   source, 
		   new String[] {
			 "name", "res-authType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (resAuthTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "res-authType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (resAuthTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "res-authType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "res-authType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (resourceEnvRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "resource-env-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceEnvRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceEnvRefType_ResourceEnvRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceEnvRefType_ResourceEnvRefType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceEnvRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (resourceRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "resource-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceRefType_ResRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceRefType_ResType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceRefType_ResAuth(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-auth", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceRefType_ResSharingScope(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-sharing-scope", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (resSharingScopeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "res-sharing-scopeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (resSharingScopeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "res-sharing-scopeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (resSharingScopeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "res-sharing-scopeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "res-sharing-scopeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (resultTypeMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "result-type-mappingType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (resultTypeMappingTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "result-type-mappingType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (resultTypeMappingTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "result-type-mappingType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "result-type-mappingType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (roleNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "role-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (roleNameTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "role-nameType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (runAsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "run-asType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRunAsType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRunAsType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRunAsType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (securityIdentityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "security-identityType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityIdentityType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSecurityIdentityType_UseCallerIdentity(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "use-caller-identity", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityIdentityType_RunAs(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "run-as", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityIdentityType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (securityRoleRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "security-role-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityRoleRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSecurityRoleRefType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSecurityRoleRefType_RoleLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityRoleRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (securityRoleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "security-roleType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityRoleType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityRoleType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityRoleType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefHandlerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service-ref_handlerType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_HandlerName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_HandlerClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_InitParam(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "init-param", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_SoapHeader(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "soap-header", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_SoapRole(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "soap-role", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_PortName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "port-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_ServiceRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_ServiceInterface(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-interface", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_WsdlFile(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "wsdl-file", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_JaxrpcMappingFile(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "jaxrpc-mapping-file", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_ServiceQname(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-qname", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_PortComponentRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "port-component-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_Handler(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (sessionBeanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "session-beanType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_EjbName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_Home(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_Remote(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "remote", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_LocalHome(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local-home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_Local(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSessionBeanType_ServiceEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-endpoint", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_EjbClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_SessionType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "session-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_TransactionType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "transaction-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_EnvEntry(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_EjbRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_EjbLocalRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-local-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_ServiceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_ResourceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_ResourceEnvRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_MessageDestinationRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_SecurityRoleRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-role-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_SecurityIdentity(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-identity", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/j2ee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionBeanType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (sessionTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "session-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (sessionTypeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "session-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (sessionTypeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "session-typeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "session-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (stringEClass, 
		   source, 
		   new String[] {
			 "name", "string", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getString_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getString_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (transactionTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "transaction-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (transactionTypeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "transaction-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (transactionTypeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "transaction-typeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "transaction-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (transAttributeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "trans-attributeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (transAttributeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "trans-attributeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (transAttributeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "trans-attributeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "trans-attributeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (trueFalseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "true-falseType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (trueFalseTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "true-falseType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#boolean", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "(true|false)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (trueFalseTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "true-falseType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "true-falseType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (urlPatternTypeEClass, 
		   source, 
		   new String[] {
			 "name", "url-patternType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getUrlPatternType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdAnyURITypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdAnyURIType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdAnyURIType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdAnyURIType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdBooleanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdBooleanType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdBooleanType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdBooleanType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdIntegerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdIntegerType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdIntegerType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdIntegerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdNMTOKENTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdNMTOKENType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdNMTOKENType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdNMTOKENType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdNonNegativeIntegerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdNonNegativeIntegerType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdNonNegativeIntegerType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdNonNegativeIntegerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdPositiveIntegerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdPositiveIntegerType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdPositiveIntegerType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdPositiveIntegerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdQNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdQNameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdQNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdQNameType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (xsdStringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xsdStringType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdStringType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getXsdStringType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //EjbJar21PackageImpl
