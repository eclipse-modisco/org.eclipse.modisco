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
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

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
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Factory
 * @model kind="package"
 * @generated
 */
public interface EjbJar30Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EjbJar30"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Javaee/ejb-jar_3_0.xsd"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EjbJar30"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbJar30Package eINSTANCE = org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ActivationConfigPropertyTypeImpl <em>Activation Config Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ActivationConfigPropertyTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getActivationConfigPropertyType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ActivationConfigTypeImpl <em>Activation Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ActivationConfigTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getActivationConfigType()
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ApplicationExceptionTypeImpl <em>Application Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ApplicationExceptionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getApplicationExceptionType()
	 * @generated
	 */
	int APPLICATION_EXCEPTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Exception Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Rollback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION_TYPE__ROLLBACK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Application Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AroundInvokeTypeImpl <em>Around Invoke Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AroundInvokeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getAroundInvokeType()
	 * @generated
	 */
	int AROUND_INVOKE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_INVOKE_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_INVOKE_TYPE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Around Invoke Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_INVOKE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl <em>Assembly Descriptor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getAssemblyDescriptorType()
	 * @generated
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE = 4;

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
	 * The feature id for the '<em><b>Interceptor Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__INTERCEPTOR_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Message Destination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION = 4;

	/**
	 * The feature id for the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST = 5;

	/**
	 * The feature id for the '<em><b>Application Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__APPLICATION_EXCEPTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Assembly Descriptor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmpFieldTypeImpl <em>Cmp Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmpFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmpFieldType()
	 * @generated
	 */
	int CMP_FIELD_TYPE = 5;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.StringImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getString()
	 * @generated
	 */
	int STRING = 89;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmpVersionTypeImpl <em>Cmp Version Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmpVersionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmpVersionType()
	 * @generated
	 */
	int CMP_VERSION_TYPE = 6;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmrFieldTypeImpl <em>Cmr Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmrFieldTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmrFieldType()
	 * @generated
	 */
	int CMR_FIELD_TYPE = 7;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmrFieldTypeTypeImpl <em>Cmr Field Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.CmrFieldTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmrFieldTypeType()
	 * @generated
	 */
	int CMR_FIELD_TYPE_TYPE = 8;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ContainerTransactionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getContainerTransactionType()
	 * @generated
	 */
	int CONTAINER_TRANSACTION_TYPE = 9;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdStringTypeImpl <em>Xsd String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdStringTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdStringType()
	 * @generated
	 */
	int XSD_STRING_TYPE = 101;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.DescriptionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 10;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.DisplayNameTypeImpl <em>Display Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.DisplayNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getDisplayNameType()
	 * @generated
	 */
	int DISPLAY_NAME_TYPE = 11;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.DocumentRootImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.FullyQualifiedClassTypeImpl <em>Fully Qualified Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.FullyQualifiedClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getFullyQualifiedClassType()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE = 29;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbClassTypeImpl <em>Ejb Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbClassTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbClassType()
	 * @generated
	 */
	int EJB_CLASS_TYPE = 13;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl <em>Ejb Jar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJarTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbJarType()
	 * @generated
	 */
	int EJB_JAR_TYPE = 14;

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
	 * The feature id for the '<em><b>Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__INTERCEPTORS = 4;

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
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__METADATA_COMPLETE = 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE__VERSION = 10;

	/**
	 * The number of structural features of the '<em>Ejb Jar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbLinkTypeImpl <em>Ejb Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbLinkType()
	 * @generated
	 */
	int EJB_LINK_TYPE = 15;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbLocalRefTypeImpl <em>Ejb Local Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbLocalRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbLocalRefType()
	 * @generated
	 */
	int EJB_LOCAL_REF_TYPE = 16;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__MAPPED_NAME = 6;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__INJECTION_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE__ID = 8;

	/**
	 * The number of structural features of the '<em>Ejb Local Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdNMTOKENTypeImpl <em>Xsd NMTOKEN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdNMTOKENTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdNMTOKENType()
	 * @generated
	 */
	int XSD_NMTOKEN_TYPE = 97;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbNameTypeImpl <em>Ejb Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbNameType()
	 * @generated
	 */
	int EJB_NAME_TYPE = 17;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.JndiNameTypeImpl <em>Jndi Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.JndiNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getJndiNameType()
	 * @generated
	 */
	int JNDI_NAME_TYPE = 41;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRefNameTypeImpl <em>Ejb Ref Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRefNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 18;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRefTypeImpl <em>Ejb Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 19;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__MAPPED_NAME = 6;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__INJECTION_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE__ID = 8;

	/**
	 * The number of structural features of the '<em>Ejb Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRefTypeTypeImpl <em>Ejb Ref Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRefTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRefTypeType()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE = 20;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationshipRoleTypeImpl <em>Ejb Relationship Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationshipRoleTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRelationshipRoleType()
	 * @generated
	 */
	int EJB_RELATIONSHIP_ROLE_TYPE = 21;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationTypeImpl <em>Ejb Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRelationType()
	 * @generated
	 */
	int EJB_RELATION_TYPE = 22;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EmptyTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 23;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EnterpriseBeansTypeImpl <em>Enterprise Beans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EnterpriseBeansTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEnterpriseBeansType()
	 * @generated
	 */
	int ENTERPRISE_BEANS_TYPE = 24;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EntityBeanTypeImpl <em>Entity Bean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EntityBeanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEntityBeanType()
	 * @generated
	 */
	int ENTITY_BEAN_TYPE = 25;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__HOME = 5;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__REMOTE = 6;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__LOCAL_HOME = 7;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__LOCAL = 8;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__EJB_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PERSISTENCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Prim Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PRIM_KEY_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__REENTRANT = 12;

	/**
	 * The feature id for the '<em><b>Cmp Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__CMP_VERSION = 13;

	/**
	 * The feature id for the '<em><b>Abstract Schema Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME = 14;

	/**
	 * The feature id for the '<em><b>Cmp Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__CMP_FIELD = 15;

	/**
	 * The feature id for the '<em><b>Primkey Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PRIMKEY_FIELD = 16;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__ENV_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__EJB_REF = 18;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__EJB_LOCAL_REF = 19;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__SERVICE_REF = 20;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__RESOURCE_REF = 21;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__RESOURCE_ENV_REF = 22;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF = 23;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PERSISTENCE_CONTEXT_REF = 24;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PERSISTENCE_UNIT_REF = 25;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__POST_CONSTRUCT = 26;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__PRE_DESTROY = 27;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__SECURITY_ROLE_REF = 28;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__SECURITY_IDENTITY = 29;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__QUERY = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE__ID = 31;

	/**
	 * The number of structural features of the '<em>Entity Bean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EnvEntryTypeImpl <em>Env Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EnvEntryTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 26;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__INJECTION_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Env Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EnvEntryTypeValuesTypeImpl <em>Env Entry Type Values Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EnvEntryTypeValuesTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEnvEntryTypeValuesType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE = 27;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ExcludeListTypeImpl <em>Exclude List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ExcludeListTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getExcludeListType()
	 * @generated
	 */
	int EXCLUDE_LIST_TYPE = 28;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.GenericBooleanTypeImpl <em>Generic Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.GenericBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getGenericBooleanType()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE = 30;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.HomeTypeImpl <em>Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.HomeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getHomeType()
	 * @generated
	 */
	int HOME_TYPE = 31;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.IconTypeImpl <em>Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.IconTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 32;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InitMethodTypeImpl <em>Init Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InitMethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getInitMethodType()
	 * @generated
	 */
	int INIT_METHOD_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Create Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE__CREATE_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Bean Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE__BEAN_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Init Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InjectionTargetTypeImpl <em>Injection Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InjectionTargetTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getInjectionTargetType()
	 * @generated
	 */
	int INJECTION_TARGET_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Injection Target Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Injection Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME = 1;

	/**
	 * The number of structural features of the '<em>Injection Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorBindingTypeImpl <em>Interceptor Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorBindingTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getInterceptorBindingType()
	 * @generated
	 */
	int INTERCEPTOR_BINDING_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__EJB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Interceptor Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Interceptor Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER = 3;

	/**
	 * The feature id for the '<em><b>Exclude Default Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS = 4;

	/**
	 * The feature id for the '<em><b>Exclude Class Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS = 5;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__METHOD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Interceptor Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorOrderTypeImpl <em>Interceptor Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorOrderTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getInterceptorOrderType()
	 * @generated
	 */
	int INTERCEPTOR_ORDER_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Interceptor Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_ORDER_TYPE__INTERCEPTOR_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_ORDER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Interceptor Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_ORDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorsTypeImpl <em>Interceptors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getInterceptorsType()
	 * @generated
	 */
	int INTERCEPTORS_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Interceptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE__INTERCEPTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Interceptors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorTypeImpl <em>Interceptor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.InterceptorTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getInterceptorType()
	 * @generated
	 */
	int INTERCEPTOR_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Interceptor Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__INTERCEPTOR_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Around Invoke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__AROUND_INVOKE = 2;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__ENV_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__EJB_REF = 4;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__EJB_LOCAL_REF = 5;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__SERVICE_REF = 6;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__RESOURCE_REF = 7;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__RESOURCE_ENV_REF = 8;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REF = 9;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REF = 10;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REF = 11;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__POST_CONSTRUCT = 12;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PRE_DESTROY = 13;

	/**
	 * The feature id for the '<em><b>Post Activate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__POST_ACTIVATE = 14;

	/**
	 * The feature id for the '<em><b>Pre Passivate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PRE_PASSIVATE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__ID = 16;

	/**
	 * The number of structural features of the '<em>Interceptor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.JavaIdentifierTypeImpl <em>Java Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.JavaIdentifierTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getJavaIdentifierType()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE = 39;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.JavaTypeTypeImpl <em>Java Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.JavaTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getJavaTypeType()
	 * @generated
	 */
	int JAVA_TYPE_TYPE = 40;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.LifecycleCallbackTypeImpl <em>Lifecycle Callback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.LifecycleCallbackTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getLifecycleCallbackType()
	 * @generated
	 */
	int LIFECYCLE_CALLBACK_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Lifecycle Callback Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Lifecycle Callback Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Lifecycle Callback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ListenerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getListenerType()
	 * @generated
	 */
	int LISTENER_TYPE = 43;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.LocalHomeTypeImpl <em>Local Home Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.LocalHomeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getLocalHomeType()
	 * @generated
	 */
	int LOCAL_HOME_TYPE = 44;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.LocalTypeImpl <em>Local Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.LocalTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getLocalType()
	 * @generated
	 */
	int LOCAL_TYPE = 45;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationLinkTypeImpl <em>Message Destination Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationLinkTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationLinkType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE = 46;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl <em>Message Destination Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationRefType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_REF_TYPE = 47;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Message Destination Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationTypeImpl <em>Message Destination Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE = 48;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Message Destination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationTypeTypeImpl <em>Message Destination Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationTypeType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE = 49;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationUsageTypeImpl <em>Message Destination Usage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationUsageTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationUsageType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE = 50;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDrivenBeanTypeImpl <em>Message Driven Bean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDrivenBeanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDrivenBeanType()
	 * @generated
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE = 51;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Messaging Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Timeout Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Message Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Message Destination Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK = 10;

	/**
	 * The feature id for the '<em><b>Activation Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Around Invoke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__AROUND_INVOKE = 12;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF = 14;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF = 15;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF = 16;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF = 17;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF = 18;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF = 19;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_CONTEXT_REF = 20;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_UNIT_REF = 21;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__POST_CONSTRUCT = 22;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__PRE_DESTROY = 23;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE__ID = 25;

	/**
	 * The number of structural features of the '<em>Message Driven Bean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodIntfTypeImpl <em>Method Intf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodIntfTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodIntfType()
	 * @generated
	 */
	int METHOD_INTF_TYPE = 52;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodNameTypeImpl <em>Method Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodNameType()
	 * @generated
	 */
	int METHOD_NAME_TYPE = 53;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodParamsTypeImpl <em>Method Params Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodParamsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodParamsType()
	 * @generated
	 */
	int METHOD_PARAMS_TYPE = 54;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodPermissionTypeImpl <em>Method Permission Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodPermissionTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodPermissionType()
	 * @generated
	 */
	int METHOD_PERMISSION_TYPE = 55;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 56;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MultiplicityTypeImpl <em>Multiplicity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MultiplicityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMultiplicityType()
	 * @generated
	 */
	int MULTIPLICITY_TYPE = 57;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.NamedMethodTypeImpl <em>Named Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.NamedMethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getNamedMethodType()
	 * @generated
	 */
	int NAMED_METHOD_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE__METHOD_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Named Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ParamValueTypeImpl <em>Param Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ParamValueTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getParamValueType()
	 * @generated
	 */
	int PARAM_VALUE_TYPE = 59;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PathTypeImpl <em>Path Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PathTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPathType()
	 * @generated
	 */
	int PATH_TYPE = 60;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceContextRefTypeImpl <em>Persistence Context Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceContextRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceContextRefType()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Persistence Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Persistence Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceContextTypeTypeImpl <em>Persistence Context Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceContextTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceContextTypeType()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE__VALUE = STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceTypeTypeImpl <em>Persistence Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceTypeType()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE = 63;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceUnitRefTypeImpl <em>Persistence Unit Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PersistenceUnitRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceUnitRefType()
	 * @generated
	 */
	int PERSISTENCE_UNIT_REF_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__PERSISTENCE_UNIT_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__PERSISTENCE_UNIT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__MAPPED_NAME = 3;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__INJECTION_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Persistence Unit Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PortComponentRefTypeImpl <em>Port Component Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PortComponentRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPortComponentRefType()
	 * @generated
	 */
	int PORT_COMPONENT_REF_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Service Endpoint Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__SERVICE_ENDPOINT_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Enable Mtom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__ENABLE_MTOM = 1;

	/**
	 * The feature id for the '<em><b>Port Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__PORT_COMPONENT_LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Port Component Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.PropertyTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryMethodTypeImpl <em>Query Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryMethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getQueryMethodType()
	 * @generated
	 */
	int QUERY_METHOD_TYPE = 67;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 68;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RelationshipRoleSourceTypeImpl <em>Relationship Role Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RelationshipRoleSourceTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRelationshipRoleSourceType()
	 * @generated
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE = 69;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RelationshipsTypeImpl <em>Relationships Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RelationshipsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRelationshipsType()
	 * @generated
	 */
	int RELATIONSHIPS_TYPE = 70;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RemoteTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRemoteType()
	 * @generated
	 */
	int REMOTE_TYPE = 71;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RemoveMethodTypeImpl <em>Remove Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RemoveMethodTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRemoveMethodType()
	 * @generated
	 */
	int REMOVE_METHOD_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Bean Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE__BEAN_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Retain If Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Remove Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResAuthTypeImpl <em>Res Auth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResAuthTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 73;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResourceEnvRefTypeImpl <em>Resource Env Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResourceEnvRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResourceEnvRefType()
	 * @generated
	 */
	int RESOURCE_ENV_REF_TYPE = 74;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__MAPPED_NAME = 3;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__INJECTION_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Resource Env Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResourceRefTypeImpl <em>Resource Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResourceRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResourceRefType()
	 * @generated
	 */
	int RESOURCE_REF_TYPE = 75;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__INJECTION_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Resource Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResSharingScopeTypeImpl <em>Res Sharing Scope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResSharingScopeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResSharingScopeType()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE = 76;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResultTypeMappingTypeImpl <em>Result Type Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ResultTypeMappingTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResultTypeMappingType()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE = 77;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RoleNameTypeImpl <em>Role Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RoleNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRoleNameType()
	 * @generated
	 */
	int ROLE_NAME_TYPE = 78;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RunAsTypeImpl <em>Run As Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.RunAsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRunAsType()
	 * @generated
	 */
	int RUN_AS_TYPE = 79;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityIdentityTypeImpl <em>Security Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityIdentityTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getSecurityIdentityType()
	 * @generated
	 */
	int SECURITY_IDENTITY_TYPE = 80;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityRoleRefTypeImpl <em>Security Role Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityRoleRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getSecurityRoleRefType()
	 * @generated
	 */
	int SECURITY_ROLE_REF_TYPE = 81;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityRoleTypeImpl <em>Security Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityRoleTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 82;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerChainsTypeImpl <em>Service Ref Handler Chains Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerChainsTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefHandlerChainsType()
	 * @generated
	 */
	int SERVICE_REF_HANDLER_CHAINS_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Handler Chain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAINS_TYPE__HANDLER_CHAIN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAINS_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Service Ref Handler Chains Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAINS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerChainTypeImpl <em>Service Ref Handler Chain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerChainTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefHandlerChainType()
	 * @generated
	 */
	int SERVICE_REF_HANDLER_CHAIN_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Service Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Port Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Protocol Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Service Ref Handler Chain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl <em>Service Ref Handler Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefHandlerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefHandlerType()
	 * @generated
	 */
	int SERVICE_REF_HANDLER_TYPE = 85;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefTypeImpl <em>Service Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.ServiceRefTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefType()
	 * @generated
	 */
	int SERVICE_REF_TYPE = 86;

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
	 * The feature id for the '<em><b>Service Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_REF_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__WSDL_FILE = 6;

	/**
	 * The feature id for the '<em><b>Jaxrpc Mapping File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__JAXRPC_MAPPING_FILE = 7;

	/**
	 * The feature id for the '<em><b>Service Qname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_QNAME = 8;

	/**
	 * The feature id for the '<em><b>Port Component Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__PORT_COMPONENT_REF = 9;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__HANDLER = 10;

	/**
	 * The feature id for the '<em><b>Handler Chains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__HANDLER_CHAINS = 11;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__MAPPED_NAME = 12;

	/**
	 * The feature id for the '<em><b>Injection Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__INJECTION_TARGET = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__ID = 14;

	/**
	 * The number of structural features of the '<em>Service Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SessionBeanTypeImpl <em>Session Bean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SessionBeanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getSessionBeanType()
	 * @generated
	 */
	int SESSION_BEAN_TYPE = 87;

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
	 * The feature id for the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__HOME = 5;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__REMOTE = 6;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__LOCAL_HOME = 7;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__LOCAL = 8;

	/**
	 * The feature id for the '<em><b>Business Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__BUSINESS_LOCAL = 9;

	/**
	 * The feature id for the '<em><b>Business Remote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__BUSINESS_REMOTE = 10;

	/**
	 * The feature id for the '<em><b>Service Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SERVICE_ENDPOINT = 11;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__EJB_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SESSION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Timeout Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__TIMEOUT_METHOD = 14;

	/**
	 * The feature id for the '<em><b>Init Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__INIT_METHOD = 15;

	/**
	 * The feature id for the '<em><b>Remove Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__REMOVE_METHOD = 16;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__TRANSACTION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Around Invoke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__AROUND_INVOKE = 18;

	/**
	 * The feature id for the '<em><b>Env Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__ENV_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__EJB_REF = 20;

	/**
	 * The feature id for the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__EJB_LOCAL_REF = 21;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SERVICE_REF = 22;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__RESOURCE_REF = 23;

	/**
	 * The feature id for the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__RESOURCE_ENV_REF = 24;

	/**
	 * The feature id for the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF = 25;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__PERSISTENCE_CONTEXT_REF = 26;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__PERSISTENCE_UNIT_REF = 27;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__POST_CONSTRUCT = 28;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__PRE_DESTROY = 29;

	/**
	 * The feature id for the '<em><b>Post Activate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__POST_ACTIVATE = 30;

	/**
	 * The feature id for the '<em><b>Pre Passivate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__PRE_PASSIVATE = 31;

	/**
	 * The feature id for the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SECURITY_ROLE_REF = 32;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__SECURITY_IDENTITY = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE__ID = 34;

	/**
	 * The number of structural features of the '<em>Session Bean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_TYPE_FEATURE_COUNT = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SessionTypeTypeImpl <em>Session Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SessionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getSessionTypeType()
	 * @generated
	 */
	int SESSION_TYPE_TYPE = 88;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.TransactionTypeTypeImpl <em>Transaction Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.TransactionTypeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTransactionTypeType()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE = 90;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.TransAttributeTypeImpl <em>Trans Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.TransAttributeTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTransAttributeType()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE = 91;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdBooleanTypeImpl <em>Xsd Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdBooleanTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdBooleanType()
	 * @generated
	 */
	int XSD_BOOLEAN_TYPE = 95;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.TrueFalseTypeImpl <em>True False Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.TrueFalseTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTrueFalseType()
	 * @generated
	 */
	int TRUE_FALSE_TYPE = 92;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.UrlPatternTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getUrlPatternType()
	 * @generated
	 */
	int URL_PATTERN_TYPE = 93;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdAnyURITypeImpl <em>Xsd Any URI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdAnyURITypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdAnyURIType()
	 * @generated
	 */
	int XSD_ANY_URI_TYPE = 94;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdIntegerTypeImpl <em>Xsd Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdIntegerType()
	 * @generated
	 */
	int XSD_INTEGER_TYPE = 96;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdNonNegativeIntegerTypeImpl <em>Xsd Non Negative Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdNonNegativeIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdNonNegativeIntegerType()
	 * @generated
	 */
	int XSD_NON_NEGATIVE_INTEGER_TYPE = 98;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdPositiveIntegerTypeImpl <em>Xsd Positive Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdPositiveIntegerTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdPositiveIntegerType()
	 * @generated
	 */
	int XSD_POSITIVE_INTEGER_TYPE = 99;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdQNameTypeImpl <em>Xsd QName Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.XsdQNameTypeImpl
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getXsdQNameType()
	 * @generated
	 */
	int XSD_QNAME_TYPE = 100;

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
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase <em>Cmp Version Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmpVersionTypeBase()
	 * @generated
	 */
	int CMP_VERSION_TYPE_BASE = 102;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase <em>Cmr Field Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmrFieldTypeTypeBase()
	 * @generated
	 */
	int CMR_FIELD_TYPE_TYPE_BASE = 103;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRefTypeTypeBase()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE = 104;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEnvEntryTypeValuesTypeBase()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_BASE = 105;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getGenericBooleanTypeBase()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE = 106;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationUsageTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE = 107;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase <em>Method Intf Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodIntfTypeBase()
	 * @generated
	 */
	int METHOD_INTF_TYPE_BASE = 108;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase <em>Multiplicity Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMultiplicityTypeBase()
	 * @generated
	 */
	int MULTIPLICITY_TYPE_BASE = 109;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase <em>Persistence Context Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceContextTypeTypeBase()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE_BASE = 110;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase <em>Persistence Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceTypeTypeBase()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE_BASE = 111;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase <em>Res Auth Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResAuthTypeBase()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE = 112;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResSharingScopeTypeBase()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE = 113;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase <em>Result Type Mapping Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResultTypeMappingTypeBase()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE_BASE = 114;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase <em>Session Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getSessionTypeTypeBase()
	 * @generated
	 */
	int SESSION_TYPE_TYPE_BASE = 115;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase <em>Transaction Type Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTransactionTypeTypeBase()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE_BASE = 116;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase <em>Trans Attribute Type Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTransAttributeTypeBase()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE_BASE = 117;

	/**
	 * The meta object id for the '<em>Cmp Version Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmpVersionTypeBaseObject()
	 * @generated
	 */
	int CMP_VERSION_TYPE_BASE_OBJECT = 118;

	/**
	 * The meta object id for the '<em>Cmr Field Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getCmrFieldTypeTypeBaseObject()
	 * @generated
	 */
	int CMR_FIELD_TYPE_TYPE_BASE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Dewey Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getDeweyVersionType()
	 * @generated
	 */
	int DEWEY_VERSION_TYPE = 120;

	/**
	 * The meta object id for the '<em>Ejb Class Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbClassTypeBase()
	 * @generated
	 */
	int EJB_CLASS_TYPE_BASE = 121;

	/**
	 * The meta object id for the '<em>Ejb Link Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbLinkTypeBase()
	 * @generated
	 */
	int EJB_LINK_TYPE_BASE = 122;

	/**
	 * The meta object id for the '<em>Ejb Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbNameTypeBase()
	 * @generated
	 */
	int EJB_NAME_TYPE_BASE = 123;

	/**
	 * The meta object id for the '<em>Ejb Ref Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRefNameTypeBase()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE_BASE = 124;

	/**
	 * The meta object id for the '<em>Ejb Ref Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEjbRefTypeTypeBaseObject()
	 * @generated
	 */
	int EJB_REF_TYPE_TYPE_BASE_OBJECT = 125;

	/**
	 * The meta object id for the '<em>Env Entry Type Values Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getEnvEntryTypeValuesTypeBaseObject()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_VALUES_TYPE_BASE_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Fully Qualified Class Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getFullyQualifiedClassTypeBase()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE_BASE = 127;

	/**
	 * The meta object id for the '<em>Generic Boolean Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getGenericBooleanTypeBaseObject()
	 * @generated
	 */
	int GENERIC_BOOLEAN_TYPE_BASE_OBJECT = 128;

	/**
	 * The meta object id for the '<em>Home Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getHomeTypeBase()
	 * @generated
	 */
	int HOME_TYPE_BASE = 129;

	/**
	 * The meta object id for the '<em>Java Identifier Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getJavaIdentifierTypeBase()
	 * @generated
	 */
	int JAVA_IDENTIFIER_TYPE_BASE = 130;

	/**
	 * The meta object id for the '<em>Java Type Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getJavaTypeTypeBase()
	 * @generated
	 */
	int JAVA_TYPE_TYPE_BASE = 131;

	/**
	 * The meta object id for the '<em>Jndi Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getJndiNameTypeBase()
	 * @generated
	 */
	int JNDI_NAME_TYPE_BASE = 132;

	/**
	 * The meta object id for the '<em>Local Home Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getLocalHomeTypeBase()
	 * @generated
	 */
	int LOCAL_HOME_TYPE_BASE = 133;

	/**
	 * The meta object id for the '<em>Local Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getLocalTypeBase()
	 * @generated
	 */
	int LOCAL_TYPE_BASE = 134;

	/**
	 * The meta object id for the '<em>Message Destination Link Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationLinkTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK_TYPE_BASE = 135;

	/**
	 * The meta object id for the '<em>Message Destination Type Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationTypeTypeBase()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE_BASE = 136;

	/**
	 * The meta object id for the '<em>Message Destination Usage Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMessageDestinationUsageTypeBaseObject()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_BASE_OBJECT = 137;

	/**
	 * The meta object id for the '<em>Method Intf Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodIntfTypeBaseObject()
	 * @generated
	 */
	int METHOD_INTF_TYPE_BASE_OBJECT = 138;

	/**
	 * The meta object id for the '<em>Method Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMethodNameTypeBase()
	 * @generated
	 */
	int METHOD_NAME_TYPE_BASE = 139;

	/**
	 * The meta object id for the '<em>Multiplicity Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getMultiplicityTypeBaseObject()
	 * @generated
	 */
	int MULTIPLICITY_TYPE_BASE_OBJECT = 140;

	/**
	 * The meta object id for the '<em>Path Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPathTypeBase()
	 * @generated
	 */
	int PATH_TYPE_BASE = 141;

	/**
	 * The meta object id for the '<em>Persistence Context Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceContextTypeTypeBaseObject()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE_TYPE_BASE_OBJECT = 142;

	/**
	 * The meta object id for the '<em>Persistence Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getPersistenceTypeTypeBaseObject()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE_BASE_OBJECT = 143;

	/**
	 * The meta object id for the '<em>Remote Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRemoteTypeBase()
	 * @generated
	 */
	int REMOTE_TYPE_BASE = 144;

	/**
	 * The meta object id for the '<em>Res Auth Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResAuthTypeBaseObject()
	 * @generated
	 */
	int RES_AUTH_TYPE_BASE_OBJECT = 145;

	/**
	 * The meta object id for the '<em>Res Sharing Scope Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResSharingScopeTypeBaseObject()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_BASE_OBJECT = 146;

	/**
	 * The meta object id for the '<em>Result Type Mapping Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getResultTypeMappingTypeBaseObject()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE_BASE_OBJECT = 147;

	/**
	 * The meta object id for the '<em>Role Name Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getRoleNameTypeBase()
	 * @generated
	 */
	int ROLE_NAME_TYPE_BASE = 148;

	/**
	 * The meta object id for the '<em>Service Ref Protocol Binding List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefProtocolBindingListType()
	 * @generated
	 */
	int SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE = 149;

	/**
	 * The meta object id for the '<em>Service Ref Protocol Binding Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefProtocolBindingType()
	 * @generated
	 */
	int SERVICE_REF_PROTOCOL_BINDING_TYPE = 150;

	/**
	 * The meta object id for the '<em>Service Ref Protocol URI Alias Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefProtocolURIAliasType()
	 * @generated
	 */
	int SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE = 151;

	/**
	 * The meta object id for the '<em>Service Ref Qname Pattern</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getServiceRefQnamePattern()
	 * @generated
	 */
	int SERVICE_REF_QNAME_PATTERN = 152;

	/**
	 * The meta object id for the '<em>Session Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getSessionTypeTypeBaseObject()
	 * @generated
	 */
	int SESSION_TYPE_TYPE_BASE_OBJECT = 153;

	/**
	 * The meta object id for the '<em>Transaction Type Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTransactionTypeTypeBaseObject()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE_BASE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>Trans Attribute Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTransAttributeTypeBaseObject()
	 * @generated
	 */
	int TRANS_ATTRIBUTE_TYPE_BASE_OBJECT = 155;

	/**
	 * The meta object id for the '<em>True False Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTrueFalseTypeBase()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE = 156;

	/**
	 * The meta object id for the '<em>True False Type Base Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbJar30PackageImpl#getTrueFalseTypeBaseObject()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_BASE_OBJECT = 157;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType <em>Activation Config Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Config Property Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType
	 * @generated
	 */
	EClass getActivationConfigPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyName <em>Activation Config Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Config Property Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyName()
	 * @see #getActivationConfigPropertyType()
	 * @generated
	 */
	EReference getActivationConfigPropertyType_ActivationConfigPropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyValue <em>Activation Config Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Config Property Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyValue()
	 * @see #getActivationConfigPropertyType()
	 * @generated
	 */
	EReference getActivationConfigPropertyType_ActivationConfigPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getId()
	 * @see #getActivationConfigPropertyType()
	 * @generated
	 */
	EAttribute getActivationConfigPropertyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType <em>Activation Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Config Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType
	 * @generated
	 */
	EClass getActivationConfigType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType#getDescription()
	 * @see #getActivationConfigType()
	 * @generated
	 */
	EReference getActivationConfigType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType#getActivationConfigProperty <em>Activation Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Config Property</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType#getActivationConfigProperty()
	 * @see #getActivationConfigType()
	 * @generated
	 */
	EReference getActivationConfigType_ActivationConfigProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType#getId()
	 * @see #getActivationConfigType()
	 * @generated
	 */
	EAttribute getActivationConfigType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType <em>Application Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Exception Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType
	 * @generated
	 */
	EClass getApplicationExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getExceptionClass <em>Exception Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getExceptionClass()
	 * @see #getApplicationExceptionType()
	 * @generated
	 */
	EReference getApplicationExceptionType_ExceptionClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getRollback <em>Rollback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rollback</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getRollback()
	 * @see #getApplicationExceptionType()
	 * @generated
	 */
	EReference getApplicationExceptionType_Rollback();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getId()
	 * @see #getApplicationExceptionType()
	 * @generated
	 */
	EAttribute getApplicationExceptionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType <em>Around Invoke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Around Invoke Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType
	 * @generated
	 */
	EClass getAroundInvokeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType#getClass_()
	 * @see #getAroundInvokeType()
	 * @generated
	 */
	EReference getAroundInvokeType_Class();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType#getMethodName()
	 * @see #getAroundInvokeType()
	 * @generated
	 */
	EReference getAroundInvokeType_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType <em>Assembly Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Descriptor Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType
	 * @generated
	 */
	EClass getAssemblyDescriptorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getSecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getSecurityRole()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_SecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getMethodPermission <em>Method Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Permission</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getMethodPermission()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_MethodPermission();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getContainerTransaction <em>Container Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Transaction</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getContainerTransaction()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ContainerTransaction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getInterceptorBinding <em>Interceptor Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interceptor Binding</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getInterceptorBinding()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_InterceptorBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getMessageDestination <em>Message Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getMessageDestination()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_MessageDestination();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getExcludeList <em>Exclude List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude List</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getExcludeList()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ExcludeList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getApplicationException <em>Application Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Exception</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getApplicationException()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EReference getAssemblyDescriptorType_ApplicationException();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getId()
	 * @see #getAssemblyDescriptorType()
	 * @generated
	 */
	EAttribute getAssemblyDescriptorType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType <em>Cmp Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType
	 * @generated
	 */
	EClass getCmpFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType#getDescription()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType#getFieldName()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EReference getCmpFieldType_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType#getId()
	 * @see #getCmpFieldType()
	 * @generated
	 */
	EAttribute getCmpFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionType <em>Cmp Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Version Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionType
	 * @generated
	 */
	EClass getCmpVersionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType
	 * @generated
	 */
	EClass getCmrFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getDescription()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getCmrFieldName <em>Cmr Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getCmrFieldName()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_CmrFieldName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getCmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getCmrFieldType()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EReference getCmrFieldType_CmrFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType#getId()
	 * @see #getCmrFieldType()
	 * @generated
	 */
	EAttribute getCmrFieldType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeType <em>Cmr Field Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmr Field Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeType
	 * @generated
	 */
	EClass getCmrFieldTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType <em>Container Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType
	 * @generated
	 */
	EClass getContainerTransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getDescription()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getMethod()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getTransAttribute <em>Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trans Attribute</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getTransAttribute()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_TransAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType#getId()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EAttribute getContainerTransactionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType#getLang()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType
	 * @generated
	 */
	EClass getDisplayNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType#getLang()
	 * @see #getDisplayNameType()
	 * @generated
	 */
	EAttribute getDisplayNameType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getEjbJar <em>Ejb Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot#getEjbJar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbJar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbClassType <em>Ejb Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbClassType
	 * @generated
	 */
	EClass getEjbClassType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType <em>Ejb Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Jar Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType
	 * @generated
	 */
	EClass getEjbJarType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getDescription()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getDisplayName()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getIcon()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enterprise Beans</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEnterpriseBeans()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EnterpriseBeans();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getInterceptors <em>Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interceptors</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getInterceptors()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Interceptors();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationships</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getRelationships()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_Relationships();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getAssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getAssemblyDescriptor()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_AssemblyDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEjbClientJar <em>Ejb Client Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Client Jar</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEjbClientJar()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EReference getEjbJarType_EjbClientJar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getId()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EAttribute getEjbJarType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#isMetadataComplete()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EAttribute getEjbJarType_MetadataComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getVersion()
	 * @see #getEjbJarType()
	 * @generated
	 */
	EAttribute getEjbJarType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLinkType
	 * @generated
	 */
	EClass getEjbLinkType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Local Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType
	 * @generated
	 */
	EClass getEjbLocalRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getDescription()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getEjbRefName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getEjbRefType()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getLocalHome()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getLocal()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getEjbLink()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getMappedName()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getInjectionTarget()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EReference getEjbLocalRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType#getId()
	 * @see #getEjbLocalRefType()
	 * @generated
	 */
	EAttribute getEjbLocalRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbNameType <em>Ejb Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbNameType
	 * @generated
	 */
	EClass getEjbNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefNameType
	 * @generated
	 */
	EClass getEjbRefNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType
	 * @generated
	 */
	EClass getEjbRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getDescription()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getEjbRefName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getHome()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getRemote()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getEjbLink()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_EjbLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getMappedName()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getInjectionTarget()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EReference getEjbRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType#getId()
	 * @see #getEjbRefType()
	 * @generated
	 */
	EAttribute getEjbRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeType
	 * @generated
	 */
	EClass getEjbRefTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType <em>Ejb Relationship Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relationship Role Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType
	 * @generated
	 */
	EClass getEjbRelationshipRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getDescription()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getEjbRelationshipRoleName()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_EjbRelationshipRoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getMultiplicity()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCascadeDelete <em>Cascade Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Delete</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCascadeDelete()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_CascadeDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getRelationshipRoleSource <em>Relationship Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Role Source</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getRelationshipRoleSource()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_RelationshipRoleSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCmrField <em>Cmr Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCmrField()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EReference getEjbRelationshipRoleType_CmrField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getId()
	 * @see #getEjbRelationshipRoleType()
	 * @generated
	 */
	EAttribute getEjbRelationshipRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType <em>Ejb Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Relation Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType
	 * @generated
	 */
	EClass getEjbRelationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getDescription()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getEjbRelationName <em>Ejb Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relation Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getEjbRelationName()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getEjbRelationshipRole <em>Ejb Relationship Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getEjbRelationshipRole()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationshipRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role1</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getEjbRelationshipRole1()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EReference getEjbRelationType_EjbRelationshipRole1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType#getId()
	 * @see #getEjbRelationType()
	 * @generated
	 */
	EAttribute getEjbRelationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType#getId()
	 * @see #getEmptyType()
	 * @generated
	 */
	EAttribute getEmptyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType <em>Enterprise Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Beans Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType
	 * @generated
	 */
	EClass getEnterpriseBeansType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getGroup()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getSession()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Session();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getEntity()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getMessageDriven <em>Message Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Driven</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getMessageDriven()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EReference getEnterpriseBeansType_MessageDriven();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType#getId()
	 * @see #getEnterpriseBeansType()
	 * @generated
	 */
	EAttribute getEnterpriseBeansType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType <em>Entity Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Bean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType
	 * @generated
	 */
	EClass getEntityBeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getDescription()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getDisplayName()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getIcon()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbName()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getMappedName()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_MappedName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getHome()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getRemote()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getLocalHome()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getLocal()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Local();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbClass()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPersistenceType()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PersistenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPrimKeyClass <em>Prim Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prim Key Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPrimKeyClass()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PrimKeyClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reentrant</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getReentrant()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Reentrant();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getCmpVersion <em>Cmp Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmp Version</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getCmpVersion()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_CmpVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getAbstractSchemaName <em>Abstract Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Schema Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getAbstractSchemaName()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_AbstractSchemaName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getCmpField <em>Cmp Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmp Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getCmpField()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_CmpField();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPrimkeyField <em>Primkey Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primkey Field</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPrimkeyField()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PrimkeyField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEnvEntry()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getEjbLocalRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getServiceRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getResourceRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getResourceEnvRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getMessageDestinationRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPersistenceContextRef <em>Persistence Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPersistenceContextRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PersistenceContextRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPersistenceUnitRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PersistenceUnitRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPostConstruct <em>Post Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Construct</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPostConstruct()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PostConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPreDestroy <em>Pre Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroy</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getPreDestroy()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_PreDestroy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getSecurityRoleRef()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getSecurityIdentity()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_SecurityIdentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getQuery()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EReference getEntityBeanType_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType#getId()
	 * @see #getEntityBeanType()
	 * @generated
	 */
	EAttribute getEntityBeanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType
	 * @generated
	 */
	EClass getEnvEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getDescription()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getEnvEntryName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getEnvEntryType()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Entry Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getEnvEntryValue()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_EnvEntryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getMappedName()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getInjectionTarget()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EReference getEnvEntryType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType#getId()
	 * @see #getEnvEntryType()
	 * @generated
	 */
	EAttribute getEnvEntryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry Type Values Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesType
	 * @generated
	 */
	EClass getEnvEntryTypeValuesType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType <em>Exclude List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude List Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType
	 * @generated
	 */
	EClass getExcludeListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType#getDescription()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EReference getExcludeListType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType#getMethod()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EReference getExcludeListType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType#getId()
	 * @see #getExcludeListType()
	 * @generated
	 */
	EAttribute getExcludeListType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fully Qualified Class Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType
	 * @generated
	 */
	EClass getFullyQualifiedClassType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanType
	 * @generated
	 */
	EClass getGenericBooleanType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.HomeType
	 * @generated
	 */
	EClass getHomeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType
	 * @generated
	 */
	EClass getIconType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getSmallIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getLargeIcon()
	 * @see #getIconType()
	 * @generated
	 */
	EReference getIconType_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getId()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType#getLang()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType <em>Init Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType
	 * @generated
	 */
	EClass getInitMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType#getCreateMethod <em>Create Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType#getCreateMethod()
	 * @see #getInitMethodType()
	 * @generated
	 */
	EReference getInitMethodType_CreateMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType#getBeanMethod <em>Bean Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType#getBeanMethod()
	 * @see #getInitMethodType()
	 * @generated
	 */
	EReference getInitMethodType_BeanMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType#getId()
	 * @see #getInitMethodType()
	 * @generated
	 */
	EAttribute getInitMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType <em>Injection Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Injection Target Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType
	 * @generated
	 */
	EClass getInjectionTargetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetClass <em>Injection Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Injection Target Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetClass()
	 * @see #getInjectionTargetType()
	 * @generated
	 */
	EReference getInjectionTargetType_InjectionTargetClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetName <em>Injection Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Injection Target Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetName()
	 * @see #getInjectionTargetType()
	 * @generated
	 */
	EReference getInjectionTargetType_InjectionTargetName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType <em>Interceptor Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor Binding Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType
	 * @generated
	 */
	EClass getInterceptorBindingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getDescription()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getEjbName()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_EjbName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getInterceptorClass <em>Interceptor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interceptor Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getInterceptorClass()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_InterceptorClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getInterceptorOrder <em>Interceptor Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interceptor Order</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getInterceptorOrder()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_InterceptorOrder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeDefaultInterceptors <em>Exclude Default Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Interceptors</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeDefaultInterceptors()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_ExcludeDefaultInterceptors();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeClassInterceptors <em>Exclude Class Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Class Interceptors</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeClassInterceptors()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_ExcludeClassInterceptors();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getMethod()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getId()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EAttribute getInterceptorBindingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType <em>Interceptor Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor Order Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType
	 * @generated
	 */
	EClass getInterceptorOrderType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType#getInterceptorClass <em>Interceptor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interceptor Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType#getInterceptorClass()
	 * @see #getInterceptorOrderType()
	 * @generated
	 */
	EReference getInterceptorOrderType_InterceptorClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType#getId()
	 * @see #getInterceptorOrderType()
	 * @generated
	 */
	EAttribute getInterceptorOrderType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType <em>Interceptors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptors Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType
	 * @generated
	 */
	EClass getInterceptorsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType#getDescription()
	 * @see #getInterceptorsType()
	 * @generated
	 */
	EReference getInterceptorsType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType#getInterceptor <em>Interceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interceptor</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType#getInterceptor()
	 * @see #getInterceptorsType()
	 * @generated
	 */
	EReference getInterceptorsType_Interceptor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType#getId()
	 * @see #getInterceptorsType()
	 * @generated
	 */
	EAttribute getInterceptorsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType <em>Interceptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType
	 * @generated
	 */
	EClass getInterceptorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getDescription()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getInterceptorClass <em>Interceptor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interceptor Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getInterceptorClass()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_InterceptorClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getAroundInvoke <em>Around Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Around Invoke</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getAroundInvoke()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_AroundInvoke();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getEnvEntry()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getEjbRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getEjbLocalRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getServiceRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getResourceRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getResourceEnvRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getMessageDestinationRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPersistenceContextRef <em>Persistence Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPersistenceContextRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PersistenceContextRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPersistenceUnitRef()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PersistenceUnitRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPostConstruct <em>Post Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Construct</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPostConstruct()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PostConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPreDestroy <em>Pre Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroy</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPreDestroy()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PreDestroy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPostActivate <em>Post Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Activate</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPostActivate()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PostActivate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPrePassivate <em>Pre Passivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Passivate</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getPrePassivate()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PrePassivate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType#getId()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EAttribute getInterceptorType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Identifier Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaIdentifierType
	 * @generated
	 */
	EClass getJavaIdentifierType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaTypeType
	 * @generated
	 */
	EClass getJavaTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jndi Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType
	 * @generated
	 */
	EClass getJndiNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType <em>Lifecycle Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Callback Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType
	 * @generated
	 */
	EClass getLifecycleCallbackType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType#getLifecycleCallbackClass <em>Lifecycle Callback Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle Callback Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType#getLifecycleCallbackClass()
	 * @see #getLifecycleCallbackType()
	 * @generated
	 */
	EReference getLifecycleCallbackType_LifecycleCallbackClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType#getLifecycleCallbackMethod <em>Lifecycle Callback Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle Callback Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType#getLifecycleCallbackMethod()
	 * @see #getLifecycleCallbackType()
	 * @generated
	 */
	EReference getLifecycleCallbackType_LifecycleCallbackMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType
	 * @generated
	 */
	EClass getListenerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getDescription()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getDisplayName()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getIcon()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getListenerClass()
	 * @see #getListenerType()
	 * @generated
	 */
	EReference getListenerType_ListenerClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType#getId()
	 * @see #getListenerType()
	 * @generated
	 */
	EAttribute getListenerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Home Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalHomeType
	 * @generated
	 */
	EClass getLocalHomeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalType
	 * @generated
	 */
	EClass getLocalType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Link Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType
	 * @generated
	 */
	EClass getMessageDestinationLinkType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType
	 * @generated
	 */
	EClass getMessageDestinationRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getDescription()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationRefName()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationType()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Usage</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationUsage()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationUsage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationLink()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MessageDestinationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMappedName()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getInjectionTarget()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EReference getMessageDestinationRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getId()
	 * @see #getMessageDestinationRefType()
	 * @generated
	 */
	EAttribute getMessageDestinationRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType
	 * @generated
	 */
	EClass getMessageDestinationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getDescription()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getDisplayName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getIcon()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getMessageDestinationName <em>Message Destination Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getMessageDestinationName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_MessageDestinationName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getMappedName()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EReference getMessageDestinationType_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType#getId()
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	EAttribute getMessageDestinationType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType
	 * @generated
	 */
	EClass getMessageDestinationTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Usage Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType
	 * @generated
	 */
	EClass getMessageDestinationUsageType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType <em>Message Driven Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Driven Bean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType
	 * @generated
	 */
	EClass getMessageDrivenBeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getDescription()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getDisplayName()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getIcon()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbName()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMappedName()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MappedName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbClass()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessagingType <em>Messaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Messaging Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessagingType()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessagingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTimeoutMethod <em>Timeout Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTimeoutMethod()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_TimeoutMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTransactionType()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_TransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationType()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessageDestinationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Destination Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationLink()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessageDestinationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getActivationConfig <em>Activation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Config</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getActivationConfig()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ActivationConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getAroundInvoke <em>Around Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Around Invoke</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getAroundInvoke()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_AroundInvoke();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEnvEntry()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbLocalRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getServiceRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getResourceRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getResourceEnvRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPersistenceContextRef <em>Persistence Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPersistenceContextRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_PersistenceContextRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPersistenceUnitRef()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_PersistenceUnitRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPostConstruct <em>Post Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Construct</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPostConstruct()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_PostConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPreDestroy <em>Pre Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroy</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPreDestroy()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_PreDestroy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getSecurityIdentity()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EReference getMessageDrivenBeanType_SecurityIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getId()
	 * @see #getMessageDrivenBeanType()
	 * @generated
	 */
	EAttribute getMessageDrivenBeanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfType <em>Method Intf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Intf Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfType
	 * @generated
	 */
	EClass getMethodIntfType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodNameType <em>Method Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodNameType
	 * @generated
	 */
	EClass getMethodNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType <em>Method Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Params Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType
	 * @generated
	 */
	EClass getMethodParamsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType#getMethodParam <em>Method Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType#getMethodParam()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EReference getMethodParamsType_MethodParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType#getId()
	 * @see #getMethodParamsType()
	 * @generated
	 */
	EAttribute getMethodParamsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType <em>Method Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Permission Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType
	 * @generated
	 */
	EClass getMethodPermissionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getDescription()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getRoleName()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getUnchecked <em>Unchecked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchecked</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getUnchecked()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Unchecked();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getMethod()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EReference getMethodPermissionType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType#getId()
	 * @see #getMethodPermissionType()
	 * @generated
	 */
	EAttribute getMethodPermissionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getDescription()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getEjbName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodIntf <em>Method Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Intf</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodIntf()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodIntf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodName()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodParams()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getId()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityType
	 * @generated
	 */
	EClass getMultiplicityType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType <em>Named Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType
	 * @generated
	 */
	EClass getNamedMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType#getMethodName()
	 * @see #getNamedMethodType()
	 * @generated
	 */
	EReference getNamedMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType#getMethodParams()
	 * @see #getNamedMethodType()
	 * @generated
	 */
	EReference getNamedMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType#getId()
	 * @see #getNamedMethodType()
	 * @generated
	 */
	EAttribute getNamedMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Value Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType
	 * @generated
	 */
	EClass getParamValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getDescription()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getParamName()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getParamValue()
	 * @see #getParamValueType()
	 * @generated
	 */
	EReference getParamValueType_ParamValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType#getId()
	 * @see #getParamValueType()
	 * @generated
	 */
	EAttribute getParamValueType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType
	 * @generated
	 */
	EClass getPathType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType <em>Persistence Context Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Context Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType
	 * @generated
	 */
	EClass getPersistenceContextRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getDescription()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceContextRefName <em>Persistence Context Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Context Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceContextRefName()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceContextRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceUnitName <em>Persistence Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceUnitName()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceUnitName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceContextType <em>Persistence Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Context Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceContextType()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceContextType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceProperty <em>Persistence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Property</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getPersistenceProperty()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_PersistenceProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getMappedName()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getInjectionTarget()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EReference getPersistenceContextRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType#getId()
	 * @see #getPersistenceContextRefType()
	 * @generated
	 */
	EAttribute getPersistenceContextRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeType <em>Persistence Context Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Context Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeType
	 * @generated
	 */
	EClass getPersistenceContextTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeType <em>Persistence Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeType
	 * @generated
	 */
	EClass getPersistenceTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType <em>Persistence Unit Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType
	 * @generated
	 */
	EClass getPersistenceUnitRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getDescription()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getPersistenceUnitRefName <em>Persistence Unit Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getPersistenceUnitRefName()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_PersistenceUnitRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getPersistenceUnitName <em>Persistence Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getPersistenceUnitName()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_PersistenceUnitName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getMappedName()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getInjectionTarget()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EReference getPersistenceUnitRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType#getId()
	 * @see #getPersistenceUnitRefType()
	 * @generated
	 */
	EAttribute getPersistenceUnitRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Component Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType
	 * @generated
	 */
	EClass getPortComponentRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Endpoint Interface</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getServiceEndpointInterface()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_ServiceEndpointInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getEnableMtom <em>Enable Mtom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable Mtom</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getEnableMtom()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_EnableMtom();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getPortComponentLink <em>Port Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Component Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getPortComponentLink()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EReference getPortComponentRefType_PortComponentLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType#getId()
	 * @see #getPortComponentRefType()
	 * @generated
	 */
	EAttribute getPortComponentRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType#getId()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType <em>Query Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType
	 * @generated
	 */
	EClass getQueryMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType#getMethodName()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EReference getQueryMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType#getMethodParams()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EReference getQueryMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType#getId()
	 * @see #getQueryMethodType()
	 * @generated
	 */
	EAttribute getQueryMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType
	 * @generated
	 */
	EClass getQueryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getDescription()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getQueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getQueryMethod()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_QueryMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getResultTypeMapping <em>Result Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Type Mapping</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getResultTypeMapping()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_ResultTypeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getEjbQl <em>Ejb Ql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Ql</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getEjbQl()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_EjbQl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getId()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType <em>Relationship Role Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Role Source Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType
	 * @generated
	 */
	EClass getRelationshipRoleSourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType#getDescription()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EReference getRelationshipRoleSourceType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType#getEjbName()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EReference getRelationshipRoleSourceType_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType#getId()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EAttribute getRelationshipRoleSourceType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType <em>Relationships Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType
	 * @generated
	 */
	EClass getRelationshipsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType#getDescription()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EReference getRelationshipsType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType#getEjbRelation <em>Ejb Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Relation</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType#getEjbRelation()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EReference getRelationshipsType_EjbRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType#getId()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EAttribute getRelationshipsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoteType
	 * @generated
	 */
	EClass getRemoteType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType <em>Remove Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Method Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType
	 * @generated
	 */
	EClass getRemoveMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType#getBeanMethod <em>Bean Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType#getBeanMethod()
	 * @see #getRemoveMethodType()
	 * @generated
	 */
	EReference getRemoveMethodType_BeanMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType#getRetainIfException <em>Retain If Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retain If Exception</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType#getRetainIfException()
	 * @see #getRemoveMethodType()
	 * @generated
	 */
	EReference getRemoveMethodType_RetainIfException();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType#getId()
	 * @see #getRemoveMethodType()
	 * @generated
	 */
	EAttribute getRemoveMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Auth Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthType
	 * @generated
	 */
	EClass getResAuthType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType
	 * @generated
	 */
	EClass getResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getDescription()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getResourceEnvRefName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getResourceEnvRefType()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_ResourceEnvRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getMappedName()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getInjectionTarget()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EReference getResourceEnvRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType#getId()
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	EAttribute getResourceEnvRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType
	 * @generated
	 */
	EClass getResourceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getDescription()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResRefName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResType()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Auth</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResAuth()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResAuth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Sharing Scope</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getResSharingScope()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_ResSharingScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getMappedName()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getInjectionTarget()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EReference getResourceRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType#getId()
	 * @see #getResourceRefType()
	 * @generated
	 */
	EAttribute getResourceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Sharing Scope Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeType
	 * @generated
	 */
	EClass getResSharingScopeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType <em>Result Type Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type Mapping Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType
	 * @generated
	 */
	EClass getResultTypeMappingType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RoleNameType
	 * @generated
	 */
	EClass getRoleNameType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run As Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType
	 * @generated
	 */
	EClass getRunAsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType#getDescription()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType#getRoleName()
	 * @see #getRunAsType()
	 * @generated
	 */
	EReference getRunAsType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType#getId()
	 * @see #getRunAsType()
	 * @generated
	 */
	EAttribute getRunAsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType <em>Security Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Identity Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType
	 * @generated
	 */
	EClass getSecurityIdentityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getDescription()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getUseCallerIdentity <em>Use Caller Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Caller Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getUseCallerIdentity()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_UseCallerIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getRunAs()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_RunAs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType#getId()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EAttribute getSecurityIdentityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType
	 * @generated
	 */
	EClass getSecurityRoleRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getDescription()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getRoleName()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Link</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getRoleLink()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EReference getSecurityRoleRefType_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType#getId()
	 * @see #getSecurityRoleRefType()
	 * @generated
	 */
	EAttribute getSecurityRoleRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType
	 * @generated
	 */
	EClass getSecurityRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType#getDescription()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType#getRoleName()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EReference getSecurityRoleType_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType#getId()
	 * @see #getSecurityRoleType()
	 * @generated
	 */
	EAttribute getSecurityRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType <em>Service Ref Handler Chains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler Chains Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType
	 * @generated
	 */
	EClass getServiceRefHandlerChainsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType#getHandlerChain <em>Handler Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler Chain</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType#getHandlerChain()
	 * @see #getServiceRefHandlerChainsType()
	 * @generated
	 */
	EReference getServiceRefHandlerChainsType_HandlerChain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType#getId()
	 * @see #getServiceRefHandlerChainsType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChainsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType <em>Service Ref Handler Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler Chain Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType
	 * @generated
	 */
	EClass getServiceRefHandlerChainType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getServiceNamePattern <em>Service Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name Pattern</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getServiceNamePattern()
	 * @see #getServiceRefHandlerChainType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChainType_ServiceNamePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getPortNamePattern <em>Port Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name Pattern</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getPortNamePattern()
	 * @see #getServiceRefHandlerChainType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChainType_PortNamePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getProtocolBindings <em>Protocol Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Bindings</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getProtocolBindings()
	 * @see #getServiceRefHandlerChainType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChainType_ProtocolBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getHandler()
	 * @see #getServiceRefHandlerChainType()
	 * @generated
	 */
	EReference getServiceRefHandlerChainType_Handler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType#getId()
	 * @see #getServiceRefHandlerChainType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChainType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType <em>Service Ref Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType
	 * @generated
	 */
	EClass getServiceRefHandlerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getDescription()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getDisplayName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getIcon()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getHandlerName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_HandlerName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getHandlerClass <em>Handler Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getHandlerClass()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_HandlerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Param</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getInitParam()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_InitParam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getSoapHeader <em>Soap Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Header</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getSoapHeader()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_SoapHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getSoapRole <em>Soap Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Role</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getSoapRole()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_SoapRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getPortName()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EReference getServiceRefHandlerType_PortName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType#getId()
	 * @see #getServiceRefHandlerType()
	 * @generated
	 */
	EAttribute getServiceRefHandlerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType
	 * @generated
	 */
	EClass getServiceRefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getDescription()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getDisplayName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getIcon()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceRefName <em>Service Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Ref Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceRefName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceRefName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Interface</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceInterface()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Ref Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceRefType()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl File</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getWsdlFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_WsdlFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jaxrpc Mapping File</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getJaxrpcMappingFile()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_JaxrpcMappingFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceQname <em>Service Qname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Qname</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getServiceQname()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_ServiceQname();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getPortComponentRef <em>Port Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Component Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getPortComponentRef()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_PortComponentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getHandler()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_Handler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getHandlerChains <em>Handler Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Chains</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getHandlerChains()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_HandlerChains();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getMappedName()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getInjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Target</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getInjectionTarget()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EReference getServiceRefType_InjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType#getId()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EAttribute getServiceRefType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType <em>Session Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Bean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType
	 * @generated
	 */
	EClass getSessionBeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getDescription()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getDisplayName()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getIcon()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbName()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Name</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getMappedName()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_MappedName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getHome()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Home();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getRemote()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Home</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getLocalHome()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_LocalHome();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getLocal()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_Local();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getBusinessLocal <em>Business Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Local</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getBusinessLocal()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_BusinessLocal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getBusinessRemote <em>Business Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Remote</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getBusinessRemote()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_BusinessRemote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getServiceEndpoint <em>Service Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Endpoint</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getServiceEndpoint()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ServiceEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Class</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbClass()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getSessionType()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_SessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getTimeoutMethod <em>Timeout Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getTimeoutMethod()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_TimeoutMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getInitMethod <em>Init Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getInitMethod()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_InitMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getRemoveMethod <em>Remove Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remove Method</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getRemoveMethod()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_RemoveMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getTransactionType()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_TransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getAroundInvoke <em>Around Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Around Invoke</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getAroundInvoke()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_AroundInvoke();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entry</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEnvEntry()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getEjbLocalRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_EjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getServiceRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getResourceRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getResourceEnvRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_ResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getMessageDestinationRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_MessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPersistenceContextRef <em>Persistence Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPersistenceContextRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_PersistenceContextRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPersistenceUnitRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_PersistenceUnitRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPostConstruct <em>Post Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Construct</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPostConstruct()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_PostConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPreDestroy <em>Pre Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroy</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPreDestroy()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_PreDestroy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPostActivate <em>Post Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Activate</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPostActivate()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_PostActivate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPrePassivate <em>Pre Passivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Passivate</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getPrePassivate()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_PrePassivate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getSecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Ref</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getSecurityRoleRef()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_SecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getSecurityIdentity()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EReference getSessionBeanType_SecurityIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType#getId()
	 * @see #getSessionBeanType()
	 * @generated
	 */
	EAttribute getSessionBeanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeType <em>Session Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeType
	 * @generated
	 */
	EClass getSessionTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.String#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.String#getId()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeType
	 * @generated
	 */
	EClass getTransactionTypeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeType <em>Trans Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trans Attribute Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeType
	 * @generated
	 */
	EClass getTransAttributeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True False Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TrueFalseType
	 * @generated
	 */
	EClass getTrueFalseType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Pattern Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType
	 * @generated
	 */
	EClass getUrlPatternType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType#getValue()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType <em>Xsd Any URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Any URI Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType
	 * @generated
	 */
	EClass getXsdAnyURIType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType#getValue()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType#getId()
	 * @see #getXsdAnyURIType()
	 * @generated
	 */
	EAttribute getXsdAnyURIType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType <em>Xsd Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Boolean Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType
	 * @generated
	 */
	EClass getXsdBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType#isValue()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType#getId()
	 * @see #getXsdBooleanType()
	 * @generated
	 */
	EAttribute getXsdBooleanType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType <em>Xsd Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType
	 * @generated
	 */
	EClass getXsdIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType#getValue()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType#getId()
	 * @see #getXsdIntegerType()
	 * @generated
	 */
	EAttribute getXsdIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType <em>Xsd NMTOKEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd NMTOKEN Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType
	 * @generated
	 */
	EClass getXsdNMTOKENType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType#getValue()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType#getId()
	 * @see #getXsdNMTOKENType()
	 * @generated
	 */
	EAttribute getXsdNMTOKENType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Non Negative Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType
	 * @generated
	 */
	EClass getXsdNonNegativeIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType#getValue()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType#getId()
	 * @see #getXsdNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getXsdNonNegativeIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd Positive Integer Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType
	 * @generated
	 */
	EClass getXsdPositiveIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType#getValue()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType#getId()
	 * @see #getXsdPositiveIntegerType()
	 * @generated
	 */
	EAttribute getXsdPositiveIntegerType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd QName Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType
	 * @generated
	 */
	EClass getXsdQNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType#getValue()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType#getId()
	 * @see #getXsdQNameType()
	 * @generated
	 */
	EAttribute getXsdQNameType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsd String Type</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType
	 * @generated
	 */
	EClass getXsdStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType#getValue()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType#getId()
	 * @see #getXsdStringType()
	 * @generated
	 */
	EAttribute getXsdStringType_Id();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase <em>Cmp Version Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cmp Version Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase
	 * @generated
	 */
	EEnum getCmpVersionTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase <em>Cmr Field Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cmr Field Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase
	 * @generated
	 */
	EEnum getCmrFieldTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ejb Ref Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase
	 * @generated
	 */
	EEnum getEjbRefTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Env Entry Type Values Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase
	 * @generated
	 */
	EEnum getEnvEntryTypeValuesTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase <em>Generic Boolean Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generic Boolean Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase
	 * @generated
	 */
	EEnum getGenericBooleanTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Destination Usage Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase
	 * @generated
	 */
	EEnum getMessageDestinationUsageTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase <em>Method Intf Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Intf Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase
	 * @generated
	 */
	EEnum getMethodIntfTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase <em>Multiplicity Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase
	 * @generated
	 */
	EEnum getMultiplicityTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase <em>Persistence Context Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Context Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase
	 * @generated
	 */
	EEnum getPersistenceContextTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase <em>Persistence Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase
	 * @generated
	 */
	EEnum getPersistenceTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase <em>Res Auth Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Res Auth Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase
	 * @generated
	 */
	EEnum getResAuthTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Res Sharing Scope Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase
	 * @generated
	 */
	EEnum getResSharingScopeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase <em>Result Type Mapping Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type Mapping Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase
	 * @generated
	 */
	EEnum getResultTypeMappingTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase <em>Session Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Session Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase
	 * @generated
	 */
	EEnum getSessionTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase <em>Transaction Type Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Type Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase
	 * @generated
	 */
	EEnum getTransactionTypeTypeBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase <em>Trans Attribute Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trans Attribute Type Base</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase
	 * @generated
	 */
	EEnum getTransAttributeTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase <em>Cmp Version Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cmp Version Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionTypeBase"
	 *        extendedMetaData="name='cmp-versionType_._base:Object' baseType='cmp-versionType_._base'"
	 * @generated
	 */
	EDataType getCmpVersionTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase <em>Cmr Field Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cmr Field Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeTypeBase"
	 *        extendedMetaData="name='cmr-field-typeType_._base:Object' baseType='cmr-field-typeType_._base'"
	 * @generated
	 */
	EDataType getCmrFieldTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dewey Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dewey Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='dewey-versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\.?[0-9]+(\\.[0-9]+)*'"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase <em>Ejb Ref Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeTypeBase"
	 *        extendedMetaData="name='ejb-ref-typeType_._base:Object' baseType='ejb-ref-typeType_._base'"
	 * @generated
	 */
	EDataType getEjbRefTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase <em>Env Entry Type Values Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Env Entry Type Values Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase <em>Generic Boolean Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generic Boolean Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase <em>Message Destination Usage Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Destination Usage Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageTypeBase"
	 *        extendedMetaData="name='message-destination-usageType_._base:Object' baseType='message-destination-usageType_._base'"
	 * @generated
	 */
	EDataType getMessageDestinationUsageTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase <em>Method Intf Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Intf Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase <em>Multiplicity Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiplicity Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase <em>Persistence Context Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Persistence Context Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeTypeBase"
	 *        extendedMetaData="name='persistence-context-typeType_._base:Object' baseType='persistence-context-typeType_._base'"
	 * @generated
	 */
	EDataType getPersistenceContextTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase <em>Persistence Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Persistence Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeTypeBase"
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
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase <em>Res Auth Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Auth Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthTypeBase"
	 *        extendedMetaData="name='res-authType_._base:Object' baseType='res-authType_._base'"
	 * @generated
	 */
	EDataType getResAuthTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase <em>Res Sharing Scope Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Sharing Scope Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeTypeBase"
	 *        extendedMetaData="name='res-sharing-scopeType_._base:Object' baseType='res-sharing-scopeType_._base'"
	 * @generated
	 */
	EDataType getResSharingScopeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase <em>Result Type Mapping Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Type Mapping Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingTypeBase"
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
	 * Returns the meta object for data type '{@link java.util.List <em>Service Ref Protocol Binding List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Protocol Binding List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='service-ref_protocol-bindingListType' itemType='service-ref_protocol-bindingType'"
	 * @generated
	 */
	EDataType getServiceRefProtocolBindingListType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Ref Protocol Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Protocol Binding Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='service-ref_protocol-bindingType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI service-ref_protocol-URIAliasType'"
	 * @generated
	 */
	EDataType getServiceRefProtocolBindingType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Ref Protocol URI Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Protocol URI Alias Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='service-ref_protocol-URIAliasType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='##.+'"
	 * @generated
	 */
	EDataType getServiceRefProtocolURIAliasType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Ref Qname Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Qname Pattern</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='service-ref_qname-pattern' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\*|([\\i-[:]][\\c-[:]]*:)?[\\i-[:]][\\c-[:]]*\\*?'"
	 * @generated
	 */
	EDataType getServiceRefQnamePattern();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase <em>Session Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Session Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeTypeBase"
	 *        extendedMetaData="name='session-typeType_._base:Object' baseType='session-typeType_._base'"
	 * @generated
	 */
	EDataType getSessionTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase <em>Transaction Type Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transaction Type Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeTypeBase"
	 *        extendedMetaData="name='transaction-typeType_._base:Object' baseType='transaction-typeType_._base'"
	 * @generated
	 */
	EDataType getTransactionTypeTypeBaseObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase <em>Trans Attribute Type Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trans Attribute Type Base Object</em>'.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase
	 * @model instanceClass="org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeTypeBase"
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
	EjbJar30Factory getEjbJar30Factory();

} //EjbJar30Package
