/**
 * Copyright (c) 2010 Mia-Software.
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship;
import org.eclipse.modisco.omg.smm.Measurement;
import org.eclipse.modisco.omg.smm.MeasurementRelationship;
import org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship;
import org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getMeasurand <em>Measurand</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getBreakValue <em>Break Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getRefinementTo <em>Refinement To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getRefinementFrom <em>Refinement From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getRecursiveTo <em>Recursive To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getRecursiveFrom <em>Recursive From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl#getMeasurementRelationships <em>Measurement Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementImpl extends SmmElementImpl implements Measurement {
	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected String error = ERROR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurand() <em>Measurand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurand()
	 * @generated
	 * @ordered
	 */
	protected EObject measurand;

	/**
	 * The default value of the '{@link #getBreakValue() <em>Break Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakValue()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAK_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBreakValue() <em>Break Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakValue()
	 * @generated
	 * @ordered
	 */
	protected String breakValue = BREAK_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefinementTo() <em>Refinement To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementMeasurementRelationship> refinementTo;

	/**
	 * The cached value of the '{@link #getRefinementFrom() <em>Refinement From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementMeasurementRelationship> refinementFrom;

	/**
	 * The cached value of the '{@link #getEquivalentTo() <em>Equivalent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentMeasurementRelationship> equivalentTo;

	/**
	 * The cached value of the '{@link #getEquivalentFrom() <em>Equivalent From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentMeasurementRelationship> equivalentFrom;

	/**
	 * The cached value of the '{@link #getRecursiveTo() <em>Recursive To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursiveTo()
	 * @generated
	 * @ordered
	 */
	protected RecursiveMeasurementRelationship recursiveTo;

	/**
	 * The cached value of the '{@link #getRecursiveFrom() <em>Recursive From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursiveFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RecursiveMeasurementRelationship> recursiveFrom;

	/**
	 * The cached value of the '{@link #getMeasurementRelationships() <em>Measurement Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementRelationship> measurementRelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(String newError) {
		String oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMeasurand() {
		if (measurand != null && measurand.eIsProxy()) {
			InternalEObject oldMeasurand = (InternalEObject)measurand;
			measurand = eResolveProxy(oldMeasurand);
			if (measurand != oldMeasurand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASUREMENT__MEASURAND, oldMeasurand, measurand));
			}
		}
		return measurand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMeasurand() {
		return measurand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurand(EObject newMeasurand) {
		EObject oldMeasurand = measurand;
		measurand = newMeasurand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__MEASURAND, oldMeasurand, measurand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBreakValue() {
		return breakValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakValue(String newBreakValue) {
		String oldBreakValue = breakValue;
		breakValue = newBreakValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__BREAK_VALUE, oldBreakValue, breakValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementMeasurementRelationship> getRefinementTo() {
		if (refinementTo == null) {
			refinementTo = new EObjectWithInverseResolvingEList<RefinementMeasurementRelationship>(RefinementMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__REFINEMENT_TO, SmmPackage.REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM);
		}
		return refinementTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementMeasurementRelationship> getRefinementFrom() {
		if (refinementFrom == null) {
			refinementFrom = new EObjectWithInverseResolvingEList<RefinementMeasurementRelationship>(RefinementMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__REFINEMENT_FROM, SmmPackage.REFINEMENT_MEASUREMENT_RELATIONSHIP__TO);
		}
		return refinementFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentMeasurementRelationship> getEquivalentTo() {
		if (equivalentTo == null) {
			equivalentTo = new EObjectWithInverseResolvingEList<EquivalentMeasurementRelationship>(EquivalentMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__EQUIVALENT_TO, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM);
		}
		return equivalentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentMeasurementRelationship> getEquivalentFrom() {
		if (equivalentFrom == null) {
			equivalentFrom = new EObjectWithInverseResolvingEList<EquivalentMeasurementRelationship>(EquivalentMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__EQUIVALENT_FROM, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO);
		}
		return equivalentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecursiveMeasurementRelationship getRecursiveTo() {
		if (recursiveTo != null && recursiveTo.eIsProxy()) {
			InternalEObject oldRecursiveTo = (InternalEObject)recursiveTo;
			recursiveTo = (RecursiveMeasurementRelationship)eResolveProxy(oldRecursiveTo);
			if (recursiveTo != oldRecursiveTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASUREMENT__RECURSIVE_TO, oldRecursiveTo, recursiveTo));
			}
		}
		return recursiveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecursiveMeasurementRelationship basicGetRecursiveTo() {
		return recursiveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecursiveTo(RecursiveMeasurementRelationship newRecursiveTo, NotificationChain msgs) {
		RecursiveMeasurementRelationship oldRecursiveTo = recursiveTo;
		recursiveTo = newRecursiveTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__RECURSIVE_TO, oldRecursiveTo, newRecursiveTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecursiveTo(RecursiveMeasurementRelationship newRecursiveTo) {
		if (newRecursiveTo != recursiveTo) {
			NotificationChain msgs = null;
			if (recursiveTo != null)
				msgs = ((InternalEObject)recursiveTo).eInverseRemove(this, SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM, RecursiveMeasurementRelationship.class, msgs);
			if (newRecursiveTo != null)
				msgs = ((InternalEObject)newRecursiveTo).eInverseAdd(this, SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM, RecursiveMeasurementRelationship.class, msgs);
			msgs = basicSetRecursiveTo(newRecursiveTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__RECURSIVE_TO, newRecursiveTo, newRecursiveTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecursiveMeasurementRelationship> getRecursiveFrom() {
		if (recursiveFrom == null) {
			recursiveFrom = new EObjectWithInverseResolvingEList<RecursiveMeasurementRelationship>(RecursiveMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__RECURSIVE_FROM, SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP__TO);
		}
		return recursiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementRelationship> getMeasurementRelationships() {
		if (measurementRelationships == null) {
			measurementRelationships = new EObjectContainmentEList<MeasurementRelationship>(MeasurementRelationship.class, this, SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS);
		}
		return measurementRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureLabel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasurementLabel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinementTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinementFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				if (recursiveTo != null)
					msgs = ((InternalEObject)recursiveTo).eInverseRemove(this, SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM, RecursiveMeasurementRelationship.class, msgs);
				return basicSetRecursiveTo((RecursiveMeasurementRelationship)otherEnd, msgs);
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecursiveFrom()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return ((InternalEList<?>)getRefinementTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return ((InternalEList<?>)getRefinementFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return ((InternalEList<?>)getEquivalentTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return ((InternalEList<?>)getEquivalentFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				return basicSetRecursiveTo(null, msgs);
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				return ((InternalEList<?>)getRecursiveFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				return ((InternalEList<?>)getMeasurementRelationships()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.MEASUREMENT__ERROR:
				return getError();
			case SmmPackage.MEASUREMENT__MEASURAND:
				if (resolve) return getMeasurand();
				return basicGetMeasurand();
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				return getBreakValue();
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return getRefinementTo();
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return getRefinementFrom();
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return getEquivalentTo();
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return getEquivalentFrom();
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				if (resolve) return getRecursiveTo();
				return basicGetRecursiveTo();
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				return getRecursiveFrom();
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				return getMeasurementRelationships();
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
			case SmmPackage.MEASUREMENT__ERROR:
				setError((String)newValue);
				return;
			case SmmPackage.MEASUREMENT__MEASURAND:
				setMeasurand((EObject)newValue);
				return;
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				setBreakValue((String)newValue);
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				getRefinementTo().clear();
				getRefinementTo().addAll((Collection<? extends RefinementMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				getRefinementFrom().clear();
				getRefinementFrom().addAll((Collection<? extends RefinementMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				getEquivalentTo().clear();
				getEquivalentTo().addAll((Collection<? extends EquivalentMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				getEquivalentFrom().addAll((Collection<? extends EquivalentMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				setRecursiveTo((RecursiveMeasurementRelationship)newValue);
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				getRecursiveFrom().clear();
				getRecursiveFrom().addAll((Collection<? extends RecursiveMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				getMeasurementRelationships().clear();
				getMeasurementRelationships().addAll((Collection<? extends MeasurementRelationship>)newValue);
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
			case SmmPackage.MEASUREMENT__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case SmmPackage.MEASUREMENT__MEASURAND:
				setMeasurand((EObject)null);
				return;
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				setBreakValue(BREAK_VALUE_EDEFAULT);
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				getRefinementTo().clear();
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				getRefinementFrom().clear();
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				getEquivalentTo().clear();
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				setRecursiveTo((RecursiveMeasurementRelationship)null);
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				getRecursiveFrom().clear();
				return;
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				getMeasurementRelationships().clear();
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
			case SmmPackage.MEASUREMENT__ERROR:
				return ERROR_EDEFAULT == null ? error != null : !ERROR_EDEFAULT.equals(error);
			case SmmPackage.MEASUREMENT__MEASURAND:
				return measurand != null;
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				return BREAK_VALUE_EDEFAULT == null ? breakValue != null : !BREAK_VALUE_EDEFAULT.equals(breakValue);
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return refinementTo != null && !refinementTo.isEmpty();
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return refinementFrom != null && !refinementFrom.isEmpty();
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return equivalentTo != null && !equivalentTo.isEmpty();
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return equivalentFrom != null && !equivalentFrom.isEmpty();
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				return recursiveTo != null;
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				return recursiveFrom != null && !recursiveFrom.isEmpty();
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				return measurementRelationships != null && !measurementRelationships.isEmpty();
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
		result.append(" (error: ");
		result.append(error);
		result.append(", breakValue: ");
		result.append(breakValue);
		result.append(')');
		return result.toString();
	}

} //MeasurementImpl
