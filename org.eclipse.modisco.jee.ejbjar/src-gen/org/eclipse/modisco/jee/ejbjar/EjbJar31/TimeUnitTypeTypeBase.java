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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Unit Type Type Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getTimeUnitTypeTypeBase()
 * @model extendedMetaData="name='time-unit-typeType_._base'"
 * @generated
 */
public enum TimeUnitTypeTypeBase implements Enumerator {
	/**
	 * The '<em><b>Days</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYS_VALUE
	 * @generated
	 * @ordered
	 */
	DAYS(0, "Days", "Days"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Hours</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOURS_VALUE
	 * @generated
	 * @ordered
	 */
	HOURS(1, "Hours", "Hours"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Minutes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTES_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTES(2, "Minutes", "Minutes"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Seconds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDS(3, "Seconds", "Seconds"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Milliseconds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLISECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	MILLISECONDS(4, "Milliseconds", "Milliseconds"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Microseconds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSECONDS(5, "Microseconds", "Microseconds"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Nanoseconds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NANOSECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	NANOSECONDS(6, "Nanoseconds", "Nanoseconds"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Days</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Days</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAYS
	 * @model name="Days"
	 * @generated
	 * @ordered
	 */
	public static final int DAYS_VALUE = 0;

	/**
	 * The '<em><b>Hours</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hours</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOURS
	 * @model name="Hours"
	 * @generated
	 * @ordered
	 */
	public static final int HOURS_VALUE = 1;

	/**
	 * The '<em><b>Minutes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minutes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUTES
	 * @model name="Minutes"
	 * @generated
	 * @ordered
	 */
	public static final int MINUTES_VALUE = 2;

	/**
	 * The '<em><b>Seconds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Seconds</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECONDS
	 * @model name="Seconds"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDS_VALUE = 3;

	/**
	 * The '<em><b>Milliseconds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Milliseconds</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILLISECONDS
	 * @model name="Milliseconds"
	 * @generated
	 * @ordered
	 */
	public static final int MILLISECONDS_VALUE = 4;

	/**
	 * The '<em><b>Microseconds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Microseconds</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICROSECONDS
	 * @model name="Microseconds"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSECONDS_VALUE = 5;

	/**
	 * The '<em><b>Nanoseconds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nanoseconds</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NANOSECONDS
	 * @model name="Nanoseconds"
	 * @generated
	 * @ordered
	 */
	public static final int NANOSECONDS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Time Unit Type Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeUnitTypeTypeBase[] VALUES_ARRAY =
		new TimeUnitTypeTypeBase[] {
			DAYS,
			HOURS,
			MINUTES,
			SECONDS,
			MILLISECONDS,
			MICROSECONDS,
			NANOSECONDS,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Unit Type Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeUnitTypeTypeBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Unit Type Type Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeUnitTypeTypeBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeUnitTypeTypeBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Unit Type Type Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeUnitTypeTypeBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeUnitTypeTypeBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Unit Type Type Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeUnitTypeTypeBase get(int value) {
		switch (value) {
			case DAYS_VALUE: return DAYS;
			case HOURS_VALUE: return HOURS;
			case MINUTES_VALUE: return MINUTES;
			case SECONDS_VALUE: return SECONDS;
			case MILLISECONDS_VALUE: return MILLISECONDS;
			case MICROSECONDS_VALUE: return MICROSECONDS;
			case NANOSECONDS_VALUE: return NANOSECONDS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeUnitTypeTypeBase(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeUnitTypeTypeBase
