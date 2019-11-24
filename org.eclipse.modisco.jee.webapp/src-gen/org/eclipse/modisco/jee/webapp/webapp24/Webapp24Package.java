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
package org.eclipse.modisco.jee.webapp.webapp24;

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
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Factory
 * @model kind="package"
 * @generated
 */
public interface Webapp24Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapp24"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/web-app_2_4.xsd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapp24"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	Webapp24Package eINSTANCE = org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.AuthConstraintTypeImpl <em>Auth Constraint Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.AuthConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getAuthConstraintType()
	 * @generated
	 */
	int AUTH_CONSTRAINT_TYPE = 0;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.StringImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getString()
	 * @generated
	 */
	int STRING = 64;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.AuthMethodTypeImpl <em>Auth Method Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.AuthMethodTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getAuthMethodType()
	 * @generated
	 */
	int AUTH_METHOD_TYPE = 1;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdStringTypeImpl <em>Xsd String Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdStringTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdStringType()
	 * @generated
	 */
	int XSD_STRING_TYPE = 81;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 2;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.DispatcherTypeImpl <em>Dispatcher Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DispatcherTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDispatcherType()
	 * @generated
	 */
	int DISPATCHER_TYPE = 3;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDisplayNameType()
	 * @generated
	 */
	int DISPLAY_NAME_TYPE = 4;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.DocumentRootImpl
	 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLinkTypeImpl
	 * <em>Ejb Link Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbLinkType()
	 * @generated
	 */
	int EJB_LINK_TYPE = 6;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbLocalRefType()
	 * @generated
	 */
	int EJB_LOCAL_REF_TYPE = 7;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Ejb Local Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JndiNameTypeImpl <em>Jndi Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JndiNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJndiNameType()
	 * @generated
	 */
	int JNDI_NAME_TYPE = 27;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 8;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeImpl
	 * <em>Ejb Ref Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 9;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Ejb Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 10;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.EmptyTypeImpl
	 * <em>Empty Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EmptyTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 11;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 12;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Env Entry Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeValuesTypeImpl <em>Env Entry Type Values Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeValuesTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryTypeValuesType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Env Entry Type Values Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdPositiveIntegerTypeImpl <em>Xsd Positive Integer Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdPositiveIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdPositiveIntegerType()
	 * @generated
	 */
	int XSD_POSITIVE_INTEGER_TYPE = 79;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorCodeTypeImpl <em>Error Code Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorCodeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getErrorCodeType()
	 * @generated
	 */
	int ERROR_CODE_TYPE = 14;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorPageTypeImpl <em>Error Page Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorPageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getErrorPageType()
	 * @generated
	 */
	int ERROR_PAGE_TYPE = 15;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl <em>Filter Mapping Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFilterMappingType()
	 * @generated
	 */
	int FILTER_MAPPING_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__FILTER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__URL_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__SERVLET_NAME = 2;

	/**
	 * The feature id for the '<em><b>Dispatcher</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__DISPATCHER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Filter Mapping Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_MAPPING_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.NonEmptyStringTypeImpl <em>Non Empty String Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.NonEmptyStringTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getNonEmptyStringType()
	 * @generated
	 */
	int NON_EMPTY_STRING_TYPE = 44;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterNameTypeImpl <em>Filter Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FilterNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFilterNameType()
	 * @generated
	 */
	int FILTER_NAME_TYPE = 17;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterTypeImpl
	 * <em>Filter Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FilterTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 18;

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
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__INIT_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FormLoginConfigTypeImpl <em>Form Login Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FormLoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFormLoginConfigType()
	 * @generated
	 */
	int FORM_LOGIN_CONFIG_TYPE = 19;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FullyQualifiedClassTypeImpl <em>Fully Qualified Class Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FullyQualifiedClassTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFullyQualifiedClassType()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE = 20;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.GenericBooleanTypeImpl <em>Generic Boolean Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.GenericBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getGenericBooleanType()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE = 21;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 22;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.HttpMethodTypeImpl <em>Http Method Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.HttpMethodTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHttpMethodType()
	 * @generated
	 */
	int HTTP_METHOD_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Http Method Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.IconTypeImpl <em>Icon Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.IconTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 24;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JavaIdentifierTypeImpl <em>Java Identifier Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JavaIdentifierTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaIdentifierType()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE = 25;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JavaTypeTypeImpl <em>Java Type Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JavaTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaTypeType()
	 * @generated
	 */
	int JAVA_TYPE_TYPE = 26;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JspConfigTypeImpl <em>Jsp Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JspConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspConfigType()
	 * @generated
	 */
	int JSP_CONFIG_TYPE = 28;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.PathTypeImpl <em>Path Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.PathTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getPathType()
	 * @generated
	 */
	int PATH_TYPE = 46;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.JspFileTypeImpl
	 * <em>Jsp File Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JspFileTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspFileType()
	 * @generated
	 */
	int JSP_FILE_TYPE = 29;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JspPropertyGroupTypeImpl <em>Jsp Property Group Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JspPropertyGroupTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspPropertyGroupType()
	 * @generated
	 */
	int JSP_PROPERTY_GROUP_TYPE = 30;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE__ID = 10;

	/**
	 * The number of structural features of the '<em>Jsp Property Group Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_PROPERTY_GROUP_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.ListenerTypeImpl
	 * <em>Listener Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ListenerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getListenerType()
	 * @generated
	 */
	int LISTENER_TYPE = 31;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingListTypeImpl <em>Locale Encoding Mapping List Type</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingListTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocaleEncodingMappingListType()
	 * @generated
	 */
	int LOCALE_ENCODING_MAPPING_LIST_TYPE = 32;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingTypeImpl <em>Locale Encoding Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocaleEncodingMappingType()
	 * @generated
	 */
	int LOCALE_ENCODING_MAPPING_TYPE = 33;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocalHomeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalHomeType()
	 * @generated
	 */
	int LOCAL_HOME_TYPE = 34;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocalTypeImpl
	 * <em>Local Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocalTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalType()
	 * @generated
	 */
	int LOCAL_TYPE = 35;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LoginConfigTypeImpl <em>Login Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LoginConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLoginConfigType()
	 * @generated
	 */
	int LOGIN_CONFIG_TYPE = 36;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationLinkTypeImpl <em>Message Destination Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationLinkTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationLinkType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE = 37;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationRefTypeImpl <em>Message Destination Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationRefType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_REF_TYPE = 38;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Message Destination Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl <em>Message Destination Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE = 39;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Message Destination Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeTypeImpl <em>Message Destination Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationTypeType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE = 40;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationUsageTypeImpl <em>Message Destination Usage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationUsageTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationUsageType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE = 41;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MimeMappingTypeImpl <em>Mime Mapping Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MimeMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMimeMappingType()
	 * @generated
	 */
	int MIME_MAPPING_TYPE = 42;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MimeTypeTypeImpl <em>Mime Type Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MimeTypeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMimeTypeType()
	 * @generated
	 */
	int MIME_TYPE_TYPE = 43;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getParamValueType()
	 * @generated
	 */
	int PARAM_VALUE_TYPE = 45;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.PortComponentRefTypeImpl <em>Port Component Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.PortComponentRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getPortComponentRefType()
	 * @generated
	 */
	int PORT_COMPONENT_REF_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Service Endpoint Interface</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Port Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Port Component Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.RemoteTypeImpl
	 * <em>Remote Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 48;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResAuthTypeImpl
	 * <em>Res Auth Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 49;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceEnvRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResourceEnvRefType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE = 50;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Resource Env Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 51;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Resource Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResSharingScopeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResSharingScopeType()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE = 52;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 53;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.RunAsTypeImpl
	 * <em>Run As Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.RunAsTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRunAsType()
	 * @generated
	 */
	int RUN_AS_TYPE = 54;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl <em>Security Constraint Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSecurityConstraintType()
	 * @generated
	 */
	int SECURITY_CONSTRAINT_TYPE = 55;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 56;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 57;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefHandlerTypeImpl <em>Service Ref Handler Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefHandlerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServiceRefHandlerType()
	 * @generated
	 */
	int SERVICE_REF_HANDLER_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Handler Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__HANDLER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Handler Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__INIT_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Soap Header</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__SOAP_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Soap Role</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__SOAP_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__PORT_NAME = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__ID = 9;

	/**
	 * The number of structural features of the '<em>Service Ref Handler Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl <em>Service Ref Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServiceRefType()
	 * @generated
	 */
	int SERVICE_REF_TYPE = 59;

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
	 * The feature id for the '<em><b>Wsdl File</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__WSDL_FILE = 5;

	/**
	 * The feature id for the '<em><b>Jaxrpc Mapping File</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE = 6;

	/**
	 * The feature id for the '<em><b>Service Qname</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_QNAME = 7;

	/**
	 * The feature id for the '<em><b>Port Component Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__PORT_COMPONENT_REF = 8;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__HANDLER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__ID = 10;

	/**
	 * The number of structural features of the '<em>Service Ref Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServletMappingTypeImpl <em>Servlet Mapping Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServletMappingTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServletMappingType()
	 * @generated
	 */
	int SERVLET_MAPPING_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_TYPE__SERVLET_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' containment reference.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServletNameTypeImpl <em>Servlet Name Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServletNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServletNameType()
	 * @generated
	 */
	int SERVLET_NAME_TYPE = 61;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServletTypeImpl
	 * <em>Servlet Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServletTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServletType()
	 * @generated
	 */
	int SERVLET_TYPE = 62;

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
	 * The feature id for the '<em><b>Load On Startup</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__LOAD_ON_STARTUP = 7;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__RUN_AS = 8;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__SECURITY_ROLE_REF = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE__ID = 10;

	/**
	 * The number of structural features of the '<em>Servlet Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SessionConfigTypeImpl <em>Session Config Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SessionConfigTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSessionConfigType()
	 * @generated
	 */
	int SESSION_CONFIG_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Session Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__SESSION_TIMEOUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Session Config Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_CONFIG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.TaglibTypeImpl
	 * <em>Taglib Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.TaglibTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTaglibType()
	 * @generated
	 */
	int TAGLIB_TYPE = 65;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TransportGuaranteeTypeImpl <em>Transport Guarantee Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.TransportGuaranteeTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTransportGuaranteeType()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE = 66;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdBooleanTypeImpl <em>Xsd Boolean Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdBooleanType()
	 * @generated
	 */
	int XSD_BOOLEAN_TYPE = 75;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TrueFalseTypeImpl <em>True False Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.TrueFalseTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTrueFalseType()
	 * @generated
	 */
	int TRUE_FALSE_TYPE = 67;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.UrlPatternTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getUrlPatternType()
	 * @generated
	 */
	int URL_PATTERN_TYPE = 68;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.UserDataConstraintTypeImpl <em>User Data Constraint Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.UserDataConstraintTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getUserDataConstraintType()
	 * @generated
	 */
	int USER_DATA_CONSTRAINT_TYPE = 69;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.WarPathTypeImpl
	 * <em>War Path Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WarPathTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWarPathType()
	 * @generated
	 */
	int WAR_PATH_TYPE = 70;

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl
	 * <em>Web App Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebAppType()
	 * @generated
	 */
	int WEB_APP_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DISPLAY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ICON = 3;

	/**
	 * The feature id for the '<em><b>Distributable</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__DISTRIBUTABLE = 4;

	/**
	 * The feature id for the '<em><b>Context Param</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__CONTEXT_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__FILTER = 6;

	/**
	 * The feature id for the '<em><b>Filter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__FILTER_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LISTENER = 8;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET = 9;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVLET_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Session Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SESSION_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Mime Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MIME_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__WELCOME_FILE_LIST = 13;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ERROR_PAGE = 14;

	/**
	 * The feature id for the '<em><b>Jsp Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__JSP_CONFIG = 15;

	/**
	 * The feature id for the '<em><b>Security Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Login Config</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LOGIN_CONFIG = 17;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SECURITY_ROLE = 18;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ENV_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__EJB_REF = 20;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__EJB_LOCAL_REF = 21;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__SERVICE_REF = 22;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__RESOURCE_REF = 23;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__RESOURCE_ENV_REF = 24;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MESSAGE_DESTINATION_REF = 25;

	/**
	 * The feature id for the '<em><b>Message Destination</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__MESSAGE_DESTINATION = 26;

	/**
	 * The feature id for the '<em><b>Locale Encoding Mapping List</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__ID = 28;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE__VERSION = 29;

	/**
	 * The number of structural features of the '<em>Web App Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_TYPE_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl <em>Web Resource Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebResourceCollectionType()
	 * @generated
	 */
	int WEB_RESOURCE_COLLECTION_TYPE = 72;

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
	 * The feature id for the '<em><b>Http Method</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WelcomeFileListTypeImpl <em>Welcome File List Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WelcomeFileListTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWelcomeFileListType()
	 * @generated
	 */
	int WELCOME_FILE_LIST_TYPE = 73;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdAnyURITypeImpl <em>Xsd Any URI Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdAnyURITypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdAnyURIType()
	 * @generated
	 */
	int XSD_ANY_URI_TYPE = 74;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdIntegerTypeImpl <em>Xsd Integer Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdIntegerType()
	 * @generated
	 */
	int XSD_INTEGER_TYPE = 76;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNMTOKENTypeImpl <em>Xsd NMTOKEN Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNMTOKENTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdNMTOKENType()
	 * @generated
	 */
	int XSD_NMTOKEN_TYPE = 77;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNonNegativeIntegerTypeImpl <em>Xsd Non Negative Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNonNegativeIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdNonNegativeIntegerType()
	 * @generated
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE = 78;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdQNameTypeImpl <em>Xsd QName Type</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdQNameTypeImpl
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdQNameType()
	 * @generated
	 */
	int XSD_QNAME_TYPE = 80;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase <em>Dispatcher Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDispatcherTypeBase()
	 * @generated
	 */
	int DISPATCHER_TYPE_BASE = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefTypeTypeBase()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryTypeValuesTypeBase()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_BASE = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getGenericBooleanTypeBase()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase <em>Http Method Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHttpMethodTypeBase()
	 * @generated
	 */
	int HTTP_METHOD_TYPE_BASE = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}' enum.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationUsageTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase <em>Res Auth Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResAuthTypeBase()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE = 88;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResSharingScopeTypeBase()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE = 89;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase <em>Transport Guarantee Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTransportGuaranteeTypeBase()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE_BASE = 90;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType <em>Web App Version Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebAppVersionType()
	 * @generated
	 */
	int WEB_APP_VERSION_TYPE = 91;

	/**
	 * The meta object id for the '<em>Auth Method Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getAuthMethodTypeBase()
	 * @generated
	 */
	int AUTH_METHOD_TYPE_BASE = 92;

	/**
	 * The meta object id for the '<em>Dewey Version Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.math.BigDecimal
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDeweyVersionType()
	 * @generated
	 */
	int DEWEY_VERSION_TYPE = 93;

	/**
	 * The meta object id for the '<em>Dispatcher Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDispatcherTypeBaseObject()
	 * @generated
	 */
	int DISPATCHER_TYPE_BASE_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Ejb Link Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbLinkTypeBase()
	 * @generated
	 */
	int EJB_LINK_TYPE_BASE = 95;

	/**
	 * The meta object id for the '<em>Ejb Ref Name Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefNameTypeBase()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE_BASE = 96;

	/**
	 * The meta object id for the '<em>Ejb Ref Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefTypeTypeBaseObject()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE_OBJECT = 97;

	/**
	 * The meta object id for the '<em>Encoding Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEncodingType()
	 * @generated
	 */
	int ENCODING_TYPE = 98;

	/**
	 * The meta object id for the '
	 * <em>Env Entry Type Values Type Base Object</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryTypeValuesTypeBaseObject()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT = 99;

	/**
	 * The meta object id for the '<em>Error Code Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getErrorCodeTypeBase()
	 * @generated
	 */
	int ERROR_CODE_TYPE_BASE = 100;

	/**
	 * The meta object id for the '<em>Fully Qualified Class Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFullyQualifiedClassTypeBase()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE_BASE = 101;

	/**
	 * The meta object id for the '<em>Generic Boolean Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getGenericBooleanTypeBaseObject()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE_OBJECT = 102;

	/**
	 * The meta object id for the '<em>Home Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHomeTypeBase()
	 * @generated
	 */
	int HOME_TYPE_BASE = 103;

	/**
	 * The meta object id for the '<em>Http Method Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHttpMethodTypeBaseObject()
	 * @generated
	 */
	int HTTP_METHOD_TYPE_BASE_OBJECT = 104;

	/**
	 * The meta object id for the '<em>Java Identifier Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaIdentifierTypeBase()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE_BASE = 105;

	/**
	 * The meta object id for the '<em>Java Type Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaTypeTypeBase()
	 * @generated
	 */
	int JAVA_TYPE_TYPE_BASE = 106;

	/**
	 * The meta object id for the '<em>Jndi Name Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJndiNameTypeBase()
	 * @generated
	 */
	int JNDI_NAME_TYPE_BASE = 107;

	/**
	 * The meta object id for the '<em>Jsp File Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspFileTypeBase()
	 * @generated
	 */
	int JSP_FILE_TYPE_BASE = 108;

	/**
	 * The meta object id for the '<em>Locale Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocaleType()
	 * @generated
	 */
	int LOCALE_TYPE = 109;

	/**
	 * The meta object id for the '<em>Local Home Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalHomeTypeBase()
	 * @generated
	 */
	int LOCAL_HOME_TYPE_BASE = 110;

	/**
	 * The meta object id for the '<em>Local Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalTypeBase()
	 * @generated
	 */
	int LOCAL_TYPE_BASE = 111;

	/**
	 * The meta object id for the '<em>Message Destination Link Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationLinkTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE_BASE = 112;

	/**
	 * The meta object id for the '<em>Message Destination Type Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationTypeTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE_BASE = 113;

	/**
	 * The meta object id for the '
	 * <em>Message Destination Usage Type Base Object</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationUsageTypeBaseObject()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Mime Type Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMimeTypeTypeBase()
	 * @generated
	 */
	int MIME_TYPE_TYPE_BASE = 115;

	/**
	 * The meta object id for the '<em>Non Empty String Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getNonEmptyStringTypeBase()
	 * @generated
	 */
	int NON_EMPTY_STRING_TYPE_BASE = 116;

	/**
	 * The meta object id for the '<em>Path Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getPathTypeBase()
	 * @generated
	 */
	int PATH_TYPE_BASE = 117;

	/**
	 * The meta object id for the '<em>Remote Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRemoteTypeBase()
	 * @generated
	 */
	int REMOTE_TYPE_BASE = 118;

	/**
	 * The meta object id for the '<em>Res Auth Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResAuthTypeBaseObject()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Res Sharing Scope Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResSharingScopeTypeBaseObject()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Role Name Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRoleNameTypeBase()
	 * @generated
	 */
	int ROLE_NAME_TYPE_BASE = 121;

	/**
	 * The meta object id for the '<em>Transport Guarantee Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTransportGuaranteeTypeBaseObject()
	 * @generated
	 */
	int TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT = 122;

	/**
	 * The meta object id for the '<em>True False Type Base</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTrueFalseTypeBase()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE = 123;

	/**
	 * The meta object id for the '<em>True False Type Base Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTrueFalseTypeBaseObject()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE_OBJECT = 124;

	/**
	 * The meta object id for the '<em>War Path Type Base</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWarPathTypeBase()
	 * @generated
	 */
	int WAR_PATH_TYPE_BASE = 125;

	/**
	 * The meta object id for the '<em>Web App Version Type Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
	 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebAppVersionTypeObject()
	 * @generated
	 */
	int WEB_APP_VERSION_TYPE_OBJECT = 126;

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType <em>Auth Constraint Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Auth Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType
	 * @generated
	 */
	EClass getAuthConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType#getDescription()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType#getRoleName()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EReference getAuthConstraintType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType#getId()
	 * @see #getAuthConstraintType()
	 * @generated
	 */
	EAttribute getAuthConstraintType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.AuthMethodType
	 * <em>Auth Method Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Auth Method Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.AuthMethodType
	 * @generated
	 */
	EClass getAuthMethodType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.DescriptionType
	 * <em>Description Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.DescriptionType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DescriptionType#getLang()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.DispatcherType <em>Dispatcher Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatcher Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherType
	 * @generated
	 */
	EClass getDispatcherType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType
	 * <em>Display Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType#getLang()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getXMLNSPrefixMap
	 * <em>XMLNS Prefix Map</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getWebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web App</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot#getWebApp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebApp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType
	 * <em>Ejb Local Ref Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Ejb Local Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType
	 * @generated
	 */
	EClass getEjbLocalRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getDescription()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getEjbRefName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getEjbRefType()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getLocalHome()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getLocal()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getEjbLink()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType#getId()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EAttribute getEjbLocalRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefNameType
	 * <em>Ejb Ref Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeType
	 * <em>Ejb Ref Type Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.EmptyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EmptyType#getId()
	 * @see #getEmptyType()
	 * @generated
	 */
	EAttribute getEmptyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Values Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesType
	 * @generated
	 */
	EClass getEnvEntryTypeValuesType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorCodeType <em>Error Code Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Code Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorCodeType
	 * @generated
	 */
	EClass getErrorCodeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType <em>Error Page Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Page Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType
	 * @generated
	 */
	EClass getErrorPageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Code</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getErrorCode()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ErrorCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getExceptionType()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_ExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getLocation()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EReference getErrorPageType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType#getId()
	 * @see #getErrorPageType()
	 * @generated
	 */
	EAttribute getErrorPageType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType
	 * <em>Filter Mapping Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Filter Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType
	 * @generated
	 */
	EClass getFilterMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getFilterName()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_FilterName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getUrlPattern()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getServletName()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_ServletName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getDispatcher <em>Dispatcher</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispatcher</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getDispatcher()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EReference getFilterMappingType_Dispatcher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType#getId()
	 * @see #getFilterMappingType()
	 * @generated
	 */
	EAttribute getFilterMappingType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.FilterNameType
	 * <em>Filter Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Filter Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterNameType
	 * @generated
	 */
	EClass getFilterNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType#getDescription()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType#getDisplayName()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType#getIcon()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType#getFilterName()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType#getFilterClass <em>Filter Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType#getFilterClass()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_FilterClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType#getInitParam()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_InitParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.FilterType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FilterType#getId()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType <em>Form Login Config Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Form Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType
	 * @generated
	 */
	EClass getFormLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType#getFormLoginPage <em>Form Login Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Login Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType#getFormLoginPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormLoginPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType#getFormErrorPage <em>Form Error Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType#getFormErrorPage()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EReference getFormLoginConfigType_FormErrorPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FormLoginConfigType#getId()
	 * @see #getFormLoginConfigType()
	 * @generated
	 */
	EAttribute getFormLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Fully Qualified Class Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType
	 * @generated
	 */
	EClass getFullyQualifiedClassType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Generic Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanType
	 * @generated
	 */
	EClass getGenericBooleanType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType
	 * <em>Http Method Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Http Method Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType
	 * @generated
	 */
	EClass getHttpMethodType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.IconType
	 * @generated
	 */
	EClass getIconType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.IconType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.IconType#getSmallIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.IconType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.IconType#getLargeIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.IconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.IconType#getId()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.IconType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.IconType#getLang()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Java Identifier Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JavaIdentifierType
	 * @generated
	 */
	EClass getJavaIdentifierType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JavaTypeType
	 * @generated
	 */
	EClass getJavaTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jndi Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JndiNameType
	 * @generated
	 */
	EClass getJndiNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType <em>Jsp Config Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsp Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspConfigType
	 * @generated
	 */
	EClass getJspConfigType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getTaglib <em>Taglib</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taglib</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getTaglib()
	 * @see #getJspConfigType()
	 * @generated
	 */
	EReference getJspConfigType_Taglib();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getJspPropertyGroup
	 * <em>Jsp Property Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Jsp Property Group</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getJspPropertyGroup()
	 * @see #getJspConfigType()
	 * @generated
	 */
	EReference getJspConfigType_JspPropertyGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getId()
	 * @see #getJspConfigType()
	 * @generated
	 */
	EAttribute getJspConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.JspFileType <em>Jsp File Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsp File Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspFileType
	 * @generated
	 */
	EClass getJspFileType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType <em>Jsp Property Group Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Jsp Property Group Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType
	 * @generated
	 */
	EClass getJspPropertyGroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getDescription()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getDisplayName()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIcon()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getUrlPattern()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getElIgnored <em>El Ignored</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>El Ignored</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getElIgnored()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_ElIgnored();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getPageEncoding <em>Page Encoding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Encoding</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getPageEncoding()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_PageEncoding();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getScriptingInvalid
	 * <em>Scripting Invalid</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Scripting Invalid</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getScriptingInvalid()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_ScriptingInvalid();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIsXml <em>Is Xml</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Xml</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIsXml()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_IsXml();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIncludePrelude <em>Include Prelude</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Prelude</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIncludePrelude()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_IncludePrelude();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIncludeCoda <em>Include Coda</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Coda</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getIncludeCoda()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EReference getJspPropertyGroupType_IncludeCoda();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType#getId()
	 * @see #getJspPropertyGroupType()
	 * @generated
	 */
	EAttribute getJspPropertyGroupType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ListenerType
	 * @generated
	 */
	EClass getListenerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getDescription()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getDisplayName()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getIcon()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getListenerClass()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_ListenerClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ListenerType#getId()
	 * @see #getListenerType()
	 * @generated
	 */
	EAttribute getListenerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType <em>Locale Encoding Mapping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locale Encoding Mapping List Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType
	 * @generated
	 */
	EClass getLocaleEncodingMappingListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType#getLocaleEncodingMapping <em>Locale Encoding Mapping</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locale Encoding Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType#getLocaleEncodingMapping()
	 * @see #getLocaleEncodingMappingListType()
	 * @generated
	 */
	EReference getLocaleEncodingMappingListType_LocaleEncodingMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType#getId()
	 * @see #getLocaleEncodingMappingListType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingListType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType <em>Locale Encoding Mapping Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Locale Encoding Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType
	 * @generated
	 */
	EClass getLocaleEncodingMappingType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType#getLocale()
	 * @see #getLocaleEncodingMappingType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingType_Locale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType#getEncoding()
	 * @see #getLocaleEncodingMappingType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingType#getId()
	 * @see #getLocaleEncodingMappingType()
	 * @generated
	 */
	EAttribute getLocaleEncodingMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Home Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocalHomeType
	 * @generated
	 */
	EClass getLocalHomeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LocalType
	 * @generated
	 */
	EClass getLocalType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType
	 * <em>Login Config Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Login Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType
	 * @generated
	 */
	EClass getLoginConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getAuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getAuthMethod()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_AuthMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getRealmName <em>Realm Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realm Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getRealmName()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_RealmName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getFormLoginConfig
	 * <em>Form Login Config</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Form Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getFormLoginConfig()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EReference getLoginConfigType_FormLoginConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType#getId()
	 * @see #getLoginConfigType()
	 * @generated
	 */
	EAttribute getLoginConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Link Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationLinkType
	 * @generated
	 */
	EClass getMessageDestinationLinkType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType
	 * @generated
	 */
	EClass getMessageDestinationRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getDescription()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationRefName()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationType()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Usage</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationUsage()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationUsage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationLink()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getId()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EAttribute getMessageDestinationRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType
	 * @generated
	 */
	EClass getMessageDestinationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getDescription()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getDisplayName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getIcon()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getMessageDestinationName <em>Message Destination Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getMessageDestinationName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_MessageDestinationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType#getId()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EAttribute getMessageDestinationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationTypeType
	 * @generated
	 */
	EClass getMessageDestinationTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Usage Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageType
	 * @generated
	 */
	EClass getMessageDestinationUsageType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType
	 * <em>Mime Mapping Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Mime Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType
	 * @generated
	 */
	EClass getMimeMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType#getExtension()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mime Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType#getMimeType()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EReference getMimeMappingType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType#getId()
	 * @see #getMimeMappingType()
	 * @generated
	 */
	EAttribute getMimeMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mime Type Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MimeTypeType
	 * @generated
	 */
	EClass getMimeTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.NonEmptyStringType <em>Non Empty String Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Non Empty String Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.NonEmptyStringType
	 * @generated
	 */
	EClass getNonEmptyStringType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType
	 * <em>Param Value Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Param Value Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ParamValueType
	 * @generated
	 */
	EClass getParamValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getDescription()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamName()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamValue()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getId()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.PathType
	 * @generated
	 */
	EClass getPathType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Port Component Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType
	 * @generated
	 */
	EClass getPortComponentRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Endpoint Interface</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType#getServiceEndpointInterface()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_ServiceEndpointInterface();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType#getPortComponentLink
	 * <em>Port Component Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Port Component Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType#getPortComponentLink()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_PortComponentLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.PortComponentRefType#getId()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EAttribute getPortComponentRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType
	 * @generated
	 */
	EClass getResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getDescription()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getResourceEnvRefName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getResourceEnvRefType()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType#getId()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EAttribute getResourceEnvRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType
	 * <em>Resource Ref Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResSharingScope
	 * <em>Res Sharing Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResSharingScope()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResSharingScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Res Sharing Scope Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeType
	 * @generated
	 */
	EClass getResSharingScopeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run As Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RunAsType
	 * @generated
	 */
	EClass getRunAsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.RunAsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RunAsType#getDescription()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.RunAsType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RunAsType#getRoleName()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.RunAsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.RunAsType#getId()
	 * @see #getRunAsType()
	 * @generated
	 */
	EAttribute getRunAsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType <em>Security Constraint Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Security Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType
	 * @generated
	 */
	EClass getSecurityConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getDisplayName()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getWebResourceCollection <em>Web Resource Collection</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Resource Collection</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getWebResourceCollection()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_WebResourceCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getAuthConstraint <em>Auth Constraint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getAuthConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_AuthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getUserDataConstraint <em>User Data Constraint</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getUserDataConstraint()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EReference getSecurityConstraintType_UserDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType#getId()
	 * @see #getSecurityConstraintType()
	 * @generated
	 */
	EAttribute getSecurityConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType
	 * <em>Security Role Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType <em>Service Ref Handler Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType
	 * @generated
	 */
	EClass getServiceRefHandlerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getDescription()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getDisplayName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getIcon()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getHandlerName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_HandlerName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getHandlerClass <em>Handler Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getHandlerClass()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_HandlerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getInitParam()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_InitParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getSoapHeader <em>Soap Header</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Header</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getSoapHeader()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_SoapHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getSoapRole <em>Soap Role</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getSoapRole()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_SoapRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getPortName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_PortName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefHandlerType#getId()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType
	 * <em>Service Ref Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Service Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType
	 * @generated
	 */
	EClass getServiceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getDescription()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getDisplayName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getIcon()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Icon();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getServiceRefName
	 * <em>Service Ref Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Service Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getServiceRefName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceRefName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getServiceInterface
	 * <em>Service Interface</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Service Interface</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getServiceInterface()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getWsdlFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_WsdlFile();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getJaxrpcMappingFile
	 * <em>Jaxrpc Mapping File</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Jaxrpc Mapping File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getJaxrpcMappingFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_JaxrpcMappingFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getServiceQname <em>Service Qname</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Qname</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getServiceQname()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceQname();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getPortComponentRef
	 * <em>Port Component Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Port Component Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getPortComponentRef()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_PortComponentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getHandler()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Handler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType#getId()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EAttribute getServiceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType <em>Servlet Mapping Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Servlet Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType
	 * @generated
	 */
	EClass getServletMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType#getServletName()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType#getUrlPattern()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EReference getServletMappingType_UrlPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType#getId()
	 * @see #getServletMappingType()
	 * @generated
	 */
	EAttribute getServletMappingType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ServletNameType
	 * <em>Servlet Name Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Servlet Name Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletNameType
	 * @generated
	 */
	EClass getServletNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType <em>Servlet Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType
	 * @generated
	 */
	EClass getServletType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getDescription()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getDisplayName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getIcon()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletName <em>Servlet Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletName()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletClass <em>Servlet Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Class</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletClass()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_ServletClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getJspFile <em>Jsp File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jsp File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getJspFile()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_JspFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getInitParam()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_InitParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getLoadOnStartup <em>Load On Startup</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load On Startup</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getLoadOnStartup()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_LoadOnStartup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getRunAs()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_RunAs();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getSecurityRoleRef
	 * <em>Security Role Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getSecurityRoleRef()
	 * @see #getServletType()
	 * @generated
	 */
	EReference getServletType_SecurityRoleRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ServletType#getId()
	 * @see #getServletType()
	 * @generated
	 */
	EAttribute getServletType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType
	 * <em>Session Config Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Session Config Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType
	 * @generated
	 */
	EClass getSessionConfigType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Timeout</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType#getSessionTimeout()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EReference getSessionConfigType_SessionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType#getId()
	 * @see #getSessionConfigType()
	 * @generated
	 */
	EAttribute getSessionConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.String <em>String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.String#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.String#getId()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.TaglibType <em>Taglib Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taglib Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TaglibType
	 * @generated
	 */
	EClass getTaglibType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.TaglibType#getTaglibUri <em>Taglib Uri</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Uri</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TaglibType#getTaglibUri()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.webapp.webapp24.TaglibType#getTaglibLocation <em>Taglib Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taglib Location</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TaglibType#getTaglibLocation()
	 * @see #getTaglibType()
	 * @generated
	 */
	EReference getTaglibType_TaglibLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.TaglibType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TaglibType#getId()
	 * @see #getTaglibType()
	 * @generated
	 */
	EAttribute getTaglibType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeType <em>Transport Guarantee Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Transport Guarantee Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeType
	 * @generated
	 */
	EClass getTransportGuaranteeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>True False Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TrueFalseType
	 * @generated
	 */
	EClass getTrueFalseType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType
	 * <em>Url Pattern Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Url Pattern Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType
	 * @generated
	 */
	EClass getUrlPatternType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType#getValue()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType <em>User Data Constraint Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>User Data Constraint Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType
	 * @generated
	 */
	EClass getUserDataConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType#getDescription()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_Description();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType#getTransportGuarantee
	 * <em>Transport Guarantee</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Transport Guarantee</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType#getTransportGuarantee()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EReference getUserDataConstraintType_TransportGuarantee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType#getId()
	 * @see #getUserDataConstraintType()
	 * @generated
	 */
	EAttribute getUserDataConstraintType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.WarPathType <em>War Path Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>War Path Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WarPathType
	 * @generated
	 */
	EClass getWarPathType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType <em>Web App Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType
	 * @generated
	 */
	EClass getWebAppType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getGroup()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDescription()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDisplayName()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getIcon()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDistributable <em>Distributable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distributable</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDistributable()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Distributable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getContextParam <em>Context Param</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Param</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getContextParam()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ContextParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getFilter()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getFilterMapping <em>Filter Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getFilterMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_FilterMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listener</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getListener()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Listener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServlet()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_Servlet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servlet Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServletMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ServletMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSessionConfig <em>Session Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSessionConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SessionConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMimeMapping <em>Mime Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Mapping</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMimeMapping()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MimeMapping();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getWelcomeFileList
	 * <em>Welcome File List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Welcome File List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getWelcomeFileList()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_WelcomeFileList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Page</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getErrorPage()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ErrorPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getJspConfig <em>Jsp Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jsp Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getJspConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_JspConfig();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSecurityConstraint
	 * <em>Security Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Security Constraint</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSecurityConstraint()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getLoginConfig <em>Login Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Login Config</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getLoginConfig()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_LoginConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSecurityRole()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEnvEntry()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEjbRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEjbLocalRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServiceRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getResourceRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getResourceEnvRef
	 * <em>Resource Env Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getResourceEnvRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMessageDestinationRef()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMessageDestination
	 * <em>Message Destination</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Message Destination</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMessageDestination()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_MessageDestination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getLocaleEncodingMappingList <em>Locale Encoding Mapping List</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locale Encoding Mapping List</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getLocaleEncodingMappingList()
	 * @see #getWebAppType()
	 * @generated
	 */
	EReference getWebAppType_LocaleEncodingMappingList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getId()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getVersion()
	 * @see #getWebAppType()
	 * @generated
	 */
	EAttribute getWebAppType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType <em>Web Resource Collection Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Web Resource Collection Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType
	 * @generated
	 */
	EClass getWebResourceCollectionType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getWebResourceName
	 * <em>Web Resource Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Web Resource Name</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getWebResourceName()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_WebResourceName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getDescription()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getUrlPattern()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_UrlPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Http Method</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getHttpMethod()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EReference getWebResourceCollectionType_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType#getId()
	 * @see #getWebResourceCollectionType()
	 * @generated
	 */
	EAttribute getWebResourceCollectionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType <em>Welcome File List Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Welcome File List Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType
	 * @generated
	 */
	EClass getWelcomeFileListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType#getWelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Welcome File</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType#getWelcomeFile()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EAttribute getWelcomeFileListType_WelcomeFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType#getId()
	 * @see #getWelcomeFileListType()
	 * @generated
	 */
	EAttribute getWelcomeFileListType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType
	 * <em>Xsd Any URI Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd Any URI Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType
	 * @generated
	 */
	EClass getXsdAnyURIType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType#getValue()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdAnyURIType#getId()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType
	 * <em>Xsd Boolean Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType
	 * @generated
	 */
	EClass getXsdBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType#isValue()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdBooleanType#getId()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType
	 * <em>Xsd Integer Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType
	 * @generated
	 */
	EClass getXsdIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType#getValue()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdIntegerType#getId()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType
	 * <em>Xsd NMTOKEN Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Xsd NMTOKEN Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType
	 * @generated
	 */
	EClass getXsdNMTOKENType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType#getValue()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNMTOKENType#getId()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Xsd Non Negative Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType
	 * @generated
	 */
	EClass getXsdNonNegativeIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType#getValue()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdNonNegativeIntegerType#getId()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Xsd Positive Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType
	 * @generated
	 */
	EClass getXsdPositiveIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType#getValue()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdPositiveIntegerType#getId()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd QName Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType
	 * @generated
	 */
	EClass getXsdQNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType#getValue()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdQNameType#getId()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd String Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdStringType
	 * @generated
	 */
	EClass getXsdStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdStringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdStringType#getValue()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.webapp.webapp24.XsdStringType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.XsdStringType#getId()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Id();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase <em>Dispatcher Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Dispatcher Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase
	 * @generated
	 */
	EEnum getDispatcherTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Ejb Ref Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase
	 * @generated
	 */
	EEnum getEjbRefTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Env Entry Type Values Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase
	 * @generated
	 */
	EEnum getEnvEntryTypeValuesTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Generic Boolean Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase
	 * @generated
	 */
	EEnum getGenericBooleanTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase <em>Http Method Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Http Method Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase
	 * @generated
	 */
	EEnum getHttpMethodTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Destination Usage Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
	 * @generated
	 */
	EEnum getMessageDestinationUsageTypeBase();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase
	 * <em>Res Auth Type Base</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Res Auth Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase
	 * @generated
	 */
	EEnum getResAuthTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Res Sharing Scope Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase
	 * @generated
	 */
	EEnum getResSharingScopeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase <em>Transport Guarantee Type Base</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Transport Guarantee Type Base</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase
	 * @generated
	 */
	EEnum getTransportGuaranteeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType <em>Web App Version Type</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for enum '<em>Web App Version Type</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
	 * @generated
	 */
	EEnum getWebAppVersionType();

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
	 * Returns the meta object for data type '{@link java.math.BigDecimal
	 * <em>Dewey Version Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Dewey Version Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal" extendedMetaData=
	 *        "name='dewey-versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' whiteSpace='collapse'"
	 * @generated
	 */
	EDataType getDeweyVersionType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase <em>Dispatcher Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Dispatcher Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base Object</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Env Entry Type Values Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase"
	 *        extendedMetaData="name='env-entry-type-valuesType_._base:Object' baseType='env-entry-type-valuesType_._base'"
	 * @generated
	 */
	EDataType getEnvEntryTypeValuesTypeBaseObject();

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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase <em>Generic Boolean Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Generic Boolean Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase <em>Http Method Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Http Method Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase"
	 *        extendedMetaData="name='http-methodType_._base:Object' baseType='http-methodType_._base'"
	 * @generated
	 */
	EDataType getHttpMethodTypeBaseObject();

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
	 * {@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
	 * <em>Message Destination Usage Type Base Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '
	 *         <em>Message Destination Usage Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
	 * @model instanceClass=
	 *        "org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase <em>Res Auth Type Base Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Res Auth Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase"
	 *        extendedMetaData="name='res-authType_._base:Object' baseType='res-authType_._base'"
	 * @generated
	 */
	EDataType getResAuthTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Sharing Scope Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase <em>Transport Guarantee Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transport Guarantee Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType <em>Web App Version Type Object</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for data type '<em>Web App Version Type Object</em>'.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
	 * @model instanceClass="org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType"
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
	Webapp24Factory getWebapp24Factory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.AuthConstraintTypeImpl <em>Auth Constraint Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.AuthConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getAuthConstraintType()
		 * @generated
		 */
		EClass AUTH_CONSTRAINT_TYPE = eINSTANCE.getAuthConstraintType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AUTH_CONSTRAINT_TYPE__DESCRIPTION = eINSTANCE.getAuthConstraintType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AUTH_CONSTRAINT_TYPE__ROLE_NAME = eINSTANCE.getAuthConstraintType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_CONSTRAINT_TYPE__ID = eINSTANCE.getAuthConstraintType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.AuthMethodTypeImpl <em>Auth Method Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.AuthMethodTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getAuthMethodType()
		 * @generated
		 */
		EClass AUTH_METHOD_TYPE = eINSTANCE.getAuthMethodType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DescriptionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDescriptionType()
		 * @generated
		 */
		EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__LANG = eINSTANCE.getDescriptionType_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.DispatcherTypeImpl <em>Dispatcher Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DispatcherTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDispatcherType()
		 * @generated
		 */
		EClass DISPATCHER_TYPE = eINSTANCE.getDispatcherType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DisplayNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDisplayNameType()
		 * @generated
		 */
		EClass DISPLAY_NAME_TYPE = eINSTANCE.getDisplayNameType();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME_TYPE__LANG = eINSTANCE.getDisplayNameType_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.DocumentRootImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Web App</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEB_APP = eINSTANCE.getDocumentRoot_WebApp();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLinkTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbLinkType()
		 * @generated
		 */
		EClass EJB_LINK_TYPE = eINSTANCE.getEjbLinkType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbLocalRefType()
		 * @generated
		 */
		EClass EJB_LOCAL_REF_TYPE = eINSTANCE.getEjbLocalRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__DESCRIPTION = eINSTANCE.getEjbLocalRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__EJB_REF_NAME = eINSTANCE.getEjbLocalRefType_EjbRefName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__EJB_REF_TYPE = eINSTANCE.getEjbLocalRefType_EjbRefType();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__LOCAL_HOME = eINSTANCE.getEjbLocalRefType_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__LOCAL = eINSTANCE.getEjbLocalRefType_Local();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF_TYPE__EJB_LINK = eINSTANCE.getEjbLocalRefType_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF_TYPE__ID = eINSTANCE.getEjbLocalRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefNameType()
		 * @generated
		 */
		EClass EJB_REF_NAME_TYPE = eINSTANCE.getEjbRefNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefType()
		 * @generated
		 */
		EClass EJB_REF_TYPE = eINSTANCE.getEjbRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__DESCRIPTION = eINSTANCE.getEjbRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__EJB_REF_NAME = eINSTANCE.getEjbRefType_EjbRefName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__EJB_REF_TYPE = eINSTANCE.getEjbRefType_EjbRefType();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__HOME = eINSTANCE.getEjbRefType_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__REMOTE = eINSTANCE.getEjbRefType_Remote();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF_TYPE__EJB_LINK = eINSTANCE.getEjbRefType_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF_TYPE__ID = eINSTANCE.getEjbRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EjbRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefTypeType()
		 * @generated
		 */
		EClass EJB_REF_TYPE_TYPE = eINSTANCE.getEjbRefTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EmptyTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEmptyType()
		 * @generated
		 */
		EClass EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPTY_TYPE__ID = eINSTANCE.getEmptyType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryType()
		 * @generated
		 */
		EClass ENV_ENTRY_TYPE = eINSTANCE.getEnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__DESCRIPTION = eINSTANCE.getEnvEntryType_Description();

		/**
		 * The meta object literal for the '<em><b>Env Entry Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_NAME = eINSTANCE.getEnvEntryType_EnvEntryName();

		/**
		 * The meta object literal for the '<em><b>Env Entry Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_TYPE = eINSTANCE.getEnvEntryType_EnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Env Entry Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_VALUE = eINSTANCE.getEnvEntryType_EnvEntryValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_TYPE__ID = eINSTANCE.getEnvEntryType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeValuesTypeImpl <em>Env Entry Type Values Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.EnvEntryTypeValuesTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryTypeValuesType()
		 * @generated
		 */
		EClass ENV_ENTRY_TYPE_VALUES_TYPE = eINSTANCE.getEnvEntryTypeValuesType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorCodeTypeImpl <em>Error Code Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorCodeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getErrorCodeType()
		 * @generated
		 */
		EClass ERROR_CODE_TYPE = eINSTANCE.getErrorCodeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorPageTypeImpl <em>Error Page Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ErrorPageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getErrorPageType()
		 * @generated
		 */
		EClass ERROR_PAGE_TYPE = eINSTANCE.getErrorPageType();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PAGE_TYPE__ERROR_CODE = eINSTANCE.getErrorPageType_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PAGE_TYPE__EXCEPTION_TYPE = eINSTANCE.getErrorPageType_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PAGE_TYPE__LOCATION = eINSTANCE.getErrorPageType_Location();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PAGE_TYPE__ID = eINSTANCE.getErrorPageType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl <em>Filter Mapping Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFilterMappingType()
		 * @generated
		 */
		EClass FILTER_MAPPING_TYPE = eINSTANCE.getFilterMappingType();

		/**
		 * The meta object literal for the '<em><b>Filter Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MAPPING_TYPE__FILTER_NAME = eINSTANCE.getFilterMappingType_FilterName();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MAPPING_TYPE__URL_PATTERN = eINSTANCE.getFilterMappingType_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>Servlet Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MAPPING_TYPE__SERVLET_NAME = eINSTANCE.getFilterMappingType_ServletName();

		/**
		 * The meta object literal for the '<em><b>Dispatcher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_MAPPING_TYPE__DISPATCHER = eINSTANCE.getFilterMappingType_Dispatcher();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_MAPPING_TYPE__ID = eINSTANCE.getFilterMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterNameTypeImpl <em>Filter Name Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FilterNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFilterNameType()
		 * @generated
		 */
		EClass FILTER_NAME_TYPE = eINSTANCE.getFilterNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterTypeImpl <em>Filter Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FilterTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFilterType()
		 * @generated
		 */
		EClass FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__DESCRIPTION = eINSTANCE.getFilterType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__DISPLAY_NAME = eINSTANCE.getFilterType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__ICON = eINSTANCE.getFilterType_Icon();

		/**
		 * The meta object literal for the '<em><b>Filter Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__FILTER_NAME = eINSTANCE.getFilterType_FilterName();

		/**
		 * The meta object literal for the '<em><b>Filter Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__FILTER_CLASS = eINSTANCE.getFilterType_FilterClass();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__INIT_PARAM = eINSTANCE.getFilterType_InitParam();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TYPE__ID = eINSTANCE.getFilterType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FormLoginConfigTypeImpl <em>Form Login Config Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FormLoginConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFormLoginConfigType()
		 * @generated
		 */
		EClass FORM_LOGIN_CONFIG_TYPE = eINSTANCE.getFormLoginConfigType();

		/**
		 * The meta object literal for the '<em><b>Form Login Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE = eINSTANCE.getFormLoginConfigType_FormLoginPage();

		/**
		 * The meta object literal for the '<em><b>Form Error Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE = eINSTANCE.getFormLoginConfigType_FormErrorPage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LOGIN_CONFIG_TYPE__ID = eINSTANCE.getFormLoginConfigType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FullyQualifiedClassTypeImpl <em>Fully Qualified Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.FullyQualifiedClassTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFullyQualifiedClassType()
		 * @generated
		 */
		EClass FULLY_QUALIFIED_CLASS_TYPE = eINSTANCE.getFullyQualifiedClassType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.GenericBooleanTypeImpl <em>Generic Boolean Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.GenericBooleanTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getGenericBooleanType()
		 * @generated
		 */
		EClass GENERIC_BOOLEAN_TYPE = eINSTANCE.getGenericBooleanType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.HomeTypeImpl
		 * <em>Home Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.HomeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHomeType()
		 * @generated
		 */
		EClass HOME_TYPE = eINSTANCE.getHomeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.HttpMethodTypeImpl <em>Http Method Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.HttpMethodTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHttpMethodType()
		 * @generated
		 */
		EClass HTTP_METHOD_TYPE = eINSTANCE.getHttpMethodType();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.IconTypeImpl
		 * <em>Icon Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.IconTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getIconType()
		 * @generated
		 */
		EClass ICON_TYPE = eINSTANCE.getIconType();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ICON_TYPE__SMALL_ICON = eINSTANCE.getIconType_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ICON_TYPE__LARGE_ICON = eINSTANCE.getIconType_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__ID = eINSTANCE.getIconType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__LANG = eINSTANCE.getIconType_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JavaIdentifierTypeImpl <em>Java Identifier Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JavaIdentifierTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaIdentifierType()
		 * @generated
		 */
		EClass JAVA_IDENTIFIER_TYPE = eINSTANCE.getJavaIdentifierType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JavaTypeTypeImpl <em>Java Type Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JavaTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaTypeType()
		 * @generated
		 */
		EClass JAVA_TYPE_TYPE = eINSTANCE.getJavaTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JndiNameTypeImpl <em>Jndi Name Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JndiNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJndiNameType()
		 * @generated
		 */
		EClass JNDI_NAME_TYPE = eINSTANCE.getJndiNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JspConfigTypeImpl <em>Jsp Config Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JspConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspConfigType()
		 * @generated
		 */
		EClass JSP_CONFIG_TYPE = eINSTANCE.getJspConfigType();

		/**
		 * The meta object literal for the '<em><b>Taglib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSP_CONFIG_TYPE__TAGLIB = eINSTANCE.getJspConfigType_Taglib();

		/**
		 * The meta object literal for the '<em><b>Jsp Property Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP = eINSTANCE.getJspConfigType_JspPropertyGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP_CONFIG_TYPE__ID = eINSTANCE.getJspConfigType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JspFileTypeImpl <em>Jsp File Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JspFileTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspFileType()
		 * @generated
		 */
		EClass JSP_FILE_TYPE = eINSTANCE.getJspFileType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.JspPropertyGroupTypeImpl <em>Jsp Property Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.JspPropertyGroupTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspPropertyGroupType()
		 * @generated
		 */
		EClass JSP_PROPERTY_GROUP_TYPE = eINSTANCE.getJspPropertyGroupType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__DESCRIPTION = eINSTANCE.getJspPropertyGroupType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME = eINSTANCE.getJspPropertyGroupType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__ICON = eINSTANCE.getJspPropertyGroupType_Icon();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__URL_PATTERN = eINSTANCE.getJspPropertyGroupType_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>El Ignored</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__EL_IGNORED = eINSTANCE.getJspPropertyGroupType_ElIgnored();

		/**
		 * The meta object literal for the '<em><b>Page Encoding</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING = eINSTANCE.getJspPropertyGroupType_PageEncoding();

		/**
		 * The meta object literal for the '<em><b>Scripting Invalid</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID = eINSTANCE.getJspPropertyGroupType_ScriptingInvalid();

		/**
		 * The meta object literal for the '<em><b>Is Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__IS_XML = eINSTANCE.getJspPropertyGroupType_IsXml();

		/**
		 * The meta object literal for the '<em><b>Include Prelude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE = eINSTANCE.getJspPropertyGroupType_IncludePrelude();

		/**
		 * The meta object literal for the '<em><b>Include Coda</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA = eINSTANCE.getJspPropertyGroupType_IncludeCoda();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP_PROPERTY_GROUP_TYPE__ID = eINSTANCE.getJspPropertyGroupType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ListenerTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getListenerType()
		 * @generated
		 */
		EClass LISTENER_TYPE = eINSTANCE.getListenerType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__DESCRIPTION = eINSTANCE.getListenerType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__DISPLAY_NAME = eINSTANCE.getListenerType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__ICON = eINSTANCE.getListenerType_Icon();

		/**
		 * The meta object literal for the '<em><b>Listener Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__LISTENER_CLASS = eINSTANCE.getListenerType_ListenerClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER_TYPE__ID = eINSTANCE.getListenerType_Id();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingListTypeImpl
		 * <em>Locale Encoding Mapping List Type</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingListTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocaleEncodingMappingListType()
		 * @generated
		 */
		EClass LOCALE_ENCODING_MAPPING_LIST_TYPE = eINSTANCE.getLocaleEncodingMappingListType();

		/**
		 * The meta object literal for the '<em><b>Locale Encoding Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALE_ENCODING_MAPPING_LIST_TYPE__LOCALE_ENCODING_MAPPING = eINSTANCE.getLocaleEncodingMappingListType_LocaleEncodingMapping();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_ENCODING_MAPPING_LIST_TYPE__ID = eINSTANCE.getLocaleEncodingMappingListType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingTypeImpl <em>Locale Encoding Mapping Type</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocaleEncodingMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocaleEncodingMappingType()
		 * @generated
		 */
		EClass LOCALE_ENCODING_MAPPING_TYPE = eINSTANCE.getLocaleEncodingMappingType();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_ENCODING_MAPPING_TYPE__LOCALE = eINSTANCE.getLocaleEncodingMappingType_Locale();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_ENCODING_MAPPING_TYPE__ENCODING = eINSTANCE.getLocaleEncodingMappingType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_ENCODING_MAPPING_TYPE__ID = eINSTANCE.getLocaleEncodingMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocalHomeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalHomeType()
		 * @generated
		 */
		EClass LOCAL_HOME_TYPE = eINSTANCE.getLocalHomeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LocalTypeImpl <em>Local Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LocalTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalType()
		 * @generated
		 */
		EClass LOCAL_TYPE = eINSTANCE.getLocalType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.LoginConfigTypeImpl <em>Login Config Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.LoginConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLoginConfigType()
		 * @generated
		 */
		EClass LOGIN_CONFIG_TYPE = eINSTANCE.getLoginConfigType();

		/**
		 * The meta object literal for the '<em><b>Auth Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONFIG_TYPE__AUTH_METHOD = eINSTANCE.getLoginConfigType_AuthMethod();

		/**
		 * The meta object literal for the '<em><b>Realm Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONFIG_TYPE__REALM_NAME = eINSTANCE.getLoginConfigType_RealmName();

		/**
		 * The meta object literal for the '<em><b>Form Login Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG = eINSTANCE.getLoginConfigType_FormLoginConfig();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_CONFIG_TYPE__ID = eINSTANCE.getLoginConfigType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationLinkTypeImpl <em>Message Destination Link Type</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationLinkTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationLinkType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_LINK_TYPE = eINSTANCE.getMessageDestinationLinkType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationRefTypeImpl <em>Message Destination Ref Type</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationRefType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_REF_TYPE = eINSTANCE.getMessageDestinationRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION = eINSTANCE.getMessageDestinationRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Message Destination Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME = eINSTANCE.getMessageDestinationRefType_MessageDestinationRefName();

		/**
		 * The meta object literal for the '<em><b>Message Destination Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE = eINSTANCE.getMessageDestinationRefType_MessageDestinationType();

		/**
		 * The meta object literal for the '<em><b>Message Destination Usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE = eINSTANCE.getMessageDestinationRefType_MessageDestinationUsage();

		/**
		 * The meta object literal for the '<em><b>Message Destination Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK = eINSTANCE.getMessageDestinationRefType_MessageDestinationLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF_TYPE__ID = eINSTANCE.getMessageDestinationRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl <em>Message Destination Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_TYPE = eINSTANCE.getMessageDestinationType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__DESCRIPTION = eINSTANCE.getMessageDestinationType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__DISPLAY_NAME = eINSTANCE.getMessageDestinationType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__ICON = eINSTANCE.getMessageDestinationType_Icon();

		/**
		 * The meta object literal for the '<em><b>Message Destination Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME = eINSTANCE.getMessageDestinationType_MessageDestinationName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_TYPE__ID = eINSTANCE.getMessageDestinationType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeTypeImpl <em>Message Destination Type Type</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationTypeType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_TYPE_TYPE = eINSTANCE.getMessageDestinationTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationUsageTypeImpl <em>Message Destination Usage Type</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationUsageTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationUsageType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_USAGE_TYPE = eINSTANCE.getMessageDestinationUsageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MimeMappingTypeImpl <em>Mime Mapping Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MimeMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMimeMappingType()
		 * @generated
		 */
		EClass MIME_MAPPING_TYPE = eINSTANCE.getMimeMappingType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MIME_MAPPING_TYPE__EXTENSION = eINSTANCE.getMimeMappingType_Extension();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MIME_MAPPING_TYPE__MIME_TYPE = eINSTANCE.getMimeMappingType_MimeType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIME_MAPPING_TYPE__ID = eINSTANCE.getMimeMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MimeTypeTypeImpl <em>Mime Type Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.MimeTypeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMimeTypeType()
		 * @generated
		 */
		EClass MIME_TYPE_TYPE = eINSTANCE.getMimeTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.NonEmptyStringTypeImpl <em>Non Empty String Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.NonEmptyStringTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getNonEmptyStringType()
		 * @generated
		 */
		EClass NON_EMPTY_STRING_TYPE = eINSTANCE.getNonEmptyStringType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getParamValueType()
		 * @generated
		 */
		EClass PARAM_VALUE_TYPE = eINSTANCE.getParamValueType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE_TYPE__DESCRIPTION = eINSTANCE.getParamValueType_Description();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE_TYPE__PARAM_NAME = eINSTANCE.getParamValueType_ParamName();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE_TYPE__PARAM_VALUE = eINSTANCE.getParamValueType_ParamValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE_TYPE__ID = eINSTANCE.getParamValueType_Id();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.PathTypeImpl
		 * <em>Path Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.PathTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getPathType()
		 * @generated
		 */
		EClass PATH_TYPE = eINSTANCE.getPathType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.PortComponentRefTypeImpl <em>Port Component Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.PortComponentRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getPortComponentRefType()
		 * @generated
		 */
		EClass PORT_COMPONENT_REF_TYPE = eINSTANCE.getPortComponentRefType();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE = eINSTANCE.getPortComponentRefType_ServiceEndpointInterface();

		/**
		 * The meta object literal for the '<em><b>Port Component Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK = eINSTANCE.getPortComponentRefType_PortComponentLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT_REF_TYPE__ID = eINSTANCE.getPortComponentRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.RemoteTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRemoteType()
		 * @generated
		 */
		EClass REMOTE_TYPE = eINSTANCE.getRemoteType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResAuthTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResAuthType()
		 * @generated
		 */
		EClass RES_AUTH_TYPE = eINSTANCE.getResAuthType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceEnvRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResourceEnvRefType()
		 * @generated
		 */
		EClass RESOURCE_ENV_REF_TYPE = eINSTANCE.getResourceEnvRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF_TYPE__DESCRIPTION = eINSTANCE.getResourceEnvRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME = eINSTANCE.getResourceEnvRefType_ResourceEnvRefName();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE = eINSTANCE.getResourceEnvRefType_ResourceEnvRefType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF_TYPE__ID = eINSTANCE.getResourceEnvRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResourceRefType()
		 * @generated
		 */
		EClass RESOURCE_REF_TYPE = eINSTANCE.getResourceRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__DESCRIPTION = eINSTANCE.getResourceRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Res Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_REF_NAME = eINSTANCE.getResourceRefType_ResRefName();

		/**
		 * The meta object literal for the '<em><b>Res Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_TYPE = eINSTANCE.getResourceRefType_ResType();

		/**
		 * The meta object literal for the '<em><b>Res Auth</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_AUTH = eINSTANCE.getResourceRefType_ResAuth();

		/**
		 * The meta object literal for the '<em><b>Res Sharing Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF_TYPE__RES_SHARING_SCOPE = eINSTANCE.getResourceRefType_ResSharingScope();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF_TYPE__ID = eINSTANCE.getResourceRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ResSharingScopeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResSharingScopeType()
		 * @generated
		 */
		EClass RES_SHARING_SCOPE_TYPE = eINSTANCE.getResSharingScopeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.RoleNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRoleNameType()
		 * @generated
		 */
		EClass ROLE_NAME_TYPE = eINSTANCE.getRoleNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.RunAsTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRunAsType()
		 * @generated
		 */
		EClass RUN_AS_TYPE = eINSTANCE.getRunAsType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RUN_AS_TYPE__DESCRIPTION = eINSTANCE.getRunAsType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RUN_AS_TYPE__ROLE_NAME = eINSTANCE.getRunAsType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_AS_TYPE__ID = eINSTANCE.getRunAsType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl <em>Security Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSecurityConstraintType()
		 * @generated
		 */
		EClass SECURITY_CONSTRAINT_TYPE = eINSTANCE.getSecurityConstraintType();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME = eINSTANCE.getSecurityConstraintType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Web Resource Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION = eINSTANCE.getSecurityConstraintType_WebResourceCollection();

		/**
		 * The meta object literal for the '<em><b>Auth Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT = eINSTANCE.getSecurityConstraintType_AuthConstraint();

		/**
		 * The meta object literal for the '<em><b>User Data Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT = eINSTANCE.getSecurityConstraintType_UserDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONSTRAINT_TYPE__ID = eINSTANCE.getSecurityConstraintType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSecurityRoleRefType()
		 * @generated
		 */
		EClass SECURITY_ROLE_REF_TYPE = eINSTANCE.getSecurityRoleRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_REF_TYPE__DESCRIPTION = eINSTANCE.getSecurityRoleRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_REF_TYPE__ROLE_NAME = eINSTANCE.getSecurityRoleRefType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Role Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_REF_TYPE__ROLE_LINK = eINSTANCE.getSecurityRoleRefType_RoleLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE_REF_TYPE__ID = eINSTANCE.getSecurityRoleRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityRoleTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSecurityRoleType()
		 * @generated
		 */
		EClass SECURITY_ROLE_TYPE = eINSTANCE.getSecurityRoleType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_TYPE__DESCRIPTION = eINSTANCE.getSecurityRoleType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_TYPE__ROLE_NAME = eINSTANCE.getSecurityRoleType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE_TYPE__ID = eINSTANCE.getSecurityRoleType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefHandlerTypeImpl <em>Service Ref Handler Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefHandlerTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServiceRefHandlerType()
		 * @generated
		 */
		EClass SERVICE_REF_HANDLER_TYPE = eINSTANCE.getServiceRefHandlerType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__DESCRIPTION = eINSTANCE.getServiceRefHandlerType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME = eINSTANCE.getServiceRefHandlerType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__ICON = eINSTANCE.getServiceRefHandlerType_Icon();

		/**
		 * The meta object literal for the '<em><b>Handler Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__HANDLER_NAME = eINSTANCE.getServiceRefHandlerType_HandlerName();

		/**
		 * The meta object literal for the '<em><b>Handler Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS = eINSTANCE.getServiceRefHandlerType_HandlerClass();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__INIT_PARAM = eINSTANCE.getServiceRefHandlerType_InitParam();

		/**
		 * The meta object literal for the '<em><b>Soap Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__SOAP_HEADER = eINSTANCE.getServiceRefHandlerType_SoapHeader();

		/**
		 * The meta object literal for the '<em><b>Soap Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__SOAP_ROLE = eINSTANCE.getServiceRefHandlerType_SoapRole();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__PORT_NAME = eINSTANCE.getServiceRefHandlerType_PortName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER_TYPE__ID = eINSTANCE.getServiceRefHandlerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl <em>Service Ref Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServiceRefTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServiceRefType()
		 * @generated
		 */
		EClass SERVICE_REF_TYPE = eINSTANCE.getServiceRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__DESCRIPTION = eINSTANCE.getServiceRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__DISPLAY_NAME = eINSTANCE.getServiceRefType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__ICON = eINSTANCE.getServiceRefType_Icon();

		/**
		 * The meta object literal for the '<em><b>Service Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__SERVICE_REF_NAME = eINSTANCE.getServiceRefType_ServiceRefName();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__SERVICE_INTERFACE = eINSTANCE.getServiceRefType_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Wsdl File</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__WSDL_FILE = eINSTANCE.getServiceRefType_WsdlFile();

		/**
		 * The meta object literal for the '<em><b>Jaxrpc Mapping File</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE = eINSTANCE.getServiceRefType_JaxrpcMappingFile();

		/**
		 * The meta object literal for the '<em><b>Service Qname</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__SERVICE_QNAME = eINSTANCE.getServiceRefType_ServiceQname();

		/**
		 * The meta object literal for the '<em><b>Port Component Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__PORT_COMPONENT_REF = eINSTANCE.getServiceRefType_PortComponentRef();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__HANDLER = eINSTANCE.getServiceRefType_Handler();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_TYPE__ID = eINSTANCE.getServiceRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServletMappingTypeImpl <em>Servlet Mapping Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServletMappingTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServletMappingType()
		 * @generated
		 */
		EClass SERVLET_MAPPING_TYPE = eINSTANCE.getServletMappingType();

		/**
		 * The meta object literal for the '<em><b>Servlet Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_MAPPING_TYPE__SERVLET_NAME = eINSTANCE.getServletMappingType_ServletName();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_MAPPING_TYPE__URL_PATTERN = eINSTANCE.getServletMappingType_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_MAPPING_TYPE__ID = eINSTANCE.getServletMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServletNameTypeImpl <em>Servlet Name Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServletNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServletNameType()
		 * @generated
		 */
		EClass SERVLET_NAME_TYPE = eINSTANCE.getServletNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ServletTypeImpl <em>Servlet Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.ServletTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getServletType()
		 * @generated
		 */
		EClass SERVLET_TYPE = eINSTANCE.getServletType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__DESCRIPTION = eINSTANCE.getServletType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__DISPLAY_NAME = eINSTANCE.getServletType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__ICON = eINSTANCE.getServletType_Icon();

		/**
		 * The meta object literal for the '<em><b>Servlet Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__SERVLET_NAME = eINSTANCE.getServletType_ServletName();

		/**
		 * The meta object literal for the '<em><b>Servlet Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__SERVLET_CLASS = eINSTANCE.getServletType_ServletClass();

		/**
		 * The meta object literal for the '<em><b>Jsp File</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__JSP_FILE = eINSTANCE.getServletType_JspFile();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__INIT_PARAM = eINSTANCE.getServletType_InitParam();

		/**
		 * The meta object literal for the '<em><b>Load On Startup</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__LOAD_ON_STARTUP = eINSTANCE.getServletType_LoadOnStartup();

		/**
		 * The meta object literal for the '<em><b>Run As</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__RUN_AS = eINSTANCE.getServletType_RunAs();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_TYPE__SECURITY_ROLE_REF = eINSTANCE.getServletType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_TYPE__ID = eINSTANCE.getServletType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SessionConfigTypeImpl <em>Session Config Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.SessionConfigTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getSessionConfigType()
		 * @generated
		 */
		EClass SESSION_CONFIG_TYPE = eINSTANCE.getSessionConfigType();

		/**
		 * The meta object literal for the '<em><b>Session Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SESSION_CONFIG_TYPE__SESSION_TIMEOUT = eINSTANCE.getSessionConfigType_SessionTimeout();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_CONFIG_TYPE__ID = eINSTANCE.getSessionConfigType_Id();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.jee.webapp.webapp24.impl.StringImpl
		 * <em>String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.StringImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__ID = eINSTANCE.getString_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TaglibTypeImpl <em>Taglib Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.TaglibTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTaglibType()
		 * @generated
		 */
		EClass TAGLIB_TYPE = eINSTANCE.getTaglibType();

		/**
		 * The meta object literal for the '<em><b>Taglib Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference TAGLIB_TYPE__TAGLIB_URI = eINSTANCE.getTaglibType_TaglibUri();

		/**
		 * The meta object literal for the '<em><b>Taglib Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference TAGLIB_TYPE__TAGLIB_LOCATION = eINSTANCE.getTaglibType_TaglibLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGLIB_TYPE__ID = eINSTANCE.getTaglibType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TransportGuaranteeTypeImpl <em>Transport Guarantee Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.TransportGuaranteeTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTransportGuaranteeType()
		 * @generated
		 */
		EClass TRANSPORT_GUARANTEE_TYPE = eINSTANCE.getTransportGuaranteeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TrueFalseTypeImpl <em>True False Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.TrueFalseTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTrueFalseType()
		 * @generated
		 */
		EClass TRUE_FALSE_TYPE = eINSTANCE.getTrueFalseType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.UrlPatternTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getUrlPatternType()
		 * @generated
		 */
		EClass URL_PATTERN_TYPE = eINSTANCE.getUrlPatternType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_PATTERN_TYPE__VALUE = eINSTANCE.getUrlPatternType_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.UserDataConstraintTypeImpl <em>User Data Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.UserDataConstraintTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getUserDataConstraintType()
		 * @generated
		 */
		EClass USER_DATA_CONSTRAINT_TYPE = eINSTANCE.getUserDataConstraintType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA_CONSTRAINT_TYPE__DESCRIPTION = eINSTANCE.getUserDataConstraintType_Description();

		/**
		 * The meta object literal for the '<em><b>Transport Guarantee</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE = eINSTANCE.getUserDataConstraintType_TransportGuarantee();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA_CONSTRAINT_TYPE__ID = eINSTANCE.getUserDataConstraintType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WarPathTypeImpl <em>War Path Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WarPathTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWarPathType()
		 * @generated
		 */
		EClass WAR_PATH_TYPE = eINSTANCE.getWarPathType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl <em>Web App Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WebAppTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebAppType()
		 * @generated
		 */
		EClass WEB_APP_TYPE = eINSTANCE.getWebAppType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP_TYPE__GROUP = eINSTANCE.getWebAppType_Group();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__DESCRIPTION = eINSTANCE.getWebAppType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__DISPLAY_NAME = eINSTANCE.getWebAppType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__ICON = eINSTANCE.getWebAppType_Icon();

		/**
		 * The meta object literal for the '<em><b>Distributable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__DISTRIBUTABLE = eINSTANCE.getWebAppType_Distributable();

		/**
		 * The meta object literal for the '<em><b>Context Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__CONTEXT_PARAM = eINSTANCE.getWebAppType_ContextParam();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__FILTER = eINSTANCE.getWebAppType_Filter();

		/**
		 * The meta object literal for the '<em><b>Filter Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__FILTER_MAPPING = eINSTANCE.getWebAppType_FilterMapping();

		/**
		 * The meta object literal for the '<em><b>Listener</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__LISTENER = eINSTANCE.getWebAppType_Listener();

		/**
		 * The meta object literal for the '<em><b>Servlet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SERVLET = eINSTANCE.getWebAppType_Servlet();

		/**
		 * The meta object literal for the '<em><b>Servlet Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SERVLET_MAPPING = eINSTANCE.getWebAppType_ServletMapping();

		/**
		 * The meta object literal for the '<em><b>Session Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SESSION_CONFIG = eINSTANCE.getWebAppType_SessionConfig();

		/**
		 * The meta object literal for the '<em><b>Mime Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__MIME_MAPPING = eINSTANCE.getWebAppType_MimeMapping();

		/**
		 * The meta object literal for the '<em><b>Welcome File List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__WELCOME_FILE_LIST = eINSTANCE.getWebAppType_WelcomeFileList();

		/**
		 * The meta object literal for the '<em><b>Error Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__ERROR_PAGE = eINSTANCE.getWebAppType_ErrorPage();

		/**
		 * The meta object literal for the '<em><b>Jsp Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__JSP_CONFIG = eINSTANCE.getWebAppType_JspConfig();

		/**
		 * The meta object literal for the '<em><b>Security Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SECURITY_CONSTRAINT = eINSTANCE.getWebAppType_SecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Login Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__LOGIN_CONFIG = eINSTANCE.getWebAppType_LoginConfig();

		/**
		 * The meta object literal for the '<em><b>Security Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SECURITY_ROLE = eINSTANCE.getWebAppType_SecurityRole();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__ENV_ENTRY = eINSTANCE.getWebAppType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__EJB_REF = eINSTANCE.getWebAppType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__EJB_LOCAL_REF = eINSTANCE.getWebAppType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Service Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__SERVICE_REF = eINSTANCE.getWebAppType_ServiceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__RESOURCE_REF = eINSTANCE.getWebAppType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__RESOURCE_ENV_REF = eINSTANCE.getWebAppType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Message Destination Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__MESSAGE_DESTINATION_REF = eINSTANCE.getWebAppType_MessageDestinationRef();

		/**
		 * The meta object literal for the '<em><b>Message Destination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__MESSAGE_DESTINATION = eINSTANCE.getWebAppType_MessageDestination();

		/**
		 * The meta object literal for the '<em><b>Locale Encoding Mapping List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP_TYPE__LOCALE_ENCODING_MAPPING_LIST = eINSTANCE.getWebAppType_LocaleEncodingMappingList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP_TYPE__ID = eINSTANCE.getWebAppType_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP_TYPE__VERSION = eINSTANCE.getWebAppType_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl <em>Web Resource Collection Type</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebResourceCollectionType()
		 * @generated
		 */
		EClass WEB_RESOURCE_COLLECTION_TYPE = eINSTANCE.getWebResourceCollectionType();

		/**
		 * The meta object literal for the '<em><b>Web Resource Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME = eINSTANCE.getWebResourceCollectionType_WebResourceName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION = eINSTANCE.getWebResourceCollectionType_Description();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN = eINSTANCE.getWebResourceCollectionType_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD = eINSTANCE.getWebResourceCollectionType_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RESOURCE_COLLECTION_TYPE__ID = eINSTANCE.getWebResourceCollectionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WelcomeFileListTypeImpl <em>Welcome File List Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.WelcomeFileListTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWelcomeFileListType()
		 * @generated
		 */
		EClass WELCOME_FILE_LIST_TYPE = eINSTANCE.getWelcomeFileListType();

		/**
		 * The meta object literal for the '<em><b>Welcome File</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WELCOME_FILE_LIST_TYPE__WELCOME_FILE = eINSTANCE.getWelcomeFileListType_WelcomeFile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WELCOME_FILE_LIST_TYPE__ID = eINSTANCE.getWelcomeFileListType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdAnyURITypeImpl <em>Xsd Any URI Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdAnyURITypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdAnyURIType()
		 * @generated
		 */
		EClass XSD_ANY_URI_TYPE = eINSTANCE.getXsdAnyURIType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ANY_URI_TYPE__VALUE = eINSTANCE.getXsdAnyURIType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ANY_URI_TYPE__ID = eINSTANCE.getXsdAnyURIType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdBooleanTypeImpl <em>Xsd Boolean Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdBooleanTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdBooleanType()
		 * @generated
		 */
		EClass XSD_BOOLEAN_TYPE = eINSTANCE.getXsdBooleanType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_BOOLEAN_TYPE__VALUE = eINSTANCE.getXsdBooleanType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_BOOLEAN_TYPE__ID = eINSTANCE.getXsdBooleanType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdIntegerTypeImpl <em>Xsd Integer Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdIntegerTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdIntegerType()
		 * @generated
		 */
		EClass XSD_INTEGER_TYPE = eINSTANCE.getXsdIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_INTEGER_TYPE__VALUE = eINSTANCE.getXsdIntegerType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_INTEGER_TYPE__ID = eINSTANCE.getXsdIntegerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNMTOKENTypeImpl <em>Xsd NMTOKEN Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNMTOKENTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdNMTOKENType()
		 * @generated
		 */
		EClass XSD_NMTOKEN_TYPE = eINSTANCE.getXsdNMTOKENType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NMTOKEN_TYPE__VALUE = eINSTANCE.getXsdNMTOKENType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NMTOKEN_TYPE__ID = eINSTANCE.getXsdNMTOKENType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNonNegativeIntegerTypeImpl <em>Xsd Non Negative Integer Type</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdNonNegativeIntegerTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdNonNegativeIntegerType()
		 * @generated
		 */
		EClass XSD_NON_NEGATIVE_INTEGER_TYPE = eINSTANCE.getXsdNonNegativeIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NON_NEGATIVE_INTEGER_TYPE__VALUE = eINSTANCE.getXsdNonNegativeIntegerType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NON_NEGATIVE_INTEGER_TYPE__ID = eINSTANCE.getXsdNonNegativeIntegerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdPositiveIntegerTypeImpl <em>Xsd Positive Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdPositiveIntegerTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdPositiveIntegerType()
		 * @generated
		 */
		EClass XSD_POSITIVE_INTEGER_TYPE = eINSTANCE.getXsdPositiveIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_POSITIVE_INTEGER_TYPE__VALUE = eINSTANCE.getXsdPositiveIntegerType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_POSITIVE_INTEGER_TYPE__ID = eINSTANCE.getXsdPositiveIntegerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdQNameTypeImpl <em>Xsd QName Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdQNameTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdQNameType()
		 * @generated
		 */
		EClass XSD_QNAME_TYPE = eINSTANCE.getXsdQNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_QNAME_TYPE__VALUE = eINSTANCE.getXsdQNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_QNAME_TYPE__ID = eINSTANCE.getXsdQNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.impl.XsdStringTypeImpl <em>Xsd String Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.XsdStringTypeImpl
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getXsdStringType()
		 * @generated
		 */
		EClass XSD_STRING_TYPE = eINSTANCE.getXsdStringType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_STRING_TYPE__VALUE = eINSTANCE.getXsdStringType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_STRING_TYPE__ID = eINSTANCE.getXsdStringType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase <em>Dispatcher Type Base</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDispatcherTypeBase()
		 * @generated
		 */
		EEnum DISPATCHER_TYPE_BASE = eINSTANCE.getDispatcherTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefTypeTypeBase()
		 * @generated
		 */
		EEnum EJB_REF_TYPE_TYPE_BASE = eINSTANCE.getEjbRefTypeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}' enum.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryTypeValuesTypeBase()
		 * @generated
		 */
		EEnum ENV_ENTRY_TYPE_VALUES_TYPE_BASE = eINSTANCE.getEnvEntryTypeValuesTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getGenericBooleanTypeBase()
		 * @generated
		 */
		EEnum GENERIC_BOOLEAN_TYPE_BASE = eINSTANCE.getGenericBooleanTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase <em>Http Method Type Base</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHttpMethodTypeBase()
		 * @generated
		 */
		EEnum HTTP_METHOD_TYPE_BASE = eINSTANCE.getHttpMethodTypeBase();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
		 * <em>Message Destination Usage Type Base</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationUsageTypeBase()
		 * @generated
		 */
		EEnum MESSAGE_DESTINATION_USAGE_TYPE_BASE = eINSTANCE.getMessageDestinationUsageTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase <em>Res Auth Type Base</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResAuthTypeBase()
		 * @generated
		 */
		EEnum RES_AUTH_TYPE_BASE = eINSTANCE.getResAuthTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResSharingScopeTypeBase()
		 * @generated
		 */
		EEnum RES_SHARING_SCOPE_TYPE_BASE = eINSTANCE.getResSharingScopeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase <em>Transport Guarantee Type Base</em>}' enum.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTransportGuaranteeTypeBase()
		 * @generated
		 */
		EEnum TRANSPORT_GUARANTEE_TYPE_BASE = eINSTANCE.getTransportGuaranteeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType <em>Web App Version Type</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebAppVersionType()
		 * @generated
		 */
		EEnum WEB_APP_VERSION_TYPE = eINSTANCE.getWebAppVersionType();

		/**
		 * The meta object literal for the '<em>Auth Method Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getAuthMethodTypeBase()
		 * @generated
		 */
		EDataType AUTH_METHOD_TYPE_BASE = eINSTANCE.getAuthMethodTypeBase();

		/**
		 * The meta object literal for the '<em>Dewey Version Type</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDeweyVersionType()
		 * @generated
		 */
		EDataType DEWEY_VERSION_TYPE = eINSTANCE.getDeweyVersionType();

		/**
		 * The meta object literal for the '<em>Dispatcher Type Base Object</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.DispatcherTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getDispatcherTypeBaseObject()
		 * @generated
		 */
		EDataType DISPATCHER_TYPE_BASE_OBJECT = eINSTANCE.getDispatcherTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Ejb Link Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbLinkTypeBase()
		 * @generated
		 */
		EDataType EJB_LINK_TYPE_BASE = eINSTANCE.getEjbLinkTypeBase();

		/**
		 * The meta object literal for the '<em>Ejb Ref Name Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefNameTypeBase()
		 * @generated
		 */
		EDataType EJB_REF_NAME_TYPE_BASE = eINSTANCE.getEjbRefNameTypeBase();

		/**
		 * The meta object literal for the '
		 * <em>Ejb Ref Type Type Base Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEjbRefTypeTypeBaseObject()
		 * @generated
		 */
		EDataType EJB_REF_TYPE_TYPE_BASE_OBJECT = eINSTANCE.getEjbRefTypeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Encoding Type</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEncodingType()
		 * @generated
		 */
		EDataType ENCODING_TYPE = eINSTANCE.getEncodingType();

		/**
		 * The meta object literal for the '
		 * <em>Env Entry Type Values Type Base Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.EnvEntryTypeValuesTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getEnvEntryTypeValuesTypeBaseObject()
		 * @generated
		 */
		EDataType ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT = eINSTANCE.getEnvEntryTypeValuesTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Error Code Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getErrorCodeTypeBase()
		 * @generated
		 */
		EDataType ERROR_CODE_TYPE_BASE = eINSTANCE.getErrorCodeTypeBase();

		/**
		 * The meta object literal for the '
		 * <em>Fully Qualified Class Type Base</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getFullyQualifiedClassTypeBase()
		 * @generated
		 */
		EDataType FULLY_QUALIFIED_CLASS_TYPE_BASE = eINSTANCE.getFullyQualifiedClassTypeBase();

		/**
		 * The meta object literal for the '
		 * <em>Generic Boolean Type Base Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.GenericBooleanTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getGenericBooleanTypeBaseObject()
		 * @generated
		 */
		EDataType GENERIC_BOOLEAN_TYPE_BASE_OBJECT = eINSTANCE.getGenericBooleanTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Home Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHomeTypeBase()
		 * @generated
		 */
		EDataType HOME_TYPE_BASE = eINSTANCE.getHomeTypeBase();

		/**
		 * The meta object literal for the '<em>Http Method Type Base Object</em>' data type.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.HttpMethodTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getHttpMethodTypeBaseObject()
		 * @generated
		 */
		EDataType HTTP_METHOD_TYPE_BASE_OBJECT = eINSTANCE.getHttpMethodTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Java Identifier Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaIdentifierTypeBase()
		 * @generated
		 */
		EDataType JAVA_IDENTIFIER_TYPE_BASE = eINSTANCE.getJavaIdentifierTypeBase();

		/**
		 * The meta object literal for the '<em>Java Type Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJavaTypeTypeBase()
		 * @generated
		 */
		EDataType JAVA_TYPE_TYPE_BASE = eINSTANCE.getJavaTypeTypeBase();

		/**
		 * The meta object literal for the '<em>Jndi Name Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJndiNameTypeBase()
		 * @generated
		 */
		EDataType JNDI_NAME_TYPE_BASE = eINSTANCE.getJndiNameTypeBase();

		/**
		 * The meta object literal for the '<em>Jsp File Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getJspFileTypeBase()
		 * @generated
		 */
		EDataType JSP_FILE_TYPE_BASE = eINSTANCE.getJspFileTypeBase();

		/**
		 * The meta object literal for the '<em>Locale Type</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocaleType()
		 * @generated
		 */
		EDataType LOCALE_TYPE = eINSTANCE.getLocaleType();

		/**
		 * The meta object literal for the '<em>Local Home Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalHomeTypeBase()
		 * @generated
		 */
		EDataType LOCAL_HOME_TYPE_BASE = eINSTANCE.getLocalHomeTypeBase();

		/**
		 * The meta object literal for the '<em>Local Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getLocalTypeBase()
		 * @generated
		 */
		EDataType LOCAL_TYPE_BASE = eINSTANCE.getLocalTypeBase();

		/**
		 * The meta object literal for the '
		 * <em>Message Destination Link Type Base</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationLinkTypeBase()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_LINK_TYPE_BASE = eINSTANCE.getMessageDestinationLinkTypeBase();

		/**
		 * The meta object literal for the '
		 * <em>Message Destination Type Type Base</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationTypeTypeBase()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_TYPE_TYPE_BASE = eINSTANCE.getMessageDestinationTypeTypeBase();

		/**
		 * The meta object literal for the '
		 * <em>Message Destination Usage Type Base Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationUsageTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMessageDestinationUsageTypeBaseObject()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT = eINSTANCE.getMessageDestinationUsageTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Mime Type Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getMimeTypeTypeBase()
		 * @generated
		 */
		EDataType MIME_TYPE_TYPE_BASE = eINSTANCE.getMimeTypeTypeBase();

		/**
		 * The meta object literal for the '<em>Non Empty String Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getNonEmptyStringTypeBase()
		 * @generated
		 */
		EDataType NON_EMPTY_STRING_TYPE_BASE = eINSTANCE.getNonEmptyStringTypeBase();

		/**
		 * The meta object literal for the '<em>Path Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getPathTypeBase()
		 * @generated
		 */
		EDataType PATH_TYPE_BASE = eINSTANCE.getPathTypeBase();

		/**
		 * The meta object literal for the '<em>Remote Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRemoteTypeBase()
		 * @generated
		 */
		EDataType REMOTE_TYPE_BASE = eINSTANCE.getRemoteTypeBase();

		/**
		 * The meta object literal for the '<em>Res Auth Type Base Object</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.ResAuthTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResAuthTypeBaseObject()
		 * @generated
		 */
		EDataType RES_AUTH_TYPE_BASE_OBJECT = eINSTANCE.getResAuthTypeBaseObject();

		/**
		 * The meta object literal for the '
		 * <em>Res Sharing Scope Type Base Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getResSharingScopeTypeBaseObject()
		 * @generated
		 */
		EDataType RES_SHARING_SCOPE_TYPE_BASE_OBJECT = eINSTANCE.getResSharingScopeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Role Name Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getRoleNameTypeBase()
		 * @generated
		 */
		EDataType ROLE_NAME_TYPE_BASE = eINSTANCE.getRoleNameTypeBase();

		/**
		 * The meta object literal for the '
		 * <em>Transport Guarantee Type Base Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.modisco.jee.webapp.webapp24.TransportGuaranteeTypeBase
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTransportGuaranteeTypeBaseObject()
		 * @generated
		 */
		EDataType TRANSPORT_GUARANTEE_TYPE_BASE_OBJECT = eINSTANCE.getTransportGuaranteeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>True False Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTrueFalseTypeBase()
		 * @generated
		 */
		EDataType TRUE_FALSE_TYPE_BASE = eINSTANCE.getTrueFalseTypeBase();

		/**
		 * The meta object literal for the '<em>True False Type Base Object</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getTrueFalseTypeBaseObject()
		 * @generated
		 */
		EDataType TRUE_FALSE_TYPE_BASE_OBJECT = eINSTANCE.getTrueFalseTypeBaseObject();

		/**
		 * The meta object literal for the '<em>War Path Type Base</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWarPathTypeBase()
		 * @generated
		 */
		EDataType WAR_PATH_TYPE_BASE = eINSTANCE.getWarPathTypeBase();

		/**
		 * The meta object literal for the '<em>Web App Version Type Object</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
		 * @see org.eclipse.modisco.jee.webapp.webapp24.impl.Webapp24PackageImpl#getWebAppVersionTypeObject()
		 * @generated
		 */
		EDataType WEB_APP_VERSION_TYPE_OBJECT = eINSTANCE.getWebAppVersionTypeObject();

	}

} // Webapp24Package
