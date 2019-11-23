/**
 *   Copyright (c) 2010, 2019 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp30.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType;
import org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesType;
import org.eclipse.modisco.jee.webapp.webapp30.AddressingType;
import org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp30.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieCommentType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieDomainType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieNameType;
import org.eclipse.modisco.jee.webapp.webapp30.CookiePathType;
import org.eclipse.modisco.jee.webapp.webapp30.DataSourceType;
import org.eclipse.modisco.jee.webapp.webapp30.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp30.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp30.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp30.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp30.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp30.FilterType;
import org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanType;
import org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType;
import org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType;
import org.eclipse.modisco.jee.webapp.webapp30.HandlerType;
import org.eclipse.modisco.jee.webapp.webapp30.HomeType;
import org.eclipse.modisco.jee.webapp.webapp30.IconType;
import org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp30.JavaTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.JdbcUrlType;
import org.eclipse.modisco.jee.webapp.webapp30.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp30.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType;
import org.eclipse.modisco.jee.webapp.webapp30.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp30.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp30.LocalType;
import org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationLinkType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageType;
import org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.NonEmptyStringType;
import org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType;
import org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType;
import org.eclipse.modisco.jee.webapp.webapp30.OrderingType;
import org.eclipse.modisco.jee.webapp.webapp30.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp30.PathType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeType;
import org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType;
import org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp30.PropertyType;
import org.eclipse.modisco.jee.webapp.webapp30.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp30.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType;
import org.eclipse.modisco.jee.webapp.webapp30.RoleNameType;
import org.eclipse.modisco.jee.webapp.webapp30.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp30.ServletType;
import org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType;
import org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp30.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp30.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp30.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType;
import org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdStringType;
import org.eclipse.modisco.jee.webapp.webapp30.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package
 * @generated
 */
