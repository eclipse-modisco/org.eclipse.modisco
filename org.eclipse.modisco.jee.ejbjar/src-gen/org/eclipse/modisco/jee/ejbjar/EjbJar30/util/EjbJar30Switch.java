/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaIdentifierType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package
 * @generated
 */
public class EjbJar30Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EjbJar30Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar30Switch() {
		if (modelPackage == null) {
			modelPackage = EjbJar30Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EjbJar30Package.ACTIVATION_CONFIG_PROPERTY_TYPE: {
				ActivationConfigPropertyType activationConfigPropertyType = (ActivationConfigPropertyType)theEObject;
				T result = caseActivationConfigPropertyType(activationConfigPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ACTIVATION_CONFIG_TYPE: {
				ActivationConfigType activationConfigType = (ActivationConfigType)theEObject;
				T result = caseActivationConfigType(activationConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.APPLICATION_EXCEPTION_TYPE: {
				ApplicationExceptionType applicationExceptionType = (ApplicationExceptionType)theEObject;
				T result = caseApplicationExceptionType(applicationExceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.AROUND_INVOKE_TYPE: {
				AroundInvokeType aroundInvokeType = (AroundInvokeType)theEObject;
				T result = caseAroundInvokeType(aroundInvokeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE: {
				AssemblyDescriptorType assemblyDescriptorType = (AssemblyDescriptorType)theEObject;
				T result = caseAssemblyDescriptorType(assemblyDescriptorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.CMP_FIELD_TYPE: {
				CmpFieldType cmpFieldType = (CmpFieldType)theEObject;
				T result = caseCmpFieldType(cmpFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.CMP_VERSION_TYPE: {
				CmpVersionType cmpVersionType = (CmpVersionType)theEObject;
				T result = caseCmpVersionType(cmpVersionType);
				if (result == null) result = caseString(cmpVersionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.CMR_FIELD_TYPE: {
				CmrFieldType cmrFieldType = (CmrFieldType)theEObject;
				T result = caseCmrFieldType(cmrFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.CMR_FIELD_TYPE_TYPE: {
				CmrFieldTypeType cmrFieldTypeType = (CmrFieldTypeType)theEObject;
				T result = caseCmrFieldTypeType(cmrFieldTypeType);
				if (result == null) result = caseString(cmrFieldTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.CONTAINER_TRANSACTION_TYPE: {
				ContainerTransactionType containerTransactionType = (ContainerTransactionType)theEObject;
				T result = caseContainerTransactionType(containerTransactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = caseXsdStringType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.DISPLAY_NAME_TYPE: {
				DisplayNameType displayNameType = (DisplayNameType)theEObject;
				T result = caseDisplayNameType(displayNameType);
				if (result == null) result = caseString(displayNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_CLASS_TYPE: {
				EjbClassType ejbClassType = (EjbClassType)theEObject;
				T result = caseEjbClassType(ejbClassType);
				if (result == null) result = caseFullyQualifiedClassType(ejbClassType);
				if (result == null) result = caseString(ejbClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_JAR_TYPE: {
				EjbJarType ejbJarType = (EjbJarType)theEObject;
				T result = caseEjbJarType(ejbJarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_LINK_TYPE: {
				EjbLinkType ejbLinkType = (EjbLinkType)theEObject;
				T result = caseEjbLinkType(ejbLinkType);
				if (result == null) result = caseString(ejbLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_LOCAL_REF_TYPE: {
				EjbLocalRefType ejbLocalRefType = (EjbLocalRefType)theEObject;
				T result = caseEjbLocalRefType(ejbLocalRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_NAME_TYPE: {
				EjbNameType ejbNameType = (EjbNameType)theEObject;
				T result = caseEjbNameType(ejbNameType);
				if (result == null) result = caseXsdNMTOKENType(ejbNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_REF_NAME_TYPE: {
				EjbRefNameType ejbRefNameType = (EjbRefNameType)theEObject;
				T result = caseEjbRefNameType(ejbRefNameType);
				if (result == null) result = caseJndiNameType(ejbRefNameType);
				if (result == null) result = caseString(ejbRefNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_REF_TYPE: {
				EjbRefType ejbRefType = (EjbRefType)theEObject;
				T result = caseEjbRefType(ejbRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_REF_TYPE_TYPE: {
				EjbRefTypeType ejbRefTypeType = (EjbRefTypeType)theEObject;
				T result = caseEjbRefTypeType(ejbRefTypeType);
				if (result == null) result = caseString(ejbRefTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_RELATIONSHIP_ROLE_TYPE: {
				EjbRelationshipRoleType ejbRelationshipRoleType = (EjbRelationshipRoleType)theEObject;
				T result = caseEjbRelationshipRoleType(ejbRelationshipRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EJB_RELATION_TYPE: {
				EjbRelationType ejbRelationType = (EjbRelationType)theEObject;
				T result = caseEjbRelationType(ejbRelationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EMPTY_TYPE: {
				EmptyType emptyType = (EmptyType)theEObject;
				T result = caseEmptyType(emptyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ENTERPRISE_BEANS_TYPE: {
				EnterpriseBeansType enterpriseBeansType = (EnterpriseBeansType)theEObject;
				T result = caseEnterpriseBeansType(enterpriseBeansType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ENTITY_BEAN_TYPE: {
				EntityBeanType entityBeanType = (EntityBeanType)theEObject;
				T result = caseEntityBeanType(entityBeanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ENV_ENTRY_TYPE: {
				EnvEntryType envEntryType = (EnvEntryType)theEObject;
				T result = caseEnvEntryType(envEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ENV_ENTRY_TYPE_VALUES_TYPE: {
				EnvEntryTypeValuesType envEntryTypeValuesType = (EnvEntryTypeValuesType)theEObject;
				T result = caseEnvEntryTypeValuesType(envEntryTypeValuesType);
				if (result == null) result = caseString(envEntryTypeValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.EXCLUDE_LIST_TYPE: {
				ExcludeListType excludeListType = (ExcludeListType)theEObject;
				T result = caseExcludeListType(excludeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.FULLY_QUALIFIED_CLASS_TYPE: {
				FullyQualifiedClassType fullyQualifiedClassType = (FullyQualifiedClassType)theEObject;
				T result = caseFullyQualifiedClassType(fullyQualifiedClassType);
				if (result == null) result = caseString(fullyQualifiedClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.GENERIC_BOOLEAN_TYPE: {
				GenericBooleanType genericBooleanType = (GenericBooleanType)theEObject;
				T result = caseGenericBooleanType(genericBooleanType);
				if (result == null) result = caseString(genericBooleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.HOME_TYPE: {
				HomeType homeType = (HomeType)theEObject;
				T result = caseHomeType(homeType);
				if (result == null) result = caseFullyQualifiedClassType(homeType);
				if (result == null) result = caseString(homeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ICON_TYPE: {
				IconType iconType = (IconType)theEObject;
				T result = caseIconType(iconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.INIT_METHOD_TYPE: {
				InitMethodType initMethodType = (InitMethodType)theEObject;
				T result = caseInitMethodType(initMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.INJECTION_TARGET_TYPE: {
				InjectionTargetType injectionTargetType = (InjectionTargetType)theEObject;
				T result = caseInjectionTargetType(injectionTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.INTERCEPTOR_BINDING_TYPE: {
				InterceptorBindingType interceptorBindingType = (InterceptorBindingType)theEObject;
				T result = caseInterceptorBindingType(interceptorBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.INTERCEPTOR_ORDER_TYPE: {
				InterceptorOrderType interceptorOrderType = (InterceptorOrderType)theEObject;
				T result = caseInterceptorOrderType(interceptorOrderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.INTERCEPTORS_TYPE: {
				InterceptorsType interceptorsType = (InterceptorsType)theEObject;
				T result = caseInterceptorsType(interceptorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.INTERCEPTOR_TYPE: {
				InterceptorType interceptorType = (InterceptorType)theEObject;
				T result = caseInterceptorType(interceptorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.JAVA_IDENTIFIER_TYPE: {
				JavaIdentifierType javaIdentifierType = (JavaIdentifierType)theEObject;
				T result = caseJavaIdentifierType(javaIdentifierType);
				if (result == null) result = caseString(javaIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.JAVA_TYPE_TYPE: {
				JavaTypeType javaTypeType = (JavaTypeType)theEObject;
				T result = caseJavaTypeType(javaTypeType);
				if (result == null) result = caseString(javaTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.JNDI_NAME_TYPE: {
				JndiNameType jndiNameType = (JndiNameType)theEObject;
				T result = caseJndiNameType(jndiNameType);
				if (result == null) result = caseString(jndiNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.LIFECYCLE_CALLBACK_TYPE: {
				LifecycleCallbackType lifecycleCallbackType = (LifecycleCallbackType)theEObject;
				T result = caseLifecycleCallbackType(lifecycleCallbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.LISTENER_TYPE: {
				ListenerType listenerType = (ListenerType)theEObject;
				T result = caseListenerType(listenerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.LOCAL_HOME_TYPE: {
				LocalHomeType localHomeType = (LocalHomeType)theEObject;
				T result = caseLocalHomeType(localHomeType);
				if (result == null) result = caseFullyQualifiedClassType(localHomeType);
				if (result == null) result = caseString(localHomeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.LOCAL_TYPE: {
				LocalType localType = (LocalType)theEObject;
				T result = caseLocalType(localType);
				if (result == null) result = caseFullyQualifiedClassType(localType);
				if (result == null) result = caseString(localType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.MESSAGE_DESTINATION_LINK_TYPE: {
				MessageDestinationLinkType messageDestinationLinkType = (MessageDestinationLinkType)theEObject;
				T result = caseMessageDestinationLinkType(messageDestinationLinkType);
				if (result == null) result = caseString(messageDestinationLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE: {
				MessageDestinationRefType messageDestinationRefType = (MessageDestinationRefType)theEObject;
				T result = caseMessageDestinationRefType(messageDestinationRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE: {
				MessageDestinationType messageDestinationType = (MessageDestinationType)theEObject;
				T result = caseMessageDestinationType(messageDestinationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.MESSAGE_DESTINATION_TYPE_TYPE: {
				MessageDestinationTypeType messageDestinationTypeType = (MessageDestinationTypeType)theEObject;
				T result = caseMessageDestinationTypeType(messageDestinationTypeType);
				if (result == null) result = caseFullyQualifiedClassType(messageDestinationTypeType);
				if (result == null) result = caseString(messageDestinationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.MESSAGE_DESTINATION_USAGE_TYPE: {
				MessageDestinationUsageType messageDestinationUsageType = (MessageDestinationUsageType)theEObject;
				T result = caseMessageDestinationUsageType(messageDestinationUsageType);
				if (result == null) result = caseString(messageDestinationUsageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.MESSAGE_DRIVEN_BEAN_TYPE: {
				MessageDrivenBeanType messageDrivenBeanType = (MessageDrivenBeanType)theEObject;
				T result = caseMessageDrivenBeanType(messageDrivenBeanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.METHOD_INTF_TYPE: {
				MethodIntfType methodIntfType = (MethodIntfType)theEObject;
				T result = caseMethodIntfType(methodIntfType);
				if (result == null) result = caseString(methodIntfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.METHOD_NAME_TYPE: {
				MethodNameType methodNameType = (MethodNameType)theEObject;
				T result = caseMethodNameType(methodNameType);
				if (result == null) result = caseString(methodNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.METHOD_PARAMS_TYPE: {
				MethodParamsType methodParamsType = (MethodParamsType)theEObject;
				T result = caseMethodParamsType(methodParamsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.METHOD_PERMISSION_TYPE: {
				MethodPermissionType methodPermissionType = (MethodPermissionType)theEObject;
				T result = caseMethodPermissionType(methodPermissionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.METHOD_TYPE: {
				MethodType methodType = (MethodType)theEObject;
				T result = caseMethodType(methodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.MULTIPLICITY_TYPE: {
				MultiplicityType multiplicityType = (MultiplicityType)theEObject;
				T result = caseMultiplicityType(multiplicityType);
				if (result == null) result = caseString(multiplicityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.NAMED_METHOD_TYPE: {
				NamedMethodType namedMethodType = (NamedMethodType)theEObject;
				T result = caseNamedMethodType(namedMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PARAM_VALUE_TYPE: {
				ParamValueType paramValueType = (ParamValueType)theEObject;
				T result = caseParamValueType(paramValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PATH_TYPE: {
				PathType pathType = (PathType)theEObject;
				T result = casePathType(pathType);
				if (result == null) result = caseString(pathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PERSISTENCE_CONTEXT_REF_TYPE: {
				PersistenceContextRefType persistenceContextRefType = (PersistenceContextRefType)theEObject;
				T result = casePersistenceContextRefType(persistenceContextRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PERSISTENCE_CONTEXT_TYPE_TYPE: {
				PersistenceContextTypeType persistenceContextTypeType = (PersistenceContextTypeType)theEObject;
				T result = casePersistenceContextTypeType(persistenceContextTypeType);
				if (result == null) result = caseString(persistenceContextTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PERSISTENCE_TYPE_TYPE: {
				PersistenceTypeType persistenceTypeType = (PersistenceTypeType)theEObject;
				T result = casePersistenceTypeType(persistenceTypeType);
				if (result == null) result = caseString(persistenceTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PERSISTENCE_UNIT_REF_TYPE: {
				PersistenceUnitRefType persistenceUnitRefType = (PersistenceUnitRefType)theEObject;
				T result = casePersistenceUnitRefType(persistenceUnitRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PORT_COMPONENT_REF_TYPE: {
				PortComponentRefType portComponentRefType = (PortComponentRefType)theEObject;
				T result = casePortComponentRefType(portComponentRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.QUERY_METHOD_TYPE: {
				QueryMethodType queryMethodType = (QueryMethodType)theEObject;
				T result = caseQueryMethodType(queryMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.QUERY_TYPE: {
				QueryType queryType = (QueryType)theEObject;
				T result = caseQueryType(queryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RELATIONSHIP_ROLE_SOURCE_TYPE: {
				RelationshipRoleSourceType relationshipRoleSourceType = (RelationshipRoleSourceType)theEObject;
				T result = caseRelationshipRoleSourceType(relationshipRoleSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RELATIONSHIPS_TYPE: {
				RelationshipsType relationshipsType = (RelationshipsType)theEObject;
				T result = caseRelationshipsType(relationshipsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.REMOTE_TYPE: {
				RemoteType remoteType = (RemoteType)theEObject;
				T result = caseRemoteType(remoteType);
				if (result == null) result = caseFullyQualifiedClassType(remoteType);
				if (result == null) result = caseString(remoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.REMOVE_METHOD_TYPE: {
				RemoveMethodType removeMethodType = (RemoveMethodType)theEObject;
				T result = caseRemoveMethodType(removeMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RES_AUTH_TYPE: {
				ResAuthType resAuthType = (ResAuthType)theEObject;
				T result = caseResAuthType(resAuthType);
				if (result == null) result = caseString(resAuthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RESOURCE_ENV_REF_TYPE: {
				ResourceEnvRefType resourceEnvRefType = (ResourceEnvRefType)theEObject;
				T result = caseResourceEnvRefType(resourceEnvRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RESOURCE_REF_TYPE: {
				ResourceRefType resourceRefType = (ResourceRefType)theEObject;
				T result = caseResourceRefType(resourceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RES_SHARING_SCOPE_TYPE: {
				ResSharingScopeType resSharingScopeType = (ResSharingScopeType)theEObject;
				T result = caseResSharingScopeType(resSharingScopeType);
				if (result == null) result = caseString(resSharingScopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RESULT_TYPE_MAPPING_TYPE: {
				ResultTypeMappingType resultTypeMappingType = (ResultTypeMappingType)theEObject;
				T result = caseResultTypeMappingType(resultTypeMappingType);
				if (result == null) result = caseString(resultTypeMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.ROLE_NAME_TYPE: {
				RoleNameType roleNameType = (RoleNameType)theEObject;
				T result = caseRoleNameType(roleNameType);
				if (result == null) result = caseString(roleNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.RUN_AS_TYPE: {
				RunAsType runAsType = (RunAsType)theEObject;
				T result = caseRunAsType(runAsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SECURITY_IDENTITY_TYPE: {
				SecurityIdentityType securityIdentityType = (SecurityIdentityType)theEObject;
				T result = caseSecurityIdentityType(securityIdentityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SECURITY_ROLE_REF_TYPE: {
				SecurityRoleRefType securityRoleRefType = (SecurityRoleRefType)theEObject;
				T result = caseSecurityRoleRefType(securityRoleRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SECURITY_ROLE_TYPE: {
				SecurityRoleType securityRoleType = (SecurityRoleType)theEObject;
				T result = caseSecurityRoleType(securityRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SERVICE_REF_HANDLER_CHAINS_TYPE: {
				ServiceRefHandlerChainsType serviceRefHandlerChainsType = (ServiceRefHandlerChainsType)theEObject;
				T result = caseServiceRefHandlerChainsType(serviceRefHandlerChainsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SERVICE_REF_HANDLER_CHAIN_TYPE: {
				ServiceRefHandlerChainType serviceRefHandlerChainType = (ServiceRefHandlerChainType)theEObject;
				T result = caseServiceRefHandlerChainType(serviceRefHandlerChainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SERVICE_REF_HANDLER_TYPE: {
				ServiceRefHandlerType serviceRefHandlerType = (ServiceRefHandlerType)theEObject;
				T result = caseServiceRefHandlerType(serviceRefHandlerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SERVICE_REF_TYPE: {
				ServiceRefType serviceRefType = (ServiceRefType)theEObject;
				T result = caseServiceRefType(serviceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SESSION_BEAN_TYPE: {
				SessionBeanType sessionBeanType = (SessionBeanType)theEObject;
				T result = caseSessionBeanType(sessionBeanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.SESSION_TYPE_TYPE: {
				SessionTypeType sessionTypeType = (SessionTypeType)theEObject;
				T result = caseSessionTypeType(sessionTypeType);
				if (result == null) result = caseString(sessionTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.STRING: {
				org.eclipse.modisco.jee.ejbjar.EjbJar30.String string = (org.eclipse.modisco.jee.ejbjar.EjbJar30.String)theEObject;
				T result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.TRANSACTION_TYPE_TYPE: {
				TransactionTypeType transactionTypeType = (TransactionTypeType)theEObject;
				T result = caseTransactionTypeType(transactionTypeType);
				if (result == null) result = caseString(transactionTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.TRANS_ATTRIBUTE_TYPE: {
				TransAttributeType transAttributeType = (TransAttributeType)theEObject;
				T result = caseTransAttributeType(transAttributeType);
				if (result == null) result = caseString(transAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.TRUE_FALSE_TYPE: {
				TrueFalseType trueFalseType = (TrueFalseType)theEObject;
				T result = caseTrueFalseType(trueFalseType);
				if (result == null) result = caseXsdBooleanType(trueFalseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.URL_PATTERN_TYPE: {
				UrlPatternType urlPatternType = (UrlPatternType)theEObject;
				T result = caseUrlPatternType(urlPatternType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_ANY_URI_TYPE: {
				XsdAnyURIType xsdAnyURIType = (XsdAnyURIType)theEObject;
				T result = caseXsdAnyURIType(xsdAnyURIType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_BOOLEAN_TYPE: {
				XsdBooleanType xsdBooleanType = (XsdBooleanType)theEObject;
				T result = caseXsdBooleanType(xsdBooleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_INTEGER_TYPE: {
				XsdIntegerType xsdIntegerType = (XsdIntegerType)theEObject;
				T result = caseXsdIntegerType(xsdIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_NMTOKEN_TYPE: {
				XsdNMTOKENType xsdNMTOKENType = (XsdNMTOKENType)theEObject;
				T result = caseXsdNMTOKENType(xsdNMTOKENType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_NON_NEGATIVE_INTEGER_TYPE: {
				XsdNonNegativeIntegerType xsdNonNegativeIntegerType = (XsdNonNegativeIntegerType)theEObject;
				T result = caseXsdNonNegativeIntegerType(xsdNonNegativeIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_POSITIVE_INTEGER_TYPE: {
				XsdPositiveIntegerType xsdPositiveIntegerType = (XsdPositiveIntegerType)theEObject;
				T result = caseXsdPositiveIntegerType(xsdPositiveIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_QNAME_TYPE: {
				XsdQNameType xsdQNameType = (XsdQNameType)theEObject;
				T result = caseXsdQNameType(xsdQNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbJar30Package.XSD_STRING_TYPE: {
				XsdStringType xsdStringType = (XsdStringType)theEObject;
				T result = caseXsdStringType(xsdStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Config Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Config Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationConfigPropertyType(ActivationConfigPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationConfigType(ActivationConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationExceptionType(ApplicationExceptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Around Invoke Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Around Invoke Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAroundInvokeType(AroundInvokeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Descriptor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Descriptor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyDescriptorType(AssemblyDescriptorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmp Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmp Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmpFieldType(CmpFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmp Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmp Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmpVersionType(CmpVersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmr Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmr Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmrFieldType(CmrFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmr Field Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmr Field Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmrFieldTypeType(CmrFieldTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerTransactionType(ContainerTransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayNameType(DisplayNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbClassType(EjbClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Jar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Jar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbJarType(EjbJarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbLinkType(EjbLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Local Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Local Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbLocalRefType(EjbLocalRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbNameType(EjbNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Ref Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Ref Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRefNameType(EjbRefNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRefType(EjbRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Ref Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Ref Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRefTypeType(EjbRefTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Relationship Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Relationship Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRelationshipRoleType(EjbRelationshipRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb Relation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjbRelationType(EjbRelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyType(EmptyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enterprise Beans Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enterprise Beans Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterpriseBeansType(EnterpriseBeansType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Bean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Bean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityBeanType(EntityBeanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntryType(EnvEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry Type Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry Type Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntryTypeValuesType(EnvEntryTypeValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeListType(ExcludeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fully Qualified Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fully Qualified Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullyQualifiedClassType(FullyQualifiedClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericBooleanType(GenericBooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Home Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Home Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHomeType(HomeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconType(IconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitMethodType(InitMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injection Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injection Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjectionTargetType(InjectionTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interceptor Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interceptor Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptorBindingType(InterceptorBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interceptor Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interceptor Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptorOrderType(InterceptorOrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interceptors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interceptors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptorsType(InterceptorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interceptor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interceptor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptorType(InterceptorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaIdentifierType(JavaIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaTypeType(JavaTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jndi Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jndi Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJndiNameType(JndiNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle Callback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle Callback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycleCallbackType(LifecycleCallbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listener Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listener Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListenerType(ListenerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Home Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Home Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalHomeType(LocalHomeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalType(LocalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationLinkType(MessageDestinationLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationRefType(MessageDestinationRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationType(MessageDestinationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationTypeType(MessageDestinationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Destination Usage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Destination Usage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDestinationUsageType(MessageDestinationUsageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Driven Bean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Driven Bean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDrivenBeanType(MessageDrivenBeanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Intf Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Intf Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodIntfType(MethodIntfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodNameType(MethodNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Params Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Params Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParamsType(MethodParamsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Permission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Permission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodPermissionType(MethodPermissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodType(MethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityType(MultiplicityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedMethodType(NamedMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamValueType(ParamValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathType(PathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Context Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Context Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceContextRefType(PersistenceContextRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Context Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Context Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceContextTypeType(PersistenceContextTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceTypeType(PersistenceTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Unit Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Unit Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceUnitRefType(PersistenceUnitRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Component Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Component Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortComponentRefType(PortComponentRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryMethodType(QueryMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryType(QueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Role Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Role Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipRoleSourceType(RelationshipRoleSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationships Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationships Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipsType(RelationshipsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteType(RemoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveMethodType(RemoveMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Res Auth Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Res Auth Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResAuthType(ResAuthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Env Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Env Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceEnvRefType(ResourceEnvRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRefType(ResourceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Res Sharing Scope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Res Sharing Scope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResSharingScopeType(ResSharingScopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Type Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Type Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultTypeMappingType(ResultTypeMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleNameType(RoleNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run As Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run As Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunAsType(RunAsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Identity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Identity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityIdentityType(SecurityIdentityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Role Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Role Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRoleRefType(SecurityRoleRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRoleType(SecurityRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Ref Handler Chains Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Ref Handler Chains Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRefHandlerChainsType(ServiceRefHandlerChainsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Ref Handler Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Ref Handler Chain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRefHandlerChainType(ServiceRefHandlerChainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Ref Handler Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Ref Handler Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRefHandlerType(ServiceRefHandlerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRefType(ServiceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Bean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Bean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionBeanType(SessionBeanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionTypeType(SessionTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.eclipse.modisco.jee.ejbjar.EjbJar30.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionTypeType(TransactionTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransAttributeType(TransAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True False Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True False Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueFalseType(TrueFalseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Pattern Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Pattern Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlPatternType(UrlPatternType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Any URI Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Any URI Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdAnyURIType(XsdAnyURIType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdBooleanType(XsdBooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdIntegerType(XsdIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd NMTOKEN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd NMTOKEN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdNMTOKENType(XsdNMTOKENType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Non Negative Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Non Negative Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdNonNegativeIntegerType(XsdNonNegativeIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd Positive Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd Positive Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdPositiveIntegerType(XsdPositiveIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd QName Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd QName Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdQNameType(XsdQNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsd String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsd String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsdStringType(XsdStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //EjbJar30Switch
