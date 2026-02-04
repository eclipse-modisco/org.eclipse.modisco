/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar11;

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
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface EjbJar11Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EjbJar11"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/ejb-jar_1_1.dtd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EjbJar11"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbJar11Package eINSTANCE = org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl <em>Assembly Descriptor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getAssemblyDescriptorType()
	 * @generated
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Method Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION = 1;

	/**
	 * The feature id for the '<em><b>Container Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Assembly Descriptor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.CmpFieldTypeImpl <em>Cmp Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.CmpFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getCmpFieldType()
	 * @generated
	 */
	int CMP_FIELD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD_TYPE__FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Cmp Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ContainerTransactionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getContainerTransactionType()
	 * @generated
	 */
	int CONTAINER_TRANSACTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Trans Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Container Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getDescriptionType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getDisplayNameType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Assembly Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Cmp Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CMP_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Container Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINER_TRANSACTION = 5;

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
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Ejb Client Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_CLIENT_JAR = 9;

	/**
	 * The feature id for the '<em><b>Ejb Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_JAR = 10;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_LINK = 11;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_NAME = 12;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF = 13;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_NAME = 14;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Enterprise Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTERPRISE_BEANS = 16;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_NAME = 19;

	/**
	 * The feature id for the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIELD_NAME = 22;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOME = 23;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LARGE_ICON = 24;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD = 25;

	/**
	 * The feature id for the '<em><b>Method Intf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_INTF = 26;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_NAME = 27;

	/**
	 * The feature id for the '<em><b>Method Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_PARAM = 28;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_PARAMS = 29;

	/**
	 * The feature id for the '<em><b>Method Permission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_PERMISSION = 30;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSISTENCE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Prim Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRIM_KEY_CLASS = 32;

	/**
	 * The feature id for the '<em><b>Primkey Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRIMKEY_FIELD = 33;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REENTRANT = 34;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE = 35;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_AUTH = 36;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_REF = 37;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_REF_NAME = 38;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Role Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_LINK = 40;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_NAME = 41;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE = 42;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE_REF = 43;

	/**
	 * The feature id for the '<em><b>Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION = 44;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SMALL_ICON = 46;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Trans Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANS_ATTRIBUTE = 48;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClassTypeImpl <em>Ejb Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbClassType()
	 * @generated
	 */
	int EJB_CLASS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLASS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLASS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLASS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClientJarTypeImpl <em>Ejb Client Jar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClientJarTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbClientJarType()
	 * @generated
	 */
	int EJB_CLIENT_JAR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLIENT_JAR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLIENT_JAR_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Client Jar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLIENT_JAR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJarTypeImpl <em>Ejb Jar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJarTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbJarType()
	 * @generated
	 */
	int EJB_JAR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__SMALL_ICON = 2;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__LARGE_ICON = 3;

	/**
	 * The feature id for the '<em><b>Enterprise Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__ENTERPRISE_BEANS = 4;

	/**
	 * The feature id for the '<em><b>Assembly Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Ejb Client Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__EJB_CLIENT_JAR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Ejb Jar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbLinkType()
	 * @generated
	 */
	int EJB_LINK_TYPE = 9;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbNameTypeImpl <em>Ejb Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbNameType()
	 * @generated
	 */
	int EJB_NAME_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 11;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 12;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 13;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnterpriseBeansTypeImpl <em>Enterprise Beans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnterpriseBeansTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnterpriseBeansType()
	 * @generated
	 */
	int ENTERPRISE_BEANS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Session</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE__SESSION = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE__ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Enterprise Beans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SMALL_ICON = 2;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__LARGE_ICON = 3;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__EJB_NAME = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__HOME = 5;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__REMOTE = 6;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__EJB_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PERSISTENCE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Prim Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PRIM_KEY_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__REENTRANT = 10;

	/**
	 * The feature id for the '<em><b>Cmp Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CMP_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Primkey Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PRIMKEY_FIELD = 12;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ENV_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__EJB_REF = 14;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SECURITY_ROLE_REF = 15;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RESOURCE_REF = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ID = 17;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryNameType()
	 * @generated
	 */
	int ENV_ENTRY_NAME_TYPE = 16;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 17;

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
	 * The feature id for the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ENV_ENTRY_VALUE = 3;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryTypeType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_TYPE = 18;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryValueTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryValueType()
	 * @generated
	 */
	int ENV_ENTRY_VALUE_TYPE = 19;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.FieldNameTypeImpl <em>Field Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.FieldNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getFieldNameType()
	 * @generated
	 */
	int FIELD_NAME_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Field Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 21;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.LargeIconTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getLargeIconType()
	 * @generated
	 */
	int LARGE_ICON_TYPE = 22;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodIntfTypeImpl <em>Method Intf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodIntfTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodIntfType()
	 * @generated
	 */
	int METHOD_INTF_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INTF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INTF_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Method Intf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INTF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodNameTypeImpl <em>Method Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodNameType()
	 * @generated
	 */
	int METHOD_NAME_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Method Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamsTypeImpl <em>Method Params Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodParamsType()
	 * @generated
	 */
	int METHOD_PARAMS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Method Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMS_TYPE__METHOD_PARAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Method Params Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamTypeImpl <em>Method Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodParamType()
	 * @generated
	 */
	int METHOD_PARAM_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAM_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Method Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodPermissionTypeImpl <em>Method Permission Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodPermissionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodPermissionType()
	 * @generated
	 */
	int METHOD_PERMISSION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Method Permission Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__EJB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Method Intf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__METHOD_INTF = 2;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__METHOD_NAME = 3;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__METHOD_PARAMS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PersistenceTypeTypeImpl <em>Persistence Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PersistenceTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getPersistenceTypeType()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Persistence Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimKeyClassTypeImpl <em>Prim Key Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimKeyClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getPrimKeyClassType()
	 * @generated
	 */
	int PRIM_KEY_CLASS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIM_KEY_CLASS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIM_KEY_CLASS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Prim Key Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIM_KEY_CLASS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimkeyFieldTypeImpl <em>Primkey Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimkeyFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getPrimkeyFieldType()
	 * @generated
	 */
	int PRIMKEY_FIELD_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMKEY_FIELD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMKEY_FIELD_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Primkey Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMKEY_FIELD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ReentrantTypeImpl <em>Reentrant Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ReentrantTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getReentrantType()
	 * @generated
	 */
	int REENTRANT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REENTRANT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REENTRANT_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Reentrant Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REENTRANT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 33;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 34;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 35;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResRefNameType()
	 * @generated
	 */
	int RES_REF_NAME_TYPE = 36;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResTypeType()
	 * @generated
	 */
	int RES_TYPE_TYPE = 37;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getRoleLinkType()
	 * @generated
	 */
	int ROLE_LINK_TYPE = 38;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 39;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 40;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 41;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeImpl <em>Session Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSessionType()
	 * @generated
	 */
	int SESSION_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__SMALL_ICON = 2;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__LARGE_ICON = 3;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__EJB_NAME = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__HOME = 5;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__REMOTE = 6;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__EJB_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__SESSION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__TRANSACTION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__ENV_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__EJB_REF = 11;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__SECURITY_ROLE_REF = 12;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__RESOURCE_REF = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__ID = 14;

	/**
	 * The number of structural features of the '<em>Session Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeTypeImpl <em>Session Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSessionTypeType()
	 * @generated
	 */
	int SESSION_TYPE_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Session Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SmallIconTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSmallIconType()
	 * @generated
	 */
	int SMALL_ICON_TYPE = 44;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransactionTypeTypeImpl <em>Transaction Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransactionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getTransactionTypeType()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Transaction Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransAttributeTypeImpl <em>Trans Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransAttributeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getTransAttributeType()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_ATTRIBUTE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_ATTRIBUTE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Trans Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_ATTRIBUTE_TYPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType <em>Assembly Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Descriptor Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType
	 * @generated
	 */
	EClass getAssemblyDescriptorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getSecurityRole()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getMethodPermission <em>Method Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Permission</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getMethodPermission()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_MethodPermission();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getContainerTransaction <em>Container Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Transaction</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getContainerTransaction()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ContainerTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType#getId()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EAttribute getAssemblyDescriptorType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType <em>Cmp Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType
	 * @generated
	 */
	EClass getCmpFieldType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType#getDescription()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType#getFieldName()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType#getId()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EAttribute getCmpFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType <em>Container Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType
	 * @generated
	 */
	EClass getContainerTransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getDescription()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getMethod()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getTransAttribute <em>Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trans Attribute</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getTransAttribute()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_TransAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType#getId()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EAttribute getContainerTransactionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType#getId()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType#getMixed()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType#getId()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getAssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getAssemblyDescriptor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssemblyDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getCmpField <em>Cmp Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmp Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getCmpField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CmpField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getContainerTransaction <em>Container Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Transaction</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getContainerTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContainerTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getDisplayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbClientJar <em>Ejb Client Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Client Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbClientJar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbClientJar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbJar <em>Ejb Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbJar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbJar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEjbRefType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enterprise Beans</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnterpriseBeans()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnterpriseBeans();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntryType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getEnvEntryValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getFieldName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FieldName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getHome()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getLargeIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodIntf <em>Method Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Intf</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodIntf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodIntf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodParam <em>Method Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodParams()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodPermission <em>Method Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Permission</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getMethodPermission()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodPermission();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getPersistenceType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PersistenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getPrimKeyClass <em>Prim Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prim Key Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getPrimKeyClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrimKeyClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getPrimkeyField <em>Primkey Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primkey Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getPrimkeyField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrimkeyField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reentrant</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getReentrant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reentrant();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getRemote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResAuth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResourceRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getResType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getRoleLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getRoleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSecurityRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSecurityRoleRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSession()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Session();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSessionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getSmallIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getTransactionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getTransAttribute <em>Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trans Attribute</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot#getTransAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType <em>Ejb Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType
	 * @generated
	 */
	EClass getEjbClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType#getMixed()
	 * @see #getEjbClassType()
	 * @generated
	 */
	EAttribute getEjbClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType#getId()
	 * @see #getEjbClassType()
	 * @generated
	 */
	EAttribute getEjbClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClientJarType <em>Ejb Client Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Client Jar Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClientJarType
	 * @generated
	 */
	EClass getEjbClientJarType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClientJarType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClientJarType#getMixed()
	 * @see #getEjbClientJarType()
	 * @generated
	 */
	EAttribute getEjbClientJarType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClientJarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClientJarType#getId()
	 * @see #getEjbClientJarType()
	 * @generated
	 */
	EAttribute getEjbClientJarType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType <em>Ejb Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Jar Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType
	 * @generated
	 */
	EClass getEjbJarType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getDescription()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getDisplayName()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getSmallIcon()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getLargeIcon()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enterprise Beans</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getEnterpriseBeans()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EnterpriseBeans();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getAssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getAssemblyDescriptor()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_AssemblyDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getEjbClientJar <em>Ejb Client Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Client Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getEjbClientJar()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EjbClientJar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType#getId()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EAttribute getEjbJarType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbLinkType#getMixed()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbLinkType#getId()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType <em>Ejb Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType
	 * @generated
	 */
	EClass getEjbNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType#getMixed()
	 * @see #getEjbNameType()
	 * @generated
	 */
	EAttribute getEjbNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType#getId()
	 * @see #getEjbNameType()
	 * @generated
	 */
	EAttribute getEjbNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefNameType#getMixed()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefNameType#getId()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefTypeType#getMixed()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefTypeType#getId()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType <em>Enterprise Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Beans Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType
	 * @generated
	 */
	EClass getEnterpriseBeansType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getGroup()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getSession()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Session();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getEntity()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Entity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getId()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDescription()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDisplayName()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getSmallIcon()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getLargeIcon()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbName()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getHome()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getRemote()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbClass()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPersistenceType()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PersistenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimKeyClass <em>Prim Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prim Key Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimKeyClass()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PrimKeyClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reentrant</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getReentrant()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Reentrant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getCmpField <em>Cmp Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmp Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getCmpField()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_CmpField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimkeyField <em>Primkey Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primkey Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimkeyField()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PrimkeyField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEnvEntry()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getSecurityRoleRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getResourceRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_ResourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getId()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryNameType <em>Env Entry Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryNameType
	 * @generated
	 */
	EClass getEnvEntryNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryNameType#getMixed()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryNameType#getId()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryTypeType <em>Env Entry Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryTypeType
	 * @generated
	 */
	EClass getEnvEntryTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryTypeType#getMixed()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryTypeType#getId()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryValueType <em>Env Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Value Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryValueType
	 * @generated
	 */
	EClass getEnvEntryValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryValueType#getMixed()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryValueType#getId()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.FieldNameType <em>Field Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.FieldNameType
	 * @generated
	 */
	EClass getFieldNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.FieldNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.FieldNameType#getMixed()
	 * @see #getFieldNameType()
	 * @generated
	 */
	EAttribute getFieldNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.FieldNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.FieldNameType#getId()
	 * @see #getFieldNameType()
	 * @generated
	 */
	EAttribute getFieldNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType#getMixed()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType#getId()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType <em>Large Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType
	 * @generated
	 */
	EClass getLargeIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType#getMixed()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType#getId()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodIntfType <em>Method Intf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Intf Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodIntfType
	 * @generated
	 */
	EClass getMethodIntfType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodIntfType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodIntfType#getMixed()
	 * @see #getMethodIntfType()
	 * @generated
	 */
	EAttribute getMethodIntfType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodIntfType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodIntfType#getId()
	 * @see #getMethodIntfType()
	 * @generated
	 */
	EAttribute getMethodIntfType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodNameType <em>Method Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodNameType
	 * @generated
	 */
	EClass getMethodNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodNameType#getMixed()
	 * @see #getMethodNameType()
	 * @generated
	 */
	EAttribute getMethodNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodNameType#getId()
	 * @see #getMethodNameType()
	 * @generated
	 */
	EAttribute getMethodNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamsType <em>Method Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Params Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamsType
	 * @generated
	 */
	EClass getMethodParamsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamsType#getMethodParam <em>Method Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamsType#getMethodParam()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EReference getMethodParamsType_MethodParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamsType#getId()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EAttribute getMethodParamsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamType <em>Method Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Param Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamType
	 * @generated
	 */
	EClass getMethodParamType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamType#getMixed()
	 * @see #getMethodParamType()
	 * @generated
	 */
	EAttribute getMethodParamType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamType#getId()
	 * @see #getMethodParamType()
	 * @generated
	 */
	EAttribute getMethodParamType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType <em>Method Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Permission Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType
	 * @generated
	 */
	EClass getMethodPermissionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getDescription()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getRoleName()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_RoleName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getMethod()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType#getId()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EAttribute getMethodPermissionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getDescription()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getEjbName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getMethodIntf <em>Method Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Intf</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getMethodIntf()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodIntf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getMethodName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getMethodParams()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType#getId()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType <em>Persistence Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType
	 * @generated
	 */
	EClass getPersistenceTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType#getMixed()
	 * @see #getPersistenceTypeType()
	 * @generated
	 */
	EAttribute getPersistenceTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType#getId()
	 * @see #getPersistenceTypeType()
	 * @generated
	 */
	EAttribute getPersistenceTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType <em>Prim Key Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prim Key Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType
	 * @generated
	 */
	EClass getPrimKeyClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType#getMixed()
	 * @see #getPrimKeyClassType()
	 * @generated
	 */
	EAttribute getPrimKeyClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType#getId()
	 * @see #getPrimKeyClassType()
	 * @generated
	 */
	EAttribute getPrimKeyClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType <em>Primkey Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primkey Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType
	 * @generated
	 */
	EClass getPrimkeyFieldType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType#getMixed()
	 * @see #getPrimkeyFieldType()
	 * @generated
	 */
	EAttribute getPrimkeyFieldType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType#getId()
	 * @see #getPrimkeyFieldType()
	 * @generated
	 */
	EAttribute getPrimkeyFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType <em>Reentrant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reentrant Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType
	 * @generated
	 */
	EClass getReentrantType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType#getMixed()
	 * @see #getReentrantType()
	 * @generated
	 */
	EAttribute getReentrantType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType#getId()
	 * @see #getReentrantType()
	 * @generated
	 */
	EAttribute getReentrantType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType#getMixed()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType#getId()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType#getMixed()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType#getId()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType <em>Res Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType
	 * @generated
	 */
	EClass getResRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType#getMixed()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType#getId()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType <em>Res Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType
	 * @generated
	 */
	EClass getResTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType#getMixed()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType#getId()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleLinkType <em>Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleLinkType
	 * @generated
	 */
	EClass getRoleLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleLinkType#getMixed()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleLinkType#getId()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleNameType#getMixed()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleNameType#getId()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType
	 * @generated
	 */
	EClass getSessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getDescription()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getDisplayName()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getSmallIcon()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getLargeIcon()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEjbName()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getHome()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getRemote()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEjbClass()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getSessionType()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_SessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getTransactionType()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_TransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEnvEntry()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getEjbRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getSecurityRoleRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getResourceRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_ResourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType#getId()
	 * @see #getSessionType()
	 * @generated
	 */
	EAttribute getSessionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionTypeType <em>Session Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionTypeType
	 * @generated
	 */
	EClass getSessionTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionTypeType#getMixed()
	 * @see #getSessionTypeType()
	 * @generated
	 */
	EAttribute getSessionTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionTypeType#getId()
	 * @see #getSessionTypeType()
	 * @generated
	 */
	EAttribute getSessionTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType <em>Small Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType
	 * @generated
	 */
	EClass getSmallIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType#getMixed()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType#getId()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.TransactionTypeType
	 * @generated
	 */
	EClass getTransactionTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.TransactionTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.TransactionTypeType#getMixed()
	 * @see #getTransactionTypeType()
	 * @generated
	 */
	EAttribute getTransactionTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.TransactionTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.TransactionTypeType#getId()
	 * @see #getTransactionTypeType()
	 * @generated
	 */
	EAttribute getTransactionTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.TransAttributeType <em>Trans Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trans Attribute Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.TransAttributeType
	 * @generated
	 */
	EClass getTransAttributeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.TransAttributeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.TransAttributeType#getMixed()
	 * @see #getTransAttributeType()
	 * @generated
	 */
	EAttribute getTransAttributeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.TransAttributeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.TransAttributeType#getId()
	 * @see #getTransAttributeType()
	 * @generated
	 */
	EAttribute getTransAttributeType_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjbJar11Factory getEjbJar11Factory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl <em>Assembly Descriptor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getAssemblyDescriptorType()
		 * @generated
		 */
		EClass ASSEMBLY_DESCRIPTOR_TYPE = eINSTANCE.getAssemblyDescriptorType();

		/**
		 * The meta object literal for the '<em><b>Security Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE = eINSTANCE.getAssemblyDescriptorType_SecurityRole();

		/**
		 * The meta object literal for the '<em><b>Method Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION = eINSTANCE.getAssemblyDescriptorType_MethodPermission();

		/**
		 * The meta object literal for the '<em><b>Container Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION = eINSTANCE.getAssemblyDescriptorType_ContainerTransaction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_DESCRIPTOR_TYPE__ID = eINSTANCE.getAssemblyDescriptorType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.CmpFieldTypeImpl <em>Cmp Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.CmpFieldTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getCmpFieldType()
		 * @generated
		 */
		EClass CMP_FIELD_TYPE = eINSTANCE.getCmpFieldType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_FIELD_TYPE__DESCRIPTION = eINSTANCE.getCmpFieldType_Description();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_FIELD_TYPE__FIELD_NAME = eINSTANCE.getCmpFieldType_FieldName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_FIELD_TYPE__ID = eINSTANCE.getCmpFieldType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ContainerTransactionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getContainerTransactionType()
		 * @generated
		 */
		EClass CONTAINER_TRANSACTION_TYPE = eINSTANCE.getContainerTransactionType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TRANSACTION_TYPE__DESCRIPTION = eINSTANCE.getContainerTransactionType_Description();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TRANSACTION_TYPE__METHOD = eINSTANCE.getContainerTransactionType_Method();

		/**
		 * The meta object literal for the '<em><b>Trans Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE = eINSTANCE.getContainerTransactionType_TransAttribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TRANSACTION_TYPE__ID = eINSTANCE.getContainerTransactionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DescriptionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getDescriptionType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DisplayNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getDisplayNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Assembly Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR = eINSTANCE.getDocumentRoot_AssemblyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Cmp Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CMP_FIELD = eINSTANCE.getDocumentRoot_CmpField();

		/**
		 * The meta object literal for the '<em><b>Container Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTAINER_TRANSACTION = eINSTANCE.getDocumentRoot_ContainerTransaction();

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
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_CLASS = eINSTANCE.getDocumentRoot_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Ejb Client Jar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_CLIENT_JAR = eINSTANCE.getDocumentRoot_EjbClientJar();

		/**
		 * The meta object literal for the '<em><b>Ejb Jar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_JAR = eINSTANCE.getDocumentRoot_EjbJar();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_LINK = eINSTANCE.getDocumentRoot_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_NAME = eINSTANCE.getDocumentRoot_EjbName();

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
		 * The meta object literal for the '<em><b>Enterprise Beans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTERPRISE_BEANS = eINSTANCE.getDocumentRoot_EnterpriseBeans();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY = eINSTANCE.getDocumentRoot_Entity();

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
		 * The meta object literal for the '<em><b>Field Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FIELD_NAME = eINSTANCE.getDocumentRoot_FieldName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HOME = eINSTANCE.getDocumentRoot_Home();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LARGE_ICON = eINSTANCE.getDocumentRoot_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METHOD = eINSTANCE.getDocumentRoot_Method();

		/**
		 * The meta object literal for the '<em><b>Method Intf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METHOD_INTF = eINSTANCE.getDocumentRoot_MethodIntf();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METHOD_NAME = eINSTANCE.getDocumentRoot_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METHOD_PARAM = eINSTANCE.getDocumentRoot_MethodParam();

		/**
		 * The meta object literal for the '<em><b>Method Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METHOD_PARAMS = eINSTANCE.getDocumentRoot_MethodParams();

		/**
		 * The meta object literal for the '<em><b>Method Permission</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METHOD_PERMISSION = eINSTANCE.getDocumentRoot_MethodPermission();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSISTENCE_TYPE = eINSTANCE.getDocumentRoot_PersistenceType();

		/**
		 * The meta object literal for the '<em><b>Prim Key Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRIM_KEY_CLASS = eINSTANCE.getDocumentRoot_PrimKeyClass();

		/**
		 * The meta object literal for the '<em><b>Primkey Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRIMKEY_FIELD = eINSTANCE.getDocumentRoot_PrimkeyField();

		/**
		 * The meta object literal for the '<em><b>Reentrant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REENTRANT = eINSTANCE.getDocumentRoot_Reentrant();

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
		 * The meta object literal for the '<em><b>Session</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SESSION = eINSTANCE.getDocumentRoot_Session();

		/**
		 * The meta object literal for the '<em><b>Session Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SESSION_TYPE = eINSTANCE.getDocumentRoot_SessionType();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SMALL_ICON = eINSTANCE.getDocumentRoot_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSACTION_TYPE = eINSTANCE.getDocumentRoot_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Trans Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANS_ATTRIBUTE = eINSTANCE.getDocumentRoot_TransAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClassTypeImpl <em>Ejb Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClassTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbClassType()
		 * @generated
		 */
		EClass EJB_CLASS_TYPE = eINSTANCE.getEjbClassType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_CLASS_TYPE__MIXED = eINSTANCE.getEjbClassType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_CLASS_TYPE__ID = eINSTANCE.getEjbClassType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClientJarTypeImpl <em>Ejb Client Jar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbClientJarTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbClientJarType()
		 * @generated
		 */
		EClass EJB_CLIENT_JAR_TYPE = eINSTANCE.getEjbClientJarType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_CLIENT_JAR_TYPE__MIXED = eINSTANCE.getEjbClientJarType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_CLIENT_JAR_TYPE__ID = eINSTANCE.getEjbClientJarType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJarTypeImpl <em>Ejb Jar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJarTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbJarType()
		 * @generated
		 */
		EClass EJB_JAR_TYPE = eINSTANCE.getEjbJarType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__DESCRIPTION = eINSTANCE.getEjbJarType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__DISPLAY_NAME = eINSTANCE.getEjbJarType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__SMALL_ICON = eINSTANCE.getEjbJarType_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__LARGE_ICON = eINSTANCE.getEjbJarType_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Enterprise Beans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__ENTERPRISE_BEANS = eINSTANCE.getEjbJarType_EnterpriseBeans();

		/**
		 * The meta object literal for the '<em><b>Assembly Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR = eINSTANCE.getEjbJarType_AssemblyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Ejb Client Jar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__EJB_CLIENT_JAR = eINSTANCE.getEjbJarType_EjbClientJar();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_JAR_TYPE__ID = eINSTANCE.getEjbJarType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbLinkTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbLinkType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbNameTypeImpl <em>Ejb Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbNameType()
		 * @generated
		 */
		EClass EJB_NAME_TYPE = eINSTANCE.getEjbNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_NAME_TYPE__MIXED = eINSTANCE.getEjbNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_NAME_TYPE__ID = eINSTANCE.getEjbNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbRefNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEjbRefTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnterpriseBeansTypeImpl <em>Enterprise Beans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnterpriseBeansTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnterpriseBeansType()
		 * @generated
		 */
		EClass ENTERPRISE_BEANS_TYPE = eINSTANCE.getEnterpriseBeansType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_BEANS_TYPE__GROUP = eINSTANCE.getEnterpriseBeansType_Group();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_BEANS_TYPE__SESSION = eINSTANCE.getEnterpriseBeansType_Session();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_BEANS_TYPE__ENTITY = eINSTANCE.getEnterpriseBeansType_Entity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_BEANS_TYPE__ID = eINSTANCE.getEnterpriseBeansType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DESCRIPTION = eINSTANCE.getEntityType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DISPLAY_NAME = eINSTANCE.getEntityType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SMALL_ICON = eINSTANCE.getEntityType_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__LARGE_ICON = eINSTANCE.getEntityType_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__EJB_NAME = eINSTANCE.getEntityType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__HOME = eINSTANCE.getEntityType_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__REMOTE = eINSTANCE.getEntityType_Remote();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__EJB_CLASS = eINSTANCE.getEntityType_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PERSISTENCE_TYPE = eINSTANCE.getEntityType_PersistenceType();

		/**
		 * The meta object literal for the '<em><b>Prim Key Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PRIM_KEY_CLASS = eINSTANCE.getEntityType_PrimKeyClass();

		/**
		 * The meta object literal for the '<em><b>Reentrant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__REENTRANT = eINSTANCE.getEntityType_Reentrant();

		/**
		 * The meta object literal for the '<em><b>Cmp Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__CMP_FIELD = eINSTANCE.getEntityType_CmpField();

		/**
		 * The meta object literal for the '<em><b>Primkey Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PRIMKEY_FIELD = eINSTANCE.getEntityType_PrimkeyField();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__ENV_ENTRY = eINSTANCE.getEntityType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__EJB_REF = eINSTANCE.getEntityType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SECURITY_ROLE_REF = eINSTANCE.getEntityType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RESOURCE_REF = eINSTANCE.getEntityType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__ID = eINSTANCE.getEntityType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryType()
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
		 * The meta object literal for the '<em><b>Env Entry Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_TYPE = eINSTANCE.getEnvEntryType_EnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Env Entry Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY_TYPE__ENV_ENTRY_VALUE = eINSTANCE.getEnvEntryType_EnvEntryValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY_TYPE__ID = eINSTANCE.getEnvEntryType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EnvEntryValueTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getEnvEntryValueType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.FieldNameTypeImpl <em>Field Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.FieldNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getFieldNameType()
		 * @generated
		 */
		EClass FIELD_NAME_TYPE = eINSTANCE.getFieldNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_NAME_TYPE__MIXED = eINSTANCE.getFieldNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_NAME_TYPE__ID = eINSTANCE.getFieldNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.HomeTypeImpl <em>Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.HomeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getHomeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.LargeIconTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getLargeIconType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodIntfTypeImpl <em>Method Intf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodIntfTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodIntfType()
		 * @generated
		 */
		EClass METHOD_INTF_TYPE = eINSTANCE.getMethodIntfType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_INTF_TYPE__MIXED = eINSTANCE.getMethodIntfType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_INTF_TYPE__ID = eINSTANCE.getMethodIntfType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodNameTypeImpl <em>Method Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodNameType()
		 * @generated
		 */
		EClass METHOD_NAME_TYPE = eINSTANCE.getMethodNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_NAME_TYPE__MIXED = eINSTANCE.getMethodNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_NAME_TYPE__ID = eINSTANCE.getMethodNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamsTypeImpl <em>Method Params Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamsTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodParamsType()
		 * @generated
		 */
		EClass METHOD_PARAMS_TYPE = eINSTANCE.getMethodParamsType();

		/**
		 * The meta object literal for the '<em><b>Method Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PARAMS_TYPE__METHOD_PARAM = eINSTANCE.getMethodParamsType_MethodParam();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMS_TYPE__ID = eINSTANCE.getMethodParamsType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamTypeImpl <em>Method Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodParamTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodParamType()
		 * @generated
		 */
		EClass METHOD_PARAM_TYPE = eINSTANCE.getMethodParamType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAM_TYPE__MIXED = eINSTANCE.getMethodParamType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAM_TYPE__ID = eINSTANCE.getMethodParamType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodPermissionTypeImpl <em>Method Permission Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodPermissionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodPermissionType()
		 * @generated
		 */
		EClass METHOD_PERMISSION_TYPE = eINSTANCE.getMethodPermissionType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PERMISSION_TYPE__DESCRIPTION = eINSTANCE.getMethodPermissionType_Description();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PERMISSION_TYPE__ROLE_NAME = eINSTANCE.getMethodPermissionType_RoleName();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PERMISSION_TYPE__METHOD = eINSTANCE.getMethodPermissionType_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PERMISSION_TYPE__ID = eINSTANCE.getMethodPermissionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodTypeImpl <em>Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.MethodTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getMethodType()
		 * @generated
		 */
		EClass METHOD_TYPE = eINSTANCE.getMethodType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TYPE__DESCRIPTION = eINSTANCE.getMethodType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TYPE__EJB_NAME = eINSTANCE.getMethodType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Method Intf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TYPE__METHOD_INTF = eINSTANCE.getMethodType_MethodIntf();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TYPE__METHOD_NAME = eINSTANCE.getMethodType_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TYPE__METHOD_PARAMS = eINSTANCE.getMethodType_MethodParams();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TYPE__ID = eINSTANCE.getMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PersistenceTypeTypeImpl <em>Persistence Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PersistenceTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getPersistenceTypeType()
		 * @generated
		 */
		EClass PERSISTENCE_TYPE_TYPE = eINSTANCE.getPersistenceTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_TYPE_TYPE__MIXED = eINSTANCE.getPersistenceTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_TYPE_TYPE__ID = eINSTANCE.getPersistenceTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimKeyClassTypeImpl <em>Prim Key Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimKeyClassTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getPrimKeyClassType()
		 * @generated
		 */
		EClass PRIM_KEY_CLASS_TYPE = eINSTANCE.getPrimKeyClassType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIM_KEY_CLASS_TYPE__MIXED = eINSTANCE.getPrimKeyClassType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIM_KEY_CLASS_TYPE__ID = eINSTANCE.getPrimKeyClassType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimkeyFieldTypeImpl <em>Primkey Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.PrimkeyFieldTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getPrimkeyFieldType()
		 * @generated
		 */
		EClass PRIMKEY_FIELD_TYPE = eINSTANCE.getPrimkeyFieldType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMKEY_FIELD_TYPE__MIXED = eINSTANCE.getPrimkeyFieldType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMKEY_FIELD_TYPE__ID = eINSTANCE.getPrimkeyFieldType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ReentrantTypeImpl <em>Reentrant Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ReentrantTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getReentrantType()
		 * @generated
		 */
		EClass REENTRANT_TYPE = eINSTANCE.getReentrantType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REENTRANT_TYPE__MIXED = eINSTANCE.getReentrantType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REENTRANT_TYPE__ID = eINSTANCE.getReentrantType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RemoteTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getRemoteType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResAuthTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResAuthType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResourceRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResRefNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getResTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleLinkTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getRoleLinkType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.RoleNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getRoleNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSecurityRoleRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SecurityRoleTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSecurityRoleType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeImpl <em>Session Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSessionType()
		 * @generated
		 */
		EClass SESSION_TYPE = eINSTANCE.getSessionType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__DESCRIPTION = eINSTANCE.getSessionType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__DISPLAY_NAME = eINSTANCE.getSessionType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__SMALL_ICON = eINSTANCE.getSessionType_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__LARGE_ICON = eINSTANCE.getSessionType_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__EJB_NAME = eINSTANCE.getSessionType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__HOME = eINSTANCE.getSessionType_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__REMOTE = eINSTANCE.getSessionType_Remote();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__EJB_CLASS = eINSTANCE.getSessionType_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Session Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__SESSION_TYPE = eINSTANCE.getSessionType_SessionType();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__TRANSACTION_TYPE = eINSTANCE.getSessionType_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__ENV_ENTRY = eINSTANCE.getSessionType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__EJB_REF = eINSTANCE.getSessionType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__SECURITY_ROLE_REF = eINSTANCE.getSessionType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__RESOURCE_REF = eINSTANCE.getSessionType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TYPE__ID = eINSTANCE.getSessionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeTypeImpl <em>Session Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SessionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSessionTypeType()
		 * @generated
		 */
		EClass SESSION_TYPE_TYPE = eINSTANCE.getSessionTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TYPE_TYPE__MIXED = eINSTANCE.getSessionTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TYPE_TYPE__ID = eINSTANCE.getSessionTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.SmallIconTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getSmallIconType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransactionTypeTypeImpl <em>Transaction Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransactionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getTransactionTypeType()
		 * @generated
		 */
		EClass TRANSACTION_TYPE_TYPE = eINSTANCE.getTransactionTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE_TYPE__MIXED = eINSTANCE.getTransactionTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE_TYPE__ID = eINSTANCE.getTransactionTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransAttributeTypeImpl <em>Trans Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.TransAttributeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EjbJar11PackageImpl#getTransAttributeType()
		 * @generated
		 */
		EClass TRANS_ATTRIBUTE_TYPE = eINSTANCE.getTransAttributeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANS_ATTRIBUTE_TYPE__MIXED = eINSTANCE.getTransAttributeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANS_ATTRIBUTE_TYPE__ID = eINSTANCE.getTransAttributeType_Id();

	}

} //EjbJar11Package