public class Webapp30AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Webapp30Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp30AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Webapp30Package.eINSTANCE;
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
	protected Webapp30Switch<Adapter> modelSwitch =
		new Webapp30Switch<Adapter>() {
			@Override
			public Adapter caseAbsoluteOrderingType(AbsoluteOrderingType object) {
				return createAbsoluteOrderingTypeAdapter();
			}
			@Override
			public Adapter caseAddressingResponsesType(AddressingResponsesType object) {
				return createAddressingResponsesTypeAdapter();
			}
			@Override
			public Adapter caseAddressingType(AddressingType object) {
				return createAddressingTypeAdapter();
			}
			@Override
			public Adapter caseAuthConstraintType(AuthConstraintType object) {
				return createAuthConstraintTypeAdapter();
			}
			@Override
			public Adapter caseAuthMethodType(AuthMethodType object) {
				return createAuthMethodTypeAdapter();
			}
			@Override
			public Adapter caseCookieCommentType(CookieCommentType object) {
				return createCookieCommentTypeAdapter();
			}
			@Override
			public Adapter caseCookieConfigType(CookieConfigType object) {
				return createCookieConfigTypeAdapter();
			}
			@Override
			public Adapter caseCookieDomainType(CookieDomainType object) {
				return createCookieDomainTypeAdapter();
			}
			@Override
			public Adapter caseCookieNameType(CookieNameType object) {
				return createCookieNameTypeAdapter();
			}
			@Override
			public Adapter caseCookiePathType(CookiePathType object) {
				return createCookiePathTypeAdapter();
			}
			@Override
			public Adapter caseDataSourceType(DataSourceType object) {
				return createDataSourceTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDispatcherType(DispatcherType object) {
				return createDispatcherTypeAdapter();
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
			public Adapter caseEjbLinkType(EjbLinkType object) {
				return createEjbLinkTypeAdapter();
			}
			@Override
			public Adapter caseEjbLocalRefType(EjbLocalRefType object) {
				return createEjbLocalRefTypeAdapter();
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
			public Adapter caseEmptyType(EmptyType object) {
				return createEmptyTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryType(EnvEntryType object) {
				return createEnvEntryTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryTypeValuesType(EnvEntryTypeValuesType object) {
				return createEnvEntryTypeValuesTypeAdapter();
			}
			@Override
			public Adapter caseErrorCodeType(ErrorCodeType object) {
				return createErrorCodeTypeAdapter();
			}
			@Override
			public Adapter caseErrorPageType(ErrorPageType object) {
				return createErrorPageTypeAdapter();
			}
			@Override
			public Adapter caseFilterMappingType(FilterMappingType object) {
				return createFilterMappingTypeAdapter();
			}
			@Override
			public Adapter caseFilterNameType(FilterNameType object) {
				return createFilterNameTypeAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseFormLoginConfigType(FormLoginConfigType object) {
				return createFormLoginConfigTypeAdapter();
			}
			@Override
			public Adapter caseFullyQualifiedClassType(FullyQualifiedClassType object) {
				return createFullyQualifiedClassTypeAdapter();
			}
			@Override
			public Adapter caseGenericBooleanType(GenericBooleanType object) {
				return createGenericBooleanTypeAdapter();
			}
			@Override
			public Adapter caseHandlerChainsType(HandlerChainsType object) {
				return createHandlerChainsTypeAdapter();
			}
			@Override
			public Adapter caseHandlerChainType(HandlerChainType object) {
				return createHandlerChainTypeAdapter();
			}
			@Override
			public Adapter caseHandlerType(HandlerType object) {
				return createHandlerTypeAdapter();
			}
			@Override
			public Adapter caseHomeType(HomeType object) {
				return createHomeTypeAdapter();
			}
			@Override
			public Adapter caseIconType(IconType object) {
				return createIconTypeAdapter();
			}
			@Override
			public Adapter caseInjectionTargetType(InjectionTargetType object) {
				return createInjectionTargetTypeAdapter();
			}
			@Override
			public Adapter caseJavaIdentifierType(JavaIdentifierType object) {
				return createJavaIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseJavaTypeType(JavaTypeType object) {
				return createJavaTypeTypeAdapter();
			}
			@Override
			public Adapter caseJdbcUrlType(JdbcUrlType object) {
				return createJdbcUrlTypeAdapter();
			}
			@Override
			public Adapter caseJndiNameType(JndiNameType object) {
				return createJndiNameTypeAdapter();
			}
			@Override
			public Adapter caseJspConfigType(JspConfigType object) {
				return createJspConfigTypeAdapter();
			}
			@Override
			public Adapter caseJspFileType(JspFileType object) {
				return createJspFileTypeAdapter();
			}
			@Override
			public Adapter caseJspPropertyGroupType(JspPropertyGroupType object) {
				return createJspPropertyGroupTypeAdapter();
			}
			@Override
			public Adapter caseLifecycleCallbackType(LifecycleCallbackType object) {
				return createLifecycleCallbackTypeAdapter();
			}
			@Override
			public Adapter caseListenerType(ListenerType object) {
				return createListenerTypeAdapter();
			}
			@Override
			public Adapter caseLocaleEncodingMappingListType(LocaleEncodingMappingListType object) {
				return createLocaleEncodingMappingListTypeAdapter();
			}
			@Override
			public Adapter caseLocaleEncodingMappingType(LocaleEncodingMappingType object) {
				return createLocaleEncodingMappingTypeAdapter();
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
			public Adapter caseLoginConfigType(LoginConfigType object) {
				return createLoginConfigTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationLinkType(MessageDestinationLinkType object) {
				return createMessageDestinationLinkTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationRefType(MessageDestinationRefType object) {
				return createMessageDestinationRefTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationType(MessageDestinationType object) {
				return createMessageDestinationTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationTypeType(MessageDestinationTypeType object) {
				return createMessageDestinationTypeTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationUsageType(MessageDestinationUsageType object) {
				return createMessageDestinationUsageTypeAdapter();
			}
			@Override
			public Adapter caseMimeMappingType(MimeMappingType object) {
				return createMimeMappingTypeAdapter();
			}
			@Override
			public Adapter caseMimeTypeType(MimeTypeType object) {
				return createMimeTypeTypeAdapter();
			}
			@Override
			public Adapter caseMultipartConfigType(MultipartConfigType object) {
				return createMultipartConfigTypeAdapter();
			}
			@Override
			public Adapter caseNonEmptyStringType(NonEmptyStringType object) {
				return createNonEmptyStringTypeAdapter();
			}
			@Override
			public Adapter caseOrderingOrderingType(OrderingOrderingType object) {
				return createOrderingOrderingTypeAdapter();
			}
			@Override
			public Adapter caseOrderingOthersType(OrderingOthersType object) {
				return createOrderingOthersTypeAdapter();
			}
			@Override
			public Adapter caseOrderingType(OrderingType object) {
				return createOrderingTypeAdapter();
			}
			@Override
			public Adapter caseParamValueType(ParamValueType object) {
				return createParamValueTypeAdapter();
			}
			@Override
			public Adapter casePathType(PathType object) {
				return createPathTypeAdapter();
			}
			@Override
			public Adapter casePersistenceContextRefType(PersistenceContextRefType object) {
				return createPersistenceContextRefTypeAdapter();
			}
			@Override
			public Adapter casePersistenceContextTypeType(PersistenceContextTypeType object) {
				return createPersistenceContextTypeTypeAdapter();
			}
			@Override
			public Adapter casePersistenceUnitRefType(PersistenceUnitRefType object) {
				return createPersistenceUnitRefTypeAdapter();
			}
			@Override
			public Adapter casePortComponentRefType(PortComponentRefType object) {
				return createPortComponentRefTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
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
			public Adapter caseResourceEnvRefType(ResourceEnvRefType object) {
				return createResourceEnvRefTypeAdapter();
			}
			@Override
			public Adapter caseResourceRefType(ResourceRefType object) {
				return createResourceRefTypeAdapter();
			}
			@Override
			public Adapter caseRespectBindingType(RespectBindingType object) {
				return createRespectBindingTypeAdapter();
			}
			@Override
			public Adapter caseResSharingScopeType(ResSharingScopeType object) {
				return createResSharingScopeTypeAdapter();
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
			public Adapter caseSecurityConstraintType(SecurityConstraintType object) {
				return createSecurityConstraintTypeAdapter();
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
			public Adapter caseServiceRefType(ServiceRefType object) {
				return createServiceRefTypeAdapter();
			}
			@Override
			public Adapter caseServletMappingType(ServletMappingType object) {
				return createServletMappingTypeAdapter();
			}
			@Override
			public Adapter caseServletNameType(ServletNameType object) {
				return createServletNameTypeAdapter();
			}
			@Override
			public Adapter caseServletType(ServletType object) {
				return createServletTypeAdapter();
			}
			@Override
			public Adapter caseSessionConfigType(SessionConfigType object) {
				return createSessionConfigTypeAdapter();
			}
			@Override
			public Adapter caseString(org.eclipse.modisco.jee.webapp.webapp30.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseTaglibType(TaglibType object) {
				return createTaglibTypeAdapter();
			}
			@Override
			public Adapter caseTrackingModeType(TrackingModeType object) {
				return createTrackingModeTypeAdapter();
			}
			@Override
			public Adapter caseTransportGuaranteeType(TransportGuaranteeType object) {
				return createTransportGuaranteeTypeAdapter();
			}
			@Override
			public Adapter caseTrueFalseType(TrueFalseType object) {
				return createTrueFalseTypeAdapter();
			}
			@Override
			public Adapter caseUrlPatternType(UrlPatternType object) {
				return createUrlPatternTypeAdapter();
			}
			@Override
			public Adapter caseUserDataConstraintType(UserDataConstraintType object) {
				return createUserDataConstraintTypeAdapter();
			}
			@Override
			public Adapter caseWarPathType(WarPathType object) {
				return createWarPathTypeAdapter();
			}
			@Override
			public Adapter caseWebAppType(WebAppType object) {
				return createWebAppTypeAdapter();
			}
			@Override
			public Adapter caseWebFragmentType(WebFragmentType object) {
				return createWebFragmentTypeAdapter();
			}
			@Override
			public Adapter caseWebResourceCollectionType(WebResourceCollectionType object) {
				return createWebResourceCollectionTypeAdapter();
			}
			@Override
			public Adapter caseWelcomeFileListType(WelcomeFileListType object) {
				return createWelcomeFileListTypeAdapter();
			}
			@Override
			public Adapter caseXsdAnyURIType(XsdAnyURIType object) {
				return createXsdAnyURITypeAdapter();
			}
			@Override
			public Adapter caseXsdBooleanType(XsdBooleanType object) {
				return createXsdBooleanTypeAdapter();
			}
			@Override
			public Adapter caseXsdIntegerType(XsdIntegerType object) {
				return createXsdIntegerTypeAdapter();
			}
			@Override
			public Adapter caseXsdNMTOKENType(XsdNMTOKENType object) {
				return createXsdNMTOKENTypeAdapter();
			}
			@Override
			public Adapter caseXsdNonNegativeIntegerType(XsdNonNegativeIntegerType object) {
				return createXsdNonNegativeIntegerTypeAdapter();
			}
			@Override
			public Adapter caseXsdPositiveIntegerType(XsdPositiveIntegerType object) {
				return createXsdPositiveIntegerTypeAdapter();
			}
			@Override
			public Adapter caseXsdQNameType(XsdQNameType object) {
				return createXsdQNameTypeAdapter();
			}
			@Override
			public Adapter caseXsdStringType(XsdStringType object) {
				return createXsdStringTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType <em>Absolute Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType
	 * @generated
	 */
	public Adapter createAbsoluteOrderingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesType <em>Addressing Responses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesType
	 * @generated
	 */
	public Adapter createAddressingResponsesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType <em>Addressing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingType
	 * @generated
	 */
	public Adapter createAddressingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType
	 * @generated
	 */
	public Adapter createAuthConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.AuthMethodType <em>Auth Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AuthMethodType
	 * @generated
	 */
	public Adapter createAuthMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieCommentType <em>Cookie Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieCommentType
	 * @generated
	 */
	public Adapter createCookieCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType <em>Cookie Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType
	 * @generated
	 */
	public Adapter createCookieConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieDomainType <em>Cookie Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieDomainType
	 * @generated
	 */
	public Adapter createCookieDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieNameType <em>Cookie Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieNameType
	 * @generated
	 */
	public Adapter createCookieNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.CookiePathType <em>Cookie Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookiePathType
	 * @generated
	 */
	public Adapter createCookiePathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType <em>Data Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType
	 * @generated
	 */
	public Adapter createDataSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.DispatcherType <em>Dispatcher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DispatcherType
	 * @generated
	 */
	public Adapter createDispatcherTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType
	 * @generated
	 */
	public Adapter createDisplayNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLinkType
	 * @generated
	 */
	public Adapter createEjbLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType
	 * @generated
	 */
	public Adapter createEjbLocalRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefNameType
	 * @generated
	 */
	public Adapter createEjbRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType
	 * @generated
	 */
	public Adapter createEjbRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeType
	 * @generated
	 */
	public Adapter createEjbRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EmptyType
	 * @generated
	 */
	public Adapter createEmptyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType
	 * @generated
	 */
	public Adapter createEnvEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryTypeValuesType
	 * @generated
	 */
	public Adapter createEnvEntryTypeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorCodeType
	 * @generated
	 */
	public Adapter createErrorCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType
	 * @generated
	 */
	public Adapter createErrorPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType <em>Filter Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType
	 * @generated
	 */
	public Adapter createFilterMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterNameType <em>Filter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterNameType
	 * @generated
	 */
	public Adapter createFilterNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType
	 * @generated
	 */
	public Adapter createFormLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType
	 * @generated
	 */
	public Adapter createFullyQualifiedClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanType
	 * @generated
	 */
	public Adapter createGenericBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType <em>Handler Chains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType
	 * @generated
	 */
	public Adapter createHandlerChainsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType <em>Handler Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType
	 * @generated
	 */
	public Adapter createHandlerChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType
	 * @generated
	 */
	public Adapter createHandlerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HomeType
	 * @generated
	 */
	public Adapter createHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IconType
	 * @generated
	 */
	public Adapter createIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType <em>Injection Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType
	 * @generated
	 */
	public Adapter createInjectionTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType
	 * @generated
	 */
	public Adapter createJavaIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JavaTypeType
	 * @generated
	 */
	public Adapter createJavaTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.JdbcUrlType <em>Jdbc Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JdbcUrlType
	 * @generated
	 */
	public Adapter createJdbcUrlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JndiNameType
	 * @generated
	 */
	public Adapter createJndiNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.JspConfigType <em>Jsp Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspConfigType
	 * @generated
	 */
	public Adapter createJspConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspFileType
	 * @generated
	 */
	public Adapter createJspFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType <em>Jsp Property Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType
	 * @generated
	 */
	public Adapter createJspPropertyGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType <em>Lifecycle Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType
	 * @generated
	 */
	public Adapter createLifecycleCallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ListenerType
	 * @generated
	 */
	public Adapter createListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType <em>Locale Encoding Mapping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType
	 * @generated
	 */
	public Adapter createLocaleEncodingMappingListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType <em>Locale Encoding Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType
	 * @generated
	 */
	public Adapter createLocaleEncodingMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocalHomeType
	 * @generated
	 */
	public Adapter createLocalHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocalType
	 * @generated
	 */
	public Adapter createLocalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType <em>Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType
	 * @generated
	 */
	public Adapter createLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationLinkType
	 * @generated
	 */
	public Adapter createMessageDestinationLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType
	 * @generated
	 */
	public Adapter createMessageDestinationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationTypeType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageType
	 * @generated
	 */
	public Adapter createMessageDestinationUsageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType <em>Mime Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType
	 * @generated
	 */
	public Adapter createMimeMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MimeTypeType
	 * @generated
	 */
	public Adapter createMimeTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType <em>Multipart Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType
	 * @generated
	 */
	public Adapter createMultipartConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.NonEmptyStringType <em>Non Empty String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.NonEmptyStringType
	 * @generated
	 */
	public Adapter createNonEmptyStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType <em>Ordering Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType
	 * @generated
	 */
	public Adapter createOrderingOrderingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType <em>Ordering Others Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType
	 * @generated
	 */
	public Adapter createOrderingOthersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType <em>Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingType
	 * @generated
	 */
	public Adapter createOrderingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ParamValueType
	 * @generated
	 */
	public Adapter createParamValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PathType
	 * @generated
	 */
	public Adapter createPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType <em>Persistence Context Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType
	 * @generated
	 */
	public Adapter createPersistenceContextRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeType <em>Persistence Context Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeType
	 * @generated
	 */
	public Adapter createPersistenceContextTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType <em>Persistence Unit Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType
	 * @generated
	 */
	public Adapter createPersistenceUnitRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType
	 * @generated
	 */
	public Adapter createPortComponentRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RemoteType
	 * @generated
	 */
	public Adapter createRemoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResAuthType
	 * @generated
	 */
	public Adapter createResAuthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType
	 * @generated
	 */
	public Adapter createResourceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType <em>Respect Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType
	 * @generated
	 */
	public Adapter createRespectBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeType
	 * @generated
	 */
	public Adapter createResSharingScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RoleNameType
	 * @generated
	 */
	public Adapter createRoleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RunAsType
	 * @generated
	 */
	public Adapter createRunAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType
	 * @generated
	 */
	public Adapter createSecurityConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType
	 * @generated
	 */
	public Adapter createSecurityRoleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType
	 * @generated
	 */
	public Adapter createSecurityRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType
	 * @generated
	 */
	public Adapter createServiceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType
	 * @generated
	 */
	public Adapter createServletMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletNameType <em>Servlet Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletNameType
	 * @generated
	 */
	public Adapter createServletNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType
	 * @generated
	 */
	public Adapter createServletTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType <em>Session Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType
	 * @generated
	 */
	public Adapter createSessionConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TaglibType
	 * @generated
	 */
	public Adapter createTaglibTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType <em>Tracking Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType
	 * @generated
	 */
	public Adapter createTrackingModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeType
	 * @generated
	 */
	public Adapter createTransportGuaranteeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrueFalseType
	 * @generated
	 */
	public Adapter createTrueFalseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType
	 * @generated
	 */
	public Adapter createUrlPatternTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType
	 * @generated
	 */
	public Adapter createUserDataConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.WarPathType <em>War Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WarPathType
	 * @generated
	 */
	public Adapter createWarPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType
	 * @generated
	 */
	public Adapter createWebAppTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType <em>Web Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType
	 * @generated
	 */
	public Adapter createWebFragmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType
	 * @generated
	 */
	public Adapter createWebResourceCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType
	 * @generated
	 */
	public Adapter createWelcomeFileListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType <em>Xsd Any URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType
	 * @generated
	 */
	public Adapter createXsdAnyURITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType <em>Xsd Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType
	 * @generated
	 */
	public Adapter createXsdBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType <em>Xsd Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType
	 * @generated
	 */
	public Adapter createXsdIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType <em>Xsd NMTOKEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType
	 * @generated
	 */
	public Adapter createXsdNMTOKENTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType
	 * @generated
	 */
	public Adapter createXsdNonNegativeIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType
	 * @generated
	 */
	public Adapter createXsdPositiveIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType
	 * @generated
	 */
	public Adapter createXsdQNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdStringType
	 * @generated
	 */
	public Adapter createXsdStringTypeAdapter() {
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

} //Webapp30AdapterFactory
