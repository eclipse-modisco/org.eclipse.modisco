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
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

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
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface EjbJar20Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EjbJar20"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/ejb-jar_2_0.dtd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EjbJar20"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbJar20Package eINSTANCE = org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AbstractSchemaNameTypeImpl <em>Abstract Schema Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AbstractSchemaNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getAbstractSchemaNameType()
	 * @generated
	 */
	int ABSTRACT_SCHEMA_NAME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCHEMA_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCHEMA_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Abstract Schema Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCHEMA_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AcknowledgeModeTypeImpl <em>Acknowledge Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AcknowledgeModeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getAcknowledgeModeType()
	 * @generated
	 */
	int ACKNOWLEDGE_MODE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACKNOWLEDGE_MODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACKNOWLEDGE_MODE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Acknowledge Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACKNOWLEDGE_MODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AssemblyDescriptorTypeImpl <em>Assembly Descriptor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AssemblyDescriptorTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getAssemblyDescriptorType()
	 * @generated
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE = 2;

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
	 * The feature id for the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Assembly Descriptor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CascadeDeleteTypeImpl <em>Cascade Delete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CascadeDeleteTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCascadeDeleteType()
	 * @generated
	 */
	int CASCADE_DELETE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_DELETE_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Cascade Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_DELETE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpFieldTypeImpl <em>Cmp Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmpFieldType()
	 * @generated
	 */
	int CMP_FIELD_TYPE = 4;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpVersionTypeImpl <em>Cmp Version Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpVersionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmpVersionType()
	 * @generated
	 */
	int CMP_VERSION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_VERSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_VERSION_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Cmp Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_VERSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldNameTypeImpl <em>Cmr Field Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmrFieldNameType()
	 * @generated
	 */
	int CMR_FIELD_NAME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Cmr Field Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeImpl <em>Cmr Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmrFieldType()
	 * @generated
	 */
	int CMR_FIELD_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Cmr Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE__CMR_FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Cmr Field Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE__CMR_FIELD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Cmr Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeTypeImpl <em>Cmr Field Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmrFieldTypeType()
	 * @generated
	 */
	int CMR_FIELD_TYPE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Cmr Field Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ContainerTransactionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getContainerTransactionType()
	 * @generated
	 */
	int CONTAINER_TRANSACTION_TYPE = 9;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 10;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DestinationTypeTypeImpl <em>Destination Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DestinationTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDestinationTypeType()
	 * @generated
	 */
	int DESTINATION_TYPE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Destination Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDisplayNameType()
	 * @generated
	 */
	int DISPLAY_NAME_TYPE = 12;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 13;

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
	 * The feature id for the '<em><b>Abstract Schema Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Acknowledge Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACKNOWLEDGE_MODE = 4;

	/**
	 * The feature id for the '<em><b>Assembly Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Cascade Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CASCADE_DELETE = 6;

	/**
	 * The feature id for the '<em><b>Cmp Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CMP_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Cmp Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CMP_VERSION = 8;

	/**
	 * The feature id for the '<em><b>Cmr Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CMR_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Cmr Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CMR_FIELD_NAME = 10;

	/**
	 * The feature id for the '<em><b>Cmr Field Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CMR_FIELD_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Container Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINER_TRANSACTION = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESTINATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_NAME = 15;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_CLASS = 16;

	/**
	 * The feature id for the '<em><b>Ejb Client Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_CLIENT_JAR = 17;

	/**
	 * The feature id for the '<em><b>Ejb Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_JAR = 18;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_LINK = 19;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_LOCAL_REF = 20;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_NAME = 21;

	/**
	 * The feature id for the '<em><b>Ejb Ql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_QL = 22;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF = 23;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_NAME = 24;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_REF_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Ejb Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_RELATION = 26;

	/**
	 * The feature id for the '<em><b>Ejb Relation Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_RELATION_NAME = 27;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE = 28;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME = 29;

	/**
	 * The feature id for the '<em><b>Enterprise Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTERPRISE_BEANS = 30;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY = 31;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY = 32;

	/**
	 * The feature id for the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_NAME = 33;

	/**
	 * The feature id for the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENV_ENTRY_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCLUDE_LIST = 36;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIELD_NAME = 37;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOME = 38;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LARGE_ICON = 39;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCAL = 40;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCAL_HOME = 41;

	/**
	 * The feature id for the '<em><b>Message Driven</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_DRIVEN = 42;

	/**
	 * The feature id for the '<em><b>Message Driven Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION = 43;

	/**
	 * The feature id for the '<em><b>Message Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_SELECTOR = 44;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD = 45;

	/**
	 * The feature id for the '<em><b>Method Intf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_INTF = 46;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_NAME = 47;

	/**
	 * The feature id for the '<em><b>Method Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_PARAM = 48;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_PARAMS = 49;

	/**
	 * The feature id for the '<em><b>Method Permission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_PERMISSION = 50;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTIPLICITY = 51;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSISTENCE_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Prim Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRIM_KEY_CLASS = 53;

	/**
	 * The feature id for the '<em><b>Primkey Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRIMKEY_FIELD = 54;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY = 55;

	/**
	 * The feature id for the '<em><b>Query Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY_METHOD = 56;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REENTRANT = 57;

	/**
	 * The feature id for the '<em><b>Relationship Role Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE = 58;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATIONSHIPS = 59;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE = 60;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_AUTH = 61;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ENV_REF = 62;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME = 63;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_REF = 65;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_REF_NAME = 66;

	/**
	 * The feature id for the '<em><b>Res Sharing Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_SHARING_SCOPE = 67;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RES_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Result Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESULT_TYPE_MAPPING = 69;

	/**
	 * The feature id for the '<em><b>Role Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_LINK = 70;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_NAME = 71;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUN_AS = 72;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_IDENTITY = 73;

	/**
	 * The feature id for the '<em><b>Security Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE = 74;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_ROLE_REF = 75;

	/**
	 * The feature id for the '<em><b>Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION = 76;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SESSION_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SMALL_ICON = 78;

	/**
	 * The feature id for the '<em><b>Subscription Durability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY = 79;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Trans Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANS_ATTRIBUTE = 81;

	/**
	 * The feature id for the '<em><b>Unchecked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNCHECKED = 82;

	/**
	 * The feature id for the '<em><b>Use Caller Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE_CALLER_IDENTITY = 83;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClassTypeImpl <em>Ejb Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbClassType()
	 * @generated
	 */
	int EJB_CLASS_TYPE = 14;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClientJarTypeImpl <em>Ejb Client Jar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClientJarTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbClientJarType()
	 * @generated
	 */
	int EJB_CLIENT_JAR_TYPE = 15;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl <em>Ejb Jar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbJarType()
	 * @generated
	 */
	int EJB_JAR_TYPE = 16;

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
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__RELATIONSHIPS = 5;

	/**
	 * The feature id for the '<em><b>Assembly Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__ASSEMBLY_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Ejb Client Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__EJB_CLIENT_JAR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__ID = 8;

	/**
	 * The number of structural features of the '<em>Ejb Jar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbLinkType()
	 * @generated
	 */
	int EJB_LINK_TYPE = 17;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLocalRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbLocalRefType()
	 * @generated
	 */
	int EJB_LOCAL_REF_TYPE = 18;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbNameTypeImpl <em>Ejb Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbNameType()
	 * @generated
	 */
	int EJB_NAME_TYPE = 19;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbQlTypeImpl <em>Ejb Ql Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbQlTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbQlType()
	 * @generated
	 */
	int EJB_QL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_QL_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_QL_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Ql Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_QL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 21;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 22;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 23;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationNameTypeImpl <em>Ejb Relation Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationNameType()
	 * @generated
	 */
	int EJB_RELATION_NAME_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Relation Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleNameTypeImpl <em>Ejb Relationship Role Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationshipRoleNameType()
	 * @generated
	 */
	int EJB_RELATIONSHIP_ROLE_NAME_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_NAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Ejb Relationship Role Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl <em>Ejb Relationship Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationshipRoleType()
	 * @generated
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY = 2;

	/**
	 * The feature id for the '<em><b>Cascade Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE = 3;

	/**
	 * The feature id for the '<em><b>Relationship Role Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Cmr Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Ejb Relationship Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationTypeImpl <em>Ejb Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationType()
	 * @generated
	 */
	int EJB_RELATION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Relation Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_TYPE__EJB_RELATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1 = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Ejb Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl <em>Enterprise Beans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnterpriseBeansType()
	 * @generated
	 */
	int ENTERPRISE_BEANS_TYPE = 28;

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
	 * The feature id for the '<em><b>Message Driven</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Enterprise Beans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEANS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EntityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 29;

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
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__LOCAL_HOME = 7;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__LOCAL = 8;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__EJB_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PERSISTENCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Prim Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PRIM_KEY_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__REENTRANT = 12;

	/**
	 * The feature id for the '<em><b>Cmp Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CMP_VERSION = 13;

	/**
	 * The feature id for the '<em><b>Abstract Schema Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ABSTRACT_SCHEMA_NAME = 14;

	/**
	 * The feature id for the '<em><b>Cmp Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CMP_FIELD = 15;

	/**
	 * The feature id for the '<em><b>Primkey Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PRIMKEY_FIELD = 16;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ENV_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__EJB_REF = 18;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__EJB_LOCAL_REF = 19;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SECURITY_ROLE_REF = 20;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SECURITY_IDENTITY = 21;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RESOURCE_REF = 22;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RESOURCE_ENV_REF = 23;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__QUERY = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ID = 25;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryNameType()
	 * @generated
	 */
	int ENV_ENTRY_NAME_TYPE = 30;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 31;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryTypeType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_TYPE = 32;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryValueTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryValueType()
	 * @generated
	 */
	int ENV_ENTRY_VALUE_TYPE = 33;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ExcludeListTypeImpl <em>Exclude List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ExcludeListTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getExcludeListType()
	 * @generated
	 */
	int EXCLUDE_LIST_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST_TYPE__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Exclude List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.FieldNameTypeImpl <em>Field Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.FieldNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getFieldNameType()
	 * @generated
	 */
	int FIELD_NAME_TYPE = 35;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 36;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LargeIconTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getLargeIconType()
	 * @generated
	 */
	int LARGE_ICON_TYPE = 37;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalHomeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getLocalHomeType()
	 * @generated
	 */
	int LOCAL_HOME_TYPE = 38;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalTypeImpl <em>Local Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getLocalType()
	 * @generated
	 */
	int LOCAL_TYPE = 39;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenDestinationTypeImpl <em>Message Driven Destination Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenDestinationTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMessageDrivenDestinationType()
	 * @generated
	 */
	int MESSAGE_DRIVEN_DESTINATION_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Subscription Durability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_DESTINATION_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Message Driven Destination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_DESTINATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl <em>Message Driven Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMessageDrivenType()
	 * @generated
	 */
	int MESSAGE_DRIVEN_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__SMALL_ICON = 2;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__LARGE_ICON = 3;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__EJB_NAME = 4;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__EJB_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Message Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR = 7;

	/**
	 * The feature id for the '<em><b>Acknowledge Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE = 8;

	/**
	 * The feature id for the '<em><b>Message Driven Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION = 9;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__ENV_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__EJB_REF = 11;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF = 12;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY = 13;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__RESOURCE_REF = 14;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE__ID = 16;

	/**
	 * The number of structural features of the '<em>Message Driven Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageSelectorTypeImpl <em>Message Selector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageSelectorTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMessageSelectorType()
	 * @generated
	 */
	int MESSAGE_SELECTOR_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SELECTOR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SELECTOR_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Message Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SELECTOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodIntfTypeImpl <em>Method Intf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodIntfTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodIntfType()
	 * @generated
	 */
	int METHOD_INTF_TYPE = 43;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodNameTypeImpl <em>Method Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodNameType()
	 * @generated
	 */
	int METHOD_NAME_TYPE = 44;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamsTypeImpl <em>Method Params Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodParamsType()
	 * @generated
	 */
	int METHOD_PARAMS_TYPE = 45;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamTypeImpl <em>Method Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodParamType()
	 * @generated
	 */
	int METHOD_PARAM_TYPE = 46;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodPermissionTypeImpl <em>Method Permission Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodPermissionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodPermissionType()
	 * @generated
	 */
	int METHOD_PERMISSION_TYPE = 47;

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
	 * The feature id for the '<em><b>Unchecked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE__UNCHECKED = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Method Permission Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 48;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MultiplicityTypeImpl <em>Multiplicity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MultiplicityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMultiplicityType()
	 * @generated
	 */
	int MULTIPLICITY_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PersistenceTypeTypeImpl <em>Persistence Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PersistenceTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getPersistenceTypeType()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE = 50;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimKeyClassTypeImpl <em>Prim Key Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimKeyClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getPrimKeyClassType()
	 * @generated
	 */
	int PRIM_KEY_CLASS_TYPE = 51;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimkeyFieldTypeImpl <em>Primkey Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimkeyFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getPrimkeyFieldType()
	 * @generated
	 */
	int PRIMKEY_FIELD_TYPE = 52;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryMethodTypeImpl <em>Query Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryMethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getQueryMethodType()
	 * @generated
	 */
	int QUERY_METHOD_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD_TYPE__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD_TYPE__METHOD_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Query Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Query Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__QUERY_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Result Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__RESULT_TYPE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Ejb Ql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__EJB_QL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ReentrantTypeImpl <em>Reentrant Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ReentrantTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getReentrantType()
	 * @generated
	 */
	int REENTRANT_TYPE = 55;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipRoleSourceTypeImpl <em>Relationship Role Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipRoleSourceTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRelationshipRoleSourceType()
	 * @generated
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE__EJB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Relationship Role Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipsTypeImpl <em>Relationships Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRelationshipsType()
	 * @generated
	 */
	int RELATIONSHIPS_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_TYPE__EJB_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Relationships Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 58;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 59;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefNameTypeImpl <em>Resource Env Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceEnvRefNameType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_NAME_TYPE = 60;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceEnvRefType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE = 61;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeTypeImpl <em>Resource Env Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceEnvRefTypeType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE_TYPE = 62;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 63;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResRefNameType()
	 * @generated
	 */
	int RES_REF_NAME_TYPE = 64;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResSharingScopeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResSharingScopeType()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE = 65;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResTypeType()
	 * @generated
	 */
	int RES_TYPE_TYPE = 66;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResultTypeMappingTypeImpl <em>Result Type Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResultTypeMappingTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResultTypeMappingType()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_MAPPING_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_MAPPING_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Result Type Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_MAPPING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRoleLinkType()
	 * @generated
	 */
	int ROLE_LINK_TYPE = 68;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 69;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RunAsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRunAsType()
	 * @generated
	 */
	int RUN_AS_TYPE = 70;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityIdentityTypeImpl <em>Security Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityIdentityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSecurityIdentityType()
	 * @generated
	 */
	int SECURITY_IDENTITY_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Use Caller Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY = 1;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__RUN_AS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Security Identity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 72;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 73;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl <em>Session Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSessionType()
	 * @generated
	 */
	int SESSION_TYPE = 74;

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
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__LOCAL_HOME = 7;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__LOCAL = 8;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__EJB_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__SESSION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__TRANSACTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__ENV_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__EJB_REF = 13;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__EJB_LOCAL_REF = 14;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__SECURITY_ROLE_REF = 15;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__SECURITY_IDENTITY = 16;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__RESOURCE_REF = 17;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__RESOURCE_ENV_REF = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE__ID = 19;

	/**
	 * The number of structural features of the '<em>Session Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeTypeImpl <em>Session Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSessionTypeType()
	 * @generated
	 */
	int SESSION_TYPE_TYPE = 75;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SmallIconTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSmallIconType()
	 * @generated
	 */
	int SMALL_ICON_TYPE = 76;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SubscriptionDurabilityTypeImpl <em>Subscription Durability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SubscriptionDurabilityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSubscriptionDurabilityType()
	 * @generated
	 */
	int SUBSCRIPTION_DURABILITY_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_DURABILITY_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_DURABILITY_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Subscription Durability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_DURABILITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransactionTypeTypeImpl <em>Transaction Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransactionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getTransactionTypeType()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE = 78;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransAttributeTypeImpl <em>Trans Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransAttributeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getTransAttributeType()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE = 79;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UncheckedTypeImpl <em>Unchecked Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UncheckedTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getUncheckedType()
	 * @generated
	 */
	int UNCHECKED_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCHECKED_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Unchecked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCHECKED_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UseCallerIdentityTypeImpl <em>Use Caller Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UseCallerIdentityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getUseCallerIdentityType()
	 * @generated
	 */
	int USE_CALLER_IDENTITY_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CALLER_IDENTITY_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Use Caller Identity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CALLER_IDENTITY_TYPE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType <em>Abstract Schema Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Schema Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType
	 * @generated
	 */
	EClass getAbstractSchemaNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType#getMixed()
	 * @see #getAbstractSchemaNameType()
	 * @generated
	 */
	EAttribute getAbstractSchemaNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType#getId()
	 * @see #getAbstractSchemaNameType()
	 * @generated
	 */
	EAttribute getAbstractSchemaNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType <em>Acknowledge Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acknowledge Mode Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType
	 * @generated
	 */
	EClass getAcknowledgeModeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType#getMixed()
	 * @see #getAcknowledgeModeType()
	 * @generated
	 */
	EAttribute getAcknowledgeModeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType#getId()
	 * @see #getAcknowledgeModeType()
	 * @generated
	 */
	EAttribute getAcknowledgeModeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType <em>Assembly Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Descriptor Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType
	 * @generated
	 */
	EClass getAssemblyDescriptorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getSecurityRole()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getMethodPermission <em>Method Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Permission</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getMethodPermission()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_MethodPermission();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getContainerTransaction <em>Container Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Transaction</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getContainerTransaction()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ContainerTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getExcludeList <em>Exclude List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude List</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getExcludeList()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ExcludeList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getId()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EAttribute getAssemblyDescriptorType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType <em>Cascade Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade Delete Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType
	 * @generated
	 */
	EClass getCascadeDeleteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType#getId()
	 * @see #getCascadeDeleteType()
	 * @generated
	 */
	EAttribute getCascadeDeleteType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType <em>Cmp Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType
	 * @generated
	 */
	EClass getCmpFieldType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType#getDescription()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType#getFieldName()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType#getId()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EAttribute getCmpFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType <em>Cmp Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Version Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType
	 * @generated
	 */
	EClass getCmpVersionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType#getMixed()
	 * @see #getCmpVersionType()
	 * @generated
	 */
	EAttribute getCmpVersionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType#getId()
	 * @see #getCmpVersionType()
	 * @generated
	 */
	EAttribute getCmpVersionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType <em>Cmr Field Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmr Field Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType
	 * @generated
	 */
	EClass getCmrFieldNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType#getMixed()
	 * @see #getCmrFieldNameType()
	 * @generated
	 */
	EAttribute getCmrFieldNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType#getId()
	 * @see #getCmrFieldNameType()
	 * @generated
	 */
	EAttribute getCmrFieldNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType
	 * @generated
	 */
	EClass getCmrFieldType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getDescription()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getCmrFieldName <em>Cmr Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getCmrFieldName()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_CmrFieldName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getCmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getCmrFieldType()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_CmrFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType#getId()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EAttribute getCmrFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType <em>Cmr Field Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmr Field Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType
	 * @generated
	 */
	EClass getCmrFieldTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType#getMixed()
	 * @see #getCmrFieldTypeType()
	 * @generated
	 */
	EAttribute getCmrFieldTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType#getId()
	 * @see #getCmrFieldTypeType()
	 * @generated
	 */
	EAttribute getCmrFieldTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType <em>Container Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType
	 * @generated
	 */
	EClass getContainerTransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getDescription()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getMethod()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getTransAttribute <em>Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trans Attribute</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getTransAttribute()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_TransAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getId()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EAttribute getContainerTransactionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType#getId()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType <em>Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType
	 * @generated
	 */
	EClass getDestinationTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType#getMixed()
	 * @see #getDestinationTypeType()
	 * @generated
	 */
	EAttribute getDestinationTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType#getId()
	 * @see #getDestinationTypeType()
	 * @generated
	 */
	EAttribute getDestinationTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType#getMixed()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType#getId()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAbstractSchemaName <em>Abstract Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Schema Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAbstractSchemaName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractSchemaName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAcknowledgeMode <em>Acknowledge Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acknowledge Mode</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAcknowledgeMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AcknowledgeMode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAssemblyDescriptor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssemblyDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCascadeDelete <em>Cascade Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Delete</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCascadeDelete()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CascadeDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpField <em>Cmp Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmp Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CmpField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpVersion <em>Cmp Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmp Version</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CmpVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrField <em>Cmr Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CmrField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldName <em>Cmr Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CmrFieldName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CmrFieldType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getContainerTransaction <em>Container Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Transaction</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getContainerTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContainerTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDestinationType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDisplayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClientJar <em>Ejb Client Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Client Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClientJar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbClientJar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbJar <em>Ejb Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbJar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbJar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLocalRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbQl <em>Ejb Ql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ql</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbQl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbQl();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelation <em>Ejb Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relation</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationName <em>Ejb Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relation Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRelationName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRole <em>Ejb Relationship Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRelationshipRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRoleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbRelationshipRoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enterprise Beans</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnterpriseBeans()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnterpriseBeans();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getExcludeList <em>Exclude List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude List</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getExcludeList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExcludeList();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getFieldName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FieldName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getHome()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLargeIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocalHome()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDriven <em>Message Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Driven</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDriven()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageDriven();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDrivenDestination <em>Message Driven Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Driven Destination</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDrivenDestination()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageDrivenDestination();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageSelector <em>Message Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Selector</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageSelector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageSelector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodIntf <em>Method Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Intf</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodIntf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodIntf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParam <em>Method Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParams()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodPermission <em>Method Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Permission</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodPermission()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodPermission();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMultiplicity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPersistenceType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PersistenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimKeyClass <em>Prim Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prim Key Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimKeyClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrimKeyClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimkeyField <em>Primkey Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primkey Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimkeyField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrimkeyField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Query();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQueryMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_QueryMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reentrant</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getReentrant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reentrant();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationshipRoleSource <em>Relationship Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Role Source</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationshipRoleSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelationshipRoleSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationships</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationships()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Relationships();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRemote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResAuth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResRefName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResSharingScope <em>Res Sharing Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResSharingScope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResSharingScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResultTypeMapping <em>Result Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Type Mapping</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResultTypeMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResultTypeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRunAs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RunAs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityIdentity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRoleRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSession()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Session();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSessionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSmallIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSubscriptionDurability <em>Subscription Durability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscription Durability</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSubscriptionDurability()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubscriptionDurability();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransactionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransAttribute <em>Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trans Attribute</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUnchecked <em>Unchecked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchecked</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUnchecked()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Unchecked();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUseCallerIdentity <em>Use Caller Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Caller Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUseCallerIdentity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UseCallerIdentity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType <em>Ejb Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType
	 * @generated
	 */
	EClass getEjbClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType#getMixed()
	 * @see #getEjbClassType()
	 * @generated
	 */
	EAttribute getEjbClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType#getId()
	 * @see #getEjbClassType()
	 * @generated
	 */
	EAttribute getEjbClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType <em>Ejb Client Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Client Jar Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType
	 * @generated
	 */
	EClass getEjbClientJarType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType#getMixed()
	 * @see #getEjbClientJarType()
	 * @generated
	 */
	EAttribute getEjbClientJarType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType#getId()
	 * @see #getEjbClientJarType()
	 * @generated
	 */
	EAttribute getEjbClientJarType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType <em>Ejb Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Jar Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType
	 * @generated
	 */
	EClass getEjbJarType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getDescription()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getDisplayName()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getSmallIcon()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getLargeIcon()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enterprise Beans</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getEnterpriseBeans()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EnterpriseBeans();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationships</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getRelationships()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Relationships();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getAssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getAssemblyDescriptor()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_AssemblyDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getEjbClientJar <em>Ejb Client Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Client Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getEjbClientJar()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EjbClientJar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType#getId()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EAttribute getEjbJarType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType#getMixed()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType#getId()
	 * @see #getEjbLinkType()
	 * @generated
	 */
	EAttribute getEjbLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Local Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType
	 * @generated
	 */
	EClass getEjbLocalRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getDescription()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getEjbRefName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getEjbRefType()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getLocalHome()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getLocal()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getEjbLink()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType#getId()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EAttribute getEjbLocalRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType <em>Ejb Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType
	 * @generated
	 */
	EClass getEjbNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType#getMixed()
	 * @see #getEjbNameType()
	 * @generated
	 */
	EAttribute getEjbNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType#getId()
	 * @see #getEjbNameType()
	 * @generated
	 */
	EAttribute getEjbNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType <em>Ejb Ql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ql Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType
	 * @generated
	 */
	EClass getEjbQlType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType#getMixed()
	 * @see #getEjbQlType()
	 * @generated
	 */
	EAttribute getEjbQlType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType#getId()
	 * @see #getEjbQlType()
	 * @generated
	 */
	EAttribute getEjbQlType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType#getMixed()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType#getId()
	 * @see #getEjbRefNameType()
	 * @generated
	 */
	EAttribute getEjbRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType#getMixed()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType#getId()
	 * @see #getEjbRefTypeType()
	 * @generated
	 */
	EAttribute getEjbRefTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType <em>Ejb Relation Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relation Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType
	 * @generated
	 */
	EClass getEjbRelationNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType#getMixed()
	 * @see #getEjbRelationNameType()
	 * @generated
	 */
	EAttribute getEjbRelationNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType#getId()
	 * @see #getEjbRelationNameType()
	 * @generated
	 */
	EAttribute getEjbRelationNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType <em>Ejb Relationship Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relationship Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType
	 * @generated
	 */
	EClass getEjbRelationshipRoleNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType#getMixed()
	 * @see #getEjbRelationshipRoleNameType()
	 * @generated
	 */
	EAttribute getEjbRelationshipRoleNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType#getId()
	 * @see #getEjbRelationshipRoleNameType()
	 * @generated
	 */
	EAttribute getEjbRelationshipRoleNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType <em>Ejb Relationship Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relationship Role Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType
	 * @generated
	 */
	EClass getEjbRelationshipRoleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getDescription()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getEjbRelationshipRoleName()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_EjbRelationshipRoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getMultiplicity()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCascadeDelete <em>Cascade Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Delete</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCascadeDelete()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_CascadeDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getRelationshipRoleSource <em>Relationship Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Role Source</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getRelationshipRoleSource()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_RelationshipRoleSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCmrField <em>Cmr Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCmrField()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_CmrField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getId()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EAttribute getEjbRelationshipRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType <em>Ejb Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relation Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType
	 * @generated
	 */
	EClass getEjbRelationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getDescription()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationName <em>Ejb Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relation Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationName()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole <em>Ejb Relationship Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationshipRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role1</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole1()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationshipRole1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getId()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EAttribute getEjbRelationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType <em>Enterprise Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Beans Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType
	 * @generated
	 */
	EClass getEnterpriseBeansType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getGroup()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getSession()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Session();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getEntity()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getMessageDriven <em>Message Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Driven</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getMessageDriven()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_MessageDriven();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType#getId()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getDescription()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getDisplayName()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getSmallIcon()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getLargeIcon()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbName()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getHome()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getRemote()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getLocalHome()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getLocal()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbClass()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getPersistenceType()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PersistenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getPrimKeyClass <em>Prim Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prim Key Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getPrimKeyClass()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PrimKeyClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reentrant</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getReentrant()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Reentrant();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getCmpVersion <em>Cmp Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmp Version</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getCmpVersion()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_CmpVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getAbstractSchemaName <em>Abstract Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Schema Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getAbstractSchemaName()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_AbstractSchemaName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getCmpField <em>Cmp Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmp Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getCmpField()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_CmpField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getPrimkeyField <em>Primkey Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primkey Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getPrimkeyField()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_PrimkeyField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEnvEntry()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getEjbLocalRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getSecurityRoleRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getSecurityIdentity()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SecurityIdentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getResourceRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getResourceEnvRef()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getQuery()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType#getId()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType <em>Env Entry Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType
	 * @generated
	 */
	EClass getEnvEntryNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType#getMixed()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType#getId()
	 * @see #getEnvEntryNameType()
	 * @generated
	 */
	EAttribute getEnvEntryNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType <em>Env Entry Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType
	 * @generated
	 */
	EClass getEnvEntryTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType#getMixed()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType#getId()
	 * @see #getEnvEntryTypeType()
	 * @generated
	 */
	EAttribute getEnvEntryTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType <em>Env Entry Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Value Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType
	 * @generated
	 */
	EClass getEnvEntryValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType#getMixed()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType#getId()
	 * @see #getEnvEntryValueType()
	 * @generated
	 */
	EAttribute getEnvEntryValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType <em>Exclude List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude List Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType
	 * @generated
	 */
	EClass getExcludeListType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType#getDescription()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EReference getExcludeListType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType#getMethod()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EReference getExcludeListType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType#getId()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EAttribute getExcludeListType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType <em>Field Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType
	 * @generated
	 */
	EClass getFieldNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType#getMixed()
	 * @see #getFieldNameType()
	 * @generated
	 */
	EAttribute getFieldNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType#getId()
	 * @see #getFieldNameType()
	 * @generated
	 */
	EAttribute getFieldNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType#getMixed()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType#getId()
	 * @see #getHomeType()
	 * @generated
	 */
	EAttribute getHomeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType <em>Large Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType
	 * @generated
	 */
	EClass getLargeIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType#getMixed()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType#getId()
	 * @see #getLargeIconType()
	 * @generated
	 */
	EAttribute getLargeIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Home Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType
	 * @generated
	 */
	EClass getLocalHomeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType#getMixed()
	 * @see #getLocalHomeType()
	 * @generated
	 */
	EAttribute getLocalHomeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType#getId()
	 * @see #getLocalHomeType()
	 * @generated
	 */
	EAttribute getLocalHomeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType
	 * @generated
	 */
	EClass getLocalType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType#getMixed()
	 * @see #getLocalType()
	 * @generated
	 */
	EAttribute getLocalType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType#getId()
	 * @see #getLocalType()
	 * @generated
	 */
	EAttribute getLocalType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType <em>Message Driven Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Driven Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType
	 * @generated
	 */
	EClass getMessageDrivenDestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getDestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getDestinationType()
	 * @see #getMessageDrivenDestinationType()
	 * @generated
	 */
	EReference getMessageDrivenDestinationType_DestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getSubscriptionDurability <em>Subscription Durability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscription Durability</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getSubscriptionDurability()
	 * @see #getMessageDrivenDestinationType()
	 * @generated
	 */
	EReference getMessageDrivenDestinationType_SubscriptionDurability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getId()
	 * @see #getMessageDrivenDestinationType()
	 * @generated
	 */
	EAttribute getMessageDrivenDestinationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType <em>Message Driven Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Driven Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType
	 * @generated
	 */
	EClass getMessageDrivenType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDescription()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDisplayName()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSmallIcon()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getLargeIcon()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbName()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbClass()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getTransactionType()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_TransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageSelector <em>Message Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Selector</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageSelector()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_MessageSelector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getAcknowledgeMode <em>Acknowledge Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acknowledge Mode</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getAcknowledgeMode()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_AcknowledgeMode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageDrivenDestination <em>Message Driven Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Driven Destination</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageDrivenDestination()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_MessageDrivenDestination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEnvEntry()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbRef()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbLocalRef()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSecurityIdentity()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_SecurityIdentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getResourceRef()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getResourceEnvRef()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EReference getMessageDrivenType_ResourceEnvRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getId()
	 * @see #getMessageDrivenType()
	 * @generated
	 */
	EAttribute getMessageDrivenType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType <em>Message Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Selector Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType
	 * @generated
	 */
	EClass getMessageSelectorType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType#getMixed()
	 * @see #getMessageSelectorType()
	 * @generated
	 */
	EAttribute getMessageSelectorType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType#getId()
	 * @see #getMessageSelectorType()
	 * @generated
	 */
	EAttribute getMessageSelectorType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType <em>Method Intf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Intf Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType
	 * @generated
	 */
	EClass getMethodIntfType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType#getMixed()
	 * @see #getMethodIntfType()
	 * @generated
	 */
	EAttribute getMethodIntfType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType#getId()
	 * @see #getMethodIntfType()
	 * @generated
	 */
	EAttribute getMethodIntfType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType <em>Method Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType
	 * @generated
	 */
	EClass getMethodNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType#getMixed()
	 * @see #getMethodNameType()
	 * @generated
	 */
	EAttribute getMethodNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType#getId()
	 * @see #getMethodNameType()
	 * @generated
	 */
	EAttribute getMethodNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType <em>Method Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Params Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType
	 * @generated
	 */
	EClass getMethodParamsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType#getMethodParam <em>Method Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType#getMethodParam()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EReference getMethodParamsType_MethodParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType#getId()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EAttribute getMethodParamsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType <em>Method Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Param Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType
	 * @generated
	 */
	EClass getMethodParamType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType#getMixed()
	 * @see #getMethodParamType()
	 * @generated
	 */
	EAttribute getMethodParamType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType#getId()
	 * @see #getMethodParamType()
	 * @generated
	 */
	EAttribute getMethodParamType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType <em>Method Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Permission Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType
	 * @generated
	 */
	EClass getMethodPermissionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getDescription()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getRoleName()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getUnchecked <em>Unchecked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchecked</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getUnchecked()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Unchecked();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getMethod()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType#getId()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EAttribute getMethodPermissionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getDescription()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getEjbName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getMethodIntf <em>Method Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Intf</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getMethodIntf()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodIntf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getMethodName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getMethodParams()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType#getId()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType
	 * @generated
	 */
	EClass getMultiplicityType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType#getMixed()
	 * @see #getMultiplicityType()
	 * @generated
	 */
	EAttribute getMultiplicityType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType#getId()
	 * @see #getMultiplicityType()
	 * @generated
	 */
	EAttribute getMultiplicityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType <em>Persistence Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType
	 * @generated
	 */
	EClass getPersistenceTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType#getMixed()
	 * @see #getPersistenceTypeType()
	 * @generated
	 */
	EAttribute getPersistenceTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType#getId()
	 * @see #getPersistenceTypeType()
	 * @generated
	 */
	EAttribute getPersistenceTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType <em>Prim Key Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prim Key Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType
	 * @generated
	 */
	EClass getPrimKeyClassType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType#getMixed()
	 * @see #getPrimKeyClassType()
	 * @generated
	 */
	EAttribute getPrimKeyClassType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType#getId()
	 * @see #getPrimKeyClassType()
	 * @generated
	 */
	EAttribute getPrimKeyClassType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType <em>Primkey Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primkey Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType
	 * @generated
	 */
	EClass getPrimkeyFieldType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType#getMixed()
	 * @see #getPrimkeyFieldType()
	 * @generated
	 */
	EAttribute getPrimkeyFieldType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType#getId()
	 * @see #getPrimkeyFieldType()
	 * @generated
	 */
	EAttribute getPrimkeyFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType <em>Query Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType
	 * @generated
	 */
	EClass getQueryMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType#getMethodName()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EReference getQueryMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType#getMethodParams()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EReference getQueryMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType#getId()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EAttribute getQueryMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType
	 * @generated
	 */
	EClass getQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getDescription()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getQueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getQueryMethod()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_QueryMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getResultTypeMapping <em>Result Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Type Mapping</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getResultTypeMapping()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_ResultTypeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getEjbQl <em>Ejb Ql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ql</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getEjbQl()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_EjbQl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType#getId()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType <em>Reentrant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reentrant Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType
	 * @generated
	 */
	EClass getReentrantType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType#getMixed()
	 * @see #getReentrantType()
	 * @generated
	 */
	EAttribute getReentrantType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType#getId()
	 * @see #getReentrantType()
	 * @generated
	 */
	EAttribute getReentrantType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType <em>Relationship Role Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Role Source Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType
	 * @generated
	 */
	EClass getRelationshipRoleSourceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType#getDescription()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EReference getRelationshipRoleSourceType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType#getEjbName()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EReference getRelationshipRoleSourceType_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType#getId()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EAttribute getRelationshipRoleSourceType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType <em>Relationships Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType
	 * @generated
	 */
	EClass getRelationshipsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType#getDescription()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EReference getRelationshipsType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType#getEjbRelation <em>Ejb Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Relation</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType#getEjbRelation()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EReference getRelationshipsType_EjbRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType#getId()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EAttribute getRelationshipsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType#getMixed()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType#getId()
	 * @see #getRemoteType()
	 * @generated
	 */
	EAttribute getRemoteType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType#getMixed()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType#getId()
	 * @see #getResAuthType()
	 * @generated
	 */
	EAttribute getResAuthType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType <em>Resource Env Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType
	 * @generated
	 */
	EClass getResourceEnvRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType#getMixed()
	 * @see #getResourceEnvRefNameType()
	 * @generated
	 */
	EAttribute getResourceEnvRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType#getId()
	 * @see #getResourceEnvRefNameType()
	 * @generated
	 */
	EAttribute getResourceEnvRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType
	 * @generated
	 */
	EClass getResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getDescription()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getResourceEnvRefName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getResourceEnvRefType()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType#getId()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EAttribute getResourceEnvRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType <em>Resource Env Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType
	 * @generated
	 */
	EClass getResourceEnvRefTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType#getMixed()
	 * @see #getResourceEnvRefTypeType()
	 * @generated
	 */
	EAttribute getResourceEnvRefTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType#getId()
	 * @see #getResourceEnvRefTypeType()
	 * @generated
	 */
	EAttribute getResourceEnvRefTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getResSharingScope()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResSharingScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType <em>Res Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType
	 * @generated
	 */
	EClass getResRefNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType#getMixed()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType#getId()
	 * @see #getResRefNameType()
	 * @generated
	 */
	EAttribute getResRefNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Sharing Scope Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType
	 * @generated
	 */
	EClass getResSharingScopeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType#getMixed()
	 * @see #getResSharingScopeType()
	 * @generated
	 */
	EAttribute getResSharingScopeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType#getId()
	 * @see #getResSharingScopeType()
	 * @generated
	 */
	EAttribute getResSharingScopeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType <em>Res Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType
	 * @generated
	 */
	EClass getResTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType#getMixed()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType#getId()
	 * @see #getResTypeType()
	 * @generated
	 */
	EAttribute getResTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType <em>Result Type Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType
	 * @generated
	 */
	EClass getResultTypeMappingType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType#getMixed()
	 * @see #getResultTypeMappingType()
	 * @generated
	 */
	EAttribute getResultTypeMappingType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType#getId()
	 * @see #getResultTypeMappingType()
	 * @generated
	 */
	EAttribute getResultTypeMappingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType <em>Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType
	 * @generated
	 */
	EClass getRoleLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType#getMixed()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType#getId()
	 * @see #getRoleLinkType()
	 * @generated
	 */
	EAttribute getRoleLinkType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType#getMixed()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType#getId()
	 * @see #getRoleNameType()
	 * @generated
	 */
	EAttribute getRoleNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run As Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType
	 * @generated
	 */
	EClass getRunAsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType#getDescription()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType#getRoleName()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType#getId()
	 * @see #getRunAsType()
	 * @generated
	 */
	EAttribute getRunAsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType <em>Security Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Identity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType
	 * @generated
	 */
	EClass getSecurityIdentityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getDescription()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getUseCallerIdentity <em>Use Caller Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Caller Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getUseCallerIdentity()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_UseCallerIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getRunAs()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_RunAs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType#getId()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EAttribute getSecurityIdentityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType
	 * @generated
	 */
	EClass getSessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDescription()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDisplayName()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSmallIcon()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLargeIcon()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_LargeIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbName()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getHome()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getRemote()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocalHome()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocal()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbClass()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSessionType()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_SessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getTransactionType()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_TransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEnvEntry()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbLocalRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSecurityRoleRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSecurityIdentity()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_SecurityIdentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getResourceRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getResourceEnvRef()
	 * @see #getSessionType()
	 * @generated
	 */
	EReference getSessionType_ResourceEnvRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getId()
	 * @see #getSessionType()
	 * @generated
	 */
	EAttribute getSessionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType <em>Session Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType
	 * @generated
	 */
	EClass getSessionTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType#getMixed()
	 * @see #getSessionTypeType()
	 * @generated
	 */
	EAttribute getSessionTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType#getId()
	 * @see #getSessionTypeType()
	 * @generated
	 */
	EAttribute getSessionTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType <em>Small Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType
	 * @generated
	 */
	EClass getSmallIconType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType#getMixed()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType#getId()
	 * @see #getSmallIconType()
	 * @generated
	 */
	EAttribute getSmallIconType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType <em>Subscription Durability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription Durability Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType
	 * @generated
	 */
	EClass getSubscriptionDurabilityType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType#getMixed()
	 * @see #getSubscriptionDurabilityType()
	 * @generated
	 */
	EAttribute getSubscriptionDurabilityType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType#getId()
	 * @see #getSubscriptionDurabilityType()
	 * @generated
	 */
	EAttribute getSubscriptionDurabilityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType
	 * @generated
	 */
	EClass getTransactionTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType#getMixed()
	 * @see #getTransactionTypeType()
	 * @generated
	 */
	EAttribute getTransactionTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType#getId()
	 * @see #getTransactionTypeType()
	 * @generated
	 */
	EAttribute getTransactionTypeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType <em>Trans Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trans Attribute Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType
	 * @generated
	 */
	EClass getTransAttributeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType#getMixed()
	 * @see #getTransAttributeType()
	 * @generated
	 */
	EAttribute getTransAttributeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType#getId()
	 * @see #getTransAttributeType()
	 * @generated
	 */
	EAttribute getTransAttributeType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.UncheckedType <em>Unchecked Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unchecked Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.UncheckedType
	 * @generated
	 */
	EClass getUncheckedType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.UncheckedType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.UncheckedType#getId()
	 * @see #getUncheckedType()
	 * @generated
	 */
	EAttribute getUncheckedType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.UseCallerIdentityType <em>Use Caller Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Caller Identity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.UseCallerIdentityType
	 * @generated
	 */
	EClass getUseCallerIdentityType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.UseCallerIdentityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.UseCallerIdentityType#getId()
	 * @see #getUseCallerIdentityType()
	 * @generated
	 */
	EAttribute getUseCallerIdentityType_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjbJar20Factory getEjbJar20Factory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AbstractSchemaNameTypeImpl <em>Abstract Schema Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AbstractSchemaNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getAbstractSchemaNameType()
		 * @generated
		 */
		EClass ABSTRACT_SCHEMA_NAME_TYPE = eINSTANCE.getAbstractSchemaNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SCHEMA_NAME_TYPE__MIXED = eINSTANCE.getAbstractSchemaNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SCHEMA_NAME_TYPE__ID = eINSTANCE.getAbstractSchemaNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AcknowledgeModeTypeImpl <em>Acknowledge Mode Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AcknowledgeModeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getAcknowledgeModeType()
		 * @generated
		 */
		EClass ACKNOWLEDGE_MODE_TYPE = eINSTANCE.getAcknowledgeModeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACKNOWLEDGE_MODE_TYPE__MIXED = eINSTANCE.getAcknowledgeModeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACKNOWLEDGE_MODE_TYPE__ID = eINSTANCE.getAcknowledgeModeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AssemblyDescriptorTypeImpl <em>Assembly Descriptor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.AssemblyDescriptorTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getAssemblyDescriptorType()
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
		 * The meta object literal for the '<em><b>Exclude List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST = eINSTANCE.getAssemblyDescriptorType_ExcludeList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_DESCRIPTOR_TYPE__ID = eINSTANCE.getAssemblyDescriptorType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CascadeDeleteTypeImpl <em>Cascade Delete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CascadeDeleteTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCascadeDeleteType()
		 * @generated
		 */
		EClass CASCADE_DELETE_TYPE = eINSTANCE.getCascadeDeleteType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_DELETE_TYPE__ID = eINSTANCE.getCascadeDeleteType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpFieldTypeImpl <em>Cmp Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpFieldTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmpFieldType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpVersionTypeImpl <em>Cmp Version Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmpVersionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmpVersionType()
		 * @generated
		 */
		EClass CMP_VERSION_TYPE = eINSTANCE.getCmpVersionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_VERSION_TYPE__MIXED = eINSTANCE.getCmpVersionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_VERSION_TYPE__ID = eINSTANCE.getCmpVersionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldNameTypeImpl <em>Cmr Field Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmrFieldNameType()
		 * @generated
		 */
		EClass CMR_FIELD_NAME_TYPE = eINSTANCE.getCmrFieldNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD_NAME_TYPE__MIXED = eINSTANCE.getCmrFieldNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD_NAME_TYPE__ID = eINSTANCE.getCmrFieldNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeImpl <em>Cmr Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmrFieldType()
		 * @generated
		 */
		EClass CMR_FIELD_TYPE = eINSTANCE.getCmrFieldType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMR_FIELD_TYPE__DESCRIPTION = eINSTANCE.getCmrFieldType_Description();

		/**
		 * The meta object literal for the '<em><b>Cmr Field Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMR_FIELD_TYPE__CMR_FIELD_NAME = eINSTANCE.getCmrFieldType_CmrFieldName();

		/**
		 * The meta object literal for the '<em><b>Cmr Field Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMR_FIELD_TYPE__CMR_FIELD_TYPE = eINSTANCE.getCmrFieldType_CmrFieldType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD_TYPE__ID = eINSTANCE.getCmrFieldType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeTypeImpl <em>Cmr Field Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.CmrFieldTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getCmrFieldTypeType()
		 * @generated
		 */
		EClass CMR_FIELD_TYPE_TYPE = eINSTANCE.getCmrFieldTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD_TYPE_TYPE__MIXED = eINSTANCE.getCmrFieldTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD_TYPE_TYPE__ID = eINSTANCE.getCmrFieldTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ContainerTransactionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getContainerTransactionType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DescriptionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDescriptionType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DestinationTypeTypeImpl <em>Destination Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DestinationTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDestinationTypeType()
		 * @generated
		 */
		EClass DESTINATION_TYPE_TYPE = eINSTANCE.getDestinationTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATION_TYPE_TYPE__MIXED = eINSTANCE.getDestinationTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATION_TYPE_TYPE__ID = eINSTANCE.getDestinationTypeType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DisplayNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDisplayNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Abstract Schema Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME = eINSTANCE.getDocumentRoot_AbstractSchemaName();

		/**
		 * The meta object literal for the '<em><b>Acknowledge Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACKNOWLEDGE_MODE = eINSTANCE.getDocumentRoot_AcknowledgeMode();

		/**
		 * The meta object literal for the '<em><b>Assembly Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR = eINSTANCE.getDocumentRoot_AssemblyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Cascade Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CASCADE_DELETE = eINSTANCE.getDocumentRoot_CascadeDelete();

		/**
		 * The meta object literal for the '<em><b>Cmp Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CMP_FIELD = eINSTANCE.getDocumentRoot_CmpField();

		/**
		 * The meta object literal for the '<em><b>Cmp Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CMP_VERSION = eINSTANCE.getDocumentRoot_CmpVersion();

		/**
		 * The meta object literal for the '<em><b>Cmr Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CMR_FIELD = eINSTANCE.getDocumentRoot_CmrField();

		/**
		 * The meta object literal for the '<em><b>Cmr Field Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CMR_FIELD_NAME = eINSTANCE.getDocumentRoot_CmrFieldName();

		/**
		 * The meta object literal for the '<em><b>Cmr Field Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CMR_FIELD_TYPE = eINSTANCE.getDocumentRoot_CmrFieldType();

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
		 * The meta object literal for the '<em><b>Destination Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESTINATION_TYPE = eINSTANCE.getDocumentRoot_DestinationType();

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
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_LOCAL_REF = eINSTANCE.getDocumentRoot_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_NAME = eINSTANCE.getDocumentRoot_EjbName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_QL = eINSTANCE.getDocumentRoot_EjbQl();

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
		 * The meta object literal for the '<em><b>Ejb Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_RELATION = eINSTANCE.getDocumentRoot_EjbRelation();

		/**
		 * The meta object literal for the '<em><b>Ejb Relation Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_RELATION_NAME = eINSTANCE.getDocumentRoot_EjbRelationName();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE = eINSTANCE.getDocumentRoot_EjbRelationshipRole();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME = eINSTANCE.getDocumentRoot_EjbRelationshipRoleName();

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
		 * The meta object literal for the '<em><b>Exclude List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCLUDE_LIST = eINSTANCE.getDocumentRoot_ExcludeList();

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
		 * The meta object literal for the '<em><b>Message Driven</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_DRIVEN = eINSTANCE.getDocumentRoot_MessageDriven();

		/**
		 * The meta object literal for the '<em><b>Message Driven Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION = eINSTANCE.getDocumentRoot_MessageDrivenDestination();

		/**
		 * The meta object literal for the '<em><b>Message Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_SELECTOR = eINSTANCE.getDocumentRoot_MessageSelector();

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
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MULTIPLICITY = eINSTANCE.getDocumentRoot_Multiplicity();

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
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY = eINSTANCE.getDocumentRoot_Query();

		/**
		 * The meta object literal for the '<em><b>Query Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY_METHOD = eINSTANCE.getDocumentRoot_QueryMethod();

		/**
		 * The meta object literal for the '<em><b>Reentrant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REENTRANT = eINSTANCE.getDocumentRoot_Reentrant();

		/**
		 * The meta object literal for the '<em><b>Relationship Role Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE = eINSTANCE.getDocumentRoot_RelationshipRoleSource();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATIONSHIPS = eINSTANCE.getDocumentRoot_Relationships();

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
		 * The meta object literal for the '<em><b>Result Type Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESULT_TYPE_MAPPING = eINSTANCE.getDocumentRoot_ResultTypeMapping();

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
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECURITY_IDENTITY = eINSTANCE.getDocumentRoot_SecurityIdentity();

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
		 * The meta object literal for the '<em><b>Subscription Durability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY = eINSTANCE.getDocumentRoot_SubscriptionDurability();

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
		 * The meta object literal for the '<em><b>Unchecked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNCHECKED = eINSTANCE.getDocumentRoot_Unchecked();

		/**
		 * The meta object literal for the '<em><b>Use Caller Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE_CALLER_IDENTITY = eINSTANCE.getDocumentRoot_UseCallerIdentity();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClassTypeImpl <em>Ejb Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClassTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbClassType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClientJarTypeImpl <em>Ejb Client Jar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbClientJarTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbClientJarType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl <em>Ejb Jar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJarTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbJarType()
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
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__RELATIONSHIPS = eINSTANCE.getEjbJarType_Relationships();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLinkTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbLinkType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbLocalRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbLocalRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbNameTypeImpl <em>Ejb Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbQlTypeImpl <em>Ejb Ql Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbQlTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbQlType()
		 * @generated
		 */
		EClass EJB_QL_TYPE = eINSTANCE.getEjbQlType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_QL_TYPE__MIXED = eINSTANCE.getEjbQlType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_QL_TYPE__ID = eINSTANCE.getEjbQlType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRefNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRefTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationNameTypeImpl <em>Ejb Relation Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationNameType()
		 * @generated
		 */
		EClass EJB_RELATION_NAME_TYPE = eINSTANCE.getEjbRelationNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATION_NAME_TYPE__MIXED = eINSTANCE.getEjbRelationNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATION_NAME_TYPE__ID = eINSTANCE.getEjbRelationNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleNameTypeImpl <em>Ejb Relationship Role Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationshipRoleNameType()
		 * @generated
		 */
		EClass EJB_RELATIONSHIP_ROLE_NAME_TYPE = eINSTANCE.getEjbRelationshipRoleNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATIONSHIP_ROLE_NAME_TYPE__MIXED = eINSTANCE.getEjbRelationshipRoleNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATIONSHIP_ROLE_NAME_TYPE__ID = eINSTANCE.getEjbRelationshipRoleNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl <em>Ejb Relationship Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationshipRoleType()
		 * @generated
		 */
		EClass EJB_RELATIONSHIP_ROLE_TYPE = eINSTANCE.getEjbRelationshipRoleType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION = eINSTANCE.getEjbRelationshipRoleType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME = eINSTANCE.getEjbRelationshipRoleType_EjbRelationshipRoleName();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY = eINSTANCE.getEjbRelationshipRoleType_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Cascade Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE = eINSTANCE.getEjbRelationshipRoleType_CascadeDelete();

		/**
		 * The meta object literal for the '<em><b>Relationship Role Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE = eINSTANCE.getEjbRelationshipRoleType_RelationshipRoleSource();

		/**
		 * The meta object literal for the '<em><b>Cmr Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD = eINSTANCE.getEjbRelationshipRoleType_CmrField();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATIONSHIP_ROLE_TYPE__ID = eINSTANCE.getEjbRelationshipRoleType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationTypeImpl <em>Ejb Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEjbRelationType()
		 * @generated
		 */
		EClass EJB_RELATION_TYPE = eINSTANCE.getEjbRelationType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATION_TYPE__DESCRIPTION = eINSTANCE.getEjbRelationType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Relation Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATION_TYPE__EJB_RELATION_NAME = eINSTANCE.getEjbRelationType_EjbRelationName();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE = eINSTANCE.getEjbRelationType_EjbRelationshipRole();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1 = eINSTANCE.getEjbRelationType_EjbRelationshipRole1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATION_TYPE__ID = eINSTANCE.getEjbRelationType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl <em>Enterprise Beans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnterpriseBeansType()
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
		 * The meta object literal for the '<em><b>Message Driven</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN = eINSTANCE.getEnterpriseBeansType_MessageDriven();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_BEANS_TYPE__ID = eINSTANCE.getEnterpriseBeansType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EntityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEntityType()
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
		 * The meta object literal for the '<em><b>Local Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__LOCAL_HOME = eINSTANCE.getEntityType_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__LOCAL = eINSTANCE.getEntityType_Local();

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
		 * The meta object literal for the '<em><b>Cmp Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__CMP_VERSION = eINSTANCE.getEntityType_CmpVersion();

		/**
		 * The meta object literal for the '<em><b>Abstract Schema Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__ABSTRACT_SCHEMA_NAME = eINSTANCE.getEntityType_AbstractSchemaName();

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
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__EJB_LOCAL_REF = eINSTANCE.getEntityType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SECURITY_ROLE_REF = eINSTANCE.getEntityType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SECURITY_IDENTITY = eINSTANCE.getEntityType_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RESOURCE_REF = eINSTANCE.getEntityType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RESOURCE_ENV_REF = eINSTANCE.getEntityType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__QUERY = eINSTANCE.getEntityType_Query();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__ID = eINSTANCE.getEntityType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryNameTypeImpl <em>Env Entry Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeTypeImpl <em>Env Entry Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryValueTypeImpl <em>Env Entry Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnvEntryValueTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getEnvEntryValueType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ExcludeListTypeImpl <em>Exclude List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ExcludeListTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getExcludeListType()
		 * @generated
		 */
		EClass EXCLUDE_LIST_TYPE = eINSTANCE.getExcludeListType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_LIST_TYPE__DESCRIPTION = eINSTANCE.getExcludeListType_Description();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_LIST_TYPE__METHOD = eINSTANCE.getExcludeListType_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_LIST_TYPE__ID = eINSTANCE.getExcludeListType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.FieldNameTypeImpl <em>Field Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.FieldNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getFieldNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.HomeTypeImpl <em>Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.HomeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getHomeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LargeIconTypeImpl <em>Large Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LargeIconTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getLargeIconType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalHomeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getLocalHomeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalTypeImpl <em>Local Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.LocalTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getLocalType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenDestinationTypeImpl <em>Message Driven Destination Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenDestinationTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMessageDrivenDestinationType()
		 * @generated
		 */
		EClass MESSAGE_DRIVEN_DESTINATION_TYPE = eINSTANCE.getMessageDrivenDestinationType();

		/**
		 * The meta object literal for the '<em><b>Destination Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE = eINSTANCE.getMessageDrivenDestinationType_DestinationType();

		/**
		 * The meta object literal for the '<em><b>Subscription Durability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY = eINSTANCE.getMessageDrivenDestinationType_SubscriptionDurability();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_DESTINATION_TYPE__ID = eINSTANCE.getMessageDrivenDestinationType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl <em>Message Driven Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMessageDrivenType()
		 * @generated
		 */
		EClass MESSAGE_DRIVEN_TYPE = eINSTANCE.getMessageDrivenType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__DESCRIPTION = eINSTANCE.getMessageDrivenType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__DISPLAY_NAME = eINSTANCE.getMessageDrivenType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__SMALL_ICON = eINSTANCE.getMessageDrivenType_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__LARGE_ICON = eINSTANCE.getMessageDrivenType_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__EJB_NAME = eINSTANCE.getMessageDrivenType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__EJB_CLASS = eINSTANCE.getMessageDrivenType_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE = eINSTANCE.getMessageDrivenType_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Message Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR = eINSTANCE.getMessageDrivenType_MessageSelector();

		/**
		 * The meta object literal for the '<em><b>Acknowledge Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE = eINSTANCE.getMessageDrivenType_AcknowledgeMode();

		/**
		 * The meta object literal for the '<em><b>Message Driven Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION = eINSTANCE.getMessageDrivenType_MessageDrivenDestination();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__ENV_ENTRY = eINSTANCE.getMessageDrivenType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__EJB_REF = eINSTANCE.getMessageDrivenType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF = eINSTANCE.getMessageDrivenType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY = eINSTANCE.getMessageDrivenType_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__RESOURCE_REF = eINSTANCE.getMessageDrivenType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF = eINSTANCE.getMessageDrivenType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_TYPE__ID = eINSTANCE.getMessageDrivenType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageSelectorTypeImpl <em>Message Selector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageSelectorTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMessageSelectorType()
		 * @generated
		 */
		EClass MESSAGE_SELECTOR_TYPE = eINSTANCE.getMessageSelectorType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_SELECTOR_TYPE__MIXED = eINSTANCE.getMessageSelectorType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_SELECTOR_TYPE__ID = eINSTANCE.getMessageSelectorType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodIntfTypeImpl <em>Method Intf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodIntfTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodIntfType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodNameTypeImpl <em>Method Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamsTypeImpl <em>Method Params Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamsTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodParamsType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamTypeImpl <em>Method Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodParamTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodParamType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodPermissionTypeImpl <em>Method Permission Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodPermissionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodPermissionType()
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
		 * The meta object literal for the '<em><b>Unchecked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PERMISSION_TYPE__UNCHECKED = eINSTANCE.getMethodPermissionType_Unchecked();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl <em>Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMethodType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MultiplicityTypeImpl <em>Multiplicity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MultiplicityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getMultiplicityType()
		 * @generated
		 */
		EClass MULTIPLICITY_TYPE = eINSTANCE.getMultiplicityType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_TYPE__MIXED = eINSTANCE.getMultiplicityType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_TYPE__ID = eINSTANCE.getMultiplicityType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PersistenceTypeTypeImpl <em>Persistence Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PersistenceTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getPersistenceTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimKeyClassTypeImpl <em>Prim Key Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimKeyClassTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getPrimKeyClassType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimkeyFieldTypeImpl <em>Primkey Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.PrimkeyFieldTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getPrimkeyFieldType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryMethodTypeImpl <em>Query Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryMethodTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getQueryMethodType()
		 * @generated
		 */
		EClass QUERY_METHOD_TYPE = eINSTANCE.getQueryMethodType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_METHOD_TYPE__METHOD_NAME = eINSTANCE.getQueryMethodType_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_METHOD_TYPE__METHOD_PARAMS = eINSTANCE.getQueryMethodType_MethodParams();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_METHOD_TYPE__ID = eINSTANCE.getQueryMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryTypeImpl <em>Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.QueryTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getQueryType()
		 * @generated
		 */
		EClass QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__DESCRIPTION = eINSTANCE.getQueryType_Description();

		/**
		 * The meta object literal for the '<em><b>Query Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__QUERY_METHOD = eINSTANCE.getQueryType_QueryMethod();

		/**
		 * The meta object literal for the '<em><b>Result Type Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__RESULT_TYPE_MAPPING = eINSTANCE.getQueryType_ResultTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Ejb Ql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__EJB_QL = eINSTANCE.getQueryType_EjbQl();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__ID = eINSTANCE.getQueryType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ReentrantTypeImpl <em>Reentrant Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ReentrantTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getReentrantType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipRoleSourceTypeImpl <em>Relationship Role Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipRoleSourceTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRelationshipRoleSourceType()
		 * @generated
		 */
		EClass RELATIONSHIP_ROLE_SOURCE_TYPE = eINSTANCE.getRelationshipRoleSourceType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ROLE_SOURCE_TYPE__DESCRIPTION = eINSTANCE.getRelationshipRoleSourceType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ROLE_SOURCE_TYPE__EJB_NAME = eINSTANCE.getRelationshipRoleSourceType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ROLE_SOURCE_TYPE__ID = eINSTANCE.getRelationshipRoleSourceType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipsTypeImpl <em>Relationships Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RelationshipsTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRelationshipsType()
		 * @generated
		 */
		EClass RELATIONSHIPS_TYPE = eINSTANCE.getRelationshipsType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_TYPE__DESCRIPTION = eINSTANCE.getRelationshipsType_Description();

		/**
		 * The meta object literal for the '<em><b>Ejb Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_TYPE__EJB_RELATION = eINSTANCE.getRelationshipsType_EjbRelation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPS_TYPE__ID = eINSTANCE.getRelationshipsType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RemoteTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRemoteType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResAuthTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResAuthType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefNameTypeImpl <em>Resource Env Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceEnvRefNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceEnvRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeTypeImpl <em>Resource Env Ref Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceEnvRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceEnvRefTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResourceRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResourceRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResRefNameTypeImpl <em>Res Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResRefNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResSharingScopeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResSharingScopeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResTypeTypeImpl <em>Res Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResultTypeMappingTypeImpl <em>Result Type Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.ResultTypeMappingTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getResultTypeMappingType()
		 * @generated
		 */
		EClass RESULT_TYPE_MAPPING_TYPE = eINSTANCE.getResultTypeMappingType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TYPE_MAPPING_TYPE__MIXED = eINSTANCE.getResultTypeMappingType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TYPE_MAPPING_TYPE__ID = eINSTANCE.getResultTypeMappingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleLinkTypeImpl <em>Role Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleLinkTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRoleLinkType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RoleNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRoleNameType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.RunAsTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getRunAsType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityIdentityTypeImpl <em>Security Identity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityIdentityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSecurityIdentityType()
		 * @generated
		 */
		EClass SECURITY_IDENTITY_TYPE = eINSTANCE.getSecurityIdentityType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_IDENTITY_TYPE__DESCRIPTION = eINSTANCE.getSecurityIdentityType_Description();

		/**
		 * The meta object literal for the '<em><b>Use Caller Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY = eINSTANCE.getSecurityIdentityType_UseCallerIdentity();

		/**
		 * The meta object literal for the '<em><b>Run As</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_IDENTITY_TYPE__RUN_AS = eINSTANCE.getSecurityIdentityType_RunAs();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_IDENTITY_TYPE__ID = eINSTANCE.getSecurityIdentityType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSecurityRoleRefType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSecurityRoleType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl <em>Session Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSessionType()
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
		 * The meta object literal for the '<em><b>Local Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__LOCAL_HOME = eINSTANCE.getSessionType_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__LOCAL = eINSTANCE.getSessionType_Local();

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
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__EJB_LOCAL_REF = eINSTANCE.getSessionType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__SECURITY_ROLE_REF = eINSTANCE.getSessionType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__SECURITY_IDENTITY = eINSTANCE.getSessionType_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__RESOURCE_REF = eINSTANCE.getSessionType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_TYPE__RESOURCE_ENV_REF = eINSTANCE.getSessionType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_TYPE__ID = eINSTANCE.getSessionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeTypeImpl <em>Session Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSessionTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SmallIconTypeImpl <em>Small Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SmallIconTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSmallIconType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SubscriptionDurabilityTypeImpl <em>Subscription Durability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SubscriptionDurabilityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getSubscriptionDurabilityType()
		 * @generated
		 */
		EClass SUBSCRIPTION_DURABILITY_TYPE = eINSTANCE.getSubscriptionDurabilityType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_DURABILITY_TYPE__MIXED = eINSTANCE.getSubscriptionDurabilityType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_DURABILITY_TYPE__ID = eINSTANCE.getSubscriptionDurabilityType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransactionTypeTypeImpl <em>Transaction Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransactionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getTransactionTypeType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransAttributeTypeImpl <em>Trans Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.TransAttributeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getTransAttributeType()
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

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UncheckedTypeImpl <em>Unchecked Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UncheckedTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getUncheckedType()
		 * @generated
		 */
		EClass UNCHECKED_TYPE = eINSTANCE.getUncheckedType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCHECKED_TYPE__ID = eINSTANCE.getUncheckedType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UseCallerIdentityTypeImpl <em>Use Caller Identity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.UseCallerIdentityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbJar20PackageImpl#getUseCallerIdentityType()
		 * @generated
		 */
		EClass USE_CALLER_IDENTITY_TYPE = eINSTANCE.getUseCallerIdentityType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CALLER_IDENTITY_TYPE__ID = eINSTANCE.getUseCallerIdentityType_Id();

	}

} //EjbJar20Package
