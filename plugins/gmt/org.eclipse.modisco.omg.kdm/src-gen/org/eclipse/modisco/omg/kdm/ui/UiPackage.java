/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.modisco.omg.kdm.action.ActionPackage;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.kdm.KdmPackage;

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
 * @see org.eclipse.modisco.omg.kdm.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/ui"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIElement <em>Abstract UI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIElement
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getAbstractUIElement()
	 * @generated
	 */
	int ABSTRACT_UI_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__MODEL = CorePackage.KDM_ENTITY__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__OWNER = CorePackage.KDM_ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__OWNED_ELEMENT = CorePackage.KDM_ENTITY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__OUTBOUND = CorePackage.KDM_ENTITY__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__INBOUND = CorePackage.KDM_ENTITY__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__OWNED_RELATION = CorePackage.KDM_ENTITY__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__GROUP = CorePackage.KDM_ENTITY__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__GROUPED_ELEMENT = CorePackage.KDM_ENTITY__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__IN_AGGREGATED = CorePackage.KDM_ENTITY__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__OUT_AGGREGATED = CorePackage.KDM_ENTITY__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__SOURCE = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__UI_RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__IMPLEMENTATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT__ABSTRACTION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl <em>UI Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIResource()
	 * @generated
	 */
	int UI_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__ATTRIBUTE = ABSTRACT_UI_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__ANNOTATION = ABSTRACT_UI_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__STEREOTYPE = ABSTRACT_UI_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__TAGGED_VALUE = ABSTRACT_UI_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__NAME = ABSTRACT_UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__MODEL = ABSTRACT_UI_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__OWNER = ABSTRACT_UI_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__OWNED_ELEMENT = ABSTRACT_UI_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__OUTBOUND = ABSTRACT_UI_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__INBOUND = ABSTRACT_UI_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__OWNED_RELATION = ABSTRACT_UI_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__GROUP = ABSTRACT_UI_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__GROUPED_ELEMENT = ABSTRACT_UI_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__IN_AGGREGATED = ABSTRACT_UI_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__OUT_AGGREGATED = ABSTRACT_UI_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__SOURCE = ABSTRACT_UI_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__UI_RELATION = ABSTRACT_UI_ELEMENT__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__IMPLEMENTATION = ABSTRACT_UI_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__ABSTRACTION = ABSTRACT_UI_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>UI Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE__UI_ELEMENT = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESOURCE_FEATURE_COUNT = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIDisplayImpl <em>UI Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIDisplayImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIDisplay()
	 * @generated
	 */
	int UI_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__ATTRIBUTE = UI_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__ANNOTATION = UI_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__STEREOTYPE = UI_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__TAGGED_VALUE = UI_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__NAME = UI_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__MODEL = UI_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__OWNER = UI_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__OWNED_ELEMENT = UI_RESOURCE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__OUTBOUND = UI_RESOURCE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__INBOUND = UI_RESOURCE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__OWNED_RELATION = UI_RESOURCE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__GROUP = UI_RESOURCE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__GROUPED_ELEMENT = UI_RESOURCE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__IN_AGGREGATED = UI_RESOURCE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__OUT_AGGREGATED = UI_RESOURCE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__SOURCE = UI_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__UI_RELATION = UI_RESOURCE__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__IMPLEMENTATION = UI_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__ABSTRACTION = UI_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>UI Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY__UI_ELEMENT = UI_RESOURCE__UI_ELEMENT;

	/**
	 * The number of structural features of the '<em>UI Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DISPLAY_FEATURE_COUNT = UI_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.ScreenImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ATTRIBUTE = UI_DISPLAY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ANNOTATION = UI_DISPLAY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__STEREOTYPE = UI_DISPLAY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__TAGGED_VALUE = UI_DISPLAY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__NAME = UI_DISPLAY__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__MODEL = UI_DISPLAY__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__OWNER = UI_DISPLAY__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__OWNED_ELEMENT = UI_DISPLAY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__OUTBOUND = UI_DISPLAY__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__INBOUND = UI_DISPLAY__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__OWNED_RELATION = UI_DISPLAY__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__GROUP = UI_DISPLAY__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__GROUPED_ELEMENT = UI_DISPLAY__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IN_AGGREGATED = UI_DISPLAY__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__OUT_AGGREGATED = UI_DISPLAY__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__SOURCE = UI_DISPLAY__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__UI_RELATION = UI_DISPLAY__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IMPLEMENTATION = UI_DISPLAY__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ABSTRACTION = UI_DISPLAY__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>UI Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__UI_ELEMENT = UI_DISPLAY__UI_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = UI_DISPLAY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.ReportImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__ATTRIBUTE = UI_DISPLAY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__ANNOTATION = UI_DISPLAY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__STEREOTYPE = UI_DISPLAY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__TAGGED_VALUE = UI_DISPLAY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__NAME = UI_DISPLAY__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__MODEL = UI_DISPLAY__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__OWNER = UI_DISPLAY__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__OWNED_ELEMENT = UI_DISPLAY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__OUTBOUND = UI_DISPLAY__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__INBOUND = UI_DISPLAY__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__OWNED_RELATION = UI_DISPLAY__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__GROUP = UI_DISPLAY__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__GROUPED_ELEMENT = UI_DISPLAY__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__IN_AGGREGATED = UI_DISPLAY__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__OUT_AGGREGATED = UI_DISPLAY__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__SOURCE = UI_DISPLAY__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__UI_RELATION = UI_DISPLAY__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__IMPLEMENTATION = UI_DISPLAY__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__ABSTRACTION = UI_DISPLAY__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>UI Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__UI_ELEMENT = UI_DISPLAY__UI_ELEMENT;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = UI_DISPLAY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIModelImpl <em>UI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIModelImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIModel()
	 * @generated
	 */
	int UI_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__EXTENSION = KdmPackage.KDM_MODEL__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__OWNED_ELEMENT = KdmPackage.KDM_MODEL__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>UI Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__UI_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIRelationship <em>Abstract UI Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIRelationship
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getAbstractUIRelationship()
	 * @generated
	 */
	int ABSTRACT_UI_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract UI Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UILayoutImpl <em>UI Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UILayoutImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUILayout()
	 * @generated
	 */
	int UI_LAYOUT = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__ATTRIBUTE = ABSTRACT_UI_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__ANNOTATION = ABSTRACT_UI_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__STEREOTYPE = ABSTRACT_UI_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__TAGGED_VALUE = ABSTRACT_UI_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__TO = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__FROM = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT_FEATURE_COUNT = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIFieldImpl <em>UI Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIFieldImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIField()
	 * @generated
	 */
	int UI_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__ATTRIBUTE = UI_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__ANNOTATION = UI_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__STEREOTYPE = UI_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__TAGGED_VALUE = UI_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__NAME = UI_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__MODEL = UI_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__OWNER = UI_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__OWNED_ELEMENT = UI_RESOURCE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__OUTBOUND = UI_RESOURCE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__INBOUND = UI_RESOURCE__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__OWNED_RELATION = UI_RESOURCE__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__GROUP = UI_RESOURCE__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__GROUPED_ELEMENT = UI_RESOURCE__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__IN_AGGREGATED = UI_RESOURCE__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__OUT_AGGREGATED = UI_RESOURCE__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__SOURCE = UI_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__UI_RELATION = UI_RESOURCE__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__IMPLEMENTATION = UI_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__ABSTRACTION = UI_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>UI Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__UI_ELEMENT = UI_RESOURCE__UI_ELEMENT;

	/**
	 * The number of structural features of the '<em>UI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD_FEATURE_COUNT = UI_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImageImpl <em>Displays Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImageImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getDisplaysImage()
	 * @generated
	 */
	int DISPLAYS_IMAGE = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_IMAGE__ATTRIBUTE = ABSTRACT_UI_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_IMAGE__ANNOTATION = ABSTRACT_UI_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_IMAGE__STEREOTYPE = ABSTRACT_UI_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_IMAGE__TAGGED_VALUE = ABSTRACT_UI_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_IMAGE__TO = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_IMAGE__FROM = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Displays Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_IMAGE_FEATURE_COUNT = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImpl <em>Displays</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getDisplays()
	 * @generated
	 */
	int DISPLAYS = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS__ATTRIBUTE = ABSTRACT_UI_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS__ANNOTATION = ABSTRACT_UI_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS__STEREOTYPE = ABSTRACT_UI_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS__TAGGED_VALUE = ABSTRACT_UI_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS__TO = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS__FROM = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Displays</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYS_FEATURE_COUNT = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIFlowImpl <em>UI Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIFlowImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIFlow()
	 * @generated
	 */
	int UI_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW__ATTRIBUTE = ABSTRACT_UI_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW__ANNOTATION = ABSTRACT_UI_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW__STEREOTYPE = ABSTRACT_UI_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW__TAGGED_VALUE = ABSTRACT_UI_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW__TO = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW__FROM = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW_FEATURE_COUNT = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIElementImpl <em>UI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIElementImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIElement()
	 * @generated
	 */
	int UI_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ATTRIBUTE = ABSTRACT_UI_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ANNOTATION = ABSTRACT_UI_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__STEREOTYPE = ABSTRACT_UI_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__TAGGED_VALUE = ABSTRACT_UI_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__NAME = ABSTRACT_UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__MODEL = ABSTRACT_UI_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__OWNER = ABSTRACT_UI_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__OWNED_ELEMENT = ABSTRACT_UI_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__OUTBOUND = ABSTRACT_UI_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__INBOUND = ABSTRACT_UI_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__OWNED_RELATION = ABSTRACT_UI_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__GROUP = ABSTRACT_UI_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__GROUPED_ELEMENT = ABSTRACT_UI_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__IN_AGGREGATED = ABSTRACT_UI_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__OUT_AGGREGATED = ABSTRACT_UI_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__SOURCE = ABSTRACT_UI_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__UI_RELATION = ABSTRACT_UI_ELEMENT__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__IMPLEMENTATION = ABSTRACT_UI_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ABSTRACTION = ABSTRACT_UI_ELEMENT__ABSTRACTION;

	/**
	 * The number of structural features of the '<em>UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_FEATURE_COUNT = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIRelationshipImpl <em>UI Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIRelationshipImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIRelationship()
	 * @generated
	 */
	int UI_RELATIONSHIP = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RELATIONSHIP__ATTRIBUTE = ABSTRACT_UI_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RELATIONSHIP__ANNOTATION = ABSTRACT_UI_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RELATIONSHIP__STEREOTYPE = ABSTRACT_UI_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_UI_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RELATIONSHIP__TO = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RELATIONSHIP__FROM = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_UI_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIActionImpl <em>UI Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIActionImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIAction()
	 * @generated
	 */
	int UI_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__ATTRIBUTE = ABSTRACT_UI_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__ANNOTATION = ABSTRACT_UI_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__STEREOTYPE = ABSTRACT_UI_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__TAGGED_VALUE = ABSTRACT_UI_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__NAME = ABSTRACT_UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__MODEL = ABSTRACT_UI_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__OWNER = ABSTRACT_UI_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__OWNED_ELEMENT = ABSTRACT_UI_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__OUTBOUND = ABSTRACT_UI_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__INBOUND = ABSTRACT_UI_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__OWNED_RELATION = ABSTRACT_UI_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__GROUP = ABSTRACT_UI_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__GROUPED_ELEMENT = ABSTRACT_UI_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__IN_AGGREGATED = ABSTRACT_UI_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__OUT_AGGREGATED = ABSTRACT_UI_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__SOURCE = ABSTRACT_UI_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__UI_RELATION = ABSTRACT_UI_ELEMENT__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__IMPLEMENTATION = ABSTRACT_UI_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__ABSTRACTION = ABSTRACT_UI_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__KIND = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>UI Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__UI_ELEMENT = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION_FEATURE_COUNT = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIEventImpl <em>UI Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIEventImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIEvent()
	 * @generated
	 */
	int UI_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__ATTRIBUTE = ABSTRACT_UI_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__ANNOTATION = ABSTRACT_UI_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__STEREOTYPE = ABSTRACT_UI_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__TAGGED_VALUE = ABSTRACT_UI_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__NAME = ABSTRACT_UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__MODEL = ABSTRACT_UI_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__OWNER = ABSTRACT_UI_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__OWNED_ELEMENT = ABSTRACT_UI_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__OUTBOUND = ABSTRACT_UI_ELEMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__INBOUND = ABSTRACT_UI_ELEMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Owned Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__OWNED_RELATION = ABSTRACT_UI_ELEMENT__OWNED_RELATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__GROUP = ABSTRACT_UI_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Grouped Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__GROUPED_ELEMENT = ABSTRACT_UI_ELEMENT__GROUPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>In Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__IN_AGGREGATED = ABSTRACT_UI_ELEMENT__IN_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Out Aggregated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__OUT_AGGREGATED = ABSTRACT_UI_ELEMENT__OUT_AGGREGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__SOURCE = ABSTRACT_UI_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>UI Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__UI_RELATION = ABSTRACT_UI_ELEMENT__UI_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__IMPLEMENTATION = ABSTRACT_UI_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__ABSTRACTION = ABSTRACT_UI_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT__KIND = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EVENT_FEATURE_COUNT = ABSTRACT_UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ReadsUIImpl <em>Reads UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.ReadsUIImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getReadsUI()
	 * @generated
	 */
	int READS_UI = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_UI__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_UI__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_UI__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_UI__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_UI__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_UI__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reads UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_UI_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.WritesUIImpl <em>Writes UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.WritesUIImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getWritesUI()
	 * @generated
	 */
	int WRITES_UI = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_UI__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_UI__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_UI__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_UI__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_UI__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_UI__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writes UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_UI_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ManagesUIImpl <em>Manages UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.ManagesUIImpl
	 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getManagesUI()
	 * @generated
	 */
	int MANAGES_UI = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_UI__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_UI__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_UI__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_UI__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_UI__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_UI__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manages UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_UI_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIElement <em>Abstract UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract UI Element</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIElement
	 * @generated
	 */
	EClass getAbstractUIElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getSource()
	 * @see #getAbstractUIElement()
	 * @generated
	 */
	EReference getAbstractUIElement_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getUIRelation <em>UI Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UI Relation</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getUIRelation()
	 * @see #getAbstractUIElement()
	 * @generated
	 */
	EReference getAbstractUIElement_UIRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getImplementation()
	 * @see #getAbstractUIElement()
	 * @generated
	 */
	EReference getAbstractUIElement_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstraction</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIElement#getAbstraction()
	 * @see #getAbstractUIElement()
	 * @generated
	 */
	EReference getAbstractUIElement_Abstraction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIResource <em>UI Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Resource</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIResource
	 * @generated
	 */
	EClass getUIResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.kdm.ui.UIResource#getUIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UI Element</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIResource#getUIElement()
	 * @see #getUIResource()
	 * @generated
	 */
	EReference getUIResource_UIElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIDisplay <em>UI Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Display</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIDisplay
	 * @generated
	 */
	EClass getUIDisplay();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIModel <em>UI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Model</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIModel
	 * @generated
	 */
	EClass getUIModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.kdm.ui.UIModel#getUIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UI Element</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIModel#getUIElement()
	 * @see #getUIModel()
	 * @generated
	 */
	EReference getUIModel_UIElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIRelationship <em>Abstract UI Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract UI Relationship</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIRelationship
	 * @generated
	 */
	EClass getAbstractUIRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UILayout <em>UI Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Layout</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UILayout
	 * @generated
	 */
	EClass getUILayout();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.UILayout#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UILayout#getTo()
	 * @see #getUILayout()
	 * @generated
	 */
	EReference getUILayout_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.UILayout#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UILayout#getFrom()
	 * @see #getUILayout()
	 * @generated
	 */
	EReference getUILayout_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIField <em>UI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Field</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIField
	 * @generated
	 */
	EClass getUIField();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.DisplaysImage <em>Displays Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displays Image</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.DisplaysImage
	 * @generated
	 */
	EClass getDisplaysImage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.DisplaysImage#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.DisplaysImage#getTo()
	 * @see #getDisplaysImage()
	 * @generated
	 */
	EReference getDisplaysImage_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.DisplaysImage#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.DisplaysImage#getFrom()
	 * @see #getDisplaysImage()
	 * @generated
	 */
	EReference getDisplaysImage_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.Displays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displays</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.Displays
	 * @generated
	 */
	EClass getDisplays();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.Displays#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.Displays#getTo()
	 * @see #getDisplays()
	 * @generated
	 */
	EReference getDisplays_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.Displays#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.Displays#getFrom()
	 * @see #getDisplays()
	 * @generated
	 */
	EReference getDisplays_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIFlow <em>UI Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Flow</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIFlow
	 * @generated
	 */
	EClass getUIFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.UIFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIFlow#getTo()
	 * @see #getUIFlow()
	 * @generated
	 */
	EReference getUIFlow_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.UIFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIFlow#getFrom()
	 * @see #getUIFlow()
	 * @generated
	 */
	EReference getUIFlow_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Element</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIElement
	 * @generated
	 */
	EClass getUIElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIRelationship <em>UI Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Relationship</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIRelationship
	 * @generated
	 */
	EClass getUIRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.UIRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIRelationship#getTo()
	 * @see #getUIRelationship()
	 * @generated
	 */
	EReference getUIRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.UIRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIRelationship#getFrom()
	 * @see #getUIRelationship()
	 * @generated
	 */
	EReference getUIRelationship_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIAction <em>UI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Action</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIAction
	 * @generated
	 */
	EClass getUIAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.kdm.ui.UIAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIAction#getKind()
	 * @see #getUIAction()
	 * @generated
	 */
	EAttribute getUIAction_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.kdm.ui.UIAction#getUIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UI Element</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIAction#getUIElement()
	 * @see #getUIAction()
	 * @generated
	 */
	EReference getUIAction_UIElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.UIEvent <em>UI Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Event</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIEvent
	 * @generated
	 */
	EClass getUIEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.kdm.ui.UIEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.UIEvent#getKind()
	 * @see #getUIEvent()
	 * @generated
	 */
	EAttribute getUIEvent_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.ReadsUI <em>Reads UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reads UI</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.ReadsUI
	 * @generated
	 */
	EClass getReadsUI();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.ReadsUI#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.ReadsUI#getTo()
	 * @see #getReadsUI()
	 * @generated
	 */
	EReference getReadsUI_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.ReadsUI#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.ReadsUI#getFrom()
	 * @see #getReadsUI()
	 * @generated
	 */
	EReference getReadsUI_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.WritesUI <em>Writes UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writes UI</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.WritesUI
	 * @generated
	 */
	EClass getWritesUI();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.WritesUI#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.WritesUI#getTo()
	 * @see #getWritesUI()
	 * @generated
	 */
	EReference getWritesUI_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.WritesUI#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.WritesUI#getFrom()
	 * @see #getWritesUI()
	 * @generated
	 */
	EReference getWritesUI_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.kdm.ui.ManagesUI <em>Manages UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manages UI</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.ManagesUI
	 * @generated
	 */
	EClass getManagesUI();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.ManagesUI#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.ManagesUI#getTo()
	 * @see #getManagesUI()
	 * @generated
	 */
	EReference getManagesUI_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.kdm.ui.ManagesUI#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.kdm.ui.ManagesUI#getFrom()
	 * @see #getManagesUI()
	 * @generated
	 */
	EReference getManagesUI_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIElement <em>Abstract UI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIElement
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getAbstractUIElement()
		 * @generated
		 */
		EClass ABSTRACT_UI_ELEMENT = eINSTANCE.getAbstractUIElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_ELEMENT__SOURCE = eINSTANCE.getAbstractUIElement_Source();

		/**
		 * The meta object literal for the '<em><b>UI Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_ELEMENT__UI_RELATION = eINSTANCE.getAbstractUIElement_UIRelation();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_ELEMENT__IMPLEMENTATION = eINSTANCE.getAbstractUIElement_Implementation();

		/**
		 * The meta object literal for the '<em><b>Abstraction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_ELEMENT__ABSTRACTION = eINSTANCE.getAbstractUIElement_Abstraction();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl <em>UI Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIResource()
		 * @generated
		 */
		EClass UI_RESOURCE = eINSTANCE.getUIResource();

		/**
		 * The meta object literal for the '<em><b>UI Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_RESOURCE__UI_ELEMENT = eINSTANCE.getUIResource_UIElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIDisplayImpl <em>UI Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIDisplayImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIDisplay()
		 * @generated
		 */
		EClass UI_DISPLAY = eINSTANCE.getUIDisplay();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.ScreenImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.ReportImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIModelImpl <em>UI Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIModelImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIModel()
		 * @generated
		 */
		EClass UI_MODEL = eINSTANCE.getUIModel();

		/**
		 * The meta object literal for the '<em><b>UI Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MODEL__UI_ELEMENT = eINSTANCE.getUIModel_UIElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.AbstractUIRelationship <em>Abstract UI Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.AbstractUIRelationship
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getAbstractUIRelationship()
		 * @generated
		 */
		EClass ABSTRACT_UI_RELATIONSHIP = eINSTANCE.getAbstractUIRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UILayoutImpl <em>UI Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UILayoutImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUILayout()
		 * @generated
		 */
		EClass UI_LAYOUT = eINSTANCE.getUILayout();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LAYOUT__TO = eINSTANCE.getUILayout_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LAYOUT__FROM = eINSTANCE.getUILayout_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIFieldImpl <em>UI Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIFieldImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIField()
		 * @generated
		 */
		EClass UI_FIELD = eINSTANCE.getUIField();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImageImpl <em>Displays Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImageImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getDisplaysImage()
		 * @generated
		 */
		EClass DISPLAYS_IMAGE = eINSTANCE.getDisplaysImage();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAYS_IMAGE__TO = eINSTANCE.getDisplaysImage_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAYS_IMAGE__FROM = eINSTANCE.getDisplaysImage_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImpl <em>Displays</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.DisplaysImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getDisplays()
		 * @generated
		 */
		EClass DISPLAYS = eINSTANCE.getDisplays();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAYS__TO = eINSTANCE.getDisplays_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAYS__FROM = eINSTANCE.getDisplays_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIFlowImpl <em>UI Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIFlowImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIFlow()
		 * @generated
		 */
		EClass UI_FLOW = eINSTANCE.getUIFlow();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_FLOW__TO = eINSTANCE.getUIFlow_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_FLOW__FROM = eINSTANCE.getUIFlow_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIElementImpl <em>UI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIElementImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIElement()
		 * @generated
		 */
		EClass UI_ELEMENT = eINSTANCE.getUIElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIRelationshipImpl <em>UI Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIRelationshipImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIRelationship()
		 * @generated
		 */
		EClass UI_RELATIONSHIP = eINSTANCE.getUIRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_RELATIONSHIP__TO = eINSTANCE.getUIRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_RELATIONSHIP__FROM = eINSTANCE.getUIRelationship_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIActionImpl <em>UI Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIActionImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIAction()
		 * @generated
		 */
		EClass UI_ACTION = eINSTANCE.getUIAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ACTION__KIND = eINSTANCE.getUIAction_Kind();

		/**
		 * The meta object literal for the '<em><b>UI Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ACTION__UI_ELEMENT = eINSTANCE.getUIAction_UIElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.UIEventImpl <em>UI Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UIEventImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getUIEvent()
		 * @generated
		 */
		EClass UI_EVENT = eINSTANCE.getUIEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_EVENT__KIND = eINSTANCE.getUIEvent_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ReadsUIImpl <em>Reads UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.ReadsUIImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getReadsUI()
		 * @generated
		 */
		EClass READS_UI = eINSTANCE.getReadsUI();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_UI__TO = eINSTANCE.getReadsUI_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_UI__FROM = eINSTANCE.getReadsUI_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.WritesUIImpl <em>Writes UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.WritesUIImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getWritesUI()
		 * @generated
		 */
		EClass WRITES_UI = eINSTANCE.getWritesUI();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES_UI__TO = eINSTANCE.getWritesUI_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES_UI__FROM = eINSTANCE.getWritesUI_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.kdm.ui.impl.ManagesUIImpl <em>Manages UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.ManagesUIImpl
		 * @see org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl#getManagesUI()
		 * @generated
		 */
		EClass MANAGES_UI = eINSTANCE.getManagesUI();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGES_UI__TO = eINSTANCE.getManagesUI_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGES_UI__FROM = eINSTANCE.getManagesUI_From();

	}

} //UiPackage
