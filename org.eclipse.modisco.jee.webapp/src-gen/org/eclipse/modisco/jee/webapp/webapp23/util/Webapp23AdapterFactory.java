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
package org.eclipse.modisco.jee.webapp.webapp23.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.webapp.webapp23.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package
 * @generated
 */
public class Webapp23AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Webapp23Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Webapp23AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Webapp23Package.eINSTANCE;
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
	protected Webapp23Switch<Adapter> modelSwitch =
		new Webapp23Switch<Adapter>() {
			@Override
			public Adapter caseAuthConstraintType(AuthConstraintType object) {
				return createAuthConstraintTypeAdapter();
			}
			@Override
			public Adapter caseAuthMethodType(AuthMethodType object) {
				return createAuthMethodTypeAdapter();
			}
			@Override
			public Adapter caseContextParamType(ContextParamType object) {
				return createContextParamTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDisplayNameType(DisplayNameType object) {
				return createDisplayNameTypeAdapter();
			}
			@Override
			public Adapter caseDistributableType(DistributableType object) {
				return createDistributableTypeAdapter();
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
			public Adapter caseErrorCodeType(ErrorCodeType object) {
				return createErrorCodeTypeAdapter();
			}
			@Override
			public Adapter caseErrorPageType(ErrorPageType object) {
				return createErrorPageTypeAdapter();
			}
			@Override
			public Adapter caseExceptionTypeType(ExceptionTypeType object) {
				return createExceptionTypeTypeAdapter();
			}
			@Override
			public Adapter caseExtensionType(ExtensionType object) {
				return createExtensionTypeAdapter();
			}
			@Override
			public Adapter caseFilterClassType(FilterClassType object) {
				return createFilterClassTypeAdapter();
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
			public Adapter caseFormErrorPageType(FormErrorPageType object) {
				return createFormErrorPageTypeAdapter();
			}
			@Override
			public Adapter caseFormLoginConfigType(FormLoginConfigType object) {
				return createFormLoginConfigTypeAdapter();
			}
			@Override
			public Adapter caseFormLoginPageType(FormLoginPageType object) {
				return createFormLoginPageTypeAdapter();
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
			public Adapter caseInitParamType(InitParamType object) {
				return createInitParamTypeAdapter();
			}
			@Override
			public Adapter caseJspFileType(JspFileType object) {
				return createJspFileTypeAdapter();
			}
			@Override
			public Adapter caseLargeIconType(LargeIconType object) {
				return createLargeIconTypeAdapter();
			}
			@Override
			public Adapter caseListenerClass(ListenerClass object) {
				return createListenerClassAdapter();
			}
			@Override
			public Adapter caseListenerClassType(ListenerClassType object) {
				return createListenerClassTypeAdapter();
			}
			@Override
			public Adapter caseListenerType(ListenerType object) {
				return createListenerTypeAdapter();
			}
			@Override
			public Adapter caseLoadOnStartupType(LoadOnStartupType object) {
				return createLoadOnStartupTypeAdapter();
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
			public Adapter caseLocationType(LocationType object) {
				return createLocationTypeAdapter();
			}
			@Override
			public Adapter caseLoginConfigType(LoginConfigType object) {
				return createLoginConfigTypeAdapter();
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
			public Adapter caseParamNameType(ParamNameType object) {
				return createParamNameTypeAdapter();
			}
			@Override
			public Adapter caseParamValueType(ParamValueType object) {
				return createParamValueTypeAdapter();
			}
			@Override
			public Adapter caseRealmNameType(RealmNameType object) {
				return createRealmNameTypeAdapter();
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
			public Adapter caseServletClassType(ServletClassType object) {
				return createServletClassTypeAdapter();
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
			public Adapter caseSessionTimeoutType(SessionTimeoutType object) {
				return createSessionTimeoutTypeAdapter();
			}
			@Override
			public Adapter caseSmallIconType(SmallIconType object) {
				return createSmallIconTypeAdapter();
			}
			@Override
			public Adapter caseTaglibLocationType(TaglibLocationType object) {
				return createTaglibLocationTypeAdapter();
			}
			@Override
			public Adapter caseTaglibType(TaglibType object) {
				return createTaglibTypeAdapter();
			}
			@Override
			public Adapter caseTaglibUriType(TaglibUriType object) {
				return createTaglibUriTypeAdapter();
			}
			@Override
			public Adapter caseTransportGuaranteeType(TransportGuaranteeType object) {
				return createTransportGuaranteeTypeAdapter();
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
			public Adapter caseWebAppType(WebAppType object) {
				return createWebAppTypeAdapter();
			}
			@Override
			public Adapter caseWebResourceCollectionType(WebResourceCollectionType object) {
				return createWebResourceCollectionTypeAdapter();
			}
			@Override
			public Adapter caseWebResourceNameType(WebResourceNameType object) {
				return createWebResourceNameTypeAdapter();
			}
			@Override
			public Adapter caseWelcomeFileListType(WelcomeFileListType object) {
				return createWelcomeFileListTypeAdapter();
			}
			@Override
			public Adapter caseWelcomeFileType(WelcomeFileType object) {
				return createWelcomeFileTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType
	 * @generated
	 */
	public Adapter createAuthConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType <em>Auth Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType
	 * @generated
	 */
	public Adapter createAuthMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ContextParamType <em>Context Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ContextParamType
	 * @generated
	 */
	public Adapter createContextParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType
	 * @generated
	 */
	public Adapter createDisplayNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.DistributableType <em>Distributable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DistributableType
	 * @generated
	 */
	public Adapter createDistributableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType
	 * @generated
	 */
	public Adapter createEjbLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType
	 * @generated
	 */
	public Adapter createEjbLocalRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType
	 * @generated
	 */
	public Adapter createEjbRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType
	 * @generated
	 */
	public Adapter createEjbRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType
	 * @generated
	 */
	public Adapter createEjbRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType <em>Env Entry Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType
	 * @generated
	 */
	public Adapter createEnvEntryNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType
	 * @generated
	 */
	public Adapter createEnvEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType <em>Env Entry Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType
	 * @generated
	 */
	public Adapter createEnvEntryTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType <em>Env Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType
	 * @generated
	 */
	public Adapter createEnvEntryValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType
	 * @generated
	 */
	public Adapter createErrorCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType
	 * @generated
	 */
	public Adapter createErrorPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType <em>Exception Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType
	 * @generated
	 */
	public Adapter createExceptionTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExtensionType
	 * @generated
	 */
	public Adapter createExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterClassType <em>Filter Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterClassType
	 * @generated
	 */
	public Adapter createFilterClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType <em>Filter Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType
	 * @generated
	 */
	public Adapter createFilterMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterNameType <em>Filter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterNameType
	 * @generated
	 */
	public Adapter createFilterNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType <em>Form Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType
	 * @generated
	 */
	public Adapter createFormErrorPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType
	 * @generated
	 */
	public Adapter createFormLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType <em>Form Login Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType
	 * @generated
	 */
	public Adapter createFormLoginPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HomeType
	 * @generated
	 */
	public Adapter createHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType <em>Http Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType
	 * @generated
	 */
	public Adapter createHttpMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.IconType
	 * @generated
	 */
	public Adapter createIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType <em>Init Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.InitParamType
	 * @generated
	 */
	public Adapter createInitParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.JspFileType
	 * @generated
	 */
	public Adapter createJspFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.LargeIconType <em>Large Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LargeIconType
	 * @generated
	 */
	public Adapter createLargeIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerClass
	 * @generated
	 */
	public Adapter createListenerClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType <em>Listener Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType
	 * @generated
	 */
	public Adapter createListenerClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerType
	 * @generated
	 */
	public Adapter createListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType <em>Load On Startup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType
	 * @generated
	 */
	public Adapter createLoadOnStartupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType
	 * @generated
	 */
	public Adapter createLocalHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalType
	 * @generated
	 */
	public Adapter createLocalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocationType
	 * @generated
	 */
	public Adapter createLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType <em>Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType
	 * @generated
	 */
	public Adapter createLoginConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType <em>Mime Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType
	 * @generated
	 */
	public Adapter createMimeMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType
	 * @generated
	 */
	public Adapter createMimeTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamNameType <em>Param Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamNameType
	 * @generated
	 */
	public Adapter createParamNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamValueType
	 * @generated
	 */
	public Adapter createParamValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.RealmNameType <em>Realm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RealmNameType
	 * @generated
	 */
	public Adapter createRealmNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RemoteType
	 * @generated
	 */
	public Adapter createRemoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResAuthType
	 * @generated
	 */
	public Adapter createResAuthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType <em>Resource Env Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType
	 * @generated
	 */
	public Adapter createResourceEnvRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType <em>Resource Env Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType
	 * @generated
	 */
	public Adapter createResourceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType <em>Res Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType
	 * @generated
	 */
	public Adapter createResRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType
	 * @generated
	 */
	public Adapter createResSharingScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResTypeType <em>Res Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResTypeType
	 * @generated
	 */
	public Adapter createResTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType <em>Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType
	 * @generated
	 */
	public Adapter createRoleLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleNameType
	 * @generated
	 */
	public Adapter createRoleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RunAsType
	 * @generated
	 */
	public Adapter createRunAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType
	 * @generated
	 */
	public Adapter createSecurityConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType
	 * @generated
	 */
	public Adapter createSecurityRoleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType
	 * @generated
	 */
	public Adapter createSecurityRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletClassType <em>Servlet Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletClassType
	 * @generated
	 */
	public Adapter createServletClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType
	 * @generated
	 */
	public Adapter createServletMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletNameType <em>Servlet Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletNameType
	 * @generated
	 */
	public Adapter createServletNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType
	 * @generated
	 */
	public Adapter createServletTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType <em>Session Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType
	 * @generated
	 */
	public Adapter createSessionConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType <em>Session Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType
	 * @generated
	 */
	public Adapter createSessionTimeoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.SmallIconType <em>Small Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SmallIconType
	 * @generated
	 */
	public Adapter createSmallIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType <em>Taglib Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType
	 * @generated
	 */
	public Adapter createTaglibLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibType
	 * @generated
	 */
	public Adapter createTaglibTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType <em>Taglib Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType
	 * @generated
	 */
	public Adapter createTaglibUriTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType
	 * @generated
	 */
	public Adapter createTransportGuaranteeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType
	 * @generated
	 */
	public Adapter createUrlPatternTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType
	 * @generated
	 */
	public Adapter createUserDataConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType
	 * @generated
	 */
	public Adapter createWebAppTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType
	 * @generated
	 */
	public Adapter createWebResourceCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType <em>Web Resource Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType
	 * @generated
	 */
	public Adapter createWebResourceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType
	 * @generated
	 */
	public Adapter createWelcomeFileListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType <em>Welcome File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType
	 * @generated
	 */
	public Adapter createWelcomeFileTypeAdapter() {
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

} //Webapp23AdapterFactory
