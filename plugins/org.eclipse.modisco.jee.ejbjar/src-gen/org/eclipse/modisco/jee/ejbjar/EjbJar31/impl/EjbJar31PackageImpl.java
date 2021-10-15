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

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Factory;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.util.EjbJar31Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbJar31PackageImpl extends EPackageImpl implements EjbJar31Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "EjbJar31.ecore"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessTimeoutTypeEClass = null;

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
	private EClass addressingResponsesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationExceptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aroundInvokeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aroundTimeoutTypeEClass = null;

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
	private EClass asyncMethodTypeEClass = null;

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
	private EClass concurrencyManagementTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrentLockTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrentMethodTypeEClass = null;

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
	private EClass dataSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependsOnTypeEClass = null;

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
	private EClass handlerChainsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerChainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerTypeEClass = null;

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
	private EClass initMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injectionTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interceptorBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interceptorOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interceptorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interceptorTypeEClass = null;

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
	private EClass jdbcUrlTypeEClass = null;

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
	private EClass lifecycleCallbackTypeEClass = null;

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
	private EClass namedMethodTypeEClass = null;

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
	private EClass persistenceContextRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceContextTypeTypeEClass = null;

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
	private EClass persistenceUnitRefTypeEClass = null;

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
	private EClass propertyTypeEClass = null;

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
	private EClass removeMethodTypeEClass = null;

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
	private EClass respectBindingTypeEClass = null;

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
	private EClass statefulTimeoutTypeEClass = null;

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
	private EClass timerScheduleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeUnitTypeTypeEClass = null;

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
	private EEnum addressingResponsesTypeBaseEEnum = null;

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
	private EEnum concurrencyManagementTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum concurrentLockTypeTypeBaseEEnum = null;

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
	private EEnum genericBooleanTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isolationLevelTypeEEnum = null;

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
	private EEnum persistenceContextTypeTypeBaseEEnum = null;

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
	private EEnum timeUnitTypeTypeBaseEEnum = null;

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
	private EDataType addressingResponsesTypeBaseObjectEDataType = null;

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
	private EDataType concurrencyManagementTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType concurrentLockTypeTypeBaseObjectEDataType = null;

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
	private EDataType envEntryTypeValuesTypeBaseEDataType = null;

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
	private EDataType isolationLevelTypeObjectEDataType = null;

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
	private EDataType jdbcUrlTypeBaseEDataType = null;

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
	private EDataType persistenceContextTypeTypeBaseObjectEDataType = null;

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
	private EDataType protocolBindingListTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType protocolBindingTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType protocolURIAliasTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qnamePatternEDataType = null;

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
	private EDataType timeUnitTypeTypeBaseObjectEDataType = null;

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EjbJar31PackageImpl() {
		super(eNS_URI, EjbJar31Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EjbJar31Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static EjbJar31Package init() {
		if (isInited) return (EjbJar31Package)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI);

		// Obtain or create and register package
		EjbJar31PackageImpl theEjbJar31Package = (EjbJar31PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EjbJar31PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EjbJar31PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theEjbJar31Package.loadPackage();

		// Fix loaded packages
		theEjbJar31Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEjbJar31Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EjbJar31Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEjbJar31Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EjbJar31Package.eNS_URI, theEjbJar31Package);
		return theEjbJar31Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessTimeoutType() {
		if (accessTimeoutTypeEClass == null) {
			accessTimeoutTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(0);
		}
		return accessTimeoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessTimeoutType_Timeout() {
        return (EReference)getAccessTimeoutType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessTimeoutType_Unit() {
        return (EReference)getAccessTimeoutType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessTimeoutType_Id() {
        return (EAttribute)getAccessTimeoutType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationConfigPropertyType() {
		if (activationConfigPropertyTypeEClass == null) {
			activationConfigPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(1);
		}
		return activationConfigPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigPropertyType_ActivationConfigPropertyName() {
        return (EReference)getActivationConfigPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigPropertyType_ActivationConfigPropertyValue() {
        return (EReference)getActivationConfigPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConfigPropertyType_Id() {
        return (EAttribute)getActivationConfigPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationConfigType() {
		if (activationConfigTypeEClass == null) {
			activationConfigTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(2);
		}
		return activationConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigType_Description() {
        return (EReference)getActivationConfigType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfigType_ActivationConfigProperty() {
        return (EReference)getActivationConfigType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConfigType_Id() {
        return (EAttribute)getActivationConfigType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressingResponsesType() {
		if (addressingResponsesTypeEClass == null) {
			addressingResponsesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(3);
		}
		return addressingResponsesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressingType() {
		if (addressingTypeEClass == null) {
			addressingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(6);
		}
		return addressingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressingType_Enabled() {
        return (EReference)getAddressingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressingType_Required() {
        return (EReference)getAddressingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressingType_Responses() {
        return (EReference)getAddressingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationExceptionType() {
		if (applicationExceptionTypeEClass == null) {
			applicationExceptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(7);
		}
		return applicationExceptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationExceptionType_ExceptionClass() {
        return (EReference)getApplicationExceptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationExceptionType_Rollback() {
        return (EReference)getApplicationExceptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationExceptionType_Inherited() {
        return (EReference)getApplicationExceptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationExceptionType_Id() {
        return (EAttribute)getApplicationExceptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAroundInvokeType() {
		if (aroundInvokeTypeEClass == null) {
			aroundInvokeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(8);
		}
		return aroundInvokeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAroundInvokeType_Class() {
        return (EReference)getAroundInvokeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAroundInvokeType_MethodName() {
        return (EReference)getAroundInvokeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAroundTimeoutType() {
		if (aroundTimeoutTypeEClass == null) {
			aroundTimeoutTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(9);
		}
		return aroundTimeoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAroundTimeoutType_Class() {
        return (EReference)getAroundTimeoutType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAroundTimeoutType_MethodName() {
        return (EReference)getAroundTimeoutType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyDescriptorType() {
		if (assemblyDescriptorTypeEClass == null) {
			assemblyDescriptorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(10);
		}
		return assemblyDescriptorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_SecurityRole() {
        return (EReference)getAssemblyDescriptorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_MethodPermission() {
        return (EReference)getAssemblyDescriptorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_ContainerTransaction() {
        return (EReference)getAssemblyDescriptorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_InterceptorBinding() {
        return (EReference)getAssemblyDescriptorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_MessageDestination() {
        return (EReference)getAssemblyDescriptorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_ExcludeList() {
        return (EReference)getAssemblyDescriptorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptorType_ApplicationException() {
        return (EReference)getAssemblyDescriptorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssemblyDescriptorType_Id() {
        return (EAttribute)getAssemblyDescriptorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsyncMethodType() {
		if (asyncMethodTypeEClass == null) {
			asyncMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(11);
		}
		return asyncMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncMethodType_MethodName() {
        return (EReference)getAsyncMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncMethodType_MethodParams() {
        return (EReference)getAsyncMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncMethodType_Id() {
        return (EAttribute)getAsyncMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmpFieldType() {
		if (cmpFieldTypeEClass == null) {
			cmpFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(12);
		}
		return cmpFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpFieldType_Description() {
        return (EReference)getCmpFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpFieldType_FieldName() {
        return (EReference)getCmpFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmpFieldType_Id() {
        return (EAttribute)getCmpFieldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmpVersionType() {
		if (cmpVersionTypeEClass == null) {
			cmpVersionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(13);
		}
		return cmpVersionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmrFieldType() {
		if (cmrFieldTypeEClass == null) {
			cmrFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(16);
		}
		return cmrFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmrFieldType_Description() {
        return (EReference)getCmrFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmrFieldType_CmrFieldName() {
        return (EReference)getCmrFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmrFieldType_CmrFieldType() {
        return (EReference)getCmrFieldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmrFieldType_Id() {
        return (EAttribute)getCmrFieldType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmrFieldTypeType() {
		if (cmrFieldTypeTypeEClass == null) {
			cmrFieldTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(17);
		}
		return cmrFieldTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrencyManagementTypeType() {
		if (concurrencyManagementTypeTypeEClass == null) {
			concurrencyManagementTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(20);
		}
		return concurrencyManagementTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrentLockTypeType() {
		if (concurrentLockTypeTypeEClass == null) {
			concurrentLockTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(23);
		}
		return concurrentLockTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrentMethodType() {
		if (concurrentMethodTypeEClass == null) {
			concurrentMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(26);
		}
		return concurrentMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentMethodType_Method() {
        return (EReference)getConcurrentMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentMethodType_Lock() {
        return (EReference)getConcurrentMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentMethodType_AccessTimeout() {
        return (EReference)getConcurrentMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcurrentMethodType_Id() {
        return (EAttribute)getConcurrentMethodType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerTransactionType() {
		if (containerTransactionTypeEClass == null) {
			containerTransactionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(27);
		}
		return containerTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerTransactionType_Description() {
        return (EReference)getContainerTransactionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerTransactionType_Method() {
        return (EReference)getContainerTransactionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerTransactionType_TransAttribute() {
        return (EReference)getContainerTransactionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerTransactionType_Id() {
        return (EAttribute)getContainerTransactionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceType() {
		if (dataSourceTypeEClass == null) {
			dataSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(28);
		}
		return dataSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Description() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Name() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_ClassName() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_ServerName() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_PortNumber() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_DatabaseName() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Url() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_User() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Password() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Property() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_LoginTimeout() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Transactional() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceType_IsolationLevel() {
        return (EAttribute)getDataSourceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_InitialPoolSize() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MaxPoolSize() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MinPoolSize() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MaxIdleTime() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MaxStatements() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceType_Id() {
        return (EAttribute)getDataSourceType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependsOnType() {
		if (dependsOnTypeEClass == null) {
			dependsOnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(29);
		}
		return dependsOnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependsOnType_EjbName() {
        return (EReference)getDependsOnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependsOnType_Id() {
        return (EAttribute)getDependsOnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		if (descriptionTypeEClass == null) {
			descriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(30);
		}
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Lang() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayNameType() {
		if (displayNameTypeEClass == null) {
			displayNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(32);
		}
		return displayNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayNameType_Lang() {
        return (EAttribute)getDisplayNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(33);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EjbJar() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbClassType() {
		if (ejbClassTypeEClass == null) {
			ejbClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(34);
		}
		return ejbClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbJarType() {
		if (ejbJarTypeEClass == null) {
			ejbJarTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(36);
		}
		return ejbJarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_ModuleName() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_Description() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_DisplayName() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_Icon() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_EnterpriseBeans() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_Interceptors() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_Relationships() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_AssemblyDescriptor() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbJarType_EjbClientJar() {
        return (EReference)getEjbJarType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbJarType_Id() {
        return (EAttribute)getEjbJarType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbJarType_MetadataComplete() {
        return (EAttribute)getEjbJarType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbJarType_Version() {
        return (EAttribute)getEjbJarType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbLinkType() {
		if (ejbLinkTypeEClass == null) {
			ejbLinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(37);
		}
		return ejbLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbLocalRefType() {
		if (ejbLocalRefTypeEClass == null) {
			ejbLocalRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(39);
		}
		return ejbLocalRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_Description() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbRefName() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbRefType() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_LocalHome() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_Local() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbLink() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_MappedName() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_InjectionTarget() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_LookupName() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbLocalRefType_Id() {
        return (EAttribute)getEjbLocalRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbNameType() {
		if (ejbNameTypeEClass == null) {
			ejbNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(40);
		}
		return ejbNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefNameType() {
		if (ejbRefNameTypeEClass == null) {
			ejbRefNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(42);
		}
		return ejbRefNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefType() {
		if (ejbRefTypeEClass == null) {
			ejbRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(44);
		}
		return ejbRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Description() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbRefName() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbRefType() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Home() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Remote() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbLink() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_MappedName() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_InjectionTarget() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_LookupName() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRefType_Id() {
        return (EAttribute)getEjbRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefTypeType() {
		if (ejbRefTypeTypeEClass == null) {
			ejbRefTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(45);
		}
		return ejbRefTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRelationshipRoleType() {
		if (ejbRelationshipRoleTypeEClass == null) {
			ejbRelationshipRoleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(48);
		}
		return ejbRelationshipRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_Description() {
        return (EReference)getEjbRelationshipRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_EjbRelationshipRoleName() {
        return (EReference)getEjbRelationshipRoleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_Multiplicity() {
        return (EReference)getEjbRelationshipRoleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_CascadeDelete() {
        return (EReference)getEjbRelationshipRoleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_RelationshipRoleSource() {
        return (EReference)getEjbRelationshipRoleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationshipRoleType_CmrField() {
        return (EReference)getEjbRelationshipRoleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRelationshipRoleType_Id() {
        return (EAttribute)getEjbRelationshipRoleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRelationType() {
		if (ejbRelationTypeEClass == null) {
			ejbRelationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(49);
		}
		return ejbRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_Description() {
        return (EReference)getEjbRelationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_EjbRelationName() {
        return (EReference)getEjbRelationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_EjbRelationshipRole() {
        return (EReference)getEjbRelationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRelationType_EjbRelationshipRole1() {
        return (EReference)getEjbRelationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRelationType_Id() {
        return (EAttribute)getEjbRelationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyType() {
		if (emptyTypeEClass == null) {
			emptyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(50);
		}
		return emptyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmptyType_Id() {
        return (EAttribute)getEmptyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterpriseBeansType() {
		if (enterpriseBeansTypeEClass == null) {
			enterpriseBeansTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(51);
		}
		return enterpriseBeansTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterpriseBeansType_Group() {
        return (EAttribute)getEnterpriseBeansType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseBeansType_Session() {
        return (EReference)getEnterpriseBeansType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseBeansType_Entity() {
        return (EReference)getEnterpriseBeansType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseBeansType_MessageDriven() {
        return (EReference)getEnterpriseBeansType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterpriseBeansType_Id() {
        return (EAttribute)getEnterpriseBeansType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityBeanType() {
		if (entityBeanTypeEClass == null) {
			entityBeanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(52);
		}
		return entityBeanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Description() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_DisplayName() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Icon() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbName() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_MappedName() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Home() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Remote() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_LocalHome() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Local() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbClass() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PersistenceType() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PrimKeyClass() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Reentrant() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_CmpVersion() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_AbstractSchemaName() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_CmpField() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PrimkeyField() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EnvEntry() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_EjbLocalRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_ServiceRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_ResourceRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_ResourceEnvRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_MessageDestinationRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PersistenceContextRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PersistenceUnitRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PostConstruct() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_PreDestroy() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_DataSource() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_SecurityRoleRef() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_SecurityIdentity() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBeanType_Query() {
        return (EReference)getEntityBeanType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityBeanType_Id() {
        return (EAttribute)getEntityBeanType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvEntryType() {
		if (envEntryTypeEClass == null) {
			envEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(53);
		}
		return envEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_Description() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryName() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryType() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryValue() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_MappedName() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_InjectionTarget() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_LookupName() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvEntryType_Id() {
        return (EAttribute)getEnvEntryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvEntryTypeValuesType() {
		if (envEntryTypeValuesTypeEClass == null) {
			envEntryTypeValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(54);
		}
		return envEntryTypeValuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeListType() {
		if (excludeListTypeEClass == null) {
			excludeListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(56);
		}
		return excludeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeListType_Description() {
        return (EReference)getExcludeListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeListType_Method() {
        return (EReference)getExcludeListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcludeListType_Id() {
        return (EAttribute)getExcludeListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullyQualifiedClassType() {
		if (fullyQualifiedClassTypeEClass == null) {
			fullyQualifiedClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(57);
		}
		return fullyQualifiedClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericBooleanType() {
		if (genericBooleanTypeEClass == null) {
			genericBooleanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(59);
		}
		return genericBooleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerChainsType() {
		if (handlerChainsTypeEClass == null) {
			handlerChainsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(62);
		}
		return handlerChainsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerChainsType_HandlerChain() {
        return (EReference)getHandlerChainsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainsType_Id() {
        return (EAttribute)getHandlerChainsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerChainType() {
		if (handlerChainTypeEClass == null) {
			handlerChainTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(63);
		}
		return handlerChainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_ServiceNamePattern() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_PortNamePattern() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_ProtocolBindings() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerChainType_Handler() {
        return (EReference)getHandlerChainType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_Id() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerType() {
		if (handlerTypeEClass == null) {
			handlerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(64);
		}
		return handlerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_Description() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_DisplayName() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_Icon() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_HandlerName() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_HandlerClass() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_InitParam() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_SoapHeader() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_SoapRole() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_PortName() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerType_Id() {
        return (EAttribute)getHandlerType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHomeType() {
		if (homeTypeEClass == null) {
			homeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(65);
		}
		return homeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconType() {
		if (iconTypeEClass == null) {
			iconTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(67);
		}
		return iconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconType_SmallIcon() {
        return (EReference)getIconType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconType_LargeIcon() {
        return (EReference)getIconType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_Id() {
        return (EAttribute)getIconType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_Lang() {
        return (EAttribute)getIconType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitMethodType() {
		if (initMethodTypeEClass == null) {
			initMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(68);
		}
		return initMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitMethodType_CreateMethod() {
        return (EReference)getInitMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitMethodType_BeanMethod() {
        return (EReference)getInitMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitMethodType_Id() {
        return (EAttribute)getInitMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjectionTargetType() {
		if (injectionTargetTypeEClass == null) {
			injectionTargetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(69);
		}
		return injectionTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionTargetType_InjectionTargetClass() {
        return (EReference)getInjectionTargetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionTargetType_InjectionTargetName() {
        return (EReference)getInjectionTargetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterceptorBindingType() {
		if (interceptorBindingTypeEClass == null) {
			interceptorBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(70);
		}
		return interceptorBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorBindingType_Description() {
        return (EReference)getInterceptorBindingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorBindingType_EjbName() {
        return (EReference)getInterceptorBindingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorBindingType_InterceptorClass() {
        return (EReference)getInterceptorBindingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorBindingType_InterceptorOrder() {
        return (EReference)getInterceptorBindingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorBindingType_ExcludeDefaultInterceptors() {
        return (EReference)getInterceptorBindingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorBindingType_ExcludeClassInterceptors() {
        return (EReference)getInterceptorBindingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorBindingType_Method() {
        return (EReference)getInterceptorBindingType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterceptorBindingType_Id() {
        return (EAttribute)getInterceptorBindingType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterceptorOrderType() {
		if (interceptorOrderTypeEClass == null) {
			interceptorOrderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(71);
		}
		return interceptorOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorOrderType_InterceptorClass() {
        return (EReference)getInterceptorOrderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterceptorOrderType_Id() {
        return (EAttribute)getInterceptorOrderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterceptorsType() {
		if (interceptorsTypeEClass == null) {
			interceptorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(72);
		}
		return interceptorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorsType_Description() {
        return (EReference)getInterceptorsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorsType_Interceptor() {
        return (EReference)getInterceptorsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterceptorsType_Id() {
        return (EAttribute)getInterceptorsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterceptorType() {
		if (interceptorTypeEClass == null) {
			interceptorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(73);
		}
		return interceptorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_Description() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_InterceptorClass() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_AroundInvoke() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_AroundTimeout() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_EnvEntry() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_EjbRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_EjbLocalRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_ServiceRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_ResourceRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_ResourceEnvRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_MessageDestinationRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_PersistenceContextRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_PersistenceUnitRef() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_PostConstruct() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_PreDestroy() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_DataSource() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_PostActivate() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterceptorType_PrePassivate() {
        return (EReference)getInterceptorType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterceptorType_Id() {
        return (EAttribute)getInterceptorType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaIdentifierType() {
		if (javaIdentifierTypeEClass == null) {
			javaIdentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(76);
		}
		return javaIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaTypeType() {
		if (javaTypeTypeEClass == null) {
			javaTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(78);
		}
		return javaTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdbcUrlType() {
		if (jdbcUrlTypeEClass == null) {
			jdbcUrlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(80);
		}
		return jdbcUrlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJndiNameType() {
		if (jndiNameTypeEClass == null) {
			jndiNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(82);
		}
		return jndiNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifecycleCallbackType() {
		if (lifecycleCallbackTypeEClass == null) {
			lifecycleCallbackTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(84);
		}
		return lifecycleCallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleCallbackType_LifecycleCallbackClass() {
        return (EReference)getLifecycleCallbackType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleCallbackType_LifecycleCallbackMethod() {
        return (EReference)getLifecycleCallbackType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListenerType() {
		if (listenerTypeEClass == null) {
			listenerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(85);
		}
		return listenerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_Description() {
        return (EReference)getListenerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_DisplayName() {
        return (EReference)getListenerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_Icon() {
        return (EReference)getListenerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_ListenerClass() {
        return (EReference)getListenerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListenerType_Id() {
        return (EAttribute)getListenerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalHomeType() {
		if (localHomeTypeEClass == null) {
			localHomeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(86);
		}
		return localHomeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalType() {
		if (localTypeEClass == null) {
			localTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(88);
		}
		return localTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationLinkType() {
		if (messageDestinationLinkTypeEClass == null) {
			messageDestinationLinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(90);
		}
		return messageDestinationLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationRefType() {
		if (messageDestinationRefTypeEClass == null) {
			messageDestinationRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(92);
		}
		return messageDestinationRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_Description() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationRefName() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationType() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationUsage() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationLink() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MappedName() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_InjectionTarget() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_LookupName() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationRefType_Id() {
        return (EAttribute)getMessageDestinationRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationType() {
		if (messageDestinationTypeEClass == null) {
			messageDestinationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(93);
		}
		return messageDestinationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_Description() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_DisplayName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_Icon() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_MessageDestinationName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_MappedName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_LookupName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationType_Id() {
        return (EAttribute)getMessageDestinationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationTypeType() {
		if (messageDestinationTypeTypeEClass == null) {
			messageDestinationTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(94);
		}
		return messageDestinationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationUsageType() {
		if (messageDestinationUsageTypeEClass == null) {
			messageDestinationUsageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(96);
		}
		return messageDestinationUsageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDrivenBeanType() {
		if (messageDrivenBeanTypeEClass == null) {
			messageDrivenBeanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(99);
		}
		return messageDrivenBeanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_Description() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_DisplayName() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_Icon() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbName() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MappedName() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbClass() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessagingType() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_TimeoutMethod() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_Timer() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_TransactionType() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessageDestinationType() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessageDestinationLink() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ActivationConfig() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_AroundInvoke() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_AroundTimeout() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EnvEntry() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_EjbLocalRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ServiceRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ResourceRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_ResourceEnvRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_MessageDestinationRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_PersistenceContextRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_PersistenceUnitRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_PostConstruct() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_PreDestroy() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_DataSource() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_SecurityRoleRef() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDrivenBeanType_SecurityIdentity() {
        return (EReference)getMessageDrivenBeanType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDrivenBeanType_Id() {
        return (EAttribute)getMessageDrivenBeanType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodIntfType() {
		if (methodIntfTypeEClass == null) {
			methodIntfTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(100);
		}
		return methodIntfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodNameType() {
		if (methodNameTypeEClass == null) {
			methodNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(103);
		}
		return methodNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParamsType() {
		if (methodParamsTypeEClass == null) {
			methodParamsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(105);
		}
		return methodParamsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodParamsType_MethodParam() {
        return (EReference)getMethodParamsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParamsType_Id() {
        return (EAttribute)getMethodParamsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodPermissionType() {
		if (methodPermissionTypeEClass == null) {
			methodPermissionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(106);
		}
		return methodPermissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_Description() {
        return (EReference)getMethodPermissionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_RoleName() {
        return (EReference)getMethodPermissionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_Unchecked() {
        return (EReference)getMethodPermissionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermissionType_Method() {
        return (EReference)getMethodPermissionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodPermissionType_Id() {
        return (EAttribute)getMethodPermissionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodType() {
		if (methodTypeEClass == null) {
			methodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(107);
		}
		return methodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_Description() {
        return (EReference)getMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_EjbName() {
        return (EReference)getMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_MethodIntf() {
        return (EReference)getMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_MethodName() {
        return (EReference)getMethodType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodType_MethodParams() {
        return (EReference)getMethodType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodType_Id() {
        return (EAttribute)getMethodType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityType() {
		if (multiplicityTypeEClass == null) {
			multiplicityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(108);
		}
		return multiplicityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedMethodType() {
		if (namedMethodTypeEClass == null) {
			namedMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(111);
		}
		return namedMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedMethodType_MethodName() {
        return (EReference)getNamedMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedMethodType_MethodParams() {
        return (EReference)getNamedMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedMethodType_Id() {
        return (EAttribute)getNamedMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamValueType() {
		if (paramValueTypeEClass == null) {
			paramValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(112);
		}
		return paramValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_Description() {
        return (EReference)getParamValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_ParamName() {
        return (EReference)getParamValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_ParamValue() {
        return (EReference)getParamValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamValueType_Id() {
        return (EAttribute)getParamValueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathType() {
		if (pathTypeEClass == null) {
			pathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(113);
		}
		return pathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceContextRefType() {
		if (persistenceContextRefTypeEClass == null) {
			persistenceContextRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(115);
		}
		return persistenceContextRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_Description() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceContextRefName() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceUnitName() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceContextType() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceProperty() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_MappedName() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_InjectionTarget() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceContextRefType_Id() {
        return (EAttribute)getPersistenceContextRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceContextTypeType() {
		if (persistenceContextTypeTypeEClass == null) {
			persistenceContextTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(116);
		}
		return persistenceContextTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceTypeType() {
		if (persistenceTypeTypeEClass == null) {
			persistenceTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(119);
		}
		return persistenceTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnitRefType() {
		if (persistenceUnitRefTypeEClass == null) {
			persistenceUnitRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(122);
		}
		return persistenceUnitRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_Description() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_PersistenceUnitRefName() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_PersistenceUnitName() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_MappedName() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_InjectionTarget() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnitRefType_Id() {
        return (EAttribute)getPersistenceUnitRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortComponentRefType() {
		if (portComponentRefTypeEClass == null) {
			portComponentRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(123);
		}
		return portComponentRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_ServiceEndpointInterface() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_EnableMtom() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_MtomThreshold() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_Addressing() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_RespectBinding() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_PortComponentLink() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortComponentRefType_Id() {
        return (EAttribute)getPortComponentRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(124);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Name() {
        return (EReference)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Value() {
        return (EReference)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Id() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryMethodType() {
		if (queryMethodTypeEClass == null) {
			queryMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(129);
		}
		return queryMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMethodType_MethodName() {
        return (EReference)getQueryMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMethodType_MethodParams() {
        return (EReference)getQueryMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryMethodType_Id() {
        return (EAttribute)getQueryMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryType() {
		if (queryTypeEClass == null) {
			queryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(130);
		}
		return queryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_Description() {
        return (EReference)getQueryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_QueryMethod() {
        return (EReference)getQueryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_ResultTypeMapping() {
        return (EReference)getQueryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_EjbQl() {
        return (EReference)getQueryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_Id() {
        return (EAttribute)getQueryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipRoleSourceType() {
		if (relationshipRoleSourceTypeEClass == null) {
			relationshipRoleSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(131);
		}
		return relationshipRoleSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipRoleSourceType_Description() {
        return (EReference)getRelationshipRoleSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipRoleSourceType_EjbName() {
        return (EReference)getRelationshipRoleSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipRoleSourceType_Id() {
        return (EAttribute)getRelationshipRoleSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipsType() {
		if (relationshipsTypeEClass == null) {
			relationshipsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(132);
		}
		return relationshipsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipsType_Description() {
        return (EReference)getRelationshipsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipsType_EjbRelation() {
        return (EReference)getRelationshipsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipsType_Id() {
        return (EAttribute)getRelationshipsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteType() {
		if (remoteTypeEClass == null) {
			remoteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(133);
		}
		return remoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveMethodType() {
		if (removeMethodTypeEClass == null) {
			removeMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(135);
		}
		return removeMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveMethodType_BeanMethod() {
        return (EReference)getRemoveMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveMethodType_RetainIfException() {
        return (EReference)getRemoveMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveMethodType_Id() {
        return (EAttribute)getRemoveMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResAuthType() {
		if (resAuthTypeEClass == null) {
			resAuthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(136);
		}
		return resAuthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceEnvRefType() {
		if (resourceEnvRefTypeEClass == null) {
			resourceEnvRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(139);
		}
		return resourceEnvRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_Description() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_ResourceEnvRefName() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_ResourceEnvRefType() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_MappedName() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_InjectionTarget() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_LookupName() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceEnvRefType_Id() {
        return (EAttribute)getResourceEnvRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRefType() {
		if (resourceRefTypeEClass == null) {
			resourceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(140);
		}
		return resourceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_Description() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResRefName() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResType() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResAuth() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResSharingScope() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_MappedName() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_InjectionTarget() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_LookupName() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRefType_Id() {
        return (EAttribute)getResourceRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespectBindingType() {
		if (respectBindingTypeEClass == null) {
			respectBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(141);
		}
		return respectBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRespectBindingType_Enabled() {
        return (EReference)getRespectBindingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResSharingScopeType() {
		if (resSharingScopeTypeEClass == null) {
			resSharingScopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(142);
		}
		return resSharingScopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultTypeMappingType() {
		if (resultTypeMappingTypeEClass == null) {
			resultTypeMappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(145);
		}
		return resultTypeMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNameType() {
		if (roleNameTypeEClass == null) {
			roleNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(148);
		}
		return roleNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunAsType() {
		if (runAsTypeEClass == null) {
			runAsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(150);
		}
		return runAsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunAsType_Description() {
        return (EReference)getRunAsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunAsType_RoleName() {
        return (EReference)getRunAsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunAsType_Id() {
        return (EAttribute)getRunAsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityIdentityType() {
		if (securityIdentityTypeEClass == null) {
			securityIdentityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(151);
		}
		return securityIdentityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityIdentityType_Description() {
        return (EReference)getSecurityIdentityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityIdentityType_UseCallerIdentity() {
        return (EReference)getSecurityIdentityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityIdentityType_RunAs() {
        return (EReference)getSecurityIdentityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityIdentityType_Id() {
        return (EAttribute)getSecurityIdentityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRoleRefType() {
		if (securityRoleRefTypeEClass == null) {
			securityRoleRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(152);
		}
		return securityRoleRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_Description() {
        return (EReference)getSecurityRoleRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_RoleName() {
        return (EReference)getSecurityRoleRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_RoleLink() {
        return (EReference)getSecurityRoleRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRoleRefType_Id() {
        return (EAttribute)getSecurityRoleRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRoleType() {
		if (securityRoleTypeEClass == null) {
			securityRoleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(153);
		}
		return securityRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleType_Description() {
        return (EReference)getSecurityRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleType_RoleName() {
        return (EReference)getSecurityRoleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRoleType_Id() {
        return (EAttribute)getSecurityRoleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRefType() {
		if (serviceRefTypeEClass == null) {
			serviceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(154);
		}
		return serviceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Description() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_DisplayName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Icon() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceRefName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceInterface() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceRefType() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_WsdlFile() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_JaxrpcMappingFile() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceQname() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_PortComponentRef() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Handler() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_HandlerChains() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_MappedName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_InjectionTarget() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_LookupName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefType_Id() {
        return (EAttribute)getServiceRefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionBeanType() {
		if (sessionBeanTypeEClass == null) {
			sessionBeanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(155);
		}
		return sessionBeanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Description() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_DisplayName() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Icon() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbName() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_MappedName() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Home() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Remote() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_LocalHome() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Local() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_BusinessLocal() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_BusinessRemote() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_LocalBean() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ServiceEndpoint() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbClass() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_SessionType() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_StatefulTimeout() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_TimeoutMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_Timer() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_InitOnStartup() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ConcurrencyManagementType() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ConcurrentMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_DependsOn() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_InitMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_RemoveMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_AsyncMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_TransactionType() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_AfterBeginMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_BeforeCompletionMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_AfterCompletionMethod() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_AroundInvoke() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_AroundTimeout() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EnvEntry() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_EjbLocalRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ServiceRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ResourceRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_ResourceEnvRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_MessageDestinationRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_PersistenceContextRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_PersistenceUnitRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_PostConstruct() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_PreDestroy() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_DataSource() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_PostActivate() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_PrePassivate() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_SecurityRoleRef() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionBeanType_SecurityIdentity() {
        return (EReference)getSessionBeanType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionBeanType_Id() {
        return (EAttribute)getSessionBeanType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionTypeType() {
		if (sessionTypeTypeEClass == null) {
			sessionTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(156);
		}
		return sessionTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatefulTimeoutType() {
		if (statefulTimeoutTypeEClass == null) {
			statefulTimeoutTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(159);
		}
		return statefulTimeoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatefulTimeoutType_Timeout() {
        return (EReference)getStatefulTimeoutType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatefulTimeoutType_Unit() {
        return (EReference)getStatefulTimeoutType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatefulTimeoutType_Id() {
        return (EAttribute)getStatefulTimeoutType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		if (stringEClass == null) {
			stringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(160);
		}
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Value() {
        return (EAttribute)getString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Id() {
        return (EAttribute)getString().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerScheduleType() {
		if (timerScheduleTypeEClass == null) {
			timerScheduleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(161);
		}
		return timerScheduleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerScheduleType_Second() {
        return (EReference)getTimerScheduleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerScheduleType_Minute() {
        return (EReference)getTimerScheduleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerScheduleType_Hour() {
        return (EReference)getTimerScheduleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerScheduleType_DayOfMonth() {
        return (EReference)getTimerScheduleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerScheduleType_Month() {
        return (EReference)getTimerScheduleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerScheduleType_DayOfWeek() {
        return (EReference)getTimerScheduleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerScheduleType_Year() {
        return (EReference)getTimerScheduleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerScheduleType_Id() {
        return (EAttribute)getTimerScheduleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerType() {
		if (timerTypeEClass == null) {
			timerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(162);
		}
		return timerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerType_Description() {
        return (EReference)getTimerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerType_Schedule() {
        return (EReference)getTimerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerType_Start() {
        return (EAttribute)getTimerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerType_End() {
        return (EAttribute)getTimerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerType_TimeoutMethod() {
        return (EReference)getTimerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerType_Persistent() {
        return (EReference)getTimerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerType_Timezone() {
        return (EReference)getTimerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerType_Info() {
        return (EReference)getTimerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerType_Id() {
        return (EAttribute)getTimerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeUnitTypeType() {
		if (timeUnitTypeTypeEClass == null) {
			timeUnitTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(163);
		}
		return timeUnitTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionTypeType() {
		if (transactionTypeTypeEClass == null) {
			transactionTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(166);
		}
		return transactionTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransAttributeType() {
		if (transAttributeTypeEClass == null) {
			transAttributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(169);
		}
		return transAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueFalseType() {
		if (trueFalseTypeEClass == null) {
			trueFalseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(172);
		}
		return trueFalseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlPatternType() {
		if (urlPatternTypeEClass == null) {
			urlPatternTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(175);
		}
		return urlPatternTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlPatternType_Value() {
        return (EAttribute)getUrlPatternType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdAnyURIType() {
		if (xsdAnyURITypeEClass == null) {
			xsdAnyURITypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(176);
		}
		return xsdAnyURITypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdAnyURIType_Value() {
        return (EAttribute)getXsdAnyURIType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdAnyURIType_Id() {
        return (EAttribute)getXsdAnyURIType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdBooleanType() {
		if (xsdBooleanTypeEClass == null) {
			xsdBooleanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(177);
		}
		return xsdBooleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdBooleanType_Value() {
        return (EAttribute)getXsdBooleanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdBooleanType_Id() {
        return (EAttribute)getXsdBooleanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdIntegerType() {
		if (xsdIntegerTypeEClass == null) {
			xsdIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(178);
		}
		return xsdIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdIntegerType_Value() {
        return (EAttribute)getXsdIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdIntegerType_Id() {
        return (EAttribute)getXsdIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdNMTOKENType() {
		if (xsdNMTOKENTypeEClass == null) {
			xsdNMTOKENTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(179);
		}
		return xsdNMTOKENTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNMTOKENType_Value() {
        return (EAttribute)getXsdNMTOKENType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNMTOKENType_Id() {
        return (EAttribute)getXsdNMTOKENType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdNonNegativeIntegerType() {
		if (xsdNonNegativeIntegerTypeEClass == null) {
			xsdNonNegativeIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(180);
		}
		return xsdNonNegativeIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNonNegativeIntegerType_Value() {
        return (EAttribute)getXsdNonNegativeIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNonNegativeIntegerType_Id() {
        return (EAttribute)getXsdNonNegativeIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdPositiveIntegerType() {
		if (xsdPositiveIntegerTypeEClass == null) {
			xsdPositiveIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(181);
		}
		return xsdPositiveIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdPositiveIntegerType_Value() {
        return (EAttribute)getXsdPositiveIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdPositiveIntegerType_Id() {
        return (EAttribute)getXsdPositiveIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdQNameType() {
		if (xsdQNameTypeEClass == null) {
			xsdQNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(182);
		}
		return xsdQNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdQNameType_Value() {
        return (EAttribute)getXsdQNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdQNameType_Id() {
        return (EAttribute)getXsdQNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdStringType() {
		if (xsdStringTypeEClass == null) {
			xsdStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(183);
		}
		return xsdStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdStringType_Value() {
        return (EAttribute)getXsdStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdStringType_Id() {
        return (EAttribute)getXsdStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressingResponsesTypeBase() {
		if (addressingResponsesTypeBaseEEnum == null) {
			addressingResponsesTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(4);
		}
		return addressingResponsesTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCmpVersionTypeBase() {
		if (cmpVersionTypeBaseEEnum == null) {
			cmpVersionTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(14);
		}
		return cmpVersionTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCmrFieldTypeTypeBase() {
		if (cmrFieldTypeTypeBaseEEnum == null) {
			cmrFieldTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(18);
		}
		return cmrFieldTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConcurrencyManagementTypeTypeBase() {
		if (concurrencyManagementTypeTypeBaseEEnum == null) {
			concurrencyManagementTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(21);
		}
		return concurrencyManagementTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConcurrentLockTypeTypeBase() {
		if (concurrentLockTypeTypeBaseEEnum == null) {
			concurrentLockTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(24);
		}
		return concurrentLockTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEjbRefTypeTypeBase() {
		if (ejbRefTypeTypeBaseEEnum == null) {
			ejbRefTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(46);
		}
		return ejbRefTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericBooleanTypeBase() {
		if (genericBooleanTypeBaseEEnum == null) {
			genericBooleanTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(60);
		}
		return genericBooleanTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsolationLevelType() {
		if (isolationLevelTypeEEnum == null) {
			isolationLevelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(74);
		}
		return isolationLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageDestinationUsageTypeBase() {
		if (messageDestinationUsageTypeBaseEEnum == null) {
			messageDestinationUsageTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(97);
		}
		return messageDestinationUsageTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodIntfTypeBase() {
		if (methodIntfTypeBaseEEnum == null) {
			methodIntfTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(101);
		}
		return methodIntfTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicityTypeBase() {
		if (multiplicityTypeBaseEEnum == null) {
			multiplicityTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(109);
		}
		return multiplicityTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceContextTypeTypeBase() {
		if (persistenceContextTypeTypeBaseEEnum == null) {
			persistenceContextTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(117);
		}
		return persistenceContextTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceTypeTypeBase() {
		if (persistenceTypeTypeBaseEEnum == null) {
			persistenceTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(120);
		}
		return persistenceTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResAuthTypeBase() {
		if (resAuthTypeBaseEEnum == null) {
			resAuthTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(137);
		}
		return resAuthTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResSharingScopeTypeBase() {
		if (resSharingScopeTypeBaseEEnum == null) {
			resSharingScopeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(143);
		}
		return resSharingScopeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResultTypeMappingTypeBase() {
		if (resultTypeMappingTypeBaseEEnum == null) {
			resultTypeMappingTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(146);
		}
		return resultTypeMappingTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSessionTypeTypeBase() {
		if (sessionTypeTypeBaseEEnum == null) {
			sessionTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(157);
		}
		return sessionTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnitTypeTypeBase() {
		if (timeUnitTypeTypeBaseEEnum == null) {
			timeUnitTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(164);
		}
		return timeUnitTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionTypeTypeBase() {
		if (transactionTypeTypeBaseEEnum == null) {
			transactionTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(167);
		}
		return transactionTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransAttributeTypeBase() {
		if (transAttributeTypeBaseEEnum == null) {
			transAttributeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(170);
		}
		return transAttributeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressingResponsesTypeBaseObject() {
		if (addressingResponsesTypeBaseObjectEDataType == null) {
			addressingResponsesTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(5);
		}
		return addressingResponsesTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCmpVersionTypeBaseObject() {
		if (cmpVersionTypeBaseObjectEDataType == null) {
			cmpVersionTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(15);
		}
		return cmpVersionTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCmrFieldTypeTypeBaseObject() {
		if (cmrFieldTypeTypeBaseObjectEDataType == null) {
			cmrFieldTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(19);
		}
		return cmrFieldTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConcurrencyManagementTypeTypeBaseObject() {
		if (concurrencyManagementTypeTypeBaseObjectEDataType == null) {
			concurrencyManagementTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(22);
		}
		return concurrencyManagementTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConcurrentLockTypeTypeBaseObject() {
		if (concurrentLockTypeTypeBaseObjectEDataType == null) {
			concurrentLockTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(25);
		}
		return concurrentLockTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeweyVersionType() {
		if (deweyVersionTypeEDataType == null) {
			deweyVersionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(31);
		}
		return deweyVersionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbClassTypeBase() {
		if (ejbClassTypeBaseEDataType == null) {
			ejbClassTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(35);
		}
		return ejbClassTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbLinkTypeBase() {
		if (ejbLinkTypeBaseEDataType == null) {
			ejbLinkTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(38);
		}
		return ejbLinkTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbNameTypeBase() {
		if (ejbNameTypeBaseEDataType == null) {
			ejbNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(41);
		}
		return ejbNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbRefNameTypeBase() {
		if (ejbRefNameTypeBaseEDataType == null) {
			ejbRefNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(43);
		}
		return ejbRefNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbRefTypeTypeBaseObject() {
		if (ejbRefTypeTypeBaseObjectEDataType == null) {
			ejbRefTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(47);
		}
		return ejbRefTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnvEntryTypeValuesTypeBase() {
		if (envEntryTypeValuesTypeBaseEDataType == null) {
			envEntryTypeValuesTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(55);
		}
		return envEntryTypeValuesTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFullyQualifiedClassTypeBase() {
		if (fullyQualifiedClassTypeBaseEDataType == null) {
			fullyQualifiedClassTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(58);
		}
		return fullyQualifiedClassTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenericBooleanTypeBaseObject() {
		if (genericBooleanTypeBaseObjectEDataType == null) {
			genericBooleanTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(61);
		}
		return genericBooleanTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHomeTypeBase() {
		if (homeTypeBaseEDataType == null) {
			homeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(66);
		}
		return homeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIsolationLevelTypeObject() {
		if (isolationLevelTypeObjectEDataType == null) {
			isolationLevelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(75);
		}
		return isolationLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaIdentifierTypeBase() {
		if (javaIdentifierTypeBaseEDataType == null) {
			javaIdentifierTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(77);
		}
		return javaIdentifierTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaTypeTypeBase() {
		if (javaTypeTypeBaseEDataType == null) {
			javaTypeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(79);
		}
		return javaTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJdbcUrlTypeBase() {
		if (jdbcUrlTypeBaseEDataType == null) {
			jdbcUrlTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(81);
		}
		return jdbcUrlTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJndiNameTypeBase() {
		if (jndiNameTypeBaseEDataType == null) {
			jndiNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(83);
		}
		return jndiNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalHomeTypeBase() {
		if (localHomeTypeBaseEDataType == null) {
			localHomeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(87);
		}
		return localHomeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalTypeBase() {
		if (localTypeBaseEDataType == null) {
			localTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(89);
		}
		return localTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationLinkTypeBase() {
		if (messageDestinationLinkTypeBaseEDataType == null) {
			messageDestinationLinkTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(91);
		}
		return messageDestinationLinkTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationTypeTypeBase() {
		if (messageDestinationTypeTypeBaseEDataType == null) {
			messageDestinationTypeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(95);
		}
		return messageDestinationTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationUsageTypeBaseObject() {
		if (messageDestinationUsageTypeBaseObjectEDataType == null) {
			messageDestinationUsageTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(98);
		}
		return messageDestinationUsageTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodIntfTypeBaseObject() {
		if (methodIntfTypeBaseObjectEDataType == null) {
			methodIntfTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(102);
		}
		return methodIntfTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodNameTypeBase() {
		if (methodNameTypeBaseEDataType == null) {
			methodNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(104);
		}
		return methodNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultiplicityTypeBaseObject() {
		if (multiplicityTypeBaseObjectEDataType == null) {
			multiplicityTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(110);
		}
		return multiplicityTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathTypeBase() {
		if (pathTypeBaseEDataType == null) {
			pathTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(114);
		}
		return pathTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersistenceContextTypeTypeBaseObject() {
		if (persistenceContextTypeTypeBaseObjectEDataType == null) {
			persistenceContextTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(118);
		}
		return persistenceContextTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersistenceTypeTypeBaseObject() {
		if (persistenceTypeTypeBaseObjectEDataType == null) {
			persistenceTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(121);
		}
		return persistenceTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolBindingListType() {
		if (protocolBindingListTypeEDataType == null) {
			protocolBindingListTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(125);
		}
		return protocolBindingListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolBindingType() {
		if (protocolBindingTypeEDataType == null) {
			protocolBindingTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(126);
		}
		return protocolBindingTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolURIAliasType() {
		if (protocolURIAliasTypeEDataType == null) {
			protocolURIAliasTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(127);
		}
		return protocolURIAliasTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQnamePattern() {
		if (qnamePatternEDataType == null) {
			qnamePatternEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(128);
		}
		return qnamePatternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRemoteTypeBase() {
		if (remoteTypeBaseEDataType == null) {
			remoteTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(134);
		}
		return remoteTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResAuthTypeBaseObject() {
		if (resAuthTypeBaseObjectEDataType == null) {
			resAuthTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(138);
		}
		return resAuthTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResSharingScopeTypeBaseObject() {
		if (resSharingScopeTypeBaseObjectEDataType == null) {
			resSharingScopeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(144);
		}
		return resSharingScopeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResultTypeMappingTypeBaseObject() {
		if (resultTypeMappingTypeBaseObjectEDataType == null) {
			resultTypeMappingTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(147);
		}
		return resultTypeMappingTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleNameTypeBase() {
		if (roleNameTypeBaseEDataType == null) {
			roleNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(149);
		}
		return roleNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSessionTypeTypeBaseObject() {
		if (sessionTypeTypeBaseObjectEDataType == null) {
			sessionTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(158);
		}
		return sessionTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeUnitTypeTypeBaseObject() {
		if (timeUnitTypeTypeBaseObjectEDataType == null) {
			timeUnitTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(165);
		}
		return timeUnitTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransactionTypeTypeBaseObject() {
		if (transactionTypeTypeBaseObjectEDataType == null) {
			transactionTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(168);
		}
		return transactionTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransAttributeTypeBaseObject() {
		if (transAttributeTypeBaseObjectEDataType == null) {
			transAttributeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(171);
		}
		return transAttributeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrueFalseTypeBase() {
		if (trueFalseTypeBaseEDataType == null) {
			trueFalseTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(173);
		}
		return trueFalseTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrueFalseTypeBaseObject() {
		if (trueFalseTypeBaseObjectEDataType == null) {
			trueFalseTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EjbJar31Package.eNS_URI).getEClassifiers().get(174);
		}
		return trueFalseTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar31Factory getEjbJar31Factory() {
		return (EjbJar31Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename); //$NON-NLS-1$
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.modisco.jee.ejbjar.EjbJar31." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} //EjbJar31PackageImpl
