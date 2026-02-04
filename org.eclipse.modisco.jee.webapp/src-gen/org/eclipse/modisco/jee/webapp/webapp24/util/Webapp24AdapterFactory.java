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
package org.eclipse.modisco.jee.webapp.webapp24.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp24.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp24.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp24.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.EmptyType;
import org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp24.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterType;
import org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanType;
import org.eclipse.modisco.jee.webapp.webapp24.HomeType;
import org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType;
import org.eclipse.modisco.jee.webapp.webapp24.IconType;
import org.eclipse.modisco.jee.webapp.webapp24.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp24.JavaTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp24.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp24.ListenerType;
import org.eclipse.modisco.jee.webapp.webapp24.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp24.LocalType;
import org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType;
import org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationLinkType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageType;
import org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.MimeTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.NonEmptyStringType;
import org.eclipse.modisco.jee.webapp.webapp24.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp24.PathType;
import org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType;
import org.eclipse.modisco.jee.webapp.webapp24.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp24.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.RoleNameType;
import org.eclipse.modisco.jee.webapp.webapp24.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType;
import org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType;
import org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletType;
import org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp24.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp24.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp24.WebAppType;
import org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;
import org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType;
import org.eclipse.modisco.jee.webapp.webapp24.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package
 * @generated
 */
