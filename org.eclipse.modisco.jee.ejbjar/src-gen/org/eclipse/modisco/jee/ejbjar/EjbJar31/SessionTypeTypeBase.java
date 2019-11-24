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
 * A representation of the literals of the enumeration '<em><b>Session Type Type Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionTypeTypeBase()
 * @model extendedMetaData="name='session-typeType_._base'"
 * @generated
 */
public enum SessionTypeTypeBase implements Enumerator {
	/**
	 * The '<em><b>Singleton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLETON_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLETON(0, "Singleton", "Singleton"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Stateful</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEFUL_VALUE
	 * @generated
	 * @ordered
	 */
	STATEFUL(1, "Stateful", "Stateful"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Stateless</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATELESS_VALUE
	 * @generated
	 * @ordered
	 */
	STATELESS(2, "Stateless", "Stateless"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Singleton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Singleton</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLETON
	 * @model name="Singleton"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLETON_VALUE = 0;

	/**
	 * The '<em><b>Stateful</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stateful</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATEFUL
	 * @model name="Stateful"
	 * @generated
	 * @ordered
	 */
	public static final int STATEFUL_VALUE = 1;

	/**
	 * The '<em><b>Stateless</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stateless</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATELESS
	 * @model name="Stateless"
	 * @generated
	 * @ordered
	 */
	public static final int STATELESS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Session Type Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SessionTypeTypeBase[] VALUES_ARRAY =
		new SessionTypeTypeBase[] {
			SINGLETON,
			STATEFUL,
			STATELESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Session Type Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SessionTypeTypeBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Session Type Type Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SessionTypeTypeBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SessionTypeTypeBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Session Type Type Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SessionTypeTypeBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SessionTypeTypeBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Session Type Type Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SessionTypeTypeBase get(int value) {
		switch (value) {
			case SINGLETON_VALUE: return SINGLETON;
			case STATEFUL_VALUE: return STATEFUL;
			case STATELESS_VALUE: return STATELESS;
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
	private SessionTypeTypeBase(int value, String name, String literal) {
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
	
} //SessionTypeTypeBase
