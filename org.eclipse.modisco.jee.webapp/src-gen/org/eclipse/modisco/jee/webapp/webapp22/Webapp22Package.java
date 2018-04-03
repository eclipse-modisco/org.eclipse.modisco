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
package org.eclipse.modisco.jee.webapp.webapp22;

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
 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Webapp22Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapp22"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/web-app_2_2.dtd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapp22"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Webapp22Package eINSTANCE = org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.AuthConstraintTypeImpl <em>Auth Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.AuthConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getAuthConstraintType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.AuthMethodTypeImpl <em>Auth Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.AuthMethodTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getAuthMethodType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ContextParamTypeImpl <em>Context Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ContextParamTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getContextParamType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDescriptionType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDisplayNameType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DistributableTypeImpl <em>Distributable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DistributableTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDistributableType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF = 10;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_NAME = 11;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_NAME = 14;

	/**
	 * The feature id for the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_CODE = 17;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_PAGE = 18;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION = 20;

	/**
	 * The feature id for the '<em><b>Form Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM_ERROR_PAGE = 21;

	/**
	 * The feature id for the '<em><b>Form Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM_LOGIN_CONFIG = 22;

	/**
	 * The feature id for the '<em><b>Form Login Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM_LOGIN_PAGE = 23;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOME = 24;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTP_METHOD = 25;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON = 26;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INIT_PARAM = 27;

	/**
	 * The feature id for the '<em><b>Jsp File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JSP_FILE = 28;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LARGE_ICON = 29;

	/**
	 * The feature id for the '<em><b>Load On Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOAD_ON_STARTUP = 30;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 31;

	/**
	 * The feature id for the '<em><b>Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGIN_CONFIG = 32;

	/**
	 * The feature id for the '<em><b>Mime Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIME_MAPPING = 33;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIME_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM_NAME = 35;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM_VALUE = 36;

	/**
	 * The feature id for the '<em><b>Realm Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REALM_NAME = 37;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE = 38;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_AUTH = 39;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_REF = 40;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_REF_NAME = 41;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Role Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_LINK = 43;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_NAME = 44;

	/**
	 * The feature id for the '<em><b>Security Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_CONSTRAINT = 45;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE = 46;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE_REF = 47;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET = 48;

	/**
	 * The feature id for the '<em><b>Servlet Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET_CLASS = 49;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET_MAPPING = 50;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVLET_NAME = 51;

	/**
	 * The feature id for the '<em><b>Session Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION_CONFIG = 52;

	/**
	 * The feature id for the '<em><b>Session Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION_TIMEOUT = 53;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SMALL_ICON = 54;

	/**
	 * The feature id for the '<em><b>Taglib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAGLIB = 55;

	/**
	 * The feature id for the '<em><b>Taglib Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAGLIB_LOCATION = 56;

	/**
	 * The feature id for the '<em><b>Taglib Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAGLIB_URI = 57;

	/**
	 * The feature id for the '<em><b>Transport Guarantee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORT_GUARANTEE = 58;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URL_PATTERN = 59;

	/**
	 * The feature id for the '<em><b>User Data Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_DATA_CONSTRAINT = 60;

	/**
	 * The feature id for the '<em><b>Web App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_APP = 61;

	/**
	 * The feature id for the '<em><b>Web Resource Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_RESOURCE_COLLECTION = 62;

	/**
	 * The feature id for the '<em><b>Web Resource Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_RESOURCE_NAME = 63;

	/**
	 * The feature id for the '<em><b>Welcome File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WELCOME_FILE = 64;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WELCOME_FILE_LIST = 65;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbLinkType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 8;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 9;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 10;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryNameType()
	 * @generated
	 */
	int ENV_ENTRY_NAME_TYPE = 11;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 12;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryTypeType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_TYPE = 13;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryValueTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryValueType()
	 * @generated
	 */
	int ENV_ENTRY_VALUE_TYPE = 14;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorCodeTypeImpl <em>Error Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorCodeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getErrorCodeType()
	 * @generated
	 */
	int ERROR_CODE_TYPE = 15;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorPageTypeImpl <em>Error Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getErrorPageType()
	 * @generated
	 */
	int ERROR_PAGE_TYPE = 16;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ExceptionTypeTypeImpl <em>Exception Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ExceptionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getExceptionTypeType()
	 * @generated
	 */
	int EXCEPTION_TYPE_TYPE = 17;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ExtensionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getExtensionType()
	 * @generated
	 */
	int EXTENSION_TYPE = 18;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.FormErrorPageTypeImpl <em>Form Error Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.FormErrorPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getFormErrorPageType()
	 * @generated
	 */
	int FORM_ERROR_PAGE_TYPE = 19;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginConfigTypeImpl <em>Form Login Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getFormLoginConfigType()
	 * @generated
	 */
	int FORM_LOGIN_CONFIG_TYPE = 20;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginPageTypeImpl <em>Form Login Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getFormLoginPageType()
	 * @generated
	 */
	int FORM_LOGIN_PAGE_TYPE = 21;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 22;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.HttpMethodTypeImpl <em>Http Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.HttpMethodTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getHttpMethodType()
	 * @generated
	 */
	int HTTP_METHOD_TYPE = 23;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.IconTypeImpl <em>Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.IconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 24;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.InitParamTypeImpl <em>Init Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.InitParamTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getInitParamType()
	 * @generated
	 */
	int INIT_PARAM_TYPE = 25;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.JspFileTypeImpl <em>Jsp File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.JspFileTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getJspFileType()
	 * @generated
	 */
	int JSP_FILE_TYPE = 26;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LargeIconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLargeIconType()
	 * @generated
	 */
	int LARGE_ICON_TYPE = 27;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LoadOnStartupTypeImpl <em>Load On Startup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LoadOnStartupTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLoadOnStartupType()
	 * @generated
	 */
	int LOAD_ON_STARTUP_TYPE = 28;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LocationTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 29;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LoginConfigTypeImpl <em>Login Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLoginConfigType()
	 * @generated
	 */
	int LOGIN_CONFIG_TYPE = 30;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.MimeMappingTypeImpl <em>Mime Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.MimeMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getMimeMappingType()
	 * @generated
	 */
	int MIME_MAPPING_TYPE = 31;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.MimeTypeTypeImpl <em>Mime Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.MimeTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getMimeTypeType()
	 * @generated
	 */
	int MIME_TYPE_TYPE = 32;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ParamNameTypeImpl <em>Param Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ParamNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getParamNameType()
	 * @generated
	 */
	int PARAM_NAME_TYPE = 33;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ParamValueTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getParamValueType()
	 * @generated
	 */
	int PARAM_VALUE_TYPE = 34;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RealmNameTypeImpl <em>Realm Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RealmNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRealmNameType()
	 * @generated
	 */
	int REALM_NAME_TYPE = 35;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 36;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 37;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 38;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Resource Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResRefNameType()
	 * @generated
	 */
	int RES_REF_NAME_TYPE = 39;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResTypeType()
	 * @generated
	 */
	int RES_TYPE_TYPE = 40;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RoleLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRoleLinkType()
	 * @generated
	 */
	int ROLE_LINK_TYPE = 41;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 42;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityConstraintTypeImpl <em>Security Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSecurityConstraintType()
	 * @generated
	 */
	int SECURITY_CONSTRAINT_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Web Resource Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Auth Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>User Data Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Security Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 44;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 45;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletClassTypeImpl <em>Servlet Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletClassTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletClassType()
	 * @generated
	 */
	int SERVLET_CLASS_TYPE = 46;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletMappingTypeImpl <em>Servlet Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletMappingType()
	 * @generated
	 */
	int SERVLET_MAPPING_TYPE = 47;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletNameTypeImpl <em>Servlet Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletNameType()
	 * @generated
	 */
	int SERVLET_NAME_TYPE = 48;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletTypeImpl <em>Servlet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletType()
	 * @generated
	 */
	int SERVLET_TYPE = 49;

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
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SECURITY_ROLE_REF = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ID = 9;

	/**
	 * The number of structural features of the '<em>Servlet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SessionConfigTypeImpl <em>Session Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SessionConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSessionConfigType()
	 * @generated
	 */
	int SESSION_CONFIG_TYPE = 50;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SessionTimeoutTypeImpl <em>Session Timeout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SessionTimeoutTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSessionTimeoutType()
	 * @generated
	 */
	int SESSION_TIMEOUT_TYPE = 51;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SmallIconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSmallIconType()
	 * @generated
	 */
	int SMALL_ICON_TYPE = 52;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibLocationTypeImpl <em>Taglib Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibLocationTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTaglibLocationType()
	 * @generated
	 */
	int TAGLIB_LOCATION_TYPE = 53;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibTypeImpl <em>Taglib Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTaglibType()
	 * @generated
	 */
	int TAGLIB_TYPE = 54;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibUriTypeImpl <em>Taglib Uri Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibUriTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTaglibUriType()
	 * @generated
	 */
	int TAGLIB_URI_TYPE = 55;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TransportGuaranteeTypeImpl <em>Transport Guarantee Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TransportGuaranteeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTransportGuaranteeType()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE = 56;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.UrlPatternTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getUrlPatternType()
	 * @generated
	 */
	int URL_PATTERN_TYPE = 57;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.UserDataConstraintTypeImpl <em>User Data Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.UserDataConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getUserDataConstraintType()
	 * @generated
	 */
	int USER_DATA_CONSTRAINT_TYPE = 58;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WebAppTypeImpl <em>Web App Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WebAppTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWebAppType()
	 * @generated
	 */
	int WEB_APP_TYPE = 59;

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
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET = 5;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Session Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SESSION_CONFIG = 7;

	/**
	 * The feature id for the '<em><b>Mime Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MIME_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__WELCOME_FILE_LIST = 9;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ERROR_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Taglib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__TAGLIB = 11;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__RESOURCE_REF = 12;

	/**
	 * The feature id for the '<em><b>Security Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LOGIN_CONFIG = 14;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_ROLE = 15;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ENV_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__EJB_REF = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ID = 18;

	/**
	 * The number of structural features of the '<em>Web App Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceCollectionTypeImpl <em>Web Resource Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceCollectionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWebResourceCollectionType()
	 * @generated
	 */
	int WEB_RESOURCE_COLLECTION_TYPE = 60;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceNameTypeImpl <em>Web Resource Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWebResourceNameType()
	 * @generated
	 */
	int WEB_RESOURCE_NAME_TYPE = 61;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileListTypeImpl <em>Welcome File List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileListTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWelcomeFileListType()
	 * @generated
	 */
	int WELCOME_FILE_LIST_TYPE = 62;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileTypeImpl <em>Welcome File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWelcomeFileType()
	 * @generated
	 */
	int WELCOME_FILE_TYPE = 63;

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
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auth Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType
	 * @generated
	 */
	EClass getAuthConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType#getDescription()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType#getRoleName()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.AuthConstraintType#getId()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EAttribute getAuthConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.AuthMethodType <em>Auth Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auth Method Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.AuthMethodType
	 * @generated
	 */
	EClass getAuthMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.AuthMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.AuthMethodType#getMixed()
	 * @see #getAuthMethodType()
	 * @generated
	 */
	EAttribute getAuthMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.AuthMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.AuthMethodType#getId()
	 * @see #getAuthMethodType()
	 * @generated
	 */
	EAttribute getAuthMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType <em>Context Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Param Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ContextParamType
	 * @generated
	 */
	EClass getContextParamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamName()
	 * @see #getContextParamType()
	 * @generated
	 */
	EReference getContextParamType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamValue()
	 * @see #getContextParamType()
	 * @generated
	 */
	EReference getContextParamType_ParamValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getDescription()
	 * @see #getContextParamType()
	 * @generated
	 */
	EReference getContextParamType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getId()
	 * @see #getContextParamType()
	 * @generated
	 */
	EAttribute getContextParamType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.DescriptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DescriptionType#getId()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.DisplayNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DisplayNameType#getMixed()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.DisplayNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DisplayNameType#getId()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.DistributableType <em>Distributable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributable Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DistributableType
	 * @generated
	 */
	EClass getDistributableType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.DistributableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DistributableType#getId()
	 * @see #getDistributableType()
	 * @generated
	 */
	EAttribute getDistributableType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getAuthConstraint <em>Auth Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getAuthConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getAuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getAuthMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuthMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getContextParam <em>Context Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getContextParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContextParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getDisplayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getDistributable <em>Distributable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distributable</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getDistributable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Distributable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEjbRefType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntryType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getEnvEntryValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Code</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getErrorCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getErrorPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getExceptionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getFormErrorPage <em>Form Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getFormErrorPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormErrorPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getFormLoginConfig <em>Form Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getFormLoginConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormLoginConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getFormLoginPage <em>Form Login Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getFormLoginPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormLoginPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getHome()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getHttpMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HttpMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getInitParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InitParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getJspFile <em>Jsp File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jsp File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getJspFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JspFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLargeIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLoadOnStartup <em>Load On Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load On Startup</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLoadOnStartup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoadOnStartup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLoginConfig <em>Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getLoginConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoginConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getMimeMapping <em>Mime Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getMimeMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MimeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getMimeType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MimeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getParamName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getParamValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParamValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRealmName <em>Realm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realm Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRealmName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RealmName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRemote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResAuth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResourceRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getResType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRoleLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getRoleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSecurityConstraint <em>Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSecurityConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSecurityRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSecurityRoleRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServlet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Servlet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServletClass <em>Servlet Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServletClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServletClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServletMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServletMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getServletName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSessionConfig <em>Session Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSessionConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SessionConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Timeout</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSessionTimeout()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SessionTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getSmallIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTaglib <em>Taglib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTaglib()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Taglib();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTaglibLocation <em>Taglib Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTaglibLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaglibLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTaglibUri <em>Taglib Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Uri</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTaglibUri()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaglibUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTransportGuarantee <em>Transport Guarantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Guarantee</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getTransportGuarantee()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransportGuarantee();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getUrlPattern()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UrlPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getUserDataConstraint <em>User Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getUserDataConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserDataConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web App</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWebApp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebApp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWebResourceCollection <em>Web Resource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Resource Collection</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWebResourceCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebResourceCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWebResourceName <em>Web Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Resource Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWebResourceName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebResourceName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWelcomeFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WelcomeFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWelcomeFileList <em>Welcome File List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome File List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot#getWelcomeFileList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WelcomeFileList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbLinkType#getMixed()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbLinkType#getId()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefNameType#getMixed()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefNameType#getId()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefTypeType#getMixed()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EjbRefTypeType#getId()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryNameType <em>Env Entry Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryNameType
	 * @generated
	 */
	EClass getEnvEntryNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryNameType#getMixed()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryNameType#getId()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryTypeType <em>Env Entry Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryTypeType
	 * @generated
	 */
	EClass getEnvEntryTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryTypeType#getMixed()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryTypeType#getId()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryValueType <em>Env Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Value Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryValueType
	 * @generated
	 */
	EClass getEnvEntryValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryValueType#getMixed()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.EnvEntryValueType#getId()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Code Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorCodeType
	 * @generated
	 */
	EClass getErrorCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorCodeType#getMixed()
	 * @see #getErrorCodeType()
	 * @generated
	 */
	EAttribute getErrorCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorCodeType#getId()
	 * @see #getErrorCodeType()
	 * @generated
	 */
	EAttribute getErrorCodeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType
	 * @generated
	 */
	EClass getErrorPageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Code</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getErrorCode()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getExceptionType()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getLocation()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType#getId()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EAttribute getErrorPageType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ExceptionTypeType <em>Exception Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ExceptionTypeType
	 * @generated
	 */
	EClass getExceptionTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ExceptionTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ExceptionTypeType#getMixed()
	 * @see #getExceptionTypeType()
	 * @generated
	 */
	EAttribute getExceptionTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ExceptionTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ExceptionTypeType#getId()
	 * @see #getExceptionTypeType()
	 * @generated
	 */
	EAttribute getExceptionTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ExtensionType
	 * @generated
	 */
	EClass getExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ExtensionType#getMixed()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ExtensionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ExtensionType#getId()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.FormErrorPageType <em>Form Error Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Error Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormErrorPageType
	 * @generated
	 */
	EClass getFormErrorPageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.FormErrorPageType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormErrorPageType#getMixed()
	 * @see #getFormErrorPageType()
	 * @generated
	 */
	EAttribute getFormErrorPageType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.FormErrorPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormErrorPageType#getId()
	 * @see #getFormErrorPageType()
	 * @generated
	 */
	EAttribute getFormErrorPageType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType
	 * @generated
	 */
	EClass getFormLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType#getFormLoginPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormLoginPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType#getFormErrorPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormErrorPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormLoginConfigType#getId()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EAttribute getFormLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.FormLoginPageType <em>Form Login Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Login Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormLoginPageType
	 * @generated
	 */
	EClass getFormLoginPageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.FormLoginPageType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormLoginPageType#getMixed()
	 * @see #getFormLoginPageType()
	 * @generated
	 */
	EAttribute getFormLoginPageType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.FormLoginPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.FormLoginPageType#getId()
	 * @see #getFormLoginPageType()
	 * @generated
	 */
	EAttribute getFormLoginPageType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.HomeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.HomeType#getMixed()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.HomeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.HomeType#getId()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.HttpMethodType <em>Http Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Method Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.HttpMethodType
	 * @generated
	 */
	EClass getHttpMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.HttpMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.HttpMethodType#getMixed()
	 * @see #getHttpMethodType()
	 * @generated
	 */
	EAttribute getHttpMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.HttpMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.HttpMethodType#getId()
	 * @see #getHttpMethodType()
	 * @generated
	 */
	EAttribute getHttpMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.IconType
	 * @generated
	 */
	EClass getIconType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.IconType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.IconType#getSmallIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.IconType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.IconType#getLargeIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.IconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.IconType#getId()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.InitParamType <em>Init Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Param Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.InitParamType
	 * @generated
	 */
	EClass getInitParamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getParamName()
	 * @see #getInitParamType()
	 * @generated
	 */
	EReference getInitParamType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getParamValue()
	 * @see #getInitParamType()
	 * @generated
	 */
	EReference getInitParamType_ParamValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getDescription()
	 * @see #getInitParamType()
	 * @generated
	 */
	EReference getInitParamType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.InitParamType#getId()
	 * @see #getInitParamType()
	 * @generated
	 */
	EAttribute getInitParamType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsp File Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.JspFileType
	 * @generated
	 */
	EClass getJspFileType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.JspFileType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.JspFileType#getMixed()
	 * @see #getJspFileType()
	 * @generated
	 */
	EAttribute getJspFileType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.JspFileType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.JspFileType#getId()
	 * @see #getJspFileType()
	 * @generated
	 */
	EAttribute getJspFileType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.LargeIconType <em>Large Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LargeIconType
	 * @generated
	 */
	EClass getLargeIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.LargeIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LargeIconType#getMixed()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.LargeIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LargeIconType#getId()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.LoadOnStartupType <em>Load On Startup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load On Startup Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoadOnStartupType
	 * @generated
	 */
	EClass getLoadOnStartupType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.LoadOnStartupType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoadOnStartupType#getMixed()
	 * @see #getLoadOnStartupType()
	 * @generated
	 */
	EAttribute getLoadOnStartupType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.LoadOnStartupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoadOnStartupType#getId()
	 * @see #getLoadOnStartupType()
	 * @generated
	 */
	EAttribute getLoadOnStartupType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.LocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LocationType#getMixed()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.LocationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LocationType#getId()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType <em>Login Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType
	 * @generated
	 */
	EClass getLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getAuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getAuthMethod()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_AuthMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getRealmName <em>Realm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realm Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getRealmName()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_RealmName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getFormLoginConfig <em>Form Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getFormLoginConfig()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_FormLoginConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.LoginConfigType#getId()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EAttribute getLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType <em>Mime Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType
	 * @generated
	 */
	EClass getMimeMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType#getExtension()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType#getMimeType()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType#getId()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EAttribute getMimeMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.MimeTypeType
	 * @generated
	 */
	EClass getMimeTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.MimeTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.MimeTypeType#getMixed()
	 * @see #getMimeTypeType()
	 * @generated
	 */
	EAttribute getMimeTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.MimeTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.MimeTypeType#getId()
	 * @see #getMimeTypeType()
	 * @generated
	 */
	EAttribute getMimeTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ParamNameType <em>Param Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ParamNameType
	 * @generated
	 */
	EClass getParamNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ParamNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ParamNameType#getMixed()
	 * @see #getParamNameType()
	 * @generated
	 */
	EAttribute getParamNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ParamNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ParamNameType#getId()
	 * @see #getParamNameType()
	 * @generated
	 */
	EAttribute getParamNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Value Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ParamValueType
	 * @generated
	 */
	EClass getParamValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ParamValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ParamValueType#getMixed()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ParamValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ParamValueType#getId()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.RealmNameType <em>Realm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realm Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RealmNameType
	 * @generated
	 */
	EClass getRealmNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.RealmNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RealmNameType#getMixed()
	 * @see #getRealmNameType()
	 * @generated
	 */
	EAttribute getRealmNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.RealmNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RealmNameType#getId()
	 * @see #getRealmNameType()
	 * @generated
	 */
	EAttribute getRealmNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.RemoteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RemoteType#getMixed()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.RemoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RemoteType#getId()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ResAuthType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResAuthType#getMixed()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ResAuthType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResAuthType#getId()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ResRefNameType <em>Res Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResRefNameType
	 * @generated
	 */
	EClass getResRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ResRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResRefNameType#getMixed()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ResRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResRefNameType#getId()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ResTypeType <em>Res Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResTypeType
	 * @generated
	 */
	EClass getResTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ResTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResTypeType#getMixed()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ResTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ResTypeType#getId()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.RoleLinkType <em>Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RoleLinkType
	 * @generated
	 */
	EClass getRoleLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.RoleLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RoleLinkType#getMixed()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.RoleLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RoleLinkType#getId()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.RoleNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RoleNameType#getMixed()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.RoleNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.RoleNameType#getId()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType
	 * @generated
	 */
	EClass getSecurityConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getWebResourceCollection <em>Web Resource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Resource Collection</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getWebResourceCollection()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_WebResourceCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getAuthConstraint <em>Auth Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getAuthConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_AuthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getUserDataConstraint <em>User Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getUserDataConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_UserDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType#getId()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EAttribute getSecurityConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletClassType <em>Servlet Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Class Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletClassType
	 * @generated
	 */
	EClass getServletClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletClassType#getMixed()
	 * @see #getServletClassType()
	 * @generated
	 */
	EAttribute getServletClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletClassType#getId()
	 * @see #getServletClassType()
	 * @generated
	 */
	EAttribute getServletClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType
	 * @generated
	 */
	EClass getServletMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getServletName()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getUrlPattern()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_UrlPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType#getId()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EAttribute getServletMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletNameType <em>Servlet Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletNameType
	 * @generated
	 */
	EClass getServletNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletNameType#getMixed()
	 * @see #getServletNameType()
	 * @generated
	 */
	EAttribute getServletNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletNameType#getId()
	 * @see #getServletNameType()
	 * @generated
	 */
	EAttribute getServletNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType
	 * @generated
	 */
	EClass getServletType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getIcon()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getServletName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getDisplayName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getDescription()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getServletClass <em>Servlet Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getServletClass()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getJspFile <em>Jsp File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jsp File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getJspFile()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_JspFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getInitParam()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_InitParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getLoadOnStartup <em>Load On Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load On Startup</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getLoadOnStartup()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_LoadOnStartup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getSecurityRoleRef()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_SecurityRoleRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.ServletType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.ServletType#getId()
	 * @see #getServletType()
	 * @generated
	 */
	EAttribute getServletType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.SessionConfigType <em>Session Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SessionConfigType
	 * @generated
	 */
	EClass getSessionConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.SessionConfigType#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Timeout</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SessionConfigType#getSessionTimeout()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EReference getSessionConfigType_SessionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.SessionConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SessionConfigType#getId()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EAttribute getSessionConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.SessionTimeoutType <em>Session Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Timeout Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SessionTimeoutType
	 * @generated
	 */
	EClass getSessionTimeoutType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.SessionTimeoutType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SessionTimeoutType#getMixed()
	 * @see #getSessionTimeoutType()
	 * @generated
	 */
	EAttribute getSessionTimeoutType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.SessionTimeoutType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SessionTimeoutType#getId()
	 * @see #getSessionTimeoutType()
	 * @generated
	 */
	EAttribute getSessionTimeoutType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.SmallIconType <em>Small Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SmallIconType
	 * @generated
	 */
	EClass getSmallIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.SmallIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SmallIconType#getMixed()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.SmallIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.SmallIconType#getId()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibLocationType <em>Taglib Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Location Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibLocationType
	 * @generated
	 */
	EClass getTaglibLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibLocationType#getMixed()
	 * @see #getTaglibLocationType()
	 * @generated
	 */
	EAttribute getTaglibLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibLocationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibLocationType#getId()
	 * @see #getTaglibLocationType()
	 * @generated
	 */
	EAttribute getTaglibLocationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibType
	 * @generated
	 */
	EClass getTaglibType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibType#getTaglibUri <em>Taglib Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Uri</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibType#getTaglibUri()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibType#getTaglibLocation <em>Taglib Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibType#getTaglibLocation()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibType#getId()
	 * @see #getTaglibType()
	 * @generated
	 */
	EAttribute getTaglibType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibUriType <em>Taglib Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Uri Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibUriType
	 * @generated
	 */
	EClass getTaglibUriType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibUriType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibUriType#getMixed()
	 * @see #getTaglibUriType()
	 * @generated
	 */
	EAttribute getTaglibUriType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.TaglibUriType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TaglibUriType#getId()
	 * @see #getTaglibUriType()
	 * @generated
	 */
	EAttribute getTaglibUriType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Guarantee Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TransportGuaranteeType
	 * @generated
	 */
	EClass getTransportGuaranteeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.TransportGuaranteeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TransportGuaranteeType#getMixed()
	 * @see #getTransportGuaranteeType()
	 * @generated
	 */
	EAttribute getTransportGuaranteeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.TransportGuaranteeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.TransportGuaranteeType#getId()
	 * @see #getTransportGuaranteeType()
	 * @generated
	 */
	EAttribute getTransportGuaranteeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Pattern Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.UrlPatternType
	 * @generated
	 */
	EClass getUrlPatternType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.UrlPatternType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.UrlPatternType#getMixed()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.UrlPatternType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.UrlPatternType#getId()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Data Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType
	 * @generated
	 */
	EClass getUserDataConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType#getDescription()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType#getTransportGuarantee <em>Transport Guarantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Guarantee</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType#getTransportGuarantee()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_TransportGuarantee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.UserDataConstraintType#getId()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EAttribute getUserDataConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType
	 * @generated
	 */
	EClass getWebAppType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getIcon()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDisplayName()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDescription()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDistributable <em>Distributable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distributable</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDistributable()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Distributable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getContextParam <em>Context Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getContextParam()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ContextParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getServlet()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Servlet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getServletMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ServletMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSessionConfig <em>Session Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSessionConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SessionConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getMimeMapping <em>Mime Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getMimeMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MimeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getWelcomeFileList <em>Welcome File List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome File List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getWelcomeFileList()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_WelcomeFileList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getErrorPage()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ErrorPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getTaglib <em>Taglib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taglib</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getTaglib()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Taglib();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getResourceRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSecurityConstraint <em>Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSecurityConstraint()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getLoginConfig <em>Login Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getLoginConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_LoginConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSecurityRole()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getEnvEntry()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getEjbRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EjbRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getId()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Resource Collection Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType
	 * @generated
	 */
	EClass getWebResourceCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getWebResourceName <em>Web Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Resource Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getWebResourceName()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_WebResourceName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getDescription()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getUrlPattern()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Http Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getHttpMethod()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceCollectionType#getId()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EAttribute getWebResourceCollectionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceNameType <em>Web Resource Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Resource Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceNameType
	 * @generated
	 */
	EClass getWebResourceNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceNameType#getMixed()
	 * @see #getWebResourceNameType()
	 * @generated
	 */
	EAttribute getWebResourceNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.WebResourceNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WebResourceNameType#getId()
	 * @see #getWebResourceNameType()
	 * @generated
	 */
	EAttribute getWebResourceNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Welcome File List Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileListType
	 * @generated
	 */
	EClass getWelcomeFileListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileListType#getWelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Welcome File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileListType#getWelcomeFile()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EReference getWelcomeFileListType_WelcomeFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileListType#getId()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EAttribute getWelcomeFileListType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileType <em>Welcome File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Welcome File Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileType
	 * @generated
	 */
	EClass getWelcomeFileType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileType#getMixed()
	 * @see #getWelcomeFileType()
	 * @generated
	 */
	EAttribute getWelcomeFileType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.WelcomeFileType#getId()
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
	Webapp22Factory getWebapp22Factory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.AuthConstraintTypeImpl <em>Auth Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.AuthConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getAuthConstraintType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.AuthMethodTypeImpl <em>Auth Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.AuthMethodTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getAuthMethodType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ContextParamTypeImpl <em>Context Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ContextParamTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getContextParamType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DescriptionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDescriptionType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DisplayNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDisplayNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DistributableTypeImpl <em>Distributable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DistributableTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDistributableType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.DocumentRootImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Load On Startup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOAD_ON_STARTUP = eINSTANCE.getDocumentRoot_LoadOnStartup();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbLinkTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbLinkType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbRefNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEjbRefTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.EnvEntryValueTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getEnvEntryValueType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorCodeTypeImpl <em>Error Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorCodeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getErrorCodeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorPageTypeImpl <em>Error Page Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ErrorPageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getErrorPageType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ExceptionTypeTypeImpl <em>Exception Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ExceptionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getExceptionTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ExtensionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getExtensionType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.FormErrorPageTypeImpl <em>Form Error Page Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.FormErrorPageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getFormErrorPageType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginConfigTypeImpl <em>Form Login Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getFormLoginConfigType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginPageTypeImpl <em>Form Login Page Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.FormLoginPageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getFormLoginPageType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.HomeTypeImpl <em>Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.HomeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getHomeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.HttpMethodTypeImpl <em>Http Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.HttpMethodTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getHttpMethodType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.IconTypeImpl <em>Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.IconTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getIconType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.InitParamTypeImpl <em>Init Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.InitParamTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getInitParamType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.JspFileTypeImpl <em>Jsp File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.JspFileTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getJspFileType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LargeIconTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLargeIconType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LoadOnStartupTypeImpl <em>Load On Startup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LoadOnStartupTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLoadOnStartupType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LocationTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLocationType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.LoginConfigTypeImpl <em>Login Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.LoginConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getLoginConfigType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.MimeMappingTypeImpl <em>Mime Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.MimeMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getMimeMappingType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.MimeTypeTypeImpl <em>Mime Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.MimeTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getMimeTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ParamNameTypeImpl <em>Param Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ParamNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getParamNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ParamValueTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getParamValueType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RealmNameTypeImpl <em>Realm Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RealmNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRealmNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RemoteTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRemoteType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResAuthTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResAuthType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResourceRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResourceRefType()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF_TYPE__ID = eINSTANCE.getResourceRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResRefNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ResTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getResTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RoleLinkTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRoleLinkType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.RoleNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getRoleNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityConstraintTypeImpl <em>Security Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSecurityConstraintType()
		 * @generated
		 */
		EClass SECURITY_CONSTRAINT_TYPE = eINSTANCE.getSecurityConstraintType();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSecurityRoleRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SecurityRoleTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSecurityRoleType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletClassTypeImpl <em>Servlet Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletClassTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletClassType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletMappingTypeImpl <em>Servlet Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletMappingType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletNameTypeImpl <em>Servlet Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.ServletTypeImpl <em>Servlet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.ServletTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getServletType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SessionConfigTypeImpl <em>Session Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SessionConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSessionConfigType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SessionTimeoutTypeImpl <em>Session Timeout Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SessionTimeoutTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSessionTimeoutType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.SmallIconTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getSmallIconType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibLocationTypeImpl <em>Taglib Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibLocationTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTaglibLocationType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibTypeImpl <em>Taglib Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTaglibType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibUriTypeImpl <em>Taglib Uri Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TaglibUriTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTaglibUriType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.TransportGuaranteeTypeImpl <em>Transport Guarantee Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.TransportGuaranteeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getTransportGuaranteeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.UrlPatternTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getUrlPatternType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.UserDataConstraintTypeImpl <em>User Data Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.UserDataConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getUserDataConstraintType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WebAppTypeImpl <em>Web App Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WebAppTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWebAppType()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP_TYPE__ID = eINSTANCE.getWebAppType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceCollectionTypeImpl <em>Web Resource Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceCollectionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWebResourceCollectionType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceNameTypeImpl <em>Web Resource Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WebResourceNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWebResourceNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileListTypeImpl <em>Welcome File List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileListTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWelcomeFileListType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileTypeImpl <em>Welcome File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.WelcomeFileTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp22.impl.Webapp22PackageImpl#getWelcomeFileType()
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

} //Webapp22Package
