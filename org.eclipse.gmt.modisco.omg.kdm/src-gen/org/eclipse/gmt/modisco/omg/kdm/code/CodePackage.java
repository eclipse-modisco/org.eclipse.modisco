/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmt.modisco.omg.kdm.core.CorePackage;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage;

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
 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory
 * @model kind="package"
 * @generated
 */
public interface CodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "code"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/code"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "code"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodePackage eINSTANCE = org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeModelImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeModel()
	 * @generated
	 */
	int CODE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__EXTENSION = KdmPackage.KDM_MODEL__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__OWNED_ELEMENT = KdmPackage.KDM_MODEL__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__CODE_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeElementImpl <em>Abstract Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeElementImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getAbstractCodeElement()
	 * @generated
	 */
	int ABSTRACT_CODE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__MODEL = CorePackage.KDM_ENTITY__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__OWNER = CorePackage.KDM_ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__OWNED_ELEMENT = CorePackage.KDM_ENTITY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__OUTBOUND = CorePackage.KDM_ENTITY__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__INBOUND = CorePackage.KDM_ENTITY__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__OWNED_RELATION = CorePackage.KDM_ENTITY__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__GROUP = CorePackage.KDM_ENTITY__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__GROUPED_ELEMENT = CorePackage.KDM_ENTITY__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__IN_AGGREGATED = CorePackage.KDM_ENTITY__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__OUT_AGGREGATED = CorePackage.KDM_ENTITY__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__SOURCE = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__COMMENT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__CODE_RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__ENTRY_FLOW = CorePackage.KDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeRelationshipImpl <em>Abstract Code Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeRelationshipImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getAbstractCodeRelationship()
	 * @generated
	 */
	int ABSTRACT_CODE_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Code Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeItemImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeItem()
	 * @generated
	 */
	int CODE_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__ATTRIBUTE = ABSTRACT_CODE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__ANNOTATION = ABSTRACT_CODE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__STEREOTYPE = ABSTRACT_CODE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__TAGGED_VALUE = ABSTRACT_CODE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__NAME = ABSTRACT_CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__MODEL = ABSTRACT_CODE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__OWNER = ABSTRACT_CODE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__OWNED_ELEMENT = ABSTRACT_CODE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__OUTBOUND = ABSTRACT_CODE_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__INBOUND = ABSTRACT_CODE_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__OWNED_RELATION = ABSTRACT_CODE_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__GROUP = ABSTRACT_CODE_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__GROUPED_ELEMENT = ABSTRACT_CODE_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__IN_AGGREGATED = ABSTRACT_CODE_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__OUT_AGGREGATED = ABSTRACT_CODE_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__SOURCE = ABSTRACT_CODE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__COMMENT = ABSTRACT_CODE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__CODE_RELATION = ABSTRACT_CODE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__ENTRY_FLOW = ABSTRACT_CODE_ELEMENT__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM_FEATURE_COUNT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ComputationalObjectImpl <em>Computational Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ComputationalObjectImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getComputationalObject()
	 * @generated
	 */
	int COMPUTATIONAL_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__ATTRIBUTE = CODE_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__ANNOTATION = CODE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__STEREOTYPE = CODE_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__TAGGED_VALUE = CODE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__NAME = CODE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__MODEL = CODE_ITEM__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__OWNER = CODE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__OWNED_ELEMENT = CODE_ITEM__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__OUTBOUND = CODE_ITEM__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__INBOUND = CODE_ITEM__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__OWNED_RELATION = CODE_ITEM__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__GROUP = CODE_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__GROUPED_ELEMENT = CODE_ITEM__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__IN_AGGREGATED = CODE_ITEM__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__OUT_AGGREGATED = CODE_ITEM__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__SOURCE = CODE_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__ENTRY_FLOW = CODE_ITEM__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Computational Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DatatypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ATTRIBUTE = CODE_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ANNOTATION = CODE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__STEREOTYPE = CODE_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__TAGGED_VALUE = CODE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = CODE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__MODEL = CODE_ITEM__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNER = CODE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_ELEMENT = CODE_ITEM__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OUTBOUND = CODE_ITEM__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__INBOUND = CODE_ITEM__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_RELATION = CODE_ITEM__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__GROUP = CODE_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__GROUPED_ELEMENT = CODE_ITEM__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IN_AGGREGATED = CODE_ITEM__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OUT_AGGREGATED = CODE_ITEM__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__SOURCE = CODE_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ENTRY_FLOW = CODE_ITEM__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ModuleImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ATTRIBUTE = CODE_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ANNOTATION = CODE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__STEREOTYPE = CODE_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TAGGED_VALUE = CODE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = CODE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODEL = CODE_ITEM__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNER = CODE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_ELEMENT = CODE_ITEM__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUTBOUND = CODE_ITEM__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INBOUND = CODE_ITEM__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_RELATION = CODE_ITEM__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GROUP = CODE_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GROUPED_ELEMENT = CODE_ITEM__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IN_AGGREGATED = CODE_ITEM__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUT_AGGREGATED = CODE_ITEM__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SOURCE = CODE_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ENTRY_FLOW = CODE_ITEM__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CODE_ELEMENT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CompilationUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ATTRIBUTE = MODULE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ANNOTATION = MODULE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__STEREOTYPE = MODULE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__TAGGED_VALUE = MODULE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__MODEL = MODULE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OWNER = MODULE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OWNED_ELEMENT = MODULE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OUTBOUND = MODULE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__INBOUND = MODULE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OWNED_RELATION = MODULE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__GROUP = MODULE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__GROUPED_ELEMENT = MODULE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__IN_AGGREGATED = MODULE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OUT_AGGREGATED = MODULE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__SOURCE = MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__COMMENT = MODULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__CODE_RELATION = MODULE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ENTRY_FLOW = MODULE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__CODE_ELEMENT = MODULE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SharedUnitImpl <em>Shared Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SharedUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSharedUnit()
	 * @generated
	 */
	int SHARED_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__ATTRIBUTE = COMPILATION_UNIT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__ANNOTATION = COMPILATION_UNIT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__STEREOTYPE = COMPILATION_UNIT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__TAGGED_VALUE = COMPILATION_UNIT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__NAME = COMPILATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__MODEL = COMPILATION_UNIT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__OWNER = COMPILATION_UNIT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__OWNED_ELEMENT = COMPILATION_UNIT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__OUTBOUND = COMPILATION_UNIT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__INBOUND = COMPILATION_UNIT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__OWNED_RELATION = COMPILATION_UNIT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__GROUP = COMPILATION_UNIT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__GROUPED_ELEMENT = COMPILATION_UNIT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__IN_AGGREGATED = COMPILATION_UNIT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__OUT_AGGREGATED = COMPILATION_UNIT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__SOURCE = COMPILATION_UNIT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__COMMENT = COMPILATION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__CODE_RELATION = COMPILATION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__ENTRY_FLOW = COMPILATION_UNIT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT__CODE_ELEMENT = COMPILATION_UNIT__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Shared Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_UNIT_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.LanguageUnitImpl <em>Language Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.LanguageUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getLanguageUnit()
	 * @generated
	 */
	int LANGUAGE_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__ATTRIBUTE = MODULE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__ANNOTATION = MODULE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__STEREOTYPE = MODULE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__TAGGED_VALUE = MODULE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__MODEL = MODULE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__OWNER = MODULE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__OWNED_ELEMENT = MODULE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__OUTBOUND = MODULE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__INBOUND = MODULE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__OWNED_RELATION = MODULE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__GROUP = MODULE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__GROUPED_ELEMENT = MODULE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__IN_AGGREGATED = MODULE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__OUT_AGGREGATED = MODULE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__SOURCE = MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__COMMENT = MODULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__CODE_RELATION = MODULE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__ENTRY_FLOW = MODULE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT__CODE_ELEMENT = MODULE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Language Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_UNIT_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeAssemblyImpl <em>Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeAssemblyImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeAssembly()
	 * @generated
	 */
	int CODE_ASSEMBLY = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__ATTRIBUTE = MODULE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__ANNOTATION = MODULE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__STEREOTYPE = MODULE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__TAGGED_VALUE = MODULE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__MODEL = MODULE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__OWNER = MODULE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__OWNED_ELEMENT = MODULE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__OUTBOUND = MODULE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__INBOUND = MODULE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__OWNED_RELATION = MODULE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__GROUP = MODULE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__GROUPED_ELEMENT = MODULE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__IN_AGGREGATED = MODULE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__OUT_AGGREGATED = MODULE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__SOURCE = MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__COMMENT = MODULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__CODE_RELATION = MODULE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__ENTRY_FLOW = MODULE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY__CODE_ELEMENT = MODULE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ASSEMBLY_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PackageImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ATTRIBUTE = MODULE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ANNOTATION = MODULE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__STEREOTYPE = MODULE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TAGGED_VALUE = MODULE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODEL = MODULE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = MODULE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ELEMENT = MODULE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OUTBOUND = MODULE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INBOUND = MODULE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_RELATION = MODULE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GROUP = MODULE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GROUPED_ELEMENT = MODULE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IN_AGGREGATED = MODULE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OUT_AGGREGATED = MODULE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SOURCE = MODULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENT = MODULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_RELATION = MODULE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ENTRY_FLOW = MODULE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_ELEMENT = MODULE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ControlElementImpl <em>Control Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ControlElementImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getControlElement()
	 * @generated
	 */
	int CONTROL_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__ATTRIBUTE = COMPUTATIONAL_OBJECT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__ANNOTATION = COMPUTATIONAL_OBJECT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__STEREOTYPE = COMPUTATIONAL_OBJECT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__TAGGED_VALUE = COMPUTATIONAL_OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__NAME = COMPUTATIONAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__MODEL = COMPUTATIONAL_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__OWNER = COMPUTATIONAL_OBJECT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__OWNED_ELEMENT = COMPUTATIONAL_OBJECT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__OUTBOUND = COMPUTATIONAL_OBJECT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__INBOUND = COMPUTATIONAL_OBJECT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__OWNED_RELATION = COMPUTATIONAL_OBJECT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__GROUP = COMPUTATIONAL_OBJECT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__GROUPED_ELEMENT = COMPUTATIONAL_OBJECT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__IN_AGGREGATED = COMPUTATIONAL_OBJECT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__OUT_AGGREGATED = COMPUTATIONAL_OBJECT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__SOURCE = COMPUTATIONAL_OBJECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__COMMENT = COMPUTATIONAL_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__CODE_RELATION = COMPUTATIONAL_OBJECT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__ENTRY_FLOW = COMPUTATIONAL_OBJECT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__TYPE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__CODE_ELEMENT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT_FEATURE_COUNT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CallableUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCallableUnit()
	 * @generated
	 */
	int CALLABLE_UNIT = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__ATTRIBUTE = CONTROL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__ANNOTATION = CONTROL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__STEREOTYPE = CONTROL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__TAGGED_VALUE = CONTROL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__NAME = CONTROL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__MODEL = CONTROL_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__OWNER = CONTROL_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__OWNED_ELEMENT = CONTROL_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__OUTBOUND = CONTROL_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__INBOUND = CONTROL_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__OWNED_RELATION = CONTROL_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__GROUP = CONTROL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__GROUPED_ELEMENT = CONTROL_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__IN_AGGREGATED = CONTROL_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__OUT_AGGREGATED = CONTROL_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__SOURCE = CONTROL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__COMMENT = CONTROL_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__CODE_RELATION = CONTROL_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__ENTRY_FLOW = CONTROL_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__TYPE = CONTROL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__CODE_ELEMENT = CONTROL_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__KIND = CONTROL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MethodUnitImpl <em>Method Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MethodUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMethodUnit()
	 * @generated
	 */
	int METHOD_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__ATTRIBUTE = CONTROL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__ANNOTATION = CONTROL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__STEREOTYPE = CONTROL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__TAGGED_VALUE = CONTROL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__NAME = CONTROL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__MODEL = CONTROL_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__OWNER = CONTROL_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__OWNED_ELEMENT = CONTROL_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__OUTBOUND = CONTROL_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__INBOUND = CONTROL_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__OWNED_RELATION = CONTROL_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__GROUP = CONTROL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__GROUPED_ELEMENT = CONTROL_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__IN_AGGREGATED = CONTROL_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__OUT_AGGREGATED = CONTROL_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__SOURCE = CONTROL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__COMMENT = CONTROL_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__CODE_RELATION = CONTROL_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__ENTRY_FLOW = CONTROL_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__TYPE = CONTROL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__CODE_ELEMENT = CONTROL_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__KIND = CONTROL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__EXPORT = CONTROL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DataElementImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ATTRIBUTE = COMPUTATIONAL_OBJECT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ANNOTATION = COMPUTATIONAL_OBJECT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__STEREOTYPE = COMPUTATIONAL_OBJECT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TAGGED_VALUE = COMPUTATIONAL_OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = COMPUTATIONAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__MODEL = COMPUTATIONAL_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OWNER = COMPUTATIONAL_OBJECT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OWNED_ELEMENT = COMPUTATIONAL_OBJECT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OUTBOUND = COMPUTATIONAL_OBJECT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__INBOUND = COMPUTATIONAL_OBJECT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OWNED_RELATION = COMPUTATIONAL_OBJECT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__GROUP = COMPUTATIONAL_OBJECT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__GROUPED_ELEMENT = COMPUTATIONAL_OBJECT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__IN_AGGREGATED = COMPUTATIONAL_OBJECT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OUT_AGGREGATED = COMPUTATIONAL_OBJECT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SOURCE = COMPUTATIONAL_OBJECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COMMENT = COMPUTATIONAL_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CODE_RELATION = COMPUTATIONAL_OBJECT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ENTRY_FLOW = COMPUTATIONAL_OBJECT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TYPE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__EXT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SIZE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CODE_ELEMENT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.StorableUnitImpl <em>Storable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.StorableUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getStorableUnit()
	 * @generated
	 */
	int STORABLE_UNIT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__ATTRIBUTE = DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__ANNOTATION = DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__STEREOTYPE = DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__TAGGED_VALUE = DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__MODEL = DATA_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__OWNER = DATA_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__OWNED_ELEMENT = DATA_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__OUTBOUND = DATA_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__INBOUND = DATA_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__OWNED_RELATION = DATA_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__GROUP = DATA_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__GROUPED_ELEMENT = DATA_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__IN_AGGREGATED = DATA_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__OUT_AGGREGATED = DATA_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__SOURCE = DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__ENTRY_FLOW = DATA_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__KIND = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ItemUnitImpl <em>Item Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ItemUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getItemUnit()
	 * @generated
	 */
	int ITEM_UNIT = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__ATTRIBUTE = DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__ANNOTATION = DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__STEREOTYPE = DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__TAGGED_VALUE = DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__MODEL = DATA_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__OWNER = DATA_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__OWNED_ELEMENT = DATA_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__OUTBOUND = DATA_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__INBOUND = DATA_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__OWNED_RELATION = DATA_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__GROUP = DATA_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__GROUPED_ELEMENT = DATA_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__IN_AGGREGATED = DATA_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__OUT_AGGREGATED = DATA_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__SOURCE = DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__ENTRY_FLOW = DATA_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Item Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IndexUnitImpl <em>Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IndexUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIndexUnit()
	 * @generated
	 */
	int INDEX_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ATTRIBUTE = DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ANNOTATION = DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__STEREOTYPE = DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TAGGED_VALUE = DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__MODEL = DATA_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OWNER = DATA_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OWNED_ELEMENT = DATA_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OUTBOUND = DATA_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__INBOUND = DATA_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OWNED_RELATION = DATA_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__GROUP = DATA_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__GROUPED_ELEMENT = DATA_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__IN_AGGREGATED = DATA_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OUT_AGGREGATED = DATA_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SOURCE = DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ENTRY_FLOW = DATA_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MemberUnitImpl <em>Member Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MemberUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMemberUnit()
	 * @generated
	 */
	int MEMBER_UNIT = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__ATTRIBUTE = DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__ANNOTATION = DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__STEREOTYPE = DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__TAGGED_VALUE = DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__MODEL = DATA_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__OWNER = DATA_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__OWNED_ELEMENT = DATA_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__OUTBOUND = DATA_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__INBOUND = DATA_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__OWNED_RELATION = DATA_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__GROUP = DATA_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__GROUPED_ELEMENT = DATA_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__IN_AGGREGATED = DATA_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__OUT_AGGREGATED = DATA_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__SOURCE = DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__ENTRY_FLOW = DATA_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT__EXPORT = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterUnitImpl <em>Parameter Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getParameterUnit()
	 * @generated
	 */
	int PARAMETER_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__ATTRIBUTE = DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__ANNOTATION = DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__STEREOTYPE = DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__TAGGED_VALUE = DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__MODEL = DATA_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__OWNER = DATA_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__OWNED_ELEMENT = DATA_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__OUTBOUND = DATA_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__INBOUND = DATA_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__OWNED_RELATION = DATA_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__GROUP = DATA_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__GROUPED_ELEMENT = DATA_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__IN_AGGREGATED = DATA_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__OUT_AGGREGATED = DATA_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__SOURCE = DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__ENTRY_FLOW = DATA_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__KIND = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__POS = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueElementImpl <em>Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueElementImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getValueElement()
	 * @generated
	 */
	int VALUE_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__ATTRIBUTE = DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__ANNOTATION = DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__STEREOTYPE = DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__TAGGED_VALUE = DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__MODEL = DATA_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__OWNER = DATA_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__OWNED_ELEMENT = DATA_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__OUTBOUND = DATA_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__INBOUND = DATA_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__OWNED_RELATION = DATA_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__GROUP = DATA_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__GROUPED_ELEMENT = DATA_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__IN_AGGREGATED = DATA_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__OUT_AGGREGATED = DATA_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__SOURCE = DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__ENTRY_FLOW = DATA_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 22;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ATTRIBUTE = VALUE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ANNOTATION = VALUE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STEREOTYPE = VALUE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TAGGED_VALUE = VALUE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = VALUE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__MODEL = VALUE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OWNER = VALUE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OWNED_ELEMENT = VALUE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OUTBOUND = VALUE_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__INBOUND = VALUE_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OWNED_RELATION = VALUE_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__GROUP = VALUE_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__GROUPED_ELEMENT = VALUE_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__IN_AGGREGATED = VALUE_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OUT_AGGREGATED = VALUE_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SOURCE = VALUE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__COMMENT = VALUE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CODE_RELATION = VALUE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ENTRY_FLOW = VALUE_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TYPE = VALUE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__EXT = VALUE_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SIZE = VALUE_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CODE_ELEMENT = VALUE_ELEMENT__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueListImpl <em>Value List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueListImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getValueList()
	 * @generated
	 */
	int VALUE_LIST = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__ATTRIBUTE = VALUE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__ANNOTATION = VALUE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__STEREOTYPE = VALUE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__TAGGED_VALUE = VALUE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__NAME = VALUE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__MODEL = VALUE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__OWNER = VALUE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__OWNED_ELEMENT = VALUE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__OUTBOUND = VALUE_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__INBOUND = VALUE_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__OWNED_RELATION = VALUE_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__GROUP = VALUE_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__GROUPED_ELEMENT = VALUE_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__IN_AGGREGATED = VALUE_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__OUT_AGGREGATED = VALUE_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__SOURCE = VALUE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__COMMENT = VALUE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__CODE_RELATION = VALUE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__ENTRY_FLOW = VALUE_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__TYPE = VALUE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__EXT = VALUE_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__SIZE = VALUE_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__CODE_ELEMENT = VALUE_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST__VALUE_ELEMENT = VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PrimitiveTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BooleanTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CharTypeImpl <em>Char Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CharTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCharType()
	 * @generated
	 */
	int CHAR_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.OrdinalTypeImpl <em>Ordinal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.OrdinalTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getOrdinalType()
	 * @generated
	 */
	int ORDINAL_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Ordinal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DateTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TimeTypeImpl <em>Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TimeTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IntegerTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DecimalTypeImpl <em>Decimal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DecimalTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDecimalType()
	 * @generated
	 */
	int DECIMAL_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Decimal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ScaledTypeImpl <em>Scaled Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ScaledTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getScaledType()
	 * @generated
	 */
	int SCALED_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Scaled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.FloatTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.VoidTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.StringTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BitTypeImpl <em>Bit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BitTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBitType()
	 * @generated
	 */
	int BIT_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Bit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BitstringTypeImpl <em>Bitstring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BitstringTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBitstringType()
	 * @generated
	 */
	int BITSTRING_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Bitstring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITSTRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetTypeImpl <em>Octet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getOctetType()
	 * @generated
	 */
	int OCTET_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Octet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetstringTypeImpl <em>Octetstring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetstringTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getOctetstringType()
	 * @generated
	 */
	int OCTETSTRING_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__ATTRIBUTE = PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__ANNOTATION = PRIMITIVE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__STEREOTYPE = PRIMITIVE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__TAGGED_VALUE = PRIMITIVE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__MODEL = PRIMITIVE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__OWNER = PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__OWNED_ELEMENT = PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__OUTBOUND = PRIMITIVE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__INBOUND = PRIMITIVE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__OWNED_RELATION = PRIMITIVE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__GROUP = PRIMITIVE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__GROUPED_ELEMENT = PRIMITIVE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__IN_AGGREGATED = PRIMITIVE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__OUT_AGGREGATED = PRIMITIVE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__SOURCE = PRIMITIVE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__COMMENT = PRIMITIVE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__CODE_RELATION = PRIMITIVE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE__ENTRY_FLOW = PRIMITIVE_TYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Octetstring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTETSTRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.EnumeratedTypeImpl <em>Enumerated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.EnumeratedTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getEnumeratedType()
	 * @generated
	 */
	int ENUMERATED_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__VALUE = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__CODE_ELEMENT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CompositeTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ITEM_UNIT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ChoiceTypeImpl <em>Choice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ChoiceTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getChoiceType()
	 * @generated
	 */
	int CHOICE_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__ATTRIBUTE = COMPOSITE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__ANNOTATION = COMPOSITE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__STEREOTYPE = COMPOSITE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__TAGGED_VALUE = COMPOSITE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__NAME = COMPOSITE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__MODEL = COMPOSITE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__OWNER = COMPOSITE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__OWNED_ELEMENT = COMPOSITE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__OUTBOUND = COMPOSITE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__INBOUND = COMPOSITE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__OWNED_RELATION = COMPOSITE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__GROUP = COMPOSITE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__GROUPED_ELEMENT = COMPOSITE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__IN_AGGREGATED = COMPOSITE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__OUT_AGGREGATED = COMPOSITE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__SOURCE = COMPOSITE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__COMMENT = COMPOSITE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__CODE_RELATION = COMPOSITE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__ENTRY_FLOW = COMPOSITE_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE__ITEM_UNIT = COMPOSITE_TYPE__ITEM_UNIT;

	/**
	 * The number of structural features of the '<em>Choice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.RecordTypeImpl <em>Record Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.RecordTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getRecordType()
	 * @generated
	 */
	int RECORD_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__ATTRIBUTE = COMPOSITE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__ANNOTATION = COMPOSITE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__STEREOTYPE = COMPOSITE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__TAGGED_VALUE = COMPOSITE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__NAME = COMPOSITE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__MODEL = COMPOSITE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__OWNER = COMPOSITE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__OWNED_ELEMENT = COMPOSITE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__OUTBOUND = COMPOSITE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__INBOUND = COMPOSITE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__OWNED_RELATION = COMPOSITE_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__GROUP = COMPOSITE_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__GROUPED_ELEMENT = COMPOSITE_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__IN_AGGREGATED = COMPOSITE_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__OUT_AGGREGATED = COMPOSITE_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__SOURCE = COMPOSITE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__COMMENT = COMPOSITE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__CODE_RELATION = COMPOSITE_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__ENTRY_FLOW = COMPOSITE_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__ITEM_UNIT = COMPOSITE_TYPE__ITEM_UNIT;

	/**
	 * The number of structural features of the '<em>Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DerivedTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDerivedType()
	 * @generated
	 */
	int DERIVED_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__ITEM_UNIT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ArrayTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ATTRIBUTE = DERIVED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ANNOTATION = DERIVED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__STEREOTYPE = DERIVED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__TAGGED_VALUE = DERIVED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = DERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__MODEL = DERIVED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__OWNER = DERIVED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__OWNED_ELEMENT = DERIVED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__OUTBOUND = DERIVED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__INBOUND = DERIVED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__OWNED_RELATION = DERIVED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__GROUP = DERIVED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__GROUPED_ELEMENT = DERIVED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__IN_AGGREGATED = DERIVED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__OUT_AGGREGATED = DERIVED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SOURCE = DERIVED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__COMMENT = DERIVED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__CODE_RELATION = DERIVED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ENTRY_FLOW = DERIVED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ITEM_UNIT = DERIVED_TYPE__ITEM_UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SIZE = DERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__INDEX_UNIT = DERIVED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = DERIVED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PointerTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPointerType()
	 * @generated
	 */
	int POINTER_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ATTRIBUTE = DERIVED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ANNOTATION = DERIVED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__STEREOTYPE = DERIVED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__TAGGED_VALUE = DERIVED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__NAME = DERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__MODEL = DERIVED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__OWNER = DERIVED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__OWNED_ELEMENT = DERIVED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__OUTBOUND = DERIVED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__INBOUND = DERIVED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__OWNED_RELATION = DERIVED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__GROUP = DERIVED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__GROUPED_ELEMENT = DERIVED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__IN_AGGREGATED = DERIVED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__OUT_AGGREGATED = DERIVED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__SOURCE = DERIVED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__COMMENT = DERIVED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__CODE_RELATION = DERIVED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ENTRY_FLOW = DERIVED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ITEM_UNIT = DERIVED_TYPE__ITEM_UNIT;

	/**
	 * The number of structural features of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_FEATURE_COUNT = DERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.RangeTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ATTRIBUTE = DERIVED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ANNOTATION = DERIVED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__STEREOTYPE = DERIVED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__TAGGED_VALUE = DERIVED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__NAME = DERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__MODEL = DERIVED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__OWNER = DERIVED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__OWNED_ELEMENT = DERIVED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__OUTBOUND = DERIVED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__INBOUND = DERIVED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__OWNED_RELATION = DERIVED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__GROUP = DERIVED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__GROUPED_ELEMENT = DERIVED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__IN_AGGREGATED = DERIVED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__OUT_AGGREGATED = DERIVED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__SOURCE = DERIVED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__COMMENT = DERIVED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__CODE_RELATION = DERIVED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ENTRY_FLOW = DERIVED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ITEM_UNIT = DERIVED_TYPE__ITEM_UNIT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__LOWER = DERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__UPPER = DERIVED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_FEATURE_COUNT = DERIVED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BagTypeImpl <em>Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BagTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBagType()
	 * @generated
	 */
	int BAG_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ATTRIBUTE = DERIVED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ANNOTATION = DERIVED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__STEREOTYPE = DERIVED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__TAGGED_VALUE = DERIVED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__NAME = DERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__MODEL = DERIVED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OWNER = DERIVED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OWNED_ELEMENT = DERIVED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OUTBOUND = DERIVED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__INBOUND = DERIVED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OWNED_RELATION = DERIVED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__GROUP = DERIVED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__GROUPED_ELEMENT = DERIVED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__IN_AGGREGATED = DERIVED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OUT_AGGREGATED = DERIVED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__SOURCE = DERIVED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__COMMENT = DERIVED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CODE_RELATION = DERIVED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ENTRY_FLOW = DERIVED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ITEM_UNIT = DERIVED_TYPE__ITEM_UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__SIZE = DERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_FEATURE_COUNT = DERIVED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SetTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ATTRIBUTE = DERIVED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ANNOTATION = DERIVED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__STEREOTYPE = DERIVED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TAGGED_VALUE = DERIVED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__NAME = DERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__MODEL = DERIVED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OWNER = DERIVED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OWNED_ELEMENT = DERIVED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OUTBOUND = DERIVED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__INBOUND = DERIVED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OWNED_RELATION = DERIVED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__GROUP = DERIVED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__GROUPED_ELEMENT = DERIVED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__IN_AGGREGATED = DERIVED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OUT_AGGREGATED = DERIVED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__SOURCE = DERIVED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__COMMENT = DERIVED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CODE_RELATION = DERIVED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ENTRY_FLOW = DERIVED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ITEM_UNIT = DERIVED_TYPE__ITEM_UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__SIZE = DERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = DERIVED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SequenceTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ATTRIBUTE = DERIVED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ANNOTATION = DERIVED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__STEREOTYPE = DERIVED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TAGGED_VALUE = DERIVED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__NAME = DERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__MODEL = DERIVED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OWNER = DERIVED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OWNED_ELEMENT = DERIVED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OUTBOUND = DERIVED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__INBOUND = DERIVED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OWNED_RELATION = DERIVED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__GROUP = DERIVED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__GROUPED_ELEMENT = DERIVED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__IN_AGGREGATED = DERIVED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OUT_AGGREGATED = DERIVED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SOURCE = DERIVED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__COMMENT = DERIVED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CODE_RELATION = DERIVED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ENTRY_FLOW = DERIVED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ITEM_UNIT = DERIVED_TYPE__ITEM_UNIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SIZE = DERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = DERIVED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SignatureImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 51;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Parameter Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETER_UNIT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DefinedTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDefinedType()
	 * @generated
	 */
	int DEFINED_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__TYPE = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__CODE_ELEMENT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TypeUnitImpl <em>Type Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TypeUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTypeUnit()
	 * @generated
	 */
	int TYPE_UNIT = 53;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__ATTRIBUTE = DEFINED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__ANNOTATION = DEFINED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__STEREOTYPE = DEFINED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__TAGGED_VALUE = DEFINED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__NAME = DEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__MODEL = DEFINED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__OWNER = DEFINED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__OWNED_ELEMENT = DEFINED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__OUTBOUND = DEFINED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__INBOUND = DEFINED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__OWNED_RELATION = DEFINED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__GROUP = DEFINED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__GROUPED_ELEMENT = DEFINED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__IN_AGGREGATED = DEFINED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__OUT_AGGREGATED = DEFINED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__SOURCE = DEFINED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__COMMENT = DEFINED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__CODE_RELATION = DEFINED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__ENTRY_FLOW = DEFINED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__TYPE = DEFINED_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT__CODE_ELEMENT = DEFINED_TYPE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Type Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_UNIT_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SynonymUnitImpl <em>Synonym Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SynonymUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSynonymUnit()
	 * @generated
	 */
	int SYNONYM_UNIT = 54;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__ATTRIBUTE = DEFINED_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__ANNOTATION = DEFINED_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__STEREOTYPE = DEFINED_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__TAGGED_VALUE = DEFINED_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__NAME = DEFINED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__MODEL = DEFINED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__OWNER = DEFINED_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__OWNED_ELEMENT = DEFINED_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__OUTBOUND = DEFINED_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__INBOUND = DEFINED_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__OWNED_RELATION = DEFINED_TYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__GROUP = DEFINED_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__GROUPED_ELEMENT = DEFINED_TYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__IN_AGGREGATED = DEFINED_TYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__OUT_AGGREGATED = DEFINED_TYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__SOURCE = DEFINED_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__COMMENT = DEFINED_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__CODE_RELATION = DEFINED_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__ENTRY_FLOW = DEFINED_TYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__TYPE = DEFINED_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT__CODE_ELEMENT = DEFINED_TYPE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Synonym Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_UNIT_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ClassUnitImpl <em>Class Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ClassUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getClassUnit()
	 * @generated
	 */
	int CLASS_UNIT = 55;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__IS_ABSTRACT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__CODE_ELEMENT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.InterfaceUnitImpl <em>Interface Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.InterfaceUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getInterfaceUnit()
	 * @generated
	 */
	int INTERFACE_UNIT = 56;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__CODE_ELEMENT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateUnitImpl <em>Template Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTemplateUnit()
	 * @generated
	 */
	int TEMPLATE_UNIT = 57;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__CODE_ELEMENT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateParameterImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTemplateParameter()
	 * @generated
	 */
	int TEMPLATE_PARAMETER = 58;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateTypeImpl <em>Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTemplateType()
	 * @generated
	 */
	int TEMPLATE_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__ATTRIBUTE = DATATYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__ANNOTATION = DATATYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__STEREOTYPE = DATATYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__TAGGED_VALUE = DATATYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__MODEL = DATATYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__OWNER = DATATYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__OWNED_ELEMENT = DATATYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__OUTBOUND = DATATYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__INBOUND = DATATYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__OWNED_RELATION = DATATYPE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__GROUP = DATATYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__GROUPED_ELEMENT = DATATYPE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__IN_AGGREGATED = DATATYPE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__OUT_AGGREGATED = DATATYPE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__SOURCE = DATATYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__COMMENT = DATATYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__CODE_RELATION = DATATYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__ENTRY_FLOW = DATATYPE__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.InstanceOfImpl <em>Instance Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.InstanceOfImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getInstanceOf()
	 * @generated
	 */
	int INSTANCE_OF = 60;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterToImpl <em>Parameter To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterToImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getParameterTo()
	 * @generated
	 */
	int PARAMETER_TO = 61;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementsImpl <em>Implements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementsImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getImplements()
	 * @generated
	 */
	int IMPLEMENTS = 62;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementationOfImpl <em>Implementation Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementationOfImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getImplementationOf()
	 * @generated
	 */
	int IMPLEMENTATION_OF = 63;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implementation Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.HasTypeImpl <em>Has Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.HasTypeImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getHasType()
	 * @generated
	 */
	int HAS_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TYPE__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TYPE__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TYPE__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TYPE__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TYPE__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TYPE__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TYPE_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.HasValueImpl <em>Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.HasValueImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getHasValue()
	 * @generated
	 */
	int HAS_VALUE = 65;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ExtendsImpl <em>Extends</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ExtendsImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getExtends()
	 * @generated
	 */
	int EXTENDS = 66;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PreprocessorDirectiveImpl <em>Preprocessor Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PreprocessorDirectiveImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPreprocessorDirective()
	 * @generated
	 */
	int PREPROCESSOR_DIRECTIVE = 67;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__ATTRIBUTE = ABSTRACT_CODE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__ANNOTATION = ABSTRACT_CODE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__STEREOTYPE = ABSTRACT_CODE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__TAGGED_VALUE = ABSTRACT_CODE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__NAME = ABSTRACT_CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__MODEL = ABSTRACT_CODE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__OWNER = ABSTRACT_CODE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__OWNED_ELEMENT = ABSTRACT_CODE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__OUTBOUND = ABSTRACT_CODE_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__INBOUND = ABSTRACT_CODE_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__OWNED_RELATION = ABSTRACT_CODE_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__GROUP = ABSTRACT_CODE_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__GROUPED_ELEMENT = ABSTRACT_CODE_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__IN_AGGREGATED = ABSTRACT_CODE_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__OUT_AGGREGATED = ABSTRACT_CODE_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__SOURCE = ABSTRACT_CODE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__COMMENT = ABSTRACT_CODE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__CODE_RELATION = ABSTRACT_CODE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__ENTRY_FLOW = ABSTRACT_CODE_ELEMENT__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE__CODE_ELEMENT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Preprocessor Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_DIRECTIVE_FEATURE_COUNT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroUnitImpl <em>Macro Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMacroUnit()
	 * @generated
	 */
	int MACRO_UNIT = 68;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__ATTRIBUTE = PREPROCESSOR_DIRECTIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__ANNOTATION = PREPROCESSOR_DIRECTIVE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__STEREOTYPE = PREPROCESSOR_DIRECTIVE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__TAGGED_VALUE = PREPROCESSOR_DIRECTIVE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__NAME = PREPROCESSOR_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__MODEL = PREPROCESSOR_DIRECTIVE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__OWNER = PREPROCESSOR_DIRECTIVE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__OWNED_ELEMENT = PREPROCESSOR_DIRECTIVE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__OUTBOUND = PREPROCESSOR_DIRECTIVE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__INBOUND = PREPROCESSOR_DIRECTIVE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__OWNED_RELATION = PREPROCESSOR_DIRECTIVE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__GROUP = PREPROCESSOR_DIRECTIVE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__GROUPED_ELEMENT = PREPROCESSOR_DIRECTIVE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__IN_AGGREGATED = PREPROCESSOR_DIRECTIVE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__OUT_AGGREGATED = PREPROCESSOR_DIRECTIVE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__SOURCE = PREPROCESSOR_DIRECTIVE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__COMMENT = PREPROCESSOR_DIRECTIVE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__CODE_RELATION = PREPROCESSOR_DIRECTIVE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__ENTRY_FLOW = PREPROCESSOR_DIRECTIVE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__CODE_ELEMENT = PREPROCESSOR_DIRECTIVE__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT__KIND = PREPROCESSOR_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Macro Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_UNIT_FEATURE_COUNT = PREPROCESSOR_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroDirectiveImpl <em>Macro Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroDirectiveImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMacroDirective()
	 * @generated
	 */
	int MACRO_DIRECTIVE = 69;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__ATTRIBUTE = PREPROCESSOR_DIRECTIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__ANNOTATION = PREPROCESSOR_DIRECTIVE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__STEREOTYPE = PREPROCESSOR_DIRECTIVE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__TAGGED_VALUE = PREPROCESSOR_DIRECTIVE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__NAME = PREPROCESSOR_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__MODEL = PREPROCESSOR_DIRECTIVE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__OWNER = PREPROCESSOR_DIRECTIVE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__OWNED_ELEMENT = PREPROCESSOR_DIRECTIVE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__OUTBOUND = PREPROCESSOR_DIRECTIVE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__INBOUND = PREPROCESSOR_DIRECTIVE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__OWNED_RELATION = PREPROCESSOR_DIRECTIVE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__GROUP = PREPROCESSOR_DIRECTIVE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__GROUPED_ELEMENT = PREPROCESSOR_DIRECTIVE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__IN_AGGREGATED = PREPROCESSOR_DIRECTIVE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__OUT_AGGREGATED = PREPROCESSOR_DIRECTIVE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__SOURCE = PREPROCESSOR_DIRECTIVE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__COMMENT = PREPROCESSOR_DIRECTIVE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__CODE_RELATION = PREPROCESSOR_DIRECTIVE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__ENTRY_FLOW = PREPROCESSOR_DIRECTIVE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE__CODE_ELEMENT = PREPROCESSOR_DIRECTIVE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Macro Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DIRECTIVE_FEATURE_COUNT = PREPROCESSOR_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludeDirectiveImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIncludeDirective()
	 * @generated
	 */
	int INCLUDE_DIRECTIVE = 70;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__ATTRIBUTE = PREPROCESSOR_DIRECTIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__ANNOTATION = PREPROCESSOR_DIRECTIVE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__STEREOTYPE = PREPROCESSOR_DIRECTIVE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__TAGGED_VALUE = PREPROCESSOR_DIRECTIVE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__NAME = PREPROCESSOR_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__MODEL = PREPROCESSOR_DIRECTIVE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__OWNER = PREPROCESSOR_DIRECTIVE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__OWNED_ELEMENT = PREPROCESSOR_DIRECTIVE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__OUTBOUND = PREPROCESSOR_DIRECTIVE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__INBOUND = PREPROCESSOR_DIRECTIVE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__OWNED_RELATION = PREPROCESSOR_DIRECTIVE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__GROUP = PREPROCESSOR_DIRECTIVE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__GROUPED_ELEMENT = PREPROCESSOR_DIRECTIVE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__IN_AGGREGATED = PREPROCESSOR_DIRECTIVE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__OUT_AGGREGATED = PREPROCESSOR_DIRECTIVE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__SOURCE = PREPROCESSOR_DIRECTIVE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__COMMENT = PREPROCESSOR_DIRECTIVE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__CODE_RELATION = PREPROCESSOR_DIRECTIVE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__ENTRY_FLOW = PREPROCESSOR_DIRECTIVE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE__CODE_ELEMENT = PREPROCESSOR_DIRECTIVE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Include Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DIRECTIVE_FEATURE_COUNT = PREPROCESSOR_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ConditionalDirectiveImpl <em>Conditional Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ConditionalDirectiveImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getConditionalDirective()
	 * @generated
	 */
	int CONDITIONAL_DIRECTIVE = 71;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__ATTRIBUTE = PREPROCESSOR_DIRECTIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__ANNOTATION = PREPROCESSOR_DIRECTIVE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__STEREOTYPE = PREPROCESSOR_DIRECTIVE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__TAGGED_VALUE = PREPROCESSOR_DIRECTIVE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__NAME = PREPROCESSOR_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__MODEL = PREPROCESSOR_DIRECTIVE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__OWNER = PREPROCESSOR_DIRECTIVE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__OWNED_ELEMENT = PREPROCESSOR_DIRECTIVE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__OUTBOUND = PREPROCESSOR_DIRECTIVE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__INBOUND = PREPROCESSOR_DIRECTIVE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__OWNED_RELATION = PREPROCESSOR_DIRECTIVE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__GROUP = PREPROCESSOR_DIRECTIVE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__GROUPED_ELEMENT = PREPROCESSOR_DIRECTIVE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__IN_AGGREGATED = PREPROCESSOR_DIRECTIVE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__OUT_AGGREGATED = PREPROCESSOR_DIRECTIVE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__SOURCE = PREPROCESSOR_DIRECTIVE__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__COMMENT = PREPROCESSOR_DIRECTIVE__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__CODE_RELATION = PREPROCESSOR_DIRECTIVE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__ENTRY_FLOW = PREPROCESSOR_DIRECTIVE__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE__CODE_ELEMENT = PREPROCESSOR_DIRECTIVE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Conditional Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIRECTIVE_FEATURE_COUNT = PREPROCESSOR_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ExpandsImpl <em>Expands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ExpandsImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getExpands()
	 * @generated
	 */
	int EXPANDS = 72;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDS__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDS__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDS__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDS__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDS__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDS__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.GeneratedFromImpl <em>Generated From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.GeneratedFromImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getGeneratedFrom()
	 * @generated
	 */
	int GENERATED_FROM = 73;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FROM__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FROM__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FROM__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FROM__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FROM__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FROM__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generated From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FROM_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludesImpl <em>Includes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludesImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIncludes()
	 * @generated
	 */
	int INCLUDES = 74;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.VariantToImpl <em>Variant To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.VariantToImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getVariantTo()
	 * @generated
	 */
	int VARIANT_TO = 75;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_TO__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_TO__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_TO__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_TO__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_TO__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_TO__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variant To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_TO_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.RedefinesImpl <em>Redefines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.RedefinesImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getRedefines()
	 * @generated
	 */
	int REDEFINES = 76;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Redefines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CommentUnitImpl <em>Comment Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CommentUnitImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCommentUnit()
	 * @generated
	 */
	int COMMENT_UNIT = 77;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT__ATTRIBUTE = CorePackage.MODEL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT__ANNOTATION = CorePackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT__TEXT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.NamespaceImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 78;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ATTRIBUTE = CODE_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ANNOTATION = CODE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__STEREOTYPE = CODE_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__TAGGED_VALUE = CODE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = CODE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__MODEL = CODE_ITEM__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNER = CODE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_ELEMENT = CODE_ITEM__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OUTBOUND = CODE_ITEM__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__INBOUND = CODE_ITEM__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_RELATION = CODE_ITEM__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__GROUP = CODE_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__GROUPED_ELEMENT = CODE_ITEM__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__IN_AGGREGATED = CODE_ITEM__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OUT_AGGREGATED = CODE_ITEM__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SOURCE = CODE_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ENTRY_FLOW = CODE_ITEM__ENTRY_FLOW;

	/**
	 * The feature id for the '<em><b>Grouped Code</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__GROUPED_CODE = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.VisibleInImpl <em>Visible In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.VisibleInImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getVisibleIn()
	 * @generated
	 */
	int VISIBLE_IN = 79;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IN__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IN__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IN__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IN__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IN__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IN__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visible In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IN_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ImportsImpl <em>Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ImportsImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getImports()
	 * @generated
	 */
	int IMPORTS = 80;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeElementImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeElement()
	 * @generated
	 */
	int CODE_ELEMENT = 81;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__ATTRIBUTE = CODE_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__ANNOTATION = CODE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__STEREOTYPE = CODE_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__TAGGED_VALUE = CODE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__NAME = CODE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__MODEL = CODE_ITEM__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__OWNER = CODE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__OWNED_ELEMENT = CODE_ITEM__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__OUTBOUND = CODE_ITEM__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__INBOUND = CODE_ITEM__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__OWNED_RELATION = CODE_ITEM__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__GROUP = CODE_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__GROUPED_ELEMENT = CODE_ITEM__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__IN_AGGREGATED = CODE_ITEM__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__OUT_AGGREGATED = CODE_ITEM__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__SOURCE = CODE_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Entry Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__ENTRY_FLOW = CODE_ITEM__ENTRY_FLOW;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeRelationshipImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeRelationship()
	 * @generated
	 */
	int CODE_RELATIONSHIP = 82;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RELATIONSHIP__ATTRIBUTE = ABSTRACT_CODE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RELATIONSHIP__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RELATIONSHIP__STEREOTYPE = ABSTRACT_CODE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_CODE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RELATIONSHIP__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RELATIONSHIP__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.CallableKind <em>Callable Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CallableKind
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCallableKind()
	 * @generated
	 */
	int CALLABLE_KIND = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.MethodKind <em>Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MethodKind
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMethodKind()
	 * @generated
	 */
	int METHOD_KIND = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.ExportKind <em>Export Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ExportKind
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getExportKind()
	 * @generated
	 */
	int EXPORT_KIND = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.StorableKind <em>Storable Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.StorableKind
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getStorableKind()
	 * @generated
	 */
	int STORABLE_KIND = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterKind <em>Parameter Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterKind
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getParameterKind()
	 * @generated
	 */
	int PARAMETER_KIND = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroKind <em>Macro Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroKind
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMacroKind()
	 * @generated
	 */
	int MACRO_KIND = 88;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeModel
	 * @generated
	 */
	EClass getCodeModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeModel#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeModel#getCodeElement()
	 * @see #getCodeModel()
	 * @generated
	 */
	EReference getCodeModel_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement <em>Abstract Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement
	 * @generated
	 */
	EClass getAbstractCodeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getSource()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getComment()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getCodeRelation <em>Code Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Relation</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getCodeRelation()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_CodeRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getEntryFlow <em>Entry Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry Flow</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement#getEntryFlow()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_EntryFlow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeRelationship <em>Abstract Code Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Code Relationship</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeRelationship
	 * @generated
	 */
	EClass getAbstractCodeRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeItem
	 * @generated
	 */
	EClass getCodeItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ComputationalObject <em>Computational Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computational Object</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ComputationalObject
	 * @generated
	 */
	EClass getComputationalObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.Module#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Module#getCodeElement()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.SharedUnit <em>Shared Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.SharedUnit
	 * @generated
	 */
	EClass getSharedUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.LanguageUnit <em>Language Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.LanguageUnit
	 * @generated
	 */
	EClass getLanguageUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeAssembly
	 * @generated
	 */
	EClass getCodeAssembly();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ControlElement <em>Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ControlElement
	 * @generated
	 */
	EClass getControlElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.ControlElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ControlElement#getType()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.ControlElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ControlElement#getCodeElement()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CallableUnit <em>Callable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CallableUnit
	 * @generated
	 */
	EClass getCallableUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.CallableUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CallableUnit#getKind()
	 * @see #getCallableUnit()
	 * @generated
	 */
	EAttribute getCallableUnit_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit <em>Method Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit
	 * @generated
	 */
	EClass getMethodUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit#getKind()
	 * @see #getMethodUnit()
	 * @generated
	 */
	EAttribute getMethodUnit_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit#getExport()
	 * @see #getMethodUnit()
	 * @generated
	 */
	EAttribute getMethodUnit_Export();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getType()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getExt()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Ext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getSize()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DataElement#getCodeElement()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.StorableUnit <em>Storable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storable Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.StorableUnit
	 * @generated
	 */
	EClass getStorableUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.StorableUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.StorableUnit#getKind()
	 * @see #getStorableUnit()
	 * @generated
	 */
	EAttribute getStorableUnit_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ItemUnit <em>Item Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ItemUnit
	 * @generated
	 */
	EClass getItemUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.IndexUnit
	 * @generated
	 */
	EClass getIndexUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.MemberUnit <em>Member Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MemberUnit
	 * @generated
	 */
	EClass getMemberUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.MemberUnit#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MemberUnit#getExport()
	 * @see #getMemberUnit()
	 * @generated
	 */
	EAttribute getMemberUnit_Export();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit
	 * @generated
	 */
	EClass getParameterUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit#getKind()
	 * @see #getParameterUnit()
	 * @generated
	 */
	EAttribute getParameterUnit_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit#getPos()
	 * @see #getParameterUnit()
	 * @generated
	 */
	EAttribute getParameterUnit_Pos();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ValueElement <em>Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ValueElement
	 * @generated
	 */
	EClass getValueElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value List</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ValueList
	 * @generated
	 */
	EClass getValueList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.ValueList#getValueElement <em>Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ValueList#getValueElement()
	 * @see #getValueList()
	 * @generated
	 */
	EReference getValueList_ValueElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CharType
	 * @generated
	 */
	EClass getCharType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.OrdinalType <em>Ordinal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordinal Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.OrdinalType
	 * @generated
	 */
	EClass getOrdinalType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.TimeType
	 * @generated
	 */
	EClass getTimeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DecimalType
	 * @generated
	 */
	EClass getDecimalType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ScaledType <em>Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaled Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ScaledType
	 * @generated
	 */
	EClass getScaledType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.BitType <em>Bit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.BitType
	 * @generated
	 */
	EClass getBitType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.BitstringType <em>Bitstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitstring Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.BitstringType
	 * @generated
	 */
	EClass getBitstringType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.OctetType <em>Octet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.OctetType
	 * @generated
	 */
	EClass getOctetType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.OctetstringType <em>Octetstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octetstring Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.OctetstringType
	 * @generated
	 */
	EClass getOctetstringType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType <em>Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType
	 * @generated
	 */
	EClass getEnumeratedType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType#getValue()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType#getCodeElement()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.CompositeType#getItemUnit <em>Item Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CompositeType#getItemUnit()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_ItemUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ChoiceType <em>Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ChoiceType
	 * @generated
	 */
	EClass getChoiceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.RecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.RecordType
	 * @generated
	 */
	EClass getRecordType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DerivedType
	 * @generated
	 */
	EClass getDerivedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.DerivedType#getItemUnit <em>Item Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DerivedType#getItemUnit()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_ItemUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.ArrayType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ArrayType#getSize()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Size();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.ArrayType#getIndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ArrayType#getIndexUnit()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_IndexUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.PointerType
	 * @generated
	 */
	EClass getPointerType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.RangeType
	 * @generated
	 */
	EClass getRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.RangeType#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.RangeType#getLower()
	 * @see #getRangeType()
	 * @generated
	 */
	EAttribute getRangeType_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.RangeType#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.RangeType#getUpper()
	 * @see #getRangeType()
	 * @generated
	 */
	EAttribute getRangeType_Upper();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.BagType
	 * @generated
	 */
	EClass getBagType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.BagType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.BagType#getSize()
	 * @see #getBagType()
	 * @generated
	 */
	EAttribute getBagType_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.SetType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.SetType#getSize()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.SequenceType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.SequenceType#getSize()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.Signature#getParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Signature#getParameterUnit()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ParameterUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.DefinedType <em>Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DefinedType
	 * @generated
	 */
	EClass getDefinedType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getType()
	 * @see #getDefinedType()
	 * @generated
	 */
	EReference getDefinedType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getCodeElement()
	 * @see #getDefinedType()
	 * @generated
	 */
	EReference getDefinedType_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.TypeUnit <em>Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.TypeUnit
	 * @generated
	 */
	EClass getTypeUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.SynonymUnit <em>Synonym Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synonym Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.SynonymUnit
	 * @generated
	 */
	EClass getSynonymUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit <em>Class Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit
	 * @generated
	 */
	EClass getClassUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit#getIsAbstract()
	 * @see #getClassUnit()
	 * @generated
	 */
	EAttribute getClassUnit_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit#getCodeElement()
	 * @see #getClassUnit()
	 * @generated
	 */
	EReference getClassUnit_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit <em>Interface Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit
	 * @generated
	 */
	EClass getInterfaceUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit#getCodeElement()
	 * @see #getInterfaceUnit()
	 * @generated
	 */
	EReference getInterfaceUnit_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.TemplateUnit <em>Template Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.TemplateUnit
	 * @generated
	 */
	EClass getTemplateUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.TemplateUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.TemplateUnit#getCodeElement()
	 * @see #getTemplateUnit()
	 * @generated
	 */
	EReference getTemplateUnit_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.TemplateParameter
	 * @generated
	 */
	EClass getTemplateParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.TemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.TemplateType
	 * @generated
	 */
	EClass getTemplateType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.InstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Of</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.InstanceOf
	 * @generated
	 */
	EClass getInstanceOf();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.InstanceOf#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.InstanceOf#getTo()
	 * @see #getInstanceOf()
	 * @generated
	 */
	EReference getInstanceOf_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.InstanceOf#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.InstanceOf#getFrom()
	 * @see #getInstanceOf()
	 * @generated
	 */
	EReference getInstanceOf_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterTo <em>Parameter To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterTo
	 * @generated
	 */
	EClass getParameterTo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterTo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterTo#getTo()
	 * @see #getParameterTo()
	 * @generated
	 */
	EReference getParameterTo_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterTo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterTo#getFrom()
	 * @see #getParameterTo()
	 * @generated
	 */
	EReference getParameterTo_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Implements
	 * @generated
	 */
	EClass getImplements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Implements#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Implements#getTo()
	 * @see #getImplements()
	 * @generated
	 */
	EReference getImplements_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Implements#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Implements#getFrom()
	 * @see #getImplements()
	 * @generated
	 */
	EReference getImplements_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ImplementationOf <em>Implementation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Of</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ImplementationOf
	 * @generated
	 */
	EClass getImplementationOf();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.ImplementationOf#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ImplementationOf#getTo()
	 * @see #getImplementationOf()
	 * @generated
	 */
	EReference getImplementationOf_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.ImplementationOf#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ImplementationOf#getFrom()
	 * @see #getImplementationOf()
	 * @generated
	 */
	EReference getImplementationOf_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.HasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Type</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.HasType
	 * @generated
	 */
	EClass getHasType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.HasType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.HasType#getTo()
	 * @see #getHasType()
	 * @generated
	 */
	EReference getHasType_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.HasType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.HasType#getFrom()
	 * @see #getHasType()
	 * @generated
	 */
	EReference getHasType_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.HasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Value</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.HasValue
	 * @generated
	 */
	EClass getHasValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.HasValue#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.HasValue#getTo()
	 * @see #getHasValue()
	 * @generated
	 */
	EReference getHasValue_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.HasValue#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.HasValue#getFrom()
	 * @see #getHasValue()
	 * @generated
	 */
	EReference getHasValue_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Extends
	 * @generated
	 */
	EClass getExtends();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Extends#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Extends#getTo()
	 * @see #getExtends()
	 * @generated
	 */
	EReference getExtends_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Extends#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Extends#getFrom()
	 * @see #getExtends()
	 * @generated
	 */
	EReference getExtends_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.PreprocessorDirective <em>Preprocessor Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessor Directive</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.PreprocessorDirective
	 * @generated
	 */
	EClass getPreprocessorDirective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.PreprocessorDirective#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.PreprocessorDirective#getCodeElement()
	 * @see #getPreprocessorDirective()
	 * @generated
	 */
	EReference getPreprocessorDirective_CodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit <em>Macro Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit
	 * @generated
	 */
	EClass getMacroUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit#getKind()
	 * @see #getMacroUnit()
	 * @generated
	 */
	EAttribute getMacroUnit_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroDirective <em>Macro Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Directive</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroDirective
	 * @generated
	 */
	EClass getMacroDirective();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.IncludeDirective <em>Include Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Directive</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.IncludeDirective
	 * @generated
	 */
	EClass getIncludeDirective();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.ConditionalDirective <em>Conditional Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Directive</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ConditionalDirective
	 * @generated
	 */
	EClass getConditionalDirective();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Expands <em>Expands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expands</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Expands
	 * @generated
	 */
	EClass getExpands();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Expands#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Expands#getTo()
	 * @see #getExpands()
	 * @generated
	 */
	EReference getExpands_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Expands#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Expands#getFrom()
	 * @see #getExpands()
	 * @generated
	 */
	EReference getExpands_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.GeneratedFrom <em>Generated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.GeneratedFrom
	 * @generated
	 */
	EClass getGeneratedFrom();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.GeneratedFrom#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.GeneratedFrom#getTo()
	 * @see #getGeneratedFrom()
	 * @generated
	 */
	EReference getGeneratedFrom_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.GeneratedFrom#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.GeneratedFrom#getFrom()
	 * @see #getGeneratedFrom()
	 * @generated
	 */
	EReference getGeneratedFrom_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Includes</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Includes
	 * @generated
	 */
	EClass getIncludes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Includes#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Includes#getTo()
	 * @see #getIncludes()
	 * @generated
	 */
	EReference getIncludes_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Includes#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Includes#getFrom()
	 * @see #getIncludes()
	 * @generated
	 */
	EReference getIncludes_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.VariantTo <em>Variant To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.VariantTo
	 * @generated
	 */
	EClass getVariantTo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.VariantTo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.VariantTo#getTo()
	 * @see #getVariantTo()
	 * @generated
	 */
	EReference getVariantTo_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.VariantTo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.VariantTo#getFrom()
	 * @see #getVariantTo()
	 * @generated
	 */
	EReference getVariantTo_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Redefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefines</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Redefines
	 * @generated
	 */
	EClass getRedefines();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Redefines#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Redefines#getTo()
	 * @see #getRedefines()
	 * @generated
	 */
	EReference getRedefines_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Redefines#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Redefines#getFrom()
	 * @see #getRedefines()
	 * @generated
	 */
	EReference getRedefines_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit <em>Comment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Unit</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit
	 * @generated
	 */
	EClass getCommentUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit#getText()
	 * @see #getCommentUnit()
	 * @generated
	 */
	EAttribute getCommentUnit_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.code.Namespace#getGroupedCode <em>Grouped Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Code</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Namespace#getGroupedCode()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_GroupedCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn <em>Visible In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visible In</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn
	 * @generated
	 */
	EClass getVisibleIn();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getTo()
	 * @see #getVisibleIn()
	 * @generated
	 */
	EReference getVisibleIn_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getFrom()
	 * @see #getVisibleIn()
	 * @generated
	 */
	EReference getVisibleIn_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imports</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Imports
	 * @generated
	 */
	EClass getImports();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Imports#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Imports#getTo()
	 * @see #getImports()
	 * @generated
	 */
	EReference getImports_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.Imports#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.Imports#getFrom()
	 * @see #getImports()
	 * @generated
	 */
	EReference getImports_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeElement
	 * @generated
	 */
	EClass getCodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship
	 * @generated
	 */
	EClass getCodeRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship#getTo()
	 * @see #getCodeRelationship()
	 * @generated
	 */
	EReference getCodeRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship#getFrom()
	 * @see #getCodeRelationship()
	 * @generated
	 */
	EReference getCodeRelationship_From();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.omg.kdm.code.CallableKind <em>Callable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Callable Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CallableKind
	 * @generated
	 */
	EEnum getCallableKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.omg.kdm.code.MethodKind <em>Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MethodKind
	 * @generated
	 */
	EEnum getMethodKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.omg.kdm.code.ExportKind <em>Export Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Export Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ExportKind
	 * @generated
	 */
	EEnum getExportKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.omg.kdm.code.StorableKind <em>Storable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storable Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.StorableKind
	 * @generated
	 */
	EEnum getStorableKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterKind <em>Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterKind
	 * @generated
	 */
	EEnum getParameterKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroKind <em>Macro Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Macro Kind</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroKind
	 * @generated
	 */
	EEnum getMacroKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeFactory getCodeFactory();

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
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeModelImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeModel()
		 * @generated
		 */
		EClass CODE_MODEL = eINSTANCE.getCodeModel();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_MODEL__CODE_ELEMENT = eINSTANCE.getCodeModel_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeElementImpl <em>Abstract Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeElementImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getAbstractCodeElement()
		 * @generated
		 */
		EClass ABSTRACT_CODE_ELEMENT = eINSTANCE.getAbstractCodeElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__SOURCE = eINSTANCE.getAbstractCodeElement_Source();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__COMMENT = eINSTANCE.getAbstractCodeElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Code Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__CODE_RELATION = eINSTANCE.getAbstractCodeElement_CodeRelation();

		/**
		 * The meta object literal for the '<em><b>Entry Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__ENTRY_FLOW = eINSTANCE.getAbstractCodeElement_EntryFlow();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeRelationshipImpl <em>Abstract Code Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.AbstractCodeRelationshipImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getAbstractCodeRelationship()
		 * @generated
		 */
		EClass ABSTRACT_CODE_RELATIONSHIP = eINSTANCE.getAbstractCodeRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeItemImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeItem()
		 * @generated
		 */
		EClass CODE_ITEM = eINSTANCE.getCodeItem();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ComputationalObjectImpl <em>Computational Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ComputationalObjectImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getComputationalObject()
		 * @generated
		 */
		EClass COMPUTATIONAL_OBJECT = eINSTANCE.getComputationalObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DatatypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ModuleImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CODE_ELEMENT = eINSTANCE.getModule_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CompilationUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SharedUnitImpl <em>Shared Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SharedUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSharedUnit()
		 * @generated
		 */
		EClass SHARED_UNIT = eINSTANCE.getSharedUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.LanguageUnitImpl <em>Language Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.LanguageUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getLanguageUnit()
		 * @generated
		 */
		EClass LANGUAGE_UNIT = eINSTANCE.getLanguageUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeAssemblyImpl <em>Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeAssemblyImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeAssembly()
		 * @generated
		 */
		EClass CODE_ASSEMBLY = eINSTANCE.getCodeAssembly();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PackageImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ControlElementImpl <em>Control Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ControlElementImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getControlElement()
		 * @generated
		 */
		EClass CONTROL_ELEMENT = eINSTANCE.getControlElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__TYPE = eINSTANCE.getControlElement_Type();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__CODE_ELEMENT = eINSTANCE.getControlElement_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CallableUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCallableUnit()
		 * @generated
		 */
		EClass CALLABLE_UNIT = eINSTANCE.getCallableUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_UNIT__KIND = eINSTANCE.getCallableUnit_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MethodUnitImpl <em>Method Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MethodUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMethodUnit()
		 * @generated
		 */
		EClass METHOD_UNIT = eINSTANCE.getMethodUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_UNIT__KIND = eINSTANCE.getMethodUnit_Kind();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_UNIT__EXPORT = eINSTANCE.getMethodUnit_Export();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DataElementImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__TYPE = eINSTANCE.getDataElement_Type();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__EXT = eINSTANCE.getDataElement_Ext();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__SIZE = eINSTANCE.getDataElement_Size();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__CODE_ELEMENT = eINSTANCE.getDataElement_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.StorableUnitImpl <em>Storable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.StorableUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getStorableUnit()
		 * @generated
		 */
		EClass STORABLE_UNIT = eINSTANCE.getStorableUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORABLE_UNIT__KIND = eINSTANCE.getStorableUnit_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ItemUnitImpl <em>Item Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ItemUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getItemUnit()
		 * @generated
		 */
		EClass ITEM_UNIT = eINSTANCE.getItemUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IndexUnitImpl <em>Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IndexUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIndexUnit()
		 * @generated
		 */
		EClass INDEX_UNIT = eINSTANCE.getIndexUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MemberUnitImpl <em>Member Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MemberUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMemberUnit()
		 * @generated
		 */
		EClass MEMBER_UNIT = eINSTANCE.getMemberUnit();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_UNIT__EXPORT = eINSTANCE.getMemberUnit_Export();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterUnitImpl <em>Parameter Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getParameterUnit()
		 * @generated
		 */
		EClass PARAMETER_UNIT = eINSTANCE.getParameterUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_UNIT__KIND = eINSTANCE.getParameterUnit_Kind();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_UNIT__POS = eINSTANCE.getParameterUnit_Pos();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueElementImpl <em>Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueElementImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getValueElement()
		 * @generated
		 */
		EClass VALUE_ELEMENT = eINSTANCE.getValueElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueListImpl <em>Value List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ValueListImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getValueList()
		 * @generated
		 */
		EClass VALUE_LIST = eINSTANCE.getValueList();

		/**
		 * The meta object literal for the '<em><b>Value Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_LIST__VALUE_ELEMENT = eINSTANCE.getValueList_ValueElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PrimitiveTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BooleanTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CharTypeImpl <em>Char Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CharTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCharType()
		 * @generated
		 */
		EClass CHAR_TYPE = eINSTANCE.getCharType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.OrdinalTypeImpl <em>Ordinal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.OrdinalTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getOrdinalType()
		 * @generated
		 */
		EClass ORDINAL_TYPE = eINSTANCE.getOrdinalType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DateTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TimeTypeImpl <em>Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TimeTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTimeType()
		 * @generated
		 */
		EClass TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IntegerTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DecimalTypeImpl <em>Decimal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DecimalTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDecimalType()
		 * @generated
		 */
		EClass DECIMAL_TYPE = eINSTANCE.getDecimalType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ScaledTypeImpl <em>Scaled Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ScaledTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getScaledType()
		 * @generated
		 */
		EClass SCALED_TYPE = eINSTANCE.getScaledType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.FloatTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.VoidTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.StringTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BitTypeImpl <em>Bit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BitTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBitType()
		 * @generated
		 */
		EClass BIT_TYPE = eINSTANCE.getBitType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BitstringTypeImpl <em>Bitstring Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BitstringTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBitstringType()
		 * @generated
		 */
		EClass BITSTRING_TYPE = eINSTANCE.getBitstringType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetTypeImpl <em>Octet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getOctetType()
		 * @generated
		 */
		EClass OCTET_TYPE = eINSTANCE.getOctetType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetstringTypeImpl <em>Octetstring Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.OctetstringTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getOctetstringType()
		 * @generated
		 */
		EClass OCTETSTRING_TYPE = eINSTANCE.getOctetstringType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.EnumeratedTypeImpl <em>Enumerated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.EnumeratedTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getEnumeratedType()
		 * @generated
		 */
		EClass ENUMERATED_TYPE = eINSTANCE.getEnumeratedType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__VALUE = eINSTANCE.getEnumeratedType_Value();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__CODE_ELEMENT = eINSTANCE.getEnumeratedType_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CompositeTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '<em><b>Item Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__ITEM_UNIT = eINSTANCE.getCompositeType_ItemUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ChoiceTypeImpl <em>Choice Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ChoiceTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getChoiceType()
		 * @generated
		 */
		EClass CHOICE_TYPE = eINSTANCE.getChoiceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.RecordTypeImpl <em>Record Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.RecordTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getRecordType()
		 * @generated
		 */
		EClass RECORD_TYPE = eINSTANCE.getRecordType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DerivedTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDerivedType()
		 * @generated
		 */
		EClass DERIVED_TYPE = eINSTANCE.getDerivedType();

		/**
		 * The meta object literal for the '<em><b>Item Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_TYPE__ITEM_UNIT = eINSTANCE.getDerivedType_ItemUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ArrayTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__SIZE = eINSTANCE.getArrayType_Size();

		/**
		 * The meta object literal for the '<em><b>Index Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__INDEX_UNIT = eINSTANCE.getArrayType_IndexUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PointerTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPointerType()
		 * @generated
		 */
		EClass POINTER_TYPE = eINSTANCE.getPointerType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.RangeTypeImpl <em>Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.RangeTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getRangeType()
		 * @generated
		 */
		EClass RANGE_TYPE = eINSTANCE.getRangeType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_TYPE__LOWER = eINSTANCE.getRangeType_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_TYPE__UPPER = eINSTANCE.getRangeType_Upper();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.BagTypeImpl <em>Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.BagTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getBagType()
		 * @generated
		 */
		EClass BAG_TYPE = eINSTANCE.getBagType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAG_TYPE__SIZE = eINSTANCE.getBagType_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SetTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__SIZE = eINSTANCE.getSetType_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SequenceTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_TYPE__SIZE = eINSTANCE.getSequenceType_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SignatureImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETER_UNIT = eINSTANCE.getSignature_ParameterUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.DefinedTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getDefinedType()
		 * @generated
		 */
		EClass DEFINED_TYPE = eINSTANCE.getDefinedType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_TYPE__TYPE = eINSTANCE.getDefinedType_Type();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_TYPE__CODE_ELEMENT = eINSTANCE.getDefinedType_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TypeUnitImpl <em>Type Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TypeUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTypeUnit()
		 * @generated
		 */
		EClass TYPE_UNIT = eINSTANCE.getTypeUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.SynonymUnitImpl <em>Synonym Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.SynonymUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getSynonymUnit()
		 * @generated
		 */
		EClass SYNONYM_UNIT = eINSTANCE.getSynonymUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ClassUnitImpl <em>Class Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ClassUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getClassUnit()
		 * @generated
		 */
		EClass CLASS_UNIT = eINSTANCE.getClassUnit();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_UNIT__IS_ABSTRACT = eINSTANCE.getClassUnit_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_UNIT__CODE_ELEMENT = eINSTANCE.getClassUnit_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.InterfaceUnitImpl <em>Interface Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.InterfaceUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getInterfaceUnit()
		 * @generated
		 */
		EClass INTERFACE_UNIT = eINSTANCE.getInterfaceUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_UNIT__CODE_ELEMENT = eINSTANCE.getInterfaceUnit_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateUnitImpl <em>Template Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTemplateUnit()
		 * @generated
		 */
		EClass TEMPLATE_UNIT = eINSTANCE.getTemplateUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_UNIT__CODE_ELEMENT = eINSTANCE.getTemplateUnit_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateParameterImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTemplateParameter()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateTypeImpl <em>Template Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.TemplateTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getTemplateType()
		 * @generated
		 */
		EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.InstanceOfImpl <em>Instance Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.InstanceOfImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getInstanceOf()
		 * @generated
		 */
		EClass INSTANCE_OF = eINSTANCE.getInstanceOf();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OF__TO = eINSTANCE.getInstanceOf_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OF__FROM = eINSTANCE.getInstanceOf_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterToImpl <em>Parameter To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ParameterToImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getParameterTo()
		 * @generated
		 */
		EClass PARAMETER_TO = eINSTANCE.getParameterTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TO__TO = eINSTANCE.getParameterTo_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TO__FROM = eINSTANCE.getParameterTo_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementsImpl <em>Implements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementsImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getImplements()
		 * @generated
		 */
		EClass IMPLEMENTS = eINSTANCE.getImplements();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS__TO = eINSTANCE.getImplements_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS__FROM = eINSTANCE.getImplements_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementationOfImpl <em>Implementation Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ImplementationOfImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getImplementationOf()
		 * @generated
		 */
		EClass IMPLEMENTATION_OF = eINSTANCE.getImplementationOf();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_OF__TO = eINSTANCE.getImplementationOf_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_OF__FROM = eINSTANCE.getImplementationOf_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.HasTypeImpl <em>Has Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.HasTypeImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getHasType()
		 * @generated
		 */
		EClass HAS_TYPE = eINSTANCE.getHasType();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_TYPE__TO = eINSTANCE.getHasType_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_TYPE__FROM = eINSTANCE.getHasType_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.HasValueImpl <em>Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.HasValueImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getHasValue()
		 * @generated
		 */
		EClass HAS_VALUE = eINSTANCE.getHasValue();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_VALUE__TO = eINSTANCE.getHasValue_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_VALUE__FROM = eINSTANCE.getHasValue_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ExtendsImpl <em>Extends</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ExtendsImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getExtends()
		 * @generated
		 */
		EClass EXTENDS = eINSTANCE.getExtends();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS__TO = eINSTANCE.getExtends_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS__FROM = eINSTANCE.getExtends_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.PreprocessorDirectiveImpl <em>Preprocessor Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.PreprocessorDirectiveImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getPreprocessorDirective()
		 * @generated
		 */
		EClass PREPROCESSOR_DIRECTIVE = eINSTANCE.getPreprocessorDirective();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPROCESSOR_DIRECTIVE__CODE_ELEMENT = eINSTANCE.getPreprocessorDirective_CodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroUnitImpl <em>Macro Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMacroUnit()
		 * @generated
		 */
		EClass MACRO_UNIT = eINSTANCE.getMacroUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_UNIT__KIND = eINSTANCE.getMacroUnit_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroDirectiveImpl <em>Macro Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.MacroDirectiveImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMacroDirective()
		 * @generated
		 */
		EClass MACRO_DIRECTIVE = eINSTANCE.getMacroDirective();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludeDirectiveImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIncludeDirective()
		 * @generated
		 */
		EClass INCLUDE_DIRECTIVE = eINSTANCE.getIncludeDirective();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ConditionalDirectiveImpl <em>Conditional Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ConditionalDirectiveImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getConditionalDirective()
		 * @generated
		 */
		EClass CONDITIONAL_DIRECTIVE = eINSTANCE.getConditionalDirective();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ExpandsImpl <em>Expands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ExpandsImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getExpands()
		 * @generated
		 */
		EClass EXPANDS = eINSTANCE.getExpands();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANDS__TO = eINSTANCE.getExpands_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANDS__FROM = eINSTANCE.getExpands_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.GeneratedFromImpl <em>Generated From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.GeneratedFromImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getGeneratedFrom()
		 * @generated
		 */
		EClass GENERATED_FROM = eINSTANCE.getGeneratedFrom();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATED_FROM__TO = eINSTANCE.getGeneratedFrom_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATED_FROM__FROM = eINSTANCE.getGeneratedFrom_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludesImpl <em>Includes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.IncludesImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getIncludes()
		 * @generated
		 */
		EClass INCLUDES = eINSTANCE.getIncludes();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDES__TO = eINSTANCE.getIncludes_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDES__FROM = eINSTANCE.getIncludes_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.VariantToImpl <em>Variant To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.VariantToImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getVariantTo()
		 * @generated
		 */
		EClass VARIANT_TO = eINSTANCE.getVariantTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_TO__TO = eINSTANCE.getVariantTo_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_TO__FROM = eINSTANCE.getVariantTo_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.RedefinesImpl <em>Redefines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.RedefinesImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getRedefines()
		 * @generated
		 */
		EClass REDEFINES = eINSTANCE.getRedefines();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINES__TO = eINSTANCE.getRedefines_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINES__FROM = eINSTANCE.getRedefines_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CommentUnitImpl <em>Comment Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CommentUnitImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCommentUnit()
		 * @generated
		 */
		EClass COMMENT_UNIT = eINSTANCE.getCommentUnit();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_UNIT__TEXT = eINSTANCE.getCommentUnit_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.NamespaceImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Grouped Code</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__GROUPED_CODE = eINSTANCE.getNamespace_GroupedCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.VisibleInImpl <em>Visible In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.VisibleInImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getVisibleIn()
		 * @generated
		 */
		EClass VISIBLE_IN = eINSTANCE.getVisibleIn();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBLE_IN__TO = eINSTANCE.getVisibleIn_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBLE_IN__FROM = eINSTANCE.getVisibleIn_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.ImportsImpl <em>Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.ImportsImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getImports()
		 * @generated
		 */
		EClass IMPORTS = eINSTANCE.getImports();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTS__TO = eINSTANCE.getImports_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTS__FROM = eINSTANCE.getImports_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeElementImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeElement()
		 * @generated
		 */
		EClass CODE_ELEMENT = eINSTANCE.getCodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodeRelationshipImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCodeRelationship()
		 * @generated
		 */
		EClass CODE_RELATIONSHIP = eINSTANCE.getCodeRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_RELATIONSHIP__TO = eINSTANCE.getCodeRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_RELATIONSHIP__FROM = eINSTANCE.getCodeRelationship_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.CallableKind <em>Callable Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.CallableKind
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getCallableKind()
		 * @generated
		 */
		EEnum CALLABLE_KIND = eINSTANCE.getCallableKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.MethodKind <em>Method Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.MethodKind
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMethodKind()
		 * @generated
		 */
		EEnum METHOD_KIND = eINSTANCE.getMethodKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.ExportKind <em>Export Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.ExportKind
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getExportKind()
		 * @generated
		 */
		EEnum EXPORT_KIND = eINSTANCE.getExportKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.StorableKind <em>Storable Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.StorableKind
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getStorableKind()
		 * @generated
		 */
		EEnum STORABLE_KIND = eINSTANCE.getStorableKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.ParameterKind <em>Parameter Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.ParameterKind
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getParameterKind()
		 * @generated
		 */
		EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroKind <em>Macro Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroKind
		 * @see org.eclipse.gmt.modisco.omg.kdm.code.impl.CodePackageImpl#getMacroKind()
		 * @generated
		 */
		EEnum MACRO_KIND = eINSTANCE.getMacroKind();

	}

} //CodePackage
