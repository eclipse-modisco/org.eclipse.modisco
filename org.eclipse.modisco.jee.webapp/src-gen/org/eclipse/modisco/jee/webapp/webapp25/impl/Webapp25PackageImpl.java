/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import java.lang.String;

import java.math.BigInteger;

import java.util.List;

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


import org.eclipse.modisco.jee.webapp.webapp25.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp25.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp25.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp25.DispatcherTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp25.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp25.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefTypeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryTypeValuesTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp25.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterType;
import org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp25.GenericBooleanType;
import org.eclipse.modisco.jee.webapp.webapp25.GenericBooleanTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.HomeType;
import org.eclipse.modisco.jee.webapp.webapp25.IconType;
import org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp25.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp25.JavaTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp25.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp25.LifecycleCallbackType;
import org.eclipse.modisco.jee.webapp.webapp25.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp25.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp25.LocalType;
import org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationLinkType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationUsageType;
import org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationUsageTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.NonEmptyStringType;
import org.eclipse.modisco.jee.webapp.webapp25.NullCharType;
import org.eclipse.modisco.jee.webapp.webapp25.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp25.PathType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceUnitRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PropertyType;
import org.eclipse.modisco.jee.webapp.webapp25.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp25.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp25.ResAuthTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp25.ResSharingScopeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp25.RoleNameType;
import org.eclipse.modisco.jee.webapp.webapp25.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp25.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainsType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletType;
import org.eclipse.modisco.jee.webapp.webapp25.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp25.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp25.TransportGuaranteeTypeBase;
import org.eclipse.modisco.jee.webapp.webapp25.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp25.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp25.WebAppVersionType;
import org.eclipse.modisco.jee.webapp.webapp25.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Factory;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;
import org.eclipse.modisco.jee.webapp.webapp25.WelcomeFileListType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdAnyURIType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdBooleanType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdIntegerType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdNMTOKENType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdQNameType;
import org.eclipse.modisco.jee.webapp.webapp25.XsdStringType;
import org.eclipse.modisco.jee.webapp.webapp25.*;
import org.eclipse.modisco.jee.webapp.webapp25.util.Webapp25Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Webapp25PackageImpl extends EPackageImpl implements Webapp25Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authMethodTypeEClass = null;

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
	private EClass dispatcherTypeEClass = null;

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
	private EClass emptyTypeEClass = null;

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
	private EClass errorCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorPageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formLoginConfigTypeEClass = null;

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
	private EClass injectionTargetTypeEClass = null;

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
	private EClass jspConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspFileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspPropertyGroupTypeEClass = null;

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
	private EClass localeEncodingMappingListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeEncodingMappingTypeEClass = null;

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
	private EClass loginConfigTypeEClass = null;

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
	private EClass mimeMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonEmptyStringTypeEClass = null;

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
	private EClass securityConstraintTypeEClass = null;

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
	private EClass serviceRefHandlerChainsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRefHandlerChainTypeEClass = null;

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
	private EClass servletMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servletNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servletTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionConfigTypeEClass = null;

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
	private EClass taglibTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportGuaranteeTypeEClass = null;

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
	private EClass userDataConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAppTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webResourceCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass welcomeFileListTypeEClass = null;

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
	private EEnum dispatcherTypeBaseEEnum = null;

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
	private EEnum nullCharTypeEEnum = null;

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
	private EEnum transportGuaranteeTypeBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webAppVersionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType authMethodTypeBaseEDataType = null;

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
	private EDataType dispatcherTypeBaseObjectEDataType = null;

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
	private EDataType encodingTypeEDataType = null;

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
	private EDataType errorCodeTypeBaseEDataType = null;

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
	private EDataType httpMethodTypeEDataType = null;

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
	private EDataType jspFileTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType loadOnStartupTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeTypeEDataType = null;

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
	private EDataType mimeTypeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyStringTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nullCharTypeObjectEDataType = null;

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
	private EDataType roleNameTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceRefProtocolBindingListTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceRefProtocolBindingTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceRefProtocolURIAliasTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceRefQnamePatternEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transportGuaranteeTypeBaseObjectEDataType = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType warPathTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType webAppVersionTypeObjectEDataType = null;

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Webapp25PackageImpl() {
		super(eNS_URI, Webapp25Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Webapp25Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Webapp25Package init() {
		if (isInited) return (Webapp25Package)EPackage.Registry.INSTANCE.getEPackage(Webapp25Package.eNS_URI);

		// Obtain or create and register package
		Webapp25PackageImpl theWebapp25Package = (Webapp25PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Webapp25PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Webapp25PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebapp25Package.createPackageContents();

		// Initialize created meta-data
		theWebapp25Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebapp25Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Webapp25Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebapp25Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Webapp25Package.eNS_URI, theWebapp25Package);
		return theWebapp25Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthConstraintType() {
		return authConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthConstraintType_Description() {
		return (EReference)authConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthConstraintType_RoleName() {
		return (EReference)authConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthConstraintType_Id() {
		return (EAttribute)authConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthMethodType() {
		return authMethodTypeEClass;
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
	public EClass getDispatcherType() {
		return dispatcherTypeEClass;
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
	public EReference getDocumentRoot_WebApp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
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
	public EReference getEjbLocalRefType_MappedName() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbLocalRefType_InjectionTarget() {
		return (EReference)ejbLocalRefTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbLocalRefType_Id() {
		return (EAttribute)ejbLocalRefTypeEClass.getEStructuralFeatures().get(8);
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
	public EReference getEjbRefType_MappedName() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjbRefType_InjectionTarget() {
		return (EReference)ejbRefTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjbRefType_Id() {
		return (EAttribute)ejbRefTypeEClass.getEStructuralFeatures().get(8);
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
	public EReference getEnvEntryType_MappedName() {
		return (EReference)envEntryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvEntryType_InjectionTarget() {
		return (EReference)envEntryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvEntryType_Id() {
		return (EAttribute)envEntryTypeEClass.getEStructuralFeatures().get(6);
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
	public EClass getErrorCodeType() {
		return errorCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorPageType() {
		return errorPageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPageType_ErrorCode() {
		return (EReference)errorPageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPageType_ExceptionType() {
		return (EReference)errorPageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPageType_Location() {
		return (EReference)errorPageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorPageType_Id() {
		return (EAttribute)errorPageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterMappingType() {
		return filterMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_FilterName() {
		return (EReference)filterMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterMappingType_Group() {
		return (EAttribute)filterMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_UrlPattern() {
		return (EReference)filterMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_ServletName() {
		return (EReference)filterMappingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterMappingType_Dispatcher() {
		return (EReference)filterMappingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterMappingType_Id() {
		return (EAttribute)filterMappingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterNameType() {
		return filterNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterType() {
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_Description() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_DisplayName() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_Icon() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_FilterName() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_FilterClass() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_InitParam() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterType_Id() {
		return (EAttribute)filterTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormLoginConfigType() {
		return formLoginConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLoginConfigType_FormLoginPage() {
		return (EReference)formLoginConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLoginConfigType_FormErrorPage() {
		return (EReference)formLoginConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLoginConfigType_Id() {
		return (EAttribute)formLoginConfigTypeEClass.getEStructuralFeatures().get(2);
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
	public EClass getInjectionTargetType() {
		return injectionTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionTargetType_InjectionTargetClass() {
		return (EReference)injectionTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionTargetType_InjectionTargetName() {
		return (EReference)injectionTargetTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getJspConfigType() {
		return jspConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspConfigType_Taglib() {
		return (EReference)jspConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspConfigType_JspPropertyGroup() {
		return (EReference)jspConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJspConfigType_Id() {
		return (EAttribute)jspConfigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJspFileType() {
		return jspFileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJspPropertyGroupType() {
		return jspPropertyGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_Description() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_DisplayName() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_Icon() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_UrlPattern() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_ElIgnored() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_PageEncoding() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_ScriptingInvalid() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_IsXml() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_IncludePrelude() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_IncludeCoda() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_DeferredSyntaxAllowedAsLiteral() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJspPropertyGroupType_TrimDirectiveWhitespaces() {
		return (EReference)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJspPropertyGroupType_Id() {
		return (EAttribute)jspPropertyGroupTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifecycleCallbackType() {
		return lifecycleCallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleCallbackType_LifecycleCallbackClass() {
		return (EReference)lifecycleCallbackTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleCallbackType_LifecycleCallbackMethod() {
		return (EReference)lifecycleCallbackTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getLocaleEncodingMappingListType() {
		return localeEncodingMappingListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleEncodingMappingListType_LocaleEncodingMapping() {
		return (EReference)localeEncodingMappingListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingListType_Id() {
		return (EAttribute)localeEncodingMappingListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocaleEncodingMappingType() {
		return localeEncodingMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingType_Locale() {
		return (EAttribute)localeEncodingMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingType_Encoding() {
		return (EAttribute)localeEncodingMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleEncodingMappingType_Id() {
		return (EAttribute)localeEncodingMappingTypeEClass.getEStructuralFeatures().get(2);
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
	public EClass getLoginConfigType() {
		return loginConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginConfigType_AuthMethod() {
		return (EReference)loginConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginConfigType_RealmName() {
		return (EReference)loginConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginConfigType_FormLoginConfig() {
		return (EReference)loginConfigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginConfigType_Id() {
		return (EAttribute)loginConfigTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getMessageDestinationRefType_MappedName() {
		return (EReference)messageDestinationRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDestinationRefType_InjectionTarget() {
		return (EReference)messageDestinationRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationRefType_Id() {
		return (EAttribute)messageDestinationRefTypeEClass.getEStructuralFeatures().get(7);
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
	public EReference getMessageDestinationType_MappedName() {
		return (EReference)messageDestinationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDestinationType_Id() {
		return (EAttribute)messageDestinationTypeEClass.getEStructuralFeatures().get(5);
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
	public EClass getMimeMappingType() {
		return mimeMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeMappingType_Extension() {
		return (EReference)mimeMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeMappingType_MimeType() {
		return (EReference)mimeMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMimeMappingType_Id() {
		return (EAttribute)mimeMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeTypeType() {
		return mimeTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonEmptyStringType() {
		return nonEmptyStringTypeEClass;
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
	public EClass getPersistenceContextRefType() {
		return persistenceContextRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_Description() {
		return (EReference)persistenceContextRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceContextRefName() {
		return (EReference)persistenceContextRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceUnitName() {
		return (EReference)persistenceContextRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceContextType() {
		return (EReference)persistenceContextRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_PersistenceProperty() {
		return (EReference)persistenceContextRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_MappedName() {
		return (EReference)persistenceContextRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContextRefType_InjectionTarget() {
		return (EReference)persistenceContextRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceContextRefType_Id() {
		return (EAttribute)persistenceContextRefTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceContextTypeType() {
		return persistenceContextTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnitRefType() {
		return persistenceUnitRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_Description() {
		return (EReference)persistenceUnitRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_PersistenceUnitRefName() {
		return (EReference)persistenceUnitRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_PersistenceUnitName() {
		return (EReference)persistenceUnitRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_MappedName() {
		return (EReference)persistenceUnitRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitRefType_InjectionTarget() {
		return (EReference)persistenceUnitRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnitRefType_Id() {
		return (EAttribute)persistenceUnitRefTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getPortComponentRefType_EnableMtom() {
		return (EReference)portComponentRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortComponentRefType_PortComponentLink() {
		return (EReference)portComponentRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortComponentRefType_Id() {
		return (EAttribute)portComponentRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Name() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Value() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Id() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getResourceEnvRefType_MappedName() {
		return (EReference)resourceEnvRefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceEnvRefType_InjectionTarget() {
		return (EReference)resourceEnvRefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceEnvRefType_Id() {
		return (EAttribute)resourceEnvRefTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getResourceRefType_MappedName() {
		return (EReference)resourceRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRefType_InjectionTarget() {
		return (EReference)resourceRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRefType_Id() {
		return (EAttribute)resourceRefTypeEClass.getEStructuralFeatures().get(7);
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
	public EClass getSecurityConstraintType() {
		return securityConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_DisplayName() {
		return (EReference)securityConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_WebResourceCollection() {
		return (EReference)securityConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_AuthConstraint() {
		return (EReference)securityConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConstraintType_UserDataConstraint() {
		return (EReference)securityConstraintTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityConstraintType_Id() {
		return (EAttribute)securityConstraintTypeEClass.getEStructuralFeatures().get(4);
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
	public EClass getServiceRefHandlerChainsType() {
		return serviceRefHandlerChainsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerChainsType_HandlerChain() {
		return (EReference)serviceRefHandlerChainsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefHandlerChainsType_Id() {
		return (EAttribute)serviceRefHandlerChainsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRefHandlerChainType() {
		return serviceRefHandlerChainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefHandlerChainType_ServiceNamePattern() {
		return (EAttribute)serviceRefHandlerChainTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefHandlerChainType_PortNamePattern() {
		return (EAttribute)serviceRefHandlerChainTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefHandlerChainType_ProtocolBindings() {
		return (EAttribute)serviceRefHandlerChainTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefHandlerChainType_Handler() {
		return (EReference)serviceRefHandlerChainTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefHandlerChainType_Id() {
		return (EAttribute)serviceRefHandlerChainTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getServiceRefType_ServiceRefType() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_WsdlFile() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_JaxrpcMappingFile() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_ServiceQname() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_PortComponentRef() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_Handler() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_HandlerChains() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_MappedName() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRefType_InjectionTarget() {
		return (EReference)serviceRefTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefType_Id() {
		return (EAttribute)serviceRefTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServletMappingType() {
		return servletMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletMappingType_ServletName() {
		return (EReference)servletMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletMappingType_UrlPattern() {
		return (EReference)servletMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServletMappingType_Id() {
		return (EAttribute)servletMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServletNameType() {
		return servletNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServletType() {
		return servletTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_Description() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_DisplayName() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_Icon() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_ServletName() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_ServletClass() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_JspFile() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_InitParam() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServletType_LoadOnStartup() {
		return (EAttribute)servletTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_RunAs() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServletType_SecurityRoleRef() {
		return (EReference)servletTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServletType_Id() {
		return (EAttribute)servletTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionConfigType() {
		return sessionConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionConfigType_SessionTimeout() {
		return (EReference)sessionConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionConfigType_Id() {
		return (EAttribute)sessionConfigTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getTaglibType() {
		return taglibTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaglibType_TaglibUri() {
		return (EReference)taglibTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaglibType_TaglibLocation() {
		return (EReference)taglibTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaglibType_Id() {
		return (EAttribute)taglibTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportGuaranteeType() {
		return transportGuaranteeTypeEClass;
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
	public EClass getUserDataConstraintType() {
		return userDataConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDataConstraintType_Description() {
		return (EReference)userDataConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDataConstraintType_TransportGuarantee() {
		return (EReference)userDataConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDataConstraintType_Id() {
		return (EAttribute)userDataConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarPathType() {
		return warPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebAppType() {
		return webAppTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_Group() {
		return (EAttribute)webAppTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Description() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_DisplayName() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Icon() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Distributable() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ContextParam() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Filter() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_FilterMapping() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Listener() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_Servlet() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ServletMapping() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_SessionConfig() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_MimeMapping() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_WelcomeFileList() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ErrorPage() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_JspConfig() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_SecurityConstraint() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_LoginConfig() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_SecurityRole() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_EnvEntry() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_EjbRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_EjbLocalRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ServiceRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ResourceRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_ResourceEnvRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_MessageDestinationRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PersistenceContextRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PersistenceUnitRef() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PostConstruct() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_PreDestroy() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_MessageDestination() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebAppType_LocaleEncodingMappingList() {
		return (EReference)webAppTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_Id() {
		return (EAttribute)webAppTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_MetadataComplete() {
		return (EAttribute)webAppTypeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAppType_Version() {
		return (EAttribute)webAppTypeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebResourceCollectionType() {
		return webResourceCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebResourceCollectionType_WebResourceName() {
		return (EReference)webResourceCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebResourceCollectionType_Description() {
		return (EReference)webResourceCollectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebResourceCollectionType_UrlPattern() {
		return (EReference)webResourceCollectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceCollectionType_HttpMethod() {
		return (EAttribute)webResourceCollectionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceCollectionType_Id() {
		return (EAttribute)webResourceCollectionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWelcomeFileListType() {
		return welcomeFileListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWelcomeFileListType_WelcomeFile() {
		return (EAttribute)welcomeFileListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWelcomeFileListType_Id() {
		return (EAttribute)welcomeFileListTypeEClass.getEStructuralFeatures().get(1);
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
	public EEnum getDispatcherTypeBase() {
		return dispatcherTypeBaseEEnum;
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
	public EEnum getNullCharType() {
		return nullCharTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceContextTypeTypeBase() {
		return persistenceContextTypeTypeBaseEEnum;
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
	public EEnum getTransportGuaranteeTypeBase() {
		return transportGuaranteeTypeBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWebAppVersionType() {
		return webAppVersionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuthMethodTypeBase() {
		return authMethodTypeBaseEDataType;
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
	public EDataType getDispatcherTypeBaseObject() {
		return dispatcherTypeBaseObjectEDataType;
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
	public EDataType getEncodingType() {
		return encodingTypeEDataType;
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
	public EDataType getErrorCodeTypeBase() {
		return errorCodeTypeBaseEDataType;
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
	public EDataType getHttpMethodType() {
		return httpMethodTypeEDataType;
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
	public EDataType getJspFileTypeBase() {
		return jspFileTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLoadOnStartupType() {
		return loadOnStartupTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocaleType() {
		return localeTypeEDataType;
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
	public EDataType getMimeTypeTypeBase() {
		return mimeTypeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyStringTypeBase() {
		return nonEmptyStringTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNullCharTypeObject() {
		return nullCharTypeObjectEDataType;
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
	public EDataType getPersistenceContextTypeTypeBaseObject() {
		return persistenceContextTypeTypeBaseObjectEDataType;
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
	public EDataType getRoleNameTypeBase() {
		return roleNameTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceRefProtocolBindingListType() {
		return serviceRefProtocolBindingListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceRefProtocolBindingType() {
		return serviceRefProtocolBindingTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceRefProtocolURIAliasType() {
		return serviceRefProtocolURIAliasTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceRefQnamePattern() {
		return serviceRefQnamePatternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransportGuaranteeTypeBaseObject() {
		return transportGuaranteeTypeBaseObjectEDataType;
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
	public EDataType getWarPathTypeBase() {
		return warPathTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWebAppVersionTypeObject() {
		return webAppVersionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp25Factory getWebapp25Factory() {
		return (Webapp25Factory)getEFactoryInstance();
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
		authConstraintTypeEClass = createEClass(AUTH_CONSTRAINT_TYPE);
		createEReference(authConstraintTypeEClass, AUTH_CONSTRAINT_TYPE__DESCRIPTION);
		createEReference(authConstraintTypeEClass, AUTH_CONSTRAINT_TYPE__ROLE_NAME);
		createEAttribute(authConstraintTypeEClass, AUTH_CONSTRAINT_TYPE__ID);

		authMethodTypeEClass = createEClass(AUTH_METHOD_TYPE);

		descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__LANG);

		dispatcherTypeEClass = createEClass(DISPATCHER_TYPE);

		displayNameTypeEClass = createEClass(DISPLAY_NAME_TYPE);
		createEAttribute(displayNameTypeEClass, DISPLAY_NAME_TYPE__LANG);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WEB_APP);

		ejbLinkTypeEClass = createEClass(EJB_LINK_TYPE);

		ejbLocalRefTypeEClass = createEClass(EJB_LOCAL_REF_TYPE);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__DESCRIPTION);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__EJB_REF_NAME);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__EJB_REF_TYPE);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__LOCAL_HOME);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__LOCAL);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__EJB_LINK);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__MAPPED_NAME);
		createEReference(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__INJECTION_TARGET);
		createEAttribute(ejbLocalRefTypeEClass, EJB_LOCAL_REF_TYPE__ID);

		ejbRefNameTypeEClass = createEClass(EJB_REF_NAME_TYPE);

		ejbRefTypeEClass = createEClass(EJB_REF_TYPE);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__DESCRIPTION);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__EJB_REF_NAME);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__EJB_REF_TYPE);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__HOME);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__REMOTE);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__EJB_LINK);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__MAPPED_NAME);
		createEReference(ejbRefTypeEClass, EJB_REF_TYPE__INJECTION_TARGET);
		createEAttribute(ejbRefTypeEClass, EJB_REF_TYPE__ID);

		ejbRefTypeTypeEClass = createEClass(EJB_REF_TYPE_TYPE);

		emptyTypeEClass = createEClass(EMPTY_TYPE);
		createEAttribute(emptyTypeEClass, EMPTY_TYPE__ID);

		envEntryTypeEClass = createEClass(ENV_ENTRY_TYPE);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__DESCRIPTION);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__ENV_ENTRY_NAME);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__ENV_ENTRY_TYPE);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__ENV_ENTRY_VALUE);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__MAPPED_NAME);
		createEReference(envEntryTypeEClass, ENV_ENTRY_TYPE__INJECTION_TARGET);
		createEAttribute(envEntryTypeEClass, ENV_ENTRY_TYPE__ID);

		envEntryTypeValuesTypeEClass = createEClass(ENV_ENTRY_TYPE_VALUES_TYPE);

		errorCodeTypeEClass = createEClass(ERROR_CODE_TYPE);

		errorPageTypeEClass = createEClass(ERROR_PAGE_TYPE);
		createEReference(errorPageTypeEClass, ERROR_PAGE_TYPE__ERROR_CODE);
		createEReference(errorPageTypeEClass, ERROR_PAGE_TYPE__EXCEPTION_TYPE);
		createEReference(errorPageTypeEClass, ERROR_PAGE_TYPE__LOCATION);
		createEAttribute(errorPageTypeEClass, ERROR_PAGE_TYPE__ID);

		filterMappingTypeEClass = createEClass(FILTER_MAPPING_TYPE);
		createEReference(filterMappingTypeEClass, FILTER_MAPPING_TYPE__FILTER_NAME);
		createEAttribute(filterMappingTypeEClass, FILTER_MAPPING_TYPE__GROUP);
		createEReference(filterMappingTypeEClass, FILTER_MAPPING_TYPE__URL_PATTERN);
		createEReference(filterMappingTypeEClass, FILTER_MAPPING_TYPE__SERVLET_NAME);
		createEReference(filterMappingTypeEClass, FILTER_MAPPING_TYPE__DISPATCHER);
		createEAttribute(filterMappingTypeEClass, FILTER_MAPPING_TYPE__ID);

		filterNameTypeEClass = createEClass(FILTER_NAME_TYPE);

		filterTypeEClass = createEClass(FILTER_TYPE);
		createEReference(filterTypeEClass, FILTER_TYPE__DESCRIPTION);
		createEReference(filterTypeEClass, FILTER_TYPE__DISPLAY_NAME);
		createEReference(filterTypeEClass, FILTER_TYPE__ICON);
		createEReference(filterTypeEClass, FILTER_TYPE__FILTER_NAME);
		createEReference(filterTypeEClass, FILTER_TYPE__FILTER_CLASS);
		createEReference(filterTypeEClass, FILTER_TYPE__INIT_PARAM);
		createEAttribute(filterTypeEClass, FILTER_TYPE__ID);

		formLoginConfigTypeEClass = createEClass(FORM_LOGIN_CONFIG_TYPE);
		createEReference(formLoginConfigTypeEClass, FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE);
		createEReference(formLoginConfigTypeEClass, FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE);
		createEAttribute(formLoginConfigTypeEClass, FORM_LOGIN_CONFIG_TYPE__ID);

		fullyQualifiedClassTypeEClass = createEClass(FULLY_QUALIFIED_CLASS_TYPE);

		genericBooleanTypeEClass = createEClass(GENERIC_BOOLEAN_TYPE);

		homeTypeEClass = createEClass(HOME_TYPE);

		iconTypeEClass = createEClass(ICON_TYPE);
		createEReference(iconTypeEClass, ICON_TYPE__SMALL_ICON);
		createEReference(iconTypeEClass, ICON_TYPE__LARGE_ICON);
		createEAttribute(iconTypeEClass, ICON_TYPE__ID);
		createEAttribute(iconTypeEClass, ICON_TYPE__LANG);

		injectionTargetTypeEClass = createEClass(INJECTION_TARGET_TYPE);
		createEReference(injectionTargetTypeEClass, INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS);
		createEReference(injectionTargetTypeEClass, INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME);

		javaIdentifierTypeEClass = createEClass(JAVA_IDENTIFIER_TYPE);

		javaTypeTypeEClass = createEClass(JAVA_TYPE_TYPE);

		jndiNameTypeEClass = createEClass(JNDI_NAME_TYPE);

		jspConfigTypeEClass = createEClass(JSP_CONFIG_TYPE);
		createEReference(jspConfigTypeEClass, JSP_CONFIG_TYPE__TAGLIB);
		createEReference(jspConfigTypeEClass, JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP);
		createEAttribute(jspConfigTypeEClass, JSP_CONFIG_TYPE__ID);

		jspFileTypeEClass = createEClass(JSP_FILE_TYPE);

		jspPropertyGroupTypeEClass = createEClass(JSP_PROPERTY_GROUP_TYPE);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__DESCRIPTION);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__ICON);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__URL_PATTERN);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__EL_IGNORED);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__IS_XML);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL);
		createEReference(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES);
		createEAttribute(jspPropertyGroupTypeEClass, JSP_PROPERTY_GROUP_TYPE__ID);

		lifecycleCallbackTypeEClass = createEClass(LIFECYCLE_CALLBACK_TYPE);
		createEReference(lifecycleCallbackTypeEClass, LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS);
		createEReference(lifecycleCallbackTypeEClass, LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD);

		listenerTypeEClass = createEClass(LISTENER_TYPE);
		createEReference(listenerTypeEClass, LISTENER_TYPE__DESCRIPTION);
		createEReference(listenerTypeEClass, LISTENER_TYPE__DISPLAY_NAME);
		createEReference(listenerTypeEClass, LISTENER_TYPE__ICON);
		createEReference(listenerTypeEClass, LISTENER_TYPE__LISTENER_CLASS);
		createEAttribute(listenerTypeEClass, LISTENER_TYPE__ID);

		localeEncodingMappingListTypeEClass = createEClass(LOCALE_ENCODING_MAPPING_LIST_TYPE);
		createEReference(localeEncodingMappingListTypeEClass, LOCALE_ENCODING_MAPPING_LIST_TYPE__LOCALE_ENCODING_MAPPING);
		createEAttribute(localeEncodingMappingListTypeEClass, LOCALE_ENCODING_MAPPING_LIST_TYPE__ID);

		localeEncodingMappingTypeEClass = createEClass(LOCALE_ENCODING_MAPPING_TYPE);
		createEAttribute(localeEncodingMappingTypeEClass, LOCALE_ENCODING_MAPPING_TYPE__LOCALE);
		createEAttribute(localeEncodingMappingTypeEClass, LOCALE_ENCODING_MAPPING_TYPE__ENCODING);
		createEAttribute(localeEncodingMappingTypeEClass, LOCALE_ENCODING_MAPPING_TYPE__ID);

		localHomeTypeEClass = createEClass(LOCAL_HOME_TYPE);

		localTypeEClass = createEClass(LOCAL_TYPE);

		loginConfigTypeEClass = createEClass(LOGIN_CONFIG_TYPE);
		createEReference(loginConfigTypeEClass, LOGIN_CONFIG_TYPE__AUTH_METHOD);
		createEReference(loginConfigTypeEClass, LOGIN_CONFIG_TYPE__REALM_NAME);
		createEReference(loginConfigTypeEClass, LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG);
		createEAttribute(loginConfigTypeEClass, LOGIN_CONFIG_TYPE__ID);

		messageDestinationLinkTypeEClass = createEClass(MESSAGE_DESTINATION_LINK_TYPE);

		messageDestinationRefTypeEClass = createEClass(MESSAGE_DESTINATION_REF_TYPE);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME);
		createEReference(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET);
		createEAttribute(messageDestinationRefTypeEClass, MESSAGE_DESTINATION_REF_TYPE__ID);

		messageDestinationTypeEClass = createEClass(MESSAGE_DESTINATION_TYPE);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__DESCRIPTION);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__DISPLAY_NAME);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__ICON);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME);
		createEReference(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__MAPPED_NAME);
		createEAttribute(messageDestinationTypeEClass, MESSAGE_DESTINATION_TYPE__ID);

		messageDestinationTypeTypeEClass = createEClass(MESSAGE_DESTINATION_TYPE_TYPE);

		messageDestinationUsageTypeEClass = createEClass(MESSAGE_DESTINATION_USAGE_TYPE);

		mimeMappingTypeEClass = createEClass(MIME_MAPPING_TYPE);
		createEReference(mimeMappingTypeEClass, MIME_MAPPING_TYPE__EXTENSION);
		createEReference(mimeMappingTypeEClass, MIME_MAPPING_TYPE__MIME_TYPE);
		createEAttribute(mimeMappingTypeEClass, MIME_MAPPING_TYPE__ID);

		mimeTypeTypeEClass = createEClass(MIME_TYPE_TYPE);

		nonEmptyStringTypeEClass = createEClass(NON_EMPTY_STRING_TYPE);

		paramValueTypeEClass = createEClass(PARAM_VALUE_TYPE);
		createEReference(paramValueTypeEClass, PARAM_VALUE_TYPE__DESCRIPTION);
		createEReference(paramValueTypeEClass, PARAM_VALUE_TYPE__PARAM_NAME);
		createEReference(paramValueTypeEClass, PARAM_VALUE_TYPE__PARAM_VALUE);
		createEAttribute(paramValueTypeEClass, PARAM_VALUE_TYPE__ID);

		pathTypeEClass = createEClass(PATH_TYPE);

		persistenceContextRefTypeEClass = createEClass(PERSISTENCE_CONTEXT_REF_TYPE);
		createEReference(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION);
		createEReference(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME);
		createEReference(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME);
		createEReference(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE);
		createEReference(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY);
		createEReference(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME);
		createEReference(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET);
		createEAttribute(persistenceContextRefTypeEClass, PERSISTENCE_CONTEXT_REF_TYPE__ID);

		persistenceContextTypeTypeEClass = createEClass(PERSISTENCE_CONTEXT_TYPE_TYPE);

		persistenceUnitRefTypeEClass = createEClass(PERSISTENCE_UNIT_REF_TYPE);
		createEReference(persistenceUnitRefTypeEClass, PERSISTENCE_UNIT_REF_TYPE__DESCRIPTION);
		createEReference(persistenceUnitRefTypeEClass, PERSISTENCE_UNIT_REF_TYPE__PERSISTENCE_UNIT_REF_NAME);
		createEReference(persistenceUnitRefTypeEClass, PERSISTENCE_UNIT_REF_TYPE__PERSISTENCE_UNIT_NAME);
		createEReference(persistenceUnitRefTypeEClass, PERSISTENCE_UNIT_REF_TYPE__MAPPED_NAME);
		createEReference(persistenceUnitRefTypeEClass, PERSISTENCE_UNIT_REF_TYPE__INJECTION_TARGET);
		createEAttribute(persistenceUnitRefTypeEClass, PERSISTENCE_UNIT_REF_TYPE__ID);

		portComponentRefTypeEClass = createEClass(PORT_COMPONENT_REF_TYPE);
		createEReference(portComponentRefTypeEClass, PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE);
		createEReference(portComponentRefTypeEClass, PORT_COMPONENT_REF_TYPE__ENABLE_MTOM);
		createEReference(portComponentRefTypeEClass, PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK);
		createEAttribute(portComponentRefTypeEClass, PORT_COMPONENT_REF_TYPE__ID);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__NAME);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__VALUE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__ID);

		remoteTypeEClass = createEClass(REMOTE_TYPE);

		resAuthTypeEClass = createEClass(RES_AUTH_TYPE);

		resourceEnvRefTypeEClass = createEClass(RESOURCE_ENV_REF_TYPE);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__DESCRIPTION);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__MAPPED_NAME);
		createEReference(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__INJECTION_TARGET);
		createEAttribute(resourceEnvRefTypeEClass, RESOURCE_ENV_REF_TYPE__ID);

		resourceRefTypeEClass = createEClass(RESOURCE_REF_TYPE);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__DESCRIPTION);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_REF_NAME);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_TYPE);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_AUTH);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__RES_SHARING_SCOPE);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__MAPPED_NAME);
		createEReference(resourceRefTypeEClass, RESOURCE_REF_TYPE__INJECTION_TARGET);
		createEAttribute(resourceRefTypeEClass, RESOURCE_REF_TYPE__ID);

		resSharingScopeTypeEClass = createEClass(RES_SHARING_SCOPE_TYPE);

		roleNameTypeEClass = createEClass(ROLE_NAME_TYPE);

		runAsTypeEClass = createEClass(RUN_AS_TYPE);
		createEReference(runAsTypeEClass, RUN_AS_TYPE__DESCRIPTION);
		createEReference(runAsTypeEClass, RUN_AS_TYPE__ROLE_NAME);
		createEAttribute(runAsTypeEClass, RUN_AS_TYPE__ID);

		securityConstraintTypeEClass = createEClass(SECURITY_CONSTRAINT_TYPE);
		createEReference(securityConstraintTypeEClass, SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME);
		createEReference(securityConstraintTypeEClass, SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION);
		createEReference(securityConstraintTypeEClass, SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT);
		createEReference(securityConstraintTypeEClass, SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT);
		createEAttribute(securityConstraintTypeEClass, SECURITY_CONSTRAINT_TYPE__ID);

		securityRoleRefTypeEClass = createEClass(SECURITY_ROLE_REF_TYPE);
		createEReference(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__DESCRIPTION);
		createEReference(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__ROLE_NAME);
		createEReference(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__ROLE_LINK);
		createEAttribute(securityRoleRefTypeEClass, SECURITY_ROLE_REF_TYPE__ID);

		securityRoleTypeEClass = createEClass(SECURITY_ROLE_TYPE);
		createEReference(securityRoleTypeEClass, SECURITY_ROLE_TYPE__DESCRIPTION);
		createEReference(securityRoleTypeEClass, SECURITY_ROLE_TYPE__ROLE_NAME);
		createEAttribute(securityRoleTypeEClass, SECURITY_ROLE_TYPE__ID);

		serviceRefHandlerChainsTypeEClass = createEClass(SERVICE_REF_HANDLER_CHAINS_TYPE);
		createEReference(serviceRefHandlerChainsTypeEClass, SERVICE_REF_HANDLER_CHAINS_TYPE__HANDLER_CHAIN);
		createEAttribute(serviceRefHandlerChainsTypeEClass, SERVICE_REF_HANDLER_CHAINS_TYPE__ID);

		serviceRefHandlerChainTypeEClass = createEClass(SERVICE_REF_HANDLER_CHAIN_TYPE);
		createEAttribute(serviceRefHandlerChainTypeEClass, SERVICE_REF_HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN);
		createEAttribute(serviceRefHandlerChainTypeEClass, SERVICE_REF_HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN);
		createEAttribute(serviceRefHandlerChainTypeEClass, SERVICE_REF_HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS);
		createEReference(serviceRefHandlerChainTypeEClass, SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER);
		createEAttribute(serviceRefHandlerChainTypeEClass, SERVICE_REF_HANDLER_CHAIN_TYPE__ID);

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
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__SERVICE_REF_TYPE);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__WSDL_FILE);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__SERVICE_QNAME);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__PORT_COMPONENT_REF);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__HANDLER);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__HANDLER_CHAINS);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__MAPPED_NAME);
		createEReference(serviceRefTypeEClass, SERVICE_REF_TYPE__INJECTION_TARGET);
		createEAttribute(serviceRefTypeEClass, SERVICE_REF_TYPE__ID);

		servletMappingTypeEClass = createEClass(SERVLET_MAPPING_TYPE);
		createEReference(servletMappingTypeEClass, SERVLET_MAPPING_TYPE__SERVLET_NAME);
		createEReference(servletMappingTypeEClass, SERVLET_MAPPING_TYPE__URL_PATTERN);
		createEAttribute(servletMappingTypeEClass, SERVLET_MAPPING_TYPE__ID);

		servletNameTypeEClass = createEClass(SERVLET_NAME_TYPE);

		servletTypeEClass = createEClass(SERVLET_TYPE);
		createEReference(servletTypeEClass, SERVLET_TYPE__DESCRIPTION);
		createEReference(servletTypeEClass, SERVLET_TYPE__DISPLAY_NAME);
		createEReference(servletTypeEClass, SERVLET_TYPE__ICON);
		createEReference(servletTypeEClass, SERVLET_TYPE__SERVLET_NAME);
		createEReference(servletTypeEClass, SERVLET_TYPE__SERVLET_CLASS);
		createEReference(servletTypeEClass, SERVLET_TYPE__JSP_FILE);
		createEReference(servletTypeEClass, SERVLET_TYPE__INIT_PARAM);
		createEAttribute(servletTypeEClass, SERVLET_TYPE__LOAD_ON_STARTUP);
		createEReference(servletTypeEClass, SERVLET_TYPE__RUN_AS);
		createEReference(servletTypeEClass, SERVLET_TYPE__SECURITY_ROLE_REF);
		createEAttribute(servletTypeEClass, SERVLET_TYPE__ID);

		sessionConfigTypeEClass = createEClass(SESSION_CONFIG_TYPE);
		createEReference(sessionConfigTypeEClass, SESSION_CONFIG_TYPE__SESSION_TIMEOUT);
		createEAttribute(sessionConfigTypeEClass, SESSION_CONFIG_TYPE__ID);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);
		createEAttribute(stringEClass, STRING__ID);

		taglibTypeEClass = createEClass(TAGLIB_TYPE);
		createEReference(taglibTypeEClass, TAGLIB_TYPE__TAGLIB_URI);
		createEReference(taglibTypeEClass, TAGLIB_TYPE__TAGLIB_LOCATION);
		createEAttribute(taglibTypeEClass, TAGLIB_TYPE__ID);

		transportGuaranteeTypeEClass = createEClass(TRANSPORT_GUARANTEE_TYPE);

		trueFalseTypeEClass = createEClass(TRUE_FALSE_TYPE);

		urlPatternTypeEClass = createEClass(URL_PATTERN_TYPE);
		createEAttribute(urlPatternTypeEClass, URL_PATTERN_TYPE__VALUE);

		userDataConstraintTypeEClass = createEClass(USER_DATA_CONSTRAINT_TYPE);
		createEReference(userDataConstraintTypeEClass, USER_DATA_CONSTRAINT_TYPE__DESCRIPTION);
		createEReference(userDataConstraintTypeEClass, USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE);
		createEAttribute(userDataConstraintTypeEClass, USER_DATA_CONSTRAINT_TYPE__ID);

		warPathTypeEClass = createEClass(WAR_PATH_TYPE);

		webAppTypeEClass = createEClass(WEB_APP_TYPE);
		createEAttribute(webAppTypeEClass, WEB_APP_TYPE__GROUP);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__DESCRIPTION);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__DISPLAY_NAME);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__ICON);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__DISTRIBUTABLE);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__CONTEXT_PARAM);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__FILTER);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__FILTER_MAPPING);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__LISTENER);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__SERVLET);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__SERVLET_MAPPING);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__SESSION_CONFIG);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__MIME_MAPPING);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__WELCOME_FILE_LIST);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__ERROR_PAGE);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__JSP_CONFIG);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__SECURITY_CONSTRAINT);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__LOGIN_CONFIG);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__SECURITY_ROLE);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__ENV_ENTRY);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__EJB_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__EJB_LOCAL_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__SERVICE_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__RESOURCE_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__RESOURCE_ENV_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__MESSAGE_DESTINATION_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__PERSISTENCE_CONTEXT_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__PERSISTENCE_UNIT_REF);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__POST_CONSTRUCT);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__PRE_DESTROY);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__MESSAGE_DESTINATION);
		createEReference(webAppTypeEClass, WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST);
		createEAttribute(webAppTypeEClass, WEB_APP_TYPE__ID);
		createEAttribute(webAppTypeEClass, WEB_APP_TYPE__METADATA_COMPLETE);
		createEAttribute(webAppTypeEClass, WEB_APP_TYPE__VERSION);

		webResourceCollectionTypeEClass = createEClass(WEB_RESOURCE_COLLECTION_TYPE);
		createEReference(webResourceCollectionTypeEClass, WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME);
		createEReference(webResourceCollectionTypeEClass, WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION);
		createEReference(webResourceCollectionTypeEClass, WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN);
		createEAttribute(webResourceCollectionTypeEClass, WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD);
		createEAttribute(webResourceCollectionTypeEClass, WEB_RESOURCE_COLLECTION_TYPE__ID);

		welcomeFileListTypeEClass = createEClass(WELCOME_FILE_LIST_TYPE);
		createEAttribute(welcomeFileListTypeEClass, WELCOME_FILE_LIST_TYPE__WELCOME_FILE);
		createEAttribute(welcomeFileListTypeEClass, WELCOME_FILE_LIST_TYPE__ID);

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
		dispatcherTypeBaseEEnum = createEEnum(DISPATCHER_TYPE_BASE);
		ejbRefTypeTypeBaseEEnum = createEEnum(EJB_REF_TYPE_TYPE_BASE);
		envEntryTypeValuesTypeBaseEEnum = createEEnum(ENV_ENTRY_TYPE_VALUES_TYPE_BASE);
		genericBooleanTypeBaseEEnum = createEEnum(GENERIC_BOOLEAN_TYPE_BASE);
		messageDestinationUsageTypeBaseEEnum = createEEnum(MESSAGE_DESTINATION_USAGE_TYPE_BASE);
		nullCharTypeEEnum = createEEnum(NULL_CHAR_TYPE);
		persistenceContextTypeTypeBaseEEnum = createEEnum(PERSISTENCE_CONTEXT_TYPE_TYPE_BASE);
		resAuthTypeBaseEEnum = createEEnum(RES_AUTH_TYPE_BASE);
		resSharingScopeTypeBaseEEnum = createEEnum(RES_SHARING_SCOPE_TYPE_BASE);
		transportGuaranteeTypeBaseEEnum = createEEnum(TRANSPORT_GUARANTEE_TYPE_BASE);
		webAppVersionTypeEEnum = createEEnum(WEB_APP_VERSION_TYPE);

		// Create data types
		authMethodTypeBaseEDataType = createEDataType(AUTH_METHOD_TYPE_BASE);
		deweyVersionTypeEDataType = createEDataType(DEWEY_VERSION_TYPE);
		dispatcherTypeBaseObjectEDataType = createEDataType(DISPATCHER_TYPE_BASE_OBJECT);
		ejbLinkTypeBaseEDataType = createEDataType(EJB_LINK_TYPE_BASE);
		ejbRefNameTypeBaseEDataType = createEDataType(EJB_REF_NAME_TYPE_BASE);
		ejbRefTypeTypeBaseObjectEDataType = createEDataType(EJB_REF_TYPE_TYPE_BASE_OBJECT);
		encodingTypeEDataType = createEDataType(ENCODING_TYPE);
		envEntryTypeValuesTypeBaseObjectEDataType = createEDataType(ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT);
		errorCodeTypeBaseEDataType = createEDataType(ERROR_CODE_TYPE_BASE);
		fullyQualifiedClassTypeBaseEDataType = createEDataType(FULLY_QUALIFIED_CLASS_TYPE_BASE);
		genericBooleanTypeBaseObjectEDataType = createEDataType(GENERIC_BOOLEAN_TYPE_BASE_OBJECT);
		homeTypeBaseEDataType = createEDataType(HOME_TYPE_BASE);
		httpMethodTypeEDataType = createEDataType(HTTP_METHOD_TYPE);
		javaIdentifierTypeBaseEDataType = createEDataType(JAVA_IDENTIFIER_TYPE_BASE);
		javaTypeTypeBaseEDataType = createEDataType(JAVA_TYPE_TYPE_BASE);
		jndiNameTypeBaseEDataType = createEDataType(JNDI_NAME_TYPE_BASE);
		jspFileTypeBaseEDataType = createEDataType(JSP_FILE_TYPE_BASE);
		loadOnStartupTypeEDataType = createEDataType(LOAD_ON_STARTUP_TYPE);
		localeTypeEDataType = createEDataType(LOCALE_TYPE);
		localHomeTypeBaseEDataType = createEDataType(LOCAL_HOME_TYPE_BASE);
		localTypeBaseEDataType = createEDataType(LOCAL_TYPE_BASE);
		messageDestinationLinkTypeBaseEDataType = createEDataType(MESSAGE_DESTINATION_LINK_TYPE_BASE);
		messageDestinationTypeTypeBaseEDataType = createEDataType(MESSAGE_DESTINATION_TYPE_TYPE_BASE);
		messageDestinationUsageTypeBaseObjectEDataType = createEDataType(MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT);
		mimeTypeTypeBaseEDataType = createEDataType(MIME_TYPE_TYPE_BASE);
		nonEmptyStringTypeBaseEDataType = createEDataType(NON_EMPTY_STRING_TYPE_BASE);
		nullCharTypeObjectEDataType = createEDataType(NULL_CHAR_TYPE_OBJECT);
		pathTypeBaseEDataType = createEDataType(PATH_TYPE_BASE);
		persistenceContextTypeTypeBaseObjectEDataType = createEDataType(PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT);
		remoteTypeBaseEDataType = createEDataType(REMOTE_TYPE_BASE);
		resAuthTypeBaseObjectEDataType = createEDataType(RES_AUTH_TYPE_BASE_OBJECT);
		resSharingScopeTypeBaseObjectEDataType = createEDataType(RES_SHARING_SCOPE_TYPE_BASE_OBJECT);
		roleNameTypeBaseEDataType = createEDataType(ROLE_NAME_TYPE_BASE);
		serviceRefProtocolBindingListTypeEDataType = createEDataType(SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE);
		serviceRefProtocolBindingTypeEDataType = createEDataType(SERVICE_REF_PROTOCOL_BINDING_TYPE);
		serviceRefProtocolURIAliasTypeEDataType = createEDataType(SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE);
		serviceRefQnamePatternEDataType = createEDataType(SERVICE_REF_QNAME_PATTERN);
		transportGuaranteeTypeBaseObjectEDataType = createEDataType(TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT);
		trueFalseTypeBaseEDataType = createEDataType(TRUE_FALSE_TYPE_BASE);
		trueFalseTypeBaseObjectEDataType = createEDataType(TRUE_FALSE_TYPE_BASE_OBJECT);
		warPathTypeBaseEDataType = createEDataType(WAR_PATH_TYPE_BASE);
		webAppVersionTypeObjectEDataType = createEDataType(WEB_APP_VERSION_TYPE_OBJECT);
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
		authMethodTypeEClass.getESuperTypes().add(this.getString());
		descriptionTypeEClass.getESuperTypes().add(this.getXsdStringType());
		dispatcherTypeEClass.getESuperTypes().add(this.getString());
		displayNameTypeEClass.getESuperTypes().add(this.getString());
		ejbLinkTypeEClass.getESuperTypes().add(this.getString());
		ejbRefNameTypeEClass.getESuperTypes().add(this.getJndiNameType());
		ejbRefTypeTypeEClass.getESuperTypes().add(this.getString());
		envEntryTypeValuesTypeEClass.getESuperTypes().add(this.getString());
		errorCodeTypeEClass.getESuperTypes().add(this.getXsdPositiveIntegerType());
		filterNameTypeEClass.getESuperTypes().add(this.getNonEmptyStringType());
		fullyQualifiedClassTypeEClass.getESuperTypes().add(this.getString());
		genericBooleanTypeEClass.getESuperTypes().add(this.getString());
		homeTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		javaIdentifierTypeEClass.getESuperTypes().add(this.getString());
		javaTypeTypeEClass.getESuperTypes().add(this.getString());
		jndiNameTypeEClass.getESuperTypes().add(this.getString());
		jspFileTypeEClass.getESuperTypes().add(this.getPathType());
		localHomeTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		localTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		messageDestinationLinkTypeEClass.getESuperTypes().add(this.getString());
		messageDestinationTypeTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		messageDestinationUsageTypeEClass.getESuperTypes().add(this.getString());
		mimeTypeTypeEClass.getESuperTypes().add(this.getString());
		nonEmptyStringTypeEClass.getESuperTypes().add(this.getString());
		pathTypeEClass.getESuperTypes().add(this.getString());
		persistenceContextTypeTypeEClass.getESuperTypes().add(this.getString());
		remoteTypeEClass.getESuperTypes().add(this.getFullyQualifiedClassType());
		resAuthTypeEClass.getESuperTypes().add(this.getString());
		resSharingScopeTypeEClass.getESuperTypes().add(this.getString());
		roleNameTypeEClass.getESuperTypes().add(this.getString());
		servletNameTypeEClass.getESuperTypes().add(this.getNonEmptyStringType());
		transportGuaranteeTypeEClass.getESuperTypes().add(this.getString());
		trueFalseTypeEClass.getESuperTypes().add(this.getXsdBooleanType());
		warPathTypeEClass.getESuperTypes().add(this.getString());

		// Initialize classes and features; add operations and parameters
		initEClass(authConstraintTypeEClass, AuthConstraintType.class, "AuthConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAuthConstraintType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, AuthConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAuthConstraintType_RoleName(), this.getRoleNameType(), null, "roleName", null, 0, -1, AuthConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAuthConstraintType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AuthConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(authMethodTypeEClass, AuthMethodType.class, "AuthMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDescriptionType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(dispatcherTypeEClass, DispatcherType.class, "DispatcherType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(displayNameTypeEClass, DisplayNameType.class, "DisplayNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDisplayNameType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, DisplayNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_WebApp(), this.getWebAppType(), null, "webApp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ejbLinkTypeEClass, EjbLinkType.class, "EjbLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ejbLocalRefTypeEClass, EjbLocalRefType.class, "EjbLocalRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_EjbRefName(), this.getEjbRefNameType(), null, "ejbRefName", null, 1, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_EjbRefType(), this.getEjbRefTypeType(), null, "ejbRefType", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_LocalHome(), this.getLocalHomeType(), null, "localHome", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_Local(), this.getLocalType(), null, "local", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_EjbLink(), this.getEjbLinkType(), null, "ejbLink", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbLocalRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbLocalRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EjbLocalRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ejbRefNameTypeEClass, EjbRefNameType.class, "EjbRefNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ejbRefTypeEClass, EjbRefType.class, "EjbRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEjbRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_EjbRefName(), this.getEjbRefNameType(), null, "ejbRefName", null, 1, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_EjbRefType(), this.getEjbRefTypeType(), null, "ejbRefType", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_Home(), this.getHomeType(), null, "home", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_Remote(), this.getRemoteType(), null, "remote", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_EjbLink(), this.getEjbLinkType(), null, "ejbLink", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEjbRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEjbRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EjbRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ejbRefTypeTypeEClass, EjbRefTypeType.class, "EjbRefTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(emptyTypeEClass, EmptyType.class, "EmptyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEmptyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EmptyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(envEntryTypeEClass, EnvEntryType.class, "EnvEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEnvEntryType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_EnvEntryName(), this.getJndiNameType(), null, "envEntryName", null, 1, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_EnvEntryType(), this.getEnvEntryTypeValuesType(), null, "envEntryType", null, 0, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_EnvEntryValue(), this.getXsdStringType(), null, "envEntryValue", null, 0, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnvEntryType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEnvEntryType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EnvEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(envEntryTypeValuesTypeEClass, EnvEntryTypeValuesType.class, "EnvEntryTypeValuesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(errorCodeTypeEClass, ErrorCodeType.class, "ErrorCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(errorPageTypeEClass, ErrorPageType.class, "ErrorPageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getErrorPageType_ErrorCode(), this.getErrorCodeType(), null, "errorCode", null, 0, 1, ErrorPageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getErrorPageType_ExceptionType(), this.getFullyQualifiedClassType(), null, "exceptionType", null, 0, 1, ErrorPageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getErrorPageType_Location(), this.getWarPathType(), null, "location", null, 1, 1, ErrorPageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getErrorPageType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ErrorPageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(filterMappingTypeEClass, FilterMappingType.class, "FilterMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFilterMappingType_FilterName(), this.getFilterNameType(), null, "filterName", null, 1, 1, FilterMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFilterMappingType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FilterMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterMappingType_UrlPattern(), this.getUrlPatternType(), null, "urlPattern", null, 0, -1, FilterMappingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterMappingType_ServletName(), this.getServletNameType(), null, "servletName", null, 0, -1, FilterMappingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterMappingType_Dispatcher(), this.getDispatcherType(), null, "dispatcher", null, 0, 4, FilterMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFilterMappingType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, FilterMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(filterNameTypeEClass, FilterNameType.class, "FilterNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(filterTypeEClass, FilterType.class, "FilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFilterType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterType_Icon(), this.getIconType(), null, "icon", null, 0, -1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterType_FilterName(), this.getFilterNameType(), null, "filterName", null, 1, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterType_FilterClass(), this.getFullyQualifiedClassType(), null, "filterClass", null, 1, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFilterType_InitParam(), this.getParamValueType(), null, "initParam", null, 0, -1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFilterType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(formLoginConfigTypeEClass, FormLoginConfigType.class, "FormLoginConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFormLoginConfigType_FormLoginPage(), this.getWarPathType(), null, "formLoginPage", null, 1, 1, FormLoginConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFormLoginConfigType_FormErrorPage(), this.getWarPathType(), null, "formErrorPage", null, 1, 1, FormLoginConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFormLoginConfigType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, FormLoginConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(fullyQualifiedClassTypeEClass, FullyQualifiedClassType.class, "FullyQualifiedClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(genericBooleanTypeEClass, GenericBooleanType.class, "GenericBooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(homeTypeEClass, HomeType.class, "HomeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iconTypeEClass, IconType.class, "IconType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIconType_SmallIcon(), this.getPathType(), null, "smallIcon", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIconType_LargeIcon(), this.getPathType(), null, "largeIcon", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getIconType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getIconType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(injectionTargetTypeEClass, InjectionTargetType.class, "InjectionTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInjectionTargetType_InjectionTargetClass(), this.getFullyQualifiedClassType(), null, "injectionTargetClass", null, 1, 1, InjectionTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInjectionTargetType_InjectionTargetName(), this.getJavaIdentifierType(), null, "injectionTargetName", null, 1, 1, InjectionTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(javaIdentifierTypeEClass, JavaIdentifierType.class, "JavaIdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(javaTypeTypeEClass, JavaTypeType.class, "JavaTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(jndiNameTypeEClass, JndiNameType.class, "JndiNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(jspConfigTypeEClass, JspConfigType.class, "JspConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getJspConfigType_Taglib(), this.getTaglibType(), null, "taglib", null, 0, -1, JspConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspConfigType_JspPropertyGroup(), this.getJspPropertyGroupType(), null, "jspPropertyGroup", null, 0, -1, JspConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getJspConfigType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, JspConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(jspFileTypeEClass, JspFileType.class, "JspFileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(jspPropertyGroupTypeEClass, JspPropertyGroupType.class, "JspPropertyGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_Icon(), this.getIconType(), null, "icon", null, 0, -1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_UrlPattern(), this.getUrlPatternType(), null, "urlPattern", null, 1, -1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_ElIgnored(), this.getTrueFalseType(), null, "elIgnored", null, 0, 1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_PageEncoding(), this.getString(), null, "pageEncoding", null, 0, 1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_ScriptingInvalid(), this.getTrueFalseType(), null, "scriptingInvalid", null, 0, 1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_IsXml(), this.getTrueFalseType(), null, "isXml", null, 0, 1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_IncludePrelude(), this.getPathType(), null, "includePrelude", null, 0, -1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_IncludeCoda(), this.getPathType(), null, "includeCoda", null, 0, -1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_DeferredSyntaxAllowedAsLiteral(), this.getTrueFalseType(), null, "deferredSyntaxAllowedAsLiteral", null, 0, 1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJspPropertyGroupType_TrimDirectiveWhitespaces(), this.getTrueFalseType(), null, "trimDirectiveWhitespaces", null, 0, 1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getJspPropertyGroupType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, JspPropertyGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(lifecycleCallbackTypeEClass, LifecycleCallbackType.class, "LifecycleCallbackType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLifecycleCallbackType_LifecycleCallbackClass(), this.getFullyQualifiedClassType(), null, "lifecycleCallbackClass", null, 0, 1, LifecycleCallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifecycleCallbackType_LifecycleCallbackMethod(), this.getJavaIdentifierType(), null, "lifecycleCallbackMethod", null, 1, 1, LifecycleCallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(listenerTypeEClass, ListenerType.class, "ListenerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getListenerType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getListenerType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getListenerType_Icon(), this.getIconType(), null, "icon", null, 0, -1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getListenerType_ListenerClass(), this.getFullyQualifiedClassType(), null, "listenerClass", null, 1, 1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getListenerType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(localeEncodingMappingListTypeEClass, LocaleEncodingMappingListType.class, "LocaleEncodingMappingListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLocaleEncodingMappingListType_LocaleEncodingMapping(), this.getLocaleEncodingMappingType(), null, "localeEncodingMapping", null, 1, -1, LocaleEncodingMappingListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLocaleEncodingMappingListType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LocaleEncodingMappingListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(localeEncodingMappingTypeEClass, LocaleEncodingMappingType.class, "LocaleEncodingMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLocaleEncodingMappingType_Locale(), this.getLocaleType(), "locale", null, 1, 1, LocaleEncodingMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLocaleEncodingMappingType_Encoding(), this.getEncodingType(), "encoding", null, 1, 1, LocaleEncodingMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLocaleEncodingMappingType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LocaleEncodingMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(localHomeTypeEClass, LocalHomeType.class, "LocalHomeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(localTypeEClass, LocalType.class, "LocalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(loginConfigTypeEClass, LoginConfigType.class, "LoginConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLoginConfigType_AuthMethod(), this.getAuthMethodType(), null, "authMethod", null, 0, 1, LoginConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoginConfigType_RealmName(), this.getString(), null, "realmName", null, 0, 1, LoginConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoginConfigType_FormLoginConfig(), this.getFormLoginConfigType(), null, "formLoginConfig", null, 0, 1, LoginConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLoginConfigType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LoginConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageDestinationLinkTypeEClass, MessageDestinationLinkType.class, "MessageDestinationLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(messageDestinationRefTypeEClass, MessageDestinationRefType.class, "MessageDestinationRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationRefName(), this.getJndiNameType(), null, "messageDestinationRefName", null, 1, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationType(), this.getMessageDestinationTypeType(), null, "messageDestinationType", null, 0, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationUsage(), this.getMessageDestinationUsageType(), null, "messageDestinationUsage", null, 0, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MessageDestinationLink(), this.getMessageDestinationLinkType(), null, "messageDestinationLink", null, 0, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMessageDestinationRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MessageDestinationRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageDestinationTypeEClass, MessageDestinationType.class, "MessageDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMessageDestinationType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationType_Icon(), this.getIconType(), null, "icon", null, 0, -1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationType_MessageDestinationName(), this.getString(), null, "messageDestinationName", null, 1, 1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageDestinationType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMessageDestinationType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MessageDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageDestinationTypeTypeEClass, MessageDestinationTypeType.class, "MessageDestinationTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(messageDestinationUsageTypeEClass, MessageDestinationUsageType.class, "MessageDestinationUsageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(mimeMappingTypeEClass, MimeMappingType.class, "MimeMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMimeMappingType_Extension(), this.getString(), null, "extension", null, 1, 1, MimeMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMimeMappingType_MimeType(), this.getMimeTypeType(), null, "mimeType", null, 1, 1, MimeMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMimeMappingType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MimeMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mimeTypeTypeEClass, MimeTypeType.class, "MimeTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(nonEmptyStringTypeEClass, NonEmptyStringType.class, "NonEmptyStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(paramValueTypeEClass, ParamValueType.class, "ParamValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getParamValueType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParamValueType_ParamName(), this.getString(), null, "paramName", null, 1, 1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParamValueType_ParamValue(), this.getXsdStringType(), null, "paramValue", null, 1, 1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParamValueType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ParamValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(pathTypeEClass, PathType.class, "PathType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(persistenceContextRefTypeEClass, PersistenceContextRefType.class, "PersistenceContextRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPersistenceContextRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceContextRefType_PersistenceContextRefName(), this.getJndiNameType(), null, "persistenceContextRefName", null, 1, 1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceContextRefType_PersistenceUnitName(), this.getString(), null, "persistenceUnitName", null, 0, 1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceContextRefType_PersistenceContextType(), this.getPersistenceContextTypeType(), null, "persistenceContextType", null, 0, 1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceContextRefType_PersistenceProperty(), this.getPropertyType(), null, "persistenceProperty", null, 0, -1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceContextRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceContextRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPersistenceContextRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PersistenceContextRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(persistenceContextTypeTypeEClass, PersistenceContextTypeType.class, "PersistenceContextTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(persistenceUnitRefTypeEClass, PersistenceUnitRefType.class, "PersistenceUnitRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPersistenceUnitRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, PersistenceUnitRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceUnitRefType_PersistenceUnitRefName(), this.getJndiNameType(), null, "persistenceUnitRefName", null, 1, 1, PersistenceUnitRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceUnitRefType_PersistenceUnitName(), this.getString(), null, "persistenceUnitName", null, 0, 1, PersistenceUnitRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceUnitRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, PersistenceUnitRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPersistenceUnitRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, PersistenceUnitRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPersistenceUnitRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PersistenceUnitRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(portComponentRefTypeEClass, PortComponentRefType.class, "PortComponentRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPortComponentRefType_ServiceEndpointInterface(), this.getFullyQualifiedClassType(), null, "serviceEndpointInterface", null, 1, 1, PortComponentRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPortComponentRefType_EnableMtom(), this.getTrueFalseType(), null, "enableMtom", null, 0, 1, PortComponentRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPortComponentRefType_PortComponentLink(), this.getString(), null, "portComponentLink", null, 0, 1, PortComponentRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPortComponentRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PortComponentRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPropertyType_Name(), this.getXsdStringType(), null, "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPropertyType_Value(), this.getXsdStringType(), null, "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPropertyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(remoteTypeEClass, RemoteType.class, "RemoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(resAuthTypeEClass, ResAuthType.class, "ResAuthType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(resourceEnvRefTypeEClass, ResourceEnvRefType.class, "ResourceEnvRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_ResourceEnvRefName(), this.getJndiNameType(), null, "resourceEnvRefName", null, 1, 1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_ResourceEnvRefType(), this.getFullyQualifiedClassType(), null, "resourceEnvRefType", null, 0, 1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceEnvRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getResourceEnvRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ResourceEnvRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(resourceRefTypeEClass, ResourceRefType.class, "ResourceRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResourceRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResRefName(), this.getJndiNameType(), null, "resRefName", null, 1, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResType(), this.getFullyQualifiedClassType(), null, "resType", null, 0, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResAuth(), this.getResAuthType(), null, "resAuth", null, 0, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_ResSharingScope(), this.getResSharingScopeType(), null, "resSharingScope", null, 0, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getResourceRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getResourceRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ResourceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(resSharingScopeTypeEClass, ResSharingScopeType.class, "ResSharingScopeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(roleNameTypeEClass, RoleNameType.class, "RoleNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(runAsTypeEClass, RunAsType.class, "RunAsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRunAsType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, RunAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRunAsType_RoleName(), this.getRoleNameType(), null, "roleName", null, 1, 1, RunAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRunAsType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RunAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(securityConstraintTypeEClass, SecurityConstraintType.class, "SecurityConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSecurityConstraintType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, SecurityConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityConstraintType_WebResourceCollection(), this.getWebResourceCollectionType(), null, "webResourceCollection", null, 1, -1, SecurityConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityConstraintType_AuthConstraint(), this.getAuthConstraintType(), null, "authConstraint", null, 0, 1, SecurityConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityConstraintType_UserDataConstraint(), this.getUserDataConstraintType(), null, "userDataConstraint", null, 0, 1, SecurityConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSecurityConstraintType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(securityRoleRefTypeEClass, SecurityRoleRefType.class, "SecurityRoleRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSecurityRoleRefType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityRoleRefType_RoleName(), this.getRoleNameType(), null, "roleName", null, 1, 1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityRoleRefType_RoleLink(), this.getRoleNameType(), null, "roleLink", null, 0, 1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSecurityRoleRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityRoleRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(securityRoleTypeEClass, SecurityRoleType.class, "SecurityRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSecurityRoleType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, SecurityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSecurityRoleType_RoleName(), this.getRoleNameType(), null, "roleName", null, 1, 1, SecurityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSecurityRoleType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(serviceRefHandlerChainsTypeEClass, ServiceRefHandlerChainsType.class, "ServiceRefHandlerChainsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getServiceRefHandlerChainsType_HandlerChain(), this.getServiceRefHandlerChainType(), null, "handlerChain", null, 0, -1, ServiceRefHandlerChainsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServiceRefHandlerChainsType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ServiceRefHandlerChainsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(serviceRefHandlerChainTypeEClass, ServiceRefHandlerChainType.class, "ServiceRefHandlerChainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getServiceRefHandlerChainType_ServiceNamePattern(), this.getServiceRefQnamePattern(), "serviceNamePattern", null, 0, 1, ServiceRefHandlerChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServiceRefHandlerChainType_PortNamePattern(), this.getServiceRefQnamePattern(), "portNamePattern", null, 0, 1, ServiceRefHandlerChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServiceRefHandlerChainType_ProtocolBindings(), this.getServiceRefProtocolBindingListType(), "protocolBindings", null, 0, 1, ServiceRefHandlerChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefHandlerChainType_Handler(), this.getServiceRefHandlerType(), null, "handler", null, 1, -1, ServiceRefHandlerChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServiceRefHandlerChainType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ServiceRefHandlerChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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
		initEReference(getServiceRefType_ServiceRefType(), this.getFullyQualifiedClassType(), null, "serviceRefType", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_WsdlFile(), this.getXsdAnyURIType(), null, "wsdlFile", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_JaxrpcMappingFile(), this.getPathType(), null, "jaxrpcMappingFile", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_ServiceQname(), this.getXsdQNameType(), null, "serviceQname", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_PortComponentRef(), this.getPortComponentRefType(), null, "portComponentRef", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_Handler(), this.getServiceRefHandlerType(), null, "handler", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_HandlerChains(), this.getServiceRefHandlerChainsType(), null, "handlerChains", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_MappedName(), this.getXsdStringType(), null, "mappedName", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServiceRefType_InjectionTarget(), this.getInjectionTargetType(), null, "injectionTarget", null, 0, -1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServiceRefType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ServiceRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(servletMappingTypeEClass, ServletMappingType.class, "ServletMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getServletMappingType_ServletName(), this.getServletNameType(), null, "servletName", null, 1, 1, ServletMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletMappingType_UrlPattern(), this.getUrlPatternType(), null, "urlPattern", null, 1, -1, ServletMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServletMappingType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ServletMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(servletNameTypeEClass, ServletNameType.class, "ServletNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(servletTypeEClass, ServletType.class, "ServletType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getServletType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_Icon(), this.getIconType(), null, "icon", null, 0, -1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_ServletName(), this.getServletNameType(), null, "servletName", null, 1, 1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_ServletClass(), this.getFullyQualifiedClassType(), null, "servletClass", null, 0, 1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_JspFile(), this.getJspFileType(), null, "jspFile", null, 0, 1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_InitParam(), this.getParamValueType(), null, "initParam", null, 0, -1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServletType_LoadOnStartup(), this.getLoadOnStartupType(), "loadOnStartup", null, 0, 1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_RunAs(), this.getRunAsType(), null, "runAs", null, 0, 1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getServletType_SecurityRoleRef(), this.getSecurityRoleRefType(), null, "securityRoleRef", null, 0, -1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getServletType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ServletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sessionConfigTypeEClass, SessionConfigType.class, "SessionConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSessionConfigType_SessionTimeout(), this.getXsdIntegerType(), null, "sessionTimeout", null, 0, 1, SessionConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSessionConfigType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SessionConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stringEClass, org.eclipse.modisco.jee.webapp.webapp25.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getString_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, org.eclipse.modisco.jee.webapp.webapp25.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getString_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, org.eclipse.modisco.jee.webapp.webapp25.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(taglibTypeEClass, TaglibType.class, "TaglibType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTaglibType_TaglibUri(), this.getString(), null, "taglibUri", null, 1, 1, TaglibType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTaglibType_TaglibLocation(), this.getPathType(), null, "taglibLocation", null, 1, 1, TaglibType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTaglibType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TaglibType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transportGuaranteeTypeEClass, TransportGuaranteeType.class, "TransportGuaranteeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(trueFalseTypeEClass, TrueFalseType.class, "TrueFalseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(urlPatternTypeEClass, UrlPatternType.class, "UrlPatternType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getUrlPatternType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, UrlPatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(userDataConstraintTypeEClass, UserDataConstraintType.class, "UserDataConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getUserDataConstraintType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, UserDataConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getUserDataConstraintType_TransportGuarantee(), this.getTransportGuaranteeType(), null, "transportGuarantee", null, 1, 1, UserDataConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getUserDataConstraintType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UserDataConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(warPathTypeEClass, WarPathType.class, "WarPathType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(webAppTypeEClass, WebAppType.class, "WebAppType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getWebAppType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, WebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_DisplayName(), this.getDisplayNameType(), null, "displayName", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_Icon(), this.getIconType(), null, "icon", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_Distributable(), this.getEmptyType(), null, "distributable", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_ContextParam(), this.getParamValueType(), null, "contextParam", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_Filter(), this.getFilterType(), null, "filter", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_FilterMapping(), this.getFilterMappingType(), null, "filterMapping", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_Listener(), this.getListenerType(), null, "listener", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_Servlet(), this.getServletType(), null, "servlet", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_ServletMapping(), this.getServletMappingType(), null, "servletMapping", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_SessionConfig(), this.getSessionConfigType(), null, "sessionConfig", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_MimeMapping(), this.getMimeMappingType(), null, "mimeMapping", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_WelcomeFileList(), this.getWelcomeFileListType(), null, "welcomeFileList", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_ErrorPage(), this.getErrorPageType(), null, "errorPage", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_JspConfig(), this.getJspConfigType(), null, "jspConfig", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_SecurityConstraint(), this.getSecurityConstraintType(), null, "securityConstraint", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_LoginConfig(), this.getLoginConfigType(), null, "loginConfig", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_SecurityRole(), this.getSecurityRoleType(), null, "securityRole", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_EnvEntry(), this.getEnvEntryType(), null, "envEntry", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_EjbRef(), this.getEjbRefType(), null, "ejbRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_EjbLocalRef(), this.getEjbLocalRefType(), null, "ejbLocalRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_ServiceRef(), this.getServiceRefType(), null, "serviceRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_ResourceRef(), this.getResourceRefType(), null, "resourceRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_ResourceEnvRef(), this.getResourceEnvRefType(), null, "resourceEnvRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_MessageDestinationRef(), this.getMessageDestinationRefType(), null, "messageDestinationRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_PersistenceContextRef(), this.getPersistenceContextRefType(), null, "persistenceContextRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_PersistenceUnitRef(), this.getPersistenceUnitRefType(), null, "persistenceUnitRef", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_PostConstruct(), this.getLifecycleCallbackType(), null, "postConstruct", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_PreDestroy(), this.getLifecycleCallbackType(), null, "preDestroy", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_MessageDestination(), this.getMessageDestinationType(), null, "messageDestination", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebAppType_LocaleEncodingMappingList(), this.getLocaleEncodingMappingListType(), null, "localeEncodingMappingList", null, 0, -1, WebAppType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWebAppType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, WebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWebAppType_MetadataComplete(), theXMLTypePackage.getBoolean(), "metadataComplete", null, 0, 1, WebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWebAppType_Version(), this.getWebAppVersionType(), "version", null, 1, 1, WebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(webResourceCollectionTypeEClass, WebResourceCollectionType.class, "WebResourceCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWebResourceCollectionType_WebResourceName(), this.getString(), null, "webResourceName", null, 1, 1, WebResourceCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebResourceCollectionType_Description(), this.getDescriptionType(), null, "description", null, 0, -1, WebResourceCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWebResourceCollectionType_UrlPattern(), this.getUrlPatternType(), null, "urlPattern", null, 1, -1, WebResourceCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWebResourceCollectionType_HttpMethod(), this.getHttpMethodType(), "httpMethod", null, 0, -1, WebResourceCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWebResourceCollectionType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, WebResourceCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(welcomeFileListTypeEClass, WelcomeFileListType.class, "WelcomeFileListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getWelcomeFileListType_WelcomeFile(), theXMLTypePackage.getString(), "welcomeFile", null, 1, -1, WelcomeFileListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWelcomeFileListType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, WelcomeFileListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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
		initEEnum(dispatcherTypeBaseEEnum, DispatcherTypeBase.class, "DispatcherTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(dispatcherTypeBaseEEnum, DispatcherTypeBase.FORWARD);
		addEEnumLiteral(dispatcherTypeBaseEEnum, DispatcherTypeBase.INCLUDE);
		addEEnumLiteral(dispatcherTypeBaseEEnum, DispatcherTypeBase.REQUEST);
		addEEnumLiteral(dispatcherTypeBaseEEnum, DispatcherTypeBase.ERROR);

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

		initEEnum(nullCharTypeEEnum, NullCharType.class, "NullCharType"); //$NON-NLS-1$
		addEEnumLiteral(nullCharTypeEEnum, NullCharType._);

		initEEnum(persistenceContextTypeTypeBaseEEnum, PersistenceContextTypeTypeBase.class, "PersistenceContextTypeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(persistenceContextTypeTypeBaseEEnum, PersistenceContextTypeTypeBase.TRANSACTION);
		addEEnumLiteral(persistenceContextTypeTypeBaseEEnum, PersistenceContextTypeTypeBase.EXTENDED);

		initEEnum(resAuthTypeBaseEEnum, ResAuthTypeBase.class, "ResAuthTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(resAuthTypeBaseEEnum, ResAuthTypeBase.APPLICATION);
		addEEnumLiteral(resAuthTypeBaseEEnum, ResAuthTypeBase.CONTAINER);

		initEEnum(resSharingScopeTypeBaseEEnum, ResSharingScopeTypeBase.class, "ResSharingScopeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(resSharingScopeTypeBaseEEnum, ResSharingScopeTypeBase.SHAREABLE);
		addEEnumLiteral(resSharingScopeTypeBaseEEnum, ResSharingScopeTypeBase.UNSHAREABLE);

		initEEnum(transportGuaranteeTypeBaseEEnum, TransportGuaranteeTypeBase.class, "TransportGuaranteeTypeBase"); //$NON-NLS-1$
		addEEnumLiteral(transportGuaranteeTypeBaseEEnum, TransportGuaranteeTypeBase.NONE);
		addEEnumLiteral(transportGuaranteeTypeBaseEEnum, TransportGuaranteeTypeBase.INTEGRAL);
		addEEnumLiteral(transportGuaranteeTypeBaseEEnum, TransportGuaranteeTypeBase.CONFIDENTIAL);

		initEEnum(webAppVersionTypeEEnum, WebAppVersionType.class, "WebAppVersionType"); //$NON-NLS-1$
		addEEnumLiteral(webAppVersionTypeEEnum, WebAppVersionType._25);

		// Initialize data types
		initEDataType(authMethodTypeBaseEDataType, String.class, "AuthMethodTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(deweyVersionTypeEDataType, String.class, "DeweyVersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(dispatcherTypeBaseObjectEDataType, DispatcherTypeBase.class, "DispatcherTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbLinkTypeBaseEDataType, String.class, "EjbLinkTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbRefNameTypeBaseEDataType, String.class, "EjbRefNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(ejbRefTypeTypeBaseObjectEDataType, EjbRefTypeTypeBase.class, "EjbRefTypeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(encodingTypeEDataType, String.class, "EncodingType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(envEntryTypeValuesTypeBaseObjectEDataType, EnvEntryTypeValuesTypeBase.class, "EnvEntryTypeValuesTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(errorCodeTypeBaseEDataType, BigInteger.class, "ErrorCodeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fullyQualifiedClassTypeBaseEDataType, String.class, "FullyQualifiedClassTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(genericBooleanTypeBaseObjectEDataType, GenericBooleanTypeBase.class, "GenericBooleanTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(homeTypeBaseEDataType, String.class, "HomeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(httpMethodTypeEDataType, String.class, "HttpMethodType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(javaIdentifierTypeBaseEDataType, String.class, "JavaIdentifierTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(javaTypeTypeBaseEDataType, String.class, "JavaTypeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(jndiNameTypeBaseEDataType, String.class, "JndiNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(jspFileTypeBaseEDataType, String.class, "JspFileTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(loadOnStartupTypeEDataType, Object.class, "LoadOnStartupType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(localeTypeEDataType, String.class, "LocaleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(localHomeTypeBaseEDataType, String.class, "LocalHomeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(localTypeBaseEDataType, String.class, "LocalTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(messageDestinationLinkTypeBaseEDataType, String.class, "MessageDestinationLinkTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(messageDestinationTypeTypeBaseEDataType, String.class, "MessageDestinationTypeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(messageDestinationUsageTypeBaseObjectEDataType, MessageDestinationUsageTypeBase.class, "MessageDestinationUsageTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(mimeTypeTypeBaseEDataType, String.class, "MimeTypeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(nonEmptyStringTypeBaseEDataType, String.class, "NonEmptyStringTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(nullCharTypeObjectEDataType, NullCharType.class, "NullCharTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(pathTypeBaseEDataType, String.class, "PathTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(persistenceContextTypeTypeBaseObjectEDataType, PersistenceContextTypeTypeBase.class, "PersistenceContextTypeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(remoteTypeBaseEDataType, String.class, "RemoteTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(resAuthTypeBaseObjectEDataType, ResAuthTypeBase.class, "ResAuthTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(resSharingScopeTypeBaseObjectEDataType, ResSharingScopeTypeBase.class, "ResSharingScopeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(roleNameTypeBaseEDataType, String.class, "RoleNameTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(serviceRefProtocolBindingListTypeEDataType, List.class, "ServiceRefProtocolBindingListType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(serviceRefProtocolBindingTypeEDataType, String.class, "ServiceRefProtocolBindingType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(serviceRefProtocolURIAliasTypeEDataType, String.class, "ServiceRefProtocolURIAliasType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(serviceRefQnamePatternEDataType, String.class, "ServiceRefQnamePattern", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(transportGuaranteeTypeBaseObjectEDataType, TransportGuaranteeTypeBase.class, "TransportGuaranteeTypeBaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(trueFalseTypeBaseEDataType, boolean.class, "TrueFalseTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(trueFalseTypeBaseObjectEDataType, Boolean.class, "TrueFalseTypeBaseObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(warPathTypeBaseEDataType, String.class, "WarPathTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(webAppVersionTypeObjectEDataType, WebAppVersionType.class, "WebAppVersionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
		  (authConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "auth-constraintType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAuthConstraintType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAuthConstraintType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAuthConstraintType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (authMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "auth-methodType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (authMethodTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "auth-methodType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "\\.?[0-9]+(\\.[0-9]+)*" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (dispatcherTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dispatcherType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (dispatcherTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "dispatcherType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (dispatcherTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "dispatcherType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "dispatcherType_._base" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getDocumentRoot_WebApp(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "web-app", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_EjbRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_EjbRefType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_LocalHome(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local-home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_Local(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "local", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_EjbLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbLocalRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbLocalRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_EjbRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_EjbRefType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_Home(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "home", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_Remote(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "remote", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_EjbLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEjbRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEjbRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (encodingTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "encodingType", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "[^\\s]+" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEnvEntryType_EnvEntryName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEnvEntryType_EnvEntryType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEnvEntryType_EnvEntryValue(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry-value", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEnvEntryType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getEnvEntryType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (errorCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "error-codeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (errorCodeTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "error-codeType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#positiveInteger", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "\\d{3}" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (errorPageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "error-pageType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getErrorPageType_ErrorCode(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "error-code", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getErrorPageType_ExceptionType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "exception-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getErrorPageType_Location(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "location", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getErrorPageType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (filterMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "filter-mappingType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterMappingType_FilterName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "filter-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterMappingType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "group:1" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterMappingType_UrlPattern(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "url-pattern", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:1" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterMappingType_ServletName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "servlet-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:1" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterMappingType_Dispatcher(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "dispatcher", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterMappingType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (filterNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "filter-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (filterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "filterType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterType_FilterName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "filter-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getFilterType_FilterClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "filter-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getFilterType_InitParam(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "init-param", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFilterType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (formLoginConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "form-login-configType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getFormLoginConfigType_FormLoginPage(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "form-login-page", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getFormLoginConfigType_FormErrorPage(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "form-error-page", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFormLoginConfigType_Id(), 
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
		  (httpMethodTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "http-methodType", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "[!-~-[\\(\\)<>@,;:\"/\\[\\]?=\\{\\}\\\\\\p{Z}]]+" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getIconType_LargeIcon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "large-icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (injectionTargetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "injection-targetType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInjectionTargetType_InjectionTargetClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInjectionTargetType_InjectionTargetName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (jspConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "jsp-configType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspConfigType_Taglib(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "taglib", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspConfigType_JspPropertyGroup(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "jsp-property-group", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspConfigType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (jspFileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "jsp-fileType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (jspFileTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "jsp-fileType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (jspPropertyGroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "jsp-property-groupType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspPropertyGroupType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspPropertyGroupType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspPropertyGroupType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspPropertyGroupType_UrlPattern(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "url-pattern", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_ElIgnored(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "el-ignored", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_PageEncoding(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "page-encoding", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_ScriptingInvalid(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "scripting-invalid", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_IsXml(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "is-xml", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_IncludePrelude(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "include-prelude", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_IncludeCoda(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "include-coda", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_DeferredSyntaxAllowedAsLiteral(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "deferred-syntax-allowed-as-literal", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJspPropertyGroupType_TrimDirectiveWhitespaces(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "trim-directive-whitespaces", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getJspPropertyGroupType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (lifecycleCallbackTypeEClass, 
		   source, 
		   new String[] {
			 "name", "lifecycle-callbackType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLifecycleCallbackType_LifecycleCallbackClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "lifecycle-callback-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLifecycleCallbackType_LifecycleCallbackMethod(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "lifecycle-callback-method", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getListenerType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getListenerType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getListenerType_ListenerClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "listener-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getListenerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (loadOnStartupTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "load-on-startupType", //$NON-NLS-1$ //$NON-NLS-2$
			 "memberTypes", "null-charType http://www.eclipse.org/emf/2003/XMLType#integer" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (localeEncodingMappingListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "locale-encoding-mapping-listType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLocaleEncodingMappingListType_LocaleEncodingMapping(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "locale-encoding-mapping", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLocaleEncodingMappingListType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (localeEncodingMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "locale-encoding-mappingType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLocaleEncodingMappingType_Locale(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "locale", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLocaleEncodingMappingType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "encoding", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLocaleEncodingMappingType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (localeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "localeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "[a-z]{2}(_|-)?([\\p{L}\\-\\p{Nd}]{2})?" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (loginConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "login-configType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLoginConfigType_AuthMethod(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "auth-method", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getLoginConfigType_RealmName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "realm-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLoginConfigType_FormLoginConfig(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "form-login-config", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLoginConfigType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationUsage(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-usage", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_MessageDestinationLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessageDestinationRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageDestinationType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessageDestinationType_MessageDestinationName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessageDestinationType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (mimeMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mime-mappingType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMimeMappingType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "extension", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMimeMappingType_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mime-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMimeMappingType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (mimeTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mime-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (mimeTypeTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "mime-typeType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "[^\\p{Cc}^\\s]+/[^\\p{Cc}^\\s]+" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (nonEmptyStringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nonEmptyStringType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (nonEmptyStringTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "nonEmptyStringType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "minLength", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (nullCharTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "null-charType" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (nullCharTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "null-charType:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "null-charType" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getParamValueType_ParamName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "param-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getParamValueType_ParamValue(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "param-value", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (persistenceContextRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-context-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPersistenceContextRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPersistenceContextRefType_PersistenceContextRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-context-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPersistenceContextRefType_PersistenceUnitName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-unit-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPersistenceContextRefType_PersistenceContextType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-context-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPersistenceContextRefType_PersistenceProperty(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-property", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPersistenceContextRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPersistenceContextRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPersistenceContextRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (persistenceContextTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-context-typeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (persistenceContextTypeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "persistence-context-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (persistenceContextTypeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "persistence-context-typeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "persistence-context-typeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (persistenceUnitRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-unit-refType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPersistenceUnitRefType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPersistenceUnitRefType_PersistenceUnitRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-unit-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPersistenceUnitRefType_PersistenceUnitName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-unit-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPersistenceUnitRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPersistenceUnitRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPersistenceUnitRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPortComponentRefType_EnableMtom(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "enable-mtom", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPortComponentRefType_PortComponentLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "port-component-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPortComponentRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (propertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "propertyType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPropertyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPropertyType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "value", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPropertyType_Id(), 
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceEnvRefType_ResourceEnvRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceEnvRefType_ResourceEnvRefType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceEnvRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceEnvRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceRefType_ResRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceRefType_ResType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceRefType_ResAuth(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-auth", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceRefType_ResSharingScope(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "res-sharing-scope", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getResourceRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getResourceRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRunAsType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRunAsType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (securityConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "security-constraintType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityConstraintType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityConstraintType_WebResourceCollection(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "web-resource-collection", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityConstraintType_AuthConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "auth-constraint", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityConstraintType_UserDataConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "user-data-constraint", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityConstraintType_Id(), 
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSecurityRoleRefType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSecurityRoleRefType_RoleLink(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityRoleType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSecurityRoleType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefHandlerChainsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service-ref_handler-chainsType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerChainsType_HandlerChain(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler-chain", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerChainsType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefHandlerChainTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service-ref_handler-chainType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerChainType_ServiceNamePattern(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-name-pattern", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerChainType_PortNamePattern(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "port-name-pattern", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerChainType_ProtocolBindings(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "protocol-bindings", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerChainType_Handler(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerChainType_Id(), 
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_HandlerName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_HandlerClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_InitParam(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "init-param", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_SoapHeader(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "soap-header", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_SoapRole(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "soap-role", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefHandlerType_PortName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "port-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefHandlerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefProtocolBindingListTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "service-ref_protocol-bindingListType", //$NON-NLS-1$ //$NON-NLS-2$
			 "itemType", "service-ref_protocol-bindingType" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefProtocolBindingTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "service-ref_protocol-bindingType", //$NON-NLS-1$ //$NON-NLS-2$
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI service-ref_protocol-URIAliasType" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefProtocolURIAliasTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "service-ref_protocol-URIAliasType", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "##.+" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (serviceRefQnamePatternEDataType, 
		   source, 
		   new String[] {
			 "name", "service-ref_qname-pattern", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "\\*|([\\i-[:]][\\c-[:]]*:)?[\\i-[:]][\\c-[:]]*\\*?" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_ServiceRefName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-ref-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_ServiceInterface(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-interface", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_ServiceRefType(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-ref-type", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_WsdlFile(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "wsdl-file", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_JaxrpcMappingFile(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "jaxrpc-mapping-file", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_ServiceQname(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-qname", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_PortComponentRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "port-component-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_Handler(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_HandlerChains(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "handler-chains", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServiceRefType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mapped-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_InjectionTarget(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "injection-target", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServiceRefType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (servletMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "servlet-mappingType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletMappingType_ServletName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "servlet-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletMappingType_UrlPattern(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "url-pattern", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletMappingType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (servletNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "servlet-nameType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (servletTypeEClass, 
		   source, 
		   new String[] {
			 "name", "servletType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_ServletName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "servlet-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServletType_ServletClass(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "servlet-class", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_JspFile(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "jsp-file", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_InitParam(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "init-param", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getServletType_LoadOnStartup(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "load-on-startup", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_RunAs(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "run-as", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_SecurityRoleRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-role-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getServletType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (sessionConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "session-configType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSessionConfigType_SessionTimeout(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "session-timeout", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSessionConfigType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (taglibTypeEClass, 
		   source, 
		   new String[] {
			 "name", "taglibType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTaglibType_TaglibUri(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "taglib-uri", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTaglibType_TaglibLocation(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "taglib-location", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTaglibType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (transportGuaranteeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "transport-guaranteeType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (transportGuaranteeTypeBaseEEnum, 
		   source, 
		   new String[] {
			 "name", "transport-guaranteeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (transportGuaranteeTypeBaseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "transport-guaranteeType_._base:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "transport-guaranteeType_._base" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (userDataConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "user-data-constraintType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getUserDataConstraintType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getUserDataConstraintType_TransportGuarantee(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "transport-guarantee", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getUserDataConstraintType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (warPathTypeEClass, 
		   source, 
		   new String[] {
			 "name", "war-pathType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "simple" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (warPathTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "war-pathType_._base", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "/.*" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (webAppTypeEClass, 
		   source, 
		   new String[] {
			 "name", "web-appType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "display-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "icon", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Distributable(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "distributable", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getWebAppType_ContextParam(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "context-param", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Filter(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "filter", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_FilterMapping(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "filter-mapping", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Listener(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "listener", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Servlet(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "servlet", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_ServletMapping(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "servlet-mapping", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_SessionConfig(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "session-config", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_MimeMapping(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "mime-mapping", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_WelcomeFileList(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "welcome-file-list", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_ErrorPage(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "error-page", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_JspConfig(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "jsp-config", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_SecurityConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-constraint", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_LoginConfig(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "login-config", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_SecurityRole(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "security-role", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_EnvEntry(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "env-entry", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_EjbRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_EjbLocalRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ejb-local-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_ServiceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "service-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_ResourceRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_ResourceEnvRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "resource-env-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_MessageDestinationRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_PersistenceContextRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-context-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_PersistenceUnitRef(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "persistence-unit-ref", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_PostConstruct(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "post-construct", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_PreDestroy(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "pre-destroy", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_MessageDestination(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "message-destination", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_LocaleEncodingMappingList(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "locale-encoding-mapping-list", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee", //$NON-NLS-1$ //$NON-NLS-2$
			 "group", "#group:0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getWebAppType_MetadataComplete(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "metadata-complete" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebAppType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "version" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (webAppVersionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "web-app-versionType" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (webAppVersionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "web-app-versionType:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "web-app-versionType" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (webResourceCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "web-resource-collectionType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getWebResourceCollectionType_WebResourceName(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "web-resource-name", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebResourceCollectionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "description", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebResourceCollectionType_UrlPattern(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "url-pattern", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebResourceCollectionType_HttpMethod(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "http-method", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWebResourceCollectionType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (welcomeFileListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "welcome-file-listType", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getWelcomeFileListType_WelcomeFile(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "welcome-file", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "http://java.sun.com/xml/ns/javaee" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWelcomeFileListType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
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

} //Webapp25PackageImpl
