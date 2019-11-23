/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.smm.Argument;
import org.eclipse.modisco.omg.smm.Observation;
import org.eclipse.modisco.omg.smm.ObservationScope;
import org.eclipse.modisco.omg.smm.ObservedMeasure;
import org.eclipse.modisco.omg.smm.SmmElement;
import org.eclipse.modisco.omg.smm.SmmPackage;
import org.eclipse.modisco.omg.smm.SmmRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getWhenObserved <em>When Observed</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getObservedMeasures <em>Observed Measures</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getRequestedMeasures <em>Requested Measures</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getMeasurementRelations <em>Measurement Relations</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends SmmElementImpl implements Observation {
	/**
	 * The default value of the '{@link #getObserver() <em>Observer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected String observer = OBSERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected String tool = TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenObserved() <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenObserved()
	 * @generated
	 * @ordered
	 */
	protected static final Date WHEN_OBSERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenObserved() <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenObserved()
	 * @generated
	 * @ordered
	 */
	protected Date whenObserved = WHEN_OBSERVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationScope> scopes;

	/**
	 * The cached value of the '{@link #getObservedMeasures() <em>Observed Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservedMeasure> observedMeasures;

	/**
	 * The cached value of the '{@link #getRequestedMeasures() <em>Requested Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<SmmElement> requestedMeasures;

	/**
	 * The cached value of the '{@link #getMeasurementRelations() <em>Measurement Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SmmRelationship> measurementRelations;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObserver() {
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserver(String newObserver) {
		String oldObserver = observer;
		observer = newObserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__OBSERVER, oldObserver, observer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWhenObserved() {
		return whenObserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenObserved(Date newWhenObserved) {
		Date oldWhenObserved = whenObserved;
		whenObserved = newWhenObserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__WHEN_OBSERVED, oldWhenObserved, whenObserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationScope> getScopes() {
		if (scopes == null) {
			scopes = new EObjectContainmentEList<ObservationScope>(ObservationScope.class, this, SmmPackage.OBSERVATION__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservedMeasure> getObservedMeasures() {
		if (observedMeasures == null) {
			observedMeasures = new EObjectContainmentEList<ObservedMeasure>(ObservedMeasure.class, this, SmmPackage.OBSERVATION__OBSERVED_MEASURES);
		}
		return observedMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmmElement> getRequestedMeasures() {
		if (requestedMeasures == null) {
			requestedMeasures = new EObjectWithInverseResolvingEList.ManyInverse<SmmElement>(SmmElement.class, this, SmmPackage.OBSERVATION__REQUESTED_MEASURES, SmmPackage.SMM_ELEMENT__REQUESTED_OBSERVATIONS);
		}
		return requestedMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmmRelationship> getMeasurementRelations() {
		if (measurementRelations == null) {
			measurementRelations = new EObjectContainmentEList<SmmRelationship>(SmmRelationship.class, this, SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS);
		}
		return measurementRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, SmmPackage.OBSERVATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequestedMeasures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.OBSERVATION__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				return ((InternalEList<?>)getObservedMeasures()).basicRemove(otherEnd, msgs);
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				return ((InternalEList<?>)getRequestedMeasures()).basicRemove(otherEnd, msgs);
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				return ((InternalEList<?>)getMeasurementRelations()).basicRemove(otherEnd, msgs);
			case SmmPackage.OBSERVATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.OBSERVATION__OBSERVER:
				return getObserver();
			case SmmPackage.OBSERVATION__TOOL:
				return getTool();
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				return getWhenObserved();
			case SmmPackage.OBSERVATION__SCOPES:
				return getScopes();
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				return getObservedMeasures();
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				return getRequestedMeasures();
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				return getMeasurementRelations();
			case SmmPackage.OBSERVATION__ARGUMENTS:
				return getArguments();
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
			case SmmPackage.OBSERVATION__OBSERVER:
				setObserver((String)newValue);
				return;
			case SmmPackage.OBSERVATION__TOOL:
				setTool((String)newValue);
				return;
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved((Date)newValue);
				return;
			case SmmPackage.OBSERVATION__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends ObservationScope>)newValue);
				return;
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				getObservedMeasures().clear();
				getObservedMeasures().addAll((Collection<? extends ObservedMeasure>)newValue);
				return;
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				getRequestedMeasures().clear();
				getRequestedMeasures().addAll((Collection<? extends SmmElement>)newValue);
				return;
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				getMeasurementRelations().clear();
				getMeasurementRelations().addAll((Collection<? extends SmmRelationship>)newValue);
				return;
			case SmmPackage.OBSERVATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
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
			case SmmPackage.OBSERVATION__OBSERVER:
				setObserver(OBSERVER_EDEFAULT);
				return;
			case SmmPackage.OBSERVATION__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved(WHEN_OBSERVED_EDEFAULT);
				return;
			case SmmPackage.OBSERVATION__SCOPES:
				getScopes().clear();
				return;
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				getObservedMeasures().clear();
				return;
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				getRequestedMeasures().clear();
				return;
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				getMeasurementRelations().clear();
				return;
			case SmmPackage.OBSERVATION__ARGUMENTS:
				getArguments().clear();
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
			case SmmPackage.OBSERVATION__OBSERVER:
				return OBSERVER_EDEFAULT == null ? observer != null : !OBSERVER_EDEFAULT.equals(observer);
			case SmmPackage.OBSERVATION__TOOL:
				return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				return WHEN_OBSERVED_EDEFAULT == null ? whenObserved != null : !WHEN_OBSERVED_EDEFAULT.equals(whenObserved);
			case SmmPackage.OBSERVATION__SCOPES:
				return scopes != null && !scopes.isEmpty();
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				return observedMeasures != null && !observedMeasures.isEmpty();
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				return requestedMeasures != null && !requestedMeasures.isEmpty();
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				return measurementRelations != null && !measurementRelations.isEmpty();
			case SmmPackage.OBSERVATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (observer: ");
		result.append(observer);
		result.append(", tool: ");
		result.append(tool);
		result.append(", whenObserved: ");
		result.append(whenObserved);
		result.append(')');
		return result.toString();
	}

} //ObservationImpl
