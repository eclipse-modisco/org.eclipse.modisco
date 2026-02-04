/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The timerType specifies an enterprise bean timer.  Each
 *         timer is automatically created by the container upon
 *         deployment.  Timer callbacks occur based on the 
 *         schedule attributes.  All callbacks are made to the
 *         timeout-method associated with the timer.  
 *         
 *         A timer can have an optional start and/or end date. If
 *         a start date is specified, it takes precedence over the
 *         associated timer schedule such that any matching
 *         expirations prior to the start time will not occur.
 *         Likewise, no matching expirations will occur after any
 *         end date.   Start/End dates are specified using the
 *         XML Schema dateTime type, which follows the ISO-8601
 *         standard for date(and optional time-within-the-day) 
 *         representation.
 *         
 *         An optional flag can be used to control whether
 *         this timer has persistent(true) delivery semantics or
 *         non-persistent(false) delivery semantics.  If not specified,
 *         the value defaults to persistent(true).
 *         
 *         A time zone can optionally be associated with a timer.
 *         If specified, the timer's schedule is evaluated in the context
 *         of that time zone, regardless of the default time zone in which
 *         the container is executing.   Time zones are specified as an
 *         ID string.  The set of required time zone IDs is defined by
 *         the Zone Name(TZ) column of the public domain zoneinfo database.
 *         
 *         An optional info string can be assigned to the timer and 
 *         retrieved at runtime through the Timer.getInfo() method.
 *         
 *         The timerType can only be specified on stateless session
 *         beans, singleton session beans, and message-driven beans.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getTimeoutMethod <em>Timeout Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getInfo <em>Info</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType()
 * @model extendedMetaData="name='timerType' kind='elementOnly'"
 * @generated
 */
public interface TimerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(TimerScheduleType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_Schedule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TimerScheduleType getSchedule();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(TimerScheduleType value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='start' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(XMLGregorianCalendar)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_End()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='end' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Timeout Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Method</em>' containment reference.
	 * @see #setTimeoutMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_TimeoutMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timeout-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getTimeoutMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getTimeoutMethod <em>Timeout Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Method</em>' containment reference.
	 * @see #getTimeoutMethod()
	 * @generated
	 */
	void setTimeoutMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' containment reference.
	 * @see #setPersistent(TrueFalseType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_Persistent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistent' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getPersistent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getPersistent <em>Persistent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' containment reference.
	 * @see #getPersistent()
	 * @generated
	 */
	void setPersistent(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timezone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timezone</em>' containment reference.
	 * @see #setTimezone(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_Timezone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timezone' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getTimezone();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getTimezone <em>Timezone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' containment reference.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_Info()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='info' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimerType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TimerType
