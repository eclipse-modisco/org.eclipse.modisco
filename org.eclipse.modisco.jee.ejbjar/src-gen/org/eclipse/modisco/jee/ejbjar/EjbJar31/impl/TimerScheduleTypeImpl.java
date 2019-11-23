/**
 * Copyright (c) 2010, 2019 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Schedule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.TimerScheduleTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerScheduleTypeImpl extends EObjectImpl implements TimerScheduleType {
	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String second;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String minute;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String hour;

	/**
	 * The cached value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String dayOfMonth;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String month;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String dayOfWeek;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String year;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerScheduleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getTimerScheduleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newSecond, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldSecond = second;
		second = newSecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND, oldSecond, newSecond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newSecond) {
		if (newSecond != second) {
			NotificationChain msgs = null;
			if (second != null)
				msgs = ((InternalEObject)second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND, null, msgs);
			if (newSecond != null)
				msgs = ((InternalEObject)newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND, null, msgs);
			msgs = basicSetSecond(newSecond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND, newSecond, newSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinute(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newMinute, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE, oldMinute, newMinute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newMinute) {
		if (newMinute != minute) {
			NotificationChain msgs = null;
			if (minute != null)
				msgs = ((InternalEObject)minute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE, null, msgs);
			if (newMinute != null)
				msgs = ((InternalEObject)newMinute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE, null, msgs);
			msgs = basicSetMinute(newMinute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE, newMinute, newMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHour(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newHour, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldHour = hour;
		hour = newHour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR, oldHour, newHour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newHour) {
		if (newHour != hour) {
			NotificationChain msgs = null;
			if (hour != null)
				msgs = ((InternalEObject)hour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR, null, msgs);
			if (newHour != null)
				msgs = ((InternalEObject)newHour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR, null, msgs);
			msgs = basicSetHour(newHour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR, newHour, newHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getDayOfMonth() {
		return dayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDayOfMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newDayOfMonth, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldDayOfMonth = dayOfMonth;
		dayOfMonth = newDayOfMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH, oldDayOfMonth, newDayOfMonth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newDayOfMonth) {
		if (newDayOfMonth != dayOfMonth) {
			NotificationChain msgs = null;
			if (dayOfMonth != null)
				msgs = ((InternalEObject)dayOfMonth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH, null, msgs);
			if (newDayOfMonth != null)
				msgs = ((InternalEObject)newDayOfMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH, null, msgs);
			msgs = basicSetDayOfMonth(newDayOfMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH, newDayOfMonth, newDayOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newMonth, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldMonth = month;
		month = newMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH, oldMonth, newMonth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newMonth) {
		if (newMonth != month) {
			NotificationChain msgs = null;
			if (month != null)
				msgs = ((InternalEObject)month).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH, null, msgs);
			if (newMonth != null)
				msgs = ((InternalEObject)newMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH, null, msgs);
			msgs = basicSetMonth(newMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH, newMonth, newMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDayOfWeek(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newDayOfWeek, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK, oldDayOfWeek, newDayOfWeek);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfWeek(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newDayOfWeek) {
		if (newDayOfWeek != dayOfWeek) {
			NotificationChain msgs = null;
			if (dayOfWeek != null)
				msgs = ((InternalEObject)dayOfWeek).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK, null, msgs);
			if (newDayOfWeek != null)
				msgs = ((InternalEObject)newDayOfWeek).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK, null, msgs);
			msgs = basicSetDayOfWeek(newDayOfWeek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK, newDayOfWeek, newDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newYear, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldYear = year;
		year = newYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR, oldYear, newYear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newYear) {
		if (newYear != year) {
			NotificationChain msgs = null;
			if (year != null)
				msgs = ((InternalEObject)year).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR, null, msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR, null, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.TIMER_SCHEDULE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND:
				return basicSetSecond(null, msgs);
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE:
				return basicSetMinute(null, msgs);
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR:
				return basicSetHour(null, msgs);
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH:
				return basicSetDayOfMonth(null, msgs);
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH:
				return basicSetMonth(null, msgs);
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK:
				return basicSetDayOfWeek(null, msgs);
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR:
				return basicSetYear(null, msgs);
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
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND:
				return getSecond();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE:
				return getMinute();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR:
				return getHour();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH:
				return getDayOfMonth();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH:
				return getMonth();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK:
				return getDayOfWeek();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR:
				return getYear();
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND:
				setSecond((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE:
				setMinute((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR:
				setHour((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH:
				setDayOfMonth((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH:
				setMonth((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK:
				setDayOfWeek((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR:
				setYear((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__ID:
				setId((String)newValue);
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
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND:
				setSecond((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE:
				setMinute((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR:
				setHour((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH:
				setDayOfMonth((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH:
				setMonth((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK:
				setDayOfWeek((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR:
				setYear((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__SECOND:
				return second != null;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MINUTE:
				return minute != null;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__HOUR:
				return hour != null;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_MONTH:
				return dayOfMonth != null;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__MONTH:
				return month != null;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__DAY_OF_WEEK:
				return dayOfWeek != null;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__YEAR:
				return year != null;
			case EjbJar31Package.TIMER_SCHEDULE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TimerScheduleTypeImpl