public class Webapp24AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Webapp24Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp24AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Webapp24Package.eINSTANCE;
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
	protected Webapp24Switch<Adapter> modelSwitch =
		new Webapp24Switch<Adapter>() {
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
			public Adapter caseHttpMethodType(HttpMethodType object) {
				return createHttpMethodTypeAdapter();
			}
			@Override
			public Adapter caseIconType(IconType object) {
				return createIconTypeAdapter();
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
			public Adapter casePortComponentRefType(PortComponentRefType object) {
				return createPortComponentRefTypeAdapter();
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
			public Adapter caseString(org.eclipse.modisco.jee.webapp.webapp24.String object) {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType
	 * @generated
	 */
	public Adapter createAuthConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.AuthMethodType <em>Auth Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.AuthMethodType
	 * @generated
	 */
	public Adapter createAuthMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.DispatcherType <em>Dispatcher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherType
	 * @generated
	 */
	public Adapter createDispatcherTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType
	 * @generated
	 */
	public Adapter createDisplayNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLinkType
	 * @generated
	 */
	public Adapter createEjbLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType
	 * @generated
	 */
	public Adapter createEjbLocalRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefNameType
	 * @generated
	 */
	public Adapter createEjbRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType
	 * @generated
	 */
	public Adapter createEjbRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeType
	 * @generated
	 */
	public Adapter createEjbRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EmptyType
	 * @generated
	 */
	public Adapter createEmptyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType
	 * @generated
	 */
	public Adapter createEnvEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesType
	 * @generated
	 */
	public Adapter createEnvEntryTypeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorCodeType
	 * @generated
	 */
	public Adapter createErrorCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType
	 * @generated
	 */
	public Adapter createErrorPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType <em>Filter Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType
	 * @generated
	 */
	public Adapter createFilterMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterNameType <em>Filter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterNameType
	 * @generated
	 */
	public Adapter createFilterNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType
	 * @generated
	 */
	public Adapter createFormLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType
	 * @generated
	 */
	public Adapter createFullyQualifiedClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanType
	 * @generated
	 */
	public Adapter createGenericBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HomeType
	 * @generated
	 */
	public Adapter createHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType <em>Http Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType
	 * @generated
	 */
	public Adapter createHttpMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.IconType
	 * @generated
	 */
	public Adapter createIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JavaIdentifierType
	 * @generated
	 */
	public Adapter createJavaIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JavaTypeType
	 * @generated
	 */
	public Adapter createJavaTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JndiNameType
	 * @generated
	 */
	public Adapter createJndiNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType <em>Jsp Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspConfigType
	 * @generated
	 */
	public Adapter createJspConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspFileType
	 * @generated
	 */
	public Adapter createJspFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType <em>Jsp Property Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType
	 * @generated
	 */
	public Adapter createJspPropertyGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ListenerType
	 * @generated
	 */
	public Adapter createListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType <em>Locale Encoding Mapping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType
	 * @generated
	 */
	public Adapter createLocaleEncodingMappingListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType <em>Locale Encoding Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType
	 * @generated
	 */
	public Adapter createLocaleEncodingMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocalHomeType
	 * @generated
	 */
	public Adapter createLocalHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocalType
	 * @generated
	 */
	public Adapter createLocalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType <em>Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType
	 * @generated
	 */
	public Adapter createLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationLinkType
	 * @generated
	 */
	public Adapter createMessageDestinationLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType
	 * @generated
	 */
	public Adapter createMessageDestinationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationTypeType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageType
	 * @generated
	 */
	public Adapter createMessageDestinationUsageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType <em>Mime Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType
	 * @generated
	 */
	public Adapter createMimeMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MimeTypeType
	 * @generated
	 */
	public Adapter createMimeTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.NonEmptyStringType <em>Non Empty String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.NonEmptyStringType
	 * @generated
	 */
	public Adapter createNonEmptyStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ParamValueType
	 * @generated
	 */
	public Adapter createParamValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.PathType
	 * @generated
	 */
	public Adapter createPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType
	 * @generated
	 */
	public Adapter createPortComponentRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RemoteType
	 * @generated
	 */
	public Adapter createRemoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthType
	 * @generated
	 */
	public Adapter createResAuthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType
	 * @generated
	 */
	public Adapter createResourceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeType
	 * @generated
	 */
	public Adapter createResSharingScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RoleNameType
	 * @generated
	 */
	public Adapter createRoleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RunAsType
	 * @generated
	 */
	public Adapter createRunAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType
	 * @generated
	 */
	public Adapter createSecurityConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType
	 * @generated
	 */
	public Adapter createSecurityRoleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType
	 * @generated
	 */
	public Adapter createSecurityRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType <em>Service Ref Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType
	 * @generated
	 */
	public Adapter createServiceRefHandlerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType
	 * @generated
	 */
	public Adapter createServiceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType
	 * @generated
	 */
	public Adapter createServletMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletNameType <em>Servlet Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletNameType
	 * @generated
	 */
	public Adapter createServletNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType
	 * @generated
	 */
	public Adapter createServletTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType <em>Session Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType
	 * @generated
	 */
	public Adapter createSessionConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TaglibType
	 * @generated
	 */
	public Adapter createTaglibTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeType
	 * @generated
	 */
	public Adapter createTransportGuaranteeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TrueFalseType
	 * @generated
	 */
	public Adapter createTrueFalseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType
	 * @generated
	 */
	public Adapter createUrlPatternTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType
	 * @generated
	 */
	public Adapter createUserDataConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.WarPathType <em>War Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WarPathType
	 * @generated
	 */
	public Adapter createWarPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType
	 * @generated
	 */
	public Adapter createWebAppTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType
	 * @generated
	 */
	public Adapter createWebResourceCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType
	 * @generated
	 */
	public Adapter createWelcomeFileListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType <em>Xsd Any URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType
	 * @generated
	 */
	public Adapter createXsdAnyURITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType <em>Xsd Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType
	 * @generated
	 */
	public Adapter createXsdBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType <em>Xsd Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType
	 * @generated
	 */
	public Adapter createXsdIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType <em>Xsd NMTOKEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType
	 * @generated
	 */
	public Adapter createXsdNMTOKENTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType
	 * @generated
	 */
	public Adapter createXsdNonNegativeIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType
	 * @generated
	 */
	public Adapter createXsdPositiveIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType
	 * @generated
	 */
	public Adapter createXsdQNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdStringType
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

} //Webapp24AdapterFactory
