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
package org.eclipse.modisco.omg.kdm.event.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.omg.kdm.action.ActionPackage;
import org.eclipse.modisco.omg.kdm.action.impl.ActionPackageImpl;
import org.eclipse.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.modisco.omg.kdm.build.impl.BuildPackageImpl;
import org.eclipse.modisco.omg.kdm.code.CodePackage;
import org.eclipse.modisco.omg.kdm.code.impl.CodePackageImpl;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualPackageImpl;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.core.impl.CorePackageImpl;
import org.eclipse.modisco.omg.kdm.data.DataPackage;
import org.eclipse.modisco.omg.kdm.data.impl.DataPackageImpl;
import org.eclipse.modisco.omg.kdm.event.AbstractEventElement;
import org.eclipse.modisco.omg.kdm.event.AbstractEventRelationship;
import org.eclipse.modisco.omg.kdm.event.ConsumesEvent;
import org.eclipse.modisco.omg.kdm.event.Event;
import org.eclipse.modisco.omg.kdm.event.EventAction;
import org.eclipse.modisco.omg.kdm.event.EventElement;
import org.eclipse.modisco.omg.kdm.event.EventFactory;
import org.eclipse.modisco.omg.kdm.event.EventModel;
import org.eclipse.modisco.omg.kdm.event.EventPackage;
import org.eclipse.modisco.omg.kdm.event.EventRelationship;
import org.eclipse.modisco.omg.kdm.event.EventResource;
import org.eclipse.modisco.omg.kdm.event.HasState;
import org.eclipse.modisco.omg.kdm.event.InitialState;
import org.eclipse.modisco.omg.kdm.event.NextState;
import org.eclipse.modisco.omg.kdm.event.OnEntry;
import org.eclipse.modisco.omg.kdm.event.OnExit;
import org.eclipse.modisco.omg.kdm.event.ProducesEvent;
import org.eclipse.modisco.omg.kdm.event.ReadsState;
import org.eclipse.modisco.omg.kdm.event.State;
import org.eclipse.modisco.omg.kdm.event.Transition;
import org.eclipse.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.modisco.omg.kdm.kdm.impl.KdmPackageImpl;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;
import org.eclipse.modisco.omg.kdm.platform.impl.PlatformPackageImpl;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;
import org.eclipse.modisco.omg.kdm.source.impl.SourcePackageImpl;
import org.eclipse.modisco.omg.kdm.structure.StructurePackage;
import org.eclipse.modisco.omg.kdm.structure.impl.StructurePackageImpl;
import org.eclipse.modisco.omg.kdm.ui.UiPackage;
import org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventPackageImpl extends EPackageImpl implements EventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readsStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass producesEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumesEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasStateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.omg.kdm.event.EventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventPackageImpl() {
		super(eNS_URI, EventFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventPackage init() {
		if (isInited) return (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);

		// Obtain or create and register package
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		KdmPackageImpl theKdmPackage = (KdmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) instanceof KdmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) : KdmPackage.eINSTANCE);
		SourcePackageImpl theSourcePackage = (SourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) : SourcePackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		BuildPackageImpl theBuildPackage = (BuildPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) instanceof BuildPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) : BuildPackage.eINSTANCE);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) instanceof ConceptualPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) : ConceptualPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theEventPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theKdmPackage.createPackageContents();
		theSourcePackage.createPackageContents();
		theCodePackage.createPackageContents();
		theActionPackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theBuildPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theEventPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theKdmPackage.initializePackageContents();
		theSourcePackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theBuildPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventPackage.eNS_URI, theEventPackage);
		return theEventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventModel() {
		return eventModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModel_EventElement() {
		return (EReference)eventModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEventElement() {
		return abstractEventElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventElement_Source() {
		return (EReference)abstractEventElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventElement_EventRelation() {
		return (EReference)abstractEventElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventElement_Abstraction() {
		return (EReference)abstractEventElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventElement_Implementation() {
		return (EReference)abstractEventElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Kind() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEventRelationship() {
		return abstractEventRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventRelationship() {
		return eventRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRelationship_To() {
		return (EReference)eventRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRelationship_From() {
		return (EReference)eventRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventResource() {
		return eventResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventResource_EventElement() {
		return (EReference)eventResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnEntry() {
		return onEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnExit() {
		return onExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventAction() {
		return eventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventAction_Kind() {
		return (EAttribute)eventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventAction_EventElement() {
		return (EReference)eventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadsState() {
		return readsStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadsState_To() {
		return (EReference)readsStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadsState_From() {
		return (EReference)readsStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProducesEvent() {
		return producesEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducesEvent_To() {
		return (EReference)producesEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducesEvent_From() {
		return (EReference)producesEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumesEvent() {
		return consumesEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumesEvent_To() {
		return (EReference)consumesEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumesEvent_From() {
		return (EReference)consumesEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextState() {
		return nextStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextState_To() {
		return (EReference)nextStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextState_From() {
		return (EReference)nextStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventElement() {
		return eventElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasState() {
		return hasStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasState_To() {
		return (EReference)hasStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasState_From() {
		return (EReference)hasStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFactory getEventFactory() {
		return (EventFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventModelEClass = createEClass(EVENT_MODEL);
		createEReference(eventModelEClass, EVENT_MODEL__EVENT_ELEMENT);

		abstractEventElementEClass = createEClass(ABSTRACT_EVENT_ELEMENT);
		createEReference(abstractEventElementEClass, ABSTRACT_EVENT_ELEMENT__SOURCE);
		createEReference(abstractEventElementEClass, ABSTRACT_EVENT_ELEMENT__EVENT_RELATION);
		createEReference(abstractEventElementEClass, ABSTRACT_EVENT_ELEMENT__ABSTRACTION);
		createEReference(abstractEventElementEClass, ABSTRACT_EVENT_ELEMENT__IMPLEMENTATION);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__KIND);

		abstractEventRelationshipEClass = createEClass(ABSTRACT_EVENT_RELATIONSHIP);

		eventRelationshipEClass = createEClass(EVENT_RELATIONSHIP);
		createEReference(eventRelationshipEClass, EVENT_RELATIONSHIP__TO);
		createEReference(eventRelationshipEClass, EVENT_RELATIONSHIP__FROM);

		eventResourceEClass = createEClass(EVENT_RESOURCE);
		createEReference(eventResourceEClass, EVENT_RESOURCE__EVENT_ELEMENT);

		stateEClass = createEClass(STATE);

		transitionEClass = createEClass(TRANSITION);

		onEntryEClass = createEClass(ON_ENTRY);

		onExitEClass = createEClass(ON_EXIT);

		eventActionEClass = createEClass(EVENT_ACTION);
		createEAttribute(eventActionEClass, EVENT_ACTION__KIND);
		createEReference(eventActionEClass, EVENT_ACTION__EVENT_ELEMENT);

		readsStateEClass = createEClass(READS_STATE);
		createEReference(readsStateEClass, READS_STATE__TO);
		createEReference(readsStateEClass, READS_STATE__FROM);

		producesEventEClass = createEClass(PRODUCES_EVENT);
		createEReference(producesEventEClass, PRODUCES_EVENT__TO);
		createEReference(producesEventEClass, PRODUCES_EVENT__FROM);

		consumesEventEClass = createEClass(CONSUMES_EVENT);
		createEReference(consumesEventEClass, CONSUMES_EVENT__TO);
		createEReference(consumesEventEClass, CONSUMES_EVENT__FROM);

		nextStateEClass = createEClass(NEXT_STATE);
		createEReference(nextStateEClass, NEXT_STATE__TO);
		createEReference(nextStateEClass, NEXT_STATE__FROM);

		initialStateEClass = createEClass(INITIAL_STATE);

		eventElementEClass = createEClass(EVENT_ELEMENT);

		hasStateEClass = createEClass(HAS_STATE);
		createEReference(hasStateEClass, HAS_STATE__TO);
		createEReference(hasStateEClass, HAS_STATE__FROM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KdmPackage theKdmPackage = (KdmPackage)EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);
		ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventModelEClass.getESuperTypes().add(theKdmPackage.getKDMModel());
		abstractEventElementEClass.getESuperTypes().add(theCorePackage.getKDMEntity());
		eventEClass.getESuperTypes().add(this.getAbstractEventElement());
		abstractEventRelationshipEClass.getESuperTypes().add(theCorePackage.getKDMRelationship());
		eventRelationshipEClass.getESuperTypes().add(this.getAbstractEventRelationship());
		eventResourceEClass.getESuperTypes().add(this.getAbstractEventElement());
		stateEClass.getESuperTypes().add(this.getEventResource());
		transitionEClass.getESuperTypes().add(this.getEventResource());
		onEntryEClass.getESuperTypes().add(this.getTransition());
		onExitEClass.getESuperTypes().add(this.getTransition());
		eventActionEClass.getESuperTypes().add(this.getAbstractEventElement());
		readsStateEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		producesEventEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		consumesEventEClass.getESuperTypes().add(this.getAbstractEventRelationship());
		nextStateEClass.getESuperTypes().add(this.getAbstractEventRelationship());
		initialStateEClass.getESuperTypes().add(this.getState());
		eventElementEClass.getESuperTypes().add(this.getAbstractEventElement());
		hasStateEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(eventModelEClass, EventModel.class, "EventModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventModel_EventElement(), this.getAbstractEventElement(), null, "eventElement", null, 0, -1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractEventElementEClass, AbstractEventElement.class, "AbstractEventElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAbstractEventElement_Source(), theSourcePackage.getSourceRef(), null, "source", null, 0, -1, AbstractEventElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractEventElement_EventRelation(), this.getAbstractEventRelationship(), null, "eventRelation", null, 0, -1, AbstractEventElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractEventElement_Abstraction(), theActionPackage.getActionElement(), null, "abstraction", null, 0, -1, AbstractEventElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractEventElement_Implementation(), theCodePackage.getAbstractCodeElement(), null, "implementation", null, 0, -1, AbstractEventElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEvent_Kind(), theCorePackage.getString(), "kind", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractEventRelationshipEClass, AbstractEventRelationship.class, "AbstractEventRelationship", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eventRelationshipEClass, EventRelationship.class, "EventRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventRelationship_To(), theCorePackage.getKDMEntity(), null, "to", null, 1, 1, EventRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventRelationship_From(), this.getAbstractEventElement(), null, "from", null, 1, 1, EventRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventResourceEClass, EventResource.class, "EventResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventResource_EventElement(), this.getAbstractEventElement(), null, "eventElement", null, 0, -1, EventResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(onEntryEClass, OnEntry.class, "OnEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(onExitEClass, OnExit.class, "OnExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eventActionEClass, EventAction.class, "EventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEventAction_Kind(), theCorePackage.getString(), "kind", null, 0, 1, EventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventAction_EventElement(), this.getEvent(), null, "eventElement", null, 0, -1, EventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(readsStateEClass, ReadsState.class, "ReadsState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadsState_To(), this.getState(), null, "to", null, 1, 1, ReadsState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadsState_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, ReadsState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(producesEventEClass, ProducesEvent.class, "ProducesEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProducesEvent_To(), this.getEvent(), null, "to", null, 1, 1, ProducesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProducesEvent_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, ProducesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(consumesEventEClass, ConsumesEvent.class, "ConsumesEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConsumesEvent_To(), this.getEvent(), null, "to", null, 1, 1, ConsumesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConsumesEvent_From(), this.getTransition(), null, "from", null, 1, 1, ConsumesEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(nextStateEClass, NextState.class, "NextState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNextState_To(), this.getState(), null, "to", null, 1, 1, NextState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNextState_From(), this.getTransition(), null, "from", null, 1, 1, NextState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eventElementEClass, EventElement.class, "EventElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(hasStateEClass, HasState.class, "HasState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHasState_To(), this.getAbstractEventElement(), null, "to", null, 1, 1, HasState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getHasState_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, HasState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //EventPackageImpl
