/**
 * Copyright (c) 2010, 2019 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar21;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Factory
 * @model kind="package"
 * @generated
 */
public interface EjbJar21Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EjbJar21"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/ejb-jar_2_1.xsd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EjbJar21"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbJar21Package eINSTANCE = org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigPropertyTypeImpl <em>Activation Config Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigPropertyTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getActivationConfigPropertyType()
	 * @generated
	 */
	int ACTIVATION_CONFIG_PROPERTY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Activation Config Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Activation Config Property Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Activation Config Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigTypeImpl <em>Activation Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getActivationConfigType()
	 * @generated
	 */
	int ACTIVATION_CONFIG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Activation Config Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_TYPE__ACTIVATION_CONFIG_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Activation Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.AssemblyDescriptorTypeImpl <em>Assembly Descriptor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.AssemblyDescriptorTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getAssemblyDescriptorType()
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
	 * The feature id for the '<em><b>Message Destination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Assembly Descriptor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpFieldTypeImpl <em>Cmp Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpFieldType()
	 * @generated
	 */
	int CMP_FIELD_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.StringImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getString()
	 * @generated
	 */
	int STRING = 72;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ID = 1;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpVersionTypeImpl <em>Cmp Version Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpVersionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpVersionType()
	 * @generated
	 */
	int CMP_VERSION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_VERSION_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_VERSION_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Cmp Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_VERSION_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeImpl <em>Cmr Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldType()
	 * @generated
	 */
	int CMR_FIELD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeTypeImpl <em>Cmr Field Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldTypeType()
	 * @generated
	 */
	int CMR_FIELD_TYPE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Cmr Field Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getContainerTransactionType()
	 * @generated
	 */
	int CONTAINER_TRANSACTION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdStringTypeImpl <em>Xsd String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdStringTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdStringType()
	 * @generated
	 */
	int XSD_STRING_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_STRING_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_STRING_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_STRING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__VALUE = XSD_STRING_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__ID = XSD_STRING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__LANG = XSD_STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = XSD_STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDisplayNameType()
	 * @generated
	 */
	int DISPLAY_NAME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE__LANG = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

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
	 * The feature id for the '<em><b>Ejb Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_JAR = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.FullyQualifiedClassTypeImpl <em>Fully Qualified Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.FullyQualifiedClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getFullyQualifiedClassType()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_QUALIFIED_CLASS_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_QUALIFIED_CLASS_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Fully Qualified Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbClassTypeImpl <em>Ejb Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbClassType()
	 * @generated
	 */
	int EJB_CLASS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLASS_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLASS_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Ejb Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_CLASS_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJarTypeImpl <em>Ejb Jar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJarTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbJarType()
	 * @generated
	 */
	int EJB_JAR_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Enterprise Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__ENTERPRISE_BEANS = 3;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__RELATIONSHIPS = 4;

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
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__VERSION = 8;

	/**
	 * The number of structural features of the '<em>Ejb Jar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbLinkType()
	 * @generated
	 */
	int EJB_LINK_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Ejb Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LINK_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLocalRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbLocalRefType()
	 * @generated
	 */
	int EJB_LOCAL_REF_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNMTOKENTypeImpl <em>Xsd NMTOKEN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNMTOKENTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdNMTOKENType()
	 * @generated
	 */
	int XSD_NMTOKEN_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NMTOKEN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NMTOKEN_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd NMTOKEN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NMTOKEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbNameTypeImpl <em>Ejb Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbNameType()
	 * @generated
	 */
	int EJB_NAME_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_NAME_TYPE__VALUE = XSD_NMTOKEN_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_NAME_TYPE__ID = XSD_NMTOKEN_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Ejb Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_NAME_TYPE_FEATURE_COUNT = XSD_NMTOKEN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JndiNameTypeImpl <em>Jndi Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JndiNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJndiNameType()
	 * @generated
	 */
	int JNDI_NAME_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_NAME_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_NAME_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Jndi Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_NAME_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE__VALUE = JNDI_NAME_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE__ID = JNDI_NAME_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Ejb Ref Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_NAME_TYPE_FEATURE_COUNT = JNDI_NAME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Ejb Ref Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationshipRoleTypeImpl <em>Ejb Relationship Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationshipRoleTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRelationshipRoleType()
	 * @generated
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationTypeImpl <em>Ejb Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRelationType()
	 * @generated
	 */
	int EJB_RELATION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EmptyTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnterpriseBeansTypeImpl <em>Enterprise Beans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnterpriseBeansTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnterpriseBeansType()
	 * @generated
	 */
	int ENTERPRISE_BEANS_TYPE = 22;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EntityBeanTypeImpl <em>Entity Bean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EntityBeanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEntityBeanType()
	 * @generated
	 */
	int ENTITY_BEAN_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__EJB_NAME = 3;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__HOME = 4;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__REMOTE = 5;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__LOCAL_HOME = 6;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__LOCAL = 7;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__EJB_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PERSISTENCE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Prim Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PRIM_KEY_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__REENTRANT = 11;

	/**
	 * The feature id for the '<em><b>Cmp Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__CMP_VERSION = 12;

	/**
	 * The feature id for the '<em><b>Abstract Schema Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME = 13;

	/**
	 * The feature id for the '<em><b>Cmp Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__CMP_FIELD = 14;

	/**
	 * The feature id for the '<em><b>Primkey Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PRIMKEY_FIELD = 15;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__ENV_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__EJB_REF = 17;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__EJB_LOCAL_REF = 18;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__SERVICE_REF = 19;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__RESOURCE_REF = 20;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__RESOURCE_ENV_REF = 21;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF = 22;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__SECURITY_ROLE_REF = 23;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__SECURITY_IDENTITY = 24;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__QUERY = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__ID = 26;

	/**
	 * The number of structural features of the '<em>Entity Bean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE_FEATURE_COUNT = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeValuesTypeImpl <em>Env Entry Type Values Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeValuesTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryTypeValuesType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Env Entry Type Values Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ExcludeListTypeImpl <em>Exclude List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ExcludeListTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getExcludeListType()
	 * @generated
	 */
	int EXCLUDE_LIST_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.GenericBooleanTypeImpl <em>Generic Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.GenericBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getGenericBooleanType()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BOOLEAN_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BOOLEAN_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Generic Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BOOLEAN_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Home Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.IconTypeImpl <em>Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.IconTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 30;

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
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__LANG = 3;

	/**
	 * The number of structural features of the '<em>Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaIdentifierTypeImpl <em>Java Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaIdentifierTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaIdentifierType()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IDENTIFIER_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IDENTIFIER_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Java Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IDENTIFIER_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaTypeTypeImpl <em>Java Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaTypeType()
	 * @generated
	 */
	int JAVA_TYPE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Java Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ListenerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getListenerType()
	 * @generated
	 */
	int LISTENER_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Listener Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__LISTENER_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Listener Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalHomeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalHomeType()
	 * @generated
	 */
	int LOCAL_HOME_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Local Home Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HOME_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalTypeImpl <em>Local Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalType()
	 * @generated
	 */
	int LOCAL_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Local Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationLinkTypeImpl <em>Message Destination Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationLinkType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_LINK_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationRefTypeImpl <em>Message Destination Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationRefType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_REF_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Message Destination Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Message Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Message Destination Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE = 3;

	/**
	 * The feature id for the '<em><b>Message Destination Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeImpl <em>Message Destination Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Message Destination Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Message Destination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeTypeImpl <em>Message Destination Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationTypeType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationUsageTypeImpl <em>Message Destination Usage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationUsageTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationUsageType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDrivenBeanTypeImpl <em>Message Driven Bean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDrivenBeanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDrivenBeanType()
	 * @generated
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME = 3;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Messaging Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Message Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Message Destination Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK = 8;

	/**
	 * The feature id for the '<em><b>Activation Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG = 9;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF = 11;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF = 12;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF = 13;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF = 14;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF = 15;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF = 16;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__ID = 18;

	/**
	 * The number of structural features of the '<em>Message Driven Bean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodIntfTypeImpl <em>Method Intf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodIntfTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodIntfType()
	 * @generated
	 */
	int METHOD_INTF_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INTF_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INTF_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Method Intf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INTF_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodNameTypeImpl <em>Method Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodNameType()
	 * @generated
	 */
	int METHOD_NAME_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Method Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodParamsTypeImpl <em>Method Params Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodParamsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodParamsType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodPermissionTypeImpl <em>Method Permission Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodPermissionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodPermissionType()
	 * @generated
	 */
	int METHOD_PERMISSION_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MultiplicityTypeImpl <em>Multiplicity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MultiplicityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMultiplicityType()
	 * @generated
	 */
	int MULTIPLICITY_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Multiplicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ParamValueTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getParamValueType()
	 * @generated
	 */
	int PARAM_VALUE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__PARAM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__PARAM_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Param Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PathTypeImpl <em>Path Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PathTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPathType()
	 * @generated
	 */
	int PATH_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Path Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PersistenceTypeTypeImpl <em>Persistence Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PersistenceTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPersistenceTypeType()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Persistence Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PortComponentRefTypeImpl <em>Port Component Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PortComponentRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPortComponentRefType()
	 * @generated
	 */
	int PORT_COMPONENT_REF_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Service Endpoint Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Port Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Port Component Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryMethodTypeImpl <em>Query Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryMethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getQueryMethodType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getQueryType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipRoleSourceTypeImpl <em>Relationship Role Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipRoleSourceTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRelationshipRoleSourceType()
	 * @generated
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipsTypeImpl <em>Relationships Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRelationshipsType()
	 * @generated
	 */
	int RELATIONSHIPS_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE__VALUE = FULLY_QUALIFIED_CLASS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE__ID = FULLY_QUALIFIED_CLASS_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Remote Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TYPE_FEATURE_COUNT = FULLY_QUALIFIED_CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Res Auth Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_AUTH_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceEnvRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResourceEnvRefType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResSharingScopeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResSharingScopeType()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Res Sharing Scope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_SHARING_SCOPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResultTypeMappingTypeImpl <em>Result Type Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResultTypeMappingTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResultTypeMappingType()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_MAPPING_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_MAPPING_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Result Type Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_MAPPING_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Role Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RunAsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRunAsType()
	 * @generated
	 */
	int RUN_AS_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityIdentityTypeImpl <em>Security Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityIdentityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSecurityIdentityType()
	 * @generated
	 */
	int SECURITY_IDENTITY_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefHandlerTypeImpl <em>Service Ref Handler Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefHandlerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getServiceRefHandlerType()
	 * @generated
	 */
	int SERVICE_REF_HANDLER_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Handler Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__HANDLER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Handler Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__INIT_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Soap Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__SOAP_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Soap Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__SOAP_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__PORT_NAME = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE__ID = 9;

	/**
	 * The number of structural features of the '<em>Service Ref Handler Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefTypeImpl <em>Service Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getServiceRefType()
	 * @generated
	 */
	int SERVICE_REF_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Service Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_REF_NAME = 3;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__WSDL_FILE = 5;

	/**
	 * The feature id for the '<em><b>Jaxrpc Mapping File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE = 6;

	/**
	 * The feature id for the '<em><b>Service Qname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_QNAME = 7;

	/**
	 * The feature id for the '<em><b>Port Component Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__PORT_COMPONENT_REF = 8;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__HANDLER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__ID = 10;

	/**
	 * The number of structural features of the '<em>Service Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionBeanTypeImpl <em>Session Bean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionBeanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionBeanType()
	 * @generated
	 */
	int SESSION_BEAN_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__EJB_NAME = 3;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__HOME = 4;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__REMOTE = 5;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__LOCAL_HOME = 6;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__LOCAL = 7;

	/**
	 * The feature id for the '<em><b>Service Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SERVICE_ENDPOINT = 8;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__EJB_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SESSION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__TRANSACTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__ENV_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__EJB_REF = 13;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__EJB_LOCAL_REF = 14;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SERVICE_REF = 15;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__RESOURCE_REF = 16;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__RESOURCE_ENV_REF = 17;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF = 18;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SECURITY_ROLE_REF = 19;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SECURITY_IDENTITY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__ID = 21;

	/**
	 * The number of structural features of the '<em>Session Bean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionTypeTypeImpl <em>Session Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionTypeType()
	 * @generated
	 */
	int SESSION_TYPE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Session Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransactionTypeTypeImpl <em>Transaction Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransactionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransactionTypeType()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Transaction Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransAttributeTypeImpl <em>Trans Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransAttributeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransAttributeType()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_ATTRIBUTE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_ATTRIBUTE_TYPE__ID = STRING__ID;

	/**
	 * The number of structural features of the '<em>Trans Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_ATTRIBUTE_TYPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdBooleanTypeImpl <em>Xsd Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdBooleanType()
	 * @generated
	 */
	int XSD_BOOLEAN_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOOLEAN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOOLEAN_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOOLEAN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TrueFalseTypeImpl <em>True False Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TrueFalseTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTrueFalseType()
	 * @generated
	 */
	int TRUE_FALSE_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_TYPE__VALUE = XSD_BOOLEAN_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_TYPE__ID = XSD_BOOLEAN_TYPE__ID;

	/**
	 * The number of structural features of the '<em>True False Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_TYPE_FEATURE_COUNT = XSD_BOOLEAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.UrlPatternTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getUrlPatternType()
	 * @generated
	 */
	int URL_PATTERN_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Url Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdAnyURITypeImpl <em>Xsd Any URI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdAnyURITypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdAnyURIType()
	 * @generated
	 */
	int XSD_ANY_URI_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANY_URI_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANY_URI_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Any URI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANY_URI_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdIntegerTypeImpl <em>Xsd Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdIntegerType()
	 * @generated
	 */
	int XSD_INTEGER_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INTEGER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNonNegativeIntegerTypeImpl <em>Xsd Non Negative Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNonNegativeIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdNonNegativeIntegerType()
	 * @generated
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdPositiveIntegerTypeImpl <em>Xsd Positive Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdPositiveIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdPositiveIntegerType()
	 * @generated
	 */
	int XSD_POSITIVE_INTEGER_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_POSITIVE_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_POSITIVE_INTEGER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd Positive Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_POSITIVE_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdQNameTypeImpl <em>Xsd QName Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdQNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdQNameType()
	 * @generated
	 */
	int XSD_QNAME_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_QNAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_QNAME_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Xsd QName Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_QNAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase <em>Cmp Version Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpVersionTypeBase()
	 * @generated
	 */
	int CMP_VERSION_TYPE_BASE = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase <em>Cmr Field Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldTypeTypeBase()
	 * @generated
	 */
	int CMR_FIELD_TYPE_TYPE_BASE = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefTypeTypeBase()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryTypeValuesTypeBase()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_BASE = 88;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getGenericBooleanTypeBase()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE = 89;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationUsageTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE = 90;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase <em>Method Intf Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodIntfTypeBase()
	 * @generated
	 */
	int METHOD_INTF_TYPE_BASE = 91;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase <em>Multiplicity Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMultiplicityTypeBase()
	 * @generated
	 */
	int MULTIPLICITY_TYPE_BASE = 92;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase <em>Persistence Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPersistenceTypeTypeBase()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE_BASE = 93;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase <em>Res Auth Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResAuthTypeBase()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE = 94;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResSharingScopeTypeBase()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE = 95;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase <em>Result Type Mapping Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResultTypeMappingTypeBase()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE_BASE = 96;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase <em>Session Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionTypeTypeBase()
	 * @generated
	 */
	int SESSION_TYPE_TYPE_BASE = 97;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase <em>Transaction Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransactionTypeTypeBase()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE_BASE = 98;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase <em>Trans Attribute Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransAttributeTypeBase()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE_BASE = 99;

	/**
	 * The meta object id for the '<em>Cmp Version Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpVersionTypeBaseObject()
	 * @generated
	 */
	int CMP_VERSION_TYPE_BASE_OBJECT = 100;

	/**
	 * The meta object id for the '<em>Cmr Field Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldTypeTypeBaseObject()
	 * @generated
	 */
	int CMR_FIELD_TYPE_TYPE_BASE_OBJECT = 101;

	/**
	 * The meta object id for the '<em>Dewey Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDeweyVersionType()
	 * @generated
	 */
	int DEWEY_VERSION_TYPE = 102;

	/**
	 * The meta object id for the '<em>Ejb Class Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbClassTypeBase()
	 * @generated
	 */
	int EJB_CLASS_TYPE_BASE = 103;

	/**
	 * The meta object id for the '<em>Ejb Link Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbLinkTypeBase()
	 * @generated
	 */
	int EJB_LINK_TYPE_BASE = 104;

	/**
	 * The meta object id for the '<em>Ejb Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbNameTypeBase()
	 * @generated
	 */
	int EJB_NAME_TYPE_BASE = 105;

	/**
	 * The meta object id for the '<em>Ejb Ref Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefNameTypeBase()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE_BASE = 106;

	/**
	 * The meta object id for the '<em>Ejb Ref Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefTypeTypeBaseObject()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE_OBJECT = 107;

	/**
	 * The meta object id for the '<em>Env Entry Type Values Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryTypeValuesTypeBaseObject()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT = 108;

	/**
	 * The meta object id for the '<em>Fully Qualified Class Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getFullyQualifiedClassTypeBase()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE_BASE = 109;

	/**
	 * The meta object id for the '<em>Generic Boolean Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getGenericBooleanTypeBaseObject()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE_OBJECT = 110;

	/**
	 * The meta object id for the '<em>Home Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getHomeTypeBase()
	 * @generated
	 */
	int HOME_TYPE_BASE = 111;

	/**
	 * The meta object id for the '<em>Java Identifier Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaIdentifierTypeBase()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE_BASE = 112;

	/**
	 * The meta object id for the '<em>Java Type Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaTypeTypeBase()
	 * @generated
	 */
	int JAVA_TYPE_TYPE_BASE = 113;

	/**
	 * The meta object id for the '<em>Jndi Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJndiNameTypeBase()
	 * @generated
	 */
	int JNDI_NAME_TYPE_BASE = 114;

	/**
	 * The meta object id for the '<em>Local Home Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalHomeTypeBase()
	 * @generated
	 */
	int LOCAL_HOME_TYPE_BASE = 115;

	/**
	 * The meta object id for the '<em>Local Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalTypeBase()
	 * @generated
	 */
	int LOCAL_TYPE_BASE = 116;

	/**
	 * The meta object id for the '<em>Message Destination Link Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationLinkTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE_BASE = 117;

	/**
	 * The meta object id for the '<em>Message Destination Type Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationTypeTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE_BASE = 118;

	/**
	 * The meta object id for the '<em>Message Destination Usage Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationUsageTypeBaseObject()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Method Intf Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodIntfTypeBaseObject()
	 * @generated
	 */
	int METHOD_INTF_TYPE_BASE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Method Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodNameTypeBase()
	 * @generated
	 */
	int METHOD_NAME_TYPE_BASE = 121;

	/**
	 * The meta object id for the '<em>Multiplicity Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMultiplicityTypeBaseObject()
	 * @generated
	 */
	int MULTIPLICITY_TYPE_BASE_OBJECT = 122;

	/**
	 * The meta object id for the '<em>Path Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPathTypeBase()
	 * @generated
	 */
	int PATH_TYPE_BASE = 123;

	/**
	 * The meta object id for the '<em>Persistence Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPersistenceTypeTypeBaseObject()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE_BASE_OBJECT = 124;

	/**
	 * The meta object id for the '<em>Remote Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRemoteTypeBase()
	 * @generated
	 */
	int REMOTE_TYPE_BASE = 125;

	/**
	 * The meta object id for the '<em>Res Auth Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResAuthTypeBaseObject()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Res Sharing Scope Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResSharingScopeTypeBaseObject()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE_OBJECT = 127;

	/**
	 * The meta object id for the '<em>Result Type Mapping Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResultTypeMappingTypeBaseObject()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT = 128;

	/**
	 * The meta object id for the '<em>Role Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRoleNameTypeBase()
	 * @generated
	 */
	int ROLE_NAME_TYPE_BASE = 129;

	/**
	 * The meta object id for the '<em>Session Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionTypeTypeBaseObject()
	 * @generated
	 */
	int SESSION_TYPE_TYPE_BASE_OBJECT = 130;

	/**
	 * The meta object id for the '<em>Transaction Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransactionTypeTypeBaseObject()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE_BASE_OBJECT = 131;

	/**
	 * The meta object id for the '<em>Trans Attribute Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransAttributeTypeBaseObject()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE_BASE_OBJECT = 132;

	/**
	 * The meta object id for the '<em>True False Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTrueFalseTypeBase()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE = 133;

	/**
	 * The meta object id for the '<em>True False Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTrueFalseTypeBaseObject()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE_OBJECT = 134;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType <em>Activation Config Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Config Property Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType
	 * @generated
	 */
	EClass getActivationConfigPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType#getActivationConfigPropertyName <em>Activation Config Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Config Property Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType#getActivationConfigPropertyName()
	 * @see #getActivationConfigPropertyType()
	 * @generated
	 */
	EReference getActivationConfigPropertyType_ActivationConfigPropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType#getActivationConfigPropertyValue <em>Activation Config Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Config Property Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType#getActivationConfigPropertyValue()
	 * @see #getActivationConfigPropertyType()
	 * @generated
	 */
	EReference getActivationConfigPropertyType_ActivationConfigPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType#getId()
	 * @see #getActivationConfigPropertyType()
	 * @generated
	 */
	EAttribute getActivationConfigPropertyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType <em>Activation Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Config Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType
	 * @generated
	 */
	EClass getActivationConfigType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType#getDescription()
	 * @see #getActivationConfigType()
	 * @generated
	 */
	EReference getActivationConfigType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType#getActivationConfigProperty <em>Activation Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Config Property</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType#getActivationConfigProperty()
	 * @see #getActivationConfigType()
	 * @generated
	 */
	EReference getActivationConfigType_ActivationConfigProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigType#getId()
	 * @see #getActivationConfigType()
	 * @generated
	 */
	EAttribute getActivationConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType <em>Assembly Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Descriptor Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType
	 * @generated
	 */
	EClass getAssemblyDescriptorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getSecurityRole()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getMethodPermission <em>Method Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Permission</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getMethodPermission()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_MethodPermission();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getContainerTransaction <em>Container Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Transaction</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getContainerTransaction()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ContainerTransaction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getMessageDestination <em>Message Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getMessageDestination()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_MessageDestination();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getExcludeList <em>Exclude List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude List</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getExcludeList()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ExcludeList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.AssemblyDescriptorType#getId()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EAttribute getAssemblyDescriptorType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType <em>Cmp Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType
	 * @generated
	 */
	EClass getCmpFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType#getDescription()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType#getFieldName()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpFieldType#getId()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EAttribute getCmpFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionType <em>Cmp Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Version Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionType
	 * @generated
	 */
	EClass getCmpVersionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType
	 * @generated
	 */
	EClass getCmrFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getDescription()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldName <em>Cmr Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldName()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_CmrFieldName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldType()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_CmrFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getId()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EAttribute getCmrFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeType <em>Cmr Field Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmr Field Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeType
	 * @generated
	 */
	EClass getCmrFieldTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType <em>Container Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType
	 * @generated
	 */
	EClass getContainerTransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getDescription()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getMethod()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getTransAttribute <em>Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trans Attribute</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getTransAttribute()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_TransAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType#getId()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EAttribute getContainerTransactionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType#getLang()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DisplayNameType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DisplayNameType#getLang()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getEjbJar <em>Ejb Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot#getEjbJar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbJar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbClassType <em>Ejb Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbClassType
	 * @generated
	 */
	EClass getEjbClassType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType <em>Ejb Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Jar Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType
	 * @generated
	 */
	EClass getEjbJarType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getDescription()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getDisplayName()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getIcon()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enterprise Beans</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getEnterpriseBeans()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EnterpriseBeans();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationships</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getRelationships()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Relationships();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getAssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getAssemblyDescriptor()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_AssemblyDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getEjbClientJar <em>Ejb Client Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Client Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getEjbClientJar()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EjbClientJar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getId()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EAttribute getEjbJarType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType#getVersion()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EAttribute getEjbJarType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Local Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType
	 * @generated
	 */
	EClass getEjbLocalRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getDescription()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getEjbRefName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getEjbRefType()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getLocalHome()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getLocal()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getEjbLink()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbLocalRefType#getId()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EAttribute getEjbLocalRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbNameType <em>Ejb Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbNameType
	 * @generated
	 */
	EClass getEjbNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType <em>Ejb Relationship Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relationship Role Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType
	 * @generated
	 */
	EClass getEjbRelationshipRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getDescription()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getEjbRelationshipRoleName()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_EjbRelationshipRoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getMultiplicity()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getCascadeDelete <em>Cascade Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Delete</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getCascadeDelete()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_CascadeDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getRelationshipRoleSource <em>Relationship Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Role Source</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getRelationshipRoleSource()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_RelationshipRoleSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getCmrField <em>Cmr Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getCmrField()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_CmrField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationshipRoleType#getId()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EAttribute getEjbRelationshipRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType <em>Ejb Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relation Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType
	 * @generated
	 */
	EClass getEjbRelationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getDescription()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getEjbRelationName <em>Ejb Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relation Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getEjbRelationName()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getEjbRelationshipRole <em>Ejb Relationship Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getEjbRelationshipRole()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationshipRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role1</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getEjbRelationshipRole1()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationshipRole1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRelationType#getId()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EAttribute getEjbRelationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EmptyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EmptyType#getId()
	 * @see #getEmptyType()
	 * @generated
	 */
	EAttribute getEmptyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType <em>Enterprise Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Beans Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType
	 * @generated
	 */
	EClass getEnterpriseBeansType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getGroup()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getSession()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Session();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getEntity()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getMessageDriven <em>Message Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Driven</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getMessageDriven()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_MessageDriven();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType#getId()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType <em>Entity Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Bean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType
	 * @generated
	 */
	EClass getEntityBeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getDescription()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getDisplayName()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getIcon()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbName()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getHome()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getRemote()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getLocalHome()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getLocal()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbClass()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getPersistenceType()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PersistenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getPrimKeyClass <em>Prim Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prim Key Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getPrimKeyClass()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PrimKeyClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reentrant</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getReentrant()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Reentrant();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getCmpVersion <em>Cmp Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmp Version</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getCmpVersion()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_CmpVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getAbstractSchemaName <em>Abstract Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Schema Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getAbstractSchemaName()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_AbstractSchemaName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getCmpField <em>Cmp Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmp Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getCmpField()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_CmpField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getPrimkeyField <em>Primkey Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primkey Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getPrimkeyField()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PrimkeyField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEnvEntry()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getEjbLocalRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getServiceRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getResourceRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getResourceEnvRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getMessageDestinationRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getSecurityRoleRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getSecurityIdentity()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_SecurityIdentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getQuery()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType#getId()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EAttribute getEntityBeanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Values Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesType
	 * @generated
	 */
	EClass getEnvEntryTypeValuesType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType <em>Exclude List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude List Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType
	 * @generated
	 */
	EClass getExcludeListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType#getDescription()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EReference getExcludeListType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType#getMethod()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EReference getExcludeListType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ExcludeListType#getId()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EAttribute getExcludeListType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fully Qualified Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.FullyQualifiedClassType
	 * @generated
	 */
	EClass getFullyQualifiedClassType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanType
	 * @generated
	 */
	EClass getGenericBooleanType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType
	 * @generated
	 */
	EClass getIconType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getSmallIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getLargeIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getId()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType#getLang()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Identifier Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.JavaIdentifierType
	 * @generated
	 */
	EClass getJavaIdentifierType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.JavaTypeType
	 * @generated
	 */
	EClass getJavaTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jndi Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.JndiNameType
	 * @generated
	 */
	EClass getJndiNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType
	 * @generated
	 */
	EClass getListenerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getDescription()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getDisplayName()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getIcon()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getListenerClass()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_ListenerClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ListenerType#getId()
	 * @see #getListenerType()
	 * @generated
	 */
	EAttribute getListenerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Home Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.LocalHomeType
	 * @generated
	 */
	EClass getLocalHomeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.LocalType
	 * @generated
	 */
	EClass getLocalType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationLinkType
	 * @generated
	 */
	EClass getMessageDestinationLinkType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType
	 * @generated
	 */
	EClass getMessageDestinationRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getDescription()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationRefName()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationType()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Usage</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationUsage()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationUsage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getMessageDestinationLink()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationRefType#getId()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EAttribute getMessageDestinationRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType
	 * @generated
	 */
	EClass getMessageDestinationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getDescription()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getDisplayName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getIcon()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getMessageDestinationName <em>Message Destination Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getMessageDestinationName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_MessageDestinationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationType#getId()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EAttribute getMessageDestinationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationTypeType
	 * @generated
	 */
	EClass getMessageDestinationTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Usage Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageType
	 * @generated
	 */
	EClass getMessageDestinationUsageType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType <em>Message Driven Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Driven Bean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType
	 * @generated
	 */
	EClass getMessageDrivenBeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getDescription()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getDisplayName()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getIcon()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbName()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbClass()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessagingType <em>Messaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Messaging Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessagingType()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessagingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getTransactionType()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_TransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessageDestinationType()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessageDestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessageDestinationLink()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessageDestinationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getActivationConfig <em>Activation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Config</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getActivationConfig()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ActivationConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEnvEntry()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getEjbLocalRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getServiceRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getResourceRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getResourceEnvRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getMessageDestinationRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getSecurityIdentity()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_SecurityIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDrivenBeanType#getId()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EAttribute getMessageDrivenBeanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfType <em>Method Intf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Intf Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfType
	 * @generated
	 */
	EClass getMethodIntfType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodNameType <em>Method Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodNameType
	 * @generated
	 */
	EClass getMethodNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodParamsType <em>Method Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Params Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodParamsType
	 * @generated
	 */
	EClass getMethodParamsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodParamsType#getMethodParam <em>Method Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodParamsType#getMethodParam()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EReference getMethodParamsType_MethodParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodParamsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodParamsType#getId()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EAttribute getMethodParamsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType <em>Method Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Permission Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType
	 * @generated
	 */
	EClass getMethodPermissionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getDescription()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getRoleName()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getUnchecked <em>Unchecked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchecked</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getUnchecked()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Unchecked();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getMethod()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getId()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EAttribute getMethodPermissionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getDescription()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getEjbName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getMethodIntf <em>Method Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Intf</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getMethodIntf()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodIntf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getMethodName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getMethodParams()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType#getId()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityType
	 * @generated
	 */
	EClass getMultiplicityType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Value Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType
	 * @generated
	 */
	EClass getParamValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getDescription()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getParamName()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getParamValue()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ParamValueType#getId()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PathType
	 * @generated
	 */
	EClass getPathType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeType <em>Persistence Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeType
	 * @generated
	 */
	EClass getPersistenceTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Component Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType
	 * @generated
	 */
	EClass getPortComponentRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Endpoint Interface</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getServiceEndpointInterface()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_ServiceEndpointInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getPortComponentLink <em>Port Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Component Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getPortComponentLink()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_PortComponentLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getId()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EAttribute getPortComponentRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType <em>Query Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType
	 * @generated
	 */
	EClass getQueryMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType#getMethodName()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EReference getQueryMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType#getMethodParams()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EReference getQueryMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryMethodType#getId()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EAttribute getQueryMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType
	 * @generated
	 */
	EClass getQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getDescription()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getQueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getQueryMethod()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_QueryMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getResultTypeMapping <em>Result Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Type Mapping</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getResultTypeMapping()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_ResultTypeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getEjbQl <em>Ejb Ql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ql</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getEjbQl()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_EjbQl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.QueryType#getId()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType <em>Relationship Role Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Role Source Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType
	 * @generated
	 */
	EClass getRelationshipRoleSourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType#getDescription()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EReference getRelationshipRoleSourceType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType#getEjbName()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EReference getRelationshipRoleSourceType_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipRoleSourceType#getId()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EAttribute getRelationshipRoleSourceType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType <em>Relationships Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType
	 * @generated
	 */
	EClass getRelationshipsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType#getDescription()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EReference getRelationshipsType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType#getEjbRelation <em>Ejb Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Relation</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType#getEjbRelation()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EReference getRelationshipsType_EjbRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RelationshipsType#getId()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EAttribute getRelationshipsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType
	 * @generated
	 */
	EClass getResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getDescription()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefType()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getId()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EAttribute getResourceEnvRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getResSharingScope()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResSharingScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Sharing Scope Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeType
	 * @generated
	 */
	EClass getResSharingScopeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingType <em>Result Type Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingType
	 * @generated
	 */
	EClass getResultTypeMappingType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run As Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType
	 * @generated
	 */
	EClass getRunAsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType#getDescription()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType#getRoleName()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.RunAsType#getId()
	 * @see #getRunAsType()
	 * @generated
	 */
	EAttribute getRunAsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType <em>Security Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Identity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType
	 * @generated
	 */
	EClass getSecurityIdentityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getDescription()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getUseCallerIdentity <em>Use Caller Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Caller Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getUseCallerIdentity()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_UseCallerIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getRunAs()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_RunAs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityIdentityType#getId()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EAttribute getSecurityIdentityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType <em>Service Ref Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType
	 * @generated
	 */
	EClass getServiceRefHandlerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getDescription()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getDisplayName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getIcon()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getHandlerName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_HandlerName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getHandlerClass <em>Handler Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getHandlerClass()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_HandlerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getInitParam()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_InitParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getSoapHeader <em>Soap Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Header</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getSoapHeader()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_SoapHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getSoapRole <em>Soap Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getSoapRole()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_SoapRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getPortName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_PortName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType#getId()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType
	 * @generated
	 */
	EClass getServiceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getDescription()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getDisplayName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getIcon()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceRefName <em>Service Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceRefName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Interface</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceInterface()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl File</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getWsdlFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_WsdlFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jaxrpc Mapping File</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getJaxrpcMappingFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_JaxrpcMappingFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceQname <em>Service Qname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Qname</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceQname()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceQname();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getPortComponentRef <em>Port Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Component Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getPortComponentRef()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_PortComponentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getHandler()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Handler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getId()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EAttribute getServiceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType <em>Session Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Bean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType
	 * @generated
	 */
	EClass getSessionBeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getDescription()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getDisplayName()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getIcon()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbName()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getHome()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getRemote()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getLocalHome()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getLocal()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getServiceEndpoint <em>Service Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Endpoint</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getServiceEndpoint()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ServiceEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbClass()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getSessionType()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_SessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getTransactionType()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_TransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEnvEntry()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getEjbLocalRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getServiceRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getResourceRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getResourceEnvRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getMessageDestinationRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getSecurityRoleRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getSecurityIdentity()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_SecurityIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType#getId()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EAttribute getSessionBeanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeType <em>Session Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeType
	 * @generated
	 */
	EClass getSessionTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.String#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.String#getId()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeType
	 * @generated
	 */
	EClass getTransactionTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeType <em>Trans Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trans Attribute Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeType
	 * @generated
	 */
	EClass getTransAttributeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True False Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TrueFalseType
	 * @generated
	 */
	EClass getTrueFalseType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Pattern Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.UrlPatternType
	 * @generated
	 */
	EClass getUrlPatternType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.UrlPatternType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.UrlPatternType#getValue()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdAnyURIType <em>Xsd Any URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Any URI Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdAnyURIType
	 * @generated
	 */
	EClass getXsdAnyURIType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdAnyURIType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdAnyURIType#getValue()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdAnyURIType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdAnyURIType#getId()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdBooleanType <em>Xsd Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdBooleanType
	 * @generated
	 */
	EClass getXsdBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdBooleanType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdBooleanType#isValue()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdBooleanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdBooleanType#getId()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdIntegerType <em>Xsd Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdIntegerType
	 * @generated
	 */
	EClass getXsdIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdIntegerType#getValue()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdIntegerType#getId()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNMTOKENType <em>Xsd NMTOKEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd NMTOKEN Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNMTOKENType
	 * @generated
	 */
	EClass getXsdNMTOKENType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNMTOKENType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNMTOKENType#getValue()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNMTOKENType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNMTOKENType#getId()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Non Negative Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNonNegativeIntegerType
	 * @generated
	 */
	EClass getXsdNonNegativeIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNonNegativeIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNonNegativeIntegerType#getValue()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNonNegativeIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdNonNegativeIntegerType#getId()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Positive Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdPositiveIntegerType
	 * @generated
	 */
	EClass getXsdPositiveIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdPositiveIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdPositiveIntegerType#getValue()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdPositiveIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdPositiveIntegerType#getId()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd QName Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdQNameType
	 * @generated
	 */
	EClass getXsdQNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdQNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdQNameType#getValue()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdQNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdQNameType#getId()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd String Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType
	 * @generated
	 */
	EClass getXsdStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType#getValue()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType#getId()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Id();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase <em>Cmp Version Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cmp Version Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase
	 * @generated
	 */
	EEnum getCmpVersionTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase <em>Cmr Field Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cmr Field Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase
	 * @generated
	 */
	EEnum getCmrFieldTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ejb Ref Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase
	 * @generated
	 */
	EEnum getEjbRefTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Env Entry Type Values Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase
	 * @generated
	 */
	EEnum getEnvEntryTypeValuesTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generic Boolean Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase
	 * @generated
	 */
	EEnum getGenericBooleanTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Destination Usage Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase
	 * @generated
	 */
	EEnum getMessageDestinationUsageTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase <em>Method Intf Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Intf Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase
	 * @generated
	 */
	EEnum getMethodIntfTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase <em>Multiplicity Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase
	 * @generated
	 */
	EEnum getMultiplicityTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase <em>Persistence Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase
	 * @generated
	 */
	EEnum getPersistenceTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase <em>Res Auth Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Res Auth Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase
	 * @generated
	 */
	EEnum getResAuthTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Res Sharing Scope Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase
	 * @generated
	 */
	EEnum getResSharingScopeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase <em>Result Type Mapping Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type Mapping Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase
	 * @generated
	 */
	EEnum getResultTypeMappingTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase <em>Session Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Session Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase
	 * @generated
	 */
	EEnum getSessionTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase <em>Transaction Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase
	 * @generated
	 */
	EEnum getTransactionTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase <em>Trans Attribute Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trans Attribute Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase
	 * @generated
	 */
	EEnum getTransAttributeTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase <em>Cmp Version Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cmp Version Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase"
	 *        extendedMetaData="name='cmp-versionType_._base:Object' baseType='cmp-versionType_._base'"
	 * @generated
	 */
	EDataType getCmpVersionTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase <em>Cmr Field Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cmr Field Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase"
	 *        extendedMetaData="name='cmr-field-typeType_._base:Object' baseType='cmr-field-typeType_._base'"
	 * @generated
	 */
	EDataType getCmrFieldTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Dewey Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dewey Version Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='dewey-versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' whiteSpace='collapse'"
	 * @generated
	 */
	EDataType getDeweyVersionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ejb Class Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Class Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ejb-classType_._base'"
	 * @generated
	 */
	EDataType getEjbClassTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ejb Link Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Link Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ejb-linkType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getEjbLinkTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ejb Name Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ejb-nameType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKEN'"
	 * @generated
	 */
	EDataType getEjbNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ejb Ref Name Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ejb-ref-nameType_._base'"
	 * @generated
	 */
	EDataType getEjbRefNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase"
	 *        extendedMetaData="name='ejb-ref-typeType_._base:Object' baseType='ejb-ref-typeType_._base'"
	 * @generated
	 */
	EDataType getEjbRefTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Env Entry Type Values Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase"
	 *        extendedMetaData="name='env-entry-type-valuesType_._base:Object' baseType='env-entry-type-valuesType_._base'"
	 * @generated
	 */
	EDataType getEnvEntryTypeValuesTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fully Qualified Class Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fully Qualified Class Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fully-qualified-classType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getFullyQualifiedClassTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase <em>Generic Boolean Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generic Boolean Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase"
	 *        extendedMetaData="name='generic-booleanType_._base:Object' baseType='generic-booleanType_._base'"
	 * @generated
	 */
	EDataType getGenericBooleanTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Home Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Home Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='homeType_._base'"
	 * @generated
	 */
	EDataType getHomeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Java Identifier Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Identifier Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='java-identifierType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*'"
	 * @generated
	 */
	EDataType getJavaIdentifierTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Java Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Type Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='java-typeType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[^\\p{Z}]*'"
	 * @generated
	 */
	EDataType getJavaTypeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Jndi Name Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Jndi Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='jndi-nameType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getJndiNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local Home Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Home Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='local-homeType_._base'"
	 * @generated
	 */
	EDataType getLocalHomeTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Destination Usage Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase"
	 *        extendedMetaData="name='message-destination-usageType_._base:Object' baseType='message-destination-usageType_._base'"
	 * @generated
	 */
	EDataType getMessageDestinationUsageTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase <em>Method Intf Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Intf Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase"
	 *        extendedMetaData="name='method-intfType_._base:Object' baseType='method-intfType_._base'"
	 * @generated
	 */
	EDataType getMethodIntfTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Method Name Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='method-nameType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getMethodNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase <em>Multiplicity Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiplicity Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase"
	 *        extendedMetaData="name='multiplicityType_._base:Object' baseType='multiplicityType_._base'"
	 * @generated
	 */
	EDataType getMultiplicityTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Path Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='pathType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getPathTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase <em>Persistence Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Persistence Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase"
	 *        extendedMetaData="name='persistence-typeType_._base:Object' baseType='persistence-typeType_._base'"
	 * @generated
	 */
	EDataType getPersistenceTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Remote Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Remote Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='remoteType_._base'"
	 * @generated
	 */
	EDataType getRemoteTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase <em>Res Auth Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Auth Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase"
	 *        extendedMetaData="name='res-authType_._base:Object' baseType='res-authType_._base'"
	 * @generated
	 */
	EDataType getResAuthTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Sharing Scope Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase"
	 *        extendedMetaData="name='res-sharing-scopeType_._base:Object' baseType='res-sharing-scopeType_._base'"
	 * @generated
	 */
	EDataType getResSharingScopeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase <em>Result Type Mapping Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Type Mapping Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase"
	 *        extendedMetaData="name='result-type-mappingType_._base:Object' baseType='result-type-mappingType_._base'"
	 * @generated
	 */
	EDataType getResultTypeMappingTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Role Name Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role Name Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='role-nameType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
	 * @generated
	 */
	EDataType getRoleNameTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase <em>Session Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Session Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase"
	 *        extendedMetaData="name='session-typeType_._base:Object' baseType='session-typeType_._base'"
	 * @generated
	 */
	EDataType getSessionTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase <em>Transaction Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transaction Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase"
	 *        extendedMetaData="name='transaction-typeType_._base:Object' baseType='transaction-typeType_._base'"
	 * @generated
	 */
	EDataType getTransactionTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase <em>Trans Attribute Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trans Attribute Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase"
	 *        extendedMetaData="name='trans-attributeType_._base:Object' baseType='trans-attributeType_._base'"
	 * @generated
	 */
	EDataType getTransAttributeTypeBaseObject();

	/**
	 * Returns the meta object for data type '<em>True False Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>True False Type Base</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='true-falseType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean' pattern='(true|false)'"
	 * @generated
	 */
	EDataType getTrueFalseTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>True False Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>True False Type Base Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='true-falseType_._base:Object' baseType='true-falseType_._base'"
	 * @generated
	 */
	EDataType getTrueFalseTypeBaseObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjbJar21Factory getEjbJar21Factory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigPropertyTypeImpl <em>Activation Config Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigPropertyTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getActivationConfigPropertyType()
		 * @generated
		 */
		EClass ACTIVATION_CONFIG_PROPERTY_TYPE = eINSTANCE.getActivationConfigPropertyType();

		/**
		 * The meta object literal for the '<em><b>Activation Config Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME = eINSTANCE.getActivationConfigPropertyType_ActivationConfigPropertyName();

		/**
		 * The meta object literal for the '<em><b>Activation Config Property Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE = eINSTANCE.getActivationConfigPropertyType_ActivationConfigPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONFIG_PROPERTY_TYPE__ID = eINSTANCE.getActivationConfigPropertyType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigTypeImpl <em>Activation Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getActivationConfigType()
		 * @generated
		 */
		EClass ACTIVATION_CONFIG_TYPE = eINSTANCE.getActivationConfigType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_CONFIG_TYPE__DESCRIPTION = eINSTANCE.getActivationConfigType_Description();

		/**
		 * The meta object literal for the '<em><b>Activation Config Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_CONFIG_TYPE__ACTIVATION_CONFIG_PROPERTY = eINSTANCE.getActivationConfigType_ActivationConfigProperty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONFIG_TYPE__ID = eINSTANCE.getActivationConfigType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.AssemblyDescriptorTypeImpl <em>Assembly Descriptor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.AssemblyDescriptorTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getAssemblyDescriptorType()
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
		 * The meta object literal for the '<em><b>Message Destination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION = eINSTANCE.getAssemblyDescriptorType_MessageDestination();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpFieldTypeImpl <em>Cmp Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpFieldTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpFieldType()
		 * @generated
		 */
		EClass CMP_FIELD_TYPE = eINSTANCE.getCmpFieldType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpVersionTypeImpl <em>Cmp Version Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmpVersionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpVersionType()
		 * @generated
		 */
		EClass CMP_VERSION_TYPE = eINSTANCE.getCmpVersionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeImpl <em>Cmr Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldType()
		 * @generated
		 */
		EClass CMR_FIELD_TYPE = eINSTANCE.getCmrFieldType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeTypeImpl <em>Cmr Field Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.CmrFieldTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldTypeType()
		 * @generated
		 */
		EClass CMR_FIELD_TYPE_TYPE = eINSTANCE.getCmrFieldTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getContainerTransactionType()
		 * @generated
		 */
		EClass CONTAINER_TRANSACTION_TYPE = eINSTANCE.getContainerTransactionType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DescriptionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDescriptionType()
		 * @generated
		 */
		EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__LANG = eINSTANCE.getDescriptionType_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DisplayNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDisplayNameType()
		 * @generated
		 */
		EClass DISPLAY_NAME_TYPE = eINSTANCE.getDisplayNameType();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME_TYPE__LANG = eINSTANCE.getDisplayNameType_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.DocumentRootImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Ejb Jar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EJB_JAR = eINSTANCE.getDocumentRoot_EjbJar();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbClassTypeImpl <em>Ejb Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbClassTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbClassType()
		 * @generated
		 */
		EClass EJB_CLASS_TYPE = eINSTANCE.getEjbClassType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJarTypeImpl <em>Ejb Jar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJarTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbJarType()
		 * @generated
		 */
		EClass EJB_JAR_TYPE = eINSTANCE.getEjbJarType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__DESCRIPTION = eINSTANCE.getEjbJarType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__DISPLAY_NAME = eINSTANCE.getEjbJarType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_TYPE__ICON = eINSTANCE.getEjbJarType_Icon();

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
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_JAR_TYPE__VERSION = eINSTANCE.getEjbJarType_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLinkTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbLinkType()
		 * @generated
		 */
		EClass EJB_LINK_TYPE = eINSTANCE.getEjbLinkType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbLocalRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbLocalRefType()
		 * @generated
		 */
		EClass EJB_LOCAL_REF_TYPE = eINSTANCE.getEjbLocalRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbNameTypeImpl <em>Ejb Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbNameType()
		 * @generated
		 */
		EClass EJB_NAME_TYPE = eINSTANCE.getEjbNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefNameType()
		 * @generated
		 */
		EClass EJB_REF_NAME_TYPE = eINSTANCE.getEjbRefNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefType()
		 * @generated
		 */
		EClass EJB_REF_TYPE = eINSTANCE.getEjbRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRefTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefTypeType()
		 * @generated
		 */
		EClass EJB_REF_TYPE_TYPE = eINSTANCE.getEjbRefTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationshipRoleTypeImpl <em>Ejb Relationship Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationshipRoleTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRelationshipRoleType()
		 * @generated
		 */
		EClass EJB_RELATIONSHIP_ROLE_TYPE = eINSTANCE.getEjbRelationshipRoleType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationTypeImpl <em>Ejb Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbRelationTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRelationType()
		 * @generated
		 */
		EClass EJB_RELATION_TYPE = eINSTANCE.getEjbRelationType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EmptyTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEmptyType()
		 * @generated
		 */
		EClass EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPTY_TYPE__ID = eINSTANCE.getEmptyType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnterpriseBeansTypeImpl <em>Enterprise Beans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnterpriseBeansTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnterpriseBeansType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EntityBeanTypeImpl <em>Entity Bean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EntityBeanTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEntityBeanType()
		 * @generated
		 */
		EClass ENTITY_BEAN_TYPE = eINSTANCE.getEntityBeanType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__DESCRIPTION = eINSTANCE.getEntityBeanType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__DISPLAY_NAME = eINSTANCE.getEntityBeanType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__ICON = eINSTANCE.getEntityBeanType_Icon();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__EJB_NAME = eINSTANCE.getEntityBeanType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__HOME = eINSTANCE.getEntityBeanType_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__REMOTE = eINSTANCE.getEntityBeanType_Remote();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__LOCAL_HOME = eINSTANCE.getEntityBeanType_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__LOCAL = eINSTANCE.getEntityBeanType_Local();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__EJB_CLASS = eINSTANCE.getEntityBeanType_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__PERSISTENCE_TYPE = eINSTANCE.getEntityBeanType_PersistenceType();

		/**
		 * The meta object literal for the '<em><b>Prim Key Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__PRIM_KEY_CLASS = eINSTANCE.getEntityBeanType_PrimKeyClass();

		/**
		 * The meta object literal for the '<em><b>Reentrant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__REENTRANT = eINSTANCE.getEntityBeanType_Reentrant();

		/**
		 * The meta object literal for the '<em><b>Cmp Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__CMP_VERSION = eINSTANCE.getEntityBeanType_CmpVersion();

		/**
		 * The meta object literal for the '<em><b>Abstract Schema Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME = eINSTANCE.getEntityBeanType_AbstractSchemaName();

		/**
		 * The meta object literal for the '<em><b>Cmp Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__CMP_FIELD = eINSTANCE.getEntityBeanType_CmpField();

		/**
		 * The meta object literal for the '<em><b>Primkey Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__PRIMKEY_FIELD = eINSTANCE.getEntityBeanType_PrimkeyField();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__ENV_ENTRY = eINSTANCE.getEntityBeanType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__EJB_REF = eINSTANCE.getEntityBeanType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__EJB_LOCAL_REF = eINSTANCE.getEntityBeanType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Service Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__SERVICE_REF = eINSTANCE.getEntityBeanType_ServiceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__RESOURCE_REF = eINSTANCE.getEntityBeanType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__RESOURCE_ENV_REF = eINSTANCE.getEntityBeanType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Message Destination Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF = eINSTANCE.getEntityBeanType_MessageDestinationRef();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__SECURITY_ROLE_REF = eINSTANCE.getEntityBeanType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__SECURITY_IDENTITY = eINSTANCE.getEntityBeanType_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN_TYPE__QUERY = eINSTANCE.getEntityBeanType_Query();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN_TYPE__ID = eINSTANCE.getEntityBeanType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryType()
		 * @generated
		 */
		EClass ENV_ENTRY_TYPE = eINSTANCE.getEnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeValuesTypeImpl <em>Env Entry Type Values Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EnvEntryTypeValuesTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryTypeValuesType()
		 * @generated
		 */
		EClass ENV_ENTRY_TYPE_VALUES_TYPE = eINSTANCE.getEnvEntryTypeValuesType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ExcludeListTypeImpl <em>Exclude List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ExcludeListTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getExcludeListType()
		 * @generated
		 */
		EClass EXCLUDE_LIST_TYPE = eINSTANCE.getExcludeListType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.FullyQualifiedClassTypeImpl <em>Fully Qualified Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.FullyQualifiedClassTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getFullyQualifiedClassType()
		 * @generated
		 */
		EClass FULLY_QUALIFIED_CLASS_TYPE = eINSTANCE.getFullyQualifiedClassType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.GenericBooleanTypeImpl <em>Generic Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.GenericBooleanTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getGenericBooleanType()
		 * @generated
		 */
		EClass GENERIC_BOOLEAN_TYPE = eINSTANCE.getGenericBooleanType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.HomeTypeImpl <em>Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.HomeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getHomeType()
		 * @generated
		 */
		EClass HOME_TYPE = eINSTANCE.getHomeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.IconTypeImpl <em>Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.IconTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getIconType()
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
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__LANG = eINSTANCE.getIconType_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaIdentifierTypeImpl <em>Java Identifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaIdentifierTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaIdentifierType()
		 * @generated
		 */
		EClass JAVA_IDENTIFIER_TYPE = eINSTANCE.getJavaIdentifierType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaTypeTypeImpl <em>Java Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JavaTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaTypeType()
		 * @generated
		 */
		EClass JAVA_TYPE_TYPE = eINSTANCE.getJavaTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JndiNameTypeImpl <em>Jndi Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.JndiNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJndiNameType()
		 * @generated
		 */
		EClass JNDI_NAME_TYPE = eINSTANCE.getJndiNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ListenerTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getListenerType()
		 * @generated
		 */
		EClass LISTENER_TYPE = eINSTANCE.getListenerType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__DESCRIPTION = eINSTANCE.getListenerType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__DISPLAY_NAME = eINSTANCE.getListenerType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__ICON = eINSTANCE.getListenerType_Icon();

		/**
		 * The meta object literal for the '<em><b>Listener Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER_TYPE__LISTENER_CLASS = eINSTANCE.getListenerType_ListenerClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER_TYPE__ID = eINSTANCE.getListenerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalHomeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalHomeType()
		 * @generated
		 */
		EClass LOCAL_HOME_TYPE = eINSTANCE.getLocalHomeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalTypeImpl <em>Local Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.LocalTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalType()
		 * @generated
		 */
		EClass LOCAL_TYPE = eINSTANCE.getLocalType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationLinkTypeImpl <em>Message Destination Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationLinkTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationLinkType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_LINK_TYPE = eINSTANCE.getMessageDestinationLinkType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationRefTypeImpl <em>Message Destination Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationRefType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_REF_TYPE = eINSTANCE.getMessageDestinationRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION = eINSTANCE.getMessageDestinationRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Message Destination Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME = eINSTANCE.getMessageDestinationRefType_MessageDestinationRefName();

		/**
		 * The meta object literal for the '<em><b>Message Destination Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE = eINSTANCE.getMessageDestinationRefType_MessageDestinationType();

		/**
		 * The meta object literal for the '<em><b>Message Destination Usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE = eINSTANCE.getMessageDestinationRefType_MessageDestinationUsage();

		/**
		 * The meta object literal for the '<em><b>Message Destination Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK = eINSTANCE.getMessageDestinationRefType_MessageDestinationLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF_TYPE__ID = eINSTANCE.getMessageDestinationRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeImpl <em>Message Destination Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_TYPE = eINSTANCE.getMessageDestinationType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__DESCRIPTION = eINSTANCE.getMessageDestinationType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__DISPLAY_NAME = eINSTANCE.getMessageDestinationType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__ICON = eINSTANCE.getMessageDestinationType_Icon();

		/**
		 * The meta object literal for the '<em><b>Message Destination Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME = eINSTANCE.getMessageDestinationType_MessageDestinationName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_TYPE__ID = eINSTANCE.getMessageDestinationType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeTypeImpl <em>Message Destination Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationTypeType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_TYPE_TYPE = eINSTANCE.getMessageDestinationTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationUsageTypeImpl <em>Message Destination Usage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDestinationUsageTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationUsageType()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_USAGE_TYPE = eINSTANCE.getMessageDestinationUsageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDrivenBeanTypeImpl <em>Message Driven Bean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MessageDrivenBeanTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDrivenBeanType()
		 * @generated
		 */
		EClass MESSAGE_DRIVEN_BEAN_TYPE = eINSTANCE.getMessageDrivenBeanType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION = eINSTANCE.getMessageDrivenBeanType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME = eINSTANCE.getMessageDrivenBeanType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__ICON = eINSTANCE.getMessageDrivenBeanType_Icon();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME = eINSTANCE.getMessageDrivenBeanType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS = eINSTANCE.getMessageDrivenBeanType_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Messaging Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE = eINSTANCE.getMessageDrivenBeanType_MessagingType();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE = eINSTANCE.getMessageDrivenBeanType_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Message Destination Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE = eINSTANCE.getMessageDrivenBeanType_MessageDestinationType();

		/**
		 * The meta object literal for the '<em><b>Message Destination Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK = eINSTANCE.getMessageDrivenBeanType_MessageDestinationLink();

		/**
		 * The meta object literal for the '<em><b>Activation Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG = eINSTANCE.getMessageDrivenBeanType_ActivationConfig();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY = eINSTANCE.getMessageDrivenBeanType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF = eINSTANCE.getMessageDrivenBeanType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF = eINSTANCE.getMessageDrivenBeanType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Service Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF = eINSTANCE.getMessageDrivenBeanType_ServiceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF = eINSTANCE.getMessageDrivenBeanType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF = eINSTANCE.getMessageDrivenBeanType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Message Destination Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF = eINSTANCE.getMessageDrivenBeanType_MessageDestinationRef();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY = eINSTANCE.getMessageDrivenBeanType_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN_TYPE__ID = eINSTANCE.getMessageDrivenBeanType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodIntfTypeImpl <em>Method Intf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodIntfTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodIntfType()
		 * @generated
		 */
		EClass METHOD_INTF_TYPE = eINSTANCE.getMethodIntfType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodNameTypeImpl <em>Method Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodNameType()
		 * @generated
		 */
		EClass METHOD_NAME_TYPE = eINSTANCE.getMethodNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodParamsTypeImpl <em>Method Params Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodParamsTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodParamsType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodPermissionTypeImpl <em>Method Permission Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodPermissionTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodPermissionType()
		 * @generated
		 */
		EClass METHOD_PERMISSION_TYPE = eINSTANCE.getMethodPermissionType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodTypeImpl <em>Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MethodTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodType()
		 * @generated
		 */
		EClass METHOD_TYPE = eINSTANCE.getMethodType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MultiplicityTypeImpl <em>Multiplicity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.MultiplicityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMultiplicityType()
		 * @generated
		 */
		EClass MULTIPLICITY_TYPE = eINSTANCE.getMultiplicityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ParamValueTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getParamValueType()
		 * @generated
		 */
		EClass PARAM_VALUE_TYPE = eINSTANCE.getParamValueType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE_TYPE__DESCRIPTION = eINSTANCE.getParamValueType_Description();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE_TYPE__PARAM_NAME = eINSTANCE.getParamValueType_ParamName();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE_TYPE__PARAM_VALUE = eINSTANCE.getParamValueType_ParamValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE_TYPE__ID = eINSTANCE.getParamValueType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PathTypeImpl <em>Path Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PathTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPathType()
		 * @generated
		 */
		EClass PATH_TYPE = eINSTANCE.getPathType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PersistenceTypeTypeImpl <em>Persistence Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PersistenceTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPersistenceTypeType()
		 * @generated
		 */
		EClass PERSISTENCE_TYPE_TYPE = eINSTANCE.getPersistenceTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PortComponentRefTypeImpl <em>Port Component Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.PortComponentRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPortComponentRefType()
		 * @generated
		 */
		EClass PORT_COMPONENT_REF_TYPE = eINSTANCE.getPortComponentRefType();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE = eINSTANCE.getPortComponentRefType_ServiceEndpointInterface();

		/**
		 * The meta object literal for the '<em><b>Port Component Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK = eINSTANCE.getPortComponentRefType_PortComponentLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT_REF_TYPE__ID = eINSTANCE.getPortComponentRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryMethodTypeImpl <em>Query Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryMethodTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getQueryMethodType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryTypeImpl <em>Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.QueryTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getQueryType()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipRoleSourceTypeImpl <em>Relationship Role Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipRoleSourceTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRelationshipRoleSourceType()
		 * @generated
		 */
		EClass RELATIONSHIP_ROLE_SOURCE_TYPE = eINSTANCE.getRelationshipRoleSourceType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipsTypeImpl <em>Relationships Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RelationshipsTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRelationshipsType()
		 * @generated
		 */
		EClass RELATIONSHIPS_TYPE = eINSTANCE.getRelationshipsType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RemoteTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRemoteType()
		 * @generated
		 */
		EClass REMOTE_TYPE = eINSTANCE.getRemoteType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResAuthTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResAuthType()
		 * @generated
		 */
		EClass RES_AUTH_TYPE = eINSTANCE.getResAuthType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceEnvRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResourceEnvRefType()
		 * @generated
		 */
		EClass RESOURCE_ENV_REF_TYPE = eINSTANCE.getResourceEnvRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResourceRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResourceRefType()
		 * @generated
		 */
		EClass RESOURCE_REF_TYPE = eINSTANCE.getResourceRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResSharingScopeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResSharingScopeType()
		 * @generated
		 */
		EClass RES_SHARING_SCOPE_TYPE = eINSTANCE.getResSharingScopeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResultTypeMappingTypeImpl <em>Result Type Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ResultTypeMappingTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResultTypeMappingType()
		 * @generated
		 */
		EClass RESULT_TYPE_MAPPING_TYPE = eINSTANCE.getResultTypeMappingType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RoleNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRoleNameType()
		 * @generated
		 */
		EClass ROLE_NAME_TYPE = eINSTANCE.getRoleNameType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.RunAsTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRunAsType()
		 * @generated
		 */
		EClass RUN_AS_TYPE = eINSTANCE.getRunAsType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityIdentityTypeImpl <em>Security Identity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityIdentityTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSecurityIdentityType()
		 * @generated
		 */
		EClass SECURITY_IDENTITY_TYPE = eINSTANCE.getSecurityIdentityType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSecurityRoleRefType()
		 * @generated
		 */
		EClass SECURITY_ROLE_REF_TYPE = eINSTANCE.getSecurityRoleRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SecurityRoleTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSecurityRoleType()
		 * @generated
		 */
		EClass SECURITY_ROLE_TYPE = eINSTANCE.getSecurityRoleType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefHandlerTypeImpl <em>Service Ref Handler Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefHandlerTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getServiceRefHandlerType()
		 * @generated
		 */
		EClass SERVICE_REF_HANDLER_TYPE = eINSTANCE.getServiceRefHandlerType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__DESCRIPTION = eINSTANCE.getServiceRefHandlerType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__DISPLAY_NAME = eINSTANCE.getServiceRefHandlerType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__ICON = eINSTANCE.getServiceRefHandlerType_Icon();

		/**
		 * The meta object literal for the '<em><b>Handler Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__HANDLER_NAME = eINSTANCE.getServiceRefHandlerType_HandlerName();

		/**
		 * The meta object literal for the '<em><b>Handler Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__HANDLER_CLASS = eINSTANCE.getServiceRefHandlerType_HandlerClass();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__INIT_PARAM = eINSTANCE.getServiceRefHandlerType_InitParam();

		/**
		 * The meta object literal for the '<em><b>Soap Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__SOAP_HEADER = eINSTANCE.getServiceRefHandlerType_SoapHeader();

		/**
		 * The meta object literal for the '<em><b>Soap Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__SOAP_ROLE = eINSTANCE.getServiceRefHandlerType_SoapRole();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_TYPE__PORT_NAME = eINSTANCE.getServiceRefHandlerType_PortName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER_TYPE__ID = eINSTANCE.getServiceRefHandlerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefTypeImpl <em>Service Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ServiceRefTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getServiceRefType()
		 * @generated
		 */
		EClass SERVICE_REF_TYPE = eINSTANCE.getServiceRefType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__DESCRIPTION = eINSTANCE.getServiceRefType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__DISPLAY_NAME = eINSTANCE.getServiceRefType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__ICON = eINSTANCE.getServiceRefType_Icon();

		/**
		 * The meta object literal for the '<em><b>Service Ref Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__SERVICE_REF_NAME = eINSTANCE.getServiceRefType_ServiceRefName();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__SERVICE_INTERFACE = eINSTANCE.getServiceRefType_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Wsdl File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__WSDL_FILE = eINSTANCE.getServiceRefType_WsdlFile();

		/**
		 * The meta object literal for the '<em><b>Jaxrpc Mapping File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE = eINSTANCE.getServiceRefType_JaxrpcMappingFile();

		/**
		 * The meta object literal for the '<em><b>Service Qname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__SERVICE_QNAME = eINSTANCE.getServiceRefType_ServiceQname();

		/**
		 * The meta object literal for the '<em><b>Port Component Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__PORT_COMPONENT_REF = eINSTANCE.getServiceRefType_PortComponentRef();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_TYPE__HANDLER = eINSTANCE.getServiceRefType_Handler();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_TYPE__ID = eINSTANCE.getServiceRefType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionBeanTypeImpl <em>Session Bean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionBeanTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionBeanType()
		 * @generated
		 */
		EClass SESSION_BEAN_TYPE = eINSTANCE.getSessionBeanType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__DESCRIPTION = eINSTANCE.getSessionBeanType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__DISPLAY_NAME = eINSTANCE.getSessionBeanType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__ICON = eINSTANCE.getSessionBeanType_Icon();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__EJB_NAME = eINSTANCE.getSessionBeanType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__HOME = eINSTANCE.getSessionBeanType_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__REMOTE = eINSTANCE.getSessionBeanType_Remote();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__LOCAL_HOME = eINSTANCE.getSessionBeanType_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__LOCAL = eINSTANCE.getSessionBeanType_Local();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__SERVICE_ENDPOINT = eINSTANCE.getSessionBeanType_ServiceEndpoint();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__EJB_CLASS = eINSTANCE.getSessionBeanType_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Session Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__SESSION_TYPE = eINSTANCE.getSessionBeanType_SessionType();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__TRANSACTION_TYPE = eINSTANCE.getSessionBeanType_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Env Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__ENV_ENTRY = eINSTANCE.getSessionBeanType_EnvEntry();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__EJB_REF = eINSTANCE.getSessionBeanType_EjbRef();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__EJB_LOCAL_REF = eINSTANCE.getSessionBeanType_EjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Service Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__SERVICE_REF = eINSTANCE.getSessionBeanType_ServiceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__RESOURCE_REF = eINSTANCE.getSessionBeanType_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__RESOURCE_ENV_REF = eINSTANCE.getSessionBeanType_ResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Message Destination Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF = eINSTANCE.getSessionBeanType_MessageDestinationRef();

		/**
		 * The meta object literal for the '<em><b>Security Role Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__SECURITY_ROLE_REF = eINSTANCE.getSessionBeanType_SecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN_TYPE__SECURITY_IDENTITY = eINSTANCE.getSessionBeanType_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN_TYPE__ID = eINSTANCE.getSessionBeanType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionTypeTypeImpl <em>Session Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.SessionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionTypeType()
		 * @generated
		 */
		EClass SESSION_TYPE_TYPE = eINSTANCE.getSessionTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.StringImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__ID = eINSTANCE.getString_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransactionTypeTypeImpl <em>Transaction Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransactionTypeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransactionTypeType()
		 * @generated
		 */
		EClass TRANSACTION_TYPE_TYPE = eINSTANCE.getTransactionTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransAttributeTypeImpl <em>Trans Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TransAttributeTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransAttributeType()
		 * @generated
		 */
		EClass TRANS_ATTRIBUTE_TYPE = eINSTANCE.getTransAttributeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TrueFalseTypeImpl <em>True False Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.TrueFalseTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTrueFalseType()
		 * @generated
		 */
		EClass TRUE_FALSE_TYPE = eINSTANCE.getTrueFalseType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.UrlPatternTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getUrlPatternType()
		 * @generated
		 */
		EClass URL_PATTERN_TYPE = eINSTANCE.getUrlPatternType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_PATTERN_TYPE__VALUE = eINSTANCE.getUrlPatternType_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdAnyURITypeImpl <em>Xsd Any URI Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdAnyURITypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdAnyURIType()
		 * @generated
		 */
		EClass XSD_ANY_URI_TYPE = eINSTANCE.getXsdAnyURIType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ANY_URI_TYPE__VALUE = eINSTANCE.getXsdAnyURIType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ANY_URI_TYPE__ID = eINSTANCE.getXsdAnyURIType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdBooleanTypeImpl <em>Xsd Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdBooleanTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdBooleanType()
		 * @generated
		 */
		EClass XSD_BOOLEAN_TYPE = eINSTANCE.getXsdBooleanType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_BOOLEAN_TYPE__VALUE = eINSTANCE.getXsdBooleanType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_BOOLEAN_TYPE__ID = eINSTANCE.getXsdBooleanType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdIntegerTypeImpl <em>Xsd Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdIntegerTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdIntegerType()
		 * @generated
		 */
		EClass XSD_INTEGER_TYPE = eINSTANCE.getXsdIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_INTEGER_TYPE__VALUE = eINSTANCE.getXsdIntegerType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_INTEGER_TYPE__ID = eINSTANCE.getXsdIntegerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNMTOKENTypeImpl <em>Xsd NMTOKEN Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNMTOKENTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdNMTOKENType()
		 * @generated
		 */
		EClass XSD_NMTOKEN_TYPE = eINSTANCE.getXsdNMTOKENType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NMTOKEN_TYPE__VALUE = eINSTANCE.getXsdNMTOKENType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NMTOKEN_TYPE__ID = eINSTANCE.getXsdNMTOKENType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNonNegativeIntegerTypeImpl <em>Xsd Non Negative Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdNonNegativeIntegerTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdNonNegativeIntegerType()
		 * @generated
		 */
		EClass XSD_NON_NEGATIVE_INTEGER_TYPE = eINSTANCE.getXsdNonNegativeIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NON_NEGATIVE_INTEGER_TYPE__VALUE = eINSTANCE.getXsdNonNegativeIntegerType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NON_NEGATIVE_INTEGER_TYPE__ID = eINSTANCE.getXsdNonNegativeIntegerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdPositiveIntegerTypeImpl <em>Xsd Positive Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdPositiveIntegerTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdPositiveIntegerType()
		 * @generated
		 */
		EClass XSD_POSITIVE_INTEGER_TYPE = eINSTANCE.getXsdPositiveIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_POSITIVE_INTEGER_TYPE__VALUE = eINSTANCE.getXsdPositiveIntegerType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_POSITIVE_INTEGER_TYPE__ID = eINSTANCE.getXsdPositiveIntegerType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdQNameTypeImpl <em>Xsd QName Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdQNameTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdQNameType()
		 * @generated
		 */
		EClass XSD_QNAME_TYPE = eINSTANCE.getXsdQNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_QNAME_TYPE__VALUE = eINSTANCE.getXsdQNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_QNAME_TYPE__ID = eINSTANCE.getXsdQNameType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdStringTypeImpl <em>Xsd String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.XsdStringTypeImpl
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getXsdStringType()
		 * @generated
		 */
		EClass XSD_STRING_TYPE = eINSTANCE.getXsdStringType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_STRING_TYPE__VALUE = eINSTANCE.getXsdStringType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_STRING_TYPE__ID = eINSTANCE.getXsdStringType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase <em>Cmp Version Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpVersionTypeBase()
		 * @generated
		 */
		EEnum CMP_VERSION_TYPE_BASE = eINSTANCE.getCmpVersionTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase <em>Cmr Field Type Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldTypeTypeBase()
		 * @generated
		 */
		EEnum CMR_FIELD_TYPE_TYPE_BASE = eINSTANCE.getCmrFieldTypeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefTypeTypeBase()
		 * @generated
		 */
		EEnum EJB_REF_TYPE_TYPE_BASE = eINSTANCE.getEjbRefTypeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryTypeValuesTypeBase()
		 * @generated
		 */
		EEnum ENV_ENTRY_TYPE_VALUES_TYPE_BASE = eINSTANCE.getEnvEntryTypeValuesTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getGenericBooleanTypeBase()
		 * @generated
		 */
		EEnum GENERIC_BOOLEAN_TYPE_BASE = eINSTANCE.getGenericBooleanTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationUsageTypeBase()
		 * @generated
		 */
		EEnum MESSAGE_DESTINATION_USAGE_TYPE_BASE = eINSTANCE.getMessageDestinationUsageTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase <em>Method Intf Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodIntfTypeBase()
		 * @generated
		 */
		EEnum METHOD_INTF_TYPE_BASE = eINSTANCE.getMethodIntfTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase <em>Multiplicity Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMultiplicityTypeBase()
		 * @generated
		 */
		EEnum MULTIPLICITY_TYPE_BASE = eINSTANCE.getMultiplicityTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase <em>Persistence Type Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPersistenceTypeTypeBase()
		 * @generated
		 */
		EEnum PERSISTENCE_TYPE_TYPE_BASE = eINSTANCE.getPersistenceTypeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase <em>Res Auth Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResAuthTypeBase()
		 * @generated
		 */
		EEnum RES_AUTH_TYPE_BASE = eINSTANCE.getResAuthTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResSharingScopeTypeBase()
		 * @generated
		 */
		EEnum RES_SHARING_SCOPE_TYPE_BASE = eINSTANCE.getResSharingScopeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase <em>Result Type Mapping Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResultTypeMappingTypeBase()
		 * @generated
		 */
		EEnum RESULT_TYPE_MAPPING_TYPE_BASE = eINSTANCE.getResultTypeMappingTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase <em>Session Type Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionTypeTypeBase()
		 * @generated
		 */
		EEnum SESSION_TYPE_TYPE_BASE = eINSTANCE.getSessionTypeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase <em>Transaction Type Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransactionTypeTypeBase()
		 * @generated
		 */
		EEnum TRANSACTION_TYPE_TYPE_BASE = eINSTANCE.getTransactionTypeTypeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase <em>Trans Attribute Type Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransAttributeTypeBase()
		 * @generated
		 */
		EEnum TRANS_ATTRIBUTE_TYPE_BASE = eINSTANCE.getTransAttributeTypeBase();

		/**
		 * The meta object literal for the '<em>Cmp Version Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmpVersionTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmpVersionTypeBaseObject()
		 * @generated
		 */
		EDataType CMP_VERSION_TYPE_BASE_OBJECT = eINSTANCE.getCmpVersionTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Cmr Field Type Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getCmrFieldTypeTypeBaseObject()
		 * @generated
		 */
		EDataType CMR_FIELD_TYPE_TYPE_BASE_OBJECT = eINSTANCE.getCmrFieldTypeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Dewey Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getDeweyVersionType()
		 * @generated
		 */
		EDataType DEWEY_VERSION_TYPE = eINSTANCE.getDeweyVersionType();

		/**
		 * The meta object literal for the '<em>Ejb Class Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbClassTypeBase()
		 * @generated
		 */
		EDataType EJB_CLASS_TYPE_BASE = eINSTANCE.getEjbClassTypeBase();

		/**
		 * The meta object literal for the '<em>Ejb Link Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbLinkTypeBase()
		 * @generated
		 */
		EDataType EJB_LINK_TYPE_BASE = eINSTANCE.getEjbLinkTypeBase();

		/**
		 * The meta object literal for the '<em>Ejb Name Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbNameTypeBase()
		 * @generated
		 */
		EDataType EJB_NAME_TYPE_BASE = eINSTANCE.getEjbNameTypeBase();

		/**
		 * The meta object literal for the '<em>Ejb Ref Name Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefNameTypeBase()
		 * @generated
		 */
		EDataType EJB_REF_NAME_TYPE_BASE = eINSTANCE.getEjbRefNameTypeBase();

		/**
		 * The meta object literal for the '<em>Ejb Ref Type Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbRefTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEjbRefTypeTypeBaseObject()
		 * @generated
		 */
		EDataType EJB_REF_TYPE_TYPE_BASE_OBJECT = eINSTANCE.getEjbRefTypeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Env Entry Type Values Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryTypeValuesTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getEnvEntryTypeValuesTypeBaseObject()
		 * @generated
		 */
		EDataType ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT = eINSTANCE.getEnvEntryTypeValuesTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Fully Qualified Class Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getFullyQualifiedClassTypeBase()
		 * @generated
		 */
		EDataType FULLY_QUALIFIED_CLASS_TYPE_BASE = eINSTANCE.getFullyQualifiedClassTypeBase();

		/**
		 * The meta object literal for the '<em>Generic Boolean Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.GenericBooleanTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getGenericBooleanTypeBaseObject()
		 * @generated
		 */
		EDataType GENERIC_BOOLEAN_TYPE_BASE_OBJECT = eINSTANCE.getGenericBooleanTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Home Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getHomeTypeBase()
		 * @generated
		 */
		EDataType HOME_TYPE_BASE = eINSTANCE.getHomeTypeBase();

		/**
		 * The meta object literal for the '<em>Java Identifier Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaIdentifierTypeBase()
		 * @generated
		 */
		EDataType JAVA_IDENTIFIER_TYPE_BASE = eINSTANCE.getJavaIdentifierTypeBase();

		/**
		 * The meta object literal for the '<em>Java Type Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJavaTypeTypeBase()
		 * @generated
		 */
		EDataType JAVA_TYPE_TYPE_BASE = eINSTANCE.getJavaTypeTypeBase();

		/**
		 * The meta object literal for the '<em>Jndi Name Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getJndiNameTypeBase()
		 * @generated
		 */
		EDataType JNDI_NAME_TYPE_BASE = eINSTANCE.getJndiNameTypeBase();

		/**
		 * The meta object literal for the '<em>Local Home Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalHomeTypeBase()
		 * @generated
		 */
		EDataType LOCAL_HOME_TYPE_BASE = eINSTANCE.getLocalHomeTypeBase();

		/**
		 * The meta object literal for the '<em>Local Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getLocalTypeBase()
		 * @generated
		 */
		EDataType LOCAL_TYPE_BASE = eINSTANCE.getLocalTypeBase();

		/**
		 * The meta object literal for the '<em>Message Destination Link Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationLinkTypeBase()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_LINK_TYPE_BASE = eINSTANCE.getMessageDestinationLinkTypeBase();

		/**
		 * The meta object literal for the '<em>Message Destination Type Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationTypeTypeBase()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_TYPE_TYPE_BASE = eINSTANCE.getMessageDestinationTypeTypeBase();

		/**
		 * The meta object literal for the '<em>Message Destination Usage Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MessageDestinationUsageTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMessageDestinationUsageTypeBaseObject()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT = eINSTANCE.getMessageDestinationUsageTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Method Intf Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodIntfTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodIntfTypeBaseObject()
		 * @generated
		 */
		EDataType METHOD_INTF_TYPE_BASE_OBJECT = eINSTANCE.getMethodIntfTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Method Name Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMethodNameTypeBase()
		 * @generated
		 */
		EDataType METHOD_NAME_TYPE_BASE = eINSTANCE.getMethodNameTypeBase();

		/**
		 * The meta object literal for the '<em>Multiplicity Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.MultiplicityTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getMultiplicityTypeBaseObject()
		 * @generated
		 */
		EDataType MULTIPLICITY_TYPE_BASE_OBJECT = eINSTANCE.getMultiplicityTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Path Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPathTypeBase()
		 * @generated
		 */
		EDataType PATH_TYPE_BASE = eINSTANCE.getPathTypeBase();

		/**
		 * The meta object literal for the '<em>Persistence Type Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.PersistenceTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getPersistenceTypeTypeBaseObject()
		 * @generated
		 */
		EDataType PERSISTENCE_TYPE_TYPE_BASE_OBJECT = eINSTANCE.getPersistenceTypeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Remote Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRemoteTypeBase()
		 * @generated
		 */
		EDataType REMOTE_TYPE_BASE = eINSTANCE.getRemoteTypeBase();

		/**
		 * The meta object literal for the '<em>Res Auth Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResAuthTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResAuthTypeBaseObject()
		 * @generated
		 */
		EDataType RES_AUTH_TYPE_BASE_OBJECT = eINSTANCE.getResAuthTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Res Sharing Scope Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResSharingScopeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResSharingScopeTypeBaseObject()
		 * @generated
		 */
		EDataType RES_SHARING_SCOPE_TYPE_BASE_OBJECT = eINSTANCE.getResSharingScopeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Result Type Mapping Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.ResultTypeMappingTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getResultTypeMappingTypeBaseObject()
		 * @generated
		 */
		EDataType RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT = eINSTANCE.getResultTypeMappingTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Role Name Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getRoleNameTypeBase()
		 * @generated
		 */
		EDataType ROLE_NAME_TYPE_BASE = eINSTANCE.getRoleNameTypeBase();

		/**
		 * The meta object literal for the '<em>Session Type Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getSessionTypeTypeBaseObject()
		 * @generated
		 */
		EDataType SESSION_TYPE_TYPE_BASE_OBJECT = eINSTANCE.getSessionTypeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Transaction Type Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransactionTypeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransactionTypeTypeBaseObject()
		 * @generated
		 */
		EDataType TRANSACTION_TYPE_TYPE_BASE_OBJECT = eINSTANCE.getTransactionTypeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>Trans Attribute Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeTypeBase
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTransAttributeTypeBaseObject()
		 * @generated
		 */
		EDataType TRANS_ATTRIBUTE_TYPE_BASE_OBJECT = eINSTANCE.getTransAttributeTypeBaseObject();

		/**
		 * The meta object literal for the '<em>True False Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTrueFalseTypeBase()
		 * @generated
		 */
		EDataType TRUE_FALSE_TYPE_BASE = eINSTANCE.getTrueFalseTypeBase();

		/**
		 * The meta object literal for the '<em>True False Type Base Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.EjbJar21PackageImpl#getTrueFalseTypeBaseObject()
		 * @generated
		 */
		EDataType TRUE_FALSE_TYPE_BASE_OBJECT = eINSTANCE.getTrueFalseTypeBaseObject();

	}

} //EjbJar21Package
