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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventFactoryImpl extends EFactoryImpl implements EventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventFactory init() {
		try {
			EventFactory theEventFactory = (EventFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/event"); //$NON-NLS-1$ 
			if (theEventFactory != null) {
				return theEventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFactoryImpl() {
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
			case EventPackage.EVENT_MODEL: return createEventModel();
			case EventPackage.EVENT: return createEvent();
			case EventPackage.EVENT_RELATIONSHIP: return createEventRelationship();
			case EventPackage.EVENT_RESOURCE: return createEventResource();
			case EventPackage.STATE: return createState();
			case EventPackage.TRANSITION: return createTransition();
			case EventPackage.ON_ENTRY: return createOnEntry();
			case EventPackage.ON_EXIT: return createOnExit();
			case EventPackage.EVENT_ACTION: return createEventAction();
			case EventPackage.READS_STATE: return createReadsState();
			case EventPackage.PRODUCES_EVENT: return createProducesEvent();
			case EventPackage.CONSUMES_EVENT: return createConsumesEvent();
			case EventPackage.NEXT_STATE: return createNextState();
			case EventPackage.INITIAL_STATE: return createInitialState();
			case EventPackage.EVENT_ELEMENT: return createEventElement();
			case EventPackage.HAS_STATE: return createHasState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModel createEventModel() {
		EventModelImpl eventModel = new EventModelImpl();
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRelationship createEventRelationship() {
		EventRelationshipImpl eventRelationship = new EventRelationshipImpl();
		return eventRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventResource createEventResource() {
		EventResourceImpl eventResource = new EventResourceImpl();
		return eventResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnEntry createOnEntry() {
		OnEntryImpl onEntry = new OnEntryImpl();
		return onEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnExit createOnExit() {
		OnExitImpl onExit = new OnExitImpl();
		return onExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAction createEventAction() {
		EventActionImpl eventAction = new EventActionImpl();
		return eventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadsState createReadsState() {
		ReadsStateImpl readsState = new ReadsStateImpl();
		return readsState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProducesEvent createProducesEvent() {
		ProducesEventImpl producesEvent = new ProducesEventImpl();
		return producesEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumesEvent createConsumesEvent() {
		ConsumesEventImpl consumesEvent = new ConsumesEventImpl();
		return consumesEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextState createNextState() {
		NextStateImpl nextState = new NextStateImpl();
		return nextState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventElement createEventElement() {
		EventElementImpl eventElement = new EventElementImpl();
		return eventElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasState createHasState() {
		HasStateImpl hasState = new HasStateImpl();
		return hasState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPackage getEventPackage() {
		return (EventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EventPackage getPackage() {
		return EventPackage.eINSTANCE;
	}

} //EventFactoryImpl
