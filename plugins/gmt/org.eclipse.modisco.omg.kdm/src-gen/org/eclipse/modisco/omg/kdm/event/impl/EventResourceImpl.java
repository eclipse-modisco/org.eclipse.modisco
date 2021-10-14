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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.event.AbstractEventElement;
import org.eclipse.modisco.omg.kdm.event.AbstractEventRelationship;
import org.eclipse.modisco.omg.kdm.event.EventPackage;
import org.eclipse.modisco.omg.kdm.event.EventResource;
import org.eclipse.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.impl.EventResourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.impl.EventResourceImpl#getEventRelation <em>Event Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.impl.EventResourceImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.impl.EventResourceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.impl.EventResourceImpl#getEventElement <em>Event Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventResourceImpl extends KDMEntityImpl implements EventResource {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

	/**
	 * The cached value of the '{@link #getEventRelation() <em>Event Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEventRelationship> eventRelation;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeElement> implementation;

	/**
	 * The cached value of the '{@link #getEventElement() <em>Event Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEventElement> eventElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventPackage.Literals.EVENT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, EventPackage.EVENT_RESOURCE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEventRelationship> getEventRelation() {
		if (eventRelation == null) {
			eventRelation = new EObjectContainmentEList<AbstractEventRelationship>(AbstractEventRelationship.class, this, EventPackage.EVENT_RESOURCE__EVENT_RELATION);
		}
		return eventRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, EventPackage.EVENT_RESOURCE__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, EventPackage.EVENT_RESOURCE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEventElement> getEventElement() {
		if (eventElement == null) {
			eventElement = new EObjectContainmentEList<AbstractEventElement>(AbstractEventElement.class, this, EventPackage.EVENT_RESOURCE__EVENT_ELEMENT);
		}
		return eventElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventPackage.EVENT_RESOURCE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_RESOURCE__EVENT_RELATION:
				return ((InternalEList<?>)getEventRelation()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_RESOURCE__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_RESOURCE__EVENT_ELEMENT:
				return ((InternalEList<?>)getEventElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventPackage.EVENT_RESOURCE__SOURCE:
				return getSource();
			case EventPackage.EVENT_RESOURCE__EVENT_RELATION:
				return getEventRelation();
			case EventPackage.EVENT_RESOURCE__ABSTRACTION:
				return getAbstraction();
			case EventPackage.EVENT_RESOURCE__IMPLEMENTATION:
				return getImplementation();
			case EventPackage.EVENT_RESOURCE__EVENT_ELEMENT:
				return getEventElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventPackage.EVENT_RESOURCE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case EventPackage.EVENT_RESOURCE__EVENT_RELATION:
				getEventRelation().clear();
				getEventRelation().addAll((Collection<? extends AbstractEventRelationship>)newValue);
				return;
			case EventPackage.EVENT_RESOURCE__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case EventPackage.EVENT_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case EventPackage.EVENT_RESOURCE__EVENT_ELEMENT:
				getEventElement().clear();
				getEventElement().addAll((Collection<? extends AbstractEventElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EventPackage.EVENT_RESOURCE__SOURCE:
				getSource().clear();
				return;
			case EventPackage.EVENT_RESOURCE__EVENT_RELATION:
				getEventRelation().clear();
				return;
			case EventPackage.EVENT_RESOURCE__ABSTRACTION:
				getAbstraction().clear();
				return;
			case EventPackage.EVENT_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case EventPackage.EVENT_RESOURCE__EVENT_ELEMENT:
				getEventElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventPackage.EVENT_RESOURCE__SOURCE:
				return source != null && !source.isEmpty();
			case EventPackage.EVENT_RESOURCE__EVENT_RELATION:
				return eventRelation != null && !eventRelation.isEmpty();
			case EventPackage.EVENT_RESOURCE__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case EventPackage.EVENT_RESOURCE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case EventPackage.EVENT_RESOURCE__EVENT_ELEMENT:
				return eventElement != null && !eventElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventResourceImpl
