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
package org.eclipse.gmt.modisco.omg.kdm.conceptual.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.BehaviorUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualContainer;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualElement;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualFactory;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualFlow;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualModel;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualRelationship;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualRole;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.FactUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.RuleUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ScenarioUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.TermUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptualFactoryImpl extends EFactoryImpl implements ConceptualFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptualFactory init() {
		try {
			ConceptualFactory theConceptualFactory = (ConceptualFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/conceptual"); //$NON-NLS-1$ 
			if (theConceptualFactory != null) {
				return theConceptualFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConceptualFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConceptualPackage.CONCEPTUAL_MODEL: return createConceptualModel();
			case ConceptualPackage.TERM_UNIT: return createTermUnit();
			case ConceptualPackage.CONCEPTUAL_CONTAINER: return createConceptualContainer();
			case ConceptualPackage.FACT_UNIT: return createFactUnit();
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP: return createConceptualRelationship();
			case ConceptualPackage.BEHAVIOR_UNIT: return createBehaviorUnit();
			case ConceptualPackage.RULE_UNIT: return createRuleUnit();
			case ConceptualPackage.SCENARIO_UNIT: return createScenarioUnit();
			case ConceptualPackage.CONCEPTUAL_FLOW: return createConceptualFlow();
			case ConceptualPackage.CONCEPTUAL_ELEMENT: return createConceptualElement();
			case ConceptualPackage.CONCEPTUAL_ROLE: return createConceptualRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualModel createConceptualModel() {
		ConceptualModelImpl conceptualModel = new ConceptualModelImpl();
		return conceptualModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermUnit createTermUnit() {
		TermUnitImpl termUnit = new TermUnitImpl();
		return termUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualContainer createConceptualContainer() {
		ConceptualContainerImpl conceptualContainer = new ConceptualContainerImpl();
		return conceptualContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactUnit createFactUnit() {
		FactUnitImpl factUnit = new FactUnitImpl();
		return factUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualRelationship createConceptualRelationship() {
		ConceptualRelationshipImpl conceptualRelationship = new ConceptualRelationshipImpl();
		return conceptualRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorUnit createBehaviorUnit() {
		BehaviorUnitImpl behaviorUnit = new BehaviorUnitImpl();
		return behaviorUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleUnit createRuleUnit() {
		RuleUnitImpl ruleUnit = new RuleUnitImpl();
		return ruleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioUnit createScenarioUnit() {
		ScenarioUnitImpl scenarioUnit = new ScenarioUnitImpl();
		return scenarioUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualFlow createConceptualFlow() {
		ConceptualFlowImpl conceptualFlow = new ConceptualFlowImpl();
		return conceptualFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualElement createConceptualElement() {
		ConceptualElementImpl conceptualElement = new ConceptualElementImpl();
		return conceptualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualRole createConceptualRole() {
		ConceptualRoleImpl conceptualRole = new ConceptualRoleImpl();
		return conceptualRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualPackage getConceptualPackage() {
		return (ConceptualPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConceptualPackage getPackage() {
		return ConceptualPackage.eINSTANCE;
	}

} //ConceptualFactoryImpl
