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
package org.eclipse.modisco.jee.webapp.webapp30;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Factory
 * @model kind="package"
 * @generated
 */
public interface Webapp30Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapp30"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/web-app_3_0.xsd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapp30"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	Webapp30Package eINSTANCE = org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.AbsoluteOrderingTypeImpl <em>Absolute Ordering Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.AbsoluteOrderingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAbsoluteOrderingType()
	 * @generated
	 */
	int ABSOLUTE_ORDERING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ORDERING_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ORDERING_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Others</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ORDERING_TYPE__OTHERS = 2;

	/**
	 * The number of structural features of the '<em>Absolute Ordering Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_ORDERING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.StringImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getString()
	 * @generated
	 */
	int STRING = 86;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING__ID = 1;

	/**
	 * The number of structural features of the '<em>String</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.AddressingResponsesTypeImpl <em>Addressing Responses Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.AddressingResponsesTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAddressingResponsesType()
	 * @generated
	 */
	int ADDRESSING_RESPONSES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_RESPONSES_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_RESPONSES_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Addressing Responses Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_RESPONSES_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.AddressingTypeImpl <em>Addressing Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.AddressingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAddressingType()
	 * @generated
	 */
	int ADDRESSING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_TYPE__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_TYPE__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_TYPE__RESPONSES = 2;

	/**
	 * The number of structural features of the '<em>Addressing Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.AuthConstraintTypeImpl <em>Auth Constraint Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.AuthConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAuthConstraintType()
	 * @generated
	 */
	int AUTH_CONSTRAINT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Auth Constraint Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_CONSTRAINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.AuthMethodTypeImpl <em>Auth Method Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.AuthMethodTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAuthMethodType()
	 * @generated
	 */
	int AUTH_METHOD_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Auth Method Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.NonEmptyStringTypeImpl <em>Non Empty String Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.NonEmptyStringTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getNonEmptyStringType()
	 * @generated
	 */
	int NON_EMPTY_STRING_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_EMPTY_STRING_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NON_EMPTY_STRING_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Non Empty String Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_EMPTY_STRING_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieCommentTypeImpl <em>Cookie Comment Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.CookieCommentTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getCookieCommentType()
	 * @generated
	 */
	int COOKIE_COMMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_COMMENT_TYPE__VALUE = NON_EMPTY_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_COMMENT_TYPE__ID = NON_EMPTY_STRING_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Cookie Comment Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_COMMENT_TYPE_FEATURE_COUNT = NON_EMPTY_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl <em>Cookie Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getCookieConfigType()
	 * @generated
	 */
	int COOKIE_CONFIG_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Http Only</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__HTTP_ONLY = 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__SECURE = 5;

	/**
	 * The feature id for the '<em><b>Max Age</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__MAX_AGE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Cookie Config Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_CONFIG_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieDomainTypeImpl <em>Cookie Domain Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.CookieDomainTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getCookieDomainType()
	 * @generated
	 */
	int COOKIE_DOMAIN_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_DOMAIN_TYPE__VALUE = NON_EMPTY_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_DOMAIN_TYPE__ID = NON_EMPTY_STRING_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Cookie Domain Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_DOMAIN_TYPE_FEATURE_COUNT = NON_EMPTY_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieNameTypeImpl <em>Cookie Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.CookieNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getCookieNameType()
	 * @generated
	 */
	int COOKIE_NAME_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_NAME_TYPE__VALUE = NON_EMPTY_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_NAME_TYPE__ID = NON_EMPTY_STRING_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Cookie Name Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_NAME_TYPE_FEATURE_COUNT = NON_EMPTY_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookiePathTypeImpl <em>Cookie Path Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.CookiePathTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getCookiePathType()
	 * @generated
	 */
	int COOKIE_PATH_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_PATH_TYPE__VALUE = NON_EMPTY_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COOKIE_PATH_TYPE__ID = NON_EMPTY_STRING_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Cookie Path Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKIE_PATH_TYPE_FEATURE_COUNT = NON_EMPTY_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl <em>Data Source Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDataSourceType()
	 * @generated
	 */
	int DATA_SOURCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__SERVER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__PORT_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__DATABASE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__URL = 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__USER = 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__PASSWORD = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Login Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__LOGIN_TIMEOUT = 10;

	/**
	 * The feature id for the '<em><b>Transactional</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__TRANSACTIONAL = 11;

	/**
	 * The feature id for the '<em><b>Isolation Level</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__ISOLATION_LEVEL = 12;

	/**
	 * The feature id for the '<em><b>Initial Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__INITIAL_POOL_SIZE = 13;

	/**
	 * The feature id for the '<em><b>Max Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__MAX_POOL_SIZE = 14;

	/**
	 * The feature id for the '<em><b>Min Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__MIN_POOL_SIZE = 15;

	/**
	 * The feature id for the '<em><b>Max Idle Time</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__MAX_IDLE_TIME = 16;

	/**
	 * The feature id for the '<em><b>Max Statements</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__MAX_STATEMENTS = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__ID = 18;

	/**
	 * The number of structural features of the '<em>Data Source Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdStringTypeImpl <em>Xsd String Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdStringTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdStringType()
	 * @generated
	 */
	int XSD_STRING_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_STRING_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_STRING_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd String Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_STRING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__VALUE = XSD_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__ID = XSD_STRING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__LANG = XSD_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = XSD_STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DispatcherTypeImpl <em>Dispatcher Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.DispatcherTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDispatcherType()
	 * @generated
	 */
	int DISPATCHER_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISPATCHER_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISPATCHER_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Dispatcher Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHER_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDisplayNameType()
	 * @generated
	 */
	int DISPLAY_NAME_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__LANG = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display Name Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.DocumentRootImpl
	 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Web App</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_APP = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.EjbLinkTypeImpl
	 * <em>Ejb Link Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbLinkType()
	 * @generated
	 */
	int EJB_LINK_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Ejb Link Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EjbLocalRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbLocalRefType()
	 * @generated
	 */
	int EJB_LOCAL_REF_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__EJB_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__EJB_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__LOCAL_HOME = 3;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__LOCAL = 4;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__EJB_LINK = 5;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__MAPPED_NAME = 6;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__INJECTION_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__LOOKUP_NAME = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__ID = 9;

	/**
	 * The number of structural features of the '<em>Ejb Local Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.JndiNameTypeImpl <em>Jndi Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.JndiNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJndiNameType()
	 * @generated
	 */
	int JNDI_NAME_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JNDI_NAME_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JNDI_NAME_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Jndi Name Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_NAME_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE__VALUE = JNDI_NAME_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE__ID = JNDI_NAME_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Ejb Ref Name Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE_FEATURE_COUNT = JNDI_NAME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.EjbRefTypeImpl
	 * <em>Ejb Ref Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__EJB_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__EJB_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__HOME = 3;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__REMOTE = 4;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__EJB_LINK = 5;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__MAPPED_NAME = 6;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__INJECTION_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__LOOKUP_NAME = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__ID = 9;

	/**
	 * The number of structural features of the '<em>Ejb Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Ejb Ref Type Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.EmptyTypeImpl
	 * <em>Empty Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EmptyTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__INJECTION_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__LOOKUP_NAME = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Env Entry Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.FullyQualifiedClassTypeImpl <em>Fully Qualified Class Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.FullyQualifiedClassTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getFullyQualifiedClassType()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FULLY_QUALIFIED_CLASS_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FULLY_QUALIFIED_CLASS_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Fully Qualified Class Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeValuesTypeImpl <em>Env Entry Type Values Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeValuesTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEnvEntryTypeValuesType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Env Entry Type Values Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdPositiveIntegerTypeImpl <em>Xsd Positive Integer Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdPositiveIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdPositiveIntegerType()
	 * @generated
	 */
	int XSD_POSITIVE_INTEGER_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_POSITIVE_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_POSITIVE_INTEGER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Positive Integer Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_POSITIVE_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorCodeTypeImpl <em>Error Code Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorCodeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getErrorCodeType()
	 * @generated
	 */
	int ERROR_CODE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_TYPE__VALUE = XSD_POSITIVE_INTEGER_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_TYPE__ID = XSD_POSITIVE_INTEGER_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Error Code Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_TYPE_FEATURE_COUNT = XSD_POSITIVE_INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorPageTypeImpl <em>Error Page Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getErrorPageType()
	 * @generated
	 */
	int ERROR_PAGE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__ERROR_CODE = 0;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__EXCEPTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Error Page Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PAGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.FilterMappingTypeImpl <em>Filter Mapping Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.FilterMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getFilterMappingType()
	 * @generated
	 */
	int FILTER_MAPPING_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__FILTER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__URL_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__SERVLET_NAME = 3;

	/**
	 * The feature id for the '<em><b>Dispatcher</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__DISPATCHER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Filter Mapping Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.FilterNameTypeImpl <em>Filter Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.FilterNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getFilterNameType()
	 * @generated
	 */
	int FILTER_NAME_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_NAME_TYPE__VALUE = NON_EMPTY_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_NAME_TYPE__ID = NON_EMPTY_STRING_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Filter Name Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_NAME_TYPE_FEATURE_COUNT = NON_EMPTY_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.FilterTypeImpl
	 * <em>Filter Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.FilterTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Filter Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Async Supported</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ASYNC_SUPPORTED = 5;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__INIT_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.FormLoginConfigTypeImpl <em>Form Login Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.FormLoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getFormLoginConfigType()
	 * @generated
	 */
	int FORM_LOGIN_CONFIG_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Form Login Page</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Form Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Form Login Config Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LOGIN_CONFIG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.GenericBooleanTypeImpl <em>Generic Boolean Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.GenericBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getGenericBooleanType()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_BOOLEAN_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_BOOLEAN_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Generic Boolean Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BOOLEAN_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.HandlerChainsTypeImpl <em>Handler Chains Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.HandlerChainsTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getHandlerChainsType()
	 * @generated
	 */
	int HANDLER_CHAINS_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Handler Chain</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAINS_TYPE__HANDLER_CHAIN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAINS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Handler Chains Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAINS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.HandlerChainTypeImpl <em>Handler Chain Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.HandlerChainTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getHandlerChainType()
	 * @generated
	 */
	int HANDLER_CHAIN_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Service Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Port Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Protocol Bindings</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAIN_TYPE__HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAIN_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Handler Chain Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CHAIN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.HandlerTypeImpl
	 * <em>Handler Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.HandlerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getHandlerType()
	 * @generated
	 */
	int HANDLER_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Handler Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__HANDLER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Handler Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__HANDLER_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__INIT_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Soap Header</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__SOAP_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Soap Role</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__SOAP_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__PORT_NAME = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__ID = 9;

	/**
	 * The number of structural features of the '<em>Handler Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Home Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.IconTypeImpl <em>Icon Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.IconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__SMALL_ICON = 0;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__LARGE_ICON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__LANG = 3;

	/**
	 * The number of structural features of the '<em>Icon Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.InjectionTargetTypeImpl <em>Injection Target Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.InjectionTargetTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getInjectionTargetType()
	 * @generated
	 */
	int INJECTION_TARGET_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Injection Target Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Injection Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME = 1;

	/**
	 * The number of structural features of the '<em>Injection Target Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.JavaIdentifierTypeImpl <em>Java Identifier Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.JavaIdentifierTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJavaIdentifierType()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_IDENTIFIER_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_IDENTIFIER_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Java Identifier Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IDENTIFIER_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.JavaTypeTypeImpl <em>Java Type Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.JavaTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJavaTypeType()
	 * @generated
	 */
	int JAVA_TYPE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Java Type Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.JdbcUrlTypeImpl
	 * <em>Jdbc Url Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.JdbcUrlTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJdbcUrlType()
	 * @generated
	 */
	int JDBC_URL_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JDBC_URL_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JDBC_URL_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Jdbc Url Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_URL_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.JspConfigTypeImpl <em>Jsp Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.JspConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJspConfigType()
	 * @generated
	 */
	int JSP_CONFIG_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Taglib</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_CONFIG_TYPE__TAGLIB = 0;

	/**
	 * The feature id for the '<em><b>Jsp Property Group</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JSP_CONFIG_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Jsp Config Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_CONFIG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.PathTypeImpl <em>Path Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.PathTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPathType()
	 * @generated
	 */
	int PATH_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Path Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.JspFileTypeImpl
	 * <em>Jsp File Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.JspFileTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJspFileType()
	 * @generated
	 */
	int JSP_FILE_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JSP_FILE_TYPE__VALUE = PATH_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JSP_FILE_TYPE__ID = PATH_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Jsp File Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_FILE_TYPE_FEATURE_COUNT = PATH_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.JspPropertyGroupTypeImpl <em>Jsp Property Group Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.JspPropertyGroupTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJspPropertyGroupType()
	 * @generated
	 */
	int JSP_PROPERTY_GROUP_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__URL_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>El Ignored</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__EL_IGNORED = 4;

	/**
	 * The feature id for the '<em><b>Page Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING = 5;

	/**
	 * The feature id for the '<em><b>Scripting Invalid</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID = 6;

	/**
	 * The feature id for the '<em><b>Is Xml</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__IS_XML = 7;

	/**
	 * The feature id for the '<em><b>Include Prelude</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE = 8;

	/**
	 * The feature id for the '<em><b>Include Coda</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA = 9;

	/**
	 * The feature id for the '<em><b>Deferred Syntax Allowed As Literal</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL = 10;

	/**
	 * The feature id for the '<em><b>Trim Directive Whitespaces</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES = 11;

	/**
	 * The feature id for the '<em><b>Default Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__DEFAULT_CONTENT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__BUFFER = 13;

	/**
	 * The feature id for the '<em><b>Error On Undeclared Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__ERROR_ON_UNDECLARED_NAMESPACE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__ID = 15;

	/**
	 * The number of structural features of the '<em>Jsp Property Group Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.LifecycleCallbackTypeImpl <em>Lifecycle Callback Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.LifecycleCallbackTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLifecycleCallbackType()
	 * @generated
	 */
	int LIFECYCLE_CALLBACK_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Lifecycle Callback Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Lifecycle Callback Method</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Lifecycle Callback Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.ListenerTypeImpl
	 * <em>Listener Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ListenerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getListenerType()
	 * @generated
	 */
	int LISTENER_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Listener Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__LISTENER_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Listener Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.LocaleEncodingMappingListTypeImpl <em>Locale Encoding Mapping List Type</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.LocaleEncodingMappingListTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLocaleEncodingMappingListType()
	 * @generated
	 */
	int LOCALE_ENCODING_MAPPING_LIST_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Locale Encoding Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_ENCODING_MAPPING_LIST_TYPE__LOCALE_ENCODING_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCALE_ENCODING_MAPPING_LIST_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Locale Encoding Mapping List Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_ENCODING_MAPPING_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.LocaleEncodingMappingTypeImpl <em>Locale Encoding Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.LocaleEncodingMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLocaleEncodingMappingType()
	 * @generated
	 */
	int LOCALE_ENCODING_MAPPING_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCALE_ENCODING_MAPPING_TYPE__LOCALE = 0;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCALE_ENCODING_MAPPING_TYPE__ENCODING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCALE_ENCODING_MAPPING_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Locale Encoding Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_ENCODING_MAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.LocalHomeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLocalHomeType()
	 * @generated
	 */
	int LOCAL_HOME_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Local Home Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.LocalTypeImpl
	 * <em>Local Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.LocalTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLocalType()
	 * @generated
	 */
	int LOCAL_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Local Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.LoginConfigTypeImpl <em>Login Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.LoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLoginConfigType()
	 * @generated
	 */
	int LOGIN_CONFIG_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Auth Method</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__AUTH_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Realm Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__REALM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Form Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Login Config Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CONFIG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationLinkTypeImpl <em>Message Destination Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationLinkType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_LINK_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_LINK_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Message Destination Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_LINK_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationRefTypeImpl <em>Message Destination Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationRefType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_REF_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Message Destination Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Message Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Message Destination Usage</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE = 3;

	/**
	 * The feature id for the '<em><b>Message Destination Link</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK = 4;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__LOOKUP_NAME = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__ID = 8;

	/**
	 * The number of structural features of the '<em>Message Destination Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationTypeImpl <em>Message Destination Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Message Destination Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__LOOKUP_NAME = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Message Destination Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationTypeTypeImpl <em>Message Destination Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationTypeType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Message Destination Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationUsageTypeImpl <em>Message Destination Usage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MessageDestinationUsageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationUsageType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Message Destination Usage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MimeMappingTypeImpl <em>Mime Mapping Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MimeMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMimeMappingType()
	 * @generated
	 */
	int MIME_MAPPING_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE__MIME_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Mime Mapping Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MimeTypeTypeImpl <em>Mime Type Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MimeTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMimeTypeType()
	 * @generated
	 */
	int MIME_TYPE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Mime Type Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MultipartConfigTypeImpl <em>Multipart Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.MultipartConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMultipartConfigType()
	 * @generated
	 */
	int MULTIPART_CONFIG_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPART_CONFIG_TYPE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Max File Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPART_CONFIG_TYPE__MAX_FILE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Max Request Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPART_CONFIG_TYPE__MAX_REQUEST_SIZE = 2;

	/**
	 * The feature id for the '<em><b>File Size Threshold</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPART_CONFIG_TYPE__FILE_SIZE_THRESHOLD = 3;

	/**
	 * The number of structural features of the '<em>Multipart Config Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPART_CONFIG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.OrderingOrderingTypeImpl <em>Ordering Ordering Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.OrderingOrderingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getOrderingOrderingType()
	 * @generated
	 */
	int ORDERING_ORDERING_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_ORDERING_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Others</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_ORDERING_TYPE__OTHERS = 1;

	/**
	 * The number of structural features of the '<em>Ordering Ordering Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_ORDERING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.OrderingOthersTypeImpl <em>Ordering Others Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.OrderingOthersTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getOrderingOthersType()
	 * @generated
	 */
	int ORDERING_OTHERS_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERING_OTHERS_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Ordering Others Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_OTHERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.OrderingTypeImpl
	 * <em>Ordering Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.OrderingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 62;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TYPE__AFTER = 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TYPE__BEFORE = 1;

	/**
	 * The number of structural features of the '<em>Ordering Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ParamValueTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getParamValueType()
	 * @generated
	 */
	int PARAM_VALUE_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__PARAM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__PARAM_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Param Value Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.PersistenceContextRefTypeImpl <em>Persistence Context Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.PersistenceContextRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPersistenceContextRefType()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Persistence Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Persistence Property</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Persistence Context Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.PersistenceContextTypeTypeImpl <em>Persistence Context Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.PersistenceContextTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPersistenceContextTypeType()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Persistence Context Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.PersistenceUnitRefTypeImpl <em>Persistence Unit Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.PersistenceUnitRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPersistenceUnitRefType()
	 * @generated
	 */
	int PERSISTENCE_UNIT_REF_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__PERSISTENCE_UNIT_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__PERSISTENCE_UNIT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__MAPPED_NAME = 3;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__INJECTION_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Persistence Unit Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.PortComponentRefTypeImpl <em>Port Component Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.PortComponentRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPortComponentRefType()
	 * @generated
	 */
	int PORT_COMPONENT_REF_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Service Endpoint Interface</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Enable Mtom</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__ENABLE_MTOM = 1;

	/**
	 * The feature id for the '<em><b>Mtom Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__MTOM_THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Addressing</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__ADDRESSING = 3;

	/**
	 * The feature id for the '<em><b>Respect Binding</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__RESPECT_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Port Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Port Component Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.PropertyTypeImpl
	 * <em>Property Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.PropertyTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.RemoteTypeImpl
	 * <em>Remote Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Remote Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.ResAuthTypeImpl
	 * <em>Res Auth Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Res Auth Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ResourceEnvRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResourceEnvRefType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__MAPPED_NAME = 3;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__INJECTION_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__LOOKUP_NAME = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Resource Env Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_AUTH = 3;

	/**
	 * The feature id for the '<em><b>Res Sharing Scope</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__RES_SHARING_SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__INJECTION_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__LOOKUP_NAME = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__ID = 8;

	/**
	 * The number of structural features of the '<em>Resource Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.RespectBindingTypeImpl <em>Respect Binding Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.RespectBindingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getRespectBindingType()
	 * @generated
	 */
	int RESPECT_BINDING_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPECT_BINDING_TYPE__ENABLED = 0;

	/**
	 * The number of structural features of the '<em>Respect Binding Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPECT_BINDING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ResSharingScopeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResSharingScopeType()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Res Sharing Scope Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Role Name Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.RunAsTypeImpl
	 * <em>Run As Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.RunAsTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getRunAsType()
	 * @generated
	 */
	int RUN_AS_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Run As Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SecurityConstraintTypeImpl <em>Security Constraint Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.SecurityConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getSecurityConstraintType()
	 * @generated
	 */
	int SECURITY_CONSTRAINT_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Web Resource Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Auth Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>User Data Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Security Constraint Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Role Link</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__ROLE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Security Role Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Security Role Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ServiceRefTypeImpl <em>Service Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ServiceRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getServiceRefType()
	 * @generated
	 */
	int SERVICE_REF_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Service Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_REF_NAME = 3;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Service Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_REF_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__WSDL_FILE = 6;

	/**
	 * The feature id for the '<em><b>Jaxrpc Mapping File</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE = 7;

	/**
	 * The feature id for the '<em><b>Service Qname</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_QNAME = 8;

	/**
	 * The feature id for the '<em><b>Port Component Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__PORT_COMPONENT_REF = 9;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__HANDLER = 10;

	/**
	 * The feature id for the '<em><b>Handler Chains</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__HANDLER_CHAINS = 11;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__MAPPED_NAME = 12;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__INJECTION_TARGET = 13;

	/**
	 * The feature id for the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__LOOKUP_NAME = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__ID = 15;

	/**
	 * The number of structural features of the '<em>Service Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ServletMappingTypeImpl <em>Servlet Mapping Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ServletMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getServletMappingType()
	 * @generated
	 */
	int SERVLET_MAPPING_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE__SERVLET_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE__URL_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Servlet Mapping Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ServletNameTypeImpl <em>Servlet Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ServletNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getServletNameType()
	 * @generated
	 */
	int SERVLET_NAME_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVLET_NAME_TYPE__VALUE = NON_EMPTY_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVLET_NAME_TYPE__ID = NON_EMPTY_STRING_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Servlet Name Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_NAME_TYPE_FEATURE_COUNT = NON_EMPTY_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.ServletTypeImpl
	 * <em>Servlet Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.ServletTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getServletType()
	 * @generated
	 */
	int SERVLET_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SERVLET_NAME = 3;

	/**
	 * The feature id for the '<em><b>Servlet Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SERVLET_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Jsp File</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__JSP_FILE = 5;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__INIT_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Load On Startup</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__LOAD_ON_STARTUP = 7;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ENABLED = 8;

	/**
	 * The feature id for the '<em><b>Async Supported</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ASYNC_SUPPORTED = 9;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__RUN_AS = 10;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SECURITY_ROLE_REF = 11;

	/**
	 * The feature id for the '<em><b>Multipart Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__MULTIPART_CONFIG = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ID = 13;

	/**
	 * The number of structural features of the '<em>Servlet Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SessionConfigTypeImpl <em>Session Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.SessionConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getSessionConfigType()
	 * @generated
	 */
	int SESSION_CONFIG_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Session Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__SESSION_TIMEOUT = 0;

	/**
	 * The feature id for the '<em><b>Cookie Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__COOKIE_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Tracking Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__TRACKING_MODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Session Config Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.TaglibTypeImpl
	 * <em>Taglib Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.TaglibTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTaglibType()
	 * @generated
	 */
	int TAGLIB_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Taglib Uri</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE__TAGLIB_URI = 0;

	/**
	 * The feature id for the '<em><b>Taglib Location</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE__TAGLIB_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Taglib Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGLIB_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.TrackingModeTypeImpl <em>Tracking Mode Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.TrackingModeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTrackingModeType()
	 * @generated
	 */
	int TRACKING_MODE_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACKING_MODE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACKING_MODE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Tracking Mode Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKING_MODE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.TransportGuaranteeTypeImpl <em>Transport Guarantee Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.TransportGuaranteeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTransportGuaranteeType()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_GUARANTEE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_GUARANTEE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Transport Guarantee Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_GUARANTEE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdBooleanTypeImpl <em>Xsd Boolean Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdBooleanType()
	 * @generated
	 */
	int XSD_BOOLEAN_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_BOOLEAN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_BOOLEAN_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Boolean Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOOLEAN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.TrueFalseTypeImpl <em>True False Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.TrueFalseTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTrueFalseType()
	 * @generated
	 */
	int TRUE_FALSE_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_TYPE__VALUE = XSD_BOOLEAN_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_TYPE__ID = XSD_BOOLEAN_TYPE__ID;

	/**
	 * The number of structural features of the '<em>True False Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_TYPE_FEATURE_COUNT = XSD_BOOLEAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.UrlPatternTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getUrlPatternType()
	 * @generated
	 */
	int URL_PATTERN_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Url Pattern Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.UserDataConstraintTypeImpl <em>User Data Constraint Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.UserDataConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getUserDataConstraintType()
	 * @generated
	 */
	int USER_DATA_CONSTRAINT_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Transport Guarantee</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>User Data Constraint Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_CONSTRAINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.WarPathTypeImpl
	 * <em>War Path Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.WarPathTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWarPathType()
	 * @generated
	 */
	int WAR_PATH_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WAR_PATH_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WAR_PATH_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>War Path Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAR_PATH_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebAppTypeImpl
	 * <em>Web App Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.WebAppTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWebAppType()
	 * @generated
	 */
	int WEB_APP_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MODULE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DISPLAY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ICON = 4;

	/**
	 * The feature id for the '<em><b>Distributable</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DISTRIBUTABLE = 5;

	/**
	 * The feature id for the '<em><b>Context Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__CONTEXT_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__FILTER = 7;

	/**
	 * The feature id for the '<em><b>Filter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__FILTER_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LISTENER = 9;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET = 10;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Session Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SESSION_CONFIG = 12;

	/**
	 * The feature id for the '<em><b>Mime Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MIME_MAPPING = 13;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__WELCOME_FILE_LIST = 14;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ERROR_PAGE = 15;

	/**
	 * The feature id for the '<em><b>Jsp Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__JSP_CONFIG = 16;

	/**
	 * The feature id for the '<em><b>Security Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Login Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LOGIN_CONFIG = 18;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_ROLE = 19;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ENV_ENTRY = 20;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__EJB_REF = 21;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__EJB_LOCAL_REF = 22;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVICE_REF = 23;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__RESOURCE_REF = 24;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__RESOURCE_ENV_REF = 25;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MESSAGE_DESTINATION_REF = 26;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__PERSISTENCE_CONTEXT_REF = 27;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__PERSISTENCE_UNIT_REF = 28;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__POST_CONSTRUCT = 29;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__PRE_DESTROY = 30;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DATA_SOURCE = 31;

	/**
	 * The feature id for the '<em><b>Message Destination</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MESSAGE_DESTINATION = 32;

	/**
	 * The feature id for the '<em><b>Locale Encoding Mapping List</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST = 33;

	/**
	 * The feature id for the '<em><b>Absolute Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ABSOLUTE_ORDERING = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ID = 35;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__METADATA_COMPLETE = 36;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__VERSION = 37;

	/**
	 * The number of structural features of the '<em>Web App Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE_FEATURE_COUNT = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl <em>Web Fragment Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.WebFragmentTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWebFragmentType()
	 * @generated
	 */
	int WEB_FRAGMENT_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__DISPLAY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__ICON = 4;

	/**
	 * The feature id for the '<em><b>Distributable</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__DISTRIBUTABLE = 5;

	/**
	 * The feature id for the '<em><b>Context Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__CONTEXT_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__FILTER = 7;

	/**
	 * The feature id for the '<em><b>Filter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__FILTER_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__LISTENER = 9;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__SERVLET = 10;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__SERVLET_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Session Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__SESSION_CONFIG = 12;

	/**
	 * The feature id for the '<em><b>Mime Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__MIME_MAPPING = 13;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__WELCOME_FILE_LIST = 14;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__ERROR_PAGE = 15;

	/**
	 * The feature id for the '<em><b>Jsp Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__JSP_CONFIG = 16;

	/**
	 * The feature id for the '<em><b>Security Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__SECURITY_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Login Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__LOGIN_CONFIG = 18;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__SECURITY_ROLE = 19;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__ENV_ENTRY = 20;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__EJB_REF = 21;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__EJB_LOCAL_REF = 22;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__SERVICE_REF = 23;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__RESOURCE_REF = 24;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__RESOURCE_ENV_REF = 25;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION_REF = 26;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__PERSISTENCE_CONTEXT_REF = 27;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__PERSISTENCE_UNIT_REF = 28;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__POST_CONSTRUCT = 29;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__PRE_DESTROY = 30;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__DATA_SOURCE = 31;

	/**
	 * The feature id for the '<em><b>Message Destination</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__MESSAGE_DESTINATION = 32;

	/**
	 * The feature id for the '<em><b>Locale Encoding Mapping List</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__LOCALE_ENCODING_MAPPING_LIST = 33;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__ORDERING = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__ID = 35;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__METADATA_COMPLETE = 36;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE__VERSION = 37;

	/**
	 * The number of structural features of the '<em>Web Fragment Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FRAGMENT_TYPE_FEATURE_COUNT = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WebResourceCollectionTypeImpl <em>Web Resource Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.WebResourceCollectionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWebResourceCollectionType()
	 * @generated
	 */
	int WEB_RESOURCE_COLLECTION_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Web Resource Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Http Method Omission</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD_OMISSION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Web Resource Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.WelcomeFileListTypeImpl <em>Welcome File List Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.WelcomeFileListTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWelcomeFileListType()
	 * @generated
	 */
	int WELCOME_FILE_LIST_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Welcome File</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST_TYPE__WELCOME_FILE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Welcome File List Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdAnyURITypeImpl <em>Xsd Any URI Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdAnyURITypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdAnyURIType()
	 * @generated
	 */
	int XSD_ANY_URI_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_ANY_URI_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_ANY_URI_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Any URI Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANY_URI_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdIntegerTypeImpl <em>Xsd Integer Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdIntegerType()
	 * @generated
	 */
	int XSD_INTEGER_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_INTEGER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Integer Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdNMTOKENTypeImpl <em>Xsd NMTOKEN Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdNMTOKENTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdNMTOKENType()
	 * @generated
	 */
	int XSD_NMTOKEN_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_NMTOKEN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_NMTOKEN_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd NMTOKEN Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NMTOKEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdNonNegativeIntegerTypeImpl <em>Xsd Non Negative Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdNonNegativeIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdNonNegativeIntegerType()
	 * @generated
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Non Negative Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.impl.XsdQNameTypeImpl <em>Xsd QName Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.XsdQNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getXsdQNameType()
	 * @generated
	 */
	int XSD_QNAME_TYPE = 104;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_QNAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int XSD_QNAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd QName Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_QNAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase <em>Addressing Responses Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAddressingResponsesTypeBase()
	 * @generated
	 */
	int ADDRESSING_RESPONSES_TYPE_BASE = 106;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase <em>Dispatcher Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDispatcherTypeBase()
	 * @generated
	 */
	int DISPATCHER_TYPE_BASE = 107;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbRefTypeTypeBase()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE = 108;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getGenericBooleanTypeBase()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE = 109;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType <em>Isolation Level Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getIsolationLevelType()
	 * @generated
	 */
	int ISOLATION_LEVEL_TYPE = 110;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}' enum.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationUsageTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE = 111;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.NullCharType
	 * <em>Null Char Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.NullCharType
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getNullCharType()
	 * @generated
	 */
	int NULL_CHAR_TYPE = 112;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase <em>Persistence Context Type Type Base</em>}' enum.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPersistenceContextTypeTypeBase()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE_BASE = 113;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase <em>Res Auth Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResAuthTypeBase()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE = 114;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResSharingScopeTypeBase()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE = 115;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase <em>Tracking Mode Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTrackingModeTypeBase()
	 * @generated
	 */
	int TRACKING_MODE_TYPE_BASE = 116;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase <em>Transport Guarantee Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTransportGuaranteeTypeBase()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE_BASE = 117;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType <em>Web App Version Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWebAppVersionType()
	 * @generated
	 */
	int WEB_APP_VERSION_TYPE = 118;

	/**
	 * The meta object id for the '
	 * <em>Addressing Responses Type Base Object</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAddressingResponsesTypeBaseObject()
	 * @generated
	 */
	int ADDRESSING_RESPONSES_TYPE_BASE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Auth Method Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getAuthMethodTypeBase()
	 * @generated
	 */
	int AUTH_METHOD_TYPE_BASE = 120;

	/**
	 * The meta object id for the '<em>Dewey Version Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDeweyVersionType()
	 * @generated
	 */
	int DEWEY_VERSION_TYPE = 121;

	/**
	 * The meta object id for the '<em>Dispatcher Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getDispatcherTypeBaseObject()
	 * @generated
	 */
	int DISPATCHER_TYPE_BASE_OBJECT = 122;

	/**
	 * The meta object id for the '<em>Ejb Link Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbLinkTypeBase()
	 * @generated
	 */
	int EJB_LINK_TYPE_BASE = 123;

	/**
	 * The meta object id for the '<em>Ejb Ref Name Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbRefNameTypeBase()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE_BASE = 124;

	/**
	 * The meta object id for the '<em>Ejb Ref Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEjbRefTypeTypeBaseObject()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE_OBJECT = 125;

	/**
	 * The meta object id for the '<em>Encoding Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEncodingType()
	 * @generated
	 */
	int ENCODING_TYPE = 126;

	/**
	 * The meta object id for the '<em>Env Entry Type Values Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getEnvEntryTypeValuesTypeBase()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_BASE = 127;

	/**
	 * The meta object id for the '<em>Error Code Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getErrorCodeTypeBase()
	 * @generated
	 */
	int ERROR_CODE_TYPE_BASE = 128;

	/**
	 * The meta object id for the '<em>Fully Qualified Class Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getFullyQualifiedClassTypeBase()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE_BASE = 129;

	/**
	 * The meta object id for the '<em>Generic Boolean Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getGenericBooleanTypeBaseObject()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE_OBJECT = 130;

	/**
	 * The meta object id for the '<em>Home Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getHomeTypeBase()
	 * @generated
	 */
	int HOME_TYPE_BASE = 131;

	/**
	 * The meta object id for the '<em>Http Method Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getHttpMethodType()
	 * @generated
	 */
	int HTTP_METHOD_TYPE = 132;

	/**
	 * The meta object id for the '<em>Isolation Level Type Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getIsolationLevelTypeObject()
	 * @generated
	 */
	int ISOLATION_LEVEL_TYPE_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Java Identifier Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJavaIdentifierTypeBase()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE_BASE = 134;

	/**
	 * The meta object id for the '<em>Java Type Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJavaTypeTypeBase()
	 * @generated
	 */
	int JAVA_TYPE_TYPE_BASE = 135;

	/**
	 * The meta object id for the '<em>Jdbc Url Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJdbcUrlTypeBase()
	 * @generated
	 */
	int JDBC_URL_TYPE_BASE = 136;

	/**
	 * The meta object id for the '<em>Jndi Name Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJndiNameTypeBase()
	 * @generated
	 */
	int JNDI_NAME_TYPE_BASE = 137;

	/**
	 * The meta object id for the '<em>Jsp File Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getJspFileTypeBase()
	 * @generated
	 */
	int JSP_FILE_TYPE_BASE = 138;

	/**
	 * The meta object id for the '<em>Load On Startup Type</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLoadOnStartupType()
	 * @generated
	 */
	int LOAD_ON_STARTUP_TYPE = 139;

	/**
	 * The meta object id for the '<em>Locale Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLocaleType()
	 * @generated
	 */
	int LOCALE_TYPE = 140;

	/**
	 * The meta object id for the '<em>Local Home Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLocalHomeTypeBase()
	 * @generated
	 */
	int LOCAL_HOME_TYPE_BASE = 141;

	/**
	 * The meta object id for the '<em>Local Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getLocalTypeBase()
	 * @generated
	 */
	int LOCAL_TYPE_BASE = 142;

	/**
	 * The meta object id for the '<em>Message Destination Link Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationLinkTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE_BASE = 143;

	/**
	 * The meta object id for the '<em>Message Destination Type Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationTypeTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE_BASE = 144;

	/**
	 * The meta object id for the '
	 * <em>Message Destination Usage Type Base Object</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMessageDestinationUsageTypeBaseObject()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT = 145;

	/**
	 * The meta object id for the '<em>Mime Type Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getMimeTypeTypeBase()
	 * @generated
	 */
	int MIME_TYPE_TYPE_BASE = 146;

	/**
	 * The meta object id for the '<em>Non Empty String Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getNonEmptyStringTypeBase()
	 * @generated
	 */
	int NON_EMPTY_STRING_TYPE_BASE = 147;

	/**
	 * The meta object id for the '<em>Null Char Type Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.NullCharType
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getNullCharTypeObject()
	 * @generated
	 */
	int NULL_CHAR_TYPE_OBJECT = 148;

	/**
	 * The meta object id for the '<em>Path Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPathTypeBase()
	 * @generated
	 */
	int PATH_TYPE_BASE = 149;

	/**
	 * The meta object id for the '
	 * <em>Persistence Context Type Type Base Object</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getPersistenceContextTypeTypeBaseObject()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT = 150;

	/**
	 * The meta object id for the '<em>Protocol Binding List Type</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getProtocolBindingListType()
	 * @generated
	 */
	int PROTOCOL_BINDING_LIST_TYPE = 151;

	/**
	 * The meta object id for the '<em>Protocol Binding Type</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getProtocolBindingType()
	 * @generated
	 */
	int PROTOCOL_BINDING_TYPE = 152;

	/**
	 * The meta object id for the '<em>Protocol URI Alias Type</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getProtocolURIAliasType()
	 * @generated
	 */
	int PROTOCOL_URI_ALIAS_TYPE = 153;

	/**
	 * The meta object id for the '<em>Qname Pattern</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getQnamePattern()
	 * @generated
	 */
	int QNAME_PATTERN = 154;

	/**
	 * The meta object id for the '<em>Remote Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getRemoteTypeBase()
	 * @generated
	 */
	int REMOTE_TYPE_BASE = 155;

	/**
	 * The meta object id for the '<em>Res Auth Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResAuthTypeBaseObject()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE_OBJECT = 156;

	/**
	 * The meta object id for the '<em>Res Sharing Scope Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getResSharingScopeTypeBaseObject()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE_OBJECT = 157;

	/**
	 * The meta object id for the '<em>Role Name Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getRoleNameTypeBase()
	 * @generated
	 */
	int ROLE_NAME_TYPE_BASE = 158;

	/**
	 * The meta object id for the '<em>Tracking Mode Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTrackingModeTypeBaseObject()
	 * @generated
	 */
	int TRACKING_MODE_TYPE_BASE_OBJECT = 159;

	/**
	 * The meta object id for the '<em>Transport Guarantee Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTransportGuaranteeTypeBaseObject()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT = 160;

	/**
	 * The meta object id for the '<em>True False Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTrueFalseTypeBase()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE = 161;

	/**
	 * The meta object id for the '<em>True False Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getTrueFalseTypeBaseObject()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE_OBJECT = 162;

	/**
	 * The meta object id for the '<em>War Path Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWarPathTypeBase()
	 * @generated
	 */
	int WAR_PATH_TYPE_BASE = 163;

	/**
	 * The meta object id for the '<em>Web App Version Type Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType
	 * @see org.eclipse.modisco.jee.webapp.webapp30.impl.Webapp30PackageImpl#getWebAppVersionTypeObject()
	 * @generated
	 */
	int WEB_APP_VERSION_TYPE_OBJECT = 164;

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType <em>Absolute Ordering Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Absolute Ordering Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType
	 * @generated
	 */
	EClass getAbsoluteOrderingType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getGroup()
	 * @see #getAbsoluteOrderingType()
	 * @generated
	 */
	EAttribute getAbsoluteOrderingType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getName()
	 * @see #getAbsoluteOrderingType()
	 * @generated
	 */
	EReference getAbsoluteOrderingType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getOthers <em>Others</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Others</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getOthers()
	 * @see #getAbsoluteOrderingType()
	 * @generated
	 */
	EReference getAbsoluteOrderingType_Others();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesType <em>Addressing Responses Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Addressing Responses Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesType
	 * @generated
	 */
	EClass getAddressingResponsesType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType <em>Addressing Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressing Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingType
	 * @generated
	 */
	EClass getAddressingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enabled</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getEnabled()
	 * @see #getAddressingType()
	 * @generated
	 */
	EReference getAddressingType_Enabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getRequired()
	 * @see #getAddressingType()
	 * @generated
	 */
	EReference getAddressingType_Required();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responses</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getResponses()
	 * @see #getAddressingType()
	 * @generated
	 */
	EReference getAddressingType_Responses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Auth Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType
	 * @generated
	 */
	EClass getAuthConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType#getDescription()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType#getRoleName()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AuthConstraintType#getId()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EAttribute getAuthConstraintType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.AuthMethodType
	 * <em>Auth Method Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Auth Method Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AuthMethodType
	 * @generated
	 */
	EClass getAuthMethodType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.CookieCommentType
	 * <em>Cookie Comment Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Cookie Comment Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieCommentType
	 * @generated
	 */
	EClass getCookieCommentType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType
	 * <em>Cookie Config Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Cookie Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType
	 * @generated
	 */
	EClass getCookieConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getName()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EReference getCookieConfigType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getDomain()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EReference getCookieConfigType_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getPath()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EReference getCookieConfigType_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getComment()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EReference getCookieConfigType_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getHttpOnly <em>Http Only</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Only</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getHttpOnly()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EReference getCookieConfigType_HttpOnly();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getSecure <em>Secure</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secure</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getSecure()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EReference getCookieConfigType_Secure();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getMaxAge <em>Max Age</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Age</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getMaxAge()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EReference getCookieConfigType_MaxAge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType#getId()
	 * @see #getCookieConfigType()
	 * @generated
	 */
	EAttribute getCookieConfigType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.CookieDomainType
	 * <em>Cookie Domain Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Cookie Domain Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieDomainType
	 * @generated
	 */
	EClass getCookieDomainType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.CookieNameType
	 * <em>Cookie Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Cookie Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookieNameType
	 * @generated
	 */
	EClass getCookieNameType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.CookiePathType
	 * <em>Cookie Path Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Cookie Path Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.CookiePathType
	 * @generated
	 */
	EClass getCookiePathType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType
	 * <em>Data Source Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Data Source Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType
	 * @generated
	 */
	EClass getDataSourceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDescription()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getName()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getClassName()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_ClassName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getServerName()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_ServerName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Number</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPortNumber()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_PortNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDatabaseName()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_DatabaseName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUrl()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUser()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_User();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPassword()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getProperty()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getLoginTimeout <em>Login Timeout</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login Timeout</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getLoginTimeout()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_LoginTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getTransactional <em>Transactional</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transactional</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getTransactional()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_Transactional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getIsolationLevel <em>Isolation Level</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolation Level</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getIsolationLevel()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EAttribute getDataSourceType_IsolationLevel();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getInitialPoolSize
	 * <em>Initial Pool Size</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Initial Pool Size</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getInitialPoolSize()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_InitialPoolSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxPoolSize <em>Max Pool Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Pool Size</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxPoolSize()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_MaxPoolSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMinPoolSize <em>Min Pool Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Pool Size</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMinPoolSize()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_MinPoolSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxIdleTime <em>Max Idle Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Idle Time</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxIdleTime()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_MaxIdleTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxStatements <em>Max Statements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Statements</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxStatements()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EReference getDataSourceType_MaxStatements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getId()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EAttribute getDataSourceType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.DescriptionType
	 * <em>Description Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.DescriptionType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DescriptionType#getLang()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.DispatcherType <em>Dispatcher Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatcher Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DispatcherType
	 * @generated
	 */
	EClass getDispatcherType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType
	 * <em>Display Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType#getLang()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getXMLNSPrefixMap
	 * <em>XMLNS Prefix Map</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getWebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web App</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot#getWebApp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebApp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType
	 * <em>Ejb Local Ref Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Ejb Local Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType
	 * @generated
	 */
	EClass getEjbLocalRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getDescription()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getEjbRefName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getEjbRefType()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getLocalHome()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getLocal()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getEjbLink()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getMappedName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getInjectionTarget()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_InjectionTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getLookupName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbLocalRefType#getId()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EAttribute getEjbLocalRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefNameType
	 * <em>Ejb Ref Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getMappedName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getInjectionTarget()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_InjectionTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getLookupName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeType
	 * <em>Ejb Ref Type Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.EmptyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EmptyType#getId()
	 * @see #getEmptyType()
	 * @generated
	 */
	EAttribute getEmptyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getMappedName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getInjectionTarget()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_InjectionTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getLookupName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Values Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EnvEntryTypeValuesType
	 * @generated
	 */
	EClass getEnvEntryTypeValuesType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Code Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorCodeType
	 * @generated
	 */
	EClass getErrorCodeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType
	 * @generated
	 */
	EClass getErrorPageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Code</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getErrorCode()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getExceptionType()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getLocation()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType#getId()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EAttribute getErrorPageType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType
	 * <em>Filter Mapping Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Filter Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType
	 * @generated
	 */
	EClass getFilterMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getFilterName()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_FilterName();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getGroup()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EAttribute getFilterMappingType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getUrlPattern()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getServletName()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_ServletName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getDispatcher <em>Dispatcher</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispatcher</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getDispatcher()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_Dispatcher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterMappingType#getId()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EAttribute getFilterMappingType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.FilterNameType
	 * <em>Filter Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Filter Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterNameType
	 * @generated
	 */
	EClass getFilterNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getDescription()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getDisplayName()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getIcon()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterName()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterClass <em>Filter Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getFilterClass()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getAsyncSupported <em>Async Supported</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Async Supported</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getAsyncSupported()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_AsyncSupported();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getInitParam()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_InitParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.FilterType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FilterType#getId()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Form Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType
	 * @generated
	 */
	EClass getFormLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType#getFormLoginPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormLoginPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType#getFormErrorPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormErrorPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType#getId()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EAttribute getFormLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Fully Qualified Class Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType
	 * @generated
	 */
	EClass getFullyQualifiedClassType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Generic Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanType
	 * @generated
	 */
	EClass getGenericBooleanType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType
	 * <em>Handler Chains Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Handler Chains Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType
	 * @generated
	 */
	EClass getHandlerChainsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType#getHandlerChain <em>Handler Chain</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler Chain</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType#getHandlerChain()
	 * @see #getHandlerChainsType()
	 * @generated
	 */
	EReference getHandlerChainsType_HandlerChain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainsType#getId()
	 * @see #getHandlerChainsType()
	 * @generated
	 */
	EAttribute getHandlerChainsType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType
	 * <em>Handler Chain Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Handler Chain Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType
	 * @generated
	 */
	EClass getHandlerChainType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getServiceNamePattern <em>Service Name Pattern</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getServiceNamePattern()
	 * @see #getHandlerChainType()
	 * @generated
	 */
	EAttribute getHandlerChainType_ServiceNamePattern();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getPortNamePattern
	 * <em>Port Name Pattern</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Port Name Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getPortNamePattern()
	 * @see #getHandlerChainType()
	 * @generated
	 */
	EAttribute getHandlerChainType_PortNamePattern();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getProtocolBindings
	 * <em>Protocol Bindings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Protocol Bindings</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getProtocolBindings()
	 * @see #getHandlerChainType()
	 * @generated
	 */
	EAttribute getHandlerChainType_ProtocolBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getHandler()
	 * @see #getHandlerChainType()
	 * @generated
	 */
	EReference getHandlerChainType_Handler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getId()
	 * @see #getHandlerChainType()
	 * @generated
	 */
	EAttribute getHandlerChainType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType
	 * @generated
	 */
	EClass getHandlerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getDescription()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getDisplayName()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getIcon()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerName()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_HandlerName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerClass <em>Handler Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerClass()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_HandlerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getInitParam()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_InitParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getSoapHeader <em>Soap Header</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Header</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getSoapHeader()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_SoapHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getSoapRole <em>Soap Role</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getSoapRole()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_SoapRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getPortName()
	 * @see #getHandlerType()
	 * @generated
	 */
	EReference getHandlerType_PortName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getId()
	 * @see #getHandlerType()
	 * @generated
	 */
	EAttribute getHandlerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IconType
	 * @generated
	 */
	EClass getIconType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.IconType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IconType#getSmallIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.IconType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IconType#getLargeIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.IconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IconType#getId()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.IconType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IconType#getLang()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType <em>Injection Target Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Injection Target Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType
	 * @generated
	 */
	EClass getInjectionTargetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType#getInjectionTargetClass <em>Injection Target Class</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Injection Target Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType#getInjectionTargetClass()
	 * @see #getInjectionTargetType()
	 * @generated
	 */
	EReference getInjectionTargetType_InjectionTargetClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType#getInjectionTargetName <em>Injection Target Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Injection Target Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType#getInjectionTargetName()
	 * @see #getInjectionTargetType()
	 * @generated
	 */
	EReference getInjectionTargetType_InjectionTargetName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Java Identifier Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType
	 * @generated
	 */
	EClass getJavaIdentifierType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JavaTypeType
	 * @generated
	 */
	EClass getJavaTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.JdbcUrlType <em>Jdbc Url Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jdbc Url Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JdbcUrlType
	 * @generated
	 */
	EClass getJdbcUrlType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jndi Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JndiNameType
	 * @generated
	 */
	EClass getJndiNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.JspConfigType <em>Jsp Config Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsp Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspConfigType
	 * @generated
	 */
	EClass getJspConfigType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.JspConfigType#getTaglib <em>Taglib</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taglib</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspConfigType#getTaglib()
	 * @see #getJspConfigType()
	 * @generated
	 */
	EReference getJspConfigType_Taglib();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.JspConfigType#getJspPropertyGroup
	 * <em>Jsp Property Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Jsp Property Group</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspConfigType#getJspPropertyGroup()
	 * @see #getJspConfigType()
	 * @generated
	 */
	EReference getJspConfigType_JspPropertyGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.JspConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspConfigType#getId()
	 * @see #getJspConfigType()
	 * @generated
	 */
	EAttribute getJspConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsp File Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspFileType
	 * @generated
	 */
	EClass getJspFileType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType <em>Jsp Property Group Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Jsp Property Group Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType
	 * @generated
	 */
	EClass getJspPropertyGroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDescription()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDisplayName()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIcon()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getUrlPattern()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getElIgnored <em>El Ignored</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>El Ignored</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getElIgnored()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_ElIgnored();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getPageEncoding <em>Page Encoding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Encoding</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getPageEncoding()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_PageEncoding();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getScriptingInvalid
	 * <em>Scripting Invalid</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Scripting Invalid</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getScriptingInvalid()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_ScriptingInvalid();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIsXml <em>Is Xml</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Xml</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIsXml()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_IsXml();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIncludePrelude <em>Include Prelude</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Prelude</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIncludePrelude()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_IncludePrelude();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIncludeCoda <em>Include Coda</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Coda</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getIncludeCoda()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_IncludeCoda();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDeferredSyntaxAllowedAsLiteral <em>Deferred Syntax Allowed As Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deferred Syntax Allowed As Literal</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDeferredSyntaxAllowedAsLiteral()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_DeferredSyntaxAllowedAsLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getTrimDirectiveWhitespaces <em>Trim Directive Whitespaces</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trim Directive Whitespaces</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getTrimDirectiveWhitespaces()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_TrimDirectiveWhitespaces();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDefaultContentType <em>Default Content Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Content Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getDefaultContentType()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_DefaultContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getBuffer()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_Buffer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getErrorOnUndeclaredNamespace <em>Error On Undeclared Namespace</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error On Undeclared Namespace</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getErrorOnUndeclaredNamespace()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_ErrorOnUndeclaredNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.JspPropertyGroupType#getId()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EAttribute getJspPropertyGroupType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType <em>Lifecycle Callback Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Callback Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType
	 * @generated
	 */
	EClass getLifecycleCallbackType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackClass <em>Lifecycle Callback Class</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle Callback Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackClass()
	 * @see #getLifecycleCallbackType()
	 * @generated
	 */
	EReference getLifecycleCallbackType_LifecycleCallbackClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackMethod <em>Lifecycle Callback Method</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle Callback Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackMethod()
	 * @see #getLifecycleCallbackType()
	 * @generated
	 */
	EReference getLifecycleCallbackType_LifecycleCallbackMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ListenerType
	 * @generated
	 */
	EClass getListenerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getDescription()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getDisplayName()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getIcon()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getListenerClass()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_ListenerClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ListenerType#getId()
	 * @see #getListenerType()
	 * @generated
	 */
	EAttribute getListenerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType <em>Locale Encoding Mapping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locale Encoding Mapping List Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType
	 * @generated
	 */
	EClass getLocaleEncodingMappingListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType#getLocaleEncodingMapping <em>Locale Encoding Mapping</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locale Encoding Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType#getLocaleEncodingMapping()
	 * @see #getLocaleEncodingMappingListType()
	 * @generated
	 */
	EReference getLocaleEncodingMappingListType_LocaleEncodingMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingListType#getId()
	 * @see #getLocaleEncodingMappingListType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingListType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType <em>Locale Encoding Mapping Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Locale Encoding Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType
	 * @generated
	 */
	EClass getLocaleEncodingMappingType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType#getLocale()
	 * @see #getLocaleEncodingMappingType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingType_Locale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType#getEncoding()
	 * @see #getLocaleEncodingMappingType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocaleEncodingMappingType#getId()
	 * @see #getLocaleEncodingMappingType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Home Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocalHomeType
	 * @generated
	 */
	EClass getLocalHomeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LocalType
	 * @generated
	 */
	EClass getLocalType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType
	 * <em>Login Config Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType
	 * @generated
	 */
	EClass getLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getAuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getAuthMethod()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_AuthMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getRealmName <em>Realm Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realm Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getRealmName()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_RealmName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getFormLoginConfig
	 * <em>Form Login Config</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Form Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getFormLoginConfig()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_FormLoginConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.LoginConfigType#getId()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EAttribute getLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationLinkType
	 * @generated
	 */
	EClass getMessageDestinationLinkType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType
	 * @generated
	 */
	EClass getMessageDestinationRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getDescription()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationRefName()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationType()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Usage</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationUsage()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationUsage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMessageDestinationLink()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getMappedName()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getInjectionTarget()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_InjectionTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getLookupName()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationRefType#getId()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EAttribute getMessageDestinationRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType
	 * @generated
	 */
	EClass getMessageDestinationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getDescription()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getDisplayName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getIcon()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getMessageDestinationName <em>Message Destination Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getMessageDestinationName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_MessageDestinationName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getMappedName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_MappedName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getLookupName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationType#getId()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EAttribute getMessageDestinationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationTypeType
	 * @generated
	 */
	EClass getMessageDestinationTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Usage Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageType
	 * @generated
	 */
	EClass getMessageDestinationUsageType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType
	 * <em>Mime Mapping Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Mime Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType
	 * @generated
	 */
	EClass getMimeMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getExtension()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getMimeType()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MimeMappingType#getId()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EAttribute getMimeMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MimeTypeType
	 * @generated
	 */
	EClass getMimeTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType <em>Multipart Config Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Multipart Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType
	 * @generated
	 */
	EClass getMultipartConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getLocation()
	 * @see #getMultipartConfigType()
	 * @generated
	 */
	EReference getMultipartConfigType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxFileSize <em>Max File Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max File Size</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxFileSize()
	 * @see #getMultipartConfigType()
	 * @generated
	 */
	EAttribute getMultipartConfigType_MaxFileSize();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxRequestSize
	 * <em>Max Request Size</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Max Request Size</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxRequestSize()
	 * @see #getMultipartConfigType()
	 * @generated
	 */
	EAttribute getMultipartConfigType_MaxRequestSize();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getFileSizeThreshold
	 * <em>File Size Threshold</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>File Size Threshold</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getFileSizeThreshold()
	 * @see #getMultipartConfigType()
	 * @generated
	 */
	EAttribute getMultipartConfigType_FileSizeThreshold();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.NonEmptyStringType <em>Non Empty String Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Non Empty String Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.NonEmptyStringType
	 * @generated
	 */
	EClass getNonEmptyStringType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType <em>Ordering Ordering Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Ordering Ordering Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType
	 * @generated
	 */
	EClass getOrderingOrderingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType#getName()
	 * @see #getOrderingOrderingType()
	 * @generated
	 */
	EReference getOrderingOrderingType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType#getOthers <em>Others</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Others</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType#getOthers()
	 * @see #getOrderingOrderingType()
	 * @generated
	 */
	EReference getOrderingOrderingType_Others();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType <em>Ordering Others Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Ordering Others Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType
	 * @generated
	 */
	EClass getOrderingOthersType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType#getId()
	 * @see #getOrderingOthersType()
	 * @generated
	 */
	EAttribute getOrderingOthersType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType <em>Ordering Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordering Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingType
	 * @generated
	 */
	EClass getOrderingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getAfter()
	 * @see #getOrderingType()
	 * @generated
	 */
	EReference getOrderingType_After();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getBefore()
	 * @see #getOrderingType()
	 * @generated
	 */
	EReference getOrderingType_Before();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType
	 * <em>Param Value Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Param Value Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ParamValueType
	 * @generated
	 */
	EClass getParamValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getDescription()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getParamName()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getParamValue()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ParamValueType#getId()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PathType
	 * @generated
	 */
	EClass getPathType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType <em>Persistence Context Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Persistence Context Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType
	 * @generated
	 */
	EClass getPersistenceContextRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getDescription()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextRefName <em>Persistence Context Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Context Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextRefName()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceContextRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceUnitName <em>Persistence Unit Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceUnitName()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceUnitName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextType <em>Persistence Context Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Context Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextType()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceContextType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceProperty <em>Persistence Property</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Property</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceProperty()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getMappedName()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getInjectionTarget()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getId()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EAttribute getPersistenceContextRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeType <em>Persistence Context Type Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Persistence Context Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeType
	 * @generated
	 */
	EClass getPersistenceContextTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType <em>Persistence Unit Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType
	 * @generated
	 */
	EClass getPersistenceUnitRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getDescription()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getPersistenceUnitRefName <em>Persistence Unit Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getPersistenceUnitRefName()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_PersistenceUnitRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getPersistenceUnitName <em>Persistence Unit Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getPersistenceUnitName()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_PersistenceUnitName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getMappedName()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getInjectionTarget()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceUnitRefType#getId()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EAttribute getPersistenceUnitRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Port Component Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType
	 * @generated
	 */
	EClass getPortComponentRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Endpoint Interface</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getServiceEndpointInterface()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_ServiceEndpointInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getEnableMtom <em>Enable Mtom</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable Mtom</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getEnableMtom()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_EnableMtom();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getMtomThreshold <em>Mtom Threshold</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mtom Threshold</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getMtomThreshold()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_MtomThreshold();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getAddressing <em>Addressing</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addressing</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getAddressing()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_Addressing();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getRespectBinding <em>Respect Binding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Respect Binding</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getRespectBinding()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_RespectBinding();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getPortComponentLink
	 * <em>Port Component Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Port Component Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getPortComponentLink()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_PortComponentLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PortComponentRefType#getId()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EAttribute getPortComponentRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.PropertyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PropertyType#getId()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType
	 * @generated
	 */
	EClass getResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getDescription()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getResourceEnvRefName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getResourceEnvRefType()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getMappedName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getInjectionTarget()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_InjectionTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getLookupName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceEnvRefType#getId()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EAttribute getResourceEnvRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType
	 * <em>Resource Ref Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResSharingScope
	 * <em>Res Sharing Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getResSharingScope()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResSharingScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getMappedName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getInjectionTarget()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_InjectionTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getLookupName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType <em>Respect Binding Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Respect Binding Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType
	 * @generated
	 */
	EClass getRespectBindingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enabled</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RespectBindingType#getEnabled()
	 * @see #getRespectBindingType()
	 * @generated
	 */
	EReference getRespectBindingType_Enabled();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Res Sharing Scope Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeType
	 * @generated
	 */
	EClass getResSharingScopeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run As Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RunAsType
	 * @generated
	 */
	EClass getRunAsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.RunAsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RunAsType#getDescription()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.RunAsType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RunAsType#getRoleName()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.RunAsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.RunAsType#getId()
	 * @see #getRunAsType()
	 * @generated
	 */
	EAttribute getRunAsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Security Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType
	 * @generated
	 */
	EClass getSecurityConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getDisplayName()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getWebResourceCollection <em>Web Resource Collection</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Resource Collection</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getWebResourceCollection()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_WebResourceCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getAuthConstraint <em>Auth Constraint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getAuthConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_AuthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getUserDataConstraint <em>User Data Constraint</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getUserDataConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_UserDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType#getId()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EAttribute getSecurityConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType
	 * <em>Security Role Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType
	 * <em>Service Ref Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Service Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType
	 * @generated
	 */
	EClass getServiceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getDescription()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getDisplayName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getIcon()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Icon();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceRefName
	 * <em>Service Ref Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Service Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceRefName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceRefName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceInterface
	 * <em>Service Interface</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Service Interface</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceInterface()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceInterface();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceRefType
	 * <em>Service Ref Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Service Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceRefType()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getWsdlFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_WsdlFile();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getJaxrpcMappingFile
	 * <em>Jaxrpc Mapping File</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Jaxrpc Mapping File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getJaxrpcMappingFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_JaxrpcMappingFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceQname <em>Service Qname</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Qname</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getServiceQname()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceQname();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getPortComponentRef
	 * <em>Port Component Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Port Component Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getPortComponentRef()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_PortComponentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getHandler()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Handler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getHandlerChains <em>Handler Chains</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Chains</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getHandlerChains()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_HandlerChains();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getMappedName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getInjectionTarget
	 * <em>Injection Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getInjectionTarget()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_InjectionTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getLookupName <em>Lookup Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getLookupName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_LookupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServiceRefType#getId()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EAttribute getServiceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Servlet Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType
	 * @generated
	 */
	EClass getServletMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType#getServletName()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_ServletName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType#getUrlPattern()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_UrlPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletMappingType#getId()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EAttribute getServletMappingType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServletNameType
	 * <em>Servlet Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Servlet Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletNameType
	 * @generated
	 */
	EClass getServletNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType
	 * @generated
	 */
	EClass getServletType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getDescription()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getDisplayName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getIcon()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getServletName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getServletClass <em>Servlet Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getServletClass()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getJspFile <em>Jsp File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jsp File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getJspFile()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_JspFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getInitParam()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_InitParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getLoadOnStartup <em>Load On Startup</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load On Startup</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getLoadOnStartup()
	 * @see #getServletType()
	 * @generated
	 */
	EAttribute getServletType_LoadOnStartup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enabled</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getEnabled()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Enabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getAsyncSupported <em>Async Supported</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Async Supported</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getAsyncSupported()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_AsyncSupported();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getRunAs()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_RunAs();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getSecurityRoleRef
	 * <em>Security Role Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getSecurityRoleRef()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getMultipartConfig
	 * <em>Multipart Config</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Multipart Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getMultipartConfig()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_MultipartConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.ServletType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ServletType#getId()
	 * @see #getServletType()
	 * @generated
	 */
	EAttribute getServletType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType
	 * <em>Session Config Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Session Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType
	 * @generated
	 */
	EClass getSessionConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Timeout</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getSessionTimeout()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EReference getSessionConfigType_SessionTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getCookieConfig <em>Cookie Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cookie Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getCookieConfig()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EReference getSessionConfigType_CookieConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getTrackingMode <em>Tracking Mode</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracking Mode</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getTrackingMode()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EReference getSessionConfigType_TrackingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType#getId()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EAttribute getSessionConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.String <em>String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.String#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.String#getId()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TaglibType
	 * @generated
	 */
	EClass getTaglibType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibUri <em>Taglib Uri</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Uri</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibUri()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibLocation <em>Taglib Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibLocation()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getId()
	 * @see #getTaglibType()
	 * @generated
	 */
	EAttribute getTaglibType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType
	 * <em>Tracking Mode Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Tracking Mode Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType
	 * @generated
	 */
	EClass getTrackingModeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Transport Guarantee Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeType
	 * @generated
	 */
	EClass getTransportGuaranteeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>True False Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrueFalseType
	 * @generated
	 */
	EClass getTrueFalseType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType
	 * <em>Url Pattern Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Url Pattern Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType
	 * @generated
	 */
	EClass getUrlPatternType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UrlPatternType#getValue()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>User Data Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType
	 * @generated
	 */
	EClass getUserDataConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType#getDescription()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType#getTransportGuarantee
	 * <em>Transport Guarantee</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Transport Guarantee</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType#getTransportGuarantee()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_TransportGuarantee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.UserDataConstraintType#getId()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EAttribute getUserDataConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.WarPathType <em>War Path Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>War Path Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WarPathType
	 * @generated
	 */
	EClass getWarPathType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType
	 * @generated
	 */
	EClass getWebAppType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getGroup()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getModuleName()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ModuleName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDescription()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDisplayName()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getIcon()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDistributable <em>Distributable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distributable</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDistributable()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Distributable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getContextParam <em>Context Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getContextParam()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ContextParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getFilter()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getFilterMapping <em>Filter Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getFilterMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_FilterMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listener</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getListener()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Listener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getServlet()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Servlet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getServletMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ServletMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getSessionConfig <em>Session Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getSessionConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SessionConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getMimeMapping <em>Mime Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getMimeMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MimeMapping();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getWelcomeFileList
	 * <em>Welcome File List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Welcome File List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getWelcomeFileList()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_WelcomeFileList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getErrorPage()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ErrorPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getJspConfig <em>Jsp Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jsp Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getJspConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_JspConfig();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getSecurityConstraint
	 * <em>Security Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Security Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getSecurityConstraint()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getLoginConfig <em>Login Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getLoginConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_LoginConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getSecurityRole()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getEnvEntry()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getEjbRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getEjbLocalRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getServiceRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getResourceRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getResourceEnvRef
	 * <em>Resource Env Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getResourceEnvRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getMessageDestinationRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPersistenceContextRef <em>Persistence Context Ref</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPersistenceContextRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_PersistenceContextRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPersistenceUnitRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_PersistenceUnitRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPostConstruct <em>Post Construct</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Construct</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPostConstruct()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_PostConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPreDestroy <em>Pre Destroy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroy</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getPreDestroy()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_PreDestroy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Source</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getDataSource()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_DataSource();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getMessageDestination
	 * <em>Message Destination</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Message Destination</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getMessageDestination()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MessageDestination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getLocaleEncodingMappingList <em>Locale Encoding Mapping List</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locale Encoding Mapping List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getLocaleEncodingMappingList()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_LocaleEncodingMappingList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getAbsoluteOrdering
	 * <em>Absolute Ordering</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Absolute Ordering</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getAbsoluteOrdering()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_AbsoluteOrdering();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getId()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#isMetadataComplete
	 * <em>Metadata Complete</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#isMetadataComplete()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_MetadataComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppType#getVersion()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Version();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType
	 * <em>Web Fragment Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Web Fragment Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType
	 * @generated
	 */
	EClass getWebFragmentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getGroup()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EAttribute getWebFragmentType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getName()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDescription()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDisplayName()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getIcon()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDistributable <em>Distributable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distributable</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDistributable()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Distributable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getContextParam <em>Context Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getContextParam()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_ContextParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getFilter()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getFilterMapping <em>Filter Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getFilterMapping()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_FilterMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listener</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getListener()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Listener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getServlet()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Servlet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getServletMapping()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_ServletMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getSessionConfig <em>Session Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getSessionConfig()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_SessionConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getMimeMapping <em>Mime Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getMimeMapping()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_MimeMapping();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getWelcomeFileList
	 * <em>Welcome File List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Welcome File List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getWelcomeFileList()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_WelcomeFileList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getErrorPage()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_ErrorPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getJspConfig <em>Jsp Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jsp Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getJspConfig()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_JspConfig();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getSecurityConstraint
	 * <em>Security Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Security Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getSecurityConstraint()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_SecurityConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getLoginConfig <em>Login Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getLoginConfig()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_LoginConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getSecurityRole()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getEnvEntry()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getEjbRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getEjbLocalRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getServiceRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getResourceRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getResourceEnvRef
	 * <em>Resource Env Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getResourceEnvRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getMessageDestinationRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPersistenceContextRef <em>Persistence Context Ref</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPersistenceContextRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_PersistenceContextRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPersistenceUnitRef()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_PersistenceUnitRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPostConstruct <em>Post Construct</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Construct</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPostConstruct()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_PostConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPreDestroy <em>Pre Destroy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroy</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getPreDestroy()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_PreDestroy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Source</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getDataSource()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_DataSource();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getMessageDestination
	 * <em>Message Destination</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Message Destination</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getMessageDestination()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_MessageDestination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getLocaleEncodingMappingList <em>Locale Encoding Mapping List</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locale Encoding Mapping List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getLocaleEncodingMappingList()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_LocaleEncodingMappingList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ordering</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getOrdering()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EReference getWebFragmentType_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getId()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EAttribute getWebFragmentType_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#isMetadataComplete
	 * <em>Metadata Complete</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#isMetadataComplete()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EAttribute getWebFragmentType_MetadataComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebFragmentType#getVersion()
	 * @see #getWebFragmentType()
	 * @generated
	 */
	EAttribute getWebFragmentType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Web Resource Collection Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType
	 * @generated
	 */
	EClass getWebResourceCollectionType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getWebResourceName
	 * <em>Web Resource Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Web Resource Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getWebResourceName()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_WebResourceName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getDescription()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getUrlPattern()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_UrlPattern();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Http Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getHttpMethod()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EAttribute getWebResourceCollectionType_HttpMethod();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getHttpMethodOmission <em>Http Method Omission</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute list '<em>Http Method Omission</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getHttpMethodOmission()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EAttribute getWebResourceCollectionType_HttpMethodOmission();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebResourceCollectionType#getId()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EAttribute getWebResourceCollectionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Welcome File List Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType
	 * @generated
	 */
	EClass getWelcomeFileListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType#getWelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Welcome File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType#getWelcomeFile()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EAttribute getWelcomeFileListType_WelcomeFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WelcomeFileListType#getId()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EAttribute getWelcomeFileListType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType
	 * <em>Xsd Any URI Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd Any URI Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType
	 * @generated
	 */
	EClass getXsdAnyURIType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType#getValue()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdAnyURIType#getId()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType
	 * <em>Xsd Boolean Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType
	 * @generated
	 */
	EClass getXsdBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType#isValue()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType#getId()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType
	 * <em>Xsd Integer Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType
	 * @generated
	 */
	EClass getXsdIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType#getValue()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType#getId()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType
	 * <em>Xsd NMTOKEN Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd NMTOKEN Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType
	 * @generated
	 */
	EClass getXsdNMTOKENType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType#getValue()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNMTOKENType#getId()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Xsd Non Negative Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType
	 * @generated
	 */
	EClass getXsdNonNegativeIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType#getValue()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdNonNegativeIntegerType#getId()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Xsd Positive Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType
	 * @generated
	 */
	EClass getXsdPositiveIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType#getValue()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdPositiveIntegerType#getId()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd QName Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType
	 * @generated
	 */
	EClass getXsdQNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType#getValue()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType#getId()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd String Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdStringType
	 * @generated
	 */
	EClass getXsdStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdStringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdStringType#getValue()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp30.XsdStringType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.XsdStringType#getId()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Id();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase <em>Addressing Responses Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Addressing Responses Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase
	 * @generated
	 */
	EEnum getAddressingResponsesTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase <em>Dispatcher Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Dispatcher Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase
	 * @generated
	 */
	EEnum getDispatcherTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Ejb Ref Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase
	 * @generated
	 */
	EEnum getEjbRefTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Generic Boolean Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase
	 * @generated
	 */
	EEnum getGenericBooleanTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType <em>Isolation Level Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Isolation Level Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType
	 * @generated
	 */
	EEnum getIsolationLevelType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Destination Usage Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase
	 * @generated
	 */
	EEnum getMessageDestinationUsageTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.NullCharType <em>Null Char Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Null Char Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.NullCharType
	 * @generated
	 */
	EEnum getNullCharType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase <em>Persistence Context Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Context Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase
	 * @generated
	 */
	EEnum getPersistenceContextTypeTypeBase();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase
	 * <em>Res Auth Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Res Auth Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase
	 * @generated
	 */
	EEnum getResAuthTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Res Sharing Scope Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase
	 * @generated
	 */
	EEnum getResSharingScopeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase <em>Tracking Mode Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Tracking Mode Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase
	 * @generated
	 */
	EEnum getTrackingModeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase <em>Transport Guarantee Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Transport Guarantee Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase
	 * @generated
	 */
	EEnum getTransportGuaranteeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType <em>Web App Version Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Web App Version Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType
	 * @generated
	 */
	EEnum getWebAppVersionType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase <em>Addressing Responses Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Addressing Responses Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.AddressingResponsesTypeBase"
	 *        extendedMetaData="name='addressing-responsesType_._base:Object' baseType='addressing-responsesType_._base'"
	 * @generated
	 */
	EDataType getAddressingResponsesTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Auth Method Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Auth Method Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='auth-methodType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getAuthMethodTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Dewey Version Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Dewey Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='dewey-versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\.?[0-9]+(\\.[0-9]+)*'"
	 * @generated
	 */
	EDataType getDeweyVersionType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase <em>Dispatcher Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Dispatcher Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.DispatcherTypeBase"
	 *        extendedMetaData="name='dispatcherType_._base:Object' baseType='dispatcherType_._base'"
	 * @generated
	 */
	EDataType getDispatcherTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Ejb Link Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Ejb Link Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='ejb-linkType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getEjbLinkTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ejb Ref Name Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ejb-ref-nameType_._base'"
	 * @generated
	 */
	EDataType getEjbRefNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.EjbRefTypeTypeBase"
	 *        extendedMetaData="name='ejb-ref-typeType_._base:Object' baseType='ejb-ref-typeType_._base'"
	 * @generated
	 */
	EDataType getEjbRefTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Encoding Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Encoding Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='encodingType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[^\\s]+'"
	 * @generated
	 */
	EDataType getEncodingType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Env Entry Type Values Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Env Entry Type Values Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='env-entry-type-valuesType_._base'"
	 * @generated
	 */
	EDataType getEnvEntryTypeValuesTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Error Code Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Error Code Type Base</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='error-codeType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' pattern='\\d{3}'"
	 * @generated
	 */
	EDataType getErrorCodeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fully Qualified Class Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Fully Qualified Class Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fully-qualified-classType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getFullyQualifiedClassTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase <em>Generic Boolean Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Generic Boolean Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.GenericBooleanTypeBase"
	 *        extendedMetaData="name='generic-booleanType_._base:Object' baseType='generic-booleanType_._base'"
	 * @generated
	 */
	EDataType getGenericBooleanTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Home Type Base</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Home Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='homeType_._base'"
	 * @generated
	 */
	EDataType getHomeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Http Method Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Http Method Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='http-methodType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[!-~-[\\(\\)<>@,;:\"/\\[\\]?=\\{\\}\\\\\\p{Z}]]+'"
	 * @generated
	 */
	EDataType getHttpMethodType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType <em>Isolation Level Type Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Isolation Level Type Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType"
	 *        extendedMetaData="name='isolation-levelType:Object' baseType='isolation-levelType'"
	 * @generated
	 */
	EDataType getIsolationLevelTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Java Identifier Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Java Identifier Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='java-identifierType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*'"
	 * @generated
	 */
	EDataType getJavaIdentifierTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Java Type Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Java Type Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='java-typeType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[^\\p{Z}]*'"
	 * @generated
	 */
	EDataType getJavaTypeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Jdbc Url Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Jdbc Url Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='jdbc-urlType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='jdbc:(.*):(.*)'"
	 * @generated
	 */
	EDataType getJdbcUrlTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Jndi Name Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Jndi Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='jndi-nameType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getJndiNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Jsp File Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Jsp File Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='jsp-fileType_._base'"
	 * @generated
	 */
	EDataType getJspFileTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Load On Startup Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Load On Startup Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='load-on-startupType' memberTypes='null-charType http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getLoadOnStartupType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Locale Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='localeType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[a-z]{2}(_|-)?([\\p{L}\\-\\p{Nd}]{2})?'"
	 * @generated
	 */
	EDataType getLocaleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local Home Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Local Home Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='local-homeType_._base'"
	 * @generated
	 */
	EDataType getLocalHomeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local Type Base</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='localType_._base'"
	 * @generated
	 */
	EDataType getLocalTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Message Destination Link Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Destination Link Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='message-destination-linkType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getMessageDestinationLinkTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Message Destination Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Destination Type Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='message-destination-typeType_._base'"
	 * @generated
	 */
	EDataType getMessageDestinationTypeTypeBase();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase
	 * <em>Message Destination Usage Type Base Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '
	 *         <em>Message Destination Usage Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase
	 * @model instanceClass=
	 *        "org.eclipse.modisco.jee.webapp.webapp30.MessageDestinationUsageTypeBase"
	 *        extendedMetaData=
	 *        "name='message-destination-usageType_._base:Object' baseType='message-destination-usageType_._base'"
	 * @generated
	 */
	EDataType getMessageDestinationUsageTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Mime Type Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Mime Type Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='mime-typeType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[^\\p{Cc}^\\s]+/[^\\p{Cc}^\\s]+'"
	 * @generated
	 */
	EDataType getMimeTypeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Empty String Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Non Empty String Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nonEmptyStringType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' minLength='1'"
	 * @generated
	 */
	EDataType getNonEmptyStringTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.NullCharType <em>Null Char Type Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Null Char Type Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.NullCharType
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.NullCharType"
	 *        extendedMetaData="name='null-charType:Object' baseType='null-charType'"
	 * @generated
	 */
	EDataType getNullCharTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Path Type Base</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='pathType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getPathTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase <em>Persistence Context Type Type Base Object</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Persistence Context Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextTypeTypeBase"
	 *        extendedMetaData="name='persistence-context-typeType_._base:Object' baseType='persistence-context-typeType_._base'"
	 * @generated
	 */
	EDataType getPersistenceContextTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Protocol Binding List Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Protocol Binding List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='protocol-bindingListType' itemType='protocol-bindingType'"
	 * @generated
	 */
	EDataType getProtocolBindingListType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Protocol Binding Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Protocol Binding Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='protocol-bindingType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI protocol-URIAliasType'"
	 * @generated
	 */
	EDataType getProtocolBindingType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Protocol URI Alias Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Protocol URI Alias Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='protocol-URIAliasType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='##.+'"
	 * @generated
	 */
	EDataType getProtocolURIAliasType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Qname Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qname Pattern</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='qname-pattern' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\*|([\\i-[:]][\\c-[:]]*:)?[\\i-[:]][\\c-[:]]*\\*?'"
	 * @generated
	 */
	EDataType getQnamePattern();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Remote Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Remote Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='remoteType_._base'"
	 * @generated
	 */
	EDataType getRemoteTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase <em>Res Auth Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Res Auth Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.ResAuthTypeBase"
	 *        extendedMetaData="name='res-authType_._base:Object' baseType='res-authType_._base'"
	 * @generated
	 */
	EDataType getResAuthTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Sharing Scope Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.ResSharingScopeTypeBase"
	 *        extendedMetaData="name='res-sharing-scopeType_._base:Object' baseType='res-sharing-scopeType_._base'"
	 * @generated
	 */
	EDataType getResSharingScopeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>Role Name Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Role Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='role-nameType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getRoleNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase <em>Tracking Mode Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Tracking Mode Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.TrackingModeTypeBase"
	 *        extendedMetaData="name='tracking-modeType_._base:Object' baseType='tracking-modeType_._base'"
	 * @generated
	 */
	EDataType getTrackingModeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase <em>Transport Guarantee Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transport Guarantee Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.TransportGuaranteeTypeBase"
	 *        extendedMetaData="name='transport-guaranteeType_._base:Object' baseType='transport-guaranteeType_._base'"
	 * @generated
	 */
	EDataType getTransportGuaranteeTypeBaseObject();

	/**
	 * Returns the meta object for data type '<em>True False Type Base</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>True False Type Base</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='true-falseType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean' pattern='(true|false)'"
	 * @generated
	 */
	EDataType getTrueFalseTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>True False Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>True False Type Base Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='true-falseType_._base:Object' baseType='true-falseType_._base'"
	 * @generated
	 */
	EDataType getTrueFalseTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>War Path Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>War Path Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='war-pathType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='/.*'"
	 * @generated
	 */
	EDataType getWarPathTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType <em>Web App Version Type Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Web App Version Type Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp30.WebAppVersionType"
	 *        extendedMetaData="name='web-app-versionType:Object' baseType='web-app-versionType'"
	 * @generated
	 */
	EDataType getWebAppVersionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Webapp30Factory getWebapp30Factory();

} // Webapp30Package
