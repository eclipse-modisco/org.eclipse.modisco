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
package org.eclipse.modisco.omg.kdm.conceptual.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualElement;
import org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualRelationship;
import org.eclipse.modisco.omg.kdm.conceptual.BehaviorUnit;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualContainer;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualElement;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualFlow;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualModel;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualRelationship;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole;
import org.eclipse.modisco.omg.kdm.conceptual.FactUnit;
import org.eclipse.modisco.omg.kdm.conceptual.RuleUnit;
import org.eclipse.modisco.omg.kdm.conceptual.ScenarioUnit;
import org.eclipse.modisco.omg.kdm.conceptual.TermUnit;
import org.eclipse.modisco.omg.kdm.core.Element;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.modisco.omg.kdm.core.ModelElement;
import org.eclipse.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage
 * @generated
 */
@SuppressWarnings("all")
public class ConceptualAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConceptualPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualAdapterFactory() {
		if (ConceptualAdapterFactory.modelPackage == null) {
			ConceptualAdapterFactory.modelPackage = ConceptualPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object object) {
		if (object == ConceptualAdapterFactory.modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == ConceptualAdapterFactory.modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSwitch<Adapter> modelSwitch =
		new ConceptualSwitch<Adapter>() {
			@Override
			public Adapter caseConceptualModel(final ConceptualModel object) {
				return createConceptualModelAdapter();
			}
			@Override
			public Adapter caseAbstractConceptualElement(final AbstractConceptualElement object) {
				return createAbstractConceptualElementAdapter();
			}
			@Override
			public Adapter caseTermUnit(final TermUnit object) {
				return createTermUnitAdapter();
			}
			@Override
			public Adapter caseConceptualContainer(final ConceptualContainer object) {
				return createConceptualContainerAdapter();
			}
			@Override
			public Adapter caseFactUnit(final FactUnit object) {
				return createFactUnitAdapter();
			}
			@Override
			public Adapter caseAbstractConceptualRelationship(final AbstractConceptualRelationship object) {
				return createAbstractConceptualRelationshipAdapter();
			}
			@Override
			public Adapter caseConceptualRelationship(final ConceptualRelationship object) {
				return createConceptualRelationshipAdapter();
			}
			@Override
			public Adapter caseBehaviorUnit(final BehaviorUnit object) {
				return createBehaviorUnitAdapter();
			}
			@Override
			public Adapter caseRuleUnit(final RuleUnit object) {
				return createRuleUnitAdapter();
			}
			@Override
			public Adapter caseScenarioUnit(final ScenarioUnit object) {
				return createScenarioUnitAdapter();
			}
			@Override
			public Adapter caseConceptualFlow(final ConceptualFlow object) {
				return createConceptualFlowAdapter();
			}
			@Override
			public Adapter caseConceptualElement(final ConceptualElement object) {
				return createConceptualElementAdapter();
			}
			@Override
			public Adapter caseConceptualRole(final ConceptualRole object) {
				return createConceptualRoleAdapter();
			}
			@Override
			public Adapter caseElement(final Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(final ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseKDMFramework(final KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(final KDMModel object) {
				return createKDMModelAdapter();
			}
			@Override
			public Adapter caseKDMEntity(final KDMEntity object) {
				return createKDMEntityAdapter();
			}
			@Override
			public Adapter caseKDMRelationship(final KDMRelationship object) {
				return createKDMRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(final EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(final Notifier target) {
		return this.modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualModel
	 * @generated
	 */
	public Adapter createConceptualModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualElement <em>Abstract Conceptual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualElement
	 * @generated
	 */
	public Adapter createAbstractConceptualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.TermUnit <em>Term Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.TermUnit
	 * @generated
	 */
	public Adapter createTermUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualContainer
	 * @generated
	 */
	public Adapter createConceptualContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.FactUnit <em>Fact Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.FactUnit
	 * @generated
	 */
	public Adapter createFactUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualRelationship <em>Abstract Conceptual Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualRelationship
	 * @generated
	 */
	public Adapter createAbstractConceptualRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualRelationship
	 * @generated
	 */
	public Adapter createConceptualRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.BehaviorUnit <em>Behavior Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.BehaviorUnit
	 * @generated
	 */
	public Adapter createBehaviorUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.RuleUnit <em>Rule Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.RuleUnit
	 * @generated
	 */
	public Adapter createRuleUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.ScenarioUnit <em>Scenario Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ScenarioUnit
	 * @generated
	 */
	public Adapter createScenarioUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualFlow
	 * @generated
	 */
	public Adapter createConceptualFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualElement
	 * @generated
	 */
	public Adapter createConceptualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole
	 * @generated
	 */
	public Adapter createConceptualRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.kdm.KDMFramework <em>KDM Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KDMFramework
	 * @generated
	 */
	public Adapter createKDMFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.kdm.KDMModel <em>KDM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KDMModel
	 * @generated
	 */
	public Adapter createKDMModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.KDMEntity <em>KDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.KDMEntity
	 * @generated
	 */
	public Adapter createKDMEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.KDMRelationship <em>KDM Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.KDMRelationship
	 * @generated
	 */
	public Adapter createKDMRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConceptualAdapterFactory
