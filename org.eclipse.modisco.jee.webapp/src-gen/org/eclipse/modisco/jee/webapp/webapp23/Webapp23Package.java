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
package org.eclipse.modisco.jee.webapp.webapp23;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Webapp23Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapp23"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/web-app_2_3.dtd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapp23"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Webapp23Package eINSTANCE = org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.AuthConstraintTypeImpl <em>Auth Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.AuthConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getAuthConstraintType()
	 * @generated
	 */
	int AUTH_CONSTRAINT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Auth Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.AuthMethodTypeImpl <em>Auth Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.AuthMethodTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getAuthMethodType()
	 * @generated
	 */
	int AUTH_METHOD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Auth Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ContextParamTypeImpl <em>Context Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ContextParamTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getContextParamType()
	 * @generated
	 */
	int CONTEXT_PARAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAM_TYPE__PARAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAM_TYPE__PARAM_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAM_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAM_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Context Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDisplayNameType()
	 * @generated
	 */
	int DISPLAY_NAME_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Display Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DistributableTypeImpl <em>Distributable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DistributableTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDistributableType()
	 * @generated
	 */
	int DISTRIBUTABLE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTABLE_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Distributable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Auth Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTH_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Auth Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTH_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Context Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTEXT_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Distributable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISTRIBUTABLE = 8;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_LINK = 9;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_LOCAL_REF = 10;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF = 11;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_NAME = 12;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_NAME = 15;

	/**
	 * The feature id for the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_CODE = 18;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_PAGE = 19;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION = 21;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 22;

	/**
	 * The feature id for the '<em><b>Filter Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_CLASS = 23;

	/**
	 * The feature id for the '<em><b>Filter Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_MAPPING = 24;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_NAME = 25;

	/**
	 * The feature id for the '<em><b>Form Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM_ERROR_PAGE = 26;

	/**
	 * The feature id for the '<em><b>Form Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM_LOGIN_CONFIG = 27;

	/**
	 * The feature id for the '<em><b>Form Login Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM_LOGIN_PAGE = 28;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOME = 29;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTP_METHOD = 30;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON = 31;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INIT_PARAM = 32;

	/**
	 * The feature id for the '<em><b>Jsp File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JSP_FILE = 33;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LARGE_ICON = 34;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LISTENER = 35;

	/**
	 * The feature id for the '<em><b>Listener Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LISTENER_CLASS = 36;

	/**
	 * The feature id for the '<em><b>Load On Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOAD_ON_STARTUP = 37;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCAL = 38;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCAL_HOME = 39;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 40;

	/**
	 * The feature id for the '<em><b>Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGIN_CONFIG = 41;

	/**
	 * The feature id for the '<em><b>Mime Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIME_MAPPING = 42;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIME_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM_NAME = 44;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM_VALUE = 45;

	/**
	 * The feature id for the '<em><b>Realm Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REALM_NAME = 46;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE = 47;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_AUTH = 48;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ENV_REF = 49;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME = 50;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_REF = 52;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_REF_NAME = 53;

	/**
	 * The feature id for the '<em><b>Res Sharing Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_SHARING_SCOPE = 54;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Role Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_LINK = 56;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_NAME = 57;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUN_AS = 58;

	/**
	 * The feature id for the '<em><b>Security Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_CONSTRAINT = 59;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE = 60;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE_REF = 61;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET = 62;

	/**
	 * The feature id for the '<em><b>Servlet Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET_CLASS = 63;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET_MAPPING = 64;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET_NAME = 65;

	/**
	 * The feature id for the '<em><b>Session Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION_CONFIG = 66;

	/**
	 * The feature id for the '<em><b>Session Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION_TIMEOUT = 67;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SMALL_ICON = 68;

	/**
	 * The feature id for the '<em><b>Taglib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAGLIB = 69;

	/**
	 * The feature id for the '<em><b>Taglib Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAGLIB_LOCATION = 70;

	/**
	 * The feature id for the '<em><b>Taglib Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAGLIB_URI = 71;

	/**
	 * The feature id for the '<em><b>Transport Guarantee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORT_GUARANTEE = 72;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URL_PATTERN = 73;

	/**
	 * The feature id for the '<em><b>User Data Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_DATA_CONSTRAINT = 74;

	/**
	 * The feature id for the '<em><b>Web App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_APP = 75;

	/**
	 * The feature id for the '<em><b>Web Resource Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION = 76;

	/**
	 * The feature id for the '<em><b>Web Resource Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_RESOURCE_NAME = 77;

	/**
	 * The feature id for the '<em><b>Welcome File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WELCOME_FILE = 78;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WELCOME_FILE_LIST = 79;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbLinkType()
	 * @generated
	 */
	int EJB_LINK_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLocalRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbLocalRefType()
	 * @generated
	 */
	int EJB_LOCAL_REF_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__EJB_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__EJB_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__LOCAL_HOME = 3;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__LOCAL = 4;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__EJB_LINK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Ejb Local Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Ref Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__EJB_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__EJB_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__HOME = 3;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__REMOTE = 4;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__EJB_LINK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Ejb Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Ref Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryNameType()
	 * @generated
	 */
	int ENV_ENTRY_NAME_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Env Entry Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Env Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryTypeType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Env Entry Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryValueTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryValueType()
	 * @generated
	 */
	int ENV_ENTRY_VALUE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_VALUE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_VALUE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Env Entry Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorCodeTypeImpl <em>Error Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorCodeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getErrorCodeType()
	 * @generated
	 */
	int ERROR_CODE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Error Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl <em>Error Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getErrorPageType()
	 * @generated
	 */
	int ERROR_PAGE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__ERROR_CODE = 0;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__EXCEPTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Error Page Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ExceptionTypeTypeImpl <em>Exception Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ExceptionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getExceptionTypeType()
	 * @generated
	 */
	int EXCEPTION_TYPE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Exception Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ExtensionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getExtensionType()
	 * @generated
	 */
	int EXTENSION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterClassTypeImpl <em>Filter Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterClassTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterClassType()
	 * @generated
	 */
	int FILTER_CLASS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLASS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLASS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Filter Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLASS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterMappingTypeImpl <em>Filter Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterMappingType()
	 * @generated
	 */
	int FILTER_MAPPING_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__FILTER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__URL_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__SERVLET_NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Filter Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterNameTypeImpl <em>Filter Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterNameType()
	 * @generated
	 */
	int FILTER_NAME_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Filter Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ICON = 0;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__DISPLAY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Filter Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__INIT_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FormErrorPageTypeImpl <em>Form Error Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FormErrorPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFormErrorPageType()
	 * @generated
	 */
	int FORM_ERROR_PAGE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ERROR_PAGE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ERROR_PAGE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Form Error Page Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ERROR_PAGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginConfigTypeImpl <em>Form Login Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFormLoginConfigType()
	 * @generated
	 */
	int FORM_LOGIN_CONFIG_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Form Login Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Form Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Form Login Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginPageTypeImpl <em>Form Login Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFormLoginPageType()
	 * @generated
	 */
	int FORM_LOGIN_PAGE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_PAGE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_PAGE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Form Login Page Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_PAGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Home Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.HttpMethodTypeImpl <em>Http Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.HttpMethodTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getHttpMethodType()
	 * @generated
	 */
	int HTTP_METHOD_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Http Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.IconTypeImpl <em>Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.IconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__SMALL_ICON = 0;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__LARGE_ICON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl <em>Init Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getInitParamType()
	 * @generated
	 */
	int INIT_PARAM_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM_TYPE__PARAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM_TYPE__PARAM_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Init Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.JspFileTypeImpl <em>Jsp File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.JspFileTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getJspFileType()
	 * @generated
	 */
	int JSP_FILE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_FILE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_FILE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Jsp File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_FILE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LargeIconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLargeIconType()
	 * @generated
	 */
	int LARGE_ICON_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ICON_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ICON_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Large Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ICON_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassImpl <em>Listener Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getListenerClass()
	 * @generated
	 */
	int LISTENER_CLASS = 33;

	/**
	 * The feature id for the '<em><b>Listener Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_CLASS__LISTENER_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Listener Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassTypeImpl <em>Listener Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getListenerClassType()
	 * @generated
	 */
	int LISTENER_CLASS_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_CLASS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_CLASS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Listener Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_CLASS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getListenerType()
	 * @generated
	 */
	int LISTENER_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Listener Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__LISTENER_CLASS = LISTENER_CLASS__LISTENER_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__ID = LISTENER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Listener Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE_FEATURE_COUNT = LISTENER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoadOnStartupTypeImpl <em>Load On Startup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LoadOnStartupTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLoadOnStartupType()
	 * @generated
	 */
	int LOAD_ON_STARTUP_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ON_STARTUP_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ON_STARTUP_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Load On Startup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ON_STARTUP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LocalHomeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLocalHomeType()
	 * @generated
	 */
	int LOCAL_HOME_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Local Home Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LocalTypeImpl <em>Local Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LocalTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLocalType()
	 * @generated
	 */
	int LOCAL_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Local Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LocationTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl <em>Login Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLoginConfigType()
	 * @generated
	 */
	int LOGIN_CONFIG_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Auth Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__AUTH_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Realm Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__REALM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Form Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Login Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.MimeMappingTypeImpl <em>Mime Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.MimeMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getMimeMappingType()
	 * @generated
	 */
	int MIME_MAPPING_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE__MIME_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Mime Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.MimeTypeTypeImpl <em>Mime Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.MimeTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getMimeTypeType()
	 * @generated
	 */
	int MIME_TYPE_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Mime Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ParamNameTypeImpl <em>Param Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ParamNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getParamNameType()
	 * @generated
	 */
	int PARAM_NAME_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Param Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ParamValueTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getParamValueType()
	 * @generated
	 */
	int PARAM_VALUE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Param Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RealmNameTypeImpl <em>Realm Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RealmNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRealmNameType()
	 * @generated
	 */
	int REALM_NAME_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALM_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALM_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Realm Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALM_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Remote Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Res Auth Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefNameTypeImpl <em>Resource Env Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceEnvRefNameType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_NAME_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Resource Env Ref Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceEnvRefType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Resource Env Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeTypeImpl <em>Resource Env Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceEnvRefTypeType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Resource Env Ref Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_AUTH = 3;

	/**
	 * The feature id for the '<em><b>Res Sharing Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_SHARING_SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Resource Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResRefNameType()
	 * @generated
	 */
	int RES_REF_NAME_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_REF_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_REF_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Res Ref Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_REF_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResSharingScopeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResSharingScopeType()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Res Sharing Scope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResTypeType()
	 * @generated
	 */
	int RES_TYPE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Res Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RoleLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRoleLinkType()
	 * @generated
	 */
	int ROLE_LINK_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LINK_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LINK_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Role Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LINK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Role Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RunAsTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRunAsType()
	 * @generated
	 */
	int RUN_AS_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Run As Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityConstraintTypeImpl <em>Security Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSecurityConstraintType()
	 * @generated
	 */
	int SECURITY_CONSTRAINT_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Web Resource Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Auth Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>User Data Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Security Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Role Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__ROLE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Security Role Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Security Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletClassTypeImpl <em>Servlet Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletClassTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletClassType()
	 * @generated
	 */
	int SERVLET_CLASS_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_CLASS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_CLASS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Servlet Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_CLASS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletMappingTypeImpl <em>Servlet Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletMappingType()
	 * @generated
	 */
	int SERVLET_MAPPING_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE__SERVLET_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE__URL_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Servlet Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletNameTypeImpl <em>Servlet Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletNameType()
	 * @generated
	 */
	int SERVLET_NAME_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Servlet Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl <em>Servlet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletType()
	 * @generated
	 */
	int SERVLET_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ICON = 0;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SERVLET_NAME = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__DISPLAY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Servlet Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SERVLET_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Jsp File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__JSP_FILE = 5;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__INIT_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Load On Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__LOAD_ON_STARTUP = 7;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__RUN_AS = 8;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SECURITY_ROLE_REF = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ID = 10;

	/**
	 * The number of structural features of the '<em>Servlet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SessionConfigTypeImpl <em>Session Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SessionConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSessionConfigType()
	 * @generated
	 */
	int SESSION_CONFIG_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Session Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__SESSION_TIMEOUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Session Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SessionTimeoutTypeImpl <em>Session Timeout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SessionTimeoutTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSessionTimeoutType()
	 * @generated
	 */
	int SESSION_TIMEOUT_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Session Timeout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SmallIconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSmallIconType()
	 * @generated
	 */
	int SMALL_ICON_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ICON_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ICON_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Small Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ICON_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibLocationTypeImpl <em>Taglib Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibLocationTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTaglibLocationType()
	 * @generated
	 */
	int TAGLIB_LOCATION_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_LOCATION_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Taglib Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_LOCATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibTypeImpl <em>Taglib Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTaglibType()
	 * @generated
	 */
	int TAGLIB_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Taglib Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE__TAGLIB_URI = 0;

	/**
	 * The feature id for the '<em><b>Taglib Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE__TAGLIB_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Taglib Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibUriTypeImpl <em>Taglib Uri Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibUriTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTaglibUriType()
	 * @generated
	 */
	int TAGLIB_URI_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_URI_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_URI_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Taglib Uri Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_URI_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TransportGuaranteeTypeImpl <em>Transport Guarantee Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TransportGuaranteeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTransportGuaranteeType()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_GUARANTEE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_GUARANTEE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Transport Guarantee Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_GUARANTEE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.UrlPatternTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getUrlPatternType()
	 * @generated
	 */
	int URL_PATTERN_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Url Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.UserDataConstraintTypeImpl <em>User Data Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.UserDataConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getUserDataConstraintType()
	 * @generated
	 */
	int USER_DATA_CONSTRAINT_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Transport Guarantee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>User Data Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl <em>Web App Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWebAppType()
	 * @generated
	 */
	int WEB_APP_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ICON = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Distributable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DISTRIBUTABLE = 3;

	/**
	 * The feature id for the '<em><b>Context Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__CONTEXT_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Filter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__FILTER_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LISTENER = 7;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET = 8;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Session Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SESSION_CONFIG = 10;

	/**
	 * The feature id for the '<em><b>Mime Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MIME_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__WELCOME_FILE_LIST = 12;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ERROR_PAGE = 13;

	/**
	 * The feature id for the '<em><b>Taglib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__TAGLIB = 14;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__RESOURCE_ENV_REF = 15;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__RESOURCE_REF = 16;

	/**
	 * The feature id for the '<em><b>Security Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LOGIN_CONFIG = 18;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_ROLE = 19;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ENV_ENTRY = 20;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__EJB_REF = 21;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__EJB_LOCAL_REF = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ID = 23;

	/**
	 * The number of structural features of the '<em>Web App Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceCollectionTypeImpl <em>Web Resource Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceCollectionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWebResourceCollectionType()
	 * @generated
	 */
	int WEB_RESOURCE_COLLECTION_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Web Resource Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Web Resource Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceNameTypeImpl <em>Web Resource Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWebResourceNameType()
	 * @generated
	 */
	int WEB_RESOURCE_NAME_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Web Resource Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileListTypeImpl <em>Welcome File List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileListTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWelcomeFileListType()
	 * @generated
	 */
	int WELCOME_FILE_LIST_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Welcome File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST_TYPE__WELCOME_FILE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Welcome File List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileTypeImpl <em>Welcome File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWelcomeFileType()
	 * @generated
	 */
	int WELCOME_FILE_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Welcome File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_TYPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auth Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType
	 * @generated
	 */
	EClass getAuthConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType#getDescription()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType#getRoleName()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthConstraintType#getId()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EAttribute getAuthConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType <em>Auth Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auth Method Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType
	 * @generated
	 */
	EClass getAuthMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType#getMixed()
	 * @see #getAuthMethodType()
	 * @generated
	 */
	EAttribute getAuthMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType#getId()
	 * @see #getAuthMethodType()
	 * @generated
	 */
	EAttribute getAuthMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ContextParamType <em>Context Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Param Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ContextParamType
	 * @generated
	 */
	EClass getContextParamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getParamName()
	 * @see #getContextParamType()
	 * @generated
	 */
	EReference getContextParamType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getParamValue()
	 * @see #getContextParamType()
	 * @generated
	 */
	EReference getContextParamType_ParamValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getDescription()
	 * @see #getContextParamType()
	 * @generated
	 */
	EReference getContextParamType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ContextParamType#getId()
	 * @see #getContextParamType()
	 * @generated
	 */
	EAttribute getContextParamType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.DescriptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DescriptionType#getId()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType#getMixed()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType#getId()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.DistributableType <em>Distributable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributable Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DistributableType
	 * @generated
	 */
	EClass getDistributableType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.DistributableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DistributableType#getId()
	 * @see #getDistributableType()
	 * @generated
	 */
	EAttribute getDistributableType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthConstraint <em>Auth Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuthMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getContextParam <em>Context Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getContextParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContextParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDisplayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDistributable <em>Distributable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distributable</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDistributable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Distributable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLocalRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Code</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExceptionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterClass <em>Filter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterMapping <em>Filter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormErrorPage <em>Form Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormErrorPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormErrorPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginConfig <em>Form Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormLoginConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginPage <em>Form Login Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormLoginPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHome()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHttpMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HttpMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getInitParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InitParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getJspFile <em>Jsp File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jsp File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getJspFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JspFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLargeIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListener()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Listener();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListenerClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListenerClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoadOnStartup <em>Load On Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load On Startup</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoadOnStartup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoadOnStartup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocalHome()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoginConfig <em>Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoginConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoginConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeMapping <em>Mime Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MimeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MimeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParamValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRealmName <em>Realm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realm Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRealmName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RealmName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRemote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResAuth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResSharingScope <em>Res Sharing Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResSharingScope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResSharingScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRunAs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RunAs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityConstraint <em>Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRoleRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServlet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Servlet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletClass <em>Servlet Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServletClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServletMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionConfig <em>Session Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SessionConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Timeout</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionTimeout()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SessionTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSmallIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglib <em>Taglib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglib()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Taglib();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibLocation <em>Taglib Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaglibLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibUri <em>Taglib Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Uri</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibUri()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaglibUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTransportGuarantee <em>Transport Guarantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Guarantee</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTransportGuarantee()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransportGuarantee();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUrlPattern()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UrlPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUserDataConstraint <em>User Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUserDataConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserDataConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web App</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebApp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebApp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceCollection <em>Web Resource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Resource Collection</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebResourceCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceName <em>Web Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Resource Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebResourceName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WelcomeFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFileList <em>Welcome File List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome File List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFileList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WelcomeFileList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType#getMixed()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLinkType#getId()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Local Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType
	 * @generated
	 */
	EClass getEjbLocalRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getDescription()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getEjbRefName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getEjbRefType()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getLocalHome()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getLocal()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getEjbLink()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbLocalRefType#getId()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EAttribute getEjbLocalRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType#getMixed()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefNameType#getId()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType#getMixed()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EjbRefTypeType#getId()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType <em>Env Entry Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType
	 * @generated
	 */
	EClass getEnvEntryNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType#getMixed()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType#getId()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType <em>Env Entry Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType
	 * @generated
	 */
	EClass getEnvEntryTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType#getMixed()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType#getId()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType <em>Env Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Value Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType
	 * @generated
	 */
	EClass getEnvEntryValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType#getMixed()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType#getId()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Code Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType
	 * @generated
	 */
	EClass getErrorCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType#getMixed()
	 * @see #getErrorCodeType()
	 * @generated
	 */
	EAttribute getErrorCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType#getId()
	 * @see #getErrorCodeType()
	 * @generated
	 */
	EAttribute getErrorCodeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType
	 * @generated
	 */
	EClass getErrorPageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Code</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getErrorCode()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getExceptionType()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getLocation()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType#getId()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EAttribute getErrorPageType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType <em>Exception Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType
	 * @generated
	 */
	EClass getExceptionTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType#getMixed()
	 * @see #getExceptionTypeType()
	 * @generated
	 */
	EAttribute getExceptionTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType#getId()
	 * @see #getExceptionTypeType()
	 * @generated
	 */
	EAttribute getExceptionTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExtensionType
	 * @generated
	 */
	EClass getExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExtensionType#getMixed()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ExtensionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ExtensionType#getId()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterClassType <em>Filter Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Class Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterClassType
	 * @generated
	 */
	EClass getFilterClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterClassType#getMixed()
	 * @see #getFilterClassType()
	 * @generated
	 */
	EAttribute getFilterClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterClassType#getId()
	 * @see #getFilterClassType()
	 * @generated
	 */
	EAttribute getFilterClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType <em>Filter Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType
	 * @generated
	 */
	EClass getFilterMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getFilterName()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_FilterName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getUrlPattern()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getServletName()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_ServletName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterMappingType#getId()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EAttribute getFilterMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterNameType <em>Filter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterNameType
	 * @generated
	 */
	EClass getFilterNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterNameType#getMixed()
	 * @see #getFilterNameType()
	 * @generated
	 */
	EAttribute getFilterNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterNameType#getId()
	 * @see #getFilterNameType()
	 * @generated
	 */
	EAttribute getFilterNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType#getIcon()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterName()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDisplayName()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType#getDescription()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterClass <em>Filter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType#getFilterClass()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType#getInitParam()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_InitParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.FilterType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FilterType#getId()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType <em>Form Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Error Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType
	 * @generated
	 */
	EClass getFormErrorPageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType#getMixed()
	 * @see #getFormErrorPageType()
	 * @generated
	 */
	EAttribute getFormErrorPageType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormErrorPageType#getId()
	 * @see #getFormErrorPageType()
	 * @generated
	 */
	EAttribute getFormErrorPageType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType
	 * @generated
	 */
	EClass getFormLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormLoginPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormLoginPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getFormErrorPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormErrorPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType#getId()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EAttribute getFormLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType <em>Form Login Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Login Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType
	 * @generated
	 */
	EClass getFormLoginPageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType#getMixed()
	 * @see #getFormLoginPageType()
	 * @generated
	 */
	EAttribute getFormLoginPageType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.FormLoginPageType#getId()
	 * @see #getFormLoginPageType()
	 * @generated
	 */
	EAttribute getFormLoginPageType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.HomeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HomeType#getMixed()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.HomeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HomeType#getId()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType <em>Http Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Method Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType
	 * @generated
	 */
	EClass getHttpMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType#getMixed()
	 * @see #getHttpMethodType()
	 * @generated
	 */
	EAttribute getHttpMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.HttpMethodType#getId()
	 * @see #getHttpMethodType()
	 * @generated
	 */
	EAttribute getHttpMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.IconType
	 * @generated
	 */
	EClass getIconType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.IconType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.IconType#getSmallIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.IconType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.IconType#getLargeIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.IconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.IconType#getId()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType <em>Init Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Param Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.InitParamType
	 * @generated
	 */
	EClass getInitParamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getParamName()
	 * @see #getInitParamType()
	 * @generated
	 */
	EReference getInitParamType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getParamValue()
	 * @see #getInitParamType()
	 * @generated
	 */
	EReference getInitParamType_ParamValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getDescription()
	 * @see #getInitParamType()
	 * @generated
	 */
	EReference getInitParamType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.InitParamType#getId()
	 * @see #getInitParamType()
	 * @generated
	 */
	EAttribute getInitParamType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsp File Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.JspFileType
	 * @generated
	 */
	EClass getJspFileType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.JspFileType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.JspFileType#getMixed()
	 * @see #getJspFileType()
	 * @generated
	 */
	EAttribute getJspFileType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.JspFileType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.JspFileType#getId()
	 * @see #getJspFileType()
	 * @generated
	 */
	EAttribute getJspFileType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.LargeIconType <em>Large Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LargeIconType
	 * @generated
	 */
	EClass getLargeIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.LargeIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LargeIconType#getMixed()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.LargeIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LargeIconType#getId()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerClass
	 * @generated
	 */
	EClass getListenerClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClass#getListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerClass#getListenerClass()
	 * @see #getListenerClass()
	 * @generated
	 */
	EReference getListenerClass_ListenerClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType <em>Listener Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener Class Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType
	 * @generated
	 */
	EClass getListenerClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType#getMixed()
	 * @see #getListenerClassType()
	 * @generated
	 */
	EAttribute getListenerClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType#getId()
	 * @see #getListenerClassType()
	 * @generated
	 */
	EAttribute getListenerClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerType
	 * @generated
	 */
	EClass getListenerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ListenerType#getId()
	 * @see #getListenerType()
	 * @generated
	 */
	EAttribute getListenerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType <em>Load On Startup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load On Startup Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType
	 * @generated
	 */
	EClass getLoadOnStartupType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType#getMixed()
	 * @see #getLoadOnStartupType()
	 * @generated
	 */
	EAttribute getLoadOnStartupType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoadOnStartupType#getId()
	 * @see #getLoadOnStartupType()
	 * @generated
	 */
	EAttribute getLoadOnStartupType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Home Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType
	 * @generated
	 */
	EClass getLocalHomeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType#getMixed()
	 * @see #getLocalHomeType()
	 * @generated
	 */
	EAttribute getLocalHomeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalHomeType#getId()
	 * @see #getLocalHomeType()
	 * @generated
	 */
	EAttribute getLocalHomeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalType
	 * @generated
	 */
	EClass getLocalType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalType#getMixed()
	 * @see #getLocalType()
	 * @generated
	 */
	EAttribute getLocalType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.LocalType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocalType#getId()
	 * @see #getLocalType()
	 * @generated
	 */
	EAttribute getLocalType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.LocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocationType#getMixed()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.LocationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LocationType#getId()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType <em>Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType
	 * @generated
	 */
	EClass getLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getAuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getAuthMethod()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_AuthMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getRealmName <em>Realm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realm Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getRealmName()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_RealmName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getFormLoginConfig <em>Form Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getFormLoginConfig()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_FormLoginConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType#getId()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EAttribute getLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType <em>Mime Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType
	 * @generated
	 */
	EClass getMimeMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType#getExtension()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType#getMimeType()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeMappingType#getId()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EAttribute getMimeMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType
	 * @generated
	 */
	EClass getMimeTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType#getMixed()
	 * @see #getMimeTypeType()
	 * @generated
	 */
	EAttribute getMimeTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.MimeTypeType#getId()
	 * @see #getMimeTypeType()
	 * @generated
	 */
	EAttribute getMimeTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamNameType <em>Param Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamNameType
	 * @generated
	 */
	EClass getParamNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamNameType#getMixed()
	 * @see #getParamNameType()
	 * @generated
	 */
	EAttribute getParamNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamNameType#getId()
	 * @see #getParamNameType()
	 * @generated
	 */
	EAttribute getParamNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Value Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamValueType
	 * @generated
	 */
	EClass getParamValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamValueType#getMixed()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ParamValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ParamValueType#getId()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.RealmNameType <em>Realm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realm Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RealmNameType
	 * @generated
	 */
	EClass getRealmNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.RealmNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RealmNameType#getMixed()
	 * @see #getRealmNameType()
	 * @generated
	 */
	EAttribute getRealmNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.RealmNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RealmNameType#getId()
	 * @see #getRealmNameType()
	 * @generated
	 */
	EAttribute getRealmNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.RemoteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RemoteType#getMixed()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.RemoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RemoteType#getId()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ResAuthType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResAuthType#getMixed()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResAuthType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResAuthType#getId()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType <em>Resource Env Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType
	 * @generated
	 */
	EClass getResourceEnvRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType#getMixed()
	 * @see #getResourceEnvRefNameType()
	 * @generated
	 */
	EAttribute getResourceEnvRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType#getId()
	 * @see #getResourceEnvRefNameType()
	 * @generated
	 */
	EAttribute getResourceEnvRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType
	 * @generated
	 */
	EClass getResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getDescription()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefType()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getId()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EAttribute getResourceEnvRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType <em>Resource Env Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType
	 * @generated
	 */
	EClass getResourceEnvRefTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType#getMixed()
	 * @see #getResourceEnvRefTypeType()
	 * @generated
	 */
	EAttribute getResourceEnvRefTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType#getId()
	 * @see #getResourceEnvRefTypeType()
	 * @generated
	 */
	EAttribute getResourceEnvRefTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getResSharingScope()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResSharingScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType <em>Res Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType
	 * @generated
	 */
	EClass getResRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType#getMixed()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResRefNameType#getId()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Sharing Scope Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType
	 * @generated
	 */
	EClass getResSharingScopeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType#getMixed()
	 * @see #getResSharingScopeType()
	 * @generated
	 */
	EAttribute getResSharingScopeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResSharingScopeType#getId()
	 * @see #getResSharingScopeType()
	 * @generated
	 */
	EAttribute getResSharingScopeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ResTypeType <em>Res Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResTypeType
	 * @generated
	 */
	EClass getResTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ResTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResTypeType#getMixed()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ResTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ResTypeType#getId()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType <em>Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType
	 * @generated
	 */
	EClass getRoleLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType#getMixed()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleLinkType#getId()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleNameType#getMixed()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.RoleNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RoleNameType#getId()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run As Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RunAsType
	 * @generated
	 */
	EClass getRunAsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.RunAsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RunAsType#getDescription()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.RunAsType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RunAsType#getRoleName()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.RunAsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.RunAsType#getId()
	 * @see #getRunAsType()
	 * @generated
	 */
	EAttribute getRunAsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType
	 * @generated
	 */
	EClass getSecurityConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getDisplayName()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getWebResourceCollection <em>Web Resource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Resource Collection</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getWebResourceCollection()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_WebResourceCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getAuthConstraint <em>Auth Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getAuthConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_AuthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getUserDataConstraint <em>User Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getUserDataConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_UserDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getId()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EAttribute getSecurityConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletClassType <em>Servlet Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Class Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletClassType
	 * @generated
	 */
	EClass getServletClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletClassType#getMixed()
	 * @see #getServletClassType()
	 * @generated
	 */
	EAttribute getServletClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletClassType#getId()
	 * @see #getServletClassType()
	 * @generated
	 */
	EAttribute getServletClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType
	 * @generated
	 */
	EClass getServletMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType#getServletName()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType#getUrlPattern()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_UrlPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletMappingType#getId()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EAttribute getServletMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletNameType <em>Servlet Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletNameType
	 * @generated
	 */
	EClass getServletNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletNameType#getMixed()
	 * @see #getServletNameType()
	 * @generated
	 */
	EAttribute getServletNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletNameType#getId()
	 * @see #getServletNameType()
	 * @generated
	 */
	EAttribute getServletNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType
	 * @generated
	 */
	EClass getServletType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getIcon()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDisplayName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDescription()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletClass <em>Servlet Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletClass()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getJspFile <em>Jsp File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jsp File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getJspFile()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_JspFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getInitParam()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_InitParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getLoadOnStartup <em>Load On Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load On Startup</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getLoadOnStartup()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_LoadOnStartup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getRunAs()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_RunAs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getSecurityRoleRef()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_SecurityRoleRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.ServletType#getId()
	 * @see #getServletType()
	 * @generated
	 */
	EAttribute getServletType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType <em>Session Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType
	 * @generated
	 */
	EClass getSessionConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Timeout</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType#getSessionTimeout()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EReference getSessionConfigType_SessionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionConfigType#getId()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EAttribute getSessionConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType <em>Session Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Timeout Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType
	 * @generated
	 */
	EClass getSessionTimeoutType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType#getMixed()
	 * @see #getSessionTimeoutType()
	 * @generated
	 */
	EAttribute getSessionTimeoutType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SessionTimeoutType#getId()
	 * @see #getSessionTimeoutType()
	 * @generated
	 */
	EAttribute getSessionTimeoutType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.SmallIconType <em>Small Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SmallIconType
	 * @generated
	 */
	EClass getSmallIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.SmallIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SmallIconType#getMixed()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.SmallIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.SmallIconType#getId()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType <em>Taglib Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Location Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType
	 * @generated
	 */
	EClass getTaglibLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType#getMixed()
	 * @see #getTaglibLocationType()
	 * @generated
	 */
	EAttribute getTaglibLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibLocationType#getId()
	 * @see #getTaglibLocationType()
	 * @generated
	 */
	EAttribute getTaglibLocationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibType
	 * @generated
	 */
	EClass getTaglibType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibUri <em>Taglib Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Uri</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibUri()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibLocation <em>Taglib Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getTaglibLocation()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibType#getId()
	 * @see #getTaglibType()
	 * @generated
	 */
	EAttribute getTaglibType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType <em>Taglib Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Uri Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType
	 * @generated
	 */
	EClass getTaglibUriType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType#getMixed()
	 * @see #getTaglibUriType()
	 * @generated
	 */
	EAttribute getTaglibUriType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TaglibUriType#getId()
	 * @see #getTaglibUriType()
	 * @generated
	 */
	EAttribute getTaglibUriType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Guarantee Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType
	 * @generated
	 */
	EClass getTransportGuaranteeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType#getMixed()
	 * @see #getTransportGuaranteeType()
	 * @generated
	 */
	EAttribute getTransportGuaranteeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.TransportGuaranteeType#getId()
	 * @see #getTransportGuaranteeType()
	 * @generated
	 */
	EAttribute getTransportGuaranteeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Pattern Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType
	 * @generated
	 */
	EClass getUrlPatternType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType#getMixed()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UrlPatternType#getId()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Data Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType
	 * @generated
	 */
	EClass getUserDataConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType#getDescription()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType#getTransportGuarantee <em>Transport Guarantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Guarantee</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType#getTransportGuarantee()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_TransportGuarantee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.UserDataConstraintType#getId()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EAttribute getUserDataConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType
	 * @generated
	 */
	EClass getWebAppType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getIcon()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getDisplayName()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getDescription()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getDistributable <em>Distributable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distributable</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getDistributable()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Distributable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getContextParam <em>Context Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getContextParam()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ContextParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getFilter()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getFilterMapping <em>Filter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getFilterMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_FilterMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listener</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getListener()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Listener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getServlet()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Servlet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getServletMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ServletMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getSessionConfig <em>Session Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getSessionConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SessionConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getMimeMapping <em>Mime Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getMimeMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MimeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getWelcomeFileList <em>Welcome File List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome File List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getWelcomeFileList()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_WelcomeFileList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getErrorPage()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ErrorPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getTaglib <em>Taglib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taglib</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getTaglib()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Taglib();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getResourceEnvRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getResourceRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getSecurityConstraint <em>Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getSecurityConstraint()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getLoginConfig <em>Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getLoginConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_LoginConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getSecurityRole()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getEnvEntry()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getEjbRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getEjbLocalRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EjbLocalRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebAppType#getId()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Resource Collection Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType
	 * @generated
	 */
	EClass getWebResourceCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getWebResourceName <em>Web Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Resource Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getWebResourceName()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_WebResourceName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getDescription()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getUrlPattern()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Http Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getHttpMethod()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType#getId()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EAttribute getWebResourceCollectionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType <em>Web Resource Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Resource Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType
	 * @generated
	 */
	EClass getWebResourceNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType#getMixed()
	 * @see #getWebResourceNameType()
	 * @generated
	 */
	EAttribute getWebResourceNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WebResourceNameType#getId()
	 * @see #getWebResourceNameType()
	 * @generated
	 */
	EAttribute getWebResourceNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Welcome File List Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType
	 * @generated
	 */
	EClass getWelcomeFileListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType#getWelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Welcome File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType#getWelcomeFile()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EReference getWelcomeFileListType_WelcomeFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileListType#getId()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EAttribute getWelcomeFileListType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType <em>Welcome File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Welcome File Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType
	 * @generated
	 */
	EClass getWelcomeFileType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType#getMixed()
	 * @see #getWelcomeFileType()
	 * @generated
	 */
	EAttribute getWelcomeFileType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.WelcomeFileType#getId()
	 * @see #getWelcomeFileType()
	 * @generated
	 */
	EAttribute getWelcomeFileType_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Webapp23Factory getWebapp23Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.AuthConstraintTypeImpl <em>Auth Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.AuthConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getAuthConstraintType()
		 * @generated
		 */
		EClass AUTH_CONSTRAINT_TYPE = eINSTANCE.getAuthConstraintType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTH_CONSTRAINT_TYPE__DESCRIPTION = eINSTANCE.getAuthConstraintType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTH_CONSTRAINT_TYPE__ROLE_NAME = eINSTANCE.getAuthConstraintType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_CONSTRAINT_TYPE__ID = eINSTANCE.getAuthConstraintType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.AuthMethodTypeImpl <em>Auth Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.AuthMethodTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getAuthMethodType()
		 * @generated
		 */
		EClass AUTH_METHOD_TYPE = eINSTANCE.getAuthMethodType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_METHOD_TYPE__MIXED = eINSTANCE.getAuthMethodType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_METHOD_TYPE__ID = eINSTANCE.getAuthMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ContextParamTypeImpl <em>Context Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ContextParamTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getContextParamType()
		 * @generated
		 */
		EClass CONTEXT_PARAM_TYPE = eINSTANCE.getContextParamType();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAM_TYPE__PARAM_NAME = eINSTANCE.getContextParamType_ParamName();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAM_TYPE__PARAM_VALUE = eINSTANCE.getContextParamType_ParamValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAM_TYPE__DESCRIPTION = eINSTANCE.getContextParamType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAM_TYPE__ID = eINSTANCE.getContextParamType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DescriptionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDescriptionType()
		 * @generated
		 */
		EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__MIXED = eINSTANCE.getDescriptionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__ID = eINSTANCE.getDescriptionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DisplayNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDisplayNameType()
		 * @generated
		 */
		EClass DISPLAY_NAME_TYPE = eINSTANCE.getDisplayNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME_TYPE__MIXED = eINSTANCE.getDisplayNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME_TYPE__ID = eINSTANCE.getDisplayNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DistributableTypeImpl <em>Distributable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DistributableTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDistributableType()
		 * @generated
		 */
		EClass DISTRIBUTABLE_TYPE = eINSTANCE.getDistributableType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTABLE_TYPE__ID = eINSTANCE.getDistributableType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.DocumentRootImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Auth Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTH_CONSTRAINT = eINSTANCE.getDocumentRoot_AuthConstraint();

		/**
		 * The meta object literal for the '<em><b>Auth Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTH_METHOD = eINSTANCE.getDocumentRoot_AuthMethod();

		/**
		 * The meta object literal for the '<em><b>Context Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTEXT_PARAM = eINSTANCE.getDocumentRoot_ContextParam();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DISPLAY_NAME = eINSTANCE.getDocumentRoot_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Distributable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DISTRIBUTABLE = eINSTANCE.getDocumentRoot_Distributable();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_LINK = eINSTANCE.getDocumentRoot_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_LOCAL_REF = eINSTANCE.getDocumentRoot_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_REF = eINSTANCE.getDocumentRoot_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_REF_NAME = eINSTANCE.getDocumentRoot_EjbRefName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_REF_TYPE = eINSTANCE.getDocumentRoot_EjbRefType();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENV_ENTRY = eINSTANCE.getDocumentRoot_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Env Entry Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENV_ENTRY_NAME = eINSTANCE.getDocumentRoot_EnvEntryName();

		/**
		 * The meta object literal for the '<em><b>Env Entry Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENV_ENTRY_TYPE = eINSTANCE.getDocumentRoot_EnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Env Entry Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENV_ENTRY_VALUE = eINSTANCE.getDocumentRoot_EnvEntryValue();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ERROR_CODE = eINSTANCE.getDocumentRoot_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Error Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ERROR_PAGE = eINSTANCE.getDocumentRoot_ErrorPage();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCEPTION_TYPE = eINSTANCE.getDocumentRoot_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSION = eINSTANCE.getDocumentRoot_Extension();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER = eINSTANCE.getDocumentRoot_Filter();

		/**
		 * The meta object literal for the '<em><b>Filter Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER_CLASS = eINSTANCE.getDocumentRoot_FilterClass();

		/**
		 * The meta object literal for the '<em><b>Filter Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER_MAPPING = eINSTANCE.getDocumentRoot_FilterMapping();

		/**
		 * The meta object literal for the '<em><b>Filter Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER_NAME = eINSTANCE.getDocumentRoot_FilterName();

		/**
		 * The meta object literal for the '<em><b>Form Error Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORM_ERROR_PAGE = eINSTANCE.getDocumentRoot_FormErrorPage();

		/**
		 * The meta object literal for the '<em><b>Form Login Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORM_LOGIN_CONFIG = eINSTANCE.getDocumentRoot_FormLoginConfig();

		/**
		 * The meta object literal for the '<em><b>Form Login Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORM_LOGIN_PAGE = eINSTANCE.getDocumentRoot_FormLoginPage();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HOME = eINSTANCE.getDocumentRoot_Home();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HTTP_METHOD = eINSTANCE.getDocumentRoot_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ICON = eINSTANCE.getDocumentRoot_Icon();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INIT_PARAM = eINSTANCE.getDocumentRoot_InitParam();

		/**
		 * The meta object literal for the '<em><b>Jsp File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__JSP_FILE = eINSTANCE.getDocumentRoot_JspFile();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LARGE_ICON = eINSTANCE.getDocumentRoot_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LISTENER = eINSTANCE.getDocumentRoot_Listener();

		/**
		 * The meta object literal for the '<em><b>Listener Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LISTENER_CLASS = eINSTANCE.getDocumentRoot_ListenerClass();

		/**
		 * The meta object literal for the '<em><b>Load On Startup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOAD_ON_STARTUP = eINSTANCE.getDocumentRoot_LoadOnStartup();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCAL = eINSTANCE.getDocumentRoot_Local();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCAL_HOME = eINSTANCE.getDocumentRoot_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION = eINSTANCE.getDocumentRoot_Location();

		/**
		 * The meta object literal for the '<em><b>Login Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOGIN_CONFIG = eINSTANCE.getDocumentRoot_LoginConfig();

		/**
		 * The meta object literal for the '<em><b>Mime Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MIME_MAPPING = eINSTANCE.getDocumentRoot_MimeMapping();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MIME_TYPE = eINSTANCE.getDocumentRoot_MimeType();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAM_NAME = eINSTANCE.getDocumentRoot_ParamName();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAM_VALUE = eINSTANCE.getDocumentRoot_ParamValue();

		/**
		 * The meta object literal for the '<em><b>Realm Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REALM_NAME = eINSTANCE.getDocumentRoot_RealmName();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOTE = eINSTANCE.getDocumentRoot_Remote();

		/**
		 * The meta object literal for the '<em><b>Res Auth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RES_AUTH = eINSTANCE.getDocumentRoot_ResAuth();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE_ENV_REF = eINSTANCE.getDocumentRoot_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME = eINSTANCE.getDocumentRoot_ResourceEnvRefName();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE = eINSTANCE.getDocumentRoot_ResourceEnvRefType();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE_REF = eINSTANCE.getDocumentRoot_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Res Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RES_REF_NAME = eINSTANCE.getDocumentRoot_ResRefName();

		/**
		 * The meta object literal for the '<em><b>Res Sharing Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RES_SHARING_SCOPE = eINSTANCE.getDocumentRoot_ResSharingScope();

		/**
		 * The meta object literal for the '<em><b>Res Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RES_TYPE = eINSTANCE.getDocumentRoot_ResType();

		/**
		 * The meta object literal for the '<em><b>Role Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROLE_LINK = eINSTANCE.getDocumentRoot_RoleLink();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROLE_NAME = eINSTANCE.getDocumentRoot_RoleName();

		/**
		 * The meta object literal for the '<em><b>Run As</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RUN_AS = eINSTANCE.getDocumentRoot_RunAs();

		/**
		 * The meta object literal for the '<em><b>Security Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECURITY_CONSTRAINT = eINSTANCE.getDocumentRoot_SecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Security Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECURITY_ROLE = eINSTANCE.getDocumentRoot_SecurityRole();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECURITY_ROLE_REF = eINSTANCE.getDocumentRoot_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Servlet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVLET = eINSTANCE.getDocumentRoot_Servlet();

		/**
		 * The meta object literal for the '<em><b>Servlet Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVLET_CLASS = eINSTANCE.getDocumentRoot_ServletClass();

		/**
		 * The meta object literal for the '<em><b>Servlet Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVLET_MAPPING = eINSTANCE.getDocumentRoot_ServletMapping();

		/**
		 * The meta object literal for the '<em><b>Servlet Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVLET_NAME = eINSTANCE.getDocumentRoot_ServletName();

		/**
		 * The meta object literal for the '<em><b>Session Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SESSION_CONFIG = eINSTANCE.getDocumentRoot_SessionConfig();

		/**
		 * The meta object literal for the '<em><b>Session Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SESSION_TIMEOUT = eINSTANCE.getDocumentRoot_SessionTimeout();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SMALL_ICON = eINSTANCE.getDocumentRoot_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Taglib</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TAGLIB = eINSTANCE.getDocumentRoot_Taglib();

		/**
		 * The meta object literal for the '<em><b>Taglib Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TAGLIB_LOCATION = eINSTANCE.getDocumentRoot_TaglibLocation();

		/**
		 * The meta object literal for the '<em><b>Taglib Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TAGLIB_URI = eINSTANCE.getDocumentRoot_TaglibUri();

		/**
		 * The meta object literal for the '<em><b>Transport Guarantee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSPORT_GUARANTEE = eINSTANCE.getDocumentRoot_TransportGuarantee();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__URL_PATTERN = eINSTANCE.getDocumentRoot_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>User Data Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_DATA_CONSTRAINT = eINSTANCE.getDocumentRoot_UserDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Web App</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEB_APP = eINSTANCE.getDocumentRoot_WebApp();

		/**
		 * The meta object literal for the '<em><b>Web Resource Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION = eINSTANCE.getDocumentRoot_WebResourceCollection();

		/**
		 * The meta object literal for the '<em><b>Web Resource Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEB_RESOURCE_NAME = eINSTANCE.getDocumentRoot_WebResourceName();

		/**
		 * The meta object literal for the '<em><b>Welcome File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WELCOME_FILE = eINSTANCE.getDocumentRoot_WelcomeFile();

		/**
		 * The meta object literal for the '<em><b>Welcome File List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WELCOME_FILE_LIST = eINSTANCE.getDocumentRoot_WelcomeFileList();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLinkTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbLinkType()
		 * @generated
		 */
		EClass EJB_LINK_TYPE = eINSTANCE.getEjbLinkType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LINK_TYPE__MIXED = eINSTANCE.getEjbLinkType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LINK_TYPE__ID = eINSTANCE.getEjbLinkType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbLocalRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbLocalRefType()
		 * @generated
		 */
		EClass EJB_LOCAL_REF_TYPE = eINSTANCE.getEjbLocalRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__DESCRIPTION = eINSTANCE.getEjbLocalRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__EJB_REF_NAME = eINSTANCE.getEjbLocalRefType_EjbRefName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__EJB_REF_TYPE = eINSTANCE.getEjbLocalRefType_EjbRefType();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__LOCAL_HOME = eINSTANCE.getEjbLocalRefType_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__LOCAL = eINSTANCE.getEjbLocalRefType_Local();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__EJB_LINK = eINSTANCE.getEjbLocalRefType_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF_TYPE__ID = eINSTANCE.getEjbLocalRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbRefNameType()
		 * @generated
		 */
		EClass EJB_REF_NAME_TYPE = eINSTANCE.getEjbRefNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF_NAME_TYPE__MIXED = eINSTANCE.getEjbRefNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF_NAME_TYPE__ID = eINSTANCE.getEjbRefNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbRefType()
		 * @generated
		 */
		EClass EJB_REF_TYPE = eINSTANCE.getEjbRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__DESCRIPTION = eINSTANCE.getEjbRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__EJB_REF_NAME = eINSTANCE.getEjbRefType_EjbRefName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__EJB_REF_TYPE = eINSTANCE.getEjbRefType_EjbRefType();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__HOME = eINSTANCE.getEjbRefType_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__REMOTE = eINSTANCE.getEjbRefType_Remote();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__EJB_LINK = eINSTANCE.getEjbRefType_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF_TYPE__ID = eINSTANCE.getEjbRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EjbRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEjbRefTypeType()
		 * @generated
		 */
		EClass EJB_REF_TYPE_TYPE = eINSTANCE.getEjbRefTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF_TYPE_TYPE__MIXED = eINSTANCE.getEjbRefTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF_TYPE_TYPE__ID = eINSTANCE.getEjbRefTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryNameType()
		 * @generated
		 */
		EClass ENV_ENTRY_NAME_TYPE = eINSTANCE.getEnvEntryNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_NAME_TYPE__MIXED = eINSTANCE.getEnvEntryNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_NAME_TYPE__ID = eINSTANCE.getEnvEntryNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryType()
		 * @generated
		 */
		EClass ENV_ENTRY_TYPE = eINSTANCE.getEnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__DESCRIPTION = eINSTANCE.getEnvEntryType_Description();

		/**
		 * The meta object literal for the '<em><b>Env Entry Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_NAME = eINSTANCE.getEnvEntryType_EnvEntryName();

		/**
		 * The meta object literal for the '<em><b>Env Entry Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_VALUE = eINSTANCE.getEnvEntryType_EnvEntryValue();

		/**
		 * The meta object literal for the '<em><b>Env Entry Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_TYPE = eINSTANCE.getEnvEntryType_EnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_TYPE__ID = eINSTANCE.getEnvEntryType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryTypeType()
		 * @generated
		 */
		EClass ENV_ENTRY_TYPE_TYPE = eINSTANCE.getEnvEntryTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_TYPE_TYPE__MIXED = eINSTANCE.getEnvEntryTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_TYPE_TYPE__ID = eINSTANCE.getEnvEntryTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryValueTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getEnvEntryValueType()
		 * @generated
		 */
		EClass ENV_ENTRY_VALUE_TYPE = eINSTANCE.getEnvEntryValueType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_VALUE_TYPE__MIXED = eINSTANCE.getEnvEntryValueType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_VALUE_TYPE__ID = eINSTANCE.getEnvEntryValueType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorCodeTypeImpl <em>Error Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorCodeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getErrorCodeType()
		 * @generated
		 */
		EClass ERROR_CODE_TYPE = eINSTANCE.getErrorCodeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CODE_TYPE__MIXED = eINSTANCE.getErrorCodeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CODE_TYPE__ID = eINSTANCE.getErrorCodeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl <em>Error Page Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getErrorPageType()
		 * @generated
		 */
		EClass ERROR_PAGE_TYPE = eINSTANCE.getErrorPageType();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PAGE_TYPE__ERROR_CODE = eINSTANCE.getErrorPageType_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PAGE_TYPE__EXCEPTION_TYPE = eINSTANCE.getErrorPageType_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PAGE_TYPE__LOCATION = eINSTANCE.getErrorPageType_Location();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PAGE_TYPE__ID = eINSTANCE.getErrorPageType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ExceptionTypeTypeImpl <em>Exception Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ExceptionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getExceptionTypeType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE_TYPE = eINSTANCE.getExceptionTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE_TYPE__MIXED = eINSTANCE.getExceptionTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE_TYPE__ID = eINSTANCE.getExceptionTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ExtensionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getExtensionType()
		 * @generated
		 */
		EClass EXTENSION_TYPE = eINSTANCE.getExtensionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TYPE__MIXED = eINSTANCE.getExtensionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TYPE__ID = eINSTANCE.getExtensionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterClassTypeImpl <em>Filter Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterClassTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterClassType()
		 * @generated
		 */
		EClass FILTER_CLASS_TYPE = eINSTANCE.getFilterClassType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CLASS_TYPE__MIXED = eINSTANCE.getFilterClassType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CLASS_TYPE__ID = eINSTANCE.getFilterClassType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterMappingTypeImpl <em>Filter Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterMappingType()
		 * @generated
		 */
		EClass FILTER_MAPPING_TYPE = eINSTANCE.getFilterMappingType();

		/**
		 * The meta object literal for the '<em><b>Filter Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MAPPING_TYPE__FILTER_NAME = eINSTANCE.getFilterMappingType_FilterName();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MAPPING_TYPE__URL_PATTERN = eINSTANCE.getFilterMappingType_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>Servlet Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MAPPING_TYPE__SERVLET_NAME = eINSTANCE.getFilterMappingType_ServletName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_MAPPING_TYPE__ID = eINSTANCE.getFilterMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterNameTypeImpl <em>Filter Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterNameType()
		 * @generated
		 */
		EClass FILTER_NAME_TYPE = eINSTANCE.getFilterNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_NAME_TYPE__MIXED = eINSTANCE.getFilterNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_NAME_TYPE__ID = eINSTANCE.getFilterNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl <em>Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFilterType()
		 * @generated
		 */
		EClass FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__ICON = eINSTANCE.getFilterType_Icon();

		/**
		 * The meta object literal for the '<em><b>Filter Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__FILTER_NAME = eINSTANCE.getFilterType_FilterName();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__DISPLAY_NAME = eINSTANCE.getFilterType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__DESCRIPTION = eINSTANCE.getFilterType_Description();

		/**
		 * The meta object literal for the '<em><b>Filter Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__FILTER_CLASS = eINSTANCE.getFilterType_FilterClass();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__INIT_PARAM = eINSTANCE.getFilterType_InitParam();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TYPE__ID = eINSTANCE.getFilterType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FormErrorPageTypeImpl <em>Form Error Page Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FormErrorPageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFormErrorPageType()
		 * @generated
		 */
		EClass FORM_ERROR_PAGE_TYPE = eINSTANCE.getFormErrorPageType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ERROR_PAGE_TYPE__MIXED = eINSTANCE.getFormErrorPageType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ERROR_PAGE_TYPE__ID = eINSTANCE.getFormErrorPageType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginConfigTypeImpl <em>Form Login Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFormLoginConfigType()
		 * @generated
		 */
		EClass FORM_LOGIN_CONFIG_TYPE = eINSTANCE.getFormLoginConfigType();

		/**
		 * The meta object literal for the '<em><b>Form Login Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE = eINSTANCE.getFormLoginConfigType_FormLoginPage();

		/**
		 * The meta object literal for the '<em><b>Form Error Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE = eINSTANCE.getFormLoginConfigType_FormErrorPage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LOGIN_CONFIG_TYPE__ID = eINSTANCE.getFormLoginConfigType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginPageTypeImpl <em>Form Login Page Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.FormLoginPageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getFormLoginPageType()
		 * @generated
		 */
		EClass FORM_LOGIN_PAGE_TYPE = eINSTANCE.getFormLoginPageType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LOGIN_PAGE_TYPE__MIXED = eINSTANCE.getFormLoginPageType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LOGIN_PAGE_TYPE__ID = eINSTANCE.getFormLoginPageType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.HomeTypeImpl <em>Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.HomeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getHomeType()
		 * @generated
		 */
		EClass HOME_TYPE = eINSTANCE.getHomeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME_TYPE__MIXED = eINSTANCE.getHomeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME_TYPE__ID = eINSTANCE.getHomeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.HttpMethodTypeImpl <em>Http Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.HttpMethodTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getHttpMethodType()
		 * @generated
		 */
		EClass HTTP_METHOD_TYPE = eINSTANCE.getHttpMethodType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD_TYPE__MIXED = eINSTANCE.getHttpMethodType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD_TYPE__ID = eINSTANCE.getHttpMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.IconTypeImpl <em>Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.IconTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getIconType()
		 * @generated
		 */
		EClass ICON_TYPE = eINSTANCE.getIconType();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_TYPE__SMALL_ICON = eINSTANCE.getIconType_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_TYPE__LARGE_ICON = eINSTANCE.getIconType_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__ID = eINSTANCE.getIconType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl <em>Init Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getInitParamType()
		 * @generated
		 */
		EClass INIT_PARAM_TYPE = eINSTANCE.getInitParamType();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_PARAM_TYPE__PARAM_NAME = eINSTANCE.getInitParamType_ParamName();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_PARAM_TYPE__PARAM_VALUE = eINSTANCE.getInitParamType_ParamValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_PARAM_TYPE__DESCRIPTION = eINSTANCE.getInitParamType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_PARAM_TYPE__ID = eINSTANCE.getInitParamType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.JspFileTypeImpl <em>Jsp File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.JspFileTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getJspFileType()
		 * @generated
		 */
		EClass JSP_FILE_TYPE = eINSTANCE.getJspFileType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP_FILE_TYPE__MIXED = eINSTANCE.getJspFileType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP_FILE_TYPE__ID = eINSTANCE.getJspFileType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LargeIconTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLargeIconType()
		 * @generated
		 */
		EClass LARGE_ICON_TYPE = eINSTANCE.getLargeIconType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_ICON_TYPE__MIXED = eINSTANCE.getLargeIconType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_ICON_TYPE__ID = eINSTANCE.getLargeIconType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassImpl <em>Listener Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getListenerClass()
		 * @generated
		 */
		EClass LISTENER_CLASS = eINSTANCE.getListenerClass();

		/**
		 * The meta object literal for the '<em><b>Listener Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_CLASS__LISTENER_CLASS = eINSTANCE.getListenerClass_ListenerClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassTypeImpl <em>Listener Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getListenerClassType()
		 * @generated
		 */
		EClass LISTENER_CLASS_TYPE = eINSTANCE.getListenerClassType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER_CLASS_TYPE__MIXED = eINSTANCE.getListenerClassType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER_CLASS_TYPE__ID = eINSTANCE.getListenerClassType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getListenerType()
		 * @generated
		 */
		EClass LISTENER_TYPE = eINSTANCE.getListenerType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER_TYPE__ID = eINSTANCE.getListenerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoadOnStartupTypeImpl <em>Load On Startup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LoadOnStartupTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLoadOnStartupType()
		 * @generated
		 */
		EClass LOAD_ON_STARTUP_TYPE = eINSTANCE.getLoadOnStartupType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_ON_STARTUP_TYPE__MIXED = eINSTANCE.getLoadOnStartupType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_ON_STARTUP_TYPE__ID = eINSTANCE.getLoadOnStartupType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LocalHomeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLocalHomeType()
		 * @generated
		 */
		EClass LOCAL_HOME_TYPE = eINSTANCE.getLocalHomeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_HOME_TYPE__MIXED = eINSTANCE.getLocalHomeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_HOME_TYPE__ID = eINSTANCE.getLocalHomeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LocalTypeImpl <em>Local Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LocalTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLocalType()
		 * @generated
		 */
		EClass LOCAL_TYPE = eINSTANCE.getLocalType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_TYPE__MIXED = eINSTANCE.getLocalType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_TYPE__ID = eINSTANCE.getLocalType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LocationTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__MIXED = eINSTANCE.getLocationType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__ID = eINSTANCE.getLocationType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl <em>Login Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getLoginConfigType()
		 * @generated
		 */
		EClass LOGIN_CONFIG_TYPE = eINSTANCE.getLoginConfigType();

		/**
		 * The meta object literal for the '<em><b>Auth Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONFIG_TYPE__AUTH_METHOD = eINSTANCE.getLoginConfigType_AuthMethod();

		/**
		 * The meta object literal for the '<em><b>Realm Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONFIG_TYPE__REALM_NAME = eINSTANCE.getLoginConfigType_RealmName();

		/**
		 * The meta object literal for the '<em><b>Form Login Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG = eINSTANCE.getLoginConfigType_FormLoginConfig();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_CONFIG_TYPE__ID = eINSTANCE.getLoginConfigType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.MimeMappingTypeImpl <em>Mime Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.MimeMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getMimeMappingType()
		 * @generated
		 */
		EClass MIME_MAPPING_TYPE = eINSTANCE.getMimeMappingType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_MAPPING_TYPE__EXTENSION = eINSTANCE.getMimeMappingType_Extension();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIME_MAPPING_TYPE__MIME_TYPE = eINSTANCE.getMimeMappingType_MimeType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_MAPPING_TYPE__ID = eINSTANCE.getMimeMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.MimeTypeTypeImpl <em>Mime Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.MimeTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getMimeTypeType()
		 * @generated
		 */
		EClass MIME_TYPE_TYPE = eINSTANCE.getMimeTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE_TYPE__MIXED = eINSTANCE.getMimeTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_TYPE_TYPE__ID = eINSTANCE.getMimeTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ParamNameTypeImpl <em>Param Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ParamNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getParamNameType()
		 * @generated
		 */
		EClass PARAM_NAME_TYPE = eINSTANCE.getParamNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_NAME_TYPE__MIXED = eINSTANCE.getParamNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_NAME_TYPE__ID = eINSTANCE.getParamNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ParamValueTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getParamValueType()
		 * @generated
		 */
		EClass PARAM_VALUE_TYPE = eINSTANCE.getParamValueType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE_TYPE__MIXED = eINSTANCE.getParamValueType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE_TYPE__ID = eINSTANCE.getParamValueType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RealmNameTypeImpl <em>Realm Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RealmNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRealmNameType()
		 * @generated
		 */
		EClass REALM_NAME_TYPE = eINSTANCE.getRealmNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALM_NAME_TYPE__MIXED = eINSTANCE.getRealmNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALM_NAME_TYPE__ID = eINSTANCE.getRealmNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RemoteTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRemoteType()
		 * @generated
		 */
		EClass REMOTE_TYPE = eINSTANCE.getRemoteType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TYPE__MIXED = eINSTANCE.getRemoteType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_TYPE__ID = eINSTANCE.getRemoteType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResAuthTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResAuthType()
		 * @generated
		 */
		EClass RES_AUTH_TYPE = eINSTANCE.getResAuthType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_AUTH_TYPE__MIXED = eINSTANCE.getResAuthType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_AUTH_TYPE__ID = eINSTANCE.getResAuthType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefNameTypeImpl <em>Resource Env Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceEnvRefNameType()
		 * @generated
		 */
		EClass RESOURCE_ENV_REF_NAME_TYPE = eINSTANCE.getResourceEnvRefNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF_NAME_TYPE__MIXED = eINSTANCE.getResourceEnvRefNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF_NAME_TYPE__ID = eINSTANCE.getResourceEnvRefNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceEnvRefType()
		 * @generated
		 */
		EClass RESOURCE_ENV_REF_TYPE = eINSTANCE.getResourceEnvRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF_TYPE__DESCRIPTION = eINSTANCE.getResourceEnvRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME = eINSTANCE.getResourceEnvRefType_ResourceEnvRefName();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE = eINSTANCE.getResourceEnvRefType_ResourceEnvRefType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF_TYPE__ID = eINSTANCE.getResourceEnvRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeTypeImpl <em>Resource Env Ref Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceEnvRefTypeType()
		 * @generated
		 */
		EClass RESOURCE_ENV_REF_TYPE_TYPE = eINSTANCE.getResourceEnvRefTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF_TYPE_TYPE__MIXED = eINSTANCE.getResourceEnvRefTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF_TYPE_TYPE__ID = eINSTANCE.getResourceEnvRefTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResourceRefType()
		 * @generated
		 */
		EClass RESOURCE_REF_TYPE = eINSTANCE.getResourceRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__DESCRIPTION = eINSTANCE.getResourceRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Res Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_REF_NAME = eINSTANCE.getResourceRefType_ResRefName();

		/**
		 * The meta object literal for the '<em><b>Res Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_TYPE = eINSTANCE.getResourceRefType_ResType();

		/**
		 * The meta object literal for the '<em><b>Res Auth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_AUTH = eINSTANCE.getResourceRefType_ResAuth();

		/**
		 * The meta object literal for the '<em><b>Res Sharing Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_SHARING_SCOPE = eINSTANCE.getResourceRefType_ResSharingScope();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF_TYPE__ID = eINSTANCE.getResourceRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResRefNameType()
		 * @generated
		 */
		EClass RES_REF_NAME_TYPE = eINSTANCE.getResRefNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_REF_NAME_TYPE__MIXED = eINSTANCE.getResRefNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_REF_NAME_TYPE__ID = eINSTANCE.getResRefNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResSharingScopeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResSharingScopeType()
		 * @generated
		 */
		EClass RES_SHARING_SCOPE_TYPE = eINSTANCE.getResSharingScopeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_SHARING_SCOPE_TYPE__MIXED = eINSTANCE.getResSharingScopeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_SHARING_SCOPE_TYPE__ID = eINSTANCE.getResSharingScopeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ResTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getResTypeType()
		 * @generated
		 */
		EClass RES_TYPE_TYPE = eINSTANCE.getResTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TYPE_TYPE__MIXED = eINSTANCE.getResTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TYPE_TYPE__ID = eINSTANCE.getResTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RoleLinkTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRoleLinkType()
		 * @generated
		 */
		EClass ROLE_LINK_TYPE = eINSTANCE.getRoleLinkType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_LINK_TYPE__MIXED = eINSTANCE.getRoleLinkType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_LINK_TYPE__ID = eINSTANCE.getRoleLinkType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RoleNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRoleNameType()
		 * @generated
		 */
		EClass ROLE_NAME_TYPE = eINSTANCE.getRoleNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_NAME_TYPE__MIXED = eINSTANCE.getRoleNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_NAME_TYPE__ID = eINSTANCE.getRoleNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.RunAsTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getRunAsType()
		 * @generated
		 */
		EClass RUN_AS_TYPE = eINSTANCE.getRunAsType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_AS_TYPE__DESCRIPTION = eINSTANCE.getRunAsType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_AS_TYPE__ROLE_NAME = eINSTANCE.getRunAsType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_AS_TYPE__ID = eINSTANCE.getRunAsType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityConstraintTypeImpl <em>Security Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSecurityConstraintType()
		 * @generated
		 */
		EClass SECURITY_CONSTRAINT_TYPE = eINSTANCE.getSecurityConstraintType();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME = eINSTANCE.getSecurityConstraintType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Web Resource Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION = eINSTANCE.getSecurityConstraintType_WebResourceCollection();

		/**
		 * The meta object literal for the '<em><b>Auth Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT = eINSTANCE.getSecurityConstraintType_AuthConstraint();

		/**
		 * The meta object literal for the '<em><b>User Data Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT = eINSTANCE.getSecurityConstraintType_UserDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINT_TYPE__ID = eINSTANCE.getSecurityConstraintType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSecurityRoleRefType()
		 * @generated
		 */
		EClass SECURITY_ROLE_REF_TYPE = eINSTANCE.getSecurityRoleRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_REF_TYPE__DESCRIPTION = eINSTANCE.getSecurityRoleRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_REF_TYPE__ROLE_NAME = eINSTANCE.getSecurityRoleRefType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Role Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_REF_TYPE__ROLE_LINK = eINSTANCE.getSecurityRoleRefType_RoleLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE_REF_TYPE__ID = eINSTANCE.getSecurityRoleRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SecurityRoleTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSecurityRoleType()
		 * @generated
		 */
		EClass SECURITY_ROLE_TYPE = eINSTANCE.getSecurityRoleType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_TYPE__DESCRIPTION = eINSTANCE.getSecurityRoleType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_TYPE__ROLE_NAME = eINSTANCE.getSecurityRoleType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE_TYPE__ID = eINSTANCE.getSecurityRoleType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletClassTypeImpl <em>Servlet Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletClassTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletClassType()
		 * @generated
		 */
		EClass SERVLET_CLASS_TYPE = eINSTANCE.getServletClassType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_CLASS_TYPE__MIXED = eINSTANCE.getServletClassType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_CLASS_TYPE__ID = eINSTANCE.getServletClassType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletMappingTypeImpl <em>Servlet Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletMappingType()
		 * @generated
		 */
		EClass SERVLET_MAPPING_TYPE = eINSTANCE.getServletMappingType();

		/**
		 * The meta object literal for the '<em><b>Servlet Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_MAPPING_TYPE__SERVLET_NAME = eINSTANCE.getServletMappingType_ServletName();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_MAPPING_TYPE__URL_PATTERN = eINSTANCE.getServletMappingType_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_MAPPING_TYPE__ID = eINSTANCE.getServletMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletNameTypeImpl <em>Servlet Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletNameType()
		 * @generated
		 */
		EClass SERVLET_NAME_TYPE = eINSTANCE.getServletNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_NAME_TYPE__MIXED = eINSTANCE.getServletNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_NAME_TYPE__ID = eINSTANCE.getServletNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl <em>Servlet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.ServletTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getServletType()
		 * @generated
		 */
		EClass SERVLET_TYPE = eINSTANCE.getServletType();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__ICON = eINSTANCE.getServletType_Icon();

		/**
		 * The meta object literal for the '<em><b>Servlet Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__SERVLET_NAME = eINSTANCE.getServletType_ServletName();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__DISPLAY_NAME = eINSTANCE.getServletType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__DESCRIPTION = eINSTANCE.getServletType_Description();

		/**
		 * The meta object literal for the '<em><b>Servlet Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__SERVLET_CLASS = eINSTANCE.getServletType_ServletClass();

		/**
		 * The meta object literal for the '<em><b>Jsp File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__JSP_FILE = eINSTANCE.getServletType_JspFile();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__INIT_PARAM = eINSTANCE.getServletType_InitParam();

		/**
		 * The meta object literal for the '<em><b>Load On Startup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__LOAD_ON_STARTUP = eINSTANCE.getServletType_LoadOnStartup();

		/**
		 * The meta object literal for the '<em><b>Run As</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__RUN_AS = eINSTANCE.getServletType_RunAs();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__SECURITY_ROLE_REF = eINSTANCE.getServletType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_TYPE__ID = eINSTANCE.getServletType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SessionConfigTypeImpl <em>Session Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SessionConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSessionConfigType()
		 * @generated
		 */
		EClass SESSION_CONFIG_TYPE = eINSTANCE.getSessionConfigType();

		/**
		 * The meta object literal for the '<em><b>Session Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_CONFIG_TYPE__SESSION_TIMEOUT = eINSTANCE.getSessionConfigType_SessionTimeout();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_CONFIG_TYPE__ID = eINSTANCE.getSessionConfigType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SessionTimeoutTypeImpl <em>Session Timeout Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SessionTimeoutTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSessionTimeoutType()
		 * @generated
		 */
		EClass SESSION_TIMEOUT_TYPE = eINSTANCE.getSessionTimeoutType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TIMEOUT_TYPE__MIXED = eINSTANCE.getSessionTimeoutType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TIMEOUT_TYPE__ID = eINSTANCE.getSessionTimeoutType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.SmallIconTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getSmallIconType()
		 * @generated
		 */
		EClass SMALL_ICON_TYPE = eINSTANCE.getSmallIconType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_ICON_TYPE__MIXED = eINSTANCE.getSmallIconType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_ICON_TYPE__ID = eINSTANCE.getSmallIconType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibLocationTypeImpl <em>Taglib Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibLocationTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTaglibLocationType()
		 * @generated
		 */
		EClass TAGLIB_LOCATION_TYPE = eINSTANCE.getTaglibLocationType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGLIB_LOCATION_TYPE__MIXED = eINSTANCE.getTaglibLocationType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGLIB_LOCATION_TYPE__ID = eINSTANCE.getTaglibLocationType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibTypeImpl <em>Taglib Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTaglibType()
		 * @generated
		 */
		EClass TAGLIB_TYPE = eINSTANCE.getTaglibType();

		/**
		 * The meta object literal for the '<em><b>Taglib Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGLIB_TYPE__TAGLIB_URI = eINSTANCE.getTaglibType_TaglibUri();

		/**
		 * The meta object literal for the '<em><b>Taglib Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGLIB_TYPE__TAGLIB_LOCATION = eINSTANCE.getTaglibType_TaglibLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGLIB_TYPE__ID = eINSTANCE.getTaglibType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibUriTypeImpl <em>Taglib Uri Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TaglibUriTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTaglibUriType()
		 * @generated
		 */
		EClass TAGLIB_URI_TYPE = eINSTANCE.getTaglibUriType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGLIB_URI_TYPE__MIXED = eINSTANCE.getTaglibUriType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGLIB_URI_TYPE__ID = eINSTANCE.getTaglibUriType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.TransportGuaranteeTypeImpl <em>Transport Guarantee Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.TransportGuaranteeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getTransportGuaranteeType()
		 * @generated
		 */
		EClass TRANSPORT_GUARANTEE_TYPE = eINSTANCE.getTransportGuaranteeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_GUARANTEE_TYPE__MIXED = eINSTANCE.getTransportGuaranteeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_GUARANTEE_TYPE__ID = eINSTANCE.getTransportGuaranteeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.UrlPatternTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getUrlPatternType()
		 * @generated
		 */
		EClass URL_PATTERN_TYPE = eINSTANCE.getUrlPatternType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_PATTERN_TYPE__MIXED = eINSTANCE.getUrlPatternType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_PATTERN_TYPE__ID = eINSTANCE.getUrlPatternType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.UserDataConstraintTypeImpl <em>User Data Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.UserDataConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getUserDataConstraintType()
		 * @generated
		 */
		EClass USER_DATA_CONSTRAINT_TYPE = eINSTANCE.getUserDataConstraintType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA_CONSTRAINT_TYPE__DESCRIPTION = eINSTANCE.getUserDataConstraintType_Description();

		/**
		 * The meta object literal for the '<em><b>Transport Guarantee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE = eINSTANCE.getUserDataConstraintType_TransportGuarantee();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA_CONSTRAINT_TYPE__ID = eINSTANCE.getUserDataConstraintType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl <em>Web App Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WebAppTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWebAppType()
		 * @generated
		 */
		EClass WEB_APP_TYPE = eINSTANCE.getWebAppType();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__ICON = eINSTANCE.getWebAppType_Icon();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__DISPLAY_NAME = eINSTANCE.getWebAppType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__DESCRIPTION = eINSTANCE.getWebAppType_Description();

		/**
		 * The meta object literal for the '<em><b>Distributable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__DISTRIBUTABLE = eINSTANCE.getWebAppType_Distributable();

		/**
		 * The meta object literal for the '<em><b>Context Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__CONTEXT_PARAM = eINSTANCE.getWebAppType_ContextParam();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__FILTER = eINSTANCE.getWebAppType_Filter();

		/**
		 * The meta object literal for the '<em><b>Filter Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__FILTER_MAPPING = eINSTANCE.getWebAppType_FilterMapping();

		/**
		 * The meta object literal for the '<em><b>Listener</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__LISTENER = eINSTANCE.getWebAppType_Listener();

		/**
		 * The meta object literal for the '<em><b>Servlet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SERVLET = eINSTANCE.getWebAppType_Servlet();

		/**
		 * The meta object literal for the '<em><b>Servlet Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SERVLET_MAPPING = eINSTANCE.getWebAppType_ServletMapping();

		/**
		 * The meta object literal for the '<em><b>Session Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SESSION_CONFIG = eINSTANCE.getWebAppType_SessionConfig();

		/**
		 * The meta object literal for the '<em><b>Mime Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__MIME_MAPPING = eINSTANCE.getWebAppType_MimeMapping();

		/**
		 * The meta object literal for the '<em><b>Welcome File List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__WELCOME_FILE_LIST = eINSTANCE.getWebAppType_WelcomeFileList();

		/**
		 * The meta object literal for the '<em><b>Error Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__ERROR_PAGE = eINSTANCE.getWebAppType_ErrorPage();

		/**
		 * The meta object literal for the '<em><b>Taglib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__TAGLIB = eINSTANCE.getWebAppType_Taglib();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__RESOURCE_ENV_REF = eINSTANCE.getWebAppType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__RESOURCE_REF = eINSTANCE.getWebAppType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Security Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SECURITY_CONSTRAINT = eINSTANCE.getWebAppType_SecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Login Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__LOGIN_CONFIG = eINSTANCE.getWebAppType_LoginConfig();

		/**
		 * The meta object literal for the '<em><b>Security Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SECURITY_ROLE = eINSTANCE.getWebAppType_SecurityRole();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__ENV_ENTRY = eINSTANCE.getWebAppType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__EJB_REF = eINSTANCE.getWebAppType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__EJB_LOCAL_REF = eINSTANCE.getWebAppType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP_TYPE__ID = eINSTANCE.getWebAppType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceCollectionTypeImpl <em>Web Resource Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceCollectionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWebResourceCollectionType()
		 * @generated
		 */
		EClass WEB_RESOURCE_COLLECTION_TYPE = eINSTANCE.getWebResourceCollectionType();

		/**
		 * The meta object literal for the '<em><b>Web Resource Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME = eINSTANCE.getWebResourceCollectionType_WebResourceName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION = eINSTANCE.getWebResourceCollectionType_Description();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN = eINSTANCE.getWebResourceCollectionType_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD = eINSTANCE.getWebResourceCollectionType_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RESOURCE_COLLECTION_TYPE__ID = eINSTANCE.getWebResourceCollectionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceNameTypeImpl <em>Web Resource Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WebResourceNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWebResourceNameType()
		 * @generated
		 */
		EClass WEB_RESOURCE_NAME_TYPE = eINSTANCE.getWebResourceNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RESOURCE_NAME_TYPE__MIXED = eINSTANCE.getWebResourceNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RESOURCE_NAME_TYPE__ID = eINSTANCE.getWebResourceNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileListTypeImpl <em>Welcome File List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileListTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWelcomeFileListType()
		 * @generated
		 */
		EClass WELCOME_FILE_LIST_TYPE = eINSTANCE.getWelcomeFileListType();

		/**
		 * The meta object literal for the '<em><b>Welcome File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WELCOME_FILE_LIST_TYPE__WELCOME_FILE = eINSTANCE.getWelcomeFileListType_WelcomeFile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WELCOME_FILE_LIST_TYPE__ID = eINSTANCE.getWelcomeFileListType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileTypeImpl <em>Welcome File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.WelcomeFileTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp23.impl.Webapp23PackageImpl#getWelcomeFileType()
		 * @generated
		 */
		EClass WELCOME_FILE_TYPE = eINSTANCE.getWelcomeFileType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WELCOME_FILE_TYPE__MIXED = eINSTANCE.getWelcomeFileType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WELCOME_FILE_TYPE__ID = eINSTANCE.getWelcomeFileType_Id();

	}

} //Webapp23Package
