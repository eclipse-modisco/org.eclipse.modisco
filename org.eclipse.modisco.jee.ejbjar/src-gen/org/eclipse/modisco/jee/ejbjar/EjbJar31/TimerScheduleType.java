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
package org.eclipse.modisco.jee.ejbjar.EjbJar31;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Schedule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getSecond <em>Second</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getHour <em>Hour</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getMonth <em>Month</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getYear <em>Year</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType()
 * @model extendedMetaData="name='timer-scheduleType' kind='elementOnly'"
 * @generated
 */
public interface TimerScheduleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_Second()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='second' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getSecond();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' containment reference.
	 * @see #setMinute(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_Minute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minute' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getMinute();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getMinute <em>Minute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' containment reference.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' containment reference.
	 * @see #setHour(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_Hour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hour' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getHour();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getHour <em>Hour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' containment reference.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Day Of Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Month</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Month</em>' containment reference.
	 * @see #setDayOfMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_DayOfMonth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='day-of-month' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getDayOfMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getDayOfMonth <em>Day Of Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Month</em>' containment reference.
	 * @see #getDayOfMonth()
	 * @generated
	 */
	void setDayOfMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' containment reference.
	 * @see #setMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_Month()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='month' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getMonth <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' containment reference.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Week</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' containment reference.
	 * @see #setDayOfWeek(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_DayOfWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='day-of-week' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getDayOfWeek();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getDayOfWeek <em>Day Of Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' containment reference.
	 * @see #getDayOfWeek()
	 * @generated
	 */
	void setDayOfWeek(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' containment reference.
	 * @see #setYear(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_Year()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='year' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getYear();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getYear <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' containment reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerScheduleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerScheduleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TimerScheduleType
