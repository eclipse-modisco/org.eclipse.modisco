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
package org.eclipse.modisco.jee.webapp.webapp25.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.webapp.webapp25.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp25.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp25.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp25.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp25.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp25.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp25.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp25.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp25.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp25.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterType;
import org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp25.GenericBooleanType;
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
import org.eclipse.modisco.jee.webapp.webapp25.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.NonEmptyStringType;
import org.eclipse.modisco.jee.webapp.webapp25.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp25.PathType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceUnitRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PropertyType;
import org.eclipse.modisco.jee.webapp.webapp25.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp25.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp25.ResSharingScopeType;
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
import org.eclipse.modisco.jee.webapp.webapp25.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp25.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp25.WebResourceCollectionType;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package
 * @generated
 */
public class Webapp25AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Webapp25Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp25AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Webapp25Package.eINSTANCE;
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
	protected Webapp25Switch<Adapter> modelSwitch =
		new Webapp25Switch<Adapter>() {
			@Override
			public Adapter caseAuthConstraintType(AuthConstraintType object) {
				return createAuthConstraintTypeAdapter();
			}
			@Override
			public Adapter caseAuthMethodType(AuthMethodType object) {
				return createAuthMethodTypeAdapter();
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
			public Adapter caseNonEmptyStringType(NonEmptyStringType object) {
				return createNonEmptyStringTypeAdapter();
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
			public Adapter caseServiceRefHandlerChainsType(ServiceRefHandlerChainsType object) {
				return createServiceRefHandlerChainsTypeAdapter();
			}
			@Override
			public Adapter caseServiceRefHandlerChainType(ServiceRefHandlerChainType object) {
				return createServiceRefHandlerChainTypeAdapter();
			}
			@Override
			public Adapter caseServiceRefHandlerType(ServiceRefHandlerType object) {
				return createServiceRefHandlerTypeAdapter();
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
			public Adapter caseString(org.eclipse.modisco.jee.webapp.webapp25.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseTaglibType(TaglibType object) {
				return createTaglibTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.AuthConstraintType
	 * @generated
	 */
	public Adapter createAuthConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.AuthMethodType <em>Auth Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.AuthMethodType
	 * @generated
	 */
	public Adapter createAuthMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.DispatcherType <em>Dispatcher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.DispatcherType
	 * @generated
	 */
	public Adapter createDispatcherTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.DisplayNameType
	 * @generated
	 */
	public Adapter createDisplayNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EjbLinkType
	 * @generated
	 */
	public Adapter createEjbLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EjbLocalRefType
	 * @generated
	 */
	public Adapter createEjbLocalRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EjbRefNameType
	 * @generated
	 */
	public Adapter createEjbRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EjbRefType
	 * @generated
	 */
	public Adapter createEjbRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EjbRefTypeType
	 * @generated
	 */
	public Adapter createEjbRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EmptyType
	 * @generated
	 */
	public Adapter createEmptyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType
	 * @generated
	 */
	public Adapter createEnvEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.EnvEntryTypeValuesType
	 * @generated
	 */
	public Adapter createEnvEntryTypeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ErrorCodeType
	 * @generated
	 */
	public Adapter createErrorCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ErrorPageType
	 * @generated
	 */
	public Adapter createErrorPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType <em>Filter Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType
	 * @generated
	 */
	public Adapter createFilterMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.FilterNameType <em>Filter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.FilterNameType
	 * @generated
	 */
	public Adapter createFilterNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.FormLoginConfigType
	 * @generated
	 */
	public Adapter createFormLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType
	 * @generated
	 */
	public Adapter createFullyQualifiedClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.GenericBooleanType
	 * @generated
	 */
	public Adapter createGenericBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.HomeType
	 * @generated
	 */
	public Adapter createHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.IconType
	 * @generated
	 */
	public Adapter createIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType <em>Injection Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType
	 * @generated
	 */
	public Adapter createInjectionTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.JavaIdentifierType
	 * @generated
	 */
	public Adapter createJavaIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.JavaTypeType
	 * @generated
	 */
	public Adapter createJavaTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.JndiNameType
	 * @generated
	 */
	public Adapter createJndiNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.JspConfigType <em>Jsp Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.JspConfigType
	 * @generated
	 */
	public Adapter createJspConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.JspFileType
	 * @generated
	 */
	public Adapter createJspFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType <em>Jsp Property Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType
	 * @generated
	 */
	public Adapter createJspPropertyGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.LifecycleCallbackType <em>Lifecycle Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.LifecycleCallbackType
	 * @generated
	 */
	public Adapter createLifecycleCallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ListenerType
	 * @generated
	 */
	public Adapter createListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingListType <em>Locale Encoding Mapping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingListType
	 * @generated
	 */
	public Adapter createLocaleEncodingMappingListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType <em>Locale Encoding Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.LocaleEncodingMappingType
	 * @generated
	 */
	public Adapter createLocaleEncodingMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.LocalHomeType
	 * @generated
	 */
	public Adapter createLocalHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.LocalType
	 * @generated
	 */
	public Adapter createLocalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.LoginConfigType <em>Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.LoginConfigType
	 * @generated
	 */
	public Adapter createLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationLinkType
	 * @generated
	 */
	public Adapter createMessageDestinationLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationRefType
	 * @generated
	 */
	public Adapter createMessageDestinationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationTypeType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.MessageDestinationUsageType
	 * @generated
	 */
	public Adapter createMessageDestinationUsageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.MimeMappingType <em>Mime Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.MimeMappingType
	 * @generated
	 */
	public Adapter createMimeMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.MimeTypeType
	 * @generated
	 */
	public Adapter createMimeTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.NonEmptyStringType <em>Non Empty String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.NonEmptyStringType
	 * @generated
	 */
	public Adapter createNonEmptyStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ParamValueType
	 * @generated
	 */
	public Adapter createParamValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.PathType
	 * @generated
	 */
	public Adapter createPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextRefType <em>Persistence Context Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextRefType
	 * @generated
	 */
	public Adapter createPersistenceContextRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeType <em>Persistence Context Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeType
	 * @generated
	 */
	public Adapter createPersistenceContextTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.PersistenceUnitRefType <em>Persistence Unit Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.PersistenceUnitRefType
	 * @generated
	 */
	public Adapter createPersistenceUnitRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.PortComponentRefType
	 * @generated
	 */
	public Adapter createPortComponentRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.RemoteType
	 * @generated
	 */
	public Adapter createRemoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ResAuthType
	 * @generated
	 */
	public Adapter createResAuthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ResourceEnvRefType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType
	 * @generated
	 */
	public Adapter createResourceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ResSharingScopeType
	 * @generated
	 */
	public Adapter createResSharingScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.RoleNameType
	 * @generated
	 */
	public Adapter createRoleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.RunAsType
	 * @generated
	 */
	public Adapter createRunAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.SecurityConstraintType
	 * @generated
	 */
	public Adapter createSecurityConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleRefType
	 * @generated
	 */
	public Adapter createSecurityRoleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleType
	 * @generated
	 */
	public Adapter createSecurityRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainsType <em>Service Ref Handler Chains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainsType
	 * @generated
	 */
	public Adapter createServiceRefHandlerChainsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainType <em>Service Ref Handler Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainType
	 * @generated
	 */
	public Adapter createServiceRefHandlerChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerType <em>Service Ref Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerType
	 * @generated
	 */
	public Adapter createServiceRefHandlerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ServiceRefType
	 * @generated
	 */
	public Adapter createServiceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ServletMappingType
	 * @generated
	 */
	public Adapter createServletMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ServletNameType <em>Servlet Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ServletNameType
	 * @generated
	 */
	public Adapter createServletNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.ServletType
	 * @generated
	 */
	public Adapter createServletTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.SessionConfigType <em>Session Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.SessionConfigType
	 * @generated
	 */
	public Adapter createSessionConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.TaglibType
	 * @generated
	 */
	public Adapter createTaglibTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.TransportGuaranteeType
	 * @generated
	 */
	public Adapter createTransportGuaranteeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.TrueFalseType
	 * @generated
	 */
	public Adapter createTrueFalseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType
	 * @generated
	 */
	public Adapter createUrlPatternTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType
	 * @generated
	 */
	public Adapter createUserDataConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.WarPathType <em>War Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.WarPathType
	 * @generated
	 */
	public Adapter createWarPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.WebAppType
	 * @generated
	 */
	public Adapter createWebAppTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.WebResourceCollectionType
	 * @generated
	 */
	public Adapter createWebResourceCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.WelcomeFileListType
	 * @generated
	 */
	public Adapter createWelcomeFileListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdAnyURIType <em>Xsd Any URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdAnyURIType
	 * @generated
	 */
	public Adapter createXsdAnyURITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdBooleanType <em>Xsd Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdBooleanType
	 * @generated
	 */
	public Adapter createXsdBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdIntegerType <em>Xsd Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdIntegerType
	 * @generated
	 */
	public Adapter createXsdIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdNMTOKENType <em>Xsd NMTOKEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdNMTOKENType
	 * @generated
	 */
	public Adapter createXsdNMTOKENTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdNonNegativeIntegerType
	 * @generated
	 */
	public Adapter createXsdNonNegativeIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdPositiveIntegerType
	 * @generated
	 */
	public Adapter createXsdPositiveIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdQNameType
	 * @generated
	 */
	public Adapter createXsdQNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp25.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.XsdStringType
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

} //Webapp25AdapterFactory
