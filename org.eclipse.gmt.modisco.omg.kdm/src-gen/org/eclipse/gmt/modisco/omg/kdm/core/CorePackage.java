/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * <!-- begin-model-doc -->
 * The Core package provides basic constructs for creating and describing meta-model classes in all specific KDM packages.
 * Classes of the Core package determine the structure of KDM models, define fundamental modeling constraints, and
 * determine the reflective API to KDM instances.
 * <!-- end-model-doc -->
 * @see org.eclipse.gmt.modisco.omg.kdm.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/core"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.ElementImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANNOTATION = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.ModelElementImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ATTRIBUTE = ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__STEREOTYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TAGGED_VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl <em>KDM Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getKDMEntity()
	 * @generated
	 */
	int KDM_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__ATTRIBUTE = MODEL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__ANNOTATION = MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__STEREOTYPE = MODEL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__TAGGED_VALUE = MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__OWNER = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__OWNED_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__OUTBOUND = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__INBOUND = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__OWNED_RELATION = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__GROUP = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__GROUPED_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__IN_AGGREGATED = MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY__OUT_AGGREGATED = MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>KDM Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_ENTITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMRelationshipImpl <em>KDM Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMRelationshipImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getKDMRelationship()
	 * @generated
	 */
	int KDM_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_RELATIONSHIP__ATTRIBUTE = MODEL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_RELATIONSHIP__ANNOTATION = MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_RELATIONSHIP__STEREOTYPE = MODEL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_RELATIONSHIP__TAGGED_VALUE = MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>KDM Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_RELATIONSHIP_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl <em>Aggregated Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getAggregatedRelationship()
	 * @generated
	 */
	int AGGREGATED_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__ATTRIBUTE = MODEL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__ANNOTATION = MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__STEREOTYPE = MODEL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__TAGGED_VALUE = MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__FROM = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__TO = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__RELATION = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP__DENSITY = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Aggregated Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_RELATIONSHIP_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getString()
	 * @generated
	 */
	int STRING = 5;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 6;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.Element#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.Element#getAttribute()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.Element#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.Element#getAnnotation()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Annotation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.ModelElement#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stereotype</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.ModelElement#getStereotype()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Stereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.ModelElement#getTaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Value</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.ModelElement#getTaggedValue()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_TaggedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity <em>KDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDM Entity</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity
	 * @generated
	 */
	EClass getKDMEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getName()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EAttribute getKDMEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getModel()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_Model();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOwner()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOwnedElement()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_OwnedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOutbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOutbound()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_Outbound();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getInbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getInbound()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_Inbound();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOwnedRelation <em>Owned Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Relation</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOwnedRelation()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_OwnedRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getGroup()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getGroupedElement <em>Grouped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Element</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getGroupedElement()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_GroupedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getInAggregated <em>In Aggregated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Aggregated</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getInAggregated()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_InAggregated();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOutAggregated <em>Out Aggregated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Aggregated</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity#getOutAggregated()
	 * @see #getKDMEntity()
	 * @generated
	 */
	EReference getKDMEntity_OutAggregated();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship <em>KDM Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDM Relationship</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship
	 * @generated
	 */
	EClass getKDMRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship <em>Aggregated Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Relationship</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship
	 * @generated
	 */
	EClass getAggregatedRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getFrom()
	 * @see #getAggregatedRelationship()
	 * @generated
	 */
	EReference getAggregatedRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getTo()
	 * @see #getAggregatedRelationship()
	 * @generated
	 */
	EReference getAggregatedRelationship_To();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getRelation()
	 * @see #getAggregatedRelationship()
	 * @generated
	 */
	EReference getAggregatedRelationship_Relation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getDensity <em>Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Density</em>'.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getDensity()
	 * @see #getAggregatedRelationship()
	 * @generated
	 */
	EAttribute getAggregatedRelationship_Density();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.ElementImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTE = eINSTANCE.getElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ANNOTATION = eINSTANCE.getElement_Annotation();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.ModelElementImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__STEREOTYPE = eINSTANCE.getModelElement_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Tagged Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TAGGED_VALUE = eINSTANCE.getModelElement_TaggedValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl <em>KDM Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getKDMEntity()
		 * @generated
		 */
		EClass KDM_ENTITY = eINSTANCE.getKDMEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KDM_ENTITY__NAME = eINSTANCE.getKDMEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__MODEL = eINSTANCE.getKDMEntity_Model();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__OWNER = eINSTANCE.getKDMEntity_Owner();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__OWNED_ELEMENT = eINSTANCE.getKDMEntity_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Outbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__OUTBOUND = eINSTANCE.getKDMEntity_Outbound();

		/**
		 * The meta object literal for the '<em><b>Inbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__INBOUND = eINSTANCE.getKDMEntity_Inbound();

		/**
		 * The meta object literal for the '<em><b>Owned Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__OWNED_RELATION = eINSTANCE.getKDMEntity_OwnedRelation();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__GROUP = eINSTANCE.getKDMEntity_Group();

		/**
		 * The meta object literal for the '<em><b>Grouped Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__GROUPED_ELEMENT = eINSTANCE.getKDMEntity_GroupedElement();

		/**
		 * The meta object literal for the '<em><b>In Aggregated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__IN_AGGREGATED = eINSTANCE.getKDMEntity_InAggregated();

		/**
		 * The meta object literal for the '<em><b>Out Aggregated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_ENTITY__OUT_AGGREGATED = eINSTANCE.getKDMEntity_OutAggregated();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMRelationshipImpl <em>KDM Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMRelationshipImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getKDMRelationship()
		 * @generated
		 */
		EClass KDM_RELATIONSHIP = eINSTANCE.getKDMRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl <em>Aggregated Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getAggregatedRelationship()
		 * @generated
		 */
		EClass AGGREGATED_RELATIONSHIP = eINSTANCE.getAggregatedRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_RELATIONSHIP__FROM = eINSTANCE.getAggregatedRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_RELATIONSHIP__TO = eINSTANCE.getAggregatedRelationship_To();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_RELATIONSHIP__RELATION = eINSTANCE.getAggregatedRelationship_Relation();

		/**
		 * The meta object literal for the '<em><b>Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_RELATIONSHIP__DENSITY = eINSTANCE.getAggregatedRelationship_Density();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.gmt.modisco.omg.kdm.core.impl.CorePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

	}

} //CorePackage
