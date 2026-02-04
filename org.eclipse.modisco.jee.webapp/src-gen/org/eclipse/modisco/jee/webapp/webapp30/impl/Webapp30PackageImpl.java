/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp30.impl;

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

import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Factory;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.util.Webapp30Validator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class Webapp30PackageImpl extends EPackageImpl implements Webapp30Package {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "webapp30.ecore"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteOrderingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressingResponsesTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookieCommentTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookieConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookieDomainTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookieNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookiePathTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatcherTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbLocalRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRefNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRefTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEntryTypeValuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorPageTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formLoginConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullyQualifiedClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericBooleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerChainsTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerChainTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass homeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injectionTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdbcUrlTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jndiNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspFileTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspPropertyGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleCallbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listenerTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeEncodingMappingListTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeEncodingMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localHomeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDestinationUsageTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipartConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonEmptyStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingOrderingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingOthersTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceContextRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceContextTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceUnitRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portComponentRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resAuthTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEnvRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respectBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resSharingScopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runAsTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRoleRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servletMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servletNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servletTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taglibTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackingModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportGuaranteeTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueFalseTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlPatternTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDataConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAppTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webFragmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webResourceCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass welcomeFileListTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdAnyURITypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdBooleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdNMTOKENTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdNonNegativeIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdPositiveIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdQNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressingResponsesTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dispatcherTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ejbRefTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genericBooleanTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isolationLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageDestinationUsageTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nullCharTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceContextTypeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resAuthTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resSharingScopeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trackingModeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportGuaranteeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webAppVersionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressingResponsesTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType authMethodTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deweyVersionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dispatcherTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbLinkTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbRefNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ejbRefTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encodingTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType envEntryTypeValuesTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType errorCodeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fullyQualifiedClassTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType genericBooleanTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType homeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpMethodTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isolationLevelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaIdentifierTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaTypeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jdbcUrlTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jndiNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jspFileTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType loadOnStartupTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localHomeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageDestinationLinkTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageDestinationTypeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageDestinationUsageTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mimeTypeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyStringTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nullCharTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType persistenceContextTypeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType protocolBindingListTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType protocolBindingTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType protocolURIAliasTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qnamePatternEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType remoteTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resAuthTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resSharingScopeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roleNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trackingModeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transportGuaranteeTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trueFalseTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trueFalseTypeBaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType warPathTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType webAppVersionTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Webapp30PackageImpl() {
		super(eNS_URI, Webapp30Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link Webapp30Package#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @generated
	 */
	public static Webapp30Package init() {
		if (isInited) return (Webapp30Package)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI);

		// Obtain or create and register package
		Webapp30PackageImpl theWebapp30Package = (Webapp30PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Webapp30PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Webapp30PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theWebapp30Package.loadPackage();

		// Fix loaded packages
		theWebapp30Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebapp30Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Webapp30Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebapp30Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Webapp30Package.eNS_URI, theWebapp30Package);
		return theWebapp30Package;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteOrderingType() {
		if (absoluteOrderingTypeEClass == null) {
			absoluteOrderingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(0);
		}
		return absoluteOrderingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteOrderingType_Group() {
        return (EAttribute)getAbsoluteOrderingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteOrderingType_Name() {
        return (EReference)getAbsoluteOrderingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteOrderingType_Others() {
        return (EReference)getAbsoluteOrderingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressingResponsesType() {
		if (addressingResponsesTypeEClass == null) {
			addressingResponsesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(1);
		}
		return addressingResponsesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressingType() {
		if (addressingTypeEClass == null) {
			addressingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(4);
		}
		return addressingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressingType_Enabled() {
        return (EReference)getAddressingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressingType_Required() {
        return (EReference)getAddressingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressingType_Responses() {
        return (EReference)getAddressingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthConstraintType() {
		if (authConstraintTypeEClass == null) {
			authConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(5);
		}
		return authConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthConstraintType_Description() {
        return (EReference)getAuthConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthConstraintType_RoleName() {
        return (EReference)getAuthConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthConstraintType_Id() {
        return (EAttribute)getAuthConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthMethodType() {
		if (authMethodTypeEClass == null) {
			authMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(6);
		}
		return authMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookieCommentType() {
		if (cookieCommentTypeEClass == null) {
			cookieCommentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(8);
		}
		return cookieCommentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookieConfigType() {
		if (cookieConfigTypeEClass == null) {
			cookieConfigTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(9);
		}
		return cookieConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookieConfigType_Name() {
        return (EReference)getCookieConfigType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookieConfigType_Domain() {
        return (EReference)getCookieConfigType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookieConfigType_Path() {
        return (EReference)getCookieConfigType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookieConfigType_Comment() {
        return (EReference)getCookieConfigType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookieConfigType_HttpOnly() {
        return (EReference)getCookieConfigType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookieConfigType_Secure() {
        return (EReference)getCookieConfigType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookieConfigType_MaxAge() {
        return (EReference)getCookieConfigType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCookieConfigType_Id() {
        return (EAttribute)getCookieConfigType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookieDomainType() {
		if (cookieDomainTypeEClass == null) {
			cookieDomainTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(10);
		}
		return cookieDomainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookieNameType() {
		if (cookieNameTypeEClass == null) {
			cookieNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(11);
		}
		return cookieNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookiePathType() {
		if (cookiePathTypeEClass == null) {
			cookiePathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(12);
		}
		return cookiePathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceType() {
		if (dataSourceTypeEClass == null) {
			dataSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(13);
		}
		return dataSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Description() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Name() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_ClassName() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_ServerName() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_PortNumber() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_DatabaseName() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Url() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_User() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Password() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Property() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_LoginTimeout() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_Transactional() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceType_IsolationLevel() {
        return (EAttribute)getDataSourceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_InitialPoolSize() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MaxPoolSize() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MinPoolSize() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MaxIdleTime() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceType_MaxStatements() {
        return (EReference)getDataSourceType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceType_Id() {
        return (EAttribute)getDataSourceType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		if (descriptionTypeEClass == null) {
			descriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(14);
		}
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Lang() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatcherType() {
		if (dispatcherTypeEClass == null) {
			dispatcherTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(16);
		}
		return dispatcherTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayNameType() {
		if (displayNameTypeEClass == null) {
			displayNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(19);
		}
		return displayNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayNameType_Lang() {
        return (EAttribute)getDisplayNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(20);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WebApp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbLinkType() {
		if (ejbLinkTypeEClass == null) {
			ejbLinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(21);
		}
		return ejbLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbLocalRefType() {
		if (ejbLocalRefTypeEClass == null) {
			ejbLocalRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(23);
		}
		return ejbLocalRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_Description() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbRefName() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbRefType() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_LocalHome() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_Local() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_EjbLink() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_MappedName() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_InjectionTarget() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_LookupName() {
        return (EReference)getEjbLocalRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbLocalRefType_Id() {
        return (EAttribute)getEjbLocalRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefNameType() {
		if (ejbRefNameTypeEClass == null) {
			ejbRefNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(24);
		}
		return ejbRefNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefType() {
		if (ejbRefTypeEClass == null) {
			ejbRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(26);
		}
		return ejbRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Description() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbRefName() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbRefType() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Home() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_Remote() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_EjbLink() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_MappedName() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_InjectionTarget() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_LookupName() {
        return (EReference)getEjbRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRefType_Id() {
        return (EAttribute)getEjbRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjbRefTypeType() {
		if (ejbRefTypeTypeEClass == null) {
			ejbRefTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(27);
		}
		return ejbRefTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyType() {
		if (emptyTypeEClass == null) {
			emptyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(30);
		}
		return emptyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmptyType_Id() {
        return (EAttribute)getEmptyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvEntryType() {
		if (envEntryTypeEClass == null) {
			envEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(32);
		}
		return envEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_Description() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryName() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryType() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_EnvEntryValue() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_MappedName() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_InjectionTarget() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_LookupName() {
        return (EReference)getEnvEntryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvEntryType_Id() {
        return (EAttribute)getEnvEntryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvEntryTypeValuesType() {
		if (envEntryTypeValuesTypeEClass == null) {
			envEntryTypeValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(33);
		}
		return envEntryTypeValuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorCodeType() {
		if (errorCodeTypeEClass == null) {
			errorCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(35);
		}
		return errorCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorPageType() {
		if (errorPageTypeEClass == null) {
			errorPageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(37);
		}
		return errorPageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPageType_ErrorCode() {
        return (EReference)getErrorPageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPageType_ExceptionType() {
        return (EReference)getErrorPageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPageType_Location() {
        return (EReference)getErrorPageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorPageType_Id() {
        return (EAttribute)getErrorPageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterMappingType() {
		if (filterMappingTypeEClass == null) {
			filterMappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(38);
		}
		return filterMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_FilterName() {
        return (EReference)getFilterMappingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterMappingType_Group() {
        return (EAttribute)getFilterMappingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_UrlPattern() {
        return (EReference)getFilterMappingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_ServletName() {
        return (EReference)getFilterMappingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_Dispatcher() {
        return (EReference)getFilterMappingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterMappingType_Id() {
        return (EAttribute)getFilterMappingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterNameType() {
		if (filterNameTypeEClass == null) {
			filterNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(39);
		}
		return filterNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterType() {
		if (filterTypeEClass == null) {
			filterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(40);
		}
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_Description() {
        return (EReference)getFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_DisplayName() {
        return (EReference)getFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_Icon() {
        return (EReference)getFilterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_FilterName() {
        return (EReference)getFilterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_FilterClass() {
        return (EReference)getFilterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_AsyncSupported() {
        return (EReference)getFilterType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_InitParam() {
        return (EReference)getFilterType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterType_Id() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormLoginConfigType() {
		if (formLoginConfigTypeEClass == null) {
			formLoginConfigTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(41);
		}
		return formLoginConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLoginConfigType_FormLoginPage() {
        return (EReference)getFormLoginConfigType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLoginConfigType_FormErrorPage() {
        return (EReference)getFormLoginConfigType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLoginConfigType_Id() {
        return (EAttribute)getFormLoginConfigType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullyQualifiedClassType() {
		if (fullyQualifiedClassTypeEClass == null) {
			fullyQualifiedClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(42);
		}
		return fullyQualifiedClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericBooleanType() {
		if (genericBooleanTypeEClass == null) {
			genericBooleanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(44);
		}
		return genericBooleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerChainsType() {
		if (handlerChainsTypeEClass == null) {
			handlerChainsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(47);
		}
		return handlerChainsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerChainsType_HandlerChain() {
        return (EReference)getHandlerChainsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainsType_Id() {
        return (EAttribute)getHandlerChainsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerChainType() {
		if (handlerChainTypeEClass == null) {
			handlerChainTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(48);
		}
		return handlerChainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_ServiceNamePattern() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_PortNamePattern() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_ProtocolBindings() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerChainType_Handler() {
        return (EReference)getHandlerChainType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerChainType_Id() {
        return (EAttribute)getHandlerChainType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerType() {
		if (handlerTypeEClass == null) {
			handlerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(49);
		}
		return handlerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_Description() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_DisplayName() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_Icon() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_HandlerName() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_HandlerClass() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_InitParam() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_SoapHeader() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_SoapRole() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerType_PortName() {
        return (EReference)getHandlerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerType_Id() {
        return (EAttribute)getHandlerType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHomeType() {
		if (homeTypeEClass == null) {
			homeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(50);
		}
		return homeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconType() {
		if (iconTypeEClass == null) {
			iconTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(53);
		}
		return iconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconType_SmallIcon() {
        return (EReference)getIconType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconType_LargeIcon() {
        return (EReference)getIconType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_Id() {
        return (EAttribute)getIconType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_Lang() {
        return (EAttribute)getIconType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjectionTargetType() {
		if (injectionTargetTypeEClass == null) {
			injectionTargetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(54);
		}
		return injectionTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionTargetType_InjectionTargetClass() {
        return (EReference)getInjectionTargetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionTargetType_InjectionTargetName() {
        return (EReference)getInjectionTargetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaIdentifierType() {
		if (javaIdentifierTypeEClass == null) {
			javaIdentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(57);
		}
		return javaIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaTypeType() {
		if (javaTypeTypeEClass == null) {
			javaTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(59);
		}
		return javaTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdbcUrlType() {
		if (jdbcUrlTypeEClass == null) {
			jdbcUrlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(61);
		}
		return jdbcUrlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJndiNameType() {
		if (jndiNameTypeEClass == null) {
			jndiNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(63);
		}
		return jndiNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJspConfigType() {
		if (jspConfigTypeEClass == null) {
			jspConfigTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(65);
		}
		return jspConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspConfigType_Taglib() {
        return (EReference)getJspConfigType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspConfigType_JspPropertyGroup() {
        return (EReference)getJspConfigType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJspConfigType_Id() {
        return (EAttribute)getJspConfigType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJspFileType() {
		if (jspFileTypeEClass == null) {
			jspFileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(66);
		}
		return jspFileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJspPropertyGroupType() {
		if (jspPropertyGroupTypeEClass == null) {
			jspPropertyGroupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(68);
		}
		return jspPropertyGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_Description() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_DisplayName() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_Icon() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_UrlPattern() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_ElIgnored() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_PageEncoding() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_ScriptingInvalid() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_IsXml() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_IncludePrelude() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_IncludeCoda() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_DeferredSyntaxAllowedAsLiteral() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_TrimDirectiveWhitespaces() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_DefaultContentType() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_Buffer() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_ErrorOnUndeclaredNamespace() {
        return (EReference)getJspPropertyGroupType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJspPropertyGroupType_Id() {
        return (EAttribute)getJspPropertyGroupType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifecycleCallbackType() {
		if (lifecycleCallbackTypeEClass == null) {
			lifecycleCallbackTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(69);
		}
		return lifecycleCallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleCallbackType_LifecycleCallbackClass() {
        return (EReference)getLifecycleCallbackType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleCallbackType_LifecycleCallbackMethod() {
        return (EReference)getLifecycleCallbackType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListenerType() {
		if (listenerTypeEClass == null) {
			listenerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(70);
		}
		return listenerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_Description() {
        return (EReference)getListenerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_DisplayName() {
        return (EReference)getListenerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_Icon() {
        return (EReference)getListenerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListenerType_ListenerClass() {
        return (EReference)getListenerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListenerType_Id() {
        return (EAttribute)getListenerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocaleEncodingMappingListType() {
		if (localeEncodingMappingListTypeEClass == null) {
			localeEncodingMappingListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(72);
		}
		return localeEncodingMappingListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleEncodingMappingListType_LocaleEncodingMapping() {
        return (EReference)getLocaleEncodingMappingListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingListType_Id() {
        return (EAttribute)getLocaleEncodingMappingListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocaleEncodingMappingType() {
		if (localeEncodingMappingTypeEClass == null) {
			localeEncodingMappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(73);
		}
		return localeEncodingMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingType_Locale() {
        return (EAttribute)getLocaleEncodingMappingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingType_Encoding() {
        return (EAttribute)getLocaleEncodingMappingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingType_Id() {
        return (EAttribute)getLocaleEncodingMappingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalHomeType() {
		if (localHomeTypeEClass == null) {
			localHomeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(75);
		}
		return localHomeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalType() {
		if (localTypeEClass == null) {
			localTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(77);
		}
		return localTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginConfigType() {
		if (loginConfigTypeEClass == null) {
			loginConfigTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(79);
		}
		return loginConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginConfigType_AuthMethod() {
        return (EReference)getLoginConfigType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginConfigType_RealmName() {
        return (EReference)getLoginConfigType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginConfigType_FormLoginConfig() {
        return (EReference)getLoginConfigType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginConfigType_Id() {
        return (EAttribute)getLoginConfigType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationLinkType() {
		if (messageDestinationLinkTypeEClass == null) {
			messageDestinationLinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(80);
		}
		return messageDestinationLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationRefType() {
		if (messageDestinationRefTypeEClass == null) {
			messageDestinationRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(82);
		}
		return messageDestinationRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_Description() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationRefName() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationType() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationUsage() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MessageDestinationLink() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_MappedName() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_InjectionTarget() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_LookupName() {
        return (EReference)getMessageDestinationRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationRefType_Id() {
        return (EAttribute)getMessageDestinationRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationType() {
		if (messageDestinationTypeEClass == null) {
			messageDestinationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(83);
		}
		return messageDestinationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_Description() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_DisplayName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_Icon() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_MessageDestinationName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_MappedName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationType_LookupName() {
        return (EReference)getMessageDestinationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationType_Id() {
        return (EAttribute)getMessageDestinationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationTypeType() {
		if (messageDestinationTypeTypeEClass == null) {
			messageDestinationTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(84);
		}
		return messageDestinationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDestinationUsageType() {
		if (messageDestinationUsageTypeEClass == null) {
			messageDestinationUsageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(86);
		}
		return messageDestinationUsageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeMappingType() {
		if (mimeMappingTypeEClass == null) {
			mimeMappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(89);
		}
		return mimeMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeMappingType_Extension() {
        return (EReference)getMimeMappingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeMappingType_MimeType() {
        return (EReference)getMimeMappingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMimeMappingType_Id() {
        return (EAttribute)getMimeMappingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeTypeType() {
		if (mimeTypeTypeEClass == null) {
			mimeTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(90);
		}
		return mimeTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipartConfigType() {
		if (multipartConfigTypeEClass == null) {
			multipartConfigTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(92);
		}
		return multipartConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipartConfigType_Location() {
        return (EReference)getMultipartConfigType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipartConfigType_MaxFileSize() {
        return (EAttribute)getMultipartConfigType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipartConfigType_MaxRequestSize() {
        return (EAttribute)getMultipartConfigType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipartConfigType_FileSizeThreshold() {
        return (EAttribute)getMultipartConfigType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonEmptyStringType() {
		if (nonEmptyStringTypeEClass == null) {
			nonEmptyStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(93);
		}
		return nonEmptyStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderingOrderingType() {
		if (orderingOrderingTypeEClass == null) {
			orderingOrderingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(97);
		}
		return orderingOrderingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingOrderingType_Name() {
        return (EReference)getOrderingOrderingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingOrderingType_Others() {
        return (EReference)getOrderingOrderingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderingOthersType() {
		if (orderingOthersTypeEClass == null) {
			orderingOthersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(98);
		}
		return orderingOthersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderingOthersType_Id() {
        return (EAttribute)getOrderingOthersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderingType() {
		if (orderingTypeEClass == null) {
			orderingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(99);
		}
		return orderingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingType_After() {
        return (EReference)getOrderingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingType_Before() {
        return (EReference)getOrderingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamValueType() {
		if (paramValueTypeEClass == null) {
			paramValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(100);
		}
		return paramValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_Description() {
        return (EReference)getParamValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_ParamName() {
        return (EReference)getParamValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueType_ParamValue() {
        return (EReference)getParamValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamValueType_Id() {
        return (EAttribute)getParamValueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathType() {
		if (pathTypeEClass == null) {
			pathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(101);
		}
		return pathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceContextRefType() {
		if (persistenceContextRefTypeEClass == null) {
			persistenceContextRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(103);
		}
		return persistenceContextRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_Description() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceContextRefName() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceUnitName() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceContextType() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceProperty() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_MappedName() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_InjectionTarget() {
        return (EReference)getPersistenceContextRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceContextRefType_Id() {
        return (EAttribute)getPersistenceContextRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceContextTypeType() {
		if (persistenceContextTypeTypeEClass == null) {
			persistenceContextTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(104);
		}
		return persistenceContextTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnitRefType() {
		if (persistenceUnitRefTypeEClass == null) {
			persistenceUnitRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(107);
		}
		return persistenceUnitRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_Description() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_PersistenceUnitRefName() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_PersistenceUnitName() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_MappedName() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_InjectionTarget() {
        return (EReference)getPersistenceUnitRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnitRefType_Id() {
        return (EAttribute)getPersistenceUnitRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortComponentRefType() {
		if (portComponentRefTypeEClass == null) {
			portComponentRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(108);
		}
		return portComponentRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_ServiceEndpointInterface() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_EnableMtom() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_MtomThreshold() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_Addressing() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_RespectBinding() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_PortComponentLink() {
        return (EReference)getPortComponentRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortComponentRefType_Id() {
        return (EAttribute)getPortComponentRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(109);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Name() {
        return (EReference)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Value() {
        return (EReference)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Id() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteType() {
		if (remoteTypeEClass == null) {
			remoteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(114);
		}
		return remoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResAuthType() {
		if (resAuthTypeEClass == null) {
			resAuthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(116);
		}
		return resAuthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceEnvRefType() {
		if (resourceEnvRefTypeEClass == null) {
			resourceEnvRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(119);
		}
		return resourceEnvRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_Description() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_ResourceEnvRefName() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_ResourceEnvRefType() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_MappedName() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_InjectionTarget() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_LookupName() {
        return (EReference)getResourceEnvRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceEnvRefType_Id() {
        return (EAttribute)getResourceEnvRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRefType() {
		if (resourceRefTypeEClass == null) {
			resourceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(120);
		}
		return resourceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_Description() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResRefName() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResType() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResAuth() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_ResSharingScope() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_MappedName() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_InjectionTarget() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_LookupName() {
        return (EReference)getResourceRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRefType_Id() {
        return (EAttribute)getResourceRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespectBindingType() {
		if (respectBindingTypeEClass == null) {
			respectBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(121);
		}
		return respectBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRespectBindingType_Enabled() {
        return (EReference)getRespectBindingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResSharingScopeType() {
		if (resSharingScopeTypeEClass == null) {
			resSharingScopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(122);
		}
		return resSharingScopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNameType() {
		if (roleNameTypeEClass == null) {
			roleNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(125);
		}
		return roleNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunAsType() {
		if (runAsTypeEClass == null) {
			runAsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(127);
		}
		return runAsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunAsType_Description() {
        return (EReference)getRunAsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunAsType_RoleName() {
        return (EReference)getRunAsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunAsType_Id() {
        return (EAttribute)getRunAsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityConstraintType() {
		if (securityConstraintTypeEClass == null) {
			securityConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(128);
		}
		return securityConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_DisplayName() {
        return (EReference)getSecurityConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_WebResourceCollection() {
        return (EReference)getSecurityConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_AuthConstraint() {
        return (EReference)getSecurityConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_UserDataConstraint() {
        return (EReference)getSecurityConstraintType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityConstraintType_Id() {
        return (EAttribute)getSecurityConstraintType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRoleRefType() {
		if (securityRoleRefTypeEClass == null) {
			securityRoleRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(129);
		}
		return securityRoleRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_Description() {
        return (EReference)getSecurityRoleRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_RoleName() {
        return (EReference)getSecurityRoleRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleRefType_RoleLink() {
        return (EReference)getSecurityRoleRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRoleRefType_Id() {
        return (EAttribute)getSecurityRoleRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRoleType() {
		if (securityRoleTypeEClass == null) {
			securityRoleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(130);
		}
		return securityRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleType_Description() {
        return (EReference)getSecurityRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRoleType_RoleName() {
        return (EReference)getSecurityRoleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRoleType_Id() {
        return (EAttribute)getSecurityRoleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRefType() {
		if (serviceRefTypeEClass == null) {
			serviceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(131);
		}
		return serviceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Description() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_DisplayName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Icon() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceRefName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceInterface() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceRefType() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_WsdlFile() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_JaxrpcMappingFile() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceQname() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_PortComponentRef() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Handler() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_HandlerChains() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_MappedName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_InjectionTarget() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_LookupName() {
        return (EReference)getServiceRefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefType_Id() {
        return (EAttribute)getServiceRefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServletMappingType() {
		if (servletMappingTypeEClass == null) {
			servletMappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(132);
		}
		return servletMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletMappingType_ServletName() {
        return (EReference)getServletMappingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletMappingType_UrlPattern() {
        return (EReference)getServletMappingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServletMappingType_Id() {
        return (EAttribute)getServletMappingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServletNameType() {
		if (servletNameTypeEClass == null) {
			servletNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(133);
		}
		return servletNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServletType() {
		if (servletTypeEClass == null) {
			servletTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(134);
		}
		return servletTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_Description() {
        return (EReference)getServletType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_DisplayName() {
        return (EReference)getServletType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_Icon() {
        return (EReference)getServletType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_ServletName() {
        return (EReference)getServletType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_ServletClass() {
        return (EReference)getServletType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_JspFile() {
        return (EReference)getServletType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_InitParam() {
        return (EReference)getServletType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServletType_LoadOnStartup() {
        return (EAttribute)getServletType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_Enabled() {
        return (EReference)getServletType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_AsyncSupported() {
        return (EReference)getServletType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_RunAs() {
        return (EReference)getServletType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_SecurityRoleRef() {
        return (EReference)getServletType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_MultipartConfig() {
        return (EReference)getServletType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServletType_Id() {
        return (EAttribute)getServletType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionConfigType() {
		if (sessionConfigTypeEClass == null) {
			sessionConfigTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(135);
		}
		return sessionConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionConfigType_SessionTimeout() {
        return (EReference)getSessionConfigType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionConfigType_CookieConfig() {
        return (EReference)getSessionConfigType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionConfigType_TrackingMode() {
        return (EReference)getSessionConfigType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionConfigType_Id() {
        return (EAttribute)getSessionConfigType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		if (stringEClass == null) {
			stringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(136);
		}
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Value() {
        return (EAttribute)getString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Id() {
        return (EAttribute)getString().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaglibType() {
		if (taglibTypeEClass == null) {
			taglibTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(137);
		}
		return taglibTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaglibType_TaglibUri() {
        return (EReference)getTaglibType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaglibType_TaglibLocation() {
        return (EReference)getTaglibType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaglibType_Id() {
        return (EAttribute)getTaglibType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrackingModeType() {
		if (trackingModeTypeEClass == null) {
			trackingModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(138);
		}
		return trackingModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportGuaranteeType() {
		if (transportGuaranteeTypeEClass == null) {
			transportGuaranteeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(141);
		}
		return transportGuaranteeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueFalseType() {
		if (trueFalseTypeEClass == null) {
			trueFalseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(144);
		}
		return trueFalseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlPatternType() {
		if (urlPatternTypeEClass == null) {
			urlPatternTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(147);
		}
		return urlPatternTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlPatternType_Value() {
        return (EAttribute)getUrlPatternType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDataConstraintType() {
		if (userDataConstraintTypeEClass == null) {
			userDataConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(148);
		}
		return userDataConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDataConstraintType_Description() {
        return (EReference)getUserDataConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDataConstraintType_TransportGuarantee() {
        return (EReference)getUserDataConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDataConstraintType_Id() {
        return (EAttribute)getUserDataConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarPathType() {
		if (warPathTypeEClass == null) {
			warPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(149);
		}
		return warPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebAppType() {
		if (webAppTypeEClass == null) {
			webAppTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(151);
		}
		return webAppTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_Group() {
        return (EAttribute)getWebAppType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ModuleName() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Description() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_DisplayName() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Icon() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Distributable() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ContextParam() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Filter() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_FilterMapping() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Listener() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Servlet() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ServletMapping() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_SessionConfig() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_MimeMapping() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_WelcomeFileList() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ErrorPage() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_JspConfig() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_SecurityConstraint() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_LoginConfig() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_SecurityRole() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_EnvEntry() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_EjbRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_EjbLocalRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ServiceRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ResourceRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ResourceEnvRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_MessageDestinationRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PersistenceContextRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PersistenceUnitRef() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PostConstruct() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PreDestroy() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_DataSource() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_MessageDestination() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_LocaleEncodingMappingList() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_AbsoluteOrdering() {
        return (EReference)getWebAppType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_Id() {
        return (EAttribute)getWebAppType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_MetadataComplete() {
        return (EAttribute)getWebAppType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_Version() {
        return (EAttribute)getWebAppType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebFragmentType() {
		if (webFragmentTypeEClass == null) {
			webFragmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(154);
		}
		return webFragmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebFragmentType_Group() {
        return (EAttribute)getWebFragmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Name() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Description() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_DisplayName() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Icon() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Distributable() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_ContextParam() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Filter() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_FilterMapping() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Listener() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Servlet() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_ServletMapping() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_SessionConfig() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_MimeMapping() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_WelcomeFileList() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_ErrorPage() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_JspConfig() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_SecurityConstraint() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_LoginConfig() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_SecurityRole() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_EnvEntry() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_EjbRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_EjbLocalRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_ServiceRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_ResourceRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_ResourceEnvRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_MessageDestinationRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_PersistenceContextRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_PersistenceUnitRef() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_PostConstruct() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_PreDestroy() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_DataSource() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_MessageDestination() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_LocaleEncodingMappingList() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebFragmentType_Ordering() {
        return (EReference)getWebFragmentType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebFragmentType_Id() {
        return (EAttribute)getWebFragmentType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebFragmentType_MetadataComplete() {
        return (EAttribute)getWebFragmentType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebFragmentType_Version() {
        return (EAttribute)getWebFragmentType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebResourceCollectionType() {
		if (webResourceCollectionTypeEClass == null) {
			webResourceCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(155);
		}
		return webResourceCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebResourceCollectionType_WebResourceName() {
        return (EReference)getWebResourceCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebResourceCollectionType_Description() {
        return (EReference)getWebResourceCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebResourceCollectionType_UrlPattern() {
        return (EReference)getWebResourceCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceCollectionType_HttpMethod() {
        return (EAttribute)getWebResourceCollectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceCollectionType_HttpMethodOmission() {
        return (EAttribute)getWebResourceCollectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceCollectionType_Id() {
        return (EAttribute)getWebResourceCollectionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWelcomeFileListType() {
		if (welcomeFileListTypeEClass == null) {
			welcomeFileListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(156);
		}
		return welcomeFileListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWelcomeFileListType_WelcomeFile() {
        return (EAttribute)getWelcomeFileListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWelcomeFileListType_Id() {
        return (EAttribute)getWelcomeFileListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdAnyURIType() {
		if (xsdAnyURITypeEClass == null) {
			xsdAnyURITypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(157);
		}
		return xsdAnyURITypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdAnyURIType_Value() {
        return (EAttribute)getXsdAnyURIType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdAnyURIType_Id() {
        return (EAttribute)getXsdAnyURIType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdBooleanType() {
		if (xsdBooleanTypeEClass == null) {
			xsdBooleanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(158);
		}
		return xsdBooleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdBooleanType_Value() {
        return (EAttribute)getXsdBooleanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdBooleanType_Id() {
        return (EAttribute)getXsdBooleanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdIntegerType() {
		if (xsdIntegerTypeEClass == null) {
			xsdIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(159);
		}
		return xsdIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdIntegerType_Value() {
        return (EAttribute)getXsdIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdIntegerType_Id() {
        return (EAttribute)getXsdIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdNMTOKENType() {
		if (xsdNMTOKENTypeEClass == null) {
			xsdNMTOKENTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(160);
		}
		return xsdNMTOKENTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNMTOKENType_Value() {
        return (EAttribute)getXsdNMTOKENType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNMTOKENType_Id() {
        return (EAttribute)getXsdNMTOKENType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdNonNegativeIntegerType() {
		if (xsdNonNegativeIntegerTypeEClass == null) {
			xsdNonNegativeIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(161);
		}
		return xsdNonNegativeIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNonNegativeIntegerType_Value() {
        return (EAttribute)getXsdNonNegativeIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdNonNegativeIntegerType_Id() {
        return (EAttribute)getXsdNonNegativeIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdPositiveIntegerType() {
		if (xsdPositiveIntegerTypeEClass == null) {
			xsdPositiveIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(162);
		}
		return xsdPositiveIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdPositiveIntegerType_Value() {
        return (EAttribute)getXsdPositiveIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdPositiveIntegerType_Id() {
        return (EAttribute)getXsdPositiveIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdQNameType() {
		if (xsdQNameTypeEClass == null) {
			xsdQNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(163);
		}
		return xsdQNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdQNameType_Value() {
        return (EAttribute)getXsdQNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdQNameType_Id() {
        return (EAttribute)getXsdQNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXsdStringType() {
		if (xsdStringTypeEClass == null) {
			xsdStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(164);
		}
		return xsdStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdStringType_Value() {
        return (EAttribute)getXsdStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXsdStringType_Id() {
        return (EAttribute)getXsdStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressingResponsesTypeBase() {
		if (addressingResponsesTypeBaseEEnum == null) {
			addressingResponsesTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(2);
		}
		return addressingResponsesTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDispatcherTypeBase() {
		if (dispatcherTypeBaseEEnum == null) {
			dispatcherTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(17);
		}
		return dispatcherTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEjbRefTypeTypeBase() {
		if (ejbRefTypeTypeBaseEEnum == null) {
			ejbRefTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(28);
		}
		return ejbRefTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericBooleanTypeBase() {
		if (genericBooleanTypeBaseEEnum == null) {
			genericBooleanTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(45);
		}
		return genericBooleanTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsolationLevelType() {
		if (isolationLevelTypeEEnum == null) {
			isolationLevelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(55);
		}
		return isolationLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageDestinationUsageTypeBase() {
		if (messageDestinationUsageTypeBaseEEnum == null) {
			messageDestinationUsageTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(87);
		}
		return messageDestinationUsageTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNullCharType() {
		if (nullCharTypeEEnum == null) {
			nullCharTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(95);
		}
		return nullCharTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceContextTypeTypeBase() {
		if (persistenceContextTypeTypeBaseEEnum == null) {
			persistenceContextTypeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(105);
		}
		return persistenceContextTypeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResAuthTypeBase() {
		if (resAuthTypeBaseEEnum == null) {
			resAuthTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(117);
		}
		return resAuthTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResSharingScopeTypeBase() {
		if (resSharingScopeTypeBaseEEnum == null) {
			resSharingScopeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(123);
		}
		return resSharingScopeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTrackingModeTypeBase() {
		if (trackingModeTypeBaseEEnum == null) {
			trackingModeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(139);
		}
		return trackingModeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransportGuaranteeTypeBase() {
		if (transportGuaranteeTypeBaseEEnum == null) {
			transportGuaranteeTypeBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(142);
		}
		return transportGuaranteeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWebAppVersionType() {
		if (webAppVersionTypeEEnum == null) {
			webAppVersionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(152);
		}
		return webAppVersionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressingResponsesTypeBaseObject() {
		if (addressingResponsesTypeBaseObjectEDataType == null) {
			addressingResponsesTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(3);
		}
		return addressingResponsesTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuthMethodTypeBase() {
		if (authMethodTypeBaseEDataType == null) {
			authMethodTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(7);
		}
		return authMethodTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeweyVersionType() {
		if (deweyVersionTypeEDataType == null) {
			deweyVersionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(15);
		}
		return deweyVersionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDispatcherTypeBaseObject() {
		if (dispatcherTypeBaseObjectEDataType == null) {
			dispatcherTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(18);
		}
		return dispatcherTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbLinkTypeBase() {
		if (ejbLinkTypeBaseEDataType == null) {
			ejbLinkTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(22);
		}
		return ejbLinkTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbRefNameTypeBase() {
		if (ejbRefNameTypeBaseEDataType == null) {
			ejbRefNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(25);
		}
		return ejbRefNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEjbRefTypeTypeBaseObject() {
		if (ejbRefTypeTypeBaseObjectEDataType == null) {
			ejbRefTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(29);
		}
		return ejbRefTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncodingType() {
		if (encodingTypeEDataType == null) {
			encodingTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(31);
		}
		return encodingTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnvEntryTypeValuesTypeBase() {
		if (envEntryTypeValuesTypeBaseEDataType == null) {
			envEntryTypeValuesTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(34);
		}
		return envEntryTypeValuesTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getErrorCodeTypeBase() {
		if (errorCodeTypeBaseEDataType == null) {
			errorCodeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(36);
		}
		return errorCodeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFullyQualifiedClassTypeBase() {
		if (fullyQualifiedClassTypeBaseEDataType == null) {
			fullyQualifiedClassTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(43);
		}
		return fullyQualifiedClassTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenericBooleanTypeBaseObject() {
		if (genericBooleanTypeBaseObjectEDataType == null) {
			genericBooleanTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(46);
		}
		return genericBooleanTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHomeTypeBase() {
		if (homeTypeBaseEDataType == null) {
			homeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(51);
		}
		return homeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHttpMethodType() {
		if (httpMethodTypeEDataType == null) {
			httpMethodTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(52);
		}
		return httpMethodTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIsolationLevelTypeObject() {
		if (isolationLevelTypeObjectEDataType == null) {
			isolationLevelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(56);
		}
		return isolationLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaIdentifierTypeBase() {
		if (javaIdentifierTypeBaseEDataType == null) {
			javaIdentifierTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(58);
		}
		return javaIdentifierTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaTypeTypeBase() {
		if (javaTypeTypeBaseEDataType == null) {
			javaTypeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(60);
		}
		return javaTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJdbcUrlTypeBase() {
		if (jdbcUrlTypeBaseEDataType == null) {
			jdbcUrlTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(62);
		}
		return jdbcUrlTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJndiNameTypeBase() {
		if (jndiNameTypeBaseEDataType == null) {
			jndiNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(64);
		}
		return jndiNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJspFileTypeBase() {
		if (jspFileTypeBaseEDataType == null) {
			jspFileTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(67);
		}
		return jspFileTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLoadOnStartupType() {
		if (loadOnStartupTypeEDataType == null) {
			loadOnStartupTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(71);
		}
		return loadOnStartupTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocaleType() {
		if (localeTypeEDataType == null) {
			localeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(74);
		}
		return localeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalHomeTypeBase() {
		if (localHomeTypeBaseEDataType == null) {
			localHomeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(76);
		}
		return localHomeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalTypeBase() {
		if (localTypeBaseEDataType == null) {
			localTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(78);
		}
		return localTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationLinkTypeBase() {
		if (messageDestinationLinkTypeBaseEDataType == null) {
			messageDestinationLinkTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(81);
		}
		return messageDestinationLinkTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationTypeTypeBase() {
		if (messageDestinationTypeTypeBaseEDataType == null) {
			messageDestinationTypeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(85);
		}
		return messageDestinationTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageDestinationUsageTypeBaseObject() {
		if (messageDestinationUsageTypeBaseObjectEDataType == null) {
			messageDestinationUsageTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(88);
		}
		return messageDestinationUsageTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMimeTypeTypeBase() {
		if (mimeTypeTypeBaseEDataType == null) {
			mimeTypeTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(91);
		}
		return mimeTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyStringTypeBase() {
		if (nonEmptyStringTypeBaseEDataType == null) {
			nonEmptyStringTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(94);
		}
		return nonEmptyStringTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNullCharTypeObject() {
		if (nullCharTypeObjectEDataType == null) {
			nullCharTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(96);
		}
		return nullCharTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathTypeBase() {
		if (pathTypeBaseEDataType == null) {
			pathTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(102);
		}
		return pathTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersistenceContextTypeTypeBaseObject() {
		if (persistenceContextTypeTypeBaseObjectEDataType == null) {
			persistenceContextTypeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(106);
		}
		return persistenceContextTypeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolBindingListType() {
		if (protocolBindingListTypeEDataType == null) {
			protocolBindingListTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(110);
		}
		return protocolBindingListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolBindingType() {
		if (protocolBindingTypeEDataType == null) {
			protocolBindingTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(111);
		}
		return protocolBindingTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolURIAliasType() {
		if (protocolURIAliasTypeEDataType == null) {
			protocolURIAliasTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(112);
		}
		return protocolURIAliasTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQnamePattern() {
		if (qnamePatternEDataType == null) {
			qnamePatternEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(113);
		}
		return qnamePatternEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRemoteTypeBase() {
		if (remoteTypeBaseEDataType == null) {
			remoteTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(115);
		}
		return remoteTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResAuthTypeBaseObject() {
		if (resAuthTypeBaseObjectEDataType == null) {
			resAuthTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(118);
		}
		return resAuthTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResSharingScopeTypeBaseObject() {
		if (resSharingScopeTypeBaseObjectEDataType == null) {
			resSharingScopeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(124);
		}
		return resSharingScopeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleNameTypeBase() {
		if (roleNameTypeBaseEDataType == null) {
			roleNameTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(126);
		}
		return roleNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrackingModeTypeBaseObject() {
		if (trackingModeTypeBaseObjectEDataType == null) {
			trackingModeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(140);
		}
		return trackingModeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransportGuaranteeTypeBaseObject() {
		if (transportGuaranteeTypeBaseObjectEDataType == null) {
			transportGuaranteeTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(143);
		}
		return transportGuaranteeTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrueFalseTypeBase() {
		if (trueFalseTypeBaseEDataType == null) {
			trueFalseTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(145);
		}
		return trueFalseTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrueFalseTypeBaseObject() {
		if (trueFalseTypeBaseObjectEDataType == null) {
			trueFalseTypeBaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(146);
		}
		return trueFalseTypeBaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWarPathTypeBase() {
		if (warPathTypeBaseEDataType == null) {
			warPathTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(150);
		}
		return warPathTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWebAppVersionTypeObject() {
		if (webAppVersionTypeObjectEDataType == null) {
			webAppVersionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Webapp30Package.eNS_URI).getEClassifiers().get(153);
		}
		return webAppVersionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp30Factory getWebapp30Factory() {
		return (Webapp30Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			eClassifier.setInstanceClassName("org.eclipse.modisco.jee.webapp.webapp30." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} // Webapp30PackageImpl
